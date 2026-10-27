package taxi.blizz.identity.internal;

import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** {@code GET /api/rider/v1/me} and {@code /api/driver/v1/me}: who the token belongs to. */
@RestController
class MeController {

    private final JdbcClient jdbc;

    MeController(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    /** {@code blockedUntil}: a blocked rider's block end, null when it has none or the rider is not blocked. */
    record Me(String subjectType, UUID subjectId, UUID sessionId, String accountState,
              java.time.OffsetDateTime blockedUntil) {
    }

    @GetMapping("/api/rider/v1/me")
    Me rider(AccessClaims claims) {
        return me(claims, "client");
    }

    @GetMapping("/api/driver/v1/me")
    Me driver(AccessClaims claims) {
        return me(claims, "driver");
    }

    private Me me(AccessClaims claims, String table) {
        String state = jdbc.sql("select account_state from " + table + " where id = :id")
                .param("id", claims.actor().id())
                .query(String.class)
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.UNAUTHENTICATED, "Account not found"));
        java.time.OffsetDateTime blockedUntil = "client".equals(table) && "BLOCKED".equals(state)
                ? jdbc.sql("select blocked_until from client where id = :id").param("id", claims.actor().id())
                        .query(java.time.OffsetDateTime.class).optional().orElse(null)
                : null;
        return new Me(claims.actor().type().name(), claims.actor().id(), claims.sessionId(), state, blockedUntil);
    }
}
