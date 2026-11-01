package taxi.blizz.operations.internal;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityCatalog;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.operations.OrderReports;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** Orders per local day (T-40); see {@link OrderReports}. Also its admin endpoint (admin.v1.yaml). */
@Service
@RestController
class JdbcOrderReports implements OrderReports {

    static final int MAX_DAYS = 92;

    private final JdbcClient jdbc;
    private final CityCatalog cities;
    private final StaffAccess staff;

    JdbcOrderReports(JdbcClient jdbc, CityCatalog cities, StaffAccess staff) {
        this.jdbc = jdbc;
        this.cities = cities;
        this.staff = staff;
    }

    @GetMapping("/api/admin/v1/reports/orders")
    Report endpoint(AccessClaims claims, @RequestParam("city_id") UUID cityId,
                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return orders(claims.actor(), cityId, from, to);
    }

    private record Row(LocalDate day, String channel, String payment, String status, String cancelledBy,
                       String reason, int count) {
    }

    @Override
    @Transactional(readOnly = true)
    public Report orders(Actor actor, UUID cityId, LocalDate from, LocalDate to) {
        staff.require(actor, StaffPermissions.REPORTS_VIEW, cityId);
        City city = cities.published().stream().filter(c -> c.id().equals(cityId)).findFirst()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "City not found"));
        if (from == null || to == null || to.isBefore(from) || ChronoUnit.DAYS.between(from, to) >= MAX_DAYS) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    "A period of 1 to " + MAX_DAYS + " days, the last day included");
        }
        ZoneId zone = ZoneId.of(city.timezone());
        OffsetDateTime start = midnight(from, zone);
        OffsetDateTime end = midnight(to.plusDays(1), zone);
        List<Row> rows = jdbc.sql("""
                        select (created_at at time zone :zone)::date as day, channel, payment_method, status,
                               cancelled_by, cancel_reason_code, count(*) as n
                        from ride_order
                        where city_id = :city and created_at >= :start and created_at < :end
                        group by 1, 2, 3, 4, 5, 6""")
                .param("zone", city.timezone()).param("city", cityId).param("start", start).param("end", end)
                .query((rs, i) -> new Row(rs.getObject("day", LocalDate.class), rs.getString("channel"),
                        rs.getString("payment_method"), rs.getString("status"), rs.getString("cancelled_by"),
                        rs.getString("cancel_reason_code"), rs.getInt("n")))
                .list();
        Map<LocalDate, Tally> byDay = new TreeMap<>();
        Tally total = new Tally();
        Map<String, Integer> reasons = new TreeMap<>();
        for (Row row : rows) {
            byDay.computeIfAbsent(row.day(), d -> new Tally()).add(row);
            total.add(row);
            if (row.cancelledBy() != null) {
                reasons.merge(row.cancelledBy() + "|" + row.reason(), row.count(), Integer::sum);
            }
        }
        List<Day> days = new ArrayList<>();
        byDay.forEach((day, tally) -> days.add(new Day(day, midnight(day, zone), midnight(day.plusDays(1), zone),
                tally.counts())));
        List<Reason> top = reasons.entrySet().stream()
                .map(e -> new Reason(e.getKey().split("\\|", 2)[0], e.getKey().split("\\|", 2)[1], e.getValue()))
                .sorted(Comparator.comparingInt(Reason::count).reversed().thenComparing(Reason::code))
                .toList();
        return new Report(cityId, city.timezone(), from, to, start, end, days, total.counts(), top,
                OffsetDateTime.now(ZoneOffset.UTC));
    }

    /** The local midnight of a day in UTC: a DST day is 23 or 25 hours long (REQ-LED-09). */
    private static OffsetDateTime midnight(LocalDate day, ZoneId zone) {
        return day.atStartOfDay(zone).toOffsetDateTime().withOffsetSameInstant(ZoneOffset.UTC);
    }

    private static final class Tally {
        int created;
        int fulfilled;
        int cancelled;
        int unfulfilled;
        int open;
        final Map<String, Integer> byChannel = new TreeMap<>();
        final Map<String, Integer> byPayment = new TreeMap<>();
        final Map<String, Integer> cancelledBy = new TreeMap<>();

        void add(Row row) {
            created += row.count();
            switch (row.status()) {
                case "FULFILLED" -> fulfilled += row.count();
                case "CANCELLED" -> cancelled += row.count();
                case "UNFULFILLED" -> unfulfilled += row.count();
                default -> open += row.count();
            }
            byChannel.merge(row.channel(), row.count(), Integer::sum);
            byPayment.merge(row.payment(), row.count(), Integer::sum);
            if (row.cancelledBy() != null) {
                cancelledBy.merge(row.cancelledBy(), row.count(), Integer::sum);
            }
        }

        Counts counts() {
            return new Counts(created, fulfilled, cancelled, unfulfilled, open, Map.copyOf(byChannel),
                    Map.copyOf(byPayment), Map.copyOf(cancelledBy));
        }
    }
}
