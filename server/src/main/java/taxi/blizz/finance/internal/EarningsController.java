package taxi.blizz.finance.internal;

import java.time.LocalDate;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.finance.DriverEarnings;
import taxi.blizz.identity.AccessClaims;

/** The driver's earnings screen (driver.v1.yaml) and the same figures for staff (admin.v1.yaml), REQ-DRV-12. */
@RestController
class EarningsController {

    private final DriverEarnings earnings;

    EarningsController(DriverEarnings earnings) {
        this.earnings = earnings;
    }

    @GetMapping("/api/driver/v1/earnings")
    DriverEarnings.Earnings mine(AccessClaims claims, @RequestParam("city_id") UUID cityId,
                                 @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
                                 @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return earnings.mine(claims.actor(), cityId, from, to);
    }

    @GetMapping("/api/admin/v1/drivers/{driverId}/earnings")
    DriverEarnings.Earnings of(AccessClaims claims, @PathVariable UUID driverId, @RequestParam("city_id") UUID cityId,
                               @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
                               @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return earnings.of(claims.actor(), driverId, cityId, from, to);
    }
}
