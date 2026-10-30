package taxi.blizz.platform;

/**
 * A 409 on a versioned object (VERSION_CONFLICT, STATE_CONFLICT): the answer carries the version the object has now,
 * so the client fetches a fresh snapshot instead of guessing (REQ-API-07).
 */
public class ConflictException extends DomainException {

    private final long currentVersion;

    public ConflictException(ErrorCode code, long currentVersion, String message) {
        super(code, message);
        this.currentVersion = currentVersion;
    }

    /** The object changed since the client read it. */
    public static ConflictException version(long currentVersion, String message) {
        return new ConflictException(ErrorCode.VERSION_CONFLICT, currentVersion, message);
    }

    /** The command does not fit the object's state as it is now. */
    public static ConflictException state(long currentVersion, String message) {
        return new ConflictException(ErrorCode.STATE_CONFLICT, currentVersion, message);
    }

    public long currentVersion() {
        return currentVersion;
    }
}
