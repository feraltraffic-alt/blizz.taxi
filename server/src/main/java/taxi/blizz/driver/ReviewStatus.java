package taxi.blizz.driver;

/** Admission axis of the driver state (section 12.1). Admission is not availability. */
public enum ReviewStatus {
    NOT_SUBMITTED,
    IN_REVIEW,
    CHANGES_REQUIRED,
    APPROVED,
    REJECTED,
    SUSPENDED,
    EXPIRED
}
