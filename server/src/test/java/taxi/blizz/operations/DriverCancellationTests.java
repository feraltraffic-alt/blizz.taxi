package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
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
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
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

/**
 * Issue #487, ADR 0018 part B: a driver cancelling an order after accepting it — counted after the grace window and
 * for a reason that counts, a warning at 3 in 24 hours, a pause at 5 that keeps new offers and claims away and grows
 * when repeated, risk flags, and a pause lifted by staff with the right. Cases of the issue in the test names. Its own
 * city at longitude 166; the service's settings are the defaults unless a test changes them and puts them back.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverCancellationTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 166.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 166.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired ServiceSettings settings;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    TestRides rides;
    UUID city;
    MockMvc mvc;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-driver-cancellations", "UAH", 166);
        stopSearches();
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }

    // ------------------------------------------------------------ cases 1–4: what counts

    @Test
    void case1_aWithdrawalAfterTheGraceWindowIsCountedAndSoIsCancellingTheOrder() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        withdraw(driver, 60);
        TestRides.Ride ride = rides.assigned(city, driver, PICKUP, DROPOFF);
        aged(ride, 60);
        jdbc.sql("""
                        insert into cancel_reason (id, service_id, audience, code, labels, driver_outcome, active,
                                                   sort_order, created_at, updated_at)
                        select gen_random_uuid(), service_id, 'DRIVER', 'TEST_CANCEL_COUNTED', labels, 'CANCEL_ORDER',
                               true, 999, now(), now()
                        from cancel_reason where audience = 'DRIVER' and code = 'VEHICLE_PROBLEM'
                        on conflict do nothing""").update();
        trips.cancel(driver.actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(), "TEST_CANCEL_COUNTED");

        assertThat(rows(driver)).extracting(r -> r.get("counted"), r -> r.get("not_counted_why"))
                .containsExactly(org.assertj.core.groups.Tuple.tuple(true, null),
                        org.assertj.core.groups.Tuple.tuple(true, null));
    }

    @Test
    void case2_decliningOrIgnoringAnOfferIsNotACancellation() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        rides.moveTo(driver, TestRides.north(PICKUP, 1000));
        rides.order(rides.client(), city, PICKUP, DROPOFF);
        dispatch.reject(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        stopSearches();
        rides.order(rides.client(), city, PICKUP, DROPOFF);
        jdbc.sql("update offer set expires_at = now() - interval '1 second' where driver_id = :d and state = 'OPEN'")
                .param("d", driver.actor().id()).update();
        assertThat(rows(driver)).isEmpty();
    }

    @Test
    void case3_withinTheGraceWindowIsNotCounted_29SecondsNo31Yes() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        withdraw(driver, 0);
        withdraw(driver, 29);
        withdraw(driver, 31);
        assertThat(rows(driver)).extracting(r -> r.get("not_counted_why"))
                .containsExactly("GRACE", "GRACE", null);
    }

    @Test
    void case4_aReasonThatDoesNotCountIsLeftOutButSixInSevenDaysRaiseAFlag() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        for (int i = 0; i < 5; i++) {
            cancel(driver, "PASSENGER_ASKED");
        }
        assertThat(rows(driver)).extracting(r -> r.get("not_counted_why")).containsOnly("REASON").hasSize(5);
        assertThat(flags(driver, "UNCOUNTED_CANCELLATIONS")).as("5 is not more than 5").isZero();
        cancel(driver, "PASSENGER_ASKED");
        assertThat(flags(driver, "UNCOUNTED_CANCELLATIONS")).isEqualTo(1);
        cancel(driver, "PASSENGER_ASKED");
        assertThat(flags(driver, "UNCOUNTED_CANCELLATIONS")).as("one open flag at a time").isEqualTo(1);
        assertThat(sessions.availability(driver.actor().id()).ineligibleReasons()).doesNotContain("CANCELLATION_PAUSE");
    }

    // ------------------------------------------------------------ cases 5–6: warning and pause

    @Test
    void case5_theThirdCountedCancellationWarnsTheDriverOnce() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        withdraw(driver, 60);
        withdraw(driver, 60);
        assertThat(events(driver, "DriverCancellationsWarning")).isZero();
        withdraw(driver, 60);
        assertThat(events(driver, "DriverCancellationsWarning")).isEqualTo(1);
        withdraw(driver, 60);
        assertThat(events(driver, "DriverCancellationsWarning")).as("not again at 4").isEqualTo(1);
        assertThat(jdbc.sql("""
                        select count(*) from outbox where event_type = 'DriverCancellationsWarning'
                          and payload ->> 'driver_id' = :d and (payload ->> 'cancellations')::int = 3""")
                .param("d", driver.actor().id().toString()).query(Integer.class).single()).isEqualTo(1);
    }

    @Test
    void case6_theFifthPausesNewOffersAndClaimsFor30MinutesButNotATripInProgress() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        for (int i = 0; i < 4; i++) {
            withdraw(driver, 60);
        }
        assertThat(sessions.availability(driver.actor().id()).ineligibleReasons()).as("4: no pause")
                .doesNotContain("CANCELLATION_PAUSE");
        withdraw(driver, 60);

        DriverAvailability paused = sessions.availability(driver.actor().id());
        assertThat(paused.ineligibleReasons()).contains("CANCELLATION_PAUSE");
        assertThat(paused.eligible()).isFalse();
        Map<String, Object> pause = jdbc.sql("""
                        select level, extract(epoch from ends_at - starts_at)::int as seconds from driver_pause
                        where driver_id = :d""").param("d", driver.actor().id()).query().singleRow();
        assertThat(pause.get("level")).isEqualTo(1);
        assertThat(pause.get("seconds")).isEqualTo(30 * 60);
        assertThat(events(driver, "DriverPaused")).isEqualTo(1);

        // No new personal offer, and nothing in or from the ALL tab.
        rides.moveTo(driver, TestRides.north(PICKUP, 1000));
        OrderView next = rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(dispatch.offers(driver.actor())).isEmpty();
        jdbc.sql("update dispatch_attempt set phase = 'BROADCAST' where order_id = :o and phase = 'PERSONAL'")
                .param("o", next.id()).update();
        assertThat(dispatch.broadcast(driver.actor(), null)).isEmpty();
        assertCode(() -> dispatch.claim(driver.actor(), driver.device(), UUID.randomUUID(), next.id()),
                ErrorCode.DRIVER_NOT_ELIGIBLE);
        stopSearches();

        // A trip already under way finishes as usual.
        TestRides.Driver busy = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, busy, PICKUP, DROPOFF);
        pauseNow(busy, 30);
        assertThat(rides.complete(ride, true).phase()).isEqualTo("COMPLETED");
    }

    // ------------------------------------------------------------ case 7: pauses grow

    @Test
    void case7_theSecondPauseIn7DaysLasts2HoursTheThirdUntilTheDayEndsAndRaisesAFlag() {
        TestRides.Driver second = rides.driverNear(PICKUP);
        pastPause(second, 3);
        for (int i = 0; i < 5; i++) {
            withdraw(second, 60);
        }
        Map<String, Object> two = latestPause(second);
        assertThat(two.get("level")).isEqualTo(2);
        assertThat(two.get("seconds")).isEqualTo(120 * 60);
        assertThat(flags(second, "REPEATED_PAUSES")).isZero();

        TestRides.Driver third = rides.driverNear(PICKUP);
        pastPause(third, 5);
        pastPause(third, 2);
        for (int i = 0; i < 5; i++) {
            withdraw(third, 60);
        }
        Map<String, Object> three = latestPause(third);
        assertThat(three.get("level")).isEqualTo(3);
        OffsetDateTime endsAt = ((java.sql.Timestamp) three.get("ends_at")).toInstant().atOffset(ZoneOffset.UTC);
        OffsetDateTime startsAt = ((java.sql.Timestamp) three.get("starts_at")).toInstant().atOffset(ZoneOffset.UTC);
        OffsetDateTime midnight = startsAt.withOffsetSameInstant(ZoneOffset.UTC).toLocalDate().plusDays(1)
                .atStartOfDay().atOffset(ZoneOffset.UTC);
        OffsetDateTime atLeast = startsAt.plusMinutes(120);
        assertThat(endsAt.toInstant()).isEqualTo((midnight.isAfter(atLeast) ? midnight : atLeast).toInstant());
        assertThat(flags(third, "REPEATED_PAUSES")).isEqualTo(1);

        TestRides.Driver old = rides.driverNear(PICKUP);
        pastPause(old, 8);
        for (int i = 0; i < 5; i++) {
            withdraw(old, 60);
        }
        assertThat(latestPause(old).get("level")).as("a pause 8 days ago does not count").isEqualTo(1);
    }

    // ------------------------------------------------------------ case 8: lifting a pause

    @Test
    void case8_staffWithTheRightLiftAPauseWithAReasonOthersGet403() throws Exception {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        for (int i = 0; i < 5; i++) {
            withdraw(driver, 60);
        }
        UUID pause = (UUID) latestPause(driver).get("id");
        String path = "/api/admin/v1/driver-pauses/" + pause + "/lift";

        String stranger = token(staff("orders.view"));
        assertThat(postStatus(path, stranger, Map.of("command_id", UUID.randomUUID(), "expected_version", 1,
                "reason", "Talked to him"))).isEqualTo(403);
        String risk = token(staff("drivers.risk"));
        assertThat(postStatus(path, risk, Map.of("command_id", UUID.randomUUID(), "expected_version", 1)))
                .as("no reason").isEqualTo(400);
        MvcResult list = mvc.perform(get("/api/admin/v1/driver-pauses").param("driver_id",
                driver.actor().id().toString()).header(HttpHeaders.AUTHORIZATION, "Bearer " + risk)).andReturn();
        assertThat(list.getResponse().getStatus()).isEqualTo(200);
        assertThat(list.getResponse().getContentAsString()).contains(pause.toString()).contains("\"active\":true");
        String elsewhere = token(staffOf("drivers.risk", rides.city("test-driver-cancellations-other", "UAH", 168)));
        MvcResult none = mvc.perform(get("/api/admin/v1/driver-pauses").param("driver_id",
                driver.actor().id().toString()).header(HttpHeaders.AUTHORIZATION, "Bearer " + elsewhere)).andReturn();
        assertThat(none.getResponse().getContentAsString()).as("another city's staff").doesNotContain(pause.toString());
        assertThat(postStatus(path, elsewhere, Map.of("command_id", UUID.randomUUID(), "expected_version", 1,
                "reason", "Not mine"))).isEqualTo(403);

        assertThat(postStatus(path, risk, Map.of("command_id", UUID.randomUUID(), "expected_version", 1,
                "reason", "The car really broke down"))).isEqualTo(200);
        assertThat(sessions.availability(driver.actor().id()).ineligibleReasons()).doesNotContain("CANCELLATION_PAUSE");
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'driver_pause.lift' and resource_id = :p")
                .param("p", pause.toString()).query(Integer.class).single()).isEqualTo(1);
        assertThat(postStatus(path, risk, Map.of("command_id", UUID.randomUUID(), "expected_version", 2,
                "reason", "Again"))).as("already over").isEqualTo(409);
        assertThat(rows(driver)).as("the cancellations stay counted").hasSize(5)
                .allMatch(r -> Boolean.TRUE.equals(r.get("counted")));
    }

    // ------------------------------------------------------------ case 9: the rate flag

    @Test
    void case9_aRateAboveThePercentOfEnoughAcceptedOrdersRaisesAFlag() {
        withDiscipline(new ServiceSettings.DriverDiscipline(true, 30, 9, 10, 30, 120, 7, 50, 3, 5, 7), () -> {
            TestRides.Driver driver = rides.driverNear(PICKUP);
            withdraw(driver, 60);
            withdraw(driver, 60);
            assertThat(flags(driver, "DRIVER_CANCELLATIONS")).as("2 of 2 accepted, fewer than 3").isZero();
            withdraw(driver, 60);
            assertThat(flags(driver, "DRIVER_CANCELLATIONS")).as("3 of 3 above 50 %").isEqualTo(1);
            offLine(driver);

            TestRides.Driver steady = rides.driverNear(PICKUP);
            for (int i = 0; i < 2; i++) {
                TestRides.Ride ride = rides.started(city, steady, PICKUP, DROPOFF);
                rides.complete(ride, true);
                stopSearches();
            }
            withdraw(steady, 60);
            withdraw(steady, 60);
            assertThat(flags(steady, "DRIVER_CANCELLATIONS")).as("2 of 4 is 50 %, not above").isZero();
        });
    }

    // ------------------------------------------------------------ case 12: settings

    @Test
    void case12_settingsAreValidatedAndSwitchedOffNothingIsCounted() {
        Actor admin = staff(ServiceSettings.MANAGE_PERMISSION);
        ServiceSettings.Version now = settings.current();
        assertThat(now.settings().driverDiscipline())
                .isEqualTo(new ServiceSettings.DriverDiscipline(true, 30, 3, 5, 30, 120, 7, 20, 20, 5, 7));
        for (ServiceSettings.DriverDiscipline bad : List.of(
                new ServiceSettings.DriverDiscipline(true, -1, 3, 5, 30, 120, 7, 20, 20, 5, 7),
                new ServiceSettings.DriverDiscipline(true, 30, 5, 5, 30, 120, 7, 20, 20, 5, 7),
                new ServiceSettings.DriverDiscipline(true, 30, 3, 5, 0, 120, 7, 20, 20, 5, 7),
                new ServiceSettings.DriverDiscipline(true, 30, 3, 5, 30, 20, 7, 20, 20, 5, 7),
                new ServiceSettings.DriverDiscipline(true, 30, 3, 5, 30, 120, 0, 20, 20, 5, 7),
                new ServiceSettings.DriverDiscipline(true, 30, 3, 5, 30, 120, 7, 0, 20, 5, 7),
                new ServiceSettings.DriverDiscipline(true, 30, 3, 5, 30, 120, 7, 20, 20, 5, 0))) {
            assertCode(() -> settings.change(admin, UUID.randomUUID(), now.version(), with(now.settings(), bad), "x"),
                    ErrorCode.VALIDATION_FAILED);
        }
        withDiscipline(new ServiceSettings.DriverDiscipline(false, 30, 3, 5, 30, 120, 7, 20, 20, 5, 7), () -> {
            TestRides.Driver driver = rides.driverNear(PICKUP);
            for (int i = 0; i < 5; i++) {
                withdraw(driver, 60);
            }
            assertThat(rows(driver)).hasSize(5).allMatch(r -> "OFF".equals(r.get("not_counted_why")));
            assertThat(events(driver, "DriverCancellationsWarning")).isZero();
            assertThat(sessions.availability(driver.actor().id()).ineligibleReasons())
                    .doesNotContain("CANCELLATION_PAUSE");
        });
    }

    // ------------------------------------------------------------ case 13: repeats and races

    @Test
    void case13_aRepeatedCommandCountsOnceAndTwoRacingWithdrawalsOneRow() throws Exception {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.assigned(city, driver, PICKUP, DROPOFF);
        aged(ride, 60);
        UUID command = UUID.randomUUID();
        trips.withdraw(driver.actor(), command, ride.trip().id(), ride.trip().version(), "VEHICLE_PROBLEM", null);
        trips.withdraw(driver.actor(), command, ride.trip().id(), ride.trip().version(), "VEHICLE_PROBLEM", null);
        assertThat(rows(driver)).hasSize(1);
        stopSearches();

        TestRides.Ride raced = rides.assigned(city, driver, PICKUP, DROPOFF);
        aged(raced, 60);
        CyclicBarrier start = new CyclicBarrier(2);
        List<CompletableFuture<Object>> both = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            both.add(CompletableFuture.supplyAsync(() -> {
                try {
                    start.await(5, TimeUnit.SECONDS);
                    return trips.withdraw(driver.actor(), UUID.randomUUID(), raced.trip().id(),
                            raced.trip().version(), "CANNOT_REACH", null);
                } catch (Exception e) {
                    return e;
                }
            }));
        }
        long done = both.stream().map(CompletableFuture::join).filter(r -> r instanceof TripView).count();
        assertThat(done).isEqualTo(1);
        assertThat(rows(driver)).hasSize(2);
    }

    // ------------------------------------------------------------ helpers

    /** Accepts a new order, ages the acceptance by {@code seconds}, gives the order back for VEHICLE_PROBLEM. */
    private void withdraw(TestRides.Driver driver, int seconds) {
        TestRides.Ride ride = rides.assigned(city, driver, PICKUP, DROPOFF);
        aged(ride, seconds);
        trips.withdraw(driver.actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(), "VEHICLE_PROBLEM",
                null);
        stopSearches();
    }

    /** Closes the driver's shift, so the next test driver is the only free one near. */
    private void offLine(TestRides.Driver driver) {
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where driver_id = :d and state <> 'CLOSED'")
                .param("d", driver.actor().id()).update();
    }

    private void cancel(TestRides.Driver driver, String code) {
        TestRides.Ride ride = rides.assigned(city, driver, PICKUP, DROPOFF);
        aged(ride, 60);
        trips.cancel(driver.actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(), code);
        stopSearches();
    }

    private void aged(TestRides.Ride ride, int seconds) {
        jdbc.sql("""
                        update assignment set created_at = created_at - make_interval(secs => :s)
                        where order_id = :o and state = 'COMMITTED'""")
                .param("s", seconds).param("o", ride.order().id()).update();
    }

    private void stopSearches() {
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", city).update();
        jdbc.sql("update offer set state = 'REVOKED', closed_at = now() where state = 'OPEN' and order_id in "
                + "(select id from ride_order where city_id = :c)").param("c", city).update();
        jdbc.sql("""
                        update driver_capacity set occupancy = 'FREE' where occupancy = 'OFFERED'
                          and driver_id in (select driver_id from work_session where city_id = :c and state = 'OPEN')""")
                .param("c", city).update();
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING')""")
                .param("c", city).update();
    }

    private List<Map<String, Object>> rows(TestRides.Driver driver) {
        return jdbc.sql("""
                        select counted, not_counted_why from driver_cancellation
                        where driver_id = :d order by cancelled_at, id""")
                .param("d", driver.actor().id()).query().listOfRows();
    }

    private int flags(TestRides.Driver driver, String kind) {
        return jdbc.sql("select count(*) from driver_risk_flag where driver_id = :d and kind = :k")
                .param("d", driver.actor().id()).param("k", kind).query(Integer.class).single();
    }

    private int events(TestRides.Driver driver, String type) {
        return jdbc.sql("select count(*) from outbox where event_type = :t and payload ->> 'driver_id' = :d")
                .param("t", type).param("d", driver.actor().id().toString()).query(Integer.class).single();
    }

    private Map<String, Object> latestPause(TestRides.Driver driver) {
        return jdbc.sql("""
                        select id, level, starts_at, ends_at, extract(epoch from ends_at - starts_at)::int as seconds
                        from driver_pause where driver_id = :d order by starts_at desc limit 1""")
                .param("d", driver.actor().id()).query().singleRow();
    }

    /** A pause of {@code daysAgo} that is over. */
    private void pastPause(TestRides.Driver driver, int daysAgo) {
        jdbc.sql("""
                        insert into driver_pause (id, driver_id, city_id, kind, level, starts_at, ends_at)
                        values (gen_random_uuid(), :d, :c, 'CANCELLATIONS', 1, now() - make_interval(days => :n),
                                now() - make_interval(days => :n) + interval '30 minutes')""")
                .param("d", driver.actor().id()).param("c", city).param("n", daysAgo).update();
    }

    private void pauseNow(TestRides.Driver driver, int minutes) {
        jdbc.sql("""
                        insert into driver_pause (id, driver_id, city_id, kind, level, starts_at, ends_at)
                        values (gen_random_uuid(), :d, :c, 'CANCELLATIONS', 1, now(),
                                now() + make_interval(mins => :m))""")
                .param("d", driver.actor().id()).param("c", city).param("m", minutes).update();
    }

    private void withDiscipline(ServiceSettings.DriverDiscipline discipline, Runnable body) {
        Actor admin = staff(ServiceSettings.MANAGE_PERMISSION);
        ServiceSettings.Version before = settings.current();
        ServiceSettings.Version changed = settings.change(admin, UUID.randomUUID(), before.version(),
                with(before.settings(), discipline), "Test of ADR 0018");
        try {
            body.run();
        } finally {
            settings.change(admin, UUID.randomUUID(), changed.version(), before.settings(), "Back after the test");
        }
    }

    private static ServiceSettings.Settings with(ServiceSettings.Settings s, ServiceSettings.DriverDiscipline d) {
        return new ServiceSettings.Settings(s.brand(), s.languages(), s.calls(), s.preorders(), s.ratings(), s.tips(),
                s.orders(), s.cashNotReceived(), s.appVersions(), s.staffTopUps(), s.riderDebts(), d);
    }

    private Actor staff(String permission) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Risk', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "cancellations-" + id)
                .param("permissions", new String[] {permission}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor staffOf(String permission, UUID cityId) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'Risk', 'ADMIN', :permissions, false, :cities, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "cancellations-" + id)
                .param("permissions", new String[] {permission}).param("cities", new UUID[] {cityId}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String token(Actor staff) {
        return auth.openStaff(new VerifiedSubject(staff, "ACTIVE", false), ApiAudience.ADMIN, "cancellations")
                .accessToken();
    }

    private int postStatus(String path, String token, Map<String, Object> body) throws Exception {
        return mvc.perform(post(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body)))
                .andReturn().getResponse().getStatus();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
