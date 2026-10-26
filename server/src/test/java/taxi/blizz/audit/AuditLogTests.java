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
