package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.operations.BroadcastOrderView;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.DriverAvailability;
import taxi.blizz.operations.OfferView;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

/**
 * Accepting, declining and claiming orders. The assignment is created in one local transaction
 * that locks the order, then the driver's capacity, then the offer (REQ-ASG-08); the unique
 * indexes on active assignments are the last line of defence against a second assignment.
 */
@Service
class JdbcDispatch implements Dispatch {

    private final taxi.blizz.platform.RateLimits rateLimits;

    /** Reasons that do not matter when the driver accepts the offer made to them. */
    private static final Set<String> IGNORED_ON_ACCEPT = Set.of("OCCUPANCY_OFFERED");

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final OrderCore core;
    private final DispatchEngine engine;
    private final WorkSessions workSessions;
    private final DispatchProperties properties;
    private final AssignmentCommitter committer;

    JdbcDispatch(JdbcClient jdbc, IdempotentCommands commands, OrderCore core, DispatchEngine engine,
                 WorkSessions workSessions, DispatchProperties properties, AssignmentCommitter committer,
                 taxi.blizz.platform.RateLimits rateLimits) {

        this.rateLimits = rateLimits;
        this.committer = committer;
        this.jdbc = jdbc;
        this.commands = commands;
        this.core = core;
        this.engine = engine;
        this.workSessions = workSessions;
        this.properties = properties;
    }

    @Override
    @Transactional(readOnly = true)
    public List<OfferView> offers(Actor driver) {
        requireDriver(driver);
        return jdbc.sql("""
                        select f.id, f.order_id, f.expires_at, f.distance_m, o.vehicle_class, ST_Y(o.pickup) as lat,
                               ST_X(o.pickup) as lon, o.pickup_label, o.dropoff_label, o.payment_method, o.price_minor,
                               o.currency
                        from offer f join ride_order o on o.id = f.order_id
                        where f.driver_id = :driver and f.state = 'OPEN' and f.expires_at > :now""")
                .param("driver", driver.id())
                .param("now", core.now())
                .query((rs, i) -> new OfferView(rs.getObject("id", UUID.class), rs.getObject("order_id", UUID.class),
                        rs.getObject("expires_at", OffsetDateTime.class), rs.getString("vehicle_class"),
                        new GeoPoint(rs.getDouble("lat"), rs.getDouble("lon")), rs.getString("pickup_label"),
                        rs.getString("dropoff_label"), PaymentMethod.valueOf(rs.getString("payment_method")),
                        (Long) rs.getObject("price_minor"), rs.getString("currency"),
                        (Integer) rs.getObject("distance_m")))
                .list();
    }

    record OfferRequest(UUID offerId) {
    }

    private record StoredOffer(UUID id, UUID orderId, UUID driverId, String state, OffsetDateTime expiresAt) {
    }

    @Override
    public AssignmentView accept(Actor driver, UUID commandId, UUID offerId) {
        requireDriver(driver);
        rateLimits.acquire(taxi.blizz.platform.RateLimits.OFFER_ACCEPT, driver);
        return commands.execute(new CommandKey(driver, "offer.accept", commandId), new OfferRequest(offerId),
                AssignmentView.class, () -> {
                    UUID orderId = orderOfOffer(offerId, driver);
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    OrderCore.Capacity capacity = core.lockCapacity(driver.id());
                    StoredOffer offer = lockOffer(offerId);
                    switch (offer.state()) {
                        case "OPEN" -> {
                            if (!core.now().isBefore(offer.expiresAt())) {
                                throw new DomainException(ErrorCode.OFFER_EXPIRED, "The offer has expired");
                            }
                        }
                        case "EXPIRED" -> throw new DomainException(ErrorCode.OFFER_EXPIRED, "The offer has expired");
                        default -> throw new DomainException(ErrorCode.OFFER_REVOKED, "The offer is no longer valid");
                    }
                    if (!"SEARCHING".equals(order.status())) {
                        throw new DomainException(ErrorCode.OFFER_REVOKED, "The order is no longer searching");
                    }
                    if (!"OFFERED".equals(capacity.occupancy())) {
                        throw new DomainException(ErrorCode.DRIVER_BUSY, "The driver is not free");
                    }
                    DriverAvailability availability = requireEligible(driver, IGNORED_ON_ACCEPT);
                    jdbc.sql("update offer set state = 'ACCEPTED', closed_at = :now where id = :id")
                            .param("now", core.now())
                            .param("id", offerId)
                            .update();
                    return commit(order, driver, availability.vehicleId(), "OFFER", offerId);
                });
    }

