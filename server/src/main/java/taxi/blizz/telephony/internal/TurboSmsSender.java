package taxi.blizz.telephony.internal;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;
import taxi.blizz.identity.PhoneNumber;
import tools.jackson.databind.json.JsonMapper;

/**
 * The code by SMS through TurboSMS (ADR 0012 Q-18): {@code POST /message/send.json} with the token of the admin panel
 * as a bearer token; the number without "+"; success is response_code 0 with a message_id for the recipient. TurboSMS
 * asks not to time out a send (a resend would duplicate it), so no answer is UNKNOWN, never a retry here.
 */
@Component
class TurboSmsSender implements OtpSender {

    private final Integrations integrations;
    private final ServiceSettings settings;
    private final TelephonyProperties properties;
    private final HttpTransport http;
    private final JsonMapper json;

    private final taxi.blizz.platform.ProviderBreakers breakers;

    TurboSmsSender(Integrations integrations, ServiceSettings settings, TelephonyProperties properties,
                   HttpTransport http, JsonMapper json) {
        this(integrations, settings, properties, http, json, taxi.blizz.platform.ProviderBreakers.none());
    }

    @org.springframework.beans.factory.annotation.Autowired
    TurboSmsSender(Integrations integrations, ServiceSettings settings, TelephonyProperties properties,
                   HttpTransport http, JsonMapper json, taxi.blizz.platform.ProviderBreakers breakers) {
        this.breakers = breakers;
        this.integrations = integrations;
        this.settings = settings;
        this.properties = properties;
        this.http = http;
        this.json = json;
    }

    @Override
    public OtpChannel channel() {
        return OtpChannel.SMS;
    }

    @Override
    public String provider() {
        return "TURBOSMS";
    }

    @Override
    public Result send(PhoneNumber phone, String code, OtpAudience audience) {
        return sendText(phone, text(code, phone));
    }

    /** Any text: a code, or a notice to a phone order's caller (REQ-NTF-08). */
    Result sendText(PhoneNumber phone, String text) {
        String token = integrations.value(Integrations.OTP_TURBOSMS_TOKEN).orElse(null);
        String sender = integrations.value(Integrations.OTP_TURBOSMS_SENDER).orElse(null);
        if (token == null || sender == null) {
            return Result.failed("TurboSMS is not configured (token and sender name)");
        }
        String body = json.writeValueAsString(Map.of(
                "recipients", List.of(phone.e164().substring(1)),
                "sms", Map.of("sender", sender, "text", text)));
        // Behind the TURBOSMS breaker (REQ-ENG-07): while it is open nothing is sent and the result is FAILED at once,
        // so a code goes on to the call channel and a caller's SMS to its back-off.
        return breakers.call(taxi.blizz.platform.ProviderBreakers.Provider.TURBOSMS,
                () -> result(http.send("POST", properties.turbosmsBaseUrl() + "/message/send.json",
                        Map.of("Authorization", "Bearer " + token, "Content-Type", "application/json"), body)),
                r -> r.state() == State.UNKNOWN || (r.error() != null && r.error().startsWith("TurboSMS answered HTTP 5")),
                e -> Result.unknown("No answer from TurboSMS"),
                () -> Result.failed("TurboSMS is unavailable (breaker open)"));
    }

    /**
     * Short, in the language of the number's country: "Kod 123456. <service>" for Poland, "Код 123456. <service>"
     * otherwise (the same word in Ukrainian and Russian).
     */
    String text(String code, PhoneNumber phone) {
        String word = phone.e164().startsWith("+48") ? "Kod " : "Код ";
        return word + code + ". " + settings.current().settings().brand().serviceName();
    }

    @SuppressWarnings("unchecked")
    private Result result(HttpTransport.Response response) {
        if (response.status() != 200) {
            return Result.failed("TurboSMS answered HTTP " + response.status());
        }
        Map<String, Object> answer;
        try {
            answer = json.readValue(response.body(), Map.class);
        } catch (RuntimeException e) {
            return Result.unknown("TurboSMS answered something unreadable");
        }
        if (answer.get("response_result") instanceof List<?> results && !results.isEmpty()
                && results.getFirst() instanceof Map<?, ?> recipient) {
            Object messageId = recipient.get("message_id");
            if (Integer.valueOf(0).equals(number(recipient.get("response_code"))) && messageId != null) {
                return Result.sent(messageId.toString());
            }
            return Result.failed("TurboSMS: " + recipient.get("response_status"));
        }
        return Result.failed("TurboSMS: " + answer.get("response_status"));
    }

    private static Integer number(Object value) {
        return value instanceof Number n ? n.intValue() : null;
    }
}
