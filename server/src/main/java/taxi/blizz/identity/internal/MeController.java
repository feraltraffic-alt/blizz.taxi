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

    /** {@code phone} and {@code name}: null for an anonymized account and for a name never given (#241). */
    record Me(String subjectType, UUID subjectId, UUID sessionId, String accountState, String phone, String name) {
    }

    private record Row(String state, String phone, String name) {
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
        Row row = jdbc.sql("select account_state, phone_normalized, name from " + table + " where id = :id")
                .param("id", claims.actor().id())
                .query((rs, i) -> new Row(rs.getString(1), rs.getString(2), rs.getString(3)))
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.UNAUTHENTICATED, "Account not found"));
        String name = row.name() == null || row.name().isBlank() ? null : row.name();
        return new Me(claims.actor().type().name(), claims.actor().id(), claims.sessionId(), row.state(), row.phone(),
                name);
    }
}
