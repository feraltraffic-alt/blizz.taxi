package taxi.blizz.telephony.internal;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * @param otpProvider     LIVE: TurboSMS and Asterisk with the keys of the admin panel; FAKE: nothing leaves the
 *                        server, the codes are kept for development, tests and the sandbox — never a real environment
 * @param turbosmsBaseUrl the TurboSMS HTTP API
 * @param callTimeout     how long Asterisk lets the phone ring
 * @param callsEnabled    listen to Asterisk's events of incoming calls (ARI WebSocket of the app {@code blizz-calls});
 *                        with the FAKE provider the events come from {@code FakeCallEvents} instead
 * @param callStaleAfter  a call whose end Asterisk never reported (the connection was down) is closed after this
 * @param callSweepEnabled run the closing of such calls on a timer in this process
 * @param recordingSweepEnabled fetch the recordings of finished calls from Asterisk on a timer in this process
 * @param recordingGiveUpAfter  Asterisk still has no recording of a call this long after it ended: there is none (NONE)
 * @param recordingMaxBytes     largest recording accepted (WAV at 8 kHz: about 58 MB an hour)
 * @param extensionEndpoint     how Asterisk names a staff member's phone; {@code {extension}} is their internal number
 * @param outgoingContext       the dialplan context click-to-call sends the operator's phone to (issue #67)
 * @param quietContexts         contexts whose channels are never calls to log, so no "not a service number" warning
 */
@ConfigurationProperties("blizz.telephony")
record TelephonyProperties(
        @DefaultValue("LIVE") String otpProvider,
        @DefaultValue("https://api.turbosms.ua") String turbosmsBaseUrl,
        @DefaultValue("PT30S") Duration callTimeout,
        @DefaultValue("true") boolean callsEnabled,
        @DefaultValue("PT4H") Duration callStaleAfter,
        @DefaultValue("true") boolean callSweepEnabled,
        @DefaultValue("true") boolean recordingSweepEnabled,
        @DefaultValue("PT1H") Duration recordingGiveUpAfter,
        @DefaultValue("268435456") long recordingMaxBytes,
        @DefaultValue("PJSIP/{extension}") String extensionEndpoint,
        @DefaultValue("blizz-outgoing") String outgoingContext,
        @DefaultValue({"blizz-outgoing", "from-internal"}) java.util.List<String> quietContexts) {

    /** The Asterisk endpoint of an extension, e.g. {@code PJSIP/101}. */
    String endpoint(String extension) {
        return extensionEndpoint.replace("{extension}", extension);
    }

    /**
     * The extension in a channel's name ({@code PJSIP/101-0000002a} → {@code 101}), or null when the name is not a
     * staff phone's channel.
     */
    String extensionOf(String channelName) {
        if (channelName == null) {
            return null;
        }
        int at = extensionEndpoint.indexOf("{extension}");
        String prefix = extensionEndpoint.substring(0, Math.max(at, 0));
        int dash = channelName.lastIndexOf('-');
        if (at < 0 || !channelName.startsWith(prefix) || dash <= prefix.length()) {
            return null;
        }
        String extension = channelName.substring(prefix.length(), dash);
        return extension.matches("^[0-9]{2,6}$") ? extension : null;
    }

    boolean fake() {
        return "FAKE".equalsIgnoreCase(otpProvider);
    }
}
