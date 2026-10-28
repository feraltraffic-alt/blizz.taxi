package taxi.blizz.identity;

import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * A rider's or driver's phone change (REQ-AUTH-08). By the person: a code to the current phone and one to the new
 * phone, both needed, so neither a stolen session nor a stolen SIM alone moves the account. The other sessions end.
 * When the old phone is lost: support sets the new phone with a reason, audited; every session ends and the person
 * signs in with the new phone, which proves it. Accounts are never merged: a phone of another account is refused.
 */
public interface PhoneChanges {

    /** Staff who change a driver's phone; the same right as the driver review ({@code driver.DriverAdmission}). */
    String DRIVER_PHONE_PERMISSION = "driver.review";

    /** Step one: a code of purpose PHONE_CHANGE to the current phone. */
    ChallengeIssued codeToCurrent(Actor subject, String deviceRef, String clientIp);

    /** Step two: a code of purpose NEW_PHONE to the new phone. Reveals nothing about who has that number. */
    ChallengeIssued codeToNew(Actor subject, String rawNewPhone, String deviceRef, String clientIp);

    record Changed(UUID subjectId, String phone, long version) {
    }

    /**
     * Step three: both codes; the phone becomes the new one, every other session of the account ends.
     * {@code STATE_CONFLICT} when the new phone is the current one or belongs to another account of the same kind.
     */
    Changed change(Actor subject, UUID commandId, UUID keepSessionId, UUID currentChallengeId, String currentCode,
                   UUID newChallengeId, String newCode);

    /**
     * Support, when the old phone is lost: {@code clients.manage} for a rider, {@link #DRIVER_PHONE_PERMISSION} for a
     * driver. Reason required, audited with masked numbers; every session of the account ends.
     */
    Changed changeBySupport(Actor staff, UUID commandId, Actor subject, long expectedVersion, String rawNewPhone,
                            String reason);
}
