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

/** The rider's virtual account, part A of ADR 0009: history, balance and top-ups by staff. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class RiderWalletTests {

    @Autowired
    RiderWallets wallets;
    @Autowired
    Ledger ledger;
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
    Actor admin;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        rides.city("test-rider-wallets", "UAH", 0);
        admin = staff(RiderWallets.MANAGE_PERMISSION);
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Wallets', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "wallets-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void staffTopUpAppearsInTheBalanceTheHistoryAndTheJournalOnce() {
        Actor rider = rides.client();
        UUID command = UUID.randomUUID();
        RiderWallets.Wallet after = wallets.topUp(admin, command, rider.id(), "UAH", 15_000, "Компенсація за затримку");
        wallets.topUp(admin, command, rider.id(), "UAH", 15_000, "Компенсація за затримку"); // a repeat

        assertThat(after.balances()).containsExactly(new RiderWallets.Balance("UAH", 15_000));
        RiderWallets.Wallet mine = wallets.mine(rider, 10);
        assertThat(mine.balances()).containsExactly(new RiderWallets.Balance("UAH", 15_000));
        assertThat(mine.entries()).singleElement().satisfies(e -> {
            assertThat(e.kind()).isEqualTo("STAFF_TOP_UP");
            assertThat(e.amountMinor()).isEqualTo(15_000);
            assertThat(e.staffId()).isEqualTo(admin.id());
            assertThat(e.reason()).isEqualTo("Компенсація за затримку");
        });
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'wallet.topUp' and resource_id = :id""")
                .param("id", rider.id().toString()).query(Long.class).single()).isEqualTo(1);
        assertCode(() -> wallets.topUp(admin, command, rider.id(), "UAH", 20_000, "Компенсація за затримку"),
                ErrorCode.IDEMPOTENCY_CONFLICT);

        wallets.topUp(admin, UUID.randomUUID(), rider.id(), "UAH", 500, "Акція до дня міста");
        assertThat(wallets.of(admin, rider.id(), 10).entries()).extracting(RiderWallets.Entry::amountMinor)
                .containsExactly(500L, 15_000L);
        assertThat(ledger.balances(Ledger.Account.RIDER_WALLET, rider.id())).singleElement()
                .satisfies(b -> assertThat(b.creditMinor() - b.debitMinor()).isEqualTo(15_500));
    }

    @Test
    void theRightsTheRiderAndTheInputAreChecked() {
        Actor rider = rides.client();
        String phone = jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
        assertThat(wallets.clientByPhone(admin, phone)).isEqualTo(rider.id());
        assertCode(() -> wallets.clientByPhone(admin, "+380000000000"), ErrorCode.NOT_FOUND);
        assertCode(() -> wallets.clientByPhone(admin, "call me"), ErrorCode.VALIDATION_FAILED);

        Actor clerk = staff("orders.view");
        assertCode(() -> wallets.of(clerk, rider.id(), 10), ErrorCode.ACCESS_DENIED);
        assertCode(() -> wallets.topUp(clerk, UUID.randomUUID(), rider.id(), "UAH", 100, "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> wallets.topUp(admin, UUID.randomUUID(), rider.id(), "XYZ", 100, "x"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> wallets.topUp(admin, UUID.randomUUID(), rider.id(), "UAH", 0, "x"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> wallets.topUp(admin, UUID.randomUUID(), rider.id(), "UAH", 100, " "),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> wallets.topUp(admin, UUID.randomUUID(), UUID.randomUUID(), "UAH", 100, "x"),
                ErrorCode.NOT_FOUND);
        assertCode(() -> wallets.mine(admin, 10), ErrorCode.ACCESS_DENIED);
        assertThat(wallets.mine(rider, 10).balances()).isEmpty();
    }
}
