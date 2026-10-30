package taxi.blizz.backoffice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestRides.Ride;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.backoffice.SupportCases.Case;
import taxi.blizz.backoffice.SupportCases.Category;
import taxi.blizz.backoffice.SupportCases.Priority;
import taxi.blizz.backoffice.SupportCases.QueueFilter;
import taxi.blizz.backoffice.SupportCases.State;
import taxi.blizz.backoffice.SupportCases.Visibility;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.StaffDirectory;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** Support cases and problem queues: REQ-ADM-09, REQ-PAY-15, REQ-DS-13, REQ-USR-18; S-08. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class SupportCasesTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -120.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -120.45);

    @Autowired
    SupportCases cases;
    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    SessionService auth;
    @Autowired
    QuoteService quotes;
    @Autowired
    StaffDirectory directory;
    @Autowired
    OutboxRelay relay;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    WebApplicationContext context;
    @Autowired
    JsonMapper json;

    TestRides rides;
    UUID cityId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-support", "UAH", -121);
    }

    private Actor staff(String role, UUID city, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at, updated_at)
                        values (:id, :login, 'Support', :role, :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "support-" + id).param("role", role).param("permissions", permissions)
                .param("scope", city == null ? new UUID[0] : new UUID[] {city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor agent() {
        return staff("OPERATOR", cityId, SupportCases.MANAGE_PERMISSION);
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private List<Case> queue(Actor staff, State state) {
        return cases.queue(staff, new QueueFilter(cityId, state, null, null, null, false, null, 100));
    }

    /**
     * REQ-API-09: the queue is sorted by priority first, then newest first. A cursor holds all of it, so pages of two
     * through six cases created in the same microsecond, two of each priority, return each case once and in order.
     * The first version cut by created_at only: here every case after the first page would have been lost.
     */
    @Test
    void theQueuePagesThroughPrioritiesAndEqualTimesEachCaseOnce() {
        UUID pagesCity = rides.city("test-support-pages", "UAH", -122);
        Actor rider = rides.client();
        List<UUID> made = new java.util.ArrayList<>();
        for (Priority priority : new Priority[] {Priority.LOW, Priority.URGENT, Priority.NORMAL, Priority.URGENT,
                Priority.LOW, Priority.NORMAL}) {
            Case opened = cases.open(rider, UUID.randomUUID(), Category.OTHER, null, "Page", "Paging " + priority);
            jdbc.sql("update support_case set city_id = :city, priority = :priority, created_at = :at where id = :id")
                    .param("city", pagesCity).param("priority", priority.name())
                    .param("at", java.time.OffsetDateTime.parse("2026-10-30T10:00:00.123456Z"))
                    .param("id", opened.id()).update();
            made.add(opened.id());
        }
        Actor staff = staff("OPERATOR", pagesCity, SupportCases.MANAGE_PERMISSION);

        List<Case> seen = new java.util.ArrayList<>();
        taxi.blizz.platform.PageCursor after = null;
        for (int page = 0; page < 10; page++) {
            List<Case> rows = cases.queue(staff, new QueueFilter(pagesCity, null, null, null, null, false, after, 3));
            List<Case> items = rows.subList(0, Math.min(2, rows.size()));
            seen.addAll(items);
            if (rows.size() <= 2) {
                break;
            }
            after = SupportCases.position(items.getLast(), false);
        }
        assertThat(seen).extracting(Case::id).hasSize(6).doesNotHaveDuplicates()
                .containsExactlyInAnyOrderElementsOf(made);
        assertThat(seen).extracting(Case::priority).containsExactly(Priority.URGENT, Priority.URGENT,
                Priority.NORMAL, Priority.NORMAL, Priority.LOW, Priority.LOW);
        assertThat(seen.subList(0, 2)).extracting(c -> c.id().toString()).isSortedAccordingTo(
                java.util.Comparator.reverseOrder());

        // A cursor of the rider's own list is not a queue position.
        String mine = SupportCases.minePosition(seen.getFirst()).encode();
        assertCode(() -> cases.queue(staff, new QueueFilter(pagesCity, null, null, null, null, false,
                taxi.blizz.platform.PageCursor.decode(SupportCases.CASE_QUEUE, mine), 3)), ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void aRiderReportsALostItemAndSupportWorksTheCaseWithInternalNotesHidden() {
        Ride ride = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.complete(ride, true);
        UUID command = UUID.randomUUID();
        Case opened = cases.open(ride.payer(), command, Category.LOST_ITEM, ride.order().id(), "Umbrella",
                "I left a black umbrella on the back seat");
        assertThat(cases.open(ride.payer(), command, Category.LOST_ITEM, ride.order().id(), "Umbrella",
                "I left a black umbrella on the back seat")).isEqualTo(opened);
        assertThat(opened.state()).isEqualTo(State.OPEN);
        assertThat(opened.cityId()).isEqualTo(cityId);

        Actor agent = agent();
        assertThat(queue(agent, State.OPEN)).extracting(Case::id).contains(opened.id());
        Case taken = cases.assign(agent, UUID.randomUUID(), opened.id(), opened.version(), agent.id(), "Mine");
        assertThat(taken.state()).isEqualTo(State.IN_PROGRESS);
        Case noted = cases.comment(agent, UUID.randomUUID(), opened.id(), taken.version(), Visibility.INTERNAL,
                "Driver says he has it", false);
        Case asked = cases.comment(agent, UUID.randomUUID(), opened.id(), noted.version(), Visibility.PUBLIC,
                "The driver found it. When can you pick it up?", true);
        assertThat(asked.state()).isEqualTo(State.WAITING_REQUESTER);

        Case seen = cases.mineOne(ride.payer(), opened.id());
        assertThat(seen.messages()).extracting(SupportCases.Message::body)
                .containsExactly("I left a black umbrella on the back seat", "The driver found it. When can you pick it up?");
        assertThat(seen.assignedStaffId()).isNull();
        assertThat(seen.messages().get(1).authorId()).as("staff id hidden").isNull();

        Case answered = cases.reply(ride.payer(), UUID.randomUUID(), opened.id(), "Tomorrow at 10");
        assertThat(answered.state()).isEqualTo(State.IN_PROGRESS);
        Case resolved = cases.resolve(agent, UUID.randomUUID(), opened.id(), cases.get(agent, opened.id()).version(),
                "Returned to the rider");
        assertThat(resolved.state()).isEqualTo(State.RESOLVED);
        assertCode(() -> cases.resolve(agent, UUID.randomUUID(), opened.id(), resolved.version() + 3, "x"),
                ErrorCode.VERSION_CONFLICT);
        Case closed = cases.close(agent, UUID.randomUUID(), opened.id(), resolved.version(), "Done");
        assertThat(closed.resolution()).isEqualTo("Returned to the rider");
        assertCode(() -> cases.reply(ride.payer(), UUID.randomUUID(), opened.id(), "Thanks"), ErrorCode.STATE_CONFLICT);
        assertThat(cases.get(agent, opened.id()).messages()).hasSize(4);
    }

    @Test
    void onlyOwnOrdersAndOnlySupportStaffOfTheCity() {
        Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        Actor stranger = rides.client();
        assertCode(() -> cases.open(stranger, UUID.randomUUID(), Category.PAYMENT, ride.order().id(), "x", "y"),
                ErrorCode.NOT_FOUND);
        assertCode(() -> cases.open(ride.payer(), UUID.randomUUID(), Category.TRIP_REVIEW, null, "x", "y"),
                ErrorCode.VALIDATION_FAILED);
        Case byDriver = cases.open(ride.driver().actor(), UUID.randomUUID(), Category.RIDER_BEHAVIOUR,
                ride.order().id(), "Rude rider", "Shouted at me");
        Case safety = cases.open(ride.payer(), UUID.randomUUID(), Category.SAFETY, ride.order().id(), "Unsafe driving",
                "Speeding");
        assertThat(safety.priority()).isEqualTo(Priority.URGENT);
        assertThat(cases.mine(stranger, null, 10)).isEmpty();
        assertCode(() -> cases.mineOne(stranger, byDriver.id()), ErrorCode.NOT_FOUND);

        Actor otherCity = staff("OPERATOR", UUID.randomUUID(), SupportCases.MANAGE_PERMISSION);
        Actor noRight = staff("OPERATOR", cityId, "orders.view");
        assertCode(() -> cases.get(otherCity, byDriver.id()), ErrorCode.ACCESS_DENIED);
        assertCode(() -> queue(noRight, null), ErrorCode.ACCESS_DENIED);
        Actor agent = agent();
        assertCode(() -> cases.assign(agent, UUID.randomUUID(), byDriver.id(), byDriver.version(), noRight.id(), "x"),
                ErrorCode.VALIDATION_FAILED);
        assertThat(queue(agent, null).getFirst().priority()).as("urgent first").isEqualTo(Priority.URGENT);
    }

    /** A case without an order has no city: only staff with all cities see or work it (issue #86). */
    @Test
    void aCaseWithoutACityIsForStaffWithAllCities() {
        Actor rider = rides.client();
        Case noCity = cases.open(rider, UUID.randomUUID(), Category.APP_PROBLEM, null, "App crashes", "On start");
        assertThat(noCity.cityId()).isNull();
        QueueFilter cityless = new QueueFilter(null, null, null, null, null, false, null, 100);

        Actor cityAgent = agent();
        assertCode(() -> cases.get(cityAgent, noCity.id()), ErrorCode.ACCESS_DENIED);
        assertCode(() -> cases.queue(cityAgent, cityless), ErrorCode.ACCESS_DENIED);
        assertCode(() -> cases.assign(cityAgent, UUID.randomUUID(), noCity.id(), noCity.version(), cityAgent.id(), "x"),
                ErrorCode.ACCESS_DENIED);

        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                        values (:id, :login, 'Support', 'OPERATOR', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "support-all-" + id)
                .param("permissions", new String[] {SupportCases.MANAGE_PERMISSION}).update();
        Actor everywhere = new Actor(SubjectType.STAFF, id);
        assertThat(cases.get(everywhere, noCity.id()).id()).isEqualTo(noCity.id());
        assertThat(cases.queue(everywhere, cityless)).extracting(Case::id).contains(noCity.id());
        assertCode(() -> cases.assign(everywhere, UUID.randomUUID(), noCity.id(), noCity.version(), cityAgent.id(),
                "x"), ErrorCode.VALIDATION_FAILED);
        assertThat(cases.assign(everywhere, UUID.randomUUID(), noCity.id(), noCity.version(), everywhere.id(), "mine")
                .assignedStaffId()).isEqualTo(everywhere.id());
    }

    @Test
    void cashNotReceivedAndFlaggedTripsFeedTheProblemQueuesOnce() {
        Ride unpaid = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.complete(unpaid, false);
        rides.city("test-support", "UAH", -121);
        Ride flagged = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        jdbc.sql("update trip set needs_review = true, arrival_exception = 'far' where id = :id")
                .param("id", flagged.trip().id()).update();
        rides.complete(flagged, true);
        deliverEvents();
        deliverEvents();

        Actor agent = agent();
        List<Case> problems = cases.queue(agent, new QueueFilter(cityId, null, null, null, null, false, null, 100));
        assertThat(problems).filteredOn(c -> unpaid.order().id().equals(c.orderId()))
                .singleElement().satisfies(c -> {
                    assertThat(c.category()).isEqualTo(Category.CASH_DISPUTE);
                    assertThat(c.priority()).isEqualTo(Priority.HIGH);
                    assertThat(c.requesterType()).isEqualTo("SYSTEM");
                });
        assertThat(problems).filteredOn(c -> flagged.order().id().equals(c.orderId()))
                .singleElement().satisfies(c -> assertThat(c.category()).isEqualTo(Category.TRIP_REVIEW));
        assertThat(cases.get(agent, problems.stream().filter(c -> unpaid.order().id().equals(c.orderId()))
                .findFirst().orElseThrow().id()).messages()).singleElement()
                .satisfies(m -> assertThat(m.visibility()).isEqualTo(Visibility.INTERNAL));
    }

    @Autowired
    taxi.blizz.platform.Outbox outbox;
    @Autowired
    org.springframework.transaction.support.TransactionTemplate tx;

    /**
     * Audit 29.10.2026: a second event with the key of an open problem is delivered without a second case. The
     * duplicate insert used to abort the relay's transaction, and the event ended FAILED.
     */
    @Test
    void aSecondEventWithTheSameProblemKeyIsDeliveredWithoutASecondCase() {
        Ride ride = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.complete(ride, true);
        deliverEvents();
        UUID order = ride.order().id();
        List<UUID> events = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            tx.executeWithoutResult(status -> outbox.publish(new taxi.blizz.platform.OutboxEvent("CashDisputeOverdue", 1,
                    "CashDispute", order, 0, Map.of("order_id", order.toString()))));
        }
        events.addAll(jdbc.sql("""
                        select event_id from outbox where event_type = 'CashDisputeOverdue' and aggregate_id = :order""")
                .param("order", order).query(UUID.class).list());
        deliverEvents();
        assertThat(events).hasSize(2);
        assertThat(jdbc.sql("select state from outbox where event_id in (:ids)").param("ids", events).query(String.class)
                .list()).containsOnly("DONE");
        assertThat(jdbc.sql("select count(*) from support_case where source_key = :key")
                .param("key", "cash-dispute-overdue:" + order).query(Long.class).single()).isOne();
    }

    @Test
    void theCasesOfASuspendedMemberGoBackToTheQueue() {
        Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        Case opened = cases.open(ride.payer(), UUID.randomUUID(), Category.PAYMENT, ride.order().id(), "Price", "Too high");
        Actor agent = agent();
        cases.assign(agent, UUID.randomUUID(), opened.id(), opened.version(), agent.id(), "Mine");

        UUID superId = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, state, all_cities, created_at, updated_at)
                        values (:id, :login, 'Root', 'SUPER_ADMIN', 'ACTIVE', true, now(), now())""")
                .param("id", superId).param("login", "root-support-" + superId).update();
        Actor root = new Actor(SubjectType.STAFF, superId);
        directory.suspend(root, UUID.randomUUID(), agent.id(), directory.get(root, agent.id()).version(), "Left");
        deliverEvents();

        Case back = cases.get(agent(), opened.id());
        assertThat(back.assignedStaffId()).isNull();
        assertThat(back.state()).isEqualTo(State.OPEN);
        assertThat(back.messages()).extracting(SupportCases.Message::visibility).contains(Visibility.INTERNAL);
    }

    @Test
    @SuppressWarnings("unchecked")
    void overHttpARiderOpensACaseAndAnOperatorSeesIt() throws Exception {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        String riderToken = auth.open(new VerifiedSubject(ride.payer(), "ACTIVE", false), "phone").accessToken();
        MvcResult opened = mvc.perform(post("/api/rider/v1/support/cases").header(HttpHeaders.AUTHORIZATION,
                        "Bearer " + riderToken).contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(Map.of("command_id", UUID.randomUUID(), "category", "APP_PROBLEM",
                        "order_id", ride.order().id(), "subject", "Map frozen", "message", "The map stopped moving"))))
                .andReturn();
        assertThat(opened.getResponse().getStatus()).isEqualTo(201);
        String caseId = (String) json.readValue(opened.getResponse().getContentAsString(), Map.class).get("id");

        String opToken = auth.openStaff(new VerifiedSubject(agent(), "ACTIVE", false), ApiAudience.OPERATOR, null)
                .accessToken();
        MvcResult queue = mvc.perform(get("/api/operator/v1/support/cases").param("city_id", cityId.toString())
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + opToken)).andReturn();
        assertThat(queue.getResponse().getStatus()).isEqualTo(200);
        assertThat((List<Map<String, Object>>) json.readValue(queue.getResponse().getContentAsString(), Map.class)
                .get("cases")).anySatisfy(c -> assertThat(c).containsEntry("id", caseId));
    }

    /** REQ-OPS-06: every case has an answer-by time from its priority; the queue can show only the overdue ones. */
    @Test
    void casesCarryAnAnswerByTimeAndTheOverdueOnesCanBeListed() {
        Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        for (Category system : List.of(Category.NO_DRIVER, Category.LOST_CONNECTION, Category.PAYMENT_UNKNOWN,
                Category.TRIP_REVIEW)) {
            assertCode(() -> cases.open(ride.payer(), UUID.randomUUID(), system, ride.order().id(), "x", "y"),
                    ErrorCode.VALIDATION_FAILED);
        }
        Case late = cases.open(ride.payer(), UUID.randomUUID(), Category.OTHER, ride.order().id(), "Late", "Still here");
        Case fresh = cases.open(ride.payer(), UUID.randomUUID(), Category.OTHER, ride.order().id(), "Fresh", "Hi");
        assertThat(java.time.Duration.between(fresh.createdAt(), fresh.respondBy()))
                .as("NORMAL: four hours").isEqualTo(java.time.Duration.ofHours(4));
        jdbc.sql("update support_case set respond_by = now() - interval '1 minute' where id = :id")
                .param("id", late.id()).update();

        Actor agent = agent();
        List<Case> overdue = cases.queue(agent, new QueueFilter(cityId, State.OPEN, null, null, null, false, null, 100,
                true));
        assertThat(overdue).extracting(Case::id).contains(late.id()).doesNotContain(fresh.id());

        Case urgent = cases.prioritize(agent, UUID.randomUUID(), fresh.id(), fresh.version(), Priority.URGENT,
                "Rider is stuck");
        assertThat(java.time.Duration.between(urgent.createdAt(), urgent.respondBy()))
                .as("a new priority moves the answer-by time").isEqualTo(java.time.Duration.ofMinutes(5));
    }
}
