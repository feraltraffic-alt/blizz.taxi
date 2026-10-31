package taxi.blizz.identity.internal;

import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.identity.DriverErasing;

/**
 * A deleted driver in identity's tables (issue #144): the sign-in and confirmation codes of the driver's phone are
 * deleted and the device references of the driver's sessions cleared. The sessions themselves are revoked by the
 * caller; the rows stay as the record of who was signed in when.
 */
@Component
class ErasedDriverSignIns implements DriverErasing {

    private final JdbcClient jdbc;

    ErasedDriverSignIns(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void erasing(UUID driverId, String phone) {
        jdbc.sql("delete from otp_challenge where audience = 'DRIVER' and phone_normalized = :phone")
                .param("phone", phone).update();
        jdbc.sql("update device_session set device_ref = null where subject_type = 'DRIVER' and subject_id = :id")
                .param("id", driverId).update();
    }
}
