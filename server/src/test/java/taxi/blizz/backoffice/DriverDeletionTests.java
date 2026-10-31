package taxi.blizz.backoffice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

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
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.driver.DriverDeletions;
import taxi.blizz.finance.Ledger;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
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

/**
 * E3 of issue #144 (REQ-PRV-04): a driver asks to delete the account with a code, is limited while the request is
 * pending, and staff complete it only when no trip, offer, reservation, debt or open cash dispute is left — each with
 * its own code. After it the driver's personal data is gone and the earnings and the ledger stay. Its own city at
 * longitude 118.
 */
@SpringBootTest
@Import({TestcontainersConfiguration.class, ClientDeletionTests.Capture.class})
class DriverDeletionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 118.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 118.55);

    @Autowired DriverDeletionReview review;
    @Autowired DriverDeletions deletions;
    @Autowired JdbcClient jdbc;
    @Autowired SessionService auth;
    @Autowired OtpService otp;
    @Autowired ClientDeletionTests.CapturingDelivery delivery;
    @Autowired OutboxRelay relay;
    @Autowired Ledger ledger;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired QuoteService quotes;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    TestRides rides;
    UUID city;
    Actor staff;
    MockMvc mvc;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-driver-deletion", "UAH", 118);
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
        staff = staff(DriverDeletionReview.DELETE_PERMISSION);
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        deliverEvents();
    }

    // ------------------------------------------------------------ fixtures

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Privacy', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "driver-deletion-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    /** Puts the driver's request in place directly, from {@code previous}. */
    private void pending(Actor driver, String previous) {
        jdbc.sql("""
                        update driver set account_state = 'DELETION_PENDING', deletion_previous_state = :previous,
                                          deletion_requested_at = now()
                        where id = :id""")
                .param("previous", previous).param("id", driver.id()).update();
    }

    /** Ends the driver's shift, as when the driver goes offline. */
    private void offline(Actor driver) {
        jdbc.sql("""
                        update work_session set state = 'CLOSED', closed_at = now()
                        where driver_id = :d and state <> 'CLOSED'""")
                .param("d", driver.id()).update();
    }

    /** Brings the driver's balance to zero, as if the commission of the cash rides had been paid. */
    private void settle(Actor driver) {
        for (Ledger.Balance b : ledger.balances(Ledger.Account.DRIVER_PAYABLE, driver.id())) {
            long owed = b.debitMinor() - b.creditMinor();
            if (owed > 0) {
                UUID basis = UUID.randomUUID();
                ledger.post(new Ledger.Posting("test-settle:" + basis, "TEST", basis, b.currency(), "Paid in",
                        List.of(Ledger.Line.credit(Ledger.Account.DRIVER_PAYABLE, driver.id(), owed),
                                Ledger.Line.debit(Ledger.Account.SUSPENSE, null, owed))));
            }
        }
    }

    private Map<String, Object> driverRow(Actor driver) {
        return jdbc.sql("""
                        select account_state, phone_normalized, phone_verified_at, name, language,
                               deletion_previous_state, deletion_requested_at
                        from driver where id = :id""")
                .param("id", driver.id()).query().singleRow();
    }

    private DriverDeletionReview.Request request(Actor driver) {
        return review.pending(staff, null, 100).stream().filter(r -> r.driverId().equals(driver.id())).findFirst()
                .orElseThrow();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private long count(String sql, UUID id) {
        return jdbc.sql(sql).param("id", id).query(Long.class).single();
    }

    @SuppressWarnings("unchecked")
    private void assertRefused(MockHttpServletRequestBuilder request, String token) throws Exception {
        MvcResult result = mvc.perform(request.header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(MediaType.APPLICATION_JSON)).andReturn();
        String body = result.getResponse().getContentAsString();
        assertThat(result.getResponse().getStatus()).as(body).isEqualTo(403);
        assertThat((Map<String, Object>) json.readValue(body, Map.class)).containsEntry("code", "ACCOUNT_NOT_ACTIVE");
    }

    private int status(MockHttpServletRequestBuilder request, String token) throws Exception {
        return mvc.perform(request.header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(MediaType.APPLICATION_JSON)).andReturn().getResponse().getStatus();
    }

    // ------------------------------------------------------------ the driver's side

    @Test
    void theDriverAsksWithADeletionCodeKeepsThisSessionAndMayCancel() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        offline(driver.actor());
        IssuedSession current = auth.open(new VerifiedSubject(driver.actor(), "ACTIVE", false), "this-phone");
        IssuedSession other = auth.open(new VerifiedSubject(driver.actor(), "ACTIVE", false), "other-phone");

        UUID challenge = deletions.requestCode(driver.actor(), null, null).challengeId();
        String code = delivery.sent.getLast().code();
        String wrong = code.equals("000000") ? "111111" : "000000";
        assertCode(() -> deletions.request(driver.actor(), current.sessionId(), UUID.randomUUID(), challenge, wrong),
                ErrorCode.OTP_INVALID);
        assertThat(driverRow(driver.actor())).containsEntry("account_state", "ACTIVE");

        UUID command = UUID.randomUUID();
        DriverDeletions.Status status = deletions.request(driver.actor(), current.sessionId(), command, challenge,
                code);
        assertThat(status.accountState()).isEqualTo("DELETION_PENDING");
        assertThat(driverRow(driver.actor())).containsEntry("account_state", "DELETION_PENDING")
                .containsEntry("deletion_previous_state", "ACTIVE");
        assertThat(auth.verifyAccess(current.accessToken(), ApiAudience.DRIVER)).as("this session stays").isPresent();
        assertThat(auth.verifyAccess(other.accessToken(), ApiAudience.DRIVER)).as("the others end").isEmpty();
        assertThat(deletions.request(driver.actor(), current.sessionId(), command, challenge, code).accountState())
                .as("a repeat returns the first result").isEqualTo("DELETION_PENDING");
        assertCode(() -> deletions.request(driver.actor(), current.sessionId(), UUID.randomUUID(), challenge, code),
                ErrorCode.OTP_INVALID);
        assertThat(auth.refresh(current.refreshToken()).sessionId()).as("the pending driver keeps signing in")
                .isEqualTo(current.sessionId());

        UUID cancel = UUID.randomUUID();
        assertThat(deletions.cancel(driver.actor(), cancel).accountState()).isEqualTo("ACTIVE");
        assertThat(deletions.cancel(driver.actor(), cancel).accountState()).as("a repeat").isEqualTo("ACTIVE");
        assertCode(() -> deletions.cancel(driver.actor(), UUID.randomUUID()), ErrorCode.STATE_CONFLICT);
        assertThat(driverRow(driver.actor())).containsEntry("account_state", "ACTIVE")
                .containsEntry("deletion_previous_state", null).containsEntry("deletion_requested_at", null);

        // A blocked driver may ask too, and goes back to BLOCKED.
        TestRides.Driver blocked = rides.driverNear(PICKUP);
        offline(blocked.actor());
        jdbc.sql("update driver set account_state = 'BLOCKED' where id = :id").param("id", blocked.actor().id())
                .update();
        UUID again = deletions.requestCode(blocked.actor(), null, null).challengeId();
        assertThat(deletions.request(blocked.actor(), blocked.device(), UUID.randomUUID(), again,
                delivery.sent.getLast().code()).accountState()).isEqualTo("DELETION_PENDING");
        assertThat(deletions.cancel(blocked.actor(), UUID.randomUUID()).accountState()).isEqualTo("BLOCKED");
    }

    @Test
    void aPendingDriverIsOfferedNothingAndKeepsOnlyTheLimitedSession() throws Exception {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        IssuedSession phone = auth.open(new VerifiedSubject(driver.actor(), "ACTIVE", false), "pending-phone");
        pending(driver.actor(), "ACTIVE");
        String token = phone.accessToken();

        assertThat(status(get("/api/driver/v1/profile"), token)).as("reads stay").isEqualTo(200);
        assertRefused(get("/api/driver/v1/offers"), token);
        assertRefused(post("/api/driver/v1/offers/" + UUID.randomUUID() + "/accept")
                .content("{\"command_id\":\"" + UUID.randomUUID() + "\"}"), token);
        assertRefused(post("/api/driver/v1/work-sessions").content("{\"command_id\":\"" + UUID.randomUUID()
                + "\",\"vehicle_id\":\"" + driver.vehicle() + "\",\"location\":{\"lat\":-39.5,\"lon\":118.5,"
                + "\"accuracy_m\":5,\"recorded_at\":\"" + OffsetDateTime.now() + "\",\"sequence\":99999}}"), token);
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(dispatch.offers(driver.actor())).as("no order is offered to a pending driver").isEmpty();
        orders.cancel(order.payerClientId() == null ? staff : new Actor(SubjectType.CLIENT, order.payerClientId()),
                UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        assertThat(status(post("/api/driver/v1/me/deletion-request/cancel")
                .content("{\"command_id\":\"" + UUID.randomUUID() + "\"}"), token)).as("the request can be withdrawn")
                .isEqualTo(200);
    }

    // ------------------------------------------------------------ E3: staff and the blockers

    @Test
    void eachBlockerHasItsOwnCodeAndCompletionWaitsForAll() {
        // A trip.
        TestRides.Driver driving = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driving, PICKUP, DROPOFF);
        pending(driving.actor(), "ACTIVE");
        assertThat(request(driving.actor()).blockers().activeWork()).containsExactly(DriverDeletionReview.Work.TRIP);
        assertCode(() -> review.complete(staff, UUID.randomUUID(), driving.actor().id(), "Done"),
                ErrorCode.DRIVER_HAS_ACTIVE_WORK);
        rides.complete(ride, true);
        deliverEvents();
        offline(driving.actor());
        // The cash ride's commission is a debt.
        assertThat(request(driving.actor()).blockers().activeWork()).isEmpty();
        assertThat(request(driving.actor()).blockers().debt()).isNotEmpty();
        assertCode(() -> review.complete(staff, UUID.randomUUID(), driving.actor().id(), "Done"),
                ErrorCode.DRIVER_HAS_DEBT);
        settle(driving.actor());
        // An open cash dispute of one of the driver's trips.
        UUID disputed = UUID.randomUUID();
        jdbc.sql("""
                        insert into cash_dispute (order_id, driver_id, currency, held_minor, rider_debt_minor,
                                                  opened_at, decide_by)
                        values (:order, :driver, 'UAH', 0, 1500, now(), now() + interval '3 days')""")
                .param("order", disputed).param("driver", driving.actor().id()).update();
        assertThat(request(driving.actor()).blockers().openCashDisputes()).isEqualTo(1);
        assertCode(() -> review.complete(staff, UUID.randomUUID(), driving.actor().id(), "Done"),
                ErrorCode.DRIVER_HAS_DISPUTE);
        jdbc.sql("""
                        update cash_dispute set decision = 'RIDER_PAID', decided_by = :staff, decided_at = now(),
                                                reason = 'Paid in cash'
                        where order_id = :order""")
                .param("staff", staff.id()).param("order", disputed).update();
        assertThat(request(driving.actor()).blockers().blocked()).isFalse();
        assertThat(review.complete(staff, UUID.randomUUID(), driving.actor().id(), "Done").accountState())
                .isEqualTo("ANONYMIZED");

        // An open offer.
        TestRides.Driver offered = rides.driverNear(PICKUP);
        Actor payer = rides.client();
        OrderView order = rides.order(payer, city, PICKUP, DROPOFF);
        assertThat(dispatch.offers(offered.actor())).isNotEmpty();
        pending(offered.actor(), "ACTIVE");
        assertThat(request(offered.actor()).blockers().activeWork()).contains(DriverDeletionReview.Work.OFFER);
        assertCode(() -> review.complete(staff, UUID.randomUUID(), offered.actor().id(), "Done"),
                ErrorCode.DRIVER_HAS_ACTIVE_WORK);
        orders.cancel(payer, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        offline(offered.actor());

        // A pre-order reservation.
        jdbc.sql("""
                        update ride_order set preorder = true, pickup_at = now() + interval '3 hours',
                                              release_at = now() + interval '150 minutes'
                        where id = :id""")
                .param("id", order.id()).update();
        jdbc.sql("""
                        insert into preorder_reservation (id, order_id, driver_id, state, reserved_at)
                        values (:id, :order, :driver, 'RESERVED', now())""")
                .param("id", UUID.randomUUID()).param("order", order.id()).param("driver", offered.actor().id())
                .update();
        assertThat(request(offered.actor()).blockers().activeWork())
                .containsExactly(DriverDeletionReview.Work.RESERVATION);
        assertCode(() -> review.complete(staff, UUID.randomUUID(), offered.actor().id(), "Done"),
                ErrorCode.DRIVER_HAS_ACTIVE_WORK);
        assertThat(driverRow(offered.actor())).containsEntry("account_state", "DELETION_PENDING");
    }

    @Test
    void completionAnonymizesTheDriverAndKeepsTheEarnings() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        UUID trip = rides.complete(rides.started(city, driver, PICKUP, DROPOFF), true).id();
        deliverEvents();
        settle(driver.actor());
        String phone = (String) driverRow(driver.actor()).get("phone_normalized");
        jdbc.sql("update driver set name = 'Petro Driver', language = 'uk' where id = :id")
                .param("id", driver.actor().id()).update();
        IssuedSession session = auth.open(new VerifiedSubject(driver.actor(), "ACTIVE", false), "deletion-test");
        jdbc.sql("""
                        insert into push_device (id, subject_type, subject_id, device_session_id, platform, token,
                                                 state, created_at, updated_at)
                        values (:id, 'DRIVER', :driver, :session, 'ANDROID', :token, 'ACTIVE', now(), now())""")
                .param("id", UUID.randomUUID()).param("driver", driver.actor().id())
                .param("session", session.sessionId()).param("token", "fcm-" + UUID.randomUUID()).update();
        UUID document = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver_document (id, driver_id, type, number, valid_from, valid_to, decision,
                                                     created_at)
                        values (:id, :driver, 'DRIVER_LICENSE', 'BXA123456', current_date - 400,
                                current_date + 400, 'ACCEPTED', now())""")
                .param("id", document).param("driver", driver.actor().id()).update();
        List<Map<String, Object>> journalBefore = journal(driver.actor());
        assertThat(journalBefore).as("the ride's money moved").isNotEmpty();
        pending(driver.actor(), "ACTIVE");

        UUID command = UUID.randomUUID();
        assertThat(review.complete(staff, command, driver.actor().id(), "Confirmed by the driver").accountState())
                .isEqualTo("ANONYMIZED");
        assertThat(review.complete(staff, command, driver.actor().id(), "Confirmed by the driver").accountState())
                .as("a repeat returns the first result").isEqualTo("ANONYMIZED");
        assertCode(() -> review.reject(staff, UUID.randomUUID(), driver.actor().id(), "Too late"),
                ErrorCode.STATE_CONFLICT);
        deliverEvents();

        assertThat(driverRow(driver.actor())).containsEntry("account_state", "ANONYMIZED")
                .containsEntry("phone_normalized", null).containsEntry("phone_verified_at", null)
                .containsEntry("name", null).containsEntry("language", null);
        assertThat(auth.verifyAccess(session.accessToken(), ApiAudience.DRIVER)).as("the old token").isEmpty();
        assertThat(count("select count(*) from push_device where subject_id = :id", driver.actor().id())).isZero();
        assertThat(count("select count(*) from work_session where driver_id = :id and state <> 'CLOSED'",
                driver.actor().id())).as("the shift ended").isZero();
        assertThat(jdbc.sql("select number, type, decision, valid_to is not null as dated from driver_document "
                        + "where id = :id").param("id", document).query().singleRow())
                .as("the document keeps its type, validity and decision")
                .containsEntry("number", null).containsEntry("type", "DRIVER_LICENSE")
                .containsEntry("decision", "ACCEPTED").containsEntry("dated", true);
        // Earnings and the ledger keep the driver id, nothing of theirs is rewritten; the trip and the car stay.
        assertThat(journal(driver.actor())).isEqualTo(journalBefore);
        assertThat(jdbc.sql("""
                        select a.driver_id from trip t join assignment a on a.id = t.assignment_id where t.id = :id""")
                .param("id", trip).query(UUID.class).single()).isEqualTo(driver.actor().id());
        assertThat(jdbc.sql("select registration_number from vehicle where id = :id").param("id", driver.vehicle())
                .query(String.class).single()).isEqualTo("AA4000AA");
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'driver_deletion.complete'
                          and resource_id = :id""")
                .param("id", driver.actor().id().toString()).query(Long.class).single()).isEqualTo(1);
        assertThat(count("""
                        select count(*) from outbox where event_type = 'DriverAnonymized' and aggregate_id = :id""",
                driver.actor().id())).isEqualTo(1);

        // The phone is free: signing in with it makes a new driver.
        UUID challenge = otp.requestChallenge(OtpAudience.DRIVER, phone, null, null).challengeId();
        VerifiedSubject again = otp.verify(challenge, delivery.sent.getLast().code());
        assertThat(again.actor().id()).isNotEqualTo(driver.actor().id());
    }

    @Test
    void onlyStaffWithThePermissionDecideAndARejectionRestoresTheState() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        offline(driver.actor());
        pending(driver.actor(), "BLOCKED");
        Actor other = staff("drivers.review");
        assertCode(() -> review.pending(other, null, 10), ErrorCode.ACCESS_DENIED);
        assertCode(() -> review.complete(other, UUID.randomUUID(), driver.actor().id(), "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> review.reject(other, UUID.randomUUID(), driver.actor().id(), "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> review.complete(staff, UUID.randomUUID(), driver.actor().id(), " "),
                ErrorCode.VALIDATION_FAILED);
        TestRides.Driver never = rides.driverNear(PICKUP);
        assertCode(() -> review.complete(staff, UUID.randomUUID(), never.actor().id(), "Never asked"),
                ErrorCode.STATE_CONFLICT);
        assertThat(request(driver.actor()).previousState()).isEqualTo("BLOCKED");

        assertThat(review.reject(staff, UUID.randomUUID(), driver.actor().id(), "Asked by phone to stay")
                .accountState()).isEqualTo("BLOCKED");
        assertThat(driverRow(driver.actor())).containsEntry("account_state", "BLOCKED")
                .containsEntry("deletion_requested_at", null);
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'driver_deletion.reject' and resource_id = :id""")
                .param("id", driver.actor().id().toString()).query(Long.class).single()).isEqualTo(1);
    }

    private List<Map<String, Object>> journal(Actor driver) {
        return jdbc.sql("""
                        select l.transaction_id, l.account, l.debit_minor, l.credit_minor from journal_line l
                        where l.party_id = :id order by l.transaction_id, l.account, l.debit_minor""")
                .param("id", driver.id()).query().listOfRows();
    }
}
