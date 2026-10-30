package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.DriverBalances;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.payments.CardTopUps;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;

/** Topping up the rider's bonus account and the driver's balance by card (ADR 0009 p. 1, ADR 0010 p. 1). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CardTopUpTests {

    /** Longitude 110…111, latitude −40…−39: no other test city is there. */
    private static final String AREA = "SRID=4326;MULTIPOLYGON(((110 -40,111 -40,111 -39,110 -39,110 -40)))";

    @Autowired CardTopUps topUps;
    @Autowired JdbcCardTopUps jdbcTopUps;
    @Autowired FakeVerifyController fakePages;
    @Autowired FakeProvider.Gateway gateway;
    @Autowired RiderWallets wallets;
    @Autowired DriverBalances balances;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;

    private UUID cityId;
    private UUID merchantId;
    private Actor rider;
    private Actor driver;

    @BeforeEach
    void setUp() {
        cityId = jdbc.sql("select id from city where code = 'test-top-ups'").query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, 'test-top-ups', 'Top-up test', 'UAH', 'UTC', ST_GeomFromEWKT(:area),
                                            7650, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("area", AREA).update();
                    return id;
                });
        merchantId = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", cityId).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "topups_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                            .param("city", cityId).param("merchant", id).update();
                    return id;
                });
        gateway.reset();
        drain();
        UUID clientId = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", clientId)
                .param("phone", taxi.blizz.TestPhones.unique("+48", 9))
                .update();
        rider = new Actor(SubjectType.CLIENT, clientId);
        UUID driverId = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", driverId)
                .param("phone", taxi.blizz.TestPhones.unique("+38097", 7))
                .update();
        driver = new Actor(SubjectType.DRIVER, driverId);
    }

    @Test
    void riderPaysOnThePageAndTheBonusAccountIsCreditedOnce() {
        CardTopUps.TopUp started = topUps.start(rider, UUID.randomUUID(), cityId, 15_000);
        assertThat(started.state()).isEqualTo("PENDING");
        assertThat(started.currency()).isEqualTo("UAH");
        assertThat(started.url()).endsWith("/payments/v1/fake/pay");
        assertThat(started.fields()).containsEntry("amount", "150.00").containsKey("merchantSignature");

        assertThat(pay(started).getStatusCode().value()).isEqualTo(303);
        pay(started); // the provider repeats its notification
        drain();

        CardTopUps.TopUp done = topUps.topUp(rider, started.id());
        assertThat(done.state()).isEqualTo("COMPLETED");
        assertThat(done.maskedPan()).startsWith("41****");
        assertThat(done.url()).isNull();
        RiderWallets.Wallet wallet = wallets.mine(rider, 10);
        assertThat(wallet.balances()).singleElement().satisfies(b -> {
            assertThat(b.currency()).isEqualTo("UAH");
            assertThat(b.balanceMinor()).isEqualTo(15_000);
        });
        assertThat(wallet.entries()).singleElement().satisfies(e -> {
            assertThat(e.kind()).isEqualTo("CARD_TOP_UP");
            assertThat(e.amountMinor()).isEqualTo(15_000);
            assertThat(e.orderId()).isNull();
        });
        assertThat(clearingDebit(started.id())).isEqualTo(15_000);
    }

    @Test
    void driverTopUpGoesToTheBalance() {
        CardTopUps.TopUp started = topUps.start(driver, UUID.randomUUID(), cityId, 50_000);
        pay(started);
        drain();

        DriverBalances.Statement statement = balances.mine(driver, 10);
        assertThat(statement.balances()).singleElement()
                .satisfies(b -> assertThat(b.balanceMinor()).isEqualTo(50_000));
        assertThat(statement.entries()).singleElement().satisfies(e -> {
            assertThat(e.kind()).isEqualTo("CARD_TOP_UP");
            assertThat(e.orderId()).isNull();
        });
        // Each payer sees only own top-ups.
        assertThatThrownBy(() -> topUps.topUp(rider, started.id()))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.NOT_FOUND);
    }

    @Test
    void aDeclineFailsTheTopUpButALateApprovalIsStillCredited() {
        CardTopUps.TopUp started = topUps.start(rider, UUID.randomUUID(), cityId, 20_000);
        pay(started, "fake_decline");
        assertThat(topUps.topUp(rider, started.id()).state()).isEqualTo("FAILED");
        assertThat(topUps.topUp(rider, started.id()).failureReason()).isEqualTo("Card declined");

        // The rider tried another card on the same page and the bank took the money.
        pay(started);
        drain();
        assertThat(topUps.topUp(rider, started.id()).state()).isEqualTo("COMPLETED");
        assertThat(wallets.mine(rider, 10).balances().getFirst().balanceMinor()).isEqualTo(20_000);
    }

    @Test
    void aLostNotificationIsReconciledWithCheckStatus() {
        CardTopUps.TopUp started = topUps.start(driver, UUID.randomUUID(), cityId, 30_000);
        pay(started, "fake_lost_notification");
        assertThat(topUps.topUp(driver, started.id()).state()).isEqualTo("PENDING");

        jdbc.sql("update card_top_up set next_check_at = now() - interval '1 second' where id = :id")
                .param("id", started.id()).update();
        assertThat(jdbcTopUps.reconcile()).isGreaterThanOrEqualTo(1);
        drain();

        assertThat(topUps.topUp(driver, started.id()).state()).isEqualTo("COMPLETED");
        assertThat(balances.mine(driver, 10).balances().getFirst().balanceMinor()).isEqualTo(30_000);
        assertThat(gateway.requests()).anySatisfy(r -> assertThat(r.get("transactionType")).isEqualTo("CHECK_STATUS"));
    }

    @Test
    void anUnpaidPageFailsAndAnUnknownResultExpiresOnlyAfterTheReconcileWindow() {
        CardTopUps.TopUp unpaid = topUps.start(rider, UUID.randomUUID(), cityId, 10_000);
        jdbc.sql("update card_top_up set next_check_at = now() - interval '1 second' where id = :id")
                .param("id", unpaid.id()).update();
        jdbcTopUps.reconcile(); // the bank does not know the reference
        assertThat(topUps.topUp(rider, unpaid.id()).state()).isEqualTo("FAILED");

        CardTopUps.TopUp unknown = topUps.start(rider, UUID.randomUUID(), cityId, 10_000);
        jdbc.sql("""
                        update card_top_up set next_check_at = now() - interval '1 second',
                            expires_at = now() - interval '1 hour'
                        where id = :id""")
                .param("id", unknown.id()).update();
        gateway.next("TIMEOUT");
        jdbcTopUps.reconcile();
        assertThat(topUps.topUp(rider, unknown.id()).state()).isEqualTo("PENDING");

        jdbc.sql("""
                        update card_top_up set next_check_at = now() - interval '1 second',
                            expires_at = now() - interval '3 days'
                        where id = :id""")
                .param("id", unknown.id()).update();
        gateway.next("TIMEOUT");
        jdbcTopUps.reconcile();
        assertThat(topUps.topUp(rider, unknown.id()).state()).isEqualTo("EXPIRED");
        drain();
        assertThat(wallets.mine(rider, 10).balances()).isEmpty();
    }

    @Test
    void aDifferentAmountIsNeverCreditedAndATamperedFormIsRejected() {
        CardTopUps.TopUp started = topUps.start(rider, UUID.randomUUID(), cityId, 12_000);
        String reference = started.fields().get("orderReference");
        assertThat(jdbcTopUps.apply(merchantId, reference, PaymentProvider.Outcome.SUCCEEDED, 12_001L, "UAH", null,
                null)).contains("TOP_UP_AMOUNT_MISMATCH");
        assertThat(jdbcTopUps.apply(merchantId, reference, PaymentProvider.Outcome.SUCCEEDED, 12_000L, "PLN", null,
                null)).contains("TOP_UP_AMOUNT_MISMATCH");
        assertThat(topUps.topUp(rider, started.id()).state()).isEqualTo("PENDING");

        MultiValueMap<String, String> form = form(started);
        form.set("amount", "1.00"); // the signature covers the amount
        assertThat(fakePages.pay(form).getStatusCode().value()).isEqualTo(400);
        drain();
        assertThat(topUps.topUp(rider, started.id()).state()).isEqualTo("PENDING");
        assertThat(wallets.mine(rider, 10).balances()).isEmpty();
    }

    @Test
    void startIsIdempotentAndChecksWhoAndHowMuch() {
        UUID command = UUID.randomUUID();
        CardTopUps.TopUp first = topUps.start(rider, command, cityId, 10_000);
        assertThat(topUps.start(rider, command, cityId, 10_000).id()).isEqualTo(first.id());
        assertThat(jdbc.sql("select count(*) from card_top_up where account_id = :id").param("id", rider.id())
                .query(Long.class).single()).isEqualTo(1);
        assertCode(() -> topUps.start(rider, command, cityId, 10_001), ErrorCode.IDEMPOTENCY_CONFLICT);

        assertCode(() -> topUps.start(rider, UUID.randomUUID(), cityId, 99), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> topUps.start(rider, UUID.randomUUID(), cityId, 1_000_001), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> topUps.start(rider, UUID.randomUUID(), UUID.randomUUID(), 10_000), ErrorCode.NOT_FOUND);
        assertCode(() -> topUps.start(new Actor(SubjectType.STAFF, UUID.randomUUID()), UUID.randomUUID(), cityId,
                10_000), ErrorCode.ACCESS_DENIED);
    }

    private org.springframework.http.ResponseEntity<Void> pay(CardTopUps.TopUp topUp, String... flags) {
        MultiValueMap<String, String> form = form(topUp);
        for (String flag : flags) {
            form.add(flag, "1");
        }
        return fakePages.pay(form);
    }

    private static MultiValueMap<String, String> form(CardTopUps.TopUp topUp) {
        MultiValueMap<String, String> form = new LinkedMultiValueMap<>();
        for (Map.Entry<String, String> field : topUp.fields().entrySet()) {
            form.add(field.getKey(), field.getValue());
        }
        return form;
    }

    private long clearingDebit(UUID topUpId) {
        return jdbc.sql("""
                        select coalesce(sum(l.debit_minor), 0) from journal_line l
                        join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :id and l.account = 'PROVIDER_CLEARING'""")
                .param("id", topUpId).query(Long.class).single();
    }

    private void drain() {
        while (relay.runOnce() > 0) {
            // deliver everything published so far
        }
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
