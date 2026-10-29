package taxi.blizz.backoffice.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Pattern;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.driver.DriverProfile;
import taxi.blizz.identity.ClientAccounts;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.location.TrackService;
import taxi.blizz.operations.OrderChat;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.payments.PaymentOperations;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.pricing.FinalFares;

/**
 * The evidence of one order for a chargeback (REQ-PAY-23, issue #103): what the payment provider's risk managers ask
 * for (https://help.wayforpay.com/view/3342760) — the service and that it was delivered, the rider's registration and
 * trips of the last 12 months, the card operations and the correspondence — in one document, each part from the
 * module that owns it.
 *
 * <p>Needs {@link PaymentOperations#RETRY_PERMISSION} for the order's city and a reason; every look is audited. It
 * carries no phone number and no card data: free text people typed (chat, support) has every run of nine or more
 * digits hidden. Left out on purpose: phones, documents, card ids and masks, internal support notes, the commission
 * and the driver's share, and the details of the rider's other orders.
 */
@Service
class OrderEvidence {

    static final String VIEW_ACTION = "order.evidence.view";
    static final String HIDDEN = "[number hidden]";
    /** Nine or more digits, with the separators people type: phone numbers and card numbers. */
    private static final Pattern LONG_NUMBER = Pattern.compile("\\+?\\d(?:[\\s().\\-/]*\\d){8,}");

    private final StaffAccess staff;
    private final Orders orders;
    private final FinalFares fares;
    private final DriverAdmission drivers;
    private final TrackService tracks;
    private final ClientAccounts clients;
    private final PaymentOperations payments;
    private final OrderChat chat;
    private final JdbcClient jdbc;
    private final AuditLog audit;
    private final Clock clock;

    OrderEvidence(StaffAccess staff, Orders orders, FinalFares fares, DriverAdmission drivers, TrackService tracks,
                  ClientAccounts clients, PaymentOperations payments, OrderChat chat, JdbcClient jdbc, AuditLog audit,
                  Clock clock) {
        this.staff = staff;
        this.orders = orders;
        this.fares = fares;
        this.drivers = drivers;
        this.tracks = tracks;
        this.clients = clients;
        this.payments = payments;
        this.chat = chat;
        this.jdbc = jdbc;
        this.audit = audit;
        this.clock = clock;
    }

    record Fare(long amountMinor, String currency, String policy, long agreedMinor, long waitingSeconds,
                long freeWaitingSeconds, long chargedWaitingSeconds, long waitingMinor) {
    }

    record Order(UUID id, long shortNumber, String status, String paymentMethod, String paymentState,
                 String pickupLabel, String dropoffLabel, Long quotedPriceMinor, Long finalPriceMinor,
                 String currency, long walletMinor, long discountMinor, Fare fare, OffsetDateTime createdAt,
                 OffsetDateTime assignedAt, OffsetDateTime arrivedAt, OffsetDateTime startedAt,
                 OffsetDateTime completedAt) {
    }

    record Vehicle(String make, String model, String color, String registrationNumber) {
    }

    record Driver(UUID id, String name, Vehicle vehicle) {
    }

    /** Of the ride itself, from its start to its completion. */
    record Track(long points, long flaggedPoints, OffsetDateTime firstPointAt, OffsetDateTime lastPointAt,
                 long durationSeconds, long lengthMeters) {
    }

    record Rider(UUID id, OffsetDateTime registeredAt, List<Orders.PayerTrips> tripsLastYear) {
    }

    record CardOperation(String type, String state, long amountMinor, String currency, String providerStatus,
                         OffsetDateTime createdAt) {
    }

    record ChatMessage(String senderRole, String body, OffsetDateTime sentAt) {
    }

    record CaseMessage(String authorType, String body, OffsetDateTime createdAt) {
    }

    record SupportCase(long number, String category, String subject, String state, String resolution,
                       OffsetDateTime createdAt, List<CaseMessage> messages) {
    }

    record Evidence(OffsetDateTime generatedAt, Order order, Driver driver, Track track, Rider rider,
                    List<CardOperation> cardOperations, List<ChatMessage> chat, List<SupportCase> supportCases) {
    }

