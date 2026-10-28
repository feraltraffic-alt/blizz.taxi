package taxi.blizz.telephony.internal;

import java.time.OffsetDateTime;
import java.util.List;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.PersonalData;

/** The one-time codes sent to the rider's number (when, how, whether they went), never the codes themselves. */
@Component
class CodeDeliveryPersonalData implements PersonalData {

    private final JdbcClient jdbc;

    CodeDeliveryPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Delivery(String channel, String provider, String state, OffsetDateTime at) {
    }

    @Override
    public String section() {
        return "codes_sent";
    }

    @Override
    public Object of(Subject subject) {
        if (subject.phone() == null) {
            return List.of();
        }
        return jdbc.sql("""
                        select channel, provider, state, attempted_at from otp_delivery
                        where phone = :phone and audience = 'CLIENT' order by attempted_at, id""")
                .param("phone", subject.phone())
                .query((rs, i) -> new Delivery(rs.getString("channel"), rs.getString("provider"), rs.getString("state"),
                        rs.getObject("attempted_at", OffsetDateTime.class)))
                .list();
    }
}
