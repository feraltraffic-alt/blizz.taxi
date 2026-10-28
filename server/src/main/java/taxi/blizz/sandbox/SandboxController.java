package taxi.blizz.sandbox;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.telephony.FakeCallEvents;
import taxi.blizz.telephony.FakeOtpCodes;
import taxi.blizz.telephony.FakeTextMessages;

/**
 * {@code GET /sandbox/v1/otp?phone=…}: the last code the fake provider "sent" to the phone, by SMS or by a call
 * ({@code channel}); 404 when none. Sandbox only.
 */
@RestController
@Profile("sandbox")
class SandboxController {

    private final FakeOtpCodes codes;
    private final FakeCallEvents calls;
    private final FakeTextMessages texts;

    SandboxController(FakeOtpCodes codes, FakeCallEvents calls, FakeTextMessages texts) {
        this.codes = codes;
        this.calls = calls;
        this.texts = texts;
    }

    /**
     * {@code GET /sandbox/v1/sms?phone=…}: the texts the fake provider "sent" to the phone (a phone order's caller,
     * REQ-NTF-08), oldest first; codes are at {@code /sandbox/v1/otp}.
     */
    @GetMapping("/sandbox/v1/sms")
    java.util.List<FakeTextMessages.Sent> sms(@RequestParam String phone) {
        return texts.to(phone);
    }

    /**
     * {@code POST /sandbox/v1/calls/events}: an ARI event as the service's Asterisk would send it (ChannelCreated,
     * ChannelStateChange, ChannelDestroyed), handled like a real one — there is no Asterisk in the sandbox.
     */
    @PostMapping(value = "/sandbox/v1/calls/events", consumes = "application/json")
    ResponseEntity<Void> callEvent(@RequestBody String ariEvent) {
        return calls.push(ariEvent) ? ResponseEntity.accepted().build() : ResponseEntity.notFound().build();
    }

    /**
     * {@code GET /sandbox/v1/calls/originated}: the outgoing calls the server asked "Asterisk" for (click-to-call),
     * oldest first, with the number that went to Asterisk — what the panel never sees. The call's own events then come
     * through {@code /sandbox/v1/calls/events} with {@code channel_id} as the channel.
     */
    @GetMapping("/sandbox/v1/calls/originated")
    java.util.List<FakeCallEvents.Originated> originated() {
        return calls.originated();
    }

    @GetMapping("/sandbox/v1/otp")
    ResponseEntity<FakeOtpCodes.Sent> otp(@RequestParam String phone) {
        return codes.last(phone).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
