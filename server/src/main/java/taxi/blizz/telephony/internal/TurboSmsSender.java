package taxi.blizz.telephony.internal;

import java.io.UncheckedIOException;
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

    TurboSmsSender(Integrations integrations, ServiceSettings settings, TelephonyProperties properties,
                   HttpTransport http, JsonMapper json) {
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
        String token = integrations.value(Integrations.OTP_TURBOSMS_TOKEN).orElse(null);
        String sender = integrations.value(Integrations.OTP_TURBOSMS_SENDER).orElse(null);
        if (token == null || sender == null) {
            return Result.failed("TurboSMS is not configured (token and sender name)");
        }
        String body = json.writeValueAsString(Map.of(
                "recipients", List.of(phone.e164().substring(1)),
                "sms", Map.of("sender", sender, "text", text(code))));
        HttpTransport.Response response;
        try {
            response = http.send("POST", properties.turbosmsBaseUrl() + "/message/send.json",
                    Map.of("Authorization", "Bearer " + token, "Content-Type", "application/json"), body);
        } catch (UncheckedIOException e) {
            return Result.unknown("No answer from TurboSMS");
        }
        return result(response);
    }

    /** Short and the same in uk and ru: "Код 123456. <service>". */
    String text(String code) {
        return "Код " + code + ". " + settings.current().settings().brand().serviceName();
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
