package taxi.blizz.driver.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.files.FileService;

/**
 * Deletes a deleted driver's document files once {@code blizz.driver.document-keep} has passed since the erasure
 * (issue #144): the files go from storage through {@code FileService.requestErasure}, the documents keep their type,
 * validity and decision. One short transaction per batch; documents already without a file are not selected again.
 */
@Component
class DriverDocumentErasure {

    private static final int BATCH = 100;

    private final JdbcClient jdbc;
    private final FileService files;
    private final DriverProperties properties;
    private final TransactionTemplate tx;
    private final Clock clock;

    DriverDocumentErasure(JdbcClient jdbc, FileService files, DriverProperties properties, TransactionTemplate tx,
                          Clock clock) {
        this.jdbc = jdbc;
        this.files = files;
        this.properties = properties;
        this.tx = tx;
        this.clock = clock;
    }

    private record Document(UUID id, UUID fileId) {
    }

    /** One batch; returns how many documents lost their file. */
    int runOnce() {
        OffsetDateTime cutoff = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC)
                .minus(properties.documentKeep());
        Integer done = tx.execute(status -> {
            List<Document> due = jdbc.sql("""
                            select d.id, d.file_id from driver dr
                            join driver_document d on d.driver_id = dr.id and d.file_id is not null
                            where dr.account_state = 'ANONYMIZED' and dr.anonymized_at <= :cutoff
                            order by dr.anonymized_at, d.id limit :limit
                            for update of d skip locked""")
                    .param("cutoff", cutoff).param("limit", BATCH)
                    .query((rs, i) -> new Document(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class)))
                    .list();
            if (due.isEmpty()) {
                return 0;
            }
            files.requestErasure(due.stream().map(Document::fileId).toList());
            return jdbc.sql("update driver_document set file_id = null where id in (:ids)")
                    .param("ids", due.stream().map(Document::id).toList()).update();
        });
        return done == null ? 0 : done;
    }

    @Component
    @ConditionalOnProperty(name = "blizz.retention.enabled", havingValue = "true", matchIfMissing = true)
    static class Schedule {

        private final DriverDocumentErasure erasure;

        Schedule(DriverDocumentErasure erasure) {
            this.erasure = erasure;
        }

        @Scheduled(fixedDelayString = "${blizz.retention.interval:PT1M}")
        void run() {
            erasure.runOnce();
        }
    }
}
