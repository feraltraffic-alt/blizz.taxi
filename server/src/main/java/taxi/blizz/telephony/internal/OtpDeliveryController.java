package taxi.blizz.telephony.internal;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.telephony.OtpDeliveries;

/** How codes reached a phone, for support — admin.v1.yaml (ADR 0012 Q-18). */
@RestController
class OtpDeliveryController {

    private final OtpDeliveries deliveries;

    OtpDeliveryController(OtpDeliveries deliveries) {
        this.deliveries = deliveries;
    }

    record DeliveryList(List<OtpDeliveries.Attempt> deliveries) {
    }

    @GetMapping("/api/admin/v1/otp-deliveries")
    DeliveryList list(AccessClaims claims, @RequestParam String phone, @RequestParam(defaultValue = "20") int limit) {
        return new DeliveryList(deliveries.forPhone(claims.actor(), phone, limit));
    }
}
