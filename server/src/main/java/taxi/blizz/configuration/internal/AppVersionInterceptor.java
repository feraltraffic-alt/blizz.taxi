package taxi.blizz.configuration.internal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.regex.Pattern;
import org.springframework.web.servlet.HandlerInterceptor;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * Checks {@code X-App-Platform} and {@code X-App-Version} on every request (REQ-API-10).
 * An outdated app is refused only on the four actions that start new work; everything else,
 * including trip commands and location, still works so a trip under way is not stranded.
 */
class AppVersionInterceptor implements HandlerInterceptor {

    private static final Pattern VERSION = Pattern.compile("^[0-9]+\\.[0-9]+\\.[0-9]+$");
    private static final String[] BLOCKED = {
            "/api/rider/v1/quotes",
            "/api/rider/v1/orders",
            "/api/driver/v1/work-sessions",
            "/api/driver/v1/offers/"
    };

    private final ServiceSettings settings;

    AppVersionInterceptor(ServiceSettings settings) {
        this.settings = settings;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String path = request.getRequestURI();
        if (path.startsWith("/api/admin/") || path.startsWith("/api/operator/") || path.startsWith("/api/config/")) {
            return true;
        }
        String platform = request.getHeader("X-App-Platform");
        String version = request.getHeader("X-App-Version");
        ServiceSettings.AppVersions policy = settings.current().settings().appVersions();
        if (platform == null && version == null) {
            if (policy != null && policy.requireVersionHeader() && isBlocked(path, request.getMethod())) {
                throw new DomainException(ErrorCode.UPGRADE_REQUIRED, "App version header is required");
            }
            return true;
        }
        if (version != null && !VERSION.matcher(version).matches()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "X-App-Version must be MAJOR.MINOR.PATCH");
        }
        if (platform == null || version == null) {
            return true;
        }
        ServiceSettings.PlatformVersions pv = platformOf(policy, platform);
        if (pv == null || pv.minimumVersion() == null) {
            return true;
        }
        if (JdbcServiceSettings.compareVersions(version, pv.minimumVersion()) < 0
                && isBlocked(path, request.getMethod())) {
            throw new DomainException(ErrorCode.UPGRADE_REQUIRED,
                    "Update required: minimum " + pv.minimumVersion());
        }
        return true;
    }

    private static boolean isBlocked(String path, String method) {
        if ("POST".equals(method) && (path.equals("/api/rider/v1/quotes") || path.equals("/api/rider/v1/orders"))) {
            return true;
        }
        if ("POST".equals(method) && path.startsWith("/api/driver/v1/work-sessions")) {
            return true;
        }
        if ("POST".equals(method) && path.matches("/api/driver/v1/offers/[^/]+/accept")) {
            return true;
        }
        return false;
    }

    private static ServiceSettings.PlatformVersions platformOf(ServiceSettings.AppVersions policy, String platform) {
        if (policy == null) {
            return null;
        }
        return switch (platform) {
            case "RIDER_ANDROID" -> policy.riderAndroid();
            case "RIDER_IOS" -> policy.riderIos();
            case "DRIVER_ANDROID" -> policy.driverAndroid();
            case "DRIVER_IOS" -> policy.driverIos();
            default -> null;
        };
    }
}
