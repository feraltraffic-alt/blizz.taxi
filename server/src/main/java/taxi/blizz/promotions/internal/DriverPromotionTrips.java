package taxi.blizz.promotions.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.finance.DriverBalances;
import taxi.blizz.geo.CityCatalog;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.promotions.DriverPromotions;
import tools.jackson.databind.json.JsonMapper;

/**
 * A completed trip counts for the drivers' promotions it fits (ADR 0010): the city, the payment method, the day and
 * hour in the city's time zone when the driver took the order, inside the promotion's time. When the period has
 * enough orders, the reward goes to the balance — once per period, or once for good. Idempotent per order.
 */
@Component
class DriverPromotionTrips implements OutboxHandler {

    private final JdbcClient jdbc;
    private final DriverBalances balances;
    private final CityCatalog cities;
    private final JsonMapper json;
    private final Clock clock;

    DriverPromotionTrips(JdbcClient jdbc, DriverBalances balances, CityCatalog cities, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.balances = balances;
        this.cities = cities;
        this.json = json;
        this.clock = clock;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record TripCompleted(UUID orderId, UUID driverId, String paymentMethod, UUID cityId, OffsetDateTime acceptedAt) {
    }

    @Override
    public String consumerId() {
        return "promotions.driver-trips";
    }

    @Override
    public boolean supports(String eventType) {
        return "TripCompleted".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        TripCompleted trip = json.readValue(message.payload(), TripCompleted.class);
        UUID orderId = trip.orderId() != null ? trip.orderId() : message.aggregateId();
        if (trip.driverId() == null || trip.acceptedAt() == null) {
            return;
        }
        ZoneId zone = cities.published().stream().filter(c -> c.id().equals(trip.cityId())).findFirst()
                .map(c -> ZoneId.of(c.timezone())).orElse(ZoneOffset.UTC);
        LocalDateTime local = LocalDateTime.ofInstant(trip.acceptedAt().toInstant(), zone);
        List<DriverPromotions.Promotion> fitting = jdbc.sql("select " + JdbcDriverPromotions.COLUMNS + """
                         from driver_promotion where state = 'ACTIVE' and starts_at <= :at
                          and (ends_at is null or ends_at > :at)
                          and (city_id is null or city_id = :city)
                          and (payment_method is null or payment_method = :payment)""")
                .param("at", trip.acceptedAt()).param("city", trip.cityId()).param("payment", trip.paymentMethod())
                .query((rs, i) -> JdbcDriverPromotions.promotion(rs)).list();
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        for (DriverPromotions.Promotion p : fitting) {
            DriverPromotions.Draft t = p.terms();
            if (t.daysOfWeek() != null && !t.daysOfWeek().contains(local.getDayOfWeek())) {
                continue;
            }
            if (t.timeFrom() != null && !JdbcRiderPromotions.within(local.toLocalTime(), t.timeFrom(), t.timeTo())) {
                continue;
            }
            int period = JdbcDriverPromotions.periodIndex(t, trip.acceptedAt().toInstant());
            int counted = jdbc.sql("""
                            insert into driver_promotion_trip (promotion_id, order_id, driver_id, period_index)
                            values (:p, :order, :driver, :period) on conflict do nothing""")
                    .param("p", p.id()).param("order", orderId).param("driver", trip.driverId())
                    .param("period", period).update();
            if (counted == 0) {
                continue;
            }
            // Two trips of the same driver finishing at once must not both see the target reached and both pay
            // (or both miss it): count and reward under a lock per promotion and driver, held until commit.
            jdbc.sql("select pg_advisory_xact_lock(hashtextextended(:key, 0))")
                    .param("key", "driver-promotion:" + p.id() + ":" + trip.driverId())
                    .query((rs, i) -> 1).single();
            long done = jdbc.sql("""
                            select count(*) from driver_promotion_trip
                            where promotion_id = :p and driver_id = :driver and period_index = :period""")
                    .param("p", p.id()).param("driver", trip.driverId()).param("period", period)
                    .query(Long.class).single();
            if (done < t.ordersRequired()) {
                continue;
            }
            boolean paidBefore = jdbc.sql("""
                            select count(*) from driver_promotion_reward where promotion_id = :p and driver_id = :driver
                              and (:once or period_index = :period)""")
                    .param("p", p.id()).param("driver", trip.driverId()).param("period", period)
                    .param("once", t.repeat() == DriverPromotions.Repeat.ONCE).query(Long.class).single() > 0;
            if (paidBefore) {
                continue;
            }
            jdbc.sql("""
                            insert into driver_promotion_reward (promotion_id, driver_id, period_index, amount_minor,
                                                                 currency, rewarded_at)
                            values (:p, :driver, :period, :amount, :currency, :now)""")
                    .param("p", p.id()).param("driver", trip.driverId()).param("period", period)
                    .param("amount", t.rewardMinor()).param("currency", t.currency()).param("now", now).update();
            balances.creditPromotion(trip.driverId(), p.id(), period, t.currency(), t.rewardMinor(), t.name());
        }
    }
}
