package taxi.blizz.configuration.internal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Pattern;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcCancelReasons implements CancelReasons {

    private static final Pattern CODE = Pattern.compile("^[A-Z][A-Z0-9_]{1,39}$");
    private static final int LABEL_MAX = 80;
    private static final String SELECT = """
            select id, audience, code, labels::text as labels, driver_outcome, operator_fault, active, sort_order, version
            from cancel_reason""";

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final ServiceSettings settings;
    private final JsonMapper json;
    private final Clock clock;

    JdbcCancelReasons(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                      ServiceSettings settings, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.settings = settings;
        this.json = json;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Reason> active(Audience audience) {
        if (audience == null) {
            throw invalid("The side is required");
        }
        return jdbc.sql(SELECT + " where audience = :audience and active order by sort_order, code")
                .param("audience", audience.name()).query((rs, i) -> map(rs)).list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Reason> all(Actor actor) {
        staff.require(actor, MANAGE_PERMISSION);
        return jdbc.sql(SELECT + " order by audience, sort_order, code").query((rs, i) -> map(rs)).list();
    }

    record CreateRequest(Draft draft, String reason) {
    }

    @Override
    public Reason create(Actor actor, UUID commandId, Draft draft, String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        Draft clean = validate(draft);
        String why = required(reason);
        return commands.execute(new CommandKey(actor, "cancel_reason.create", commandId),
                new CreateRequest(clean, why), Reason.class, () -> {
                    UUID id = UUID.randomUUID();
                    try {
                        jdbc.sql("""
                                        insert into cancel_reason (id, audience, code, labels, driver_outcome,
                                                                   operator_fault, active, sort_order, created_at, updated_at)
                                        values (:id, :audience, :code, cast(:labels as jsonb), :outcome,
                                                :operatorFault, :active, :sort, :now, :now)""")
                                .param("id", id).param("audience", clean.audience().name()).param("code", clean.code())
                                .param("labels", json.writeValueAsString(clean.labels()))
                                .param("outcome", clean.driverOutcome() == null ? null : clean.driverOutcome().name())
                                .param("operatorFault", clean.operatorFault())
                                .param("active", clean.active()).param("sort", clean.sortOrder())
                                .param("now", now()).update();
                    } catch (DuplicateKeyException e) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "This side already has the code " + clean.code());
                    }
                    Reason created = read(id);
                    audit.record(new AuditEntry(actor, "cancel_reason.create", "cancel_reason", id.toString(), why,
                            null, created));
                    return created;
                });
    }

    record UpdateRequest(UUID reasonId, long expectedVersion, Draft draft, String reason) {
    }

    @Override
    public Reason update(Actor actor, UUID commandId, UUID reasonId, long expectedVersion, Draft draft, String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        String why = required(reason);
        return commands.execute(new CommandKey(actor, "cancel_reason.update", commandId),
                new UpdateRequest(reasonId, expectedVersion, draft, why), Reason.class, () -> {
                    Reason before = jdbc.sql(SELECT + " where id = :id for update").param("id", reasonId)
                            .query((rs, i) -> map(rs)).optional()
                            .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Reason not found"));
                    if (before.version() != expectedVersion) {
                        throw ConflictException.version(before.version(), "The reason changed");
                    }
                    if (draft == null) {
                        throw invalid("The reason is required");
                    }
                    if ((draft.audience() != null && draft.audience() != before.audience())
                            || (draft.code() != null && !draft.code().equals(before.code()))) {
                        throw invalid("The side and the code of a reason never change; add a new reason instead");
                    }
                    Draft clean = validate(new Draft(before.audience(), before.code(), draft.labels(),
                            draft.driverOutcome(), draft.operatorFault(), draft.active(), draft.sortOrder()));
                    jdbc.sql("""
                                    update cancel_reason set labels = cast(:labels as jsonb), driver_outcome = :outcome,
                                           operator_fault = :operatorFault, active = :active, sort_order = :sort,
                                           updated_at = :now, version = version + 1 where id = :id""")
                            .param("labels", json.writeValueAsString(clean.labels()))
                            .param("outcome", clean.driverOutcome() == null ? null : clean.driverOutcome().name())
                            .param("operatorFault", clean.operatorFault())
                            .param("active", clean.active()).param("sort", clean.sortOrder())
                            .param("now", now()).param("id", reasonId).update();
                    Reason after = read(reasonId);
                    audit.record(new AuditEntry(actor, "cancel_reason.update", "cancel_reason", reasonId.toString(), why,
                            before, after));
                    return after;
                });
    }

    @Override
    @Transactional(readOnly = true)
    public Reason require(Audience audience, String code) {
        return find(audience, code).filter(Reason::active)
                .orElseThrow(() -> invalid("Unknown or inactive cancellation reason: " + code));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Reason> find(Audience audience, String code) {
        if (audience == null || code == null || code.isBlank()) {
            return Optional.empty();
        }
        return jdbc.sql(SELECT + " where audience = :audience and code = :code")
                .param("audience", audience.name()).param("code", code.trim()).query((rs, i) -> map(rs)).optional();
    }

    // ---------------------------------------------------------------- helpers

    private Draft validate(Draft d) {
        if (d == null || d.audience() == null) {
            throw invalid("The side (RIDER, DRIVER, STAFF) is required");
        }
        String code = d.code() == null ? null : d.code().trim().toUpperCase(Locale.ROOT);
        if (code == null || !CODE.matcher(code).matches()) {
            throw invalid("The code has 2 to 40 characters A-Z, 0-9 and _ and starts with a letter");
        }
        if ((d.audience() == Audience.DRIVER) != (d.driverOutcome() != null)) {
            throw invalid(d.audience() == Audience.DRIVER
                    ? "A driver's reason says whether the order returns to the search or is cancelled"
                    : "Only a driver's reason has an outcome");
        }
        if (d.operatorFault() && d.audience() != Audience.STAFF) {
            throw invalid("Only a staff cancellation reason can be marked as operator fault");
        }
        Map<String, String> labels = new LinkedHashMap<>();
        if (d.labels() != null) {
            for (Map.Entry<String, String> e : d.labels().entrySet()) {
                String language = e.getKey() == null ? "" : e.getKey().trim().toLowerCase(Locale.ROOT);
                if (!ServiceSettings.SUPPORTED_LANGUAGES.contains(language)) {
                    throw invalid("Unsupported language: " + e.getKey());
                }
                String label = e.getValue() == null ? null : e.getValue().strip();
                if (label == null || label.isEmpty()) {
                    continue;
                }
                if (label.length() > LABEL_MAX) {
                    throw invalid("A label has at most " + LABEL_MAX + " characters");
                }
                labels.put(language, label);
            }
        }
        String defaultLanguage = settings.current().settings().languages().defaultLanguage();
        if (!labels.containsKey(defaultLanguage)) {
            throw invalid("A label in the default language (" + defaultLanguage + ") is required");
        }
        if (d.sortOrder() < 0 || d.sortOrder() > 10_000) {
            throw invalid("The position is between 0 and 10000");
        }
        return new Draft(d.audience(), code, labels, d.driverOutcome(), d.operatorFault(), d.active(), d.sortOrder());
    }

    private Reason read(UUID id) {
        return jdbc.sql(SELECT + " where id = :id").param("id", id).query((rs, i) -> map(rs)).single();
    }

    private Reason map(ResultSet rs) throws SQLException {
        String outcome = rs.getString("driver_outcome");
        return new Reason(rs.getObject("id", UUID.class), Audience.valueOf(rs.getString("audience")),
                rs.getString("code"), json.readValue(rs.getString("labels"), new TypeReference<Map<String, String>>() {
                }), outcome == null ? null : DriverOutcome.valueOf(outcome), rs.getBoolean("operator_fault"),
                rs.getBoolean("active"), rs.getInt("sort_order"), rs.getLong("version"));
    }

    private static String required(String reason) {
        if (reason == null || reason.isBlank()) {
            throw invalid("A reason for the change is required");
        }
        return reason.strip();
    }

    private OffsetDateTime now() {
        return clock.instant().atOffset(ZoneOffset.UTC);
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }
}
