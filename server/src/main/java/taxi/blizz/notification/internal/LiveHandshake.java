package taxi.blizz.notification.internal;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;

/**
 * Opens a live connection only with an access token of the audience of the address (REQ-USR-08): the
 * {@code Authorization: Bearer} header (mobile apps), or, where a browser cannot set headers, the subprotocol
 * {@code blizz.bearer.<token>} next to {@link LiveHandler#PROTOCOL}, which the server answers. Never in the address
 * (REQ-SEC-08): a query string ends up in proxy logs, so {@code ?access_token=} is refused.
 */
class LiveHandshake implements HandshakeInterceptor {

    static final String CLAIMS = "blizz.live.claims";

    private final SessionService sessions;
    private final ApiAudience audience;
    private final java.util.function.Predicate<AccessClaims> allowed;

    LiveHandshake(SessionService sessions, ApiAudience audience) {
        this(sessions, audience, claims -> true);
    }

    /** {@code allowed}: a further condition on who may connect (an operator must take calls). */
    LiveHandshake(SessionService sessions, ApiAudience audience, java.util.function.Predicate<AccessClaims> allowed) {
        this.sessions = sessions;
        this.audience = audience;
        this.allowed = allowed;
    }

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler handler,
                                   Map<String, Object> attributes) {
        Optional<AccessClaims> claims = token(request).flatMap(token -> sessions.verifyAccess(token, audience));
        if (claims.isEmpty()) {
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return false;
        }
        if (!allowed.test(claims.get())) {
            response.setStatusCode(HttpStatus.FORBIDDEN);
            return false;
        }
        attributes.put(CLAIMS, claims.get());
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler handler,
                               Exception exception) {
        // nothing
    }

    static final String BEARER_PROTOCOL = "blizz.bearer.";

    private static Optional<String> token(ServerHttpRequest request) {
        List<String> headers = request.getHeaders().getOrEmpty("Authorization");
        for (String header : headers) {
            if (header.regionMatches(true, 0, "Bearer ", 0, 7)) {
                return Optional.of(header.substring(7).strip());
            }
        }
        for (String protocol : request.getHeaders().getOrEmpty("Sec-WebSocket-Protocol")) {
            for (String one : protocol.split(",")) {
                String value = one.strip();
                if (value.startsWith(BEARER_PROTOCOL)) {
                    return Optional.of(value.substring(BEARER_PROTOCOL.length()));
                }
            }
        }
        return Optional.empty();
    }
}
