package taxi.blizz.backoffice;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;

/**
 * Support cases (REQ-ADM-09): a category, the order when there is one, the requester, an owner, a priority,
 * messages and a resolution. Riders and drivers open cases about their own orders and see only PUBLIC
 * messages; staff with {@link #MANAGE_PERMISSION} work the queue of their cities and may write INTERNAL
 * comments. Problem queues are fed by events (cash not received, trips flagged for review).
 */
public interface SupportCases {

    String MANAGE_PERMISSION = taxi.blizz.identity.StaffPermissions.SUPPORT_MANAGE;

    enum Category {
        LOST_ITEM, PAYMENT, CASH_DISPUTE, DRIVER_BEHAVIOUR, RIDER_BEHAVIOUR, SAFETY, TRIP_REVIEW, APP_PROBLEM, OTHER,
        /** Problem queues only (REQ-OPS-06), opened by the system: no driver was found. */
        NO_DRIVER,
        /** Problem queues only: the assigned driver stopped sending positions during the order. */
        LOST_CONNECTION,
        /** Problem queues only: a card operation's result stayed unknown. */
        PAYMENT_UNKNOWN;

        /** Categories only the system opens; a rider or driver cannot choose them. */
        public boolean systemOnly() {
            return this == TRIP_REVIEW || this == NO_DRIVER || this == LOST_CONNECTION || this == PAYMENT_UNKNOWN;
        }
    }

    enum Priority {
        LOW, NORMAL, HIGH, URGENT
    }

    enum State {
        OPEN, IN_PROGRESS, WAITING_REQUESTER, RESOLVED, CLOSED
    }

    enum Visibility {
        PUBLIC, INTERNAL
    }

    record Message(UUID id, long sequence, String authorType, UUID authorId, Visibility visibility, String body,
                   OffsetDateTime createdAt) {
    }

    record Case(UUID id, long number, UUID cityId, Category category, UUID orderId, String requesterType,
                UUID requesterId, String subject, Priority priority, State state, UUID assignedStaffId,
                String resolution, long version, OffsetDateTime createdAt, OffsetDateTime updatedAt,
                /** By when someone should take the case, from its priority (REQ-OPS-06). */
                OffsetDateTime respondBy, List<Message> messages) {
        public Case {
            messages = messages == null ? List.of() : List.copyOf(messages);
        }
    }

    // ---------------------------------------------------------------- riders and drivers

    /** A rider or driver opens a case; {@code orderId} must be one of their orders (or trips) when given. */
    Case open(Actor requester, UUID commandId, Category category, UUID orderId, String subject, String message);

    /** Their own cases, newest first, after {@code after} (REQ-API-09), PUBLIC messages only. */
    List<Case> mine(Actor requester, PageCursor after, int limit);

    Case mineOne(Actor requester, UUID caseId);

    /** The requester answers; a case WAITING_REQUESTER goes back to IN_PROGRESS (or OPEN without owner). */
    Case reply(Actor requester, UUID commandId, UUID caseId, String message);

    // ---------------------------------------------------------------- staff

    /**
     * {@code overdueOnly}: OPEN cases nobody took by their {@code respondBy}, oldest due first. {@code after} is a
     * position from {@link #position}, of the same kind of queue (REQ-API-09).
     */
    record QueueFilter(UUID cityId, State state, Priority priority, Category category, UUID assignedStaffId,
                       boolean unassignedOnly, PageCursor after, int limit, boolean overdueOnly) {

        public QueueFilter(UUID cityId, State state, Priority priority, Category category, UUID assignedStaffId,
                           boolean unassignedOnly, PageCursor after, int limit) {
            this(cityId, state, priority, category, assignedStaffId, unassignedOnly, after, limit, false);
        }
    }

    String MY_CASES = "my-cases";
    String CASE_QUEUE = "case-queue";
    String OVERDUE_CASES = "overdue-cases";

    /** URGENT first: the rank the queue sorts by, the same as in the SQL. */
    static int rank(Priority priority) {
        return Priority.URGENT.ordinal() - priority.ordinal();
    }

    static PageCursor minePosition(Case c) {
        return PageCursor.of(MY_CASES, c.createdAt(), c.id());
    }

    /** The queue is sorted by (due time when overdue only,) priority, newest first; the cursor holds all of them. */
    static PageCursor position(Case c, boolean overdueOnly) {
        return overdueOnly
                ? PageCursor.of(OVERDUE_CASES, c.respondBy(), rank(c.priority()), c.createdAt(), c.id())
                : PageCursor.of(CASE_QUEUE, rank(c.priority()), c.createdAt(), c.id());
    }

    /** Cases of one city (or without a city when {@code cityId} is null), newest first; messages not included. */
    List<Case> queue(Actor staff, QueueFilter filter);

    /** Everything, INTERNAL comments included. */
    Case get(Actor staff, UUID caseId);

    /** Assign to a staff member with the same right ({@code null}: back to the queue); OPEN → IN_PROGRESS. */
    Case assign(Actor staff, UUID commandId, UUID caseId, long expectedVersion, UUID assigneeId, String reason);

    Case prioritize(Actor staff, UUID commandId, UUID caseId, long expectedVersion, Priority priority, String reason);

    /** PUBLIC answers may ask the requester for more: {@code waitForRequester} sets WAITING_REQUESTER. */
    Case comment(Actor staff, UUID commandId, UUID caseId, long expectedVersion, Visibility visibility, String body,
                 boolean waitForRequester);

    Case resolve(Actor staff, UUID commandId, UUID caseId, long expectedVersion, String resolution);

    Case reopen(Actor staff, UUID commandId, UUID caseId, long expectedVersion, String reason);

    Case close(Actor staff, UUID commandId, UUID caseId, long expectedVersion, String reason);
}
