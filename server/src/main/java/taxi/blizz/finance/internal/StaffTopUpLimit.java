package taxi.blizz.finance.internal;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.OptionalLong;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * What one staff member may top up in 24 hours (threat model C3, owner decision 30.10.2026): driver balance top-ups
 * and rider wallet top-ups together, per currency, up to the service setting {@code staff_top_ups}. Checked inside the
 * top-up's own transaction, serialized per staff member and currency, so two top-ups at once cannot both slip under
 * the limit.
 */
@Component
class StaffTopUpLimit {

    static final Duration WINDOW = Duration.ofHours(24);

    private final JdbcClient jdbc;
    private final ServiceSettings settings;

    StaffTopUpLimit(JdbcClient jdbc, ServiceSettings settings) {
        this.jdbc = jdbc;
        this.settings = settings;
    }

    /** Refuses {@code amountMinor} when it takes the staff member over the limit for the currency. */
    @Transactional(propagation = Propagation.MANDATORY)
    void check(Actor staff, String currency, long amountMinor, OffsetDateTime now) {
        OptionalLong max = settings.current().settings().staffTopUps().dailyMax(currency);
        if (max.isEmpty()) {
            return;
        }
        jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))")
                .param("key", "staff-top-up:" + staff.id() + ":" + currency)
                .query().singleRow();
        long done = jdbc.sql("""
                        select coalesce((select sum(amount_minor) from driver_balance_top_up
                                         where staff_id = :staff and currency = :currency and created_at > :since), 0)
                             + coalesce((select sum(amount_minor) from rider_wallet_top_up
                                         where source = 'STAFF' and staff_id = :staff and currency = :currency
                                           and created_at > :since), 0)""")
                .param("staff", staff.id())
                .param("currency", currency)
                .param("since", now.minus(WINDOW))
                .query(Long.class).single();
        if (done + amountMinor > max.getAsLong()) {
            throw new DomainException(ErrorCode.TOP_UP_DAILY_LIMIT, "This top-up would take you over the limit of "
                    + max.getAsLong() + " minor units of " + currency + " in 24 hours; " + Math.max(0,
                    max.getAsLong() - done) + " left");
        }
    }
}
