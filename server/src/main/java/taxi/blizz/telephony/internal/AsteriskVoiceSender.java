package taxi.blizz.telephony.internal;

import java.io.UncheckedIOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;
import taxi.blizz.identity.PhoneNumber;
import tools.jackson.databind.json.JsonMapper;

/**
 * The code by a call (ADR 0012 Q-18): Asterisk ARI originates a call to the configured endpoint and runs the dialplan
 * context {@value #CONTEXT}, which answers and says the digits of OTP_CODE twice (deploy/dev/asterisk). The code goes
 * only into that channel variable; it is never logged here. SENT means Asterisk started the call, not that the
 * person answered.
 */
@Component
class AsteriskVoiceSender implements OtpSender {

    static final String CONTEXT = "blizz-otp";

    private final Integrations integrations;
    private final TelephonyProperties properties;
    private final HttpTransport http;
    private final JsonMapper json;

    AsteriskVoiceSender(Integrations integrations, TelephonyProperties properties, HttpTransport http,
                        JsonMapper json) {
        this.integrations = integrations;
        this.properties = properties;
        this.http = http;
        this.json = json;
    }

    @Override
    public OtpChannel channel() {
        return OtpChannel.VOICE;
    }

    @Override
    public String provider() {
        return "ASTERISK";
    }

    @Override
    public Result send(PhoneNumber phone, String code, OtpAudience audience) {
        String url = integrations.value(Integrations.OTP_ASTERISK_ARI_URL).orElse(null);
        String user = integrations.value(Integrations.OTP_ASTERISK_ARI_USER).orElse(null);
        String password = integrations.value(Integrations.OTP_ASTERISK_ARI_PASSWORD).orElse(null);
        String endpoint = integrations.value(Integrations.OTP_ASTERISK_ENDPOINT).orElse(null);
        if (url == null || user == null || password == null || endpoint == null) {
            return Result.failed("Asterisk is not configured (ARI address, user, password, endpoint)");
        }
        String target = endpoint.replace("{phone}", phone.e164().substring(1));
        String originate = url.replaceAll("/+$", "") + "/ari/channels?endpoint=" + encode(target)
                + "&extension=s&context=" + CONTEXT + "&priority=1&timeout=" + properties.callTimeout().toSeconds();
        String auth = Base64.getEncoder().encodeToString((user + ":" + password).getBytes(StandardCharsets.UTF_8));
        HttpTransport.Response response;
        try {
            response = http.send("POST", originate,
                    Map.of("Authorization", "Basic " + auth, "Content-Type", "application/json"),
                    json.writeValueAsString(Map.of("variables", Map.of("OTP_CODE", code,
                            "OTP_LANGUAGE", phone.e164().startsWith("+48") ? "pl" : "uk"))));
        } catch (UncheckedIOException e) {
            return Result.unknown("No answer from Asterisk");
        }
        if (response.status() != 200) {
            return Result.failed("Asterisk answered HTTP " + response.status());
        }
        try {
            Object id = json.readValue(response.body(), Map.class).get("id");
            return Result.sent(id == null ? null : id.toString());
        } catch (RuntimeException e) {
            return Result.sent(null);
        }
    }

    private static String encode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }
}
