package taxi.blizz.identity.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.PlatformServices;
import taxi.blizz.identity.PlatformServices.TaxiService;

/** The platform owner's taxi services (ADR 0016, issue #214) — admin.v1.yaml, tag Services. */
@RestController
class PlatformServicesController {

    private final PlatformServices services;

    PlatformServicesController(PlatformServices services) {
        this.services = services;
    }

    record ServiceList(List<TaxiService> services) {
    }

    record SuperAdmin(@NotBlank String login, @NotBlank String initialPassword, @NotBlank String firstName,
                      @NotBlank String lastName) {
    }

    record CreateService(@NotNull UUID commandId, @NotBlank String code, @NotBlank String name,
                         @NotNull @Valid SuperAdmin superAdmin, @NotBlank String reason, String password) {
    }

    record ChangeState(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String reason) {
    }

    @GetMapping("/api/admin/v1/services")
    ServiceList list(AccessClaims claims) {
        return new ServiceList(services.list(claims.actor()));
    }

    @PostMapping("/api/admin/v1/services")
    @ResponseStatus(HttpStatus.CREATED)
    TaxiService create(AccessClaims claims, @Valid @RequestBody CreateService body) {
        return services.create(claims.actor(), body.commandId(), body.code(), body.name(),
                new PlatformServices.FirstSuperAdmin(body.superAdmin().login(), body.superAdmin().initialPassword(),
                        body.superAdmin().firstName(), body.superAdmin().lastName()), body.reason(), body.password());
    }

    @PostMapping("/api/admin/v1/services/{serviceId}/suspend")
    TaxiService suspend(AccessClaims claims, @PathVariable UUID serviceId, @Valid @RequestBody ChangeState body) {
        return services.changeState(claims.actor(), body.commandId(), serviceId, body.expectedVersion(), "SUSPENDED",
                body.reason());
    }

    @PostMapping("/api/admin/v1/services/{serviceId}/resume")
    TaxiService resume(AccessClaims claims, @PathVariable UUID serviceId, @Valid @RequestBody ChangeState body) {
        return services.changeState(claims.actor(), body.commandId(), serviceId, body.expectedVersion(), "ACTIVE",
                body.reason());
    }
}
