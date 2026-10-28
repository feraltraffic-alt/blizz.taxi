package taxi.blizz.identity.internal;

import java.time.OffsetDateTime;
import java.util.List;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.PersonalData;

/** The rider's account and the app sessions it was used in, for the copy of their data (REQ-PRV-07). */
@Component
class ProfilePersonalData implements PersonalData {

    private final JdbcClient jdbc;

    ProfilePersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Session(String app, String deviceRef, OffsetDateTime createdAt, OffsetDateTime lastUsedAt,
                   OffsetDateTime expiresAt, OffsetDateTime endedAt, String endReason) {
    }

    record Profile(String phone, OffsetDateTime phoneVerifiedAt, String name, String language, String accountState,
                   boolean hasApp, OffsetDateTime createdAt, OffsetDateTime deletionRequestedAt,
                   List<Session> sessions) {
    }

    @Override
    public String section() {
        return "profile";
    }

    @Override
    public Object of(Subject subject) {
        List<Session> sessions = jdbc.sql("""
                        select audience, device_ref, created_at, last_refreshed_at, expires_at, revoked_at,
                               revoke_reason
                        from device_session where subject_type = 'CLIENT' and subject_id = :id
                        order by created_at, id""")
                .param("id", subject.clientId())
                .query((rs, i) -> new Session(rs.getString("audience"), rs.getString("device_ref"),
                        rs.getObject("created_at", OffsetDateTime.class),
                        rs.getObject("last_refreshed_at", OffsetDateTime.class),
                        rs.getObject("expires_at", OffsetDateTime.class),
                        rs.getObject("revoked_at", OffsetDateTime.class), rs.getString("revoke_reason")))
                .list();
        return jdbc.sql("""
                        select phone_normalized, phone_verified_at, name, language, account_state, has_app,
                               created_at, deletion_requested_at
                        from client where id = :id""")
                .param("id", subject.clientId())
                .query((rs, i) -> new Profile(rs.getString("phone_normalized"),
                        rs.getObject("phone_verified_at", OffsetDateTime.class), rs.getString("name"),
                        rs.getString("language"), rs.getString("account_state"), rs.getBoolean("has_app"),
                        rs.getObject("created_at", OffsetDateTime.class),
                        rs.getObject("deletion_requested_at", OffsetDateTime.class), sessions))
                .single();
    }
}
