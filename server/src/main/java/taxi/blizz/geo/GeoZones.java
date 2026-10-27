package taxi.blizz.geo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Published zones for pricing (owner decision 27.10.2026). A zone of type {@link #CITY_LIMITS} marks where
 * "in the city" ends inside the service area: outside it the out-of-city pickup and per-km rates apply.
 * A city without a published CITY_LIMITS zone is all "in the city".
 */
public interface GeoZones {

    String CITY_LIMITS = "CITY_LIMITS";

    record ZoneRef(UUID id, UUID cityId, String type, String state) {
    }

    Optional<ZoneRef> zone(UUID zoneId);

    /** Published zones containing the point, CITY_LIMITS excluded. */
    List<UUID> zonesAt(UUID cityId, GeoPoint point);

    boolean insideCityLimits(UUID cityId, GeoPoint point);

    /** Geodesic length of the straight segment a→b inside and outside the city limits, in metres. */
    record Split(long insideMetres, long outsideMetres) {
    }

    Split splitByCityLimits(UUID cityId, GeoPoint a, GeoPoint b);
}
