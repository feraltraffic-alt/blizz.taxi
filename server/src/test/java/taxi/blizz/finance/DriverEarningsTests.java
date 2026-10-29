package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** The driver's earnings screen (REQ-DRV-12) and local days across a clock change (T-40). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverEarningsTests {

    /** Longitude 105…106: no other test city is there. Kyiv time: summer time ends on 25.10.2026 at 04:00. */
    private static final String AREA = "SRID=4326;MULTIPOLYGON(((105 -40,106 -40,106 -39,105 -39,105 -40)))";

    @Autowired DriverEarnings earnings;
    @Autowired TransactionTemplate tx;
    @Autowired JdbcClient jdbc;

    private UUID city;
    private Actor driver;

    @BeforeEach
    void setUp() {
        city = jdbc.sql("select id from city where code = 'test-earnings'").query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, 'test-earnings', 'Earnings test', 'UAH', 'Europe/Kyiv',
                                            ST_GeomFromEWKT(:area), 7652, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("area", AREA).update();
                    return id;
                });
        driver = new Actor(SubjectType.DRIVER, UUID.randomUUID());
    }

    @Test
    void figuresPerLocalDayAcrossTheEndOfSummerTime() {
        UUID order = UUID.randomUUID();
        // 00:30 on 25.10 in Kyiv (summer time, UTC+3) — still the 24th in UTC.
        post("2026-10-24T21:30:00Z", "trip-fare:" + order, "TRIP_FARE", order,
                Line.debit(Account.RIDER_RECEIVABLE, UUID.randomUUID(), 10_000),
                Line.credit(Account.DRIVER_PAYABLE, driver.id(), 8_000),
                Line.credit(Account.SERVICE_COMMISSION, null, 2_000));
        post("2026-10-24T21:31:00Z", "trip-cash:" + order, "CASH_COLLECTED", order,
                Line.debit(Account.DRIVER_PAYABLE, driver.id(), 10_000),
                Line.credit(Account.RIDER_RECEIVABLE, UUID.randomUUID(), 10_000));
        // 23:30 on 25.10 in Kyiv (winter time, UTC+2): the 25-hour day still holds it.
        post("2026-10-25T21:30:00Z", "tip:" + UUID.randomUUID(), "TIP", order,
                Line.debit(Account.PROVIDER_CLEARING, null, 500),
                Line.credit(Account.DRIVER_PAYABLE, driver.id(), 500));
        UUID transfer = UUID.randomUUID();
        post("2026-10-25T21:40:00Z", "transfer:" + transfer, "DRIVER_TRANSFER", transfer,
                Line.debit(Account.DRIVER_PAYABLE, driver.id(), 300),
                Line.credit(Account.DRIVER_PAYABLE, UUID.randomUUID(), 300));
        // 00:30 on 26.10 in Kyiv — the next day.
        UUID card = UUID.randomUUID();
        post("2026-10-25T22:30:00Z", "trip-fare:" + card, "TRIP_FARE", card,
                Line.debit(Account.RIDER_RECEIVABLE, UUID.randomUUID(), 5_000),
                Line.credit(Account.DRIVER_PAYABLE, driver.id(), 4_000),
                Line.credit(Account.SERVICE_COMMISSION, null, 1_000));

        DriverEarnings.Earnings sunday = earnings.mine(driver, city, LocalDate.of(2026, 10, 25),
                LocalDate.of(2026, 10, 25));
        assertThat(sunday.timezone()).isEqualTo("Europe/Kyiv");
        assertThat(sunday.days()).extracting(DriverEarnings.Day::date).containsExactly(LocalDate.of(2026, 10, 25));
        DriverEarnings.Figures f = sunday.total();
        assertThat(f.trips()).isEqualTo(1);
        assertThat(f.fareMinor()).isEqualTo(10_000);
        assertThat(f.commissionMinor()).isEqualTo(2_000);
        assertThat(f.driverShareMinor()).isEqualTo(8_000);
        assertThat(f.cashMinor()).isEqualTo(10_000);
        assertThat(f.cashlessMinor()).isZero();
        assertThat(f.tipsMinor()).isEqualTo(500);
        assertThat(f.transfersOutMinor()).isEqualTo(300);
        assertThat(f.netMinor()).isEqualTo(8_000 - 10_000 + 500 - 300);

        DriverEarnings.Earnings twoDays = earnings.mine(driver, city, LocalDate.of(2026, 10, 25),
                LocalDate.of(2026, 10, 26));
        assertThat(twoDays.days()).extracting(DriverEarnings.Day::date)
                .containsExactly(LocalDate.of(2026, 10, 25), LocalDate.of(2026, 10, 26));
        assertThat(twoDays.days().get(1).figures().cashlessMinor()).isEqualTo(5_000);
        assertThat(twoDays.total().trips()).isEqualTo(2);
        assertThat(twoDays.balanceMinor()).isEqualTo(8_000 - 10_000 + 500 - 300 + 4_000);

        assertThat(earnings.mine(driver, city, LocalDate.of(2026, 10, 24), LocalDate.of(2026, 10, 24)).days())
                .as("nothing on the 24th of Kyiv, though two postings carry that UTC date").isEmpty();
    }

    /**
     * Audit 29.10.2026: a cash trip the driver reported not paid, with the whole share held in SUSPENSE, credited
     * nothing to the balance and was missing from the screen. It counts as a trip, with the share as held.
     */
    @Test
    void aCashTripWithTheWholeShareHeldStillCounts() {
        UUID order = UUID.randomUUID();
        post("2026-09-10T10:00:00Z", "trip-fare:" + order, "TRIP_FARE", order,
                Line.debit(Account.RIDER_RECEIVABLE, UUID.randomUUID(), 10_000),
                Line.credit(Account.SUSPENSE, driver.id(), 8_000),
                Line.credit(Account.SERVICE_COMMISSION, null, 2_000));

        DriverEarnings.Figures f = earnings.mine(driver, city, LocalDate.of(2026, 9, 10), LocalDate.of(2026, 9, 10))
                .total();
        assertThat(f.trips()).isEqualTo(1);
        assertThat(f.fareMinor()).isEqualTo(10_000);
        assertThat(f.commissionMinor()).isEqualTo(2_000);
        assertThat(f.driverShareMinor()).as("nothing credited yet").isZero();
        assertThat(f.heldMinor()).isEqualTo(8_000);
        assertThat(f.netMinor()).as("the balance did not change").isZero();
        assertThat(earnings.mine(new Actor(SubjectType.DRIVER, UUID.randomUUID()), city, LocalDate.of(2026, 9, 10),
                LocalDate.of(2026, 9, 10)).days()).as("another driver's held share is not mine").isEmpty();
    }

    @Test
    void periodsCitiesAndWhoMayAsk() {
        assertCode(() -> earnings.mine(driver, city, LocalDate.of(2026, 1, 1), LocalDate.of(2026, 4, 3)),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> earnings.mine(driver, city, LocalDate.of(2026, 2, 2), LocalDate.of(2026, 2, 1)),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> earnings.mine(driver, UUID.randomUUID(), LocalDate.of(2026, 2, 1), LocalDate.of(2026, 2, 1)),
                ErrorCode.NOT_FOUND);
        assertCode(() -> earnings.mine(new Actor(SubjectType.CLIENT, driver.id()), city, LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 2, 1)), ErrorCode.ACCESS_DENIED);

        UUID clerk = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Clerk', 'ADMIN', '{}', 'ACTIVE', now(), now())""")
                .param("id", clerk).param("login", "earnings-" + clerk).update();
        assertCode(() -> earnings.of(new Actor(SubjectType.STAFF, clerk), driver.id(), city, LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 2, 1)), ErrorCode.ACCESS_DENIED);
        UUID finance = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Finance', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", finance).param("login", "earnings-" + finance)
                .param("permissions", new String[]{DriverBalances.MANAGE_PERMISSION}).update();
        assertThat(earnings.of(new Actor(SubjectType.STAFF, finance), driver.id(), city, LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 2, 1)).total().netMinor()).isZero();
    }

    /** A balanced posting at a chosen moment, written as the ledger writes it (the journal is append-only). */
    private void post(String at, String key, String basis, UUID basisId, Line... lines) {
        UUID id = UUID.randomUUID();
        tx.executeWithoutResult(s -> {
            jdbc.sql("""
                            insert into journal_transaction (id, business_key, basis_type, basis_id, currency, reason,
                                                             occurred_at)
                            values (:id, :key, :basis, :basisId, 'UAH', 'Test', :at)""")
                    .param("id", id).param("key", key + ":" + driver.id()).param("basis", basis)
                    .param("basisId", basisId).param("at", OffsetDateTime.parse(at)).update();
            int no = 1;
            for (Line line : lines) {
                jdbc.sql("""
                                insert into journal_line (transaction_id, line_no, account, party_id, debit_minor,
                                                          credit_minor)
                                values (:tx, :no, :account, :party, :debit, :credit)""")
                        .param("tx", id).param("no", no++).param("account", line.account().name())
                        .param("party", line.partyId()).param("debit", line.debitMinor())
                        .param("credit", line.creditMinor()).update();
            }
        });
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
