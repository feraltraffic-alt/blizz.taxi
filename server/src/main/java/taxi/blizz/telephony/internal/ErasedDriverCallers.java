package taxi.blizz.telephony.internal;

import java.time.Clock;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.identity.DriverErasing;

/** A deleted driver's phone in the call log and the code deliveries (issue #144), as {@link ErasedCallers}. */
@Component
class ErasedDriverCallers implements DriverErasing {

    private final JdbcClient jdbc;
    private final Clock clock;

    ErasedDriverCallers(JdbcClient jdbc, Clock clock) {
        this.jdbc = jdbc;
        this.clock = clock;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void erasing(UUID driverId, String phone) {
        ErasedCallers.erase(jdbc, clock, phone, "DRIVER");
    }
}
