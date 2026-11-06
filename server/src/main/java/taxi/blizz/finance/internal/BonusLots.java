package taxi.blizz.finance.internal;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

/**
 * Bonuses that end (ADR 0018 A5, owner 06.11.2026): what is left of each lot, found by replaying the rider's bonus
 * account in the journal. A credit named by a lot opens it; a spending takes the open lots that end first, then the
 * bonuses that never end; an expiry takes its own lot. The rider's bonuses are thus spent before they burn.
 */
@Component
class BonusLots {

    private final JdbcClient jdbc;

    BonusLots(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Lot(UUID id, String creditKey, long amountMinor, OffsetDateTime expiresAt, OffsetDateTime expiredAt) {
    }

    record Left(Lot lot, long leftMinor) {
    }

    private static final class Open {
        final Lot lot;
        long left;

        Open(Lot lot, long left) {
            this.lot = lot;
            this.left = left;
        }
    }

    private record Move(String key, String basis, UUID basisId, long debit, long credit) {
    }

    /** Every lot of the rider in the currency with what is left of it now. */
    List<Left> left(UUID clientId, String currency) {
        Map<String, Lot> lots = new LinkedHashMap<>();
        jdbc.sql("""
                        select id, credit_key, amount_minor, expires_at, expired_at from rider_bonus_lot
                        where client_id = :client and currency = :currency""")
                .param("client", clientId).param("currency", currency)
                .query((rs, i) -> new Lot(rs.getObject(1, UUID.class), rs.getString(2), rs.getLong(3),
                        rs.getObject(4, OffsetDateTime.class), rs.getObject(5, OffsetDateTime.class)))
                .list().forEach(l -> lots.put(l.creditKey(), l));
        if (lots.isEmpty()) {
            return List.of();
        }
        List<Move> moves = jdbc.sql("""
                        select t.business_key, t.basis_type, t.basis_id, l.debit_minor, l.credit_minor
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where l.account = 'RIDER_WALLET' and l.party_id = :client and t.currency = :currency
                        order by t.occurred_at, t.id, l.line_no""")
                .param("client", clientId).param("currency", currency)
                .query((rs, i) -> new Move(rs.getString(1), rs.getString(2), rs.getObject(3, UUID.class),
                        rs.getLong(4), rs.getLong(5)))
                .list();
        List<Open> open = new ArrayList<>();
        Map<UUID, Open> byId = new LinkedHashMap<>();
        for (Move m : moves) {
            if (m.credit() > 0 && lots.containsKey(m.key())) {
                Open o = new Open(lots.get(m.key()), m.credit());
                open.add(o);
                byId.put(o.lot.id(), o);
            }
            if (m.debit() > 0) {
                if (BonusExpiry.BASIS.equals(m.basis()) && byId.containsKey(m.basisId())) {
                    Open o = byId.get(m.basisId());
                    o.left = Math.max(0, o.left - m.debit());
                    continue;
                }
                long debit = 0;
                open.sort(Comparator.comparing((Open o) -> o.lot.expiresAt()).thenComparing(o -> o.lot.id()));
                for (Open o : open) {
                    long take = Math.min(debit, o.left);
                    o.left -= take;
                    debit -= take;
                    if (debit == 0) {
                        break;
                    }
                }
            }
        }
        List<Left> result = new ArrayList<>();
        for (Lot lot : lots.values()) {
            Open o = byId.get(lot.id());
            result.add(new Left(lot, o == null ? 0 : o.left));
        }
        return result;
    }
}
