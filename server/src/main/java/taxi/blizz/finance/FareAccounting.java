package taxi.blizz.finance;

import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * "Pending accounting" (REQ-LED-05, issue #140): a completed trip with a fare to post is POSTED once the journal has
 * its TRIP_FARE transaction and PENDING until then. A trip owes a posting when its TripCompleted carries a final fare
 * above zero; finance learns of the pending ones from the events its posting consumer has not handled yet.
 */
public interface FareAccounting {

    /** How long a trip may wait before the alert TripPostingLate; and the list looks back this far. */
    java.time.Duration LIST_WINDOW = java.time.Duration.ofDays(7);

    /** Of {@code orderIds}, those whose fare is in the journal. */
    Set<UUID> posted(Collection<UUID> orderIds);

    record PendingTrip(UUID orderId, UUID driverId, OffsetDateTime completedAt, long waitingSeconds,
                       long fareMinor, String currency) {
    }

    /** {@code more}: more than {@link #MAX_LISTED} trips wait; the oldest are listed. */
    record PendingList(UUID cityId, List<PendingTrip> trips, boolean more) {
    }

    int MAX_LISTED = 100;

    /** The city's trips completed in the last {@link #LIST_WINDOW} still waiting, oldest first; finance.manage. */
    PendingList pending(Actor staff, UUID cityId);

    /** How many of a driver's trips in a city wait, and their fares. */
    record Pending(int trips, long fareMinor) {
    }

    Pending ofDriver(UUID driverId, UUID cityId);
}
