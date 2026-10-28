package taxi.blizz.telephony.internal;

import java.io.IOException;
import java.net.ConnectException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.telephony.Calls;

/**
 * The call log. Asterisk's events arrive through {@link #ringing}, {@link #answered} and {@link #ended}; each is safe to
 * repeat, and every event of one channel lands on the same row (REQ-OPS-07). Only calls to a configured service number
 * (call_line) are logged, so the legs Asterisk creates towards the operators' phones never look like calls.
 */
@Service
class JdbcCalls implements Calls {

    private static final Logger log = LoggerFactory.getLogger(JdbcCalls.class);
    private static final String SELECT = """
            select c.id, c.direction, c.party, c.state, c.caller_phone, c.called_number, c.city_id, c.answered_by,
                   c.started_at, c.answered_at, c.ended_at,
                   case when c.order_id is not null then array[c.order_id]
                        else coalesce((select array_agg(o.order_id order by o.linked_at, o.order_id) from call_order o
                                       where o.call_id = c.id), '{}') end as order_ids,
                   r.state as recording_state, r.duration_seconds, r.stored_at
            from call c left join call_recording r on r.call_id = c.id""";

    /** Ends a statement that starts "with closed as (update call … returning id, state": the taken calls get a recording. */
    private static final String RECORD_TAKEN = """
            ), recording as (
                insert into call_recording (call_id, state, next_attempt_at, created_at)
                select id, 'PENDING', :now, :now from closed where state = 'ENDED'
                on conflict (call_id) do nothing
            )
            select count(*) from closed""";

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final Outbox outbox;
    private final TelephonyProperties properties;
    private final ChannelControl channels;
    private final Clock clock;

    JdbcCalls(JdbcClient jdbc, TransactionTemplate tx, IdempotentCommands commands, StaffAccess staff,
              Outbox outbox, TelephonyProperties properties, AriChannels asterisk, FakeChannels fake, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.commands = commands;
        this.staff = staff;
        this.outbox = outbox;
        this.properties = properties;
        this.channels = properties.fake() ? fake : asterisk;
        this.clock = clock;
    }

    // ---------------------------------------------------------------- Asterisk's events

    /**
     * A channel was created. Logged as a new RINGING call when it is a call to a service number; a repeat (the same
     * channel) changes nothing. {@code CallRinging} is published once, with the new row.
     */
    Optional<UUID> ringing(String channelId, String callerRaw, String calledRaw, String context, OffsetDateTime at) {
        Optional<String> called = e164(calledRaw);
        if (channelId == null || called.isEmpty()) {
            return Optional.empty();
        }
        Optional<UUID> city = jdbc.sql("select city_id from call_line where number = :number")
                .param("number", called.get()).query(UUID.class).optional();
        if (city.isEmpty()) {
            if (quiet(callerRaw, context)) {
                return Optional.empty();
            }
            // Not a service number: usually a leg towards an operator or an outgoing call. A full external number may
            // be a service number missing from the call lines — said in the log (without the caller) to be fixed.
            log.warn("A call to {} is not logged: the number is not a service number (call lines)",
                    new PhoneNumber(called.get()).masked());
            return Optional.empty();
        }
        return tx.execute(status -> {
            UUID id = UUID.randomUUID();
            int inserted = jdbc.sql("""
                            insert into call (id, channel_id, caller_phone, caller_raw, called_number, city_id, state,
                                              started_at)
                            values (:id, :channel, :caller, :raw, :called, :city, 'RINGING', :at)
                            on conflict (channel_id) do nothing""")
                    .param("id", id).param("channel", channelId).param("caller", e164(callerRaw).orElse(null))
                    .param("raw", callerRaw == null ? null : callerRaw.strip()).param("called", called.get())
                    .param("city", city.get()).param("at", at(at)).update();
            if (inserted == 0) {
                return Optional.<UUID>empty();
            }
            Map<String, Object> payload = new java.util.LinkedHashMap<>();
            payload.put("call_id", id.toString());
            payload.put("city_id", city.get().toString());
            outbox.publish(new OutboxEvent("CallRinging", 1, "Call", id, 0, payload));
            return Optional.of(id);
        });
    }

