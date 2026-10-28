package taxi.blizz.geo;

import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/** The cities in service, for the apps' start-up data (GET /api/config/v1/bootstrap). */
public interface CityCatalog {

    /** Published cities, by name. */
    List<City> published();

    /** The time zone also remains available for historical sessions in an archived city. */
    Optional<ZoneId> timezone(UUID cityId);
}
