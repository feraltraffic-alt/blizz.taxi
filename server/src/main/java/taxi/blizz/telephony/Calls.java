package taxi.blizz.telephony;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Incoming calls of the call centre through the service's Asterisk (REQ-OPS-01/07/08/10, issue #64): one record per
 * call whatever the number of its events, who took it, and the orders made during it. A call and an order are
 * linked but live on their own: ending the call never touches the order. While Asterisk is unreachable calls are
 * simply not logged; phone orders keep working (REQ-OPS-07, T-36).
 */
public interface Calls {

    /** See the calls of a city as they ring, take them, link phone orders to them. */
    String ANSWER_PERMISSION = "calls.answer";

    enum State {
        RINGING, ANSWERED, ENDED, MISSED
    }

    record Call(UUID id, State state, String callerPhone, String calledNumber, UUID cityId, UUID answeredBy,
                List<UUID> orderIds, OffsetDateTime startedAt, OffsetDateTime answeredAt, OffsetDateTime endedAt) {
        public Call {
            orderIds = orderIds == null ? List.of() : List.copyOf(orderIds);
        }
    }

    /** Newest first, at most 100, in the cities where the staff member has {@link #ANSWER_PERMISSION}. */
    List<Call> recent(Actor staff, State state, int limit);

    /** "I took this call": records who answered; a call another operator took, or one that is over, is a conflict. */
    Call answer(Actor staff, UUID commandId, UUID callId);

    /** For the card-pop, without an access check (the push goes only to the people of the call's city). */
    Optional<Call> find(UUID callId);

    /**
     * Links an order made during the call, in the caller's transaction (the order is created in it). The staff member
     * needs {@link #ANSWER_PERMISSION} for the call's city. A call that already has an order takes another one only
     * with {@code again}; the first link stays. {@code NOT_FOUND} for an unknown call, {@code STATE_CONFLICT} for a
     * second link without {@code again}.
     */
    void link(Actor staff, UUID callId, UUID orderId, boolean again);
}
