package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.operations.Tips;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;

/** Tips after a fulfilled trip (ADR 0012); see {@link Tips}. Amounts are integers in minor units throughout. */
@Service
class JdbcTips implements Tips {

    private static final Logger log = LoggerFactory.getLogger(JdbcTips.class);
    static final List<Integer> PERCENTS = List.of(10, 15, 20, 25);
    /** One unit of the currency in minor units (UAH, PLN). */
    static final long UNIT = 100;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final ServiceSettings settings;
    private final RiderWallets wallets;
    private final CardPayments cards;
    private final Outbox outbox;
    private final Clock clock;

    JdbcTips(JdbcClient jdbc, IdempotentCommands commands, ServiceSettings settings, RiderWallets wallets,
             CardPayments cards, Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.settings = settings;
        this.wallets = wallets;
        this.cards = cards;
        this.outbox = outbox;
        this.clock = clock;
    }

    /** The fulfilled order as the tip sees it. */
    record Trip(UUID orderId, UUID payerId, UUID driverId, String paymentMethod, String currency, long finalMinor,
                long discountMinor, long walletMinor, OffsetDateTime completedAt, String selectedPaymentMethod) {

        /** What the trip cost the rider: the final fare less the service's discount. */
        long costMinor() {
            return Math.max(0, finalMinor - discountMinor);
        }

        boolean paidWithBonuses() {
            return costMinor() > 0 && walletMinor >= costMinor();
        }
    }

    // ---------------------------------------------------------------- amounts

    /** {@code percent} of the cost, rounded up to a whole unit. */
    static long preset(long costMinor, int percent) {
        return ceilDiv(costMinor * percent, 100 * UNIT) * UNIT;
    }

    /** The cost rounded up to a whole unit: the largest tip. */
    static long max(long costMinor) {
        return ceilDiv(costMinor, UNIT) * UNIT;
    }

    private static long ceilDiv(long a, long b) {
        return Math.floorDiv(a + b - 1, b);
    }

    // ---------------------------------------------------------------- reads

    @Override
    @Transactional(readOnly = true)
    public Options options(Actor rider, UUID orderId) {
        requireRider(rider);
        Trip trip = trip(rider, orderId, false);
        OffsetDateTime until = until(trip);
        long cost = trip.costMinor();
        long max = max(cost);
        List<Preset> presets = PERCENTS.stream().map(p -> new Preset(p, preset(cost, p))).toList();
        Tip tip = current(orderId).orElse(null);
        boolean open = !"SERVICE".equals(trip.paymentMethod()) && tip == null && now().isBefore(until) && max >= UNIT;
        return new Options(orderId, trip.currency(), cost, presets, UNIT, max, method(trip, UNIT), until, open, tip);
    }

    // ---------------------------------------------------------------- leaving a tip

    record LeaveRequest(UUID orderId, long amountMinor) {
    }

    @Override
    public Tip leave(Actor rider, UUID commandId, UUID orderId, long amountMinor) {
        requireRider(rider);
        Tip tip = commands.execute(new CommandKey(rider, "order.tip", commandId), new LeaveRequest(orderId, amountMinor),
                Tip.class, () -> leaveInsideCommand(rider, orderId, amountMinor));
        if ("CARD".equals(tip.method()) && "PENDING".equals(tip.state())) {
            cards.processNow(orderId); // the worker would send it within seconds anyway
        }
        return tip;
    }

