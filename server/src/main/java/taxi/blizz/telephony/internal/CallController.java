package taxi.blizz.telephony.internal;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;
import org.springframework.http.CacheControl;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.files.FileContent;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.telephony.Calls;

/** The call log of the operator workstation — operator.v1.yaml (REQ-OPS-01/08). */
@RestController
class CallController {

    private final Calls calls;
    private final CallRecordings recordings;

    CallController(Calls calls, CallRecordings recordings) {
        this.calls = calls;
        this.recordings = recordings;
    }

    record CallList(List<Calls.Call> calls) {
    }

    record Answer(@NotNull UUID commandId) {
    }

    @GetMapping("/api/operator/v1/calls")
    CallList recent(AccessClaims claims, @RequestParam(required = false) Calls.State state,
                    @RequestParam(name = "order_id", required = false) UUID orderId,
                    @RequestParam(defaultValue = "50") int limit) {
        return new CallList(calls.recent(claims.actor(), state, orderId, limit));
    }

    /**
     * The whole recording, audited per request; no public link, never cached. Written straight to the response, not as
     * a Resource: a player asks for {@code Range: bytes=0-}, which Spring would answer with 416 for a stream — this way
     * it gets the whole file (200, {@code Accept-Ranges: none}).
     */
    @GetMapping("/api/operator/v1/calls/{callId}/recording")
    void recording(AccessClaims claims, @PathVariable UUID callId, HttpServletResponse response) throws IOException {
        FileContent content = recordings.listen(claims.actor(), callId);
        try (InputStream in = content.stream()) {
            response.setStatus(HttpServletResponse.SC_OK);
            response.setContentType(content.contentType());
            response.setContentLengthLong(content.sizeBytes());
            response.setHeader(HttpHeaders.CACHE_CONTROL, CacheControl.noStore().cachePrivate().getHeaderValue());
            response.setHeader("X-Content-Type-Options", "nosniff");
            response.setHeader(HttpHeaders.ACCEPT_RANGES, "none");
            response.setHeader(HttpHeaders.CONTENT_DISPOSITION,
                    ContentDisposition.inline().filename("call-" + callId + ".wav").build().toString());
            in.transferTo(response.getOutputStream());
        }
    }

    @PostMapping("/api/operator/v1/calls/{callId}/answer")
    Calls.Call answer(AccessClaims claims, @PathVariable UUID callId, @Valid @RequestBody Answer body) {
        return calls.answer(claims.actor(), body.commandId(), callId);
    }
}
