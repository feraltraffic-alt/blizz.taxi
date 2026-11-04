package taxi.blizz.operations.internal;

import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.operations.DriverRiskFlags;

/**
 * Drivers cancelling an order after accepting it (owner decision 03.11.2026, ADR 0018 part B, issue #487). Every
 * assignment a driver ends before the start is recorded once, counted or not and why not; a counted one may warn the
 * driver, pause their new orders, or raise a risk flag. Nothing here touches a trip in progress or an order the driver
 * holds: a pause only keeps new offers and claims away. Runs in the transaction of the cancellation, under a lock per
 * driver, so two cancellations of one driver are counted one after the other.
 */
@Component
class CancellationDiscipline {

    static final String PAUSE_REASON = "CANCELLATION_PAUSE";

    private final JdbcClient jdbc;
    private final OrderCore core;
    private final ServiceSettings settings;
    private final JdbcDriverRiskFlags flags;

    CancellationDiscipline(JdbcClient jdbc, OrderCore core, ServiceSettings settings, JdbcDriverRiskFlags flags) {
        this.jdbc = jdbc;
        this.core = core;
        this.settings = settings;
        this.flags = flags;
    }

    /** A pause in force: new offers and claims wait until {@code endsAt}. */
    record Pause(UUID id, UUID driverId, UUID cityId, int level, OffsetDateTime startsAt, OffsetDateTime endsAt) {
    }

