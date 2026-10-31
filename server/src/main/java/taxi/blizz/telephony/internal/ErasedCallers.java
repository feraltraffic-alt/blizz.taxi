package taxi.blizz.telephony.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.identity.ClientErasing;

/**
 * A deleted rider's phone in the call log and the code deliveries (issue #144, REQ-PRV-04): the caller's number is
 * cleared from their calls, each recording is queued for deletion from Asterisk and storage whatever the retention
 * term, and the deliveries of their sign-in codes are deleted. The calls themselves stay, without a number.
 */
@Component
class ErasedCallers implements ClientErasing {

    private final JdbcClient jdbc;
    private final Clock clock;

    ErasedCallers(JdbcClient jdbc, Clock clock) {
        this.jdbc = jdbc;
        this.clock = clock;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void erasing(UUID clientId, String phone) {
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        jdbc.sql("""
                        update call_recording set erase_requested_at = :now
                        where erase_requested_at is null
                          and call_id in (select id from call where caller_phone = :phone)""")
                .param("now", now).param("phone", phone).update();
        jdbc.sql("""
                        update call set caller_phone = null, caller_raw = null, version = version + 1
                        where caller_phone = :phone""")
                .param("phone", phone).update();
        jdbc.sql("delete from otp_delivery where audience = 'CLIENT' and phone = :phone").param("phone", phone)
                .update();
    }
}
