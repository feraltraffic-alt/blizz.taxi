package taxi.blizz.geocoding.internal;

import java.util.List;
import java.util.Optional;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.geocoding.Geocoding.Place;

/** One external geocoder. Throws {@link ProviderException} when the provider fails; the caller falls back. */
interface GeocoderProvider {

    String name();

    List<Place> search(String query, String language, GeoPoint near, int limit);

    Optional<Place> reverse(GeoPoint point, String language);

    final class ProviderException extends RuntimeException {
        ProviderException(String message) {
            super(message);
        }

        ProviderException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    /** One GET; returns the body; throws on a network failure or a non-2xx status. */
    interface Transport {
        String get(java.net.URI uri) throws Exception;
    }
}
