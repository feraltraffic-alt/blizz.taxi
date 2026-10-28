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
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import taxi.blizz.identity.SessionService;
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

    /** The session was revoked or a right it needs was taken away (REQ-NTF-05); signing in again may help. */
    static final CloseStatus ACCESS_REVOKED = new CloseStatus(4403, "Access revoked");

    static final String DECORATED = "blizz.live.decorated";

    private final Map<UUID, Set<WebSocketSession>> bySubject = new ConcurrentHashMap<>();
    private final Clock clock;
    private final SessionService auth;
    private final LiveAccess access;

    LiveSessions(Clock clock, SessionService auth, LiveAccess access) {
        this.clock = clock;
        this.auth = auth;
        this.access = access;
    }

    /**
     * Closes the connections whose session was revoked (logout, a blocked account, a suspended staff member) or that
     * lost the right they need, every {@code blizz.live.recheck} (15 s) — not only when the token expires (REQ-NTF-05).
     * One query for all the sessions of this instance. Returns how many were closed.
     */
    @Scheduled(fixedDelayString = "${blizz.live.recheck:PT15S}", initialDelayString = "${blizz.live.recheck:PT15S}")
    int recheck() {
        java.util.List<WebSocketSession> all = bySubject.values().stream().flatMap(Set::stream)
                .filter(WebSocketSession::isOpen).toList();
        if (all.isEmpty()) {
            return 0;
        }
        Set<UUID> open;
        try {
            open = auth.openOf(all.stream().map(LiveSessions::claims).filter(java.util.Objects::nonNull)
                    .map(AccessClaims::sessionId).collect(java.util.stream.Collectors.toSet()));
        } catch (RuntimeException e) {
            log.warn("Live connections not rechecked: {}", e.getClass().getSimpleName());
            return 0;
        }
        int closed = 0;
        for (WebSocketSession session : all) {
            AccessClaims claims = claims(session);
            try {
                if (claims == null || !open.contains(claims.sessionId()) || !access.allowed(claims)) {
                    session.close(ACCESS_REVOKED);
                    closed++;
                }
            } catch (IOException | RuntimeException e) {
                log.debug("Live connection not closed: {}", e.toString());
            }
        }
        return closed;
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
