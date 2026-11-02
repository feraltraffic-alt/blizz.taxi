package taxi.blizz.notification.internal;

import java.time.Duration;
import java.util.Map;

/** One push service (Firebase Cloud Messaging delivers to Android and iOS apps alike). */
interface PushProvider {

    enum Outcome {
        SENT,
        /** The token is no longer valid (app removed, token rotated): the device is dropped. */
        INVALID_TOKEN,
        /** Try again later. */
        RETRY
    }

    record Result(Outcome outcome, String error) {
    }

    /**
     * @param ttl how long the push service may keep it for an offline phone; an offer is useless after its deadline
     */
    Result send(String token, String platform, String title, String body, Map<String, String> data, Duration ttl);

    /**
     * As above, with the push keys of the recipient's taxi service (ADR 0016, issue #215). A provider of no particular
     * service (a fake, one built for one project) sends the same way for every service.
     */
    default Result send(java.util.UUID serviceId, String token, String platform, String title, String body,
                        Map<String, String> data, Duration ttl) {
        return send(token, platform, title, body, data, ttl);
    }
}
