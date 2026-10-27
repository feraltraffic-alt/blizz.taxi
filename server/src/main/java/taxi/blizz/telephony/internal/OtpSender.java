package taxi.blizz.telephony.internal;

import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;
import taxi.blizz.identity.PhoneNumber;

/** One way to get a code to a phone. Never logs the code. */
interface OtpSender {

    enum State {
        /** The provider took it. */
        SENT,
        /** The provider refused it, or it is not configured: try the next channel. */
        FAILED,
        /** No answer: it may still arrive; the next channel is tried. */
        UNKNOWN
    }

    record Result(State state, String providerRef, String error) {

        static Result sent(String ref) {
            return new Result(State.SENT, ref, null);
        }

        static Result failed(String error) {
            return new Result(State.FAILED, null, error);
        }

        static Result unknown(String error) {
            return new Result(State.UNKNOWN, null, error);
        }
    }

    OtpChannel channel();

    /** TURBOSMS, ASTERISK or FAKE. */
    String provider();

    Result send(PhoneNumber phone, String code, OtpAudience audience);
}
