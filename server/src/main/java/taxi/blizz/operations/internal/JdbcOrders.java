package taxi.blizz.operations.internal;

import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.FeatureFlags;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityResolver;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.telephony.Calls;
import taxi.blizz.configuration.LegalDocuments;
import taxi.blizz.identity.StaffDirectory;
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.operations.CallerContact;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.OrderChannel;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.PageCursor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.pricing.VehicleClasses;
import tools.jackson.databind.json.JsonMapper;

/** Order creation and cancellation before the trip starts (sections 9, 13). */
@Service
class JdbcOrders implements Orders {

    private final taxi.blizz.platform.RateLimits rateLimits;

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final IdempotentCommands commands;
    private final CityResolver cities;
    private final taxi.blizz.geo.CityOperations cityOperations;
    private final OrderCore core;
    private final DispatchEngine engine;
    private final VehicleClasses classes;
    private final QuoteService quotes;
    private final CancelReasons reasons;
    private final StaffDirectory directory;
    private final JsonMapper json;
    private final ServiceSettings settings;
    private final AccountDirectory accounts;
    private final Calls calls;
    private final LegalDocuments legal;
    private final CardPayments cardPayments;
    private final taxi.blizz.finance.RiderWallets wallets;

    /** Pre-orders a rider may have waiting at a time; keeps a single account from booking the fleet. */
    static final int MAX_SCHEDULED_PER_PAYER = 5;

    private final FeatureFlags flags;

    JdbcOrders(JdbcClient jdbc, IdempotentCommands commands, CityResolver cities, OrderCore core,
               DispatchEngine engine, VehicleClasses classes, QuoteService quotes, StaffAccess staff,
               AuditLog audit, CancelReasons reasons, StaffDirectory directory, JsonMapper json,
               ServiceSettings settings, CardPayments cardPayments, taxi.blizz.finance.RiderWallets wallets,
               AccountDirectory accounts, Calls calls, LegalDocuments legal,
               taxi.blizz.platform.RateLimits rateLimits, taxi.blizz.geo.CityOperations cityOperations,
               FeatureFlags flags) {

        this.flags = flags;
        this.cityOperations = cityOperations;
        this.rateLimits = rateLimits;
        this.calls = calls;
        this.legal = legal;
        this.accounts = accounts;
        this.cardPayments = cardPayments;
        this.wallets = wallets;
        this.settings = settings;
        this.reasons = reasons;
        this.directory = directory;
        this.json = json;
        this.staff = staff;
        this.audit = audit;
        this.jdbc = jdbc;
        this.commands = commands;
        this.cities = cities;
        this.core = core;
        this.engine = engine;
        this.classes = classes;
        this.quotes = quotes;
    }

