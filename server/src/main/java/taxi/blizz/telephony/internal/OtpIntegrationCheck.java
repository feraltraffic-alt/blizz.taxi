package taxi.blizz.telephony.internal;

import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.IntegrationCheck;
import taxi.blizz.configuration.Integrations;
import tools.jackson.databind.json.JsonMapper;

/**
 * "Check the connection" of the otp group: TurboSMS answers the token (user/balance.json) and Asterisk answers ARI
 * (asterisk/info), for the providers that are configured. Nothing is sent and no key is shown.
 */
@Component
class OtpIntegrationCheck implements IntegrationCheck {

    private final Integrations integrations;
    private final TelephonyProperties properties;
    private final HttpTransport http;
    private final JsonMapper json;

    OtpIntegrationCheck(Integrations integrations, TelephonyProperties properties, HttpTransport http,
                        JsonMapper json) {
        this.integrations = integrations;
        this.properties = properties;
        this.http = http;
        this.json = json;
    }

    @Override
    public String group() {
        return Integrations.OTP;
    }

    @Override
    public Integrations.Check check() {
        if (properties.fake()) {
            return new Integrations.Check(group(), true, "This instance uses the fake provider: nothing is sent");
        }
        List<String> problems = new ArrayList<>();
        List<String> fine = new ArrayList<>();
        integrations.value(Integrations.OTP_TURBOSMS_TOKEN).ifPresentOrElse(token -> {
            if (ok("POST", properties.turbosmsBaseUrl() + "/user/balance.json", "Bearer " + token, true)) {
                fine.add("TurboSMS");
            } else {
                problems.add("TurboSMS did not accept the token");
            }
        }, () -> problems.add("TurboSMS has no token"));
        String url = integrations.value(Integrations.OTP_ASTERISK_ARI_URL).orElse(null);
        String user = integrations.value(Integrations.OTP_ASTERISK_ARI_USER).orElse(null);
        String password = integrations.value(Integrations.OTP_ASTERISK_ARI_PASSWORD).orElse(null);
        if (url == null || user == null || password == null) {
            problems.add("Asterisk is not configured");
        } else if (ok("GET", url.replaceAll("/+$", "") + "/ari/asterisk/info", "Basic " + Base64.getEncoder()
                .encodeToString((user + ":" + password).getBytes(StandardCharsets.UTF_8)), false)) {
            fine.add("Asterisk");
        } else {
            problems.add("Asterisk ARI did not answer or refused the user");
        }
        String message = (fine.isEmpty() ? "" : String.join(" and ", fine) + " answered. ")
                + String.join("; ", problems);
        return new Integrations.Check(group(), problems.isEmpty(), message.strip());
    }

    /** HTTP 200 and, for TurboSMS (which answers 200 to everything), response_code 0 in the body. */
    private boolean ok(String method, String url, String authorization, boolean turboSms) {
        try {
            HttpTransport.Response response = http.send(method, url, Map.of("Authorization", authorization), null);
            if (response.status() != 200) {
                return false;
            }
            return !turboSms || json.readValue(response.body(), Map.class).get("response_code") instanceof Number code
                    && code.intValue() == 0;
        } catch (UncheckedIOException | IllegalArgumentException e) {
            return false;
        } catch (RuntimeException e) {
            return false; // an unreadable answer
        }
    }
}
