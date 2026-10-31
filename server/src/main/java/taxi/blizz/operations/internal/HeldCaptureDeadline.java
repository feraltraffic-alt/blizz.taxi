package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.DatabaseGauges;

/**
 * A capture held by a trip-facts correction must not outlive the card hold (review of #169): a held card trip whose
 * hold expires within {@code blizz.trips.held-capture-margin} is captured with the order's current fare without
 * waiting for the review, which still happens. Its gauges show how many captures are held and how soon the first
 * hold expires.
 */
@Component
class HeldCaptureDeadline extends DatabaseGauges {

    private static final Logger log = LoggerFactory.getLogger(HeldCaptureDeadline.class);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final JdbcTripCorrections corrections;
    private final CardPayments cardPayments;
    private final Clock clock;
    private final Duration margin;

    HeldCaptureDeadline(JdbcClient jdbc, TransactionTemplate tx, JdbcTripCorrections corrections,
                        CardPayments cardPayments, Clock clock,
                        @Value("${blizz.trips.held-capture-margin:PT6H}") Duration margin) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.corrections = corrections;
        this.cardPayments = cardPayments;
        this.clock = clock;
        this.margin = margin;
        gauge("blizz.trips.held_captures", "Card trips whose capture waits for the review of a facts correction",
                () -> held().size());
        gauge("blizz.trips.held_capture.expiry.seconds",
                "Seconds until the first card hold of a held capture expires; 0 when none is held",
                () -> held().stream().map(cardPayments::holdExpiresAt).flatMap(Optional::stream)
                        .map(at -> Duration.between(clock.instant(), at.toInstant()).toSeconds())
                        .min(Long::compare).orElse(0L));
    }

    /** Every few minutes, by the service clock. */
    @Scheduled(fixedDelayString = "${blizz.trips.held-capture-check:PT5M}", initialDelayString = "PT1M")
    void run() {
        releaseExpiring(clock.instant());
    }

    /** Releases every held capture whose hold expires within the margin of {@code now}; how many it released. */
    int releaseExpiring(Instant now) {
        int released = 0;
        for (UUID orderId : held()) {
            Optional<OffsetDateTime> expires = cardPayments.holdExpiresAt(orderId);
            if (expires.isEmpty() || now.isBefore(expires.get().toInstant().minus(margin))) {
                continue;
            }
            try {
                if (Boolean.TRUE.equals(tx.execute(status -> corrections.releaseByDeadline(orderId)))) {
                    released++;
                    log.warn("Held capture of order {} released: its card hold expires at {}", orderId,
                            expires.get());
                }
            } catch (RuntimeException e) {
                log.error("Held capture of order {} could not be released before {}", orderId, expires.get(), e);
            }
        }
        return released;
    }

    /** Completed card trips whose capture an open, unreleased correction holds. */
    private List<UUID> held() {
        return jdbc.sql("""
                        select distinct c.order_id
                        from trip_correction c
                        join trip t on t.id = c.trip_id
                        join ride_order o on o.id = c.order_id
                        where c.holds_capture and c.reviewed_at is null and c.released_by_deadline_at is null
                          and t.completed_at is not null
                          and o.payment_method = 'CARD' and o.payment_state = 'AUTHORIZED'""")
                .query(UUID.class).list();
    }
}
