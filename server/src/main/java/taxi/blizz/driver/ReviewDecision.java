package taxi.blizz.driver;

/** Outcome of a staff review of a submitted driver (REQ-DRV-02). */
public enum ReviewDecision {
    APPROVE(ReviewStatus.APPROVED),
    REQUEST_CHANGES(ReviewStatus.CHANGES_REQUIRED),
    REJECT(ReviewStatus.REJECTED);

    private final ReviewStatus result;

    ReviewDecision(ReviewStatus result) {
        this.result = result;
    }

    public ReviewStatus result() {
        return result;
    }
}
