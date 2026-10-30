package taxi.blizz.operations.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.DispatchJournal;
import taxi.blizz.operations.DriverAvailability;
import taxi.blizz.operations.LocationFix;
import taxi.blizz.operations.OfferView;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/**
 * The dispatch journal (REQ-DSP-12, issue #71) on real PostgreSQL: every exclusion reason for a constructed candidate
 * set, the rounds and offer results of a search, the stage times, the retention purge, no positions anywhere, and who
 * may read it. Its own synthetic city so other test classes' drivers never interfere.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
@org.junit.jupiter.api.extension.ExtendWith(org.springframework.boot.test.system.OutputCaptureExtension.class)
class DispatchJournalTests {

    static final String AREA = "SRID=4326;MULTIPOLYGON(((112 -40,113 -40,113 -39,112 -39,112 -40)))";
    static final GeoPoint PICKUP = new GeoPoint(-39.5, 112.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 112.55);

    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    WorkSessions sessions;
    @Autowired
    DispatchWorker worker;
    @org.springframework.test.context.bean.override.mockito.MockitoSpyBean
    OrderCore core;
    @Autowired
    JdbcDispatchJournal journal;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    QuoteService quoteService;
    @Autowired
    JsonMapper json;

    UUID cityId;

    @BeforeEach
    void cleanArea() {
        cityId = jdbc.sql("select id from city where code = 'test-journal'").query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, 'test-journal', 'Journal', 'UAH', 'Europe/Kyiv',
                                            ST_GeomFromEWKT(:area), 7771, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("area", AREA).update();
                    return id;
                });
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", cityId).update();
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", cityId).update();
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", cityId).update();
    }

    // ------------------------------------------------------------ fixtures

    private Actor client() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", id)
                .param("phone", "+48" + String.format("%09d", Math.floorMod(id.hashCode(), 1_000_000_000)))
                .update();
        return new Actor(SubjectType.CLIENT, id);
    }

    record Driver(Actor actor, UUID vehicle, UUID device) {
        UUID id() {
            return actor.id();
        }
    }

    private Driver driverAt(GeoPoint at, String... classes) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", id)
                .param("phone", "+38096" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, 'AA2000AA', 'Skoda', 'Octavia', 'grey', 2021, 'APPROVED', :classes,
                                now(), now())""")
                .param("id", vehicle).param("driver", id)
                .param("classes", classes.length == 0 ? new String[] {"STANDARD"} : classes)
                .update();
        UUID device = UUID.randomUUID();
        jdbc.sql("""
                        insert into device_session (id, subject_type, subject_id, audience, created_at,
                                                    last_refreshed_at, expires_at)
                        values (:id, 'DRIVER', :driver, 'driver', now(), now(), now() + interval '1 day')""")
                .param("id", device).param("driver", id).update();
        Driver driver = new Driver(new Actor(SubjectType.DRIVER, id), vehicle, device);
        sessions.open(driver.actor(), UUID.randomUUID(), device, vehicle,
                new LocationFix(at, 5.0, OffsetDateTime.now(), 1));
        return driver;
    }

    private static GeoPoint north(int metres) {
        return new GeoPoint(PICKUP.lat() + metres / 111_000.0, PICKUP.lon());
    }

    private OrderView order(Actor payer) {
        UUID quote = new TestQuotes(jdbc, quoteService).quote(payer, cityId, "STANDARD", PICKUP, DROPOFF).id();
        return orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP, "Pickup",
                DROPOFF, "Dropoff", PaymentMethod.CASH, quote));
    }

    private Actor staff(UUID city, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Support', 'OPERATOR', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "journal-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private OfferView onlyOffer(Driver driver) {
        List<OfferView> offers = dispatch.offers(driver.actor());
        assertThat(offers).hasSize(1);
        return offers.getFirst();
    }

    private Map<UUID, String> reasons(UUID orderId) {
        return core.explain(orderId, 5000, 50).stream().collect(Collectors.toMap(OrderCore.Considered::driverId,
                c -> c.reason() == null ? "OK" : c.reason()));
    }

    @org.springframework.test.context.bean.override.mockito.MockitoSpyBean OrderMetrics metricEvents;
    @Autowired io.micrometer.core.instrument.MeterRegistry meters;
    @Autowired org.springframework.transaction.support.TransactionTemplate tx;

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource({"channel,FUTURE_VALUE", "by,FUTURE_VALUE", "source,FUTURE_VALUE",
            "outcome,FUTURE_VALUE", "reason,FUTURE_VALUE", "reason,+380671234567", "reason,12345678-abcd-abcd-abcd-123456789abc"})
    void unknownLabelsBecomeOtherAndDoNotRollbackTheBusiness(String label, String future,
            org.springframework.boot.test.system.CapturedOutput output) {
        String name = switch (label) {
            case "channel" -> "blizz.orders.created";
            case "by" -> "blizz.orders.cancelled";
            case "source" -> "blizz.dispatch.assigned";
            case "outcome" -> "blizz.offers";
            default -> "blizz.dispatch.excluded";
        };
        double before = observation(name, label);
        Actor payer = client();
        Driver driver = label.equals("channel") || label.equals("by") ? null : driverAt(north(100));
        switch (label) {
            case "channel" -> org.mockito.Mockito.doAnswer(i -> {
                metricEvents.created(future, i.getArgument(1)); return null;
            }).when(metricEvents).created(org.mockito.ArgumentMatchers.eq("APP"), org.mockito.ArgumentMatchers.anyBoolean());
            case "by" -> org.mockito.Mockito.doAnswer(i -> {
                metricEvents.cancelled(future, i.getArgument(1)); return null;
            }).when(metricEvents).cancelled(org.mockito.ArgumentMatchers.eq("RIDER"), org.mockito.ArgumentMatchers.anyString());
            case "source" -> org.mockito.Mockito.doAnswer(i -> {
                Map<String, Object> payload = new java.util.LinkedHashMap<>(i.getArgument(2));
                payload.put("source", future);
                metricEvents.event(i.getArgument(0), "AssignmentCommitted", payload); return null;
            }).when(metricEvents).event(org.mockito.ArgumentMatchers.any(UUID.class),
                    org.mockito.ArgumentMatchers.eq("AssignmentCommitted"),
                    org.mockito.ArgumentMatchers.argThat(p -> p != null && "OFFER".equals(p.get("source"))));
            case "outcome" -> org.mockito.Mockito.doAnswer(i -> {
                metricEvents.offer(future); return null;
            }).when(metricEvents).offer(org.mockito.ArgumentMatchers.eq("DECLINED"));
            case "reason" -> org.mockito.Mockito.doReturn(List.of(new OrderCore.Considered(driver.id(), 100, future)))
                    .when(core).explain(org.mockito.ArgumentMatchers.any(UUID.class),
                            org.mockito.ArgumentMatchers.anyInt(), org.mockito.ArgumentMatchers.anyInt());
            default -> throw new AssertionError(label);
        }
        UUID quote = new TestQuotes(jdbc, quoteService).quote(payer, cityId, "STANDARD", PICKUP, DROPOFF).id();
        UUID id = tx.execute(status -> {
            OrderView order = orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP,
                    "Pickup", DROPOFF, "Dropoff", PaymentMethod.CASH, quote));
            if (label.equals("by")) orders.cancel(payer, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
            if (label.equals("source")) dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), onlyOffer(driver).id());
            if (label.equals("outcome")) dispatch.reject(driver.actor(), UUID.randomUUID(), onlyOffer(driver).id());
            assertThat(observation(name, label)).isEqualTo(before);
            return order.id();
        });
        assertThat(orders.get(id).status()).isEqualTo(label.equals("by") ? "CANCELLED" : label.equals("source") ? "ASSIGNED" : "SEARCHING");
        assertThat(observation(name, label)).isEqualTo(before + 1);
        assertThat(output.getOut()).contains(name, "OTHER");
        if (future.equals("FUTURE_VALUE")) assertThat(output.getOut()).contains(future);
        else assertThat(output.getOut()).doesNotContain(future).contains("REDACTED");
    }

    private double observation(String name, String label) {
        if (label.equals("source")) {
            var timer = meters.find(name).tag(label, "OTHER").timer();
            return timer == null ? 0 : timer.count();
        }
        var counter = meters.find(name).tag(label, "OTHER").counter();
        return counter == null ? 0 : counter.count();
    }

    // ------------------------------------------------------------ reasons

    @Test
    void everyExclusionReasonAppearsForAConstructedCandidateSet() {
        Driver chosen = driverAt(north(100));
        OrderView order = order(client());
        assertThat(onlyOffer(chosen).orderId()).isEqualTo(order.id());
        dispatch.reject(chosen.actor(), UUID.randomUUID(), onlyOffer(chosen).id()); // ALREADY_OFFERED from now on

        Driver eligible = driverAt(north(300));
        Driver stale = driverAt(north(200));
        jdbc.sql("update work_session set last_location_at = now() - interval '1 hour' where driver_id = :d")
                .param("d", stale.id()).update();
        Driver paused = driverAt(north(250));
        DriverAvailability p = sessions.availability(paused.id());
        sessions.pause(paused.actor(), UUID.randomUUID(), paused.device(), p.sessionVersion());
        Driver notAdmitted = driverAt(north(260));
        jdbc.sql("update driver set review_status = 'SUSPENDED' where id = :d").param("d", notAdmitted.id()).update();
        Driver otherClass = driverAt(north(270), "BUSINESS");
        Driver restricted = driverAt(north(280));
        jdbc.sql("""
                        insert into driver_restriction (driver_id, kind, source_ref, active, source_version, updated_at)
                        values (:d, 'DEBT_LIMIT', 'UAH', true, 1, now())""").param("d", restricted.id()).update();
        Driver busy = driverAt(north(290));
        jdbc.sql("update driver_capacity set occupancy = 'TO_PICKUP' where driver_id = :d").param("d", busy.id())
                .update();
        Driver released = driverAt(north(310));
        UUID attempt = jdbc.sql("select id from dispatch_attempt where order_id = :o order by generation desc limit 1")
                .param("o", order.id()).query(UUID.class).single();
        jdbc.sql("""
                        insert into assignment (id, order_id, driver_id, vehicle_id, source, state, created_at, closed_at)
                        values (:id, :o, :d, :v, 'OFFER', 'RELEASED', now(), now())""")
                .param("id", UUID.randomUUID()).param("o", order.id()).param("d", released.id())
                .param("v", released.vehicle()).update();
        Driver far = driverAt(north(8000));

        Map<UUID, String> reasons = reasons(order.id());
        assertThat(reasons).containsEntry(eligible.id(), "OK").containsEntry(stale.id(), "STALE_LOCATION")
                .containsEntry(paused.id(), "PAUSED").containsEntry(notAdmitted.id(), "NOT_ADMITTED")
                .containsEntry(otherClass.id(), "CLASS").containsEntry(restricted.id(), "RESTRICTED")
                .containsEntry(busy.id(), "BUSY").containsEntry(released.id(), "PREVIOUS_DRIVER")
                .containsEntry(chosen.id(), "ALREADY_OFFERED").containsEntry(far.id(), "TOO_FAR");

        // An order paid at a terminal: who has none is left out for that.
        jdbc.sql("update ride_order set payment_method = 'TERMINAL' where id = :o").param("o", order.id()).update();
        jdbc.sql("update driver set has_payment_terminal = true where id = :d").param("d", far.id()).update();
        assertThat(reasons(order.id())).containsEntry(eligible.id(), "PAYMENT").containsEntry(far.id(), "TOO_FAR");
        jdbc.sql("update ride_order set payment_method = 'CASH' where id = :o").param("o", order.id()).update();
        assertThat(attempt).isNotNull();
    }

    // ------------------------------------------------------------ a search in the journal

    @Test
    void theRoundsOffersAndStageTimesOfASearchAreInTheJournalWithoutPositions() {
        Driver near = driverAt(north(200));
        Driver second = driverAt(north(900));
        Driver paused = driverAt(north(100));
        DriverAvailability p = sessions.availability(paused.id());
        sessions.pause(paused.actor(), UUID.randomUUID(), paused.device(), p.sessionVersion());
        OrderView order = order(client());

        dispatch.reject(near.actor(), UUID.randomUUID(), onlyOffer(near).id());
        dispatch.accept(second.actor(), second.device(), UUID.randomUUID(), onlyOffer(second).id());

        Actor support = staff(cityId, Orders.VIEW_PERMISSION);
        DispatchJournal.Journal read = journal.of(support, order.id());
        assertThat(read.attempts()).hasSize(1);
        DispatchJournal.Attempt attempt = read.attempts().getFirst();
        assertThat(attempt.outcome()).isEqualTo("ASSIGNED");
        assertThat(attempt.firstOfferAt()).isNotNull();
        assertThat(attempt.assignedAt()).isNotNull().isAfterOrEqualTo(attempt.firstOfferAt());
        assertThat(attempt.endedAt()).isNotNull();
        assertThat(attempt.broadcastAt()).isNull();
        assertThat(attempt.offers()).extracting(DispatchJournal.Offer::driverId, DispatchJournal.Offer::result)
                .containsExactly(org.assertj.core.groups.Tuple.tuple(near.id(), "DECLINED"),
                        org.assertj.core.groups.Tuple.tuple(second.id(), "ACCEPTED"));
        assertThat(attempt.offers()).allSatisfy(o -> assertThat(o.closedAt()).isNotNull());

        assertThat(attempt.rounds()).hasSize(2);
        Map<UUID, DispatchJournal.Candidate> first = byDriver(attempt.rounds().get(0));
        assertThat(first.get(near.id()).outcome()).isEqualTo("OFFERED");
        assertThat(first.get(second.id()).outcome()).isEqualTo("ELIGIBLE");
        assertThat(first.get(paused.id())).extracting(DispatchJournal.Candidate::outcome,
                DispatchJournal.Candidate::reason).containsExactly("EXCLUDED", "PAUSED");
        assertThat(first.get(near.id()).distanceM()).isBetween(150, 250);
        Map<UUID, DispatchJournal.Candidate> secondRound = byDriver(attempt.rounds().get(1));
        assertThat(secondRound.get(near.id()).reason()).isEqualTo("ALREADY_OFFERED");
        assertThat(secondRound.get(second.id()).outcome()).isEqualTo("OFFERED");

        // Driver ids and distances only.
        String stored = jdbc.sql("select string_agg(candidates::text, ',') from dispatch_round where order_id = :o")
                .param("o", order.id()).query(String.class).single();
        String serialized = json.writeValueAsString(read);
        for (String text : List.of(stored, serialized)) {
            assertThat(text).doesNotContain("lat").doesNotContain("lon").doesNotContain("+380")
                    .doesNotContain(String.valueOf(PICKUP.lat()));
        }

        // Who may read it: orders.view for the order's city.
        assertCode(() -> journal.of(staff(UUID.randomUUID(), Orders.VIEW_PERMISSION), order.id()),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> journal.of(staff(cityId, Orders.CREATE_PERMISSION), order.id()), ErrorCode.ACCESS_DENIED);
        assertCode(() -> journal.of(support, UUID.randomUUID()), ErrorCode.NOT_FOUND);
    }

    @Test
    void aSearchWithNobodyGoesToBroadcastAndRunsOutAndSaysSo() {
        OrderView order = order(client());
        UUID attemptId = jdbc.sql("select id from dispatch_attempt where order_id = :o").param("o", order.id())
                .query(UUID.class).single();
        jdbc.sql("""
                        update dispatch_attempt set total_deadline = now() - interval '1 second',
                                                    next_action_at = now() - interval '1 second'
                        where id = :id""").param("id", attemptId).update();
        while (worker.runOnce() > 0) {
            // process the due attempt
        }
        DispatchJournal.Attempt attempt = journal.of(staff(cityId, Orders.VIEW_PERMISSION), order.id()).attempts()
                .getFirst();
        assertThat(attempt.outcome()).isEqualTo("EXHAUSTED");
        assertThat(attempt.broadcastAt()).as("nobody near: straight to everyone").isNotNull();
        assertThat(attempt.firstOfferAt()).isNull();
        assertThat(attempt.assignedAt()).isNull();
        assertThat(attempt.rounds()).hasSize(1);
        assertThat(attempt.rounds().getFirst().candidates()).isEmpty();
    }

    // ------------------------------------------------------------ retention

    @Test
    void roundsOlderThanTheRetentionArePurged() {
        Driver near = driverAt(north(200));
        OrderView order = order(client());
        onlyOffer(near);
        UUID attempt = jdbc.sql("select id from dispatch_attempt where order_id = :o").param("o", order.id())
                .query(UUID.class).single();
        UUID old = UUID.randomUUID();
        jdbc.sql("""
                        insert into dispatch_round (id, order_id, attempt_id, phase, radius_m, at, candidates)
                        values (:id, :o, :a, 'PERSONAL', 5000, now() - interval '91 days', '[]')""")
                .param("id", old).param("o", order.id()).param("a", attempt).update();
        assertThat(journal.purge()).isGreaterThanOrEqualTo(1);
        assertThat(jdbc.sql("select count(*) from dispatch_round where id = :id").param("id", old).query(Long.class)
                .single()).isZero();
        assertThat(jdbc.sql("select count(*) from dispatch_round where order_id = :o").param("o", order.id())
                .query(Long.class).single()).as("the recent round stays").isEqualTo(1);
        assertThat(jdbc.sql("select count(*) from offer where order_id = :o").param("o", order.id())
                .query(Long.class).single()).as("offers are the order's").isEqualTo(1);
    }

    private static Map<UUID, DispatchJournal.Candidate> byDriver(DispatchJournal.Round round) {
        return round.candidates().stream().collect(Collectors.toMap(DispatchJournal.Candidate::driverId, c -> c));
    }

    private static void assertCode(org.assertj.core.api.ThrowableAssert.ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
