package taxi.blizz.notification.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
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
import org.junit.jupiter.api.Test;
import tools.jackson.databind.json.JsonMapper;

/** The FCM HTTP v1 adapter without the network: the signed assertion, the message and the error mapping. */
class FcmPushProviderTests {

    static final JsonMapper JSON = JsonMapper.builder().build();
    static final Instant NOW = Instant.parse("2026-10-27T12:00:00Z");

    record Call(String url, Map<String, String> headers, String contentType, String body) {
    }

    final List<Call> calls = new ArrayList<>();
    final Deque<FcmPushProvider.Response> answers = new ArrayDeque<>();

    FcmPushProvider provider(KeyPair keys) {
        String pem = "-----BEGIN PRIVATE KEY-----\n"
                + Base64.getMimeEncoder().encodeToString(keys.getPrivate().getEncoded())
                + "\n-----END PRIVATE KEY-----\n";
        String credentials = JSON.writeValueAsString(Map.of("type", "service_account",
                "client_email", "push@blizz-test.iam.gserviceaccount.com", "private_key", pem,
                "token_uri", "https://oauth2.example.test/token"));
        return new FcmPushProvider((url, headers, contentType, body) -> {
            calls.add(new Call(url, headers, contentType, body));
            return answers.poll();
        }, JSON, Clock.fixed(NOW, ZoneOffset.UTC), "blizz-test", credentials);
    }

    static KeyPair keys() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        return generator.generateKeyPair();
    }

    @Test
    @SuppressWarnings("unchecked")
    void signsInSendsAndKeepsTheAccessToken() throws Exception {
        KeyPair keys = keys();
        FcmPushProvider fcm = provider(keys);
        answers.add(new FcmPushProvider.Response(200, "{\"access_token\":\"at-1\",\"expires_in\":3600}"));
        answers.add(new FcmPushProvider.Response(200, "{\"name\":\"projects/blizz-test/messages/1\"}"));
        answers.add(new FcmPushProvider.Response(200, "{\"name\":\"projects/blizz-test/messages/2\"}"));

        PushProvider.Result result = fcm.send("device-token", "ANDROID", "New order", "Accept it",
                Map.of("type", "driver.offer"), Duration.ofSeconds(30));
        assertThat(result.outcome()).isEqualTo(PushProvider.Outcome.SENT);
        fcm.send("device-token", "IOS", "t", "b", Map.of(), Duration.ofMinutes(10));
        assertThat(calls).as("one sign-in for both").hasSize(3);

        Call signIn = calls.getFirst();
        assertThat(signIn.url()).isEqualTo("https://oauth2.example.test/token");
        String assertion = signIn.body().substring(signIn.body().indexOf("assertion=") + "assertion=".length());
        String[] parts = assertion.split("\\.");
        Signature verify = Signature.getInstance("SHA256withRSA");
        verify.initVerify(keys.getPublic());
        verify.update((parts[0] + "." + parts[1]).getBytes(StandardCharsets.US_ASCII));
        assertThat(verify.verify(Base64.getUrlDecoder().decode(parts[2]))).as("signed by the service account").isTrue();
        Map<String, Object> claims = JSON.readValue(Base64.getUrlDecoder().decode(parts[1]), Map.class);
        assertThat(claims).containsEntry("iss", "push@blizz-test.iam.gserviceaccount.com")
                .containsEntry("aud", "https://oauth2.example.test/token")
                .containsEntry("scope", "https://www.googleapis.com/auth/firebase.messaging");

        Call send = calls.get(1);
        assertThat(send.url()).isEqualTo("https://fcm.googleapis.com/v1/projects/blizz-test/messages:send");
        assertThat(send.headers()).containsEntry("Authorization", "Bearer at-1");
        Map<String, Object> message = (Map<String, Object>) JSON.readValue(send.body(), Map.class).get("message");
        assertThat(message).containsEntry("token", "device-token")
                .containsEntry("notification", Map.of("title", "New order", "body", "Accept it"))
                .containsEntry("data", Map.of("type", "driver.offer"));
        assertThat((Map<String, Object>) message.get("android")).containsEntry("ttl", "30s")
                .containsEntry("priority", "high");
    }

    @Test
    void mapsTheAnswers() {
        assertThat(FcmPushProvider.outcome(new FcmPushProvider.Response(404,
                "{\"error\":{\"status\":\"NOT_FOUND\",\"details\":[{\"errorCode\":\"UNREGISTERED\"}]}}")).outcome())
                .isEqualTo(PushProvider.Outcome.INVALID_TOKEN);
        assertThat(FcmPushProvider.outcome(new FcmPushProvider.Response(400,
                "{\"error\":{\"status\":\"INVALID_ARGUMENT\",\"message\":\"The registration token is not a valid "
                        + "FCM registration token\"}}")).outcome())
                .isEqualTo(PushProvider.Outcome.INVALID_TOKEN);
        assertThat(FcmPushProvider.outcome(new FcmPushProvider.Response(503, "unavailable")).outcome())
                .isEqualTo(PushProvider.Outcome.RETRY);
        assertThat(FcmPushProvider.outcome(new FcmPushProvider.Response(429, "quota")).outcome())
                .isEqualTo(PushProvider.Outcome.RETRY);
    }

    @Test
    void aFailedSignInIsRetriedLaterAndMissingKeysStopTheStart() throws Exception {
        FcmPushProvider fcm = provider(keys());
        answers.add(new FcmPushProvider.Response(500, "oops"));
        assertThat(fcm.send("t", "ANDROID", "a", "b", Map.of(), Duration.ofSeconds(5)).outcome())
                .isEqualTo(PushProvider.Outcome.RETRY);
        assertThatThrownBy(() -> new FcmPushProvider((u, h, c, b) -> null, JSON, Clock.systemUTC(), "p", ""))
                .isInstanceOf(IllegalStateException.class).hasMessageContaining("fcm-credentials");
    }
}
