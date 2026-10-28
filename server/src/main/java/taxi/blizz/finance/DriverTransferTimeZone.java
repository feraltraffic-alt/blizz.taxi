package taxi.blizz.finance;

import java.time.ZoneId;
import java.util.Optional;
import java.util.UUID;

/** Implemented by the work-session owner: the driver's current or last city's time zone, also while offline. */
public interface DriverTransferTimeZone {

    Optional<ZoneId> zone(UUID driverId);
}
