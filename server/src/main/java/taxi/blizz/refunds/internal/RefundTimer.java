package taxi.blizz.refunds.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;

/**
 * Requests waiting for a confirmation (ADR 0018 A3): after the service's {@code reminder_hours} the confirmers are
 * reminded once (RefundWaiting, a case in the problem queue), after {@code close_after_days} the request closes as
 * NOT_REVIEWED and nothing moves (RefundNotReviewed). Rows are claimed with SKIP LOCKED, so two instances share them.
 */
@Component
public class RefundTimer {

    static final int BATCH = 200;

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final ServiceSettings settings;
    private final Outbox outbox;
    private final Clock clock;

    RefundTimer(JdbcClient jdbc, TransactionTemplate tx, ServiceSettings settings, Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.settings = settings;
        this.outbox = outbox;
        this.clock = clock;
    }

    private record Waiting(UUID id, UUID orderId, UUID cityId, long amount, String currency, UUID requestedBy,
                           OffsetDateTime requestedAt, OffsetDateTime remindedAt, long version) {
    }

    /** One pass; how many requests it reminded of or closed. */
    public int runOnce() {
        Integer done = tx.execute(status -> {
            OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
            List<Waiting> waiting = jdbc.sql("""
                            select id, order_id, city_id, amount_minor, currency, requested_by, requested_at,
                                   reminded_at, version
                            from refund where state = 'REQUESTED' and requested_at < :hourAgo
                            order by requested_at limit :limit for update skip locked""")
                    .param("hourAgo", now.minusHours(1)).param("limit", BATCH)
                    .query((rs, i) -> new Waiting(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                            rs.getObject(3, UUID.class), rs.getLong(4), rs.getString(5), rs.getObject(6, UUID.class),
                            rs.getObject(7, OffsetDateTime.class), rs.getObject(8, OffsetDateTime.class),
                            rs.getLong(9)))
                    .list();
            int changed = 0;
            for (Waiting w : waiting) {
                ServiceSettings.Refunds rules = settings.ofCity(w.cityId()).settings().refunds();
                if (!w.requestedAt().isAfter(now.minusDays(rules.closeAfterDays()))) {
                    jdbc.sql("""
                                    update refund set state = 'NOT_REVIEWED', ended_at = :now, version = version + 1
                                    where id = :id""")
                            .param("now", now).param("id", w.id()).update();
                    publish("RefundNotReviewed", w, "NOT_REVIEWED", w.version() + 1);
                    changed++;
                } else if (w.remindedAt() == null
                        && !w.requestedAt().isAfter(now.minusHours(rules.reminderHours()))) {
                    jdbc.sql("update refund set reminded_at = :now where id = :id")
                            .param("now", now).param("id", w.id()).update();
                    publish("RefundWaiting", w, "REQUESTED", w.version());
                    changed++;
                }
            }
            return changed;
        });
        return done == null ? 0 : done;
    }

    private void publish(String type, Waiting w, String state, long version) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("refund_id", w.id().toString());
        payload.put("order_id", w.orderId().toString());
        payload.put("city_id", w.cityId().toString());
        payload.put("amount_minor", w.amount());
        payload.put("currency", w.currency());
        payload.put("state", state);
        payload.put("requested_by", w.requestedBy().toString());
        outbox.publish(new OutboxEvent(type, 1, "Refund", w.id(), version, payload));
    }
}
