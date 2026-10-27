package taxi.blizz.telephony;

/**
 * Asterisk's call events for development, tests and the sandbox (blizz.telephony.otp-provider=FAKE — never a real
 * environment): an ARI event as Asterisk would send it on the events WebSocket ({@code ChannelCreated},
 * {@code ChannelStateChange}, {@code ChannelDestroyed}), handled exactly like a real one.
 */
public interface FakeCallEvents {

    /** {@code false} on an instance that listens to a real Asterisk; the event is then ignored. */
    boolean push(String ariEvent);
}
