package taxi.blizz.geo.internal;

import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.geo.AddressBook;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityResolver;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** Rider HTTP surface for the service-owned address book (REQ-GEO-13, REQ-GEO-15, REQ-GEO-16). */
@RestController
@RequestMapping("/api/rider/v1/addresses")
class RiderAddressController {

    private final AddressBook addresses;
    private final CityResolver cities;
    private final AddressSearchRateLimiter rateLimiter;

    RiderAddressController(AddressBook addresses, CityResolver cities, AddressSearchRateLimiter rateLimiter) {
        this.addresses = addresses;
        this.cities = cities;
        this.rateLimiter = rateLimiter;
    }

    @GetMapping
    List<RiderAddress> search(
            AccessClaims claims,
            @RequestParam String query,
            @RequestParam double lat,
            @RequestParam double lon,
            @RequestParam(required = false) @Size(max = 16) String language,
            @RequestParam(defaultValue = "10") int limit) {
        if (limit < 1) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Address search limit must be positive");
        }
        GeoPoint near = new GeoPoint(lat, lon);
        City city = resolveCity(claims.serviceId(), near);
        rateLimiter.acquire(claims.actor().id());
        return addresses.search(city.id(), query, language, near, Math.min(limit, 20)).stream()
                .map(RiderAddressController::view)
                .toList();
    }

    @GetMapping("/nearest")
    ResponseEntity<RiderAddress> nearest(AccessClaims claims, @RequestParam double lat, @RequestParam double lon) {
        GeoPoint point = new GeoPoint(lat, lon);
        City city = resolveCity(claims.serviceId(), point);
        return addresses.nearest(city.id(), point, 100).map(RiderAddressController::view)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    private City resolveCity(java.util.UUID serviceId, GeoPoint point) {
        return cities.resolve(serviceId, point)
                .orElseThrow(() -> new DomainException(ErrorCode.OUTSIDE_SERVICE_AREA, "Point is outside service area"));
    }

    private static RiderAddress view(AddressBook.Address address) {
        AddressBook.Data data = address.data();
        return new RiderAddress(address.id(), data.kind(), data.label(), text(data.street()),
                displayHouse(data.houseRaw(), data.building()), data.pickup(), data.instructions());
    }

    private static String displayHouse(String raw, String building) {
        String house = text(raw).strip();
        String corpus = text(building).strip();
        if (corpus.isEmpty()) {
            return house;
        }
        if (house.isEmpty()) {
            return corpus;
        }
        return house + " корпус " + corpus;
    }

    private static String text(String value) {
        return value == null ? "" : value;
    }

    record RiderAddress(UUID id, AddressBook.Kind kind, String label, String street, String house,
                        GeoPoint pickup, String instructions) {
    }
}
