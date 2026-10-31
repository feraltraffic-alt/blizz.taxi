package taxi.blizz.operations;

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
import taxi.blizz.TestRides.Driver;
import taxi.blizz.TestRides.Ride;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** Rider–driver chat of an order (owner decision 26.10.2026, docs/design/README.md). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OrderChatTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 160.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 160.55);

    @Autowired
    OrderChat chat;
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
        cityId = rides.city("test-order-chat", "UAH", 160);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private OrderChat.Message say(Actor who, Ride ride, String text) {
        return chat.post(who, UUID.randomUUID(), ride.order().id(), text);
    }

    @Test
    void riderAndDriverTalkWhileTheDriverIsOnTheWay() {
        Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID command = UUID.randomUUID();
        OrderChat.Message first = chat.post(ride.payer(), command, ride.order().id(), "I am at entrance 2");
        assertThat(chat.post(ride.payer(), command, ride.order().id(), "I am at entrance 2")).isEqualTo(first);
        say(ride.driver().actor(), ride, "Coming in 3 minutes");

        List<OrderChat.Message> riderView = chat.messages(ride.payer(), ride.order().id(), 0, 50);
        assertThat(riderView).extracting(OrderChat.Message::senderRole).containsExactly("RIDER", "DRIVER");
        assertThat(riderView).extracting(OrderChat.Message::sequence).containsExactly(1L, 2L);
        assertThat(chat.messages(ride.driver().actor(), ride.order().id(), 1, 50))
                .extracting(OrderChat.Message::body).containsExactly("Coming in 3 minutes");
        assertThat(jdbc.sql("""
                        select count(*) from outbox where event_type = 'OrderMessagePosted' and aggregate_id = :id
                          and payload::text not like '%entrance%'""")
                .param("id", ride.order().id()).query(Long.class).single()).as("no text in events").isEqualTo(2);
    }

    @Test
    void strangersAndBadMessagesAreRefused() {
        Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        assertCode(() -> say(rides.client(), ride, "hi"), ErrorCode.NOT_FOUND);
        assertCode(() -> chat.messages(rides.client(), ride.order().id(), 0, 50), ErrorCode.NOT_FOUND);
        assertCode(() -> say(new Actor(SubjectType.DRIVER, UUID.randomUUID()), ride, "hi"), ErrorCode.NOT_FOUND);
        assertCode(() -> say(ride.payer(), ride, "   "), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> say(ride.payer(), ride, "x".repeat(1001)), ErrorCode.VALIDATION_FAILED);
        assertThatThrownBy(() -> jdbc.sql("update order_message set body = 'changed'").update())
                .rootCause().hasMessageContaining("append-only");
    }

    @Test
    void aNewDriverNeverSeesTheConversationWithThePreviousOne() {
        Driver first = rides.driverNear(PICKUP);
        Ride ride = rides.assigned(cityId, first, PICKUP, DROPOFF);
        say(ride.payer(), ride, "Please call me, the gate code is 1234");
        say(first.actor(), ride, "OK");
        Driver second = rides.driverNear(PICKUP);

        trips.withdraw(first.actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                "VEHICLE_PROBLEM", "Flat tyre");
        // Audit 29.10.2026: until a new driver comes, what the rider writes goes to nobody, not to the one who left.
        assertCode(() -> say(ride.payer(), ride, "Entrance 2, code 4321"), ErrorCode.STATE_CONFLICT);
        OfferView offer = dispatch.offers(second.actor()).getFirst();
        dispatch.accept(second.actor(), second.device(), UUID.randomUUID(), offer.id());

        assertThat(chat.messages(second.actor(), ride.order().id(), 0, 50)).isEmpty();
        assertCode(() -> say(first.actor(), ride, "still here"), ErrorCode.NOT_FOUND);
        say(second.actor(), ride, "I am your new driver");
        assertThat(chat.messages(second.actor(), ride.order().id(), 0, 50))
                .extracting(OrderChat.Message::body).containsExactly("I am your new driver");
        assertThat(chat.messages(first.actor(), ride.order().id(), 0, 50)).hasSize(2);
        assertThat(chat.messages(ride.payer(), ride.order().id(), 0, 50)).hasSize(3);
    }

    @Test
    void theChatStaysOpenForADayAfterTheOrderAndReadableForGood() {
        Ride done = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        say(done.payer(), done, "Stop at the shop please");
        rides.complete(done, true);
        assertThat(orders.get(done.order().id()).status()).isEqualTo("FULFILLED");
        say(done.payer(), done, "I left my umbrella in the car");
        say(done.driver().actor(), done, "Found it, I will bring it");
        assertThat(chat.messages(done.payer(), done.order().id(), 0, 50)).hasSize(3);

        rides.city("test-order-chat", "UAH", 160); // the first driver goes offline
        Ride cancelled = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        orders.cancel(cancelled.payer(), UUID.randomUUID(), cancelled.order().id(),
                orders.get(cancelled.order().id()).version(), "CHANGED_MIND");
        assertThat(say(cancelled.payer(), cancelled, "Sorry, plans changed").senderRole()).isEqualTo("RIDER");
        assertThat(chat.messages(cancelled.driver().actor(), cancelled.order().id(), 0, 50)).hasSize(1);

        // Owner decision 29.10.2026 (REQ-SEC-04): 24 hours after the trip the chat is read-only for both sides.
        jdbc.sql("update assignment set closed_at = now() - interval '24 hours 1 minute' where order_id = :o")
                .param("o", done.order().id()).update();
        assertCode(() -> say(done.driver().actor(), done, "Hi again"), ErrorCode.STATE_CONFLICT);
        assertCode(() -> say(done.payer(), done, "Hi again"), ErrorCode.STATE_CONFLICT);
        assertThat(chat.messages(done.payer(), done.order().id(), 0, 50)).as("still readable").hasSize(3);
        assertThat(chat.messages(done.driver().actor(), done.order().id(), 0, 50)).hasSize(3);
        jdbc.sql("update assignment set closed_at = now() - interval '23 hours' where order_id = :o")
                .param("o", done.order().id()).update();
        say(done.payer(), done, "Within the day: still open");
    }

    @Test
    void noChatBeforeAnyDriverAndNotWithADriverWhoWithdrew() {
        Actor payer = rides.client();
        OrderView waiting = rides.order(payer, cityId, PICKUP, DROPOFF);
        assertCode(() -> chat.post(payer, UUID.randomUUID(), waiting.id(), "Anyone?"), ErrorCode.STATE_CONFLICT);
        orders.cancel(payer, UUID.randomUUID(), waiting.id(), orders.get(waiting.id()).version(), "CHANGED_MIND");

        Driver leaving = rides.driverNear(PICKUP);
        Ride ride = rides.assigned(cityId, leaving, PICKUP, DROPOFF);
        trips.withdraw(leaving.actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                "VEHICLE_PROBLEM", "Flat tyre");
        orders.cancel(ride.payer(), UUID.randomUUID(), ride.order().id(), orders.get(ride.order().id()).version(),
                "CHANGED_MIND");
        assertCode(() -> say(leaving.actor(), ride, "sorry"), ErrorCode.NOT_FOUND);
    }

    @Test
    void staffReadTheConversationOnlyWithThePermissionAndEveryReadIsAudited() {
        Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        say(ride.payer(), ride, "Where are you?");
        UUID withId = UUID.randomUUID();
        UUID withoutId = UUID.randomUUID();
        for (UUID id : List.of(withId, withoutId)) {
            jdbc.sql("""
                            insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                    updated_at)
                            values (:id, :login, 'Support', 'OPERATOR', :permissions, :scope, 'ACTIVE', now(), now())""")
                    .param("id", id).param("login", "support-" + id)
                    .param("permissions", id.equals(withId) ? new String[] {OrderChat.VIEW_PERMISSION} : new String[0])
                    .param("scope", new UUID[] {cityId}).update();
        }

        assertCode(() -> chat.conversation(new Actor(SubjectType.STAFF, withoutId), ride.order().id(), "complaint"),
                ErrorCode.ACCESS_DENIED);
        assertThat(chat.conversation(new Actor(SubjectType.STAFF, withId), ride.order().id(), "Complaint #12"))
                .extracting(OrderChat.Message::body).containsExactly("Where are you?");
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'order.chat.read' and resource_id = :id""")
                .param("id", ride.order().id().toString()).query(Long.class).single()).isEqualTo(1);
    }

    @Test
    @SuppressWarnings("unchecked")
    void overHttpTheDriverWritesByTripAndTheRiderReadsByOrder() throws Exception {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        IssuedSession driverToken = auth.open(new VerifiedSubject(ride.driver().actor(), "ACTIVE", false), "tablet");
        IssuedSession riderToken = auth.open(new VerifiedSubject(ride.payer(), "ACTIVE", false), "phone");

        MvcResult posted = mvc.perform(post("/api/driver/v1/trips/" + ride.trip().id() + "/messages")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + driverToken.accessToken())
                .contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(Map.of("command_id", UUID.randomUUID(), "body", "Outside")))).andReturn();
        assertThat(posted.getResponse().getStatus()).isEqualTo(201);

        MvcResult read = mvc.perform(get("/api/rider/v1/orders/" + ride.order().id() + "/messages")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + riderToken.accessToken())).andReturn();
        assertThat(read.getResponse().getStatus()).isEqualTo(200);
        Map<String, Object> body = json.readValue(read.getResponse().getContentAsString(), Map.class);
        assertThat((List<Map<String, Object>>) body.get("messages")).singleElement()
                .satisfies(m -> assertThat(m).containsEntry("sender_role", "DRIVER").containsEntry("body", "Outside"));
    }
}
