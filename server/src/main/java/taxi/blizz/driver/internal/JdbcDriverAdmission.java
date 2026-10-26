package taxi.blizz.driver.internal;

import java.sql.Array;
import java.sql.SQLException;
import java.time.Clock;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.driver.DocumentType;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.driver.DriverProfile;
import taxi.blizz.driver.ReviewDecision;
import taxi.blizz.driver.ReviewStatus;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;

/**
 * Admission state machine on PostgreSQL. The driver row is locked for every status change, the
 * expected version is checked, and each change writes a review history row, an audit record and an
 * outbox event in the same transaction.
 */
@Service
class JdbcDriverAdmission implements DriverAdmission {

    private static final Set<ReviewStatus> EDITABLE =
            EnumSet.of(ReviewStatus.NOT_SUBMITTED, ReviewStatus.CHANGES_REQUIRED, ReviewStatus.APPROVED,
                    ReviewStatus.SUSPENDED, ReviewStatus.EXPIRED);
    private static final Set<ReviewStatus> SUBMITTABLE =
            EnumSet.of(ReviewStatus.NOT_SUBMITTED, ReviewStatus.CHANGES_REQUIRED, ReviewStatus.EXPIRED);
    private static final UUID NO_VEHICLE = new UUID(0, 0);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final IdempotentCommands commands;
    private final Outbox outbox;
    private final AuditLog auditLog;
    private final DriverProperties properties;
    private final Clock clock;

    JdbcDriverAdmission(JdbcClient jdbc, TransactionTemplate tx, IdempotentCommands commands, Outbox outbox,
                        AuditLog auditLog, DriverProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.commands = commands;
        this.outbox = outbox;
        this.auditLog = auditLog;
        this.properties = properties;
        this.clock = clock;
    }

    // ---------------------------------------------------------------- reads

    @Override
    @Transactional(readOnly = true)
    public DriverProfile profile(UUID driverId) {
        record Row(String name, String language, String status, long version) {
        }
        Row row = jdbc.sql("select name, language, review_status, version from driver where id = :id")
                .param("id", driverId)
                .query((rs, i) -> new Row(rs.getString(1), rs.getString(2), rs.getString(3), rs.getLong(4)))
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Driver not found"));

        List<DriverProfile.Vehicle> vehicles = jdbc.sql("""
                        select id, registration_number, make, model, color, production_year, state, class_approvals
                        from vehicle where driver_id = :id order by created_at""")
                .param("id", driverId)
                .query((rs, i) -> new DriverProfile.Vehicle(rs.getObject("id", UUID.class),
                        rs.getString("registration_number"), rs.getString("make"), rs.getString("model"),
                        rs.getString("color"), rs.getInt("production_year"), rs.getString("state"),
                        textArray(rs.getArray("class_approvals"))))
                .list();

        List<DriverProfile.Document> documents = jdbc.sql("""
                        select distinct on (coalesce(vehicle_id, :none), type)
                               id, type, vehicle_id, file_id, number, valid_from, valid_to, decision, decision_reason
                        from driver_document where driver_id = :id
                        order by coalesce(vehicle_id, :none), type, created_at desc""")
                .param("id", driverId)
                .param("none", NO_VEHICLE)
                .query((rs, i) -> new DriverProfile.Document(rs.getObject("id", UUID.class),
                        DocumentType.valueOf(rs.getString("type")), rs.getObject("vehicle_id", UUID.class),
                        rs.getObject("file_id", UUID.class), rs.getString("number"),
                        rs.getObject("valid_from", LocalDate.class), rs.getObject("valid_to", LocalDate.class),
                        rs.getString("decision"), rs.getString("decision_reason")))
                .list();

        return new DriverProfile(driverId, row.name(), row.language(), ReviewStatus.valueOf(row.status()),
                row.version(), vehicles, documents);
    }

    // ---------------------------------------------------------------- driver commands

    record ProfileRequest(String name, String language) {
    }

