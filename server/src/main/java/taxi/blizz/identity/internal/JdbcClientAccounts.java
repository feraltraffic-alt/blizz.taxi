package taxi.blizz.identity.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.ClientAccounts;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;

/** Riders for staff (REQ-ADM-01, section 36.4); see {@link ClientAccounts}. */
@Service
class JdbcClientAccounts implements ClientAccounts {

    private static final int REASON_MAX = 500;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final SessionService sessions;
    private final Clock clock;

    JdbcClientAccounts(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                       SessionService sessions, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.sessions = sessions;
        this.clock = clock;
    }

    private static final String SELECT = """
            select id, phone_normalized, name, language, account_state, has_app, created_at, version,
                   blocked_reason, blocked_until, blocked_at, blocked_by, deletion_requested_at
            from client
            """;

    @Override
    @Transactional(readOnly = true)
    public List<Client> search(Actor actor, String query, int limit) {
        staff.require(actor, MANAGE_PERMISSION);
        String text = query == null ? "" : query.strip();
        String digits = text.replaceAll("\\D", "");
        boolean byPhone = digits.length() >= 4;
        if (!byPhone && text.length() < 2) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    "Search by at least 4 digits of the phone or 2 letters of the name");
        }
        String pattern = "%" + (byPhone ? digits : text.toLowerCase(Locale.ROOT).replace("\\", "\\\\")
                .replace("%", "\\%").replace("_", "\\_")) + "%";
        return jdbc.sql(SELECT + (byPhone
                        ? "where account_state <> 'ANONYMIZED' and phone_normalized like :pattern\n"
                        : "where account_state <> 'ANONYMIZED' and lower(name) like :pattern escape '\\'\n")
                        // Riders of the staff member's own taxi service only (ADR 0016).
                        + "and service_id = (select service_id from staff_user where id = :staff)\n"
                        + "order by created_at desc, id limit :limit")
                .param("staff", actor.id()).param("pattern", pattern).param("limit", Math.max(1, Math.min(limit, 50)))
                .query((rs, i) -> client(rs)).list();
    }

    @Override
    @Transactional(readOnly = true)
    public Client get(Actor actor, UUID clientId) {
        staff.requireForClient(actor, MANAGE_PERMISSION, clientId);
        return find(clientId, false);
    }

    @Override
    public java.util.Optional<OffsetDateTime> registeredAt(UUID clientId) {
        return jdbc.sql("select created_at from client where id = :id").param("id", clientId)
                .query((rs, i) -> rs.getObject(1, OffsetDateTime.class)).optional();
    }

    record BlockRequest(UUID clientId, long expectedVersion, String reason, OffsetDateTime until) {
    }

    @Override
    public Client block(Actor actor, UUID commandId, UUID clientId, long expectedVersion, String reason,
                        OffsetDateTime until) {
        staff.requireForClient(actor, MANAGE_PERMISSION, clientId);
        String why = reason(reason);
        OffsetDateTime end = until == null ? null : until.withOffsetSameInstant(ZoneOffset.UTC);
        if (end != null && !end.isAfter(now())) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The end of a block must be in the future");
        }
        return commands.execute(new CommandKey(actor, "client.block", commandId),
                new BlockRequest(clientId, expectedVersion, why, end), Client.class, () -> {
                    Client before = lock(clientId, expectedVersion);
                    if (!"ACTIVE".equals(before.accountState())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Only an active rider can be blocked, this one is " + before.accountState());
                    }
                    OffsetDateTime now = now();
                    jdbc.sql("""
                                    update client set account_state = 'BLOCKED', blocked_reason = :reason,
                                                      blocked_until = :until, blocked_at = :now, blocked_by = :by,
                                                      updated_at = :now, version = version + 1
                                    where id = :id""")
                            .param("reason", why).param("until", end).param("now", now).param("by", actor.id())
                            .param("id", clientId).update();
                    // New operations stop at once (REQ-AUTH-07); a trip in progress goes on with the call centre.
                    sessions.revokeAll(new Actor(SubjectType.CLIENT, clientId), "ACCOUNT_BLOCKED");
                    Client after = find(clientId, false);
                    audit.record(new AuditEntry(actor, "client.block", "client", clientId.toString(), why,
                            Map.of("account_state", before.accountState()),
                            Map.of("account_state", "BLOCKED", "until", end == null ? "" : end.toString())));
                    return after;
                });
    }

    record UnblockRequest(UUID clientId, long expectedVersion, String reason) {
    }

    @Override
    public Client unblock(Actor actor, UUID commandId, UUID clientId, long expectedVersion, String reason) {
        staff.requireForClient(actor, MANAGE_PERMISSION, clientId);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "client.unblock", commandId),
                new UnblockRequest(clientId, expectedVersion, why), Client.class, () -> {
                    Client before = lock(clientId, expectedVersion);
                    if (!"BLOCKED".equals(before.accountState())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Only a blocked rider can be unblocked, this one is " + before.accountState());
                    }
                    activate(clientId);
                    audit.record(new AuditEntry(actor, "client.unblock", "client", clientId.toString(), why,
                            Map.of("account_state", "BLOCKED"), Map.of("account_state", "ACTIVE")));
                    return find(clientId, false);
                });
    }

    @Override
    @Transactional
    public int liftExpiredBlocks() {
        List<UUID> due = jdbc.sql("""
                        select id from client
                        where account_state = 'BLOCKED' and blocked_until is not null and blocked_until <= :now
                        order by blocked_until limit 100 for update skip locked""")
                .param("now", now()).query(UUID.class).list();
        for (UUID clientId : due) {
            activate(clientId);
            audit.record(new AuditEntry(Actor.system(), "client.unblock", "client", clientId.toString(),
                    "The block ended", Map.of("account_state", "BLOCKED"), Map.of("account_state", "ACTIVE")));
        }
        return due.size();
    }

    /** Every minute; on every instance, safely (rows are taken with SKIP LOCKED). */
    @Scheduled(fixedDelayString = "${blizz.clients.block-check-interval:PT1M}",
            initialDelayString = "${blizz.clients.block-check-interval:PT1M}")
    void liftOnSchedule() {
        liftExpiredBlocks();
    }

    // ---------------------------------------------------------------- helpers

    private void activate(UUID clientId) {
        jdbc.sql("""
                        update client set account_state = 'ACTIVE', blocked_reason = null, blocked_until = null,
                                          blocked_at = null, blocked_by = null, updated_at = :now,
                                          version = version + 1
                        where id = :id""")
                .param("now", now()).param("id", clientId).update();
    }

    private Client lock(UUID clientId, long expectedVersion) {
        Client client = find(clientId, true);
        if (client.version() != expectedVersion) {
            throw ConflictException.version(client.version(),
                    "The rider changed: expected version " + expectedVersion + ", current " + client.version());
        }
        return client;
    }

    private Client find(UUID clientId, boolean lock) {
        return jdbc.sql(SELECT + "where id = :id and account_state <> 'ANONYMIZED'" + (lock ? " for update" : ""))
                .param("id", clientId).query((rs, i) -> client(rs)).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Rider not found"));
    }

    private static Client client(java.sql.ResultSet rs) throws java.sql.SQLException {
        OffsetDateTime blockedAt = rs.getObject("blocked_at", OffsetDateTime.class);
        Block block = blockedAt == null ? null : new Block(rs.getString("blocked_reason"),
                rs.getObject("blocked_until", OffsetDateTime.class), blockedAt, rs.getObject("blocked_by", UUID.class));
        return new Client(rs.getObject("id", UUID.class), rs.getString("phone_normalized"), rs.getString("name"),
                rs.getString("language"), rs.getString("account_state"), rs.getBoolean("has_app"),
                rs.getObject("created_at", OffsetDateTime.class), rs.getLong("version"), block,
                rs.getObject("deletion_requested_at", OffsetDateTime.class));
    }

    private static String reason(String reason) {
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > REASON_MAX) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of at most 500 characters is required");
        }
        return why;
    }

    private OffsetDateTime now() {
        return clock.instant().truncatedTo(ChronoUnit.MICROS).atOffset(ZoneOffset.UTC);
    }
}
