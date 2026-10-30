package taxi.blizz.driver;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/** What a driver or a reviewer sees about one driver's admission. */
public record DriverProfile(
        UUID id,
        String name,
        String language,
        ReviewStatus reviewStatus,
        long version,
        /** The driver takes cards at an own terminal (as a sole trader); phone orders paid at a terminal go to them. */
        boolean hasPaymentTerminal,
        /** The cities the driver is admitted in (issue #141); empty — nowhere yet. */
        List<UUID> admissionCityIds,
        List<Vehicle> vehicles,
        List<Document> documents) {

    public record Vehicle(UUID id, String registrationNumber, String make, String model, String color,
                          int productionYear, String state, List<String> classApprovals) {
    }

    /** Current document of each type (the latest submitted). */
    public record Document(UUID id, DocumentType type, UUID vehicleId, UUID fileId, String number,
                           LocalDate validFrom, LocalDate validTo, String decision, String decisionReason) {
    }
}
