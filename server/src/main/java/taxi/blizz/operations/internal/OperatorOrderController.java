package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityResolver;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.operations.CallerContact;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.OrderChannel;
import taxi.blizz.operations.OrderChat;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.pricing.VehicleClasses;

/** Operator workstation HTTP slice (S-08). */
@RestController
@RequestMapping("/api/operator/v1")
class OperatorOrderController {

    private final Orders orders;
    private final OrderChat chat;
    private final CityResolver cities;
    private final VehicleClasses classes;
    private final QuoteService quotes;
    private final StaffAccess staff;
    private final JdbcClient jdbc;
    private final taxi.blizz.operations.Preorders preorders;

    OperatorOrderController(Orders orders, OrderChat chat, CityResolver cities, VehicleClasses classes,
                            QuoteService quotes, StaffAccess staff, JdbcClient jdbc,
                            taxi.blizz.operations.Preorders preorders) {
        this.preorders = preorders;
        this.orders = orders;
        this.chat = chat;
        this.cities = cities;
        this.classes = classes;
        this.quotes = quotes;
        this.staff = staff;
        this.jdbc = jdbc;
    }

    record QuoteRequest(@NotNull UUID commandId, @NotBlank @Size(max = 64) String vehicleClass,
                        @NotNull GeoPoint pickup, @NotNull GeoPoint dropoff, java.time.Instant pickupAt) {
    }

    record WaitingTerms(int freeMinutes, java.math.BigDecimal perMinuteMinor, int stepSeconds, String rounding) {
    }

    record QuoteView(UUID id, String vehicleClass, UUID cityId, long amountMinor, String currency,
                     long distanceM, long durationS, java.time.Instant expiresAt, WaitingTerms waiting,
                     java.time.Instant pickupAt, boolean preorder) {
    }

    record CallerInput(@Size(max = 120) String name, @NotBlank String phone) {
    }

    record CreatePhoneOrder(@NotNull UUID commandId, @NotNull UUID quoteId,
                            @NotBlank @Size(max = 64) String vehicleClass,
                            @NotNull GeoPoint pickup, @Size(max = 300) String pickupLabel,
                            @NotNull GeoPoint dropoff, @Size(max = 300) String dropoffLabel,
                            @NotNull PaymentMethod paymentMethod, @Size(max = 200) String callRef,
                            @NotNull @Valid CallerInput caller, java.time.Instant pickupAt,
                            Boolean terminalFallbackToCash, UUID callId, Boolean linkAgain) {
    }

    record CancelRequest(@NotNull UUID commandId, @NotNull Long expectedVersion,
                         @NotBlank @Size(max = 100) String reasonCode) {
    }

    record RevokeRequest(@NotNull UUID commandId, @NotNull Long expectedVersion,
                         @NotBlank @Size(max = 500) String reason) {
    }

    record CallerView(String name, String phone) {
    }

    record OperatorOrderView(UUID id, long shortNumber, String status, String statusReason, long version,
                             String channel, UUID payerClientId, UUID cityId, String vehicleClass,
                             GeoPoint pickup, String pickupLabel, GeoPoint dropoff, String dropoffLabel,
                             PaymentMethod paymentMethod, String paymentState, Long priceMinor,
                             Long finalPriceMinor, String currency, String searchPhase,
                             AssignmentView assignment, OffsetDateTime createdAt, CallerView caller,
                             OrderView.Cancellation cancellation, OffsetDateTime pickupAt, boolean preorder,
                             taxi.blizz.operations.Preorders.Holder reservation, UUID relatedOrderId) {
    }

    record Timeline(List<Orders.TimelineEntry> events) {
    }

    record ChatMessages(List<OrderChat.Message> messages) {
    }

