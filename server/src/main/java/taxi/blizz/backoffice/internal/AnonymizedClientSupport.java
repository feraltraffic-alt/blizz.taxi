package taxi.blizz.backoffice.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.files.FileService;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code ClientAnonymized} (issue #144, REQ-PRV-04): the rider's support cases keep their number, category, order,
 * states and times, but the subject, the resolution and every message in them become "[deleted]" — staff replies and
 * notes in a rider's case are about that rider too — and their attached files lose their names and are deleted from
 * storage (the row stays, append-only, as the record that a file was there). A deletion
 * waits for open cases to be resolved, so nothing is being worked on. A repeat changes nothing.
 */
@Component
class AnonymizedClientSupport implements OutboxHandler {

    static final String DELETED = "[deleted]";

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final FileService files;

    AnonymizedClientSupport(JdbcClient jdbc, JsonMapper json, FileService files) {
        this.jdbc = jdbc;
        this.json = json;
        this.files = files;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID clientId) {
    }

    @Override
    public String consumerId() {
        return "backoffice.anonymized-clients";
    }

    @Override
    public boolean supports(String eventType) {
        return "ClientAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        erase(jdbc, files, "CLIENT", json.readValue(message.payload(), Payload.class).clientId());
    }

    /** The cases a deleted rider or driver ({@code requesterType} CLIENT or DRIVER) opened, as described above. */
    static void erase(JdbcClient jdbc, FileService files, String requesterType, UUID requester) {
        List<UUID> cases = jdbc.sql("""
                        select id from support_case where requester_type = :type and requester_id = :requester""")
                .param("type", requesterType).param("requester", requester).query(UUID.class).list();
        if (cases.isEmpty()) {
            return;
        }
        List<UUID> attached = jdbc.sql("""
                        select a.file_id from support_message_attachment a join support_message m on m.id = a.message_id
                        where m.case_id in (:cases)""")
                .param("cases", cases).query(UUID.class).list();
        files.requestErasure(attached);
        jdbc.sql("""
                        update support_message_attachment set name = null
                        where name is not null
                          and message_id in (select id from support_message where case_id in (:cases))""")
                .param("cases", cases).update();
        jdbc.sql("update support_message set body = :deleted where case_id in (:cases) and body <> :deleted")
                .param("deleted", DELETED).param("cases", cases).update();
        jdbc.sql("""
                        update support_case
                        set subject = :deleted, resolution = case when resolution is null then null else :deleted end,
                            version = version + 1
                        where id in (:cases)
                          and (subject <> :deleted or coalesce(resolution, :deleted) <> :deleted)""")
                .param("deleted", DELETED).param("cases", cases).update();
    }
}
