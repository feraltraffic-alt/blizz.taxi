package taxi.blizz.geocoding.internal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

/** GET with a short timeout: a slow geocoder must not hold the address field of the app. */
class HttpTransport implements GeocoderProvider.Transport {

    private final HttpClient http;
    private final Duration timeout;

    HttpTransport(Duration timeout) {
        this.timeout = timeout;
        this.http = HttpClient.newBuilder().connectTimeout(timeout).build();
    }

    @Override
    public String get(URI uri) throws Exception {
        HttpResponse<String> response = http.send(HttpRequest.newBuilder(uri).timeout(timeout)
                .header("Accept", "application/json").GET().build(), HttpResponse.BodyHandlers.ofString(
                StandardCharsets.UTF_8));
        if (response.statusCode() / 100 != 2) {
            throw new IllegalStateException("HTTP " + response.statusCode());
        }
        return response.body();
    }
}
