package taxi.blizz.payments;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/** Read and decide on bank-statement differences; these actions never move money (REQ-LED-07). */
public interface PaymentReconciliations {
    String RESOLVE_PERMISSION = "payments.retry";
    String DIFFERENCES_FOUND = "PaymentReconciliationDifferencesFound";

    enum Kind { MISSING_LOCALLY, MISSING_AT_PROVIDER, AMOUNT, CURRENCY, STATE, UNKNOWN_STILL }
    enum Decision { EXPLAINED, CORRECTED_BY_HAND, ESCALATED }

    record Run(UUID id, UUID merchantId, LocalDate day, OffsetDateTime periodFrom, OffsetDateTime periodTo,
               OffsetDateTime observedUntil, boolean partial, String state, Integer localCount, Integer providerCount,
               Integer itemCount, Integer openCount, String failureCode, int attempts, OffsetDateTime createdAt,
               OffsetDateTime updatedAt, OffsetDateTime finishedAt, long version) { }
    record Item(UUID id, UUID runId, Kind kind, String referenceFingerprint, UUID localOperationId, UUID localRecordId,
                String localType, String localState, Long localAmountMinor, String localCurrency,
                String providerType, String providerState, String providerStatus, Long providerAmountMinor,
                String providerCurrency, Long feeMinor, OffsetDateTime providerAt, String state, Decision decision,
                String reason, UUID resolvedBy, OffsetDateTime resolvedAt, long version) { }
    record Runs(List<Run> runs, String nextCursor) { }
    record Detail(Run run, List<Item> items, UUID next) { }

    Runs list(Actor actor, UUID merchantId, String cursor, int limit);
    Detail get(Actor actor, UUID runId, UUID after, int limit);
    Item resolve(Actor actor, UUID commandId, UUID itemId, long expectedVersion, Decision decision, String reason);
}
