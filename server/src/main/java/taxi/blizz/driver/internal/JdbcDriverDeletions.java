package taxi.blizz.driver.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.driver.DriverDeletions;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.DriverErasing;
import taxi.blizz.identity.ErasedSubjects;
import taxi.blizz.identity.OtpPurpose;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.PageCursor;
import taxi.blizz.platform.SubjectType;

/**
 * A driver's deletion request (issue #144), as {@code identity.JdbcClientDeletions} for riders; also the driver kind
 * of the erasure journal ({@link ErasedSubjects}), so a restore does not bring a deleted driver back (ADR 0013).
 */
@Service
class JdbcDriverDeletions implements DriverDeletions, ErasedSubjects {

    private final JdbcClient jdbc;
    private final SessionService sessions;
    private final Outbox outbox;
    private final OtpService otp;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final List<DriverErasing> erasing;
    private final Clock clock;

    JdbcDriverDeletions(JdbcClient jdbc, SessionService sessions, Outbox outbox, OtpService otp,
                        IdempotentCommands commands, AuditLog audit, List<DriverErasing> erasing, Clock clock) {
        this.jdbc = jdbc;
        this.sessions = sessions;
        this.outbox = outbox;
        this.otp = otp;
        this.commands = commands;
        this.audit = audit;
        this.erasing = List.copyOf(erasing);
        this.clock = clock;
    }

    @Override
    public ChallengeIssued requestCode(Actor driver, String deviceRef, String clientIp) {
        requireDriver(driver);
        return otp.requestConfirmation(driver, OtpPurpose.ACCOUNT_DELETION, deviceRef, clientIp);
    }

    record RequestCommand(UUID challengeId, String otpCode) {
    }

