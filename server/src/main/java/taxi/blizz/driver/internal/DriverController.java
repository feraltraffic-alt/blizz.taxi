package taxi.blizz.driver.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.driver.DocumentType;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.driver.DriverProfile;
import taxi.blizz.identity.AccessClaims;

/** Driver's own admission — packages/contracts/openapi/driver.v1.yaml. The driver id comes from the token only. */
@RestController
@RequestMapping("/api/driver/v1")
class DriverController {

    private final DriverAdmission admission;

    DriverController(DriverAdmission admission) {
        this.admission = admission;
    }

    record ProfileUpdate(@NotNull UUID commandId, @Size(min = 1, max = 120) String name,
                         @Size(min = 2, max = 8) String language) {
    }

    record VehicleRequest(@NotNull UUID commandId, @NotBlank @Size(max = 16) String registrationNumber,
                          @NotBlank @Size(max = 60) String make, @NotBlank @Size(max = 60) String model,
                          @NotBlank @Size(max = 40) String color, @Min(1950) @Max(2100) int productionYear) {
    }

    record DocumentRequest(@NotNull UUID commandId, @NotNull DocumentType type, UUID vehicleId, @NotNull UUID fileId,
                           @Size(max = 64) String number, LocalDate validFrom, LocalDate validTo) {
    }

    record SubmitRequest(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion) {
    }

    record Created(UUID id) {
    }

    @GetMapping("/profile")
    DriverProfile profile(AccessClaims claims) {
        return admission.profile(claims.actor().id());
    }

    @PatchMapping("/profile")
    DriverProfile updateProfile(AccessClaims claims, @Valid @RequestBody ProfileUpdate body) {
        return admission.updateProfile(claims.actor(), body.commandId(), body.name(), body.language());
    }

    @PostMapping("/vehicles")
    @ResponseStatus(HttpStatus.CREATED)
    Created addVehicle(AccessClaims claims, @Valid @RequestBody VehicleRequest body) {
        return new Created(admission.addVehicle(claims.actor(), body.commandId(), new DriverAdmission.VehicleInput(
                body.registrationNumber(), body.make(), body.model(), body.color(), body.productionYear())));
    }

    @PostMapping("/documents")
    @ResponseStatus(HttpStatus.CREATED)
    Created addDocument(AccessClaims claims, @Valid @RequestBody DocumentRequest body) {
        return new Created(admission.addDocument(claims.actor(), body.commandId(), new DriverAdmission.DocumentInput(
                body.type(), body.vehicleId(), body.fileId(), body.number(), body.validFrom(), body.validTo())));
    }

    @PostMapping("/verification/submit")
    DriverProfile submit(AccessClaims claims, @Valid @RequestBody SubmitRequest body) {
        return admission.submit(claims.actor(), body.commandId(), body.expectedVersion());
    }
}
