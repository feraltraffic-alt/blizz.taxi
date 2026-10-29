package taxi.blizz.geocoding.internal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import taxi.blizz.platform.ProviderBreakers;

/**
 * GET with a short timeout: a slow geocoder must not hold the address field of the app. Behind the GEOCODING breaker
 * (REQ-ENG-07): while it is open nothing is sent and the geocoder fails at once, so the search answers from the
 * built-in and own addresses as on any provider error.
 */
class HttpTransport implements GeocoderProvider.Transport {

    private final HttpClient http;
    private final Duration timeout;
    private final ProviderBreakers breakers;

    HttpTransport(Duration timeout) {
        this(timeout, ProviderBreakers.none());
    }

    HttpTransport(Duration timeout, ProviderBreakers breakers) {
        this.timeout = timeout;
        this.breakers = breakers;
        this.http = HttpClient.newBuilder().connectTimeout(timeout).build();
    }

    @Override
    public String get(URI uri) throws Exception {
        Exception[] error = new Exception[1];
        String body = breakers.call(ProviderBreakers.Provider.GEOCODING, () -> fetch(uri), b -> false,
                e -> {
                    error[0] = e;
                    return null;
                },
                () -> {
                    error[0] = new IllegalStateException("The geocoder is unavailable (breaker open)");
                    return null;
                });
        if (error[0] != null) {
            throw error[0];
        }
        return body;
    }

    private String fetch(URI uri) throws Exception {
        HttpResponse<String> response = http.send(HttpRequest.newBuilder(uri).timeout(timeout)
                .header("Accept", "application/json").GET().build(), HttpResponse.BodyHandlers.ofString(
                StandardCharsets.UTF_8));
        if (response.statusCode() / 100 != 2) {
            throw new IllegalStateException("HTTP " + response.statusCode());
        }
        return response.body();
    }
}
