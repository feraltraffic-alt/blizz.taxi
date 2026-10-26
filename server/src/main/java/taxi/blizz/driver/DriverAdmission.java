package taxi.blizz.driver;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

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
    record AdmissionSnapshot(ReviewStatus reviewStatus, java.util.Map<UUID, List<String>> approvedVehicleClasses) {

        public boolean admitted() {
            return reviewStatus == ReviewStatus.APPROVED;
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
    DriverProfile suspend(Actor reviewer, UUID commandId, UUID driverId, long expectedVersion, String reason);

    /**
     * APPROVED → EXPIRED for drivers whose required accepted document ended before {@code today}
     * (date in the market's time zone). Returns the number of drivers moved.
     */
    int expireDocuments(LocalDate today);
}
