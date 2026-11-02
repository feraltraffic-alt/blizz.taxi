package taxi.blizz.telephony.internal;

import static org.assertj.core.api.Assertions.assertThat;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.PhoneNumber;
import tools.jackson.databind.json.JsonMapper;

/**
 * Each taxi service's own Asterisk (ADR 0016, owner decision 02.11.2026, issue #275): T4–T8 of the issue. Two fake
 * exchanges, one per service; whatever is done for service B reaches B's and never A's.
 */
class AsteriskPerServiceTests {

    static final UUID A = UUID.fromString("5e000000-0000-4000-8000-000000000001");
    static final UUID B = UUID.fromString("5e000000-0000-4000-8000-0000000000b2");

    private final JsonMapper json = JsonMapper.builder().build();
    private final List<Exchange> exchanges = new CopyOnWriteArrayList<>();

    /** An Asterisk's ARI over HTTP that records every request it gets. */
    final class Exchange {
        final HttpServer server;
        final List<String> requests = new CopyOnWriteArrayList<>();

        Exchange() throws IOException {
            server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
            server.createContext("/ari", exchange -> {
                requests.add(exchange.getRequestMethod() + " " + exchange.getRequestURI().getPath());
                String path = exchange.getRequestURI().getPath();
                byte[] body = path.endsWith("/file") ? WavFiles.tone(1)
                        : path.equals("/ari/channels") && "GET".equals(exchange.getRequestMethod())
                        ? "[{\"id\":\"on-this-exchange\"}]".getBytes(StandardCharsets.UTF_8)
                        : path.startsWith("/ari/channels")
                        ? "{\"id\":\"1730000000.7\"}".getBytes(StandardCharsets.UTF_8)
                        : "{}".getBytes(StandardCharsets.UTF_8);
                int status = "DELETE".equals(exchange.getRequestMethod()) ? 204 : 200;
                exchange.sendResponseHeaders(status, status == 204 ? -1 : body.length);
                if (status != 204) {
                    exchange.getResponseBody().write(body);
                }
                exchange.close();
            });
            server.start();
            exchanges.add(this);
        }

        Map<String, String> settings() {
            return Map.of(Integrations.OTP_ASTERISK_ARI_URL, "http://127.0.0.1:" + server.getAddress().getPort(),
                    Integrations.OTP_ASTERISK_ARI_USER, "blizz", Integrations.OTP_ASTERISK_ARI_PASSWORD, "test-only",
                    Integrations.OTP_ASTERISK_ENDPOINT, "PJSIP/{phone}@trunk");
        }
    }

    @AfterEach
    void stopExchanges() {
        exchanges.forEach(e -> e.server.stop(0));
    }

    private static TelephonyProperties live() {
        return new TelephonyProperties("LIVE", "https://turbosms.test", Duration.ofSeconds(30), true,
                Duration.ofHours(4), false, false, Duration.ofHours(1), 268_435_456L, "PJSIP/{extension}",
                "blizz-outgoing", List.of("blizz-outgoing", "from-internal"));
    }

    @Test
    void t4AnOutboundCallOfBIsOriginatedOnBsExchangeAndTheChannelListIsEachServicesOwn() throws Exception {
        Exchange a = new Exchange();
        Exchange b = new Exchange();
        AriChannels channels = new AriChannels(IntegrationsStub.perService(Map.of(A, a.settings(), B, b.settings())),
                json);
        channels.originate(B, "chan-of-b", "PJSIP/101", "blizz-outgoing", Map.of("DIAL", "+380671234567"));
        assertThat(b.requests).containsExactly("POST /ari/channels");
        assertThat(a.requests).as("never A's exchange").isEmpty();
        assertThat(channels.channels(A)).containsExactly("on-this-exchange");
        assertThat(a.requests).containsExactly("GET /ari/channels");
    }

