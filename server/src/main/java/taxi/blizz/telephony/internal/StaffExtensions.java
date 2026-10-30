package taxi.blizz.telephony.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.identity.StaffDirectory;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

/**
 * The staff's internal numbers on the service's Asterisk (issue #67): one extension — one staff member. Asterisk's
 * answers on it name who took a call, and click-to-call rings it. Changed in the admin panel with settings.manage;
 * audited.
 */
@Service
class StaffExtensions {

    static final String PERMISSION = ServiceSettings.MANAGE_PERMISSION;

    record Extension(UUID staffId, String extension, long version) {
    }

    record Change(UUID staffId, long expectedVersion, String extension, String reason) {
    }

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final StaffDirectory directory;
    private final AuditLog audit;
    private final Clock clock;

    StaffExtensions(JdbcClient jdbc, IdempotentCommands commands,
                    StaffAccess staff, StaffDirectory directory, AuditLog audit, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.directory = directory;
        this.audit = audit;
        this.clock = clock;
    }

    @Transactional(readOnly = true)
    List<Extension> list(Actor actor) {
        staff.require(actor, PERMISSION);
        return jdbc.sql("select staff_id, extension, version from staff_extension order by extension")
                .query((rs, i) -> new Extension(rs.getObject(1, UUID.class), rs.getString(2), rs.getLong(3)))
                .list();
    }

    /** {@code extension} null removes it; the answer is then the extension as it was. */
    Extension change(Actor actor, UUID commandId, UUID staffId, long expectedVersion, String extension,
                     String reason) {
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of at most 500 characters is required");
        }
        String number = extension == null || extension.isBlank() ? null : extension.strip();
        if (number != null && !number.matches("^[0-9]{2,6}$")) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "An extension is 2 to 6 digits");
        }
        staff.require(actor, PERMISSION);
        if (directory.names(List.of(staffId)).isEmpty()) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Staff member not found");
        }
        return commands.execute(new CommandKey(actor, "staff_extension.change", commandId),
                new Change(staffId, expectedVersion, number, why), Extension.class, () -> {
                    Optional<Extension> current = read(staffId, true);
                    long version = current.map(Extension::version).orElse(0L);
                    if (version != expectedVersion) {
                        throw ConflictException.version(version, "The extension changed: expected "
                                + "version " + expectedVersion + ", current " + version);
                    }
                    Extension after;
                    if (number == null) {
                        if (current.isEmpty()) {
                            throw new DomainException(ErrorCode.NOT_FOUND, "The staff member has no extension");
                        }
                        jdbc.sql("delete from staff_extension where staff_id = :id").param("id", staffId).update();
                        after = current.get();
                    } else {
                        Optional<UUID> holder = jdbc.sql("select staff_id from staff_extension where extension = :e")
                                .param("e", number).query(UUID.class).optional();
                        if (holder.isPresent() && !holder.get().equals(staffId)) {
                            throw new DomainException(ErrorCode.STATE_CONFLICT,
                                    "Extension " + number + " belongs to another staff member");
                        }
                        try {
                            jdbc.sql("""
                                            insert into staff_extension (staff_id, extension, version, updated_at)
                                            values (:id, :e, 1, :now)
                                            on conflict (staff_id) do update
                                            set extension = :e, version = staff_extension.version + 1,
                                                updated_at = :now""")
                                    .param("id", staffId).param("e", number)
                                    .param("now", OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC))
                                    .update();
                        } catch (DuplicateKeyException taken) { // another member took it at the same moment
                            throw new DomainException(ErrorCode.STATE_CONFLICT,
                                    "Extension " + number + " belongs to another staff member");
                        }
                        after = read(staffId, false).orElseThrow();
                    }
                    Map<String, Object> changed = new LinkedHashMap<>();
                    if (number != null) {
                        changed.put("extension", number);
                        changed.put("version", after.version());
                    }
                    audit.record(new AuditEntry(actor, number == null ? "staff_extension.remove"
                            : "staff_extension.change", "staff", staffId.toString(), why,
                            current.orElse(null), number == null ? null : changed));
                    return after;
                });
    }

    private Optional<Extension> read(UUID staffId, boolean lock) {
        return jdbc.sql("select staff_id, extension, version from staff_extension where staff_id = :id"
                        + (lock ? " for update" : ""))
                .param("id", staffId)
                .query((rs, i) -> new Extension(rs.getObject(1, UUID.class), rs.getString(2), rs.getLong(3)))
                .optional();
    }
}
