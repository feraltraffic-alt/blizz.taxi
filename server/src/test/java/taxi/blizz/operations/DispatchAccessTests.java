package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.driver.ReviewStatus;
import taxi.blizz.finance.FareAccounting;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #197 (AC-03, AC-05), from the acceptance review #196: a revoked session and the device that lost the shift
 * accept nothing, and the offer stays open; a document that expires during a trip lets the trip complete and keeps the
 * driver off new orders. Each refusal is followed by the same request done right, which succeeds. Its own city at
 * longitude 11.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DispatchAccessTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 11.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 11.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired DriverAdmission admission;
    @Autowired FareAccounting accounting;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;

    TestRides rides;
    UUID city;
    MockMvc mvc;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-dispatch-access", "UAH", 11);
        // Orders left by an earlier test of this class must not take the driver of the next one.
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", city).update();
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }

    @Test
    void aRevokedSessionAcceptsAndClaimsNothingAndTheOfferStaysOpen() throws Exception {
        TestRides.Driver online = rides.driverNear(PICKUP);
        IssuedSession phone = takeOverOnANewPhone(online);
        TestRides.Driver driver = new TestRides.Driver(online.actor(), phone.sessionId(), online.vehicle());
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        OfferView offer = dispatch.offers(driver.actor()).getFirst();
        assertThat(offer.orderId()).isEqualTo(order.id());

        String occupancy = sessions.availability(driver.actor().id()).occupancy();
        auth.logout(phone.refreshToken());

        assertThat(status("/api/driver/v1/offers/" + offer.id() + "/accept", phone.accessToken())).isEqualTo(401);
        assertThat(status("/api/driver/v1/orders/" + order.id() + "/claim", phone.accessToken())).isEqualTo(401);
        assertNothingTaken(offer, order, driver, occupancy);

        // The control: a session of the same driver that is not revoked takes the same offer over HTTP.
        IssuedSession again = takeOverOnANewPhone(online);
        assertThat(status("/api/driver/v1/offers/" + offer.id() + "/accept", again.accessToken())).isEqualTo(200);
        assertThat(assignments(order.id())).isOne();
    }

    @Test
    void theDeviceThatLostTheShiftAcceptsAndClaimsNothingAndTheOfferStaysOpen() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        UUID secondPhone = rides.newDevice(driver);
        sessions.handover(driver.actor(), UUID.randomUUID(), secondPhone,
                sessions.availability(driver.actor().id()).sessionVersion());
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        OfferView offer = dispatch.offers(driver.actor()).getFirst();
        String occupancy = sessions.availability(driver.actor().id()).occupancy();

        assertCode(() -> dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer.id()),
                ErrorCode.STATE_CONFLICT);
        assertCode(() -> dispatch.claim(driver.actor(), driver.device(), UUID.randomUUID(), order.id()),
                ErrorCode.STATE_CONFLICT);
        assertNothingTaken(offer, order, driver, occupancy);

        // The control: the phone that holds the shift takes the same offer.
        AssignmentView taken = dispatch.accept(driver.actor(), secondPhone, UUID.randomUUID(), offer.id());
        assertThat(taken.orderId()).isEqualTo(order.id());
        assertThat(assignments(order.id())).isOne();
    }

    @Test
    void aDocumentThatExpiresDuringATripLetsItCompleteAndKeepsTheDriverOffNewOrders() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        LocalDate today = LocalDate.now();
        insurance(driver, today.plusYears(1));
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        assertThat(ride.trip().phase()).isEqualTo("IN_PROGRESS");

        jdbc.sql("update driver_document set valid_to = :d where driver_id = :id and type = 'INSURANCE'")
                .param("d", today.minusDays(1)).param("id", driver.actor().id()).update();
        assertThat(admission.expireDocuments(today)).isGreaterThanOrEqualTo(1);
        assertThat(admission.profile(driver.actor().id()).reviewStatus()).isEqualTo(ReviewStatus.EXPIRED);

        TripView done = rides.complete(ride, true);
        assertThat(done.phase()).isEqualTo("COMPLETED");
        assertThat(orders.get(ride.order().id()).status()).isEqualTo("FULFILLED");
        while (relay.runOnce() > 0) {
            // the trip is posted as any other
        }
        assertThat(accounting.posted(List.of(ride.order().id()))).containsExactly(ride.order().id());

        DriverAvailability after = sessions.availability(driver.actor().id());
        assertThat(after.sessionState()).as("the shift stays").isEqualTo("OPEN");
        assertThat(after.eligible()).isFalse();
        assertThat(after.ineligibleReasons()).contains("ADMISSION_EXPIRED");
        OrderView next = rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(dispatch.offers(driver.actor())).as("no new offer").isEmpty();
        assertCode(() -> dispatch.claim(driver.actor(), driver.device(), UUID.randomUUID(), next.id()),
                ErrorCode.DRIVER_NOT_ELIGIBLE);
        assertThat(assignments(next.id())).isZero();
    }

    // ---------------------------------------------------------------- fixtures

    private IssuedSession takeOverOnANewPhone(TestRides.Driver driver) {
        IssuedSession phone = auth.open(new VerifiedSubject(driver.actor(), "ACTIVE", false), "access-phone");
        sessions.handover(driver.actor(), UUID.randomUUID(), phone.sessionId(),
                sessions.availability(driver.actor().id()).sessionVersion());
        return phone;
    }

    private void insurance(TestRides.Driver driver, LocalDate validTo) {
        jdbc.sql("""
                        insert into driver_document (id, driver_id, type, number, valid_from, valid_to, decision,
                                                     created_at)
                        values (:id, :driver, 'INSURANCE', 'N-1', :from, :to, 'ACCEPTED', :created)""")
                .param("id", UUID.randomUUID()).param("driver", driver.actor().id())
                .param("from", validTo.minusYears(2)).param("to", validTo)
                .param("created", OffsetDateTime.now().minusDays(30)).update();
    }

    /** The offer is still OPEN, nobody is assigned, the driver is as before (offered, not on a trip). */
    private void assertNothingTaken(OfferView offer, OrderView order, TestRides.Driver driver, String occupancy) {
        assertThat(jdbc.sql("select state from offer where id = :id").param("id", offer.id()).query(String.class)
                .single()).isEqualTo("OPEN");
        assertThat(assignments(order.id())).isZero();
        assertThat(occupancy).isNotEqualTo("ON_TRIP");
        assertThat(sessions.availability(driver.actor().id()).occupancy()).isEqualTo(occupancy);
        assertThat(orders.get(order.id()).status()).isEqualTo("SEARCHING");
    }

    private int assignments(UUID order) {
        return jdbc.sql("select count(*) from assignment where order_id = :o").param("o", order)
                .query(Integer.class).single();
    }

    private int status(String path, String token) throws Exception {
        return mvc.perform(post(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"command_id\":\"" + UUID.randomUUID() + "\"}"))
                .andReturn().getResponse().getStatus();
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
