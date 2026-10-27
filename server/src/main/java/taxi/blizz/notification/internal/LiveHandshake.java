package taxi.blizz.notification.internal;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;
import org.springframework.web.util.UriComponentsBuilder;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;

/**
 * Opens a live connection only with an access token of the audience of the address (REQ-USR-08): the
 * {@code Authorization: Bearer} header (mobile apps), or {@code access_token} in the query where a browser cannot
 * set headers.
 */
class LiveHandshake implements HandshakeInterceptor {

    static final String CLAIMS = "blizz.live.claims";

    private final SessionService sessions;
    private final ApiAudience audience;

    LiveHandshake(SessionService sessions, ApiAudience audience) {
        this.sessions = sessions;
        this.audience = audience;
    }

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler handler,
                                   Map<String, Object> attributes) {
        Optional<AccessClaims> claims = token(request).flatMap(token -> sessions.verifyAccess(token, audience));
        if (claims.isEmpty()) {
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
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

    private static Optional<String> token(ServerHttpRequest request) {
        List<String> headers = request.getHeaders().getOrEmpty("Authorization");
        for (String header : headers) {
            if (header.regionMatches(true, 0, "Bearer ", 0, 7)) {
                return Optional.of(header.substring(7).strip());
            }
        }
        return Optional.ofNullable(UriComponentsBuilder.fromUri(request.getURI()).build()
                .getQueryParams().getFirst("access_token"));
    }
}
