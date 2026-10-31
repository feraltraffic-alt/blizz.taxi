package taxi.blizz.pricing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestPhones;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.CityOperations;
import taxi.blizz.geo.GeoConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/**
 * Issue #142, part D1 (REQ-TEN-05, E6): a city decides whether a ride from it may end outside its polygon, and how far
 * from it. The quote refuses the rest with DROPOFF_OUTSIDE_CITY. By default a drop-off anywhere is allowed. Its own
 * city at longitude 96 (the polygon spans latitudes −40..−39).
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DropoffOutsideCityTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 96.5);
    static final GeoPoint INSIDE = new GeoPoint(-39.45, 96.55);
    /** About 11 km north of the polygon. */
    static final GeoPoint NEAR_OUTSIDE = new GeoPoint(-38.9, 96.5);
    /** About 55 km north of the polygon. */
    static final GeoPoint FAR_OUTSIDE = new GeoPoint(-38.5, 96.5);

    @Autowired QuoteService quotes;
    @Autowired CityOperations operations;
    @Autowired JdbcClient jdbc;

    UUID city;
    Actor manager;

    @BeforeEach
    void city() {
        city = new taxi.blizz.TestRides(jdbc, null, null, null, null, null, quotes)
                .city("test-dropoff-outside", "UAH", 96);
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'City ops', 'ADMIN', :permissions, false, :scope, 'ACTIVE', now(),
                                now())""")
                .param("id", id).param("login", "dropoff-" + id)
                .param("permissions", new String[] {GeoConfiguration.MANAGE_PERMISSION})
                .param("scope", new UUID[] {city}).update();
        manager = new Actor(SubjectType.STAFF, id);
    }

    /** Back to the default, so the order of the tests does not matter. */
    @AfterEach
    void anywhere() {
        set(CityOperations.DROPOFF_ANYWHERE);
    }

    private CityOperations.State set(CityOperations.DropoffOutside rule) {
        CityOperations.State state = operations.get(manager, city);
        return operations.change(manager, UUID.randomUUID(), city, state.version(),
                new CityOperations.Settings(state.workingHours(), state.paymentMethods(), null, rule), "Test rule");
    }

    private QuoteService.Quote quote(GeoPoint dropoff) {
        Actor rider = new Actor(SubjectType.CLIENT, UUID.randomUUID());
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", rider.id()).param("phone", TestPhones.unique("+48", 9)).update();
        return new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, dropoff);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void byDefaultADropoffAnywhereIsQuoted() {
        assertThat(operations.get(manager, city).dropoffOutsideCity()).isEqualTo(CityOperations.DROPOFF_ANYWHERE);
        assertThat(quote(FAR_OUTSIDE).amountMinor()).isPositive();
        assertThat(quote(INSIDE).amountMinor()).isPositive();
    }

    @Test
    void aCityThatForbidsItRefusesADropoffOutsideButNotInside() {
        CityOperations.State state = set(new CityOperations.DropoffOutside(false, null));
        assertThat(state.dropoffOutsideCity()).isEqualTo(new CityOperations.DropoffOutside(false, null));

        assertCode(() -> quote(NEAR_OUTSIDE), ErrorCode.DROPOFF_OUTSIDE_CITY);
        assertThat(quote(INSIDE).amountMinor()).isPositive();
        assertThat(jdbc.sql("""
                        select after::text from audit_log
                        where action = 'city.operations.change' and resource_id = :city
                        order by occurred_at desc limit 1""")
                .param("city", city.toString()).query(String.class).single())
                .contains("dropoff_outside_city").contains("\"allowed\": false");
    }

    @Test
    void aLimitAllowsANearDropoffOutsideAndRefusesAFarOne() {
        set(new CityOperations.DropoffOutside(true, 20));

        assertThat(quote(NEAR_OUTSIDE).amountMinor()).isPositive();
        assertCode(() -> quote(FAR_OUTSIDE), ErrorCode.DROPOFF_OUTSIDE_CITY);
        assertThat(quote(INSIDE).amountMinor()).isPositive();
    }

    @Test
    void theRuleIsKeptWhenAChangeLeavesItOutAndALimitOutOfRangeIsRefused() {
        set(new CityOperations.DropoffOutside(false, null));
        CityOperations.State state = operations.get(manager, city);
        CityOperations.State hoursOnly = operations.change(manager, UUID.randomUUID(), city, state.version(),
                new CityOperations.Settings(List.of(), state.paymentMethods()), "Hours only");
        assertThat(hoursOnly.dropoffOutsideCity()).isEqualTo(new CityOperations.DropoffOutside(false, null));

        for (int bad : new int[] {0, CityOperations.MAX_DROPOFF_DISTANCE_KM + 1}) {
            assertCode(() -> operations.change(manager, UUID.randomUUID(), city, hoursOnly.version(),
                    new CityOperations.Settings(List.of(), hoursOnly.paymentMethods(), null,
                            new CityOperations.DropoffOutside(true, bad)), "x"), ErrorCode.VALIDATION_FAILED);
        }
    }
}
