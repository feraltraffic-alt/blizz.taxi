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
    record Chargeback(UUID chargebackId, UUID orderId, long amountMinor, String currency) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record CallerNotNotified(UUID orderId, String template, String outcome) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record OrderProblem(UUID orderId, UUID assignmentId, String phase, String lastSeenAt, UUID operationId,
                        String type, Long amountMinor, String currency, Long paidMinor, Long dueMinor) {
    }

    @Override
    public String consumerId() {
        return "backoffice.problem-queues";
    }

    @Override
    public boolean supports(String eventType) {
        return switch (eventType) {
            case "TripCompleted", "StaffSuspended", "CallerNotNotified", "OrderUnfulfilled", "DriverLostDuringOrder",
                 "PaymentResultUnknown", "CardPaymentSettled", "CashDisputeOverdue", "InvariantViolated",
                 "CardChargebackRecorded", "PaymentReconciliationDifferencesFound", "DestinationChanged" -> true;
            default -> false;
        };
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record DestinationChanged(UUID orderId, UUID quoteId, long priceMinor, String currency, Long holdMinor,
                              boolean aboveHold) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Invariant(String check, String objectType, UUID objectId, String detail) { }

    @Override
    public void handle(OutboxMessage message) {
        if ("PaymentReconciliationDifferencesFound".equals(message.type())) {
            ReconciliationProblem p=json.readValue(message.payload(),ReconciliationProblem.class);
            cases.openFromSystem("reconciliation:"+p.runId(),p.cityId(),Category.PAYMENT,null,
                    "Card reconciliation needs a decision",Priority.HIGH,
                    "Review the open differences in payment reconciliation "+p.runId()+". No money was changed.");
            return;
        }
        if ("DestinationChanged".equals(message.type())) {
            DestinationChanged d = json.readValue(message.payload(), DestinationChanged.class);
            UUID orderId = d.orderId() != null ? d.orderId() : message.aggregateId();
            // Issue #142: a new price above the card hold is not a silent loss; one case per new price.
            if (d.aboveHold()) {
                cases.openFromSystem("destination-above-hold:" + orderId + ":" + d.quoteId(), cityOf(orderId),
                        Category.PAYMENT, orderId, "The new destination costs more than the card hold",
                        Priority.NORMAL, "The price is now " + d.priceMinor() + " " + d.currency()
                                + " minor units; the hold is " + d.holdMinor() + ". At completion the hold is taken"
                                + " and the rest charged to the card once; what fails stays the rider's debt.");
            }
            return;
        }
        if ("InvariantViolated".equals(message.type())) {
            Invariant v = json.readValue(message.payload(), Invariant.class);
            cases.openFromSystem("invariant:" + v.check() + ":" + v.objectId(), null, Category.OTHER,
                    "Order".equals(v.objectType()) ? v.objectId() : null,
                    "Invariant " + v.check() + ": " + v.objectType(), Priority.HIGH, v.detail());
            return;
        }
        if (problem(message)) {
            return;
        }
        if ("CardChargebackRecorded".equals(message.type())) {
            Chargeback c = json.readValue(message.payload(), Chargeback.class);
            // REQ-PAY-23: the evidence goes to the provider's risk managers, the outcome is recorded when they answer.
            cases.openFromSystem("chargeback:" + c.chargebackId(), cityOf(c.orderId()), Category.PAYMENT, c.orderId(),
                    "Chargeback of a card payment", Priority.HIGH,
                    "The bank took back " + c.amountMinor() + " " + c.currency() + " minor units of the order's card"
                            + " payment. Send the order's evidence to the payment provider, then record WON or LOST.");
            return;
        }
        if ("CashDisputeOverdue".equals(message.type())) {
            OrderProblem p = json.readValue(message.payload(), OrderProblem.class);
            UUID orderId = p.orderId() != null ? p.orderId() : message.aggregateId();
            // Owner decision 28.10.2026: past the deadline nothing moves by itself; a manager decides.
            cases.openFromSystem("cash-dispute-overdue:" + orderId, cityOf(orderId), Category.CASH_DISPUTE, orderId,
                    "A cash dispute was not decided in time", Priority.URGENT,
                    "The driver reported the fare as not paid and nobody decided within 14 days. Decide it in the"
                            + " order's cash dispute: the rider paid, pay the driver, or keep the held part.");
            return;
        }
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

    /**
     * The rest of the problem queues (REQ-OPS-06): no driver found, the driver lost during the order, a card
     * operation's result still unknown, a card fare left partly unpaid. One case per problem, redelivery included.
     */
    private boolean problem(OutboxMessage message) {
        String type = message.type();
        if (!java.util.Set.of("OrderUnfulfilled", "DriverLostDuringOrder", "PaymentResultUnknown",
                "CardPaymentSettled").contains(type)) {
            return false;
        }
        OrderProblem p = json.readValue(message.payload(), OrderProblem.class);
        UUID orderId = p.orderId() != null ? p.orderId() : message.aggregateId();
        switch (type) {
            case "OrderUnfulfilled" -> cases.openFromSystem("no-driver:" + orderId, cityOf(orderId),
                    Category.NO_DRIVER, orderId, "No driver was found for the order", Priority.NORMAL,
                    "The search ended without a driver. Call back if it was a phone order or the rider asks.");
            case "DriverLostDuringOrder" -> {
                boolean riding = "IN_PROGRESS".equals(p.phase());
                cases.openFromSystem("lost-driver:" + p.assignmentId() + ":" + (p.lastSeenAt() == null ? "never"
                        : p.lastSeenAt()), cityOf(orderId), Category.LOST_CONNECTION,
                        orderId, riding ? "The driver is not heard from during the ride"
                                : "The assigned driver is not heard from", riding ? Priority.URGENT : Priority.HIGH,
                        "No position from the driver since " + (p.lastSeenAt() == null ? "the session ended"
                                : p.lastSeenAt()) + " (phase " + p.phase() + "). Call the driver"
                                + (riding ? " and the rider" : "") + "; take the order off the driver if needed.");
            }
            case "PaymentResultUnknown" -> cases.openFromSystem("payment-unknown:" + p.operationId(),
                    cityOf(orderId), Category.PAYMENT_UNKNOWN, orderId,
                    "A card operation's result is still unknown", Priority.HIGH,
                    p.type() + " of " + p.amountMinor() + " " + p.currency() + " minor units: the provider has not "
                            + "answered. It is still being asked; never charge again by hand before it is known.");
            default -> {
                // CardPaymentSettled: only the payment's own event counts, and only when part of the fare is unpaid.
                if (!"PaymentIntent".equals(message.aggregateType()) || p.paidMinor() == null || p.dueMinor() == null
                        || p.paidMinor() >= p.dueMinor()) {
                    return true;
                }
                cases.openFromSystem("card-debt:" + orderId, cityOf(orderId), Category.PAYMENT, orderId,
                        "The card did not cover the fare", Priority.HIGH,
                        "Paid " + p.paidMinor() + " of " + p.dueMinor() + " minor units; the rest is the rider's debt."
                                + " A declined charge can be retried by hand (payments.retry) once the rider agrees.");
            }
        }
        return true;
    }

    private UUID cityOf(UUID orderId) {
        return orders.get(orderId).cityId();
    }
    private record ReconciliationProblem(UUID runId,UUID merchantId,UUID cityId,int openItemCount,java.util.List<String> kinds) { }

}
