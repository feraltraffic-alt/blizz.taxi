package taxi.blizz.notification.internal;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * @param provider        FCM in a real instance; FAKE only logs (development, tests, sandbox)
 * @param fcmProjectId    the Firebase project of the service's apps (REQ-TEN-08: each service its own); the admin
 *                        panel's value (Integrations) wins
 * @param fcmCredentials  the service account JSON from the environment; the admin panel's value wins
 * @param workerEnabled   off in tests, which run {@link PushWorker#runOnce()} themselves
 * @param pollInterval    how often the worker looks for due notifications
 * @param initialDelay    a new push waits this long before its first try; 0 in a real instance. The sandbox waits a
 *                        few seconds, so a scenario can replace a driver before the "driver assigned" push leaves and
 *                        show that it is then never sent (issue #143, E3)
 */
@ConfigurationProperties("blizz.push")
record PushProperties(
        @DefaultValue("FCM") String provider,
        String fcmProjectId,
        String fcmCredentials,
        @DefaultValue("true") boolean workerEnabled,
        @DefaultValue("PT1S") java.time.Duration pollInterval,
        @DefaultValue("PT0S") java.time.Duration initialDelay) {

    @Override
    public String toString() {
        return "PushProperties[provider=" + provider + ", fcmProjectId=" + fcmProjectId + ", fcmCredentials="
                + (fcmCredentials == null ? "none" : "set") + "]";
    }
}
