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

    private volatile Built built;

    ConfiguredFcmProvider(Integrations integrations, PushProperties properties, FcmPushProvider.Transport http,
                          JsonMapper json, Clock clock) {
        this.integrations = integrations;
        this.properties = properties;
        this.http = http;
        this.json = json;
        this.clock = clock;
    }

    private Built current() {
        long revision;
        try {
            revision = integrations.revision();
        } catch (RuntimeException e) {
            revision = -1;
        }
        Built b = built;
        if (b != null && b.revision() == revision) {
            return b;
        }
        synchronized (this) {
            if (built != null && built.revision() == revision) {
                return built;
            }
            try {
                String projectId = setting(Integrations.FCM_PROJECT_ID).orElse(properties.fcmProjectId());
                String credentials = setting(Integrations.FCM_CREDENTIALS).orElse(properties.fcmCredentials());
                built = new Built(revision, new FcmPushProvider(http, json, clock, projectId, credentials), null);
            } catch (RuntimeException e) {
                built = new Built(revision, null, e.getMessage());
                log.warn("Pushes are not sent: {}", e.getMessage());
            }
            return built;
        }
    }

    private Optional<String> setting(String name) {
        return integrations.value(name).filter(v -> !v.isBlank());
    }

    @Override
    public Result send(String token, String platform, String title, String body, Map<String, String> data,
                       Duration ttl) {
        Built b = current();
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
    public Integrations.Check check() {
        Built b = current();
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