    @Test
    void t4AServiceWithoutAnExchangeIsRefusedAndNoOtherIsAsked() throws Exception {
        Exchange a = new Exchange();
        AriChannels channels = new AriChannels(IntegrationsStub.perService(Map.of(A, a.settings())), json);
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> channels.originate(B, "chan", "PJSIP/101",
                "blizz-outgoing", Map.of())).isInstanceOf(ChannelControl.Refused.class);
        assertThat(a.requests).isEmpty();
    }

    @Test
    void t5BsRecordingIsFetchedFromAndDiscardedOnBsExchange() throws Exception {
        Exchange a = new Exchange();
        Exchange b = new Exchange();
        AriRecordingSource source = new AriRecordingSource(IntegrationsStub.perService(Map.of(A, a.settings(),
                B, b.settings())));
        Optional<Path> file = source.fetch(B, "1730000000.9");
        assertThat(file).isPresent();
        Files.deleteIfExists(file.get());
        assertThat(source.discard(B, "1730000000.9")).isTrue();
        assertThat(b.requests).containsExactly("GET /ari/recordings/stored/1730000000.9/file",
                "DELETE /ari/recordings/stored/1730000000.9");
        assertThat(a.requests).isEmpty();
    }

    @Test
    void t6AVoiceCodeForBGoesThroughBsExchange() throws Exception {
        Exchange a = new Exchange();
        Exchange b = new Exchange();
        AsteriskVoiceSender voice = new AsteriskVoiceSender(IntegrationsStub.perService(Map.of(A, a.settings(),
                B, b.settings())), live(), jdk(), json);
        OtpSender.Result sent = voice.send(B, new PhoneNumber("+380631234567"), "654321", OtpAudience.CLIENT);
        assertThat(sent.state()).isEqualTo(OtpSender.State.SENT);
        assertThat(b.requests).containsExactly("POST /ari/channels");
        assertThat(a.requests).isEmpty();
    }

    @Test
    void t7OnlyServicesWithAnExchangeAreListenedToAndANewOneIsPickedUp() throws Exception {
        IntegrationsStub integrations = IntegrationsStub.perService(Map.of(A, Map.of(
                Integrations.OTP_ASTERISK_ARI_URL, "http://127.0.0.1:9", Integrations.OTP_ASTERISK_ARI_USER, "blizz",
                Integrations.OTP_ASTERISK_ARI_PASSWORD, "nobody-home")));
        AriEventStream stream = new AriEventStream(integrations, live(), null, null, () -> List.of(A, B));
        stream.refresh();
        try {
            assertThat(stream.listening()).as("B has no exchange: no stream, no attempt").containsExactly(A);
            integrations.set(B, Map.of(Integrations.OTP_ASTERISK_ARI_URL, "http://127.0.0.1:9",
                    Integrations.OTP_ASTERISK_ARI_USER, "blizz-b", Integrations.OTP_ASTERISK_ARI_PASSWORD, "b"));
            stream.refresh();
            assertThat(stream.listening()).containsExactlyInAnyOrder(A, B);
            integrations.set(A, Map.of());
            stream.refresh();
            assertThat(stream.listening()).as("A's exchange removed: its stream stops").containsExactly(B);
        } finally {
            stream.stop();
        }
    }

    @Test
    void t8TheIntegrationCheckOfBAsksBsExchange() throws Exception {
        Exchange a = new Exchange();
        Exchange b = new Exchange();
        OtpIntegrationCheck check = new OtpIntegrationCheck(IntegrationsStub.perService(Map.of(A, a.settings(),
                B, b.settings())), live(), jdk(), json);
        Integrations.Check result = check.check(B);
        assertThat(result.message()).contains("Asterisk answered");
        assertThat(b.requests).containsExactly("GET /ari/asterisk/info");
        assertThat(a.requests).isEmpty();
    }

    /**
     * #278 K1 and K2: B's exchange failing opens B's breaker only; A's outbound calls still go through, and A's
     * breaker stays closed.
     */
    @Test
    void k1BsFailingExchangeOpensBsBreakerOnlyAndAsCallsGoThrough() throws Exception {
        Exchange a = new Exchange();
        HttpServer broken = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        List<String> brokenRequests = new CopyOnWriteArrayList<>();
        broken.createContext("/ari", exchange -> {
            brokenRequests.add(exchange.getRequestURI().getPath());
            exchange.sendResponseHeaders(500, -1);
            exchange.close();
        });
        broken.start();
        try {
            Map<String, String> bSettings = Map.of(Integrations.OTP_ASTERISK_ARI_URL,
                    "http://127.0.0.1:" + broken.getAddress().getPort(), Integrations.OTP_ASTERISK_ARI_USER, "blizz",
                    Integrations.OTP_ASTERISK_ARI_PASSWORD, "test-only");
            taxi.blizz.platform.ProviderBreakers breakers = taxi.blizz.platform.ProviderBreakers.of(2,
                    Duration.ofMinutes(1), java.time.Clock.systemUTC());
            AriChannels channels = new AriChannels(IntegrationsStub.perService(Map.of(A, a.settings(), B, bSettings)),
                    json, breakers);
            for (int i = 0; i < 3; i++) {
                org.assertj.core.api.Assertions.assertThatThrownBy(() -> channels.originate(B, "b-" + UUID.randomUUID(),
                        "PJSIP/101", "blizz-outgoing", Map.of())).isInstanceOf(ChannelControl.Refused.class);
            }
            assertThat(brokenRequests).as("B's breaker opened after two failures: the third is not sent").hasSize(2);
            assertThat(breakers.keyed(B.toString()).state(taxi.blizz.platform.ProviderBreakers.Provider.ASTERISK))
                    .isEqualTo(taxi.blizz.platform.ProviderBreakers.State.OPEN);
            assertThat(channels.originate(A, "a-" + UUID.randomUUID(), "PJSIP/101", "blizz-outgoing", Map.of()))
                    .as("K1: A's call goes through").isEqualTo(ChannelControl.Originated.STARTED);
            assertThat(breakers.keyed(A.toString()).state(taxi.blizz.platform.ProviderBreakers.Provider.ASTERISK))
                    .as("K2").isEqualTo(taxi.blizz.platform.ProviderBreakers.State.CLOSED);
        } finally {
            broken.stop(0);
        }
    }

    /** Real HTTP to the fake exchanges. */
    private static HttpTransport jdk() {
        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        return (method, url, headers, body) -> {
            java.net.http.HttpRequest.Builder request = java.net.http.HttpRequest.newBuilder(java.net.URI.create(url))
                    .method(method, body == null ? java.net.http.HttpRequest.BodyPublishers.noBody()
                            : java.net.http.HttpRequest.BodyPublishers.ofString(body));
            headers.forEach(request::header);
            try {
                java.net.http.HttpResponse<String> response = client.send(request.build(),
                        java.net.http.HttpResponse.BodyHandlers.ofString());
                return new HttpTransport.Response(response.statusCode(), response.body());
            } catch (IOException e) {
                throw new java.io.UncheckedIOException(e);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new java.io.UncheckedIOException(new IOException(e));
            }
        };
    }
}
