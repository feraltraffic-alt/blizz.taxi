package taxi.blizz.pricing;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.HexFormat;
import java.util.List;
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

    /**
     * {@code pickupAt}: the requested pickup time of an order for later, or null for now. Far enough ahead it is
     * a pre-order (ADR 0006); it is part of the fingerprint, so the order must ask for the same time.
     */
    record Request(UUID cityId, UUID classId, GeoPoint pickup, GeoPoint dropOff, Actor payer, Instant pickupAt) {

        public Request(UUID cityId, UUID classId, GeoPoint pickup, GeoPoint dropOff, Actor payer) {
            this(cityId, classId, pickup, dropOff, payer, null);
        }

        /** Versioned canonical request identity; command_id is deliberately excluded. */
        public String fingerprint() {
            String canonical = "pricing-quote-v1\n" + cityId + "\n" + classId + "\n"
                    + pickup + "\n" + dropOff + "\n" + payer + (pickupAt == null ? "" : "\n" + pickupAt);
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

    /**
     * {@code distance} is the in-city part, {@code distanceOutside} the out-of-city part; {@code demandFactor}
     * includes the zone coefficients; {@code approvedFeesMinor} is the sum of the fixed zone surcharges, listed
     * in {@code zoneFees} (REQ-PRC-03: round_half_up(max(minimum, pickup + distance + duration) × factor) + fees).
     */
    record Breakdown(long pickupMinor, Component distance, Component duration, long minimumMinor,
                     BigDecimal demandFactor, long approvedFeesMinor, Component distanceOutside, boolean pickupOutside,
                     List<ZoneFee> zoneFees, boolean preorder) {

        public Breakdown {
            zoneFees = zoneFees == null ? List.of() : List.copyOf(zoneFees);
        }
    }

    /**
     * One applied surcharge: a fixed amount or a coefficient. {@code mode} is FIXED / COEFFICIENT for a zone;
     * PREORDER_FIXED / PREORDER_COEFFICIENT (with a null zone) for a pre-order.
     */
    record ZoneFee(UUID zoneId, String mode, long amountMinor, BigDecimal coefficient) {
    }

    /**
     * {@code amountMinor} is the full price — the driver's share and the commission come from it; {@code discountMinor}
     * is what the rider's promotions take off it (the service pays it, ADR 0009) and {@code promotions} what applied.
     */
    record Quote(UUID id, Request request, UUID tariffVersionId, int pricingPolicyVersion,
                 TariffService.Terms terms, RouteEstimator.Estimate route, Breakdown breakdown,
                 long amountMinor, String currency, Instant createdAt, Instant expiresAt, String fingerprint,
                 List<taxi.blizz.promotions.RiderPromotions.Applied> promotions, long discountMinor) {

        public Quote {
            promotions = promotions == null ? List.of() : List.copyOf(promotions);
        }

        /** What the rider pays before bonuses. */
        public long toPayMinor() {
            return amountMinor - discountMinor;
        }
    }
}
