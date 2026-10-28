package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.CommittedMetrics;

/** REQ-OBS-02: bounded labels and search timestamps, captured under the order lock. */
@Component
class OrderMetrics {
    private static final Set<String> CANCELLATIONS = Set.of("CHANGED_MIND", "WAIT_TOO_LONG", "WRONG_ADDRESS",
            "OTHER_TRANSPORT", "NO_SHOW", "PASSENGER_ASKED", "VEHICLE_PROBLEM", "CANNOT_REACH", "DUPLICATE",
            "NO_CARS", "TEST_ORDER");
    private static final Set<String> EXCLUSIONS = Set.of("STALE_LOCATION", "PAUSED", "NOT_ADMITTED", "CLASS",
            "PAYMENT", "RESTRICTED", "PREVIOUS_DRIVER", "ALREADY_OFFERED", "BUSY", "TOO_FAR");
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
                        metrics.counter("blizz.orders.created", "channel",
                                bounded(rs.getString(1), Set.of("APP", "WEB", "PHONE")),
                                "preorder", Boolean.toString(rs.getBoolean(2)));
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
                String source = bounded((String) payload.get("source"), Set.of("OFFER", "BROADCAST", "RESERVATION"));
                metrics.timer("blizz.dispatch.assigned", searched(order), "source", source);
                if ("OFFER".equals(source)) offer("ACCEPTED");
            }
            case "OfferRejected" -> offer("DECLINED");
            default -> { /* Other history events do not represent these metrics. */ }
        }
    }

    void cancelled(String by, String reason) {
        metrics.counter("blizz.orders.cancelled", "by", bounded(by, Set.of("RIDER", "STAFF", "DRIVER")),
                "reason", CANCELLATIONS.contains(reason) ? reason : "OTHER");
    }

    void offer(String outcome) {
        metrics.counter("blizz.offers", "outcome", bounded(outcome, Set.of("ACCEPTED", "DECLINED", "EXPIRED", "REVOKED")));
    }

    void excluded(String reason) {
        metrics.counter("blizz.dispatch.excluded", "reason", bounded(reason, EXCLUSIONS));
    }

    private Duration searched(UUID order) {
        // First start across resumed attempts; a reservation without dispatch has no search time.
        return jdbc.sql("select min(created_at) from dispatch_attempt where order_id = :id").param("id", order)
                .query((rs, i) -> {
                    OffsetDateTime start = rs.getObject(1, OffsetDateTime.class);
                    return start == null ? Duration.ZERO : Duration.between(start.toInstant(), clock.instant());
                }).single();
    }

    private static String bounded(String value, Set<String> allowed) {
        if (!allowed.contains(value)) throw new IllegalArgumentException("Unknown metric label value");
        return value;
    }
}
