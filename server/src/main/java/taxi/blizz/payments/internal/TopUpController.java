package taxi.blizz.payments.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.payments.CardTopUps;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** Card top-ups of the rider's bonus account and the driver's balance (rider.v1.yaml, driver.v1.yaml). */
@RestController
class TopUpController {

    private final CardTopUps topUps;

    TopUpController(CardTopUps topUps) {
        this.topUps = topUps;
    }

    record Start(@NotNull UUID commandId, @NotNull UUID cityId, @NotNull Long amountMinor) {
    }

    @PostMapping("/api/rider/v1/wallet/card-top-ups")
    @ResponseStatus(HttpStatus.CREATED)
    CardTopUps.TopUp startRider(AccessClaims claims, @Valid @RequestBody Start body) {
        return topUps.start(as(claims, SubjectType.CLIENT), body.commandId(), body.cityId(), body.amountMinor());
    }

    @GetMapping("/api/rider/v1/wallet/card-top-ups/{topUpId}")
    CardTopUps.TopUp rider(AccessClaims claims, @PathVariable UUID topUpId) {
        return topUps.topUp(as(claims, SubjectType.CLIENT), topUpId);
    }

    @PostMapping("/api/driver/v1/balance/card-top-ups")
    @ResponseStatus(HttpStatus.CREATED)
    CardTopUps.TopUp startDriver(AccessClaims claims, @Valid @RequestBody Start body) {
        return topUps.start(as(claims, SubjectType.DRIVER), body.commandId(), body.cityId(), body.amountMinor());
    }

    @GetMapping("/api/driver/v1/balance/card-top-ups/{topUpId}")
    CardTopUps.TopUp driver(AccessClaims claims, @PathVariable UUID topUpId) {
        return topUps.topUp(as(claims, SubjectType.DRIVER), topUpId);
    }

    /** A rider's path is for riders and a driver's for drivers: the account topped up follows the path. */
    private static Actor as(AccessClaims claims, SubjectType type) {
        Actor actor = claims.actor();
        if (actor.type() != type) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Not available to " + actor.type());
        }
        return actor;
    }
}
