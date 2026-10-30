package taxi.blizz.configuration;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.RetentionPolicy;

/** Service-wide retention, Q-19: no owning city; managers need all-city scope. All versions are kept. */
public interface RetentionSettings extends RetentionPolicy {
    String MANAGE_PERMISSION="retention.manage";
    record Version(long version,Map<String,Integer> days,UUID changedBy,String reason,OffsetDateTime changedAt) {
        public Version {days=java.util.Collections.unmodifiableMap(new java.util.TreeMap<>(days));}
    }
    Version current();
    Version change(Actor actor,UUID commandId,long expectedVersion,Map<String,Integer> days,String reason);
}
