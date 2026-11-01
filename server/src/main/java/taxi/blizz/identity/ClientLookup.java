package taxi.blizz.identity;

import java.util.UUID;

/**
 * One rider by their exact phone, for the operator's targeted lookup (registry 22.2, issue #176): never a search by
 * prefix, name or part of a number. The phone leaves this module only as a keyed hash, for the audit.
 */
public interface ClientLookup {

    record Client(UUID id, String name, String accountState) {
    }

    /** {@code client}: null when nobody active has the number. {@code phoneDigest}: HMAC-SHA256 of it, hex. */
    record Lookup(String phoneDigest, Client client) {
    }

    /**
     * {@code phone} must already be a full E.164 number of a served country, with as many digits as its numbers
     * have: anything else (spaces, a prefix, a missing "+", a name) is VALIDATION_FAILED. An anonymized or deleted
     * account is not found. Only the account of the taxi service {@code serviceId} (ADR 0016).
     */
    Lookup byPhone(java.util.UUID serviceId, String phone);

    /** {@link #byPhone(java.util.UUID, String)} in the taxi service of the staff member {@code within}. */
    Lookup byPhone(taxi.blizz.platform.Actor within, String phone);
}
