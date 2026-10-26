package taxi.blizz.operations;

/** Where an order came from; recorded on the order and in its history. */
public enum OrderChannel {
    /** Rider app, by the client's own account. */
    APP,
    /** Website, by the client's own account (the same sign-in by code). */
    WEB,
    /** Taken by an operator, usually from a phone call (REQ-OPS-03). */
    PHONE,
    /** Received from a partner service through the exchange protocol (section 18, M2). */
    PARTNER
}
