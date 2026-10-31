package taxi.blizz.operations.internal;

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
import taxi.blizz.finance.FareDeltas;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.identity.StaffSignIn;
import taxi.blizz.operations.FareCorrections;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.pricing.FinalFares;

/**
 * See {@link FareCorrections}. One transaction: the order row is locked first, then pricing locks the latest final
 * fare and writes the next version, finance posts the difference once (keyed by the new version), and the order's
 * price, history and the audit follow. The password is checked before, in a transaction of its own, so a wrong one is
 * counted although the command is refused.
 */
@Service
class JdbcFareCorrections implements FareCorrections {

    /** A card payment of the order not settled yet: its amount could still move. */
    private static final Set<String> PAYMENT_IN_PROGRESS = Set.of("AUTH_PENDING", "AUTHORIZED", "CAPTURE_PENDING");
    private static final int REASON_MAX = 500;
    static final String WAITING = "WAITING_FOR_REFUND_FLOW";

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final StaffSignIn signIn;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final FinalFares fares;
    private final FareDeltas deltas;
    private final OrderCore core;
    private final Clock clock;

    JdbcFareCorrections(JdbcClient jdbc, StaffAccess staff, StaffSignIn signIn, IdempotentCommands commands,
                        AuditLog audit, FinalFares fares, FareDeltas deltas, OrderCore core, Clock clock) {
        this.jdbc = jdbc;
        this.staff = staff;
        this.signIn = signIn;
        this.commands = commands;
        this.audit = audit;
        this.fares = fares;
        this.deltas = deltas;
        this.core = core;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public View fare(Actor actor, UUID orderId) {
        staff.require(actor, Orders.VIEW_PERMISSION, cityOf(orderId));
        return view(orderId);
    }

    record Request(UUID orderId, int expectedVersion, long amountMinor, String reason) {
    }

    private record Order(String status, String paymentState, String paymentMethod, UUID payerClientId,
                         String currency) {
    }

    @Override
    public View correct(Actor actor, UUID commandId, UUID orderId, int expectedVersion, long amountMinor,
                        String reason, String password) {
        staff.require(actor, CORRECT_PERMISSION, cityOf(orderId));
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > REASON_MAX) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of at most 500 characters is required");
        }
        if (amountMinor < 0 || expectedVersion < 1) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The amount and the version must be positive");
        }
        signIn.confirmPassword(actor, password);
        return commands.execute(new CommandKey(actor, "fare.correct", commandId),
                new Request(orderId, expectedVersion, amountMinor, why), View.class, () -> {
                    Order order = jdbc.sql("""
                                    select status, payment_state, payment_method, payer_client_id, currency
                                    from ride_order where id = :id for update""")
                            .param("id", orderId)
                            .query((rs, i) -> new Order(rs.getString(1), rs.getString(2), rs.getString(3),
                                    rs.getObject(4, UUID.class), rs.getString(5)))
                            .single();
                    if (!"FULFILLED".equals(order.status())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Only a fulfilled order's fare is corrected; this one is " + order.status());
                    }
                    if (PAYMENT_IN_PROGRESS.contains(order.paymentState())) {
                        throw new DomainException(ErrorCode.PAYMENT_PENDING,
                                "The order's payment is still in progress");
                    }
                    List<FinalFares.Version> before = fares.versions(orderId);
                    FinalFares.Version previous = before.isEmpty() ? null : before.getLast();
                    FinalFares.Version next = fares.correct(orderId, expectedVersion, amountMinor, why, actor.id());
                    UUID driver = jdbc.sql("""
                                    select driver_id from assignment where order_id = :id
                                    order by created_at desc limit 1""")
                            .param("id", orderId).query(UUID.class).optional().orElse(null);
                    long refund = deltas.post(new FareDeltas.Delta(orderId, next.id(), order.payerClientId(), driver,
                            "SERVICE".equals(order.paymentMethod()), order.currency().strip(),
                            next.amountMinor() - previous.amountMinor(),
                            next.commissionMinor() - previous.commissionMinor(),
                            next.driverShareMinor() - previous.driverShareMinor()));
                    long version = jdbc.sql("""
                                    update ride_order set final_fare_id = :fare, final_price_minor = :amount,
                                                          updated_at = :now, version = version + 1
                                    where id = :id returning version""")
                            .param("fare", next.id()).param("amount", next.amountMinor()).param("now", now())
                            .param("id", orderId).query(Long.class).single();
                    Map<String, Object> details = new LinkedHashMap<>();
                    details.put("version", next.version());
                    details.put("previous_amount_minor", previous.amountMinor());
                    details.put("amount_minor", next.amountMinor());
                    details.put("delta_minor", next.amountMinor() - previous.amountMinor());
                    details.put("refund_obligation_minor", refund);
                    details.put("refund_state", refund > 0 ? WAITING : "NONE");
                    core.recordEvent(orderId, version, "FareCorrected", actor, why, details);
                    audit.record(new AuditEntry(actor, "fare.correct", "ride_order", orderId.toString(), why,
                            Map.of("version", previous.version(), "amount_minor", previous.amountMinor()),
                            Map.of("version", next.version(), "amount_minor", next.amountMinor(),
                                    "refund_obligation_minor", refund)));
                    return view(orderId);
                });
    }

    private View view(UUID orderId) {
        List<FinalFares.Version> versions = fares.versions(orderId);
        if (versions.isEmpty()) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The order has no final fare yet");
        }
        String currency = jdbc.sql("select currency from ride_order where id = :id").param("id", orderId)
                .query(String.class).single().strip();
        long refund = deltas.refundObligation(orderId);
        return new View(orderId, currency, versions.getLast().version(), versions, refund,
                refund > 0 ? WAITING : "NONE");
    }

    private UUID cityOf(UUID orderId) {
        return jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId).query(UUID.class)
                .optional().orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
