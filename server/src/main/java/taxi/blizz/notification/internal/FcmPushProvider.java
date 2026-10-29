package taxi.blizz.notification.internal;

import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import tools.jackson.databind.json.JsonMapper;

/**
 * Firebase Cloud Messaging, HTTP v1 API: one message per device token. The service account signs a JWT that is
 * exchanged for an access token (kept until shortly before it runs out). Nothing personal goes into a push: the
 * title, the text and ids only (REQ-NTF-01).
 */
class FcmPushProvider implements PushProvider {

    static final String GOOGLE_TOKEN_URI = "https://oauth2.googleapis.com/token";


    /** The HTTP call; returns the status and the body. */
    interface Transport {
        Response post(String url, Map<String, String> headers, String contentType, String body);
    }

    record Response(int status, String body) {
    }

    private static final String SCOPE = "https://www.googleapis.com/auth/firebase.messaging";

    private final Transport http;
    private final JsonMapper json;
    private final Clock clock;
    private final String projectId;
    private final String clientEmail;
    private final String tokenUri;
    private final PrivateKey key;

    private String accessToken;
    private Instant accessTokenUntil = Instant.EPOCH;

    FcmPushProvider(Transport http, JsonMapper json, Clock clock, String projectId, String credentials) {
        if (projectId == null || projectId.isBlank() || credentials == null || credentials.isBlank()) {
            throw new IllegalStateException(
                    "Firebase needs the project id and the service account key (admin panel → Integrations, or "
                            + "blizz.push.fcm-project-id and blizz.push.fcm-credentials)");
        }
        this.http = http;
        this.json = json;
        this.clock = clock;
        this.projectId = projectId;
        Map<String, Object> account;
        try {
            @SuppressWarnings("unchecked")
            Map<String, Object> parsed = json.readValue(credentials, Map.class);
            account = parsed;
        } catch (RuntimeException e) {
            throw new IllegalStateException("The Firebase service account key is not JSON");
        }
        this.clientEmail = (String) account.get("client_email");
        // Google's token endpoint only: an address taken from a pasted JSON would let the panel make the server call
        // any host and port and read its answer as an error (REQ-SEC-05; audit 29.10.2026).
        Object uri = account.get("token_uri");
        if (uri != null && !GOOGLE_TOKEN_URI.equals(uri)) {
            throw new IllegalStateException("The service account's token_uri must be " + GOOGLE_TOKEN_URI);
        }
        this.tokenUri = GOOGLE_TOKEN_URI;
        this.key = privateKey((String) account.get("private_key"));
    }

    static PrivateKey privateKey(String pem) {
        if (pem == null) {
            throw new IllegalStateException("The FCM service account has no private_key");
        }
        String base64 = pem.replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "")
                .replaceAll("\\s", "");
        try {
            return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.getDecoder()
                    .decode(base64)));
        } catch (java.security.GeneralSecurityException | IllegalArgumentException e) {
            throw new IllegalStateException("The FCM service account private_key is not a PKCS#8 RSA key", e);
        }
    }

    @Override
    public Result send(String token, String platform, String title, String body, Map<String, String> data,
                       Duration ttl) {
        String bearer;
        try {
            bearer = accessToken();
        } catch (RuntimeException e) {
            return new Result(Outcome.RETRY, "FCM auth: " + e.getMessage());
        }
        long seconds = Math.max(0, ttl.toSeconds());
        Map<String, Object> message = new LinkedHashMap<>();
        message.put("token", token);
        message.put("notification", Map.of("title", title, "body", body));
        message.put("data", data);
        message.put("android", Map.of("priority", "high", "ttl", seconds + "s"));
        message.put("apns", Map.of("headers", Map.of("apns-priority", "10",
                "apns-expiration", String.valueOf(clock.instant().getEpochSecond() + seconds))));
        Response response;
        try {
            response = http.post("https://fcm.googleapis.com/v1/projects/" + projectId + "/messages:send",
                    Map.of("Authorization", "Bearer " + bearer), "application/json",
                    json.writeValueAsString(Map.of("message", message)));
        } catch (RuntimeException e) {
            return new Result(Outcome.RETRY, "FCM: " + e.getMessage());
        }
        return outcome(response);
    }

    /** FCM error codes: UNREGISTERED (404) and a token-shaped INVALID_ARGUMENT (400) mean the device is gone. */
    static Result outcome(Response response) {
        int status = response.status();
        if (status >= 200 && status < 300) {
            return new Result(Outcome.SENT, null);
        }
        String body = response.body() == null ? "" : response.body();
        String error = "FCM " + status + ": " + (body.length() > 300 ? body.substring(0, 300) : body);
        if (status == 404 || body.contains("UNREGISTERED")
                || (status == 400 && body.contains("INVALID_ARGUMENT") && body.contains("registration token"))) {
            return new Result(Outcome.INVALID_TOKEN, error);
        }
        return new Result(Outcome.RETRY, error);
    }

    /** Signs in without sending anything ("check the connection"); returns the service account's e-mail. */
    String signIn() {
        accessToken();
        return clientEmail;
    }

    String projectId() {
        return projectId;
    }

    private synchronized String accessToken() {
        Instant now = clock.instant();
        if (accessToken != null && now.isBefore(accessTokenUntil)) {
            return accessToken;
        }
        String assertion = assertion(now);
        Response response = http.post(tokenUri, Map.of(), "application/x-www-form-urlencoded",
                "grant_type=urn%3Aietf%3Aparams%3Aoauth%3Agrant-type%3Ajwt-bearer&assertion=" + assertion);
        if (response.status() != 200) {
            throw new IllegalStateException("token endpoint answered " + response.status());
        }
        @SuppressWarnings("unchecked")
        Map<String, Object> answer = json.readValue(response.body(), Map.class);
        accessToken = (String) answer.get("access_token");
        long expiresIn = answer.get("expires_in") instanceof Number n ? n.longValue() : 3600;
        accessTokenUntil = now.plusSeconds(Math.max(60, expiresIn - 300));
        return accessToken;
    }

    /** A JWT signed with the service account key (RS256), valid for an hour. */
    String assertion(Instant now) {
        Base64.Encoder b64 = Base64.getUrlEncoder().withoutPadding();
        String header = b64.encodeToString("{\"alg\":\"RS256\",\"typ\":\"JWT\"}".getBytes(StandardCharsets.UTF_8));
        Map<String, Object> claims = new LinkedHashMap<>();
        claims.put("iss", clientEmail);
        claims.put("scope", SCOPE);
        claims.put("aud", tokenUri);
        claims.put("iat", now.getEpochSecond());
        claims.put("exp", now.getEpochSecond() + 3600);
        String payload = b64.encodeToString(json.writeValueAsString(claims).getBytes(StandardCharsets.UTF_8));
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(key);
            signature.update((header + "." + payload).getBytes(StandardCharsets.US_ASCII));
            return header + "." + payload + "." + b64.encodeToString(signature.sign());
        } catch (java.security.GeneralSecurityException e) {
            throw new IllegalStateException("Cannot sign the FCM assertion", e);
        }
    }
}
