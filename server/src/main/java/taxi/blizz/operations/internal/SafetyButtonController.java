package taxi.blizz.operations.internal;

import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.configuration.SafetyContacts;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.operations.DriverAvailability;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * The safety button of the apps (REQ-RID-09) — rider.v1.yaml, driver.v1.yaml. The contacts are kept per city by
 * configuration; this module only knows which city the rider's order or the driver's session is in, and
 * configuration cannot ask it (operations already depends on configuration).
 */
@RestController
class SafetyButtonController {

    private final SafetyContacts contacts;
    private final Orders orders;
    private final WorkSessions sessions;
    private final AccountDirectory accounts;

    SafetyButtonController(SafetyContacts contacts, Orders orders, WorkSessions sessions,
                           AccountDirectory accounts) {
        this.contacts = contacts;
        this.orders = orders;
        this.sessions = sessions;
        this.accounts = accounts;
    }

    /** For {@code city_id}, else for the city of the rider's active order; neither → 400. */
    @GetMapping("/api/rider/v1/safety-contacts")
    SafetyContacts.View rider(AccessClaims claims, @RequestParam(name = "city_id", required = false) UUID cityId) {
        UUID city = cityId != null ? cityId : orders.active(claims.actor().id()).map(OrderView::cityId)
                .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED,
                        "city_id is required when there is no active order"));
        return contacts.forCity(city, accounts.language(claims.actor()).orElse(null));
    }

    /** For the city of the driver's open work session; none → 409. */
    @GetMapping("/api/driver/v1/safety-contacts")
    SafetyContacts.View driver(AccessClaims claims) {
        DriverAvailability availability = sessions.availability(claims.actor().id());
        if (availability.sessionId() == null || availability.cityId() == null) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "No open work session");
        }
        return contacts.forCity(availability.cityId(), accounts.language(claims.actor()).orElse(null));
    }
}
