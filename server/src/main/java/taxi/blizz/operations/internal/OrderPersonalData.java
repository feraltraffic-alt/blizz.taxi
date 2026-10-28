package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.PersonalData;

/**
 * The rider's orders, ratings, tips and chat messages for the copy of their data (REQ-PRV-07). Left out: the driver's
 * identity and phone, the person an order was made for (their name and phone are theirs) and staff ids.
 */
@Component
class OrderPersonalData implements PersonalData {

    private final JdbcClient jdbc;

    OrderPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Place(String label, double lat, double lon) {
    }

    record Order(UUID id, long number, String channel, UUID cityId, String vehicleClass, Place pickup, Place dropoff,
                 String paymentMethod, String currency, Long priceMinor, Long finalPriceMinor,
                 Long paidWithBonusesMinor, Long discountMinor, String status, String statusReason, boolean forAnotherPerson,
                 OffsetDateTime createdAt) {
    }

    /** {@code given}: by the rider about the driver; otherwise the driver's rating of the rider. */
    record Rating(UUID orderId, boolean given, int score, String comment, OffsetDateTime createdAt,
                  OffsetDateTime replacedAt) {
    }

    record Tip(UUID orderId, String currency, long amountMinor, String method, String state, OffsetDateTime createdAt) {
    }

    record Message(UUID orderId, String body, OffsetDateTime sentAt) {
    }

    @Override
    public String section() {
        return "orders";
    }

    @Override
    public Object of(Subject subject) {
        UUID id = subject.clientId();
        List<Order> orders = jdbc.sql("""
                        select o.id, o.short_number, o.channel, o.city_id, o.vehicle_class,
                               o.pickup_label, ST_Y(o.pickup) as pickup_lat, ST_X(o.pickup) as pickup_lon,
                               o.dropoff_label, ST_Y(o.dropoff) as dropoff_lat, ST_X(o.dropoff) as dropoff_lon,
                               o.payment_method, o.currency, o.price_minor, o.final_price_minor, o.wallet_minor,
                               o.discount_minor, o.status, o.status_reason, o.created_at,
                               exists (select 1 from order_contact c where c.order_id = o.id) as for_another
                        from ride_order o
                        where o.payer_client_id = :id or (o.created_by_type = 'CLIENT' and o.created_by_id = :id)
                        order by o.created_at, o.id""")
                .param("id", id)
                .query((rs, i) -> new Order(rs.getObject("id", UUID.class), rs.getLong("short_number"),
                        rs.getString("channel"), rs.getObject("city_id", UUID.class), rs.getString("vehicle_class"),
                        new Place(rs.getString("pickup_label"), rs.getDouble("pickup_lat"), rs.getDouble("pickup_lon")),
                        new Place(rs.getString("dropoff_label"), rs.getDouble("dropoff_lat"),
                                rs.getDouble("dropoff_lon")),
                        rs.getString("payment_method"), rs.getString("currency"), (Long) rs.getObject("price_minor"),
                        (Long) rs.getObject("final_price_minor"), (Long) rs.getObject("wallet_minor"),
                        (Long) rs.getObject("discount_minor"), rs.getString("status"), rs.getString("status_reason"),
                        rs.getBoolean("for_another"), rs.getObject("created_at", OffsetDateTime.class)))
                .list();
        List<Rating> ratings = jdbc.sql("""
                        select order_id, author_type = 'RIDER' as given, score, comment, created_at, superseded_at
                        from rating
                        where (author_type = 'RIDER' and author_id = :id) or (target_type = 'RIDER' and target_id = :id)
                        order by created_at, id""")
                .param("id", id)
                .query((rs, i) -> new Rating(rs.getObject("order_id", UUID.class), rs.getBoolean("given"),
                        rs.getInt("score"), rs.getString("comment"), rs.getObject("created_at", OffsetDateTime.class),
                        rs.getObject("superseded_at", OffsetDateTime.class)))
                .list();
        List<Tip> tips = jdbc.sql("""
                        select order_id, currency, amount_minor, method, state, created_at from order_tip
                        where payer_client_id = :id order by created_at, id""")
                .param("id", id)
                .query((rs, i) -> new Tip(rs.getObject("order_id", UUID.class), rs.getString("currency"),
                        rs.getLong("amount_minor"), rs.getString("method"), rs.getString("state"),
                        rs.getObject("created_at", OffsetDateTime.class)))
                .list();
        List<Message> messages = jdbc.sql("""
                        select order_id, body, sent_at from order_message
                        where sender_role = 'RIDER' and sender_id = :id order by sent_at, id""")
                .param("id", id)
                .query((rs, i) -> new Message(rs.getObject("order_id", UUID.class), rs.getString("body"),
                        rs.getObject("sent_at", OffsetDateTime.class)))
                .list();
        Map<String, Object> part = new LinkedHashMap<>();
        part.put("orders", orders);
        part.put("ratings", ratings);
        part.put("tips", tips);
        part.put("chat_messages_sent", messages);
        return part;
    }
}
