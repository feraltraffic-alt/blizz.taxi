package taxi.blizz.platform;

/**
 * Consumer of outbox events. Delivery is at-least-once; each handler runs in its own transaction
 * together with a {@code consumer_inbox} record, so a redelivered event is skipped for consumers
 * that already processed it. External side effects (banks, SMS) must still be idempotent on their
 * own (REQ-ENG-06).
 */
public interface OutboxHandler {

    /** Stable id of this consumer; changing it causes redelivery of past events to it. */
    String consumerId();

    boolean supports(String eventType);

    void handle(OutboxMessage message);
}
