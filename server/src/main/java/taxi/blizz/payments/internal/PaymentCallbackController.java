package taxi.blizz.payments.internal;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Provider-facing endpoints (providers.v1.yaml): notifications at serviceUrl, and the page the rider's web view
 * lands on when the provider is done. No bearer token: the notification is trusted only by its signature.
 */
@RestController
class PaymentCallbackController {

    private final PaymentNotifications notifications;

    PaymentCallbackController(PaymentNotifications notifications) {
        this.notifications = notifications;
    }

    @PostMapping(path = "/payments/v1/callbacks/{merchantId}", consumes = MediaType.ALL_VALUE)
    ResponseEntity<Map<String, Object>> callback(@PathVariable UUID merchantId,
                                                 @RequestBody(required = false) String raw) {
        PaymentNotifications.Answer answer = notifications.receive(merchantId, parse(raw));
        return answer.trusted() ? ResponseEntity.ok(answer.body()) : ResponseEntity.badRequest().build();
    }

    @RequestMapping(path = "/payments/v1/return", method = {RequestMethod.GET, RequestMethod.POST},
            produces = MediaType.TEXT_HTML_VALUE)
    String returned() {
        return "<!doctype html><meta charset=\"utf-8\"><title>OK</title><p>Готово. Можно вернуться в приложение.</p>";
    }

    /**
     * WayForPay posts JSON; some setups send the JSON as the only key of a form body ({@code {...}=}). Both are read
     * as JSON; a plain form is read as fields.
     */
    @SuppressWarnings("unchecked")
    static Map<String, Object> parse(String raw) {
        if (raw == null || raw.isBlank()) {
            return Map.of();
        }
        String text = raw.strip();
        if (!text.startsWith("{")) {
            String decoded = URLDecoder.decode(text, StandardCharsets.UTF_8);
            if (decoded.startsWith("{")) {
                text = decoded.endsWith("=") ? decoded.substring(0, decoded.length() - 1) : decoded;
            } else {
                Map<String, Object> form = new LinkedHashMap<>();
                for (String pair : text.split("&")) {
                    int at = pair.indexOf('=');
                    if (at > 0) {
                        form.put(URLDecoder.decode(pair.substring(0, at), StandardCharsets.UTF_8),
                                URLDecoder.decode(pair.substring(at + 1), StandardCharsets.UTF_8));
                    }
                }
                return form;
            }
        }
        try {
            return PaymentsConfiguration.PROVIDER_JSON.readValue(text, Map.class);
        } catch (RuntimeException e) {
            return Map.of();
        }
    }
}
