package taxi.blizz.promotions.internal;

import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.PersonalData;

/** The bonuses promotions gave the rider, for the copy of their data (REQ-PRV-07). */
@Component
class PromotionPersonalData implements PersonalData {

    private final JdbcClient jdbc;

    PromotionPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Grant(UUID orderId, String promotion, String currency, long amountMinor, OffsetDateTime grantedAt) {
    }

    @Override
    public String section() {
        return "promotion_bonuses";
    }

    @Override
    public Object of(Subject subject) {
        return jdbc.sql("""
                        select g.order_id, p.name, g.currency, g.amount_minor, g.granted_at
                        from promotion_grant g join rider_promotion p on p.id = g.promotion_id
                        where g.client_id = :id order by g.granted_at, g.order_id""")
                .param("id", subject.clientId())
                .query((rs, i) -> new Grant(rs.getObject("order_id", UUID.class), rs.getString("name"),
                        rs.getString("currency"), rs.getLong("amount_minor"),
                        rs.getObject("granted_at", OffsetDateTime.class)))
                .list();
    }
}
