package taxi.blizz.telephony.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;

/** The service numbers and their cities in the admin panel — admin.v1.yaml (issue #64). */
@RestController
class CallLineController {

    private final CallLines lines;

    CallLineController(CallLines lines) {
        this.lines = lines;
    }

    record LineList(List<CallLines.Line> lines) {
    }

    record ChangeBody(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, UUID cityId, String label,
                      @NotBlank String reason) {
    }

    @GetMapping("/api/admin/v1/call-lines")
    LineList list(AccessClaims claims) {
        return new LineList(lines.list(claims.actor()));
    }

    @PostMapping("/api/admin/v1/call-lines/{number}")
    CallLines.Line change(AccessClaims claims, @PathVariable String number, @Valid @RequestBody ChangeBody body) {
        return lines.change(claims.actor(), body.commandId(), number, body.expectedVersion(), body.cityId(),
                body.label(), body.reason());
    }
}
