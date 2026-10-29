package taxi.blizz.pricing.internal;

import static org.assertj.core.api.Assertions.assertThat;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.pricing.RouteEstimator;
import tools.jackson.databind.json.JsonMapper;

/** GraphHopper's /route API, and the straight-line fallback when it cannot help. */
class GraphHopperRouteEstimatorTests {

    static final GeoPoint MAIDAN = new GeoPoint(50.4501, 30.5234);
    static final GeoPoint STATION = new GeoPoint(50.4405, 30.489);
    static final RouteEstimator.Estimate FALLBACK = new RouteEstimator.Estimate(1, 1);

    HttpServer server;
    final AtomicReference<String> lastQuery = new AtomicReference<>();
    volatile int status = 200;
    volatile String body = "";
    volatile long delayMillis;
    volatile int infoStatus = 200;
    final java.util.concurrent.atomic.AtomicInteger routeCalls = new java.util.concurrent.atomic.AtomicInteger();
    volatile String infoBody = "{\"profiles\":[{\"name\":\"car\"}]}";

    @BeforeEach
    void start() throws IOException {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/route", exchange -> {
            routeCalls.incrementAndGet();
            lastQuery.set(exchange.getRequestURI().getRawQuery());
            try {
                Thread.sleep(delayMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(status, bytes.length == 0 ? -1 : bytes.length);
            if (bytes.length > 0) {
                exchange.getResponseBody().write(bytes);
            }
            exchange.close();
        });
        server.createContext("/info", exchange -> {
            lastQuery.set(exchange.getRequestURI().getRawQuery());
            byte[] bytes = infoBody.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(infoStatus, bytes.length);
            exchange.getResponseBody().write(bytes);
            exchange.close();
        });
        server.start();
    }

    @AfterEach
    void stop() {
        server.stop(0);
    }

    private GraphHopperRouteEstimator estimator(String apiKey) {
        GraphHopperProperties properties = new GraphHopperProperties(true,
                "http://127.0.0.1:" + server.getAddress().getPort() + "/", apiKey, "car", Duration.ofMillis(500));
        return new GraphHopperRouteEstimator(properties, (a, b) -> FALLBACK, JsonMapper.builder().build());
    }

    @Test
    void theRoadRouteGivesDistanceAndTime() {
        body = """
                {"paths":[{"distance":3456.6,"time":512400,"weight":600.1}],"info":{"took":3}}""";
        RouteEstimator.Estimate estimate = estimator(null).estimate(MAIDAN, STATION);
        assertThat(estimate).isEqualTo(new RouteEstimator.Estimate(3457, 512));
        assertThat(lastQuery.get()).isEqualTo("point=50.4501%2C30.5234&point=50.4405%2C30.489&profile=car"
                + "&calc_points=false&instructions=false");

        estimator("secret-key").estimate(MAIDAN, STATION);
        assertThat(lastQuery.get()).endsWith("&key=secret-key");
    }

    @Test
    void withoutARouteTheStraightLineEstimateIsUsed() {
        status = 400;
        body = """
                {"message":"Cannot find point 0: 50.4501,30.5234","hints":[]}""";
        assertThat(estimator(null).estimate(MAIDAN, STATION)).isEqualTo(FALLBACK);

        status = 200;
        body = """
                {"paths":[]}""";
        assertThat(estimator(null).estimate(MAIDAN, STATION)).isEqualTo(FALLBACK);

        body = "not json";
        assertThat(estimator(null).estimate(MAIDAN, STATION)).isEqualTo(FALLBACK);

        body = """
                {"paths":[{"distance":10,"time":1000}]}""";
        delayMillis = 1500;
        assertThat(estimator(null).estimate(MAIDAN, STATION)).as("too slow").isEqualTo(FALLBACK);

        assertThat(unreachable().estimate(MAIDAN, STATION)).as("not reachable").isEqualTo(FALLBACK);
    }

