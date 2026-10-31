package taxi.blizz.identity;

import java.util.UUID;

/**
 * A kind of subject whose deletions the erasure journal keeps (ADR 0013, issue #144), other than riders: the module
 * that owns the subject's table applies a journaled deletion again after a restore. The journal records an
 * {@code <Type>Anonymized} event's subject; at start-up {@link #reapply} is called for every journaled id.
 */
public interface ErasedSubjects {

    /** The journal's kind, e.g. {@code DRIVER}; the event that journals it is {@link #anonymizedEvent()}. */
    String subjectType();

    /** The outbox event type published on anonymization, e.g. {@code DriverAnonymized}. */
    String anonymizedEvent();

    /** The payload field holding the subject's id, e.g. {@code driver_id}. */
    String idField();

    /**
     * In the caller's transaction: anonymizes again a journaled subject found here with personal data; returns whether
     * anything had to be done. An unknown id (created after the backup) does nothing.
     */
    boolean reapply(UUID subjectId);
}
