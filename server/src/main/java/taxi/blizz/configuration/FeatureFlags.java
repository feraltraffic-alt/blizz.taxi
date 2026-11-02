package taxi.blizz.configuration;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Server-side feature flags (REQ-ENG-14). Every flag is declared here with an owner and a date by which it is
 * reviewed (removed, or its date moved with a reason); a test fails once that date has passed. Staff switch a flag
 * in the admin panel with {@link #MANAGE_PERMISSION}; every switch is audited.
 *
 * <p>A flag is read only where a process <b>starts</b> (an order is created, a payment is begun). Switching it off
 * never stops or changes what has already started: a card hold already made is still captured, refunded or voided.
 */
public interface FeatureFlags {

    String MANAGE_PERMISSION = "flags.manage";

    enum Flag {
        /**
         * New orders paid by a saved card. Off: new card orders are refused (PAYMENT_METHOD_NOT_OFFERED) and riders
         * pay in cash; holds and captures of orders already made go on. An instance-wide switch for a provider
         * incident; a city's own payment methods are set in its operations.
         */
        CARD_PAYMENTS("card-payments", "payments", LocalDate.of(2027, 6, 30), true);

        private final String key;
        private final String owner;
        private final LocalDate reviewBy;
        private final boolean defaultEnabled;

        Flag(String key, String owner, LocalDate reviewBy, boolean defaultEnabled) {
            this.key = key;
            this.owner = owner;
            this.reviewBy = reviewBy;
            this.defaultEnabled = defaultEnabled;
        }

        public String key() {
            return key;
        }

        /** The module that answers for the flag. */
        public String owner() {
            return owner;
        }

        public LocalDate reviewBy() {
            return reviewBy;
        }

        public boolean defaultEnabled() {
            return defaultEnabled;
        }
    }

    record State(Flag flag, boolean enabled, long version, UUID changedBy, String reason, OffsetDateTime changedAt) {
    }

    /**
     * Whether the flag is on now in the taxi service {@code serviceId} (ADR 0016); its default until that service's
     * staff first switch it.
     */
    boolean enabled(UUID serviceId, Flag flag);

    /** {@link #enabled(UUID, Flag)} in the service the city belongs to. */
    boolean enabledInCity(UUID cityId, Flag flag);

    /** The flags of the staff member's own service. */
    List<State> all(Actor staff);

    /**
     * Switches a flag of the staff member's own service by its key (UNKNOWN keys are NOT_FOUND). Idempotent by
     * {@code commandId}.
     */
    State change(Actor staff, UUID commandId, String key, long expectedVersion, boolean enabled, String reason);
}
