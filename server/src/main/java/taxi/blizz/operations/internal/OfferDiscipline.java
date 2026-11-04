package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.operations.DriverRiskFlags;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;

/**
 * Declined and missed personal offers (owner decision 03.11.2026, ADR 0018 B12, issue #487), in the transaction that
 * closes the offer, under the same per-driver lock as {@link CancellationDiscipline}.
 * <ul>
 *   <li>B12.1: offers let expire in a row take the driver off line (the shift stops accepting, as if the driver had
 *       paused it); one tap on "On line" brings them back. Any answered offer starts the count again.</li>
 *   <li>B12.2: the share of personal offers accepted over the last 7 days, from a minimum number of offers: below the
 *       warning threshold a warning once in 24 hours, below the pause threshold a pause like one for cancellations;
 *       below it in each of the last two weeks a LOW_ACCEPTANCE flag.</li>
 *   <li>B12.3: offers with the pickup farther than the setting are not counted. The ALL tab is not an offer, so it
 *       never counts; a paused, busy or closing driver gets no offer, so nothing to count either.</li>
 * </ul>
 */
@Component
class OfferDiscipline {

    private final JdbcClient jdbc;
    private final OrderCore core;
    private final ServiceSettings settings;
    private final JdbcDriverRiskFlags flags;
    private final CancellationDiscipline pauses;
    private final Outbox outbox;

    OfferDiscipline(JdbcClient jdbc, OrderCore core, ServiceSettings settings, JdbcDriverRiskFlags flags,
                    CancellationDiscipline pauses, Outbox outbox) {
        this.jdbc = jdbc;
        this.core = core;
        this.settings = settings;
        this.flags = flags;
        this.pauses = pauses;
        this.outbox = outbox;
    }

    private record Facts(UUID cityId, String timezone, Integer distanceM) {
    }

    /** The driver accepted the offer: the missed count starts again. */
    void accepted(UUID driverId) {
        lock(driverId);
        streak(driverId, 0);
    }

    /** The driver declined the offer. */
    void declined(UUID driverId, UUID orderId, UUID offerId) {
        lock(driverId);
        streak(driverId, 0);
        Facts facts = facts(offerId);
        ServiceSettings.Settings all = settings.ofCity(facts.cityId()).settings();
        if (counts(facts, all.offerDiscipline())) {
            acceptance(driverId, orderId, facts, all);
        }
    }

    /** The offer's time ran out without an answer. */
    void expired(UUID driverId, UUID orderId, UUID offerId) {
        lock(driverId);
        Facts facts = facts(offerId);
        ServiceSettings.Settings all = settings.ofCity(facts.cityId()).settings();
        ServiceSettings.OfferDiscipline rules = all.offerDiscipline();
        if (!counts(facts, rules)) {
            return;
        }
        if (rules.missedEnabled()) {
            int missed = current(driverId) + 1;
            if (missed >= rules.missedInRow() + 1000 && offLine(driverId)) {
                streak(driverId, 0);
                Map<String, Object> payload = new LinkedHashMap<>();
                payload.put("driver_id", driverId.toString());
                payload.put("missed_in_row", missed);
                core.recordEvent(orderId, core.touch(orderId), "DriverOffersMissed", OrderCore.system(), null,
                        payload);
            } else {
                streak(driverId, missed);
            }
        }
        acceptance(driverId, orderId, facts, all);
    }

    private boolean counts(Facts facts, ServiceSettings.OfferDiscipline rules) {
        return facts.distanceM() == null || facts.distanceM() <= rules.farPickupMeters();
    }

    /** The open shift stops accepting; false when it was not accepting anyway. */
    private boolean offLine(UUID driverId) {
        record Session(UUID id, long version) {
        }
        Optional<Session> session = jdbc.sql("""
                        update work_session set intent = 'NOT_ACCEPTING', version = version + 1
                        where driver_id = :driver and state = 'OPEN' and intent = 'ACCEPTING'
                        returning id, version""")
                .param("driver", driverId)
                .query((rs, i) -> new Session(rs.getObject(1, UUID.class), rs.getLong(2)))
                .optional();
        session.ifPresent(s -> outbox.publish(new OutboxEvent("WorkSessionIntentChanged", 1, "WorkSession", s.id(),
                s.version(), new LinkedHashMap<>(Map.of("intent", "NOT_ACCEPTING")))));
        return session.isPresent();
    }

