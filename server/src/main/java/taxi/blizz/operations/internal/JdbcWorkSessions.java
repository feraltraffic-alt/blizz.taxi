package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityResolver;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.configuration.LegalDocuments;
import taxi.blizz.operations.DriverAvailability;
import taxi.blizz.operations.LocationFix;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;

/**
 * Work sessions on PostgreSQL. The driver's capacity row is the per-driver lock: every command
 * locks it first, so two devices or two requests cannot open two sessions or race a pause against
 * a close. Eligibility is computed from current facts on every read, so a suspended admission or a
 * stale location excludes the driver at once without touching the ongoing session (REQ-DRV-05).
 */
@Service
class JdbcWorkSessions implements WorkSessions {

    private final LegalDocuments legal;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final Outbox outbox;
    private final AuditLog auditLog;
    private final AccountDirectory accounts;
    private final DriverAdmission admission;
    private final CityResolver cities;
    private final PresenceProperties presence;
    private final Clock clock;

    JdbcWorkSessions(JdbcClient jdbc, IdempotentCommands commands, Outbox outbox, AuditLog auditLog,
                     AccountDirectory accounts, DriverAdmission admission, CityResolver cities,
                     PresenceProperties presence, LegalDocuments legal, Clock clock) {
        this.legal = legal;
        this.jdbc = jdbc;
        this.commands = commands;
        this.outbox = outbox;
        this.auditLog = auditLog;
        this.accounts = accounts;
        this.admission = admission;
        this.cities = cities;
        this.presence = presence;
        this.clock = clock;
    }

    // ---------------------------------------------------------------- commands

    record OpenRequest(UUID deviceSessionId, UUID vehicleId, double lat, double lon, long sequence) {
    }

