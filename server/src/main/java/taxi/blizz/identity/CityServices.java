package taxi.blizz.identity;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * Which taxi service a city belongs to (ADR 0016), for {@link StaffAccess}: implemented by the geo module, which owns
 * the cities (ADR 0004), and declared here so the access check needs no dependency on it.
 */
public interface CityServices {

    /** The service of each existing city among {@code cityIds}; an unknown id is absent. */
    Map<UUID, UUID> servicesOf(Collection<UUID> cityIds);

    /** Every city of the service, in any state. */
    Set<UUID> citiesOf(UUID serviceId);
}
