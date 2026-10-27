package taxi.blizz.identity.internal;

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
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.ClientDeletions;
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
import taxi.blizz.platform.SubjectType;

@Service
class JdbcClientDeletions implements ClientDeletions {

    private final JdbcClient jdbc;
    private final SessionService sessions;
    private final Outbox outbox;
    private final OtpService otp;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final Clock clock;

    JdbcClientDeletions(JdbcClient jdbc, SessionService sessions, Outbox outbox, OtpService otp,
                        IdempotentCommands commands, AuditLog audit, Clock clock) {
        this.jdbc = jdbc;
        this.sessions = sessions;
        this.outbox = outbox;
        this.otp = otp;
        this.commands = commands;
        this.audit = audit;
        this.clock = clock;
    }

    @Override
    public ChallengeIssued requestCode(Actor rider, String deviceRef, String clientIp) {
        requireRider(rider);
        return otp.requestConfirmation(rider, OtpPurpose.ACCOUNT_DELETION, deviceRef, clientIp);
    }

    record RequestCommand(UUID challengeId, String otpCode) {
    }

    @Override
    public Status request(Actor rider, UUID currentSessionId, UUID commandId, UUID challengeId, String otpCode) {
        requireRider(rider);
        if (challengeId == null || otpCode == null || otpCode.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The challenge and the code are required");
        }
        return commands.execute(new CommandKey(rider, "client_deletion.request", commandId),
                new RequestCommand(challengeId, otpCode.strip()), Status.class, () -> {
                    // Checked in its own transaction: a wrong code counts as an attempt even though this fails.
                    otp.confirm(rider, challengeId, otpCode, OtpPurpose.ACCOUNT_DELETION);
                    String state = lockState(rider.id());
                    if (!"ACTIVE".equals(state) && !"BLOCKED".equals(state)) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "The account cannot be deleted from the state " + state);
                    }
                    OffsetDateTime now = now();
                    jdbc.sql("""
                                    update client set account_state = 'DELETION_PENDING',
                                                      deletion_previous_state = account_state,
                                                      deletion_requested_at = :now, updated_at = :now,
                                                      version = version + 1
                                    where id = :id""")
                            .param("now", now).param("id", rider.id()).update();
                    sessions.revokeOthers(rider, currentSessionId, "ACCOUNT_DELETION_REQUESTED");
                    audit.record(new AuditEntry(rider, "client_deletion.request", "client", rider.id().toString(),
                            "The rider asked to delete the account", Map.of("account_state", state),
                            Map.of("account_state", "DELETION_PENDING")));
                    return new Status(rider.id(), "DELETION_PENDING", now);
                });
    }

    @Override
    public Status cancel(Actor rider, UUID commandId) {
        requireRider(rider);
        return commands.execute(new CommandKey(rider, "client_deletion.cancel", commandId), rider.id(),
                Status.class, () -> {
                    String previous = jdbc.sql("select deletion_previous_state from client where id = :id")
                            .param("id", rider.id()).query(String.class).optional().orElse(null);
                    restore(rider.id());
                    audit.record(new AuditEntry(rider, "client_deletion.cancel", "client", rider.id().toString(),
                            "The rider cancelled the deletion request", Map.of("account_state", "DELETION_PENDING"),
                            Map.of("account_state", previous)));
                    return new Status(rider.id(), previous, null);
                });
    }

    private static void requireRider(Actor rider) {
        if (rider == null || rider.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only riders delete their accounts here");
        }
    }

    private String lockState(UUID clientId) {
        return jdbc.sql("select account_state from client where id = :id for update")
                .param("id", clientId).query(String.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Client not found"));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pending> pending(OffsetDateTime after, int limit) {
        var query = jdbc.sql("""
                        select id, deletion_previous_state, deletion_requested_at from client
                        where account_state = 'DELETION_PENDING'"""
                        + (after == null ? "" : " and deletion_requested_at > :after")
                        + " order by deletion_requested_at, id limit :limit")
                .param("limit", Math.max(1, Math.min(limit, 100)));
        if (after != null) {
            query = query.param("after", after);
        }
        return query.query((rs, i) -> new Pending(rs.getObject(1, UUID.class), rs.getString(2),
                        rs.getObject(3, OffsetDateTime.class)))
                .list();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pending> pending(UUID clientId) {
        return jdbc.sql("""
                        select id, deletion_previous_state, deletion_requested_at from client
                        where id = :id and account_state = 'DELETION_PENDING'""")
                .param("id", clientId)
                .query((rs, i) -> new Pending(rs.getObject(1, UUID.class), rs.getString(2),
                        rs.getObject(3, OffsetDateTime.class)))
                .optional();
    }

    @Override
    @Transactional
    public void anonymize(UUID clientId) {
        lockPending(clientId);
        erase(clientId);
    }

    /**
     * After a backup was restored (REQ-PRV-05): a client the erasure journal lists, found here again with personal
     * data, is anonymized again, in the caller's transaction. Returns whether anything had to be done.
     */
    boolean reapply(UUID clientId) {
        Optional<String> state = jdbc.sql("select account_state from client where id = :id for update")
                .param("id", clientId).query(String.class).optional();
        if (state.isEmpty() || "ANONYMIZED".equals(state.get())) {
            return false;
        }
        erase(clientId);
        audit.record(new AuditEntry(Actor.system(), "client_deletion.reapply", "client", clientId.toString(),
                "The erasure journal lists the client, found again after a restore", Map.of("account_state",
                        state.get()), Map.of("account_state", "ANONYMIZED")));
        return true;
    }

    /** Personal data off, sessions revoked, the other modules told (ClientAnonymized). */
    private void erase(UUID clientId) {
        long version = jdbc.sql("""
                        update client set account_state = 'ANONYMIZED', phone_normalized = null,
                                          phone_verified_at = null, name = null, language = null,
                                          deletion_previous_state = null, updated_at = :now, version = version + 1
                        where id = :id returning version""")
                .param("now", now()).param("id", clientId).query(Long.class).single();
        sessions.revokeAll(new Actor(SubjectType.CLIENT, clientId), "ACCOUNT_ANONYMIZED");
        outbox.publish(new OutboxEvent("ClientAnonymized", 1, "Client", clientId, version,
                Map.of("client_id", clientId.toString())));
    }

    @Override
    @Transactional
    public void restore(UUID clientId) {
        lockPending(clientId);
        jdbc.sql("""
                        update client set account_state = deletion_previous_state, deletion_previous_state = null,
                                          deletion_requested_at = null, updated_at = :now, version = version + 1
                        where id = :id""")
                .param("now", now()).param("id", clientId).update();
    }

    private void lockPending(UUID clientId) {
        String state = lockState(clientId);
        if (!"DELETION_PENDING".equals(state)) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The client has no pending deletion request");
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
