package taxi.blizz.identity.internal;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Base64;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/**
 * Sessions in PostgreSQL. Refresh tokens are 256-bit random values stored only as SHA-256 hashes;
 * every refresh marks the old token used and issues a new one. Presenting a used token again means
 * it leaked, so the whole session is revoked (REQ-AUTH-06) and the event is audited.
 */
@Service
class JdbcSessionService implements SessionService {

    private static final SecureRandom RANDOM = new SecureRandom();
    private static final Set<String> ACTIVE_STATES = Set.of("ACTIVE");

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final AuditLog auditLog;
    private final AuthProperties properties;
    private final AccessTokenCodec codec;
    private final Clock clock;

    JdbcSessionService(JdbcClient jdbc, TransactionTemplate tx, AuditLog auditLog, AuthProperties properties,
                       Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.auditLog = auditLog;
        this.properties = properties;
        this.clock = clock;
        this.codec = new AccessTokenCodec(properties.accessTokenSecret(), properties.instanceId(),
                properties.accessTtl(), clock);
    }

    @Override
    public IssuedSession open(VerifiedSubject subject, String deviceRef) {
        if (!ACTIVE_STATES.contains(subject.accountState())) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "The account cannot sign in");
        }
        Actor actor = subject.actor();
        ApiAudience audience = ApiAudience.forPhoneSignIn(actor.type());
        return tx.execute(status -> {
            OffsetDateTime now = now();
            UUID sessionId = UUID.randomUUID();
            jdbc.sql("""
                            insert into device_session (id, subject_type, subject_id, audience, device_ref,
                                                        created_at, last_refreshed_at, expires_at)
                            values (:id, :type, :subjectId, :audience, :deviceRef, :now, :now, :expiresAt)
                            """)
                    .param("id", sessionId)
                    .param("type", actor.type().name())
                    .param("subjectId", actor.id())
                    .param("audience", audience.value())
                    .param("deviceRef", deviceRef)
                    .param("now", now)
                    .param("expiresAt", now.plus(properties.maxSessionAge()))
                    .update();
            return issue(sessionId, actor, audience, now, now.plus(properties.maxSessionAge()));
        });
    }

    @Override
    public IssuedSession refresh(String refreshToken) {
        Refreshed result = tx.execute(status -> rotate(refreshToken));
        if (result == null || result.session() == null) {
            throw new DomainException(ErrorCode.UNAUTHENTICATED, "The session is no longer valid");
        }
        return result.session();
    }

    private Refreshed rotate(String refreshToken) {
        if (refreshToken == null || refreshToken.isBlank()) {
            return Refreshed.rejected();
        }
        OffsetDateTime now = now();
        Optional<StoredToken> found = jdbc.sql("""
                        select t.session_id, t.expires_at as token_expires_at, t.used_at,
                               s.subject_type, s.subject_id, s.audience, s.expires_at as session_expires_at,
                               s.revoked_at
                        from refresh_token t join device_session s on s.id = t.session_id
                        where t.token_hash = :hash
                        for update of t, s
                        """)
                .param("hash", hash(refreshToken))
                .query((rs, i) -> new StoredToken(
                        rs.getObject("session_id", UUID.class),
                        rs.getObject("token_expires_at", OffsetDateTime.class),
                        rs.getObject("used_at", OffsetDateTime.class),
                        new Actor(SubjectType.valueOf(rs.getString("subject_type")),
                                rs.getObject("subject_id", UUID.class)),
                        ApiAudience.fromValue(rs.getString("audience")),
                        rs.getObject("session_expires_at", OffsetDateTime.class),
                        rs.getObject("revoked_at", OffsetDateTime.class)))
                .optional();
        if (found.isEmpty()) {
            return Refreshed.rejected();
        }
        StoredToken token = found.get();
        if (token.revokedAt() != null) {
            return Refreshed.rejected();
        }
        if (token.usedAt() != null) {
            revoke(token.sessionId(), "REFRESH_TOKEN_REUSE", now);
            auditLog.record(new AuditEntry(Actor.system(), "session.revoked.refresh_reuse", "device_session",
                    token.sessionId().toString(), "A refresh token was presented again after rotation",
                    null, Map.of("subject_type", token.actor().type().name(),
                    "subject_id", token.actor().id().toString())));
            return Refreshed.rejected();
        }
        if (!now.isBefore(token.tokenExpiresAt()) || !now.isBefore(token.sessionExpiresAt())
                || !accountActive(token.actor())) {
            return Refreshed.rejected();
        }

        jdbc.sql("update refresh_token set used_at = :now where token_hash = :hash")
                .param("now", now)
                .param("hash", hash(refreshToken))
                .update();
        jdbc.sql("update device_session set last_refreshed_at = :now where id = :id")
                .param("now", now)
                .param("id", token.sessionId())
                .update();
        return new Refreshed(issue(token.sessionId(), token.actor(), token.audience(), now, token.sessionExpiresAt()));
    }

    @Override
    public void logout(String refreshToken) {
        if (refreshToken == null || refreshToken.isBlank()) {
            return;
        }
        tx.executeWithoutResult(status -> jdbc.sql("select session_id from refresh_token where token_hash = :hash")
                .param("hash", hash(refreshToken))
                .query(UUID.class)
                .optional()
                .ifPresent(sessionId -> revoke(sessionId, "LOGOUT", now())));
    }

    @Override
    public int revokeAll(Actor subject, String reason) {
        Integer count = tx.execute(status -> jdbc.sql("""
                        update device_session set revoked_at = :now, revoke_reason = :reason
                        where subject_type = :type and subject_id = :id and revoked_at is null
                        """)
                .param("now", now())
                .param("reason", reason)
                .param("type", subject.type().name())
                .param("id", subject.id())
                .update());
        return count == null ? 0 : count;
    }

    @Override
    public Optional<AccessClaims> verifyAccess(String accessToken, ApiAudience expectedAudience) {
        return codec.verify(accessToken, expectedAudience).filter(claims -> jdbc.sql("""
                        select count(*) from device_session
                        where id = :id and revoked_at is null and expires_at > :now
                        """)
                .param("id", claims.sessionId())
                .param("now", now())
                .query(Integer.class)
                .single() == 1);
    }

    private IssuedSession issue(UUID sessionId, Actor actor, ApiAudience audience, OffsetDateTime now,
                                OffsetDateTime sessionExpiresAt) {
        String refreshToken = newRefreshToken();
        OffsetDateTime refreshExpiresAt = earliest(now.plus(properties.refreshTtl()), sessionExpiresAt);
        jdbc.sql("""
                        insert into refresh_token (token_hash, session_id, issued_at, expires_at)
                        values (:hash, :sessionId, :now, :expiresAt)
                        """)
                .param("hash", hash(refreshToken))
                .param("sessionId", sessionId)
                .param("now", now)
                .param("expiresAt", refreshExpiresAt)
                .update();
        AccessTokenCodec.Signed access = codec.sign(actor, audience, sessionId);
        return new IssuedSession(sessionId, actor, audience, access.token(), access.expiresAt(),
                refreshToken, refreshExpiresAt);
    }

    private boolean accountActive(Actor actor) {
        String table = switch (actor.type()) {
            case CLIENT -> "client";
            case DRIVER -> "driver";
            default -> null;
        };
        if (table == null) {
            return false;
        }
        String state = jdbc.sql("select account_state from " + table + " where id = :id")
                .param("id", actor.id())
                .query(String.class)
                .optional()
                .orElse(null);
        return state != null && ACTIVE_STATES.contains(state);
    }

    private void revoke(UUID sessionId, String reason, OffsetDateTime now) {
        jdbc.sql("""
                        update device_session set revoked_at = :now, revoke_reason = :reason
                        where id = :id and revoked_at is null
                        """)
                .param("now", now)
                .param("reason", reason)
                .param("id", sessionId)
                .update();
    }

    private static OffsetDateTime earliest(OffsetDateTime a, OffsetDateTime b) {
        return a.isBefore(b) ? a : b;
    }

    private static String newRefreshToken() {
        byte[] bytes = new byte[32];
        RANDOM.nextBytes(bytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }

    private static byte[] hash(String token) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(token.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 is not available", e);
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    private record StoredToken(UUID sessionId, OffsetDateTime tokenExpiresAt, OffsetDateTime usedAt, Actor actor,
                               ApiAudience audience, OffsetDateTime sessionExpiresAt, OffsetDateTime revokedAt) {
    }

    private record Refreshed(IssuedSession session) {
        static Refreshed rejected() {
            return new Refreshed(null);
        }
    }
}
