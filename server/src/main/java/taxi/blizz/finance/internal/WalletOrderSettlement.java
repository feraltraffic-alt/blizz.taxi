package taxi.blizz.finance.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * Bonuses set aside for an order (ADR 0009 p. 3): after the trip the account pays its part of the fare
 * (Dt RIDER_WALLET — Kt RIDER_RECEIVABLE, at most the final fare); an order that ends otherwise lets them go.
 * Idempotent: a hold is closed once, the posting has a business key.
 */
@Component
class WalletOrderSettlement implements OutboxHandler {

    private final JdbcClient jdbc;
    private final Ledger ledger;
    private final JsonMapper json;
    private final Clock clock;

    WalletOrderSettlement(JdbcClient jdbc, Ledger ledger, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.ledger = ledger;
        this.json = json;
        this.clock = clock;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Completed(UUID orderId, Long walletMinor) {
    }

    private record Hold(UUID clientId, String currency, long amount, String state) {
    }

    @Override
    public String consumerId() {
        return "finance.wallet-order-settlement";
    }

    @Override
    public boolean supports(String eventType) {
        return switch (eventType) {
            case "TripCompleted", "OrderCancelled", "OrderUnfulfilled", "CardHoldDeclined", "TripInterrupted" -> true;
            default -> false;
        };
    }

    @Override
    public void handle(OutboxMessage message) {
        if (!"Order".equals(message.aggregateType())) {
            return;
        }
        UUID orderId = message.aggregateId();
        Hold hold = jdbc.sql("""
                        select client_id, currency, amount_minor, state from rider_wallet_hold
                        where order_id = :order for update""")
                .param("order", orderId)
                .query((rs, i) -> new Hold(rs.getObject(1, UUID.class), rs.getString(2), rs.getLong(3),
                        rs.getString(4)))
                .optional().orElse(null);
        if (hold == null || !"RESERVED".equals(hold.state())) {
            return;
        }
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        if (!"TripCompleted".equals(message.type())) {
            jdbc.sql("update rider_wallet_hold set state = 'RELEASED', closed_at = :now where order_id = :order")
                    .param("now", now).param("order", orderId).update();
            return;
        }
        Completed trip = json.readValue(message.payload(), Completed.class);
        long take = Math.min(hold.amount(), trip.walletMinor() == null ? 0 : trip.walletMinor());
        if (take > 0) {
            ledger.post(new Ledger.Posting("wallet-trip:" + orderId, "TRIP_PAYMENT", orderId, hold.currency(),
                    "Trip paid with bonuses", List.of(Line.debit(Account.RIDER_WALLET, hold.clientId(), take),
                            Line.credit(Account.RIDER_RECEIVABLE, hold.clientId(), take))));
            jdbc.sql("""
                            update rider_wallet_hold set state = 'CAPTURED', captured_minor = :take, closed_at = :now
                            where order_id = :order""")
                    .param("take", take).param("now", now).param("order", orderId).update();
        } else {
            jdbc.sql("update rider_wallet_hold set state = 'RELEASED', closed_at = :now where order_id = :order")
                    .param("now", now).param("order", orderId).update();
        }
    }
}
