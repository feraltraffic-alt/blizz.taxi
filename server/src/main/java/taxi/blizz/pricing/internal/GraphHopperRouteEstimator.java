package taxi.blizz.pricing.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.pricing.RouteEstimator;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/**
 * The road route from GraphHopper's /route API: distance in metres and time in milliseconds of the first path. When
 * GraphHopper does not answer in time, answers with an error or finds no route (a point off the road network), the
 * quote still gets a price from the straight-line estimate, and the fallback is logged.
 */
class GraphHopperRouteEstimator implements RouteEstimator {

    private static final Logger log = LoggerFactory.getLogger(GraphHopperRouteEstimator.class);

    private final GraphHopperProperties properties;
    private final RouteEstimator fallback;
    private final HttpClient http;
    private final JsonMapper json;

    GraphHopperRouteEstimator(GraphHopperProperties properties, RouteEstimator fallback, JsonMapper json) {
        this.properties = properties;
        this.fallback = fallback;
        this.json = json;
        this.http = HttpClient.newBuilder().connectTimeout(properties.timeout()).build();
    }

    @Override
    public Estimate estimate(GeoPoint pickup, GeoPoint dropOff) {
        try {
            HttpResponse<String> response = http.send(HttpRequest.newBuilder(uri(pickup, dropOff))
                    .timeout(properties.timeout()).header("Accept", "application/json").GET().build(),
                    HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            if (response.statusCode() != 200) {
                log.warn("GraphHopper answered {}; using the straight-line estimate: {}", response.statusCode(),
                        abbreviate(response.body()));
                return fallback.estimate(pickup, dropOff);
            }
            JsonNode path = json.readTree(response.body()).path("paths").path(0);
            if (path.isMissingNode() || !path.path("distance").isNumber() || !path.path("time").isNumber()) {
                log.warn("GraphHopper found no route; using the straight-line estimate");
                return fallback.estimate(pickup, dropOff);
            }
            long metres = path.path("distance").decimalValue().setScale(0, RoundingMode.HALF_UP).longValueExact();
            long seconds = BigDecimal.valueOf(path.path("time").longValue())
                    .divide(BigDecimal.valueOf(1000), 0, RoundingMode.HALF_UP).longValueExact();
            return new Estimate(metres, seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return fallback.estimate(pickup, dropOff);
        } catch (Exception e) {
            log.warn("GraphHopper is unavailable ({}); using the straight-line estimate", e.toString());
            return fallback.estimate(pickup, dropOff);
        }
    }

    /** Asks /info ("check the connection"): reachable, the key accepted, the profile known. Never shows the key. */
    taxi.blizz.configuration.Integrations.Check check() {
        String group = taxi.blizz.configuration.Integrations.ROUTING;
        StringBuilder url = new StringBuilder(properties.baseUrl().replaceAll("/+$", "")).append("/info");
        if (properties.apiKey() != null && !properties.apiKey().isBlank()) {
            url.append("?key=").append(encode(properties.apiKey()));
        }
        try {
            HttpResponse<String> response = http.send(HttpRequest.newBuilder(URI.create(url.toString()))
                    .timeout(properties.timeout()).header("Accept", "application/json").GET().build(),
                    HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            if (response.statusCode() == 401 || response.statusCode() == 403) {
                return new taxi.blizz.configuration.Integrations.Check(group, false,
                        "GraphHopper refused the key (" + response.statusCode() + ")");
            }
            if (response.statusCode() != 200) {
                return new taxi.blizz.configuration.Integrations.Check(group, false,
                        "GraphHopper answered " + response.statusCode());
            }
            JsonNode profiles = json.readTree(response.body()).path("profiles");
            boolean known = false;
            for (JsonNode profile : profiles) {
                known |= properties.profile().equals(profile.path("name").asString());
            }
            return known || profiles.isMissingNode() || profiles.isEmpty()
                    ? new taxi.blizz.configuration.Integrations.Check(group, true,
                            "GraphHopper answered; profile " + properties.profile())
                    : new taxi.blizz.configuration.Integrations.Check(group, false,
                            "GraphHopper has no profile " + properties.profile());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new taxi.blizz.configuration.Integrations.Check(group, false, "Interrupted");
        } catch (Exception e) {
            return new taxi.blizz.configuration.Integrations.Check(group, false,
                    "GraphHopper is unreachable: " + e.getClass().getSimpleName());
        }
    }

    URI uri(GeoPoint pickup, GeoPoint dropOff) {
        StringBuilder query = new StringBuilder(properties.baseUrl().replaceAll("/+$", "")).append("/route?")
                .append("point=").append(point(pickup))
                .append("&point=").append(point(dropOff))
                .append("&profile=").append(encode(properties.profile()))
                .append("&calc_points=false&instructions=false");
        if (properties.apiKey() != null && !properties.apiKey().isBlank()) {
            query.append("&key=").append(encode(properties.apiKey()));
        }
        return URI.create(query.toString());
    }

    private static String point(GeoPoint p) {
        return encode(BigDecimal.valueOf(p.lat()).toPlainString() + "," + BigDecimal.valueOf(p.lon()).toPlainString());
    }

    private static String encode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    private static String abbreviate(String body) {
        return body == null ? "" : body.length() > 200 ? body.substring(0, 200) + "…" : body;
    }
}
