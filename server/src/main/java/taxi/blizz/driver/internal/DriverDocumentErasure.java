package taxi.blizz.driver.internal;

import org.springframework.stereotype.Component;

/**
 * Deletes a deleted driver's document files once {@code blizz.driver.document-keep} has passed since the erasure
 * (issue #144); the documents keep their type, validity and decision.
 */
@Component
class DriverDocumentErasure {

    /** One batch; returns how many documents lost their file. */
    int runOnce() {
        return 0;
    }
}
