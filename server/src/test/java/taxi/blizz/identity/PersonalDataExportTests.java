package taxi.blizz.identity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.backoffice.SupportCases;
import taxi.blizz.finance.Ledger;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.telephony.FakeOtpCodes;
import tools.jackson.databind.json.JsonMapper;

/** A rider's copy of their personal data (REQ-PRV-07, issue #68): asked with a code, built in the background. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class PersonalDataExportTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 35.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 35.55);
    static final List<String> SECTIONS = List.of("calls", "card_payments", "codes_sent", "legal_acceptances",
            "money", "orders", "profile", "promotion_bonuses", "push_devices", "support_cases");

    @Autowired PersonalDataExports exports;
    @Autowired FakeOtpCodes codes;
    @Autowired SupportCases support;
    @Autowired Ledger ledger;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired TransactionTemplate tx;
    @Autowired JdbcClient jdbc;
    @Autowired JsonMapper json;

    TestRides rides;
    UUID city;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-data-export", "PLN", 35);
    }

    @Test
    @SuppressWarnings("unchecked")
    void theRiderGetsTheirOwnDataAndNothingOfAnybodyElse() throws Exception {
        Actor rider = rides.client();
        Actor other = rides.client();
        rides.driverNear(PICKUP);
        UUID mine = rides.order(rider, city, PICKUP, DROPOFF).id();
        rides.driverNear(PICKUP);
        UUID theirs = rides.order(other, city, PICKUP, DROPOFF).id();
        support.open(rider, UUID.randomUUID(), SupportCases.Category.LOST_ITEM, mine, "Umbrella", "Left it in the car");
        for (UUID order : List.of(mine, theirs)) { // the call centre called each rider about their order
            UUID call = UUID.randomUUID();
            jdbc.sql("""
                            insert into call (id, channel_id, direction, party, order_id, city_id, state, started_at,
                                              ended_at, ended_reason)
                            values (:id, :channel, 'OUTBOUND', 'RIDER', :order, :city, 'ENDED', now(), now(), 'HANGUP')""")
                    .param("id", call).param("channel", call.toString()).param("order", order).param("city", city).update();
        }
        support.open(other, UUID.randomUUID(), SupportCases.Category.OTHER, null, "Someone else's", "Not mine");
        tx.executeWithoutResult(s -> ledger.post(new Ledger.Posting("data-export-bonus:" + UUID.randomUUID(),
                "PROMOTION", UUID.randomUUID(), "PLN", "Test", List.of(
                Ledger.Line.debit(Ledger.Account.PROMO_EXPENSE, null, 2_500),
                Ledger.Line.credit(Ledger.Account.RIDER_WALLET, rider.id(), 2_500)))));

        UUID challenge = exports.requestCode(rider, null, null).challengeId();
        String code = code(rider);
        String wrong = code.substring(0, code.length() - 1) + (code.endsWith("0") ? "1" : "0");
        assertCode(() -> exports.request(rider, UUID.randomUUID(), challenge, wrong), ErrorCode.OTP_INVALID);
        UUID command = UUID.randomUUID();
        PersonalDataExports.Export asked = exports.request(rider, command, challenge, code);
        assertThat(asked.state()).isEqualTo("PENDING");
        assertThat(exports.request(rider, command, challenge, code).id()).as("a repeat").isEqualTo(asked.id());

        exports.buildPending(10);
        PersonalDataExports.Export ready = exports.get(rider, asked.id());
        assertThat(ready.state()).isEqualTo("READY");
        assertThat(ready.expiresAt()).isAfter(ready.readyAt().plusDays(6));
        assertCode(() -> exports.get(other, asked.id()), ErrorCode.NOT_FOUND);
        assertCode(() -> exports.download(other, asked.id()), ErrorCode.NOT_FOUND);

        PersonalDataExports.File file = exports.download(rider, asked.id());
        String text = new String(file.content(), StandardCharsets.UTF_8);
        Map<String, Object> copy = json.readValue(text, Map.class);
        assertThat(copy).containsEntry("format", 1).containsEntry("client_id", rider.id().toString());
        Map<String, Object> sections = (Map<String, Object>) copy.get("sections");
        assertThat(sections).containsOnlyKeys(SECTIONS);
        String phone = jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
        assertThat((Map<String, Object>) sections.get("profile")).containsEntry("phone", phone);
        assertThat((List<Map<String, Object>>) ((Map<String, Object>) sections.get("orders")).get("orders"))
                .extracting(o -> o.get("id")).containsExactly(mine.toString());
        assertThat((List<Map<String, Object>>) ((Map<String, Object>) sections.get("orders"))
                .get("calls_from_service")).singleElement()
                .satisfies(c -> assertThat(c).containsEntry("order_id", mine.toString()));
        assertThat((List<Map<String, Object>>) sections.get("support_cases")).singleElement()
                .satisfies(c -> assertThat(c).containsEntry("subject", "Umbrella"));
        assertThat((List<Map<String, Object>>) sections.get("money")).singleElement()
                .satisfies(m -> assertThat(((Number) m.get("amount_minor")).longValue()).isEqualTo(2_500));
        assertThat(text).doesNotContain(theirs.toString()).doesNotContain(other.id().toString())
                .doesNotContain("Someone else's").doesNotContain("\"token\"");

        assertThat(jdbc.sql("""
                        select count(*) from audit_log where resource_id = :id
                          and action in ('personal_data_export.request', 'personal_data_export.download')""")
                .param("id", asked.id().toString()).query(Long.class).single()).isEqualTo(2);

        Actor supportStaff = staff(ClientAccounts.MANAGE_PERMISSION);
        assertThat(exports.ofClient(supportStaff, rider.id())).extracting(PersonalDataExports.Export::state)
                .containsExactly("READY");
        assertCode(() -> exports.ofClient(staff(), rider.id()), ErrorCode.ACCESS_DENIED);
    }

    @Test
    void onceADayOnlyForAnAccountInUseAndDroppedWhenItsTimeIsOver() {
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into personal_data_export (id, client_id, state, content, size_bytes, created_at,
                                                          ready_at, expires_at)
                        values (:id, :client, 'READY', '{}'::bytea, 2, now() - interval '1 hour',
                                now() - interval '1 hour', now() + interval '1 day')""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).update();
        UUID challenge = exports.requestCode(rider, null, null).challengeId();
        assertCode(() -> exports.request(rider, UUID.randomUUID(), challenge, code(rider)),
                ErrorCode.STATE_CONFLICT);

        Actor blocked = rides.client();
        jdbc.sql("update client set account_state = 'BLOCKED' where id = :id").param("id", blocked.id()).update();
        UUID blockedChallenge = exports.requestCode(blocked, null, null).challengeId();
        assertCode(() -> exports.request(blocked, UUID.randomUUID(), blockedChallenge, code(blocked)),
                ErrorCode.ACCOUNT_NOT_ACTIVE);

        Actor leaving = rides.client();
        UUID id = exports.request(leaving, UUID.randomUUID(),
                exports.requestCode(leaving, null, null).challengeId(), code(leaving)).id();
        exports.buildPending(10);
        assertThat(exports.get(leaving, id).state()).isEqualTo("READY");
        jdbc.sql("update personal_data_export set expires_at = now() - interval '1 second' where id = :id")
                .param("id", id).update();
        assertCode(() -> exports.download(leaving, id), ErrorCode.STATE_CONFLICT);
        assertThat(exports.expire()).isGreaterThanOrEqualTo(1);
        assertThat(exports.get(leaving, id).state()).isEqualTo("EXPIRED");
        assertThat(jdbc.sql("select content is null from personal_data_export where id = :id").param("id", id)
                .query(Boolean.class).single()).isTrue();

        assertCode(() -> exports.requestCode(staff(), null, null), ErrorCode.ACCESS_DENIED);
    }

    // ---------------------------------------------------------------- fixtures

    private String code(Actor rider) {
        String phone = jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
        return codes.last(phone).orElseThrow().code();
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Privacy', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "data-export-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