    @Override
    public void reject(Actor driver, UUID commandId, UUID offerId) {
        requireDriver(driver);
        commands.execute(new CommandKey(driver, "offer.reject", commandId), new OfferRequest(offerId), Boolean.class, () -> {
            UUID orderId = orderOfOffer(offerId, driver);
            core.lockOrder(orderId);
            core.lockCapacity(driver.id());
            StoredOffer offer = lockOffer(offerId);
            if (!"OPEN".equals(offer.state())) {
                return false;
            }
            jdbc.sql("update offer set state = 'REJECTED', closed_at = :now where id = :id")
                    .param("now", core.now())
                    .param("id", offerId)
                    .update();
            jdbc.sql("""
                            update driver_capacity set occupancy = 'FREE', updated_at = :now, version = version + 1
                            where driver_id = :id and occupancy = 'OFFERED'""")
                    .param("now", core.now())
                    .param("id", driver.id())
                    .update();
            core.recordEvent(orderId, core.touch(orderId), "OfferRejected", driver, null,
                    Map.of("offer_id", offerId.toString()));
            // A refusal does not reset the passenger's waiting time: same attempt, next driver (REQ-CAN-05).
            engine.liveAttempt(orderId).ifPresent(engine::advance);
            return true;
        });
    }

    @Override
    @Transactional(readOnly = true)
    public List<BroadcastOrderView> broadcast(Actor driver) {
        requireDriver(driver);
        DriverAvailability availability = workSessions.availability(driver.id());
        if (!availability.eligible()) {
            return List.of();
        }
        return jdbc.sql("""
                        select o.id, o.vehicle_class, ST_Y(o.pickup) as lat, ST_X(o.pickup) as lon, o.pickup_label,
                               o.dropoff_label, o.payment_method, o.price_minor, o.currency,
                               cast(ST_Distance(ws.last_location::geography, o.pickup::geography) as int) as distance_m
                        from ride_order o
                        join dispatch_attempt a on a.order_id = o.id and a.phase = 'BROADCAST'
                        join work_session ws on ws.driver_id = :driver and ws.state = 'OPEN'
                        join vehicle v on v.id = ws.vehicle_id
                        join driver d on d.id = ws.driver_id
                        where o.status = 'SEARCHING'
                          and o.city_id = ws.city_id
                          and o.vehicle_class = any(v.class_approvals)
                          and (o.payment_method <> 'TERMINAL' or d.has_payment_terminal or o.terminal_fallback_cash)
                          and ST_DWithin(ws.last_location::geography, o.pickup::geography, :radius)
                          and not exists (select 1 from assignment x where x.order_id = o.id and x.driver_id = :driver)
                        order by distance_m, o.created_at
                        limit 50""")
                .param("driver", driver.id())
                .param("radius", properties.broadcastRadiusMeters())
                .query((rs, i) -> new BroadcastOrderView(rs.getObject("id", UUID.class), rs.getString("vehicle_class"),
                        new GeoPoint(rs.getDouble("lat"), rs.getDouble("lon")), rs.getString("pickup_label"),
                        rs.getString("dropoff_label"), PaymentMethod.valueOf(rs.getString("payment_method")),
                        (Long) rs.getObject("price_minor"), rs.getString("currency"), rs.getInt("distance_m")))
                .list();
    }