    @Override
    public Status request(Actor driver, UUID currentSessionId, UUID commandId, UUID challengeId, String otpCode) {
        requireDriver(driver);
        if (challengeId == null || otpCode == null || otpCode.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The challenge and the code are required");
        }
        return commands.execute(new CommandKey(driver, "driver_deletion.request", commandId),
                new RequestCommand(challengeId, otpCode.strip()), Status.class, () -> {
                    // Checked in its own transaction: a wrong code counts as an attempt even though this fails.
                    otp.confirm(driver, challengeId, otpCode, OtpPurpose.ACCOUNT_DELETION);
                    String state = lockState(driver.id());
                    if (!"ACTIVE".equals(state) && !"BLOCKED".equals(state)) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "The account cannot be deleted from the state " + state);
                    }
                    OffsetDateTime now = now();
                    jdbc.sql("""
                                    update driver set account_state = 'DELETION_PENDING',
                                                      deletion_previous_state = account_state,
                                                      deletion_requested_at = :now, updated_at = :now,
                                                      version = version + 1
                                    where id = :id""")
                            .param("now", now).param("id", driver.id()).update();
                    sessions.revokeOthers(driver, currentSessionId, "ACCOUNT_DELETION_REQUESTED");
                    audit.record(new AuditEntry(driver, "driver_deletion.request", "driver", driver.id().toString(),
                            "The driver asked to delete the account", Map.of("account_state", state),
                            Map.of("account_state", "DELETION_PENDING")));
                    return new Status(driver.id(), "DELETION_PENDING", now);
                });
    }

    @Override
    public Status cancel(Actor driver, UUID commandId) {
        requireDriver(driver);
        return commands.execute(new CommandKey(driver, "driver_deletion.cancel", commandId), driver.id(),
                Status.class, () -> {
                    String previous = jdbc.sql("select deletion_previous_state from driver where id = :id")
                            .param("id", driver.id()).query(String.class).optional().orElse(null);
                    restore(driver.id());
                    audit.record(new AuditEntry(driver, "driver_deletion.cancel", "driver", driver.id().toString(),
                            "The driver cancelled the deletion request", Map.of("account_state", "DELETION_PENDING"),
                            Map.of("account_state", previous)));
                    return new Status(driver.id(), previous, null);
                });
    }

    private static void requireDriver(Actor driver) {
        if (driver == null || driver.type() != SubjectType.DRIVER) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only drivers delete their accounts here");
        }
    }

    private String lockState(UUID driverId) {
        return jdbc.sql("select account_state from driver where id = :id for update")
                .param("id", driverId).query(String.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Driver not found"));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pending> pending(PageCursor after, int limit) {
        return pending(null, after, limit);
    }

    @Override
    public List<Pending> pending(UUID serviceId, PageCursor after, int limit) {
        var query = jdbc.sql("""
                        select id, deletion_previous_state, deletion_requested_at from driver
                        where account_state = 'DELETION_PENDING'
                          and (cast(:service as uuid) is null or service_id = cast(:service as uuid))"""
                        + (after == null ? "" : " and (deletion_requested_at, id) > (:afterAt, :afterId)")
                        + " order by deletion_requested_at, id limit :limit")
                .param("service", serviceId)
                .param("limit", Math.max(1, Math.min(limit, PageCursor.MAX_FETCH)));
        if (after != null) {
            query = query.param("afterAt", after.time(0)).param("afterId", after.id(1));
        }
        return query.query((rs, i) -> new Pending(rs.getObject(1, UUID.class), rs.getString(2),
                        rs.getObject(3, OffsetDateTime.class)))
                .list();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pending> pending(UUID driverId) {
        return jdbc.sql("""
                        select id, deletion_previous_state, deletion_requested_at from driver
                        where id = :id and account_state = 'DELETION_PENDING'""")
                .param("id", driverId)
                .query((rs, i) -> new Pending(rs.getObject(1, UUID.class), rs.getString(2),
                        rs.getObject(3, OffsetDateTime.class)))
                .optional();
    }

    @Override
    @Transactional
    public void anonymize(UUID driverId) {
        lockPending(driverId);
        erase(driverId);
    }

    @Override
    public String subjectType() {
        return "DRIVER";
    }

    @Override
    public String anonymizedEvent() {
        return "DriverAnonymized";
    }

    @Override
    public String idField() {
        return "driver_id";
    }

    @Override
    public boolean reapply(UUID driverId) {
        Optional<String> state = jdbc.sql("select account_state from driver where id = :id for update")
                .param("id", driverId).query(String.class).optional();
        if (state.isEmpty() || "ANONYMIZED".equals(state.get())) {
            return false;
        }
        erase(driverId);
        audit.record(new AuditEntry(Actor.system(), "driver_deletion.reapply", "driver", driverId.toString(),
                "The erasure journal lists the driver, found again after a restore", Map.of("account_state",
                        state.get()), Map.of("account_state", "ANONYMIZED")));
        return true;
    }

    /**
     * Personal data off, sessions revoked, the other modules told (DriverAnonymized). What is known only by the phone
     * goes first, in this transaction, through {@link DriverErasing}. The documents keep their type, validity and
     * decision; their numbers go now, their files after the term ({@link DriverDocumentErasure}).
     */
    private void erase(UUID driverId) {
        Actor driver = new Actor(SubjectType.DRIVER, driverId);
        String phone = jdbc.sql("select phone_normalized from driver where id = :id").param("id", driverId)
                .query(String.class).optional().orElse(null);
        if (phone != null) {
            erasing.forEach(module -> module.erasing(driverId, phone));
        }
        commands.forget(driver);
        OffsetDateTime now = now();
        long version = jdbc.sql("""
                        update driver set account_state = 'ANONYMIZED', phone_normalized = null,
                                          phone_verified_at = null, name = null, language = null,
                                          deletion_previous_state = null, deletion_requested_at = null,
                                          anonymized_at = :now, updated_at = :now, version = version + 1
                        where id = :id returning version""")
                .param("now", now).param("id", driverId).query(Long.class).single();
        jdbc.sql("""
                        update driver_document set number = null, decision_reason = null
                        where driver_id = :id and (number is not null or decision_reason is not null)""")
                .param("id", driverId).update();
        sessions.revokeAll(driver, "ACCOUNT_ANONYMIZED");
        outbox.publish(new OutboxEvent("DriverAnonymized", 1, "Driver", driverId, version,
                Map.of("driver_id", driverId.toString())));
    }

    @Override
    @Transactional
    public void restore(UUID driverId) {
        lockPending(driverId);
        jdbc.sql("""
                        update driver set account_state = deletion_previous_state, deletion_previous_state = null,
                                          deletion_requested_at = null, updated_at = :now, version = version + 1
                        where id = :id""")
                .param("now", now()).param("id", driverId).update();
    }

    private void lockPending(UUID driverId) {
        String state = lockState(driverId);
        if (!"DELETION_PENDING".equals(state)) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The driver has no pending deletion request");
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
