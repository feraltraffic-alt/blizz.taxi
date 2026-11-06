package taxi.blizz.refunds.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.CityCatalog;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.Orders;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.refunds.Refunds;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.json.JsonMapper;

/**
 * Refund requests and their confirmation (ADR 0018 A1–A9, issue #512). Every check runs on the server, under a lock
 * per order (what is left of the payment) and per staff member and currency (the 24-hour limit), so two requests at
 * once cannot pass a sum together. No money moves here: an approved refund waits for the execution (part 2).
 */
@Service
class JdbcRefunds implements Refunds {

    /** The states whose sums are taken: everything but a refund that ended without money moving or failed. */
    static final String TAKEN = "('REQUESTED', 'APPROVED', 'PROCESSING', 'SUCCEEDED', 'UNKNOWN')";
    private static final Set<String> FAULTS = Set.of("CLIENT_FREE", "CLIENT", "DRIVER", "OPERATOR", "NONE");
    private static final String OTHER = "OTHER";
    private static final String SELECT = """
            select id, order_id, city_id, client_id, driver_id, currency, amount_minor, card_minor, bonus_minor,
                   paid_bonus_minor, rider_agreed, reason_code, reason_labels::text as reason_labels, fault, comment,
                   state, requested_by, requested_at, decided_by, decided_at, decision_reason, ended_at, version
            from refund""";

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final Outbox outbox;
    private final Orders orders;
    private final CardPayments cards;
    private final CancelReasons reasons;
    private final ServiceSettings settings;
    private final CityCatalog cities;
    private final JsonMapper json;
    private final Clock clock;
    private final taxi.blizz.identity.Services services;

    JdbcRefunds(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit, Outbox outbox,
                Orders orders, CardPayments cards, CancelReasons reasons, ServiceSettings settings,
                CityCatalog cities, JsonMapper json, Clock clock, taxi.blizz.identity.Services services) {
        this.services = services;
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.outbox = outbox;
        this.orders = orders;
        this.cards = cards;
        this.reasons = reasons;
        this.settings = settings;
        this.cities = cities;
        this.json = json;
        this.clock = clock;
    }

    // ------------------------------------------------------------ what an order allows

    /** Paid with money (card or cash) and with bonuses; for a card trip the money is what the card paid. */
    private record Paid(String currency, long money, long bonus, boolean cash, OffsetDateTime endedAt) {
    }

    private record Taken(long total, long fromBonus) {
    }

    private Orders.RefundFacts facts(UUID orderId) {
        return orders.refundFacts(orderId)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
    }

    private Paid paid(Orders.RefundFacts o, ServiceSettings.Refunds rules) {
        if (!"FULFILLED".equals(o.status()) && !"CANCELLED".equals(o.status())) {
            throw notAllowed("Only a completed or cancelled order is refunded");
        }
        boolean card = "CARD".equals(o.paymentMethod());
        long money;
        if (card) {
            CardPayments.Paid p = cards.paidByCard(o.orderId()).orElse(null);
            money = p == null ? 0 : p.fareMinor() + (rules.refundTips() ? p.tipsMinor() : 0);
        } else if ("CASH".equals(o.paymentMethod()) || "TERMINAL".equals(o.paymentMethod())) {
            money = Boolean.TRUE.equals(o.cashReceived())
                    ? Math.max(0, o.fareMinor() - o.walletMinor() - o.discountMinor()) : 0;
        } else {
            money = 0;
        }
        return new Paid(o.currency(), money, o.walletMinor(), !card, o.endedAt());
    }

    private Taken taken(UUID orderId) {
        return jdbc.sql("select coalesce(sum(amount_minor), 0), coalesce(sum(paid_bonus_minor), 0) from refund "
                        + "where order_id = :order and state in " + TAKEN)
                .param("order", orderId).query((rs, i) -> new Taken(rs.getLong(1), rs.getLong(2))).single();
    }

    private int riderRefunds(UUID clientId, ServiceSettings.Refunds rules) {
        return jdbc.sql("select count(*) from refund where client_id = :client and requested_at > :since "
                        + "and state in " + TAKEN)
                .param("client", clientId).param("since", now().minusDays(rules.riderWarningDays()))
                .query(Integer.class).single();
    }

    private OffsetDateTime until(Actor actor, Paid paid, ServiceSettings.Refunds rules) {
        return paid.endedAt() == null ? null
                : paid.endedAt().plusDays(staff.superAdmin(actor) ? rules.superAdminDays() : rules.staffDays());
    }

