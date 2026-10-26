package taxi.blizz.identity;

import taxi.blizz.platform.SubjectType;

/** Who a one-time code is for. A challenge never opens an account of the other kind (REQ-USR-09). */
public enum OtpAudience {
    CLIENT(SubjectType.CLIENT),
    DRIVER(SubjectType.DRIVER);

    private final SubjectType subjectType;

    OtpAudience(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public SubjectType subjectType() {
        return subjectType;
    }
}
