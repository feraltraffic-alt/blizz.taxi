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

    /** How pre-orders reach drivers (ADR 0006). */
    enum PreorderDispatch {
        /** Shown to drivers at once; a driver reserves it and confirms "On my way" before the pickup. */
        RESERVATION,
        /** Released into the normal search a set time before the pickup. */
        BROADCAST_BEFORE
    }

    /**
     * Pre-orders (owner decision 27.10.2026, ADR 0006). An order with a pickup time at least
     * {@code thresholdMinutes} ahead is a pre-order; at most {@code maxDaysAhead} days ahead.
     * BROADCAST_BEFORE: the search starts {@code releaseMinutesBefore} before the pickup. RESERVATION: the driver
     * confirms between {@code confirmMinutesBefore} and {@code confirmMinutesBefore − confirmWindowMinutes}
     * before the pickup or loses the reservation; he may drop it himself until
     * {@code driverCancelUntilMinutesBefore} before the pickup, later only a dispatcher can.
     */
    record Preorders(int thresholdMinutes, int maxDaysAhead, PreorderDispatch dispatch, int releaseMinutesBefore,
                     int confirmMinutesBefore, int confirmWindowMinutes, int driverCancelUntilMinutesBefore) {
    }

    /** Hours after trip completion during which either participant may submit or replace a rating. */
    record Ratings(int editWindowHours) {
    }

    /** Hours after trip completion during which the rider may leave a tip (ADR 0012, Q-04). */
    record Tips(int windowHours) {
    }

    /**
     * Orders not in a final state, pre-orders included, one paying rider may have at once (active_orders_per_payer,
     * ADR 0012 Q-03): 1..10, 3 by default.
     */
    record Orders(int activePerPayer) {
    }

    /**
     * A trip the driver reports as not paid in cash or at the driver's terminal (owner decision 28.10.2026): whether
     * the driver is credited, and what part of the share. The rest of the share waits in suspense for support.
     */
    record CashNotReceived(boolean creditDriver, int driverSharePercent) {
        /** The part of {@code shareMinor} the driver gets, rounded down; the rest is held. */
        public long credited(long shareMinor) {
            return creditDriver ? shareMinor * driverSharePercent / 100 : 0;
        }
    }

    /**
     * What one staff member may top up in 24 hours, per currency, driver balances and rider wallets together (threat
     * model C3, owner decision 30.10.2026). A currency not listed has no daily limit.
     */
    record StaffTopUps(java.util.Map<String, Long> dailyMaxPerStaffMinor) {
        public StaffTopUps {
            dailyMaxPerStaffMinor = dailyMaxPerStaffMinor == null ? java.util.Map.of()
                    : java.util.Map.copyOf(dailyMaxPerStaffMinor);
        }

        /** The limit for the currency, or empty when it has none. */
        public java.util.OptionalLong dailyMax(String currency) {
            Long max = dailyMaxPerStaffMinor.get(currency);
            return max == null ? java.util.OptionalLong.empty() : java.util.OptionalLong.of(max);
        }
    }

    /** Per-platform version policy (REQ-API-10). */
    record PlatformVersions(String minimumVersion, String latestVersion) {
    }

    record AppVersions(PlatformVersions riderAndroid, PlatformVersions riderIos,
                       PlatformVersions driverAndroid, PlatformVersions driverIos,
                       boolean requireVersionHeader) {
    }

    record Settings(Brand brand, Languages languages, Calls calls, Preorders preorders, Ratings ratings, Tips tips,
                    Orders orders, CashNotReceived cashNotReceived, AppVersions appVersions,
                    StaffTopUps staffTopUps) {
        /** Source compatibility for callers written before the staff top-up limit. */
        public Settings(Brand brand, Languages languages, Calls calls, Preorders preorders, Ratings ratings, Tips tips,
                        Orders orders, CashNotReceived cashNotReceived, AppVersions appVersions) {
            this(brand, languages, calls, preorders, ratings, tips, orders, cashNotReceived, appVersions, null);
        }

        /** Source compatibility for callers written before app versions became configurable. */
        public Settings(Brand brand, Languages languages, Calls calls, Preorders preorders, Ratings ratings, Tips tips,
                        Orders orders, CashNotReceived cashNotReceived) {
            this(brand, languages, calls, preorders, ratings, tips, orders, cashNotReceived, null, null);
        }

        /** Source compatibility for callers written before ratings became configurable. */
        public Settings(Brand brand, Languages languages, Calls calls, Preorders preorders) {
            this(brand, languages, calls, preorders, null, null, null, null, null, null);
        }

        /** Source compatibility for callers written before tips became configurable. */
        public Settings(Brand brand, Languages languages, Calls calls, Preorders preorders, Ratings ratings) {
            this(brand, languages, calls, preorders, ratings, null, null, null, null, null);
        }

        /** Source compatibility for callers written before the order limit became configurable. */
        public Settings(Brand brand, Languages languages, Calls calls, Preorders preorders, Ratings ratings,
                        Tips tips) {
            this(brand, languages, calls, preorders, ratings, tips, null, null, null, null);
        }

        /** Source compatibility for callers written before the cash dispute setting. */
        public Settings(Brand brand, Languages languages, Calls calls, Preorders preorders, Ratings ratings,
                        Tips tips, Orders orders) {
            this(brand, languages, calls, preorders, ratings, tips, orders, null, null, null);
        }
    }

    record Version(long version, Settings settings, UUID changedBy, String reason, java.time.OffsetDateTime changedAt) {
    }

    /** The settings in force; version 0 with the defaults when nobody changed anything yet. */
    Version current();

    Version change(Actor staff, UUID commandId, long expectedVersion, Settings settings, String reason);

    /** Newest first. */
    List<Version> history(Actor staff, int limit);
}
