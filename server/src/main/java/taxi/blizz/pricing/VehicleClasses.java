package taxi.blizz.pricing;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Vehicle classes a city offers (REQ-PRC-01). Orders and driver approvals use the class
 * {@code code}; tariffs and quotes use its id — this is the mapping between the two.
 */
public interface VehicleClasses {

    record VehicleClass(UUID id, UUID cityId, String code, String name) {
    }

    /** The active class with this code in the city. */
    Optional<VehicleClass> active(UUID cityId, String code);

    /** Active classes of the city that have a tariff in force now, in code order: what a rider can order. */
    List<VehicleClass> orderable(UUID cityId);
}
