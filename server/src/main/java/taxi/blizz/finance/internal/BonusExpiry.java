package taxi.blizz.finance.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;

/**
 * Burns what is left of bonus lots at their end (ADR 0018 A5): Dt RIDER_WALLET, Kt WALLET_FORFEITED, once per lot,
 * never more than the rider has free (bonuses held for an order in progress stay). Riders are taken with SKIP LOCKED,
 * so two instances share them.
 */
@Component
public class BonusExpiry {

    static final String BASIS = "BONUS_EXPIRED";
    static final int BATCH = 100;

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final BonusLots lots;
    private final JdbcRiderWallets wallets;
    private final Ledger ledger;
    private final Clock clock;

    BonusExpiry(JdbcClient jdbc, TransactionTemplate tx, BonusLots lots, JdbcRiderWallets wallets, Ledger ledger,
                Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.lots = lots;
        this.wallets = wallets;
        this.ledger = ledger;
        this.clock = clock;
    }

    private record Rider(UUID clientId, String currency) {
    }

    /** One pass; how many lots it ended. */
    public int runOnce() {
        Integer done = tx.execute(status -> {
            OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
            List<Rider> due = jdbc.sql("""
                            select distinct client_id, currency from (
                                select client_id, currency from rider_bonus_lot
                                where expired_at is null and expires_at <= :now
                                order by expires_at limit :limit for update skip locked) d""")
                    .param("now", now).param("limit", BATCH)
                    .query((rs, i) -> new Rider(rs.getObject(1, UUID.class), rs.getString(2))).list();
            int ended = 0;
            for (Rider r : due) {
                for (BonusLots.Left left : lots.left(r.clientId(), r.currency())) {
                    BonusLots.Lot lot = left.lot();
                    if (lot.expiresAt().isAfter(now)) {
                        continue;
                    }
                    long burn = left.leftMinor();
                    if (burn > 0) {
                        ledger.post(new Ledger.Posting("bonus-expired:" + lot.id(), BASIS, lot.id(), r.currency(),
                                "Refund bonuses expired", List.of(Line.debit(Account.RIDER_WALLET, r.clientId(), burn),
                                        Line.credit(Account.WALLET_FORFEITED, null, burn))));
                    }
                    jdbc.sql("update rider_bonus_lot set expired_at = :now, expired_minor = :burn where id = :id")
                            .param("now", now).param("burn", Math.max(0, burn)).param("id", lot.id()).update();
                    ended++;
                }
            }
            return ended;
        });
        return done == null ? 0 : done;
    }
}
