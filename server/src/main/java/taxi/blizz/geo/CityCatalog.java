package taxi.blizz.geo;

import java.util.List;

/** The cities in service, for the apps' start-up data (GET /api/config/v1/bootstrap). */
public interface CityCatalog {

    /** Published cities, by name. */
    List<City> published();
}
