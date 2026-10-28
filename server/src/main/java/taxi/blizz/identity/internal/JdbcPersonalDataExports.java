package taxi.blizz.identity.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.ClientAccounts;
import taxi.blizz.identity.OtpPurpose;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.PersonalDataExports;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.PersonalData;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/** See {@link PersonalDataExports}. Jobs are taken with SKIP LOCKED, so every instance may run the worker. */
@Service
class JdbcPersonalDataExports implements PersonalDataExports {

    private static final Logger log = LoggerFactory.getLogger(JdbcPersonalDataExports.class);
    static final Duration ONE_A_DAY = Duration.ofHours(24);
    /** A job left RUNNING longer than this (the instance stopped) is taken again. */
    static final Duration STUCK = Duration.ofMinutes(10);
    static final int MAX_ATTEMPTS = 3;
    static final int FORMAT = 1;

    private final JdbcClient jdbc;
    private final OtpService otp;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final List<PersonalData> parts;
    private final JsonMapper json;
    private final TransactionTemplate tx;
    private final Clock clock;
    private final Duration keep;

    JdbcPersonalDataExports(JdbcClient jdbc, OtpService otp, IdempotentCommands commands, StaffAccess staff,
                            AuditLog audit, List<PersonalData> parts, JsonMapper json, TransactionTemplate tx,
                            Clock clock, @Value("${blizz.privacy.data-export-keep:P7D}") Duration keep) {
        this.jdbc = jdbc;
        this.otp = otp;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.parts = parts.stream().sorted(Comparator.comparing(PersonalData::section)).toList();
        this.json = json;
        this.tx = tx;
        this.clock = clock;
        this.keep = keep;
        long distinct = this.parts.stream().map(PersonalData::section).distinct().count();
        if (distinct != this.parts.size()) {
            throw new IllegalStateException("Two modules give the same personal data section");
        }
    }

    private static final String SELECT = """
            select id, state, created_at, ready_at, expires_at, size_bytes from personal_data_export
            """;

    @Override
    public ChallengeIssued requestCode(Actor rider, String deviceRef, String clientIp) {
        requireRider(rider);
        return otp.requestConfirmation(rider, OtpPurpose.DATA_EXPORT, deviceRef, clientIp);
    }

    record RequestCommand(UUID challengeId, String otpCode) {
    }