    /**
     * An operator's own phone placing a call, or a channel of the context for outgoing calls, is never a call to
     * log — no warning for it (issue #67).
     */
    private boolean quiet(String callerRaw, String context) {
        if (context != null && properties.quietContexts().contains(context)) {
            return true;
        }
        String caller = callerRaw == null ? "" : callerRaw.strip();
        return caller.matches("^[0-9]{2,6}$") && jdbc.sql("select count(*) from staff_extension where extension = :e")
                .param("e", caller).query(Long.class).single() > 0;
    }

    /**
     * The call's own channel went Up. Incoming: RINGING → ANSWERED. Outgoing: the operator picked up their phone —
     * DIALING → RINGING (the other side is being rung); anything else stays.
     */
    void answered(String channelId, OffsetDateTime at) {
        jdbc.sql("""
                        update call set state = case when direction = 'OUTBOUND' then 'RINGING' else 'ANSWERED' end,
                                        answered_at = case when direction = 'OUTBOUND' then answered_at
                                                           else coalesce(answered_at, :at) end,
                                        version = version + 1
                        where channel_id = :channel
                          and ((direction = 'INBOUND' and state = 'RINGING')
                               or (direction = 'OUTBOUND' and state = 'DIALING'))""")
                .param("channel", channelId).param("at", at(at)).update();
    }

    /**
     * Another channel of the call went Up ({@code linkedid} is the call's channel). Incoming: an operator's phone
     * answered — its extension names who took the call, unless someone is already recorded (the first answer stays;
     * a different one is logged). Outgoing: the other side picked up — ANSWERED.
     */
    void legAnswered(String callChannelId, String legName, OffsetDateTime at) {
        record Row(UUID id, String direction, UUID answeredBy) {
        }
        Optional<Row> call = jdbc.sql("select id, direction, answered_by from call where channel_id = :channel")
                .param("channel", callChannelId)
                .query((rs, i) -> new Row(rs.getObject(1, UUID.class), rs.getString(2), rs.getObject(3, UUID.class)))
                .optional();
        if (call.isEmpty()) {
            return;
        }
        if ("OUTBOUND".equals(call.get().direction())) {
            jdbc.sql("""
                            update call set state = 'ANSWERED', answered_at = coalesce(answered_at, :at),
                                            version = version + 1
                            where id = :id and state in ('DIALING', 'RINGING')""")
                    .param("id", call.get().id()).param("at", at(at)).update();
            return;
        }
        String extension = properties.extensionOf(legName);
        Optional<UUID> who = extension == null ? Optional.empty()
                : jdbc.sql("select staff_id from staff_extension where extension = :e").param("e", extension)
                        .query(UUID.class).optional();
        if (who.isEmpty()) {
            return;
        }
        int taken = jdbc.sql("""
                        update call set answered_by = :staff,
                                        state = case when state = 'RINGING' then 'ANSWERED' else state end,
                                        answered_at = coalesce(answered_at, :at), version = version + 1
                        where id = :id and answered_by is null and state in ('RINGING', 'ANSWERED')""")
                .param("staff", who.get()).param("id", call.get().id()).param("at", at(at)).update();
        if (taken == 0 && call.get().answeredBy() != null && !call.get().answeredBy().equals(who.get())) {
            log.warn("Call {}: the phone of staff {} answered, but staff {} took it in the panel first; kept",
                    call.get().id(), who.get(), call.get().answeredBy());
        }
    }

    /**
     * The channel is gone: ANSWERED → ENDED, RINGING → MISSED; a call already over stays. A call that was taken gets
     * its recording fetched from Asterisk (PENDING, {@link CallRecordings}).
     */
    void ended(String channelId, OffsetDateTime at, String reason) {
        jdbc.sql("with closed as (" + """
                        update call set state = case when state = 'ANSWERED' then 'ENDED' else 'MISSED' end,
                                        ended_at = :at, ended_reason = :reason, version = version + 1
                        where channel_id = :channel and state in ('DIALING', 'RINGING', 'ANSWERED')
                        returning id, state""" + RECORD_TAKEN)
                .param("channel", channelId).param("at", at(at)).param("reason", reason).param("now", now())
                .query(Long.class).single();
    }

