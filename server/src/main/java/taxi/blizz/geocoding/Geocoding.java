package taxi.blizz.geocoding;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.geo.GeoPoint;

/**
 * Address search for the apps and the call centre (ADR 0012, Q-08). The service's own addresses (the address book of
 * {@code geo}) always come first; with GOOGLE or VISICOM chosen in the admin panel the provider's results follow. A
 * provider's result is never stored: the order keeps the label and the point it was made with, nothing else. A
 * provider that fails or is not configured leaves the own addresses only.
 */
public interface Geocoding {

    /**
     * One result. {@code source}: OWN (then {@code addressId}), or the provider (GOOGLE, VISICOM, FAKE).
     * {@code street} and {@code house} may be empty when the provider does not split the address.
     */
    record Place(String source, UUID addressId, String label, String street, String house, GeoPoint point,
                 String instructions) {
    }

    /** The provider in force: BUILT_IN, GOOGLE, VISICOM (FAKE in tests and the sandbox). */
    String provider();

    /**
     * Up to {@code limit} (at most 20) places of the city for {@code query}, ranked by closeness to {@code near};
     * {@code requesterId} — whose budget of provider calls is spent.
     */
    List<Place> search(UUID requesterId, UUID cityId, String query, String language, GeoPoint near, int limit);

    /** The address at a point: an own one within 100 m, else the provider's nearest. */
    Optional<Place> reverse(UUID requesterId, UUID cityId, GeoPoint point, String language);
}
