package taxi.blizz.platform;

import java.util.UUID;

/**
 * A 409 STATE_CONFLICT because the object would duplicate another one (REQ-GEO-14): the answer names the existing
 * object as {@code duplicate_of}, so the client can open it instead of guessing.
 */
public class DuplicateException extends DomainException {

    private final UUID duplicateOf;

    public DuplicateException(UUID duplicateOf, String message) {
        super(ErrorCode.STATE_CONFLICT, message);
        this.duplicateOf = duplicateOf;
    }

    public UUID duplicateOf() {
        return duplicateOf;
    }
}
