package taxi.blizz.notification.internal;

import jakarta.validation.Valid;
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

/** Push devices of the rider and the driver apps (rider.v1.yaml, driver.v1.yaml; REQ-NTF-02). */
@RestController
class PushDeviceController {

    private final PushDevices devices;

    PushDeviceController(PushDevices devices) {
        this.devices = devices;
    }

    record Register(@NotNull UUID commandId, @NotNull String platform, @NotNull String token, String locale) {
    }

    record Command(@NotNull UUID commandId) {
    }

    record DeviceList(List<PushDevices.Device> devices) {
    }

    @PostMapping({"/api/rider/v1/push-devices", "/api/driver/v1/push-devices"})
    @ResponseStatus(HttpStatus.CREATED)
    PushDevices.Device register(AccessClaims claims, @Valid @RequestBody Register body) {
        return devices.register(claims.actor(), claims.sessionId(), body.commandId(),
                new PushDevices.Registration(body.platform(), body.token(), body.locale()));
    }

    @GetMapping({"/api/rider/v1/push-devices", "/api/driver/v1/push-devices"})
    DeviceList list(AccessClaims claims) {
        return new DeviceList(devices.devices(claims.actor()));
    }

    @PostMapping({"/api/rider/v1/push-devices/{deviceId}/remove", "/api/driver/v1/push-devices/{deviceId}/remove"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void remove(AccessClaims claims, @PathVariable UUID deviceId, @Valid @RequestBody Command body) {
        devices.remove(claims.actor(), body.commandId(), deviceId);
    }
}
