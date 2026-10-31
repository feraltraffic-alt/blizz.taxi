package taxi.blizz.operations.internal;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.operations.DestinationChanges;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.pricing.QuoteService;

/**
 * See {@link DestinationChanges}. The new quote is made before the order is locked, like every quote (the route is
 * asked for outside any transaction), from the quote the order holds then; the version check under the lock makes sure
 * that quote is still the order's.
 */
@Service
class JdbcDestinationChanges implements DestinationChanges {

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final QuoteService quotes;
    private final OrderCore core;
    private final CardPayments cardPayments;
    private final AuditLog audit;

    JdbcDestinationChanges(JdbcClient jdbc, StaffAccess staff, IdempotentCommands commands, QuoteService quotes,
                           OrderCore core, CardPayments cardPayments, AuditLog audit) {
        this.jdbc = jdbc;
        this.staff = staff;
        this.commands = commands;
        this.quotes = quotes;
        this.core = core;
        this.cardPayments = cardPayments;
        this.audit = audit;
    }

    record ChangeRequest(UUID orderId, long expectedVersion, GeoPoint dropoff, String dropoffLabel, String reason) {
    }

    private record Current(UUID cityId, UUID quoteId) {
    }

    @Override
    public Changed change(Actor actor, UUID commandId, UUID orderId, long expectedVersion, Change change) {
        if (commandId == null || change == null || change.dropoff() == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The command and the new destination are required");
        }
        String label = text(change.dropoffLabel(), 300, "destination label");
        String reason = text(change.reason(), 500, "reason");
        Current current = jdbc.sql("select city_id, quote_id from ride_order where id = :id")
                .param("id", orderId)
                .query((rs, i) -> new Current(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class)))
                .optional().orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        staff.require(actor, PERMISSION, current.cityId());
        if (current.quoteId() == null) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The order has no price to change");
        }
        // Keyed by the command, so a repeat reuses the same quote.
        QuoteService.Quote quote = quotes.requote(
                UUID.nameUUIDFromBytes(("destination:" + commandId).getBytes(StandardCharsets.UTF_8)),
                current.quoteId(), change.dropoff(), actor);
        return commands.execute(new CommandKey(actor, "order.destination", commandId),
                new ChangeRequest(orderId, expectedVersion, change.dropoff(), label, reason), Changed.class, () -> {
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    if (order.version() != expectedVersion) {
                        throw ConflictException.version(order.version(), "The order changed");
                    }
                    if (!"IN_SERVICE".equals(order.status())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Only the destination of a trip in progress is changed here");
                    }
                    AssignmentView assignment = core.assignmentOfOrder(orderId)
                            .filter(a -> "COMMITTED".equals(a.state()) && "IN_PROGRESS".equals(a.tripPhase()))
                            .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No trip in progress"));
                    record Priced(UUID quoteId, long priceMinor, String paymentMethod, long discountMinor,
                                  long walletMinor) {
                    }
                    Priced before = jdbc.sql("""
                                    select quote_id, price_minor, payment_method, discount_minor, wallet_minor
                                    from ride_order where id = :id""")
                            .param("id", orderId)
                            .query((rs, i) -> new Priced(rs.getObject(1, UUID.class), rs.getLong(2), rs.getString(3),
                                    rs.getLong(4), rs.getLong(5)))
                            .single();
                    if (!current.quoteId().equals(before.quoteId())) {
                        throw ConflictException.version(order.version(), "The order's price changed");
                    }
                    // The card's part as the completion will count it: the discount first, then the bonuses.
                    Long hold = null;
                    boolean aboveHold = false;
                    if ("CARD".equals(before.paymentMethod())) {
                        CardPayments.Intent intent = cardPayments.intent(orderId).orElse(null);
                        if (intent != null) {
                            hold = intent.holdMinor();
                            long discount = Math.min(before.discountMinor(), quote.amountMinor());
                            long wallet = Math.min(before.walletMinor(), quote.amountMinor() - discount);
                            aboveHold = quote.amountMinor() - discount - wallet > hold;
                        }
                    }
                    jdbc.sql("""
                                    update ride_order
                                    set dropoff = ST_SetSRID(ST_MakePoint(:lon, :lat), 4326), dropoff_label = :label,
                                        price_minor = :price, quote_id = :quote, updated_at = :now
                                    where id = :id""")
                            .param("lon", change.dropoff().lon()).param("lat", change.dropoff().lat())
                            .param("label", label).param("price", quote.amountMinor()).param("quote", quote.id())
                            .param("now", core.now()).param("id", orderId).update();
                    Map<String, Object> payload = new LinkedHashMap<>();
                    payload.put("trip_id", assignment.tripId().toString());
                    payload.put("driver_id", assignment.driverId().toString());
                    payload.put("previous_quote_id", before.quoteId().toString());
                    payload.put("quote_id", quote.id().toString());
                    payload.put("previous_price_minor", before.priceMinor());
                    payload.put("price_minor", quote.amountMinor());
                    payload.put("currency", quote.currency());
                    payload.put("distance_m", quote.route().distanceMetres());
                    payload.put("payment_method", before.paymentMethod());
                    payload.put("hold_minor", hold);
                    payload.put("above_hold", aboveHold);
                    core.recordEvent(orderId, core.touch(orderId), EVENT, actor, reason, payload);
                    // The addresses stay out of the audit: they are the rider's data, erased with the order.
                    audit.record(new AuditEntry(actor, "order.destination", "ride_order", orderId.toString(), reason,
                            Map.of("quote_id", before.quoteId().toString(), "price_minor", before.priceMinor()),
                            Map.of("quote_id", quote.id().toString(), "price_minor", quote.amountMinor(),
                                    "above_hold", aboveHold)));
                    return new Changed(core.view(orderId), before.priceMinor(), quote.amountMinor(),
                            quote.currency(), hold, aboveHold);
                });
    }

    private static String text(String value, int max, String field) {
        if (value == null || value.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The " + field + " is required");
        }
        String clean = value.strip();
        if (clean.length() > max) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    "The " + field + " is at most " + max + " characters");
        }
        return clean;
    }
}
