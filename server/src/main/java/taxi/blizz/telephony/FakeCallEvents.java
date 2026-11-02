package taxi.blizz.telephony;

/**
 * Asterisk's call events for development, tests and the sandbox (blizz.telephony.otp-provider=FAKE — never a real
 * environment): an ARI event as Asterisk would send it on the events WebSocket ({@code ChannelCreated},
 * {@code ChannelStateChange}, {@code ChannelDestroyed}), handled exactly like a real one. Every taken call then has a
 * short recording (a tone), unless {@link #withoutRecording} said otherwise.
 */
public interface FakeCallEvents {

    /** As the first service's exchange would send it. */
    default boolean push(String ariEvent) {
        return push(taxi.blizz.identity.Services.DEFAULT_ID, ariEvent);
    }

    /**
     * As the exchange of {@code serviceId} would send it (ADR 0016, #275). {@code false} on an instance that listens to
     * a real Asterisk; the event is then ignored.
     */
    boolean push(java.util.UUID serviceId, String ariEvent);

    /** The call whose first channel is {@code channelId} has no recording, as when Asterisk recorded nothing. */
    void withoutRecording(String channelId);

    /** An outgoing call the server asked Asterisk for (issue #67); {@code dial} is the other side's number. */
    record Originated(String channelId, String endpoint, String context, String dial, java.time.OffsetDateTime at) {
    }

    /** The outgoing calls asked for, oldest first; empty on an instance with a real Asterisk. */
    java.util.List<Originated> originated();
}
