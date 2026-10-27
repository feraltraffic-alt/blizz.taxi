package taxi.blizz.notification.internal;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * @param provider        FCM in a real instance; FAKE only logs (development, tests, sandbox)
 * @param fcmProjectId    the Firebase project of the service's apps (REQ-TEN-08: each service its own)
 * @param fcmCredentials  the service account JSON; from the environment only
 * @param workerEnabled   off in tests, which run {@link PushWorker#runOnce()} themselves
 * @param pollInterval    how often the worker looks for due notifications
 */
@ConfigurationProperties("blizz.push")
record PushProperties(
        @DefaultValue("FCM") String provider,
        String fcmProjectId,
        String fcmCredentials,
        @DefaultValue("true") boolean workerEnabled,
        @DefaultValue("PT1S") java.time.Duration pollInterval) {

    @Override
    public String toString() {
        return "PushProperties[provider=" + provider + ", fcmProjectId=" + fcmProjectId + ", fcmCredentials="
                + (fcmCredentials == null ? "none" : "set") + "]";
    }
}
