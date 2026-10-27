package taxi.blizz.configuration;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Keys and settings of the external services, entered in the admin panel (REQ-ADM-10): Firebase for pushes,
 * GraphHopper for routes, the map keys of the apps, and the merchant secrets of the payments module. A secret can be
 * written or replaced but never read back through the panel; it is stored encrypted with the instance's master key.
 * A value set here wins over the environment; without one the environment's value (if any) is used. Readers see a
 * change within seconds, without a restart.
 */
public interface Integrations {

    String MANAGE_PERMISSION = "integrations.manage";

    enum Kind {
        TEXT,
        /** Write-only; the panel shows whether it is set, its last characters, who changed it and when. */
        SECRET,
        /** "true" or "false". */
        FLAG
    }

    /**
     * @param forApps the value goes to the apps in the public start-up data (map keys are restricted to the app ids
     *                at the map provider, so they are not secrets)
     */
    record Field(String name, String group, Kind kind, String label, String description, boolean forApps) {
    }

    String PUSH = "push";
    String ROUTING = "routing";
    String MAPS = "maps";

    String FCM_PROJECT_ID = "push.fcm.project-id";
    String FCM_CREDENTIALS = "push.fcm.credentials";
    String GRAPHHOPPER_ENABLED = "routing.graphhopper.enabled";
    String GRAPHHOPPER_BASE_URL = "routing.graphhopper.base-url";
    String GRAPHHOPPER_PROFILE = "routing.graphhopper.profile";
    String GRAPHHOPPER_API_KEY = "routing.graphhopper.api-key";
    String MAPS_PROVIDER = "maps.provider";
    String MAPS_ANDROID_KEY = "maps.android-key";
    String MAPS_IOS_KEY = "maps.ios-key";
    String MAPS_WEB_KEY = "maps.web-key";

    List<String> MAP_PROVIDERS = List.of("GOOGLE", "MAPBOX", "MAPTILER");

    List<Field> FIELDS = List.of(
            new Field(FCM_PROJECT_ID, PUSH, Kind.TEXT, "Firebase project id",
                    "The service's own Firebase project (REQ-TEN-08)", false),
            new Field(FCM_CREDENTIALS, PUSH, Kind.SECRET, "Service account key (JSON)",
                    "The whole JSON file of a service account with the role Firebase Cloud Messaging API Admin",
                    false),
            new Field(GRAPHHOPPER_ENABLED, ROUTING, Kind.FLAG, "Road routes from GraphHopper",
                    "Off: prices and times from the straight-line estimate", false),
            new Field(GRAPHHOPPER_BASE_URL, ROUTING, Kind.TEXT, "GraphHopper address",
                    "https://graphhopper.com/api/1 for the hosted API, e.g. http://graphhopper:8989 for an own server",
                    false),
            new Field(GRAPHHOPPER_PROFILE, ROUTING, Kind.TEXT, "Vehicle profile", "Usually car", false),
            new Field(GRAPHHOPPER_API_KEY, ROUTING, Kind.SECRET, "GraphHopper API key",
                    "Only for the hosted API; an own server needs none", false),
            new Field(MAPS_PROVIDER, MAPS, Kind.TEXT, "Map provider of the apps", "GOOGLE, MAPBOX or MAPTILER",
                    true),
            new Field(MAPS_ANDROID_KEY, MAPS, Kind.TEXT, "Map key of the Android apps",
                    "Restricted to the apps' package names at the provider", true),
            new Field(MAPS_IOS_KEY, MAPS, Kind.TEXT, "Map key of the iOS apps",
                    "Restricted to the apps' bundle ids at the provider", true),
            new Field(MAPS_WEB_KEY, MAPS, Kind.TEXT, "Map key of the web panels",
                    "Restricted to the panels' domains at the provider", true));

    /** A value as the panel sees it: {@code value} is null for a secret. */
    record FieldState(String name, String group, Kind kind, String label, String description, boolean forApps,
                      boolean set, String value, String hint, UUID changedBy, OffsetDateTime changedAt) {
    }

    /** {@code value} null or blank removes the value set in the panel. */
    record Change(String name, String value) {

        @Override
        public String toString() {
            return "Change[" + name + "]"; // never the value: it may be a key
        }
    }

    record Check(String group, boolean ok, String message) {
    }

    List<FieldState> list(Actor staff);

    /** All changes or none; the staff member's password is asked again (REQ-ADM-10). */
    List<FieldState> change(Actor staff, UUID commandId, String password, List<Change> changes, String reason);

    /** "Check the connection" of a group; the answer never contains a key. */
    Check check(Actor staff, String group);

    /** The value set in the panel (decrypted for a secret); empty when not set. For the modules that use it. */
    Optional<String> value(String name);

    /** Grows with every change; a reader rebuilds its client when it differs from the one it was built at. */
    long revision();

    /**
     * A secret of another module, e.g. a merchant's: stored and audited like the fields above, under {@code name}
     * (lower case, dots and dashes). For use inside that module's own change, after it checked the permission and
     * the password.
     */
    void putSecret(Actor staff, String name, String value);

    /** The last characters of a stored secret, for the panel. */
    Optional<String> secretHint(String name);
}
