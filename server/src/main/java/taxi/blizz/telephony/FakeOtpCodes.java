package taxi.blizz.telephony;

import java.time.OffsetDateTime;
import java.util.Optional;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;

/**
 * The codes the fake provider "sent" (blizz.telephony.otp-provider=FAKE: development, tests and the sandbox — never a
 * real environment). The sandbox shows the last one per phone instead of an SMS or a call.
 */
public interface FakeOtpCodes {

    record Sent(String phone, OtpAudience audience, String code, OffsetDateTime sentAt, OtpChannel channel) {
    }

    /** The last code for the phone, by whichever channel it went. */
    Optional<Sent> last(String phone);
}
