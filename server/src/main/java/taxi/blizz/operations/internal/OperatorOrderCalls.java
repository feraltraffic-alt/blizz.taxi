package taxi.blizz.operations.internal;

import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.telephony.Calls;

/**
 * Click-to-call from an order (issue #67, REQ-OPS-08, REQ-PRV-03): who may call (orders.view for the order's city) and
 * the other side's number are decided here, where the order lives; telephony only gets the number to hand to
 * Asterisk. The number never leaves the server towards the panel.
 */
@Service
class OperatorOrderCalls {

    private final Orders orders;
    private final Calls calls;
    private final StaffAccess staff;
    private final AccountDirectory accounts;
    private final JdbcClient jdbc;

    OperatorOrderCalls(Orders orders, Calls calls, StaffAccess staff, AccountDirectory accounts, JdbcClient jdbc) {
        this.orders = orders;
        this.calls = calls;
        this.staff = staff;
        this.accounts = accounts;
        this.jdbc = jdbc;
    }

    Calls.Call place(Actor actor, UUID commandId, UUID orderId, Calls.Party to) {
        if (to == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Whom to call is required");
        }
        Orders.Origin origin = orders.origin(orderId)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        staff.require(actor, Orders.VIEW_PERMISSION, origin.cityId());
        PhoneNumber number = number(orderId, to).orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT,
                switch (to) {
                    case RIDER -> "The order has no rider with a phone";
                    case DRIVER -> "The order has no driver yet";
                    case CALLER -> "The order has no caller (not a phone order)";
                }));
        return calls.dial(actor, commandId, new Calls.Outbound(orderId, origin.cityId(), to, number));
    }

    private Optional<PhoneNumber> number(UUID orderId, Calls.Party to) {
        Optional<Orders.Participants> who = orders.participants(orderId);
        Optional<String> phone = switch (to) {
            case RIDER -> who.map(Orders.Participants::payerClientId)
                    .flatMap(id -> accounts.phone(new Actor(SubjectType.CLIENT, id)));
            case DRIVER -> who.map(Orders.Participants::driverId)
                    .flatMap(id -> accounts.phone(new Actor(SubjectType.DRIVER, id)));
            case CALLER -> jdbc.sql("select phone from order_contact where order_id = :id")
                    .param("id", orderId).query(String.class).optional();
        };
        return phone.filter(p -> !p.isBlank()).map(PhoneNumber::parse);
    }
}
