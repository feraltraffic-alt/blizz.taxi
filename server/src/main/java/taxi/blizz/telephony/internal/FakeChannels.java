package taxi.blizz.telephony.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;
import taxi.blizz.telephony.FakeCallEvents;

/**
 * The FAKE provider's Asterisk for outgoing calls: remembers each originate (the last 1 000), and refuses a second one
 * with the same channel id as Asterisk does. Its events come through {@link FakeCallEvents#push}.
 */
@Component
class FakeChannels implements ChannelControl {

    private static final int KEEP = 1000;

    private final Clock clock;
    private final Map<String, FakeCallEvents.Originated> byChannel = new ConcurrentHashMap<>();
    private final List<FakeCallEvents.Originated> order = new ArrayList<>();

    FakeChannels(Clock clock) {
        this.clock = clock;
    }

    @Override
    public Originated originate(String channelId, String endpoint, String context, Map<String, String> variables) {
        FakeCallEvents.Originated call = new FakeCallEvents.Originated(channelId, endpoint, context,
                variables.get("BLIZZ_DIAL"), OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC));
        if (byChannel.putIfAbsent(channelId, call) != null) {
            return Originated.ALREADY_EXISTS;
        }
        synchronized (order) {
            order.add(call);
            if (order.size() > KEEP) {
                byChannel.remove(order.removeFirst().channelId());
            }
        }
        return Originated.STARTED;
    }

    @Override
    public Set<String> channels() {
        return Set.copyOf(byChannel.keySet());
    }

    /** Oldest first. */
    List<FakeCallEvents.Originated> originated() {
        synchronized (order) {
            return List.copyOf(order);
        }
    }
}
