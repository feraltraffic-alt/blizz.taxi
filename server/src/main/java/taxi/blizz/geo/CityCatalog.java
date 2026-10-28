package taxi.blizz.geo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/** The cities in service, for the apps' start-up data (GET /api/config/v1/bootstrap). */
public interface CityCatalog {

    /** Published cities, by name. */
    List<City> published();

    /** Time zone of a city in any state, or empty if the city does not exist. */
    Optional<String> timezone(UUID cityId);
}
