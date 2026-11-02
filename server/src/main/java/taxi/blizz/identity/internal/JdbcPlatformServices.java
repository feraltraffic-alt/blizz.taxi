package taxi.blizz.identity.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.PlatformServices;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;

/** See {@link PlatformServices}. */
@Service
class JdbcPlatformServices implements PlatformServices {

    private static final String SELECT = "select id, code, name, state, version, created_at from service";

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffPasswords passwords;
    private final RightsPassword rightsPassword;
    private final AuditLog audit;
    private final Clock clock;

    JdbcPlatformServices(JdbcClient jdbc, IdempotentCommands commands, StaffPasswords passwords,
                         RightsPassword rightsPassword, AuditLog audit, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.passwords = passwords;
        this.rightsPassword = rightsPassword;
        this.audit = audit;
        this.clock = clock;
    }

    record CreateRequest(String code, String name, String login, String firstName, String lastName, String reason) {
    }

    record StateRequest(UUID serviceId, long expectedVersion, String state, String reason) {
    }

    @Override
    @Transactional(readOnly = true)
    public List<TaxiService> list(Actor owner) {
        requireOwner(owner);
        return jdbc.sql(SELECT + " order by code").query((rs, i) -> map(rs)).list();
    }

    @Override
    public TaxiService create(Actor owner, UUID commandId, String code, String name, FirstSuperAdmin superAdmin,
                              String reason, String password) {
        requireOwner(owner);
        String cleanCode = code == null ? "" : code.strip().toLowerCase(Locale.ROOT);
        if (!cleanCode.matches("^[a-z0-9][a-z0-9-]{1,39}$")) {
            throw invalid("A code of 2 to 40 lower-case letters, digits and hyphens");
        }
        String cleanName = text(name, 120, "A name");
        String why = text(reason, 500, "A reason");
        if (superAdmin == null) {
            throw invalid("The first super admin is required");
        }
        String login = text(superAdmin.login(), 64, "A login").toLowerCase(Locale.ROOT);
        String first = text(superAdmin.firstName(), 80, "A first name");
        String last = text(superAdmin.lastName(), 80, "A last name");
        passwords.check(login, superAdmin.initialPassword());
        // A service and its super admin are rights: the owner's own password (REQ-ADM-10).
        rightsPassword.confirm(owner, password, "service.create", "service", cleanCode, why,
                Map.of("code", cleanCode, "name", cleanName, "super_admin_login", login));
        return commands.execute(new CommandKey(owner, "service.create", commandId),
                new CreateRequest(cleanCode, cleanName, login, first, last, why), TaxiService.class, () -> {
                    UUID id = UUID.randomUUID();
                    OffsetDateTime now = now();
                    try {
                        jdbc.sql("""
                                        insert into service (id, code, name, created_at, updated_at)
                                        values (:id, :code, :name, :now, :now)""")
                                .param("id", id).param("code", cleanCode).param("name", cleanName).param("now", now)
                                .update();
                        jdbc.sql("""
                                        insert into staff_user (id, login, first_name, last_name, name, role,
                                                                permissions, all_cities, state, password_hash,
                                                                must_change_password, created_by, created_at,
                                                                updated_at, version, service_id)
                                        values (:id, :login, :first, :last, :name, 'SUPER_ADMIN', '{}', true,
                                                'ACTIVE', :hash, true, :by, :now, :now, 0, :service)""")
                                .param("id", UUID.randomUUID()).param("login", login).param("first", first)
                                .param("last", last).param("name", first + " " + last)
                                .param("hash", passwords.hash(login, superAdmin.initialPassword()))
                                .param("by", owner.id()).param("now", now).param("service", id).update();
                    } catch (DuplicateKeyException taken) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The code or the login is taken");
                    }
                    TaxiService created = read(id);
                    audit.record(new AuditEntry(owner, "service.create", "service", id.toString(), why, null,
                            Map.of("code", cleanCode, "name", cleanName, "super_admin_login", login)));
                    return created;
                });
    }

    @Override
    public TaxiService changeState(Actor owner, UUID commandId, UUID serviceId, long expectedVersion, String state,
                                   String reason) {
        requireOwner(owner);
        if (!"ACTIVE".equals(state) && !"SUSPENDED".equals(state)) {
            throw invalid("The state is ACTIVE or SUSPENDED");
        }
        String why = text(reason, 500, "A reason");
        return commands.execute(new CommandKey(owner, "service.state", commandId),
                new StateRequest(serviceId, expectedVersion, state, why), TaxiService.class, () -> {
                    TaxiService before = jdbc.sql(SELECT + " where id = :id for update").param("id", serviceId)
                            .query((rs, i) -> map(rs)).optional()
                            .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "No such taxi service"));
                    if (before.version() != expectedVersion) {
                        throw ConflictException.version(before.version(), "The service changed");
                    }
                    if (before.state().equals(state)) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The service is already " + state);
                    }
                    jdbc.sql("""
                                    update service set state = :state, version = version + 1, updated_at = :now
                                    where id = :id""")
                            .param("state", state).param("now", now()).param("id", serviceId).update();
                    TaxiService after = read(serviceId);
                    audit.record(new AuditEntry(owner, "SUSPENDED".equals(state) ? "service.suspend"
                            : "service.resume", "service", serviceId.toString(), why,
                            Map.of("state", before.state()), Map.of("state", state)));
                    return after;
                });
    }

    private void requireOwner(Actor actor) {
        boolean owner = actor != null && actor.type() == SubjectType.STAFF && jdbc.sql("""
                        select exists(select 1 from staff_user where id = :id and role = 'PLATFORM_OWNER'
                                        and state = 'ACTIVE' and not must_change_password)""")
                .param("id", actor.id()).query(Boolean.class).single();
        if (!owner) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only the platform owner manages taxi services");
        }
    }

    private TaxiService read(UUID id) {
        return jdbc.sql(SELECT + " where id = :id").param("id", id).query((rs, i) -> map(rs)).single();
    }

    private static TaxiService map(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new TaxiService(rs.getObject("id", UUID.class), rs.getString("code"), rs.getString("name"),
                rs.getString("state"), rs.getLong("version"), rs.getObject("created_at", OffsetDateTime.class));
    }

    private static String text(String value, int max, String what) {
        String clean = value == null ? "" : value.strip();
        if (clean.isEmpty() || clean.length() > max) {
            throw invalid(what + " of at most " + max + " characters is required");
        }
        return clean;
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
