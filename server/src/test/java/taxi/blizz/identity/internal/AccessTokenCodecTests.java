package taxi.blizz.identity.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/** REQ-AUTH-06, REQ-USR-08: what an access token carries and when it is refused. */
class AccessTokenCodecTests {

    private static final String SECRET = "test-secret-test-secret-test-secret-123";
    private static final UUID INSTANCE = UUID.randomUUID();
    private static final Instant T0 = Instant.parse("2026-10-26T12:00:00Z");

    private final Actor client = new Actor(SubjectType.CLIENT, UUID.randomUUID());
    private final UUID session = UUID.randomUUID();

    private static AccessTokenCodec codecAt(Instant now) {
        return new AccessTokenCodec(SECRET, INSTANCE, Duration.ofMinutes(15), Clock.fixed(now, ZoneOffset.UTC));
    }

    @Test
    void roundTripCarriesSubjectSessionAndInstance() {
        String token = codecAt(T0).sign(client, ApiAudience.RIDER, session).token();

        AccessClaims claims = codecAt(T0.plusSeconds(60)).verify(token, ApiAudience.RIDER).orElseThrow();

        assertThat(claims.actor()).isEqualTo(client);
        assertThat(claims.sessionId()).isEqualTo(session);
        assertThat(claims.instanceId()).isEqualTo(INSTANCE);
        assertThat(claims.expiresAt().toInstant()).isEqualTo(T0.plus(Duration.ofMinutes(15)));
    }

    @Test
    void tokenOfOneAudienceIsRejectedByAnother() {
        String token = codecAt(T0).sign(client, ApiAudience.RIDER, session).token();

        assertThat(codecAt(T0).verify(token, ApiAudience.DRIVER)).isEmpty();
        assertThat(codecAt(T0).verify(token, ApiAudience.ADMIN)).isEmpty();
    }

    @Test
    void expiredTokenIsRejected() {
        String token = codecAt(T0).sign(client, ApiAudience.RIDER, session).token();

        assertThat(codecAt(T0.plus(Duration.ofMinutes(16))).verify(token, ApiAudience.RIDER)).isEmpty();
    }

    @Test
    void tokenFromAnotherInstanceOrKeyIsRejected() {
        String token = codecAt(T0).sign(client, ApiAudience.RIDER, session).token();
        Clock clock = Clock.fixed(T0, ZoneOffset.UTC);

        assertThat(new AccessTokenCodec(SECRET, UUID.randomUUID(), Duration.ofMinutes(15), clock)
                .verify(token, ApiAudience.RIDER)).isEmpty();
        assertThat(new AccessTokenCodec(SECRET + "x", INSTANCE, Duration.ofMinutes(15), clock)
                .verify(token, ApiAudience.RIDER)).isEmpty();
    }

    @Test
    void tamperedOrUnsignedTokenIsRejected() {
        String token = codecAt(T0).sign(client, ApiAudience.RIDER, session).token();
        String[] parts = token.split("\\.");
        String tampered = parts[0] + "." + parts[1] + "x." + parts[2];
        String unsigned = "eyJhbGciOiJub25lIn0." + parts[1] + ".";

        assertThat(codecAt(T0).verify(tampered, ApiAudience.RIDER)).isEmpty();
        assertThat(codecAt(T0).verify(unsigned, ApiAudience.RIDER)).isEmpty();
        assertThat(codecAt(T0).verify("garbage", ApiAudience.RIDER)).isEmpty();
        assertThat(codecAt(T0).verify(null, ApiAudience.RIDER)).isEmpty();
    }
}
