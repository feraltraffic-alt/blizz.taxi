package taxi.blizz.identity.internal;

import java.util.List;
import java.util.regex.Pattern;

/**
 * What a blocked driver may still do (REQ-DS-01, issue #141, answer of the lead on the plan): read everything (GET),
 * finish the current trip, keep the shift's connection and end it, report positions, reach support and keep push
 * devices. Anything else answers 403 ACCOUNT_BLOCKED, so no new work starts: no shift, resume, offer, claim,
 * pre-order, profile, document, vehicle, legal acceptance, phone change, top-up or transfer.
 */
final class DriverLimitedSession {

    private static final String SEGMENT = "[^/]+";

    private static final List<Pattern> COMMANDS = List.of(
            path("/api/driver/v1/trips/" + SEGMENT + "/(arrive|start|complete|cancel|no-show|messages)"),
            path("/api/driver/v1/work-sessions/" + SEGMENT + "/(heartbeat|pause|close|handover)"),
            path("/api/driver/v1/location-batches"),
            path("/api/driver/v1/support/cases"),
            path("/api/driver/v1/support/cases/" + SEGMENT + "/messages"),
            path("/api/driver/v1/support/uploads"),
            // The bytes of a support upload; a document upload session cannot be opened (documents/upload-sessions).
            path("/api/driver/v1/uploads/" + SEGMENT),
            path("/api/driver/v1/push-devices"),
            path("/api/driver/v1/push-devices/" + SEGMENT + "/remove"));

    private DriverLimitedSession() {
    }

    static boolean allows(String method, String path) {
        if ("GET".equals(method) || "HEAD".equals(method) || "OPTIONS".equals(method)) {
            return true;
        }
        return COMMANDS.stream().anyMatch(p -> p.matcher(path).matches());
    }

    private static Pattern path(String regex) {
        return Pattern.compile(regex + "/?");
    }
}
