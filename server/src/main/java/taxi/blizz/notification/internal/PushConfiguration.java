package taxi.blizz.notification.internal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Clock;
import java.time.Duration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import tools.jackson.databind.json.JsonMapper;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(PushProperties.class)
class PushConfiguration {

    @Bean
    FakePushProvider fakePushProvider() {
        return new FakePushProvider();
    }

    @Bean
    @Primary
    PushProvider pushProvider(PushProperties properties, FakePushProvider fake, JsonMapper json, Clock clock) {
        return switch (properties.provider()) {
            case "FAKE" -> fake;
            case "FCM" -> {
                HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build();
                FcmPushProvider.Transport http = (url, headers, contentType, body) -> {
                    HttpRequest.Builder request = HttpRequest.newBuilder(URI.create(url))
                            .timeout(Duration.ofSeconds(10)).header("Content-Type", contentType)
                            .POST(HttpRequest.BodyPublishers.ofString(body));
                    headers.forEach(request::header);
                    try {
                        HttpResponse<String> response = client.send(request.build(),
                                HttpResponse.BodyHandlers.ofString());
                        return new FcmPushProvider.Response(response.statusCode(), response.body());
                    } catch (java.io.IOException e) {
                        throw new java.io.UncheckedIOException(e);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException("Interrupted", e);
                    }
                };
                yield new FcmPushProvider(http, json, clock, properties.fcmProjectId(), properties.fcmCredentials());
            }
            default -> throw new IllegalStateException("blizz.push.provider must be FCM or FAKE, not "
                    + properties.provider());
        };
    }

    /** Off with {@code blizz.push.worker-enabled=false} (tests run the worker themselves). */
    @Configuration(proxyBeanMethods = false)
    @EnableScheduling
    @ConditionalOnProperty(prefix = "blizz.push", name = "worker-enabled", havingValue = "true", matchIfMissing = true)
    static class WorkerSchedule {

        private final PushWorker worker;

        WorkerSchedule(PushWorker worker) {
            this.worker = worker;
        }

        @Scheduled(fixedDelayString = "${blizz.push.poll-interval:PT1S}")
        void poll() {
            worker.runOnce();
        }
    }
}
