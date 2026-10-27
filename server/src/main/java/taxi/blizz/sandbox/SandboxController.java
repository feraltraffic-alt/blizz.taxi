package taxi.blizz.sandbox;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** {@code GET /sandbox/v1/otp?phone=…}: the last SMS code sent to the phone; 404 when none. Sandbox only. */
@RestController
@Profile("sandbox")
class SandboxController {

    private final SandboxOtp otp;

    SandboxController(SandboxOtp otp) {
        this.otp = otp;
    }

    @GetMapping("/sandbox/v1/otp")
    ResponseEntity<SandboxOtp.Sent> otp(@RequestParam String phone) {
        return otp.last(phone).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
