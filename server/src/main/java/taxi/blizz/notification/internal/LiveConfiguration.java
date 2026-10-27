package taxi.blizz.notification.internal;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;

/** {@code /ws/v1/rider} and {@code /ws/v1/driver}: one live channel per app audience. */
@Configuration(proxyBeanMethods = false)
@EnableWebSocket
class LiveConfiguration implements WebSocketConfigurer {

    private final LiveSessions sessions;
    private final SessionService auth;

    LiveConfiguration(LiveSessions sessions, SessionService auth) {
        this.sessions = sessions;
        this.auth = auth;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        LiveHandler handler = new LiveHandler(sessions);
        registry.addHandler(handler, "/ws/v1/rider").addInterceptors(new LiveHandshake(auth, ApiAudience.RIDER))
                .setAllowedOriginPatterns("*");
        registry.addHandler(handler, "/ws/v1/driver").addInterceptors(new LiveHandshake(auth, ApiAudience.DRIVER))
                .setAllowedOriginPatterns("*");
    }
}
