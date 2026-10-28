package taxi.blizz.platform;

/** App build is below the minimum for its platform (REQ-API-10). Carries the required version. */
public class UpgradeRequiredException extends DomainException {

    private final String minimumVersion;

    public UpgradeRequiredException(String minimumVersion) {
        super(ErrorCode.UPGRADE_REQUIRED, "Update required: minimum " + minimumVersion);
        this.minimumVersion = minimumVersion;
    }

    public String minimumVersion() {
        return minimumVersion;
    }
}
