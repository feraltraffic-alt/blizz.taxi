package taxi.blizz.platform;

import java.util.Objects;
import java.util.UUID;

/**
 * Idempotency key of a command: bound to the actor and the operation (REQ-API-04). The instance
 * is implicit because every instance has its own database.
 */
public record CommandKey(Actor actor, String operation, UUID commandId) {

    public CommandKey {
        Objects.requireNonNull(actor, "actor");
        Objects.requireNonNull(operation, "operation");
        Objects.requireNonNull(commandId, "commandId");
        if (operation.isBlank()) {
            throw new IllegalArgumentException("operation must not be blank");
        }
    }

    String scope() {
        return actor.type() + ":" + (actor.id() == null ? "-" : actor.id()) + ":" + operation;
    }
}
