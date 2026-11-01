package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityResolver;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.pricing.VehicleClasses;

/**
 * What the rider can order at a point and for how much — packages/contracts/openapi/rider.v1.yaml.
 * The city comes from the pickup, the class from its code; the server computes the price (REQ-PRC-06).
 */
@RestController
class RiderQuoteController {

    private final CityResolver cities;
    private final VehicleClasses classes;
    private final QuoteService quotes;

    RiderQuoteController(CityResolver cities, VehicleClasses classes, QuoteService quotes) {
        this.cities = cities;
        this.classes = classes;
        this.quotes = quotes;
    }

    record ClassOption(String code, String name) {
    }

    /** {@code pickupAt}: for an order for later; at least the threshold ahead it is a pre-order (ADR 0006). */
    record QuoteCommand(@NotNull UUID commandId, @NotBlank @Size(max = 64) String vehicleClass,
                        @NotNull GeoPoint pickup, @NotNull GeoPoint dropoff, Instant pickupAt) {
    }

    /** What waiting at the pickup will cost, from the quote's tariff (REQ-PRC-05, REQ-PRC-09). */
    record WaitingTerms(int freeMinutes, java.math.BigDecimal perMinuteMinor, int stepSeconds, String rounding) {
    }

    /** One promotion that applied (ADR 0009): a DISCOUNT with what it takes off, or a BONUS credited after the trip. */
    record PromotionView(UUID id, String name, String kind, String valueType, long value, long discountMinor) {
    }

    /**
     * {@code amountMinor}: the full price; {@code discountMinor}: what promotions take off it; {@code toPayMinor}:
     * what the rider pays (before bonuses of the account).
     */
    record QuoteView(UUID id, String vehicleClass, UUID cityId, long amountMinor, String currency,
                     long distanceM, long durationS, String routeSource, Instant expiresAt, WaitingTerms waiting, Instant pickupAt,
                     boolean preorder, long discountMinor, long toPayMinor, List<PromotionView> promotions,
                     List<String> paymentMethods, Long cardHoldMinor) {
    }

    @GetMapping("/api/rider/v1/vehicle-classes")
    List<ClassOption> vehicleClasses(AccessClaims claims, @RequestParam double lat, @RequestParam double lon) {
        City city = city(new GeoPoint(lat, lon));
        return classes.orderable(city.id()).stream().map(c -> new ClassOption(c.code(), c.name())).toList();
    }

    @PostMapping("/api/rider/v1/quotes")
    @ResponseStatus(HttpStatus.CREATED)
    QuoteView quote(AccessClaims claims, @Valid @RequestBody QuoteCommand body) {
        City city = city(body.pickup());
        VehicleClasses.VehicleClass vehicleClass = classes.active(city.id(), body.vehicleClass())
                .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED, "This class is not offered here"));
        QuoteService.Quote quote = quotes.create(body.commandId(), new QuoteService.Request(city.id(),
                vehicleClass.id(), body.pickup(), body.dropoff(), claims.actor(), body.pickupAt()));
        return new QuoteView(quote.id(), vehicleClass.code(), city.id(), quote.amountMinor(), quote.currency(),
                quote.route().distanceMetres(), quote.route().durationSeconds(), quote.route().source().name(), quote.expiresAt(),
                new WaitingTerms(quote.terms().freeWaitingMinutes(), quote.terms().waitingPerMinuteMinor(),
                        quote.terms().waitingStepSeconds(), quote.terms().waitingRounding().name()), body.pickupAt(),
                quote.breakdown().preorder(), quote.discountMinor(), quote.toPayMinor(),
                quote.promotions().stream().map(p -> new PromotionView(p.promotionId(), p.name(), p.kind().name(),
                        p.valueType().name(), p.value(), p.discountMinor())).toList(),
                quote.paymentMethods(), quote.cardHoldMinor());
    }

    private City city(GeoPoint point) {
        return cities.resolve(point).orElseThrow(() ->
                new DomainException(ErrorCode.OUTSIDE_SERVICE_AREA, "Pickup is outside every service area"));
    }
}
