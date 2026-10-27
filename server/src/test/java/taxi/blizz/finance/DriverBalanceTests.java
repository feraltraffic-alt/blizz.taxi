package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.DriverBalances.TopUpKind;
import taxi.blizz.finance.DriverBalances.TransferRule;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/** The driver's balance (ADR 0010): top-ups by staff, history and transfers between drivers with limits. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverBalanceTests {

    @Autowired
    DriverBalances balances;
    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    SessionService auth;
    @Autowired
    QuoteService quotes;
    @Autowired
    JdbcClient jdbc;

    TestRides rides;
    Actor finance;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        rides.city("test-driver-balances", "UAH", 4);
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Finance', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "balances-" + id)
                .param("permissions", new String[] {DriverBalances.MANAGE_PERMISSION}).update();
        finance = new Actor(SubjectType.STAFF, id);
    }

    private Actor driver() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", id).param("phone", phone(id)).update();
        return new Actor(SubjectType.DRIVER, id);
    }

    private static String phone(UUID id) {
        return "+38098" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000));
    }

    private long balance(Actor driver) {
        return balances.mine(driver, 1).balances().stream().filter(b -> b.currency().equals("UAH"))
                .mapToLong(DriverBalances.Balance::balanceMinor).sum();
    }

    private TransferRule rule(boolean enabled, long perTransfer, long perDay, long minAfter) {
        long version = balances.transferRules().stream().filter(r -> r.currency().equals("UAH"))
                .mapToLong(TransferRule::version).findFirst().orElse(0);
        return balances.setTransferRule(finance, UUID.randomUUID(),
                new TransferRule("UAH", enabled, perTransfer, perDay, minAfter, 0), version, "test");
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void staffTopUpsShowInTheHistoryWithTheirKind() {
        Actor driver = driver();
        balances.topUp(finance, UUID.randomUUID(), driver.id(), "UAH", 20_000, TopUpKind.DEPOSIT, "каса №2",
                "Готівка в офісі");
        balances.topUp(finance, UUID.randomUUID(), driver.id(), "UAH", 5_000, TopUpKind.BONUS, null,
                "Найкращий водій тижня");
        assertThat(balance(driver)).isEqualTo(25_000);
        assertThat(balances.of(finance, driver.id(), 10).entries())
                .extracting(DriverBalances.Entry::kind, DriverBalances.Entry::amountMinor)
                .containsExactly(org.assertj.core.groups.Tuple.tuple("BONUS", 5_000L),
                        org.assertj.core.groups.Tuple.tuple("DEPOSIT", 20_000L));
        assertCode(() -> balances.topUp(finance, UUID.randomUUID(), driver.id(), "UAH", 0, TopUpKind.BONUS, null,
                "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> balances.topUp(new Actor(SubjectType.STAFF, UUID.randomUUID()), UUID.randomUUID(),
                driver.id(), "UAH", 100, TopUpKind.BONUS, null, "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> balances.of(finance, UUID.randomUUID(), 10), ErrorCode.NOT_FOUND);
    }

    @Test
    void transfersRespectTheRulesAndShowOnBothSides() {
        Actor anna = driver();
        Actor bohdan = driver();
        balances.topUp(finance, UUID.randomUUID(), anna.id(), "UAH", 3_000, TopUpKind.DEPOSIT, null, "Готівка");

        rule(false, 1_000, 1_500, 0);
        assertCode(() -> balances.transfer(anna, UUID.randomUUID(), phone(bohdan.id()), "UAH", 500, null),
                ErrorCode.STATE_CONFLICT);
        rule(true, 1_000, 1_500, 0);

        DriverBalances.Transfer sent = balances.transfer(anna, UUID.randomUUID(), phone(bohdan.id()), "UAH", 1_000,
                "На пальне");
        assertThat(sent.toDriverId()).isEqualTo(bohdan.id());
        assertThat(balance(anna)).isEqualTo(2_000);
        assertThat(balance(bohdan)).isEqualTo(1_000);
        assertThat(balances.mine(anna, 5).entries().getFirst()).satisfies(e -> {
            assertThat(e.kind()).isEqualTo("TRANSFER_OUT");
            assertThat(e.counterpartId()).isEqualTo(bohdan.id());
            assertThat(e.reason()).isEqualTo("На пальне");
        });
        assertThat(balances.mine(bohdan, 5).entries().getFirst().kind()).isEqualTo("TRANSFER_IN");

        assertCode(() -> balances.transfer(anna, UUID.randomUUID(), phone(bohdan.id()), "UAH", 1_001, null),
                ErrorCode.VALIDATION_FAILED); // per transfer
        assertCode(() -> balances.transfer(anna, UUID.randomUUID(), phone(bohdan.id()), "UAH", 600, null),
                ErrorCode.VALIDATION_FAILED); // per day: 1000 + 600 > 1500
        rule(true, 1_000, 10_000, 1_800);
        assertCode(() -> balances.transfer(anna, UUID.randomUUID(), phone(bohdan.id()), "UAH", 500, null),
                ErrorCode.WALLET_INSUFFICIENT); // 2000 - 500 < 1800
        assertCode(() -> balances.transfer(anna, UUID.randomUUID(), phone(anna.id()), "UAH", 100, null),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> balances.transfer(anna, UUID.randomUUID(), "+380000000001", "UAH", 100, null),
                ErrorCode.NOT_FOUND);
        assertCode(() -> balances.setTransferRule(finance, UUID.randomUUID(),
                new TransferRule("UAH", true, 1, 1, 0, 0), 0, "stale"), ErrorCode.VERSION_CONFLICT);
        assertThat(balance(anna)).isEqualTo(2_000);
    }
}
