package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.CommittedMetrics;

/** REQ-OBS-02: bounded labels and search timestamps, captured under the order lock. */
@Component
class OrderMetrics {
    private static final Logger log = LoggerFactory.getLogger(OrderMetrics.class);
    private static final Set<String> CANCELLATIONS = Set.of("CHANGED_MIND", "WAIT_TOO_LONG", "WRONG_ADDRESS",
            "OTHER_TRANSPORT", "NO_SHOW", "PASSENGER_ASKED", "VEHICLE_PROBLEM", "CANNOT_REACH", "DUPLICATE",
            "NO_CARS", "TEST_ORDER");
    private static final Set<String> EXCLUSIONS = Set.of("STALE_LOCATION", "INACCURATE_LOCATION", "OUTSIDE_CITY",
            "CITY_NOT_ADMITTED", "PAUSED", "NOT_ADMITTED", "CLASS", "PAYMENT", "RESTRICTED", "PREVIOUS_DRIVER",
            "ALREADY_OFFERED", "BUSY", "TOO_FAR");
    private final JdbcClient jdbc;
    private final Clock clock;
    private final CommittedMetrics metrics;

    OrderMetrics(JdbcClient jdbc, Clock clock, CommittedMetrics metrics) {
        this.jdbc = jdbc;
        this.clock = clock;
        this.metrics = metrics;
    }

    void event(UUID order, String type, Map<String, Object> payload) {
        switch (type) {
            case "OrderCreated", "OrderScheduled" -> jdbc.sql("select channel, preorder from ride_order where id = :id")
                    .param("id", order).query((rs, i) -> {
                        created(rs.getString(1), rs.getBoolean(2));
                        return true;
                    }).single();
            case "OrderUnfulfilled" -> metrics.counter("blizz.orders.unfulfilled");
            case "OfferMade" -> {
                if (jdbc.sql("select count(*) from offer where order_id = :id").param("id", order)
                        .query(Long.class).single() == 1) {
                    metrics.timer("blizz.dispatch.first_offer", searched(order));
                }
            }
            case "AssignmentCommitted" -> {
                String source = bounded("blizz.dispatch.assigned", payload.get("source") instanceof String value ? value : null, Set.of("OFFER", "BROADCAST", "RESERVATION"));
                metrics.timer("blizz.dispatch.assigned", searched(order), "source", source);
                if ("OFFER".equals(source)) offer("ACCEPTED");
            }
            case "OfferRejected" -> offer("DECLINED");
            default -> { /* Other history events do not represent these metrics. */ }
        }
    }

    void created(String channel, boolean preorder) {
        metrics.counter("blizz.orders.created", "channel", bounded("blizz.orders.created", channel, Set.of("APP", "WEB", "PHONE")),
                "preorder", Boolean.toString(preorder));
    }

    void cancelled(String by, String reason) {
        metrics.counter("blizz.orders.cancelled", "by", bounded("blizz.orders.cancelled", by, Set.of("RIDER", "STAFF", "DRIVER")),
                "reason", bounded("blizz.orders.cancelled", reason, CANCELLATIONS));
    }

    void offer(String outcome) {
        metrics.counter("blizz.offers", "outcome", bounded("blizz.offers", outcome, Set.of("ACCEPTED", "DECLINED", "EXPIRED", "REVOKED")));
    }

    void excluded(String reason) {
        metrics.counter("blizz.dispatch.excluded", "reason", bounded("blizz.dispatch.excluded", reason, EXCLUSIONS));
    }

    private Duration searched(UUID order) {
        // First start across resumed attempts; a reservation without dispatch has no search time.
        return jdbc.sql("select min(created_at) from dispatch_attempt where order_id = :id").param("id", order)
                .query((rs, i) -> {
                    OffsetDateTime start = rs.getObject(1, OffsetDateTime.class);
                    return start == null ? Duration.ZERO : Duration.between(start.toInstant(), clock.instant());
                }).single();
    }

    private static String bounded(String metric, String value, Set<String> allowed) {
        if (value != null && (allowed.contains(value) || value.equals("OTHER"))) return value;
        // Unexpected values may be identifiers or phone numbers; only enum-style words are safe to log.
        String safe = value == null ? "<null>" : value.matches("[A-Z][A-Z_]{0,63}") ? value : "[REDACTED]";
        log.warn("Unknown label for metric {}: {} -> OTHER", metric, safe);
        return "OTHER";
    }
}
