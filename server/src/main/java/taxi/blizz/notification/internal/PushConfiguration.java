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

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(PushProperties.class)
class PushConfiguration {

    @Bean
    FakePushProvider fakePushProvider(Clock clock) {
        return new FakePushProvider(clock);
    }

    /**
     * HTTP to Firebase, behind the FCM breaker (REQ-ENG-07): a timeout, a refused connection or a 5xx counts; while
     * it is open nothing is sent and the push stays pending for its back-off.
     */
    @Bean
    FcmPushProvider.Transport fcmTransport(taxi.blizz.platform.ProviderBreakers breakers) {
        HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build();
        return (url, headers, contentType, body) -> {
            HttpRequest.Builder request = HttpRequest.newBuilder(URI.create(url))
                    .timeout(Duration.ofSeconds(10)).header("Content-Type", contentType)
                    .POST(HttpRequest.BodyPublishers.ofString(body));
            headers.forEach(request::header);
            RuntimeException[] error = new RuntimeException[1];
            FcmPushProvider.Response answer = breakers.call(taxi.blizz.platform.ProviderBreakers.Provider.FCM, () -> {
                        HttpResponse<String> response = client.send(request.build(), HttpResponse.BodyHandlers.ofString());
                        return new FcmPushProvider.Response(response.statusCode(), response.body());
                    },
                    r -> r.status() >= 500 || r.status() == 429,
                    e -> {
                        error[0] = e instanceof java.io.IOException io ? new java.io.UncheckedIOException(io)
                                : new IllegalStateException(e.getClass().getSimpleName(), e);
                        return null;
                    },
                    () -> {
                        error[0] = new IllegalStateException("Firebase is unavailable (breaker open)");
                        return null;
                    });
            if (error[0] != null) {
                throw error[0];
            }
            return answer;
        };
    }

    /** What the sender uses: FCM with the keys in force, or FAKE (only logs). */
    @Bean
    @Primary
    PushProvider pushProvider(PushProperties properties, FakePushProvider fake, ConfiguredFcmProvider fcm) {
        return switch (properties.provider()) {
            case "FAKE" -> fake;
            case "FCM" -> fcm;
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
        private final SmsWorker sms;

        WorkerSchedule(PushWorker worker, SmsWorker sms) {
            this.worker = worker;
            this.sms = sms;
        }

        @Scheduled(fixedDelayString = "${blizz.push.poll-interval:PT1S}")
        void poll() {
            worker.runOnce();
            sms.runOnce();
        }
    }
}
