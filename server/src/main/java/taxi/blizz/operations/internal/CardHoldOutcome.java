package taxi.blizz.operations.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * The card hold of an order is decided (ADR 0008, REQ-PAY-01): confirmed — the order is searched for (or waits as a
 * pre-order); declined — the order ends unfulfilled. Only an order still AWAITING_PAYMENT moves; a cancelled one stays
 * cancelled (the payments module releases a late hold itself, T-23).
 */
@Component
class CardHoldOutcome implements OutboxHandler {

    private final OrderCore core;
    private final DispatchEngine engine;
    private final JsonMapper json;

    CardHoldOutcome(OrderCore core, DispatchEngine engine, JsonMapper json) {
        this.core = core;
        this.engine = engine;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Hold(UUID orderId, String reason, Long paidMinor, Long dueMinor) {
    }

    @Override
    public String consumerId() {
        return "operations.card-hold-outcome";
    }

    @Override
    public boolean supports(String eventType) {
        return CardPayments.HOLD_AUTHORIZED.equals(eventType) || CardPayments.HOLD_DECLINED.equals(eventType)
                || CardPayments.PAYMENT_SETTLED.equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Hold hold = json.readValue(message.payload(), Hold.class);
        OrderCore.LockedOrder order = core.lockOrder(hold.orderId());
        if (CardPayments.PAYMENT_SETTLED.equals(message.type())) {
            if ("PAID".equals(core.paymentState(order.id())) || "PARTIALLY_PAID".equals(core.paymentState(order.id()))) {
                return; // a repeated delivery
            }
            boolean paid = hold.paidMinor() != null && hold.dueMinor() != null && hold.paidMinor() >= hold.dueMinor();
            core.setPaymentState(order.id(), paid ? "PAID" : "PARTIALLY_PAID");
            core.recordEvent(order.id(), core.touch(order.id()), "CardPaymentSettled", OrderCore.system(), null,
                    Map.of("paid_minor", hold.paidMinor(), "due_minor", hold.dueMinor()));
            return;
        }
        if (!"AWAITING_PAYMENT".equals(order.status())) {
            // A repeated delivery finds the order already moving: nothing to do. An order that ended meanwhile must
            // not keep the money blocked.
            if (CardPayments.HOLD_AUTHORIZED.equals(message.type())
                    && ("CANCELLED".equals(order.status()) || "UNFULFILLED".equals(order.status()))) {
                core.releaseCardHold(order.id(), "Order already " + order.status());
            }
            return;
        }
        if (CardPayments.HOLD_AUTHORIZED.equals(message.type())) {
            core.setPaymentState(order.id(), "AUTHORIZED");
            if (core.isPreorder(order.id())) {
                core.changeStatus(order, "SCHEDULED", null, "CardHoldAuthorized", OrderCore.system(), Map.of());
            } else {
                core.recordEvent(order.id(), core.touch(order.id()), "CardHoldAuthorized", OrderCore.system(), null,
                        Map.of());
                engine.startSearch(core.lockOrder(order.id()));
            }
        } else {
            core.setPaymentState(order.id(), "PAYMENT_DECLINED");
            core.changeStatus(order, "UNFULFILLED", "PAYMENT_DECLINED", "CardHoldDeclined", OrderCore.system(),
                    Map.of("reason", hold.reason() == null ? "Declined" : hold.reason()));
        }
    }
}
