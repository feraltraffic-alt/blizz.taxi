package taxi.blizz.identity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderChat;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Ratings;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.telephony.FakeOtpCodes;
import tools.jackson.databind.json.JsonMapper;

/**
 * E5 of issue #144 (REQ-PRV-07): a driver's copy of their data holds their profile, documents' metadata, vehicles,
 * shifts, trips, balance entries and sessions — and nothing of the riders they drove (name, phone, points, labels,
 * note, messages, rating comments), of other drivers or of staff. Its own city at longitude 116.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverDataExportTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.512345, 116.523456);
    static final GeoPoint DROPOFF = new GeoPoint(-39.456789, 116.587654);
    static final List<String> SECTIONS = List.of("balance", "documents", "profile", "sessions", "shifts", "trips",
            "vehicles");

    @Autowired PersonalDataExports exports;
    @Autowired FakeOtpCodes codes;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired OrderChat chat;
    @Autowired Ratings ratings;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;
    @Autowired JsonMapper json;
    @Autowired taxi.blizz.driver.DriverDeletions drivers;
    @Autowired org.springframework.transaction.support.TransactionTemplate tx;

    TestRides rides;
    UUID city;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-driver-export", "UAH", 116);
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private String phone(Actor driver) {
        return jdbc.sql("select phone_normalized from driver where id = :id").param("id", driver.id())
                .query(String.class).single();
    }

    private String code(Actor driver) {
        return codes.last(phone(driver)).orElseThrow().code();
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    @SuppressWarnings("unchecked")
    void theDriverGetsTheirOwnDataAndNothingOfTheRiders() {
        String riderWords = "Riderword" + UUID.randomUUID().toString().substring(0, 8);
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor me = driver.actor();
        jdbc.sql("update driver set name = 'Petro Export', language = 'uk' where id = :id").param("id", me.id())
                .update();
        jdbc.sql("""
                        insert into driver_document (id, driver_id, vehicle_id, type, number, valid_from, valid_to,
                                                     decision, created_at)
                        values (:id, :driver, null, 'DRIVER_LICENSE', 'BXA777111', current_date - 30,
                                current_date + 700, 'ACCEPTED', now())""")
                .param("id", UUID.randomUUID()).param("driver", me.id()).update();

        // A ride with a rider who has a name, a note, an entrance, a chat message and a rating comment.
        Actor rider = rides.client();
        String riderPhone = jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
        jdbc.sql("update client set name = :n where id = :id").param("n", "Olena " + riderWords)
                .param("id", rider.id()).update();
        rides.moveTo(driver, TestRides.north(PICKUP, 1000));
        OrderView order = rides.order(rider, city, PICKUP, DROPOFF);
        jdbc.sql("""
                        update ride_order set pickup_label = :p, dropoff_label = :d, comment = :c, entrance = :e
                        where id = :id""")
                .param("p", "Home " + riderWords).param("d", "Work " + riderWords)
                .param("c", "Note " + riderWords).param("e", "Gate " + riderWords).param("id", order.id()).update();
        dispatch.accept(me, driver.device(), UUID.randomUUID(), dispatch.offers(me).getFirst().id());
        chat.post(rider, UUID.randomUUID(), order.id(), "I am at " + riderWords + ", " + riderPhone);
        TripView trip = trips.current(me).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        trip = trips.arrive(me, UUID.randomUUID(), trip.id(), trip.version(), null);
        trip = trips.start(me, UUID.randomUUID(), trip.id(), trip.version(), null);
        trips.complete(me, UUID.randomUUID(), trip.id(), trip.version(), OffsetDateTime.now(), true);
        String tripId = trip.id().toString();
        ratings.submit(rider, UUID.randomUUID(), order.id(), 5, "Great, " + riderWords);
        deliverEvents();
        TestRides.Driver other = rides.driverNear(PICKUP);

        UUID challenge = exports.requestCode(me, null, null).challengeId();
        UUID command = UUID.randomUUID();
        PersonalDataExports.Export asked = exports.request(me, command, challenge, code(me));
        assertThat(asked.state()).isEqualTo("PENDING");
        assertThat(exports.request(me, command, challenge, code(me)).id()).as("a repeat").isEqualTo(asked.id());
        exports.buildPending(10);
        assertThat(exports.get(me, asked.id()).state()).isEqualTo("READY");
        assertThat(exports.mine(me)).extracting(PersonalDataExports.Export::id).containsExactly(asked.id());
        assertCode(() -> exports.get(other.actor(), asked.id()), ErrorCode.NOT_FOUND);
        assertCode(() -> exports.download(rider, asked.id()), ErrorCode.NOT_FOUND);

        String text = new String(exports.download(me, asked.id()).content(), StandardCharsets.UTF_8);
        Map<String, Object> copy = json.readValue(text, Map.class);
        assertThat(copy).containsEntry("format", 1).containsEntry("driver_id", me.id().toString())
                .doesNotContainKey("client_id");
        Map<String, Object> sections = (Map<String, Object>) copy.get("sections");
        assertThat(sections).containsOnlyKeys(SECTIONS);
        assertThat((Map<String, Object>) sections.get("profile")).containsEntry("phone", phone(me))
                .containsEntry("name", "Petro Export");
        assertThat((List<Map<String, Object>>) sections.get("documents")).singleElement()
                .satisfies(d -> assertThat(d).containsEntry("type", "DRIVER_LICENSE").containsEntry("number",
                        "BXA777111").doesNotContainKeys("file_id", "storage_key"));
        assertThat((List<Map<String, Object>>) sections.get("vehicles")).singleElement()
                .satisfies(v -> assertThat(v).containsEntry("registration_number", "AA4000AA"));
        assertThat((List<Map<String, Object>>) sections.get("trips")).singleElement()
                .satisfies(t -> assertThat(t).containsEntry("trip_id", tripId));
        assertThat((List<Map<String, Object>>) sections.get("shifts")).isNotEmpty();
        assertThat((List<Map<String, Object>>) sections.get("balance")).isNotEmpty();
        assertThat((List<Map<String, Object>>) sections.get("sessions")).isNotEmpty();
        // Nothing of the rider, of the other driver, no secrets.
        assertThat(text).doesNotContain(riderWords).doesNotContain(riderPhone)
                .doesNotContain(riderPhone.substring(riderPhone.length() - 9)).doesNotContain(rider.id().toString())
                .doesNotContain(other.actor().id().toString()).doesNotContain("\"token\"")
                .doesNotContain("39.512345").doesNotContain("116.523456");

        assertThat(jdbc.sql("""
                        select count(*) from audit_log where resource_id = :id
                          and action in ('personal_data_export.request', 'personal_data_export.download')""")
                .param("id", asked.id().toString()).query(Long.class).single()).isEqualTo(2);

        // The copy goes with the driver's deletion.
        jdbc.sql("""
                        update driver set account_state = 'DELETION_PENDING', deletion_previous_state = 'ACTIVE',
                                          deletion_requested_at = now() where id = :id""")
                .param("id", me.id()).update();
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where driver_id = :id")
                .param("id", me.id()).update();
        tx.executeWithoutResult(s -> drivers.anonymize(me.id()));
        deliverEvents();
        assertThat(jdbc.sql("select count(*) from personal_data_export where driver_id = :id").param("id", me.id())
                .query(Long.class).single()).isZero();
    }

    @Test
    void onceADayAndOpenToABlockedDriver() {
        Actor recent = blockedDriverWithAnExport("1 hour");
        UUID challenge = exports.requestCode(recent, null, null).challengeId();
        assertCode(() -> exports.request(recent, UUID.randomUUID(), challenge, code(recent)),
                ErrorCode.STATE_CONFLICT);

        Actor yesterday = blockedDriverWithAnExport("25 hours");
        assertThat(exports.request(yesterday, UUID.randomUUID(), exports.requestCode(yesterday, null, null)
                .challengeId(), code(yesterday)).state()).as("a blocked driver may ask, once a day")
                .isEqualTo("PENDING");
    }

    /** A blocked driver whose last copy was asked for {@code ago}. */
    private Actor blockedDriverWithAnExport(String ago) {
        Actor driver = rides.driverNear(PICKUP).actor();
        jdbc.sql("update driver set account_state = 'BLOCKED' where id = :id").param("id", driver.id()).update();
        jdbc.sql("""
                        insert into personal_data_export (id, driver_id, state, created_at)
                        values (:id, :driver, 'EXPIRED', now() - cast(:ago as interval))""")
                .param("id", UUID.randomUUID()).param("driver", driver.id()).param("ago", ago).update();
        return driver;
    }
}
