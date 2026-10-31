package taxi.blizz.identity.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.internal.OutboxRelay;

/**
 * T-39, REQ-PRV-05: a deletion made after a backup is applied again when that backup is restored — the erasure
 * journal lives outside the database.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ErasureReplayTests {

    @Autowired JdbcClientDeletions deletions;
    @Autowired ErasureReplay replay;
    @Autowired ErasureJournal journal;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;

    @Test
    void aRestoredClientIsAnonymizedAgainAndTheOtherModulesAreToldAgain() {
        UUID client = UUID.randomUUID();
        String phone = taxi.blizz.TestPhones.unique("+48", 9);
        jdbc.sql("""
                        insert into client (id, phone_normalized, name, account_state, deletion_previous_state,
                                            deletion_requested_at, has_app, created_at, updated_at)
                        values (:id, :phone, 'Olena', 'DELETION_PENDING', 'ACTIVE', now(), true, now(), now())""")
                .param("id", client).param("phone", phone).update();
        deletions.anonymize(client);
        drain();
        assertThat(journal.subjects(ErasureReplay.CLIENT)).as("journaled after the commit").contains(client);

        // The database is restored from a backup made before the deletion.
        jdbc.sql("""
                        update client set account_state = 'ACTIVE', phone_normalized = :phone, name = 'Olena',
                                          deletion_previous_state = null, deletion_requested_at = null
                        where id = :id""")
                .param("id", client).param("phone", phone).update();

        assertThat(replay.replay()).isGreaterThanOrEqualTo(1);
        Map<String, Object> row = jdbc.sql("select account_state, phone_normalized, name from client where id = :id")
                .param("id", client).query().singleRow();
        assertThat(row).containsEntry("account_state", "ANONYMIZED");
        assertThat(row.get("phone_normalized")).isNull();
        assertThat(row.get("name")).isNull();
        assertThat(anonymizedEvents(client)).as("the other modules are told again").isEqualTo(2);
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'client_deletion.reapply' and resource_id = :id""")
                .param("id", client.toString()).query(Long.class).single()).isEqualTo(1);

        replay.replay();
        assertThat(anonymizedEvents(client)).as("nothing more once it is anonymized").isEqualTo(2);
    }

    @Test
    void theJournalIsWrittenOnceAndUnknownClientsAreSkipped() {
        UUID ghost = UUID.randomUUID();
        journal.record(ErasureReplay.CLIENT, ghost, "2026-10-27T10:00:00Z");
        journal.record(ErasureReplay.CLIENT, ghost, "2026-10-27T11:00:00Z");
        assertThat(journal.subjects(ErasureReplay.CLIENT)).containsOnlyOnce(ghost);
        // A client created after the backup does not exist in the restored database: nothing to do, no failure.
        replay.replay();
        assertThat(jdbc.sql("select count(*) from client where id = :id").param("id", ghost).query(Long.class)
                .single()).isZero();
    }

    @Autowired taxi.blizz.driver.DriverDeletions drivers;
    @Autowired org.springframework.transaction.support.TransactionTemplate tx;

    /** E4 of issue #144: the same for a driver, through the driver module's {@code ErasedSubjects}. */
    @Test
    void aRestoredDriverIsAnonymizedAgain() {
        UUID driver = UUID.randomUUID();
        String phone = taxi.blizz.TestPhones.unique("+38099", 7);
        jdbc.sql("""
                        insert into driver (id, phone_normalized, name, account_state, review_status,
                                            deletion_previous_state, deletion_requested_at, created_at, updated_at)
                        values (:id, :phone, 'Petro', 'DELETION_PENDING', 'APPROVED', 'ACTIVE', now(), now(), now())""")
                .param("id", driver).param("phone", phone).update();
        tx.executeWithoutResult(s -> drivers.anonymize(driver));
        drain();
        assertThat(journal.subjects("DRIVER")).as("journaled after the commit").contains(driver);

        // The database is restored from a backup made before the deletion.
        jdbc.sql("""
                        update driver set account_state = 'ACTIVE', phone_normalized = :phone, name = 'Petro',
                                          deletion_previous_state = null, deletion_requested_at = null,
                                          anonymized_at = null
                        where id = :id""")
                .param("id", driver).param("phone", phone).update();

        assertThat(replay.replay()).isGreaterThanOrEqualTo(1);
        Map<String, Object> row = jdbc.sql("select account_state, phone_normalized, name from driver where id = :id")
                .param("id", driver).query().singleRow();
        assertThat(row).containsEntry("account_state", "ANONYMIZED");
        assertThat(row.get("phone_normalized")).isNull();
        assertThat(row.get("name")).isNull();
        assertThat(driverEvents(driver)).as("the other modules are told again").isEqualTo(2);
        assertThat(jdbc.sql("""
                        select count(*) from audit_log
                        where action = 'driver_deletion.reapply' and resource_id = :id""")
                .param("id", driver.toString()).query(Long.class).single()).isEqualTo(1);
        replay.replay();
        assertThat(driverEvents(driver)).as("nothing more once it is anonymized").isEqualTo(2);
    }

    private long driverEvents(UUID driver) {
        return jdbc.sql("select count(*) from outbox where event_type = 'DriverAnonymized' and aggregate_id = :id")
                .param("id", driver).query(Long.class).single();
    }

    private long anonymizedEvents(UUID client) {
        return jdbc.sql("select count(*) from outbox where event_type = 'ClientAnonymized' and aggregate_id = :id")
                .param("id", client).query(Long.class).single();
    }

    private void drain() {
        while (relay.runOnce() > 0) {
            // deliver everything published so far
        }
    }
}
