package taxi.blizz.telephony;

/**
 * Asterisk's call events for development, tests and the sandbox (blizz.telephony.otp-provider=FAKE — never a real
 * environment): an ARI event as Asterisk would send it on the events WebSocket ({@code ChannelCreated},
 * {@code ChannelStateChange}, {@code ChannelDestroyed}), handled exactly like a real one. Every taken call then has a
 * short recording (a tone), unless {@link #withoutRecording} said otherwise.
 */
public interface FakeCallEvents {

    /** {@code false} on an instance that listens to a real Asterisk; the event is then ignored. */
    boolean push(String ariEvent);

    /** The call whose first channel is {@code channelId} has no recording, as when Asterisk recorded nothing. */
    void withoutRecording(String channelId);
}
