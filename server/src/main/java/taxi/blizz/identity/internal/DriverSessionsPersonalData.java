package taxi.blizz.identity.internal;

import java.time.OffsetDateTime;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DriverPersonalData;

/** The driver's sign-in sessions for the copy of their data (issue #144): devices and when; never a token. */
@Component
class DriverSessionsPersonalData implements DriverPersonalData {

    private final JdbcClient jdbc;

    DriverSessionsPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Session(String audience, String device, OffsetDateTime createdAt, OffsetDateTime lastRefreshedAt,
                   OffsetDateTime expiresAt, OffsetDateTime revokedAt, String revokeReason) {
    }

    @Override
    public String section() {
        return "sessions";
    }

    @Override
    public Object of(Subject subject) {
        return jdbc.sql("""
                        select audience, device_ref, created_at, last_refreshed_at, expires_at, revoked_at,
                               revoke_reason
                        from device_session where subject_type = 'DRIVER' and subject_id = :id
                        order by created_at, id""")
                .param("id", subject.driverId())
                .query((rs, i) -> new Session(rs.getString(1), rs.getString(2), rs.getObject(3, OffsetDateTime.class),
                        rs.getObject(4, OffsetDateTime.class), rs.getObject(5, OffsetDateTime.class),
                        rs.getObject(6, OffsetDateTime.class), rs.getString(7)))
                .list();
    }
}