    /**
     * The driver ended {@code assignmentId} of {@code orderId} before the start, for {@code reason}. Call before or
     * after ending the assignment, in the same transaction. A second call for the same assignment changes nothing.
     */
    void cancelled(UUID driverId, UUID orderId, UUID assignmentId, CancelReasons.Reason reason) {
        jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))").param("key", "driver-discipline:" + driverId)
                .query().singleRow();
        record Facts(UUID cityId, String timezone, OffsetDateTime acceptedAt) {
        }
        Facts facts = jdbc.sql("""
                        select o.city_id, c.timezone, a.created_at from assignment a
                        join ride_order o on o.id = a.order_id join city c on c.id = o.city_id
                        where a.id = :assignment""")
                .param("assignment", assignmentId)
                .query((rs, i) -> new Facts(rs.getObject(1, UUID.class), rs.getString(2),
                        rs.getObject(3, OffsetDateTime.class)))
                .single();
        ServiceSettings.DriverDiscipline rules = settings.ofCity(facts.cityId()).settings().driverDiscipline();
        OffsetDateTime now = core.now();
        String notCountedWhy = !rules.enabled() ? "OFF"
                : reason.notCounted() ? "REASON"
                : Duration.between(facts.acceptedAt(), now).toSeconds() < rules.graceSeconds() ? "GRACE"
                : null;
        UUID id = UUID.randomUUID();
        int inserted = jdbc.sql("""
                        insert into driver_cancellation (id, driver_id, city_id, order_id, assignment_id, reason_code,
                                                         counted, not_counted_why, accepted_at, cancelled_at)
                        values (:id, :driver, :city, :order, :assignment, :code, :counted, :why, :accepted, :now)
                        on conflict (assignment_id) do nothing""")
                .param("id", id).param("driver", driverId).param("city", facts.cityId()).param("order", orderId)
                .param("assignment", assignmentId).param("code", reason.code())
                .param("counted", notCountedWhy == null).param("why", notCountedWhy)
                .param("accepted", facts.acceptedAt()).param("now", now)
                .update();
        if (inserted == 0 || "OFF".equals(notCountedWhy)) {
            return;
        }
        if ("REASON".equals(notCountedWhy)) {
            flagUncounted(driverId, facts.cityId(), id, rules, now);
            return;
        }
        if (notCountedWhy != null) {
            return;
        }
        int lastDay = counted(driverId, now.minusHours(24));
        if (lastDay == rules.warnAfter()) {
            Map<String, Object> payload = new LinkedHashMap<>();
            payload.put("driver_id", driverId.toString());
            payload.put("cancellations", lastDay);
            payload.put("pause_after", rules.pauseAfter());
            core.recordEvent(orderId, core.touch(orderId), "DriverCancellationsWarning", OrderCore.system(), null,
                    payload);
        }
        if (lastDay >= rules.pauseAfter() && active(driverId).isEmpty()) {
            pause(driverId, orderId, facts.cityId(), ZoneId.of(facts.timezone()), lastDay, rules, now);
        }
        flagRate(driverId, facts.cityId(), id, rules, now);
    }

    /** The pause in force for the driver, if any. */
    Optional<Pause> active(UUID driverId) {
        return jdbc.sql("""
                        select id, driver_id, city_id, level, starts_at, ends_at from driver_pause
                        where driver_id = :driver and lifted_at is null and ends_at > :now
                        order by ends_at desc limit 1""")
                .param("driver", driverId).param("now", core.now())
                .query((rs, i) -> new Pause(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, UUID.class), rs.getInt(4), rs.getObject(5, OffsetDateTime.class),
                        rs.getObject(6, OffsetDateTime.class)))
                .optional();
    }

    private int counted(UUID driverId, OffsetDateTime since) {
        return jdbc.sql("""
                        select count(*) from driver_cancellation
                        where driver_id = :driver and counted and cancelled_at > :since""")
                .param("driver", driverId).param("since", since).query(Integer.class).single();
    }

    /**
     * B6, B7: the first pause within the escalation window lasts the first time, the second the second time, the
     * third and later until the end of the city's day — at least the second time, so a pause near midnight is not a
     * few minutes long — and raise a REPEATED_PAUSES flag.
     */
    private void pause(UUID driverId, UUID orderId, UUID cityId, ZoneId zone, int lastDay,
                       ServiceSettings.DriverDiscipline rules, OffsetDateTime now) {
        int before = jdbc.sql("""
                        select count(*) from driver_pause
                        where driver_id = :driver and kind = 'CANCELLATIONS' and starts_at > :since""")
                .param("driver", driverId).param("since", now.minusDays(rules.escalationDays()))
                .query(Integer.class).single();
        int level = before + 1;
        OffsetDateTime endsAt;
        if (level == 1) {
            endsAt = now.plusMinutes(rules.firstPauseMinutes());
        } else if (level == 2) {
            endsAt = now.plusMinutes(rules.secondPauseMinutes());
        } else {
            LocalDate today = now.atZoneSameInstant(zone).toLocalDate();
            OffsetDateTime endOfDay = today.plusDays(1).atStartOfDay(zone).toOffsetDateTime()
                    .withOffsetSameInstant(ZoneOffset.UTC);
            OffsetDateTime atLeast = now.plusMinutes(rules.secondPauseMinutes());
            endsAt = endOfDay.isAfter(atLeast) ? endOfDay : atLeast;
        }
        UUID pauseId = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver_pause (id, driver_id, city_id, kind, level, starts_at, ends_at)
                        values (:id, :driver, :city, 'CANCELLATIONS', :level, :now, :ends)""")
                .param("id", pauseId).param("driver", driverId).param("city", cityId).param("level", level)
                .param("now", now).param("ends", endsAt).update();
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("driver_id", driverId.toString());
        payload.put("pause_id", pauseId.toString());
        payload.put("level", level);
        payload.put("cancellations", lastDay);
        payload.put("ends_at", endsAt.toString());
        core.recordEvent(orderId, core.touch(orderId), "DriverPaused", OrderCore.system(), null, payload);
        if (level >= 3) {
            flags.raiseAutomatic(driverId, cityId, DriverRiskFlags.Kind.REPEATED_PAUSES,
                    Map.of("pause_id", pauseId.toString(), "level", level, "within_days", rules.escalationDays()),
                    "REPEATED_PAUSES:" + pauseId, now);
        }
    }

    /** B9: counted cancellations above the rate of the accepted orders of the last 30 days. */
    private void flagRate(UUID driverId, UUID cityId, UUID cancellationId, ServiceSettings.DriverDiscipline rules,
                          OffsetDateTime now) {
        OffsetDateTime since = now.minusDays(30);
        int accepted = jdbc.sql("select count(*) from assignment where driver_id = :driver and created_at > :since")
                .param("driver", driverId).param("since", since).query(Integer.class).single();
        int cancelled = counted(driverId, since);
        if (accepted < rules.rateFlagMinAccepted() || cancelled * 100L <= (long) rules.rateFlagPercent() * accepted
                || openFlag(driverId, DriverRiskFlags.Kind.DRIVER_CANCELLATIONS)) {
            return;
        }
        flags.raiseAutomatic(driverId, cityId, DriverRiskFlags.Kind.DRIVER_CANCELLATIONS,
                Map.of("accepted", accepted, "cancelled", cancelled, "days", 30, "percent", rules.rateFlagPercent()),
                "DRIVER_CANCELLATIONS:" + cancellationId, now);
    }

    /** B3: more uncounted cancellations by reason than allowed within the window. */
    private void flagUncounted(UUID driverId, UUID cityId, UUID cancellationId, ServiceSettings.DriverDiscipline rules,
                               OffsetDateTime now) {
        int uncounted = jdbc.sql("""
                        select count(*) from driver_cancellation
                        where driver_id = :driver and not_counted_why = 'REASON' and cancelled_at > :since""")
                .param("driver", driverId).param("since", now.minusDays(rules.uncountedFlagDays()))
                .query(Integer.class).single();
        if (uncounted <= rules.uncountedFlagAbove()
                || openFlag(driverId, DriverRiskFlags.Kind.UNCOUNTED_CANCELLATIONS)) {
            return;
        }
        flags.raiseAutomatic(driverId, cityId, DriverRiskFlags.Kind.UNCOUNTED_CANCELLATIONS,
                Map.of("uncounted", uncounted, "days", rules.uncountedFlagDays()),
                "UNCOUNTED_CANCELLATIONS:" + cancellationId, now);
    }

    private boolean openFlag(UUID driverId, DriverRiskFlags.Kind kind) {
        return jdbc.sql("select count(*) from driver_risk_flag where driver_id = :driver and kind = :kind and state = 'OPEN'")
                .param("driver", driverId).param("kind", kind.name()).query(Integer.class).single() > 0;
    }
}
