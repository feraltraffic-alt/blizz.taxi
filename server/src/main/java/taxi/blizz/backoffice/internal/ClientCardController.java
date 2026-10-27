package taxi.blizz.backoffice.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.backoffice.SupportCases;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ClientAccounts;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/**
 * The rider's card in the admin panel (REQ-ADM-01): the account, the orders in progress and the latest ones, the
 * bonus account, the debt and the support cases — each from the module that owns it. Needs
 * {@link ClientAccounts#MANAGE_PERMISSION}, checked by {@link ClientAccounts#get} first.
 */
@RestController
class ClientCardController {

    static final int LATEST = 20;

    private final ClientAccounts clients;
    private final Orders orders;
    private final Ledger ledger;
    private final RiderWallets wallets;
    private final SupportCases cases;

    ClientCardController(ClientAccounts clients, Orders orders, Ledger ledger, RiderWallets wallets,
                         SupportCases cases) {
        this.clients = clients;
        this.orders = orders;
        this.ledger = ledger;
        this.wallets = wallets;
        this.cases = cases;
    }

    /** {@code balanceMinor}: in the bonus account; {@code availableMinor}: not set aside for orders. */
    record Bonuses(String currency, long balanceMinor, long availableMinor) {
    }

    /** What the rider owes the service, e.g. a card payment that failed (REQ-PAY-18). */
    record Debt(String currency, long amountMinor) {
    }

    record CaseSummary(UUID id, long number, String category, String subject, String state, UUID orderId,
                       OffsetDateTime createdAt) {
    }

    record Card(ClientAccounts.Client client, List<OrderView> currentOrders, List<Orders.HistoryItem> latestOrders,
                List<Bonuses> bonuses, List<Debt> debt, List<CaseSummary> cases) {
    }

    @GetMapping("/api/admin/v1/clients/{clientId}")
    Card card(AccessClaims claims, @PathVariable UUID clientId) {
        ClientAccounts.Client client = clients.get(claims.actor(), clientId);
        Actor rider = new Actor(SubjectType.CLIENT, clientId);
        List<Bonuses> bonuses = ledger.balances(Ledger.Account.RIDER_WALLET, clientId).stream()
                .map(b -> new Bonuses(b.currency(), b.creditMinor() - b.debitMinor(),
                        wallets.available(clientId, b.currency())))
                .filter(b -> b.balanceMinor() != 0)
                .toList();
        List<Debt> debt = ledger.balances(Ledger.Account.RIDER_RECEIVABLE, clientId).stream()
                .filter(b -> b.debitMinor() - b.creditMinor() > 0)
                .map(b -> new Debt(b.currency(), b.debitMinor() - b.creditMinor()))
                .toList();
        List<CaseSummary> caseList = cases.mine(rider, null, LATEST).stream()
                .map(c -> new CaseSummary(c.id(), c.number(), c.category().name(), c.subject(), c.state().name(),
                        c.orderId(), c.createdAt()))
                .toList();
        return new Card(client, orders.current(clientId), orders.history(rider, null, LATEST), bonuses, debt,
                caseList);
    }
}
