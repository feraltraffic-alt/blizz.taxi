package taxi.blizz.telephony.internal;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * @param otpProvider     LIVE: TurboSMS and Asterisk with the keys of the admin panel; FAKE: nothing leaves the
 *                        server, the codes are kept for development, tests and the sandbox — never a real environment
 * @param turbosmsBaseUrl the TurboSMS HTTP API
 * @param callTimeout     how long Asterisk lets the phone ring
 */
@ConfigurationProperties("blizz.telephony")
record TelephonyProperties(
        @DefaultValue("LIVE") String otpProvider,
        @DefaultValue("https://api.turbosms.ua") String turbosmsBaseUrl,
        @DefaultValue("PT30S") Duration callTimeout) {

    boolean fake() {
        return "FAKE".equalsIgnoreCase(otpProvider);
    }
}
