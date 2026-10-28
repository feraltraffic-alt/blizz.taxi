package taxi.blizz.telephony.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.identity.StaffDirectory;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.telephony.Calls;
import taxi.blizz.telephony.Operators;

/**
 * The operators' own status for incoming calls (issue #67). Recorded and shown only: calls are not routed by it, the
 * card-pop goes to the AVAILABLE operators of the city when there is one. OFFLINE when never set.
 */
@Service
class OperatorStatuses implements Operators {

    enum Status {
        AVAILABLE, BREAK, OFFLINE
    }

    record Mine(Status status, OffsetDateTime changedAt, String extension) {
    }

    record Operator(UUID staffId, String name, Status status, OffsetDateTime changedAt, String extension) {
    }

    record Change(Status status) {
    }

    private record Row(Status status, OffsetDateTime changedAt) {
    }

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final StaffDirectory directory;
    private final Clock clock;

    OperatorStatuses(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, StaffDirectory directory,
                     Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.directory = directory;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public Set<UUID> available(Set<UUID> staffIds) {
        if (staffIds.isEmpty()) {
            return Set.of();
        }
        return Set.copyOf(jdbc.sql("""
                        select staff_id from operator_status
                        where status = 'AVAILABLE' and staff_id = any(cast(:ids as uuid[]))""")
                .param("ids", staffIds.toArray(UUID[]::new)).query(UUID.class).list());
    }

    @Transactional(readOnly = true)
    Mine mine(Actor actor) {
        requireOperator(actor);
        Row row = rows(Set.of(actor.id())).getOrDefault(actor.id(), new Row(Status.OFFLINE, null));
        return new Mine(row.status(), row.changedAt(), extensions(Set.of(actor.id())).get(actor.id()));
    }

    Mine change(Actor actor, UUID commandId, Status status) {
        if (status == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A status is required");
        }
        requireOperator(actor);
        return commands.execute(new CommandKey(actor, "operator_status.change", commandId), new Change(status),
                Mine.class, () -> {
                    jdbc.sql("""
                                    insert into operator_status (staff_id, status, changed_at, version)
                                    values (:id, :status, :now, 1)
                                    on conflict (staff_id) do update
                                    set status = :status, version = operator_status.version + 1,
                                        changed_at = case when operator_status.status = :status
                                                          then operator_status.changed_at else :now end""")
                            .param("id", actor.id()).param("status", status.name())
                            .param("now", OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC)).update();
                    return mine(actor);
                });
    }

    /** The operators of a city (calls.answer) and their status, for a supervisor of that city. */
    @Transactional(readOnly = true)
    List<Operator> inCity(Actor actor, UUID cityId) {
        if (cityId == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "city_id is required");
        }
        staff.require(actor, Calls.SUPERVISE_PERMISSION, cityId);
        Set<UUID> ids = staff.holders(Calls.ANSWER_PERMISSION, cityId);
        Map<UUID, Row> rows = rows(ids);
        Map<UUID, String> extensions = extensions(ids);
        Map<UUID, StaffDirectory.Name> names = directory.names(ids);
        return ids.stream().map(id -> {
            Row row = rows.getOrDefault(id, new Row(Status.OFFLINE, null));
            StaffDirectory.Name name = names.get(id);
            return new Operator(id, name == null ? null : (name.firstName() + " " + name.lastName()).strip(),
                    row.status(), row.changedAt(), extensions.get(id));
        }).sorted(Comparator.comparing((Operator o) -> o.name() == null ? "" : o.name())
                .thenComparing(Operator::staffId)).toList();
    }

    private void requireOperator(Actor actor) {
        StaffAccess.Scope scope = staff.scope(actor, Calls.ANSWER_PERMISSION);
        if (!scope.allCities() && scope.cityIds().isEmpty()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Missing permission " + Calls.ANSWER_PERMISSION);
        }
    }

    private Map<UUID, Row> rows(Set<UUID> ids) {
        Map<UUID, Row> rows = new HashMap<>();
        if (ids.isEmpty()) {
            return rows;
        }
        jdbc.sql("select staff_id, status, changed_at from operator_status where staff_id = any(cast(:ids as uuid[]))")
                .param("ids", ids.toArray(UUID[]::new))
                .query(rs -> {
                    rows.put(rs.getObject(1, UUID.class), new Row(Status.valueOf(rs.getString(2)),
                            rs.getObject(3, OffsetDateTime.class)));
                });
        return rows;
    }

    private Map<UUID, String> extensions(Set<UUID> ids) {
        Map<UUID, String> extensions = new HashMap<>();
        if (ids.isEmpty()) {
            return extensions;
        }
        jdbc.sql("select staff_id, extension from staff_extension where staff_id = any(cast(:ids as uuid[]))")
                .param("ids", ids.toArray(UUID[]::new))
                .query(rs -> {
                    extensions.put(rs.getObject(1, UUID.class), rs.getString(2));
                });
        return extensions;
    }
}
