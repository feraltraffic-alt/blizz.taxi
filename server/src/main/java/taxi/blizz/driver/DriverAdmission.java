package taxi.blizz.driver;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;

/**
 * Driver admission (section 6, transitions of section 12.2 for the admission axis).
 *
 * <p>Every state change is a named command with {@code commandId} and, where it acts on the
 * driver's status, {@code expectedVersion}; repeats return the first result (REQ-API-03/04).
 * Reviewer actions need a STAFF actor with the {@code driver.review} permission (REQ-AUTH-10).
 */
public interface DriverAdmission {

    String REVIEW_PERMISSION = "driver.review";

    DriverProfile profile(UUID driverId);

    /** Admission facts other modules need to decide whether a driver may work (section 12.1). */
    record AdmissionSnapshot(ReviewStatus reviewStatus, java.util.Map<UUID, List<String>> approvedVehicleClasses,
                             java.util.Set<UUID> cities) {

        public boolean admitted() {
            return reviewStatus == ReviewStatus.APPROVED;
        }

        /** Admitted to work in the city (REQ-DSP-01, REQ-DS-06, issue #141). */
        public boolean admittedIn(UUID cityId) {
            return cities.contains(cityId);
        }

        public boolean vehicleApproved(UUID vehicleId) {
            return approvedVehicleClasses.containsKey(vehicleId);
        }
    }

    /** Lightweight read for eligibility checks; NOT_FOUND for an unknown driver. */
    AdmissionSnapshot admissionOf(UUID driverId);

    DriverProfile updateProfile(Actor driver, UUID commandId, String name, String language);

    record VehicleInput(String registrationNumber, String make, String model, String color, int productionYear) {
    }

    UUID addVehicle(Actor driver, UUID commandId, VehicleInput vehicle);

    record DocumentInput(DocumentType type, UUID vehicleId, UUID fileId, String number,
                         LocalDate validFrom, LocalDate validTo) {
    }

    /** The file must be a SAFE upload of this driver for {@code DRIVER_DOCUMENT} (REQ-SEC-06). */
    UUID addDocument(Actor driver, UUID commandId, DocumentInput document);

    /** NOT_SUBMITTED or CHANGES_REQUIRED → IN_REVIEW, once the required documents and a vehicle exist. */
    DriverProfile submit(Actor driver, UUID commandId, long expectedVersion);

    /**
     * IN_REVIEW → APPROVED / CHANGES_REQUIRED / REJECTED with a mandatory reason. On approval the
     * submitted vehicles get the given classes and the current documents are accepted. Otherwise the
     * listed documents are marked rejected so the driver knows what to replace.
     */
    DriverProfile decide(Actor reviewer, UUID commandId, UUID driverId, long expectedVersion,
                         ReviewDecision decision, String reason, List<String> vehicleClasses,
                         List<UUID> rejectedDocuments);

    /** APPROVED → SUSPENDED with a reason; stops new orders, never an ongoing trip (REQ-DS-01). */
    default DriverProfile suspend(Actor reviewer, UUID commandId, UUID driverId, long expectedVersion, String reason) {
        return suspend(reviewer, commandId, driverId, expectedVersion, reason, null);
    }

    /**
     * The same, naming the risk flag that caused it (issue #71): it must be this driver's ({@code VALIDATION_FAILED}
     * otherwise) and is kept with the change and in the audit. The driver sees the reason, never the flag.
     */
    DriverProfile suspend(Actor reviewer, UUID commandId, UUID driverId, long expectedVersion, String reason,
                          UUID riskFlagId);

    /**
     * Replaces the cities the driver is admitted in (REQ-DSP-01, issue #141), with a reason; audited and published as
     * DriverAdmissionCitiesChanged. Needs {@link #REVIEW_PERMISSION} for every city added or removed; a city that
     * does not exist is VALIDATION_FAILED. A driver online in a removed city keeps the shift and the current trip but
     * gets no new order there.
     */
    DriverProfile setAdmissionCities(Actor reviewer, UUID commandId, UUID driverId, long expectedVersion,
                                     java.util.Set<UUID> cityIds, String reason);

    /** SUSPENDED → APPROVED with a reason, when the cause of the suspension is gone. */
    DriverProfile reinstate(Actor reviewer, UUID commandId, UUID driverId, long expectedVersion, String reason);

    /**
     * Marks that the driver has (or no longer has) an own card terminal, with a reason; audited. Phone orders paid at
     * a terminal are offered only to such drivers (owner decision 27.10.2026).
     */
    DriverProfile setPaymentTerminal(Actor reviewer, UUID commandId, UUID driverId, long expectedVersion,
                                     boolean hasTerminal, String reason);

    // ---------------------------------------------------------------- the reviewer's views (admin panel)

    /** One line of the review queue; {@code since} is when the driver entered the status. */
    record ReviewItem(UUID driverId, String name, String phone, ReviewStatus status, java.time.OffsetDateTime since,
                      long version) {
    }

    /** Drivers in {@code status} (IN_REVIEW: the queue), oldest first (since, then id), after {@code after}. */
    List<ReviewItem> reviewQueue(Actor reviewer, ReviewStatus status, PageCursor after, int limit);

    String REVIEW_QUEUE = "driver-review";

    static PageCursor position(ReviewItem item) {
        return PageCursor.of(REVIEW_QUEUE, item.since(), item.driverId());
    }

    /** Full profile with the history of review decisions, for the reviewer. */
    record ReviewEvent(ReviewStatus from, ReviewStatus to, String actorType, UUID actorId, String reason,
                       java.time.OffsetDateTime at) {
    }

    /**
     * {@code duplicates}: the driver's current documents whose file has the same content as a document of another
     * driver (issue #105, D2), for the reviewer to look at; nothing is blocked by it.
     */
    record ReviewCase(DriverProfile profile, String phone, List<ReviewEvent> history, List<Duplicate> duplicates) {
    }

    /** A document of this driver with the same file content as {@code otherDocumentId} of {@code otherDriverId}. */
    record Duplicate(UUID documentId, UUID otherDriverId, UUID otherDocumentId) {
    }

    ReviewCase reviewCase(Actor reviewer, UUID driverId);

    /** The file of a driver's document, for the reviewer; every opening is audited (REQ-SEC-07). */
    taxi.blizz.files.FileContent documentFile(Actor reviewer, UUID driverId, UUID documentId);

    /**
     * APPROVED → EXPIRED for drivers whose required accepted document ended before {@code today}
     * (date in the market's time zone). Returns the number of drivers moved.
     */
    int expireDocuments(LocalDate today);
}
