package taxi.blizz.telephony.internal;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

/** Asking Asterisk for channels (issue #67): ARI on a real instance, {@link FakeChannels} with the FAKE provider. */
interface ChannelControl {

    /** STARTED — Asterisk took it; ALREADY_EXISTS — a channel with this id exists: the call is already being placed. */
    enum Originated {
        STARTED, ALREADY_EXISTS
    }

    /**
     * Rings {@code endpoint} and sends it to {@code context} (extension {@code s}) with {@code variables}, as the
     * channel {@code channelId}. Asterisk unreachable or refusing throws; the exception never carries the variables.
     */
    Originated originate(String channelId, String endpoint, String context, Map<String, String> variables)
            throws IOException;

    /**
     * Asterisk answered and did not take the request, or it cannot be asked at all (not configured): nothing was
     * started. Any other IOException leaves the outcome unknown — the request may have reached Asterisk.
     */
    final class Refused extends IOException {
        Refused(String message) {
            super(message);
        }
    }

    /** The ids of the channels Asterisk has now. */
    Set<String> channels() throws IOException;
}
