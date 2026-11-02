package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.time.OffsetDateTime;
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
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestRides.Ride;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.CancelReasons.Audience;
import taxi.blizz.configuration.CancelReasons.DriverOutcome;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** Who cancelled, with which reason from which side's list, and the order history (owner decision 27.10.2026). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CancellationTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -59.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -59.45);

    @Autowired
    CancelReasons reasons;
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
        cityId = rides.city("test-cancellation", "UAH", -60);
    }

    private Actor staff(String first, String last, String role, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, first_name, last_name, name, role, permissions, all_cities,
                                                state, created_at, updated_at)
                        values (:id, :login, :first, :last, :name, :role, :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "cancel-" + id).param("first", first).param("last", last)
                .param("name", first + " " + last).param("role", role).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private Ride ride(String driverName) {
        rides.city("test-cancellation", "UAH", -60); // earlier drivers go offline, so the new one gets the offer
        TestRides.Driver driver = rides.driverNear(PICKUP);
        jdbc.sql("update driver set name = :name where id = :id").param("name", driverName)
                .param("id", driver.actor().id()).update();
        return rides.assigned(cityId, driver, PICKUP, DROPOFF);
    }

    private long version(UUID orderId) {
        return orders.get(orderId).version();
    }

    private String occupancy(Actor driver) {
        return jdbc.sql("select occupancy from driver_capacity where driver_id = :id").param("id", driver.id())
                .query(String.class).single();
    }

    @Test
    void theRiderCancelsWithAReasonFromTheRidersList() {
        Actor payer = rides.client();
        OrderView order = rides.order(payer, cityId, PICKUP, DROPOFF);
        assertCode(() -> orders.cancel(payer, UUID.randomUUID(), order.id(), version(order.id()), "NO_SUCH_REASON"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> orders.cancel(payer, UUID.randomUUID(), order.id(), version(order.id()), "DUPLICATE"),
                ErrorCode.VALIDATION_FAILED); // a staff reason
        UUID command = UUID.randomUUID();
        OrderView cancelled = orders.cancel(payer, command, order.id(), version(order.id()), "WAIT_TOO_LONG");
        assertThat(orders.cancel(payer, command, order.id(), order.version(), "WAIT_TOO_LONG")).isEqualTo(cancelled);

        assertThat(cancelled.status()).isEqualTo("CANCELLED");
        assertThat(cancelled.cancellation().by()).isEqualTo("RIDER");
        assertThat(cancelled.cancellation().reasonCode()).isEqualTo("WAIT_TOO_LONG");
        assertThat(cancelled.cancellation().reasonLabels()).containsEntry("ru", "Долго ждать машину");
        assertThat(orders.history(payer, null, 10)).filteredOn(item -> item.id().equals(order.id()))
                .singleElement().extracting(item -> item.cancellation().by()).isEqualTo("RIDER");
    }

    @Test
    void anOperatorsCancellationReadsAsAHistoryLineWithHerName() throws Exception {
        Actor anna = staff("Anna", "Kowalska", "OPERATOR", Orders.CANCEL_PERMISSION, Orders.VIEW_PERMISSION);
        Ride ride = ride("Ivan Petrenko");
        assertCode(() -> orders.cancel(anna, UUID.randomUUID(), ride.order().id(), version(ride.order().id()),
                "CHANGED_MIND"), ErrorCode.VALIDATION_FAILED); // a rider reason
        OrderView cancelled = orders.cancel(anna, UUID.randomUUID(), ride.order().id(), version(ride.order().id()),
                "PASSENGER_ASKED");
        assertThat(cancelled.cancellation().by()).isEqualTo("STAFF");
        assertThat(occupancy(ride.driver().actor())).isEqualTo("FREE");

        Orders.TimelineEntry last = orders.timeline(anna, ride.order().id()).getLast();
        assertThat(last.type()).isEqualTo("OrderCancelled");
        assertThat(last.actor().name()).isEqualTo("Anna Kowalska");
        assertThat(last.actor().role()).isEqualTo("OPERATOR");
        assertThat(last.reason()).isEqualTo("PASSENGER_ASKED");
        assertThat(last.details()).containsEntry("cancelled_by", "STAFF")
                .containsEntry("reason_labels", Map.of("ru", "Пассажир попросил", "uk", "Пасажир попросив",
                        "pl", "Na prośbę pasażera", "en", "Passenger asked"));
        assertThat(orders.timeline(anna, ride.order().id())).extracting(e -> e.actor().name()).contains("Ivan Petrenko");

        assertCode(() -> orders.timeline(staff("No", "Rights", "OPERATOR"), ride.order().id()), ErrorCode.ACCESS_DENIED);

        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        String token = auth.openStaff(new VerifiedSubject(anna, "ACTIVE", false), ApiAudience.OPERATOR, "web").accessToken();
        MvcResult events = mvc.perform(get("/api/operator/v1/orders/" + ride.order().id() + "/events")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
        assertThat(events.getResponse().getStatus()).isEqualTo(200);
        assertThat(events.getResponse().getContentAsString()).contains("\"name\":\"Anna Kowalska\"")
                .contains("\"cancelled_by\":\"STAFF\"");
        MvcResult list = mvc.perform(get("/api/operator/v1/cancel-reasons")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
        assertThat(list.getResponse().getContentAsString()).contains("PASSENGER_ASKED").doesNotContain("CHANGED_MIND");
    }

    @Test
    void aDriversReasonDecidesWhetherTheOrderIsCancelledOrGoesBackToTheSearch() {
        Ride cancelledByDriver = ride("Oleh");
        assertCode(() -> trips.cancel(cancelledByDriver.driver().actor(), UUID.randomUUID(),
                cancelledByDriver.trip().id(), cancelledByDriver.trip().version(), "WAIT_TOO_LONG"),
                ErrorCode.VALIDATION_FAILED); // a rider reason
        TripView aborted = trips.cancel(cancelledByDriver.driver().actor(), UUID.randomUUID(),
                cancelledByDriver.trip().id(), cancelledByDriver.trip().version(), "PASSENGER_ASKED");
        assertThat(aborted.phase()).isEqualTo("ABORTED");
        OrderView order = orders.get(cancelledByDriver.order().id());
        assertThat(order.status()).isEqualTo("CANCELLED");
        assertThat(order.cancellation().by()).isEqualTo("DRIVER");
        assertThat(occupancy(cancelledByDriver.driver().actor())).isEqualTo("FREE");

        Ride givenBack = ride("Taras");
        trips.cancel(givenBack.driver().actor(), UUID.randomUUID(), givenBack.trip().id(), givenBack.trip().version(),
                "VEHICLE_PROBLEM");
        OrderView searching = orders.get(givenBack.order().id());
        assertThat(searching.status()).isEqualTo("SEARCHING");
        assertThat(searching.cancellation()).isNull();
        assertThat(jdbc.sql("""
                        select payload ->> 'reason_code' from order_event
                        where order_id = :id and type = 'AssignmentWithdrawn'""")
                .param("id", givenBack.order().id()).query(String.class).single()).isEqualTo("VEHICLE_PROBLEM");
        orders.cancel(givenBack.payer(), UUID.randomUUID(), givenBack.order().id(), version(givenBack.order().id()),
                "CHANGED_MIND");

        Ride tooEarly = ride("Andrii");
        rides.moveTo(tooEarly.driver(), TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(tooEarly.driver().actor(), UUID.randomUUID(), tooEarly.trip().id(),
                tooEarly.trip().version(), null);
        assertCode(() -> trips.cancel(tooEarly.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version(),
                CancelReasons.NO_SHOW), ErrorCode.STATE_CONFLICT);
        jdbc.sql("update trip set arrived_at = :at where id = :id").param("at", OffsetDateTime.now().minusMinutes(10))
                .param("id", waiting.id()).update();
        trips.cancel(tooEarly.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version(), CancelReasons.NO_SHOW);
        assertThat(orders.get(tooEarly.order().id()).cancellation())
                .extracting(OrderView.Cancellation::by, OrderView.Cancellation::reasonCode)
                .containsExactly("DRIVER", "NO_SHOW");
    }

    @Test
    void theAdminKeepsEachSidesList() {
        Actor admin = staff("Olena", "Admin", "ADMIN", CancelReasons.MANAGE_PERMISSION);
        String code = "R" + UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase();
        assertCode(() -> reasons.create(admin, UUID.randomUUID(), new CancelReasons.Draft(Audience.DRIVER, code,
                Map.of("ru", "Пробка"), null, true, 50), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> reasons.create(admin, UUID.randomUUID(), new CancelReasons.Draft(Audience.RIDER, code,
                Map.of("ru", "x"), DriverOutcome.CANCEL_ORDER, true, 50), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> reasons.create(admin, UUID.randomUUID(), new CancelReasons.Draft(Audience.DRIVER, code,
                Map.of("en", "Traffic jam"), DriverOutcome.RETURN_TO_SEARCH, true, 50), "x"),
                ErrorCode.VALIDATION_FAILED); // no label in the default language (ru)
        assertCode(() -> reasons.create(staff("No", "Rights", "ADMIN"), UUID.randomUUID(), new CancelReasons.Draft(
                Audience.DRIVER, code, Map.of("ru", "Пробка"), DriverOutcome.RETURN_TO_SEARCH, true, 50), "x"),
                ErrorCode.ACCESS_DENIED);

        CancelReasons.Reason created = reasons.create(admin, UUID.randomUUID(), new CancelReasons.Draft(
                Audience.DRIVER, code.toLowerCase(), Map.of("ru", "Пробка", "uk", "Затор"),
                DriverOutcome.RETURN_TO_SEARCH, true, 50), "Drivers asked for it");
        assertThat(created.code()).isEqualTo(code);
        assertThat(reasons.active(admin, Audience.DRIVER)).extracting(CancelReasons.Reason::code).contains(code);
        assertCode(() -> reasons.create(admin, UUID.randomUUID(), new CancelReasons.Draft(Audience.DRIVER, code,
                Map.of("ru", "Ещё раз", "uk", "Ще раз"), DriverOutcome.RETURN_TO_SEARCH, true, 50), "x"), ErrorCode.STATE_CONFLICT);

        assertCode(() -> reasons.update(admin, UUID.randomUUID(), created.id(), created.version() + 1,
                new CancelReasons.Draft(null, null, Map.of("ru", "Пробка"), DriverOutcome.RETURN_TO_SEARCH, false, 50),
                "x"), ErrorCode.VERSION_CONFLICT);
        assertCode(() -> reasons.update(admin, UUID.randomUUID(), created.id(), created.version(),
                new CancelReasons.Draft(Audience.STAFF, null, Map.of("ru", "Пробка"), null, false, 50), "x"),
                ErrorCode.VALIDATION_FAILED);
        CancelReasons.Reason hidden = reasons.update(admin, UUID.randomUUID(), created.id(), created.version(),
                new CancelReasons.Draft(null, null, Map.of("ru", "Пробка", "uk", "Затор"), DriverOutcome.CANCEL_ORDER, false, 60),
                "Not used any more");
        assertThat(hidden.active()).isFalse();
        assertThat(hidden.driverOutcome()).isEqualTo(DriverOutcome.CANCEL_ORDER);
        assertThat(reasons.active(admin, Audience.DRIVER)).extracting(CancelReasons.Reason::code).doesNotContain(code);
        assertThat(reasons.all(admin)).extracting(CancelReasons.Reason::code).contains(code);
        assertCode(() -> reasons.require(admin, Audience.DRIVER, code), ErrorCode.VALIDATION_FAILED);
        assertThat(jdbc.sql("select count(*) from audit_log where resource_id = :id")
                .param("id", created.id().toString()).query(Long.class).single()).isEqualTo(2);

        Ride ride = ride("Bohdan");
        assertCode(() -> trips.cancel(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                code), ErrorCode.VALIDATION_FAILED);
        orders.cancel(ride.payer(), UUID.randomUUID(), ride.order().id(), version(ride.order().id()), "CHANGED_MIND");
    }
}
