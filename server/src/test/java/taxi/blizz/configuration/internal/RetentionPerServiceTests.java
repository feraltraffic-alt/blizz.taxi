package taxi.blizz.configuration.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.util.ReflectionTestUtils;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.RetentionSettings;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.RetentionPolicy;
import taxi.blizz.platform.SubjectType;

/**
 * Retention terms per taxi service (ADR 0016, owner decisions 02.11.2026, issue #276): R1–R5. Each service's super
 * admin sets its own terms; a row with a service goes by its service's term; delivered events and receipts, which
 * belong to no service, go after exactly 30 days.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class RetentionPerServiceTests {

    @Autowired RetentionSettings settings;
    @Autowired JdbcClient jdbc;
    @Autowired ApplicationContext context;

    private UUID service(String prefix) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, 'Retention service', now(), now())""")
                .param("id", id).param("code", prefix + "-" + id.toString().substring(0, 8)).update();
        return id;
    }

    /** A super admin of the service: every right in every city of it. */
    private Actor keeper(UUID service, boolean allCities) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, service_id, login, name, role, permissions, all_cities, state,
                                                created_at, updated_at)
                        values (:id, :service, :login, 'Keeper', 'ADMIN', :permissions, :all, 'ACTIVE', now(),
                                now())""")
                .param("id", id).param("service", service).param("login", "retention-" + id)
                .param("permissions", new String[] {RetentionSettings.MANAGE_PERMISSION}).param("all", allCities)
                .update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static Map<String, Integer> days(int value) {
        Map<String, Integer> days = new LinkedHashMap<>();
        RetentionPolicy.SERVICE_KINDS.forEach(kind -> days.put(kind, value));
        return days;
    }

    private void set(Actor keeper, UUID service, Map<String, Integer> days) {
        settings.change(keeper, UUID.randomUUID(), settings.current(service).version(), days, "Retention per service");
    }

    private void run(String kind, OffsetDateTime now) {
        ReflectionTestUtils.invokeMethod(context.getBean("retentionRunner"), "runKindAt", kind, now);
    }

    @Test
    void r1EachServiceSetsItsOwnTermsAndR2OnlyWithEveryCity() {
        UUID a = service("ret-a");
        UUID b = service("ret-b");
        Actor keeperA = keeper(a, true);
        Actor keeperB = keeper(b, true);
        set(keeperA, a, days(40));
        set(keeperB, b, days(7));
        assertThat(settings.current(b).days()).as("R1: B's").containsEntry("sessions", 7);
        assertThat(settings.current(a).days()).as("A's as A set them").containsEntry("sessions", 40);
        assertThat(settings.current(b).days()).as("only the service's own kinds")
                .containsOnlyKeys(RetentionPolicy.SERVICE_KINDS);
        Actor oneCityOfB = keeper(b, false);
        assertThatThrownBy(() -> set(oneCityOfB, b, days(1))).as("R2").isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.ACCESS_DENIED);
        assertThat(settings.current(b).days()).containsEntry("sessions", 7);
    }

    /** R3: A keeps recordings 30 days, B 7; a 10-day-old recording of B goes, A's of the same age stays. */
    @Test
    void r3CallRecordingsGoByTheirServicesTerm() {
        UUID a = service("rec-a");
        UUID b = service("rec-b");
        set(keeper(a, true), a, with(days(0), "call_recordings", 30));
        set(keeper(b, true), b, with(days(0), "call_recordings", 7));
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        UUID ofA = recording(a, now.minusDays(10));
        UUID ofB = recording(b, now.minusDays(10));
        run("call_recordings", now);
        assertThat(exists("call_recording", "call_id", ofB)).as("B's, past B's 7 days").isFalse();
        assertThat(exists("call_recording", "call_id", ofA)).as("A's, within A's 30 days").isTrue();
    }

    /** R4: sessions and sign-in codes go by their service's term too. */
    @Test
    void r4SessionsAndSignInCodesGoByTheirServicesTerm() {
        UUID a = service("ses-a");
        UUID b = service("ses-b");
        set(keeper(a, true), a, with(with(days(0), "sessions", 30), "sign_in_codes", 30));
        set(keeper(b, true), b, with(with(days(0), "sessions", 7), "sign_in_codes", 7));
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        byte[] sessionA = session(a, now.minusDays(10));
        byte[] sessionB = session(b, now.minusDays(10));
        UUID codeA = code(a, now.minusDays(10));
        UUID codeB = code(b, now.minusDays(10));
        run("sessions", now);
        run("sign_in_codes", now);
        assertThat(jdbc.sql("select count(*) from refresh_token where token_hash = :h").param("h", sessionB)
                .query(Long.class).single()).as("B's session").isZero();
        assertThat(jdbc.sql("select count(*) from refresh_token where token_hash = :h").param("h", sessionA)
                .query(Long.class).single()).as("A's session").isOne();
        assertThat(exists("otp_challenge", "id", codeB)).as("B's code").isFalse();
        assertThat(exists("otp_challenge", "id", codeA)).as("A's code").isTrue();
    }

    /** R5: delivered events and receipts belong to no service: exactly 30 days, whatever a service sets. */
    @Test
    void r5RowsWithoutAServiceGoAfterThirtyDays() {
        assertThat(RetentionPolicy.FIXED_KINDS)
                .containsExactlyInAnyOrder("delivered_events", "consumer_receipts", "command_receipts");
        assertThat(RetentionPolicy.FIXED_DAYS).isEqualTo(30);
        UUID b = service("fix-b");
        set(keeper(b, true), b, days(1));
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        UUID old = event(now.minusDays(31));
        UUID recent = event(now.minusDays(29));
        run("delivered_events", now);
        assertThat(exists("outbox", "event_id", old)).isFalse();
        assertThat(exists("outbox", "event_id", recent)).as("B's 1 day does not apply").isTrue();
    }

    // ------------------------------------------------------------ fixtures

    private static Map<String, Integer> with(Map<String, Integer> days, String kind, int value) {
        days.put(kind, value);
        return days;
    }

    private boolean exists(String table, String key, UUID id) {
        return jdbc.sql("select count(*) from " + table + " where " + key + " = :id").param("id", id)
                .query(Long.class).single() > 0;
    }

    private UUID recording(UUID service, OffsetDateTime at) {
        UUID call = UUID.randomUUID();
        jdbc.sql("""
                        insert into call (id, service_id, channel_id, called_number, state, started_at, ended_at)
                        values (:id, :service, :channel, '+380440000000', 'ENDED', :at, :at)""")
                .param("id", call).param("service", service).param("channel", "ret-" + call)
                .param("at", at).update();
        jdbc.sql("""
                        insert into call_recording (call_id, state, next_attempt_at, created_at)
                        values (:id, 'NONE', :at, :at)""")
                .param("id", call).param("at", at).update();
        return call;
    }

    private byte[] session(UUID service, OffsetDateTime at) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into device_session (id, service_id, subject_type, subject_id, audience, created_at,
                                                    last_refreshed_at, expires_at)
                        values (:id, :service, 'CLIENT', :id, 'rider', :at, :at, :at)""")
                .param("id", id).param("service", service).param("at", at).update();
        byte[] hash = id.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8);
        jdbc.sql("""
                        insert into refresh_token (token_hash, session_id, issued_at, expires_at)
                        values (:hash, :id, :at, :at)""")
                .param("hash", hash).param("id", id).param("at", at).update();
        return hash;
    }

    private UUID code(UUID service, OffsetDateTime at) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into otp_challenge (id, service_id, audience, phone_normalized, code_hmac, expires_at,
                                                   max_attempts, created_at)
                        values (:id, :service, 'CLIENT', '+48111000000', :hash, :at, 3, :at)""")
                .param("id", id).param("service", service).param("hash", new byte[] {1, 2}).param("at", at)
                .update();
        return id;
    }

    private UUID event(OffsetDateTime at) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into outbox (event_id, event_type, schema_version, aggregate_type, aggregate_id,
                                            aggregate_version, payload, correlation_id, occurred_at, state,
                                            next_attempt_at, completed_at)
                        values (:id, 'RetentionFixture', 1, 'Fixture', :id, 0, '{}', :id, :at, 'DONE', :at, :at)""")
                .param("id", id).param("at", at).update();
        return id;
    }
}
