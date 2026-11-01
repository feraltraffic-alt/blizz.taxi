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
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.finance.DriverBalances;
import taxi.blizz.finance.DriverEarnings;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityCatalog;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** Earnings per local day from the journal (REQ-DRV-12, T-40); see {@link DriverEarnings}. */
@Service
class JdbcDriverEarnings implements DriverEarnings {

    static final int MAX_DAYS = 92;

    private final JdbcClient jdbc;
    private final Ledger ledger;
    private final CityCatalog cities;
    private final StaffAccess staff;

    JdbcDriverEarnings(JdbcClient jdbc, Ledger ledger, CityCatalog cities, StaffAccess staff) {
        this.jdbc = jdbc;
        this.ledger = ledger;
        this.cities = cities;
        this.staff = staff;
    }

    @Override
    @Transactional(readOnly = true)
    public Earnings mine(Actor driver, UUID cityId, LocalDate from, LocalDate to) {
        if (driver == null || driver.type() != SubjectType.DRIVER) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Drivers only");
        }
        return earnings(driver.id(), cityId, from, to);
    }

    @Override
    @Transactional(readOnly = true)
    public Earnings of(Actor actor, UUID driverId, UUID cityId, LocalDate from, LocalDate to) {
        staff.require(actor, DriverBalances.MANAGE_PERMISSION);
        return earnings(driverId, cityId, from, to);
    }

    /** One journal transaction as the driver sees it. */
    private record Row(LocalDate day, String basis, String topUpKind, long net, long fare, long commission,
                       long held) {
    }

    private Earnings earnings(UUID driverId, UUID cityId, LocalDate from, LocalDate to) {
        City city = cities.published().stream().filter(c -> c.id().equals(cityId)).findFirst()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "City not found"));
        if (from == null || to == null || to.isBefore(from) || ChronoUnit.DAYS.between(from, to) >= MAX_DAYS) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    "A period of 1 to " + MAX_DAYS + " days, the last day included");
        }
        ZoneId zone = ZoneId.of(city.timezone());
        // Local midnights in UTC: a day of 23 or 25 hours around a clock change stays one day.
        OffsetDateTime start = from.atStartOfDay(zone).toOffsetDateTime().withOffsetSameInstant(ZoneOffset.UTC);
        OffsetDateTime end = to.plusDays(1).atStartOfDay(zone).toOffsetDateTime().withOffsetSameInstant(ZoneOffset.UTC);
        List<Row> rows = jdbc.sql("""
                        select (t.occurred_at at time zone :zone)::date as day, t.basis_type, u.kind as top_up_kind,
                               sum(case when l.account = 'DRIVER_PAYABLE' and l.party_id = :driver
                                        then l.credit_minor - l.debit_minor else 0 end) as net,
                               sum(case when t.basis_type = 'TRIP_FARE'
                                         and l.account in ('RIDER_RECEIVABLE', 'SERVICE_EXPENSE')
                                        then l.debit_minor else 0 end) as fare,
                               sum(case when t.basis_type = 'TRIP_FARE' and l.account = 'SERVICE_COMMISSION'
                                        then l.credit_minor else 0 end) as commission,
                               sum(case when t.basis_type = 'TRIP_FARE' and l.account = 'SUSPENSE'
                                         and l.party_id = :driver
                                        then l.credit_minor - l.debit_minor else 0 end) as held
                        from journal_transaction t
                        join journal_line l on l.transaction_id = t.id
                        left join driver_balance_top_up u on t.basis_type = 'DRIVER_TOP_UP' and u.id = t.basis_id
                        where t.currency = :currency and t.occurred_at >= :start and t.occurred_at < :end
                          and exists (select 1 from journal_line d where d.transaction_id = t.id and d.party_id = :driver
                                      and (d.account = 'DRIVER_PAYABLE'
                                           or (d.account = 'SUSPENSE' and t.basis_type = 'TRIP_FARE')))
                        group by t.id, t.occurred_at, t.basis_type, u.kind""")
                .param("zone", city.timezone()).param("driver", driverId).param("currency", city.currency())
                .param("start", start).param("end", end)
                .query((rs, i) -> new Row(rs.getObject("day", LocalDate.class), rs.getString("basis_type"),
                        rs.getString("top_up_kind"), rs.getLong("net"), rs.getLong("fare"), rs.getLong("commission"),
                        rs.getLong("held")))
                .list();
        Map<LocalDate, Totals> byDay = new TreeMap<>();
        Totals total = new Totals();
        for (Row row : rows) {
            byDay.computeIfAbsent(row.day(), d -> new Totals()).add(row);
            total.add(row);
        }
        List<Day> days = new ArrayList<>();
        byDay.forEach((day, totals) -> days.add(new Day(day, totals.figures())));
        long balance = ledger.balances(Account.DRIVER_PAYABLE, driverId).stream()
                .filter(b -> b.currency().equals(city.currency()))
                .mapToLong(b -> b.creditMinor() - b.debitMinor()).sum();
        return new Earnings(driverId, city.id(), city.currency(), city.timezone(), from, to, days, total.figures(),
                balance, new taxi.blizz.finance.FareAccounting.Pending(0, 0));
    }

    /** Sums one way for a day and for the period. */
    private static final class Totals {
        int trips;
        long fare;
        long commission;
        long driverShare;
        long held;
        long cash;
        long tips;
        long bonuses;
        long topUps;
        long transfersIn;
        long transfersOut;
        long adjustments;
        long net;

        void add(Row row) {
            net += row.net();
            switch (row.basis()) {
                case "TRIP_FARE" -> {
                    trips++;
                    fare += row.fare();
                    commission += row.commission();
                    driverShare += row.net();
                    held += row.held();
                }
                case "CASH_COLLECTED", "TERMINAL_COLLECTED" -> cash -= row.net();
                case "TIP" -> tips += row.net();
                case "DRIVER_PROMOTION" -> bonuses += row.net();
                case "DRIVER_TOP_UP" -> {
                    if ("BONUS".equals(row.topUpKind())) {
                        bonuses += row.net();
                    } else {
                        topUps += row.net();
                    }
                }
                case "DRIVER_CARD_TOP_UP", "DRIVER_PAYMENT" -> topUps += row.net();
                case "DRIVER_TRANSFER" -> {
                    if (row.net() >= 0) {
                        transfersIn += row.net();
                    } else {
                        transfersOut -= row.net();
                    }
                }
                default -> adjustments += row.net();
            }
        }

        Figures figures() {
            return new Figures(trips, fare, commission, driverShare, held, cash, fare - cash, tips, bonuses, topUps,
                    transfersIn, transfersOut, adjustments, net);
        }
    }
}
