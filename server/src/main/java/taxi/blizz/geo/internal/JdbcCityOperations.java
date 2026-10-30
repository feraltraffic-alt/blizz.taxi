package taxi.blizz.geo.internal;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityOperations;
import taxi.blizz.geo.GeoConfiguration;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcCityOperations implements CityOperations {

    static final int MAX_INTERVALS = 14;

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final JsonMapper json;
    private final Clock clock;

    JdbcCityOperations(JdbcClient jdbc, StaffAccess staff, IdempotentCommands commands, AuditLog audit,
                       JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.staff = staff;
        this.commands = commands;
        this.audit = audit;
        this.json = json;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public State get(Actor actor, UUID cityId) {
        staff.require(actor, GeoConfiguration.MANAGE_PERMISSION, cityId);
        requireCity(cityId, false);
        return of(cityId);
    }

    record ChangeRequest(UUID cityId, long expectedVersion, Settings settings, String reason) {
    }

    record PauseRequest(UUID cityId, long expectedVersion, boolean pause, String reason) {
    }

    @Override
    public State change(Actor actor, UUID commandId, UUID cityId, long expectedVersion, Settings settings,
                        String reason) {
        staff.require(actor, GeoConfiguration.MANAGE_PERMISSION, cityId);
        Settings clean = validate(settings);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "city.operations.change", commandId),
                new ChangeRequest(cityId, expectedVersion, clean, why), State.class, () -> {
                    State before = lockedState(cityId, expectedVersion);
                    int returnZone = clean.returnZoneMeters() == null ? before.returnZoneMeters()
                            : clean.returnZoneMeters();
                    State after = new State(cityId, clean.workingHours(), clean.paymentMethods(), returnZone,
                            before.ordersPaused(), before.pauseReason(), before.pausedAt(), before.version() + 1);
                    write(after, actor);
                    audit.record(new AuditEntry(actor, "city.operations.change", "city", cityId.toString(), why,
                            snapshot(before), snapshot(after)));
                    return after;
                });
    }

    @Override
    public State pause(Actor actor, UUID commandId, UUID cityId, long expectedVersion, String reason) {
        return pauseOrResume(actor, commandId, cityId, expectedVersion, reason, true);
    }

    @Override
    public State resume(Actor actor, UUID commandId, UUID cityId, long expectedVersion, String reason) {
        return pauseOrResume(actor, commandId, cityId, expectedVersion, reason, false);
    }

    private State pauseOrResume(Actor actor, UUID commandId, UUID cityId, long expectedVersion, String reason,
                                boolean pause) {
        staff.require(actor, GeoConfiguration.MANAGE_PERMISSION, cityId);
        String why = reason(reason);
        String action = pause ? "city.operations.pause" : "city.operations.resume";
        return commands.execute(new CommandKey(actor, action, commandId),
                new PauseRequest(cityId, expectedVersion, pause, why), State.class, () -> {
                    State before = lockedState(cityId, expectedVersion);
                    if (before.ordersPaused() == pause) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                pause ? "New orders are already paused" : "New orders are not paused");
                    }
                    State after = new State(cityId, before.workingHours(), before.paymentMethods(),
                            before.returnZoneMeters(), pause,
                            pause ? why : null, pause ? now() : null, before.version() + 1);
                    write(after, actor);
                    audit.record(new AuditEntry(actor, action, "city", cityId.toString(), why, snapshot(before),
                            snapshot(after)));
                    return after;
                });
    }

    @Override
    @Transactional(readOnly = true)
    public Map<UUID, State> all() {
        Map<UUID, State> states = new HashMap<>();
        jdbc.sql(SELECT).query((rs, i) -> map(rs)).list().forEach(s -> states.put(s.cityId(), s));
        return states;
    }

    @Override
    @Transactional(readOnly = true)
    public State of(UUID cityId) {
        return read(cityId).orElseGet(() -> defaults(cityId));
    }

    @Override
    public void requireAccepting(City city, OffsetDateTime at, String paymentMethod) {
        State state = of(city.id());
        if (state.ordersPaused()) {
            throw new DomainException(ErrorCode.CITY_PAUSED, "The city takes no new orders for now");
        }
        if (!open(state.workingHours(), at.atZoneSameInstant(ZoneId.of(city.timezone())))) {
            throw new DomainException(ErrorCode.CITY_CLOSED, "Outside the city's working hours");
        }
        if (paymentMethod != null && METHODS.contains(paymentMethod)
                && !state.paymentMethods().contains(paymentMethod)) {
            throw new DomainException(ErrorCode.PAYMENT_METHOD_NOT_OFFERED,
                    "The city does not offer this payment method");
        }
    }

    /** Inside one of the intervals; no intervals means around the clock. */
    static boolean open(List<Hours> hours, ZonedDateTime local) {
        if (hours.isEmpty()) {
            return true;
        }
        int day = local.getDayOfWeek().getValue();
        int previous = day == 1 ? 7 : day - 1;
        LocalTime time = local.toLocalTime();
        for (Hours h : hours) {
            boolean within = h.from().isBefore(h.to())
                    ? h.daysOfWeek().contains(day) && !time.isBefore(h.from()) && time.isBefore(h.to())
                    // Past midnight (or 24 hours when equal): the evening part today, the morning part of yesterday's.
                    : (h.daysOfWeek().contains(day) && !time.isBefore(h.from()))
                            || (h.daysOfWeek().contains(previous) && time.isBefore(h.to()));
            if (within) {
                return true;
            }
        }
        return false;
    }

    // ---------------------------------------------------------------- storage

    private static final String SELECT = """
            select city_id, working_hours::text as working_hours, payment_methods, return_zone_meters,
                   orders_paused, pause_reason, paused_at, version
            from city_operations""";

    private Optional<State> read(UUID cityId) {
        return jdbc.sql(SELECT + " where city_id = :city").param("city", cityId).query((rs, i) -> map(rs))
                .optional();
    }

    /** Locks the city, then checks the expected version of its operations (0 until the first change). */
    private State lockedState(UUID cityId, long expectedVersion) {
        requireCity(cityId, true);
        State current = jdbc.sql(SELECT + " where city_id = :city for update").param("city", cityId)
                .query((rs, i) -> map(rs)).optional().orElseGet(() -> defaults(cityId));
        if (current.version() != expectedVersion) {
            throw ConflictException.version(current.version(), "The city's operations changed");
        }
        return current;
    }

    private void requireCity(UUID cityId, boolean lock) {
        String state = jdbc.sql("select state from city where id = :id" + (lock ? " for update" : ""))
                .param("id", cityId).query(String.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "City not found"));
        if (lock && "ARCHIVED".equals(state)) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The city is archived");
        }
    }

    private void write(State s, Actor actor) {
        jdbc.sql("""
                        insert into city_operations (city_id, working_hours, payment_methods, return_zone_meters,
                                                     orders_paused, pause_reason, paused_at, version, updated_by,
                                                     updated_at)
                        values (:city, cast(:hours as jsonb), :methods, :returnZone, :paused, :reason, :pausedAt,
                                :version, :by, :now)
                        on conflict (city_id) do update set working_hours = excluded.working_hours,
                            payment_methods = excluded.payment_methods,
                            return_zone_meters = excluded.return_zone_meters, orders_paused = excluded.orders_paused,
                            pause_reason = excluded.pause_reason, paused_at = excluded.paused_at,
                            version = excluded.version, updated_by = excluded.updated_by,
                            updated_at = excluded.updated_at""")
                .param("city", s.cityId()).param("hours", json.writeValueAsString(stored(s.workingHours())))
                .param("methods", new TreeSet<>(s.paymentMethods()).toArray(String[]::new))
                .param("returnZone", s.returnZoneMeters())
                .param("paused", s.ordersPaused()).param("reason", s.pauseReason()).param("pausedAt", s.pausedAt())
                .param("version", s.version()).param("by", actor.id()).param("now", now()).update();
    }

    private State map(ResultSet rs) throws SQLException {
        List<Map<String, Object>> raw = json.readValue(rs.getString("working_hours"),
                new TypeReference<List<Map<String, Object>>>() {});
        List<Hours> hours = new ArrayList<>();
        for (Map<String, Object> h : raw) {
            Set<Integer> days = new TreeSet<>();
            for (Object d : (List<?>) h.get("days_of_week")) {
                days.add(((Number) d).intValue());
            }
            hours.add(new Hours(days, LocalTime.parse((String) h.get("from")), LocalTime.parse((String) h.get("to"))));
        }
        Array methods = rs.getArray("payment_methods");
        return new State(rs.getObject("city_id", UUID.class), hours,
                Set.copyOf(Arrays.asList((String[]) methods.getArray())), rs.getInt("return_zone_meters"),
                rs.getBoolean("orders_paused"),
                rs.getString("pause_reason"), rs.getObject("paused_at", OffsetDateTime.class), rs.getLong("version"));
    }

    private static List<Map<String, Object>> stored(List<Hours> hours) {
        return hours.stream().map(h -> {
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("days_of_week", new TreeSet<>(h.daysOfWeek()));
            m.put("from", hhmm(h.from()));
            m.put("to", hhmm(h.to()));
            return m;
        }).toList();
    }

    private static Map<String, Object> snapshot(State s) {
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("working_hours", stored(s.workingHours()));
        m.put("payment_methods", new TreeSet<>(s.paymentMethods()));
        m.put("return_zone_meters", s.returnZoneMeters());
        m.put("orders_paused", s.ordersPaused());
        m.put("version", s.version());
        return m;
    }

    static String hhmm(LocalTime time) {
        return String.format("%02d:%02d", time.getHour(), time.getMinute());
    }

    private static State defaults(UUID cityId) {
        return new State(cityId, List.of(), METHODS, 0, false, null, null, 0);
    }

    // ---------------------------------------------------------------- validation

    private static Settings validate(Settings settings) {
        if (settings == null) {
            throw invalid("Working hours and payment methods are required");
        }
        if (settings.workingHours().size() > MAX_INTERVALS) {
            throw invalid("At most " + MAX_INTERVALS + " intervals of working hours");
        }
        for (Hours h : settings.workingHours()) {
            if (h == null || h.from() == null || h.to() == null || h.daysOfWeek().isEmpty()
                    || h.daysOfWeek().stream().anyMatch(d -> d == null || d < 1 || d > 7)) {
                throw invalid("Each interval needs ISO days 1..7, from and to");
            }
            if (h.from().getSecond() != 0 || h.to().getSecond() != 0 || h.from().getNano() != 0
                    || h.to().getNano() != 0) {
                throw invalid("Working hours are whole minutes");
            }
        }
        if (settings.paymentMethods().isEmpty() || !METHODS.containsAll(settings.paymentMethods())) {
            throw invalid("Payment methods are one or more of " + new TreeSet<>(METHODS));
        }
        if (settings.returnZoneMeters() != null
                && (settings.returnZoneMeters() < 0 || settings.returnZoneMeters() > MAX_RETURN_ZONE_METERS)) {
            throw invalid("The return zone is 0.." + MAX_RETURN_ZONE_METERS + " metres");
        }
        return settings;
    }

    private static String reason(String reason) {
        if (reason == null || reason.isBlank()) {
            throw invalid("A reason is required");
        }
        return reason.strip();
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }
}
