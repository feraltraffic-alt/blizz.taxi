package taxi.blizz.finance.internal;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
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
import taxi.blizz.finance.FinanceReports;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityCatalog;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * Money of a city's orders per local day (T-40); see {@link FinanceReports}. The journal knows the order, not the
 * city: the city comes from {@code ride_order.city_id}, a read ADR 0004 lists. Also its admin endpoint.
 */
@Service
@RestController
class JdbcFinanceReports implements FinanceReports {

    static final int MAX_DAYS = 92;
    /** Postings whose basis is an order. */
    private static final List<String> ORDER_BASES = List.of("TRIP_FARE", "CASH_COLLECTED", "TERMINAL_COLLECTED",
            "CARD_PAYMENT", "PROMOTION_DISCOUNT", "PROMOTION", "TIP", "TRIP_PAYMENT",
            // They change the rider's debt for an order too (audit 29.10.2026).
            "CHARGEBACK", "CASH_DISPUTE");

    private final JdbcClient jdbc;
    private final CityCatalog cities;
    private final StaffAccess staff;

    JdbcFinanceReports(JdbcClient jdbc, CityCatalog cities, StaffAccess staff) {
        this.jdbc = jdbc;
        this.cities = cities;
        this.staff = staff;
    }

    @GetMapping("/api/admin/v1/reports/finance")
    Report endpoint(AccessClaims claims, @RequestParam("city_id") UUID cityId,
                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return money(claims.actor(), cityId, from, to);
    }

    private record Row(LocalDate day, String basis, String account, long debit, long credit, int transactions) {
    }

    @Override
    @Transactional(readOnly = true)
    public Report money(Actor actor, UUID cityId, LocalDate from, LocalDate to) {
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
                        select (t.occurred_at at time zone :zone)::date as day, t.basis_type, l.account,
                               sum(l.debit_minor) as debit, sum(l.credit_minor) as credit,
                               count(distinct t.id) as transactions
                        from journal_transaction t
                        join journal_line l on l.transaction_id = t.id
                        join ride_order o on o.id = t.basis_id
                        where t.basis_type in (:bases) and o.city_id = :city and t.currency = :currency
                          and t.occurred_at >= :start and t.occurred_at < :end
                        group by 1, 2, 3""")
                .param("zone", city.timezone()).param("bases", ORDER_BASES).param("city", cityId)
                .param("currency", city.currency()).param("start", start).param("end", end)
                .query((rs, i) -> new Row(rs.getObject("day", LocalDate.class), rs.getString("basis_type"),
                        rs.getString("account"), rs.getLong("debit"), rs.getLong("credit"),
                        rs.getInt("transactions")))
                .list();
        Map<LocalDate, Sums> byDay = new TreeMap<>();
        Sums total = new Sums();
        for (Row row : rows) {
            byDay.computeIfAbsent(row.day(), d -> new Sums()).add(row);
            total.add(row);
        }
        List<Day> days = new ArrayList<>();
        byDay.forEach((day, sums) -> days.add(new Day(day, midnight(day, zone), midnight(day.plusDays(1), zone),
                sums.figures())));
        return new Report(cityId, city.currency(), city.timezone(), from, to, start, end, days, total.figures(),
                OffsetDateTime.now(ZoneOffset.UTC));
    }

    /** The local midnight of a day in UTC: a DST day is 23 or 25 hours long (REQ-LED-09). */
    private static OffsetDateTime midnight(LocalDate day, ZoneId zone) {
        return day.atStartOfDay(zone).toOffsetDateTime().withOffsetSameInstant(ZoneOffset.UTC);
    }

    private static final class Sums {
        int trips;
        long fares;
        long serviceRides;
        long commission;
        long driverShare;
        long discounts;
        long bonusesGranted;
        long paidByCard;
        long paidWithBonuses;
        long collectedByDrivers;
        long tips;
        long riderDebtChange;

        void add(Row r) {
            if ("RIDER_RECEIVABLE".equals(r.account())) {
                riderDebtChange += r.debit() - r.credit();
            }
            switch (r.basis() + "/" + r.account()) {
                case "TRIP_FARE/RIDER_RECEIVABLE" -> {
                    fares += r.debit();
                    trips += r.transactions();
                }
                case "TRIP_FARE/SERVICE_EXPENSE" -> {
                    fares += r.debit();
                    serviceRides += r.debit();
                    trips += r.transactions();
                }
                case "TRIP_FARE/SERVICE_COMMISSION" -> commission += r.credit();
                case "TRIP_FARE/DRIVER_PAYABLE" -> driverShare += r.credit();
                case "PROMOTION_DISCOUNT/PROMO_EXPENSE" -> discounts += r.debit();
                case "PROMOTION/PROMO_EXPENSE" -> bonusesGranted += r.debit();
                case "CARD_PAYMENT/PROVIDER_CLEARING" -> paidByCard += r.debit();
                case "TRIP_PAYMENT/RIDER_WALLET" -> paidWithBonuses += r.debit();
                case "CASH_COLLECTED/DRIVER_PAYABLE", "TERMINAL_COLLECTED/DRIVER_PAYABLE" ->
                        collectedByDrivers += r.debit();
                case "TIP/DRIVER_PAYABLE" -> tips += r.credit();
                default -> {
                    // the other side of a posting counted above
                }
            }
        }

        Figures figures() {
            return new Figures(trips, fares, serviceRides, commission, driverShare, discounts, bonusesGranted,
                    paidByCard, paidWithBonuses, collectedByDrivers, tips, riderDebtChange);
        }
    }
}