    @Override
    public DriverAvailability open(Actor driver, UUID commandId, UUID deviceSessionId, UUID vehicleId,
                                   LocationFix location) {
        requireDriver(driver);
        if (location == null || vehicleId == null || deviceSessionId == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Vehicle, device and location are required");
        }
        OpenRequest request = new OpenRequest(deviceSessionId, vehicleId, location.point().lat(),
                location.point().lon(), location.sequence());
        return commands.execute(new CommandKey(driver, "work_session.open", commandId), request,
                DriverAvailability.class, () -> {
                    lockCapacity(driver.id());
                    Optional<Session> current = currentSession(driver.id());
                    if (current.isPresent()) {
                        if (current.get().deviceSessionId().equals(deviceSessionId)) {
                            return availability(driver.id());
                        }
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Another device controls the open session; use handover");
                    }
                    // A driver goes online only after accepting the legal texts in force (REQ-PRV-08).
                    legal.requireAccepted(driver);
                    List<String> reasons = admissionReasons(driver, vehicleId);
                    if (!reasons.isEmpty()) {
                        throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE, String.join(", ", reasons));
                    }
                    OffsetDateTime now = now();
                    if (location.recordedAt().isBefore(now.minus(presence.openLocationMaxAge()))
                            || location.recordedAt().isAfter(now.plus(presence.futureTolerance()))) {
                        throw new DomainException(ErrorCode.LOCATION_NOT_FRESH, "A current location is required");
                    }
                    City city = cities.resolve(location.point())
                            .orElseThrow(() -> new DomainException(ErrorCode.OUTSIDE_SERVICE_AREA,
                                    "The location is outside every service area"));
                    UUID sessionId = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into work_session (id, driver_id, vehicle_id, city_id, device_session_id,
                                                              state, intent, opened_at, last_heartbeat_at,
                                                              last_location, last_location_at, last_location_accuracy,
                                                              last_location_sequence)
                                    values (:id, :driverId, :vehicleId, :cityId, :device, 'OPEN', 'ACCEPTING', :now,
                                            :now, ST_SetSRID(ST_MakePoint(:lon, :lat), 4326), :now, :accuracy,
                                            :sequence)""")
                            .param("id", sessionId)
                            .param("driverId", driver.id())
                            .param("vehicleId", vehicleId)
                            .param("cityId", city.id())
                            .param("device", deviceSessionId)
                            .param("now", now)
                            .param("lon", location.point().lon())
                            .param("lat", location.point().lat())
                            .param("accuracy", location.accuracyMeters())
                            .param("sequence", location.sequence())
                            .update();
                    publish("WorkSessionOpened", sessionId, 0, Map.of("driver_id", driver.id().toString(),
                            "city_id", city.id().toString(), "vehicle_id", vehicleId.toString()));
                    return availability(driver.id());
                });
    }

    record VersionedRequest(UUID deviceSessionId, long expectedVersion) {
    }

    @Override
    public DriverAvailability handover(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion) {
        requireDriver(driver);
        return commands.execute(new CommandKey(driver, "work_session.handover", commandId),
                new VersionedRequest(deviceSessionId, expectedVersion), DriverAvailability.class, () -> {
                    lockCapacity(driver.id());
                    Session session = openSession(driver.id(), expectedVersion);
                    int owned = jdbc.sql("""
                                    select count(*) from device_session
                                    where id = :id and subject_type = 'DRIVER' and subject_id = :driverId
                                      and revoked_at is null""")
                            .param("id", deviceSessionId)
                            .param("driverId", driver.id())
                            .query(Integer.class).single();
                    if (owned == 0) {
                        throw new DomainException(ErrorCode.ACCESS_DENIED, "Unknown device session");
                    }
                    if (!session.deviceSessionId().equals(deviceSessionId)) {
                        long version = update(session, "device_session_id = :device", Map.of("device", deviceSessionId));
                        auditLog.record(new AuditEntry(driver, "work_session.handover", "work_session",
                                session.id().toString(), "Control moved to another device",
                                Map.of("device_session_id", session.deviceSessionId().toString()),
                                Map.of("device_session_id", deviceSessionId.toString())));
                        publish("WorkSessionHandedOver", session.id(), version,
                                Map.of("driver_id", driver.id().toString()));
                    }
                    return availability(driver.id());
                });
    }

    @Override
    public DriverAvailability pause(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion) {
        return controlled(driver, commandId, deviceSessionId, expectedVersion, "work_session.pause", session -> {
            if (!"OPEN".equals(session.state())) {
                throw new DomainException(ErrorCode.STATE_CONFLICT, "The session is closing");
            }
            String intent = busy(session.driverId()) ? "PAUSE_AFTER_CURRENT" : "NOT_ACCEPTING";
            long version = update(session, "intent = :intent", Map.of("intent", intent));
            publish("WorkSessionIntentChanged", session.id(), version, Map.of("intent", intent));
        });
    }

    @Override
    public DriverAvailability resume(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion) {
        return controlled(driver, commandId, deviceSessionId, expectedVersion, "work_session.resume", session -> {
            if (!"OPEN".equals(session.state())) {
                throw new DomainException(ErrorCode.STATE_CONFLICT, "The session is closing");
            }
            List<String> reasons = admissionReasons(driver, session.vehicleId());
            if (!reasons.isEmpty()) {
                throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE, String.join(", ", reasons));
            }
            long version = update(session, "intent = 'ACCEPTING'", Map.of());
            publish("WorkSessionIntentChanged", session.id(), version, Map.of("intent", "ACCEPTING"));
        });
    }

    @Override
    public DriverAvailability close(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion) {
        return controlled(driver, commandId, deviceSessionId, expectedVersion, "work_session.close", session -> {
            if (!"OPEN".equals(session.state())) {
                throw new DomainException(ErrorCode.STATE_CONFLICT, "The session is already closing");
            }
            if (busy(session.driverId())) {
                long version = update(session, "state = 'CLOSING', intent = 'PAUSE_AFTER_CURRENT'", Map.of());
                publish("WorkSessionClosing", session.id(), version, Map.of("driver_id", session.driverId().toString()));
            } else {
                long version = update(session, "state = 'CLOSED', closed_at = :now", Map.of("now", now()));
                publish("WorkSessionClosed", session.id(), version, Map.of("driver_id", session.driverId().toString()));
            }
        });
    }

    @Override
    @Transactional
    public DriverAvailability heartbeat(Actor driver, UUID deviceSessionId, LocationFix location) {
        requireDriver(driver);
        lockCapacity(driver.id());
        Session session = currentSession(driver.id())
                .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No open session"));
        requireControl(session, deviceSessionId);
        OffsetDateTime now = now();
        jdbc.sql("update work_session set last_heartbeat_at = :now where id = :id")
                .param("now", now)
                .param("id", session.id())
                .update();
        if (location != null && !location.recordedAt().isAfter(now.plus(presence.futureTolerance()))) {
            // Only a newer sequence moves the current position (REQ-GEO-02).
            jdbc.sql("""
                            update work_session
                            set last_location = ST_SetSRID(ST_MakePoint(:lon, :lat), 4326), last_location_at = :now,
                                last_location_accuracy = :accuracy, last_location_sequence = :sequence
                            where id = :id
                              and (last_location_sequence is null or last_location_sequence < :sequence)""")
                    .param("lon", location.point().lon())
                    .param("lat", location.point().lat())
                    .param("now", now)
                    .param("accuracy", location.accuracyMeters())
                    .param("sequence", location.sequence())
                    .param("id", session.id())
                    .update();
        }
        return availability(driver.id());
    }

    // ---------------------------------------------------------------- read model

    @Override
    @Transactional(readOnly = true)
    public DriverAvailability availability(UUID driverId) {
        Actor driver = new Actor(SubjectType.DRIVER, driverId);
        String accountState = accounts.accountState(driver)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Driver not found"));
        DriverAdmission.AdmissionSnapshot admitted = admission.admissionOf(driverId);
        Optional<Session> current = currentSession(driverId);
        String occupancy = jdbc.sql("select occupancy from driver_capacity where driver_id = :id")
                .param("id", driverId)
                .query(String.class)
                .optional()
                .orElse("FREE");
        OffsetDateTime now = now();

        List<String> reasons = new ArrayList<>();
        if (!"ACTIVE".equals(accountState)) {
            reasons.add("ACCOUNT_" + accountState);
        }
        if (!admitted.admitted()) {
            reasons.add("ADMISSION_" + admitted.reviewStatus());
        }
        // Over the debt limit: no new orders (REQ-PAY-16); the session itself stays open.
        jdbc.sql("select distinct kind from driver_restriction where driver_id = :id and active order by kind")
                .param("id", driverId).query(String.class).list()
                .forEach(reasons::add);
        if (current.isEmpty()) {
            reasons.add("NO_OPEN_SESSION");
            return new DriverAvailability(driverId, null, 0, "CLOSED", null, "DISCONNECTED", "UNAVAILABLE",
                    occupancy, accountState, admitted.reviewStatus().name(), null, null, null, null, false,
                    List.copyOf(reasons));
        }
        Session session = current.get();
        String connection = connection(session.lastHeartbeatAt(), now);
        String geolocation = session.lastLocationAt() == null ? "UNAVAILABLE"
                : Duration.between(session.lastLocationAt(), now).compareTo(presence.gpsMaxAge()) <= 0 ? "FRESH"
                : "STALE";
        if (!admitted.vehicleApproved(session.vehicleId())) {
            reasons.add("VEHICLE_NOT_APPROVED");
        }
        if (!"OPEN".equals(session.state())) {
            reasons.add("SESSION_" + session.state());
        }
        if (!"ACCEPTING".equals(session.intent())) {
            reasons.add("INTENT_" + session.intent());
        }
        if (!"CONNECTED".equals(connection)) {
            reasons.add("CONNECTION_" + connection);
        }
        if (!"FRESH".equals(geolocation)) {
            reasons.add("LOCATION_" + geolocation);
        }
        if (!"FREE".equals(occupancy)) {
            reasons.add("OCCUPANCY_" + occupancy);
        }
        return new DriverAvailability(driverId, session.id(), session.version(), session.state(), session.intent(),
                connection, geolocation, occupancy, accountState, admitted.reviewStatus().name(), session.cityId(),
                session.vehicleId(), session.lastHeartbeatAt(), session.lastLocationAt(), reasons.isEmpty(),
                List.copyOf(reasons));
    }

    // ---------------------------------------------------------------- helpers

    private interface SessionChange {
        void apply(Session session);
    }

    private DriverAvailability controlled(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion,
                                          String operation, SessionChange change) {
        requireDriver(driver);
        return commands.execute(new CommandKey(driver, operation, commandId),
                new VersionedRequest(deviceSessionId, expectedVersion), DriverAvailability.class, () -> {
                    lockCapacity(driver.id());
                    Session session = openSession(driver.id(), expectedVersion);
                    requireControl(session, deviceSessionId);
                    change.apply(session);
                    return availability(driver.id());
                });
    }

    private record Session(UUID id, UUID driverId, UUID vehicleId, UUID cityId, UUID deviceSessionId, String state,
                           String intent, OffsetDateTime lastHeartbeatAt, OffsetDateTime lastLocationAt,
                           long version) {
    }

    private Optional<Session> currentSession(UUID driverId) {
        return jdbc.sql("""
                        select id, driver_id, vehicle_id, city_id, device_session_id, state, intent, last_heartbeat_at,
                               last_location_at, version
                        from work_session where driver_id = :id and state in ('OPEN', 'CLOSING')""")
                .param("id", driverId)
                .query((rs, i) -> new Session(rs.getObject("id", UUID.class), rs.getObject("driver_id", UUID.class),
                        rs.getObject("vehicle_id", UUID.class), rs.getObject("city_id", UUID.class),
                        rs.getObject("device_session_id", UUID.class), rs.getString("state"), rs.getString("intent"),
                        rs.getObject("last_heartbeat_at", OffsetDateTime.class),
                        rs.getObject("last_location_at", OffsetDateTime.class), rs.getLong("version")))
                .optional();
    }

    private Session openSession(UUID driverId, long expectedVersion) {
        Session session = currentSession(driverId)
                .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No open session"));
        if (session.version() != expectedVersion) {
            throw new DomainException(ErrorCode.VERSION_CONFLICT,
                    "Session changed: expected version " + expectedVersion + ", current " + session.version());
        }
        return session;
    }

    private static void requireControl(Session session, UUID deviceSessionId) {
        if (!session.deviceSessionId().equals(deviceSessionId)) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "Another device controls this session");
        }
    }

    /** Creates the capacity row on first use and locks it: the per-driver serialization point. */
    private void lockCapacity(UUID driverId) {
        jdbc.sql("""
                        insert into driver_capacity (driver_id, updated_at) values (:id, :now)
                        on conflict (driver_id) do nothing""")
                .param("id", driverId)
                .param("now", now())
                .update();
        jdbc.sql("select driver_id from driver_capacity where driver_id = :id for update")
                .param("id", driverId)
                .query(UUID.class)
                .single();
    }

    private boolean busy(UUID driverId) {
        String occupancy = jdbc.sql("select occupancy from driver_capacity where driver_id = :id")
                .param("id", driverId)
                .query(String.class)
                .optional()
                .orElse("FREE");
        // An open offer is not a commitment; the order core revokes it when the driver pauses.
        return !"FREE".equals(occupancy) && !"OFFERED".equals(occupancy);
    }

    private long update(Session session, String assignments, Map<String, Object> params) {
        var spec = jdbc.sql("update work_session set " + assignments + ", version = version + 1 "
                        + "where id = :id returning version")
                .param("id", session.id());
        for (Map.Entry<String, Object> param : params.entrySet()) {
            spec = spec.param(param.getKey(), param.getValue());
        }
        return spec.query(Long.class).single();
    }

    private List<String> admissionReasons(Actor driver, UUID vehicleId) {
        List<String> reasons = new ArrayList<>();
        String accountState = accounts.accountState(driver).orElse("MISSING");
        if (!"ACTIVE".equals(accountState)) {
            reasons.add("ACCOUNT_" + accountState);
        }
        DriverAdmission.AdmissionSnapshot admitted = admission.admissionOf(driver.id());
        if (!admitted.admitted()) {
            reasons.add("ADMISSION_" + admitted.reviewStatus());
        }
        if (!admitted.vehicleApproved(vehicleId)) {
            reasons.add("VEHICLE_NOT_APPROVED");
        }
        return reasons;
    }

    private String connection(OffsetDateTime lastHeartbeat, OffsetDateTime now) {
        Duration age = Duration.between(lastHeartbeat, now);
        if (age.compareTo(presence.stale()) <= 0) {
            return "CONNECTED";
        }
        return age.compareTo(presence.disconnected()) <= 0 ? "STALE" : "DISCONNECTED";
    }

    private void publish(String type, UUID sessionId, long version, Map<String, Object> payload) {
        outbox.publish(new OutboxEvent(type, 1, "WorkSession", sessionId, version, new LinkedHashMap<>(payload)));
    }

    private static void requireDriver(Actor actor) {
        if (actor == null || actor.type() != SubjectType.DRIVER) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only the driver can do this");
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
