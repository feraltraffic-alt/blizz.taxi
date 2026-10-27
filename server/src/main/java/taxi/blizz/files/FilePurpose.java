package taxi.blizz.files;

/** Why a file is uploaded; decides who may use it and which types are accepted. */
public enum FilePurpose {
    DRIVER_DOCUMENT,
    SUPPORT_ATTACHMENT,
    /** A call's recording (issue #60): stored by the server itself, always encrypted at rest. */
    CALL_RECORDING
}
