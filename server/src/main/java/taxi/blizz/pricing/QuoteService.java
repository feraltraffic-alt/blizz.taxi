package taxi.blizz.pricing;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.HexFormat;
import java.util.UUID;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.platform.Actor;

public interface QuoteService {
    /** Call without an active transaction; route estimation precedes idempotent quote persistence. */
    Quote create(UUID commandId, Request request);

    /**
     * Joins the order command's transaction. A duplicate direct consumption is rejected;
     * IdempotentCommands around order creation will replay the original order instead.
     */
    Quote consume(UUID quoteId, Actor payer, String fingerprint);

    record Request(UUID cityId, UUID classId, GeoPoint pickup, GeoPoint dropOff, Actor payer) {
        /** Versioned canonical request identity; command_id is deliberately excluded. */
        public String fingerprint() {
            String canonical = "pricing-quote-v1\n" + cityId + "\n" + classId + "\n"
                    + pickup + "\n" + dropOff + "\n" + payer;
            try {
                return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256")
                        .digest(canonical.getBytes(StandardCharsets.UTF_8)));
            } catch (NoSuchAlgorithmException exception) {
                throw new IllegalStateException("SHA-256 unavailable", exception);
            }
        }
    }

    /** An exact rational component in minor units; no component is rounded independently. */
    record Component(BigDecimal numerator, int denominator) {
    }

    record Breakdown(long pickupMinor, Component distance, Component duration, long minimumMinor,
                     BigDecimal demandFactor, long approvedFeesMinor) {
    }

    record Quote(UUID id, Request request, UUID tariffVersionId, int pricingPolicyVersion,
                 TariffService.Terms terms, RouteEstimator.Estimate route, Breakdown breakdown,
                 long amountMinor, String currency, Instant createdAt, Instant expiresAt, String fingerprint) {
    }
}
