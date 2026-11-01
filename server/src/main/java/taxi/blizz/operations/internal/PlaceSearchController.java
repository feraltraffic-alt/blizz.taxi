package taxi.blizz.operations.internal;

import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityResolver;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.geocoding.Geocoding;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/**
 * The address field of the apps and of the call centre (ADR 0012, Q-08), rider.v1.yaml and operator.v1.yaml: the
 * places of the rider's own past orders come first — a repeated address needs no provider call — then the service's
 * own addresses and the chosen provider's results ({@link Geocoding}). Nothing found here is stored.
 */
@RestController
class PlaceSearchController {

    /** At most this many places from the order history in one answer. */
    static final int HISTORY_LIMIT = 5;

    private final Geocoding geocoding;
    private final CityResolver cities;
    private final AccountDirectory accounts;
    private final StaffAccess staff;
    private final JdbcClient jdbc;

    PlaceSearchController(Geocoding geocoding, CityResolver cities, AccountDirectory accounts, StaffAccess staff,
                          JdbcClient jdbc) {
        this.geocoding = geocoding;
        this.cities = cities;
        this.accounts = accounts;
        this.staff = staff;
        this.jdbc = jdbc;
    }

    record PlacePoint(double lat, double lon) {
    }

    /** {@code source}: HISTORY, OWN, or the provider (GOOGLE, VISICOM, FAKE). */
    record PlaceView(String source, UUID addressId, String label, String street, String house, PlacePoint point,
                     String instructions) {
    }

    record PlaceList(String provider, List<PlaceView> places) {
    }

    @GetMapping("/api/rider/v1/places")
    PlaceList rider(AccessClaims claims, @RequestParam(defaultValue = "") @Size(max = 200) String query,
                    @RequestParam double lat, @RequestParam double lon,
                    @RequestParam(required = false) @Size(max = 16) String language,
                    @RequestParam(defaultValue = "10") int limit) {
        Actor rider = requireType(claims, SubjectType.CLIENT);
        GeoPoint near = new GeoPoint(lat, lon);
        City city = city(claims.serviceId(), near);
        String lang = language != null ? language : accounts.language(rider).orElse(null);
        return search(rider.id(), Optional.of(rider.id()), city, query, lang, near, limit);
    }

    @GetMapping("/api/rider/v1/places/reverse")
    ResponseEntity<PlaceView> riderReverse(AccessClaims claims, @RequestParam double lat, @RequestParam double lon,
                                           @RequestParam(required = false) @Size(max = 16) String language) {
        Actor rider = requireType(claims, SubjectType.CLIENT);
        GeoPoint point = new GeoPoint(lat, lon);
        String lang = language != null ? language : accounts.language(rider).orElse(null);
        return reverse(rider.id(), city(claims.serviceId(), point), point, lang);
    }

    /** For a phone order: {@code caller_phone} adds the history of the caller's rider account, if there is one. */
    @GetMapping("/api/operator/v1/places")
    PlaceList operator(AccessClaims claims, @RequestParam(defaultValue = "") @Size(max = 200) String query,
                       @RequestParam double lat, @RequestParam double lon,
                       @RequestParam(name = "caller_phone", required = false) String callerPhone,
                       @RequestParam(required = false) @Size(max = 16) String language,
                       @RequestParam(defaultValue = "10") int limit) {
        Actor operator = claims.actor();
        GeoPoint near = new GeoPoint(lat, lon);
        City city = city(claims.serviceId(), near);
        staff.require(operator, Orders.CREATE_PERMISSION, city.id());
        Optional<UUID> caller = callerPhone == null || callerPhone.isBlank() ? Optional.empty()
                : accounts.clientByPhone(PhoneNumber.parse(callerPhone));
        return search(operator.id(), caller, city, query, language, near, limit);
    }

    @GetMapping("/api/operator/v1/places/reverse")
    ResponseEntity<PlaceView> operatorReverse(AccessClaims claims, @RequestParam double lat,
                                              @RequestParam double lon,
                                              @RequestParam(required = false) @Size(max = 16) String language) {
        GeoPoint point = new GeoPoint(lat, lon);
        City city = city(claims.serviceId(), point);
        staff.require(claims.actor(), Orders.CREATE_PERMISSION, city.id());
        return reverse(claims.actor().id(), city, point, language);
    }

    // ---------------------------------------------------------------- the search

    private PlaceList search(UUID requesterId, Optional<UUID> historyOf, City city, String query, String language,
                             GeoPoint near, int limit) {
        if (limit < 1) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The limit must be positive");
        }
        int max = Math.min(limit, 20);
        String text = query == null ? "" : query.strip();
        List<PlaceView> places = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        historyOf.ifPresent(client -> history(client, city.id(), text, Math.min(HISTORY_LIMIT, max))
                .forEach(p -> add(places, seen, p)));
        if (places.size() < max && !text.isEmpty()) {
            for (Geocoding.Place p : geocoding.search(requesterId, city.id(), text, language, near, max)) {
                if (places.size() >= max) {
                    break;
                }
                add(places, seen, view(p));
            }
        }
        return new PlaceList(geocoding.provider(), places);
    }

    private ResponseEntity<PlaceView> reverse(UUID requesterId, City city, GeoPoint point, String language) {
        return geocoding.reverse(requesterId, city.id(), point, language).map(PlaceSearchController::view)
                .map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
    }

    /**
     * Distinct pickup and drop-off places of the rider's orders in the city, latest first, matching {@code text}
     * (all of them when blank).
     */
    List<PlaceView> history(UUID clientId, UUID cityId, String text, int limit) {
        String pattern = "%" + text.toLowerCase(Locale.ROOT).replace("\\", "\\\\").replace("%", "\\%")
                .replace("_", "\\_") + "%";
        return jdbc.sql("""
                        select label, ST_Y(point) as lat, ST_X(point) as lon from (
                            select distinct on (lower(label)) label, point, at, leg from (
                                select pickup_label as label, pickup as point, created_at as at, 0 as leg
                                from ride_order where payer_client_id = :client and city_id = :city
                                union all
                                select dropoff_label, dropoff, created_at, 1 from ride_order
                                where payer_client_id = :client and city_id = :city and dropoff is not null
                            ) visited
                            where label is not null and label <> '' and lower(label) like :pattern escape '\\'
                            order by lower(label), at desc, leg
                        ) latest
                        order by at desc, leg
                        limit :limit""")
                .param("client", clientId).param("city", cityId).param("pattern", pattern).param("limit", limit)
                .query((rs, i) -> new PlaceView("HISTORY", null, rs.getString("label"), "", "",
                        new PlacePoint(rs.getDouble("lat"), rs.getDouble("lon")), null))
                .list();
    }

    private static void add(List<PlaceView> places, Set<String> seen, PlaceView place) {
        if (seen.add(place.label().strip().toLowerCase(Locale.ROOT))) {
            places.add(place);
        }
    }

    private static PlaceView view(Geocoding.Place p) {
        return new PlaceView(p.source(), p.addressId(), p.label(), p.street(), p.house(),
                new PlacePoint(p.point().lat(), p.point().lon()), p.instructions());
    }

    private City city(UUID serviceId, GeoPoint point) {
        return cities.resolve(serviceId, point)
                .orElseThrow(() -> new DomainException(ErrorCode.OUTSIDE_SERVICE_AREA, "Point is outside service area"));
    }

    private static Actor requireType(AccessClaims claims, SubjectType type) {
        if (claims.actor().type() != type) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Not available to " + claims.actor().type());
        }
        return claims.actor();
    }
}
