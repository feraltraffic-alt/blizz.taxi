package taxi.blizz.geo;

import java.util.Optional;

public interface CityResolver {
    /** Includes polygon boundaries, highest explicit priority wins. Draft/archived cities are excluded. */
    Optional<City> resolve(GeoPoint point);
}
