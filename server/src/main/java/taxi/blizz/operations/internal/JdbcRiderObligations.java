package taxi.blizz.operations.internal;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.finance.RiderDebts;
import taxi.blizz.operations.RiderObligations;
import taxi.blizz.payments.CardTopUps;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;

/**
 * See {@link RiderObligations}. The journal says what is owed (finance's {@link RiderDebts}); the order says whose it
 * is and whether its payment has ended; payments opens the page. The start takes the order's lock, so two starts of
 * one obligation see each other's page (E2 of #140).
 */
@Service
class JdbcRiderObligations implements RiderObligations {

    /** A payment that has ended: what is left on the journal is a debt, not a payment still coming. */
    static final Set<String> ENDED = Set.of("PAID", "PARTIALLY_PAID", "CASH_REPORTED", "TERMINAL_REPORTED");

    private final JdbcClient jdbc;
    private final OrderCore core;
    private final RiderDebts debts;
    private final CardTopUps cardTopUps;
    private final IdempotentCommands commands;

    JdbcRiderObligations(JdbcClient jdbc, OrderCore core, RiderDebts debts, CardTopUps cardTopUps,
                         IdempotentCommands commands) {
        this.jdbc = jdbc;
        this.core = core;
        this.debts = debts;
        this.cardTopUps = cardTopUps;
        this.commands = commands;
    }

    @Override
    public List<Obligation> list(Actor rider) {
        requireRider(rider);
        List<RiderDebts.Balance> owed = debts.owedBy(rider.id());
        if (owed.isEmpty()) {
            return List.of();
        }
        Set<UUID> ended = Set.copyOf(jdbc.sql("""
                        select id from ride_order
                        where id in (:ids) and payer_client_id = :rider and payment_state in (:ended)""")
                .param("ids", owed.stream().map(RiderDebts.Balance::orderId).toList())
                .param("rider", rider.id()).param("ended", ENDED)
                .query(UUID.class).list());
        return owed.stream().filter(b -> ended.contains(b.orderId()))
                .map(b -> new Obligation(b.orderId(), b.currency(), b.owedMinor(), b.paidMinor(), b.remainderMinor(),
                        cardTopUps.repaymentsOf(b.orderId())))
                .toList();
    }

    record RepayRequest(UUID orderId, Long amountMinor) {
    }

    @Override
    public CardTopUps.TopUp startRepayment(Actor rider, UUID commandId, UUID orderId, Long amountMinor) {
        requireRider(rider);
        if (commandId == null || orderId == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The command and the order are required");
        }
        return commands.execute(new CommandKey(rider, "obligation.repay", commandId),
                new RepayRequest(orderId, amountMinor), CardTopUps.TopUp.class, () -> {
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    if (!rider.id().equals(order.payerClientId()) || !ENDED.contains(core.paymentState(orderId))) {
                        throw new DomainException(ErrorCode.NOT_FOUND, "Nothing is owed on this order");
                    }
                    RiderDebts.Balance balance = debts.of(rider.id(), orderId)
                            .filter(b -> b.remainderMinor() > 0)
                            .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND,
                                    "Nothing is owed on this order"));
                    long amount = amountMinor == null ? balance.remainderMinor() : amountMinor;
                    if (amount < 1 || amount > balance.remainderMinor()) {
                        throw new DomainException(ErrorCode.VALIDATION_FAILED,
                                "At most the remainder, " + balance.remainderMinor() + " minor units");
                    }
                    return cardTopUps.openRepayment(rider, order.cityId(), orderId, amount);
                });
    }

    @Override
    public CardTopUps.TopUp payment(Actor rider, UUID paymentId) {
        requireRider(rider);
        return cardTopUps.repayment(rider, paymentId);
    }

    private static void requireRider(Actor actor) {
        if (actor == null || actor.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Riders only");
        }
    }
}
