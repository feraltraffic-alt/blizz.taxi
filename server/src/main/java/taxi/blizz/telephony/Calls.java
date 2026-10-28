package taxi.blizz.telephony;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.platform.Actor;

/**
 * Calls of the call centre through the service's Asterisk (REQ-OPS-01/07/08/10, issues #64, #67): one record per
 * call whatever the number of its events, who took it, and the orders made during it; outgoing calls placed from an
 * order without the number ever reaching the panel (REQ-PRV-03). A call and an order are
 * linked but live on their own: ending the call never touches the order. While Asterisk is unreachable calls are
 * simply not logged; phone orders keep working (REQ-OPS-07, T-36).
 */
public interface Calls {

    /** See the calls of a city as they ring, take them, link phone orders to them. */
    String ANSWER_PERMISSION = "calls.answer";

    /** Listen to the recordings of a city's calls; every listening is audited (issue #60). */
    String LISTEN_PERMISSION = "calls.listen";

    /** See the operators of a city and their status (issue #67). */
    String SUPERVISE_PERMISSION = "calls.supervise";

    /**
     * DIALING — an outgoing call the server is asking Asterisk for; RINGING — ringing (the operator's phone, for an
     * outgoing one); ANSWERED — taken (the other side picked up, for an outgoing one); ENDED, MISSED — over after or
     * without an answer; FAILED — Asterisk could not be reached for an outgoing call.
     */
    enum State {
        DIALING, RINGING, ANSWERED, ENDED, MISSED, FAILED
    }

    enum Direction {
        INBOUND, OUTBOUND
    }

    /** The other side of an outgoing call. */
    enum Party {
        RIDER, DRIVER, CALLER
    }

    /** PENDING — being fetched from Asterisk; STORED — kept encrypted; NONE — Asterisk had no recording. */
    enum RecordingState {
        PENDING, STORED, NONE
    }

    /** A taken call's recording; {@code durationSeconds} and {@code storedAt} only when STORED. */
    record Recording(RecordingState state, Integer durationSeconds, OffsetDateTime storedAt) {
    }

    /**
     * {@code recording} is null for a call that is not over or was missed. An outgoing call has no numbers
     * ({@code callerPhone}, {@code calledNumber} null), its {@code party} and its order in {@code orderIds}.
     */
    record Call(UUID id, Direction direction, Party party, State state, String callerPhone, String calledNumber,
                UUID cityId, UUID answeredBy, List<UUID> orderIds, OffsetDateTime startedAt,
                OffsetDateTime answeredAt, OffsetDateTime endedAt, Recording recording) {
        public Call {
            orderIds = orderIds == null ? List.of() : List.copyOf(orderIds);
        }
    }

    /**
     * Newest first, at most 100, in the cities where the staff member has {@link #ANSWER_PERMISSION} or
     * {@link #LISTEN_PERMISSION}; with {@code orderId}, only the calls that order was made during or placed from.
     */
    List<Call> recent(Actor staff, State state, UUID orderId, int limit);

    /** "I took this call": records who answered; a call another operator took, or one that is over, is a conflict. */
    Call answer(Actor staff, UUID commandId, UUID callId);

    /** For the card-pop, without an access check (the push goes only to the people of the call's city). */
    Optional<Call> find(UUID callId);

    /**
     * The outgoing calls the service made to {@code party} about these orders, oldest first; no staff check — for a
     * person's own copy of their data (REQ-PRV-07). An outgoing call never holds a number.
     */
    List<Call> outboundAbout(Party party, java.util.Collection<UUID> orderIds);

    /**
     * Links an order made during the call, in the caller's transaction (the order is created in it). The staff member
     * needs {@link #ANSWER_PERMISSION} for the call's city. A call that already has an order takes another one only
     * with {@code again}; the first link stays. {@code NOT_FOUND} for an unknown call, {@code STATE_CONFLICT} for a
     * second link without {@code again}.
     */
    void link(Actor staff, UUID callId, UUID orderId, boolean again);

    /**
     * An outgoing call from an order, already authorized by the order's module: {@code to} is the other side's number
     * and is given only to Asterisk — never stored, logged, audited or returned.
     */
    record Outbound(UUID orderId, UUID cityId, Party party, PhoneNumber to) {
    }

    /**
     * Click-to-call (issue #67): rings the staff member's own phone (their extension), then the other side. The call
     * is logged as OUTBOUND before Asterisk is asked, and Asterisk is asked outside any transaction with the call's id
     * as the channel id, so a repeat of the command — even after a lost answer — never rings twice. Without an
     * extension {@code STATE_CONFLICT}. Asterisk unreachable or refusing → the call is FAILED and
     * {@code PROVIDER_UNAVAILABLE} (a new command places a new call); an answer lost on the way →
     * {@code PROVIDER_UNAVAILABLE} with the call still DIALING, and a repeat of the same command asks again without
     * ringing twice.
     */
    Call dial(Actor staff, UUID commandId, Outbound outbound);
}
