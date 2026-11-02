package taxi.blizz.geo;

import java.util.Optional;

public interface CityResolver {
    /**
     * The published city of the taxi service {@code serviceId} (ADR 0016) that covers the point. Boundaries
     * included; the highest explicit priority wins. Another service's cities never answer, whatever they cover.
     */
    Optional<City> resolve(java.util.UUID serviceId, GeoPoint point);
}
