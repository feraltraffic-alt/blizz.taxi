package taxi.blizz.geocoding.internal;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.geocoding.Geocoding.Place;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/**
 * Google Geocoding API (maps.googleapis.com/maps/api/geocode/json): {@code address=} biased to a box around the
 * rider, {@code latlng=} for the reverse. {@code status} OK or ZERO_RESULTS is an answer; anything else (a denied key,
 * the quota) is a failure. Google's terms bind how its results may be shown; see ADR 0012.
 */
class GoogleGeocoder implements GeocoderProvider {

    static final String API = "https://maps.googleapis.com/maps/api/geocode/json";
    /** About 30 km around the rider: a bias, not a filter. */
    private static final double BOX_DEGREES = 0.3;

    private final Transport transport;
    private final JsonMapper json;
    private final String key;

    GoogleGeocoder(Transport transport, JsonMapper json, String key) {
        this.transport = transport;
        this.json = json;
        this.key = key;
    }

    @Override
    public String name() {
        return "GOOGLE";
    }

    @Override
    public List<Place> search(String query, String language, GeoPoint near, int limit) {
        String bounds = (near.lat() - BOX_DEGREES) + "," + (near.lon() - BOX_DEGREES) + "|"
                + (near.lat() + BOX_DEGREES) + "," + (near.lon() + BOX_DEGREES);
        List<Place> places = results(API + "?address=" + enc(query) + "&bounds=" + enc(bounds) + language(language));
        return places.size() > limit ? places.subList(0, limit) : places;
    }

    @Override
    public Optional<Place> reverse(GeoPoint point, String language) {
        return results(API + "?latlng=" + point.lat() + "," + point.lon() + language(language)).stream().findFirst();
    }

    private List<Place> results(String url) {
        JsonNode root;
        try {
            root = json.readTree(transport.get(URI.create(url + "&key=" + enc(key))));
        } catch (Exception e) {
            throw new ProviderException("Google did not answer: " + e.getClass().getSimpleName(), e);
        }
        String status = root.path("status").asString();
        if ("ZERO_RESULTS".equals(status)) {
            return List.of();
        }
        if (!"OK".equals(status)) {
            // Never the key: the message names the status only.
            throw new ProviderException("Google answered " + status);
        }
        List<Place> places = new ArrayList<>();
        for (JsonNode result : root.path("results")) {
            JsonNode location = result.path("geometry").path("location");
            if (!location.path("lat").isNumber() || !location.path("lng").isNumber()) {
                continue;
            }
            String street = "";
            String house = "";
            for (JsonNode component : result.path("address_components")) {
                List<String> types = new ArrayList<>();
                component.path("types").forEach(t -> types.add(t.asString()));
                if (types.contains("route")) {
                    street = component.path("long_name").asString();
                } else if (types.contains("street_number")) {
                    house = component.path("long_name").asString();
                }
            }
            places.add(new Place(name(), null, result.path("formatted_address").asString(), street, house,
                    new GeoPoint(location.path("lat").doubleValue(), location.path("lng").doubleValue()), null));
        }
        return places;
    }

    private static String language(String language) {
        return language == null || language.isBlank() ? "" : "&language=" + enc(language.toLowerCase(Locale.ROOT));
    }

    private static String enc(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }
}
