package taxi.blizz.telephony;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * The texts the fake provider "sent" (blizz.telephony.otp-provider=FAKE: development, tests and the sandbox — never a
 * real environment). The sandbox shows them instead of an SMS. A number ending in 0000 is refused, as for codes.
 */
public interface FakeTextMessages {

    record Sent(String phone, String text, OffsetDateTime sentAt) {
    }

    /** The texts to the phone, oldest first. */
    List<Sent> to(String phone);
}