    @Override
    public DriverProfile updateProfile(Actor driver, UUID commandId, String name, String language) {
        requireDriver(driver);
        if (name != null && name.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Name must not be blank");
        }
        return commands.execute(new CommandKey(driver, "driver.profile.update", commandId),
                new ProfileRequest(name, language), DriverProfile.class, () -> {
                    lock(driver.id());
                    jdbc.sql("""
                                    update driver set name = coalesce(:name, name), language = coalesce(:language, language),
                                                      updated_at = :now, version = version + 1
                                    where id = :id""")
                            .param("name", name)
                            .param("language", language)
                            .param("now", now())
                            .param("id", driver.id())
                            .update();
                    return profile(driver.id());
                });
    }

    @Override
    public UUID addVehicle(Actor driver, UUID commandId, VehicleInput vehicle) {
        requireDriver(driver);
        validate(vehicle);
        return commands.execute(new CommandKey(driver, "driver.vehicle.add", commandId), vehicle, UUID.class, () -> {
            requireEditable(lock(driver.id()));
            UUID id = UUID.randomUUID();
            OffsetDateTime now = now();
            jdbc.sql("""
                            insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                                 created_at, updated_at)
                            values (:id, :driverId, :registration, :make, :model, :color, :year, :now, :now)""")
                    .param("id", id)
                    .param("driverId", driver.id())
                    .param("registration", vehicle.registrationNumber().strip().toUpperCase())
                    .param("make", vehicle.make().strip())
                    .param("model", vehicle.model().strip())
                    .param("color", vehicle.color().strip())
                    .param("year", vehicle.productionYear())
                    .param("now", now)
                    .update();
            return id;
        });
    }

