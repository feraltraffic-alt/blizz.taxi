package taxi.blizz.notification.internal;

import java.time.OffsetDateTime;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.PersonalData;

/** The devices the rider's app registered for pushes, for the copy of their data (REQ-PRV-07); no tokens. */
@Component
class PushPersonalData implements PersonalData {

    private final JdbcClient jdbc;

    PushPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Device(String platform, String locale, String state, OffsetDateTime registeredAt,
                  OffsetDateTime updatedAt) {
    }

    @Override
    public String section() {
        return "push_devices";
    }

    @Override
    public Object of(Subject subject) {
        return jdbc.sql("""
                        select platform, locale, state, created_at, updated_at from push_device
                        where subject_type = 'CLIENT' and subject_id = :id order by created_at, id""")
                .param("id", subject.clientId())
                .query((rs, i) -> new Device(rs.getString("platform"), rs.getString("locale"), rs.getString("state"),
                        rs.getObject("created_at", OffsetDateTime.class),
                        rs.getObject("updated_at", OffsetDateTime.class)))
                .list();
    }
}
