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

    record QuoteCommand(@NotNull UUID commandId, @NotBlank @Size(max = 64) String vehicleClass,
                        @NotNull GeoPoint pickup, @NotNull GeoPoint dropoff) {
    }

    /** What waiting at the pickup will cost, from the quote's tariff (REQ-PRC-05, REQ-PRC-09). */
    record WaitingTerms(int freeMinutes, java.math.BigDecimal perMinuteMinor, int stepSeconds, String rounding) {
    }

    record QuoteView(UUID id, String vehicleClass, UUID cityId, long amountMinor, String currency,
                     long distanceM, long durationS, Instant expiresAt, WaitingTerms waiting) {
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
                vehicleClass.id(), body.pickup(), body.dropoff(), claims.actor()));
        return new QuoteView(quote.id(), vehicleClass.code(), city.id(), quote.amountMinor(), quote.currency(),
                quote.route().distanceMetres(), quote.route().durationSeconds(), quote.expiresAt(),
                new WaitingTerms(quote.terms().freeWaitingMinutes(), quote.terms().waitingPerMinuteMinor(),
                        quote.terms().waitingStepSeconds(), quote.terms().waitingRounding().name()));
    }

    private City city(GeoPoint point) {
        return cities.resolve(point).orElseThrow(() ->
                new DomainException(ErrorCode.OUTSIDE_SERVICE_AREA, "Pickup is outside every service area"));
    }
}
