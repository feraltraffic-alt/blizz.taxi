package taxi.blizz.telephony.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.telephony.OtpDeliveries;

@Service
class JdbcOtpDeliveries implements OtpDeliveries {

    private final JdbcClient jdbc;
    private final StaffAccess staff;

    JdbcOtpDeliveries(JdbcClient jdbc, StaffAccess staff) {
        this.jdbc = jdbc;
        this.staff = staff;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Attempt> forPhone(Actor actor, String phone, int limit) {
        staff.require(actor, VIEW_PERMISSION);
        return jdbc.sql("""
                        select id, challenge_id, phone, audience, channel, provider, state, provider_ref, error,
                               attempted_at
                        from otp_delivery where phone = :phone order by attempted_at desc, id limit :limit""")
                .param("phone", PhoneNumber.parse(phone).e164()).param("limit", Math.max(1, Math.min(limit, 100)))
                .query((rs, i) -> new Attempt(rs.getObject("id", UUID.class), rs.getObject("challenge_id", UUID.class),
                        rs.getString("phone"), rs.getString("audience"), rs.getString("channel"),
                        rs.getString("provider"), rs.getString("state"), rs.getString("provider_ref"),
                        rs.getString("error"), rs.getObject("attempted_at", OffsetDateTime.class)))
                .list();
    }
}
