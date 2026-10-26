package taxi.blizz.identity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** REQ-AUTH-06, REQ-AUTH-07, REQ-USR-08, AC-03 (revoked session). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class SessionServiceTests {

    @Autowired
    SessionService sessions;
    @Autowired
    JdbcClient jdbc;

    private VerifiedSubject newClient(String state) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, :state, true, now(), now())""")
                .param("id", id)
                .param("phone", "+48" + String.format("%09d", Math.floorMod(id.hashCode(), 1_000_000_000)))
                .param("state", state)
                .update();
        return new VerifiedSubject(new Actor(SubjectType.CLIENT, id), state, false);
    }

    @Test
    void openedSessionGivesAWorkingAccessToken() {
        IssuedSession session = sessions.open(newClient("ACTIVE"), "device-1");

        assertThat(session.audience()).isEqualTo(ApiAudience.RIDER);
        assertThat(sessions.verifyAccess(session.accessToken(), ApiAudience.RIDER))
                .hasValueSatisfying(claims -> assertThat(claims.sessionId()).isEqualTo(session.sessionId()));
        assertThat(sessions.verifyAccess(session.accessToken(), ApiAudience.DRIVER)).isEmpty();
    }

    @Test
    void refreshTokenIsStoredOnlyAsHash() {
        IssuedSession session = sessions.open(newClient("ACTIVE"), null);

        byte[] stored = jdbc.sql("select token_hash from refresh_token where session_id = :id")
                .param("id", session.sessionId()).query((rs, i) -> rs.getBytes(1)).single();

        assertThat(stored).hasSize(32);
        assertThat(session.toString()).doesNotContain(session.refreshToken()).doesNotContain(session.accessToken());
    }

    @Test
    void refreshRotatesTheToken() {
        IssuedSession first = sessions.open(newClient("ACTIVE"), null);

        IssuedSession second = sessions.refresh(first.refreshToken());

        assertThat(second.sessionId()).isEqualTo(first.sessionId());
        assertThat(second.refreshToken()).isNotEqualTo(first.refreshToken());
        assertThat(sessions.verifyAccess(second.accessToken(), ApiAudience.RIDER)).isPresent();
    }

    @Test
    void reusingARotatedRefreshTokenRevokesTheWholeSession() {
        IssuedSession first = sessions.open(newClient("ACTIVE"), null);
        IssuedSession second = sessions.refresh(first.refreshToken());

        assertUnauthenticated(() -> sessions.refresh(first.refreshToken()));

        assertUnauthenticated(() -> sessions.refresh(second.refreshToken()));
        assertThat(sessions.verifyAccess(second.accessToken(), ApiAudience.RIDER)).isEmpty();
        assertThat(jdbc.sql("""
                        select count(*) from audit_log
                        where action = 'session.revoked.refresh_reuse' and resource_id = :id""")
                .param("id", first.sessionId().toString()).query(Integer.class).single()).isEqualTo(1);
    }

    @Test
    void logoutRevokesSessionAndAccess() {
        IssuedSession session = sessions.open(newClient("ACTIVE"), null);

        sessions.logout(session.refreshToken());

        assertThat(sessions.verifyAccess(session.accessToken(), ApiAudience.RIDER)).isEmpty();
        assertUnauthenticated(() -> sessions.refresh(session.refreshToken()));
        sessions.logout(session.refreshToken());
        sessions.logout("unknown");
    }

    @Test
    void revokeAllEndsEverySessionOfTheSubject() {
        VerifiedSubject client = newClient("ACTIVE");
        IssuedSession phone = sessions.open(client, "phone");
        IssuedSession tablet = sessions.open(client, "tablet");

        assertThat(sessions.revokeAll(client.actor(), "BLOCKED")).isEqualTo(2);

        assertThat(sessions.verifyAccess(phone.accessToken(), ApiAudience.RIDER)).isEmpty();
        assertThat(sessions.verifyAccess(tablet.accessToken(), ApiAudience.RIDER)).isEmpty();
    }

    @Test
    void blockedAccountCannotOpenOrRefreshASession() {
        assertThatThrownBy(() -> sessions.open(newClient("BLOCKED"), null))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code())
                .isEqualTo(ErrorCode.ACCESS_DENIED);

        VerifiedSubject client = newClient("ACTIVE");
        IssuedSession session = sessions.open(client, null);
        jdbc.sql("update client set account_state = 'BLOCKED' where id = :id").param("id", client.id()).update();

        assertUnauthenticated(() -> sessions.refresh(session.refreshToken()));
    }

    @Test
    void expiredRefreshTokenIsRejected() {
        IssuedSession session = sessions.open(newClient("ACTIVE"), null);
        jdbc.sql("update refresh_token set expires_at = now() - interval '1 second' where session_id = :id")
                .param("id", session.sessionId()).update();

        assertUnauthenticated(() -> sessions.refresh(session.refreshToken()));
    }

    @Test
    void unknownRefreshTokenIsRejected() {
        assertUnauthenticated(() -> sessions.refresh("not-a-token"));
        assertUnauthenticated(() -> sessions.refresh(""));
    }

    private static void assertUnauthenticated(org.assertj.core.api.ThrowableAssert.ThrowingCallable call) {
        assertThatThrownBy(call)
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code())
                .isEqualTo(ErrorCode.UNAUTHENTICATED);
    }
}
