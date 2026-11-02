package taxi.blizz.notification.internal;

import java.time.Clock;
import java.time.Duration;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.IntegrationCheck;
import taxi.blizz.configuration.Integrations;
import tools.jackson.databind.json.JsonMapper;

/**
 * Firebase with the keys in force: those entered in the admin panel, else those of the environment. Rebuilt when the
 * keys change, without a restart. Without keys nothing is sent and the notifications wait for their deadline.
 */
@Component
class ConfiguredFcmProvider implements PushProvider, IntegrationCheck {

    private static final Logger log = LoggerFactory.getLogger(ConfiguredFcmProvider.class);

    private final Integrations integrations;
    private final PushProperties properties;
    private final FcmPushProvider.Transport http;
    private final JsonMapper json;
    private final Clock clock;

    private record Built(long revision, FcmPushProvider fcm, String problem) {
    }

    /** By service: each service pushes through its own Firebase project (ADR 0016). */
    private final java.util.concurrent.ConcurrentHashMap<java.util.UUID, Built> built =
            new java.util.concurrent.ConcurrentHashMap<>();

    ConfiguredFcmProvider(Integrations integrations, PushProperties properties, FcmPushProvider.Transport http,
                          JsonMapper json, Clock clock) {
        this.integrations = integrations;
        this.properties = properties;
        this.http = http;
        this.json = json;
        this.clock = clock;
    }

    private Built current(java.util.UUID service) {
        long revision;
        try {
            revision = integrations.revision();
        } catch (RuntimeException e) {
            revision = -1;
        }
        Built b = built.get(service);
        if (b != null && b.revision() == revision) {
            return b;
        }
        long seen = revision;
        return built.compute(service, (key, old) -> {
            if (old != null && old.revision() == seen) {
                return old;
            }
            // The environment's project stands in for the first service only (ADR 0016).
            boolean env = Integrations.environmentServes(key);
            try {
                String projectId = setting(key, Integrations.FCM_PROJECT_ID)
                        .orElse(env ? properties.fcmProjectId() : null);
                String credentials = setting(key, Integrations.FCM_CREDENTIALS)
                        .orElse(env ? properties.fcmCredentials() : null);
                return new Built(seen, new FcmPushProvider(http, json, clock, projectId, credentials), null);
            } catch (RuntimeException e) {
                log.warn("Pushes of service {} are not sent: {}", key, e.getMessage());
                return new Built(seen, null, e.getMessage());
            }
        });
    }

    private Optional<String> setting(java.util.UUID service, String name) {
        return integrations.value(service, name).filter(v -> !v.isBlank());
    }

    /** No service named: nothing is sent, so a push never goes out with another service's project. */
    @Override
    public Result send(String token, String platform, String title, String body, Map<String, String> data,
                       Duration ttl) {
        return new Result(Outcome.RETRY, "The recipient's taxi service is not known");
    }

    @Override
    public Result send(java.util.UUID serviceId, String token, String platform, String title, String body,
                       Map<String, String> data, Duration ttl) {
        if (serviceId == null) {
            return send(token, platform, title, body, data, ttl);
        }
        Built b = current(serviceId);
        if (b.fcm() == null) {
            return new Result(Outcome.RETRY, "Firebase is not configured: " + b.problem());
        }
        return b.fcm().send(token, platform, title, body, data, ttl);
    }

    @Override
    public String group() {
        return Integrations.PUSH;
    }

    @Override
    public Integrations.Check check(java.util.UUID serviceId) {
        Built b = current(serviceId);
        if (b.fcm() == null) {
            return new Integrations.Check(group(), false, b.problem());
        }
        try {
            String account = b.fcm().signIn();
            return new Integrations.Check(group(), true,
                    "Signed in to Firebase project " + b.fcm().projectId() + " as " + account);
        } catch (RuntimeException e) {
            return new Integrations.Check(group(), false, "Firebase refused the sign-in: " + e.getMessage());
        }
    }
}