    private GraphHopperRouteEstimator unreachable() {
        int closedPort;
        try (java.net.ServerSocket socket = new java.net.ServerSocket(0)) {
            closedPort = socket.getLocalPort();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return new GraphHopperRouteEstimator(new GraphHopperProperties(true, "http://127.0.0.1:" + closedPort, null,
                "car", Duration.ofMillis(500)), (a, b) -> FALLBACK, JsonMapper.builder().build());
    }

    /**
     * Issue #98 E7: while GraphHopper is down the breaker opens; a quote still gets the straight-line estimate, at
     * once and without asking GraphHopper. "No route" is an answer and never opens it.
     */
    @Test
    void aDownRouterIsNotAskedWhileItsBreakerIsOpenAndQuotesStillGetAnEstimate() {
        GraphHopperProperties properties = new GraphHopperProperties(true,
                "http://127.0.0.1:" + server.getAddress().getPort() + "/", null, "car", Duration.ofMillis(500));
        var breakers = taxi.blizz.platform.ProviderBreakers.of(2, Duration.ofMinutes(1), java.time.Clock.systemUTC());
        GraphHopperRouteEstimator router = new GraphHopperRouteEstimator(properties, (a, b) -> FALLBACK,
                JsonMapper.builder().build(), breakers);

        body = "{\"paths\":[]}"; // no route: an answer
        for (int i = 0; i < 5; i++) {
            assertThat(router.estimate(MAIDAN, STATION)).isEqualTo(FALLBACK);
        }
        assertThat(breakers.state(taxi.blizz.platform.ProviderBreakers.Provider.GRAPHHOPPER))
                .isEqualTo(taxi.blizz.platform.ProviderBreakers.State.CLOSED);

        status = 503;
        body = "";
        router.estimate(MAIDAN, STATION);
        router.estimate(MAIDAN, STATION);
        int asked = routeCalls.get();
        for (int i = 0; i < 5; i++) {
            assertThat(router.estimate(MAIDAN, STATION)).as("the degradation").isEqualTo(FALLBACK);
        }
        assertThat(routeCalls.get()).as("not asked while open").isEqualTo(asked);
    }

    @Test
    void checkingTheConnectionAsksInfoAndNeverShowsTheKey() {
        Integrations.Check ok = estimator("secret-key-1234").check();
        assertThat(ok.ok()).isTrue();
        assertThat(lastQuery.get()).isEqualTo("key=secret-key-1234");
        assertThat(ok.message()).doesNotContain("secret-key");

        infoBody = "{\"profiles\":[{\"name\":\"bike\"}]}";
        assertThat(estimator(null).check().ok()).as("no car profile").isFalse();
        infoStatus = 401;
        Integrations.Check refused = estimator("wrong-key-9999").check();
        assertThat(refused.ok()).isFalse();
        assertThat(refused.message()).contains("refused").doesNotContain("wrong-key");
    }

    /** The local test router stands for a public host; a test flips it to refused. */
    volatile boolean addressRefused;
    final taxi.blizz.platform.OutboundAddresses allowed = (address, schemes) -> {
        if (addressRefused) {
            throw new taxi.blizz.platform.DomainException(taxi.blizz.platform.ErrorCode.VALIDATION_FAILED,
                    "The host resolves to a private address");
        }
        return java.net.URI.create(address);
    };

    private static Integrations panel(java.util.Map<String, String> values,
                                      java.util.concurrent.atomic.AtomicLong revision) {
        return (Integrations) java.lang.reflect.Proxy.newProxyInstance(
                Integrations.class.getClassLoader(), new Class<?>[] {Integrations.class}, (proxy, method, args) ->
                        switch (method.getName()) {
                            case "value" -> java.util.Optional.ofNullable(values.get((String) args[0]));
                            case "revision" -> revision.get();
                            default -> throw new UnsupportedOperationException(method.getName());
                        });
    }

    /**
     * Audit 29.10.2026: the panel's address was checked when the settings were read, then used for every quote. A host
     * whose DNS answer turns private later is no longer asked; the price comes from the straight line.
     */
    @Test
    void aPanelAddressThatTurnsPrivateIsNotAskedAnyMore() {
        java.util.Map<String, String> values = new java.util.concurrent.ConcurrentHashMap<>();
        java.util.concurrent.atomic.AtomicLong revision = new java.util.concurrent.atomic.AtomicLong();
        values.put(Integrations.GRAPHHOPPER_ENABLED, "true");
        values.put(Integrations.GRAPHHOPPER_BASE_URL, "http://127.0.0.1:" + server.getAddress().getPort());
        RouteEstimator.Estimate straight = new RouteEstimator.Estimate(7, 7);
        ConfiguredRouteEstimator configured = new ConfiguredRouteEstimator(panel(values, revision),
                new GraphHopperProperties(false, "http://127.0.0.1:1", null, "car", Duration.ofMillis(500)),
                (a, b) -> straight, JsonMapper.builder().build(), taxi.blizz.platform.ProviderBreakers.none(), allowed);
        body = """
                {"paths":[{"distance":1000,"time":60000}]}""";
        assertThat(configured.estimate(MAIDAN, STATION)).isEqualTo(new RouteEstimator.Estimate(1000, 60));
        int asked = routeCalls.get();

        addressRefused = true; // same settings revision: nothing is rebuilt
        assertThat(configured.estimate(MAIDAN, STATION)).isEqualTo(straight);
        assertThat(routeCalls.get()).as("the router is not called").isEqualTo(asked);
    }

    /** The panel's values (a stub of Integrations) switch GraphHopper on and off without a restart. */
    @Test
    void thePanelSwitchesGraphHopperOnAndOff() {
        java.util.Map<String, String> values = new java.util.concurrent.ConcurrentHashMap<>();
        java.util.concurrent.atomic.AtomicLong revision = new java.util.concurrent.atomic.AtomicLong();
        Integrations panel = panel(values, revision);
        GraphHopperProperties environment = new GraphHopperProperties(false, "http://127.0.0.1:1", null, "car",
                Duration.ofMillis(500));
        RouteEstimator.Estimate straight = new RouteEstimator.Estimate(7, 7);
        RouteEstimator straightLine = (a, b) -> straight;
        ConfiguredRouteEstimator configured = new ConfiguredRouteEstimator(panel, environment, straightLine,
                JsonMapper.builder().build(), taxi.blizz.platform.ProviderBreakers.none(), allowed);
        assertThat(configured.estimate(MAIDAN, STATION)).as("off in the environment").isEqualTo(straight);

        body = """
                {"paths":[{"distance":1000,"time":60000}]}""";
        values.put(Integrations.GRAPHHOPPER_ENABLED, "true");
        values.put(Integrations.GRAPHHOPPER_BASE_URL, "http://127.0.0.1:" + server.getAddress().getPort());
        revision.incrementAndGet();
        assertThat(configured.estimate(MAIDAN, STATION)).isEqualTo(new RouteEstimator.Estimate(1000, 60));

        values.put(Integrations.GRAPHHOPPER_ENABLED, "false");
        revision.incrementAndGet();
        assertThat(configured.estimate(MAIDAN, STATION)).isEqualTo(straight);
    }
}
