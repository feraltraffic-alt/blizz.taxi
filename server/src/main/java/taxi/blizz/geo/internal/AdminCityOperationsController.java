package taxi.blizz.geo.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.geo.CityOperations;
import taxi.blizz.identity.AccessClaims;

/** Working hours, payment methods and the pause of new orders of a city (REQ-TEN-03/06) — admin.v1.yaml. */
@RestController
@RequestMapping("/api/admin/v1/cities/{cityId}/operations")
class AdminCityOperationsController {

    private static final String HHMM = "^([01][0-9]|2[0-3]):[0-5][0-9]$";

    private final CityOperations operations;

    AdminCityOperationsController(CityOperations operations) {
        this.operations = operations;
    }

    record HoursView(@NotNull @Size(min = 1) Set<Integer> daysOfWeek, @NotNull @Pattern(regexp = HHMM) String from,
                     @NotNull @Pattern(regexp = HHMM) String to) {
    }

    record DropoffView(@NotNull Boolean allowed, @Min(1)
                       @jakarta.validation.constraints.Max(CityOperations.MAX_DROPOFF_DISTANCE_KM) Integer maxDistanceKm) {
    }

    record OperationsView(UUID cityId, List<HoursView> workingHours, Set<String> paymentMethods, int returnZoneMeters,
                          DropoffView dropoffOutsideCity, boolean ordersPaused, String pauseReason,
                          OffsetDateTime pausedAt, long version) {
    }

    record Change(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                  @NotNull @Size(max = JdbcCityOperations.MAX_INTERVALS) List<@Valid HoursView> workingHours,
                  @NotNull @Size(min = 1) Set<String> paymentMethods,
                  @Min(0) @jakarta.validation.constraints.Max(CityOperations.MAX_RETURN_ZONE_METERS)
                  Integer returnZoneMeters, @Valid DropoffView dropoffOutsideCity, @NotBlank String reason) {
    }

    record PauseChange(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String reason) {
    }

    @GetMapping
    OperationsView get(AccessClaims claims, @PathVariable UUID cityId) {
        return view(operations.get(claims.actor(), cityId));
    }

    @PostMapping
    OperationsView change(AccessClaims claims, @PathVariable UUID cityId, @Valid @RequestBody Change body) {
        List<CityOperations.Hours> hours = body.workingHours().stream()
                .map(h -> new CityOperations.Hours(h.daysOfWeek(), LocalTime.parse(h.from()), LocalTime.parse(h.to())))
                .toList();
        return view(operations.change(claims.actor(), body.commandId(), cityId, body.expectedVersion(),
                new CityOperations.Settings(hours, body.paymentMethods(), body.returnZoneMeters(),
                        body.dropoffOutsideCity() == null ? null : new CityOperations.DropoffOutside(
                                body.dropoffOutsideCity().allowed(), body.dropoffOutsideCity().maxDistanceKm())),
                body.reason()));
    }

    @PostMapping("/pause")
    OperationsView pause(AccessClaims claims, @PathVariable UUID cityId, @Valid @RequestBody PauseChange body) {
        return view(operations.pause(claims.actor(), body.commandId(), cityId, body.expectedVersion(), body.reason()));
    }

    @PostMapping("/resume")
    OperationsView resume(AccessClaims claims, @PathVariable UUID cityId, @Valid @RequestBody PauseChange body) {
        return view(operations.resume(claims.actor(), body.commandId(), cityId, body.expectedVersion(), body.reason()));
    }

    static List<HoursView> hours(List<CityOperations.Hours> hours) {
        return hours.stream().map(h -> new HoursView(new TreeSet<>(h.daysOfWeek()), JdbcCityOperations.hhmm(h.from()),
                JdbcCityOperations.hhmm(h.to()))).toList();
    }

    private static OperationsView view(CityOperations.State s) {
        return new OperationsView(s.cityId(), hours(s.workingHours()), new TreeSet<>(s.paymentMethods()),
                s.returnZoneMeters(), new DropoffView(s.dropoffOutsideCity().allowed(),
                        s.dropoffOutsideCity().maxDistanceKm()), s.ordersPaused(), s.pauseReason(), s.pausedAt(),
                s.version());
    }
}