    /** B12.2 on the offers of the last 7 days, and of the 7 before them for the flag. */
    private void acceptance(UUID driverId, UUID orderId, Facts facts, ServiceSettings.Settings all) {
        ServiceSettings.OfferDiscipline rules = all.offerDiscipline();
        if (!rules.acceptanceEnabled()) {
            return;
        }
        OffsetDateTime now = core.now();
        Integer percent = percent(driverId, now.minusDays(7), now, rules);
        if (percent == null) {
            return;
        }
        if (percent < rules.acceptancePausePercent()) {
            if (pauses.active(driverId).isEmpty() && percent < 0) {
                pauses.pause("ACCEPTANCE", driverId, orderId, facts.cityId(), ZoneId.of(facts.timezone()), percent,
                        all.driverDiscipline(), now);
            }
            Integer before = percent(driverId, now.minusDays(14), now.minusDays(7), rules);
            if (before != null && before < rules.acceptancePausePercent() && !openFlag(driverId)) {
                flags.raiseAutomatic(driverId, facts.cityId(), DriverRiskFlags.Kind.LOW_ACCEPTANCE,
                        Map.of("percent", percent, "percent_week_before", before,
                                "pause_percent", rules.acceptancePausePercent()),
                        "LOW_ACCEPTANCE:" + driverId + ":" + now.toLocalDate(), now);
            }
        } else if (percent < rules.acceptanceWarnPercent()) {
            int warned = jdbc.sql("""
                            insert into driver_offer_streak (driver_id, acceptance_warned_at, updated_at)
                            values (:driver, :now, :now)
                            on conflict (driver_id) do update set acceptance_warned_at = :now, updated_at = :now
                            where driver_offer_streak.acceptance_warned_at is null
                               or driver_offer_streak.acceptance_warned_at <= :dayAgo""")
                    .param("driver", driverId).param("now", now).param("dayAgo", now.minusHours(24)).update();
            if (warned > 0) {
                Map<String, Object> payload = new LinkedHashMap<>();
                payload.put("driver_id", driverId.toString());
                payload.put("acceptance_percent", percent);
                payload.put("pause_percent", rules.acceptancePausePercent());
                core.recordEvent(orderId, core.touch(orderId), "DriverAcceptanceWarning", OrderCore.system(), null,
                        payload);
            }
        }
    }

    /** Accepted personal offers in per cent of the counted ones in the window, rounded down; null under the minimum. */
    private Integer percent(UUID driverId, OffsetDateTime from, OffsetDateTime to,
                            ServiceSettings.OfferDiscipline rules) {
        record Counts(int accepted, int total) {
        }
        Counts counts = jdbc.sql("""
                        select count(*) filter (where state = 'ACCEPTED'), count(*) from offer
                        where driver_id = :driver and created_at > :from and created_at <= :to
                          and state in ('ACCEPTED', 'REJECTED', 'EXPIRED')
                          and (distance_m is null or distance_m <= :far)""")
                .param("driver", driverId).param("from", from).param("to", to).param("far", rules.farPickupMeters())
                .query((rs, i) -> new Counts(rs.getInt(1), rs.getInt(2))).single();
        return counts.total() < rules.acceptanceMinOffers() ? null : counts.accepted() * 100 / counts.total();
    }

    private boolean openFlag(UUID driverId) {
        return jdbc.sql("""
                        select count(*) from driver_risk_flag
                        where driver_id = :driver and kind = 'LOW_ACCEPTANCE' and state = 'OPEN'""")
                .param("driver", driverId).query(Integer.class).single() > 0;
    }

    private Facts facts(UUID offerId) {
        return jdbc.sql("""
                        select o.city_id, c.timezone, f.distance_m from offer f
                        join ride_order o on o.id = f.order_id join city c on c.id = o.city_id
                        where f.id = :offer""")
                .param("offer", offerId)
                .query((rs, i) -> new Facts(rs.getObject(1, UUID.class), rs.getString(2),
                        (Integer) rs.getObject(3)))
                .single();
    }

    private int current(UUID driverId) {
        return jdbc.sql("select missed_in_row from driver_offer_streak where driver_id = :driver")
                .param("driver", driverId).query(Integer.class).optional().orElse(0);
    }

    private void streak(UUID driverId, int missed) {
        jdbc.sql("""
                        insert into driver_offer_streak (driver_id, missed_in_row, updated_at)
                        values (:driver, :missed, :now)
                        on conflict (driver_id) do update set missed_in_row = :missed, updated_at = :now""")
                .param("driver", driverId).param("missed", missed).param("now", core.now()).update();
    }

    private void lock(UUID driverId) {
        jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))").param("key", "driver-discipline:" + driverId)
                .query().singleRow();
    }
}
