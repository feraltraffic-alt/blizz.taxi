package taxi.blizz.identity;

import java.util.Set;
import java.util.UUID;

/**
 * The cities a driver is admitted in, for {@link StaffAccess#requireForDriver}. Implemented by the driver module, which
 * owns the admission (ADR 0004); declared here so the access check needs no dependency on it.
 */
public interface DriverCities {

    /** Empty for an applicant not admitted anywhere yet, and for an unknown driver. */
    Set<UUID> of(UUID driverId);
}