    /**
     * Calls whose end Asterisk never reported (the connection was down at that moment) are closed after
     * {@code staleAfter}, marked LOST. Returns how many.
     */
    int closeStale(Duration staleAfter) {
        OffsetDateTime now = now();
        long closed = jdbc.sql("with closed as (" + """
                        update call set state = case when state = 'ANSWERED' then 'ENDED' else 'MISSED' end,
                                        ended_at = :now, ended_reason = 'LOST', version = version + 1
                        where state in ('DIALING', 'RINGING', 'ANSWERED') and started_at < :before
                        returning id, state""" + RECORD_TAKEN)
                .param("now", now).param("before", now.minus(staleAfter)).query(Long.class).single();
        if (closed > 0) {
            log.info("Closed {} calls whose end Asterisk did not report", closed);
        }
        return (int) closed;
    }

    /**
     * After the events stream reconnected (issue #67): the open calls that started before {@code snapshotAt} and
     * whose channel Asterisk no longer has ({@code alive}, taken at {@code snapshotAt}) ended while the server was not
     * listening — closed as LOST; a taken one gets its recording fetched. DIALING calls are left to the command that
     * places them. Returns how many.
     */
    int reconcile(Set<String> alive, OffsetDateTime snapshotAt) {
        long closed = jdbc.sql("with closed as (" + """
                        update call set state = case when state = 'ANSWERED' then 'ENDED' else 'MISSED' end,
                                        ended_at = :now, ended_reason = 'LOST', version = version + 1
                        where state in ('RINGING', 'ANSWERED') and started_at < :snapshot
                          and not (channel_id = any(cast(:alive as text[])))
                        returning id, state""" + RECORD_TAKEN)
                .param("now", now()).param("snapshot", snapshotAt).param("alive", alive.toArray(String[]::new))
                .query(Long.class).single();
        if (closed > 0) {
            log.info("Closed {} calls that ended while Asterisk's events were not reachable", closed);
        }
        return (int) closed;
    }

    // ---------------------------------------------------------------- the operators

