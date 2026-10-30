package taxi.blizz.identity.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.UUID;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.ClientAccounts;
import taxi.blizz.identity.OtpPurpose;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.PhoneChanges;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcPhoneChanges implements PhoneChanges {

    private final JdbcClient jdbc;
    private final OtpService otp;
    private final SessionService sessions;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final Clock clock;

    JdbcPhoneChanges(JdbcClient jdbc, OtpService otp, SessionService sessions, StaffAccess staff,
                     IdempotentCommands commands, AuditLog audit, Clock clock) {
        this.jdbc = jdbc;
        this.otp = otp;
        this.sessions = sessions;
        this.staff = staff;
        this.commands = commands;
        this.audit = audit;
        this.clock = clock;
    }

    @Override
    public ChallengeIssued codeToCurrent(Actor subject, String deviceRef, String clientIp) {
        requirePerson(subject);
        return otp.requestConfirmation(subject, OtpPurpose.PHONE_CHANGE, deviceRef, clientIp);
    }

    @Override
    public ChallengeIssued codeToNew(Actor subject, String rawNewPhone, String deviceRef, String clientIp) {
        requirePerson(subject);
        PhoneNumber phone = PhoneNumber.parse(rawNewPhone);
        if (phone.e164().equals(jdbc.sql("select phone_normalized from " + table(subject) + " where id = :id")
                .param("id", subject.id()).query(String.class).optional().orElse(null))) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "This is already the account's phone");
        }
        return otp.requestForNewPhone(subject, phone.e164(), deviceRef, clientIp);
    }

    record ChangeCommand(UUID currentChallengeId, String currentCode, UUID newChallengeId, String newCode) {
    }

    @Override
    public Changed change(Actor subject, UUID commandId, UUID keepSessionId, UUID currentChallengeId,
                          String currentCode, UUID newChallengeId, String newCode) {
        requirePerson(subject);
        if (currentChallengeId == null || newChallengeId == null || blank(currentCode) || blank(newCode)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Both codes and their challenges are required");
        }
        return commands.execute(new CommandKey(subject, "phone.change", commandId),
                new ChangeCommand(currentChallengeId, currentCode.strip(), newChallengeId, newCode.strip()),
                Changed.class, () -> {
                    // Each code is checked in its own transaction: a wrong one counts as an attempt even though this fails.
                    otp.confirm(subject, currentChallengeId, currentCode, OtpPurpose.PHONE_CHANGE);
                    PhoneNumber phone = otp.confirmNewPhone(subject, newChallengeId, newCode);
                    Account before = lock(subject);
                    if (!"ACTIVE".equals(before.state())) {
                        throw new DomainException(ErrorCode.ACCOUNT_NOT_ACTIVE,
                                "The phone cannot be changed in the state " + before.state());
                    }
                    Changed changed = write(subject, before, phone);
                    sessions.revokeOthers(subject, keepSessionId, "PHONE_CHANGED");
                    audit.record(new AuditEntry(subject, "phone.change", table(subject), subject.id().toString(),
                            "Changed by the account holder with codes to both phones",
                            Map.of("phone", before.phone().masked()), Map.of("phone", phone.masked())));
                    return changed;
                });
    }

    record SupportCommand(UUID subjectId, String subjectType, long expectedVersion, UUID newChallengeId,
                          String newCode, String reason) {
    }

    private void requireSupport(Actor actor, Actor subject) {
        requirePerson(subject);
        staff.require(actor, subject.type() == SubjectType.CLIENT ? ClientAccounts.MANAGE_PERMISSION
                : DRIVER_PHONE_PERMISSION);
    }

    @Override
    public ChallengeIssued codeToNewBySupport(Actor actor, Actor subject, String rawNewPhone, String clientIp) {
        requireSupport(actor, subject);
        PhoneNumber phone = PhoneNumber.parse(rawNewPhone);
        if (phone.e164().equals(jdbc.sql("select phone_normalized from " + table(subject) + " where id = :id")
                .param("id", subject.id()).query(String.class).optional().orElse(null))) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "This is already the account's phone");
        }
        audit.record(new AuditEntry(actor, "phone.code_by_support", table(subject), subject.id().toString(),
                "A code to the new phone, for a change by support", Map.of(), Map.of("phone", phone.masked())));
        return otp.requestForNewPhone(subject, phone.e164(), "support:" + actor.id(), clientIp);
    }

    @Override
    public Changed changeBySupport(Actor actor, UUID commandId, Actor subject, long expectedVersion,
                                   UUID newChallengeId, String newCode, String reason) {
        requireSupport(actor, subject);
        if (blank(reason)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        if (newChallengeId == null || blank(newCode)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The code sent to the new phone is required");
        }
        String why = reason.strip();
        return commands.execute(new CommandKey(actor, "phone.change_by_support", commandId),
                new SupportCommand(subject.id(), subject.type().name(), expectedVersion, newChallengeId,
                        newCode.strip(), why),
                Changed.class, () -> {
                    Account before = lock(subject);
                    if (before.version() != expectedVersion) {
                        throw ConflictException.version(before.version(), "The account changed");
                    }
                    if ("ANONYMIZED".equals(before.state())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The account is anonymized");
                    }
                    // After the account checks, so a stale version does not use the code up. Checked in its own
                    // transaction: a wrong code counts as an attempt even though this fails.
                    PhoneNumber phone = otp.confirmNewPhone(subject, newChallengeId, newCode);
                    Changed changed = write(subject, before, phone);
                    // Nobody keeps a session opened with the old phone.
                    sessions.revokeAll(subject, "PHONE_CHANGED_BY_SUPPORT");
                    audit.record(new AuditEntry(actor, "phone.change_by_support", table(subject),
                            subject.id().toString(), why, Map.of("phone", before.phone().masked()),
                            Map.of("phone", phone.masked())));
                    return changed;
                });
    }

    private record Account(PhoneNumber phone, String state, long version) {
    }

    private Account lock(Actor subject) {
        return jdbc.sql("select phone_normalized, account_state, version from " + table(subject)
                        + " where id = :id for update")
                .param("id", subject.id())
                .query((rs, i) -> new Account(rs.getString(1) == null ? null : new PhoneNumber(rs.getString(1)),
                        rs.getString(2), rs.getLong(3)))
                .optional()
                .filter(a -> a.phone() != null)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Account not found"));
    }

    /** No merging of accounts (REQ-AUTH-08): a phone another account of the same kind has is refused. */
    private Changed write(Actor subject, Account before, PhoneNumber phone) {
        if (phone.equals(before.phone())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "This is already the account's phone");
        }
        long version = before.version() + 1;
        try {
            jdbc.sql("update " + table(subject) + """
                             set phone_normalized = :phone, phone_verified_at = :now, version = :version,
                                 updated_at = :now
                            where id = :id""")
                    .param("phone", phone.e164()).param("now", now()).param("version", version)
                    .param("id", subject.id()).update();
        } catch (DuplicateKeyException taken) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The phone belongs to another account");
        }
        return new Changed(subject.id(), phone.e164(), version);
    }

    /** Only these two tables: the subject type is checked before, never taken from input as text. */
    private static String table(Actor subject) {
        return subject.type() == SubjectType.CLIENT ? "client" : "driver";
    }

    private static void requirePerson(Actor subject) {
        if (subject == null || (subject.type() != SubjectType.CLIENT && subject.type() != SubjectType.DRIVER)) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only a rider's or driver's phone");
        }
    }

    private static boolean blank(String value) {
        return value == null || value.isBlank();
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
