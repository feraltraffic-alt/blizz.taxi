package taxi.blizz.telephony.internal;

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
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

/**
 * The service numbers the call centre answers and their cities (issue #64): an incoming call to a number goes to the
 * operators of its city. Changed in the admin panel with settings.manage for the cities concerned; audited.
 */
@Service
class CallLines {

    static final String PERMISSION = ServiceSettings.MANAGE_PERMISSION;

    record Line(String number, UUID cityId, String label, long version) {
    }

    record Change(String number, long expectedVersion, UUID cityId, String label, String reason) {
    }

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final Clock clock;

    CallLines(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.clock = clock;
    }

    @Transactional(readOnly = true)
    List<Line> list(Actor actor) {
        StaffAccess.Scope scope = staff.scope(actor, PERMISSION);
        if (!scope.allCities() && scope.cityIds().isEmpty()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Missing permission " + PERMISSION);
        }
        return jdbc.sql("select number, city_id, label, version from call_line order by number")
                .query((rs, i) -> new Line(rs.getString(1), rs.getObject(2, UUID.class), rs.getString(3),
                        rs.getLong(4)))
                .list().stream().filter(l -> scope.covers(l.cityId())).toList();
    }

    /** {@code cityId} null removes the number; the answer is then the line as it was. */
    Line change(Actor actor, UUID commandId, String rawNumber, long expectedVersion, UUID cityId, String label,
                String reason) {
        String number = PhoneNumber.parse(rawNumber).e164();
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of at most 500 characters is required");
        }
        String text = label == null || label.isBlank() ? null : label.strip();
        if (text != null && text.length() > 80) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A label has at most 80 characters");
        }
        Optional<Line> before = read(number, false);
        staff.require(actor, PERMISSION, cityId, before.map(Line::cityId).orElse(null));
        return commands.execute(new CommandKey(actor, "call_line.change", commandId),
                new Change(number, expectedVersion, cityId, text, why), Line.class, () -> {
                    Optional<Line> current = read(number, true);
                    long version = current.map(Line::version).orElse(0L);
                    if (version != expectedVersion) {
                        throw new DomainException(ErrorCode.VERSION_CONFLICT, "The line changed: expected version "
                                + expectedVersion + ", current " + version);
                    }
                    OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
                    Line after;
                    if (cityId == null) {
                        if (current.isEmpty()) {
                            throw new DomainException(ErrorCode.NOT_FOUND, "No such service number");
                        }
                        jdbc.sql("delete from call_line where number = :number").param("number", number).update();
                        after = current.get();
                    } else {
                        jdbc.sql("""
                                        insert into call_line (number, city_id, label, version, updated_at)
                                        values (:number, :city, :label, 1, :now)
                                        on conflict (number) do update
                                        set city_id = :city, label = :label, version = call_line.version + 1,
                                            updated_at = :now""")
                                .param("number", number).param("city", cityId).param("label", text)
                                .param("now", now).update();
                        after = read(number, false).orElseThrow();
                    }
                    audit.record(new AuditEntry(actor, cityId == null ? "call_line.remove" : "call_line.change",
                            "call_line", number, why, current.orElse(null),
                            cityId == null ? null : Map.of("city_id", cityId.toString(), "version", after.version())));
                    return after;
                });
    }

    private Optional<Line> read(String number, boolean lock) {
        return jdbc.sql("select number, city_id, label, version from call_line where number = :number"
                        + (lock ? " for update" : ""))
                .param("number", number)
                .query((rs, i) -> new Line(rs.getString(1), rs.getObject(2, UUID.class), rs.getString(3),
                        rs.getLong(4)))
                .optional();
    }
}
