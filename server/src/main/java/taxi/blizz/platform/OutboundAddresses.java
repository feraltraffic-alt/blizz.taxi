package taxi.blizz.platform;

import java.net.URI;
import java.util.Set;

/**
 * Addresses the server connects to that staff typed in the admin panel (REQ-SEC-05): routing, Asterisk, later
 * partners. Without this check an admin field is a way to make the server call its own network — the cloud's
 * metadata service, a database, an internal panel (SSRF). An address must use one of the given schemes, carry no
 * user:password, and every address its host resolves to must be public. Private networks are allowed only for the
 * hosts the deployment lists in {@code blizz.security.outbound-private-hosts} (e.g. the service's own Asterisk);
 * link-local addresses (cloud metadata) never. Check on save and again before connecting: a DNS answer may change.
 */
public interface OutboundAddresses {

    /** The parsed address, or {@code VALIDATION_FAILED} saying why it is refused (never with the user:password). */
    URI check(String address, Set<String> schemes);
}
