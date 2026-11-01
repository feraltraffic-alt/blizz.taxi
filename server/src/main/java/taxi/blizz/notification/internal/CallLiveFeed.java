package taxi.blizz.notification.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.telephony.Calls;
import taxi.blizz.telephony.Operators;
import tools.jackson.databind.json.JsonMapper;

/**
 * The card-pop (REQ-OPS-01/08, issue #64): when a call rings, the operators who take calls in its city get, on
 * /ws/v1/operator, who calls and — when the number belongs to a rider — the rider's id, name and open orders. Nothing
 * else personal; the outbox event itself carries only ids. Of those operators, only the AVAILABLE ones get it when
 * at least one is (issue #67). A call that is no longer ringing when the event is handled
 * (the relay was late) pops nothing.
 */
@Component
class CallLiveFeed implements OutboxHandler {

    private final Calls calls;
    private final AccountDirectory accounts;
    private final Orders orders;
    private final StaffAccess staff;
    private final Operators operators;
    private final LiveBus bus;
    private final JsonMapper json;

    CallLiveFeed(Calls calls, AccountDirectory accounts, Orders orders, StaffAccess staff, Operators operators,
                 LiveBus bus, JsonMapper json) {
        this.calls = calls;
        this.accounts = accounts;
        this.orders = orders;
        this.staff = staff;
        this.operators = operators;
        this.bus = bus;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Ringing(UUID callId) {
    }

    @Override
    public String consumerId() {
        return "notification.call-live-feed";
    }

    @Override
    public boolean supports(String eventType) {
        return "CallRinging".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Optional<Calls.Call> found = calls.find(json.readValue(message.payload(), Ringing.class).callId());
        if (found.isEmpty() || found.get().state() != Calls.State.RINGING) {
            return;
        }
        Calls.Call call = found.get();
        Set<UUID> holders = staff.holders(Calls.ANSWER_PERMISSION, call.cityId());
        if (holders.isEmpty()) {
            return;
        }
        // The AVAILABLE ones when there is one; otherwise everyone, so a call never pops to nobody (issue #67).
        Set<UUID> available = operators.available(holders);
        Set<UUID> to = available.isEmpty() ? holders : available;
        UUID client = call.callerPhone() == null ? null
                // The caller in the taxi service of the number dialled (its line's city), never another (ADR 0016).
                : call.serviceId() == null ? null
                : accounts.clientByPhone(call.serviceId(), new PhoneNumber(call.callerPhone())).orElse(null);
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("call_id", call.id().toString());
        payload.put("city_id", call.cityId() == null ? null : call.cityId().toString());
        payload.put("caller_phone", call.callerPhone());
        payload.put("client_id", client == null ? null : client.toString());
        payload.put("client_name", client == null ? null
                : accounts.name(new Actor(SubjectType.CLIENT, client)).orElse(null));
        payload.put("open_order_ids", client == null ? List.of()
                : orders.current(client).stream().map(OrderView::id).map(UUID::toString).toList());
        Map<String, Object> envelope = new LinkedHashMap<>();
        envelope.put("event_id", message.eventId().toString());
        envelope.put("type", "CallRinging");
        envelope.put("occurred_at", message.occurredAt() == null ? null : message.occurredAt().toString());
        envelope.put("payload", payload);
        bus.publish(to, envelope);
    }
}
