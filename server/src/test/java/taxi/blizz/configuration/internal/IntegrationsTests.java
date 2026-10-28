package taxi.blizz.configuration.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.configuration.Integrations.Change;
import taxi.blizz.configuration.Integrations.FieldState;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** Keys of integrations in the admin panel (REQ-ADM-10): write-only, encrypted, audited, asked for the password. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class IntegrationsTests {

    static final String PASSWORD = "Integrations-Test-2026";
    static final String PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nTUlJRXZnSUJBREFOQmdrcWhraUc5dzBC\n"
            + "-----END PRIVATE KEY-----\n";
    static final String CREDENTIALS = "{\"type\":\"service_account\",\"client_email\":\"push@blizz.iam.example\","
            + "\"private_key\":\"" + PRIVATE_KEY.replace("\n", "\\n") + "\"}";

    @Autowired
    Integrations integrations;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    WebApplicationContext context;

    Actor admin;

    @BeforeEach
    void setUp() {
        admin = staff(Integrations.MANAGE_PERMISSION);
    }

    @AfterEach
    void cleanUp() {
        // Other tests must not see these values.
        integrations.change(admin, UUID.randomUUID(), PASSWORD, List.of(new Change(Integrations.FCM_PROJECT_ID, null),
                new Change(Integrations.FCM_CREDENTIALS, null), new Change(Integrations.MAPS_PROVIDER, null),
                new Change(Integrations.MAPS_ANDROID_KEY, null)), "test clean-up");
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, password_hash, created_at,
                                                updated_at)
                        values (:id, :login, 'Keys', 'ADMIN', :permissions, 'ACTIVE', :hash, now(), now())""")
                .param("id", id).param("login", "keys-" + id).param("permissions", permissions)
                .param("hash", new BCryptPasswordEncoder(4).encode(PASSWORD)).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private FieldState field(List<FieldState> fields, String name) {
        return fields.stream().filter(f -> f.name().equals(name)).findFirst().orElseThrow();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void aKeyIsWrittenButNeverReadBackAndTheAppsGetOnlyTheirMapKeys() throws Exception {
        long revision = integrations.revision();
        List<FieldState> fields = integrations.change(admin, UUID.randomUUID(), PASSWORD, List.of(
                new Change(Integrations.FCM_PROJECT_ID, "blizz-kyiv"),
                new Change(Integrations.FCM_CREDENTIALS, CREDENTIALS),
                new Change(Integrations.MAPS_PROVIDER, "google"),
                new Change(Integrations.MAPS_ANDROID_KEY, "AIza-android-key-0001")), "Firebase and maps");

        FieldState credentials = field(fields, Integrations.FCM_CREDENTIALS);
        assertThat(credentials.set()).isTrue();
        assertThat(credentials.value()).as("never read back").isNull();
        assertThat(credentials.hint()).startsWith("…").hasSize(5);
        assertThat(credentials.changedBy()).isEqualTo(admin.id());
        assertThat(field(fields, Integrations.FCM_PROJECT_ID).value()).isEqualTo("blizz-kyiv");
        assertThat(field(fields, Integrations.MAPS_PROVIDER).value()).isEqualTo("GOOGLE");
        assertThat(integrations.revision()).isGreaterThan(revision);
        assertThat(integrations.value(Integrations.FCM_CREDENTIALS)).contains(CREDENTIALS);

        byte[] stored = jdbc.sql("select secret_value from integration_value where name = :n")
                .param("n", Integrations.FCM_CREDENTIALS).query(byte[].class).single();
        assertThat(new String(stored, StandardCharsets.ISO_8859_1)).as("encrypted at rest")
                .doesNotContain("client_email", "PRIVATE KEY");
        String audit = jdbc.sql("select string_agg(coalesce(before::text, '') || after::text, ' ') from audit_log "
                        + "where action = 'integrations.change' and actor_id = :id")
                .param("id", admin.id()).query(String.class).single();
        assertThat(audit).contains(Integrations.FCM_CREDENTIALS).doesNotContain("PRIVATE KEY", "client_email");

        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).build();
        String bootstrap = mvc.perform(get("/api/config/v1/bootstrap")).andReturn().getResponse()
                .getContentAsString();
        assertThat(bootstrap).contains("AIza-android-key-0001", "GOOGLE").doesNotContain("PRIVATE", "blizz-kyiv");

        // "Check the connection" never shows the key, and this key cannot sign in.
        Integrations.Check check = integrations.check(admin, Integrations.PUSH);
        assertThat(check.ok()).isFalse();
        assertThat(check.message()).doesNotContain("TUlJ", "PRIVATE");

        // Removed: the environment's value applies again.
        List<FieldState> removed = integrations.change(admin, UUID.randomUUID(), PASSWORD,
                List.of(new Change(Integrations.FCM_CREDENTIALS, "")), "Key revoked");
        assertThat(field(removed, Integrations.FCM_CREDENTIALS).set()).isFalse();
        assertThat(integrations.value(Integrations.FCM_CREDENTIALS)).isEmpty();
    }

    @Test
    void theWrongPasswordNoRightOrBadValuesChangeNothing() {
        assertCode(() -> integrations.change(admin, UUID.randomUUID(), "wrong", List.of(
                new Change(Integrations.FCM_PROJECT_ID, "intruder")), "x"), ErrorCode.ACCESS_DENIED);
        assertThat(integrations.value(Integrations.FCM_PROJECT_ID)).isEmpty();
        assertThat(jdbc.sql("select failed_sign_ins from staff_user where id = :id").param("id", admin.id())
                .query(Integer.class).single()).as("counted like a failed sign-in").isEqualTo(1);

        Actor clerk = staff("orders.view");
        assertCode(() -> integrations.list(clerk), ErrorCode.ACCESS_DENIED);
        assertCode(() -> integrations.change(clerk, UUID.randomUUID(), PASSWORD, List.of(
                new Change(Integrations.FCM_PROJECT_ID, "x")), "x"), ErrorCode.ACCESS_DENIED);

        assertCode(() -> integrations.change(admin, UUID.randomUUID(), PASSWORD, List.of(
                new Change("db.password", "x")), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> integrations.change(admin, UUID.randomUUID(), PASSWORD, List.of(
                new Change(Integrations.FCM_CREDENTIALS, "{\"not\":\"a key\"}")), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> integrations.change(admin, UUID.randomUUID(), PASSWORD, List.of(
                new Change(Integrations.GRAPHHOPPER_BASE_URL, "ftp://x")), "x"), ErrorCode.VALIDATION_FAILED);
        for (String ssrf : List.of("http://169.254.169.254/latest/meta-data", "http://10.0.0.5:8088",
                "http://user:secret@example.com", "http://[::ffff:169.254.169.254]/")) {
            assertCode(() -> integrations.change(admin, UUID.randomUUID(), PASSWORD, List.of(
                    new Change(Integrations.OTP_ASTERISK_ARI_URL, ssrf)), "x"), ErrorCode.VALIDATION_FAILED);
        }
        assertCode(() -> integrations.change(admin, UUID.randomUUID(), PASSWORD, List.of(
                new Change(Integrations.MAPS_PROVIDER, "BING")), "x"), ErrorCode.VALIDATION_FAILED);
        assertThat(integrations.list(admin)).filteredOn(f -> f.name().startsWith("maps."))
                .allSatisfy(f -> assertThat(f.set()).isFalse());
    }

    @Test
    void aRepeatedCommandIsAppliedOnce() {
        UUID command = UUID.randomUUID();
        List<Change> changes = List.of(new Change(Integrations.MAPS_ANDROID_KEY, "AIza-once"));
        integrations.change(admin, command, PASSWORD, changes, "once");
        long revision = integrations.revision();
        integrations.change(admin, command, PASSWORD, changes, "once");
        assertThat(integrations.revision()).isEqualTo(revision);
    }

    @Test
    void theCipherBindsTheValueToItsName() {
        SecretCipher cipher = SecretCipher.of(Base64.getEncoder().encodeToString(new byte[32]));
        byte[] sealed = cipher.encrypt("a.key", "s3cret");
        assertThat(cipher.decrypt("a.key", sealed)).isEqualTo("s3cret");
        assertThatThrownBy(() -> cipher.decrypt("another.key", sealed)).isInstanceOf(IllegalStateException.class);
        sealed[sealed.length - 1] ^= 1;
        assertThatThrownBy(() -> cipher.decrypt("a.key", sealed)).isInstanceOf(IllegalStateException.class);
        assertThat(SecretCipher.of("")).isNull();
        assertThatThrownBy(() -> SecretCipher.of("c2hvcnQ=")).isInstanceOf(IllegalStateException.class);
        assertThat(JdbcIntegrations.hint("abcdefghijklmnop")).isEqualTo("…mnop");
        assertThat(JdbcIntegrations.hint("short")).isEqualTo("…");
    }
}
