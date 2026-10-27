package taxi.blizz.notification.internal;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * The live channel (section 20): the server only pushes; commands stay REST with idempotency (REQ-NTF-06). The client
 * may send "ping" to keep the connection open through proxies.
 */
class LiveHandler extends TextWebSocketHandler {

    private final LiveSessions sessions;

    LiveHandler(LiveSessions sessions) {
        this.sessions = sessions;
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        WebSocketSession registered = sessions.add(session);
        registered.sendMessage(new TextMessage("{\"type\":\"Connected\"}"));
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        if ("ping".equalsIgnoreCase(message.getPayload().strip())) {
            // Through the same decorator as the pushes, so two sends never overlap on one connection.
            WebSocketSession out = (WebSocketSession) session.getAttributes().getOrDefault(LiveSessions.DECORATED, session);
            out.sendMessage(new TextMessage("{\"type\":\"Pong\"}"));
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        sessions.remove(session);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) {
        sessions.remove(session);
    }
}