    private String defaultFault(Orders.RefundFacts o) {
        return "CANCELLED".equals(o.status()) ? (o.cancelFault() == null ? "NONE" : o.cancelFault()) : null;
    }

    @Override
    @Transactional(readOnly = true)
    public Refundable refundable(Actor actor, UUID orderId) {
        requireAny(actor, null);
        Orders.RefundFacts o = facts(orderId);
        requireAny(actor, o.cityId());
        ServiceSettings.Refunds rules = settings.ofCity(o.cityId()).settings().refunds();
        Paid paid = paid(o, rules);
        Taken taken = taken(orderId);
        int rider = riderRefunds(o.payerClientId(), rules);
        return new Refundable(orderId, paid.currency(), paid.money(), paid.bonus(), taken.total(),
                Math.max(0, paid.money() + paid.bonus() - taken.total()), rules.minimum(paid.currency()),
                !paid.cash() || rules.cardForCash(), until(actor, paid, rules), defaultFault(o),
                rider >= rules.riderWarningCount(), rider);
    }

    // ------------------------------------------------------------ the request

    record RequestCommand(Request request) {
    }

    @Override
    public Requested request(Actor actor, UUID commandId, Request r) {
        if (r == null || r.orderId() == null) {
            throw invalid("The order is required");
        }
        // Nobody without the permission learns whether the order exists; then its city decides.
        staff.require(actor, CREATE_PERMISSION);
        Orders.RefundFacts o = facts(r.orderId());
        staff.require(actor, CREATE_PERMISSION, o.cityId());
        return commands.execute(new CommandKey(actor, "refund.request", commandId), new RequestCommand(r),
                Requested.class, () -> requestInside(actor, r));
    }

    Requested requestInside(Actor actor, Request r) {
        // no lock
        Orders.RefundFacts o = facts(r.orderId());
        ServiceSettings.Refunds rules = settings.ofCity(o.cityId()).settings().refunds();
        boolean superAdmin = staff.superAdmin(actor);
        Paid paid = paid(o, rules);
        String currency = paid.currency();
        long amount = r.amountMinor();
        if (amount < rules.minimum(currency)) {
            throw notAllowed("The smallest refund is " + rules.minimum(currency) + " " + currency + " in minor units");
        }
        OffsetDateTime until = until(actor, paid, rules);
        if (until == null || now().isAfter(until)) {
            throw notAllowed("Too late: refunds of this order were possible until " + until);
        }
        Taken taken = taken(o.orderId());
        long moneyLeft = paid.money() - (taken.total() - taken.fromBonus());
        long bonusLeft = paid.bonus() - taken.fromBonus();
        if (amount > moneyLeft + bonusLeft) {
            throw notAllowed("Left to refund: " + Math.max(0, moneyLeft + bonusLeft) + " " + currency
                    + " in minor units");
        }
        // A5: the part paid with bonuses goes back as bonuses, in the share it had in the payment.
        long paidTotal = paid.money() + paid.bonus();
        long fromBonus = Math.min(bonusLeft, paidTotal == 0 ? 0 : Math.floorDiv(amount * paid.bonus(), paidTotal));
        long fromMoney = amount - fromBonus;
        if (fromMoney > moneyLeft) {
            fromBonus += fromMoney - moneyLeft;
            fromMoney = moneyLeft;
        }
        String destination = r.destination() == null ? "" : r.destination();
        if (!destination.equals("CARD") && !destination.equals("BONUSES")) {
            throw invalid("The destination is CARD or BONUSES");
        }
        if (destination.equals("CARD") && fromMoney > 0 && paid.cash()) {
            throw notAllowed("A cash trip is refunded only as bonuses");
        }
        if (destination.equals("BONUSES") && fromMoney > 0 && !r.riderAgreed()) {
            throw invalid("Bonuses instead of money need the mark that the rider agreed");
        }
        long card = destination.equals("CARD") ? fromMoney : 0;
        CancelReasons.Reason reason = reasons.require(actor, CancelReasons.Audience.REFUND, r.reasonCode());
        String comment = r.comment() == null || r.comment().isBlank() ? null : r.comment().strip();
        if (comment != null && comment.length() > 500) {
            throw invalid("A comment has at most 500 characters");
        }
        String usual = defaultFault(o) != null ? defaultFault(o)
                : OTHER.equals(reason.code()) ? null
                : reason.fault() == null ? "NONE" : reason.fault().name();
        String fault = r.fault() == null || r.fault().isBlank() ? usual : r.fault().strip();
        if (fault == null || !FAULTS.contains(fault)) {
            throw invalid("The fault is one of CLIENT_FREE, CLIENT, DRIVER, OPERATOR, NONE");
        }
        if ((OTHER.equals(reason.code()) || !fault.equals(usual)) && comment == null) {
            throw invalid("The reason OTHER or another fault needs a comment");
        }
        if (!superAdmin) {
            limit(actor, currency, amount);
        }
        int rider = riderRefunds(o.payerClientId(), rules);
        UUID id = UUID.randomUUID();
        OffsetDateTime now = now();
        String state = superAdmin ? "APPROVED" : "REQUESTED";
        UUID service = cities.serviceOf(o.cityId()).orElseThrow();
        jdbc.sql("""
                        insert into refund (id, service_id, order_id, city_id, client_id, driver_id, currency,
                                            amount_minor, card_minor, bonus_minor, paid_bonus_minor, rider_agreed,
                                            reason_code, reason_labels, fault, comment, state, requested_by,
                                            requested_at, decided_by, decided_at)
                        values (:id, :service, :order, :city, :client, :driver, :currency, :amount, :card, :bonus,
                                :fromBonus, :agreed, :code, cast(:labels as jsonb), :fault, :comment, :state, :by, :now,
                                :decidedBy, :decidedAt)""")
                .param("id", id).param("service", service).param("order", o.orderId()).param("city", o.cityId())
                .param("client", o.payerClientId()).param("driver", o.driverId()).param("currency", currency)
                .param("amount", amount).param("card", card).param("bonus", amount - card)
                .param("fromBonus", fromBonus).param("agreed", r.riderAgreed()).param("code", reason.code())
                .param("labels", json.writeValueAsString(reason.labels())).param("fault", fault)
                .param("comment", comment).param("state", state).param("by", actor.id()).param("now", now)
                .param("decidedBy", superAdmin ? actor.id() : null).param("decidedAt", superAdmin ? now : null)
                .update();
        Refund refund = read(id);
        publish(superAdmin ? "RefundApproved" : "RefundRequested", refund);
        audit.record(new AuditEntry(actor, "refund.request", "refund", id.toString(),
                comment == null ? reason.code() : comment, null, refund));
        return new Requested(refund, rider >= rules.riderWarningCount(), rider);
    }