    @PostMapping("/quotes")
    @ResponseStatus(HttpStatus.CREATED)
    QuoteView quote(AccessClaims claims, @Valid @RequestBody QuoteRequest body) {
        City city = city(body.pickup());
        staff.require(claims.actor(), Orders.CREATE_PERMISSION, city.id());
        VehicleClasses.VehicleClass vehicleClass = classes.active(city.id(), body.vehicleClass())
                .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED, "This class is not offered here"));
        QuoteService.Quote quote = quotes.create(body.commandId(), new QuoteService.Request(city.id(),
                vehicleClass.id(), body.pickup(), body.dropoff(), claims.actor(), body.pickupAt()));
        return new QuoteView(quote.id(), vehicleClass.code(), city.id(), quote.amountMinor(), quote.currency(),
                quote.route().distanceMetres(), quote.route().durationSeconds(), quote.expiresAt(),
                new WaitingTerms(quote.terms().freeWaitingMinutes(), quote.terms().waitingPerMinuteMinor(),
                        quote.terms().waitingStepSeconds(), quote.terms().waitingRounding().name()), body.pickupAt(), quote.breakdown().preorder());
    }

    @PostMapping("/orders")
    @ResponseStatus(HttpStatus.CREATED)
    OperatorOrderView create(AccessClaims claims, @Valid @RequestBody CreatePhoneOrder body) {
        // Cash, or a card at the driver's own terminal (owner decision 27.10.2026); a payment link comes later (#46).
        if (body.paymentMethod() != PaymentMethod.CASH && body.paymentMethod() != PaymentMethod.TERMINAL) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Phone orders are paid in cash or at the terminal");
        }
        PhoneNumber phone = PhoneNumber.parse(body.caller().phone());
        CallerContact caller = new CallerContact(body.caller().name(), phone.e164());
        CreateOrder request = new CreateOrder(null,
                body.vehicleClass(), body.pickup(), body.pickupLabel(), body.dropoff(), body.dropoffLabel(),
                body.paymentMethod(), body.quoteId(), OrderChannel.PHONE, body.callRef(), caller, body.pickupAt(),
                Boolean.TRUE.equals(body.terminalFallbackToCash()));
        // Made during an incoming call: linked to it (issue #64); a phone order without a call works as before.
        OrderView order = body.callId() == null
                ? orders.create(claims.actor(), body.commandId(), request)
                : orders.createDuringCall(claims.actor(), body.commandId(), request, body.callId(),
                        Boolean.TRUE.equals(body.linkAgain()));
        return view(order);
    }

    @GetMapping("/orders")
    List<OperatorOrderView> list(AccessClaims claims, @RequestParam(name = "city_id") UUID cityId,
                                 @RequestParam(defaultValue = "active") String status,
                                 @RequestParam(required = false)
                                 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime before,
                                 @RequestParam(defaultValue = "50") int limit) {
        if (!"active".equals(status) && !"all".equals(status)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "status must be active or all");
        }
        if (limit < 1 || limit > 100) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "limit must be between 1 and 100");
        }
        return orders.inCity(claims.actor(), cityId, "active".equals(status), before, limit).stream()
                .map(this::view).toList();
    }

    @GetMapping("/orders/{orderId}")
    OperatorOrderView get(AccessClaims claims, @PathVariable UUID orderId) {
        OrderView order = orders.get(orderId);
        staff.require(claims.actor(), Orders.VIEW_PERMISSION, order.cityId());
        return view(order);
    }

    @PostMapping("/orders/{orderId}/cancel")
    OperatorOrderView cancel(AccessClaims claims, @PathVariable UUID orderId,
                             @Valid @RequestBody CancelRequest body) {
        if (body.expectedVersion() < 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "expected_version must not be negative");
        }
        return view(orders.cancel(claims.actor(), body.commandId(), orderId,
                body.expectedVersion(), body.reasonCode()));
    }

    record InterruptRequest(@NotNull UUID commandId, @NotNull @jakarta.validation.constraints.Min(0) Long expectedVersion,
                            @NotBlank @Size(max = 40) String reasonCode, @Size(max = 500) String comment,
                            @NotNull Boolean followUp, GeoPoint followUpPickup,
                            @Size(max = 300) String followUpPickupLabel) {
    }

    record InterruptedView(OperatorOrderView order, OperatorOrderView followUp) {
    }

    /** A trip in progress cannot go on (T-22): cancelled for free, and optionally a follow-up on the service. */
    @PostMapping("/orders/{orderId}/interrupt")
    InterruptedView interrupt(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody InterruptRequest body) {
        Orders.Interrupted result = orders.interrupt(claims.actor(), body.commandId(), orderId, body.expectedVersion(),
                new Orders.Interruption(body.reasonCode(), body.comment(), body.followUp(), body.followUpPickup(),
                        body.followUpPickupLabel()));
        return new InterruptedView(view(result.order()), result.followUp() == null ? null : view(result.followUp()));
    }

    @PostMapping("/orders/{orderId}/revoke-assignment")
    OperatorOrderView revoke(AccessClaims claims, @PathVariable UUID orderId,
                             @Valid @RequestBody RevokeRequest body) {
        if (body.expectedVersion() < 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "expected_version must not be negative");
        }
        return view(orders.revokeAssignment(claims.actor(), body.commandId(), orderId,
                body.expectedVersion(), body.reason()));
    }

    /** Who did what with the order: "Operator Anna cancelled the order: passenger asked". */
    @GetMapping("/orders/{orderId}/events")
    Timeline events(AccessClaims claims, @PathVariable UUID orderId) {
        return new Timeline(orders.timeline(claims.actor(), orderId));
    }

        @GetMapping("/orders/{orderId}/messages")
    ChatMessages messages(AccessClaims claims, @PathVariable UUID orderId, @RequestParam String reason) {
        if (reason == null || reason.isBlank() || reason.length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "reason must have 1 to 500 characters");
        }
        return new ChatMessages(chat.conversation(claims.actor(), orderId, reason));
    }

    private OperatorOrderView view(OrderView order) {
        return new OperatorOrderView(order.id(), order.shortNumber(), order.status(), order.statusReason(),
                order.version(), order.channel(), order.payerClientId(), order.cityId(), order.vehicleClass(),
                order.pickup(), order.pickupLabel(), order.dropoff(), order.dropoffLabel(), order.paymentMethod(),
                order.paymentState(), order.priceMinor(), order.finalPriceMinor(), order.currency(), order.searchPhase(),
                order.assignment(), order.createdAt(), contact(order.id()), order.cancellation(), order.pickupAt(),
                order.preorder(), "SCHEDULED".equals(order.status()) ? preorders.holder(order.id()).orElse(null) : null,
                order.relatedOrderId());
    }

    private CallerView contact(UUID orderId) {
        return jdbc.sql("select name, phone from order_contact where order_id = :id")
                .param("id", orderId)
                .query((rs, i) -> new CallerView(rs.getString("name"), rs.getString("phone")))
                .optional().orElse(null);
    }

    private City city(GeoPoint point) {
        return cities.resolve(point).orElseThrow(() ->
                new DomainException(ErrorCode.OUTSIDE_SERVICE_AREA, "Pickup is outside every service area"));
    }
}
