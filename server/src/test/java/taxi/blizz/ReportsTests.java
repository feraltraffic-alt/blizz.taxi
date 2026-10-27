package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.finance.FinanceReports;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.operations.OrderReports;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** The owner's reports per city and local day; Warsaw's summer time ends on 25.10.2026 at 03:00 (T-40). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ReportsTests {

    private static final LocalDate SUNDAY = LocalDate.of(2026, 10, 25);
    private static final LocalDate MONDAY = LocalDate.of(2026, 10, 26);

    @Autowired OrderReports orderReports;
    @Autowired FinanceReports financeReports;
    @Autowired TransactionTemplate tx;
    @Autowired JdbcClient jdbc;

    @Test
    void ordersAndMoneyPerLocalDayOfOneCityOnly() {
        UUID city = city("test-reports", 95);
        UUID other = city("test-reports-other", 98);
        UUID driver = UUID.randomUUID();
        UUID rider = UUID.randomUUID();
        // 00:30 on Sunday in Warsaw (UTC+2), cash, fulfilled.
        UUID cash = order(city, "2026-10-24T22:30:00Z", "APP", "CASH", "FULFILLED", null, null);
        post("2026-10-24T23:00:00Z", "TRIP_FARE", cash, debit("RIDER_RECEIVABLE", rider, 10_000),
                credit("DRIVER_PAYABLE", driver, 8_000), credit("SERVICE_COMMISSION", null, 2_000));
        post("2026-10-24T23:01:00Z", "CASH_COLLECTED", cash, debit("DRIVER_PAYABLE", driver, 10_000),
                credit("RIDER_RECEIVABLE", rider, 10_000));
        post("2026-10-24T23:02:00Z", "TIP", cash, debit("PROVIDER_CLEARING", null, 500),
                credit("DRIVER_PAYABLE", driver, 500));
        // 23:30 on Sunday in Warsaw (UTC+1 by then): a phone order the rider cancelled.
        order(city, "2026-10-25T22:30:00Z", "PHONE", "CARD", "CANCELLED", "RIDER", "CHANGED_MIND");
        // 00:30 on Monday: a card trip, the card paid only part of it.
        UUID card = order(city, "2026-10-25T23:30:00Z", "APP", "CARD", "FULFILLED", null, null);
        post("2026-10-25T23:40:00Z", "TRIP_FARE", card, debit("RIDER_RECEIVABLE", rider, 5_000),
                credit("DRIVER_PAYABLE", driver, 4_000), credit("SERVICE_COMMISSION", null, 1_000));
        post("2026-10-25T23:41:00Z", "CARD_PAYMENT", card, debit("PROVIDER_CLEARING", null, 4_000),
                credit("RIDER_RECEIVABLE", rider, 4_000));
        // Another city's order on Sunday: not in this city's reports.
        UUID elsewhere = order(other, "2026-10-25T10:00:00Z", "APP", "CASH", "FULFILLED", null, null);
        post("2026-10-25T10:30:00Z", "TRIP_FARE", elsewhere, debit("RIDER_RECEIVABLE", rider, 7_000),
                credit("DRIVER_PAYABLE", driver, 7_000));

        Actor owner = staff(new String[]{StaffPermissions.REPORTS_VIEW}, city);

        OrderReports.Report orders = orderReports.orders(owner, city, SUNDAY, SUNDAY);
        assertThat(orders.timezone()).isEqualTo("Europe/Warsaw");
        OrderReports.Counts sunday = orders.total();
        assertThat(sunday.created()).isEqualTo(2);
        assertThat(sunday.fulfilled()).isEqualTo(1);
        assertThat(sunday.cancelled()).isEqualTo(1);
        assertThat(sunday.byChannel()).isEqualTo(Map.of("APP", 1, "PHONE", 1));
        assertThat(sunday.byPayment()).isEqualTo(Map.of("CASH", 1, "CARD", 1));
        assertThat(sunday.cancelledBy()).isEqualTo(Map.of("RIDER", 1));
        assertThat(orders.cancellationReasons()).containsExactly(new OrderReports.Reason("RIDER", "CHANGED_MIND", 1));
        assertThat(orderReports.orders(owner, city, SUNDAY, MONDAY).days()).extracting(OrderReports.Day::date)
                .containsExactly(SUNDAY, MONDAY);

        FinanceReports.Figures money = financeReports.money(owner, city, SUNDAY, SUNDAY).total();
        assertThat(money.trips()).isEqualTo(1);
        assertThat(money.faresMinor()).isEqualTo(10_000);
        assertThat(money.commissionMinor()).isEqualTo(2_000);
        assertThat(money.driverShareMinor()).isEqualTo(8_000);
        assertThat(money.collectedByDriversMinor()).isEqualTo(10_000);
        assertThat(money.tipsMinor()).isEqualTo(500);
        assertThat(money.riderDebtChangeMinor()).isZero();
        FinanceReports.Figures both = financeReports.money(owner, city, SUNDAY, MONDAY).total();
        assertThat(both.trips()).isEqualTo(2);
        assertThat(both.faresMinor()).isEqualTo(15_000);
        assertThat(both.paidByCardMinor()).isEqualTo(4_000);
        assertThat(both.riderDebtChangeMinor()).as("the card paid 40 of 50").isEqualTo(1_000);
    }

    @Test
    void onlyStaffWithTheRightForTheCity() {
        UUID city = city("test-reports", 95);
        Actor clerk = staff(new String[0], city);
        Actor elsewhere = staff(new String[]{StaffPermissions.REPORTS_VIEW}, UUID.randomUUID());
        for (Actor actor : new Actor[]{clerk, elsewhere}) {
            assertCode(() -> orderReports.orders(actor, city, SUNDAY, SUNDAY), ErrorCode.ACCESS_DENIED);
            assertCode(() -> financeReports.money(actor, city, SUNDAY, SUNDAY), ErrorCode.ACCESS_DENIED);
        }
        Actor owner = staff(new String[]{StaffPermissions.REPORTS_VIEW}, city);
        assertCode(() -> orderReports.orders(owner, city, SUNDAY, SUNDAY.plusDays(92)), ErrorCode.VALIDATION_FAILED);
    }

    // ---------------------------------------------------------------- fixtures

    private UUID city(String code, int lon) {
        return jdbc.sql("select id from city where code = :code").param("code", code).query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, :code, :code, 'PLN', 'Europe/Warsaw', ST_GeomFromEWKT(:area),
                                            7653 + :lon, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("code", code).param("lon", lon)
                            .param("area", "SRID=4326;MULTIPOLYGON(((%1$d -40,%2$d -40,%2$d -39,%1$d -39,%1$d -40)))"
                                    .formatted(lon, lon + 1))
                            .update();
                    return id;
                });
    }

    private UUID order(UUID city, String createdAt, String channel, String payment, String status,
                       String cancelledBy, String reason) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into ride_order (id, channel, created_by_type, created_by_id, city_id, vehicle_class,
                            pickup, pickup_label, dropoff, dropoff_label, payment_method, status, cancelled_by,
                            cancel_reason_code, created_at, updated_at, version)
                        values (:id, :channel, 'STAFF', :creator, :city, 'STANDARD',
                            ST_SetSRID(ST_MakePoint(95.5, -39.5), 4326), 'A', ST_SetSRID(ST_MakePoint(95.6, -39.6), 4326),
                            'B', :payment, :status, :by, :reason, :created, :created, 1)""")
                .param("id", id).param("channel", channel).param("creator", UUID.randomUUID()).param("city", city)
                .param("payment", payment).param("status", status).param("by", cancelledBy).param("reason", reason)
                .param("created", OffsetDateTime.parse(createdAt)).update();
        return id;
    }

    private record Line(String account, UUID party, long debit, long credit) {
    }

    private static Line debit(String account, UUID party, long amount) {
        return new Line(account, party, amount, 0);
    }

    private static Line credit(String account, UUID party, long amount) {
        return new Line(account, party, 0, amount);
    }

    /** A balanced posting at a chosen moment (the journal is append-only, so it is written as it should stay). */
    private void post(String at, String basis, UUID basisId, Line... lines) {
        UUID id = UUID.randomUUID();
        tx.executeWithoutResult(s -> {
            jdbc.sql("""
                            insert into journal_transaction (id, business_key, basis_type, basis_id, currency, reason,
                                                             occurred_at)
                            values (:id, :key, :basis, :basisId, 'PLN', 'Test', :at)""")
                    .param("id", id).param("key", "report-test:" + id).param("basis", basis).param("basisId", basisId)
                    .param("at", OffsetDateTime.parse(at)).update();
            int no = 1;
            for (Line line : lines) {
                jdbc.sql("""
                                insert into journal_line (transaction_id, line_no, account, party_id, debit_minor,
                                                          credit_minor)
                                values (:tx, :no, :account, :party, :debit, :credit)""")
                        .param("tx", id).param("no", no++).param("account", line.account())
                        .param("party", line.party()).param("debit", line.debit()).param("credit", line.credit())
                        .update();
            }
        });
    }

    private Actor staff(String[] permissions, UUID city) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Reports', 'ADMIN', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "reports-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
