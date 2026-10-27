package taxi.blizz.configuration;

import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Settings of the service (REQ-TEN-06, REQ-TEN-07): the brand the apps show, the languages and how "Call"
 * works between rider and driver (owner decision 26.10.2026). Changed in the admin panel with
 * {@link #MANAGE_PERMISSION}; every change is a new version with its author and reason. The brand never
 * changes business rules.
 */
public interface ServiceSettings {

    String MANAGE_PERMISSION = "settings.manage";

    /** Languages the apps are translated into. */
    List<String> SUPPORTED_LANGUAGES = List.of("uk", "pl", "ru", "en");

    enum CallMode {
        /** The app dials the other party's real number; it stays in the phone's call log. */
        DIRECT,
        /** Through the service's numbers; the real numbers stay hidden (needs the SIP provider, Q-18). */
        VIA_SERVICE_NUMBERS
    }

    /**
     * Colours are {@code #RRGGBB}; {@code onPrimaryColor} is the text on the primary colour and must contrast
     * with it at least 4.5:1 (WCAG AA). URLs are https.
     */
    record Brand(String serviceName, String primaryColor, String onPrimaryColor, String accentColor,
                 String logoUrl, String supportPhone, String supportEmail, String supportTelegram,
                 String privacyPolicyUrl, String termsUrl) {
    }

    record Languages(String defaultLanguage, List<String> enabled) {
        public Languages {
            enabled = enabled == null ? List.of() : List.copyOf(enabled);
        }
    }

    /** {@code servicePhone} is the number riders and drivers call in VIA_SERVICE_NUMBERS mode. */
    record Calls(CallMode mode, String servicePhone) {
    }

    record Settings(Brand brand, Languages languages, Calls calls) {
    }

    record Version(long version, Settings settings, UUID changedBy, String reason, java.time.OffsetDateTime changedAt) {
    }

    /** The settings in force; version 0 with the defaults when nobody changed anything yet. */
    Version current();

    Version change(Actor staff, UUID commandId, long expectedVersion, Settings settings, String reason);

    /** Newest first. */
    List<Version> history(Actor staff, int limit);
}