    @Override
    @Transactional(readOnly = true)
    public List<Call> recent(Actor actor, State state, UUID orderId, int limit) {
        StaffAccess.Scope answer = staff.scope(actor, ANSWER_PERMISSION);
        StaffAccess.Scope listen = staff.scope(actor, LISTEN_PERMISSION);
        boolean all = answer.allCities() || listen.allCities();
        Set<UUID> cities = new HashSet<>(answer.cityIds());
        cities.addAll(listen.cityIds());
        if (!all && cities.isEmpty()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED,
                    "Missing permission " + ANSWER_PERMISSION + " or " + LISTEN_PERMISSION);
        }
        var query = jdbc.sql(SELECT + " where (:all or c.city_id = any(cast(:cities as uuid[])))"
                        + (state == null ? "" : " and c.state = :state")
                        + (orderId == null ? "" : " and (c.order_id = :order or exists (select 1 from call_order o"
                                + " where o.call_id = c.id and o.order_id = :order))")
                        + " order by c.started_at desc, c.id limit :limit")
                .param("all", all).param("cities", cities.toArray(UUID[]::new))
                .param("limit", Math.max(1, Math.min(limit, 100)));
        if (state != null) {
            query = query.param("state", state.name());
        }
        if (orderId != null) {
            query = query.param("order", orderId);
        }
        return query.query((rs, i) -> map(rs)).list();
    }

    @Override
    public Call answer(Actor actor, UUID commandId, UUID callId) {
        Call call = find(callId).orElseThrow(JdbcCalls::notFound);
        staff.require(actor, ANSWER_PERMISSION, call.cityId());
        return commands.execute(new CommandKey(actor, "call.answer", commandId), callId, Call.class, () -> {
            Call locked = lock(callId);
            if (locked.direction() == Direction.OUTBOUND) {
                throw new DomainException(ErrorCode.STATE_CONFLICT, "An outgoing call is not taken");
            }
            if (locked.state() == State.ENDED || locked.state() == State.MISSED) {
                throw new DomainException(ErrorCode.STATE_CONFLICT, "The call is over");
            }
            if (locked.answeredBy() != null && !locked.answeredBy().equals(actor.id())) {
                throw new DomainException(ErrorCode.STATE_CONFLICT, "Another operator took the call");
            }
            jdbc.sql("""
                            update call set answered_by = :staff, state = 'ANSWERED',
                                            answered_at = coalesce(answered_at, :now), version = version + 1
                            where id = :id""")
                    .param("staff", actor.id()).param("now", now()).param("id", callId).update();
            return find(callId).orElseThrow();
        });
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Call> find(UUID callId) {
        return jdbc.sql(SELECT + " where c.id = :id").param("id", callId).query((rs, i) -> map(rs)).optional();
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void link(Actor actor, UUID callId, UUID orderId, boolean again) {
        Call call = find(callId).orElseThrow(JdbcCalls::notFound);
        staff.require(actor, ANSWER_PERMISSION, call.cityId());
        if (call.direction() == Direction.OUTBOUND) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "Orders are linked to incoming calls only");
        }
        lock(callId);
        long links = jdbc.sql("select count(*) from call_order where call_id = :call").param("call", callId)
                .query(Long.class).single();
        if (links > 0 && !again) {
            throw new DomainException(ErrorCode.STATE_CONFLICT,
                    "The call already has an order; link another one only explicitly (link_again)");
        }
        jdbc.sql("""
                        insert into call_order (call_id, order_id, linked_by, linked_at)
                        values (:call, :order, :staff, :now)""")
                .param("call", callId).param("order", orderId).param("staff", actor.id()).param("now", now())
                .update();
    }

    // ---------------------------------------------------------------- click-to-call

    record DialRequest(UUID orderId, Party party) {
    }

    @Override
    public Call dial(Actor actor, UUID commandId, Outbound outbound) {
        if (outbound.to() == null || outbound.party() == null || outbound.orderId() == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Whom to call is required");
        }
        String extension = extension(actor.id()).orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT,
                "You have no extension: the admin sets it (Settings → staff extensions)"));
        // 1. The receipt and the call, committed before Asterisk is asked.
        Call first = commands.execute(new CommandKey(actor, "call.dial", commandId),
                new DialRequest(outbound.orderId(), outbound.party()), Call.class, () -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into call (id, channel_id, direction, party, order_id, city_id, state,
                                                      answered_by, started_at)
                                    values (:id, :channel, 'OUTBOUND', :party, :order, :city, 'DIALING', :staff,
                                            :now)""")
                            .param("id", id).param("channel", id.toString()).param("party", outbound.party().name())
                            .param("order", outbound.orderId()).param("city", outbound.cityId())
                            .param("staff", actor.id()).param("now", now()).update();
                    return find(id).orElseThrow();
                });
        Call current = find(first.id()).orElseThrow();
        if (current.state() == State.FAILED) {
            throw unreachable();
        }
        if (current.state() != State.DIALING) {
            return current; // a repeat of a call Asterisk already took
        }
        // 2. Asterisk, outside any transaction. The call's id is the channel's: a repeat cannot ring twice.
        try {
            channels.originate(current.id().toString(), properties.endpoint(extension), properties.outgoingContext(),
                    Map.of("BLIZZ_DIAL", outbound.to().e164(), "BLIZZ_CALL_ID", current.id().toString()));
        } catch (IOException | RuntimeException e) {
            // Only the type and our own message: the request's variables are never part of either.
            boolean notStarted = e instanceof ChannelControl.Refused || e instanceof ConnectException
                    || e instanceof RuntimeException;
            log.warn("Asterisk did not take outgoing call {}{}: {}", current.id(),
                    notStarted ? "" : " (outcome unknown, a repeat of the command retries it)",
                    e instanceof ChannelControl.Refused ? e.getMessage() : e.getClass().getSimpleName());
            if (!notStarted) {
                // The request may have reached Asterisk: the call stays DIALING, and a repeat asks again with the
                // same channel id — "already exists" then means it is ringing.
                throw unreachable();
            }
            jdbc.sql("""
                            update call set state = 'FAILED', ended_at = :now, ended_reason = 'FAILED',
                                            version = version + 1
                            where id = :id and state = 'DIALING'""")
                    .param("now", now()).param("id", current.id()).update();
            throw unreachable();
        }
        // 3. Asterisk took it: from here the events lead the call.
        jdbc.sql("update call set state = 'RINGING', version = version + 1 where id = :id and state = 'DIALING'")
                .param("id", current.id()).update();
        return find(current.id()).orElseThrow();
    }

    Optional<String> extension(UUID staffId) {
        return jdbc.sql("select extension from staff_extension where staff_id = :id").param("id", staffId)
                .query(String.class).optional();
    }

    private static DomainException unreachable() {
        return new DomainException(ErrorCode.PROVIDER_UNAVAILABLE,
                "Asterisk is not reachable: the call was not placed; try again");
    }

    // ---------------------------------------------------------------- helpers

    private Call lock(UUID callId) {
        jdbc.sql("select id from call where id = :id for update").param("id", callId).query(UUID.class).optional()
                .orElseThrow(JdbcCalls::notFound);
        return find(callId).orElseThrow(JdbcCalls::notFound);
    }

    private static Call map(ResultSet rs) throws SQLException {
        UUID[] orders = (UUID[]) rs.getArray("order_ids").getArray();
        String party = rs.getString("party");
        return new Call(rs.getObject("id", UUID.class), Direction.valueOf(rs.getString("direction")),
                party == null ? null : Party.valueOf(party), State.valueOf(rs.getString("state")),
                rs.getString("caller_phone"), rs.getString("called_number"), rs.getObject("city_id", UUID.class),
                rs.getObject("answered_by", UUID.class), List.of(orders),
                rs.getObject("started_at", OffsetDateTime.class), rs.getObject("answered_at", OffsetDateTime.class),
                rs.getObject("ended_at", OffsetDateTime.class), recording(rs));
    }

    private static Recording recording(ResultSet rs) throws SQLException {
        String state = rs.getString("recording_state");
        if (state == null) {
            return null;
        }
        return new Recording(RecordingState.valueOf(state), (Integer) rs.getObject("duration_seconds"),
                rs.getObject("stored_at", OffsetDateTime.class));
    }

    /**
     * A number as networks send it, in E.164 when it can be read: with "+" or "00", or bare digits that are a full
     * Ukrainian (380 + 9 digits) or Polish (48 + 9 digits) number. Anything else bare — a Polish national number
     * (512345678 is not +512…, Peru), a local one (0…) — cannot be placed without the trunk's country: empty.
     */
    static Optional<String> e164(String raw) {
        if (raw == null) {
            return Optional.empty();
        }
        String value = raw.strip().replaceAll("[\\s\\-().]", "");
        if (value.matches("^(380[0-9]{9}|48[0-9]{9})$")) {
            value = "+" + value;
        } else if (value.matches("^[0-9]+$") && !value.startsWith("00")) {
            return Optional.empty();
        }
        try {
            return Optional.of(PhoneNumber.parse(value).e164());
        } catch (DomainException e) {
            return Optional.empty();
        }
    }

    /** The event's time, or now when Asterisk sent none. */
    private OffsetDateTime at(OffsetDateTime at) {
        return at == null ? now() : at.withOffsetSameInstant(ZoneOffset.UTC);
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    private static DomainException notFound() {
        return new DomainException(ErrorCode.NOT_FOUND, "Call not found");
    }
}
