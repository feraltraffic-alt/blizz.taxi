package taxi.blizz.notification.internal;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;

/** {@code /ws/v1/rider}, {@code /ws/v1/driver} and {@code /ws/v1/operator}: one live channel per audience. */
@Configuration(proxyBeanMethods = false)
@EnableWebSocket
class LiveConfiguration implements WebSocketConfigurer {

    private final LiveSessions sessions;
    private final SessionService auth;
    private final LiveAccess access;

    LiveConfiguration(LiveSessions sessions, SessionService auth, LiveAccess access) {
        this.sessions = sessions;
        this.auth = auth;
        this.access = access;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        LiveHandler handler = new LiveHandler(sessions);
        registry.addHandler(handler, "/ws/v1/rider").addInterceptors(new LiveHandshake(auth, ApiAudience.RIDER))
                .setAllowedOriginPatterns("*");
        registry.addHandler(handler, "/ws/v1/driver").addInterceptors(new LiveHandshake(auth, ApiAudience.DRIVER))
                .setAllowedOriginPatterns("*");
        // The operator workstation: card-pop of incoming calls (issue #64).
        // Only staff who take calls in some city; the card-pop itself goes to who holds the right at that moment.
        registry.addHandler(handler, "/ws/v1/operator").addInterceptors(new LiveHandshake(auth, ApiAudience.OPERATOR,
                        access::allowed))
                .setAllowedOriginPatterns("*");
    }
}
