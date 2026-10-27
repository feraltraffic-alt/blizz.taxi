package taxi.blizz.telephony.internal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
            select c.id, c.state, c.caller_phone, c.called_number, c.city_id, c.answered_by, c.started_at,
                   c.answered_at, c.ended_at,
                   coalesce((select array_agg(o.order_id order by o.linked_at, o.order_id) from call_order o
                             where o.call_id = c.id), '{}') as order_ids
            from call c""";

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final Outbox outbox;
    private final Clock clock;

    JdbcCalls(JdbcClient jdbc, TransactionTemplate tx, IdempotentCommands commands, StaffAccess staff,
              Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.commands = commands;
        this.staff = staff;
        this.outbox = outbox;
        this.clock = clock;
    }

    // ---------------------------------------------------------------- Asterisk's events

    /**
     * A channel was created. Logged as a new RINGING call when it is a call to a service number; a repeat (the same
     * channel) changes nothing. {@code CallRinging} is published once, with the new row.
     */
    Optional<UUID> ringing(String channelId, String callerRaw, String calledRaw, OffsetDateTime at) {
        Optional<String> called = e164(calledRaw);
        if (channelId == null || called.isEmpty()) {
            return Optional.empty();
        }
        Optional<UUID> city = jdbc.sql("select city_id from call_line where number = :number")
                .param("number", called.get()).query(UUID.class).optional();
        if (city.isEmpty()) {
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

    /** The channel went Up: RINGING → ANSWERED; anything else stays. */
    void answered(String channelId, OffsetDateTime at) {
        jdbc.sql("""
                        update call set state = 'ANSWERED', answered_at = coalesce(answered_at, :at),
                                        version = version + 1
                        where channel_id = :channel and state = 'RINGING'""")
                .param("channel", channelId).param("at", at(at)).update();
    }

    /** The channel is gone: ANSWERED → ENDED, RINGING → MISSED; a call already over stays. */
    void ended(String channelId, OffsetDateTime at, String reason) {
        jdbc.sql("""
                        update call set state = case when state = 'ANSWERED' then 'ENDED' else 'MISSED' end,
                                        ended_at = :at, ended_reason = :reason, version = version + 1
                        where channel_id = :channel and state in ('RINGING', 'ANSWERED')""")
                .param("channel", channelId).param("at", at(at)).param("reason", reason).update();
    }

    /**
     * Calls whose end Asterisk never reported (the connection was down at that moment) are closed after
     * {@code staleAfter}, marked LOST. Returns how many.
     */
    int closeStale(Duration staleAfter) {
        OffsetDateTime now = now();
        int closed = jdbc.sql("""
                        update call set state = case when state = 'ANSWERED' then 'ENDED' else 'MISSED' end,
                                        ended_at = :now, ended_reason = 'LOST', version = version + 1
                        where state in ('RINGING', 'ANSWERED') and started_at < :before""")
                .param("now", now).param("before", now.minus(staleAfter)).update();
        if (closed > 0) {
            log.info("Closed {} calls whose end Asterisk did not report", closed);
        }
        return closed;
    }

    // ---------------------------------------------------------------- the operators

    @Override
    @Transactional(readOnly = true)
    public List<Call> recent(Actor actor, State state, int limit) {
        StaffAccess.Scope scope = staff.scope(actor, ANSWER_PERMISSION);
        if (!scope.allCities() && scope.cityIds().isEmpty()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Missing permission " + ANSWER_PERMISSION);
        }
        var query = jdbc.sql(SELECT + " where (:all or c.city_id = any(cast(:cities as uuid[])))"
                        + (state == null ? "" : " and c.state = :state")
                        + " order by c.started_at desc, c.id limit :limit")
                .param("all", scope.allCities()).param("cities", scope.cityIds().toArray(UUID[]::new))
                .param("limit", Math.max(1, Math.min(limit, 100)));
        if (state != null) {
            query = query.param("state", state.name());
        }
        return query.query((rs, i) -> map(rs)).list();
    }

    @Override
    public Call answer(Actor actor, UUID commandId, UUID callId) {
        Call call = find(callId).orElseThrow(JdbcCalls::notFound);
        staff.require(actor, ANSWER_PERMISSION, call.cityId());
        return commands.execute(new CommandKey(actor, "call.answer", commandId), callId, Call.class, () -> {
            Call locked = lock(callId);
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

    // ---------------------------------------------------------------- helpers

    private Call lock(UUID callId) {
        jdbc.sql("select id from call where id = :id for update").param("id", callId).query(UUID.class).optional()
                .orElseThrow(JdbcCalls::notFound);
        return find(callId).orElseThrow(JdbcCalls::notFound);
    }

    private static Call map(ResultSet rs) throws SQLException {
        UUID[] orders = (UUID[]) rs.getArray("order_ids").getArray();
        return new Call(rs.getObject("id", UUID.class), State.valueOf(rs.getString("state")),
                rs.getString("caller_phone"), rs.getString("called_number"), rs.getObject("city_id", UUID.class),
                rs.getObject("answered_by", UUID.class), List.of(orders),
                rs.getObject("started_at", OffsetDateTime.class), rs.getObject("answered_at", OffsetDateTime.class),
                rs.getObject("ended_at", OffsetDateTime.class));
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
