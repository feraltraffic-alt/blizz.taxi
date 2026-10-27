package taxi.blizz.promotions.internal;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.promotions.DriverPromotions;

@Service
class JdbcDriverPromotions implements DriverPromotions {

    static final String COLUMNS = """
            id, name, reward_minor, currency, city_id, period_days, orders_required, days_of_week, time_from, time_to,
            payment_method, repeat, starts_at, ends_at, state, version, created_by, created_at, updated_at
            """;
    private static final Set<String> PAYMENT_METHODS = Set.of("CASH", "CARD", "TERMINAL");

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final Clock clock;

    JdbcDriverPromotions(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                         Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Promotion> list(Actor actor, boolean includeArchived) {
        staff.require(actor, MANAGE_PERMISSION);
        return jdbc.sql("select " + COLUMNS + " from driver_promotion"
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
        return commands.execute(new CommandKey(actor, "driverPromotion.create", commandId),
                new CreateRequest(valid, why), Promotion.class, () -> {
                    UUID id = UUID.randomUUID();
                    write(id, valid, actor, true);
                    Promotion created = get(id);
                    audit.record(new AuditEntry(actor, "driverPromotion.create", "driver_promotion", id.toString(),
                            why, null, created));
                    return created;
                });
    }

    @Override
    public Promotion change(Actor actor, UUID commandId, UUID promotionId, long expectedVersion, Draft draft,
                            String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        Draft valid = validate(draft);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "driverPromotion.change", commandId),
                new ChangeRequest(promotionId, expectedVersion, valid, why), Promotion.class, () -> {
                    Promotion before = lock(promotionId, expectedVersion);
                    if (!"ACTIVE".equals(before.state())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "An archived promotion cannot change");
                    }
                    write(promotionId, valid, actor, false);
                    Promotion after = get(promotionId);
                    audit.record(new AuditEntry(actor, "driverPromotion.change", "driver_promotion",
                            promotionId.toString(), why, before, after));
                    return after;
                });
    }

    @Override
    public Promotion archive(Actor actor, UUID commandId, UUID promotionId, long expectedVersion, String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "driverPromotion.archive", commandId),
                new ArchiveRequest(promotionId, expectedVersion, why), Promotion.class, () -> {
                    Promotion before = lock(promotionId, expectedVersion);
                    if (!"ACTIVE".equals(before.state())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Already archived");
                    }
                    jdbc.sql("""
                                    update driver_promotion set state = 'ARCHIVED', version = version + 1,
                                                                updated_at = :now
                                    where id = :id""")
                            .param("now", now()).param("id", promotionId).update();
                    Promotion after = get(promotionId);
                    audit.record(new AuditEntry(actor, "driverPromotion.archive", "driver_promotion",
                            promotionId.toString(), why, before, after));
                    return after;
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<Progress> progress(Actor driver) {
        if (driver == null || driver.type() != SubjectType.DRIVER) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Drivers only");
        }
        OffsetDateTime now = now();
        List<Promotion> active = jdbc.sql("select " + COLUMNS + """
                         from driver_promotion where state = 'ACTIVE' and starts_at <= :now
                          and (ends_at is null or ends_at > :now) order by created_at, id""")
                .param("now", now).query((rs, i) -> promotion(rs)).list();
        List<Progress> result = new ArrayList<>();
        for (Promotion p : active) {
            Draft t = p.terms();
            int period = periodIndex(t, now.toInstant());
            OffsetDateTime start = t.startsAt().plus(Duration.ofDays((long) period * t.periodDays()))
                    .atOffset(ZoneOffset.UTC);
            long done = jdbc.sql("""
                            select count(*) from driver_promotion_trip
                            where promotion_id = :p and driver_id = :d and period_index = :i""")
                    .param("p", p.id()).param("d", driver.id()).param("i", period).query(Long.class).single();
            boolean rewarded = jdbc.sql("""
                            select count(*) from driver_promotion_reward where promotion_id = :p and driver_id = :d
                              and (:once or period_index = :i)""")
                    .param("p", p.id()).param("d", driver.id()).param("i", period)
                    .param("once", t.repeat() == Repeat.ONCE).query(Long.class).single() > 0;
            result.add(new Progress(p.id(), t.name(), t.rewardMinor(), t.currency(), t.ordersRequired(), done, start,
                    start.plusDays(t.periodDays()), rewarded, t.repeat()));
        }
        return result;
    }

    /** Whole periods since the start: 0 for the first {@code periodDays} days. */
    static int periodIndex(Draft t, Instant at) {
        long seconds = Duration.between(t.startsAt(), at).getSeconds();
        return (int) Math.floorDiv(seconds, (long) t.periodDays() * 86_400);
    }

    private void write(UUID id, Draft d, Actor actor, boolean insert) {
        String sql = insert ? """
                insert into driver_promotion (id, name, reward_minor, currency, city_id, period_days, orders_required,
                                              days_of_week, time_from, time_to, payment_method, repeat, starts_at,
                                              ends_at, state, version, created_by, created_at, updated_at)
                values (:id, :name, :reward, :currency, :city, :period, :orders, :days, :from, :to, :payment,
                        :repeat, :starts, :ends, 'ACTIVE', 1, :by, :now, :now)"""
                : """
                update driver_promotion set name = :name, reward_minor = :reward, currency = :currency,
                       city_id = :city, period_days = :period, orders_required = :orders, days_of_week = :days,
                       time_from = :from, time_to = :to, payment_method = :payment, repeat = :repeat,
                       starts_at = :starts, ends_at = :ends, version = version + 1, updated_at = :now
                where id = :id""";
        jdbc.sql(sql).param("id", id).param("name", d.name()).param("reward", d.rewardMinor())
                .param("currency", d.currency()).param("city", d.cityId()).param("period", d.periodDays())
                .param("orders", d.ordersRequired())
                .param("days", d.daysOfWeek() == null ? null
                        : d.daysOfWeek().stream().map(DayOfWeek::getValue).toArray(Integer[]::new))
                .param("from", d.timeFrom()).param("to", d.timeTo()).param("payment", d.paymentMethod())
                .param("repeat", d.repeat().name()).param("starts", d.startsAt().atOffset(ZoneOffset.UTC))
                .param("ends", d.endsAt() == null ? null : d.endsAt().atOffset(ZoneOffset.UTC))
                .param("by", actor.id()).param("now", now()).update();
    }

    private Promotion lock(UUID id, long expectedVersion) {
        Promotion p = jdbc.sql("select " + COLUMNS + " from driver_promotion where id = :id for update")
                .param("id", id).query((rs, i) -> promotion(rs)).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Promotion not found"));
        if (p.version() != expectedVersion) {
            throw new DomainException(ErrorCode.VERSION_CONFLICT, "The promotion changed");
        }
        return p;
    }

    private Promotion get(UUID id) {
        return jdbc.sql("select " + COLUMNS + " from driver_promotion where id = :id").param("id", id)
                .query((rs, i) -> promotion(rs)).single();
    }

    static Draft validate(Draft d) {
        if (d == null || d.repeat() == null || d.startsAt() == null) {
            throw invalid("Name, reward, period, number of orders, repeat and start are required");
        }
        String name = d.name() == null ? "" : d.name().strip();
        if (name.isEmpty() || name.length() > 120) {
            throw invalid("The name is required (at most 120 characters)");
        }
        if (d.rewardMinor() <= 0 || d.currency() == null || !d.currency().matches("[A-Z]{3}")) {
            throw invalid("The reward needs a positive amount and its currency");
        }
        if (d.periodDays() < 1 || d.periodDays() > 366 || d.ordersRequired() < 1 || d.ordersRequired() > 100_000) {
            throw invalid("The period is 1–366 days, the orders 1–100000");
        }
        if ((d.timeFrom() == null) != (d.timeTo() == null)
                || (d.timeFrom() != null && d.timeFrom().equals(d.timeTo()))) {
            throw invalid("Hours need both ends, and they must differ");
        }
        if (d.paymentMethod() != null && !PAYMENT_METHODS.contains(d.paymentMethod())) {
            throw invalid("The payment method is CASH, CARD or TERMINAL");
        }
        if (d.endsAt() != null && !d.startsAt().isBefore(d.endsAt())) {
            throw invalid("The promotion must start before it ends");
        }
        return new Draft(name, d.rewardMinor(), d.currency(), d.cityId(), d.periodDays(), d.ordersRequired(),
                d.daysOfWeek() == null ? null : d.daysOfWeek().stream().distinct().sorted().toList(), d.timeFrom(),
                d.timeTo(), d.paymentMethod(), d.repeat(), d.startsAt(), d.endsAt());
    }

    static Promotion promotion(ResultSet rs) throws SQLException {
        Array days = rs.getArray("days_of_week");
        List<DayOfWeek> dayList = null;
        if (days != null) {
            dayList = new ArrayList<>();
            for (Object d : (Object[]) days.getArray()) {
                dayList.add(DayOfWeek.of(((Number) d).intValue()));
            }
        }
        OffsetDateTime ends = rs.getObject("ends_at", OffsetDateTime.class);
        Draft terms = new Draft(rs.getString("name"), rs.getLong("reward_minor"), rs.getString("currency"),
                rs.getObject("city_id", UUID.class), rs.getInt("period_days"), rs.getInt("orders_required"), dayList,
                rs.getObject("time_from", LocalTime.class), rs.getObject("time_to", LocalTime.class),
                rs.getString("payment_method"), Repeat.valueOf(rs.getString("repeat")),
                rs.getObject("starts_at", OffsetDateTime.class).toInstant(), ends == null ? null : ends.toInstant());
        return new Promotion(rs.getObject("id", UUID.class), terms, rs.getString("state"), rs.getLong("version"),
                rs.getObject("created_by", UUID.class), rs.getObject("created_at", OffsetDateTime.class),
                rs.getObject("updated_at", OffsetDateTime.class));
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
