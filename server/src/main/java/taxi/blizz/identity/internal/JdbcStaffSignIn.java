package taxi.blizz.identity.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.StaffSignIn;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.RateLimitedException;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcStaffSignIn implements StaffSignIn {

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final StaffPasswords passwords;
    private final StaffProperties properties;
    private final SessionService sessions;
    private final AuditLog audit;
    private final StaffActivityLog activity;
    private final Clock clock;

    JdbcStaffSignIn(JdbcClient jdbc, TransactionTemplate tx, StaffPasswords passwords, StaffProperties properties,
                    SessionService sessions, AuditLog audit, StaffActivityLog activity, Clock clock) {
        this.activity = activity;
        this.jdbc = jdbc;
        this.tx = tx;
        this.passwords = passwords;
        this.properties = properties;
        this.sessions = sessions;
        this.audit = audit;
        this.clock = clock;
    }

    private record Account(UUID id, String state, String hash, int failed, OffsetDateTime lockedUntil,
                           boolean mustChange) {
    }

    private enum Outcome {
        SUCCESS, BAD_CREDENTIALS, LOCKED, NOT_ACTIVE
    }

    private record Attempt(Outcome outcome, Account account, Duration retryAfter) {
    }

    @Override
    public Result signIn(String login, String password, ApiAudience audience, String deviceRef, String clientIp) {
        if (audience != ApiAudience.ADMIN && audience != ApiAudience.OPERATOR) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Staff sign in to ADMIN or OPERATOR");
        }
        String normalized = login == null ? "" : login.strip().toLowerCase(Locale.ROOT);
        // The attempt and its counters commit even when the sign-in fails.
        Attempt attempt = tx.execute(status -> attempt(normalized, password, audience));
        activity.signIn(attempt.account() == null ? null : attempt.account().id(), normalized, audience.value(),
                attempt.outcome().name(), clientIp);
        switch (attempt.outcome()) {
            case LOCKED -> throw new RateLimitedException("Too many wrong passwords; try again later",
                    attempt.retryAfter());
            case BAD_CREDENTIALS -> throw new DomainException(ErrorCode.UNAUTHENTICATED, "Wrong login or password");
            case NOT_ACTIVE -> throw new DomainException(ErrorCode.ACCESS_DENIED, "The account cannot sign in");
            default -> {
            }
        }
        Actor actor = new Actor(SubjectType.STAFF, attempt.account().id());
        return new Result(sessions.openStaff(new VerifiedSubject(actor, "ACTIVE", false), audience, deviceRef),
                attempt.account().mustChange());
    }

    private Attempt attempt(String login, String password, ApiAudience audience) {
        OffsetDateTime now = now();
        Account account = jdbc.sql("""
                        select id, state, password_hash, failed_sign_ins, locked_until, must_change_password
                        from staff_user where lower(login) = :login for update""")
                .param("login", login)
                .query((rs, i) -> new Account(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getObject(5, OffsetDateTime.class), rs.getBoolean(6)))
                .optional().orElse(null);
        Attempt result;
        if (account == null) {
            passwords.burn(password);
            result = new Attempt(Outcome.BAD_CREDENTIALS, null, null);
        } else if (account.lockedUntil() != null && account.lockedUntil().isAfter(now)) {
            passwords.burn(password);
            result = new Attempt(Outcome.LOCKED, account, Duration.between(now, account.lockedUntil()));
        } else if (!passwords.matches(password, account.hash())) {
            int failed = account.failed() + 1;
            boolean lock = failed >= properties.maxFailedSignIns();
            jdbc.sql("update staff_user set failed_sign_ins = :failed, locked_until = :until where id = :id")
                    .param("failed", lock ? 0 : failed)
                    .param("until", lock ? now.plus(properties.lockout()) : null)
                    .param("id", account.id()).update();
            result = lock ? new Attempt(Outcome.LOCKED, account, properties.lockout())
                    : new Attempt(Outcome.BAD_CREDENTIALS, account, null);
        } else if (!"ACTIVE".equals(account.state())) {
            result = new Attempt(Outcome.NOT_ACTIVE, account, null);
        } else {
            jdbc.sql("update staff_user set failed_sign_ins = 0, locked_until = null where id = :id")
                    .param("id", account.id()).update();
            result = new Attempt(Outcome.SUCCESS, account, null);
        }
        jdbc.sql("""
                        insert into staff_sign_in (id, login, staff_id, outcome, audience, occurred_at)
                        values (:id, :login, :staff, :outcome, :audience, :now)""")
                .param("id", UUID.randomUUID()).param("login", login)
                .param("staff", account == null ? null : account.id())
                .param("outcome", result.outcome().name()).param("audience", audience.value()).param("now", now)
                .update();
        return result;
    }

    @Override
    public void changePassword(Actor staff, String currentPassword, String newPassword) {
        if (staff == null || staff.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Staff only");
        }
        tx.executeWithoutResult(status -> {
            record Row(String login, String hash) {
            }
            Row row = jdbc.sql("select login, password_hash from staff_user where id = :id and state = 'ACTIVE' for update")
                    .param("id", staff.id())
                    .query((rs, i) -> new Row(rs.getString(1), rs.getString(2)))
                    .optional()
                    .orElseThrow(() -> new DomainException(ErrorCode.ACCESS_DENIED, "The account cannot sign in"));
            if (!passwords.matches(currentPassword, row.hash())) {
                throw new DomainException(ErrorCode.UNAUTHENTICATED, "The current password is wrong");
            }
            if (passwords.matches(newPassword, row.hash())) {
                throw new DomainException(ErrorCode.VALIDATION_FAILED, "Choose a new password");
            }
            jdbc.sql("""
                            update staff_user set password_hash = :hash, must_change_password = false,
                                                  password_changed_at = :now, updated_at = :now
                            where id = :id""")
                    .param("hash", passwords.hash(row.login(), newPassword)).param("now", now())
                    .param("id", staff.id()).update();
            audit.record(new AuditEntry(staff, "staff.changePassword", "staff_user", staff.id().toString(),
                    "Own password changed", null, null));
        });
    }

    private OffsetDateTime now() {
        return clock.instant().atOffset(ZoneOffset.UTC);
    }
}
