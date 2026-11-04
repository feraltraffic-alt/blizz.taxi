package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.Services;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.DriverRiskFlags;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/**
 * What the driver and staff see of ADR 0018 part B (issue #487, B10, B11): the driver their own counts — cancellations
 * in 24 hours and how many remain before a pause, the 30-day rate, the 7-day acceptance rate and a pause in force;
 * staff with {@code drivers.risk} the same of a driver with the cancellations of 30 days, and a report of the drivers of
 * a city with the highest cancellation rates.
 */
@RestController
class DriverDisciplineController {

    private final JdbcClient jdbc;
    private final OrderCore core;
    private final ServiceSettings settings;
    private final CancellationDiscipline pauses;
    private final StaffAccess staff;
    private final Services services;

    DriverDisciplineController(JdbcClient jdbc, OrderCore core, ServiceSettings settings,
                               CancellationDiscipline pauses, StaffAccess staff, Services services) {
        this.jdbc = jdbc;
        this.core = core;
        this.settings = settings;
        this.pauses = pauses;
        this.staff = staff;
        this.services = services;
    }

    /** {@code untilPause}: the counted cancellation that pauses is the {@code untilPause}-th from now (0: at it). */
    record Cancellations(boolean enabled, int last24h, int warnAfter, int pauseAfter, int untilPause, int accepted30d,
                         int cancelled30d, Integer rate30dPercent) {
    }

    /** {@code percent7d}: null while fewer than {@code minOffers} offers count. */
    record Acceptance(boolean enabled, int offers7d, int accepted7d, Integer percent7d, int minOffers,
                      int warnPercent, int pausePercent) {
    }

    record PauseNow(UUID id, String kind, int level, OffsetDateTime endsAt) {
    }

    record Discipline(Cancellations cancellations, Acceptance acceptance, PauseNow pause) {
    }

    record CancellationRow(UUID orderId, UUID cityId, String reasonCode, boolean counted, String notCountedWhy,
                           OffsetDateTime acceptedAt, OffsetDateTime cancelledAt) {
    }

    record DriverCard(UUID driverId, Cancellations cancellations, Acceptance acceptance, PauseNow pause,
                      List<CancellationRow> recent) {
    }

    record RateRow(UUID driverId, int accepted, int cancelled, int ratePercent) {
    }

    record RateReport(UUID cityId, int days, int minAccepted, OffsetDateTime generatedAt, List<RateRow> drivers) {
    }

