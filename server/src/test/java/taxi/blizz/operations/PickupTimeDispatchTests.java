package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.pricing.RouteEstimator;

/**
 * Drivers chosen by pickup time (owner decision 05.11.2026, ADR 0020): the fastest by road gets the offer, a driver
 * above the service's maximum pickup time gets none, the time and its source go with the offer, and an accepted router
 * time becomes the promised pickup. The router is a fake that knows the time from each driver's position. Its own
 * city at longitude -127.
 */
@SpringBootTest
@Import({TestcontainersConfiguration.class, PickupTimeDispatchTests.Routes.class})
class PickupTimeDispatchTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -126.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -126.45);

    /** Road seconds from a driver's position, by the position; a position not listed has no road route. */
    static final Map<String, Long> ROAD = new ConcurrentHashMap<>();
    static volatile boolean routerDown;

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired ServiceSettings settings;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-pickup-time", "UAH", -127);
        ROAD.clear();
        routerDown = false;
    }

    @AfterEach
    void router() {
        ROAD.clear();
        routerDown = false;
    }

    @Test
    void theFastestByRoadGetsTheOfferNotTheNearest() {
        TestRides.Driver near = at(500, Duration.ofMinutes(9));
        TestRides.Driver fast = at(1500, Duration.ofMinutes(3));

        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);

        Map<String, Object> offer = openOffer(order);
        assertThat(offer.get("driver_id")).as("the faster one, 1 km farther").isEqualTo(fast.actor().id());
        assertThat(offer.get("pickup_eta_seconds")).isEqualTo(180);
        assertThat(offer.get("pickup_eta_source")).isEqualTo("ROUTER");
        assertThat(jdbc.sql("""
                        select payload ->> 'pickup_eta_seconds' from order_event
                        where order_id = :o and type = 'OfferMade'""")
                .param("o", order.id()).query(String.class).single()).isEqualTo("180");
        assertThat(dispatch.offers(near.actor())).as("the nearer, slower driver").isEmpty();
    }

    @Test
    void aDriverAboveTheMaximumPickupTimeIsNotOfferedTheOrderAndTheJournalSaysWhy() {
        TestRides.Driver slow = at(1000, Duration.ofMinutes(16));

        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);

        assertThat(jdbc.sql("select count(*) from offer where order_id = :o").param("o", order.id())
                .query(Integer.class).single()).as("16 minutes is above the default 15").isZero();
        assertThat(orders.get(order.id()).status()).as("the search goes on").isEqualTo("SEARCHING");
        Map<String, Object> considered = journal(order, slow);
        assertThat(considered.get("outcome")).isEqualTo("EXCLUDED");
        assertThat(considered.get("reason")).isEqualTo("PICKUP_TOO_LONG");
        assertThat(((Number) considered.get("pickup_seconds")).intValue()).isEqualTo(960);
    }

    @Test
    void exactlyTheMaximumIsStillOffered() {
        TestRides.Driver driver = at(1000, Duration.ofMinutes(15));

        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);

        assertThat(openOffer(order).get("driver_id")).isEqualTo(driver.actor().id());
    }

    @Test
    void theMaximumIsTheServicesSetting() {
        TestRides.Driver slow = at(1000, Duration.ofMinutes(16));
        withPickupTime(new ServiceSettings.PickupTime(20, 10), () -> {
            OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
            assertThat(openOffer(order).get("driver_id")).as("16 minutes within 20").isEqualTo(slow.actor().id());
        });
    }

    @Test
    void theSettingIsCheckedWhenSaved() {
        Actor admin = staff(ServiceSettings.MANAGE_PERMISSION);
        for (ServiceSettings.PickupTime wrong : List.of(new ServiceSettings.PickupTime(0, 10),
                new ServiceSettings.PickupTime(121, 10), new ServiceSettings.PickupTime(15, 0),
                new ServiceSettings.PickupTime(15, 21))) {
            ServiceSettings.Version before = settings.current();
            assertThatThrownBy(() -> settings.change(admin, UUID.randomUUID(), before.version(),
                    with(before.settings(), wrong), "Test of ADR 0020"))
                    .as("%s", wrong).isInstanceOfSatisfying(DomainException.class,
                            e -> assertThat(e.code()).isEqualTo(ErrorCode.VALIDATION_FAILED));
        }
        assertThat(settings.current().settings().pickupTime()).as("the default")
                .isEqualTo(new ServiceSettings.PickupTime(15, 10));
    }

    @Test
    void withTheRouterDownTheStraightLineDecidesAndPromisesNothing() {
        routerDown = true;
        TestRides.Driver driver = at(1000, Duration.ofMinutes(2));

        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);

        Map<String, Object> offer = openOffer(order);
        assertThat(offer.get("driver_id")).isEqualTo(driver.actor().id());
        assertThat(offer.get("pickup_eta_source")).isEqualTo("STRAIGHT_LINE");
        assertThat((Integer) offer.get("pickup_eta_seconds")).as("about 1.3 km at 25 km/h").isBetween(150, 230);
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), (UUID) offer.get("id"));
        assertThat(promised(order)).as("a straight-line time is no promise").isEmpty();
    }

    @Test
    void theStraightLineAlsoKeepsAFarDriverAboveTheMaximum() {
        routerDown = true;
        at(4900, Duration.ofMinutes(1));

        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);

        assertThat(jdbc.sql("select count(*) from offer where order_id = :o").param("o", order.id())
                .query(Integer.class).single()).as("6.4 km of road at 25 km/h is over 15 minutes").isZero();
    }

    @Test
    void anAcceptedRouterTimeIsThePromisedPickup() {
        TestRides.Driver driver = at(1000, Duration.ofMinutes(7));
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        UUID offerId = (UUID) openOffer(order).get("id");

        OffsetDateTime before = OffsetDateTime.now();
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offerId);

        OffsetDateTime promised = promised(order).orElseThrow();
        OffsetDateTime acceptedAt = jdbc.sql("select created_at from assignment where order_id = :o")
                .param("o", order.id()).query(OffsetDateTime.class).single();
        assertThat(Duration.between(acceptedAt, promised)).isEqualTo(Duration.ofMinutes(7));
        assertThat(acceptedAt).isAfterOrEqualTo(before.minusSeconds(1));
    }

    @Test
    void anOperatorMayOfferAboveTheMaximumAndTheTimeIsRecorded() {
        TestRides.Driver slow = at(1000, Duration.ofMinutes(25));
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);

        orders.manualOffer(staff(Orders.OFFER_PERMISSION), UUID.randomUUID(), order.id(), slow.actor().id(),
                "The rider agreed to wait");

        Map<String, Object> offer = openOffer(order);
        assertThat(offer.get("driver_id")).isEqualTo(slow.actor().id());
        assertThat(offer.get("pickup_eta_seconds")).isEqualTo(1500);
    }

    // ------------------------------------------------------------ helpers

    /** A driver {@code metres} north of the pickup whom the router puts {@code road} away. */
    private TestRides.Driver at(int metres, Duration road) {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        GeoPoint position = TestRides.north(PICKUP, metres);
        rides.moveTo(driver, position);
        ROAD.put(key(position), road.toSeconds());
        return driver;
    }

    static String key(GeoPoint p) {
        return String.format(Locale.ROOT, "%.5f,%.5f", p.lat(), p.lon());
    }

    private Map<String, Object> openOffer(OrderView order) {
        return jdbc.sql("""
                        select id, driver_id, pickup_eta_seconds, pickup_eta_source from offer
                        where order_id = :o and state = 'OPEN'""")
                .param("o", order.id()).query().singleRow();
    }

    private Optional<OffsetDateTime> promised(OrderView order) {
        return Optional.ofNullable((OffsetDateTime) jdbc.sql(
                        "select promised_pickup_at from assignment where order_id = :o")
                .param("o", order.id()).query((rs, i) -> rs.getObject(1, OffsetDateTime.class)).list().getFirst());
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> journal(OrderView order, TestRides.Driver driver) {
        String candidates = jdbc.sql("""
                        select candidates::text from dispatch_round r join dispatch_attempt a on a.id = r.attempt_id
                        where a.order_id = :o order by r.at desc limit 1""")
                .param("o", order.id()).query(String.class).single();
        List<Map<String, Object>> list = new tools.jackson.databind.json.JsonMapper().readValue(candidates,
                List.class);
        return list.stream().filter(c -> driver.actor().id().toString().equals(c.get("driver_id"))).findFirst()
                .orElseThrow();
    }

    private void withPickupTime(ServiceSettings.PickupTime pickup, Runnable body) {
        Actor admin = staff(ServiceSettings.MANAGE_PERMISSION);
        ServiceSettings.Version before = settings.current();
        ServiceSettings.Version changed = settings.change(admin, UUID.randomUUID(), before.version(),
                with(before.settings(), pickup), "Test of ADR 0020");
        try {
            body.run();
        } finally {
            settings.change(admin, UUID.randomUUID(), changed.version(), before.settings(), "Back after the test");
        }
    }

    private static ServiceSettings.Settings with(ServiceSettings.Settings s, ServiceSettings.PickupTime pickup) {
        return new ServiceSettings.Settings(s.brand(), s.languages(), s.calls(), s.preorders(), s.ratings(), s.tips(),
                s.orders(), s.cashNotReceived(), s.appVersions(), s.staffTopUps(), s.riderDebts(),
                s.driverDiscipline(), s.offerDiscipline(), pickup);
    }

    private Actor staff(String permission) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Pickup', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "pickup-" + id).param("permissions", new String[] {permission})
                .update();
        return new Actor(SubjectType.STAFF, id);
    }

    /** The application's router with the road times of {@link #ROAD}; the straight line stays the real one. */
    static class FakeRouter implements RouteEstimator {
        private final RouteEstimator real;

        FakeRouter(RouteEstimator real) {
            this.real = real;
        }

        @Override
        public Estimate estimate(GeoPoint pickup, GeoPoint dropOff) {
            return real.estimate(pickup, dropOff);
        }

        @Override
        public Estimate estimate(UUID serviceId, GeoPoint pickup, GeoPoint dropOff) {
            return real.estimate(serviceId, pickup, dropOff);
        }

        @Override
        public Optional<Estimate> road(UUID serviceId, GeoPoint from, GeoPoint to) {
            if (routerDown) {
                return Optional.empty();
            }
            return Optional.ofNullable(ROAD.get(key(from))).map(seconds -> new Estimate(1000, seconds));
        }

        @Override
        public Estimate straightLine(long straightMetres) {
            return real.straightLine(straightMetres);
        }
    }

    @TestConfiguration(proxyBeanMethods = false)
    static class Routes {
        @Bean
        @Primary
        FakeRouter pickupTimeFakeRouter(@Qualifier("configuredRouteEstimator") RouteEstimator real) {
            return new FakeRouter(real);
        }
    }
}