    record ClaimRequest(UUID orderId) {
    }

    @Override
    public AssignmentView claim(Actor driver, UUID commandId, UUID orderId) {
        requireDriver(driver);
        return commands.execute(new CommandKey(driver, "order.claim", commandId), new ClaimRequest(orderId),
                AssignmentView.class, () -> {
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    OrderCore.Capacity capacity = core.lockCapacity(driver.id());
                    if ("ASSIGNED".equals(order.status()) || "IN_SERVICE".equals(order.status())) {
                        throw new DomainException(ErrorCode.ORDER_ALREADY_ASSIGNED, "Another driver took the order");
                    }
                    String phase = engine.liveAttempt(orderId).map(DispatchEngine.Attempt::phase).orElse(null);
                    if (!"SEARCHING".equals(order.status()) || !"BROADCAST".equals(phase)) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The order is not in the ALL tab");
                    }
                    if (!"FREE".equals(capacity.occupancy())) {
                        throw new DomainException(ErrorCode.DRIVER_BUSY, "The driver is not free");
                    }
                    DriverAvailability availability = requireEligible(driver, Set.of());
                    int hadIt = jdbc.sql("select count(*) from assignment where order_id = :order and driver_id = :driver")
                            .param("order", orderId)
                            .param("driver", driver.id())
                            .query(Integer.class).single();
                    if (hadIt > 0) {
                        throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE, "This driver already gave up the order");
                    }
                    // Within the radius of the ALL tab, as listed (audit 29.10.2026: a driver anywhere in the city
                    // could claim any order through the API).
                    boolean matches = jdbc.sql("""
                                    select count(*) from vehicle v, ride_order o, work_session ws
                                    where v.id = :vehicle and o.id = :order and o.vehicle_class = any(v.class_approvals)
                                      and o.city_id = :city and ws.driver_id = :driver and ws.state = 'OPEN'
                                      and ST_DWithin(ws.last_location::geography, o.pickup::geography, :radius)""")
                            .param("driver", driver.id()).param("radius", properties.broadcastRadiusMeters())
                            .param("vehicle", availability.vehicleId())
                            .param("order", orderId)
                            .param("city", availability.cityId())
                            .query(Integer.class).single() == 1;
                    if (!matches) {
                        throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE, "Class, city or distance does not match");
                    }
                    return commit(order, driver, availability.vehicleId(), "BROADCAST", null);
                });
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<AssignmentView> currentAssignment(Actor driver) {
        requireDriver(driver);
        return core.activeAssignmentOfDriver(driver.id());
    }

    private AssignmentView commit(OrderCore.LockedOrder order, Actor driver, UUID vehicleId, String source,
                                  UUID offerId) {
        return committer.commit(order, driver, vehicleId, source, offerId);
    }

    private DriverAvailability requireEligible(Actor driver, Set<String> ignored) {
        DriverAvailability availability = workSessions.availability(driver.id());
        List<String> reasons = availability.ineligibleReasons().stream().filter(r -> !ignored.contains(r)).toList();
        if (!reasons.isEmpty()) {
            throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE, String.join(", ", reasons));
        }
        return availability;
    }

    private UUID orderOfOffer(UUID offerId, Actor driver) {
        return jdbc.sql("select order_id from offer where id = :id and driver_id = :driver")
                .param("id", offerId)
                .param("driver", driver.id())
                .query(UUID.class)
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Offer not found"));
    }

    private StoredOffer lockOffer(UUID offerId) {
        return jdbc.sql("select id, order_id, driver_id, state, expires_at from offer where id = :id for update")
                .param("id", offerId)
                .query((rs, i) -> new StoredOffer(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, UUID.class), rs.getString(4), rs.getObject(5, OffsetDateTime.class)))
                .single();
    }

    private static void requireDriver(Actor actor) {
        if (!OrderCore.isDriver(actor)) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only drivers can do this");
        }
    }
}
