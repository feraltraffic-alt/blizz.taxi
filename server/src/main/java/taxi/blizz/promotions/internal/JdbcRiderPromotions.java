package taxi.blizz.promotions.internal;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.promotions.RiderPromotions;

@Service
class JdbcRiderPromotions implements RiderPromotions {

    private static final String COLUMNS = """
            id, name, kind, value_type, value, currency, city_id, vehicle_class, every_nth_trip, days_of_week,
            time_from, time_to, pickup_zone_id, dropoff_zone_id, starts_at, ends_at, state, version, created_by,
            created_at, updated_at""";

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final Clock clock;

    JdbcRiderPromotions(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                        Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.clock = clock;
    }

    // ---------------------------------------------------------------- admin

    @Override
    @Transactional(readOnly = true)
    public List<Promotion> list(Actor actor, boolean includeArchived) {
        staff.require(actor, MANAGE_PERMISSION);
        return jdbc.sql("select " + COLUMNS + " from rider_promotion"
                        + (includeArchived ? "" : " where state = 'ACTIVE'") + " order by created_at, id")
                .query((rs, i) -> promotion(rs)).list();
    }

    record CreateRequest(Draft draft, String reason) {
    }

    record ChangeRequest(UUID promotionId, long expectedVersion, Draft draft, String reason) {
    }

    record ArchiveRequest(UUID promotionId, long expectedVersion, String reason) {
    }

