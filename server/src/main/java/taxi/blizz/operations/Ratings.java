package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/** Ratings submitted by the two participants after a fulfilled trip (REQ-RID-08). */
public interface Ratings {

    /** Public rider/driver view. Comments are intentionally absent: they are staff-only. */
    record Rating(UUID orderId, int score, OffsetDateTime createdAt) {
    }

    record StaffRating(UUID orderId, String authorType, UUID authorId, String targetType, UUID targetId,
                       int score, String comment, OffsetDateTime createdAt) {
    }

    record DriverSummary(long scoreSum, long count, long averageHundredths) {
    }

    Rating submit(Actor actor, UUID commandId, UUID orderId, int score, String comment);

    Rating mine(Actor actor, UUID orderId);

    DriverSummary driverSummary(Actor driver);

    List<StaffRating> forStaff(Actor staff, UUID orderId);
}
