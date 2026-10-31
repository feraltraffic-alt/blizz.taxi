package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.mock.env.MockEnvironment;
import taxi.blizz.BlizzTaxiApplication;

/** REQ-ENG-13: a production instance with anything of development, the sandbox or tests does not start. */
class ProductionSafetyTests {

    private static MockEnvironment fit() {
        MockEnvironment env = new MockEnvironment();
        env.setActiveProfiles("prod");
        env.setProperty("blizz.otp.secret", "b3f9c2d18e7a4c6f9a0b1c2d3e4f5a6b7c8d9e0f");
        env.setProperty("blizz.auth.access-token-secret", "9e8d7c6b5a4f3e2d1c0b9a8f7e6d5c4b3a2f1e0d");
        env.setProperty("blizz.secrets.master-key", "q1W2e3R4t5Y6u7I8o9P0a1S2d3F4g5H6j7K8l9Z0x1C=");
        env.setProperty("spring.datasource.password", "a-real-database-password-from-the-vault");
        env.setProperty("blizz.auth.instance-id", "3f2b1a90-1c2d-4e5f-8a9b-0c1d2e3f4a5b");
        env.setProperty("blizz.telephony.otp-provider", "LIVE");
        env.setProperty("blizz.push.provider", "FCM");
        env.setProperty("blizz.geocoding.provider", "VISICOM");
        env.setProperty("blizz.payments.public-base-url", "https://taxi.example.pl");
        env.setProperty("blizz.privacy.erasure-journal-dir", "/var/lib/blizz/erasure-journal");
        return env;
    }

    @Test
    void aFitProductionEnvironmentHasNoProblems() {
        assertThat(ProductionSafety.problems(fit())).isEmpty();
    }

    @Test
    void theRepositorysOwnDevelopmentAndSandboxValuesAreKnown() {
        assertThat(ProductionSafety.publishedValues()).contains(
                "dev-only-otp-secret-change-me-0123456789",
                "BTafAxut8u7D3rruCvQv3xUre9M69sCDmY0XHITZGJA=", // the sandbox master key, no marker in it
                "00000000-0000-4000-8000-00000000005a",
                "Sandbox-Admin-2026");
    }

    /** Every kind of problem on its own: the check names exactly that one. */
    @Test
    void eachKindOfProblemIsNamed() {
        Map<String, String> cases = Map.ofEntries(
                Map.entry("blizz.otp.secret=", "blizz.otp.secret is not set"),
                Map.entry("blizz.otp.secret=dev-only-otp-secret-change-me-0123456789",
                        "blizz.otp.secret is a development or sandbox value"),
                Map.entry("blizz.otp.secret=short-but-real", "blizz.otp.secret is shorter than 32"),
                Map.entry("blizz.secrets.master-key=BTafAxut8u7D3rruCvQv3xUre9M69sCDmY0XHITZGJA=",
                        "blizz.secrets.master-key is a development or sandbox value"),
                Map.entry("blizz.auth.access-token-secret=", "blizz.auth.access-token-secret is not set"),
                Map.entry("spring.datasource.password=", "spring.datasource.password is not set"),
                Map.entry("blizz.auth.instance-id=00000000-0000-4000-8000-00000000005a",
                        "blizz.auth.instance-id is the id of the development or sandbox instance"),
                Map.entry("blizz.auth.instance-id=", "blizz.auth.instance-id is not set"),
                Map.entry("blizz.telephony.otp-provider=FAKE", "blizz.telephony.otp-provider is FAKE"),
                Map.entry("blizz.push.provider=fake", "blizz.push.provider is FAKE"),
                Map.entry("blizz.geocoding.provider=FAKE", "blizz.geocoding.provider is FAKE"),
                Map.entry("blizz.payments.fake-merchants-allowed=true", "fake-merchants-allowed is true"),
                Map.entry("blizz.staff.bootstrap-password=Sandbox-Admin-2026", "bootstrap-password"),
                Map.entry("blizz.payments.secrets.main=sandbox-fake-merchant-secret-not-for-real-use",
                        "blizz.payments.secrets.main is a sandbox value"),
                Map.entry("blizz.payments.public-base-url=http://taxi.example.pl", "public-base-url"),
                Map.entry("blizz.payments.public-base-url=https://localhost:8080", "public-base-url"),
                Map.entry("blizz.privacy.erasure-journal-dir=/tmp/blizz-erasure-journal", "erasure-journal-dir"),
                Map.entry("blizz.faults.crash-at=outbox.after-first-handler", "blizz.faults.crash-at is set"));
        MockEnvironment unresolved = fit();
        unresolved.setProperty("blizz.otp.secret", "${NO_SUCH_VARIABLE_IN_THIS_TEST}");
        assertThat(ProductionSafety.problems(unresolved)).as("a missing environment variable")
                .singleElement().asString().contains("blizz.otp.secret is not set");
        cases.forEach((setting, expected) -> {
            MockEnvironment env = fit();
            String[] kv = setting.split("=", 2);
            env.setProperty(kv[0], kv[1]);
            assertThat(ProductionSafety.problems(env)).as(setting).singleElement().asString().contains(expected);
        });
    }

