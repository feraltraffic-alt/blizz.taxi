package taxi.blizz.identity.internal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Optional;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.HandlerInterceptor;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * Authenticates every request to {@code /api/{audience}/v1/**} by bearer token for exactly that
 * audience (REQ-AUTH-01, REQ-USR-08). Runs inside the dispatcher, so failures are rendered by the
 * common Problem Details handler. Revoked sessions and blocked accounts are refused immediately,
 * not only when the access token expires (REQ-AUTH-07).
 */
class BearerAuthenticationInterceptor implements HandlerInterceptor {

    static final String CLAIMS_ATTRIBUTE = AccessClaims.class.getName();
    private static final String BEARER = "Bearer ";

    private final SessionService sessions;

    BearerAuthenticationInterceptor(SessionService sessions) {
        this.sessions = sessions;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        ApiAudience audience = audienceOf(request);
        String header = request.getHeader(HttpHeaders.AUTHORIZATION);
        Optional<AccessClaims> claims = header != null && header.startsWith(BEARER)
                ? sessions.verifyAccess(header.substring(BEARER.length()).strip(), audience)
                : Optional.empty();
        if (claims.isEmpty()) {
            response.setHeader(HttpHeaders.WWW_AUTHENTICATE, "Bearer");
            throw new DomainException(ErrorCode.UNAUTHENTICATED, "A valid access token is required");
        }
        request.setAttribute(CLAIMS_ATTRIBUTE, claims.get());
        return true;
    }

    private static ApiAudience audienceOf(HttpServletRequest request) {
        String path = request.getRequestURI().substring(request.getContextPath().length());
        String[] segments = path.split("/");
        // "", "api", "{audience}", "v1", ...
        if (segments.length > 2) {
            try {
                return ApiAudience.fromValue(segments[2]);
            } catch (IllegalArgumentException ignored) {
                // fall through
            }
        }
        throw new DomainException(ErrorCode.NOT_FOUND, "Unknown API");
    }
}
