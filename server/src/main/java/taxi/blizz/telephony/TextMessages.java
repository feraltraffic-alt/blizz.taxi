package taxi.blizz.telephony;

import taxi.blizz.identity.PhoneNumber;

/**
 * An SMS with a text (REQ-NTF-08: a phone order's caller who is not in the app), by the provider set for codes:
 * TurboSMS, or the fake one in development, tests and the sandbox. Never logs the text.
 */
public interface TextMessages {

    enum State {
        /** The provider took it. */
        SENT,
        /** Refused, or the provider is not configured: may be tried again. */
        FAILED,
        /** No answer: it may still arrive; trying again could send it twice. */
        UNKNOWN
    }

    record Result(State state, String providerRef, String error) {
    }

    Result send(PhoneNumber to, String text);
}
