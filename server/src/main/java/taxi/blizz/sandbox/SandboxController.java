package taxi.blizz.sandbox;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.telephony.FakeOtpCodes;

/**
 * {@code GET /sandbox/v1/otp?phone=…}: the last code the fake provider "sent" to the phone, by SMS or by a call
 * ({@code channel}); 404 when none. Sandbox only.
 */
@RestController
@Profile("sandbox")
class SandboxController {

    private final FakeOtpCodes codes;

    SandboxController(FakeOtpCodes codes) {
        this.codes = codes;
    }

    @GetMapping("/sandbox/v1/otp")
    ResponseEntity<FakeOtpCodes.Sent> otp(@RequestParam String phone) {
        return codes.last(phone).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
