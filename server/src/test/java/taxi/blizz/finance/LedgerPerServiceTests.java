package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * ADR 0016, issue #216: every journal transaction belongs to one taxi service, the one of its drivers and riders;
 * money of two services never meets in one transaction.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class LedgerPerServiceTests {

    @Autowired Ledger ledger;
    @Autowired JdbcClient jdbc;
    @Autowired TransactionTemplate tx;

    private UUID service() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, :code, now(), now())""")
                .param("id", id).param("code", "ledger-" + id.toString().substring(0, 8)).update();
        return id;
    }

    private UUID driver(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, service_id,
                                            created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', :service, now(), now())""")
                .param("id", id).param("phone", taxi.blizz.TestPhones.unique("+38097", 7))
                .param("service", service).update();
        return id;
    }

    private UUID rider(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, service_id, created_at,
                                            updated_at)
                        values (:id, :phone, 'ACTIVE', true, :service, now(), now())""")
                .param("id", id).param("phone", taxi.blizz.TestPhones.unique("+38093", 7))
                .param("service", service).update();
        return id;
    }

    private UUID serviceOfPosting(String key) {
        return jdbc.sql("select service_id from journal_transaction where business_key = :key").param("key", key)
                .query(UUID.class).single();
    }

    @Test
    void aPostingBelongsToTheServiceOfItsPeopleAndNeverMixesTwo() {
        UUID a = service();
        UUID b = service();
        UUID driverOfB = driver(b);
        UUID riderOfB = rider(b);
        UUID riderOfA = rider(a);

        String own = "ledger-own:" + UUID.randomUUID();
        tx.executeWithoutResult(s -> ledger.post(new Ledger.Posting(own, "TEST", UUID.randomUUID(), "UAH",
                "A ride of B", List.of(Line.debit(Account.RIDER_RECEIVABLE, riderOfB, 300),
                        Line.credit(Account.DRIVER_PAYABLE, driverOfB, 300)))));
        assertThat(serviceOfPosting(own)).as("the service of its people").isEqualTo(b);

        String mixed = "ledger-mixed:" + UUID.randomUUID();
        assertThatThrownBy(() -> tx.executeWithoutResult(s -> ledger.post(new Ledger.Posting(mixed, "TEST",
                UUID.randomUUID(), "UAH", "A rider of A pays a driver of B",
                List.of(Line.debit(Account.RIDER_RECEIVABLE, riderOfA, 300),
                        Line.credit(Account.DRIVER_PAYABLE, driverOfB, 300))))))
                .as("two services in one transaction").isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);

        String named = "ledger-named:" + UUID.randomUUID();
        assertThatThrownBy(() -> tx.executeWithoutResult(s -> ledger.post(new Ledger.Posting(named, "TEST",
                UUID.randomUUID(), "UAH", "B's driver in A's books",
                List.of(Line.debit(Account.SERVICE_FUNDS, null, 100), Line.credit(Account.DRIVER_PAYABLE, driverOfB,
                        100)), a))))
                .as("a service named against its people").isInstanceOf(DomainException.class);

        String nobody = "ledger-nobody:" + UUID.randomUUID();
        assertThatThrownBy(() -> tx.executeWithoutResult(s -> ledger.post(new Ledger.Posting(nobody, "TEST",
                UUID.randomUUID(), "UAH", "No person, no service",
                List.of(Line.debit(Account.SUSPENSE, null, 100), Line.credit(Account.SUSPENSE, null, 100))))))
                .as("no person and no service named").isInstanceOf(DomainException.class);
        assertThat(jdbc.sql("select count(*) from journal_transaction where business_key in (:keys)")
                .param("keys", List.of(mixed, named, nobody)).query(Long.class).single())
                .as("refused: nothing written").isZero();
    }
}
