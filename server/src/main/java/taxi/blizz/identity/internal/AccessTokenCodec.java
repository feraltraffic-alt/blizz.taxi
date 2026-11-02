package taxi.blizz.identity.internal;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/**
 * Signs and verifies access tokens (JWT, HS256). Claims: {@code iss} and {@code iid} = instance,
 * {@code sub} = subject id, {@code sub_type}, {@code aud}, {@code sid} = session (REQ-USR-08).
 * Verification here covers signature, issuer, audience and expiry; session revocation is checked
 * by the caller against the database.
 */
class AccessTokenCodec {

    private static final Duration CLOCK_SKEW = Duration.ofSeconds(30);

    private final byte[] secret;
    private final UUID instanceId;
    private final Duration ttl;
    private final Clock clock;

    AccessTokenCodec(String secret, UUID instanceId, Duration ttl, Clock clock) {
        this.secret = secret.getBytes(StandardCharsets.UTF_8);
        this.instanceId = instanceId;
        this.ttl = ttl;
        this.clock = clock;
    }

    record Signed(String token, OffsetDateTime expiresAt) {
    }

    Signed sign(Actor actor, ApiAudience audience, UUID sessionId, UUID serviceId) {
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        OffsetDateTime expiresAt = now.plus(ttl);
        JWTClaimsSet claims = new JWTClaimsSet.Builder()
                .issuer(instanceId.toString())
                .subject(actor.id().toString())
                .audience(audience.value())
                .issueTime(Date.from(now.toInstant()))
                .expirationTime(Date.from(expiresAt.toInstant()))
                .jwtID(UUID.randomUUID().toString())
                .claim("sub_type", actor.type().name())
                .claim("sid", sessionId.toString())
                .claim("iid", instanceId.toString())
                .claim("svc", serviceId == null ? null : serviceId.toString())
                .build();
        try {
            SignedJWT jwt = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claims);
            jwt.sign(new MACSigner(secret));
            return new Signed(jwt.serialize(), expiresAt);
        } catch (JOSEException e) {
            throw new IllegalStateException("Cannot sign access token", e);
        }
    }

    Optional<AccessClaims> verify(String token, ApiAudience expectedAudience) {
        if (token == null || token.isBlank()) {
            return Optional.empty();
        }
        try {
            SignedJWT jwt = SignedJWT.parse(token);
            if (!JWSAlgorithm.HS256.equals(jwt.getHeader().getAlgorithm()) || !jwt.verify(new MACVerifier(secret))) {
                return Optional.empty();
            }
            JWTClaimsSet claims = jwt.getJWTClaimsSet();
            Date expiration = claims.getExpirationTime();
            if (expiration == null || !instanceId.toString().equals(claims.getIssuer())
                    || !List.of(expectedAudience.value()).equals(claims.getAudience())) {
                return Optional.empty();
            }
            OffsetDateTime expiresAt = expiration.toInstant().atOffset(ZoneOffset.UTC);
            if (!OffsetDateTime.now(clock).minus(CLOCK_SKEW).isBefore(expiresAt)) {
                return Optional.empty();
            }
            SubjectType type = SubjectType.valueOf(claims.getStringClaim("sub_type"));
            Actor actor = new Actor(type, UUID.fromString(claims.getSubject()));
            // Only the platform owner's staff session has no service (ADR 0016); the session row decides which.
            String service = claims.getStringClaim("svc");
            return Optional.of(new AccessClaims(actor, expectedAudience,
                    UUID.fromString(claims.getStringClaim("sid")), instanceId, expiresAt,
                    service == null ? null : UUID.fromString(service)));
        } catch (ParseException | JOSEException | IllegalArgumentException | NullPointerException e) {
            return Optional.empty();
        }
    }
}
