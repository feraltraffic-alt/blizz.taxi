package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import taxi.blizz.TestcontainersConfiguration;

/**
 * Monitoring (REQ-OBS-02/05): the main port answers only the probes; metrics are on the management port, which is
 * never published, with the service's own gauges.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
class ObservabilityTests {

    @Value("${local.server.port}") int port;
    @Value("${local.management.port}") int managementPort;

    private final HttpClient http = HttpClient.newHttpClient();

    @Test
    void probesOnTheMainPortMetricsOnlyOnTheManagementPort() throws Exception {
        assertThat(get(port, "/readyz").statusCode()).isEqualTo(200);
        assertThat(get(port, "/livez").statusCode()).isEqualTo(200);
        assertThat(get(port, "/actuator/prometheus").statusCode()).isNotEqualTo(200);

        HttpResponse<String> metrics = get(managementPort, "/actuator/prometheus");
        assertThat(metrics.statusCode()).isEqualTo(200);
        assertThat(metrics.body()).contains("blizz_outbox_pending", "blizz_outbox_oldest_seconds",
                "blizz_clock_skew_seconds", "blizz_payments_unknown", "blizz_ledger_unbalanced",
                "blizz_orders_searching", "blizz_drivers_online", "http_server_requests_seconds_bucket");
        assertThat(get(managementPort, "/actuator/health").body()).doesNotContain("details");
    }

    private HttpResponse<String> get(int on, String path) throws Exception {
        return http.send(HttpRequest.newBuilder(URI.create("http://localhost:" + on + path)).GET().build(),
                HttpResponse.BodyHandlers.ofString());
    }
}
