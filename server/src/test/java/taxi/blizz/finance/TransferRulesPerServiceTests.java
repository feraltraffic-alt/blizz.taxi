package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/** ADR 0016, issue #215: each taxi service sets its own rules for transfers between its drivers. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class TransferRulesPerServiceTests {

    @Autowired DriverBalances balances;
    @Autowired JdbcClient jdbc;

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
                .param("id", id).param("login", "rules-" + id).param("service", service).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor driver(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, service_id,
                                            created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', :service, now(), now())""")
                .param("id", id).param("phone", taxi.blizz.TestPhones.unique("+38095", 7))
                .param("service", service).update();
        return new Actor(SubjectType.DRIVER, id);
    }

    private static DriverBalances.TransferRule rule(String currency, long perTransfer) {
        return new DriverBalances.TransferRule(currency, true, perTransfer, perTransfer * 10, 0, 0);
    }

    @Test
    void aRuleSetInOneServiceIsNotAnotherServicesRule() {
        UUID a = service("rules-a");
        UUID b = service("rules-b");
        Actor financeA = finance(a);
        Actor financeB = finance(b);
        DriverBalances.TransferRule own = balances.setTransferRule(financeB, UUID.randomUUID(), rule("UAH", 500), 0,
                "B's own rule");
        assertThat(own.version()).as("B's own first version").isEqualTo(1);
        assertThat(balances.transferRules(financeA)).as("A has no rules yet").isEmpty();
        assertThat(balances.transferRules(driver(b))).as("B's driver sees B's rule")
                .extracting(DriverBalances.TransferRule::maxPerTransferMinor).containsExactly(500L);
        assertThat(balances.transferRules(driver(a))).as("A's driver sees none").isEmpty();
        assertThat(balances.setTransferRule(financeA, UUID.randomUUID(), rule("UAH", 900), 0, "A's own rule")
                .version()).as("A's own first version, not B's next").isEqualTo(1);
        assertThat(balances.transferRules(financeB)).extracting(DriverBalances.TransferRule::maxPerTransferMinor)
                .as("B's rule as it was").containsExactly(500L);
    }
}
