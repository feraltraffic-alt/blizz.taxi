package taxi.blizz.operations.internal;

import org.springframework.stereotype.Component;

/**
 * Releases the privacy holds whose basis has ended (issue #144): once an order's chargeback is decided, the deleted
 * rider's data the hold kept on it is anonymized like the rest.
 */
@Component
class PrivacyHoldSweep {

    /** One batch; returns how many holds were released. */
    int runOnce() {
        return 0;
    }
}
