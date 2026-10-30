package taxi.blizz.audit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CorrelationId;
import taxi.blizz.platform.SubjectType;

/** REQ-SEC-13: audit records are written with the actor and cannot be edited or deleted. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class AuditLogTests {

    @Autowired
    AuditLog auditLog;
    @Autowired
    JdbcClient jdbc;

    private UUID record() {
        return auditLog.record(new AuditEntry(new Actor(SubjectType.STAFF, UUID.randomUUID()),
                "tariff.publish", "tariff", "t-1", "new season", Map.of("price", 100), Map.of("price", 120)));
    }

    @Test
    void recordsActorChangeAndCorrelation() {
        UUID correlation = UUID.randomUUID();
        UUID id;
        try (CorrelationId.Scope ignored = CorrelationId.open(correlation)) {
            id = record();
        }

        Map<String, Object> row = jdbc.sql("""
                        select actor_type, action, after::text as after, correlation_id
                        from audit_log where id = :id""")
                .param("id", id).query().singleRow();

        assertThat(row.get("actor_type")).isEqualTo("STAFF");
        assertThat(row.get("action")).isEqualTo("tariff.publish");
        assertThat((String) row.get("after")).contains("120");
        assertThat(row.get("correlation_id")).isEqualTo(correlation);
    }

    /** REQ-API-09: changes made in the same microsecond are each listed once across pages. */
    @Test
    void changesOfTheSameMomentPageEachOnce() {
        UUID staff = UUID.randomUUID();
        java.util.List<UUID> made = new java.util.ArrayList<>();
        for (int i = 0; i < 3; i++) {
            UUID id = UUID.randomUUID();
            jdbc.sql("""
                            insert into audit_log (id, occurred_at, actor_type, actor_id, action, resource_type,
                                                   correlation_id)
                            values (:id, timestamptz '2026-10-30 09:00:00.654321+00', 'STAFF', :staff, 'page.test',
                                    'test', gen_random_uuid())""")
                    .param("id", id).param("staff", staff).update();
            made.add(id);
        }
        java.util.List<UUID> seen = new java.util.ArrayList<>();
        taxi.blizz.platform.PageCursor after = null;
        for (int page = 0; page < 5; page++) {
            java.util.List<AuditLog.Record> rows = auditLog.find(new AuditLog.Query("STAFF", staff, null, null, null,
                    null, null, null, after, 2));
            seen.add(rows.getFirst().id());
            if (rows.size() < 2) {
                break;
            }
            after = AuditLog.position(rows.getFirst());
        }
        assertThat(seen).hasSize(3).doesNotHaveDuplicates().containsExactlyInAnyOrderElementsOf(made);
    }

    @Test
    void updateIsRejected() {
        UUID id = record();

        assertThatThrownBy(() -> jdbc.sql("update audit_log set reason = 'edited' where id = :id").param("id", id).update())
                .rootCause()
                .hasMessageContaining("append-only");
    }

    @Test
    void deleteIsRejected() {
        UUID id = record();

        assertThatThrownBy(() -> jdbc.sql("delete from audit_log where id = :id").param("id", id).update())
                .rootCause()
                .hasMessageContaining("append-only");
    }

    @Test
    void systemActorNeedsNoId() {
        UUID id = auditLog.record(new AuditEntry(Actor.system(), "outbox.failed", "outbox", null, null, null, null));

        assertThat(jdbc.sql("select actor_type from audit_log where id = :id").param("id", id)
                .query(String.class).single()).isEqualTo("SYSTEM");
    }
}