    @Override
    public Export request(Actor rider, UUID commandId, UUID challengeId, String otpCode) {
        requireRider(rider);
        if (challengeId == null || otpCode == null || otpCode.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The challenge and the code are required");
        }
        return commands.execute(new CommandKey(rider, "personal_data_export.request", commandId),
                new RequestCommand(challengeId, otpCode.strip()), Export.class, () -> {
                    // Checked in its own transaction: a wrong code counts as an attempt even though this fails.
                    otp.confirm(rider, challengeId, otpCode, OtpPurpose.DATA_EXPORT);
                    String state = jdbc.sql("select account_state from client where id = :id for update")
                            .param("id", rider.id()).query(String.class).optional().orElse("ANONYMIZED");
                    if (!"ACTIVE".equals(state) && !"DELETION_PENDING".equals(state)) {
                        throw new DomainException(ErrorCode.ACCOUNT_NOT_ACTIVE,
                                "A copy of the data cannot be asked for in the state " + state);
                    }
                    OffsetDateTime now = now();
                    Optional<OffsetDateTime> last = jdbc.sql("""
                                    select created_at from personal_data_export
                                    where client_id = :id and state <> 'FAILED'
                                    order by created_at desc limit 1""")
                            .param("id", rider.id()).query(OffsetDateTime.class).optional();
                    if (last.isPresent() && last.get().isAfter(now.minus(ONE_A_DAY))) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "A copy of the data can be asked for once a day; the last one was at " + last.get());
                    }
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into personal_data_export (id, client_id, state, created_at)
                                    values (:id, :client, 'PENDING', :now)""")
                            .param("id", id).param("client", rider.id()).param("now", now).update();
                    audit.record(new AuditEntry(rider, "personal_data_export.request", "personal_data_export",
                            id.toString(), "The rider asked for a copy of their personal data", null,
                            Map.of("client_id", rider.id().toString())));
                    return find(id, rider.id()).orElseThrow();
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<Export> mine(Actor rider) {
        requireRider(rider);
        return list(rider.id());
    }

    @Override
    @Transactional(readOnly = true)
    public Export get(Actor rider, UUID exportId) {
        requireRider(rider);
        return find(exportId, rider.id()).orElseThrow(JdbcPersonalDataExports::notFound);
    }

    @Override
    @Transactional
    public File download(Actor rider, UUID exportId) {
        requireRider(rider);
        Export export = find(exportId, rider.id()).orElseThrow(JdbcPersonalDataExports::notFound);
        if (!"READY".equals(export.state()) || !export.expiresAt().isAfter(now())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The copy is "
                    + ("READY".equals(export.state()) ? "EXPIRED" : export.state()) + ", there is no file to download");
        }
        byte[] content = jdbc.sql("select content from personal_data_export where id = :id").param("id", exportId)
                .query(byte[].class).single();
        audit.record(new AuditEntry(rider, "personal_data_export.download", "personal_data_export",
                exportId.toString(), null, null, Map.of("client_id", rider.id().toString())));
        return new File("blizz-personal-data-" + export.createdAt().toLocalDate() + ".json", content);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Export> ofClient(Actor actor, UUID clientId) {
        staff.require(actor, ClientAccounts.MANAGE_PERMISSION);
        return list(clientId);
    }

    // ---------------------------------------------------------------- the worker

    private record Job(UUID id, UUID clientId) {
    }

    @Override
    public int buildPending(int max) {
        int taken = 0;
        while (taken < max) {
            Optional<Job> job = tx.execute(s -> claim());
            if (job == null || job.isEmpty()) {
                break;
            }
            taken++;
            build(job.get());
        }
        return taken;
    }

    @Scheduled(fixedDelayString = "${blizz.privacy.data-export-poll:PT10S}",
            initialDelayString = "${blizz.privacy.data-export-poll:PT10S}")
    void work() {
        buildPending(5);
        expire();
    }

    private Optional<Job> claim() {
        OffsetDateTime now = now();
        jdbc.sql("""
                        update personal_data_export set state = 'FAILED', error = :error
                        where state = 'RUNNING' and started_at < :stuck and attempts >= :max""")
                .param("error", "Stopped after " + MAX_ATTEMPTS + " attempts").param("stuck", now.minus(STUCK))
                .param("max", MAX_ATTEMPTS).update();
        Optional<Job> job = jdbc.sql("""
                        select id, client_id from personal_data_export
                        where state = 'PENDING' or (state = 'RUNNING' and started_at < :stuck)
                        order by created_at limit 1 for update skip locked""")
                .param("stuck", now.minus(STUCK))
                .query((rs, i) -> new Job(rs.getObject("id", UUID.class), rs.getObject("client_id", UUID.class)))
                .optional();
        job.ifPresent(j -> jdbc.sql("""
                        update personal_data_export set state = 'RUNNING', attempts = attempts + 1, started_at = :now
                        where id = :id""").param("now", now).param("id", j.id()).update());
        return job;
    }

    private void build(Job job) {
        byte[] content;
        try {
            content = json.writeValueAsBytes(collect(job.clientId()));
        } catch (RuntimeException e) {
            // Left RUNNING: taken again after STUCK, up to MAX_ATTEMPTS. The data itself is never logged.
            log.warn("Personal data export {} failed ({}), will retry", job.id(), e.getClass().getSimpleName());
            return;
        }
        tx.executeWithoutResult(s -> {
            OffsetDateTime now = now();
            jdbc.sql("""
                            update personal_data_export
                            set state = 'READY', content = :content, size_bytes = :size, ready_at = :now,
                                expires_at = :expires, error = null
                            where id = :id and state = 'RUNNING'""")
                    .param("content", content).param("size", (long) content.length).param("now", now)
                    .param("expires", now.plus(keep)).param("id", job.id()).update();
        });
    }

    /** The file: who it is for, when it was made and every module's part, in a fixed order. */
    Map<String, Object> collect(UUID clientId) {
        String phone = jdbc.sql("select phone_normalized from client where id = :id and account_state <> 'ANONYMIZED'")
                .param("id", clientId).query(String.class).optional()
                .orElseThrow(() -> new IllegalStateException("The account is gone"));
        PersonalData.Subject subject = new PersonalData.Subject(clientId, phone);
        Map<String, Object> sections = new LinkedHashMap<>();
        for (PersonalData part : parts) {
            sections.put(part.section(), part.of(subject));
        }
        Map<String, Object> file = new LinkedHashMap<>();
        file.put("format", FORMAT);
        file.put("generated_at", now().toString());
        file.put("client_id", clientId.toString());
        file.put("sections", sections);
        return file;
    }

    @Override
    @Transactional
    public int expire() {
        return jdbc.sql("""
                        update personal_data_export set state = 'EXPIRED', content = null
                        where state = 'READY' and expires_at <= :now""")
                .param("now", now()).update();
    }

    // ---------------------------------------------------------------- helpers

    private List<Export> list(UUID clientId) {
        return jdbc.sql(SELECT + "where client_id = :client order by created_at desc, id limit 20")
                .param("client", clientId).query((rs, i) -> export(rs)).list();
    }

    private Optional<Export> find(UUID id, UUID clientId) {
        return jdbc.sql(SELECT + "where id = :id and client_id = :client").param("id", id).param("client", clientId)
                .query((rs, i) -> export(rs)).optional();
    }

    private static Export export(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Export(rs.getObject("id", UUID.class), rs.getString("state"),
                rs.getObject("created_at", OffsetDateTime.class), rs.getObject("ready_at", OffsetDateTime.class),
                rs.getObject("expires_at", OffsetDateTime.class), (Long) rs.getObject("size_bytes"));
    }

    private static void requireRider(Actor actor) {
        if (actor == null || actor.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Riders only");
        }
    }

    private static DomainException notFound() {
        return new DomainException(ErrorCode.NOT_FOUND, "Export not found");
    }

    private OffsetDateTime now() {
        return clock.instant().truncatedTo(ChronoUnit.MICROS).atOffset(ZoneOffset.UTC);
    }
}
