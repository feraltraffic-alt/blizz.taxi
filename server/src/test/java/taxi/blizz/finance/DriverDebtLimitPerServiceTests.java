package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.UUID;
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
import taxi.blizz.platform.SubjectType;

/**
 * ADR 0016, issue #215: each taxi service sets its own driver debt limit; a driver is held to the limit of their
 * own service, and a change in one service leaves another's drivers as they were.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverDebtLimitPerServiceTests {

    @Autowired DriverDebts debts;
    @Autowired Ledger ledger;
    @Autowired JdbcClient jdbc;
    @Autowired TransactionTemplate tx;

    private UUID service(String prefix) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, :code, now(), now())""")
                .param("id", id).param("code", prefix + "-" + id.toString().substring(0, 8)).update();
        return id;
    }

    private Actor finance(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, service_id,
                                                created_at, updated_at)
                        values (:id, :login, 'Finance', 'ADMIN', '{finance.manage}', true, 'ACTIVE', :service,
                                now(), now())""")
                .param("id", id).param("login", "debt-" + id).param("service", service).update();
        return new Actor(SubjectType.STAFF, id);
    }

    /** A driver of the service who owes {@code owed} in the currency. */
    private UUID owingDriver(UUID service, String currency, long owed) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, service_id,
                                            created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', :service, now(), now())""")
                .param("id", id).param("phone", taxi.blizz.TestPhones.unique("+38096", 7))
                .param("service", service).update();
        tx.executeWithoutResult(s -> {
            ledger.post(new Ledger.Posting("debt-test:" + id, "TEST", id, currency, "Commission owed",
                    List.of(Line.debit(Account.DRIVER_PAYABLE, id, owed),
                            Line.credit(Account.SERVICE_COMMISSION, null, owed))));
            debts.refresh(id, currency);
        });
        return id;
    }

    private boolean blocked(UUID driver, String currency) {
        return tx.execute(s -> debts.refresh(driver, currency)).blocked();
    }

    @Test
    void eachServiceHoldsItsOwnDriversToItsOwnLimit() {
        String currency = "Q" + (char) ('A' + (int) (Math.random() * 26)) + (char) ('A' + (int) (Math.random() * 26));
        Actor financeA = finance(service("debt-a"));
        UUID b = service("debt-b");
        Actor financeB = finance(b);
        UUID driverA = owingDriver(jdbc.sql("select service_id from staff_user where id = :id")
                .param("id", financeA.id()).query(UUID.class).single(), currency, 500);
        UUID driverB = owingDriver(b, currency, 500);

        DriverDebts.Limit limitB = debts.setLimit(financeB, UUID.randomUUID(), currency, 100L, 0, "B's own limit");
        assertThat(limitB.version()).as("B's own first version").isEqualTo(1);
        assertThat(debts.limit(financeA, currency).limitMinor()).as("A has no limit").isNull();
        assertThat(debts.limit(financeB, currency).limitMinor()).isEqualTo(100L);
        assertThat(debts.limit(new Actor(SubjectType.DRIVER, driverB), currency).limitMinor())
                .as("the driver sees their service's limit").isEqualTo(100L);
        assertThat(blocked(driverB, currency)).as("B's driver is over B's limit").isTrue();
        assertThat(blocked(driverA, currency)).as("A's driver has no limit").isFalse();

        DriverDebts.Limit limitA = debts.setLimit(financeA, UUID.randomUUID(), currency, 1000L, 0, "A's own limit");
        assertThat(limitA.version()).as("A's own first version, not B's next").isEqualTo(1);
        assertThat(blocked(driverA, currency)).as("A's driver is under A's limit").isFalse();
        assertThat(blocked(driverB, currency)).as("B's limit is still B's").isTrue();
    }
}