    @Test
    void developmentProfilesAreNeverCombinedWithProduction() {
        for (String profile : new String[] {"dev", "sandbox", "test"}) {
            MockEnvironment env = fit();
            env.setActiveProfiles("prod", profile);
            assertThat(ProductionSafety.problems(env)).singleElement().asString().contains("'" + profile + "'");
        }
    }

    @Test
    void onlySpringsOwnDefaultCountsAsNoProfile() {
        MockEnvironment none = new MockEnvironment();
        assertThat(ProductionSafety.withoutProfile(none)).isTrue();
        MockEnvironment devByDefault = new MockEnvironment();
        devByDefault.setDefaultProfiles("dev");
        assertThat(ProductionSafety.withoutProfile(devByDefault)).as("the tests' default").isFalse();
        MockEnvironment prod = new MockEnvironment();
        prod.setActiveProfiles("prod");
        assertThat(ProductionSafety.withoutProfile(prod)).isFalse();
    }

    @Test
    void outsideProductionNothingIsChecked() {
        MockEnvironment env = new MockEnvironment();
        env.setActiveProfiles("sandbox");
        assertThat(ProductionSafety.production(env)).isFalse();
    }

    /**
     * Threat model O1: a server started without a profile used to run as {@code dev}, with the keys and fake providers
     * of this repository. It now stops before any bean and says which profile to set. The tests' own configuration
     * makes {@code dev} their default, so this run sets Spring's own default back on the command line.
     */
    @Test
    void anInstanceWithoutAProfileDoesNotStart() {
        assertThatThrownBy(() -> new SpringApplicationBuilder(BlizzTaxiApplication.class)
                .properties("spring.main.web-application-type=none",
                        "DB_URL=jdbc:postgresql://127.0.0.1:1/no-database",
                        "spring.datasource.hikari.connection-timeout=250")
                .run("--spring.profiles.default=default"))
                .extracting(e -> org.springframework.core.NestedExceptionUtils.getMostSpecificCause(e))
                .asInstanceOf(org.assertj.core.api.InstanceOfAssertFactories.THROWABLE)
                .hasMessageContaining("No profile is active")
                .hasMessageContaining("SPRING_PROFILES_ACTIVE=prod");
    }

    /** The whole application: stops before any bean (no database is needed to see it) and lists every problem. */
    @Test
    void aMisconfiguredProductionInstanceDoesNotStart() {
        assertThatThrownBy(() -> new SpringApplicationBuilder(BlizzTaxiApplication.class)
                .profiles("prod")
                .properties("OTP_SECRET=dev-only-otp-secret-change-me-0123456789", "INSTANCE_ID=",
                        "ACCESS_TOKEN_SECRET=", "SECRETS_MASTER_KEY=", "ERASURE_JOURNAL_DIR=/tmp/x",
                        "PUBLIC_BASE_URL=http://localhost:8080", "DB_PASSWORD=", "OTP_PROVIDER=FAKE",
                        "spring.main.web-application-type=none")
                .run())
                .extracting(e -> org.springframework.core.NestedExceptionUtils.getMostSpecificCause(e))
                .asInstanceOf(org.assertj.core.api.InstanceOfAssertFactories.THROWABLE)
                .hasMessageContaining("not fit for production")
                .hasMessageContaining("blizz.otp.secret is a development or sandbox value")
                .hasMessageContaining("blizz.telephony.otp-provider is FAKE")
                .hasMessageContaining("spring.datasource.password is not set")
                .hasMessageNotContaining("dev-only-otp-secret"); // names, never values
    }
}
