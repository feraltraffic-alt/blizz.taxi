package taxi.blizz.telephony.internal;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Optional;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.Integrations;

/**
 * Asterisk's stored recordings through ARI. The dialplan of the call centre records a taken call with
 * {@code MixMonitor(/var/spool/asterisk/recording/${UNIQUEID}.wav)} — the stored-recordings directory of ARI, named
 * after the call's first channel ({@code deploy/dev/asterisk/extensions.conf}). The file is downloaded with
 * {@code GET /ari/recordings/stored/{name}/file} and removed with {@code DELETE /ari/recordings/stored/{name}} once our
 * encrypted copy is stored.
 */
@Component
class AriRecordingSource implements RecordingSource {

    private static final Pattern NAME = Pattern.compile("^[A-Za-z0-9._-]{1,128}$");

    private final Integrations integrations;
    private final HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build();

    AriRecordingSource(Integrations integrations) {
        this.integrations = integrations;
    }

    @Override
    public Optional<Path> fetch(String channelId) throws IOException {
        if (!NAME.matcher(channelId).matches()) {
            return Optional.empty();
        }
        Path file = Files.createTempFile("call-recording-", ".wav");
        boolean keep = false;
        try {
            HttpResponse<Path> response = send(request(channelId, "/file").GET()
                    .timeout(Duration.ofMinutes(5)).build(), HttpResponse.BodyHandlers.ofFile(file));
            if (response.statusCode() == 404) {
                return Optional.empty();
            }
            if (response.statusCode() != 200) {
                throw new IOException("Asterisk answered " + response.statusCode());
            }
            keep = true;
            return Optional.of(file);
        } finally {
            if (!keep) {
                Files.deleteIfExists(file);
            }
        }
    }

    @Override
    public void discard(String channelId) throws IOException {
        if (!NAME.matcher(channelId).matches()) {
            return;
        }
        HttpResponse<Void> response = send(request(channelId, "").DELETE().timeout(Duration.ofSeconds(30)).build(),
                HttpResponse.BodyHandlers.discarding());
        if (response.statusCode() != 204 && response.statusCode() != 404) {
            throw new IOException("Asterisk answered " + response.statusCode());
        }
    }

    private HttpRequest.Builder request(String channelId, String suffix) throws IOException {
        String base = AriAccess.baseUrl(integrations)
                .orElseThrow(() -> new IOException("The ARI address is not configured"));
        String authorization = AriAccess.authorization(integrations)
                .orElseThrow(() -> new IOException("The ARI user is not configured"));
        return HttpRequest.newBuilder(URI.create(base + "/ari/recordings/stored/"
                        + URLEncoder.encode(channelId, StandardCharsets.UTF_8) + suffix))
                .header("Authorization", authorization);
    }

    private <T> HttpResponse<T> send(HttpRequest request, HttpResponse.BodyHandler<T> body) throws IOException {
        try {
            return client.send(request, body);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted", e);
        }
    }
}
