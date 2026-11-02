package taxi.blizz.notification.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/**
 * Turns order events into pushes (section 20, REQ-NTF-02/03/07): who gets one, with which text, in which language and
 * until when it still makes sense. One notification per event and recipient — a repeated event adds nothing. The
 * {@link PushWorker} sends them.
 */
@Component
class NotificationFeed implements OutboxHandler {

    /** An offer is answered within seconds; a late push only confuses. Used when the event carries no expiry. */
    static final Duration OFFER_DEADLINE = Duration.ofSeconds(30);
    static final Duration DEFAULT_DEADLINE = Duration.ofMinutes(10);

    private final Orders orders;
    private final AccountDirectory accounts;
    private final ServiceSettings settings;
    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;
    private final PushProperties properties;

    NotificationFeed(Orders orders, AccountDirectory accounts, ServiceSettings settings, JdbcClient jdbc,
                     JsonMapper json, Clock clock, PushProperties properties) {
        this.properties = properties;
        this.orders = orders;
        this.accounts = accounts;
        this.settings = settings;
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID driverId, String cancelledBy, UUID followUpOrderId, UUID offerId, UUID assignmentId,
                   OffsetDateTime expiresAt) {
        Payload(UUID driverId, String cancelledBy, UUID followUpOrderId) {
            this(driverId, cancelledBy, followUpOrderId, null, null, null);
        }
    }

    /**
     * {@code until}: an absolute deadline from the event itself (the offer's expiry, REQ-NTF-03), else {@code deadline}
     * counts from the event. {@code subject}: what must still be current when it is sent — {@code offer_id} or
     * {@code assignment_id} in the push data (AC-19, issue #143).
     */
    record Push(Actor recipient, String template, Duration deadline, OffsetDateTime until, Map<String, String> subject) {
        Push(Actor recipient, String template, Duration deadline) {
            this(recipient, template, deadline, null, Map.of());
        }
    }

    @Override
    public String consumerId() {
        return "notification.push-feed";
    }

    @Override
    public boolean supports(String eventType) {
        return switch (eventType) {
            case "OfferMade", "AssignmentCommitted", "DriverArrived", "TripCompleted", "OrderCancelled",
                 "PassengerNoShow", "OrderUnfulfilled", "CardHoldDeclined", "TripInterrupted",
                 "DestinationChanged" -> true;
            default -> false;
        };
    }

    @Override
    public void handle(OutboxMessage message) {
        if (!"Order".equals(message.aggregateType())) {
            return;
        }
        Payload payload = json.readValue(message.payload(), Payload.class);
        UUID rider = orders.participants(message.aggregateId()).map(Orders.Participants::payerClientId).orElse(null);
        for (Push push : pushes(message.type(), payload, rider)) {
            create(message, push);
        }
    }

    static List<Push> pushes(String type, Payload payload, UUID rider) {
        List<Push> pushes = new ArrayList<>();
        java.util.function.Consumer<String> toRider = template -> {
            if (rider != null) {
                pushes.add(new Push(new Actor(SubjectType.CLIENT, rider), template, DEFAULT_DEADLINE));
            }
        };
        switch (type) {
            case "OfferMade" -> {
                if (payload.driverId() != null) {
                    pushes.add(new Push(new Actor(SubjectType.DRIVER, payload.driverId()), "driver.offer",
                            OFFER_DEADLINE, payload.expiresAt(), payload.offerId() == null ? Map.of()
                            : Map.of("offer_id", payload.offerId().toString())));
                }
            }
            case "AssignmentCommitted" -> {
                if (rider != null) {
                    pushes.add(new Push(new Actor(SubjectType.CLIENT, rider), "rider.driver-assigned",
                            DEFAULT_DEADLINE, null, payload.assignmentId() == null ? Map.of()
                            : Map.of("assignment_id", payload.assignmentId().toString())));
                }
            }
            case "DriverArrived" -> toRider.accept("rider.driver-arrived");
            case "DestinationChanged" -> {
                toRider.accept("rider.destination-changed");
                if (payload.driverId() != null) {
                    pushes.add(new Push(new Actor(SubjectType.DRIVER, payload.driverId()),
                            "driver.destination-changed", DEFAULT_DEADLINE));
                }
            }
            case "TripCompleted" -> toRider.accept("rider.trip-completed");
            case "OrderUnfulfilled" -> toRider.accept("rider.no-driver");
            case "CardHoldDeclined" -> toRider.accept("rider.payment-declined");
            case "TripInterrupted" -> toRider.accept(payload.followUpOrderId() != null ? "rider.trip-interrupted"
                    : "rider.order-cancelled");
            case "OrderCancelled", "PassengerNoShow" -> {
                // Whoever cancelled knows it already.
                if (!"RIDER".equals(payload.cancelledBy())) {
                    toRider.accept("rider.order-cancelled");
                }
                if (payload.driverId() != null && !"DRIVER".equals(payload.cancelledBy())) {
                    pushes.add(new Push(new Actor(SubjectType.DRIVER, payload.driverId()), "driver.order-cancelled",
                            DEFAULT_DEADLINE));
                }
            }
            default -> {
            }
        }
        return pushes;
    }

    private void create(OutboxMessage message, Push push) {
        String fallback = settings.of(push.recipient()).settings().languages().defaultLanguage();
        String language = language(push.recipient(), fallback);
        PushTemplates.Text text = PushTemplates.text(push.template(), language, fallback).orElseThrow();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("type", push.template());
        data.put("event_type", message.type());
        data.put("event_id", message.eventId().toString());
        data.put("order_id", message.aggregateId().toString());
        data.put("order_version", String.valueOf(message.aggregateVersion()));
        data.putAll(push.subject());
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        // The deadline counts from the event, not from when the relay got to it.
        OffsetDateTime from = message.occurredAt() == null ? now
                : message.occurredAt().toInstant().atOffset(ZoneOffset.UTC);
        jdbc.sql("""
                        insert into notification (id, event_id, recipient_type, recipient_id, channel, template,
                                                  template_version, locale, title, body, data, state, next_attempt_at,
                                                  deadline, created_at)
                        values (:id, :event, :type, :recipient, 'PUSH', :template, :version, :locale, :title, :body,
                                cast(:data as jsonb), 'PENDING', :due, :deadline, :now)
                        on conflict (event_id, recipient_id, channel) do nothing""")
                .param("id", UUID.randomUUID()).param("event", message.eventId())
                .param("type", push.recipient().type().name()).param("recipient", push.recipient().id())
                .param("template", push.template()).param("version", PushTemplates.VERSION)
                .param("locale", language).param("title", text.title()).param("body", text.body())
                .param("data", json.writeValueAsString(data)).param("now", now)
                .param("due", now.plus(properties.initialDelay()))
                .param("deadline", push.until() != null ? push.until() : from.plus(push.deadline())).update();
    }

    /** The language of the person's profile, else the service's (REQ-NTF-07). */
    private String language(Actor recipient, String fallback) {
        String chosen = accounts.language(recipient).orElse(null);
        return PushTemplates.supports(chosen) ? chosen : fallback;
    }
}
