package taxi.blizz.payments.internal;

import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.PersonalData;

/**
 * The rider's cards and card payments for the copy of their data (REQ-PRV-07). A card is shown as the provider
 * masked it; the provider's token never leaves the service.
 */
@Component
class PaymentPersonalData implements PersonalData {

    private final JdbcClient jdbc;

    PaymentPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Card(UUID id, String maskedPan, String cardType, String state, OffsetDateTime addedAt,
                OffsetDateTime removedAt) {
    }

    record OrderPayment(UUID orderId, UUID cardId, String currency, long heldMinor, Long chargedMinor, String state,
                        OffsetDateTime createdAt) {
    }

    record TopUp(String currency, long amountMinor, String maskedPan, String state, OffsetDateTime createdAt,
                 OffsetDateTime completedAt) {
    }

    @Override
    public String section() {
        return "card_payments";
    }

    @Override
    public Object of(Subject subject) {
        UUID id = subject.clientId();
        List<Card> cards = jdbc.sql("""
                        select id, masked_pan, card_type, state, created_at, removed_at from payment_card
                        where client_id = :id order by created_at, id""")
                .param("id", id)
                .query((rs, i) -> new Card(rs.getObject("id", UUID.class), rs.getString("masked_pan"),
                        rs.getString("card_type"), rs.getString("state"),
                        rs.getObject("created_at", OffsetDateTime.class),
                        rs.getObject("removed_at", OffsetDateTime.class)))
                .list();
        List<OrderPayment> payments = jdbc.sql("""
                        select order_id, card_id, currency, hold_minor, capture_minor, state, created_at
                        from payment_intent where client_id = :id order by created_at, id""")
                .param("id", id)
                .query((rs, i) -> new OrderPayment(rs.getObject("order_id", UUID.class),
                        rs.getObject("card_id", UUID.class), rs.getString("currency"), rs.getLong("hold_minor"),
                        (Long) rs.getObject("capture_minor"), rs.getString("state"),
                        rs.getObject("created_at", OffsetDateTime.class)))
                .list();
        List<TopUp> topUps = jdbc.sql("""
                        select currency, amount_minor, masked_pan, state, created_at, completed_at from card_top_up
                        where account_type = 'CLIENT' and account_id = :id order by created_at, id""")
                .param("id", id)
                .query((rs, i) -> new TopUp(rs.getString("currency"), rs.getLong("amount_minor"),
                        rs.getString("masked_pan"), rs.getString("state"),
                        rs.getObject("created_at", OffsetDateTime.class),
                        rs.getObject("completed_at", OffsetDateTime.class)))
                .list();
        Map<String, Object> part = new LinkedHashMap<>();
        part.put("cards", cards);
        part.put("order_payments", payments);
        part.put("bonus_account_top_ups", topUps);
        return part;
    }
}
