package taxi.blizz.geo.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.geo.AddressBook;
import taxi.blizz.geo.GeoConfiguration;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import tools.jackson.databind.json.JsonMapper;

/**
 * Cities, zones and the own address book in the admin panel, with {@code geo.manage} — admin.v1.yaml.
 * Boundaries travel as GeoJSON (what map widgets speak) and are stored as SRID 4326 MultiPolygons.
 */
@RestController
@RequestMapping("/api/admin/v1")
class AdminGeoController {

    private final GeoConfiguration geo;
    private final AddressBook addresses;
    private final StaffAccess staff;
    private final JdbcClient jdbc;
    private final JsonMapper json;

    AdminGeoController(GeoConfiguration geo, AddressBook addresses, StaffAccess staff, JdbcClient jdbc, JsonMapper json) {
        this.geo = geo;
        this.addresses = addresses;
        this.staff = staff;
        this.jdbc = jdbc;
        this.json = json;
    }

    // ---------------------------------------------------------------- views

    record CityView(UUID id, String code, String name, String currency, String timezone, int priority, String state,
                    long version, Map<String, Object> polygon) {
    }

    record ZoneView(UUID id, UUID cityId, String type, int priority, String state, long version,
                    Map<String, Object> polygon) {
    }

    record Cities(List<CityView> cities) {
    }

    record Zones(List<ZoneView> zones) {
    }

    record Addresses(List<AddressBook.Address> addresses) {
    }

    // ---------------------------------------------------------------- commands

    record CreateCity(@NotNull UUID commandId, @NotBlank String code, @NotBlank String name, @NotBlank String currency,
                      @NotBlank String timezone, @NotNull Map<String, Object> polygon, int priority,
                      @NotBlank String reason) {
    }

    record CreateZone(@NotNull UUID commandId, @NotBlank String type, @NotNull Map<String, Object> polygon,
                      int priority, @NotBlank String reason) {
    }

    record Change(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String reason) {
    }

    record CreateAddress(@NotNull UUID commandId, @NotNull AddressBook.Data data, @NotBlank String reason,
                         Boolean distinct) {
    }

    record UpdateAddress(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotNull AddressBook.Data data,
                         @NotBlank String reason, Boolean distinct) {
    }

    record AddAlias(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotNull AddressBook.Alias alias,
                    @NotBlank String reason) {
    }

    // ---------------------------------------------------------------- cities

    @GetMapping("/cities")
    Cities cities(AccessClaims claims, @RequestParam(required = false) String state) {
        staff.require(claims.actor(), GeoConfiguration.MANAGE_PERMISSION);
        return new Cities(jdbc.sql("""
                        select id, code, name, currency, timezone, priority, state, version, ST_AsGeoJSON(polygon)
                        from city where cast(:state as text) is null or state = :state
                        order by state, name, code""")
                .param("state", state)
                .query((rs, i) -> new CityView(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getLong(8),
                        geoJson(rs.getString(9))))
                .list());
    }

    @PostMapping("/cities")
    @ResponseStatus(HttpStatus.CREATED)
    GeoConfiguration.Revision createCity(AccessClaims claims, @Valid @RequestBody CreateCity body) {
        return geo.createCityDraft(new GeoConfiguration.CityDraft(body.commandId(), claims.actor(), 0, body.code(),
                body.name(), body.currency(), body.timezone(), ewkt(body.polygon()), body.priority(), body.reason()));
    }

    record UpdateCity(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String name,
                      @NotBlank String currency, @NotBlank String timezone, @NotNull Map<String, Object> polygon,
                      int priority, @NotBlank String reason) {
    }

    /** Registry 22.2: a city draft's details and boundary, while it is a draft (issue #176). */
    @PostMapping("/cities/{cityId}/update")
    GeoConfiguration.Revision updateCity(AccessClaims claims, @PathVariable UUID cityId,
                                         @Valid @RequestBody UpdateCity body) {
        return geo.updateCityDraft(new GeoConfiguration.CityUpdate(body.commandId(), claims.actor(), cityId,
                body.expectedVersion(), body.name(), body.currency(), body.timezone(), ewkt(body.polygon()),
                body.priority(), body.reason()));
    }

    @PostMapping("/cities/{cityId}/publish")
    GeoConfiguration.Revision publishCity(AccessClaims claims, @PathVariable UUID cityId, @Valid @RequestBody Change body) {
        return geo.publishCity(change(claims, cityId, body));
    }

    @PostMapping("/cities/{cityId}/archive")
    GeoConfiguration.Revision archiveCity(AccessClaims claims, @PathVariable UUID cityId, @Valid @RequestBody Change body) {
        return geo.archiveCity(change(claims, cityId, body));
    }

    // ---------------------------------------------------------------- zones

