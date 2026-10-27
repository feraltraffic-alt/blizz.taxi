package taxi.blizz.backoffice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.Ledger;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.ClientAccounts;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** Riders in the admin panel (REQ-ADM-01, section 36.4): search, card, block and unblock. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ClientAdminTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 75.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 75.55);

    @Autowired ClientAccounts clients;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired SupportCases cases;
    @Autowired Ledger ledger;
    @Autowired TransactionTemplate tx;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    TestRides rides;
    UUID city;
    Actor support;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-client-admin", "UAH", 75);
        support = staff(new String[]{ClientAccounts.MANAGE_PERMISSION});
    }

    @Test
    void findByPhoneDigitsOrNameButNeverAnAnonymizedRider() {
        Actor olena = rides.client();
        jdbc.sql("update client set name = 'Олена Коваль' where id = :id").param("id", olena.id()).update();
        String phone = jdbc.sql("select phone_normalized from client where id = :id").param("id", olena.id())
                .query(String.class).single();
        assertThat(clients.search(support, phone.substring(phone.length() - 7), 10))
                .extracting(ClientAccounts.Client::id).contains(olena.id());
        assertThat(clients.search(support, "оле", 10)).extracting(ClientAccounts.Client::id).contains(olena.id());

        jdbc.sql("""
                        update client set account_state = 'ANONYMIZED', phone_normalized = null, name = null
                        where id = :id""").param("id", olena.id()).update();
        assertThat(clients.search(support, "оле", 50)).extracting(ClientAccounts.Client::id).doesNotContain(olena.id());
        assertCode(() -> clients.get(support, olena.id()), ErrorCode.NOT_FOUND);
        assertCode(() -> clients.search(support, "1", 10), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> clients.search(staff(new String[0]), "оле", 10), ErrorCode.ACCESS_DENIED);
    }

    @Test
    void aBlockedRiderCannotOrderButMaySignInUntilUnblocked() {
        Actor rider = rides.client();
        long version = clients.get(support, rider.id()).version();
        assertCode(() -> clients.block(support, UUID.randomUUID(), rider.id(), version, " ", null),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> clients.block(support, UUID.randomUUID(), rider.id(), version, "Abuse",
                OffsetDateTime.now(ZoneOffset.UTC).minusMinutes(1)), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> clients.block(support, UUID.randomUUID(), rider.id(), version + 1, "Abuse", null),
                ErrorCode.VERSION_CONFLICT);

        UUID command = UUID.randomUUID();
        ClientAccounts.Client blocked = clients.block(support, command, rider.id(), version, "Abusive calls", null);
        assertThat(blocked.accountState()).isEqualTo("BLOCKED");
        assertThat(blocked.block().reason()).isEqualTo("Abusive calls");
        assertThat(blocked.block().by()).isEqualTo(support.id());
        assertThat(clients.block(support, command, rider.id(), version, "Abusive calls", null).version())
                .as("a repeat").isEqualTo(blocked.version());
        assertCode(() -> clients.block(support, UUID.randomUUID(), rider.id(), blocked.version(), "Again", null),
                ErrorCode.STATE_CONFLICT);

        assertCode(() -> rides.order(rider, city, PICKUP, DROPOFF), ErrorCode.ACCOUNT_NOT_ACTIVE);
        assertThat(auth.open(new VerifiedSubject(rider, "BLOCKED", false), "blocked-test").accessToken())
                .as("may still sign in to follow a trip").isNotBlank();

        ClientAccounts.Client active = clients.unblock(support, UUID.randomUUID(), rider.id(), blocked.version(),
                "Apologised");
        assertThat(active.accountState()).isEqualTo("ACTIVE");
        assertThat(active.block()).isNull();
        rides.driverNear(PICKUP);
        assertThat(rides.order(rider, city, PICKUP, DROPOFF).id()).isNotNull();
        assertThat(jdbc.sql("""
                        select count(*) from audit_log
                        where action in ('client.block', 'client.unblock') and resource_id = :id""")
                .param("id", rider.id().toString()).query(Long.class).single()).isEqualTo(2);
    }

    @Test
    void aBlockWithAnEndIsLiftedWhenTheEndComes() {
        Actor rider = rides.client();
        ClientAccounts.Client blocked = clients.block(support, UUID.randomUUID(), rider.id(),
                clients.get(support, rider.id()).version(), "Unpaid trips",
                OffsetDateTime.now(ZoneOffset.UTC).plusDays(1));
        assertThat(blocked.block().until()).isNotNull();
        jdbc.sql("update client set blocked_until = now() - interval '1 second' where id = :id")
                .param("id", rider.id()).update();

        assertThat(clients.liftExpiredBlocks()).isGreaterThanOrEqualTo(1);
        assertThat(clients.get(support, rider.id()).accountState()).isEqualTo("ACTIVE");
        assertThat(jdbc.sql("""
                        select reason from audit_log where action = 'client.unblock' and resource_id = :id""")
                .param("id", rider.id().toString()).query(String.class).single()).isEqualTo("The block ended");
    }

    @Test
    @SuppressWarnings("unchecked")
    void theCardShowsOrdersBonusesDebtAndCases() throws Exception {
        Actor rider = rides.client();
        rides.driverNear(PICKUP);
        UUID order = rides.order(rider, city, PICKUP, DROPOFF).id();
        post("bonus", "PROMOTION", Ledger.Line.debit(Ledger.Account.PROMO_EXPENSE, null, 2_500),
                Ledger.Line.credit(Ledger.Account.RIDER_WALLET, rider.id(), 2_500));
        post("debt", "TEST_DEBT", Ledger.Line.debit(Ledger.Account.RIDER_RECEIVABLE, rider.id(), 4_000),
                Ledger.Line.credit(Ledger.Account.SERVICE_FUNDS, null, 4_000));
        cases.open(rider, UUID.randomUUID(), SupportCases.Category.LOST_ITEM, null, "Umbrella", "Left it in the car");

        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        String token = auth.openStaff(new VerifiedSubject(support, "ACTIVE", false), ApiAudience.ADMIN, null)
                .accessToken();
        MvcResult result = mvc.perform(get("/api/admin/v1/clients/" + rider.id())
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
        assertThat(result.getResponse().getStatus()).as(result.getResponse().getContentAsString()).isEqualTo(200);
        Map<String, Object> card = json.readValue(result.getResponse().getContentAsString(), Map.class);

        assertThat((Map<String, Object>) card.get("client")).containsEntry("account_state", "ACTIVE");
        assertThat((List<Map<String, Object>>) card.get("current_orders"))
                .extracting(o -> o.get("id")).containsExactly(order.toString());
        assertThat((List<Map<String, Object>>) card.get("bonuses")).singleElement()
                .satisfies(b -> assertThat(((Number) b.get("balance_minor")).longValue()).isEqualTo(2_500));
        assertThat((List<Map<String, Object>>) card.get("debt")).singleElement()
                .satisfies(d -> assertThat(((Number) d.get("amount_minor")).longValue()).isEqualTo(4_000));
        assertThat((List<Map<String, Object>>) card.get("cases")).singleElement()
                .satisfies(c -> assertThat(c).containsEntry("subject", "Umbrella"));

        String clerk = auth.openStaff(new VerifiedSubject(staff(new String[0]), "ACTIVE", false), ApiAudience.ADMIN,
                null).accessToken();
        assertThat(mvc.perform(get("/api/admin/v1/clients/" + rider.id())
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + clerk)).andReturn().getResponse().getStatus())
                .isEqualTo(403);
    }

    private void post(String key, String basis, Ledger.Line... lines) {
        tx.executeWithoutResult(s -> ledger.post(new Ledger.Posting("client-admin-" + key + ":" + UUID.randomUUID(),
                basis, UUID.randomUUID(), "UAH", "Test", List.of(lines))));
    }

    private Actor staff(String[] permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Support', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "client-admin-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
