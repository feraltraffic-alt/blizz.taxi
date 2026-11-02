package taxi.blizz.notification.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/**
 * Turns {@code DriverDocumentExpiring} into a push to the driver (issue #51): the document type and its last day in
 * the driver's language, nothing else. One notification per event — a repeated event adds nothing. A reminder older
 * than a day is not worth sending; the next threshold brings a new one.
 */
@Component
class DriverDocumentFeed implements OutboxHandler {

    static final String TEMPLATE = "driver.document-expiring";
    static final Duration DEADLINE = Duration.ofDays(1);

    private final AccountDirectory accounts;
    private final ServiceSettings settings;
    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;

    DriverDocumentFeed(AccountDirectory accounts, ServiceSettings settings, JdbcClient jdbc, JsonMapper json,
                       Clock clock) {
        this.accounts = accounts;
        this.settings = settings;
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID driverId, UUID documentId, String documentType, LocalDate validTo, int daysLeft) {
    }

    @Override
    public String consumerId() {
        return "notification.driver-documents";
    }

    @Override
    public boolean supports(String eventType) {
        return "DriverDocumentExpiring".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Payload payload = json.readValue(message.payload(), Payload.class);
        Actor driver = new Actor(SubjectType.DRIVER, payload.driverId());
        String fallback = settings.of(driver).settings().languages().defaultLanguage();
        String chosen = accounts.language(driver).orElse(null);
        String language = PushTemplates.supports(chosen) ? chosen : fallback;
        PushTemplates.Text text = PushTemplates.document(
                PushTemplates.text(TEMPLATE, language, fallback).orElseThrow(), language, payload.documentType(),
                payload.validTo());
        Map<String, String> data = new LinkedHashMap<>();
        data.put("type", TEMPLATE);
        data.put("event_type", message.type());
        data.put("event_id", message.eventId().toString());
        data.put("document_id", payload.documentId().toString());
        data.put("document_type", payload.documentType());
        data.put("valid_to", payload.validTo().toString());
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        OffsetDateTime from = message.occurredAt() == null ? now
                : message.occurredAt().toInstant().atOffset(ZoneOffset.UTC);
        jdbc.sql("""
                        insert into notification (id, event_id, recipient_type, recipient_id, channel, template,
                                                  template_version, locale, title, body, data, state, next_attempt_at,
                                                  deadline, created_at)
                        values (:id, :event, 'DRIVER', :recipient, 'PUSH', :template, :version, :locale, :title, :body,
                                cast(:data as jsonb), 'PENDING', :now, :deadline, :now)
                        on conflict (event_id, recipient_id, channel) do nothing""")
                .param("id", UUID.randomUUID()).param("event", message.eventId())
                .param("recipient", payload.driverId()).param("template", TEMPLATE)
                .param("version", PushTemplates.VERSION).param("locale", language).param("title", text.title())
                .param("body", text.body()).param("data", json.writeValueAsString(data)).param("now", now)
                .param("deadline", from.plus(DEADLINE)).update();
    }
}
