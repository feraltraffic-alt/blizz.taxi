package taxi.blizz;

import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.platform.Actor;
import taxi.blizz.pricing.QuoteService;

/**
 * Test fixture: gives a synthetic city a vehicle class with a published tariff and issues quotes
 * through the real {@link QuoteService}, so orders in tests are priced the way production prices them.
 */
public final class TestQuotes {

    private final JdbcClient jdbc;
    private final QuoteService quotes;

    public TestQuotes(JdbcClient jdbc, QuoteService quotes) {
        this.jdbc = jdbc;
        this.quotes = quotes;
    }

    /** The class id, creating the class and a tariff in force since yesterday when missing. */
    public UUID ensureClass(UUID cityId, String code) {
        UUID classId = jdbc.sql("select id from vehicle_class where city_id = :city and code = :code")
                .param("city", cityId).param("code", code).query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into vehicle_class (id, city_id, code, name, active, created_at, updated_at)
                                    values (:id, :city, :code, :code, true, now(), now())""")
                            .param("id", id).param("city", cityId).param("code", code).update();
                    return id;
                });
        int tariffs = jdbc.sql("""
                        select count(*) from tariff_version
                        where city_id = :city and class_id = :class and state = 'PUBLISHED'
                          and effective_from <= now() and (effective_to is null or effective_to > now())""")
                .param("city", cityId).param("class", classId).query(Integer.class).single();
        if (tariffs == 0) {
            jdbc.sql("""
                            insert into tariff_version (id, city_id, class_id, currency, effective_from, state,
                                                        pickup_minor, per_km_minor, per_minute_minor, minimum_minor,
                                                        free_waiting_minutes, waiting_per_minute_minor,
                                                        cancellation_fee_minor, commission_rate, waiting_step_seconds,
                                                        waiting_rounding, pickup_outside_minor,
                                                        per_km_outside_minor, zone_surcharges, created_at, updated_at)
                            select :id, :city, :class, currency, now() - interval '1 day', 'PUBLISHED',
                                   3000, 1200, 200, 6000, 3, 200, 0, 0.15, 60, 'UP', 3000, 1200, '[]', now(), now()
                            from city where id = :city""")
                    .param("id", UUID.randomUUID()).param("city", cityId).param("class", classId).update();
        }
        return classId;
    }

    public QuoteService.Quote quote(Actor payer, UUID cityId, String code, GeoPoint pickup, GeoPoint dropoff) {
        UUID classId = ensureClass(cityId, code);
        return quotes.create(UUID.randomUUID(), new QuoteService.Request(cityId, classId, pickup, dropoff, payer));
    }

    /** A quote for a pickup at {@code pickupAt}; far enough ahead it is a pre-order. */
    public QuoteService.Quote quote(Actor payer, UUID cityId, String code, GeoPoint pickup, GeoPoint dropoff,
                                    java.time.Instant pickupAt) {
        UUID classId = ensureClass(cityId, code);
        return quotes.create(UUID.randomUUID(), new QuoteService.Request(cityId, classId, pickup, dropoff, payer,
                pickupAt));
    }
}
