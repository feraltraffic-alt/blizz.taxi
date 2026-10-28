package taxi.blizz.notification.internal;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.Clock;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * SMS to a phone order's caller (section 20, REQ-NTF-08): the driver and car when assigned or changed, the car at the
 * pickup, no car found. Polish for a Polish number, Ukrainian otherwise (AGENTS.md: the language of the number's
 * country when the person is unknown). One SMS per event; {@link SmsWorker} sends it until its deadline, and a phone
 * order whose caller could not be told becomes a task for the dispatchers.
 */
@Component
class CallerTexts implements OutboxHandler {

    /** After this the news is old: the car has come or the caller has called again. */
    static final Duration DEADLINE = Duration.ofMinutes(10);

    private final Orders orders;
    private final ServiceSettings settings;
    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;

    CallerTexts(Orders orders, ServiceSettings settings, JdbcClient jdbc, JsonMapper json, Clock clock) {
        this.orders = orders;
        this.settings = settings;
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    @Override
    public String consumerId() {
        return "notification.caller-sms";
    }

    @Override
    public boolean supports(String eventType) {
        return "AssignmentCommitted".equals(eventType) || "DriverArrived".equals(eventType)
                || "OrderUnfulfilled".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        if (!"Order".equals(message.aggregateType())) {
            return;
        }
        Optional<Orders.CallerNotice> notice = orders.callerNotice(message.aggregateId());
        if (notice.isEmpty()) {
            return; // not a phone order, or no number to write to
        }
        String template = switch (message.type()) {
            case "AssignmentCommitted" -> "caller.driver-assigned";
            case "DriverArrived" -> "caller.driver-arrived";
            default -> "caller.no-driver";
        };
        Orders.CallerNotice n = notice.get();
        if (!"caller.no-driver".equals(template) && n.vehicle() == null) {
            return;
        }
        String language = n.contactPhone().startsWith("+48") ? "pl" : "uk";
        String text = text(template, language, n, settings.current().settings().brand().serviceName());
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        OffsetDateTime from = message.occurredAt() == null ? now
                : message.occurredAt().toInstant().atOffset(ZoneOffset.UTC);
        jdbc.sql("""
                        insert into notification (id, event_id, recipient_type, recipient_id, channel, template,
                                                  template_version, locale, title, body, data, state, next_attempt_at,
                                                  deadline, created_at)
                        values (:id, :event, 'ORDER_CONTACT', :order, 'SMS', :template, 1, :locale, '', :body,
                                cast(:data as jsonb), 'PENDING', :now, :deadline, :now)
                        on conflict (event_id, recipient_id, channel) do nothing""")
                .param("id", UUID.randomUUID()).param("event", message.eventId()).param("order", n.orderId())
                .param("template", template).param("locale", language).param("body", text)
                .param("data", json.writeValueAsString(Map.of("order_id", n.orderId().toString(),
                        "event_type", message.type())))
                .param("now", now).param("deadline", from.plus(DEADLINE)).update();
    }

    /** Short enough for one SMS where it can be; the plate is what the caller looks for in the street. */
    static String text(String template, String language, Orders.CallerNotice n, String service) {
        boolean pl = "pl".equals(language);
        String car = n.vehicle() == null ? "" : String.join(" ", nonBlank(n.vehicle().color()),
                nonBlank(n.vehicle().make()), nonBlank(n.vehicle().model())).strip().replaceAll(" +", " ");
        String plate = n.vehicle() == null ? "" : nonBlank(n.vehicle().registrationNumber());
        String driver = nonBlank(n.driverName());
        return switch (template) {
            case "caller.driver-assigned" -> pl
                    ? "Jedzie do Ciebie " + car + ", " + plate + (driver.isEmpty() ? "" : ", kierowca " + driver)
                            + ". " + service
                    : "До вас їде " + car + ", " + plate + (driver.isEmpty() ? "" : ", водій " + driver) + ". "
                            + service;
            case "caller.driver-arrived" -> pl
                    ? "Samochód " + plate + " czeka na Ciebie. " + service
                    : "Авто " + plate + " чекає на вас. " + service;
            default -> pl
                    ? "Niestety nie ma wolnego samochodu. Zadzwoń ponownie. " + service
                    : "На жаль, вільних авто немає. Зателефонуйте ще раз. " + service;
        };
    }

    private static String nonBlank(String value) {
        return value == null ? "" : value.strip();
    }
}
