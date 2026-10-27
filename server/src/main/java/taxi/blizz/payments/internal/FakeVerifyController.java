package taxi.blizz.payments.internal;

import java.net.URI;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
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
 * notification exactly as the provider would, then sends the web view to returnUrl.
 */
@RestController
class FakeVerifyController {

    private final Merchants merchants;
    private final PaymentNotifications notifications;

    FakeVerifyController(Merchants merchants, PaymentNotifications notifications) {
        this.merchants = merchants;
        this.notifications = notifications;
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
}
