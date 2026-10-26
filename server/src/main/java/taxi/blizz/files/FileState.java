package taxi.blizz.files;

/** AWAITING_UPLOAD → QUARANTINE → SAFE or REJECTED. Only SAFE files can be attached or downloaded. */
public enum FileState {
    AWAITING_UPLOAD,
    QUARANTINE,
    SAFE,
    REJECTED
}
