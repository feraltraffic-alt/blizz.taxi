package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Clock;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;

@SpringBootTest
@Import(OutboxErrorPrivacyTests.Database.class)
class OutboxErrorPrivacyTests {
    @org.springframework.boot.test.context.TestConfiguration(proxyBeanMethods=false)
    static class Database {
        @org.springframework.context.annotation.Bean
        @org.springframework.boot.testcontainers.service.connection.ServiceConnection
        org.testcontainers.postgresql.PostgreSQLContainer outboxPrivacyPostgres() {
            return new org.testcontainers.postgresql.PostgreSQLContainer(
                    org.testcontainers.utility.DockerImageName.parse("postgis/postgis:18-3.6")
                            .asCompatibleSubstituteFor("postgres"));
        }
    }
    @Autowired JdbcClient jdbc;
    @Autowired TransactionTemplate tx;
    @Autowired Outbox outbox;
    @Autowired Clock clock;

    @Test
    void failingHandlerPersistsOnlyRedactedBoundedDiagnostic() {
        for (String message : List.of("constraint phone +380501234567", "constraint phone 00380501234567",
                "constraint phone 380501234567", "phone +380501234567 refresh_token=secret-token-value " + "x".repeat(2000))) {
            UUID id = tx.execute(s -> outbox.publish(new OutboxEvent("PrivacyFailureProbe", 1, "Probe",
                    UUID.randomUUID(), 0, Map.of())));
            OutboxHandler handler = new OutboxHandler() {
                public String consumerId() { return "privacy-probe"; }
                public boolean supports(String type) { return type.equals("PrivacyFailureProbe"); }
                public void handle(OutboxMessage event) { throw new IllegalStateException(message); }
            };
            OutboxRelay relay = new OutboxRelay(jdbc, tx, List.of(handler),
                    new OutboxProperties(false, Duration.ofSeconds(1), 100, Duration.ofSeconds(30), 1), clock);
            relay.runOnce();
            String error = jdbc.sql("select last_error from outbox where event_id=:id").param("id", id)
                    .query(String.class).single();
            assertThat(error).startsWith("java.lang.IllegalStateException:")
                    .contains("[redacted-phone]").doesNotContain("380", "501234567", "secret-token-value");
            assertThat(error.length()).isLessThanOrEqualTo(500);
            assertThat(jdbc.sql("select state from outbox where event_id=:id").param("id", id)
                    .query(String.class).single()).isEqualTo("FAILED");
        }
    }

    @Test
    void aHarmlessFailureKeepsItsClassAndUsefulMessage() {
        UUID id = tx.execute(s -> outbox.publish(new OutboxEvent("HarmlessFailureProbe", 1, "Probe",
                UUID.randomUUID(), 0, Map.of())));
        OutboxHandler handler = new OutboxHandler() {
            public String consumerId() { return "harmless-probe"; }
            public boolean supports(String type) { return type.equals("HarmlessFailureProbe"); }
            public void handle(OutboxMessage event) { throw new IllegalArgumentException("temporary provider outage"); }
        };
        new OutboxRelay(jdbc, tx, List.of(handler),
                new OutboxProperties(false, Duration.ofSeconds(1), 100, Duration.ofSeconds(30), 1), clock).runOnce();
        assertThat(jdbc.sql("select last_error from outbox where event_id=:id").param("id", id)
                .query(String.class).single()).isEqualTo("java.lang.IllegalArgumentException: temporary provider outage");
    }
}
