package taxi.blizz.telephony.internal;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.Integrations;
import tools.jackson.databind.json.JsonMapper;

/**
 * ARI channels: {@code POST /ari/channels} (originate, without Stasis — the channel goes to a dialplan context) and
 * {@code GET /ari/channels}. The variables — the other side's number among them — go in the JSON body only, never in
 * the address, and no error message carries them (REQ-PRV-03).
 */
@Component
class AriChannels implements ChannelControl {

    static final Duration RING_FOR = Duration.ofSeconds(30);

    private final Integrations integrations;
    private final JsonMapper json;
    private final HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build();

    AriChannels(Integrations integrations, JsonMapper json) {
        this.integrations = integrations;
        this.json = json;
    }

    @Override
    public Originated originate(String channelId, String endpoint, String context, Map<String, String> variables)
            throws IOException {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("endpoint", endpoint);
        query.put("context", context);
        query.put("extension", "s");
        query.put("priority", "1");
        query.put("channelId", channelId);
        query.put("timeout", Long.toString(RING_FOR.toSeconds()));
        query.put("callerId", "Blizz");
        String address = "/ari/channels?" + query.entrySet().stream()
                .map(e -> e.getKey() + "=" + URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
                .collect(Collectors.joining("&"));
        HttpResponse<Void> response = send(request(address)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json.writeValueAsString(Map.of("variables", variables))))
                .timeout(Duration.ofSeconds(10)).build(), HttpResponse.BodyHandlers.discarding());
        return switch (response.statusCode()) {
            case 200 -> Originated.STARTED;
            case 409 -> Originated.ALREADY_EXISTS;
            default -> throw new Refused("Asterisk answered " + response.statusCode() + " to an originate");
        };
    }

    @Override
    @SuppressWarnings("unchecked")
    public Set<String> channels() throws IOException {
        HttpResponse<String> response = send(request("/ari/channels").GET().timeout(Duration.ofSeconds(10)).build(),
                HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new IOException("Asterisk answered " + response.statusCode() + " to the list of channels");
        }
        Set<String> ids = new HashSet<>();
        for (Object channel : json.readValue(response.body(), List.class)) {
            if (channel instanceof Map<?, ?> map && map.get("id") != null) {
                ids.add(map.get("id").toString());
            }
        }
        return ids;
    }

    private HttpRequest.Builder request(String address) throws IOException {
        String base = AriAccess.baseUrl(integrations)
                .orElseThrow(() -> new Refused("The ARI address is not configured"));
        String authorization = AriAccess.authorization(integrations)
                .orElseThrow(() -> new Refused("The ARI user is not configured"));
        return HttpRequest.newBuilder(URI.create(base + address)).header("Authorization", authorization);
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
