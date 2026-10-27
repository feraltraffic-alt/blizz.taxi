package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.Ratings;

/** Rider, driver and staff views of post-trip ratings (REQ-RID-08). */
@RestController
class RatingController {

    private final Ratings ratings;

    RatingController(Ratings ratings) {
        this.ratings = ratings;
    }

    record Submit(@NotNull UUID commandId, @Min(1) @Max(5) int score, @Size(max = 500) String comment) {
    }

    record StaffRatings(List<Ratings.StaffRating> ratings) {
    }

    @PostMapping("/api/rider/v1/orders/{orderId}/rating")
    Ratings.Rating riderSubmit(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody Submit body) {
        return ratings.submit(claims.actor(), body.commandId(), orderId, body.score(), body.comment());
    }

    @GetMapping("/api/rider/v1/orders/{orderId}/rating")
    Ratings.Rating riderGet(AccessClaims claims, @PathVariable UUID orderId) {
        return ratings.mine(claims.actor(), orderId);
    }

    @PostMapping("/api/driver/v1/orders/{orderId}/rating")
    Ratings.Rating driverSubmit(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody Submit body) {
        return ratings.submit(claims.actor(), body.commandId(), orderId, body.score(), body.comment());
    }

    @GetMapping("/api/driver/v1/orders/{orderId}/rating")
    Ratings.Rating driverGet(AccessClaims claims, @PathVariable UUID orderId) {
        return ratings.mine(claims.actor(), orderId);
    }

    @GetMapping("/api/driver/v1/me/rating")
    Ratings.DriverSummary driverSummary(AccessClaims claims) {
        return ratings.driverSummary(claims.actor());
    }

    @GetMapping({"/api/operator/v1/orders/{orderId}/ratings", "/api/admin/v1/orders/{orderId}/ratings"})
    StaffRatings staffRatings(AccessClaims claims, @PathVariable UUID orderId) {
        return new StaffRatings(ratings.forStaff(claims.actor(), orderId));
    }
}
