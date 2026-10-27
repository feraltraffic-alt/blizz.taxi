package taxi.blizz.telephony.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.telephony.FakeOtpCodes;

/**
 * The FAKE provider for both channels (development, tests, the sandbox): nothing leaves the server, the last code per
 * phone is kept and, as before, written to the log there. An SMS to a number ending in 0000 is refused, so the
 * fallback to a call can be seen in the sandbox; tests can script the next outcomes.
 */
@Component
class FakeOtpSender implements FakeOtpCodes {

    private static final Logger log = LoggerFactory.getLogger(FakeOtpSender.class);

    private final Map<String, Sent> last = new ConcurrentHashMap<>();
    private final Deque<OtpSender.State> script = new ArrayDeque<>();
    private final Clock clock;

    FakeOtpSender(Clock clock) {
        this.clock = clock;
    }

    @Override
    public Optional<Sent> last(String phone) {
        return Optional.ofNullable(last.get(PhoneNumber.parse(phone).e164()));
    }

    /** Outcomes for the next attempts, whatever the channel; SENT when none is left. */
    synchronized void next(OtpSender.State... outcomes) {
        script.addAll(List.of(outcomes));
    }

    synchronized void reset() {
        script.clear();
    }

    OtpSender sender(OtpChannel channel) {
        return new OtpSender() {
            @Override
            public OtpChannel channel() {
                return channel;
            }

            @Override
            public String provider() {
                return "FAKE";
            }

            @Override
            public Result send(PhoneNumber phone, String code, OtpAudience audience) {
                return deliver(channel, phone, code, audience);
            }
        };
    }

    private OtpSender.Result deliver(OtpChannel channel, PhoneNumber phone, String code, OtpAudience audience) {
        OtpSender.State scripted;
        synchronized (this) {
            scripted = script.poll();
        }
        OtpSender.State state = scripted != null ? scripted
                : channel == OtpChannel.SMS && phone.e164().endsWith("0000") ? OtpSender.State.FAILED
                : OtpSender.State.SENT;
        if (state != OtpSender.State.SENT) {
            return new OtpSender.Result(state, null, "fake " + channel + " " + state);
        }
        last.put(phone.e164(), new Sent(phone.e164(), audience, code,
                OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC), channel));
        log.info("[fake {}] {} code for {}: {}", channel, audience, phone.masked(), code);
        return OtpSender.Result.sent("fake-" + java.util.UUID.randomUUID());
    }
}
