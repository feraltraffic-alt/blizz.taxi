package taxi.blizz.telephony.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.springframework.stereotype.Component;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.telephony.FakeTextMessages;
import taxi.blizz.telephony.TextMessages;

/** TurboSMS, or the fake provider when codes are fake too (one setting for both: blizz.telephony.otp-provider). */
@Component
class ConfiguredTextMessages implements TextMessages, FakeTextMessages {

    /** The fake provider keeps at most this many texts per phone. */
    static final int KEPT_PER_PHONE = 20;

    private final TurboSmsSender turboSms;
    private final TelephonyProperties properties;
    private final Clock clock;
    private final Map<String, List<Sent>> fakeSent = new ConcurrentHashMap<>();

    ConfiguredTextMessages(TurboSmsSender turboSms, TelephonyProperties properties, Clock clock) {
        this.turboSms = turboSms;
        this.properties = properties;
        this.clock = clock;
    }

    @Override
    public Result send(PhoneNumber to, String text) {
        if (properties.fake()) {
            if (to.e164().endsWith("0000")) {
                return new Result(State.FAILED, null, "fake SMS FAILED");
            }
            List<Sent> sent = fakeSent.computeIfAbsent(to.e164(), p -> new CopyOnWriteArrayList<>());
            sent.add(new Sent(to.e164(), text, OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC)));
            while (sent.size() > KEPT_PER_PHONE) {
                sent.removeFirst();
            }
            return new Result(State.SENT, "fake-" + java.util.UUID.randomUUID(), null);
        }
        OtpSender.Result r = turboSms.sendText(to, text);
        return new Result(State.valueOf(r.state().name()), r.providerRef(), r.error());
    }

    @Override
    public List<Sent> to(String phone) {
        return List.copyOf(fakeSent.getOrDefault(PhoneNumber.parse(phone).e164(), List.of()));
    }
}
