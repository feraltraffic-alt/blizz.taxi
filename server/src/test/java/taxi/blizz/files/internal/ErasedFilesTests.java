package taxi.blizz.files.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.context.bean.override.mockito.MockitoSpyBean;
import org.springframework.transaction.IllegalTransactionStateException;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.files.FileService;

/**
 * Files their owner asked to erase (issue #144): a deleted rider's support attachments go from storage, then their
 * row, whatever the retention terms; a storage failure keeps the row for the next run.
 */
@SpringBootTest(properties = "blizz.files.local-dir=${java.io.tmpdir}/blizz-erased-files")
@Import(TestcontainersConfiguration.class)
class ErasedFilesTests {

    @Autowired
    JdbcClient jdbc;
    @Autowired
    FileService files;
    @Autowired
    ErasedFiles erased;
    @Autowired
    TransactionTemplate tx;
    @MockitoSpyBean
    FileStorage storage;

    /** An attached support file with its bytes in storage. */
    private UUID attachment() throws Exception {
        UUID id = UUID.randomUUID();
        String key = "support_attachment/erasure/" + id;
        storage.reserve(key);
        storage.store(storage.stage(new ByteArrayInputStream(new byte[] {1, 2, 3}), 10, key), key);
        jdbc.sql("""
                        insert into file_object (id, owner_type, owner_id, purpose, declared_content_type,
                                                 declared_size_bytes, size_bytes, state, storage_key,
                                                 upload_expires_at, created_at, uploaded_at, attached_at)
                        values (:id, 'CLIENT', :owner, 'SUPPORT_ATTACHMENT', 'image/png', 3, 3, 'SAFE', :key,
                                now(), now(), now(), now())""")
                .param("id", id).param("owner", UUID.randomUUID()).param("key", key).update();
        return id;
    }

    private boolean stored(UUID id) {
        return jdbc.sql("select count(*) from file_object where id = :id").param("id", id).query(Long.class).single()
                > 0;
    }

    private boolean bytes(UUID id) {
        try (var in = storage.open("support_attachment/erasure/" + id)) {
            return in.read() >= 0;
        } catch (IOException e) {
            return false;
        }
    }

    @Test
    void requestedFilesGoBytesFirstOthersStay() throws Exception {
        UUID asked = attachment();
        UUID kept = attachment();
        tx.executeWithoutResult(s -> files.requestErasure(List.of(asked, UUID.randomUUID())));
        tx.executeWithoutResult(s -> files.requestErasure(List.of(asked)));

        while (erased.runOnce() > 0) {
            // drain
        }
        assertThat(stored(asked)).isFalse();
        assertThat(bytes(asked)).isFalse();
        assertThat(stored(kept)).isTrue();
        assertThat(bytes(kept)).isTrue();
        assertThat(erased.runOnce()).as("a repeat finds nothing").isZero();
    }

    @Test
    void aStorageFailureKeepsTheRowForTheNextRun() throws Exception {
        UUID asked = attachment();
        tx.executeWithoutResult(s -> files.requestErasure(List.of(asked)));
        Mockito.doThrow(new IOException("disk gone")).when(storage).delete("support_attachment/erasure/" + asked);
        erased.runOnce();
        assertThat(stored(asked)).isTrue();
        assertThat(bytes(asked)).isTrue();

        Mockito.reset(storage);
        jdbc.sql("update file_object set retention_until = now() where id = :id").param("id", asked).update();
        erased.runOnce();
        assertThat(stored(asked)).isFalse();
        assertThat(bytes(asked)).isFalse();
    }

    @Test
    void onlyInsideTheOwnersTransaction() {
        assertThatThrownBy(() -> files.requestErasure(List.of(UUID.randomUUID())))
                .isInstanceOf(IllegalTransactionStateException.class);
    }
}