    @Override
    public Promotion create(Actor actor, UUID commandId, Draft draft, String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        Draft valid = validate(draft);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "promotion.create", commandId), new CreateRequest(valid, why),
                Promotion.class, () -> {
                    UUID id = UUID.randomUUID();
                    OffsetDateTime now = now();
                    write(id, valid, actor, now, true);
                    Promotion created = get(id);
                    audit.record(new AuditEntry(actor, "promotion.create", "rider_promotion", id.toString(), why,
                            null, created));
                    return created;
                });
    }

    @Override
    public Promotion change(Actor actor, UUID commandId, UUID promotionId, long expectedVersion, Draft draft,
                            String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        Draft valid = validate(draft);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "promotion.change", commandId),
                new ChangeRequest(promotionId, expectedVersion, valid, why), Promotion.class, () -> {
                    Promotion before = lock(promotionId, expectedVersion);
                    if (!"ACTIVE".equals(before.state())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "An archived promotion cannot change");
                    }
                    write(promotionId, valid, actor, now(), false);
                    Promotion after = get(promotionId);
                    audit.record(new AuditEntry(actor, "promotion.change", "rider_promotion", promotionId.toString(),
                            why, before, after));
                    return after;
                });
    }

    @Override
    public Promotion archive(Actor actor, UUID commandId, UUID promotionId, long expectedVersion, String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "promotion.archive", commandId),
                new ArchiveRequest(promotionId, expectedVersion, why), Promotion.class, () -> {
                    Promotion before = lock(promotionId, expectedVersion);
                    if (!"ACTIVE".equals(before.state())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Already archived");
                    }
                    jdbc.sql("""
                                    update rider_promotion set state = 'ARCHIVED', version = version + 1,
                                                               updated_at = :now
                                    where id = :id""")
                            .param("now", now()).param("id", promotionId).update();
                    Promotion after = get(promotionId);
                    audit.record(new AuditEntry(actor, "promotion.archive", "rider_promotion", promotionId.toString(),
                            why, before, after));
                    return after;
                });
    }

    private void write(UUID id, Draft d, Actor actor, OffsetDateTime now, boolean insert) {
        Conditions c = d.conditions();
        String sql = insert ? """
                insert into rider_promotion (id, name, kind, value_type, value, currency, city_id, vehicle_class,
                                             every_nth_trip, days_of_week, time_from, time_to, pickup_zone_id,
                                             dropoff_zone_id, starts_at, ends_at, state, version, created_by,
                                             created_at, updated_at)
                values (:id, :name, :kind, :valueType, :value, :currency, :city, :class, :nth, :days, :from, :to,
                        :pickupZone, :dropoffZone, :starts, :ends, 'ACTIVE', 1, :by, :now, :now)"""
                : """
                update rider_promotion set name = :name, kind = :kind, value_type = :valueType, value = :value,
                       currency = :currency, city_id = :city, vehicle_class = :class, every_nth_trip = :nth,
                       days_of_week = :days, time_from = :from, time_to = :to, pickup_zone_id = :pickupZone,
                       dropoff_zone_id = :dropoffZone, starts_at = :starts, ends_at = :ends, version = version + 1,
                       updated_at = :now
                where id = :id""";
        jdbc.sql(sql).param("id", id).param("name", d.name()).param("kind", d.kind().name())
                .param("valueType", d.valueType().name()).param("value", d.value()).param("currency", d.currency())
                .param("city", c.cityId()).param("class", c.vehicleClass()).param("nth", c.everyNthTrip())
                .param("days", c.daysOfWeek() == null ? null
                        : c.daysOfWeek().stream().map(DayOfWeek::getValue).toArray(Integer[]::new))
                .param("from", c.timeFrom()).param("to", c.timeTo())
                .param("pickupZone", c.pickupZoneId()).param("dropoffZone", c.dropoffZoneId())
                .param("starts", c.startsAt() == null ? null : c.startsAt().atOffset(ZoneOffset.UTC))
                .param("ends", c.endsAt() == null ? null : c.endsAt().atOffset(ZoneOffset.UTC))
                .param("by", actor.id()).param("now", now).update();
    }

    private Promotion lock(UUID id, long expectedVersion) {
        Promotion p = jdbc.sql("select " + COLUMNS + " from rider_promotion where id = :id for update")
                .param("id", id).query((rs, i) -> promotion(rs)).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Promotion not found"));
        if (p.version() != expectedVersion) {
            throw new DomainException(ErrorCode.VERSION_CONFLICT, "The promotion changed");
        }
        return p;
    }

    private Promotion get(UUID id) {
        return jdbc.sql("select " + COLUMNS + " from rider_promotion where id = :id").param("id", id)
                .query((rs, i) -> promotion(rs)).single();
    }

    static Draft validate(Draft d) {
        if (d == null || d.kind() == null || d.valueType() == null || d.conditions() == null) {
            throw invalid("Name, kind, value type and conditions are required");
        }
        String name = d.name() == null ? "" : d.name().strip();
        if (name.isEmpty() || name.length() > 120) {
            throw invalid("The name is required (at most 120 characters)");
        }
        if (d.value() <= 0 || (d.valueType() == ValueType.PERCENT && d.value() > 10_000)) {
            throw invalid("The value must be positive; a percentage at most 100 % (10000 basis points)");
        }
        String currency = null;
        if (d.valueType() == ValueType.FIXED) {
            if (d.currency() == null || !d.currency().matches("[A-Z]{3}")) {
                throw invalid("A fixed amount needs its currency");
            }
            currency = d.currency();
        }
        Conditions c = d.conditions();
        if ((c.timeFrom() == null) != (c.timeTo() == null)
                || (c.timeFrom() != null && c.timeFrom().equals(c.timeTo()))) {
            throw invalid("Hours need both ends, and they must differ");
        }
        if ((c.pickupZoneId() != null || c.dropoffZoneId() != null) && c.cityId() == null) {
            throw invalid("Zones belong to a city: choose the city");
        }
        if (c.everyNthTrip() != null && (c.everyNthTrip() < 2 || c.everyNthTrip() > 1000)) {
            throw invalid("Every N-th trip: N from 2 to 1000 (every trip: leave it empty)");
        }
        if (c.startsAt() != null && c.endsAt() != null && !c.startsAt().isBefore(c.endsAt())) {
            throw invalid("The promotion must start before it ends");
        }
        String vehicleClass = c.vehicleClass() == null || c.vehicleClass().isBlank() ? null
                : c.vehicleClass().strip().toUpperCase(Locale.ROOT);
        Conditions conditions = new Conditions(c.cityId(), vehicleClass, c.everyNthTrip(),
                c.daysOfWeek() == null ? null : c.daysOfWeek().stream().distinct().sorted().toList(),
                c.timeFrom(), c.timeTo(), c.pickupZoneId(), c.dropoffZoneId(), c.startsAt(), c.endsAt());
        return new Draft(name, d.kind(), d.valueType(), d.value(), currency, conditions);
    }

    // ---------------------------------------------------------------- applying

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public List<Applied> applyToQuote(UUID quoteId, Context ctx) {
        if (ctx.clientId() == null) {
            return List.of(); // promotions are for riders' accounts
        }
        OffsetDateTime now = now();
        long completed = jdbc.sql("select count(*) from promotion_trip where client_id = :client")
                .param("client", ctx.clientId()).query(Long.class).single();
        List<Promotion> active = jdbc.sql("select " + COLUMNS + """
                         from rider_promotion where state = 'ACTIVE'
                          and (starts_at is null or starts_at <= :now) and (ends_at is null or ends_at > :now)
                        order by created_at, id""")
                .param("now", now).query((rs, i) -> promotion(rs)).list();
        List<Applied> applied = new ArrayList<>();
        long discounted = 0;
        for (Promotion p : active) {
            if (!matches(p, ctx, completed + 1)) {
                continue;
            }
            if (p.valueType() == ValueType.FIXED && !p.currency().equals(ctx.currency())) {
                continue;
            }
            long discount = 0;
            if (p.kind() == Kind.DISCOUNT) {
                long wanted = amount(p.valueType(), p.value(), ctx.priceMinor());
                discount = Math.min(wanted, ctx.priceMinor() - discounted);
                if (discount <= 0) {
                    continue;
                }
                discounted += discount;
            }
            applied.add(new Applied(p.id(), p.name(), p.kind(), p.valueType(), p.value(), discount));
        }
        for (Applied a : applied) {
            jdbc.sql("""
                            insert into promotion_quote (quote_id, promotion_id, kind, value_type, value, discount_minor)
                            values (:quote, :promotion, :kind, :valueType, :value, :discount)""")
                    .param("quote", quoteId).param("promotion", a.promotionId()).param("kind", a.kind().name())
                    .param("valueType", a.valueType().name()).param("value", a.value())
                    .param("discount", a.discountMinor()).update();
        }
        return List.copyOf(applied);
    }

    /** Percent in basis points of {@code base}, rounded half up; or the fixed amount. Integers only. */
    static long amount(ValueType type, long value, long base) {
        return type == ValueType.FIXED ? value : (base * value + 5_000) / 10_000;
    }

    static boolean matches(Promotion p, Context ctx, long tripOrdinal) {
        Conditions c = p.conditions();
        if (c.cityId() != null && !c.cityId().equals(ctx.cityId())) {
            return false;
        }
        if (c.vehicleClass() != null && !c.vehicleClass().equalsIgnoreCase(ctx.vehicleClass())) {
            return false;
        }
        if (c.everyNthTrip() != null && tripOrdinal % c.everyNthTrip() != 0) {
            return false;
        }
        LocalDateTime local = ctx.localPickupTime();
        if (c.daysOfWeek() != null && !c.daysOfWeek().contains(local.getDayOfWeek())) {
            return false;
        }
        if (c.timeFrom() != null && !within(local.toLocalTime(), c.timeFrom(), c.timeTo())) {
            return false;
        }
        if (c.pickupZoneId() != null && !ctx.pickupZones().contains(c.pickupZoneId())) {
            return false;
        }
        return c.dropoffZoneId() == null || ctx.dropoffZones().contains(c.dropoffZoneId());
    }

    /** {@code from} inclusive, {@code to} exclusive; a window past midnight (22:00–06:00) wraps. */
    static boolean within(LocalTime t, LocalTime from, LocalTime to) {
        return from.isBefore(to) ? !t.isBefore(from) && t.isBefore(to) : !t.isBefore(from) || t.isBefore(to);
    }

    // ---------------------------------------------------------------- rows

    private static Promotion promotion(ResultSet rs) throws SQLException {
        Array days = rs.getArray("days_of_week");
        List<DayOfWeek> dayList = null;
        if (days != null) {
            dayList = new ArrayList<>();
            for (Object d : (Object[]) days.getArray()) {
                dayList.add(DayOfWeek.of(((Number) d).intValue()));
            }
        }
        OffsetDateTime starts = rs.getObject("starts_at", OffsetDateTime.class);
        OffsetDateTime ends = rs.getObject("ends_at", OffsetDateTime.class);
        Conditions conditions = new Conditions(rs.getObject("city_id", UUID.class), rs.getString("vehicle_class"),
                (Integer) rs.getObject("every_nth_trip"), dayList, rs.getObject("time_from", LocalTime.class),
                rs.getObject("time_to", LocalTime.class), rs.getObject("pickup_zone_id", UUID.class),
                rs.getObject("dropoff_zone_id", UUID.class), starts == null ? null : starts.toInstant(),
                ends == null ? null : ends.toInstant());
        return new Promotion(rs.getObject("id", UUID.class), rs.getString("name"), Kind.valueOf(rs.getString("kind")),
                ValueType.valueOf(rs.getString("value_type")), rs.getLong("value"), rs.getString("currency"),
                conditions, rs.getString("state"), rs.getLong("version"), rs.getObject("created_by", UUID.class),
                rs.getObject("created_at", OffsetDateTime.class), rs.getObject("updated_at", OffsetDateTime.class));
    }

    private static String reason(String reason) {
        if (reason == null || reason.isBlank()) {
            throw invalid("A reason is required");
        }
        return reason.strip();
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