    private Tip leaveInsideCommand(Actor rider, UUID orderId, long amountMinor) {
        Trip trip = trip(rider, orderId, true);
        if ("SERVICE".equals(trip.paymentMethod())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "A service-paid follow-up cannot be tipped");
        }
        if (!now().isBefore(until(trip))) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The time to leave a tip is over");
        }
        long max = max(trip.costMinor());
        if (amountMinor < UNIT || amountMinor > max) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    "A tip is from " + UNIT + " to " + max + " minor units");
        }
        if (current(orderId).isPresent()) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "A tip for this trip was already left");
        }
        String method = method(trip, amountMinor);
        UUID id = UUID.randomUUID();
        OffsetDateTime now = now();
        String state = switch (method) {
            case "CARD" -> "PENDING";
            case "WALLET" -> "PAID";
            default -> "RECORDED";
        };
        jdbc.sql("""
                        insert into order_tip (id, order_id, payer_client_id, driver_id, amount_minor, currency, method,
                                               state, created_at, settled_at)
                        values (:id, :order, :payer, :driver, :amount, :currency, :method, :state, :now, :settled)""")
                .param("id", id).param("order", orderId).param("payer", trip.payerId())
                .param("driver", trip.driverId()).param("amount", amountMinor).param("currency", trip.currency())
                .param("method", method).param("state", state).param("now", now)
                .param("settled", "PENDING".equals(state) ? null : now).update();
        switch (method) {
            case "CARD" -> cards.requestTip(orderId, id, amountMinor, trip.currency());
            case "WALLET" -> wallets.payTip(trip.payerId(), trip.driverId(), orderId, id, trip.currency(),
                    amountMinor);
            default -> {
                // Cash or the driver's terminal: handed over, nothing passes through the service.
            }
        }
        if (!"PENDING".equals(state)) {
            publishPaid(id);
        }
        return tip(id);
    }

    /**
     * The card charge of a tip is final (CardTipSettled), in the caller's transaction. A repeated result changes
     * nothing.
     */
    void settleCard(UUID tipId, boolean paid, String reason) {
        int changed = jdbc.sql("""
                        update order_tip set state = :state, failure_reason = :reason, settled_at = :now
                        where id = :id and state = 'PENDING'""")
                .param("state", paid ? "PAID" : "FAILED").param("reason", paid ? null : reason)
                .param("now", now()).param("id", tipId).update();
        if (changed == 1 && paid) {
            publishPaid(tipId);
        } else if (changed == 1) {
            log.info("Tip {} was declined by the bank: {}", tipId, reason);
        }
    }

    private void publishPaid(UUID tipId) {
        Map<String, Object> payload = jdbc.sql("""
                        select id, order_id, driver_id, payer_client_id, amount_minor, currency, method
                        from order_tip where id = :id""")
                .param("id", tipId)
                .query((rs, i) -> {
                    Map<String, Object> p = new LinkedHashMap<>();
                    p.put("tip_id", rs.getObject("id", UUID.class).toString());
                    p.put("order_id", rs.getObject("order_id", UUID.class).toString());
                    p.put("driver_id", rs.getObject("driver_id", UUID.class).toString());
                    p.put("payer_client_id", rs.getObject("payer_client_id", UUID.class).toString());
                    p.put("amount_minor", rs.getLong("amount_minor"));
                    p.put("currency", rs.getString("currency"));
                    p.put("method", rs.getString("method"));
                    return p;
                })
                .single();
        outbox.publish(new OutboxEvent(PAID, 1, "Tip", tipId, 0, payload));
    }

    // ---------------------------------------------------------------- helpers

    /**
     * How a tip of {@code amountMinor} is paid: the order's own method, except an order paid wholly with bonuses,
     * whose tip comes from the bonus account when it has enough.
     */
    private String method(Trip trip, long amountMinor) {
        if ("SERVICE".equals(trip.paymentMethod())) {
            return null;
        }
        if (trip.paidWithBonuses() && wallets.available(trip.payerId(), trip.currency()) >= amountMinor) {
            return "WALLET";
        }
        return trip.paidWithBonuses() ? trip.selectedPaymentMethod() : trip.paymentMethod();
    }

    private OffsetDateTime until(Trip trip) {
        return trip.completedAt().plus(Duration.ofHours(settings.current().settings().tips().windowHours()));
    }

    /** The rider's own fulfilled order; NOT_FOUND for anyone else's or an unfinished one. */
    private Trip trip(Actor rider, UUID orderId, boolean lock) {
        Optional<Trip> trip = jdbc.sql("""
                        select o.id, o.payer_client_id, a.driver_id, o.payment_method, o.currency,
                               o.final_price_minor, o.discount_minor, o.wallet_minor, t.completed_at,
                               coalesce(o.selected_payment_method, o.payment_method) as selected_payment_method
                        from ride_order o
                        join trip t on t.order_id = o.id and t.phase = 'COMPLETED'
                        join assignment a on a.id = t.assignment_id
                        where o.id = :order and o.status = 'FULFILLED' and o.payer_client_id = :payer
                          and o.final_price_minor is not null""" + (lock ? " for update of o" : ""))
                .param("order", orderId).param("payer", rider.id())
                .query((rs, i) -> new Trip(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, UUID.class), rs.getString(4), rs.getString(5), rs.getLong(6), rs.getLong(7),
                        rs.getLong(8), rs.getObject(9, OffsetDateTime.class), rs.getString(10)))
                .optional();
        return trip.orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "No fulfilled trip of yours"));
    }

    /** The tip of the order that counts: any but a failed one. */
    private Optional<Tip> current(UUID orderId) {
        return jdbc.sql(SELECT + " where order_id = :order and state <> 'FAILED'")
                .param("order", orderId).query((rs, i) -> tip(rs)).optional();
    }

    private Tip tip(UUID tipId) {
        return jdbc.sql(SELECT + " where id = :id").param("id", tipId).query((rs, i) -> tip(rs)).single();
    }

    private static final String SELECT = """
            select id, order_id, amount_minor, currency, method, state, failure_reason, created_at from order_tip
            """;

    private static Tip tip(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Tip(rs.getObject("id", UUID.class), rs.getObject("order_id", UUID.class),
                rs.getLong("amount_minor"), rs.getString("currency"), rs.getString("method"), rs.getString("state"),
                rs.getString("failure_reason"), rs.getObject("created_at", OffsetDateTime.class));
    }

    private OffsetDateTime now() {
        return clock.instant().truncatedTo(ChronoUnit.MICROS).atOffset(ZoneOffset.UTC);
    }

    private static void requireRider(Actor actor) {
        if (actor == null || actor.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Riders leave tips");
        }
    }
}
