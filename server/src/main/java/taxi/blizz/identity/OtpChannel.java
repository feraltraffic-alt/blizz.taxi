package taxi.blizz.identity;

/** How a one-time code reaches the phone (ADR 0012 Q-18). */
public enum OtpChannel {
    /** A text message. */
    SMS,
    /** A call that speaks the code ("call me instead"). */
    VOICE
}
