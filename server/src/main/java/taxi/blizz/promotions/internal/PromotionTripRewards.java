package taxi.blizz.promotions.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.promotions.RiderPromotions;
import tools.jackson.databind.json.JsonMapper;

/**
 * A rider's trip is completed (ADR 0009): it counts for "every N-th trip", and the BONUS promotions its quote got
 * credit the rider's account — a percentage of the final fare or a fixed amount. Once per order and promotion.
 */
@Component
class PromotionTripRewards implements OutboxHandler {

    private final JdbcClient jdbc;
    private final RiderWallets wallets;
    private final JsonMapper json;
    private final Clock clock;

    PromotionTripRewards(JdbcClient jdbc, RiderWallets wallets, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.wallets = wallets;
        this.json = json;
        this.clock = clock;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record TripCompleted(UUID orderId, UUID payerClientId, UUID quoteId, Long amountMinor, String currency) {
    }

    private record Bonus(UUID promotionId, String name, String valueType, long value) {
    }

    @Override
    public String consumerId() {
        return "promotions.trip-rewards";
    }

    @Override
    public boolean supports(String eventType) {
        return "TripCompleted".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        TripCompleted trip = json.readValue(message.payload(), TripCompleted.class);
        UUID orderId = trip.orderId() != null ? trip.orderId() : message.aggregateId();
        if (trip.payerClientId() == null) {
            return; // a phone order without an account
        }
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        jdbc.sql("""
                        insert into promotion_trip (order_id, client_id, completed_at) values (:order, :client, :now)
                        on conflict do nothing""")
                .param("order", orderId).param("client", trip.payerClientId()).param("now", now).update();
        if (trip.quoteId() == null || trip.amountMinor() == null) {
            return;
        }
        List<Bonus> bonuses = jdbc.sql("""
                        select q.promotion_id, p.name, q.value_type, q.value
                        from promotion_quote q join rider_promotion p on p.id = q.promotion_id
                        where q.quote_id = :quote and q.kind = 'BONUS'""")
                .param("quote", trip.quoteId())
                .query((rs, i) -> new Bonus(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3),
                        rs.getLong(4)))
                .list();
        for (Bonus bonus : bonuses) {
            long amount = JdbcRiderPromotions.amount(RiderPromotions.ValueType.valueOf(bonus.valueType()),
                    bonus.value(), trip.amountMinor());
            if (amount <= 0) {
                continue;
            }
            int inserted = jdbc.sql("""
                            insert into promotion_grant (order_id, promotion_id, client_id, amount_minor, currency,
                                                         granted_at)
                            values (:order, :promotion, :client, :amount, :currency, :now)
                            on conflict do nothing""")
                    .param("order", orderId).param("promotion", bonus.promotionId())
                    .param("client", trip.payerClientId()).param("amount", amount).param("currency", trip.currency())
                    .param("now", now).update();
            if (inserted > 0) {
                wallets.creditPromotion(trip.payerClientId(), orderId, bonus.promotionId(), trip.currency(), amount,
                        bonus.name());
            }
        }
    }
}
