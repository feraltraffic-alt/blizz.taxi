package taxi.blizz.telephony.internal;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(TelephonyProperties.class)
class TelephonyConfiguration {

    /** A long read timeout: TurboSMS asks not to cut a send short, since a resend would duplicate the SMS. */
    @Bean
    HttpTransport telephonyHttp() {
        HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build();
        return (method, url, headers, body) -> {
            HttpRequest.Builder request = HttpRequest.newBuilder(URI.create(url)).timeout(Duration.ofSeconds(60))
                    .method(method, body == null ? HttpRequest.BodyPublishers.noBody()
                            : HttpRequest.BodyPublishers.ofString(body));
            headers.forEach(request::header);
            try {
                HttpResponse<String> response = client.send(request.build(), HttpResponse.BodyHandlers.ofString());
                return new HttpTransport.Response(response.statusCode(), response.body());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new UncheckedIOException(new IOException("Interrupted", e));
            }
        };
    }

    /** Closes calls whose end Asterisk never reported (the connection was down at that moment). */
    @Configuration(proxyBeanMethods = false)
    @EnableScheduling
    @ConditionalOnProperty(prefix = "blizz.telephony", name = "call-sweep-enabled", havingValue = "true",
            matchIfMissing = true)
    static class CallSweep {

        private final JdbcCalls calls;
        private final TelephonyProperties properties;

        CallSweep(JdbcCalls calls, TelephonyProperties properties) {
            this.calls = calls;
            this.properties = properties;
        }

        @Scheduled(fixedDelayString = "PT10M", initialDelayString = "PT1M")
        void run() {
            calls.closeStale(properties.callStaleAfter());
        }
    }

    /**
     * Brings the recordings of finished calls from Asterisk (issue #60) and deletes those of deleted riders (issue
     * #144); safe on several instances.
     */
    @Configuration(proxyBeanMethods = false)
    @EnableScheduling
    @ConditionalOnProperty(prefix = "blizz.telephony", name = "recording-sweep-enabled", havingValue = "true",
            matchIfMissing = true)
    static class RecordingSweep {

        private final CallRecordings recordings;
        private final CallRecordingRetention retention;
        private final Clock clock;

        RecordingSweep(CallRecordings recordings, CallRecordingRetention retention, Clock clock) {
            this.recordings = recordings;
            this.retention = retention;
            this.clock = clock;
        }

        @Scheduled(fixedDelayString = "PT10S", initialDelayString = "PT10S")
        void run() {
            recordings.fetchDue();
            retention.runErased(OffsetDateTime.now(clock), 100);
        }
    }
}
