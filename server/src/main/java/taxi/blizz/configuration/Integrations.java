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
    String GEOCODING = "geocoding";
    String OTP = "otp";

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
    String GEOCODING_PROVIDER = "geocoding.provider";
    String GEOCODING_GOOGLE_KEY = "geocoding.google.api-key";
    String GEOCODING_VISICOM_KEY = "geocoding.visicom.api-key";
    String OTP_CHANNEL = "otp.channel";
    String OTP_FALLBACK = "otp.fallback";
    String OTP_TURBOSMS_TOKEN = "otp.turbosms.token";
    String OTP_TURBOSMS_SENDER = "otp.turbosms.sender";
    String OTP_ASTERISK_ARI_URL = "otp.asterisk.ari-url";
    String OTP_ASTERISK_ARI_USER = "otp.asterisk.ari-user";
    String OTP_ASTERISK_ARI_PASSWORD = "otp.asterisk.ari-password";
    String OTP_ASTERISK_ENDPOINT = "otp.asterisk.endpoint";

    /** OSM: Leaflet with OpenStreetMap tiles in the apps and panels, no key (ADR 0012, Q-08). */
    List<String> MAP_PROVIDERS = List.of("OSM", "GOOGLE", "MAPBOX", "MAPTILER");
    /** BUILT_IN: only the service's own address book; GOOGLE, VISICOM: own addresses first, then the provider. */
    List<String> GEOCODING_PROVIDERS = List.of("BUILT_IN", "GOOGLE", "VISICOM");
    /** How sign-in codes go out first (ADR 0012 Q-18). */
    List<String> OTP_CHANNELS = List.of("SMS", "VOICE");
    /** Tried when the first channel fails; NONE: no second try. */
    List<String> OTP_FALLBACKS = List.of("SMS", "VOICE", "NONE");

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
            new Field(MAPS_PROVIDER, MAPS, Kind.TEXT, "Map provider of the apps",
                    "OSM (Leaflet with OpenStreetMap tiles, no key), GOOGLE, MAPBOX or MAPTILER", true),
            new Field(MAPS_ANDROID_KEY, MAPS, Kind.TEXT, "Map key of the Android apps",
                    "Restricted to the apps' package names at the provider", true),
            new Field(MAPS_IOS_KEY, MAPS, Kind.TEXT, "Map key of the iOS apps",
                    "Restricted to the apps' bundle ids at the provider", true),
            new Field(MAPS_WEB_KEY, MAPS, Kind.TEXT, "Map key of the web panels",
                    "Restricted to the panels' domains at the provider", true),
            new Field(GEOCODING_PROVIDER, GEOCODING, Kind.TEXT, "Address search",
                    "BUILT_IN (only the service's own addresses), GOOGLE or VISICOM; the provider's answers are never"
                            + " stored", false),
            new Field(GEOCODING_GOOGLE_KEY, GEOCODING, Kind.SECRET, "Google Geocoding API key",
                    "A server key with the Geocoding API enabled", false),
            new Field(GEOCODING_VISICOM_KEY, GEOCODING, Kind.SECRET, "Visicom Data API key",
                    "The key of api.visicom.ua (Data API 5.0)", false),
            new Field(OTP_CHANNEL, OTP, Kind.TEXT, "How sign-in codes go out",
                    "SMS (TurboSMS) or VOICE (a call through Asterisk that speaks the code); SMS when not set", false),
            new Field(OTP_FALLBACK, OTP, Kind.TEXT, "When that fails",
                    "SMS, VOICE or NONE; VOICE when not set. A rider who asks to be called is called first", false),
            new Field(OTP_TURBOSMS_TOKEN, OTP, Kind.SECRET, "TurboSMS token",
                    "The HTTP API token of the TurboSMS account", false),
            new Field(OTP_TURBOSMS_SENDER, OTP, Kind.TEXT, "TurboSMS sender name",
                    "An alpha name activated in the TurboSMS account, up to 25 characters", false),
            new Field(OTP_ASTERISK_ARI_URL, OTP, Kind.TEXT, "Asterisk ARI address",
                    "e.g. http://asterisk:8088 for the container next to the server", false),
            new Field(OTP_ASTERISK_ARI_USER, OTP, Kind.TEXT, "Asterisk ARI user", "From ari.conf", false),
            new Field(OTP_ASTERISK_ARI_PASSWORD, OTP, Kind.SECRET, "Asterisk ARI password", "From ari.conf", false),
            new Field(OTP_ASTERISK_ENDPOINT, OTP, Kind.TEXT, "Endpoint to dial",
                    "The trunk with {phone} for the number without +, e.g. PJSIP/{phone}@trunk", false));

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
