package taxi.blizz.telephony.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.PersonalData;

/**
 * The rider's calls to the call centre from the account's current number, for the copy of their data
 * (REQ-PRV-07): when, how they went and whether a recording is kept. The recordings themselves are not copied (they
 * are listened to on request, ADR 0012 Q-18) and the operators are not named.
 */
@Component
class CallPersonalData implements PersonalData {

    private final JdbcClient jdbc;

    CallPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Call(String calledNumber, String state, OffsetDateTime startedAt, OffsetDateTime answeredAt,
                OffsetDateTime endedAt, boolean recorded, List<UUID> orderIds) {
    }

    @Override
    public String section() {
        return "calls";
    }

    @Override
    public Object of(Subject subject) {
        if (subject.phone() == null) {
            return List.of();
        }
        return jdbc.sql("""
                        select c.called_number, c.state, c.started_at, c.answered_at, c.ended_at,
                               exists (select 1 from call_recording r
                                       where r.call_id = c.id and r.state = 'STORED') as recorded,
                               coalesce((select array_agg(o.order_id order by o.linked_at, o.order_id)
                                         from call_order o where o.call_id = c.id), '{}') as order_ids
                        from call c where c.caller_phone = :phone
                        order by c.started_at, c.id""")
                .param("phone", subject.phone())
                .query((rs, i) -> new Call(rs.getString("called_number"), rs.getString("state"),
                        rs.getObject("started_at", OffsetDateTime.class),
                        rs.getObject("answered_at", OffsetDateTime.class),
                        rs.getObject("ended_at", OffsetDateTime.class), rs.getBoolean("recorded"),
                        List.of((UUID[]) rs.getArray("order_ids").getArray())))
                .list();
    }
}
