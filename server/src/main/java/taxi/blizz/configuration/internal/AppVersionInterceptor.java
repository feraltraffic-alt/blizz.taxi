package taxi.blizz.configuration.internal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.regex.Pattern;
import org.springframework.web.servlet.HandlerInterceptor;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.UpgradeRequiredException;

/**
 * Checks {@code X-App-Platform} and {@code X-App-Version} (REQ-API-10).
 * An outdated or missing (when required) version is refused only on the four actions that start
 * new work. Everything else, including trip commands, heartbeats and location, still works.
 */
class AppVersionInterceptor implements HandlerInterceptor {

    private static final Pattern VERSION = Pattern.compile("^[0-9]+\\.[0-9]+\\.[0-9]+$");

    private final ServiceSettings settings;

    AppVersionInterceptor(ServiceSettings settings) {
        this.settings = settings;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String path = request.getRequestURI();
        String method = request.getMethod();
        if (path.startsWith("/api/admin/") || path.startsWith("/api/operator/") || path.startsWith("/api/config/")) {
            return true;
        }
        boolean checked = isChecked(path, method);
        String platform = request.getHeader("X-App-Platform");
        String version = request.getHeader("X-App-Version");
        ServiceSettings.AppVersions policy = settings.current().settings().appVersions();
        if (!checked) {
            return true;
        }
        if (version != null && !VERSION.matcher(version).matches()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "X-App-Version must be MAJOR.MINOR.PATCH");
        }
        if (platform == null && version == null) {
            if (policy != null && policy.requireVersionHeader()) {
                throw new UpgradeRequiredException("0.0.0");
            }
            return true;
        }
        if (platform == null || version == null) {
            return true;
        }
        ServiceSettings.PlatformVersions pv = platformOf(policy, platform);
        if (pv == null || pv.minimumVersion() == null) {
            return true;
        }
        if (JdbcServiceSettings.compareVersions(version, pv.minimumVersion()) < 0) {
            throw new UpgradeRequiredException(pv.minimumVersion());
        }
        return true;
    }

    /** Exactly the four actions that start new work. */
    private static boolean isChecked(String path, String method) {
        if (!"POST".equals(method)) {
            return false;
        }
        return path.equals("/api/rider/v1/quotes")
                || path.equals("/api/rider/v1/orders")
                || path.equals("/api/driver/v1/work-sessions")
                || path.matches("/api/driver/v1/offers/[^/]+/accept");
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
