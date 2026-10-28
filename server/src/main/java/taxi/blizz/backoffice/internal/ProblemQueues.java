package taxi.blizz.backoffice.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.backoffice.SupportCases.Category;
import taxi.blizz.backoffice.SupportCases.Priority;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * Feeds the problem queues from events (S-08): a cash trip the driver reports as not paid becomes a
 * CASH_DISPUTE case (REQ-PAY-15, REQ-DS-13); a trip flagged for review becomes a TRIP_REVIEW case. A
 * suspended staff member's open cases return to the queue (REQ-USR-18). Redelivery creates nothing twice.
 */
@Component
class ProblemQueues implements OutboxHandler {

    private final JdbcSupportCases cases;
    private final Orders orders;
    private final JsonMapper json;

    ProblemQueues(JdbcSupportCases cases, Orders orders, JsonMapper json) {
        this.cases = cases;
        this.orders = orders;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record TripCompleted(UUID orderId, String paymentMethod, Boolean cashReceived, Boolean needsReview,
                         Long amountMinor, String currency) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record StaffSuspended(UUID staffId) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record CallerNotNotified(UUID orderId, String template, String outcome) {
    }

    @Override
    public String consumerId() {
        return "backoffice.problem-queues";
    }

    @Override
    public boolean supports(String eventType) {
        return "TripCompleted".equals(eventType) || "StaffSuspended".equals(eventType)
                || "CallerNotNotified".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        if ("CallerNotNotified".equals(message.type())) {
            // REQ-NTF-08: a phone order's caller the SMS did not reach is called by a dispatcher. One task per order.
            CallerNotNotified event = json.readValue(message.payload(), CallerNotNotified.class);
            cases.openFromSystem("caller-not-notified:" + event.orderId(), orders.get(event.orderId()).cityId(),
                    Category.OTHER, event.orderId(), "Phone order: call the caller, the SMS did not reach them",
                    Priority.HIGH, "SMS " + event.template() + " " + event.outcome());
            return;
        }
        if ("StaffSuspended".equals(message.type())) {
            StaffSuspended event = json.readValue(message.payload(), StaffSuspended.class);
            cases.returnToQueue(event.staffId(), "Returned to the queue: the owner was suspended");
            return;
        }
        TripCompleted trip = json.readValue(message.payload(), TripCompleted.class);
        UUID cityId = orders.get(trip.orderId()).cityId();
        if ("CASH".equals(trip.paymentMethod()) && Boolean.FALSE.equals(trip.cashReceived())) {
            cases.openFromSystem("cash-not-received:" + trip.orderId(), cityId, Category.CASH_DISPUTE, trip.orderId(),
                    "Driver reports the cash was not received", Priority.HIGH,
                    "Cash trip completed with CASH_NOT_RECEIVED; fare " + trip.amountMinor() + " " + trip.currency()
                            + " minor units. Contact the rider; financial changes only through the dispute decision.");
        }
        if ("TERMINAL".equals(trip.paymentMethod()) && Boolean.FALSE.equals(trip.cashReceived())) {
            cases.openFromSystem("terminal-not-received:" + trip.orderId(), cityId, Category.PAYMENT, trip.orderId(),
                    "Driver reports the terminal payment did not go through", Priority.HIGH,
                    "Phone order paid at the driver's terminal completed with TERMINAL_NOT_RECEIVED; fare "
                            + trip.amountMinor() + " " + trip.currency()
                            + " minor units. Contact the caller; financial changes only through the dispute decision.");
        }
        if (Boolean.TRUE.equals(trip.needsReview())) {
            cases.openFromSystem("trip-review:" + trip.orderId(), cityId, Category.TRIP_REVIEW, trip.orderId(),
                    "Trip flagged for review", Priority.NORMAL,
                    "The arrival or the start was confirmed with an exception, or the completion time differs from the"
                            + " server time. Check the order timeline.");
        }
    }
}
