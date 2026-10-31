package taxi.blizz.driver.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.driver.DriverDeletions;

/**
 * A deleted driver's document files (issue #144): kept for {@code blizz.driver.document-keep} (here 30 days, the
 * owner's term), then deleted from storage; the documents keep their type, validity and decision.
 */
@SpringBootTest(properties = {"blizz.driver.document-keep=P30D", "blizz.retention.enabled=false"})
@Import(TestcontainersConfiguration.class)
class DriverDocumentErasureTests {

    @Autowired JdbcClient jdbc;
    @Autowired DriverDeletions deletions;
    @Autowired DriverDocumentErasure erasure;
    @Autowired TransactionTemplate tx;

    /** A pending driver with an accepted licence whose scan is a stored file. */
    private UUID[] driverWithDocument() {
        UUID driver = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, name, account_state, review_status,
                                            deletion_previous_state, deletion_requested_at, created_at, updated_at)
                        values (:id, :phone, 'Petro', 'DELETION_PENDING', 'APPROVED', 'ACTIVE', now(), now(), now())""")
                .param("id", driver).param("phone", taxi.blizz.TestPhones.unique("+38099", 7)).update();
        UUID file = UUID.randomUUID();
        jdbc.sql("""
                        insert into file_object (id, owner_type, owner_id, purpose, declared_content_type,
                                                 declared_size_bytes, state, storage_key, upload_expires_at, created_at,
                                                 attached_at)
                        values (:id, 'DRIVER', :driver, 'DRIVER_DOCUMENT', 'image/png', 10, 'SAFE', :key,
                                now(), now(), now())""")
                .param("id", file).param("driver", driver).param("key", "test/driver-document/" + file).update();
        UUID document = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver_document (id, driver_id, type, file_id, number, valid_from, valid_to,
                                                     decision, created_at)
                        values (:id, :driver, 'DRIVER_LICENSE', :file, 'BXA123456', current_date - 10,
                                current_date + 700, 'ACCEPTED', now())""")
                .param("id", document).param("driver", driver).param("file", file).update();
        return new UUID[] {driver, document, file};
    }

    private Map<String, Object> document(UUID id) {
        return jdbc.sql("select file_id, number, type, decision, valid_to from driver_document where id = :id")
                .param("id", id).query().singleRow();
    }

    private boolean erasureRequested(UUID file) {
        return jdbc.sql("select erase_requested_at is not null from file_object where id = :id").param("id", file)
                .query(Boolean.class).single();
    }

    @Test
    void theFilesStayForTheTermThenGoAndTheDocumentKeepsItsFacts() {
        UUID[] ids = driverWithDocument();
        tx.executeWithoutResult(s -> deletions.anonymize(ids[0]));

        assertThat(document(ids[1])).as("the number goes at once").containsEntry("number", null)
                .containsEntry("file_id", ids[2]);
        erasure.runOnce();
        assertThat(document(ids[1]).get("file_id")).as("within the term the file stays").isEqualTo(ids[2]);
        assertThat(erasureRequested(ids[2])).isFalse();

        jdbc.sql("update driver set anonymized_at = now() - interval '31 days' where id = :id").param("id", ids[0])
                .update();
        assertThat(erasure.runOnce()).isEqualTo(1);
        assertThat(document(ids[1])).containsEntry("file_id", null).containsEntry("type", "DRIVER_LICENSE")
                .containsEntry("decision", "ACCEPTED");
        assertThat(document(ids[1]).get("valid_to")).isNotNull();
        assertThat(erasureRequested(ids[2])).as("the file is deleted from storage by the erasure sweep").isTrue();
        assertThat(erasure.runOnce()).as("a repeat finds nothing").isZero();
    }

    @Test
    void anActiveDriversDocumentsAreNeverTouched() {
        UUID[] ids = driverWithDocument();
        jdbc.sql("""
                        update driver set account_state = 'ACTIVE', deletion_previous_state = null,
                                          deletion_requested_at = null, anonymized_at = now() - interval '1 year'
                        where id = :id""")
                .param("id", ids[0]).update();
        erasure.runOnce();
        assertThat(document(ids[1])).containsEntry("file_id", ids[2]).containsEntry("number", "BXA123456");
    }
}