    @Override
    public OrderView create(Actor actor, UUID commandId, CreateOrder order) {
        City city = cities.resolve(order.pickup())
                .orElseThrow(() -> new DomainException(ErrorCode.OUTSIDE_SERVICE_AREA, "Pickup is outside every service area"));
        // The contact is the caller of a phone order, or the person a rider orders for (ADR 0012 Q-03).
        if (order.caller() != null && actor.type() != SubjectType.STAFF && actor.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    "A contact is the caller of a phone order or the recipient of a rider's order");
        }
        String channel = authorizeCreate(actor, order, city);
        // The city's pause, working hours (at the pickup time of an order for later) and payment methods (REQ-TEN-03/06).
        cityOperations.requireAccepting(city, order.pickupAt() == null ? core.now()
                : order.pickupAt().atOffset(java.time.ZoneOffset.UTC),
                order.paymentMethod() == null ? null : order.paymentMethod().name());
        // A rider orders only after accepting the legal texts in force that must be accepted (REQ-PRV-08).
        legal.requireAccepted(actor);
        rateLimits.acquire(taxi.blizz.platform.RateLimits.ORDER, actor);
        if (order.paymentMethod() == PaymentMethod.SERVICE) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "SERVICE is set only for a follow-up order");
        }
        boolean card = order.paymentMethod() == PaymentMethod.CARD;
        if (card && (actor.type() != SubjectType.CLIENT || order.payerClientId() == null)) {
            // A phone order is paid in cash or by a payment link (REQ-PAY-17, later).
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Only a rider pays by a saved card");
        }
        // A switch for the whole service (REQ-ENG-14): read only here, where a card payment starts.
        if (card && !flags.enabled(FeatureFlags.Flag.CARD_PAYMENTS)) {
            throw new DomainException(ErrorCode.PAYMENT_METHOD_NOT_OFFERED, "Card payments are switched off; pay in cash");
        }
        boolean terminal = order.paymentMethod() == PaymentMethod.TERMINAL;
        if (terminal && actor.type() != SubjectType.STAFF) {
            // Card at the driver's terminal is arranged by the operator on the phone (owner decision 27.10.2026).
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Payment at the driver's terminal is for phone orders");
        }
        if (order.terminalFallbackToCash() && !terminal) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The cash fallback is only for terminal payment");
        }
        long walletAsked = order.walletMinor() == null ? 0 : order.walletMinor();
        if (walletAsked < 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The bonuses to use cannot be negative");
        }
        if (walletAsked > 0 && (actor.type() != SubjectType.CLIENT || order.payerClientId() == null
                || (order.paymentMethod() != PaymentMethod.CASH && order.paymentMethod() != PaymentMethod.CARD))) {
            // Bonuses pay part of a rider's own order; the rest in cash or by card (ADR 0009).
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Bonuses pay a rider's own cash or card order");
        }
        if (order.quoteId() == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "An order needs a quote");
        }
        VehicleClasses.VehicleClass vehicleClass = classes.active(city.id(), order.vehicleClass())
                .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED, "This class is not offered here"));
        String fingerprint = new QuoteService.Request(city.id(), vehicleClass.id(), order.pickup(), order.dropoff(),
                actor, order.pickupAt()).fingerprint();
        OrderView result = commands.execute(new CommandKey(actor, "order.create", commandId), order, OrderView.class,
                () -> {
            UUID id = UUID.randomUUID();
            QuoteService.Quote quote = quotes.consume(order.quoteId(), actor, fingerprint, id);
            requireBelowLimit(order);
            // Bonuses never pay more than the price; what is left is paid in cash or by card (ADR 0009 p. 3). A card
            // order the bonuses pay in full needs no hold: whatever the trip adds is paid in cash.
            // The discount of promotions comes first (ADR 0009); bonuses pay at most what is left.
            long toPay = quote.toPayMinor();
            long wallet = Math.min(walletAsked, toPay);
            PaymentMethod method = order.paymentMethod() == PaymentMethod.CARD && wallet == toPay
                    ? PaymentMethod.CASH : order.paymentMethod();
            boolean cardHold = method == PaymentMethod.CARD;
            if (card && !cardHold) {
                cardPayments.rememberCard(id, order.payerClientId(), city.id(), quote.currency());
            }
            OffsetDateTime now = core.now();
            // The quote decided whether this is a pre-order, with the settings in force then (ADR 0006).
            boolean preorder = quote.breakdown().preorder();
            OffsetDateTime pickupAt = order.pickupAt() == null ? null : order.pickupAt().atOffset(java.time.ZoneOffset.UTC);
            OffsetDateTime releaseAt = null;
            if (preorder) {
                if (!pickupAt.isAfter(now)) {
                    throw new DomainException(ErrorCode.VALIDATION_FAILED, "The pickup time is in the past");
                }
                if (order.payerClientId() != null && jdbc.sql("""
                                select count(*) from ride_order
                                where payer_client_id = :payer and status = 'SCHEDULED'""")
                        .param("payer", order.payerClientId()).query(Long.class).single() >= MAX_SCHEDULED_PER_PAYER) {
                    throw new DomainException(ErrorCode.VALIDATION_FAILED,
                            "At most " + MAX_SCHEDULED_PER_PAYER + " orders for later at a time");
                }
                OffsetDateTime release = pickupAt.minusMinutes(
                        settings.current().settings().preorders().releaseMinutesBefore());
                releaseAt = release.isBefore(now) ? now : release;
            }
            jdbc.sql("""
                                insert into ride_order (id, channel, payer_client_id, created_by_type, created_by_id,
                                                        city_id, vehicle_class, pickup, pickup_label, dropoff,
                                                        dropoff_label, payment_method, selected_payment_method,
                                                        payment_state, price_minor, currency,
                                                        quote_id, source_ref, status, pickup_at, preorder, release_at,
                                                        terminal_fallback_cash, wallet_minor, discount_minor, created_at,
                                                        updated_at)
                                values (:id, :channel, :payer, :createdByType, :createdById, :cityId, :class,
                                        ST_SetSRID(ST_MakePoint(:pickupLon, :pickupLat), 4326), :pickupLabel,
                                        ST_SetSRID(ST_MakePoint(:dropoffLon, :dropoffLat), 4326), :dropoffLabel,
                                        :payment, :selectedPayment, :paymentState, :price, :currency, :quoteId, :sourceRef, :status, :pickupAt, :preorder,
                                        :releaseAt, :fallback, :wallet, :discount, :now, :now)""")
                        // A card order waits for the hold before anything else (REQ-PAY-01, ADR 0008).
                        .param("status", cardHold ? "AWAITING_PAYMENT" : preorder ? "SCHEDULED" : "READY")
                        .param("pickupAt", pickupAt)
                        .param("preorder", preorder)
                        .param("releaseAt", releaseAt)
                        .param("id", id)
                        .param("channel", channel)
                        .param("payer", order.payerClientId())
                        .param("createdByType", actor.type().name())
                        .param("createdById", actor.id())
                        .param("cityId", city.id())
                        .param("class", vehicleClass.code())
                        .param("pickupLon", order.pickup().lon())
                        .param("pickupLat", order.pickup().lat())
                        .param("pickupLabel", label(order.pickupLabel()))
                        .param("dropoffLon", order.dropoff().lon())
                        .param("dropoffLat", order.dropoff().lat())
                        .param("dropoffLabel", label(order.dropoffLabel()))
                        .param("payment", method.name())
                        .param("selectedPayment", order.paymentMethod().name())
                        .param("paymentState", cardHold ? "AUTH_PENDING" : terminal ? "TERMINAL_EXPECTED" : "CASH_EXPECTED")
                        .param("wallet", wallet)
                        .param("discount", quote.discountMinor())
                        .param("fallback", order.terminalFallbackToCash())
                        .param("price", quote.amountMinor())
                        .param("currency", quote.currency())
                        .param("quoteId", quote.id())
                        .param("sourceRef", order.sourceRef())
                        .param("now", now)
                        .update();
            if (order.caller() != null) {
                jdbc.sql("""
                                insert into order_contact (order_id, name, phone, created_by, created_at)
                                values (:order, :name, :phone, :createdBy, :now)""")
                        .param("order", id)
                        .param("name", order.caller().name())
                        .param("phone", order.caller().phone())
                        .param("createdBy", actor.id())
                        .param("now", now)
                        .update();
            }
            if (actor.type() == SubjectType.STAFF) {
                audit.record(new AuditEntry(actor, "order.create", "ride_order", id.toString(), "Phone order",
                        null, Map.of("channel", channel, "city_id", city.id().toString())));
            }
            Map<String, Object> created = new java.util.LinkedHashMap<>(Map.of("channel", channel,
                    "city_id", city.id().toString(), "payment_method", method.name(),
                    "quote_id", quote.id().toString(), "price_minor", quote.amountMinor()));
            if (pickupAt != null) {
                created.put("pickup_at", pickupAt.toString());
                created.put("preorder", preorder);
            }
            if (quote.discountMinor() > 0) {
                created.put("discount_minor", quote.discountMinor());
            }
            if (wallet > 0) {
                created.put("wallet_minor", wallet);
                wallets.reserve(order.payerClientId(), id, quote.currency(), wallet);
            }
            core.recordEvent(id, 0, preorder ? "OrderScheduled" : "OrderCreated", actor, null, created);
            if (cardHold) {
                cardPayments.requestHold(id, order.payerClientId(), city.id(), toPay - wallet,
                        quote.currency(),
                        preorder ? pickupAt.plusDays(1) : null);
            } else if (!preorder) {
                engine.startSearch(core.lockOrder(id));
            }
            return core.view(id);
        });
        if (result.paymentMethod() == PaymentMethod.CARD) {
            // The hold is asked for outside the transaction; the worker retries if this attempt fails.
            cardPayments.processNow(result.id());
        }
        return result;
    }

    /** The call and the link are part of the request, apart from the order's own receipt (AGENTS.md). */
    record DuringCall(UUID callId, boolean linkAgain, CreateOrder order) {
    }

    @Override
    public OrderView createDuringCall(Actor actor, UUID commandId, CreateOrder order, UUID callId, boolean linkAgain) {
        Calls.Call call = calls.find(callId)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Call not found"));
        // Before the receipts, so a stored outcome is never given to someone who lost access.
        requireStaff(actor, Calls.ANSWER_PERMISSION, call.cityId());
        requireStaff(actor, CREATE_PERMISSION, call.cityId());
        return commands.execute(new CommandKey(actor, "order.create-during-call", commandId),
                new DuringCall(callId, linkAgain, order), OrderView.class, () -> {
                    OrderView created = create(actor, commandId, order);
                    calls.link(actor, callId, created.id(), linkAgain);
                    return created;
                });
    }

    /**
     * At most {@code active_orders_per_payer} orders not in a final state, pre-orders included (ADR 0012 Q-03). The
     * limit is per person: a rider's app orders and the phone orders whose caller has the rider's phone count
     * together; a caller without an account is limited by the phone. App and phone orders of the same person take
     * the same lock to the end of the transaction, so two creations at the limit never both pass.
     */
    private void requireBelowLimit(CreateOrder order) {
        UUID account;
        String phone;
        if (order.payerClientId() != null) {
            account = order.payerClientId();
            phone = accounts.phone(new Actor(SubjectType.CLIENT, account)).orElse(null);
        } else if (order.caller() != null) {
            PhoneNumber caller = PhoneNumber.parse(order.caller().phone());
            phone = caller.e164();
            account = accounts.clientByPhone(caller).orElse(null);
        } else {
            return;
        }
        jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))")
                .param("key", account != null ? "order-account:" + account : "order-phone:" + phone)
                .query().singleRow();
        List<String> who = new java.util.ArrayList<>();
        if (account != null) {
            who.add("o.payer_client_id = :account");
        }
        if (phone != null) {
            // Phone orders have no payer; their caller is the contact.
            who.add("""
                    (o.payer_client_id is null
                     and exists (select 1 from order_contact c where c.order_id = o.id and c.phone = :phone))""");
        }
        var count = jdbc.sql("select count(*) from ride_order o where o.status not in "
                + "('FULFILLED', 'CANCELLED', 'UNFULFILLED') and (" + String.join(" or ", who) + ")");
        if (account != null) {
            count = count.param("account", account);
        }
        if (phone != null) {
            count = count.param("phone", phone);
        }
        long open = count.query(Long.class).single();
        int limit = settings.current().settings().orders().activePerPayer();
        if (open >= limit) {
            throw new DomainException(ErrorCode.ACTIVE_ORDER_LIMIT,
                    "At most " + limit + " active orders at a time, orders for later included");
        }
    }

    /** Decides the channel from who is asking; the requested channel is accepted only where it fits. */
    private String authorizeCreate(Actor actor, CreateOrder order, City city) {
        OrderChannel requested = order.channel();
        switch (actor.type()) {
            case CLIENT -> {
                if (!actor.id().equals(order.payerClientId())) {
                    throw new DomainException(ErrorCode.ACCESS_DENIED, "A client orders only for itself");
                }
                if (requested != null && requested != OrderChannel.APP && requested != OrderChannel.WEB) {
                    throw new DomainException(ErrorCode.VALIDATION_FAILED, "A client orders from the app or the website");
                }
                // E.g. a deletion request is pending (issue #56): the rider may still sign in, not order.
                String state = accounts.accountState(actor).orElse("MISSING");
                if (!"ACTIVE".equals(state)) {
                    throw new DomainException(ErrorCode.ACCOUNT_NOT_ACTIVE, "The account is " + state);
                }
                return (requested == null ? OrderChannel.APP : requested).name();
            }
            case STAFF -> {
                if (requested != null && requested != OrderChannel.PHONE) {
                    throw new DomainException(ErrorCode.VALIDATION_FAILED, "Staff orders are phone orders");
                }
                requireStaff(actor, CREATE_PERMISSION, city.id());
                requireCallerMayOrder(order.caller());
                return OrderChannel.PHONE.name();
            }
            case PARTNER -> throw new DomainException(ErrorCode.ACCESS_DENIED,
                    "Partner orders arrive through the exchange protocol (M2)");
            default -> throw new DomainException(ErrorCode.ACCESS_DENIED, "Not allowed to create orders");
        }
    }

    /**
     * A phone order for a caller whose rider account is BLOCKED or has a pending deletion request is refused with
     * a reason the operator can tell the caller (issue #56). A caller without an account, or with a record staff
     * created for earlier phone orders (UNVERIFIED), is not affected.
     */
    private void requireCallerMayOrder(CallerContact caller) {
        if (caller == null || caller.phone() == null) {
            return;
        }
        accounts.clientByPhone(PhoneNumber.parse(caller.phone()))
                .flatMap(client -> accounts.accountState(new Actor(SubjectType.CLIENT, client)))
                .filter(state -> !"ACTIVE".equals(state) && !"UNVERIFIED".equals(state))
                .ifPresent(state -> {
                    throw new DomainException(ErrorCode.ACCOUNT_NOT_ACTIVE, "The caller's account is " + state);
                });
    }

    record CancelRequest(UUID orderId, long expectedVersion, String reasonCode) {
    }

    @Override
    public OrderView cancel(Actor actor, UUID commandId, UUID orderId, long expectedVersion, String reasonCode) {
        if (reasonCode == null || reasonCode.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason code is required");
        }
        if (actor.type() == SubjectType.STAFF) {
            UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                    .query(UUID.class).optional()
                    .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
            requireStaff(actor, CANCEL_PERMISSION, cityId);
        } else if (actor.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Not allowed to cancel orders");
        }
        return commands.execute(new CommandKey(actor, "order.cancel", commandId),
                new CancelRequest(orderId, expectedVersion, reasonCode), OrderView.class, () -> {
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    if (actor.type() == SubjectType.CLIENT && !actor.id().equals(order.payerClientId())) {
                        throw new DomainException(ErrorCode.NOT_FOUND, "Order not found");
                    }
                    if (order.version() != expectedVersion) {
                        throw ConflictException.version(order.version(), "The order changed");
                    }
                    // Rider and staff each choose from their own list (owner decision 27.10.2026).
                    String by = actor.type() == SubjectType.STAFF ? "STAFF" : "RIDER";
                    CancelReasons.Reason reason = reasons.require(actor.type() == SubjectType.STAFF
                            ? CancelReasons.Audience.STAFF : CancelReasons.Audience.RIDER, reasonCode);
                    Map<String, Object> details = new java.util.LinkedHashMap<>();
                    switch (order.status()) {
                        case "SCHEDULED", "AWAITING_PAYMENT", "READY", "SEARCHING" -> {
                            // A driver holding the pre-order loses it with the order.
                            jdbc.sql("""
                                            update preorder_reservation set state = 'CANCELLED', closed_at = :now,
                                                   close_reason = 'ORDER_CANCELLED', version = version + 1
                                            where order_id = :id and state = 'RESERVED'""")
                                    .param("now", core.now()).param("id", orderId).update();
                            engine.stop(orderId, "STOPPED");
                            core.closeOpenOffers(orderId, "REVOKED");
                        }
                        case "ASSIGNED" -> {
                            // The driver on the way learns of it (live channel, push).
                            core.assignmentOfOrder(orderId).ifPresent(a -> details.put("driver_id",
                                    a.driverId().toString()));
                            releaseAssignment(orderId, by + "_CANCELLED: " + reason.code());
                        }
                        default -> throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "An order in " + order.status() + " cannot be cancelled this way");
                    }
                    core.cancel(order, by, reason, "OrderCancelled", actor, details);
                    if (actor.type() == SubjectType.STAFF) {
                        audit.record(new AuditEntry(actor, "order.cancel", "ride_order", orderId.toString(), reason.code(),
                                Map.of("status", order.status()), Map.of("status", "CANCELLED")));
                    }
                    return core.view(orderId);
                });
    }

    record SwitchToCashRequest(UUID orderId, long expectedVersion, String reason) {
    }

    @Override
    public OrderView switchToCash(Actor actor, UUID commandId, UUID orderId, long expectedVersion, String reason) {
        String why = reason == null || reason.isBlank() ? null : reason.strip();
        if (actor.type() == SubjectType.STAFF) {
            UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                    .query(UUID.class).optional()
                    .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
            requireStaff(actor, CREATE_PERMISSION, cityId);
            if (why == null) {
                throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
            }
        } else if (actor.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only the rider or an operator switches to cash");
        }
        return commands.execute(new CommandKey(actor, "order.switch_to_cash", commandId),
                new SwitchToCashRequest(orderId, expectedVersion, why), OrderView.class, () -> {
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    if (actor.type() == SubjectType.CLIENT && !actor.id().equals(order.payerClientId())) {
                        throw new DomainException(ErrorCode.NOT_FOUND, "Order not found");
                    }
                    if (order.version() != expectedVersion) {
                        throw ConflictException.version(order.version(), "The order changed");
                    }
                    if (!java.util.Set.of("AWAITING_PAYMENT", "SCHEDULED", "READY", "SEARCHING", "ASSIGNED", "IN_SERVICE")
                            .contains(order.status())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "An order in " + order.status() + " cannot switch to cash");
                    }
                    String method = jdbc.sql("select payment_method from ride_order where id = :id")
                            .param("id", orderId).query(String.class).single();
                    if (!"CARD".equals(method)) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The order is not paid by card");
                    }
                    var intent = cardPayments.intent(orderId);
                    String held = intent.map(taxi.blizz.payments.CardPayments.Intent::state).orElse(null);
                    if (held == null || "PAID".equals(held)) {
                        // Wholly paid by bonuses: nothing to pay in cash.
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Nothing is left to pay by card");
                    }
                    if (java.util.Set.of("AUTH_PENDING", "UNKNOWN").contains(held)) {
                        throw new DomainException(ErrorCode.PAYMENT_UNKNOWN,
                                "The card hold is not settled yet; switch once it is");
                    }
                    if (!"AUTHORIZED".equals(held)) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The card payment is " + held);
                    }
                    // One way of paying at a time (REQ-PAY-20): the hold goes before the order becomes cash.
                    core.releaseCardHold(orderId, "Switched to cash");
                    jdbc.sql("""
                                    update ride_order set payment_method = 'CASH', payment_state = 'CASH_EXPECTED',
                                                          selected_payment_method = 'CASH', updated_at = :now
                                    where id = :id""")
                            .param("now", core.now()).param("id", orderId).update();
                    String by = actor.type() == SubjectType.STAFF ? "STAFF" : "RIDER";
                    core.recordEvent(orderId, core.touch(orderId), "PaymentSwitchedToCash", actor, why,
                            Map.of("from", "CARD", "to", "CASH", "by", by));
                    audit.record(new AuditEntry(actor, "order.switch_to_cash", "ride_order", orderId.toString(),
                            why == null ? "By the rider" : why, Map.of("payment_method", "CARD"),
                            Map.of("payment_method", "CASH")));
                    return core.view(orderId);
                });
    }

    /** Before the start: assignment RELEASED, trip ABORTED, driver free again (REQ-ASG-04). */
    private void releaseAssignment(UUID orderId, String reason) {
        AssignmentView assignment = core.assignmentOfOrder(orderId)
                .filter(a -> "COMMITTED".equals(a.state()))
                .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No active assignment"));
        core.endAssignmentBeforeStart(assignment, "RELEASED", reason);
    }

    record RevokeRequest(UUID orderId, long expectedVersion, String reason) {
    }

    @Override
    public OrderView revokeAssignment(Actor staffActor, UUID commandId, UUID orderId, long expectedVersion, String reason) {
        if (staffActor.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only staff can take a driver off an order");
        }
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                .query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        requireStaff(staffActor, REASSIGN_PERMISSION, cityId);
        return commands.execute(new CommandKey(staffActor, "order.assignment.revoke", commandId),
                new RevokeRequest(orderId, expectedVersion, reason), OrderView.class, () -> {
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    if (order.version() != expectedVersion) {
                        throw ConflictException.version(order.version(), "The order changed");
                    }
                    if (!"ASSIGNED".equals(order.status())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Only an assigned order before the start");
                    }
                    AssignmentView assignment = core.assignmentOfOrder(orderId)
                            .filter(a -> "COMMITTED".equals(a.state()))
                            .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No active assignment"));
                    core.endAssignmentBeforeStart(assignment, "REVOKED", reason);
                    audit.record(new AuditEntry(staffActor, "order.revokeAssignment", "ride_order", orderId.toString(),
                            reason, Map.of("driver_id", assignment.driverId().toString()), null));
                    core.recordEvent(orderId, core.touch(orderId), "AssignmentRevoked", staffActor, reason,
                            Map.<String, Object>of("assignment_id", assignment.id().toString(),
                                    "driver_id", assignment.driverId().toString()));
                    engine.resumeSearch(core.lockOrder(orderId));
                    return core.view(orderId);
                });
    }

    @Override
    @Transactional(readOnly = true)
    public OrderView get(UUID orderId) {
        return core.view(orderId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<OrderView> inCity(Actor staffActor, UUID cityId, boolean activeOnly, PageCursor after, int limit) {
        requireStaff(staffActor, VIEW_PERMISSION, cityId);
        int size = Math.max(1, Math.min(limit, PageCursor.MAX_FETCH));
        String active = activeOnly
                ? " and status in ('SCHEDULED', 'AWAITING_PAYMENT', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')"
                : "";
        String cursor = after == null ? "" : " and (created_at, id) < (:afterAt, :afterId)";
        JdbcClient.StatementSpec query = jdbc.sql("select id from ride_order where city_id = :city" + active + cursor
                        + " order by created_at desc, id desc limit :limit")
                .param("city", cityId)
                .param("limit", size);
        if (after != null) {
            query = query.param("afterAt", after.time(0)).param("afterId", after.id(1));
        }
        return query.query(UUID.class).list().stream().map(core::view).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<HistoryItem> history(Actor payer, PageCursor after, int limit) {
        if (payer.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only a rider can read rider order history");
        }
        int size = Math.max(1, Math.min(limit, PageCursor.MAX_FETCH));
        String cursor = after == null ? "" : " and (o.created_at, o.id) < (:afterAt, :afterId)";
        JdbcClient.StatementSpec query = jdbc.sql("""
                        select o.id, o.short_number, o.status, o.created_at, o.pickup_label, o.dropoff_label,
                               o.vehicle_class, o.price_minor, o.final_price_minor, o.currency, o.payment_method,
                               a.id as assignment_id, a.state as assignment_state, a.close_reason,
                               o.cancelled_by, o.cancel_reason_code, o.cancel_reason_labels::text as cancel_reason_labels,
                               o.pickup_at,
                               d.name as driver_name, v.make, v.model, v.color, v.registration_number
                        from ride_order o
                        left join lateral (
                            select id, driver_id, vehicle_id, state, close_reason
                            from assignment where order_id = o.id
                            order by created_at desc, id desc limit 1
                        ) a on true
                        left join driver d on d.id = a.driver_id
                        left join vehicle v on v.id = a.vehicle_id
                        where o.payer_client_id = :payer
                        """ + cursor + " order by o.created_at desc, o.id desc limit :limit")
                .param("payer", payer.id()).param("limit", size);
        if (after != null) {
            query = query.param("afterAt", after.time(0)).param("afterId", after.id(1));
        }
        return query.query((rs, i) -> {
            UUID assignmentId = rs.getObject("assignment_id", UUID.class);
            String state = rs.getString("assignment_state");
            String closeReason = rs.getString("close_reason");
            boolean driverLeft = "REVOKED".equals(state)
                    || (closeReason != null && closeReason.startsWith("DRIVER_WITHDREW"));
            HistoryDriver driver = assignmentId == null ? null : new HistoryDriver(rs.getString("driver_name"),
                    new HistoryVehicle(rs.getString("make"), rs.getString("model"), rs.getString("color"),
                            rs.getString("registration_number")));
            return new HistoryItem(rs.getObject("id", UUID.class), rs.getLong("short_number"), rs.getString("status"),
                    rs.getObject("created_at", OffsetDateTime.class), rs.getString("pickup_label"),
                    rs.getString("dropoff_label"), rs.getString("vehicle_class"),
                    (Long) rs.getObject("price_minor"), (Long) rs.getObject("final_price_minor"),
                    rs.getString("currency"), PaymentMethod.valueOf(rs.getString("payment_method")), driver,
                    assignmentId != null && !driverLeft, cancellation(rs.getString("cancelled_by"),
                            rs.getString("cancel_reason_code"), rs.getString("cancel_reason_labels")),
                    rs.getObject("pickup_at", OffsetDateTime.class));
        }).list();
    }

    record InterruptRequest(UUID orderId, long expectedVersion, Interruption interruption) {
    }

    @Override
    public Interrupted interrupt(Actor actor, UUID commandId, UUID orderId, long expectedVersion,
                                 Interruption interruption) {
        if (interruption == null || interruption.reasonCode() == null || interruption.reasonCode().isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        if (interruption.comment() != null && interruption.comment().length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The comment has at most 500 characters");
        }
        record Facts(UUID cityId, String vehicleClass, GeoPoint dropoff) {
        }
        Facts facts = jdbc.sql("""
                        select city_id, vehicle_class, ST_Y(dropoff) as lat, ST_X(dropoff) as lon
                        from ride_order where id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new Facts(rs.getObject("city_id", UUID.class), rs.getString("vehicle_class"),
                        new GeoPoint(rs.getDouble("lat"), rs.getDouble("lon"))))
                .optional().orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        requireStaff(actor, INTERRUPT_PERMISSION, facts.cityId());
        // The follow-up's price comes from an ordinary quote, made outside the transaction like every quote and
        // keyed by the command, so a repeated command reuses it.
        QuoteService.Quote quote = null;
        GeoPoint followUpPickup = null;
        if (interruption.followUp()) {
            followUpPickup = interruption.pickup() != null ? interruption.pickup() : stopPoint(orderId)
                    .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED,
                            "The driver's position is unknown; give the follow-up pickup point"));
            VehicleClasses.VehicleClass vehicleClass = classes.active(facts.cityId(), facts.vehicleClass())
                    .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED, "The class is no longer offered"));
            quote = quotes.create(UUID.nameUUIDFromBytes(("follow-up:" + commandId).getBytes(StandardCharsets.UTF_8)),
                    new QuoteService.Request(facts.cityId(), vehicleClass.id(), followUpPickup, facts.dropoff(), actor));
        }
        QuoteService.Quote followUpQuote = quote;
        GeoPoint pickup = followUpPickup;
        return commands.execute(new CommandKey(actor, "order.interrupt", commandId),
                new InterruptRequest(orderId, expectedVersion, interruption), Interrupted.class, () -> {
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    if (order.version() != expectedVersion) {
                        throw ConflictException.version(order.version(), "The order changed");
                    }
                    if (!"IN_SERVICE".equals(order.status())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Only a trip in progress is interrupted; before the start cancel or reassign");
                    }
                    CancelReasons.Reason reason = reasons.require(CancelReasons.Audience.STAFF,
                            interruption.reasonCode().trim());
                    AssignmentView assignment = core.assignmentOfOrder(orderId)
                            .filter(a -> "COMMITTED".equals(a.state()) && "IN_PROGRESS".equals(a.tripPhase()))
                            .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No trip in progress"));
                    core.lockCapacity(assignment.driverId());
                    OffsetDateTime now = core.now();
                    Optional<GeoPoint> stoppedAt = stopPoint(orderId);
                    jdbc.sql("""
                                    update trip set phase = 'ABORTED', interrupted_at = :now,
                                           interrupted_at_point = case when cast(:lat as double precision) is null
                                               then null else ST_SetSRID(ST_MakePoint(cast(:lon as double precision),
                                                   cast(:lat as double precision)), 4326) end,
                                           version = version + 1
                                    where id = :id and phase = 'IN_PROGRESS'""")
                            .param("now", now).param("id", assignment.tripId())
                            .param("lat", stoppedAt.map(GeoPoint::lat).orElse(null))
                            .param("lon", stoppedAt.map(GeoPoint::lon).orElse(null))
                            .update();
                    jdbc.sql("""
                                    update assignment set state = 'RELEASED', closed_at = :now, close_reason = :reason,
                                           version = version + 1
                                    where id = :id and state = 'COMMITTED'""")
                            .param("now", now).param("reason", "INTERRUPTED: " + reason.code())
                            .param("id", assignment.id()).update();
                    // Like every other end of a trip: a session waiting to close closes, a pause asked for applies
                    // (review of 28.10.2026: the driver stayed in a CLOSING session for good).
                    core.releaseDriver(assignment.driverId());
                    UUID followUpId = interruption.followUp() ? UUID.randomUUID() : null;
                    Map<String, Object> details = new java.util.LinkedHashMap<>();
                    details.put("trip_id", assignment.tripId().toString());
                    details.put("driver_id", assignment.driverId().toString());
                    details.put("partial_fare", "FREE");
                    if (interruption.comment() != null && !interruption.comment().isBlank()) {
                        details.put("comment", interruption.comment().strip());
                    }
                    if (followUpId != null) {
                        details.put("follow_up_order_id", followUpId.toString());
                    }
                    // The rider's one active order is now the follow-up, so the interrupted one is closed first.
                    core.cancel(order, "STAFF", reason, "TripInterrupted", actor, details);
                    audit.record(new AuditEntry(actor, "order.interrupt", "ride_order", orderId.toString(),
                            reason.code(), Map.of("status", "IN_SERVICE"), Map.of("status", "CANCELLED",
                            "follow_up_order_id", followUpId == null ? "" : followUpId.toString())));
                    if (followUpId == null) {
                        return new Interrupted(core.view(orderId), null);
                    }
                    QuoteService.Quote consumed = quotes.consume(followUpQuote.id(), actor, followUpQuote.fingerprint(),
                            followUpId);
                    jdbc.sql("""
                                    insert into ride_order (id, channel, payer_client_id, created_by_type, created_by_id,
                                                            city_id, vehicle_class, pickup, pickup_label, dropoff,
                                                            dropoff_label, payment_method, price_minor, currency,
                                                            quote_id, source_ref, status, related_order_id,
                                                            created_at, updated_at)
                                    select :id, channel, payer_client_id, 'STAFF', :staff, city_id, vehicle_class,
                                           ST_SetSRID(ST_MakePoint(:lon, :lat), 4326), :label, dropoff, dropoff_label,
                                           'SERVICE', :price, :currency, :quote, source_ref, 'READY', id, :now, :now
                                    from ride_order where id = :original""")
                            .param("id", followUpId).param("staff", actor.id())
                            .param("lon", pickup.lon()).param("lat", pickup.lat())
                            .param("label", interruption.pickupLabel() == null || interruption.pickupLabel().isBlank()
                                    ? "Where the previous car stopped" : label(interruption.pickupLabel()))
                            .param("price", consumed.amountMinor()).param("currency", consumed.currency())
                            .param("quote", consumed.id()).param("now", now).param("original", orderId).update();
                    jdbc.sql("""
                                    insert into order_contact (order_id, name, phone, created_by, created_at)
                                    select :id, name, phone, :staff, :now from order_contact where order_id = :original""")
                            .param("id", followUpId).param("staff", actor.id()).param("now", now)
                            .param("original", orderId).update();
                    core.recordEvent(followUpId, 0, "OrderCreated", actor, null, Map.of(
                            "related_order_id", orderId.toString(), "payment_method", "SERVICE",
                            "quote_id", consumed.id().toString(), "price_minor", consumed.amountMinor()));
                    engine.startSearch(core.lockOrder(followUpId));
                    return new Interrupted(core.view(orderId), core.view(followUpId));
                });
    }

    /** Where the car of the order's active assignment is now: its driver's open work session. */
    private Optional<GeoPoint> stopPoint(UUID orderId) {
        return jdbc.sql("""
                        select ST_Y(ws.last_location) as lat, ST_X(ws.last_location) as lon
                        from assignment a join work_session ws on ws.driver_id = a.driver_id
                        where a.order_id = :id and ws.state <> 'CLOSED' and ws.last_location is not null
                        order by a.created_at desc, ws.opened_at desc limit 1""")
                .param("id", orderId)
                .query((rs, i) -> new GeoPoint(rs.getDouble("lat"), rs.getDouble("lon")))
                .optional();
    }

    @SuppressWarnings("unchecked")
    private OrderView.Cancellation cancellation(String by, String code, String labels) {
        return by == null ? null
                : new OrderView.Cancellation(by, code, labels == null ? Map.of() : json.readValue(labels, Map.class));
    }

    @Override
    @Transactional(readOnly = true)
    public List<TimelineEntry> timeline(Actor actor, UUID orderId) {
        UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                .query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        requireStaff(actor, VIEW_PERMISSION, cityId);
        record Row(long sequence, String type, String actorType, UUID actorId, String reason, String payload,
                   OffsetDateTime occurredAt, UUID correlationId) {
        }
        List<Row> rows = jdbc.sql("""
                        select sequence, type, actor_type, actor_id, reason, payload::text as payload, occurred_at,
                               correlation_id
                        from order_event where order_id = :id order by sequence""")
                .param("id", orderId)
                .query((rs, i) -> new Row(rs.getLong("sequence"), rs.getString("type"), rs.getString("actor_type"),
                        rs.getObject("actor_id", UUID.class), rs.getString("reason"), rs.getString("payload"),
                        rs.getObject("occurred_at", OffsetDateTime.class), rs.getObject("correlation_id", UUID.class)))
                .list();
        java.util.Set<UUID> staffIds = new java.util.HashSet<>();
        java.util.Set<UUID> driverIds = new java.util.HashSet<>();
        for (Row row : rows) {
            if (row.actorId() != null && "STAFF".equals(row.actorType())) {
                staffIds.add(row.actorId());
            } else if (row.actorId() != null && "DRIVER".equals(row.actorType())) {
                driverIds.add(row.actorId());
            }
        }
        Map<UUID, StaffDirectory.Name> staffNames = directory.names(staffIds);
        Map<UUID, String> driverNames = new java.util.HashMap<>();
        if (!driverIds.isEmpty()) {
            jdbc.sql("select id, name from driver where id = any(:ids)").param("ids", driverIds.toArray(UUID[]::new))
                    .query((rs, i) -> driverNames.put(rs.getObject("id", UUID.class), rs.getString("name"))).list();
        }
        return rows.stream().map(row -> {
            String name = null;
            String role = null;
            if ("STAFF".equals(row.actorType()) && staffNames.containsKey(row.actorId())) {
                StaffDirectory.Name staffName = staffNames.get(row.actorId());
                name = (staffName.firstName() + " " + staffName.lastName()).strip();
                role = staffName.role().name();
            } else if ("DRIVER".equals(row.actorType())) {
                name = driverNames.get(row.actorId());
            }
            @SuppressWarnings("unchecked")
            Map<String, Object> payload = row.payload() == null ? Map.of() : json.readValue(row.payload(), Map.class);
            return new TimelineEntry(row.sequence(), row.type(), row.occurredAt(),
                    new TimelineActor(row.actorType(), row.actorId(), name, role), row.reason(), payload,
                    row.correlationId());
        }).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Participants> participants(UUID orderId) {
        return jdbc.sql("""
                        select o.payer_client_id,
                               (select a.driver_id from assignment a where a.order_id = o.id
                                order by a.created_at desc limit 1) as driver_id
                        from ride_order o where o.id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new Participants(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class)))
                .optional();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Origin> origin(UUID orderId) {
        return jdbc.sql("""
                        select id, channel, created_by_type, created_by_id, city_id, created_at
                        from ride_order where id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new Origin(rs.getObject("id", UUID.class),
                        OrderChannel.valueOf(rs.getString("channel")),
                        SubjectType.valueOf(rs.getString("created_by_type")),
                        rs.getObject("created_by_id", UUID.class), rs.getObject("city_id", UUID.class),
                        rs.getObject("created_at", OffsetDateTime.class)))
                .optional();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<OrderView> active(UUID payerClientId) {
        return jdbc.sql("""
                        select id from ride_order where payer_client_id = :payer
                          and status in ('AWAITING_PAYMENT', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')
                        order by preorder, created_at desc, id limit 1""")
                .param("payer", payerClientId)
                .query(UUID.class)
                .optional()
                .map(core::view);
    }

    @Override
    public List<OrderView> current(UUID payerClientId) {
        return jdbc.sql("""
                        select id from ride_order where payer_client_id = :payer
                          and status not in ('FULFILLED', 'CANCELLED', 'UNFULFILLED')
                        order by created_at desc, id""")
                .param("payer", payerClientId)
                .query(UUID.class)
                .list().stream().map(core::view).toList();
    }

    private void requireStaff(Actor actor, String permission, UUID cityId) {
        staff.require(actor, permission, cityId);
    }

    private static String label(String value) {
        return value == null || value.isBlank() ? "" : value.strip();
    }

    @Override
    @Transactional(readOnly = true)
    public boolean offerOpen(UUID offerId) {
        return jdbc.sql("select count(*) from offer where id = :id and state = 'OPEN'")
                .param("id", offerId).query(Integer.class).single() > 0;
    }

    @Override
    @Transactional(readOnly = true)
    public boolean assignmentCurrent(UUID assignmentId) {
        return jdbc.sql("select count(*) from assignment where id = :id and state in ('RESERVED', 'COMMITTED')")
                .param("id", assignmentId).query(Integer.class).single() > 0;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CallerNotice> callerNotice(UUID orderId) {
        return jdbc.sql("""
                        select o.id, o.city_id, c.phone, d.name as driver_name, v.make, v.model, v.color,
                               v.registration_number, a.id as assignment_id
                        from ride_order o
                        join order_contact c on c.order_id = o.id
                        left join lateral (
                            select id, driver_id, vehicle_id from assignment where order_id = o.id
                            order by created_at desc, id desc limit 1
                        ) a on true
                        left join driver d on d.id = a.driver_id
                        left join vehicle v on v.id = a.vehicle_id
                        where o.id = :id and o.channel = 'PHONE' and c.phone is not null""")
                .param("id", orderId)
                .query((rs, i) -> new CallerNotice(rs.getObject("id", UUID.class), rs.getObject("city_id", UUID.class),
                        rs.getString("phone"), rs.getString("driver_name"),
                        rs.getObject("assignment_id", UUID.class) == null ? null
                                : new HistoryVehicle(rs.getString("make"), rs.getString("model"), rs.getString("color"),
                                rs.getString("registration_number"))))
                .optional();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<TripTimes> tripTimes(UUID orderId) {
        return jdbc.sql("""
                        select o.created_at, a.created_at as assigned_at, t.arrived_at, t.started_at, t.completed_at,
                               a.driver_id, a.vehicle_id
                        from ride_order o
                        left join lateral (select * from assignment where order_id = o.id
                                           order by created_at desc, id desc limit 1) a on true
                        left join trip t on t.assignment_id = a.id
                        where o.id = :order""")
                .param("order", orderId)
                .query((rs, i) -> new TripTimes(rs.getObject("created_at", OffsetDateTime.class),
                        rs.getObject("assigned_at", OffsetDateTime.class),
                        rs.getObject("arrived_at", OffsetDateTime.class),
                        rs.getObject("started_at", OffsetDateTime.class),
                        rs.getObject("completed_at", OffsetDateTime.class), rs.getObject("driver_id", UUID.class),
                        rs.getObject("vehicle_id", UUID.class)))
                .optional();
    }

    @Override
    @Transactional(readOnly = true)
    public List<PayerTrips> payerTrips(UUID payerClientId, OffsetDateTime since) {
        return jdbc.sql("""
                        select currency, count(*) as trips, coalesce(sum(coalesce(final_price_minor, price_minor)), 0)
                               as total
                        from ride_order
                        where payer_client_id = :payer and status = 'FULFILLED' and created_at >= :since
                        group by currency order by currency""")
                .param("payer", payerClientId).param("since", since)
                .query((rs, i) -> new PayerTrips(rs.getString("currency"), rs.getLong("trips"), rs.getLong("total")))
                .list();
    }
}