    @Override
    public UUID addDocument(Actor driver, UUID commandId, DocumentInput document) {
        requireDriver(driver);
        if (document.type() == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Document type is required");
        }
        if (document.type().belongsToVehicle() != (document.vehicleId() != null)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    document.type().belongsToVehicle() ? "This document needs a vehicle" : "This document is not a vehicle document");
        }
        if (document.validFrom() != null && document.validTo() != null && document.validTo().isBefore(document.validFrom())) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "valid_to is before valid_from");
        }
        return commands.execute(new CommandKey(driver, "driver.document.add", commandId), document, UUID.class, () -> {
            requireEditable(lock(driver.id()));
            if (document.vehicleId() != null) {
                int owned = jdbc.sql("select count(*) from vehicle where id = :id and driver_id = :driverId")
                        .param("id", document.vehicleId())
                        .param("driverId", driver.id())
                        .query(Integer.class).single();
                if (owned == 0) {
                    throw new DomainException(ErrorCode.NOT_FOUND, "Vehicle not found");
                }
            }
            UUID id = UUID.randomUUID();
            jdbc.sql("""
                            insert into driver_document (id, driver_id, vehicle_id, type, file_id, number, valid_from,
                                                         valid_to, created_at)
                            values (:id, :driverId, :vehicleId, :type, :fileId, :number, :validFrom, :validTo, :now)""")
                    .param("id", id)
                    .param("driverId", driver.id())
                    .param("vehicleId", document.vehicleId())
                    .param("type", document.type().name())
                    .param("fileId", document.fileId())
                    .param("number", document.number())
                    .param("validFrom", document.validFrom())
                    .param("validTo", document.validTo())
                    .param("now", now())
                    .update();
            return id;
        });
    }

    record VersionedRequest(UUID driverId, long expectedVersion) {
    }

    @Override
    public DriverProfile submit(Actor driver, UUID commandId, long expectedVersion) {
        requireDriver(driver);
        return commands.execute(new CommandKey(driver, "driver.verification.submit", commandId),
                new VersionedRequest(driver.id(), expectedVersion), DriverProfile.class, () -> {
                    Locked locked = lockVersion(driver.id(), expectedVersion);
                    if (!SUBMITTABLE.contains(locked.status())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Cannot submit while " + locked.status());
                    }
                    List<String> missing = missingDocuments(driver.id());
                    if (!missing.isEmpty()) {
                        throw new DomainException(ErrorCode.VALIDATION_FAILED, "Missing or invalid: " + String.join(", ", missing));
                    }
                    jdbc.sql("""
                                    update vehicle set state = 'IN_REVIEW', updated_at = :now, version = version + 1
                                    where driver_id = :id and state in ('DRAFT', 'EXPIRED')""")
                            .param("now", now())
                            .param("id", driver.id())
                            .update();
                    transition(driver.id(), locked.status(), ReviewStatus.IN_REVIEW, driver, "Submitted by the driver");
                    return profile(driver.id());
                });
    }

    // ---------------------------------------------------------------- reviewer commands

    record DecisionRequest(UUID driverId, long expectedVersion, ReviewDecision decision, String reason,
                           List<String> vehicleClasses, List<UUID> rejectedDocuments) {
    }

    @Override
    public DriverProfile decide(Actor reviewer, UUID commandId, UUID driverId, long expectedVersion,
                                ReviewDecision decision, String reason, List<String> vehicleClasses,
                                List<UUID> rejectedDocuments) {
        requireReviewer(reviewer);
        requireReason(reason);
        List<String> classes = vehicleClasses == null ? List.of() : List.copyOf(vehicleClasses);
        List<UUID> rejected = rejectedDocuments == null ? List.of() : List.copyOf(rejectedDocuments);
        if (decision == ReviewDecision.APPROVE && classes.isEmpty()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Approval needs at least one vehicle class");
        }
        return commands.execute(new CommandKey(reviewer, "driver.review.decide", commandId),
                new DecisionRequest(driverId, expectedVersion, decision, reason, classes, rejected),
                DriverProfile.class, () -> {
                    Locked locked = lockVersion(driverId, expectedVersion);
                    if (locked.status() != ReviewStatus.IN_REVIEW) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Driver is not in review");
                    }
                    OffsetDateTime now = now();
                    if (decision == ReviewDecision.APPROVE) {
                        List<String> missing = missingDocuments(driverId);
                        if (!missing.isEmpty()) {
                            throw new DomainException(ErrorCode.STATE_CONFLICT, "Documents became invalid: " + String.join(", ", missing));
                        }
                        jdbc.sql("""
                                        update vehicle set state = 'APPROVED', class_approvals = :classes,
                                                           updated_at = :now, version = version + 1
                                        where driver_id = :id and state = 'IN_REVIEW'""")
                                .param("classes", classes.toArray(String[]::new))
                                .param("now", now)
                                .param("id", driverId)
                                .update();
                        jdbc.sql("""
                                        update driver_document
                                        set decision = 'ACCEPTED', reviewer_staff_id = :reviewer, decided_at = :now
                                        where id in (
                                            select distinct on (coalesce(vehicle_id, :none), type) id
                                            from driver_document where driver_id = :id
                                            order by coalesce(vehicle_id, :none), type, created_at desc)
                                          and decision = 'PENDING'""")
                                .param("reviewer", reviewer.id())
                                .param("now", now)
                                .param("id", driverId)
                                .param("none", NO_VEHICLE)
                                .update();
                    } else {
                        jdbc.sql("""
                                        update vehicle set state = 'DRAFT', updated_at = :now, version = version + 1
                                        where driver_id = :id and state = 'IN_REVIEW'""")
                                .param("now", now)
                                .param("id", driverId)
                                .update();
                        for (UUID documentId : rejected) {
                            int updated = jdbc.sql("""
                                            update driver_document
                                            set decision = 'REJECTED', decision_reason = :reason,
                                                reviewer_staff_id = :reviewer, decided_at = :now
                                            where id = :docId and driver_id = :id""")
                                    .param("reason", reason)
                                    .param("reviewer", reviewer.id())
                                    .param("now", now)
                                    .param("docId", documentId)
                                    .param("id", driverId)
                                    .update();
                            if (updated == 0) {
                                throw new DomainException(ErrorCode.NOT_FOUND, "Document " + documentId + " not found");
                            }
                        }
                    }
                    transition(driverId, ReviewStatus.IN_REVIEW, decision.result(), reviewer, reason);
                    return profile(driverId);
                });
    }

    record SuspendRequest(UUID driverId, long expectedVersion, String reason) {
    }

    @Override
    public DriverProfile suspend(Actor reviewer, UUID commandId, UUID driverId, long expectedVersion, String reason) {
        requireReviewer(reviewer);
        requireReason(reason);
        return commands.execute(new CommandKey(reviewer, "driver.review.suspend", commandId),
                new SuspendRequest(driverId, expectedVersion, reason), DriverProfile.class, () -> {
                    Locked locked = lockVersion(driverId, expectedVersion);
                    if (locked.status() != ReviewStatus.APPROVED) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Only an approved driver can be suspended");
                    }
                    transition(driverId, ReviewStatus.APPROVED, ReviewStatus.SUSPENDED, reviewer, reason);
                    return profile(driverId);
                });
    }

    // ---------------------------------------------------------------- system

    @Override
    public int expireDocuments(LocalDate today) {
        List<String> required = new ArrayList<>();
        properties.requiredDriverDocuments().forEach(t -> required.add(t.name()));
        properties.requiredVehicleDocuments().forEach(t -> required.add(t.name()));
        List<UUID> candidates = jdbc.sql("""
                        with accepted as (
                            select distinct on (driver_id, coalesce(vehicle_id, :none), type)
                                   driver_id, vehicle_id, type, valid_to
                            from driver_document
                            where decision = 'ACCEPTED'
                            order by driver_id, coalesce(vehicle_id, :none), type, created_at desc)
                        select distinct a.driver_id
                        from accepted a
                        join driver d on d.id = a.driver_id
                        left join vehicle v on v.id = a.vehicle_id
                        where d.review_status = 'APPROVED'
                          and a.type = any(:types)
                          and a.valid_to < :today
                          and (a.vehicle_id is null or v.state = 'APPROVED')""")
                .param("none", NO_VEHICLE)
                .param("types", required.toArray(String[]::new))
                .param("today", today)
                .query(UUID.class)
                .list();
        int expired = 0;
        for (UUID driverId : candidates) {
            Boolean moved = tx.execute(status -> {
                Locked locked = lock(driverId);
                if (locked.status() != ReviewStatus.APPROVED) {
                    return false;
                }
                transition(driverId, ReviewStatus.APPROVED, ReviewStatus.EXPIRED, Actor.system(),
                        "A required document expired before " + today);
                return true;
            });
            if (Boolean.TRUE.equals(moved)) {
                expired++;
            }
        }
        return expired;
    }

    // ---------------------------------------------------------------- helpers

    private record Locked(ReviewStatus status, long version) {
    }

    private Locked lock(UUID driverId) {
        return jdbc.sql("select review_status, version from driver where id = :id for update")
                .param("id", driverId)
                .query((rs, i) -> new Locked(ReviewStatus.valueOf(rs.getString(1)), rs.getLong(2)))
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Driver not found"));
    }

    private Locked lockVersion(UUID driverId, long expectedVersion) {
        Locked locked = lock(driverId);
        if (locked.version() != expectedVersion) {
            throw new DomainException(ErrorCode.VERSION_CONFLICT,
                    "Driver changed: expected version " + expectedVersion + ", current " + locked.version());
        }
        return locked;
    }

    private void transition(UUID driverId, ReviewStatus from, ReviewStatus to, Actor actor, String reason) {
        OffsetDateTime now = now();
        long version = jdbc.sql("""
                        update driver set review_status = :to, updated_at = :now, version = version + 1
                        where id = :id returning version""")
                .param("to", to.name())
                .param("now", now)
                .param("id", driverId)
                .query(Long.class)
                .single();
        jdbc.sql("""
                        insert into driver_review_event (id, driver_id, from_status, to_status, actor_type, actor_id,
                                                         reason, occurred_at)
                        values (:id, :driverId, :from, :to, :actorType, :actorId, :reason, :now)""")
                .param("id", UUID.randomUUID())
                .param("driverId", driverId)
                .param("from", from.name())
                .param("to", to.name())
                .param("actorType", actor.type().name())
                .param("actorId", actor.id())
                .param("reason", reason)
                .param("now", now)
                .update();
        auditLog.record(new AuditEntry(actor, "driver.review_status." + to.name().toLowerCase(), "driver",
                driverId.toString(), reason, Map.of("review_status", from.name()), Map.of("review_status", to.name())));
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("driver_id", driverId.toString());
        payload.put("from", from.name());
        payload.put("to", to.name());
        outbox.publish(new OutboxEvent("DriverReviewStatusChanged", 1, "Driver", driverId, version, payload));
    }

    /** Required documents that are missing, rejected or not valid today; empty when complete. */
    private List<String> missingDocuments(UUID driverId) {
        LocalDate today = LocalDate.now(clock.withZone(properties.marketTimeZone()));
        List<String> missing = new ArrayList<>();
        Map<String, CurrentDocument> current = new LinkedHashMap<>();
        jdbc.sql("""
                        select distinct on (coalesce(vehicle_id, :none), type) vehicle_id, type, decision, valid_to
                        from driver_document where driver_id = :id
                        order by coalesce(vehicle_id, :none), type, created_at desc""")
                .param("id", driverId)
                .param("none", NO_VEHICLE)
                .query((rs, i) -> new CurrentDocument(rs.getObject("vehicle_id", UUID.class), rs.getString("type"),
                        rs.getString("decision"), rs.getObject("valid_to", LocalDate.class)))
                .list()
                .forEach(d -> current.put((d.vehicleId() == null ? "" : d.vehicleId().toString()) + ":" + d.type(), d));

        for (DocumentType type : properties.requiredDriverDocuments()) {
            check(current.get(":" + type.name()), type.name(), today, missing);
        }
        List<UUID> vehicles = jdbc.sql("select id from vehicle where driver_id = :id and state <> 'SUSPENDED'")
                .param("id", driverId)
                .query(UUID.class)
                .list();
        if (vehicles.isEmpty()) {
            missing.add("VEHICLE");
        }
        for (UUID vehicleId : vehicles) {
            for (DocumentType type : properties.requiredVehicleDocuments()) {
                check(current.get(vehicleId + ":" + type.name()), type.name() + " (vehicle " + vehicleId + ")", today, missing);
            }
        }
        return missing;
    }

    private record CurrentDocument(UUID vehicleId, String type, String decision, LocalDate validTo) {
    }

    private static void check(CurrentDocument document, String label, LocalDate today, List<String> missing) {
        if (document == null || "REJECTED".equals(document.decision())
                || (document.validTo() != null && document.validTo().isBefore(today))) {
            missing.add(label);
        }
    }

    private static void requireDriver(Actor actor) {
        if (actor == null || actor.type() != SubjectType.DRIVER) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only the driver can do this");
        }
    }

    private void requireReviewer(Actor actor) {
        if (actor == null || actor.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only staff can review drivers");
        }
        int allowed = jdbc.sql("""
                        select count(*) from staff_user
                        where id = :id and state = 'ACTIVE' and :permission = any(permissions)""")
                .param("id", actor.id())
                .param("permission", REVIEW_PERMISSION)
                .query(Integer.class).single();
        if (allowed == 0) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Missing permission " + REVIEW_PERMISSION);
        }
    }

    private static void requireReason(String reason) {
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
    }

    private static void requireEditable(Locked locked) {
        if (!EDITABLE.contains(locked.status())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "Cannot change documents while " + locked.status());
        }
    }

    private static void validate(VehicleInput vehicle) {
        if (vehicle == null || blank(vehicle.registrationNumber()) || blank(vehicle.make()) || blank(vehicle.model())
                || blank(vehicle.color())) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Registration number, make, model and colour are required");
        }
        int year = vehicle.productionYear();
        if (year < 1950 || year > LocalDate.now().getYear() + 1) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Production year is out of range");
        }
    }

    private static boolean blank(String value) {
        return value == null || value.isBlank();
    }

    private static List<String> textArray(Array array) throws SQLException {
        return array == null ? List.of() : List.of((String[]) array.getArray());
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
