package taxi.blizz.finance.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.finance.FareDeltas;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * See {@link FareDeltas}. Every posting that touches the payer's debt names the order as its basis (trip fare, card
 * payment, bonuses, debt payment, chargeback, cash dispute), so the open debt on one order is the sum of the payer's
 * RIDER_RECEIVABLE lines with that basis.
 */
@Service
class JdbcFareDeltas implements FareDeltas {

    private final JdbcClient jdbc;
    private final Ledger ledger;

    JdbcFareDeltas(JdbcClient jdbc, Ledger ledger) {
        this.jdbc = jdbc;
        this.ledger = ledger;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public long post(Delta d) {
        boolean posted = jdbc.sql("""
                        select exists (select 1 from journal_transaction
                                       where basis_type = 'TRIP_FARE' and basis_id = :order)""")
                .param("order", d.orderId()).query(Boolean.class).single();
        if (!posted) {
            throw new DomainException(ErrorCode.STATE_CONFLICT,
                    "The order's fare is not in the journal yet; try again in a moment");
        }
        List<Line> lines = new ArrayList<>();
        long refund = 0;
        if (d.amountMinor() > 0) {
            lines.add(d.paidByService() ? Line.debit(Account.SERVICE_EXPENSE, null, d.amountMinor())
                    : Line.debit(Account.RIDER_RECEIVABLE, d.payerClientId(), d.amountMinor()));
        } else if (d.amountMinor() < 0) {
            long lower = -d.amountMinor();
            if (d.paidByService()) {
                lines.add(Line.credit(Account.SERVICE_EXPENSE, null, lower));
            } else {
                long reduced = Math.min(lower, Math.max(0, openDebt(d)));
                refund = lower - reduced;
                if (reduced > 0) {
                    lines.add(Line.credit(Account.RIDER_RECEIVABLE, d.payerClientId(), reduced));
                }
                if (refund > 0) {
                    lines.add(Line.credit(Account.REFUNDS_PAYABLE, d.payerClientId(), refund));
                }
            }
        }
        // The driver's share and the commission move by their own differences, on the side their sign says.
        add(lines, Account.DRIVER_PAYABLE, d.driverId(), d.driverShareMinor());
        add(lines, Account.SERVICE_COMMISSION, null, d.commissionMinor());
        ledger.post(new Ledger.Posting("fare-correction:" + d.correctionId(), "FARE_CORRECTION", d.orderId(),
                d.currency(), "Final fare corrected", lines));
        return refund;
    }

    /** A credit-natured account: a positive difference is a credit, a negative one a debit. */
    private static void add(List<Line> lines, Account account, UUID party, long difference) {
        if (difference > 0) {
            lines.add(Line.credit(account, party, difference));
        } else if (difference < 0) {
            lines.add(Line.debit(account, party, -difference));
        }
    }

    /** What the payer still owes on the order: their RIDER_RECEIVABLE lines with the order as the basis. */
    private long openDebt(Delta d) {
        return jdbc.sql("""
                        select coalesce(sum(l.debit_minor - l.credit_minor), 0)
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'RIDER_RECEIVABLE' and l.party_id = :payer""")
                .param("order", d.orderId()).param("payer", d.payerClientId()).query(Long.class).single();
    }

    @Override
    @Transactional(readOnly = true)
    public long refundObligation(UUID orderId) {
        return jdbc.sql("""
                        select coalesce(sum(l.credit_minor - l.debit_minor), 0)
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'REFUNDS_PAYABLE'""")
                .param("order", orderId).query(Long.class).single();
    }
}
