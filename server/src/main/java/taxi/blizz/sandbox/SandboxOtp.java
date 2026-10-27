package taxi.blizz.sandbox;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpDelivery;
import taxi.blizz.identity.PhoneNumber;

/** Keeps the last code per phone in memory instead of sending an SMS; read through {@link SandboxController}. */
@Component
@Profile("sandbox")
class SandboxOtp implements OtpDelivery {

    private static final Logger log = LoggerFactory.getLogger(SandboxOtp.class);

    record Sent(String phone, OtpAudience audience, String code, OffsetDateTime sentAt) {
    }

    private final Map<String, Sent> last = new ConcurrentHashMap<>();

    @Override
    public void send(PhoneNumber phone, String code, OtpAudience audience) {
        last.put(phone.e164(), new Sent(phone.e164(), audience, code, OffsetDateTime.now(ZoneOffset.UTC)));
        log.info("[sandbox] {} code for {}: {}", audience, phone.masked(), code);
    }

    Optional<Sent> last(String phone) {
        return Optional.ofNullable(last.get(PhoneNumber.parse(phone).e164()));
    }
}
