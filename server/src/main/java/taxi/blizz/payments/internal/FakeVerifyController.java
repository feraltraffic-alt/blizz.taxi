package taxi.blizz.payments.internal;

import java.net.URI;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The FAKE provider's "add a card" page: works only for merchants with provider FAKE (tests, sandbox). It checks the
 * form like WayForPay does, approves (or declines when {@code fake_decline} is sent) and delivers a signed
 * notification exactly as the provider would, then sends the web view to returnUrl. Also the FAKE payment page of a
 * top-up, below. Exists only where FAKE merchants are allowed ({@code blizz.payments.fake-merchants-allowed}); on a real
 * server these paths answer 404 (audit of 28.10.2026).
 */
@RestController
@ConditionalOnProperty(prefix = "blizz.payments", name = "fake-merchants-allowed", havingValue = "true")
class FakeVerifyController {

    private final Merchants merchants;
    private final PaymentNotifications notifications;
    private final FakeProvider.Gateway gateway;

    FakeVerifyController(Merchants merchants, PaymentNotifications notifications, FakeProvider.Gateway gateway) {
        this.merchants = merchants;
        this.notifications = notifications;
        this.gateway = gateway;
    }

    @PostMapping(path = "/payments/v1/fake/verify", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    ResponseEntity<Void> verify(@RequestParam MultiValueMap<String, String> form) {
        String account = form.getFirst("merchantAccount");
        Merchant merchant = merchants.byAccount("FAKE", account == null ? "" : account).orElse(null);
        if (merchant == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        String reference = form.getFirst("orderReference");
        String expected = WayForPayProvider.sign(merchant, account, form.getFirst("merchantDomainName"), reference,
                form.getFirst("amount"), form.getFirst("currency"));
        String given = form.getFirst("merchantSignature");
        if (given == null || !MessageDigest.isEqual(expected.getBytes(StandardCharsets.US_ASCII),
                given.getBytes(StandardCharsets.US_ASCII))) {
            return ResponseEntity.badRequest().build();
        }
        boolean decline = form.containsKey("fake_decline");
        String status = decline ? "Declined" : "Approved";
        String reasonCode = decline ? "1105" : "1100";
        String pan = "41****" + String.format("%04d", Math.floorMod(reference.hashCode(), 10000));
        Map<String, Object> notification = new LinkedHashMap<>();
        notification.put("merchantAccount", account);
        notification.put("orderReference", reference);
        notification.put("amount", "0");
        notification.put("currency", form.getFirst("currency"));
        notification.put("authCode", "");
        notification.put("cardPan", pan);
        notification.put("cardType", "Visa");
        notification.put("transactionStatus", status);
        notification.put("reasonCode", reasonCode);
        notification.put("reason", decline ? "Card declined" : "Ok");
        if (!decline) {
            notification.put("recToken", "fake-" + UUID.randomUUID());
        }
        notification.put("merchantSignature", WayForPayProvider.sign(merchant, account, reference, "0",
                form.getFirst("currency"), "", pan, status, reasonCode));
        notifications.receive(merchant.id(), notification);
        String returnUrl = form.getFirst("returnUrl");
        return returnUrl == null ? ResponseEntity.ok().build()
                : ResponseEntity.status(HttpStatus.SEE_OTHER).location(URI.create(returnUrl)).build();
    }
    /**
     * The FAKE provider's payment page (a top-up): checks the form like WayForPay, takes the payment (or declines with
     * {@code fake_decline}) and delivers a signed notification; {@code fake_lost_notification} takes the payment but
     * never notifies, so the server has to ask with CHECK_STATUS.
     */
    @PostMapping(path = "/payments/v1/fake/pay", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    ResponseEntity<Void> pay(@RequestParam MultiValueMap<String, String> form) {
        String account = form.getFirst("merchantAccount");
        Merchant merchant = merchants.byAccount("FAKE", account == null ? "" : account).orElse(null);
        if (merchant == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        String reference = form.getFirst("orderReference");
        String amount = form.getFirst("amount");
        String currency = form.getFirst("currency");
        String expected = WayForPayProvider.sign(merchant, account, form.getFirst("merchantDomainName"), reference,
                form.getFirst("orderDate"), amount, currency, form.getFirst("productName[]"),
                form.getFirst("productCount[]"), form.getFirst("productPrice[]"));
        String given = form.getFirst("merchantSignature");
        if (given == null || !MessageDigest.isEqual(expected.getBytes(StandardCharsets.US_ASCII),
                given.getBytes(StandardCharsets.US_ASCII))) {
            return ResponseEntity.badRequest().build();
        }
        boolean decline = form.containsKey("fake_decline");
        String status = decline ? "Declined" : "Approved";
        String reasonCode = decline ? "1105" : "1100";
        String pan = "41****" + String.format("%04d", Math.floorMod(reference.hashCode(), 10000));
        gateway.record(reference, status);
        if (!form.containsKey("fake_lost_notification")) {
            Map<String, Object> notification = new LinkedHashMap<>();
            notification.put("merchantAccount", account);
            notification.put("orderReference", reference);
            notification.put("amount", amount);
            notification.put("currency", currency);
            notification.put("authCode", decline ? "" : "FAKE01");
            notification.put("cardPan", pan);
            notification.put("cardType", "Visa");
            notification.put("transactionStatus", status);
            notification.put("reasonCode", reasonCode);
            notification.put("reason", decline ? "Card declined" : "Ok");
            notification.put("merchantSignature", WayForPayProvider.sign(merchant, account, reference, amount,
                    currency, decline ? "" : "FAKE01", pan, status, reasonCode));
            notifications.receive(merchant.id(), notification);
        }
        String returnUrl = form.getFirst("returnUrl");
        return returnUrl == null ? ResponseEntity.ok().build()
                : ResponseEntity.status(HttpStatus.SEE_OTHER).location(URI.create(returnUrl)).build();
    }
}