    @GetMapping("/cities/{cityId}/zones")
    Zones zones(AccessClaims claims, @PathVariable UUID cityId) {
        staff.require(claims.actor(), GeoConfiguration.MANAGE_PERMISSION, cityId);
        return new Zones(jdbc.sql("""
                        select id, city_id, type, priority, state, version, ST_AsGeoJSON(polygon)
                        from zone where city_id = :city order by state, type, priority desc""")
                .param("city", cityId)
                .query((rs, i) -> new ZoneView(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getString(3), rs.getInt(4), rs.getString(5), rs.getLong(6), geoJson(rs.getString(7))))
                .list());
    }

    @PostMapping("/cities/{cityId}/zones")
    @ResponseStatus(HttpStatus.CREATED)
    GeoConfiguration.Revision createZone(AccessClaims claims, @PathVariable UUID cityId,
                                         @Valid @RequestBody CreateZone body) {
        return geo.createZoneDraft(new GeoConfiguration.ZoneDraft(body.commandId(), claims.actor(), 0, cityId,
                body.type(), ewkt(body.polygon()), body.priority(), body.reason()));
    }

    @PostMapping("/zones/{zoneId}/publish")
    GeoConfiguration.Revision publishZone(AccessClaims claims, @PathVariable UUID zoneId, @Valid @RequestBody Change body) {
        return geo.publishZone(change(claims, zoneId, body));
    }

    @PostMapping("/zones/{zoneId}/archive")
    GeoConfiguration.Revision archiveZone(AccessClaims claims, @PathVariable UUID zoneId, @Valid @RequestBody Change body) {
        return geo.archiveZone(change(claims, zoneId, body));
    }

    // ---------------------------------------------------------------- own addresses

    @GetMapping("/cities/{cityId}/addresses")
    Addresses addresses(AccessClaims claims, @PathVariable UUID cityId, @RequestParam(required = false) String text,
                        @RequestParam(name = "include_hidden", defaultValue = "false") boolean includeHidden,
                        @RequestParam(defaultValue = "50") int limit) {
        return new Addresses(addresses.listForStaff(claims.actor(), cityId, text, includeHidden, limit));
    }

    @GetMapping("/addresses/{addressId}")
    AddressBook.Address address(AccessClaims claims, @PathVariable UUID addressId) {
        return addresses.getForStaff(claims.actor(), addressId);
    }

    @PostMapping("/addresses")
    @ResponseStatus(HttpStatus.CREATED)
    AddressBook.Address createAddress(AccessClaims claims, @Valid @RequestBody CreateAddress body) {
        return addresses.create(new AddressBook.Create(body.commandId(), claims.actor(), 0, body.data(), body.reason(),
                Boolean.TRUE.equals(body.distinct())));
    }

    @PostMapping("/addresses/{addressId}/update")
    AddressBook.Address updateAddress(AccessClaims claims, @PathVariable UUID addressId,
                                      @Valid @RequestBody UpdateAddress body) {
        return addresses.update(new AddressBook.Update(body.commandId(), claims.actor(), addressId,
                body.expectedVersion(), body.data(), body.reason(), Boolean.TRUE.equals(body.distinct())));
    }

    @PostMapping("/addresses/{addressId}/aliases")
    AddressBook.Address addAlias(AccessClaims claims, @PathVariable UUID addressId, @Valid @RequestBody AddAlias body) {
        return addresses.addAlias(new AddressBook.AddAlias(body.commandId(), claims.actor(), addressId,
                body.expectedVersion(), body.alias(), body.reason()));
    }

    @PostMapping("/addresses/{addressId}/hide")
    AddressBook.Address hide(AccessClaims claims, @PathVariable UUID addressId, @Valid @RequestBody Change body) {
        return addresses.hide(new AddressBook.Change(body.commandId(), claims.actor(), addressId, body.expectedVersion(),
                body.reason()));
    }

    @PostMapping("/addresses/{addressId}/restore")
    AddressBook.Address restore(AccessClaims claims, @PathVariable UUID addressId, @Valid @RequestBody Change body) {
        return addresses.restore(new AddressBook.Change(body.commandId(), claims.actor(), addressId,
                body.expectedVersion(), body.reason()));
    }

    // ---------------------------------------------------------------- helpers

    private static GeoConfiguration.Change change(AccessClaims claims, UUID id, Change body) {
        return new GeoConfiguration.Change(body.commandId(), claims.actor(), id, body.expectedVersion(), body.reason());
    }

    /** GeoJSON Polygon or MultiPolygon in WGS84 → EWKT MultiPolygon SRID 4326 for the services. */
    private String ewkt(Map<String, Object> geoJson) {
        Object type = geoJson.get("type");
        if (!"Polygon".equals(type) && !"MultiPolygon".equals(type)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The boundary is a GeoJSON Polygon or MultiPolygon");
        }
        try {
            return jdbc.sql("select ST_AsEWKT(ST_Multi(ST_SetSRID(ST_GeomFromGeoJSON(:g), 4326)))")
                    .param("g", json.writeValueAsString(geoJson)).query(String.class).single();
        } catch (DataAccessException invalid) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The boundary is not valid GeoJSON");
        }
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> geoJson(String text) {
        return text == null ? null : json.readValue(text, Map.class);
    }
}
