package taxi.blizz.configuration.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Locale;
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
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
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
            new AppVersions(NO_POLICY, NO_POLICY, NO_POLICY, NO_POLICY, false));

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

    JdbcServiceSettings(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit, JsonMapper json,
                        Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.json = json;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public Version current() {
        return jdbc.sql("""
                        select version, settings::text, changed_by, reason, changed_at
                        from service_settings order by version desc limit 1""")
                .query((rs, i) -> new Version(rs.getLong(1), complete(json.readValue(rs.getString(2), Settings.class)),
                        rs.getObject(3, UUID.class), rs.getString(4), rs.getObject(5, OffsetDateTime.class)))
                .optional()
                .orElse(new Version(0, DEFAULTS, null, null, null));
    }

    record ChangeRequest(long expectedVersion, Settings settings, String reason) {
    }

    @Override
    public Version change(Actor actor, UUID commandId, long expectedVersion, Settings settings, String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        Settings clean = validate(settings);
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        return commands.execute(new CommandKey(actor, "settings.change", commandId),
                new ChangeRequest(expectedVersion, clean, reason), Version.class, () -> {
                    jdbc.sql("select pg_advisory_xact_lock(hashtext('service-settings'))").query().singleRow();
                    Version before = current();
                    if (before.version() != expectedVersion) {
                        throw new DomainException(ErrorCode.VERSION_CONFLICT, "The settings changed");
                    }
                    OffsetDateTime now = clock.instant().atOffset(ZoneOffset.UTC);
                    long version = before.version() + 1;
                    jdbc.sql("""
                                    insert into service_settings (version, settings, changed_by, reason, changed_at)
                                    values (:version, cast(:settings as jsonb), :by, :reason, :now)""")
                            .param("version", version).param("settings", json.writeValueAsString(clean))
                            .param("by", actor.id()).param("reason", reason).param("now", now).update();
                    audit.record(new AuditEntry(actor, "settings.change", "service_settings", Long.toString(version),
                            reason, before.settings(), clean));
                    return new Version(version, clean, actor.id(), reason, now);
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<Version> history(Actor actor, int limit) {
        staff.require(actor, MANAGE_PERMISSION);
        return jdbc.sql("""
                        select version, settings::text, changed_by, reason, changed_at
                        from service_settings order by version desc limit :limit""")
                .param("limit", Math.max(1, Math.min(limit, 100)))
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
        return new Settings(brand, new Languages(def, enabled), new Calls(c.mode(), servicePhone), p, ratings, tips,
                orders, cash, versions);
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
        return new Settings(s.brand(), s.languages(), s.calls(), preorders, ratings, tips, orders, cash, versions);
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
