package taxi.blizz.payments.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * A card trip is completed (TripCompleted, REQ-PAY-04/05): the hold is taken up to the final fare, the rest of the
 * hold is left to lapse, and anything above the hold is charged to the saved card afterwards. The provider is called
 * by the worker, not here.
 */
@Component
class TripCapture implements OutboxHandler {

    private final JdbcCardPayments payments;
    private final JsonMapper json;

    TripCapture(JdbcCardPayments payments, JsonMapper json) {
        this.payments = payments;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record TripCompleted(UUID orderId, String paymentMethod, Long amountMinor, Long walletMinor, Long discountMinor,
                         String currency) {
    }

    @Override
    public String consumerId() {
        return "payments.trip-capture";
    }

    @Override
    public boolean supports(String eventType) {
        return "TripCompleted".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        TripCompleted trip = json.readValue(message.payload(), TripCompleted.class);
        if (!"CARD".equals(trip.paymentMethod()) || trip.amountMinor() == null) {
            return;
        }
        // The promotions' discount and the rider's bonuses paid their part (ADR 0009); the card pays the rest.
        long wallet = trip.walletMinor() == null ? 0 : trip.walletMinor();
        long discount = trip.discountMinor() == null ? 0 : trip.discountMinor();
        payments.startCapture(trip.orderId(), Math.max(0, trip.amountMinor() - wallet - discount), trip.currency());
    }
}
