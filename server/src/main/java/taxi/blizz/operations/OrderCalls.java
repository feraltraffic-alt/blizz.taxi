package taxi.blizz.operations;

import java.util.UUID;
import taxi.blizz.platform.Actor;

/** Phone target of an active rider-driver assignment. */
public interface OrderCalls {

    enum Mode {
        DIRECT,
        VIA_SERVICE_NUMBERS
    }

    record CallTarget(Mode mode, String phone) {
    }

    CallTarget forRider(Actor rider, UUID orderId);

    CallTarget forDriver(Actor driver, UUID tripId);
}
