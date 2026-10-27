package taxi.blizz.payments.internal;

import java.net.http.HttpClient;
import java.time.Clock;
import java.util.Map;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.web.client.RestClient;
import tools.jackson.databind.DeserializationFeature;
import tools.jackson.databind.json.JsonMapper;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(PaymentsProperties.class)
class PaymentsConfiguration {

    /** Sends and reconciles provider operations; off with {@code blizz.payments.worker-enabled=false} (tests). */
    @Configuration(proxyBeanMethods = false)
    @org.springframework.scheduling.annotation.EnableScheduling
    @org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(prefix = "blizz.payments",
            name = "worker-enabled", havingValue = "true", matchIfMissing = true)
    static class WorkerSchedule {

        private final PaymentWorker worker;
        private final JdbcCardTopUps topUps;

        WorkerSchedule(PaymentWorker worker, JdbcCardTopUps topUps) {
            this.worker = worker;
            this.topUps = topUps;
        }

        @org.springframework.scheduling.annotation.Scheduled(
                fixedDelayString = "${blizz.payments.poll-interval:PT2S}")
        void poll() {
            worker.runOnce();
            topUps.reconcile();
        }
    }

    /** Provider answers keep amounts as written (BigDecimal), so signatures are checked on the exact text. */
    static final JsonMapper PROVIDER_JSON = JsonMapper.builder()
            .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS).build();

    @Bean
    FakeProvider.Gateway fakeGateway(Merchants merchants) {
        return new FakeProvider.Gateway(merchants::secretOfAccount);
    }

    @Bean
    Providers providers(PaymentsProperties properties, Clock clock, FakeProvider.Gateway fakeGateway) {
        JdkClientHttpRequestFactory factory = new JdkClientHttpRequestFactory(HttpClient.newBuilder()
                .connectTimeout(java.time.Duration.ofSeconds(5)).build());
        factory.setReadTimeout(properties.timeout());
        RestClient rest = RestClient.builder().requestFactory(factory).build();
        WayForPayProvider.Transport http = (url, body) -> {
            String answer = rest.post().uri(url).contentType(org.springframework.http.MediaType.APPLICATION_JSON)
                    .body(PROVIDER_JSON.writeValueAsString(body)).retrieve().body(String.class);
            @SuppressWarnings("unchecked")
            Map<String, Object> parsed = PROVIDER_JSON.readValue(answer == null ? "{}" : answer, Map.class);
            return parsed;
        };
        return new Providers(Map.of(
                "WAYFORPAY", new WayForPayProvider(http, clock, properties.holdTimeoutSeconds()),
                "FAKE", new FakeProvider(fakeGateway, clock, properties.publicBaseUrl())));
    }
}