    @Transactional
    Evidence of(Actor actor, UUID orderId, String reason) {
        // Nobody without the permission learns whether the order exists; then the order's city decides.
        staff.require(actor, PaymentOperations.RETRY_PERMISSION);
        OrderView order = orders.get(orderId);
        staff.require(actor, PaymentOperations.RETRY_PERMISSION, order.cityId());
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required to export the evidence");
        }
        String why = reason.strip();
        if (why.length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The reason is at most 500 characters");
        }
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);

        Optional<Orders.TripTimes> times = orders.tripTimes(orderId);
        Fare fare = fares.ofOrder(orderId).map(f -> new Fare(f.amountMinor(), f.currency(), f.policy(),
                f.breakdown().agreedMinor(), f.breakdown().waitingSeconds(), f.breakdown().freeWaitingSeconds(),
                f.breakdown().chargedWaitingSeconds(), f.breakdown().waitingMinor())).orElse(null);
        Order theOrder = new Order(order.id(), order.shortNumber(), order.status(),
                order.paymentMethod() == null ? null : order.paymentMethod().name(), order.paymentState(),
                hideNumbers(order.pickupLabel()), hideNumbers(order.dropoffLabel()), order.priceMinor(), order.finalPriceMinor(),
                order.currency(), order.walletMinor(), order.discountMinor(), fare, order.createdAt(),
                times.map(Orders.TripTimes::assignedAt).orElse(null),
                times.map(Orders.TripTimes::arrivedAt).orElse(null),
                times.map(Orders.TripTimes::startedAt).orElse(null),
                times.map(Orders.TripTimes::completedAt).orElse(null));

        Driver driver = times.filter(t -> t.driverId() != null).map(t -> driver(t.driverId(), t.vehicleId()))
                .orElse(null);
        Track track = times.filter(t -> t.driverId() != null && t.startedAt() != null && t.completedAt() != null)
                .map(t -> {
                    TrackService.Summary s = tracks.summary(t.driverId(), t.startedAt(), t.completedAt());
                    long seconds = s.first() == null ? 0 : Duration.between(s.first(), s.last()).toSeconds();
                    return new Track(s.points(), s.flagged(), s.first(), s.last(), seconds, s.lengthMeters());
                })
                .orElse(new Track(0, 0, null, null, 0, 0));

        Rider rider = order.payerClientId() == null ? null : new Rider(order.payerClientId(),
                clients.registeredAt(order.payerClientId()).orElse(null),
                orders.payerTrips(order.payerClientId(), now.minusMonths(12)));

        List<CardOperation> card = cardOperations(actor, orderId);
        List<ChatMessage> messages = chat.transcript(orderId).stream()
                .map(m -> new ChatMessage(m.senderRole(), hideNumbers(m.body()), m.sentAt())).toList();
        List<SupportCase> cases = supportCases(orderId);

        audit.record(new AuditEntry(actor, VIEW_ACTION, "ride_order", orderId.toString(), why, null,
                Map.of("card_operations", card.size(), "chat_messages", messages.size(),
                        "support_cases", cases.size())));
        return new Evidence(now, theOrder, driver, track, rider, card, messages, cases);
    }

    private Driver driver(UUID driverId, UUID vehicleId) {
        DriverProfile profile = drivers.profile(driverId);
        Vehicle vehicle = profile.vehicles().stream().filter(v -> v.id().equals(vehicleId)).findFirst()
                .map(v -> new Vehicle(v.make(), v.model(), v.color(), v.registrationNumber())).orElse(null);
        return new Driver(profile.id(), profile.name(), vehicle);
    }

    private List<CardOperation> cardOperations(Actor actor, UUID orderId) {
        try {
            return payments.ofOrder(actor, orderId).stream()
                    .map(o -> new CardOperation(o.type(), o.state(), o.amountMinor(), o.currency(), o.providerStatus(),
                            o.createdAt()))
                    .toList();
        } catch (DomainException e) {
            if (e.code() == ErrorCode.NOT_FOUND) {
                return List.of(); // not paid by card
            }
            throw e;
        }
    }

    /** The order's support cases, oldest first, with what was said to and by the requester (no internal notes). */
    private List<SupportCase> supportCases(UUID orderId) {
        record Row(UUID id, long number, String category, String subject, String state, String resolution,
                   OffsetDateTime createdAt) {
        }
        return jdbc.sql("""
                        select id, number, category, subject, state, resolution, created_at from support_case
                        where order_id = :order order by created_at, number""")
                .param("order", orderId)
                .query((rs, i) -> new Row(rs.getObject("id", UUID.class), rs.getLong("number"),
                        rs.getString("category"), rs.getString("subject"), rs.getString("state"),
                        rs.getString("resolution"), rs.getObject("created_at", OffsetDateTime.class)))
                .list().stream()
                .map(r -> new SupportCase(r.number(), r.category(), hideNumbers(r.subject()), r.state(),
                        hideNumbers(r.resolution()), r.createdAt(), jdbc.sql("""
                                        select author_type, body, created_at from support_message
                                        where case_id = :case and visibility = 'PUBLIC' order by sequence""")
                                .param("case", r.id())
                                .query((rs, i) -> new CaseMessage(rs.getString("author_type"),
                                        hideNumbers(rs.getString("body")),
                                        rs.getObject("created_at", OffsetDateTime.class)))
                                .list()))
                .toList();
    }

    static String hideNumbers(String text) {
        return text == null ? null : LONG_NUMBER.matcher(text).replaceAll(HIDDEN);
    }
}
