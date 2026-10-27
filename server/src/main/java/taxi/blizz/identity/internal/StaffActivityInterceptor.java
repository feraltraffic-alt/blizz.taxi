package taxi.blizz.identity.internal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.SubjectType;

/**
 * Logs every request to {@code /api/admin/**} and {@code /api/operator/**}, refused ones included (owner
 * decision 27.10.2026). Only the path template and its ids are stored, never the body.
 */
class StaffActivityInterceptor implements HandlerInterceptor {

    private static final String STARTED = StaffActivityInterceptor.class.getName() + ".started";

    private final StaffActivityLog log;

    StaffActivityInterceptor(StaffActivityLog log) {
        this.log = log;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        request.setAttribute(STARTED, System.nanoTime());
        return true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) {
        Object claims = request.getAttribute(BearerAuthenticationInterceptor.CLAIMS_ATTRIBUTE);
        UUID staffId = claims instanceof AccessClaims c && c.actor().type() == SubjectType.STAFF ? c.actor().id() : null;
        String path = request.getRequestURI().substring(request.getContextPath().length());
        String audience = path.startsWith("/api/operator/") ? "operator" : "admin";
        Object template = request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
        Map<String, String> ids = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
        Object started = request.getAttribute(STARTED);
        long durationMs = started instanceof Long s ? (System.nanoTime() - s) / 1_000_000 : 0;
        log.request(staffId, audience, request.getMethod(), template == null ? path : template.toString(), ids,
                response.getStatus(), durationMs, request.getRemoteAddr());
    }
}
