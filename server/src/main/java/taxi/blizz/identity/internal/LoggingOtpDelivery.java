package taxi.blizz.identity.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpDelivery;
import taxi.blizz.identity.PhoneNumber;

/**
 * Development stand-in for the SMS provider: writes the code to the log. Exists only in the
 * {@code dev} profile; other environments fail to start until a real provider is configured.
 */
@Component
@Profile("dev & !sandbox")
class LoggingOtpDelivery implements OtpDelivery {

    private static final Logger log = LoggerFactory.getLogger(LoggingOtpDelivery.class);

    @Override
    public void send(PhoneNumber phone, String code, OtpAudience audience) {
        log.info("[dev only] {} code for {}: {}", audience, phone.masked(), code);
    }
}
