package taxi.blizz.backoffice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.ClientDeletions;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpDelivery;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.PhoneNumber;
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

/**
 * Staff check and complete a rider's deletion request (REQ-RID-10, REQ-PRV-04, AC-24, issue #56): blockers,
 * anonymization, the consumers of {@code ClientAnonymized} and what stays.
 */
@SpringBootTest
@Import({TestcontainersConfiguration.class, ClientDeletionTests.Capture.class})
class ClientDeletionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 125.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 125.55);

    @Autowired
    ClientDeletionReview review;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    SessionService auth;
    @Autowired
    OtpService otp;
    @Autowired
    CapturingDelivery delivery;
    @Autowired
    OutboxRelay relay;
    @Autowired
    Ledger ledger;
    @Autowired
    RiderWallets wallets;
    @Autowired
    SupportCases support;
    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    QuoteService quotes;

    TestRides rides;
    Actor staff;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        staff = staff(ClientDeletionReview.DELETE_PERMISSION);
        deliverEvents();
    }

    // ------------------------------------------------------------ fixtures

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Privacy', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "privacy-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    /** A rider with a pending deletion request from {@code previous}. */
    private Actor pending(String previous) {
        Actor rider = rides.client();
        jdbc.sql("""
                        update client set name = 'Olena', language = 'uk', account_state = 'DELETION_PENDING',
                                          deletion_previous_state = :previous, deletion_requested_at = now()
                        where id = :id""")
                .param("previous", previous).param("id", rider.id()).update();
        return rider;
    }

    private String phone(Actor rider) {
        return jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
    }

    private Map<String, Object> client(Actor rider) {
        return jdbc.sql("""
                        select account_state, phone_normalized, phone_verified_at, name, language,
                               deletion_previous_state
                        from client where id = :id""")
                .param("id", rider.id()).query().singleRow();
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private ClientDeletionReview.Request request(Actor rider) {
        return review.pending(staff, null, 100).stream().filter(r -> r.clientId().equals(rider.id())).findFirst()
                .orElseThrow();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private long count(String sql, Actor rider) {
        return jdbc.sql(sql).param("id", rider.id()).query(Long.class).single();
    }

    // ------------------------------------------------------------ tests

    @Test
    void staffRejectAndTheAccountGoesBackToItsState() {
        Actor active = pending("ACTIVE");
        Actor blocked = pending("BLOCKED");
        assertThat(request(active).previousState()).isEqualTo("ACTIVE");
        assertThat(request(active).blockers().blocked()).isFalse();

        UUID command = UUID.randomUUID();
        assertThat(review.reject(staff, command, active.id(), "Asked by phone to keep it").accountState())
                .isEqualTo("ACTIVE");
        assertThat(client(active)).containsEntry("account_state", "ACTIVE").containsEntry("deletion_previous_state",
                null);
        // A repeat returns the first result; the same id with another reason is a conflict.
        assertThat(review.reject(staff, command, active.id(), "Asked by phone to keep it").accountState())
                .isEqualTo("ACTIVE");
        assertCode(() -> review.reject(staff, command, active.id(), "Another reason"), ErrorCode.IDEMPOTENCY_CONFLICT);
        // Nothing pending any more: neither decision is possible.
        assertCode(() -> review.complete(staff, UUID.randomUUID(), active.id(), "Too late"), ErrorCode.STATE_CONFLICT);
        assertCode(() -> review.reject(staff, UUID.randomUUID(), active.id(), "Again"), ErrorCode.STATE_CONFLICT);

        assertThat(review.reject(staff, UUID.randomUUID(), blocked.id(), "Keep the block").accountState())
                .isEqualTo("BLOCKED");
        assertThat(client(blocked)).containsEntry("account_state", "BLOCKED");
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'client_deletion.reject' and resource_id = :id")
                .param("id", active.id().toString()).query(Long.class).single()).isEqualTo(1);
    }

    @Test
    void onlyStaffWithThePermissionDecide() {
        Actor rider = pending("ACTIVE");
        Actor other = staff("support.manage");
        assertCode(() -> review.pending(other, null, 10), ErrorCode.ACCESS_DENIED);
        assertCode(() -> review.complete(other, UUID.randomUUID(), rider.id(), "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> review.reject(other, UUID.randomUUID(), rider.id(), "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> review.complete(staff, UUID.randomUUID(), rider.id(), " "), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> review.complete(staff, UUID.randomUUID(), rides.client().id(), "Never asked"),
                ErrorCode.STATE_CONFLICT);
        assertThat(client(rider)).containsEntry("account_state", "DELETION_PENDING");
    }

    @Test
    void anActiveOrderAnUnpaidDebtOrAnOpenCaseBlockCompletion() {
        UUID city = rides.city("test-client-deletion", "UAH", 125);

        // An active order.
        Actor ordering = rides.client();
        rides.driverNear(PICKUP);
        OrderView order = rides.order(ordering, city, PICKUP, DROPOFF);
        jdbc.sql("""
                        update client set account_state = 'DELETION_PENDING', deletion_previous_state = 'ACTIVE',
                                          deletion_requested_at = now() where id = :id""")
                .param("id", ordering.id()).update();
        assertThat(request(ordering).blockers().activeOrderId()).isEqualTo(order.id());
        assertCode(() -> review.complete(staff, UUID.randomUUID(), ordering.id(), "Done"), ErrorCode.STATE_CONFLICT);
        orders.cancel(ordering, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        assertThat(request(ordering).blockers().blocked()).isFalse();

        // An unpaid debt.
        Actor owing = pending("ACTIVE");
        UUID basis = UUID.randomUUID();
        ledger.post(new Ledger.Posting("test-debt:" + basis, "TEST", basis, "UAH", "Unpaid trip",
                List.of(Ledger.Line.debit(Ledger.Account.RIDER_RECEIVABLE, owing.id(), 4500),
                        Ledger.Line.credit(Ledger.Account.SUSPENSE, null, 4500))));
        assertThat(request(owing).blockers().debt()).containsExactly(new ClientDeletionReview.Amount("UAH", 4500));
        assertCode(() -> review.complete(staff, UUID.randomUUID(), owing.id(), "Done"), ErrorCode.STATE_CONFLICT);

        // An open support case of the rider; once resolved it does not block.
        Actor asking = rides.client();
        SupportCases.Case open = support.open(asking, UUID.randomUUID(), SupportCases.Category.OTHER, null,
                "A question", "Before I go");
        jdbc.sql("""
                        update client set account_state = 'DELETION_PENDING', deletion_previous_state = 'ACTIVE',
                                          deletion_requested_at = now() where id = :id""")
                .param("id", asking.id()).update();
        assertThat(request(asking).blockers().openSupportCases()).isEqualTo(1);
        assertCode(() -> review.complete(staff, UUID.randomUUID(), asking.id(), "Done"), ErrorCode.STATE_CONFLICT);
        jdbc.sql("update support_case set state = 'RESOLVED', resolution = 'Answered' where id = :id")
                .param("id", open.id()).update();
        assertThat(review.complete(staff, UUID.randomUUID(), asking.id(), "Done").accountState())
                .isEqualTo("ANONYMIZED");
    }

    @Test
    void completionAnonymizesTheClientAndEachModuleForgetsItsData() {
        Actor rider = pending("ACTIVE");
        String phone = phone(rider);
        IssuedSession session = auth.open(new VerifiedSubject(rider, "ACTIVE", false), "deletion-test");
        jdbc.sql("update client set account_state = 'DELETION_PENDING' where id = :id").param("id", rider.id())
                .update();

        // Data of the rider in other modules.
        jdbc.sql("""
                        insert into push_device (id, subject_type, subject_id, device_session_id, platform, token,
                                                 state, created_at, updated_at)
                        values (:id, 'CLIENT', :rider, :session, 'ANDROID', :token, 'ACTIVE', now(), now())""")
                .param("id", UUID.randomUUID()).param("rider", rider.id()).param("session", session.sessionId())
                .param("token", "fcm-" + UUID.randomUUID()).update();
        jdbc.sql("""
                        insert into notification (id, event_id, recipient_type, recipient_id, channel, template,
                                                  template_version, locale, title, body, data, state, next_attempt_at,
                                                  deadline, created_at)
                        values (:id, :event, 'CLIENT', :rider, 'PUSH', 'rider.trip-completed', 1, 'uk', 't', 'b',
                                '{}'::jsonb, 'PENDING', now() + interval '1 hour', now() + interval '2 hours', now())""")
                .param("id", UUID.randomUUID()).param("event", UUID.randomUUID()).param("rider", rider.id()).update();
        jdbc.sql("insert into address_search_request (rider_id, requested_at) values (:rider, now())")
                .param("rider", rider.id()).update();
        UUID merchant = UUID.randomUUID();
        jdbc.sql("""
                        insert into payment_merchant (id, provider, account, domain, secret_ref, currency, created_at)
                        values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                .param("id", merchant).param("account", "deletion_" + merchant).update();
        UUID card = UUID.randomUUID();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, state, created_at)
                        values (:id, :rider, :merchant, :token, '4111****1111', 'ACTIVE', now())""")
                .param("id", card).param("rider", rider.id()).param("merchant", merchant)
                .param("token", "rec-" + UUID.randomUUID()).update();
        jdbc.sql("""
                        insert into card_binding (id, client_id, merchant_id, reference, state, created_at, expires_at)
                        values (:id, :rider, :merchant, :reference, 'PENDING', now(), now() + interval '10 minutes')""")
                .param("id", UUID.randomUUID()).param("rider", rider.id()).param("merchant", merchant)
                .param("reference", "bind-" + UUID.randomUUID()).update();
        wallets.topUp(staff(RiderWallets.MANAGE_PERMISSION), UUID.randomUUID(), rider.id(), "UAH", 1200,
                "Goodwill");
        assertThat(request(rider).blockers().bonusesToBurn()).as("shown, not blocking")
                .containsExactly(new ClientDeletionReview.Amount("UAH", 1200));
        assertThat(request(rider).blockers().blocked()).isFalse();
        List<Map<String, Object>> journalBefore = journal(rider);

        UUID command = UUID.randomUUID();
        assertThat(review.complete(staff, command, rider.id(), "Confirmed by the rider").accountState())
                .isEqualTo("ANONYMIZED");
        assertThat(review.complete(staff, command, rider.id(), "Confirmed by the rider").accountState())
                .as("a repeat returns the first result").isEqualTo("ANONYMIZED");
        assertCode(() -> review.reject(staff, UUID.randomUUID(), rider.id(), "Too late"), ErrorCode.STATE_CONFLICT);

        Map<String, Object> anonymized = client(rider);
        assertThat(anonymized).containsEntry("account_state", "ANONYMIZED").containsEntry("phone_normalized", null)
                .containsEntry("phone_verified_at", null).containsEntry("name", null).containsEntry("language", null);
        assertThat(auth.verifyAccess(session.accessToken(), ApiAudience.RIDER)).as("the old token").isEmpty();
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'client_deletion.complete' and resource_id = :id""")
                .param("id", rider.id().toString()).query(Long.class).single()).isEqualTo(1);

        deliverEvents();
        assertThat(count("select count(*) from push_device where subject_id = :id", rider)).isZero();
        assertThat(count("select count(*) from notification where recipient_id = :id", rider)).isZero();
        assertThat(count("select count(*) from address_search_request where rider_id = :id", rider)).isZero();
        assertThat(jdbc.sql("select state, token from payment_card where id = :id").param("id", card).query()
                .singleRow()).containsEntry("state", "REMOVED").containsEntry("token", null);
        assertThat(count("select count(*) from card_binding where client_id = :id and state = 'PENDING'", rider))
                .isZero();

        // The bonuses burnt; every earlier journal line of the rider is still there.
        assertThat(walletBalance(rider)).isZero();
        List<Map<String, Object>> journalAfter = journal(rider);
        assertThat(journalAfter).containsAll(journalBefore);
        assertThat(journalAfter).hasSize(journalBefore.size() + 1);

        // A redelivered event changes nothing.
        UUID eventId = jdbc.sql("""
                        select event_id from outbox where event_type = 'ClientAnonymized' and aggregate_id = :id""")
                .param("id", rider.id()).query(UUID.class).single();
        jdbc.sql("delete from consumer_inbox where event_id = :id").param("id", eventId).update();
        jdbc.sql("update outbox set state = 'PENDING', next_attempt_at = now() where event_id = :id")
                .param("id", eventId).update();
        deliverEvents();
        assertThat(journal(rider)).isEqualTo(journalAfter);
        assertThat(walletBalance(rider)).isZero();

        // The phone is free: signing in with it makes a new client.
        UUID challenge = otp.requestChallenge(OtpAudience.CLIENT, phone, null, null).challengeId();
        VerifiedSubject again = otp.verify(challenge, delivery.sent.getLast().code());
        assertThat(again.actor().id()).isNotEqualTo(rider.id());
    }

    // ------------------------------------------------------------ the rider's side

    @Autowired
    ClientDeletions deletions;

    private String lastCode() {
        return delivery.sent.getLast().code();
    }

    private long sessionsOf(Actor rider) {
        return count("select count(*) from device_session where subject_id = :id and revoked_at is null", rider);
    }

    @Test
    void theRiderAsksWithADeletionCodeKeepsThisSessionAndMayCancel() {
        Actor rider = rides.client();
        IssuedSession current = auth.open(new VerifiedSubject(rider, "ACTIVE", false), "this-phone");
        IssuedSession other = auth.open(new VerifiedSubject(rider, "ACTIVE", false), "other-phone");

        UUID challenge = deletions.requestCode(rider, null, null).challengeId();
        String code = lastCode();
        String wrong = code.equals("000000") ? "111111" : "000000";
        assertCode(() -> deletions.request(rider, current.sessionId(), UUID.randomUUID(), challenge, wrong),
                ErrorCode.OTP_INVALID);
        assertThat(jdbc.sql("select attempts from otp_challenge where id = :id").param("id", challenge)
                .query(Integer.class).single()).as("a wrong code counts although the command failed").isEqualTo(1);
        assertThat(client(rider)).containsEntry("account_state", "ACTIVE");

        UUID command = UUID.randomUUID();
        ClientDeletions.Status status = deletions.request(rider, current.sessionId(), command, challenge, code);
        assertThat(status.accountState()).isEqualTo("DELETION_PENDING");
        assertThat(client(rider)).containsEntry("account_state", "DELETION_PENDING")
                .containsEntry("deletion_previous_state", "ACTIVE");
        assertThat(auth.verifyAccess(current.accessToken(), ApiAudience.RIDER)).as("this session stays").isPresent();
        assertThat(auth.verifyAccess(other.accessToken(), ApiAudience.RIDER)).as("the others end").isEmpty();
        // A repeat returns the first result without the used code; another body under the same id is a conflict.
        assertThat(deletions.request(rider, current.sessionId(), command, challenge, code).accountState())
                .isEqualTo("DELETION_PENDING");
        assertCode(() -> deletions.request(rider, current.sessionId(), command, challenge, wrong),
                ErrorCode.IDEMPOTENCY_CONFLICT);
        assertCode(() -> deletions.request(rider, current.sessionId(), UUID.randomUUID(), challenge, code),
                ErrorCode.OTP_INVALID);

        // Pending: the rider still signs in, but does not order.
        assertThat(auth.open(new VerifiedSubject(rider, "DELETION_PENDING", false), "again").accessToken())
                .isNotBlank();
        UUID city = rides.city("test-client-deletion", "UAH", 125);
        assertCode(() -> rides.order(rider, city, PICKUP, DROPOFF), ErrorCode.ACCOUNT_NOT_ACTIVE);

        UUID cancel = UUID.randomUUID();
        assertThat(deletions.cancel(rider, cancel).accountState()).isEqualTo("ACTIVE");
        assertThat(deletions.cancel(rider, cancel).accountState()).as("a repeat").isEqualTo("ACTIVE");
        assertCode(() -> deletions.cancel(rider, UUID.randomUUID()), ErrorCode.STATE_CONFLICT);
        assertThat(client(rider)).containsEntry("account_state", "ACTIVE").containsEntry("deletion_previous_state",
                null);
    }

    @Test
    void aBlockedRiderReturnsToBlockedAndAnAnonymizedOneCannotCancel() {
        Actor blocked = rides.client();
        jdbc.sql("update client set account_state = 'BLOCKED' where id = :id").param("id", blocked.id()).update();
        UUID challenge = deletions.requestCode(blocked, null, null).challengeId();
        assertThat(deletions.request(blocked, UUID.randomUUID(), UUID.randomUUID(), challenge, lastCode())
                .accountState()).isEqualTo("DELETION_PENDING");
        assertThat(deletions.cancel(blocked, UUID.randomUUID()).accountState()).isEqualTo("BLOCKED");

        Actor gone = pending("ACTIVE");
        review.complete(staff, UUID.randomUUID(), gone.id(), "Confirmed");
        assertCode(() -> deletions.cancel(gone, UUID.randomUUID()), ErrorCode.STATE_CONFLICT);
        assertCode(() -> review.complete(staff, UUID.randomUUID(), rides.client().id(), "From ACTIVE"),
                ErrorCode.STATE_CONFLICT);
    }

    @Test
    void codesNeverServeAnotherPurposeAndConfirmingCreatesNothing() {
        // A sign-in code does not confirm a deletion.
        Actor signingIn = rides.client();
        UUID signIn = otp.requestChallenge(OtpAudience.CLIENT, phone(signingIn), null, null).challengeId();
        String signInCode = lastCode();
        assertCode(() -> deletions.request(signingIn, UUID.randomUUID(), UUID.randomUUID(), signIn, signInCode),
                ErrorCode.OTP_INVALID);
        assertThat(otp.verify(signIn, signInCode).actor().id()).as("still good for signing in")
                .isEqualTo(signingIn.id());

        // A deletion code signs nobody in, and confirming it creates no account and no session.
        Actor deleting = rides.client();
        UUID deletion = deletions.requestCode(deleting, null, null).challengeId();
        String deletionCode = lastCode();
        assertCode(() -> otp.verify(deletion, deletionCode), ErrorCode.OTP_INVALID);
        assertCode(() -> otp.confirm(signingIn, deletion, deletionCode, taxi.blizz.identity.OtpPurpose.ACCOUNT_DELETION),
                ErrorCode.OTP_INVALID);
        long clients = jdbc.sql("select count(*) from client").query(Long.class).single();
        long sessions = sessionsOf(deleting);
        otp.confirm(deleting, deletion, deletionCode, taxi.blizz.identity.OtpPurpose.ACCOUNT_DELETION);
        assertThat(jdbc.sql("select count(*) from client").query(Long.class).single()).isEqualTo(clients);
        assertThat(sessionsOf(deleting)).isEqualTo(sessions);
        assertCode(() -> otp.confirm(deleting, deletion, deletionCode, taxi.blizz.identity.OtpPurpose.ACCOUNT_DELETION),
                ErrorCode.OTP_INVALID);
    }

    @Test
    void anOperatorCannotOrderForACallerWhoseAccountIsPending() {
        rides.city("test-client-deletion", "UAH", 125); // the pickup must be in a city
        UUID operatorId = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Operator', 'OPERATOR', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", operatorId).param("login", "deletion-op-" + operatorId)
                .param("permissions", new String[]{Orders.CREATE_PERMISSION}).update();
        Actor operator = new Actor(SubjectType.STAFF, operatorId);
        Actor pending = pending("ACTIVE");
        java.util.function.Function<String, taxi.blizz.operations.CreateOrder> phoneOrder = phone ->
                new taxi.blizz.operations.CreateOrder(null, "STANDARD", PICKUP, "Home", DROPOFF, "Work",
                        taxi.blizz.operations.PaymentMethod.CASH, UUID.randomUUID(),
                        taxi.blizz.operations.OrderChannel.PHONE, null,
                        new taxi.blizz.operations.CallerContact("Caller", phone));
        assertCode(() -> orders.create(operator, UUID.randomUUID(), phoneOrder.apply(phone(pending))),
                ErrorCode.ACCOUNT_NOT_ACTIVE);
        // A caller without an account goes on to the usual checks (here: the made-up quote).
        assertThatThrownBy(() -> orders.create(operator, UUID.randomUUID(), phoneOrder.apply("+380631234599")))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isNotEqualTo(ErrorCode.ACCOUNT_NOT_ACTIVE);
    }

    private List<Map<String, Object>> journal(Actor rider) {
        return jdbc.sql("""
                        select l.transaction_id, l.line_no, l.account, l.debit_minor, l.credit_minor
                        from journal_line l where l.party_id = :id order by l.transaction_id, l.line_no""")
                .param("id", rider.id()).query().listOfRows();
    }

    private long walletBalance(Actor rider) {
        return ledger.balances(Ledger.Account.RIDER_WALLET, rider.id()).stream()
                .mapToLong(b -> b.creditMinor() - b.debitMinor()).sum();
    }

    record Sent(PhoneNumber phone, String code, OtpAudience audience) {
    }

    static class CapturingDelivery implements OtpDelivery {
        final List<Sent> sent = new CopyOnWriteArrayList<>();

        @Override
        public void send(PhoneNumber phone, String code, OtpAudience audience) {
            sent.add(new Sent(phone, code, audience));
        }
    }

    @TestConfiguration(proxyBeanMethods = false)
    static class Capture {
        @Bean
        @Primary
        CapturingDelivery capturingDelivery() {
            return new CapturingDelivery();
        }
    }
}
