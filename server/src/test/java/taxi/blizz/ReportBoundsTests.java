package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.backoffice.ReportExports;
import taxi.blizz.finance.FinanceReports;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.operations.OrderReports;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/**
 * Issue #140 E5, REQ-LED-09: reports and exports carry the UTC bounds of the local days they cover. In Europe/Kyiv
 * summer time starts on 29.03.2026 at 03:00 (a day of 23 hours) and ends on 25.10.2026 at 04:00 (25 hours, the hour
 * from 03:00 to 04:00 comes twice); in 2027 on 28.03 and 31.10. Each test has its own days in one city at longitude
 * 13.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ReportBoundsTests {

    private static final LocalDate SPRING = LocalDate.of(2026, 3, 29);
    private static final LocalDate AUTUMN = LocalDate.of(2026, 10, 25);
    private static final LocalDate SPRING_2027 = LocalDate.of(2027, 3, 28);
    private static final LocalDate AUTUMN_2027 = LocalDate.of(2027, 10, 31);

    @Autowired OrderReports orderReports;
    @Autowired FinanceReports financeReports;
    @Autowired ReportExports exports;
    @Autowired JdbcClient jdbc;
    @Autowired TransactionTemplate tx;

    @Test
    void theDaysOfTheChangeHave23And25Hours() {
        UUID city = city();
        order(city, "2026-03-29T10:00:00Z");
        Actor owner = staff(city);

        OrderReports.Report spring = orderReports.orders(owner, city, SPRING, SPRING);
        assertThat(spring.timezone()).isEqualTo("Europe/Kyiv");
        assertThat(spring.fromUtc()).isEqualTo(utc("2026-03-28T22:00:00Z"));
        assertThat(spring.toUtc()).isEqualTo(utc("2026-03-29T21:00:00Z"));
        assertThat(spring.days()).singleElement().satisfies(d -> {
            assertThat(d.date()).isEqualTo(SPRING);
            assertThat(Duration.between(d.fromUtc(), d.toUtc())).isEqualTo(Duration.ofHours(23));
            assertThat(d.fromUtc()).isEqualTo(spring.fromUtc());
        });

        FinanceReports.Report autumn = financeReports.money(owner, city, AUTUMN, AUTUMN);
        assertThat(autumn.fromUtc()).isEqualTo(utc("2026-10-24T21:00:00Z"));
        assertThat(autumn.toUtc()).isEqualTo(utc("2026-10-25T22:00:00Z"));
        assertThat(Duration.between(autumn.fromUtc(), autumn.toUtc())).isEqualTo(Duration.ofHours(25));
    }

    @Test
    void aTripAtHalfPastThreeOnTheAutumnDayIsCountedOnceOnThatDay() {
        UUID city = city();
        UUID driver = UUID.randomUUID();
        // 03:30 local twice: first in summer time (UTC+3), then an hour later in winter time (UTC+2).
        for (String at : new String[]{"2026-10-25T00:30:00Z", "2026-10-25T01:30:00Z"}) {
            UUID trip = order(city, at);
            fare(trip, at, driver, 10_000);
        }
        Actor owner = staff(city);

        OrderReports.Report orders = orderReports.orders(owner, city, AUTUMN.minusDays(1), AUTUMN.plusDays(1));
        assertThat(orders.fromUtc()).isEqualTo(utc("2026-10-23T21:00:00Z"));
        assertThat(orders.toUtc()).isEqualTo(utc("2026-10-26T22:00:00Z"));
        assertThat(orders.days()).singleElement().satisfies(d -> {
            assertThat(d.date()).isEqualTo(AUTUMN);
            assertThat(d.counts().created()).isEqualTo(2);
            assertThat(d.fromUtc()).isEqualTo(utc("2026-10-24T21:00:00Z"));
            assertThat(d.toUtc()).isEqualTo(utc("2026-10-25T22:00:00Z"));
        });
        assertThat(orders.total().created()).isEqualTo(2);

        FinanceReports.Report money = financeReports.money(owner, city, AUTUMN.minusDays(1), AUTUMN.plusDays(1));
        assertThat(money.days()).singleElement().satisfies(d -> {
            assertThat(d.date()).isEqualTo(AUTUMN);
            assertThat(d.figures().trips()).isEqualTo(2);
            assertThat(Duration.between(d.fromUtc(), d.toUtc())).isEqualTo(Duration.ofHours(25));
        });
        assertThat(money.total().faresMinor()).isEqualTo(20_000);
    }

    @Test
    void anExportStoresTheZoneAndBoundsAndEveryRowCarriesItsOwn() {
        UUID city = city();
        order(city, "2027-10-31T00:30:00Z");
        Actor owner = staff(city);
        ReportExports.Export asked = exports.request(owner, UUID.randomUUID(), ReportExports.Kind.ORDERS, city,
                AUTUMN_2027, AUTUMN_2027.plusDays(1));
        assertThat(asked.timezone()).isEqualTo("Europe/Kyiv");
        assertThat(asked.fromUtc()).isEqualTo(utc("2027-10-30T21:00:00Z"));
        assertThat(asked.toUtc()).isEqualTo(utc("2027-11-01T22:00:00Z"));
        assertThat(jdbc.sql("select timezone from report_export where id = :id").param("id", asked.id())
                .query(String.class).single()).as("stored, not computed on the way out").isEqualTo("Europe/Kyiv");

        exports.buildPending(50);
        ReportExports.Export ready = exports.get(owner, asked.id());
        assertThat(ready.state()).isEqualTo("READY");
        assertThat(ready.fromUtc()).isEqualTo(asked.fromUtc());
        assertThat(ready.toUtc()).isEqualTo(asked.toUtc());
        String csv = new String(exports.download(owner, asked.id()).content(), StandardCharsets.UTF_8);
        assertThat(csv).startsWith("\uFEFFdate,from_utc,to_utc,created,");
        assertThat(csv).contains("\r\n2027-10-31,2027-10-30T21:00:00Z,2027-10-31T22:00:00Z,1,")
                .contains("\r\ntotal,2027-10-30T21:00:00Z,2027-11-01T22:00:00Z,1,");

        ReportExports.Export finance = exports.request(owner, UUID.randomUUID(), ReportExports.Kind.FINANCE, city,
                SPRING_2027, SPRING_2027);
        exports.buildPending(50);
        assertThat(new String(exports.download(owner, finance.id()).content(), StandardCharsets.UTF_8))
                .startsWith("\uFEFFdate,from_utc,to_utc,currency,")
                .contains("\r\ntotal,2027-03-27T22:00:00Z,2027-03-28T21:00:00Z,UAH,");
    }

    // ---------------------------------------------------------------- fixtures

    private UUID city() {
        String code = "test-report-bounds";
        return jdbc.sql("select id from city where code = :code").param("code", code).query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, :code, :code, 'UAH', 'Europe/Kyiv',
                                            ST_GeomFromEWKT(:area), 7666, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("code", code)
                            .param("area", "SRID=4326;MULTIPOLYGON(((13 -40,14 -40,14 -39,13 -39,13 -40)))")
                            .update();
                    return id;
                });
    }

    private UUID order(UUID city, String createdAt) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into ride_order (id, channel, created_by_type, created_by_id, city_id, vehicle_class,
                            pickup, pickup_label, dropoff, dropoff_label, payment_method, status, created_at,
                            updated_at, version)
                        values (:id, 'APP', 'STAFF', :creator, :city, 'STANDARD',
                            ST_SetSRID(ST_MakePoint(13.5, -39.5), 4326), 'A',
                            ST_SetSRID(ST_MakePoint(13.6, -39.6), 4326), 'B', 'CASH', 'FULFILLED',
                            cast(:created as timestamptz), cast(:created as timestamptz), 1)""")
                .param("id", id).param("creator", UUID.randomUUID()).param("city", city)
                .param("created", createdAt).update();
        return id;
    }

    /** A balanced trip fare at the moment of the order (the journal is append-only and checked at the commit). */
    private void fare(UUID order, String at, UUID driver, long amount) {
        UUID id = UUID.randomUUID();
        tx.executeWithoutResult(s -> {
            jdbc.sql("""
                            insert into journal_transaction (id, business_key, basis_type, basis_id, currency, reason,
                                                             occurred_at)
                            values (:id, :key, 'TRIP_FARE', :order, 'UAH', 'Test', cast(:at as timestamptz))""")
                    .param("id", id).param("key", "report-bounds:" + id).param("order", order).param("at", at)
                    .update();
            jdbc.sql("""
                            insert into journal_line (transaction_id, line_no, account, party_id, debit_minor,
                                                      credit_minor)
                            values (:tx, 1, 'RIDER_RECEIVABLE', :rider, :amount, 0),
                                   (:tx, 2, 'DRIVER_PAYABLE', :driver, 0, :amount)""")
                    .param("tx", id).param("rider", UUID.randomUUID()).param("driver", driver).param("amount", amount)
                    .update();
        });
    }

    private Actor staff(UUID city) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Bounds', 'ADMIN', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "bounds-" + id)
                .param("permissions", new String[]{StaffPermissions.REPORTS_VIEW})
                .param("scope", new UUID[]{city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static OffsetDateTime utc(String at) {
        return OffsetDateTime.parse(at);
    }
}
