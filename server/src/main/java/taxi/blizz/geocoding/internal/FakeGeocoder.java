package taxi.blizz.geocoding.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.geocoding.Geocoding.Place;

/**
 * A stand-in provider for tests and the sandbox ({@code blizz.geocoding.provider=FAKE} in the environment only; the
 * admin panel never offers it). "&lt;query&gt;, N" a few hundred metres north of the rider; "Fake street 1" at any
 * point. A query containing "fail" fails like a provider that is down.
 */
class FakeGeocoder implements GeocoderProvider {

    @Override
    public String name() {
        return "FAKE";
    }

    @Override
    public List<Place> search(String query, String language, GeoPoint near, int limit) {
        if (query.contains("fail")) {
            throw new ProviderException("The fake provider fails on request");
        }
        List<Place> places = new ArrayList<>();
        for (int i = 1; i <= Math.min(limit, 3); i++) {
            places.add(new Place(name(), null, query + ", " + i, query, Integer.toString(i),
                    new GeoPoint(near.lat() + i * 0.003, near.lon()), null));
        }
        return places;
    }

    @Override
    public Optional<Place> reverse(GeoPoint point, String language) {
        return Optional.of(new Place(name(), null, "Fake street 1", "Fake street", "1", point, null));
    }
}
