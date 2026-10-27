package taxi.blizz.configuration;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Reasons a rider, a driver or staff can give when cancelling an order (owner decision 27.10.2026). Each side has
 * its own list; a label per service language, the default language is required. Codes never change and a reason is
 * never deleted, only deactivated, so the order history keeps its meaning. Changed with
 * {@link ServiceSettings#MANAGE_PERMISSION}.
 */
public interface CancelReasons {

    String MANAGE_PERMISSION = ServiceSettings.MANAGE_PERMISSION;

    /** The driver's reason the no-show check (minimum waiting time) applies to. */
    String NO_SHOW = "NO_SHOW";
    /** Staff cancellation reason that marks an operator-created order as the operator's fault (ADR 0011). */
    String OPERATOR_ERROR = "OPERATOR_ERROR";

    enum Audience {
        RIDER, DRIVER, STAFF
    }

    /** What a driver's cancellation does to the order. */
    enum DriverOutcome {
        /** The driver gives the order up; it goes back to the search. */
        RETURN_TO_SEARCH,
        /** The order is cancelled by the driver. */
        CANCEL_ORDER
    }

    record Reason(UUID id, Audience audience, String code, Map<String, String> labels, DriverOutcome driverOutcome,
                  boolean operatorFault, boolean active, int sortOrder, long version) {
        public Reason {
            labels = labels == null ? Map.of() : Map.copyOf(labels);
        }
    }

    /** {@code driverOutcome} is required for DRIVER and must be null otherwise; operatorFault is STAFF-only. */
    record Draft(Audience audience, String code, Map<String, String> labels, DriverOutcome driverOutcome,
                 boolean operatorFault, boolean active, int sortOrder) {
    }

    /** Active reasons of one side in display order; public, for the apps. */
    List<Reason> active(Audience audience);

    /** Every reason including inactive ones, for the admin panel. */
    List<Reason> all(Actor staff);

    Reason create(Actor staff, UUID commandId, Draft draft, String reason);

    /** Labels, driver outcome, operator-fault flag, activity and order; audience and code stay as they were. */
    Reason update(Actor staff, UUID commandId, UUID reasonId, long expectedVersion, Draft draft, String reason);

    /** An active reason of the side, or {@code VALIDATION_FAILED}. */
    Reason require(Audience audience, String code);

    /** A reason of the side whether active or not. */
    Optional<Reason> find(Audience audience, String code);
}