    /** A2: the staff member's limits in the currency, for one refund and for the last 24 hours. */
    private void limit(Actor actor, String currency, long amount) {
        Limit limit = limitOf(actor.id(), currency);
        if (limit == null) {
            throw new DomainException(ErrorCode.REFUND_LIMIT, "No refund limit is set for " + currency);
        }
        if (amount > limit.perRefundMinor()) {
            throw new DomainException(ErrorCode.REFUND_LIMIT, "One refund is at most " + limit.perRefundMinor()
                    + " " + currency + " in minor units");
        }
        long left = limit.dailyMinor() - limit.usedMinor();
        if (left < 0) {
            throw new DomainException(ErrorCode.REFUND_LIMIT, "Left for 24 hours: " + Math.max(0, left) + " "
                    + currency + " in minor units");
        }
    }

    private Limit limitOf(UUID staffId, String currency) {
        return jdbc.sql("""
                        select l.staff_id, l.currency, l.per_refund_minor, l.daily_minor, l.version,
                               (select coalesce(sum(amount_minor), 0) from refund r
                                where r.requested_by = l.staff_id and r.currency = l.currency
                                  and r.requested_at > :since and r.state in """ + TAKEN + """
                               ) as used
                        from staff_refund_limit l where l.staff_id = :staff and l.currency = :currency""")
                .param("staff", staffId).param("currency", currency).param("since", now().minusHours(24))
                .query((rs, i) -> new Limit(rs.getObject(1, UUID.class), rs.getString(2), rs.getLong(3),
                        rs.getLong(4), rs.getLong("used"), rs.getLong(5)))
                .optional().orElse(null);
    }

    // ------------------------------------------------------------ the confirmation

    record DecisionCommand(UUID refundId, long expectedVersion, String reason) {
    }

