package taxi.blizz.operations.internal;

import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.geo.CityCatalog;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.pricing.VehicleClasses;

/**
 * The classes an operator can quote in a city (#251) — packages/contracts/openapi/operator.v1.yaml. The same list and
 * shape as the rider's, by the access rule of the operator's quote: {@code orders.create} in that city.
 */
@RestController
class OperatorClassController {

    private final CityCatalog cities;
    private final VehicleClasses classes;
    private final StaffAccess staff;

    OperatorClassController(CityCatalog cities, VehicleClasses classes, StaffAccess staff) {
        this.cities = cities;
        this.classes = classes;
        this.staff = staff;
    }

    @GetMapping("/api/operator/v1/vehicle-classes")
    List<RiderQuoteController.ClassOption> vehicleClasses(AccessClaims claims, @RequestParam("city_id") UUID cityId) {
        // A city of another service is as unknown as a city that does not exist (ADR 0016).
        if (!cities.serviceOf(cityId).map(claims.serviceId()::equals).orElse(false)) {
            throw new DomainException(ErrorCode.NOT_FOUND, "No such city");
        }
        staff.require(claims.actor(), Orders.CREATE_PERMISSION, cityId);
        return classes.orderable(cityId).stream()
                .map(c -> new RiderQuoteController.ClassOption(c.code(), c.name()))
                .toList();
    }
}
