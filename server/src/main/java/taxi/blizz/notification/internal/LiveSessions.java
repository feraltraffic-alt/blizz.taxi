package taxi.blizz.notification.internal;

import java.io.IOException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.ConcurrentWebSocketSessionDecorator;
import taxi.blizz.identity.AccessClaims;

/** The live connections of this instance by subject; a subject may have several (two devices, a web tab). */
@Component
class LiveSessions {

    private static final Logger log = LoggerFactory.getLogger(LiveSessions.class);

    /** The client reconnects with a fresh access token (REQ-AUTH-07: an expired or revoked session gets nothing). */
    static final CloseStatus TOKEN_EXPIRED = new CloseStatus(4401, "Access token expired");

    static final String DECORATED = "blizz.live.decorated";

    private final Map<UUID, Set<WebSocketSession>> bySubject = new ConcurrentHashMap<>();
    private final Clock clock;

    LiveSessions(Clock clock) {
        this.clock = clock;
    }

    WebSocketSession add(WebSocketSession raw) {
        WebSocketSession session = new ConcurrentWebSocketSessionDecorator(raw, 5_000, 256 * 1024);
        raw.getAttributes().put(DECORATED, session);
        bySubject.computeIfAbsent(claims(raw).actor().id(), id -> ConcurrentHashMap.newKeySet()).add(session);
        return session;
    }

    void remove(WebSocketSession raw) {
        AccessClaims claims = claims(raw);
        if (claims == null) {
            return;
        }
        Set<WebSocketSession> sessions = bySubject.get(claims.actor().id());
        if (sessions != null) {
            sessions.removeIf(s -> s.getId().equals(raw.getId()));
            if (sessions.isEmpty()) {
                bySubject.remove(claims.actor().id(), sessions);
            }
        }
    }

    /** Sends to every live connection of the subjects on this instance; returns how many got it. */
    int send(Set<UUID> subjects, String text) {
        int sent = 0;
        OffsetDateTime now = OffsetDateTime.now(clock);
        for (UUID subject : subjects) {
            for (WebSocketSession session : bySubject.getOrDefault(subject, Set.of())) {
                try {
                    if (!session.isOpen()) {
                        continue;
                    }
                    AccessClaims claims = claims(session);
                    if (claims == null || !now.isBefore(claims.expiresAt())) {
                        session.close(TOKEN_EXPIRED);
                        continue;
                    }
                    session.sendMessage(new TextMessage(text));
                    sent++;
                } catch (IOException | RuntimeException e) {
                    log.debug("Live message to {} not delivered: {}", subject, e.toString());
                }
            }
        }
        return sent;
    }

    int connections() {
        return bySubject.values().stream().mapToInt(Set::size).sum();
    }

    static AccessClaims claims(WebSocketSession session) {
        return (AccessClaims) session.getAttributes().get(LiveHandshake.CLAIMS);
    }
}
