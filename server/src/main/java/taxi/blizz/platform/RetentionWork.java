package taxi.blizz.platform;

import java.time.OffsetDateTime;

/** A module-owned bounded cleanup batch. The coordinator never accesses a business module's tables. */
public interface RetentionWork {

    String kind();

    /** The indexed selection used by run; exposed to volume tests, with a trusted server-clamped row budget. */
    String selectionSql(int limit);

    record Result(int deleted, int failures, int examined) {

        public Result(int deleted, int failures) {
            this(deleted, failures, deleted + failures);
        }

        public Result plus(Result other) {
            return new Result(deleted + other.deleted, failures + other.failures, examined + other.examined);
        }
    }

    /** One batch only; no transaction may span a call to external storage or a provider. */
    Result run(OffsetDateTime cutoff, OffsetDateTime now, int limit);

    /**
     * Whether this work's rows carry their taxi service, so each service's term applies to its own rows (#276); then
     * {@link #run(java.util.UUID, OffsetDateTime, OffsetDateTime, int)} is used instead of the plain run.
     */
    default boolean perService() {
        return false;
    }

    /** One batch of the rows of {@code serviceId} only. */
    default Result run(java.util.UUID serviceId, OffsetDateTime cutoff, OffsetDateTime now, int limit) {
        throw new UnsupportedOperationException(kind() + " does not separate its rows by service");
    }

    static int limit(int value) {
        return Math.max(1, Math.min(1000, value));
    }
}
