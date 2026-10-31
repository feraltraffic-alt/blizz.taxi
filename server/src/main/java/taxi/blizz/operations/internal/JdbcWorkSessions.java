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
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityOperations;
import taxi.blizz.geo.CityResolver;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.configuration.LegalDocuments;
import taxi.blizz.operations.DriverAvailability;
import taxi.blizz.operations.LocationFix;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
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
 * A location becomes the dispatch position only when it follows plausibly from the driver's last accepted one,
 * whatever device or shift that came from (issue #102, threat model G1/G2). A free driver who pauses or closes loses
 * the open offer in the same transaction and the search goes on (AC-11, issue #141); those two lock the offer's order
 * before the capacity, in the order every assignment takes.
 */
@Service
class JdbcWorkSessions implements WorkSessions {

    /** How long the driver's last accepted position stays the baseline for the next one (issue #102). */
    private static final Duration BASELINE_MAX_AGE = Duration.ofMinutes(30);
    /** Added to the time between two fixes: phones send whole seconds and a request takes time to arrive. */
    private static final Duration ELAPSED_TOLERANCE = Duration.ofSeconds(2);

    private final LegalDocuments legal;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final Outbox outbox;
    private final AuditLog auditLog;
    private final AccountDirectory accounts;
    private final DriverAdmission admission;
    private final CityResolver cities;
    private final PresenceProperties presence;
    private final RiskProperties risk;
    private final ImpossibleMovementFlags movementFlags;
    private final OrderCore core;
    private final DispatchEngine engine;
    private final TransactionTemplate transactions;
    private final CityOperations cityOperations;
    private final Clock clock;

    JdbcWorkSessions(JdbcClient jdbc, IdempotentCommands commands, Outbox outbox, AuditLog auditLog,
                     AccountDirectory accounts, DriverAdmission admission, CityResolver cities,
                     PresenceProperties presence, RiskProperties risk, ImpossibleMovementFlags movementFlags,
                     LegalDocuments legal, OrderCore core, DispatchEngine engine,
                     TransactionTemplate transactions, CityOperations cityOperations, Clock clock) {
        this.cityOperations = cityOperations;
        this.legal = legal;
        this.jdbc = jdbc;
        this.commands = commands;
        this.outbox = outbox;
        this.auditLog = auditLog;
        this.accounts = accounts;
        this.admission = admission;
        this.cities = cities;
        this.presence = presence;
        this.risk = risk;
        this.movementFlags = movementFlags;
        this.core = core;
        this.engine = engine;
        this.transactions = transactions;
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
                    // Only in a city the driver is admitted in (REQ-DSP-01, REQ-DS-06, issue #141).
                    if (!admission.admissionOf(driver.id()).admittedIn(city.id())) {
                        throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE, "ADMISSION_CITY");
                    }
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
                    // A new shift does not reset the baseline: an implausible fix opens it without a dispatch
                    // position, and the next plausible heartbeat gives it one (issue #102).
                    Optional<Movement> jump = implausible(driver.id(), location.point(), now);
                    if (jump.isPresent()) {
                        jdbc.sql("""
                                        update work_session set last_location = null, last_location_at = null,
                                            last_location_accuracy = null, last_location_sequence = null
                                        where id = :id""")
                                .param("id", sessionId).update();
                        flag(driver.id(), sessionId, city.id(), jump.get(), now);
                    } else {
                        acceptedPosition(driver.id(), location.point(), now);
                    }
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
        return withOfferedOrderLocked(driver, offeredOrder -> controlled(driver, commandId, deviceSessionId,
                expectedVersion, "work_session.pause", session -> {
                    if (!"OPEN".equals(session.state())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The session is closing");
                    }
                    String intent = busy(session.driverId()) ? "PAUSE_AFTER_CURRENT" : "NOT_ACCEPTING";
                    long version = update(session, "intent = :intent", Map.of("intent", intent));
                    publish("WorkSessionIntentChanged", session.id(), version, Map.of("intent", intent));
                    revokeOpenOffer(driver, offeredOrder, "DRIVER_PAUSED");
                }));
    }

    @Override
    public DriverAvailability resume(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion) {
        return controlled(driver, commandId, deviceSessionId, expectedVersion, "work_session.resume", session -> {
            if (!"OPEN".equals(session.state())) {
                throw new DomainException(ErrorCode.STATE_CONFLICT, "The session is closing");
            }
            List<String> reasons = admissionReasons(driver, session.vehicleId());
            if (!admission.admissionOf(driver.id()).admittedIn(session.cityId())) {
                reasons.add("ADMISSION_CITY");
            }
            if (!reasons.isEmpty()) {
                throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE, String.join(", ", reasons));
            }
            long version = update(session, "intent = 'ACCEPTING'", Map.of());
            publish("WorkSessionIntentChanged", session.id(), version, Map.of("intent", "ACCEPTING"));
        });
    }

    @Override
    public DriverAvailability close(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion) {
        return withOfferedOrderLocked(driver, offeredOrder -> controlled(driver, commandId, deviceSessionId,
                expectedVersion, "work_session.close", session -> {
                    if (!"OPEN".equals(session.state())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The session is already closing");
                    }
                    Map<String, Object> payload = Map.of("driver_id", session.driverId().toString());
                    if (busy(session.driverId())) {
                        long version = update(session, "state = 'CLOSING', intent = 'PAUSE_AFTER_CURRENT'",
                                Map.of());
                        publish("WorkSessionClosing", session.id(), version, payload);
                    } else {
                        long version = update(session, "state = 'CLOSED', closed_at = :now", Map.of("now", now()));
                        publish("WorkSessionClosed", session.id(), version, payload);
                    }
                    revokeOpenOffer(driver, offeredOrder, "DRIVER_CLOSED");
                }));
    }

    @Override
    @Transactional
    public DriverAvailability heartbeat(Actor driver, UUID deviceSessionId, LocationFix location) {
        // The busiest command of the server, 250 a second at L1 (issue #178): it reads the session once under the
        // capacity lock, writes it once, and answers from what it wrote instead of reading it all again.
        requireDriver(driver);
        lockCapacity(driver.id());
        Session session = currentSession(driver.id())
                .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No open session"));
        OffsetDateTime now = now().truncatedTo(java.time.temporal.ChronoUnit.MICROS);
        boolean future = location != null && location.recordedAt().isAfter(now.plus(presence.futureTolerance()));
        // Only a newer sequence moves the current position (REQ-GEO-02); an older one is ignored, not refused.
        boolean older = location != null && session.lastLocationSequence() != null
                && session.lastLocationSequence() >= location.sequence();
        if (location == null || future || older) {
            jdbc.sql("update work_session set last_heartbeat_at = :now where id = :id")
                    .param("now", now).param("id", session.id()).update();
            return availability(driver.id(), session.heartbeat(now)).withAccepted(!future);
        }
        Optional<Movement> jump = implausible(driver.id(), location.point(), now);
        if (jump.isPresent()) {
            // Not the dispatch position: the old point stays, STALE until a plausible fix (issue #102).
            jdbc.sql("update work_session set last_heartbeat_at = :now, location_refused_at = :now where id = :id")
                    .param("now", now).param("id", session.id()).update();
            flag(driver.id(), session.id(), session.cityId(), jump.get(), now);
            return availability(driver.id(), session.heartbeat(now).refused(now)).withAccepted(false);
        }
        jdbc.sql("""
                        update work_session
                        set last_heartbeat_at = :now,
                            last_location = ST_SetSRID(ST_MakePoint(:lon, :lat), 4326), last_location_at = :now,
                            last_location_accuracy = :accuracy, last_location_sequence = :sequence,
                            location_refused_at = null
                        where id = :id""")
                .param("lon", location.point().lon())
                .param("lat", location.point().lat())
                .param("now", now)
                .param("accuracy", location.accuracyMeters())
                .param("sequence", location.sequence())
                .param("id", session.id())
                .update();
        acceptedPosition(driver.id(), location.point(), now);
        return availability(driver.id(), session.heartbeat(now).located(now, location)).withAccepted(true);
    }

    // ---------------------------------------------------------------- open offers (AC-11, issue #141)

    private interface OfferedOrderCommand {
        DriverAvailability run(Optional<UUID> offeredOrder);
    }

    /**
     * Runs a pause or close in one transaction that first locks the order of the driver's open offer, if any, and
     * only then the capacity: the order every accept and every dispatch round takes, so a pause racing an accept
     * waits for it instead of deadlocking (E5). The offer is read again under the locks by {@link #revokeOpenOffer}.
     */
    private DriverAvailability withOfferedOrderLocked(Actor driver, OfferedOrderCommand command) {
        requireDriver(driver);
        return transactions.execute(status -> {
            Optional<UUID> offeredOrder = openOffer(driver.id()).map(OpenOffer::orderId);
            offeredOrder.ifPresent(core::lockOrder);
            return command.run(offeredOrder);
        });
    }

    private record OpenOffer(UUID id, UUID orderId) {
    }

    /**
     * For a block of the driver's account (issue #141), in the caller's transaction: locks the order of the open
     * offer, if any, before anything else, as {@link #withOfferedOrderLocked} does for a pause.
     */
    Optional<UUID> lockOfferedOrder(UUID driverId) {
        Optional<UUID> offeredOrder = openOffer(driverId).map(OpenOffer::orderId);
        offeredOrder.ifPresent(core::lockOrder);
        return offeredOrder;
    }

    /**
     * The blocked driver gets no new work (REQ-DS-01): the shift stops taking orders — NOT_ACCEPTING when free,
     * PAUSE_AFTER_CURRENT on a trip, so the trip goes on — and the open offer is revoked (DRIVER_BLOCKED). Call after
     * {@link #lockOfferedOrder} in the same transaction.
     */
    void stopNewWork(Actor driver, Optional<UUID> offeredOrder) {
        lockCapacity(driver.id());
        Optional<Session> current = currentSession(driver.id());
        if (current.isPresent() && "OPEN".equals(current.get().state())) {
            String intent = busy(driver.id()) ? "PAUSE_AFTER_CURRENT" : "NOT_ACCEPTING";
            if (!intent.equals(current.get().intent()) && !"NOT_ACCEPTING".equals(current.get().intent())) {
                long version = update(current.get(), "intent = :intent", Map.of("intent", intent));
                publish("WorkSessionIntentChanged", current.get().id(), version, Map.of("intent", intent));
            }
        }
        revokeOpenOffer(driver, offeredOrder, "DRIVER_BLOCKED");
    }

    private Optional<OpenOffer> openOffer(UUID driverId) {
        return jdbc.sql("select id, order_id from offer where driver_id = :d and state = 'OPEN' order by created_at")
                .param("d", driverId)
                .query((rs, i) -> new OpenOffer(rs.getObject("id", UUID.class), rs.getObject("order_id", UUID.class)))
                .list().stream().findFirst();
    }

    /**
     * Revokes the driver's open offer, read under the capacity lock, and lets the order's search go on with the next
     * driver; an accept that comes after it gets OFFER_REVOKED. An offer made after the order was locked (another
     * order, within the milliseconds before the capacity lock) is revoked only when its order can be locked without
     * waiting; otherwise the command is refused as a conflict to repeat, never a deadlock.
     */
    private void revokeOpenOffer(Actor driver, Optional<UUID> lockedOrder, String reason) {
        Optional<OpenOffer> open = openOffer(driver.id());
        if (open.isEmpty()) {
            return;
        }
        UUID orderId = open.get().orderId();
        if (lockedOrder.filter(orderId::equals).isEmpty() && !core.tryLockOrder(orderId)) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "A new offer arrived at the same moment; try again");
        }
        core.closeOpenOffers(orderId, "REVOKED");
        core.recordEvent(orderId, core.touch(orderId), "OfferRevoked", driver, reason,
                Map.of("offer_id", open.get().id().toString(), "driver_id", driver.id().toString(),
                        "reason", reason));
        engine.liveAttempt(orderId).ifPresent(engine::advance);
    }

    // ---------------------------------------------------------------- plausible positions (issue #102)

    private record Movement(int distanceM, double seconds, int speedKph) {
    }

    /**
     * The movement from the driver's last accepted position to {@code point} when it is faster than
     * {@code blizz.risk.impossible-speed-kph}; empty when it is plausible or there is no baseline of the last 30
     * minutes. Time is the server's between the two receipts: the phone's {@code recorded_at} is the sender's word,
     * and a back-dated baseline would make any jump look slow.
     */
    private Optional<Movement> implausible(UUID driverId, GeoPoint point, OffsetDateTime now) {
        record Baseline(int distanceM, OffsetDateTime acceptedAt) {
        }
        return jdbc.sql("""
                        select cast(ST_Distance(point::geography,
                                    ST_SetSRID(ST_MakePoint(:lon, :lat), 4326)::geography) as int) as distance_m,
                               accepted_at
                        from driver_last_position where driver_id = :id and accepted_at > :since""")
                .param("lon", point.lon())
                .param("lat", point.lat())
                .param("id", driverId)
                .param("since", now.minus(BASELINE_MAX_AGE))
                .query((rs, i) -> new Baseline(rs.getInt("distance_m"),
                        rs.getObject("accepted_at", OffsetDateTime.class)))
                .optional()
                .flatMap(baseline -> {
                    Duration elapsed = Duration.between(baseline.acceptedAt(), now);
                    double seconds = (Math.max(0, elapsed.toMillis()) + ELAPSED_TOLERANCE.toMillis()) / 1000.0;
                    double kph = baseline.distanceM() / seconds * 3.6;
                    return kph > risk.impossibleSpeedKph()
                            ? Optional.of(new Movement(baseline.distanceM(), seconds, (int) Math.round(kph)))
                            : Optional.empty();
                });
    }

    private void acceptedPosition(UUID driverId, GeoPoint point, OffsetDateTime now) {
        jdbc.sql("""
                        insert into driver_last_position (driver_id, point, accepted_at)
                        values (:id, ST_SetSRID(ST_MakePoint(:lon, :lat), 4326), :now)
                        on conflict (driver_id) do update set point = excluded.point, accepted_at = excluded.accepted_at""")
                .param("id", driverId)
                .param("lon", point.lon())
                .param("lat", point.lat())
                .param("now", now)
                .update();
    }

    /** The same IMPOSSIBLE_MOVEMENT flag as from the track, once per shift and hour; it blocks nothing (REQ-DS-08). */
    private void flag(UUID driverId, UUID sessionId, UUID cityId, Movement jump, OffsetDateTime now) {
        movementFlags.raise(driverId, sessionId, cityId, jump.distanceM(), jump.seconds(), jump.speedKph(), now,
                Map.of("source", "heartbeat"));
    }

    // ---------------------------------------------------------------- read model

    @Override
    @Transactional(readOnly = true)
    public DriverAvailability availability(UUID driverId) {
        return availability(driverId, currentSession(driverId));
    }

    /** {@code current}: the session as the caller has just read or written it, under the capacity lock. */
    private DriverAvailability availability(UUID driverId, Session current) {
        return availability(driverId, Optional.of(current));
    }

    private DriverAvailability availability(UUID driverId, Optional<Session> current) {
        Actor driver = new Actor(SubjectType.DRIVER, driverId);
        String accountState = accounts.accountState(driver)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Driver not found"));
        DriverAdmission.AdmissionSnapshot admitted = admission.admissionOf(driverId);
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
                    List.copyOf(reasons), null);
        }
        Session session = current.get();
        String connection = connection(session.lastHeartbeatAt(), now);
        String geolocation = session.lastLocationAt() == null ? "UNAVAILABLE"
                : session.locationRefusedAt() != null ? "STALE"
                : Duration.between(session.lastLocationAt(), now).compareTo(presence.gpsMaxAge()) <= 0 ? "FRESH"
                : "STALE";
        if (!admitted.vehicleApproved(session.vehicleId())) {
            reasons.add("VEHICLE_NOT_APPROVED");
        }
        if (!admitted.admittedIn(session.cityId())) {
            reasons.add("ADMISSION_CITY");
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
        // A fix this inaccurate does not say where the car is well enough for a new order (REQ-GEO-04, issue #141).
        if (session.lastLocationAccuracy() != null
                && session.lastLocationAccuracy() > presence.eligibilityAccuracyMeters()) {
            reasons.add("LOCATION_INACCURATE");
        }
        // Outside the city further than its return zone: no new order; a current trip goes on (REQ-DS-07).
        if (session.lastLocationAt() != null && !withinReturnZone(session)) {
            reasons.add("LOCATION_OUTSIDE_CITY");
        }
        if (!"FREE".equals(occupancy)) {
            reasons.add("OCCUPANCY_" + occupancy);
        }
        return new DriverAvailability(driverId, session.id(), session.version(), session.state(), session.intent(),
                connection, geolocation, occupancy, accountState, admitted.reviewStatus().name(), session.cityId(),
                session.vehicleId(), session.lastHeartbeatAt(), session.lastLocationAt(), reasons.isEmpty(),
                List.copyOf(reasons), null);
    }

    // ---------------------------------------------------------------- helpers

    /** The last position is inside the session city's polygon or within its return zone (ADR 0004: reads city). */
    private boolean withinReturnZone(Session session) {
        return jdbc.sql("""
                        select coalesce(ST_DWithin(c.polygon::geography, ws.last_location::geography, :zone), false)
                        from work_session ws join city c on c.id = ws.city_id where ws.id = :id""")
                .param("zone", cityOperations.of(session.cityId()).returnZoneMeters())
                .param("id", session.id())
                .query(Boolean.class)
                .single();
    }

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
                           Float lastLocationAccuracy, OffsetDateTime locationRefusedAt, long version,
                           Long lastLocationSequence) {

        /** As a heartbeat at {@code at} leaves it (heartbeats do not change the version). */
        Session heartbeat(OffsetDateTime at) {
            return new Session(id, driverId, vehicleId, cityId, deviceSessionId, state, intent, at, lastLocationAt,
                    lastLocationAccuracy, locationRefusedAt, version, lastLocationSequence);
        }

        Session refused(OffsetDateTime at) {
            return new Session(id, driverId, vehicleId, cityId, deviceSessionId, state, intent, lastHeartbeatAt,
                    lastLocationAt, lastLocationAccuracy, at, version, lastLocationSequence);
        }

        Session located(OffsetDateTime at, LocationFix fix) {
            return new Session(id, driverId, vehicleId, cityId, deviceSessionId, state, intent, lastHeartbeatAt, at,
                    fix.accuracyMeters() == null ? null : fix.accuracyMeters().floatValue(), null, version,
                    fix.sequence());
        }
    }

    private Optional<Session> currentSession(UUID driverId) {
        return jdbc.sql("""
                        select id, driver_id, vehicle_id, city_id, device_session_id, state, intent, last_heartbeat_at,
                               last_location_at, last_location_accuracy, location_refused_at, version,
                               last_location_sequence
                        from work_session where driver_id = :id and state in ('OPEN', 'CLOSING')""")
                .param("id", driverId)
                .query((rs, i) -> new Session(rs.getObject("id", UUID.class), rs.getObject("driver_id", UUID.class),
                        rs.getObject("vehicle_id", UUID.class), rs.getObject("city_id", UUID.class),
                        rs.getObject("device_session_id", UUID.class), rs.getString("state"), rs.getString("intent"),
                        rs.getObject("last_heartbeat_at", OffsetDateTime.class),
                        rs.getObject("last_location_at", OffsetDateTime.class),
                        (Float) rs.getObject("last_location_accuracy"),
                        rs.getObject("location_refused_at", OffsetDateTime.class), rs.getLong("version"),
                        (Long) rs.getObject("last_location_sequence")))
                .optional();
    }

    private Session openSession(UUID driverId, long expectedVersion) {
        Session session = currentSession(driverId)
                .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No open session"));
        if (session.version() != expectedVersion) {
            throw ConflictException.version(session.version(),
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
        // Almost always the row is there: one statement locks it (issue #178); the first use creates it.
        if (jdbc.sql("select driver_id from driver_capacity where driver_id = :id for update")
                .param("id", driverId).query(UUID.class).optional().isPresent()) {
            return;
        }
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
        // An open offer is not a commitment: it expires after its seconds, and accepting it is refused while the
        // driver is paused (requireEligible).
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
