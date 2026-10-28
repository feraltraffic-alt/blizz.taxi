package taxi.blizz.identity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * A rider's copy of their personal data (REQ-PRV-07, issue #68). The rider asks with a one-time code to the account's
 * phone (purpose DATA_EXPORT), so a stolen session alone does not get the data; a background job collects every
 * module's {@link taxi.blizz.platform.PersonalData} part into one JSON file; only the rider downloads it, within
 * {@code blizz.privacy.data-export-keep} (7 days), then it is dropped. One export at a time and at most one a day.
 * Requests and downloads are audited. Support sees that an export was asked for, never its content.
 */
public interface PersonalDataExports {

    /** PENDING → RUNNING → READY (until {@code expiresAt}) or FAILED; READY → EXPIRED, the file is dropped. */
    record Export(UUID id, String state, OffsetDateTime createdAt, OffsetDateTime readyAt, OffsetDateTime expiresAt,
                  Long sizeBytes) {
    }

    record File(String name, byte[] content) {
    }

    /** Step one: a code of purpose DATA_EXPORT to the rider's current phone. */
    ChallengeIssued requestCode(Actor rider, String deviceRef, String clientIp);

    /** Step two: the code; an ACTIVE or DELETION_PENDING account. */
    Export request(Actor rider, UUID commandId, UUID challengeId, String otpCode);

    /** The rider's own exports, newest first. */
    List<Export> mine(Actor rider);

    Export get(Actor rider, UUID exportId);

    File download(Actor rider, UUID exportId);

    /** For support, with {@link ClientAccounts#MANAGE_PERMISSION}: the states only, never the content. */
    List<Export> ofClient(Actor staff, UUID clientId);

    /** Builds up to {@code max} waiting exports; returns how many were taken. */
    int buildPending(int max);

    /** Drops the files whose time is over; returns how many. */
    int expire();
}
