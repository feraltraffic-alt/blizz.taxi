package taxi.blizz.telephony.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.telephony.Calls;

/** The call log of the operator workstation — operator.v1.yaml (REQ-OPS-01/08). */
@RestController
class CallController {

    private final Calls calls;

    CallController(Calls calls) {
        this.calls = calls;
    }

    record CallList(List<Calls.Call> calls) {
    }

    record Answer(@NotNull UUID commandId) {
    }

    @GetMapping("/api/operator/v1/calls")
    CallList recent(AccessClaims claims, @RequestParam(required = false) Calls.State state,
                    @RequestParam(defaultValue = "50") int limit) {
        return new CallList(calls.recent(claims.actor(), state, limit));
    }

    @PostMapping("/api/operator/v1/calls/{callId}/answer")
    Calls.Call answer(AccessClaims claims, @PathVariable UUID callId, @Valid @RequestBody Answer body) {
        return calls.answer(claims.actor(), body.commandId(), callId);
    }
}
