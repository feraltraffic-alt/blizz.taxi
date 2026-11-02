package taxi.blizz.configuration.internal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Set;
import java.util.regex.Pattern;
import org.springframework.web.servlet.HandlerInterceptor;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.UpgradeRequiredException;

/**
 * App version and forced update (REQ-API-10). Only the four actions that start new work are checked: a rider's quote
 * and order, a driver going online and accepting an offer. An app below its platform's minimum gets 426
 * UPGRADE_REQUIRED there. Everything else, a trip under way included, never looks at the version, so an outdated app
 * finishes what it started. On a checked action a malformed version or a platform of the other app is 400; a missing
 * header passes unless staff require it.
 */
class AppVersionInterceptor implements HandlerInterceptor {

    static final String PLATFORM = "X-App-Platform";
    static final String VERSION_HEADER = "X-App-Version";
    private static final Pattern VERSION = Pattern.compile("^[0-9]{1,6}\\.[0-9]{1,6}\\.[0-9]{1,6}$");
    private static final Pattern ACCEPT = Pattern.compile("^/api/driver/v1/offers/[^/]+/accept$");

    private enum App {
        RIDER(Set.of("RIDER_ANDROID", "RIDER_IOS")), DRIVER(Set.of("DRIVER_ANDROID", "DRIVER_IOS"));

        final Set<String> platforms;

        App(Set<String> platforms) {
            this.platforms = platforms;
        }
    }

    private final ServiceSettings settings;

    AppVersionInterceptor(ServiceSettings settings) {
        this.settings = settings;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // The decoded path, as the handler mapping sees it: a percent-encoded "/api/rider/v1/%6Frders" is routed to
        // the orders handler and must be checked like it (audit 29.10.2026).
        App app = checked(request.getMethod(),
                org.springframework.web.util.UrlPathHelper.defaultInstance.getPathWithinApplication(request));
        if (app == null) {
            return true;
        }
        // The version policy of the caller's taxi service (ADR 0016); the first service's before sign-in.
        Object claims = request.getAttribute(taxi.blizz.identity.AccessClaims.class.getName());
        java.util.UUID service = claims instanceof taxi.blizz.identity.AccessClaims c && c.serviceId() != null
                ? c.serviceId() : taxi.blizz.identity.Services.DEFAULT_ID;
        ServiceSettings.AppVersions policy = settings.current(service).settings().appVersions();
        String platform = request.getHeader(PLATFORM);
        String version = request.getHeader(VERSION_HEADER);
        if (platform == null || version == null) {
            if (policy.requireVersionHeader()) {
                throw new UpgradeRequiredException(highestMinimum(policy, app));
            }
            return true;
        }
        if (!VERSION.matcher(version).matches()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, VERSION_HEADER + " must be MAJOR.MINOR.PATCH");
        }
        if (!app.platforms.contains(platform)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, PLATFORM + " must be one of " + app.platforms);
        }
        String minimum = of(policy, platform).minimumVersion();
        if (JdbcServiceSettings.compareVersions(version, minimum) < 0) {
            throw new UpgradeRequiredException(minimum);
        }
        return true;
    }

    /** Exactly the four actions that start new work; null for everything else. */
    private static App checked(String method, String path) {
        if (!"POST".equals(method)) {
            return null;
        }
        if (path.equals("/api/rider/v1/quotes") || path.equals("/api/rider/v1/orders")) {
            return App.RIDER;
        }
        if (path.equals("/api/driver/v1/work-sessions") || ACCEPT.matcher(path).matches()) {
            return App.DRIVER;
        }
        return null;
    }

    private static ServiceSettings.PlatformVersions of(ServiceSettings.AppVersions policy, String platform) {
        return switch (platform) {
            case "RIDER_ANDROID" -> policy.riderAndroid();
            case "RIDER_IOS" -> policy.riderIos();
            case "DRIVER_ANDROID" -> policy.driverAndroid();
            default -> policy.driverIos();
        };
    }

    /** Without the headers the platform is unknown: the higher of the app's two minimums is what it needs. */
    private static String highestMinimum(ServiceSettings.AppVersions policy, App app) {
        String a = app == App.RIDER ? policy.riderAndroid().minimumVersion() : policy.driverAndroid().minimumVersion();
        String b = app == App.RIDER ? policy.riderIos().minimumVersion() : policy.driverIos().minimumVersion();
        return JdbcServiceSettings.compareVersions(a, b) >= 0 ? a : b;
    }
}
