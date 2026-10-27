package taxi.blizz.telephony.internal;

import org.springframework.stereotype.Component;
import taxi.blizz.telephony.FakeCallEvents;

/** Hands an ARI event to the call log, only on an instance with the FAKE provider. */
@Component
class FakeCallSource implements FakeCallEvents {

    private final AriCallEvents events;
    private final TelephonyProperties properties;

    FakeCallSource(AriCallEvents events, TelephonyProperties properties) {
        this.events = events;
        this.properties = properties;
    }

    @Override
    public boolean push(String ariEvent) {
        if (!properties.fake()) {
            return false;
        }
        events.handle(ariEvent);
        return true;
    }
}
