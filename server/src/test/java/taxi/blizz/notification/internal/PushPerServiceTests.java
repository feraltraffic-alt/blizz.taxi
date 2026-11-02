package taxi.blizz.notification.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.KeyPair;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import taxi.blizz.configuration.Integrations;
import tools.jackson.databind.json.JsonMapper;

/**
 * ADR 0016, issue #217: a push to a rider of service A goes through A's own Firebase project, one to a rider of B
 * through B's; a service with no project of its own sends nothing, never through another's.
 */
class PushPerServiceTests {

    static final JsonMapper JSON = JsonMapper.builder().build();
    static final UUID A = UUID.randomUUID();
    static final UUID B = UUID.randomUUID();

    final List<String> urls = new ArrayList<>();
    final Deque<FcmPushProvider.Response> answers = new ArrayDeque<>();

    private static String credentials(KeyPair keys, String email) {
        String pem = "-----BEGIN PRIVATE KEY-----\n"
                + Base64.getMimeEncoder().encodeToString(keys.getPrivate().getEncoded())
                + "\n-----END PRIVATE KEY-----\n";
        return JSON.writeValueAsString(Map.of("type", "service_account", "client_email", email, "private_key", pem,
                "token_uri", "https://oauth2.googleapis.com/token"));
    }

    /** The panel's values by service, as Integrations gives them. */
    private static Integrations panel(Map<UUID, Map<String, String>> values) {
        return (Integrations) java.lang.reflect.Proxy.newProxyInstance(Integrations.class.getClassLoader(),
                new Class<?>[] {Integrations.class}, (proxy, method, args) -> switch (method.getName()) {
                    case "value" -> Optional.ofNullable(values.getOrDefault((UUID) args[0], Map.of())
                            .get((String) args[1]));
                    case "revision" -> 1L;
                    default -> throw new UnsupportedOperationException(method.getName());
                });
    }

    @Test
    void eachServicesPushGoesThroughItsOwnFirebaseProject() throws Exception {
        KeyPair keys = FcmPushProviderTests.keys();
        Map<UUID, Map<String, String>> values = Map.of(
                A, Map.of(Integrations.FCM_PROJECT_ID, "taxi-a",
                        Integrations.FCM_CREDENTIALS, credentials(keys, "push@taxi-a.iam.gserviceaccount.com")),
                B, Map.of(Integrations.FCM_PROJECT_ID, "taxi-b",
                        Integrations.FCM_CREDENTIALS, credentials(keys, "push@taxi-b.iam.gserviceaccount.com")));
        ConfiguredFcmProvider push = new ConfiguredFcmProvider(panel(values),
                new PushProperties("FCM", null, null, false, Duration.ofSeconds(1), Duration.ZERO),
                (url, headers, contentType, body) -> {
                    urls.add(url);
                    return answers.poll();
                }, JSON, Clock.fixed(Instant.parse("2026-11-02T12:00:00Z"), ZoneOffset.UTC));

        answers.add(new FcmPushProvider.Response(200, "{\"access_token\":\"at-a\",\"expires_in\":3600}"));
        answers.add(new FcmPushProvider.Response(200, "{\"name\":\"projects/taxi-a/messages/1\"}"));
        assertThat(push.send(A, "token-a", "ANDROID", "t", "b", Map.of(), Duration.ofMinutes(1)).outcome())
                .isEqualTo(PushProvider.Outcome.SENT);
        answers.add(new FcmPushProvider.Response(200, "{\"access_token\":\"at-b\",\"expires_in\":3600}"));
        answers.add(new FcmPushProvider.Response(200, "{\"name\":\"projects/taxi-b/messages/1\"}"));
        assertThat(push.send(B, "token-b", "ANDROID", "t", "b", Map.of(), Duration.ofMinutes(1)).outcome())
                .isEqualTo(PushProvider.Outcome.SENT);
        assertThat(urls).filteredOn(u -> u.contains("messages:send")).containsExactly(
                "https://fcm.googleapis.com/v1/projects/taxi-a/messages:send",
                "https://fcm.googleapis.com/v1/projects/taxi-b/messages:send");

        int before = urls.size();
        assertThat(push.send(UUID.randomUUID(), "token-c", "ANDROID", "t", "b", Map.of(), Duration.ofMinutes(1))
                .outcome()).as("a service with no project of its own").isEqualTo(PushProvider.Outcome.RETRY);
        assertThat(push.send("token-d", "ANDROID", "t", "b", Map.of(), Duration.ofMinutes(1)).outcome())
                .as("no service named").isEqualTo(PushProvider.Outcome.RETRY);
        assertThat(urls).as("nothing went out for them").hasSize(before);
    }
}
