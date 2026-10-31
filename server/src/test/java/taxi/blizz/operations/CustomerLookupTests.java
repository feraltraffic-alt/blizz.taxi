package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

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
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestPhones;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.StaffSignIn;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.RateLimitedException;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #176, part A (registry 22.2 "Operator | GET /customers/lookup"): one rider by their exact phone, audited with
 * the phone only as a keyed hash, never a search by prefix, name or part of a number. Cities at longitudes 93 and 92.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CustomerLookupTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 93.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 93.55);
    static final GeoPoint OTHER_PICKUP = new GeoPoint(-39.5, 92.5);
    static final GeoPoint OTHER_DROPOFF = new GeoPoint(-39.45, 92.55);
    static final String PASSWORD = "Customer-Lookup-Test-2026";

    @Autowired CustomerLookup customers;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired StaffSignIn signIn;
    @Autowired QuoteService quotes;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;

    TestRides rides;
    UUID city;
    UUID otherCity;
    MockMvc mvc;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-customer-lookup", "UAH", 93);
        otherCity = rides.city("test-customer-lookup-other", "UAH", 92);
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }

    // ------------------------------------------------------------ fixtures

    private record Staff(Actor actor, String login) {
    }

    private Staff staff(UUID scope, String... permissions) {
        UUID id = UUID.randomUUID();
        String login = "lookup-" + id.toString().substring(0, 8);
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                password_hash, created_at, updated_at)
                        values (:id, :login, 'Operator', 'OPERATOR', :permissions, false, :scope, 'ACTIVE', :hash,
                                now(), now())""")
                .param("id", id).param("login", login).param("permissions", permissions)
                .param("scope", scope == null ? new UUID[0] : new UUID[] {scope})
                .param("hash", new BCryptPasswordEncoder(4).encode(PASSWORD)).update();
        return new Staff(new Actor(SubjectType.STAFF, id), login);
    }

    private Staff operator() {
        return staff(city, Orders.CREATE_PERMISSION, Orders.VIEW_PERMISSION);
    }

    /** A rider with a full Ukrainian number (+380 and nine digits) and a name. */
    private Actor rider(String phone) {
        Actor rider = rides.client();
        jdbc.sql("update client set phone_normalized = :phone, name = 'Olena Test' where id = :id")
                .param("phone", phone).param("id", rider.id()).update();
        return rider;
    }

    private static String phone() {
        return TestPhones.unique("+38099", 7);
    }

    /** A cash order of the rider in the city, closed at once so the next one may be placed. */
    private UUID order(Actor rider, UUID cityId, GeoPoint pickup, GeoPoint dropoff) {
        UUID id = rides.order(rider, cityId, pickup, dropoff).id();
        jdbc.sql("update ride_order set status = 'UNFULFILLED' where id = :id").param("id", id).update();
        return id;
    }

    private long lookupAudits(Actor staff) {
        return jdbc.sql("select count(*) from audit_log where action = 'customer.lookup' and actor_id = :staff")
                .param("staff", staff.id()).query(Long.class).single();
    }

    /** Every text column of the staff member's lookup audit rows, as one string. */
    private String auditText(Actor staff) {
        return String.join("\n", jdbc.sql("""
                        select concat_ws(' ', action, resource_type, resource_id, reason, before::text, after::text)
                        from audit_log where action = 'customer.lookup' and actor_id = :staff""")
                .param("staff", staff.id()).query(String.class).list());
    }

    private String operatorToken(Staff staff) {
        return signIn.signIn(staff.login(), PASSWORD, ApiAudience.OPERATOR, null, null).session().accessToken();
    }

    private MvcResult getLookup(String phone, String token) throws Exception {
        var request = get("/api/operator/v1/customers/lookup").param("phone", phone);
        if (token != null) {
            request.header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        }
        return mvc.perform(request).andReturn();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    // ------------------------------------------------------------ tests

    @Test
    void anExactPhoneFindsTheRiderWithTheirOrdersInTheOperatorsCitiesOnly() {
        String phone = phone();
        Actor rider = rider(phone);
        UUID here = order(rider, city, PICKUP, DROPOFF);
        UUID elsewhere = order(rider, otherCity, OTHER_PICKUP, OTHER_DROPOFF);
        UUID newest = order(rider, city, PICKUP, DROPOFF);
        Staff operator = operator();

        CustomerLookup.Customer found = customers.lookup(operator.actor(), phone);

        assertThat(found.clientId()).isEqualTo(rider.id());
        assertThat(found.name()).isEqualTo("Olena Test");
        assertThat(found.accountState()).isEqualTo("ACTIVE");
        assertThat(found.orders()).extracting(CustomerLookup.Order::id).as("newest first, this city only")
                .containsExactly(newest, here).doesNotContain(elsewhere);
        assertThat(found.orders()).allSatisfy(o -> assertThat(o.cityId()).isEqualTo(city));
        assertThat(lookupAudits(operator.actor())).isOne();
        assertThat(auditText(operator.actor())).contains("FOUND").contains(rider.id().toString());
    }

    @Test
    void atMostTenOrdersAreListed() {
        String phone = phone();
        Actor rider = rider(phone);
        for (int i = 0; i < CustomerLookup.ORDERS + 1; i++) {
            order(rider, city, PICKUP, DROPOFF);
        }
        assertThat(customers.lookup(operator().actor(), phone).orders()).hasSize(CustomerLookup.ORDERS);
    }

    @Test
    void noMatchIsNotFoundAndIsAuditedWithoutThePhoneInClear() {
        Staff operator = operator();
        String phone = phone();

        assertCode(() -> customers.lookup(operator.actor(), phone), ErrorCode.NOT_FOUND);

        assertThat(lookupAudits(operator.actor())).isOne();
        String audit = auditText(operator.actor());
        assertThat(audit).contains("NOT_FOUND");
        assertThat(audit).as("the phone only as a keyed hash").doesNotContain(phone).doesNotContain(phone.substring(1))
                .doesNotContain(phone.substring(4));
        // A found rider is audited the same way: no phone in clear.
        rider(phone);
        customers.lookup(operator.actor(), phone);
        assertThat(auditText(operator.actor())).doesNotContain(phone.substring(4));
    }

    @Test
    void onlyAFullE164NumberIsLookedUp() {
        String phone = phone();
        rider(phone);
        Staff operator = operator();
        String digits = phone.substring(1);
        for (String partial : List.of(
                phone.substring(0, phone.length() - 2), // a prefix of a real number
                phone.substring(0, 7), // a short prefix
                phone + "1", // too long for the country
                digits, // without "+"
                "00" + digits, // the international prefix instead of "+"
                "+380 " + phone.substring(4), // with a space
                phone.substring(0, 4) + "-" + phone.substring(4), // with a dash
                " " + phone, // padded
                "Olena Test", // a name
                "%" + phone.substring(4), // a wildcard
                "")) {
            assertCode(() -> customers.lookup(operator.actor(), partial), ErrorCode.VALIDATION_FAILED);
        }
        assertThat(lookupAudits(operator.actor())).as("refused before the lookup").isZero();
    }

    @Test
    void anAnonymizedOrDeletedRiderIsNotFound() {
        String deleted = phone();
        Actor pending = rider(deleted);
        jdbc.sql("""
                        update client set account_state = 'DELETION_PENDING', deletion_previous_state = 'ACTIVE',
                                          deletion_requested_at = now()
                        where id = :id""")
                .param("id", pending.id()).update();
        String anonymized = phone();
        Actor gone = rider(anonymized);
        jdbc.sql("update client set account_state = 'ANONYMIZED', name = null where id = :id")
                .param("id", gone.id()).update();
        Staff operator = operator();

        assertCode(() -> customers.lookup(operator.actor(), deleted), ErrorCode.NOT_FOUND);
        assertCode(() -> customers.lookup(operator.actor(), anonymized), ErrorCode.NOT_FOUND);
    }

    @Test
    void staffWithoutThePermissionAreRefused() {
        String phone = phone();
        rider(phone);
        assertCode(() -> customers.lookup(staff(city, Orders.VIEW_PERMISSION).actor(), phone),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> customers.lookup(staff(null, Orders.CREATE_PERMISSION).actor(), phone),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> customers.lookup(rides.client(), phone), ErrorCode.ACCESS_DENIED);
    }

    @Test
    void overTheBudgetIsRateLimited() {
        String phone = phone();
        rider(phone);
        Staff operator = operator();
        // The staff member has used the whole default budget of the hour.
        jdbc.sql("""
                        insert into rate_limit_hit (bucket, subject_id, at)
                        select 'customer-lookup', :staff, now() - interval '1 minute' from generate_series(1, 60)""")
                .param("staff", operator.actor().id()).update();

        assertThatThrownBy(() -> customers.lookup(operator.actor(), phone)).isInstanceOf(RateLimitedException.class);
        assertThat(lookupAudits(operator.actor())).isZero();
    }

    @Test
    void overHttpTheOperatorGetsTheRiderAndOthersAreRefused() throws Exception {
        String phone = phone();
        Actor rider = rider(phone);
        Staff operator = operator();
        String token = operatorToken(operator);

        MvcResult found = getLookup(phone, token);
        assertThat(found.getResponse().getStatus()).isEqualTo(200);
        assertThat(found.getResponse().getContentAsString()).contains(rider.id().toString());
        assertThat(getLookup(phone.substring(0, phone.length() - 2), token).getResponse().getStatus())
                .isEqualTo(400);
        assertThat(getLookup(phone(), token).getResponse().getStatus()).isEqualTo(404);
        // The staff activity log keeps the path, never the query: no phone there either.
        assertThat(jdbc.sql("""
                        select coalesce(string_agg(concat_ws(' ', path, resource_ids::text), ' '), '')
                        from staff_activity where staff_id = :staff""")
                .param("staff", operator.actor().id()).query(String.class).single())
                .contains("/api/operator/v1/customers/lookup").doesNotContain(phone.substring(4));

        String riderToken = auth.open(new VerifiedSubject(rider, "ACTIVE", false), "lookup-test").accessToken();
        assertThat(getLookup(phone, riderToken).getResponse().getStatus()).isEqualTo(401);
        TestRides.Driver driver = rides.driverNear(PICKUP);
        String driverToken = auth.open(new VerifiedSubject(driver.actor(), "ACTIVE", false), "lookup-test")
                .accessToken();
        assertThat(getLookup(phone, driverToken).getResponse().getStatus()).isEqualTo(401);
        assertThat(getLookup(phone, null).getResponse().getStatus()).isEqualTo(401);

        jdbc.sql("""
                        insert into rate_limit_hit (bucket, subject_id, at)
                        select 'customer-lookup', :staff, now() - interval '1 minute' from generate_series(1, 60)""")
                .param("staff", operator.actor().id()).update();
        MvcResult limited = getLookup(phone, token);
        assertThat(limited.getResponse().getStatus()).isEqualTo(429);
        assertThat(limited.getResponse().getHeader("Retry-After")).isNotBlank();
        assertThat(Map.of("body", limited.getResponse().getContentAsString()).get("body")).contains("RATE_LIMITED");
    }
}
