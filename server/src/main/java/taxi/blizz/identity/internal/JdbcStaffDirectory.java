package taxi.blizz.identity.internal;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.StaffDirectory;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcStaffDirectory implements StaffDirectory {

    private static final String SELECT = """
            select id, login, first_name, last_name, name, phone, email, telegram, role, permissions, all_cities,
                   city_scope, state, must_change_password, version
            from staff_user
            """;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffPasswords passwords;
    private final SessionService sessions;
    private final AuditLog audit;
    private final Outbox outbox;
    private final Clock clock;

    JdbcStaffDirectory(JdbcClient jdbc, IdempotentCommands commands, StaffPasswords passwords, SessionService sessions,
                       AuditLog audit, Outbox outbox, Clock clock) {
        this.outbox = outbox;
        this.jdbc = jdbc;
        this.commands = commands;
        this.passwords = passwords;
        this.sessions = sessions;
        this.audit = audit;
        this.clock = clock;
    }

    // ---------------------------------------------------------------- commands

    /** The password itself never enters the stored idempotency request: only whether one was given. */
    record CreateRequest(String login, Profile profile, String reason) {
    }

    @Override
    public StaffMember create(Actor superAdmin, UUID commandId, String login, String initialPassword, Profile profile,
                              String reason) {
        requireSuperAdmin(superAdmin);
        String cleanLogin = login(login);
        Profile clean = profile(profile);
        reason(reason);
        passwords.check(cleanLogin, initialPassword);
        return commands.execute(new CommandKey(superAdmin, "staff.create", commandId),
                new CreateRequest(cleanLogin, clean, reason), StaffMember.class, () -> {
                    UUID id = UUID.randomUUID();
                    OffsetDateTime now = now();
                    try {
                        jdbc.sql("""
                                        insert into staff_user (id, login, first_name, last_name, name, phone, email,
                                                                telegram, role, permissions, all_cities, city_scope,
                                                                state, password_hash, must_change_password, created_by,
                                                                created_at, updated_at, version)
                                        values (:id, :login, :first, :last, :name, :phone, :email, :telegram, :role,
                                                :permissions, :all, :cities, 'ACTIVE', :hash, true, :by, :now, :now, 0)""")
                                .param("id", id).param("login", cleanLogin)
                                .param("first", clean.firstName()).param("last", clean.lastName())
                                .param("name", clean.firstName() + " " + clean.lastName())
                                .param("phone", clean.contacts().phone()).param("email", clean.contacts().email())
                                .param("telegram", clean.contacts().telegram()).param("role", clean.role().name())
                                .param("permissions", clean.permissions().toArray(String[]::new))
                                .param("all", clean.allCities())
                                .param("cities", clean.cityIds().toArray(UUID[]::new))
                                .param("hash", passwords.hash(cleanLogin, initialPassword))
                                .param("by", superAdmin.id()).param("now", now)
                                .update();
                    } catch (DuplicateKeyException duplicate) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "This login is taken");
                    }
                    StaffMember created = read(id);
                    audit.record(new AuditEntry(superAdmin, "staff.create", "staff_user", id.toString(), reason, null,
                            created));
                    return created;
                });
    }

    record UpdateRequest(UUID staffId, long expectedVersion, Profile profile, String reason) {
    }

    @Override
    public StaffMember update(Actor superAdmin, UUID commandId, UUID staffId, long expectedVersion, Profile profile,
                              String reason) {
        requireSuperAdmin(superAdmin);
        Profile clean = profile(profile);
        reason(reason);
        return commands.execute(new CommandKey(superAdmin, "staff.update", commandId),
                new UpdateRequest(staffId, expectedVersion, clean, reason), StaffMember.class, () -> {
                    StaffMember before = locked(staffId, expectedVersion);
                    if (before.profile().role() == Role.SUPER_ADMIN && clean.role() != Role.SUPER_ADMIN) {
                        keepOneSuperAdmin(staffId);
                    }
                    jdbc.sql("""
                                    update staff_user set first_name = :first, last_name = :last, name = :name,
                                        phone = :phone, email = :email, telegram = :telegram, role = :role,
                                        permissions = :permissions, all_cities = :all, city_scope = :cities,
                                        version = version + 1, updated_at = :now
                                    where id = :id""")
                            .param("first", clean.firstName()).param("last", clean.lastName())
                            .param("name", clean.firstName() + " " + clean.lastName())
                            .param("phone", clean.contacts().phone()).param("email", clean.contacts().email())
                            .param("telegram", clean.contacts().telegram()).param("role", clean.role().name())
                            .param("permissions", clean.permissions().toArray(String[]::new))
                            .param("all", clean.allCities())
                            .param("cities", clean.cityIds().toArray(UUID[]::new))
                            .param("now", now()).param("id", staffId).update();
                    StaffMember after = read(staffId);
                    audit.record(new AuditEntry(superAdmin, "staff.update", "staff_user", staffId.toString(), reason,
                            before, after));
                    return after;
                });
    }

    record ChangeRequest(UUID staffId, long expectedVersion, String reason) {
    }

    @Override
    public StaffMember suspend(Actor superAdmin, UUID commandId, UUID staffId, long expectedVersion, String reason) {
        return changeState(superAdmin, commandId, staffId, expectedVersion, reason, "SUSPENDED");
    }

    @Override
    public StaffMember restore(Actor superAdmin, UUID commandId, UUID staffId, long expectedVersion, String reason) {
        return changeState(superAdmin, commandId, staffId, expectedVersion, reason, "ACTIVE");
    }

    private StaffMember changeState(Actor superAdmin, UUID commandId, UUID staffId, long expectedVersion, String reason,
                                    String target) {
        requireSuperAdmin(superAdmin);
        reason(reason);
        String action = "SUSPENDED".equals(target) ? "staff.suspend" : "staff.restore";
        return commands.execute(new CommandKey(superAdmin, action, commandId),
                new ChangeRequest(staffId, expectedVersion, reason), StaffMember.class, () -> {
                    StaffMember before = locked(staffId, expectedVersion);
                    if (target.equals(before.state())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Already " + target.toLowerCase(Locale.ROOT));
                    }
                    if ("SUSPENDED".equals(target) && before.profile().role() == Role.SUPER_ADMIN) {
                        keepOneSuperAdmin(staffId);
                    }
                    jdbc.sql("update staff_user set state = :state, version = version + 1, updated_at = :now where id = :id")
                            .param("state", target).param("now", now()).param("id", staffId).update();
                    if ("SUSPENDED".equals(target)) {
                        sessions.revokeAll(new Actor(SubjectType.STAFF, staffId), "staff suspended");
                        // Their open work goes back to the queues (REQ-USR-18).
                        outbox.publish(new OutboxEvent("StaffSuspended", 1, "Staff", staffId, before.version() + 1,
                                java.util.Map.of("staff_id", staffId.toString())));
                    }
                    StaffMember after = read(staffId);
                    audit.record(new AuditEntry(superAdmin, action, "staff_user", staffId.toString(), reason, before,
                            after));
                    return after;
                });
    }

    @Override
    public StaffMember resetPassword(Actor superAdmin, UUID commandId, UUID staffId, long expectedVersion,
                                     String temporaryPassword, String reason) {
        requireSuperAdmin(superAdmin);
        reason(reason);
        return commands.execute(new CommandKey(superAdmin, "staff.resetPassword", commandId),
                new ChangeRequest(staffId, expectedVersion, reason), StaffMember.class, () -> {
                    StaffMember before = locked(staffId, expectedVersion);
                    jdbc.sql("""
                                    update staff_user set password_hash = :hash, must_change_password = true,
                                        failed_sign_ins = 0, locked_until = null, version = version + 1,
                                        updated_at = :now
                                    where id = :id""")
                            .param("hash", passwords.hash(before.login(), temporaryPassword))
                            .param("now", now()).param("id", staffId).update();
                    sessions.revokeAll(new Actor(SubjectType.STAFF, staffId), "password reset");
                    StaffMember after = read(staffId);
                    audit.record(new AuditEntry(superAdmin, "staff.resetPassword", "staff_user", staffId.toString(),
                            reason, null, null));
                    return after;
                });
    }

    // ---------------------------------------------------------------- reads

    @Override
    @Transactional(readOnly = true)
    public List<StaffMember> list(Actor superAdmin) {
        requireSuperAdmin(superAdmin);
        return jdbc.sql(SELECT + " order by lower(last_name), lower(first_name), lower(login)")
                .query((rs, i) -> map(rs)).list();
    }

    @Override
    @Transactional(readOnly = true)
    public StaffMember get(Actor reader, UUID staffId) {
        if (reader == null || reader.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Staff only");
        }
        if (!reader.id().equals(staffId)) {
            requireSuperAdmin(reader);
        }
        return read(staffId);
    }

    // ---------------------------------------------------------------- helpers

    private void requireSuperAdmin(Actor actor) {
        boolean allowed = actor != null && actor.type() == SubjectType.STAFF && jdbc.sql("""
                        select exists(select 1 from staff_user where id = :id and role = 'SUPER_ADMIN'
                                      and state = 'ACTIVE' and not must_change_password)""")
                .param("id", actor.id()).query(Boolean.class).single();
        if (!allowed) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only a super admin manages staff");
        }
    }

    private void keepOneSuperAdmin(UUID leaving) {
        int others = jdbc.sql("""
                        select count(*) from staff_user
                        where role = 'SUPER_ADMIN' and state = 'ACTIVE' and id <> :id""")
                .param("id", leaving).query(Integer.class).single();
        if (others == 0) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "At least one active super admin must remain");
        }
    }

    private StaffMember locked(UUID staffId, long expectedVersion) {
        StaffMember before = jdbc.sql(SELECT + " where id = :id for update").param("id", staffId)
                .query((rs, i) -> map(rs)).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Staff member not found"));
        if (before.version() != expectedVersion) {
            throw new DomainException(ErrorCode.VERSION_CONFLICT, "The staff member changed");
        }
        return before;
    }

    private StaffMember read(UUID staffId) {
        return jdbc.sql(SELECT + " where id = :id").param("id", staffId).query((rs, i) -> map(rs)).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Staff member not found"));
    }

    private static StaffMember map(ResultSet rs) throws SQLException {
        String first = rs.getString("first_name");
        String last = rs.getString("last_name");
        if (first == null && last == null) {
            first = rs.getString("name");
            last = "";
        }
        Role role = Role.valueOf(rs.getString("role"));
        Profile profile = new Profile(first, last, new Contacts(rs.getString("phone"), rs.getString("email"),
                rs.getString("telegram")), role, strings(rs.getArray("permissions")), rs.getBoolean("all_cities"),
                uuids(rs.getArray("city_scope")));
        return new StaffMember(rs.getObject("id", UUID.class), rs.getString("login"), profile, rs.getString("state"),
                rs.getBoolean("must_change_password"), rs.getLong("version"));
    }

    private static List<String> strings(Array array) throws SQLException {
        return array == null ? List.of() : Arrays.stream((Object[]) array.getArray()).map(String::valueOf).sorted().toList();
    }

    private static List<UUID> uuids(Array array) throws SQLException {
        return array == null ? List.of() : Arrays.stream((Object[]) array.getArray()).map(o -> (UUID) o).toList();
    }

    private static String login(String login) {
        String value = login == null ? "" : login.strip().toLowerCase(Locale.ROOT);
        if (!value.matches("[a-z0-9][a-z0-9._-]{2,63}")) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    "A login has 3 to 64 letters, digits, dots, dashes or underscores");
        }
        return value;
    }

    /** Validates and normalizes; a super admin keeps no ticked functions — he has all of them. */
    private Profile profile(Profile p) {
        if (p == null || p.role() == null || blank(p.firstName()) || blank(p.lastName()) || p.contacts() == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "First name, last name, role and a contact are required");
        }
        String phone = blank(p.contacts().phone()) ? null : PhoneNumber.parse(p.contacts().phone()).e164();
        String email = blank(p.contacts().email()) ? null : p.contacts().email().strip().toLowerCase(Locale.ROOT);
        String telegram = blank(p.contacts().telegram()) ? null : p.contacts().telegram().strip();
        if (phone == null && email == null && telegram == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Give at least one contact: phone, e-mail or Telegram");
        }
        if (email != null && !email.matches("[^@\\s]+@[^@\\s]+\\.[^@\\s]+")) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Invalid e-mail");
        }
        if (telegram != null && !telegram.matches("@?[A-Za-z0-9_]{5,32}")) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Invalid Telegram username");
        }
        if (telegram != null && !telegram.startsWith("@")) {
            telegram = "@" + telegram;
        }
        boolean superAdmin = p.role() == Role.SUPER_ADMIN;
        List<String> permissions = superAdmin ? List.of() : p.permissions().stream().distinct().sorted().toList();
        for (String permission : permissions) {
            if (!StaffPermissions.CODES.contains(permission)) {
                throw new DomainException(ErrorCode.VALIDATION_FAILED, "Unknown function: " + permission);
            }
        }
        List<UUID> cities = superAdmin || p.allCities() ? List.of() : p.cityIds().stream().distinct().toList();
        for (UUID city : cities) {
            if (!jdbc.sql("select exists(select 1 from city where id = :id)").param("id", city)
                    .query(Boolean.class).single()) {
                throw new DomainException(ErrorCode.VALIDATION_FAILED, "Unknown city: " + city);
            }
        }
        return new Profile(p.firstName().strip(), p.lastName().strip(), new Contacts(phone, email, telegram), p.role(),
                permissions, superAdmin || p.allCities(), cities);
    }

    private static void reason(String reason) {
        if (blank(reason)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
    }

    private static boolean blank(String value) {
        return value == null || value.isBlank();
    }

    private OffsetDateTime now() {
        return clock.instant().atOffset(ZoneOffset.UTC);
    }
}
