package taxi.blizz.driver;

import java.util.UUID;

/**
 * Whether a risk flag is about a driver, for a suspension that names the flag that caused it (issue #71). The flags
 * live in operations, which implements this; admission only keeps the link.
 */
public interface DriverRiskFlagCheck {

    boolean concerns(UUID flagId, UUID driverId);
}
