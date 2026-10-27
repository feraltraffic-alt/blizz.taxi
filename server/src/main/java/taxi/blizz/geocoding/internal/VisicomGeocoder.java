package taxi.blizz.geocoding.internal;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.geocoding.Geocoding.Place;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/**
 * Visicom Data API 5.0 (api.visicom.ua/data-api/5.0/{uk|ru|en}/geocode.json): {@code text=} ranked by
 * {@code near=lng,lat}, the reverse with {@code categories=adr_address&near=lng,lat&r=50&l=1} as in Visicom's
 * documentation. The answer is GeoJSON — a FeatureCollection or a single Feature — with {@code geo_centroid}
 * coordinates {@code [lng, lat]}; the label is read defensively from {@code properties} (street, house number,
 * settlement, else name), since the property set depends on the object's category.
 */
class VisicomGeocoder implements GeocoderProvider {

    static final String API = "https://api.visicom.ua/data-api/5.0/";

    private final Transport transport;
    private final JsonMapper json;
    private final String key;

    VisicomGeocoder(Transport transport, JsonMapper json, String key) {
        this.transport = transport;
        this.json = json;
        this.key = key;
    }

    @Override
    public String name() {
        return "VISICOM";
    }

    @Override
    public List<Place> search(String query, String language, GeoPoint near, int limit) {
        return features(lang(language) + "/geocode.json?text=" + enc(query) + "&near=" + near.lon() + "," + near.lat()
                + "&l=" + Math.max(1, Math.min(limit, 50)));
    }

    @Override
    public Optional<Place> reverse(GeoPoint point, String language) {
        return features(lang(language) + "/geocode.json?categories=adr_address&near=" + point.lon() + ","
                + point.lat() + "&r=50&l=1").stream().findFirst();
    }

    private List<Place> features(String path) {
        JsonNode root;
        try {
            root = json.readTree(transport.get(URI.create(API + path + "&key=" + enc(key))));
        } catch (Exception e) {
            throw new ProviderException("Visicom did not answer: " + e.getClass().getSimpleName(), e);
        }
        List<JsonNode> features = new ArrayList<>();
        if ("FeatureCollection".equals(root.path("type").asString())) {
            root.path("features").forEach(features::add);
        } else if ("Feature".equals(root.path("type").asString())) {
            features.add(root);
        } else if (root.isObject() && root.size() == 0) {
            return List.of(); // nothing found
        } else {
            throw new ProviderException("Visicom answered something else than GeoJSON");
        }
        List<Place> places = new ArrayList<>();
        for (JsonNode feature : features) {
            JsonNode coordinates = feature.path("geo_centroid").path("coordinates");
            if (!coordinates.path(0).isNumber() || !coordinates.path(1).isNumber()) {
                continue;
            }
            JsonNode p = feature.path("properties");
            String street = join(text(p, "street_type"), text(p, "street"));
            boolean address = "adr_address".equals(text(p, "categories"));
            String house = address ? text(p, "name") : "";
            String head = !street.isEmpty() ? join(street, house) : text(p, "name");
            String settlement = text(p, "settlement");
            String label = settlement.isEmpty() || settlement.equals(head) ? head
                    : head.isEmpty() ? settlement : head + ", " + settlement;
            if (label.isEmpty()) {
                continue;
            }
            places.add(new Place(name(), null, label, street, house,
                    new GeoPoint(coordinates.path(1).doubleValue(), coordinates.path(0).doubleValue()), null));
        }
        return places;
    }

    /** Visicom speaks uk, ru and en; Polish riders get English names. */
    private static String lang(String language) {
        return language != null && (language.equals("uk") || language.equals("ru") || language.equals("en"))
                ? language : language != null && language.equals("pl") ? "en" : "uk";
    }

    private static String text(JsonNode node, String field) {
        JsonNode value = node.path(field);
        return value.isString() ? value.asString().strip() : "";
    }

    private static String join(String a, String b) {
        return a.isEmpty() ? b : b.isEmpty() ? a : a + " " + b;
    }

    private static String enc(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }
}
