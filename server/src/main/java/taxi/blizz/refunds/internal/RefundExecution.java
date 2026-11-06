package taxi.blizz.refunds.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.finance.DriverDebts;
import taxi.blizz.finance.FareDeltas;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.operations.Orders;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.json.JsonMapper;

/**
 * Moves the money of an approved refund (ADR 0018 A5–A7, issue #512, part 2). An APPROVED refund becomes PROCESSING:
 * its card part goes to the payment worker, one REFUND per paid transaction; when they all ended, or at once without
 * a card part, the journal takes the whole refund and the refund is SUCCEEDED. A card part declined throughout makes
 * it FAILED (nothing moved); declined in part, UNKNOWN (some money went back, a person decides). Repeats change
 * nothing: each step looks at the refund's state under its row lock.
 */
@Component
class RefundExecution implements OutboxHandler {

    private final JdbcClient jdbc;
    private final CardPayments cards;
    private final Ledger ledger;
    private final FareDeltas fareDeltas;
    private final RiderWallets wallets;
    private final DriverDebts debts;
    private final Orders orders;
    private final Outbox outbox;
    private final JsonMapper json;
    private final Clock clock;

    RefundExecution(JdbcClient jdbc, CardPayments cards, Ledger ledger, FareDeltas fareDeltas, RiderWallets wallets,
                    DriverDebts debts, Orders orders, Outbox outbox, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.cards = cards;
        this.ledger = ledger;
        this.fareDeltas = fareDeltas;
        this.wallets = wallets;
        this.debts = debts;
        this.orders = orders;
        this.outbox = outbox;
        this.json = json;
        this.clock = clock;
    }

    @Override
    public String consumerId() {
        return "refund-execution";
    }

    @Override
    public boolean supports(String eventType) {
        return "RefundApproved".equals(eventType) || CardPayments.REFUND_OPERATION_ENDED.equals(eventType);
    }

    @Override
    @Transactional
    public void handle(OutboxMessage message) {
        Map<String, Object> body = json.readValue(message.payload(), new TypeReference<Map<String, Object>>() {
        });
        Object id = body.get("refund_id");
        if (id == null) {
            return;
        }
        UUID refundId = UUID.fromString(id.toString());
        if ("RefundApproved".equals(message.type())) {
            start(refundId);
        } else {
            progress(refundId);
        }
    }

    private record Row(UUID id, UUID orderId, UUID clientId, UUID driverId, String currency, long amount, long card,
                       long bonus, String fault, String reasonCode, String state, long version) {
    }

    private Row lock(UUID refundId) {
        return jdbc.sql("""
                        select id, order_id, client_id, driver_id, currency, amount_minor, card_minor, bonus_minor,
                               fault, reason_code, state, version
                        from refund where id = :id for update""")
                .param("id", refundId)
                .query((rs, i) -> new Row(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, UUID.class), rs.getObject(4, UUID.class), rs.getString(5), rs.getLong(6),
                        rs.getLong(7), rs.getLong(8), rs.getString(9), rs.getString(10), rs.getString(11),
                        rs.getLong(12)))
                .optional().orElse(null);
    }

    /** APPROVED → PROCESSING: the card part to the worker, or done at once with bonuses only. */
    void start(UUID refundId) {
        Row r = lock(refundId);
        if (r == null || !"APPROVED".equals(r.state())) {
            return;
        }
        state(r, "PROCESSING", false);
        if (r.card() > 0) {
            cards.refund(r.orderId(), r.id(), r.card());
        } else {
            succeed(lock(refundId));
        }
    }

    /** A card operation ended: when all did, the refund ends too. */
    void progress(UUID refundId) {
        Row r = lock(refundId);
        if (r == null || !"PROCESSING".equals(r.state())) {
            return;
        }
        CardPayments.RefundProgress p = cards.refundProgress(refundId);
        if (!p.ended()) {
            return;
        }
        if (p.declined() == 0) {
            succeed(r);
        } else {
            state(r, p.succeeded() == 0 ? "FAILED" : "UNKNOWN", p.succeeded() == 0);
            publish("RefundFailed", lock(refundId), p.succeededMinor());
        }
    }

    /**
     * The journal of the refund (A6): out to the card and the bonus account; from the order's refund obligation of a
     * fare correction first, the rest from whoever is at fault — the driver's share and the service's commission for
     * the driver's fault (all of it for a cash trip, the driver holds the cash), the service otherwise.
     */
    private void succeed(Row r) {
        Orders.RefundFacts o = orders.refundFacts(r.orderId()).orElseThrow();
        List<Line> lines = new ArrayList<>();
        if (r.card() > 0) {
            lines.add(Line.credit(Account.PROVIDER_CLEARING, null, r.card()));
        }
        if (r.bonus() > 0) {
            wallets.open(r.clientId(), r.currency());
            lines.add(Line.credit(Account.RIDER_WALLET, r.clientId(), r.bonus()));
        }
        long rest = r.amount();
        long obligation = Math.min(rest, Math.max(0, fareDeltas.refundObligation(r.orderId())));
        if (obligation > 0) {
            lines.add(Line.debit(Account.REFUNDS_PAYABLE, r.clientId(), obligation));
            rest -= obligation;
        }
        boolean driver = "DRIVER".equals(r.fault()) && r.driverId() != null;
        if (rest > 0 && driver) {
            boolean cash = !"CARD".equals(o.paymentMethod());
            long share = cash || o.fareMinor() <= 0 ? rest
                    : Math.floorDiv(rest * o.driverShareMinor(), o.fareMinor());
            if (share > 0) {
                lines.add(Line.debit(Account.DRIVER_PAYABLE, r.driverId(), share));
            }
            if (rest - share > 0) {
                lines.add(Line.debit(Account.SERVICE_COMMISSION, null, rest - share));
            }
        } else if (rest > 0) {
            lines.add(Line.debit(Account.SERVICE_EXPENSE, null, rest));
        }
        ledger.post(new Ledger.Posting("refund:" + r.id(), "REFUND", r.orderId(), r.currency(),
                "Refund to the rider: " + r.reasonCode(), lines));
        state(r, "SUCCEEDED", true);
        if (driver) {
            debts.refresh(r.driverId(), r.currency());
        }
        publish("RefundSucceeded", lock(r.id()), r.amount());
    }

    private void state(Row r, String state, boolean ended) {
        jdbc.sql("""
                        update refund set state = :state, version = version + 1,
                                          ended_at = case when :ended then :now else ended_at end
                        where id = :id""")
                .param("state", state).param("ended", ended).param("now", now()).param("id", r.id()).update();
    }

    private void publish(String type, Row r, long movedMinor) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("refund_id", r.id().toString());
        payload.put("order_id", r.orderId().toString());
        payload.put("client_id", r.clientId().toString());
        if (r.driverId() != null) {
            payload.put("driver_id", r.driverId().toString());
        }
        payload.put("amount_minor", r.amount());
        payload.put("card_minor", r.card());
        payload.put("bonus_minor", r.bonus());
        payload.put("moved_minor", movedMinor);
        payload.put("currency", r.currency());
        payload.put("fault", r.fault());
        payload.put("reason_code", r.reasonCode());
        payload.put("state", r.state());
        outbox.publish(new OutboxEvent(type, 1, "Refund", r.id(), r.version(), payload));
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