    @Override
    public Refund confirm(Actor actor, UUID commandId, UUID refundId, long expectedVersion) {
        staff.require(actor, CONFIRM_PERMISSION);
        Refund before = existing(refundId);
        staff.require(actor, CONFIRM_PERMISSION, before.cityId());
        return commands.execute(new CommandKey(actor, "refund.confirm", commandId),
                new DecisionCommand(refundId, expectedVersion, null), Refund.class,
                () -> decide(actor, refundId, expectedVersion, "APPROVED", null));
    }

    @Override
    public Refund reject(Actor actor, UUID commandId, UUID refundId, long expectedVersion, String reason) {
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > 500) {
            throw invalid("A reason of 1 to 500 characters is required");
        }
        staff.require(actor, CONFIRM_PERMISSION);
        Refund before = existing(refundId);
        staff.require(actor, CONFIRM_PERMISSION, before.cityId());
        return commands.execute(new CommandKey(actor, "refund.reject", commandId),
                new DecisionCommand(refundId, expectedVersion, why), Refund.class,
                () -> decide(actor, refundId, expectedVersion, "REJECTED", why));
    }

    Refund decide(Actor actor, UUID refundId, long expectedVersion, String state, String why) {
        Refund before = jdbc.sql(SELECT + " where id = :id for update").param("id", refundId)
                .query((rs, i) -> map(rs)).single();
        if (before.version() != expectedVersion) {
            throw ConflictException.version(before.version(), "The refund changed");
        }
        if (!"REQUESTED".equals(before.state())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The refund is " + before.state());
        }
        if (before.requestedBy().equals(UUID.randomUUID())) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Nobody confirms or rejects their own refund");
        }
        OffsetDateTime now = now();
        jdbc.sql("""
                        update refund set state = :state, decided_by = :by, decided_at = :now,
                                          decision_reason = :why, ended_at = :ended, version = version + 1
                        where id = :id""")
                .param("state", state).param("by", actor.id()).param("now", now).param("why", why)
                .param("ended", "REJECTED".equals(state) ? now : null).param("id", refundId).update();
        Refund after = read(refundId);
        publish("APPROVED".equals(state) ? "RefundApproved" : "RefundRejected", after);
        audit.record(new AuditEntry(actor, "APPROVED".equals(state) ? "refund.confirm" : "refund.reject", "refund",
                refundId.toString(), why == null ? "Confirmed" : why, Map.of("state", before.state()),
                Map.of("state", state)));
        return after;
    }

    // ------------------------------------------------------------ lists and limits

    @Override
    @Transactional(readOnly = true)
    public List<Refund> ofOrder(Actor actor, UUID orderId) {
        requireAny(actor, null);
        Orders.RefundFacts o = facts(orderId);
        requireAny(actor, o.cityId());
        return jdbc.sql(SELECT + " where order_id = :order order by requested_at, id").param("order", orderId)
                .query((rs, i) -> map(rs)).list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Refund> waiting(Actor actor) {
        StaffAccess.Scope scope = staff.scope(actor, CONFIRM_PERMISSION);
        UUID service = taxiService(actor);
        return jdbc.sql(SELECT + """
                         where service_id = :service and state = 'REQUESTED'
                           and (:all or city_id = any(:cities)) and requested_by <> :me
                        order by requested_at, id""")
                .param("service", service).param("all", scope.allCities())
                .param("cities", scope.cityIds().toArray(new UUID[0])).param("me", actor.id())
                .query((rs, i) -> map(rs)).list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Limit> limits(Actor actor, UUID staffId) {
        if (actor == null || actor.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Staff account required");
        }
        if (!actor.id().equals(staffId)) {
            requireSuperAdminOver(actor, staffId);
        }
        return jdbc.sql("select currency from staff_refund_limit where staff_id = :staff order by currency")
                .param("staff", staffId).query(String.class).list().stream()
                .map(currency -> limitOf(staffId, currency)).toList();
    }

    record LimitCommand(UUID staffId, String currency, long perRefund, long daily, long expectedVersion,
                        String reason) {
    }

    @Override
    public Limit setLimit(Actor actor, UUID commandId, UUID staffId, String currency, long perRefundMinor,
                          long dailyMinor, long expectedVersion, String reason) {
        requireSuperAdminOver(actor, staffId);
        String code = currency == null ? "" : currency.strip();
        if (!code.matches("^[A-Z]{3}$")) {
            throw invalid("The currency is a three-letter code");
        }
        if (perRefundMinor < 1 || dailyMinor < perRefundMinor || dailyMinor > 1_000_000_000_000L) {
            throw invalid("One refund is at least 1, the 24-hour limit not less than it");
        }
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > 500) {
            throw invalid("A reason of 1 to 500 characters is required");
        }
        return commands.execute(new CommandKey(actor, "refund.limit", commandId),
                new LimitCommand(staffId, code, perRefundMinor, dailyMinor, expectedVersion, why), Limit.class, () -> {
                    lock("refund-staff:" + staffId + ":" + code);
                    Limit before = limitOf(staffId, code);
                    long current = before == null ? 0 : before.version();
                    if (current != expectedVersion) {
                        throw ConflictException.version(current, "The limit changed");
                    }
                    jdbc.sql("""
                                    insert into staff_refund_limit (staff_id, currency, per_refund_minor, daily_minor,
                                                                    changed_by, changed_at, version)
                                    values (:staff, :currency, :per, :daily, :by, :now, 1)
                                    on conflict (staff_id, currency) do update
                                        set per_refund_minor = :per, daily_minor = :daily, changed_by = :by,
                                            changed_at = :now, version = staff_refund_limit.version + 1""")
                            .param("staff", staffId).param("currency", code).param("per", perRefundMinor)
                            .param("daily", dailyMinor).param("by", actor.id()).param("now", now()).update();
                    Limit after = limitOf(staffId, code);
                    audit.record(new AuditEntry(actor, "refund.limit", "staff_user", staffId.toString(), why, before,
                            after));
                    return after;
                });
    }

    // ------------------------------------------------------------ helpers

    private void requireSuperAdminOver(Actor actor, UUID staffId) {
        if (!staff.superAdmin(actor)) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only the super admin sets refund limits");
        }
        staff.requireOverStaff(actor, CREATE_PERMISSION, staffId);
    }

    /**
     * Requesting or confirming refunds in the city lets a staff member see what an order allows; a null city checks
     * the permission alone.
     */
    private void requireAny(Actor actor, UUID cityId) {
        UUID[] cities = cityId == null ? new UUID[0] : new UUID[] {cityId};
        try {
            staff.require(actor, CREATE_PERMISSION, cities);
        } catch (DomainException first) {
            if (first.code() != ErrorCode.ACCESS_DENIED) {
                throw first;
            }
            staff.require(actor, CONFIRM_PERMISSION, cities);
        }
    }

    private UUID taxiService(Actor actor) {
        return services.of(actor)
                .orElseThrow(() -> new DomainException(ErrorCode.ACCESS_DENIED, "Staff account required"));
    }

    private Refund existing(UUID refundId) {
        return jdbc.sql(SELECT + " where id = :id").param("id", refundId).query((rs, i) -> map(rs)).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Refund not found"));
    }

    private Refund read(UUID id) {
        return jdbc.sql(SELECT + " where id = :id").param("id", id).query((rs, i) -> map(rs)).single();
    }

    private void publish(String type, Refund r) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("refund_id", r.id().toString());
        payload.put("order_id", r.orderId().toString());
        payload.put("city_id", r.cityId().toString());
        payload.put("amount_minor", r.amountMinor());
        payload.put("currency", r.currency());
        payload.put("state", r.state());
        payload.put("requested_by", r.requestedBy().toString());
        outbox.publish(new OutboxEvent(type, 1, "Refund", r.id(), r.version(), payload));
    }

    private Refund map(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Refund(rs.getObject("id", UUID.class), rs.getObject("order_id", UUID.class),
                rs.getObject("city_id", UUID.class), rs.getObject("client_id", UUID.class),
                rs.getObject("driver_id", UUID.class), rs.getString("currency"), rs.getLong("amount_minor"),
                rs.getLong("card_minor"), rs.getLong("bonus_minor"), rs.getLong("paid_bonus_minor"),
                rs.getBoolean("rider_agreed"), rs.getString("reason_code"),
                json.readValue(rs.getString("reason_labels"), new TypeReference<Map<String, String>>() {
                }), rs.getString("fault"), rs.getString("comment"), rs.getString("state"),
                rs.getObject("requested_by", UUID.class), rs.getObject("requested_at", OffsetDateTime.class),
                rs.getObject("decided_by", UUID.class), rs.getObject("decided_at", OffsetDateTime.class),
                rs.getString("decision_reason"), rs.getObject("ended_at", OffsetDateTime.class),
                rs.getLong("version"));
    }

    private void lock(String key) {
        jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))").param("key", key).query().singleRow();
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    private static DomainException notAllowed(String message) {
        return new DomainException(ErrorCode.REFUND_NOT_ALLOWED, message);
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }
}
