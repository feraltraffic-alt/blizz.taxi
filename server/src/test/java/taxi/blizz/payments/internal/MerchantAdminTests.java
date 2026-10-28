package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** Payment merchants and their keys in the admin panel (REQ-ADM-10). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class MerchantAdminTests {

    static final String PASSWORD = "Merchants-Test-2026";

    @Autowired
    MerchantAdmin admin;
    @Autowired
    Merchants merchants;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    PaymentNotifications notifications;

    Actor staff;

    @BeforeEach
    void setUp() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, password_hash, created_at,
                                                updated_at)
                        values (:id, :login, 'Money', 'ADMIN', :permissions, 'ACTIVE', :hash, now(), now())""")
                .param("id", id).param("login", "money-" + id)
                .param("permissions", new String[] {Integrations.MANAGE_PERMISSION})
                .param("hash", new BCryptPasswordEncoder(4).encode(PASSWORD)).update();
        staff = new Actor(SubjectType.STAFF, id);
    }

    @Test
    void aMerchantIsAddedWithItsKeyAndCitiesAndTheKeyIsNeverShown() {
        UUID kyiv = UUID.randomUUID();
        UUID lviv = UUID.randomUUID();
        String account = "panel_" + UUID.randomUUID().toString().substring(0, 8);
        MerchantAdmin.MerchantView added = admin.create(staff, UUID.randomUUID(), PASSWORD,
                new MerchantAdmin.NewMerchant("fake", account, "blizz.example", "UAH", "merchant-secret-0001",
                        List.of(kyiv)), "Kyiv merchant");
        assertThat(added.provider()).isEqualTo("FAKE");
        assertThat(added.secretSource()).isEqualTo("PANEL");
        assertThat(added.secretHint()).isEqualTo("…0001");
        assertThat(added.cityIds()).containsExactly(kyiv);
        assertThat(merchants.forCity(kyiv)).hasValueSatisfying(m -> {
            assertThat(m.secret()).isEqualTo("merchant-secret-0001");
            assertThat(m.toString()).doesNotContain("secret-0001");
        });

        MerchantAdmin.MerchantView changed = admin.change(staff, UUID.randomUUID(), PASSWORD, added.id(),
                new MerchantAdmin.MerchantChange(null, "merchant-secret-0002", List.of(kyiv, lviv)), "New key");
        assertThat(changed.secretHint()).isEqualTo("…0002");
        assertThat(merchants.forCity(lviv)).map(Merchant::secret).contains("merchant-secret-0002");
        assertThat(admin.list(staff)).anySatisfy(m -> assertThat(m.id()).isEqualTo(added.id()));

        String audit = jdbc.sql("select string_agg(coalesce(before::text, '') || after::text, ' ') from audit_log "
                + "where actor_id = :id").param("id", staff.id()).query(String.class).single();
        assertThat(audit).contains(account).doesNotContain("merchant-secret");

        Integrations.Check check = admin.check(staff, added.id());
        assertThat(check.message()).doesNotContain("merchant-secret");
    }

    @Test
    void theWrongPasswordAndBadInputAreRefused() {
        assertThatThrownBy(() -> admin.create(staff, UUID.randomUUID(), "wrong", new MerchantAdmin.NewMerchant(
                "WAYFORPAY", "acc", "blizz.example", "UAH", "s", List.of()), "x"))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.ACCESS_DENIED);
        assertThatThrownBy(() -> admin.create(staff, UUID.randomUUID(), PASSWORD, new MerchantAdmin.NewMerchant(
                "STRIPE", "acc", "blizz.example", "UAH", "s", List.of()), "x"))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        assertThatThrownBy(() -> admin.create(staff, UUID.randomUUID(), PASSWORD, new MerchantAdmin.NewMerchant(
                "WAYFORPAY", "acc", "blizz.example", "UAH", " ", List.of()), "x"))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        assertThatThrownBy(() -> admin.change(staff, UUID.randomUUID(), PASSWORD, UUID.randomUUID(),
                new MerchantAdmin.MerchantChange("blizz.example", null, null), "x"))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.NOT_FOUND);
    }

    /** A provider's notification about {@code reference}, signed with {@code key}. */
    private static java.util.Map<String, Object> signed(UUID merchantId, String account, String key,
                                                       String reference) {
        Merchant as = new Merchant(merchantId, "WAYFORPAY", account, "blizz.example", key, "UAH");
        java.util.Map<String, Object> body = new java.util.LinkedHashMap<>();
        body.put("merchantAccount", account);
        body.put("orderReference", reference);
        body.put("amount", "1.00");
        body.put("currency", "UAH");
        body.put("authCode", "");
        body.put("cardPan", "41****1111");
        body.put("transactionStatus", "Approved");
        body.put("reasonCode", "1100");
        body.put("merchantSignature", WayForPayProvider.sign(as, account, reference, "1.00", "UAH", "", "41****1111",
                "Approved", "1100"));
        return body;
    }

    private String outcomeOf(String reference) {
        return jdbc.sql("select outcome from payment_event where reference = :ref").param("ref", reference)
                .query(String.class).single();
    }

    /** REQ-SEC-09: after a key change the old key is still accepted for notifications for a while, then never. */
    @Test
    void afterAKeyChangeTheOldKeySignsNotificationsUntilItsWindowEnds() {
        String account = "rotate_" + UUID.randomUUID().toString().substring(0, 8);
        MerchantAdmin.MerchantView merchant = admin.create(staff, UUID.randomUUID(), PASSWORD,
                new MerchantAdmin.NewMerchant("wayforpay", account, "blizz.example", "UAH", "old-key-0001",
                        List.of(UUID.randomUUID())), "Merchant");
        admin.change(staff, UUID.randomUUID(), PASSWORD, merchant.id(),
                new MerchantAdmin.MerchantChange(null, "new-key-0002", null), "The key leaked");

        String fresh = "card-" + UUID.randomUUID();
        assertThat(notifications.receive(merchant.id(), signed(merchant.id(), account, "new-key-0002", fresh))
                .trusted()).isTrue();
        assertThat(outcomeOf(fresh)).doesNotContain("previous key");

        String late = "card-" + UUID.randomUUID();
        assertThat(notifications.receive(merchant.id(), signed(merchant.id(), account, "old-key-0001", late))
                .trusted()).as("a payment under way when the key changed").isTrue();
        assertThat(outcomeOf(late)).contains("previous key");

        String forged = "card-" + UUID.randomUUID();
        assertThat(notifications.receive(merchant.id(), signed(merchant.id(), account, "guessed-key", forged))
                .trusted()).isFalse();

        jdbc.sql("update payment_merchant set previous_secret_until = now() - interval '1 second' where id = :id")
                .param("id", merchant.id()).update();
        String tooLate = "card-" + UUID.randomUUID();
        assertThat(notifications.receive(merchant.id(), signed(merchant.id(), account, "old-key-0001", tooLate))
                .trusted()).as("the window has passed").isFalse();

        // A second change keeps only the key just replaced, never an older one.
        admin.change(staff, UUID.randomUUID(), PASSWORD, merchant.id(),
                new MerchantAdmin.MerchantChange(null, "third-key-0003", null), "Routine rotation");
        String again = "card-" + UUID.randomUUID();
        assertThat(notifications.receive(merchant.id(), signed(merchant.id(), account, "old-key-0001", again))
                .trusted()).isFalse();
        String second = "card-" + UUID.randomUUID();
        assertThat(notifications.receive(merchant.id(), signed(merchant.id(), account, "new-key-0002", second))
                .trusted()).isTrue();
    }
}
