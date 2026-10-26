package taxi.blizz.platform;

/** The same command id was reused with a different request body (REQ-API-04). */
public class IdempotencyConflictException extends DomainException {

    public IdempotencyConflictException(CommandKey key) {
        super(ErrorCode.IDEMPOTENCY_CONFLICT,
                "Command " + key.commandId() + " was already used for " + key.operation() + " with a different request");
    }
}
