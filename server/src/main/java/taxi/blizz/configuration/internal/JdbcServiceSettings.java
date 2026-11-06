package taxi.blizz.configuration.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.PageCursor;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcServiceSettings implements ServiceSettings {

    private static final Pattern COLOR = Pattern.compile("^#[0-9A-Fa-f]{6}$");

    /**
     * Until the admin saves settings: a neutral brand, every language with Russian by default (owner decision
     * 27.10.2026), direct calls.
     */
    /** A platform without a version policy: every build is allowed (REQ-API-10). */
    static final PlatformVersions NO_POLICY = new PlatformVersions("0.0.0", "0.0.0");

    static final Settings DEFAULTS = new Settings(
            new Brand("Blizz Taxi", "#111111", "#FFFFFF", null, null, null, null, null, null, null),
            new Languages("ru", SUPPORTED_LANGUAGES),
            new Calls(CallMode.DIRECT, null),
            new Preorders(60, 7, PreorderDispatch.BROADCAST_BEFORE, 30, 30, 10, 60),
            new Ratings(24),
            new Tips(24),
            new Orders(3),
            new CashNotReceived(true, 100),
            new AppVersions(NO_POLICY, NO_POLICY, NO_POLICY, NO_POLICY, false),
            new StaffTopUps(Map.of()),
            new RiderDebts(Map.of()),
            new DriverDiscipline(true, 30, 3, 5, 30, 120, 7, 20, 20, 5, 7),
            new OfferDiscipline(true, 3, true, 20, 50, 30, 3000),
            new PickupTime(15, 10),
            new CancellationFault(2, 5, 15, false),
            new Refunds(Map.of("UAH", 1_000L), Map.of("UAH", 50_000L), Map.of("UAH", 300_000L), 3, 30, 30, 180,
                    false, false, false, 4, 7, 0));

    /**
     * Pre-orders at most two weeks ahead (owner decision 28.10.2026: a month is too long, the service may close). It
     * also keeps a card hold, which lasts until the pickup, well inside the provider's limit of about 20 days.
     */
    static final int MAX_DAYS_AHEAD = 14;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final JsonMapper json;
    private final Clock clock;

    private final taxi.blizz.identity.Services services;
    private final taxi.blizz.geo.CityCatalog cities;

    JdbcServiceSettings(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                        JsonMapper json, Clock clock, taxi.blizz.identity.Services services,
                        taxi.blizz.geo.CityCatalog cities) {
        this.services = services;
        this.cities = cities;
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.json = json;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public Version current(UUID serviceId) {
        return jdbc.sql("""
                        select version, settings::text, changed_by, reason, changed_at
                        from service_settings where service_id = :service order by version desc limit 1""")
                .param("service", serviceId)
                .query((rs, i) -> new Version(rs.getLong(1), complete(json.readValue(rs.getString(2), Settings.class)),
                        rs.getObject(3, UUID.class), rs.getString(4), rs.getObject(5, OffsetDateTime.class)))
                .optional()
                .orElse(new Version(0, DEFAULTS, null, null, null));
    }

    @Override
    public Version ofCity(UUID cityId) {
        return current(cityId == null ? taxi.blizz.identity.Services.DEFAULT_ID
                : cities.serviceOf(cityId).orElse(taxi.blizz.identity.Services.DEFAULT_ID));
    }

    @Override
    public Version of(Actor subject) {
        return current(services.of(subject).orElse(taxi.blizz.identity.Services.DEFAULT_ID));
    }

    private UUID serviceOfStaff(Actor actor) {
        return services.of(actor).orElseThrow(() -> new DomainException(ErrorCode.ACCESS_DENIED,
                "Not staff of a taxi service"));
    }

    record ChangeRequest(long expectedVersion, Settings settings, String reason) {
    }

    @Override
    public Version change(Actor actor, UUID commandId, long expectedVersion, Settings settings, String reason) {
        staff.requireEveryCity(actor, MANAGE_PERMISSION);
        Settings clean = validate(settings);
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        return commands.execute(new CommandKey(actor, "settings.change", commandId),
                new ChangeRequest(expectedVersion, clean, reason), Version.class, () -> {
                    UUID service = serviceOfStaff(actor);
                    jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))").param("key", "service-settings:" + service)
                            .query().singleRow();
                    Version before = current(service);
                    if (before.version() != expectedVersion) {
                        throw ConflictException.version(before.version(), "The settings changed");
                    }
                    OffsetDateTime now = clock.instant().atOffset(ZoneOffset.UTC);
                    long version = before.version() + 1;
                    jdbc.sql("""
                                    insert into service_settings (version, settings, changed_by, reason, changed_at,
                                                                  service_id)
                                    values (:version, cast(:settings as jsonb), :by, :reason, :now, :service)""")
                            .param("service", service).param("version", version).param("settings", json.writeValueAsString(clean))
                            .param("by", actor.id()).param("reason", reason).param("now", now).update();
                    audit.record(new AuditEntry(actor, "settings.change", "service_settings", Long.toString(version),
                            reason, before.settings(), clean));
                    return new Version(version, clean, actor.id(), reason, now);
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<Version> history(Actor actor, PageCursor after, int limit) {
        staff.require(actor, MANAGE_PERMISSION);
        return jdbc.sql("""
                        select version, settings::text, changed_by, reason, changed_at
                        from service_settings where service_id = :service and version < :afterVersion
                        order by version desc limit :limit""")
                .param("service", serviceOfStaff(actor))
                .param("afterVersion", after == null ? Long.MAX_VALUE : after.number(0))
                .param("limit", Math.max(1, Math.min(limit, PageCursor.MAX_FETCH)))
                .query((rs, i) -> new Version(rs.getLong(1), complete(json.readValue(rs.getString(2), Settings.class)),
                        rs.getObject(3, UUID.class), rs.getString(4), rs.getObject(5, OffsetDateTime.class)))
                .list();
    }

    // ---------------------------------------------------------------- validation (REQ-TEN-07)

    private static Settings validate(Settings s) {
        if (s == null || s.brand() == null || s.languages() == null || s.calls() == null) {
            throw invalid("Brand, languages and calls are required");
        }
        Brand b = s.brand();
        String name = text(b.serviceName());
        if (name == null || name.length() > 60) {
            throw invalid("The service name has 1 to 60 characters");
        }
        String primary = color(b.primaryColor(), true);
        String onPrimary = color(b.onPrimaryColor(), true);
        if (contrast(primary, onPrimary) < 4.5) {
            throw invalid("The text colour on the primary colour must contrast at least 4.5:1 (now "
                    + String.format(Locale.ROOT, "%.2f", contrast(primary, onPrimary)) + ")");
        }
        Brand brand = new Brand(name, primary, onPrimary, color(b.accentColor(), false), https(b.logoUrl()),
                text(b.supportPhone()) == null ? null : PhoneNumber.parse(b.supportPhone()).e164(),
                email(b.supportEmail()), telegram(b.supportTelegram()), https(b.privacyPolicyUrl()), https(b.termsUrl()));

        List<String> enabled = s.languages().enabled().stream().map(l -> l.strip().toLowerCase(Locale.ROOT))
                .distinct().toList();
        String def = text(s.languages().defaultLanguage());
        def = def == null ? null : def.toLowerCase(Locale.ROOT);
        if (enabled.isEmpty() || !SUPPORTED_LANGUAGES.containsAll(enabled) || def == null || !enabled.contains(def)) {
            throw invalid("Languages come from " + SUPPORTED_LANGUAGES + "; the default one must be enabled");
        }

        Calls c = s.calls();
        if (c.mode() == null) {
            throw invalid("The call mode is required");
        }
        String servicePhone = text(c.servicePhone()) == null ? null : PhoneNumber.parse(c.servicePhone()).e164();
        if (c.mode() == CallMode.VIA_SERVICE_NUMBERS && servicePhone == null) {
            throw invalid("Calls through the service need the service phone number");
        }
        Preorders p = s.preorders() == null ? DEFAULTS.preorders() : s.preorders();
        if (p.dispatch() == null || p.thresholdMinutes() < 15 || p.thresholdMinutes() > 1440
                || p.maxDaysAhead() < 1 || p.maxDaysAhead() > MAX_DAYS_AHEAD
                || p.releaseMinutesBefore() < 5 || p.releaseMinutesBefore() > p.thresholdMinutes()
                || p.confirmMinutesBefore() < 5 || p.confirmMinutesBefore() > p.thresholdMinutes()
                || p.confirmWindowMinutes() < 1 || p.confirmWindowMinutes() >= p.confirmMinutesBefore()
                || p.driverCancelUntilMinutesBefore() < p.confirmMinutesBefore()
                || p.driverCancelUntilMinutesBefore() > 10_080) {
            throw invalid("Pre-orders: threshold 15..1440 min, up to " + MAX_DAYS_AHEAD + " days ahead; release and confirmation within the"
                    + " threshold; the confirmation window shorter than the confirmation time; drivers may drop a"
                    + " reservation no later than the confirmation");
        }
        Ratings ratings = s.ratings() == null ? DEFAULTS.ratings() : s.ratings();
        if (ratings.editWindowHours() < 1 || ratings.editWindowHours() > 720) {
            throw invalid("Ratings: edit_window_hours must be between 1 and 720");
        }
        Tips tips = s.tips() == null ? DEFAULTS.tips() : s.tips();
        if (tips.windowHours() < 1 || tips.windowHours() > 720) {
            throw invalid("Tips: window_hours must be between 1 and 720");
        }
        Orders orders = s.orders() == null ? DEFAULTS.orders() : s.orders();
        if (orders.activePerPayer() < 1 || orders.activePerPayer() > 10) {
            throw invalid("Orders: active_per_payer must be between 1 and 10");
        }
        CashNotReceived cash = s.cashNotReceived() == null ? DEFAULTS.cashNotReceived() : s.cashNotReceived();
        if (cash.driverSharePercent() < 0 || cash.driverSharePercent() > 100) {
            throw invalid("Cash not received: driver_share_percent must be between 0 and 100");
        }
        cash = new CashNotReceived(cash.creditDriver(), cash.creditDriver() ? cash.driverSharePercent() : 0);
        AppVersions versions = s.appVersions() == null ? DEFAULTS.appVersions() : s.appVersions();
        versions = new AppVersions(validatePlatform(versions.riderAndroid(), "rider_android"),
                validatePlatform(versions.riderIos(), "rider_ios"),
                validatePlatform(versions.driverAndroid(), "driver_android"),
                validatePlatform(versions.driverIos(), "driver_ios"), versions.requireVersionHeader());
        StaffTopUps topUps = s.staffTopUps() == null ? DEFAULTS.staffTopUps() : s.staffTopUps();
        topUps.dailyMaxPerStaffMinor().forEach((currency, max) -> {
            if (currency == null || !CURRENCY.matcher(currency).matches() || max == null || max < 1
                    || max > MAX_DAILY_TOP_UP_MINOR) {
                throw invalid("Staff top-ups: daily_max_per_staff_minor maps a currency code (e.g. UAH) to 1.."
                        + MAX_DAILY_TOP_UP_MINOR + " minor units");
            }
        });
        RiderDebts debts = s.riderDebts() == null ? DEFAULTS.riderDebts() : s.riderDebts();
        debts.allowedMinor().forEach((currency, allowed) -> {
            if (currency == null || !CURRENCY.matcher(currency).matches() || allowed == null || allowed < 0
                    || allowed > MAX_DAILY_TOP_UP_MINOR) {
                throw invalid("Rider debts: allowed_minor maps a currency code (e.g. UAH) to 0.."
                        + MAX_DAILY_TOP_UP_MINOR + " minor units");
            }
        });
        DriverDiscipline discipline = s.driverDiscipline() == null ? DEFAULTS.driverDiscipline()
                : s.driverDiscipline();
        validate(discipline);
        OfferDiscipline offers = s.offerDiscipline() == null ? DEFAULTS.offerDiscipline() : s.offerDiscipline();
        validate(offers);
        PickupTime pickup = s.pickupTime() == null ? DEFAULTS.pickupTime() : s.pickupTime();
        validate(pickup);
        CancellationFault fault = s.cancellationFault() == null ? DEFAULTS.cancellationFault()
                : s.cancellationFault();
        validate(fault);
        Refunds refunds = s.refunds() == null ? DEFAULTS.refunds() : s.refunds();
        validate(refunds);
        return new Settings(brand, new Languages(def, enabled), new Calls(c.mode(), servicePhone), p, ratings, tips,
                orders, cash, versions, topUps, debts, discipline, offers, pickup, fault, refunds);
    }

    /** No policy for a platform is "0.0.0": every build allowed. */
    private static PlatformVersions validatePlatform(PlatformVersions v, String name) {
        if (v == null) {
            return NO_POLICY;
        }
        if (v.minimumVersion() == null || v.latestVersion() == null || !VERSION.matcher(v.minimumVersion()).matches()
                || !VERSION.matcher(v.latestVersion()).matches()) {
            throw invalid(name + ": versions must be MAJOR.MINOR.PATCH");
        }
        if (compareVersions(v.minimumVersion(), v.latestVersion()) > 0) {
            throw invalid(name + ": minimum_version must not exceed latest_version");
        }
        return v;
    }

    private static final Pattern CURRENCY = Pattern.compile("^[A-Z]{3}$");
    /** The most a daily limit may be set to, in minor units (as in the contract). */
    static final long MAX_DAILY_TOP_UP_MINOR = 1_000_000_000_000L;

    private static final Pattern VERSION = Pattern.compile("^[0-9]{1,6}\\.[0-9]{1,6}\\.[0-9]{1,6}$");

    /** Numeric per part: 1.10.0 is after 1.9.3 (REQ-API-10). Both must match {@link #VERSION}. */
    static int compareVersions(String a, String b) {
        String[] pa = a.split("\\.");
        String[] pb = b.split("\\.");
        for (int i = 0; i < 3; i++) {
            int ca = Integer.parseInt(pa[i]);
            int cb = Integer.parseInt(pb[i]);
            if (ca != cb) {
                return Integer.compare(ca, cb);
            }
        }
        return 0;
    }

    /** Versions saved before a section existed get its defaults. */
    private static Settings complete(Settings s) {
        Preorders preorders = s.preorders() == null ? DEFAULTS.preorders() : s.preorders();
        if (preorders.maxDaysAhead() > MAX_DAYS_AHEAD) {
            // A version saved when a month was allowed.
            preorders = new Preorders(preorders.thresholdMinutes(), MAX_DAYS_AHEAD, preorders.dispatch(),
                    preorders.releaseMinutesBefore(), preorders.confirmMinutesBefore(),
                    preorders.confirmWindowMinutes(), preorders.driverCancelUntilMinutesBefore());
        }
        Ratings ratings = s.ratings() == null ? DEFAULTS.ratings() : s.ratings();
        Tips tips = s.tips() == null ? DEFAULTS.tips() : s.tips();
        Orders orders = s.orders() == null ? DEFAULTS.orders() : s.orders();
        CashNotReceived cash = s.cashNotReceived() == null ? DEFAULTS.cashNotReceived() : s.cashNotReceived();
        AppVersions versions = s.appVersions() == null ? DEFAULTS.appVersions() : s.appVersions();
        StaffTopUps topUps = s.staffTopUps() == null ? DEFAULTS.staffTopUps() : s.staffTopUps();
        RiderDebts debts = s.riderDebts() == null ? DEFAULTS.riderDebts() : s.riderDebts();
        DriverDiscipline discipline = s.driverDiscipline() == null ? DEFAULTS.driverDiscipline()
                : s.driverDiscipline();
        OfferDiscipline offers = s.offerDiscipline() == null ? DEFAULTS.offerDiscipline() : s.offerDiscipline();
        PickupTime pickup = s.pickupTime() == null ? DEFAULTS.pickupTime() : s.pickupTime();
        CancellationFault fault = s.cancellationFault() == null ? DEFAULTS.cancellationFault()
                : s.cancellationFault();
        Refunds refunds = s.refunds() == null ? DEFAULTS.refunds() : s.refunds();
        return new Settings(s.brand(), s.languages(), s.calls(), preorders, ratings, tips, orders, cash, versions,
                topUps, debts, discipline, offers, pickup, fault, refunds);
    }

    /** ADR 0018 A2–A8: positive sums per currency code, the staff term within the super admin's, sane bounds. */
    private static void validate(Refunds r) {
        for (Map<String, Long> sums : List.of(r.minimumMinor(), r.defaultPerRefundMinor(), r.defaultDailyMinor())) {
            for (Map.Entry<String, Long> e : sums.entrySet()) {
                if (e.getKey() == null || !e.getKey().matches("^[A-Z]{3}$") || e.getValue() == null
                        || e.getValue() < 1 || e.getValue() > 1_000_000_000_000L) {
                    throw invalid("Refunds: sums are positive, by three-letter currency code");
                }
            }
        }
        if (r.riderWarningCount() < 1 || r.riderWarningCount() > 100 || r.riderWarningDays() < 1
                || r.riderWarningDays() > 365) {
            throw invalid("Refunds: rider_warning_count 1–100, rider_warning_days 1–365");
        }
        if (r.staffDays() < 1 || r.superAdminDays() < r.staffDays() || r.superAdminDays() > 3650) {
            throw invalid("Refunds: staff_days from 1, super_admin_days not shorter, up to 3650");
        }
        if (r.reminderHours() < 1 || r.reminderHours() > 168 || r.closeAfterDays() < 1 || r.closeAfterDays() > 90) {
            throw invalid("Refunds: reminder_hours 1–168, close_after_days 1–90");
        }
        if (r.bonusValidityDays() < 0 || r.bonusValidityDays() > 3650) {
            throw invalid("Refunds: bonus_validity_days 0 (no end) to 3650");
        }
    }

    /** ADR 0019: a free window of 0 to 60 minutes; lateness of 1 to 120, without a promise 1 to 180. */
    private static void validate(CancellationFault f) {
        if (f.clientFreeMinutes() < 0 || f.clientFreeMinutes() > 60) {
            throw invalid("Cancellation fault: client_free_minutes must be between 0 and 60");
        }
        if (f.driverLateMinutes() < 1 || f.driverLateMinutes() > 120) {
            throw invalid("Cancellation fault: driver_late_minutes must be between 1 and 120");
        }
        if (f.driverLateWithoutPromiseMinutes() < 1 || f.driverLateWithoutPromiseMinutes() > 180) {
            throw invalid("Cancellation fault: driver_late_without_promise_minutes must be between 1 and 180");
        }
    }

    /** ADR 0020: a pickup time threshold of 1 to 120 minutes; 1 to 20 candidates routed (the candidate limit). */
    private static void validate(PickupTime p) {
        if (p.maxMinutes() < 1 || p.maxMinutes() > 120) {
            throw invalid("Pickup time: max_minutes must be between 1 and 120");
        }
        if (p.routedCandidates() < 1 || p.routedCandidates() > 20) {
            throw invalid("Pickup time: routed_candidates must be between 1 and 20");
        }
    }

    /** ADR 0018 B12: the warning threshold above the pause threshold; no zero counts or distances. */
    private static void validate(OfferDiscipline o) {
        if (o.missedInRow() < 1 || o.missedInRow() > 20) {
            throw invalid("Offer discipline: missed_in_row must be between 1 and 20");
        }
        if (o.acceptanceMinOffers() < 1 || o.acceptanceMinOffers() > 1000) {
            throw invalid("Offer discipline: acceptance_min_offers must be between 1 and 1000");
        }
        if (o.acceptancePausePercent() < 1 || o.acceptanceWarnPercent() <= o.acceptancePausePercent()
                || o.acceptanceWarnPercent() > 100) {
            throw invalid("Offer discipline: acceptance_pause_percent from 1, acceptance_warn_percent above it, up to"
                    + " 100");
        }
        if (o.farPickupMeters() < 100 || o.farPickupMeters() > 100_000) {
            throw invalid("Offer discipline: far_pickup_meters must be between 100 and 100000");
        }
    }

    /** ADR 0018 B: no zero or negative windows; the warning comes before the pause; the second pause is the longer. */
    private static void validate(DriverDiscipline d) {
        if (d.graceSeconds() < 0 || d.graceSeconds() > 600) {
            throw invalid("Driver discipline: grace_seconds must be between 0 and 600");
        }
        if (d.pauseAfter() < 2 || d.pauseAfter() > 50 || d.warnAfter() < 1 || d.warnAfter() >= d.pauseAfter()) {
            throw invalid("Driver discipline: pause_after must be 2..50 and warn_after 1..pause_after − 1");
        }
        if (d.firstPauseMinutes() < 1 || d.firstPauseMinutes() > 1440 || d.secondPauseMinutes() < d.firstPauseMinutes()
                || d.secondPauseMinutes() > 1440) {
            throw invalid("Driver discipline: first_pause_minutes 1..1440, second_pause_minutes from it to 1440");
        }
        if (d.escalationDays() < 1 || d.escalationDays() > 30 || d.uncountedFlagDays() < 1
                || d.uncountedFlagDays() > 30) {
            throw invalid("Driver discipline: escalation_days and uncounted_flag_days must be between 1 and 30");
        }
        if (d.rateFlagPercent() < 1 || d.rateFlagPercent() > 100 || d.rateFlagMinAccepted() < 1
                || d.rateFlagMinAccepted() > 1000 || d.uncountedFlagAbove() < 1 || d.uncountedFlagAbove() > 100) {
            throw invalid("Driver discipline: rate_flag_percent 1..100, rate_flag_min_accepted 1..1000,"
                    + " uncounted_flag_above 1..100");
        }
    }

    private static String color(String value, boolean required) {
        String v = text(value);
        if (v == null) {
            if (required) {
                throw invalid("Colours are #RRGGBB");
            }
            return null;
        }
        if (!COLOR.matcher(v).matches()) {
            throw invalid("Colours are #RRGGBB: " + v);
        }
        return v.toUpperCase(Locale.ROOT);
    }

    /** WCAG 2.x contrast ratio of two sRGB colours. */
    static double contrast(String a, String b) {
        double la = luminance(a);
        double lb = luminance(b);
        return (Math.max(la, lb) + 0.05) / (Math.min(la, lb) + 0.05);
    }

    private static double luminance(String hex) {
        double[] c = new double[3];
        for (int i = 0; i < 3; i++) {
            double v = Integer.parseInt(hex.substring(1 + 2 * i, 3 + 2 * i), 16) / 255.0;
            c[i] = v <= 0.03928 ? v / 12.92 : Math.pow((v + 0.055) / 1.055, 2.4);
        }
        return 0.2126 * c[0] + 0.7152 * c[1] + 0.0722 * c[2];
    }

    private static String https(String value) {
        String v = text(value);
        if (v != null && !v.matches("^https://[^\\s]+$")) {
            throw invalid("Links must be https: " + v);
        }
        return v;
    }

    private static String email(String value) {
        String v = text(value);
        if (v != null && !v.matches("[^@\\s]+@[^@\\s]+\\.[^@\\s]+")) {
            throw invalid("Invalid support e-mail");
        }
        return v == null ? null : v.toLowerCase(Locale.ROOT);
    }

    private static String telegram(String value) {
        String v = text(value);
        if (v == null) {
            return null;
        }
        if (!v.matches("@?[A-Za-z0-9_]{5,32}")) {
            throw invalid("Invalid Telegram username");
        }
        return v.startsWith("@") ? v : "@" + v;
    }

    private static String text(String value) {
        return value == null || value.isBlank() ? null : value.strip();
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }
}
