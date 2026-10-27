package taxi.blizz.configuration.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.util.List;
import java.util.UUID;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.CityCatalog;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;

/** Service settings in the admin panel, and the public start-up data of the apps — admin.v1.yaml, config.v1.yaml. */
@RestController
class SettingsController {

    private final ServiceSettings settings;
    private final CityCatalog cities;
    private final StaffAccess staff;

    SettingsController(ServiceSettings settings, CityCatalog cities, StaffAccess staff) {
        this.settings = settings;
        this.cities = cities;
        this.staff = staff;
    }

    record Change(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                  @NotNull ServiceSettings.Settings settings, @NotBlank String reason) {
    }

    record History(List<ServiceSettings.Version> versions) {
    }

    record CityItem(UUID id, String code, String name, String currency, String timezone) {
    }

    record PublicCalls(ServiceSettings.CallMode mode, String servicePhone) {
    }

    /** No secrets, no staff data: what an app needs before sign in (REQ-TEN-07, section 22 bootstrap). */
    record Bootstrap(long settingsVersion, ServiceSettings.Brand brand, ServiceSettings.Languages languages,
                     PublicCalls calls, List<CityItem> cities) {
    }

    @GetMapping("/api/admin/v1/settings")
    ServiceSettings.Version current(AccessClaims claims) {
        staff.require(claims.actor(), ServiceSettings.MANAGE_PERMISSION);
        return settings.current();
    }

    @PostMapping("/api/admin/v1/settings")
    ServiceSettings.Version change(AccessClaims claims, @Valid @RequestBody Change body) {
        return settings.change(claims.actor(), body.commandId(), body.expectedVersion(), body.settings(), body.reason());
    }

    @GetMapping("/api/admin/v1/settings/history")
    History history(AccessClaims claims, @RequestParam(defaultValue = "20") int limit) {
        return new History(settings.history(claims.actor(), limit));
    }

    @GetMapping("/api/config/v1/bootstrap")
    ResponseEntity<Bootstrap> bootstrap() {
        ServiceSettings.Version current = settings.current();
        ServiceSettings.Calls calls = current.settings().calls();
        Bootstrap body = new Bootstrap(current.version(), current.settings().brand(), current.settings().languages(),
                new PublicCalls(calls.mode(), calls.mode() == ServiceSettings.CallMode.VIA_SERVICE_NUMBERS
                        ? calls.servicePhone() : null),
                cities.published().stream().map(c -> new CityItem(c.id(), c.code(), c.name(), c.currency(),
                        c.timezone())).toList());
        return ResponseEntity.ok().cacheControl(CacheControl.maxAge(Duration.ofMinutes(1)).cachePublic()).body(body);
    }
}