    @GetMapping("/api/driver/v1/discipline")
    @Transactional(readOnly = true)
    Discipline mine(AccessClaims claims) {
        Actor driver = claims.actor();
        if (driver.type() != SubjectType.DRIVER) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only drivers can do this");
        }
        ServiceSettings.Settings rules = settings.of(driver).settings();
        return new Discipline(cancellations(driver.id(), rules), acceptance(driver.id(), rules), pause(driver.id()));
    }

    @GetMapping("/api/admin/v1/drivers/{driverId}/discipline")
    @Transactional(readOnly = true)
    DriverCard card(AccessClaims claims, @PathVariable UUID driverId) {
        Actor actor = claims.actor();
        StaffAccess.Scope scope = staff.scope(actor, DriverRiskFlags.RISK_PERMISSION);
        UUID service = services.of(actor).orElse(null);
        UUID driverService = jdbc.sql("select service_id from driver where id = :id").param("id", driverId)
                .query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Driver not found"));
        if ((!scope.allCities() && scope.cityIds().isEmpty()) || !driverService.equals(service)) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Missing permission " + DriverRiskFlags.RISK_PERMISSION);
        }
        ServiceSettings.Settings rules = settings.current(driverService).settings();
        List<CancellationRow> recent = jdbc.sql("""
                        select order_id, city_id, reason_code, counted, not_counted_why, accepted_at, cancelled_at
                        from driver_cancellation where driver_id = :driver and cancelled_at > :since
                          and (:all or city_id = any(cast(:cities as uuid[])))
                        order by cancelled_at desc limit 200""")
                .param("driver", driverId).param("since", core.now().minusDays(30))
                .param("all", scope.allCities()).param("cities", scope.cityIds().toArray(UUID[]::new))
                .query((rs, i) -> new CancellationRow(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getString(3), rs.getBoolean(4), rs.getString(5), rs.getObject(6, OffsetDateTime.class),
                        rs.getObject(7, OffsetDateTime.class)))
                .list();
        return new DriverCard(driverId, cancellations(driverId, rules), acceptance(driverId, rules), pause(driverId),
                recent);
    }

    /** B11: the drivers of the city with the highest rates of 30 days, from the settings' minimum of accepted orders. */
    @GetMapping("/api/admin/v1/reports/driver-cancellations")
    @Transactional(readOnly = true)
    RateReport report(AccessClaims claims, @RequestParam(name = "city_id") UUID cityId,
                      @RequestParam(required = false) Integer limit) {
        staff.require(claims.actor(), DriverRiskFlags.RISK_PERMISSION, cityId);
        ServiceSettings.DriverDiscipline rules = settings.ofCity(cityId).settings().driverDiscipline();
        int size = limit == null ? 50 : Math.max(1, Math.min(limit, 200));
        OffsetDateTime now = core.now();
        List<RateRow> rows = jdbc.sql("""
                        with accepted as (
                            select a.driver_id, count(*) as accepted from assignment a
                            join ride_order o on o.id = a.order_id
                            where o.city_id = :city and a.created_at > :since group by a.driver_id),
                        cancelled as (
                            select driver_id, count(*) as cancelled from driver_cancellation
                            where city_id = :city and counted and cancelled_at > :since group by driver_id)
                        select a.driver_id, a.accepted, coalesce(c.cancelled, 0) as cancelled,
                               (coalesce(c.cancelled, 0) * 100 / a.accepted) as rate
                        from accepted a left join cancelled c on c.driver_id = a.driver_id
                        where a.accepted >= :min and coalesce(c.cancelled, 0) > 0
                        order by rate desc, cancelled desc, a.driver_id limit :limit""")
                .param("city", cityId).param("since", now.minusDays(30)).param("min", rules.rateFlagMinAccepted())
                .param("limit", size)
                .query((rs, i) -> new RateRow(rs.getObject(1, UUID.class), rs.getInt(2), rs.getInt(3), rs.getInt(4)))
                .list();
        return new RateReport(cityId, 30, rules.rateFlagMinAccepted(), now, rows);
    }

    private Cancellations cancellations(UUID driverId, ServiceSettings.Settings all) {
        ServiceSettings.DriverDiscipline rules = all.driverDiscipline();
        OffsetDateTime now = core.now();
        int lastDay = count("""
                select count(*) from driver_cancellation
                where driver_id = :driver and counted and cancelled_at > :since""", driverId, now.minusHours(24));
        int accepted = count("select count(*) from assignment where driver_id = :driver and created_at > :since",
                driverId, now.minusDays(30));
        int cancelled = count("""
                select count(*) from driver_cancellation
                where driver_id = :driver and counted and cancelled_at > :since""", driverId, now.minusDays(30));
        return new Cancellations(rules.enabled(), lastDay, rules.warnAfter(), rules.pauseAfter(),
                Math.max(0, rules.pauseAfter() - lastDay), accepted, cancelled,
                accepted == 0 ? null : cancelled * 100 / accepted);
    }

    private Acceptance acceptance(UUID driverId, ServiceSettings.Settings all) {
        ServiceSettings.OfferDiscipline rules = all.offerDiscipline();
        record Counts(int accepted, int total) {
        }
        Counts counts = jdbc.sql("""
                        select count(*) filter (where state = 'ACCEPTED'), count(*) from offer
                        where driver_id = :driver and created_at > :since
                          and state in ('ACCEPTED', 'REJECTED', 'EXPIRED')
                          and (distance_m is null or distance_m <= :far)""")
                .param("driver", driverId).param("since", core.now().minusDays(7))
                .param("far", rules.farPickupMeters())
                .query((rs, i) -> new Counts(rs.getInt(1), rs.getInt(2))).single();
        return new Acceptance(rules.acceptanceEnabled(), counts.total(), counts.accepted(),
                counts.total() < rules.acceptanceMinOffers() ? null : counts.accepted() * 100 / counts.total(),
                rules.acceptanceMinOffers(), rules.acceptanceWarnPercent(), rules.acceptancePausePercent());
    }

    private PauseNow pause(UUID driverId) {
        return pauses.active(driverId).map(p -> new PauseNow(p.id(), p.kind(), p.level(), p.endsAt())).orElse(null);
    }

    private int count(String sql, UUID driverId, OffsetDateTime since) {
        return jdbc.sql(sql).param("driver", driverId).param("since", since).query(Integer.class).single();
    }
}
