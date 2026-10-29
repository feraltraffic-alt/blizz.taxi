package taxi.blizz.geo;

import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * How a city takes orders (REQ-TEN-03/06): its working hours, the payment methods it offers and the pause of new
 * orders. Changes need {@link GeoConfiguration#MANAGE_PERMISSION} for the city, are versioned and audited. A city
 * never changed is open around the clock, offers every method and is not paused (version 0).
 */
public interface CityOperations {

    /** The payment methods a city can offer; SERVICE (a free follow-up) is never offered and never refused. */
    Set<String> METHODS = Set.of("CASH", "CARD", "TERMINAL");

    /**
     * One interval starting on each of {@code daysOfWeek} (ISO, 1 = Monday) at {@code from}, in the city's time zone.
     * When {@code to} is not after {@code from} the interval runs past midnight; equal means 24 hours.
     */
    record Hours(Set<Integer> daysOfWeek, LocalTime from, LocalTime to) {
        public Hours {
            // Sorted: the request is hashed for idempotency, and Set.copyOf iterates in a per-JVM random order, so a
            // retry on another instance looked like another request (audit 29.10.2026).
            daysOfWeek = daysOfWeek == null ? Set.of()
                    : java.util.Collections.unmodifiableSortedSet(new java.util.TreeSet<>(daysOfWeek));
        }
    }

    record Settings(List<Hours> workingHours, Set<String> paymentMethods) {
        public Settings {
            workingHours = workingHours == null ? List.of() : List.copyOf(workingHours);
            paymentMethods = paymentMethods == null ? Set.of()
                    : java.util.Collections.unmodifiableSortedSet(new java.util.TreeSet<>(paymentMethods));
        }
    }

    record State(UUID cityId, List<Hours> workingHours, Set<String> paymentMethods, boolean ordersPaused,
                 String pauseReason, OffsetDateTime pausedAt, long version) {
    }

    State get(Actor staff, UUID cityId);

    State change(Actor staff, UUID commandId, UUID cityId, long expectedVersion, Settings settings, String reason);

    State pause(Actor staff, UUID commandId, UUID cityId, long expectedVersion, String reason);

    State resume(Actor staff, UUID commandId, UUID cityId, long expectedVersion, String reason);

    /** The state of every city that has one, for the apps' start-up data; a city missing here has the defaults. */
    Map<UUID, State> all();

    /** The state of a city, defaults included, for the apps' start-up data. */
    State of(UUID cityId);

    /**
     * Refuses a new order in {@code city}: {@code CITY_PAUSED} while paused, {@code CITY_CLOSED} when {@code at} (the
     * pickup time of an order for later, or now) is outside the working hours, {@code PAYMENT_METHOD_NOT_OFFERED} for
     * a method the city does not offer.
     */
    void requireAccepting(City city, OffsetDateTime at, String paymentMethod);
}
