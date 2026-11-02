package taxi.blizz.configuration;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.RetentionPolicy;

/**
 * Retention, Q-19, per taxi service (ADR 0016, #276): the service's super admin sets the terms of its own rows;
 * managers need every city of the service. All versions are kept.
 */
public interface RetentionSettings extends RetentionPolicy {

    String MANAGE_PERMISSION = "retention.manage";

    /** {@code fixedDays}: the kinds of no service, kept a fixed number of days whatever is set (#276). */
    record Version(long version, Map<String, Integer> days, UUID changedBy, String reason, OffsetDateTime changedAt,
                   Map<String, Integer> fixedDays) {

        public Version {
            days = java.util.Collections.unmodifiableMap(new java.util.TreeMap<>(days));
            fixedDays = java.util.Collections.unmodifiableMap(new java.util.TreeMap<>(fixedDays));
        }

        public Version(long version, Map<String, Integer> days, UUID changedBy, String reason,
                       OffsetDateTime changedAt) {
            this(version, days, changedBy, reason, changedAt, FIXED_KINDS.stream().collect(
                    java.util.stream.Collectors.toMap(kind -> kind, kind -> FIXED_DAYS)));
        }
    }

    /** The service's terms; version 0 holds the defaults until its super admin sets them. */
    Version current(UUID serviceId);

    /** Changes the terms of the actor's own service. */
    Version change(Actor actor, UUID commandId, long expectedVersion, Map<String, Integer> days, String reason);
}
