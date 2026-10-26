package taxi.blizz.platform;

/**
 * Kind of subject behind an action. STAFF, CLIENT, DRIVER and PARTNER map to the four separate
 * root tables (section 36); SYSTEM is the platform itself (workers, schedulers).
 */
public enum SubjectType {
    STAFF,
    CLIENT,
    DRIVER,
    PARTNER,
    SYSTEM
}
