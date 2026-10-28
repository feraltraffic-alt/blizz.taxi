package taxi.blizz.backoffice.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.PersonalData;

/**
 * The rider's support cases and the messages the rider sees in them, for the copy of their data (REQ-PRV-07).
 * Internal comments of staff and the names or ids of staff are left out; attachments are counted, not copied.
 */
@Component
class SupportPersonalData implements PersonalData {

    private final JdbcClient jdbc;

    SupportPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    /** {@code from}: RIDER (the rider), SUPPORT (staff) or SYSTEM. */
    record Message(String from, String body, int attachments, OffsetDateTime at) {
    }

    record Case(long number, String category, UUID orderId, String subject, String state, String resolution,
                OffsetDateTime createdAt, List<Message> messages) {
    }

    private record Row(UUID caseId, Message message) {
    }

    @Override
    public String section() {
        return "support_cases";
    }

    @Override
    public Object of(Subject subject) {
        UUID id = subject.clientId();
        Map<UUID, List<Message>> messages = jdbc.sql("""
                        select m.case_id,
                               case m.author_type when 'CLIENT' then 'RIDER' when 'STAFF' then 'SUPPORT'
                                                  else m.author_type end as author,
                               m.body, m.created_at,
                               (select count(*) from support_message_attachment a where a.message_id = m.id) as files
                        from support_message m join support_case c on c.id = m.case_id
                        where c.requester_type = 'CLIENT' and c.requester_id = :id and m.visibility = 'PUBLIC'
                        order by m.case_id, m.sequence""")
                .param("id", id)
                .query((rs, i) -> new Row(rs.getObject("case_id", UUID.class), new Message(rs.getString("author"),
                        rs.getString("body"), rs.getInt("files"), rs.getObject("created_at", OffsetDateTime.class))))
                .list().stream()
                .collect(Collectors.groupingBy(Row::caseId, Collectors.mapping(Row::message, Collectors.toList())));
        return jdbc.sql("""
                        select id, number, category, order_id, subject, state, resolution, created_at
                        from support_case where requester_type = 'CLIENT' and requester_id = :id
                        order by created_at, id""")
                .param("id", id)
                .query((rs, i) -> new Case(rs.getLong("number"), rs.getString("category"),
                        rs.getObject("order_id", UUID.class), rs.getString("subject"), rs.getString("state"),
                        rs.getString("resolution"), rs.getObject("created_at", OffsetDateTime.class),
                        messages.getOrDefault(rs.getObject("id", UUID.class), List.of())))
                .list();
    }
}
