package taxi.blizz.operations.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.operations.DriverRiskFlags;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code DriverDocumentDuplicated} from driver becomes a DUPLICATE_DOCUMENT flag on the driver who added the document
 * (issue #105, threat model D2): at most one per pair of drivers, whoever re-uploads later. Of no city: an applicant
 * has none. It blocks nothing; a person decides (REQ-SEC-11).
 */
@Component
class DuplicateDocumentFlags implements OutboxHandler {

    private final JdbcDriverRiskFlags flags;
    private final JsonMapper json;
    private final Clock clock;

    DuplicateDocumentFlags(JdbcDriverRiskFlags flags, JsonMapper json, Clock clock) {
        this.flags = flags;
        this.json = json;
        this.clock = clock;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Duplicated(UUID driverId, UUID documentId, UUID otherDriverId, UUID otherDocumentId) {
    }

    @Override
    public String consumerId() {
        return "operations.duplicate-document-flags";
    }

    @Override
    public boolean supports(String eventType) {
        return "DriverDocumentDuplicated".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Duplicated event = json.readValue(message.payload(), Duplicated.class);
        String first = event.driverId().compareTo(event.otherDriverId()) < 0 ? event.driverId().toString()
                : event.otherDriverId().toString();
        String second = first.equals(event.driverId().toString()) ? event.otherDriverId().toString()
                : event.driverId().toString();
        Map<String, Object> evidence = new LinkedHashMap<>();
        evidence.put("document_id", event.documentId().toString());
        evidence.put("other_driver_id", event.otherDriverId().toString());
        evidence.put("other_document_id", event.otherDocumentId().toString());
        flags.raiseAutomatic(event.driverId(), null, DriverRiskFlags.Kind.DUPLICATE_DOCUMENT, evidence,
                "DUPLICATE_DOCUMENT:" + first + ":" + second,
                OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC));
    }
}
