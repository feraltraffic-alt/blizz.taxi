package taxi.blizz.driver.internal;

import java.time.ZoneId;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;
import taxi.blizz.driver.DocumentType;

/**
 * Admission rules of this instance.
 *
 * @param requiredDriverDocuments  documents every driver needs
 * @param requiredVehicleDocuments documents every vehicle needs
 * @param marketTimeZone           zone in which document validity dates are evaluated
 * @param expiryCheckEnabled       run the daily document expiry check in this process
 */
@ConfigurationProperties("blizz.driver")
public record DriverProperties(
        @DefaultValue("DRIVER_LICENSE") List<DocumentType> requiredDriverDocuments,
        @DefaultValue({"VEHICLE_REGISTRATION", "INSURANCE"}) List<DocumentType> requiredVehicleDocuments,
        @DefaultValue("UTC") ZoneId marketTimeZone,
        @DefaultValue("true") boolean expiryCheckEnabled) {
}
