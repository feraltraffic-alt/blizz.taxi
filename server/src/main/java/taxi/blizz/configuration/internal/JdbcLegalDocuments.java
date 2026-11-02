package taxi.blizz.configuration.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.LegalDocuments;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/** See {@link LegalDocuments}. The database refuses to change a published version or an acceptance. */
@Service
class JdbcLegalDocuments implements LegalDocuments {

    static final int TEXT_MAX = 200_000;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final JsonMapper json;
    private final Clock clock;

    private final taxi.blizz.identity.Services services;

    JdbcLegalDocuments(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                       JsonMapper json, Clock clock, taxi.blizz.identity.Services services) {
        this.services = services;
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.json = json;
        this.clock = clock;
    }

    private static final String SELECT = """
            select id, audience, kind, number, state, texts::text as texts, acceptance_required, effective_from,
                   published_at, version
            from legal_document_version
            """;

    // ---------------------------------------------------------------- staff

    record CreateRequest(Audience audience, Kind kind, Draft draft) {
    }

    @Override
    public Version createDraft(Actor actor, UUID commandId, Audience audience, Kind kind, Draft draft) {
        staff.require(actor, MANAGE_PERMISSION);
        if (audience == null || kind == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "audience and kind are required");
        }
        if (kind == Kind.DRIVER_AGREEMENT && audience != Audience.DRIVER) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The driver agreement is for drivers");
        }
        Draft clean = validate(draft);
        return commands.execute(new CommandKey(actor, "legal_document.create", commandId),
                new CreateRequest(audience, kind, clean), Version.class, () -> {
                    // One number after another per document, also when two staff create drafts at once.
                    UUID service = serviceOf(actor);
                    jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))")
                            .param("key", "legal_document:" + service + ":" + audience + ":" + kind).query()
                            .singleRow();
                    int number = jdbc.sql("""
                                    select coalesce(max(number), 0) + 1 from legal_document_version
                                    where service_id = :service and audience = :audience and kind = :kind""")
                            .param("service", service).param("audience", audience.name())
                            .param("kind", kind.name())
                            .query(Integer.class).single();
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into legal_document_version (id, audience, kind, number, state, texts,
                                        acceptance_required, effective_from, created_by, created_at, service_id)
                                    values (:id, :audience, :kind, :number, 'DRAFT', cast(:texts as jsonb),
                                        :required, :from, :by, :now, :service)""")
                            .param("service", service).param("id", id).param("audience", audience.name())
                            .param("kind", kind.name())
                            .param("number", number).param("texts", json.writeValueAsString(clean.texts()))
                            .param("required", clean.acceptanceRequired()).param("from", clean.effectiveFrom())
                            .param("by", actor.id()).param("now", now()).update();
                    Version created = find(id).orElseThrow();
                    audit.record(new AuditEntry(actor, "legal_document.create", "legal_document_version",
                            id.toString(), null, null, summary(created)));
                    return created;
                });
    }

    record UpdateRequest(UUID versionId, long expectedVersion, Draft draft) {
    }

    @Override
    public Version updateDraft(Actor actor, UUID commandId, UUID versionId, long expectedVersion, Draft draft) {
        staff.require(actor, MANAGE_PERMISSION);
        Draft clean = validate(draft);
        requireOwn(actor, versionId);
        return commands.execute(new CommandKey(actor, "legal_document.update", commandId),
                new UpdateRequest(versionId, expectedVersion, clean), Version.class, () -> {
                    Version before = lockDraft(versionId, expectedVersion);
                    jdbc.sql("""
                                    update legal_document_version
                                    set texts = cast(:texts as jsonb), acceptance_required = :required,
                                        effective_from = :from, version = version + 1
                                    where id = :id""")
                            .param("texts", json.writeValueAsString(clean.texts()))
                            .param("required", clean.acceptanceRequired()).param("from", clean.effectiveFrom())
                            .param("id", versionId).update();
                    Version after = find(versionId).orElseThrow();
                    audit.record(new AuditEntry(actor, "legal_document.update", "legal_document_version",
                            versionId.toString(), null, summary(before), summary(after)));
                    return after;
                });
    }

    record PublishRequest(UUID versionId, long expectedVersion) {
    }

    @Override
    public Version publish(Actor actor, UUID commandId, UUID versionId, long expectedVersion) {
        staff.require(actor, MANAGE_PERMISSION);
        requireOwn(actor, versionId);
        return commands.execute(new CommandKey(actor, "legal_document.publish", commandId),
                new PublishRequest(versionId, expectedVersion), Version.class, () -> {
                    Version before = lockDraft(versionId, expectedVersion);
                    OffsetDateTime now = now();
                    // A text never takes effect in the past: nobody could have accepted it then.
                    OffsetDateTime from = before.effectiveFrom().isBefore(now) ? now : before.effectiveFrom();
                    jdbc.sql("""
                                    update legal_document_version
                                    set state = 'PUBLISHED', effective_from = :from, published_by = :by,
                                        published_at = :now, version = version + 1
                                    where id = :id""")
                            .param("from", from).param("by", actor.id()).param("now", now).param("id", versionId)
                            .update();
                    Version after = find(versionId).orElseThrow();
                    audit.record(new AuditEntry(actor, "legal_document.publish", "legal_document_version",
                            versionId.toString(), null, summary(before), summary(after)));
                    return after;
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<Version> versions(Actor actor, Audience audience, Kind kind) {
        staff.require(actor, MANAGE_PERMISSION);
        return jdbc.sql(SELECT + """
                        where service_id = :service and (cast(:audience as text) is null or audience = :audience)
                          and (cast(:kind as text) is null or kind = :kind)
                        order by audience, kind, number desc""")
                .param("service", serviceOf(actor))
                .param("audience", audience == null ? null : audience.name())
                .param("kind", kind == null ? null : kind.name())
                .query((rs, i) -> version(rs)).list();
    }

    // ---------------------------------------------------------------- the apps

    @Override
    @Transactional(readOnly = true)
    public Optional<Text> text(UUID serviceId, Audience audience, Kind kind, String language) {
        return current(serviceId, audience).stream().filter(v -> v.kind() == kind).findFirst().map(v -> {
            String lang = v.texts().containsKey(language) ? language
                    : LANGUAGES.stream().filter(v.texts()::containsKey).findFirst()
                    .orElse(v.texts().keySet().iterator().next());
            return new Text(v.id(), v.audience(), v.kind(), v.number(), lang, v.texts().get(lang),
                    v.effectiveFrom());
        });
    }

    @Override
    @Transactional(readOnly = true)
    public List<InForce> inForce(Actor person) {
        Audience audience = audience(person);
        return current(serviceOf(person), audience).stream()
                .map(v -> new InForce(v.id(), v.audience(), v.kind(), v.number(), v.acceptanceRequired(),
                        accepted(v.id(), person), v.effectiveFrom(), List.copyOf(v.texts().keySet())))
                .toList();
    }

    record AcceptRequest(UUID versionId, String language) {
    }

    @Override
    public Acceptance accept(Actor person, UUID commandId, UUID versionId, String language, UUID deviceSessionId) {
        Audience audience = audience(person);
        return commands.execute(new CommandKey(person, "legal_document.accept", commandId),
                new AcceptRequest(versionId, language), Acceptance.class, () -> {
                    Version version = find(versionId)
                            .filter(v -> v.audience() == audience && "PUBLISHED".equals(v.state()))
                            .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Legal text not found"));
                    boolean inForce = current(serviceOf(person), audience).stream()
                            .anyMatch(v -> v.id().equals(versionId));
                    if (!inForce) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Only the version in force can be accepted");
                    }
                    if (language == null || !version.texts().containsKey(language)) {
                        throw new DomainException(ErrorCode.VALIDATION_FAILED,
                                "The language must be one the text was shown in: " + version.texts().keySet());
                    }
                    jdbc.sql("""
                                    insert into legal_acceptance (id, version_id, subject_type, subject_id, language,
                                                                  device_session_id, accepted_at)
                                    values (:id, :version, :type, :subject, :language, :session, :now)
                                    on conflict (version_id, subject_type, subject_id) do nothing""")
                            .param("id", UUID.randomUUID()).param("version", versionId)
                            .param("type", person.type().name()).param("subject", person.id())
                            .param("language", language).param("session", deviceSessionId).param("now", now())
                            .update();
                    return acceptances(person).stream().filter(a -> a.versionId().equals(versionId)).findFirst()
                            .orElseThrow();
                });
    }

    @Override
    @Transactional(readOnly = true)
    public void requireAccepted(Actor person) {
        if (person == null || (person.type() != SubjectType.CLIENT && person.type() != SubjectType.DRIVER)) {
            return;
        }
        List<InForce> missing = inForce(person).stream().filter(v -> v.acceptanceRequired() && !v.accepted())
                .toList();
        if (!missing.isEmpty()) {
            throw new DomainException(ErrorCode.ACCEPTANCE_REQUIRED, "To be accepted first: "
                    + missing.stream().map(v -> v.kind() + " v" + v.number()).toList());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Acceptance> acceptances(Actor person) {
        return jdbc.sql("""
                        select a.version_id, v.kind, v.number, a.language, a.accepted_at
                        from legal_acceptance a join legal_document_version v on v.id = a.version_id
                        where a.subject_type = :type and a.subject_id = :subject
                        order by a.accepted_at, a.id""")
                .param("type", person.type().name()).param("subject", person.id())
                .query((rs, i) -> new Acceptance(rs.getObject("version_id", UUID.class),
                        Kind.valueOf(rs.getString("kind")), rs.getInt("number"), rs.getString("language"),
                        rs.getObject("accepted_at", OffsetDateTime.class)))
                .list();
    }

    // ---------------------------------------------------------------- helpers

    /** The version in force of every kind of the audience's documents. */
    private List<Version> current(UUID service, Audience audience) {
        return jdbc.sql("""
                        select distinct on (kind) id, audience, kind, number, state, texts::text as texts,
                               acceptance_required, effective_from, published_at, version
                        from legal_document_version
                        where cast(:service as uuid) is not null and audience = :audience and state = 'PUBLISHED'
                          and effective_from <= :now
                        order by kind, effective_from desc, number desc""")
                .param("service", service).param("audience", audience.name()).param("now", now())
                .query((rs, i) -> version(rs)).list();
    }

    /** The taxi service of a rider, driver or staff member (ADR 0016). */
    private UUID serviceOf(Actor subject) {
        return services.of(subject).orElseThrow(() -> new DomainException(ErrorCode.ACCESS_DENIED,
                "Not of a taxi service"));
    }

    /** A version of another taxi service does not exist for this staff member. */
    private void requireOwn(Actor actor, UUID versionId) {
        if (jdbc.sql("select exists(select 1 from legal_document_version where id = :id and service_id <> :service)")
                .param("id", versionId).param("service", serviceOf(actor)).query(Boolean.class).single()) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Legal text not found");
        }
    }

    private boolean accepted(UUID versionId, Actor person) {
        return jdbc.sql("""
                        select exists (select 1 from legal_acceptance
                                       where version_id = :version and subject_type = :type and subject_id = :id)""")
                .param("version", versionId).param("type", person.type().name()).param("id", person.id())
                .query(Boolean.class).single();
    }

    private Version lockDraft(UUID versionId, long expectedVersion) {
        jdbc.sql("select id from legal_document_version where id = :id for update").param("id", versionId)
                .query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Legal text not found"));
        Version version = find(versionId).orElseThrow();
        if (!"DRAFT".equals(version.state())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT,
                    "A published text never changes; create a new version");
        }
        if (version.version() != expectedVersion) {
            throw ConflictException.version(version.version(), "The draft changed: expected version "
                    + expectedVersion + ", current " + version.version());
        }
        return version;
    }

    private static Draft validate(Draft draft) {
        if (draft == null || draft.effectiveFrom() == null || draft.texts().isEmpty()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Texts and the effective moment are required");
        }
        Map<String, String> texts = new TreeMap<>();
        draft.texts().forEach((lang, text) -> {
            if (!LANGUAGES.contains(lang)) {
                throw new DomainException(ErrorCode.VALIDATION_FAILED, "Languages are " + LANGUAGES);
            }
            String clean = text == null ? "" : text.strip();
            if (clean.isEmpty() || clean.length() > TEXT_MAX) {
                throw new DomainException(ErrorCode.VALIDATION_FAILED,
                        "Each text has 1 to " + TEXT_MAX + " characters");
            }
            texts.put(lang, clean);
        });
        return new Draft(texts, draft.acceptanceRequired(),
                draft.effectiveFrom().withOffsetSameInstant(ZoneOffset.UTC).truncatedTo(ChronoUnit.MICROS));
    }

    private static Audience audience(Actor person) {
        if (person != null && person.type() == SubjectType.CLIENT) {
            return Audience.RIDER;
        }
        if (person != null && person.type() == SubjectType.DRIVER) {
            return Audience.DRIVER;
        }
        throw new DomainException(ErrorCode.ACCESS_DENIED, "Riders and drivers only");
    }

    /** What the audit keeps: never the whole text, only which languages and their length. */
    private static Map<String, Object> summary(Version v) {
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("audience", v.audience().name());
        out.put("kind", v.kind().name());
        out.put("number", v.number());
        out.put("state", v.state());
        out.put("acceptance_required", v.acceptanceRequired());
        out.put("effective_from", v.effectiveFrom().toString());
        Map<String, Integer> lengths = new TreeMap<>();
        v.texts().forEach((lang, text) -> lengths.put(lang, text.length()));
        out.put("text_lengths", lengths);
        return out;
    }

    private Optional<Version> find(UUID id) {
        return jdbc.sql(SELECT + "where id = :id").param("id", id).query((rs, i) -> version(rs)).optional();
    }

    @SuppressWarnings("unchecked")
    private Version version(java.sql.ResultSet rs) throws java.sql.SQLException {
        Map<String, String> texts = new TreeMap<>(json.readValue(rs.getString("texts"), Map.class));
        return new Version(rs.getObject("id", UUID.class), Audience.valueOf(rs.getString("audience")),
                Kind.valueOf(rs.getString("kind")), rs.getInt("number"), rs.getString("state"), texts,
                rs.getBoolean("acceptance_required"), rs.getObject("effective_from", OffsetDateTime.class),
                rs.getObject("published_at", OffsetDateTime.class), rs.getLong("version"));
    }

    private OffsetDateTime now() {
        return clock.instant().truncatedTo(ChronoUnit.MICROS).atOffset(ZoneOffset.UTC);
    }
}
