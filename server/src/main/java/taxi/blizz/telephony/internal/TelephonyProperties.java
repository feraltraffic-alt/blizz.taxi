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
 */
@ConfigurationProperties("blizz.telephony")
record TelephonyProperties(
        @DefaultValue("LIVE") String otpProvider,
        @DefaultValue("https://api.turbosms.ua") String turbosmsBaseUrl,
        @DefaultValue("PT30S") Duration callTimeout,
        @DefaultValue("true") boolean callsEnabled,
        @DefaultValue("PT4H") Duration callStaleAfter,
        @DefaultValue("true") boolean callSweepEnabled) {

    boolean fake() {
        return "FAKE".equalsIgnoreCase(otpProvider);
    }
}
