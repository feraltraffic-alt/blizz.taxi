package taxi.blizz.operatorbonus;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/**
 * ADR 0016, issue #215: each taxi service sets its own operator bonus rules with its own versions, and sees the
 * accounts and closed periods of its own operators only.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OperatorBonusPerServiceTests {

    @Autowired OperatorBonuses bonuses;
    @Autowired JdbcClient jdbc;

    private UUID service(String prefix) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, :code, now(), now())""")
                .param("id", id).param("code", prefix + "-" + id.toString().substring(0, 8)).update();
        return id;
    }

    private Actor manager(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, service_id,
                                                created_at, updated_at)
                        values (:id, :login, 'Bonuses', 'ADMIN', '{operator-bonuses.manage}', true, 'ACTIVE',
                                :service, now(), now())""")
                .param("id", id).param("login", "bonus-svc-" + id).param("service", service).update();
        return new Actor(SubjectType.STAFF, id);
    }

    @Test
    void eachServiceKeepsItsOwnRulesAndSeesOnlyItsOwnOperators() {
        UUID a = service("bonus-a");
        UUID b = service("bonus-b");
        Actor managerA = manager(a);
        Actor managerB = manager(b);
        assertThat(bonuses.currentSettings(managerB).version()).as("B starts at its own version 0").isZero();
        OperatorBonuses.SettingsVersion changed = bonuses.changeSettings(managerB, UUID.randomUUID(), 0,
                new OperatorBonuses.Settings(7, 3, false, 15, List.of()), "B's own rules");
        assertThat(changed.version()).as("B's own first version").isEqualTo(1);
        assertThat(bonuses.currentSettings(managerB).settings().m()).isEqualTo(7);
        OperatorBonuses.SettingsVersion ofA = bonuses.currentSettings(managerA);
        assertThat(ofA.version()).as("A untouched").isZero();
        assertThat(ofA.settings().m()).as("A keeps the initial rules").isEqualTo(1);

        UUID operatorB = UUID.randomUUID();
        jdbc.sql("""
                        insert into operator_bonus_account (staff_id, balance, fulfilled_count, cancelled_count,
                                                            period_started_at, timezone, updated_at, service_id)
                        values (:staff, 5, 5, 0, now(), 'UTC', now(), :service)""")
                .param("staff", operatorB).param("service", b).update();
        jdbc.sql("""
                        insert into operator_bonus_period (id, staff_id, period_key, period_started_at,
                                                           period_ended_at, points, fulfilled_count,
                                                           cancelled_count, closed_at, service_id)
                        values (:id, :staff, current_date, now(), now(), 5, 5, 0, now(), :service)""")
                .param("id", UUID.randomUUID()).param("staff", operatorB).param("service", b).update();
        assertThat(bonuses.accounts(managerB)).extracting(OperatorBonuses.Account::staffId).containsExactly(operatorB);
        assertThat(bonuses.accounts(managerA)).as("not A's operator").isEmpty();
        assertThat(bonuses.periods(managerB, 10)).extracting(OperatorBonuses.ClosedPeriod::staffId)
                .containsExactly(operatorB);
        assertThat(bonuses.periods(managerA, 10)).as("not A's period").isEmpty();
    }
}
