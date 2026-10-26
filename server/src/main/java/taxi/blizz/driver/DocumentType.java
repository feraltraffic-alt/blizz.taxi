package taxi.blizz.driver;

/** Kinds of admission documents; which are required is configured per instance. */
public enum DocumentType {
    DRIVER_LICENSE,
    IDENTITY,
    TAXI_PERMIT,
    VEHICLE_REGISTRATION,
    INSURANCE,
    OTHER;

    public boolean belongsToVehicle() {
        return this == VEHICLE_REGISTRATION || this == INSURANCE;
    }
}
