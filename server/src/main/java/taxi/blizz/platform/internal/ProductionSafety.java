package taxi.blizz.platform.internal;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Refuses to start a production instance that carries anything of development, the sandbox or tests (REQ-ENG-13):
 * fake providers, a key published in this repository, a secret left empty, a temporary directory for the erasure
 * journal. Every problem is listed at once, so one restart fixes them all. Only names are printed, never values.
 */
final class ProductionSafety {

    static final String PRODUCTION = "prod";
    private static final Set<String> NOT_WITH_PRODUCTION = Set.of("dev", "sandbox", "test");
    private static final List<String> SECRETS = List.of("blizz.otp.secret", "blizz.auth.access-token-secret",
            "blizz.secrets.master-key", "spring.datasource.password");
    private static final List<String> REAL_PROVIDERS = List.of("blizz.telephony.otp-provider", "blizz.push.provider",
            "blizz.geocoding.provider");
    private static final List<String> MARKERS = List.of("dev-only", "sandbox-only", "not-for-real-use", "change-me");

    private ProductionSafety() {
    }

    static boolean production(Environment env) {
        return Arrays.asList(env.getActiveProfiles()).contains(PRODUCTION);
    }

    /** What makes this environment unfit for production; empty when it is fit. */
    static List<String> problems(Environment env) {
        List<String> problems = new ArrayList<>();
        for (String profile : env.getActiveProfiles()) {
            if (NOT_WITH_PRODUCTION.contains(profile)) {
                problems.add("profile '" + profile + "' is active together with 'prod'");
            }
        }
        Set<String> published = publishedValues();
        for (String key : SECRETS) {
            String value = get(env, key);
            if (value.isBlank()) {
                problems.add(key + " is not set");
            } else if (published.contains(value) || hasMarker(value)) {
                problems.add(key + " is a development or sandbox value from this repository");
            }
        }
        String otp = get(env, "blizz.otp.secret");
        if (!otp.isBlank() && otp.length() < 32) {
            problems.add("blizz.otp.secret is shorter than 32 characters");
        }
        String access = get(env, "blizz.auth.access-token-secret");
        if (!access.isBlank() && access.length() < 32) {
            problems.add("blizz.auth.access-token-secret is shorter than 32 characters");
        }
        String instance = get(env, "blizz.auth.instance-id");
        if (instance.isBlank()) {
            problems.add("blizz.auth.instance-id is not set");
        } else if (published.contains(instance)) {
            problems.add("blizz.auth.instance-id is the id of the development or sandbox instance");
        }
        for (String key : REAL_PROVIDERS) {
            if ("FAKE".equalsIgnoreCase(get(env, key))) {
                problems.add(key + " is FAKE");
            }
        }
        if ("true".equalsIgnoreCase(get(env, "blizz.payments.fake-merchants-allowed"))) {
            problems.add("blizz.payments.fake-merchants-allowed is true");
        }
        String bootstrap = get(env, "blizz.staff.bootstrap-password");
        if (!bootstrap.isBlank() && (published.contains(bootstrap) || hasMarker(bootstrap))) {
            problems.add("blizz.staff.bootstrap-password is the sandbox password");
        }
        for (String key : merchantSecretKeys(env)) {
            String value = get(env, key);
            if (published.contains(value) || hasMarker(value)) {
                problems.add(key + " is a sandbox value from this repository");
            }
        }
        String base = get(env, "blizz.payments.public-base-url");
        if (base.isBlank() || !base.toLowerCase(Locale.ROOT).startsWith("https://") || isLocal(base)) {
            problems.add("blizz.payments.public-base-url must be the instance's public https address");
        }
        String journal = get(env, "blizz.privacy.erasure-journal-dir");
        String tmp = System.getProperty("java.io.tmpdir", "/tmp");
        if (journal.isBlank() || journal.startsWith(tmp) || journal.startsWith("/tmp")) {
            problems.add("blizz.privacy.erasure-journal-dir is a temporary directory (it must survive restores)");
        }
        return problems;
    }

    /** A variable that is not set at all reads as empty, so it is listed with the rest instead of stopping the check. */
    private static String get(Environment env, String key) {
        try {
            return env.getProperty(key, "");
        } catch (IllegalArgumentException e) {
            return "";
        }
    }

    private static boolean hasMarker(String value) {
        String lower = value.toLowerCase(Locale.ROOT);
        return MARKERS.stream().anyMatch(lower::contains);
    }

    private static boolean isLocal(String url) {
        try {
            String host = URI.create(url).getHost();
            return host == null || host.equals("localhost") || host.startsWith("127.") || host.endsWith(".invalid");
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    private static List<String> merchantSecretKeys(Environment env) {
        List<String> keys = new ArrayList<>();
        if (env instanceof org.springframework.core.env.ConfigurableEnvironment configurable) {
            for (PropertySource<?> source : configurable.getPropertySources()) {
                if (source instanceof EnumerablePropertySource<?> e) {
                    for (String name : e.getPropertyNames()) {
                        if (name.startsWith("blizz.payments.secrets.") && !keys.contains(name)) {
                            keys.add(name);
                        }
                    }
                }
            }
        }
        return keys;
    }

    /** Every value written in the development and sandbox configuration of this repository. */
    static Set<String> publishedValues() {
        Set<String> values = new HashSet<>();
        for (String file : List.of("application-dev.yml", "application-sandbox.yml")) {
            Resource resource = new ClassPathResource(file);
            if (!resource.exists()) {
                continue;
            }
            try {
                for (PropertySource<?> source : new YamlPropertySourceLoader().load(file, resource)) {
                    if (source instanceof EnumerablePropertySource<?> e) {
                        for (String name : e.getPropertyNames()) {
                            Object raw = e.getProperty(name);
                            String value = raw == null ? "" : raw.toString();
                            // "${OTP_SECRET:sandbox-only-…}": the default after the colon is the published value.
                            if (value.startsWith("${") && value.endsWith("}") && value.contains(":")) {
                                value = value.substring(value.indexOf(':') + 1, value.length() - 1);
                            }
                            if (value.length() >= 8) {
                                values.add(value);
                            }
                        }
                    }
                }
            } catch (IOException e) {
                throw new IllegalStateException("Cannot read " + file, e);
            }
        }
        return values;
    }
}
