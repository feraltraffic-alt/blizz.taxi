package taxi.blizz.configuration;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The safety button (REQ-RID-09): the service's support contacts and the local emergency number of each city. The
 * service never contacts emergency services by itself; the apps show that with {@link #NO_AUTO_DISPATCH}. A city
 * nobody configured gets {@link #DEFAULT_EMERGENCY_NUMBER} and nothing else, never "not found". Changed with
 * {@link #MANAGE_PERMISSION} for the city; every change is a new version, audited.
 */
public interface SafetyContacts {

    String MANAGE_PERMISSION = ServiceSettings.MANAGE_PERMISSION;
    String DEFAULT_EMERGENCY_NUMBER = "112";
    /** The apps show their fixed text: the service does not call emergency services by itself. */
    String NO_AUTO_DISPATCH = "NO_AUTO_DISPATCH";
    int MAX_EXTRA = 5;

    /**
     * An extra contact (police, a hotline…): label by language (uk, pl, ru, en), phone in E.164. The labels keep a
     * fixed (sorted) order, so the same command always serializes the same way for its idempotency check.
     */
    record Extra(Map<String, String> label, String phone) {
        public Extra {
            label = label == null ? Map.of() : java.util.Collections.unmodifiableMap(new java.util.TreeMap<>(label));
        }
    }

    /** What staff set: emergency number 2–6 digits; phones E.164; at most {@link #MAX_EXTRA} extras. */
    record Contacts(String emergencyNumber, String supportPhone, List<Extra> extra) {
        public Contacts {
            // A null item is kept here and refused by the validation as a 400, not a 500.
            extra = extra == null ? List.of() : java.util.Collections.unmodifiableList(new java.util.ArrayList<>(extra));
        }
    }

    /** The contacts of a city in force; version 0 with the default until the first change. */
    record Version(UUID cityId, long version, String emergencyNumber, String supportPhone, List<Extra> extra,
                   UUID changedBy, String reason, OffsetDateTime changedAt) {
        public Version {
            extra = extra == null ? List.of() : List.copyOf(extra);
        }
    }

    record ExtraView(String label, String phone) {
    }

    /** What the safety button shows, labels in one language. */
    record View(UUID cityId, String emergencyNumber, String supportPhone, List<ExtraView> extra,
                String disclaimerCode) {
        public View {
            extra = extra == null ? List.of() : List.copyOf(extra);
        }
    }

    /**
     * For the apps: the city's contacts with labels in {@code language} (the caller's choice, may be null), else in
     * the service's default language, else in any language the label has.
     */
    View forCity(UUID cityId, String language);

    /** For the admin panel; needs {@link #MANAGE_PERMISSION} for the city. */
    Version current(Actor staff, UUID cityId);

    /** Replaces the city's contacts; a command with {@code expectedVersion} (0 for a city never configured). */
    Version change(Actor staff, UUID commandId, UUID cityId, long expectedVersion, Contacts contacts, String reason);
}
