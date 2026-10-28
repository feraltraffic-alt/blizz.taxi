package taxi.blizz.telephony.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.telephony.OtpDeliveries;
import tools.jackson.databind.json.JsonMapper;

/**
 * One-time codes by SMS (TurboSMS) or by a call (Asterisk), the channel order of the admin panel with its fallback,
 * "call me instead", and the delivery record for support (ADR 0012 Q-18, issue #59). The providers are reached through
 * a recording transport, never the network; the channel order runs on the fake provider of the test profile.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OtpDeliveryTests {

    static final String PASSWORD = "Telephony-Test-2026";

    @Autowired
    OtpService otp;
    @Autowired
    ChannelOtpDelivery delivery;
    @org.springframework.test.context.bean.override.mockito.MockitoSpyBean
    FakeOtpSender fake;
    @Autowired
    OtpDeliveries deliveries;
    @Autowired
    Integrations integrations;
    @Autowired
    ServiceSettings settings;
    @Autowired
    JsonMapper json;
    @Autowired
    JdbcClient jdbc;

    @Autowired io.micrometer.core.instrument.MeterRegistry meters;
    @Autowired org.springframework.transaction.support.TransactionTemplate tx;

    @Test
    void smsAttemptMetricsFollowCommitAndExcludeVoiceFallback() {
        set(Map.of(Integrations.OTP_FALLBACK, "NONE"));
        for (OtpSender.State state : OtpSender.State.values()) {
            var existing = meters.find("blizz.sms.sent").tags("purpose", "OTP", "state", state.name()).counter();
            double before = existing == null ? 0 : existing.count();
            tx.executeWithoutResult(status -> {
                otp.requestChallenge(OtpAudience.CLIENT, newPhone(), null, null);
                status.setRollbackOnly();
            });
            var afterRollback = meters.find("blizz.sms.sent").tags("purpose", "OTP", "state", state.name()).counter();
            assertThat(afterRollback == null ? 0 : afterRollback.count()).isEqualTo(before);
            fake.next(state);
            otp.requestChallenge(OtpAudience.CLIENT, newPhone(), null, null);
            assertThat(meters.get("blizz.sms.sent").tags("purpose", "OTP", "state", state.name()).counter().count())
                    .isEqualTo(before + 1);
        }
        double beforeVoice = meters.find("blizz.sms.sent").tag("purpose", "OTP").counters().stream()
                .mapToDouble(io.micrometer.core.instrument.Counter::count).sum();
        otp.requestChallenge(OtpAudience.CLIENT, newPhone(), null, null, OtpChannel.VOICE);
        assertThat(meters.find("blizz.sms.sent").tag("purpose", "OTP").counters().stream()
                .mapToDouble(io.micrometer.core.instrument.Counter::count).sum()).isEqualTo(beforeVoice);
    }

    @Test
    void providerRunsWithoutAnActiveDatabaseTransaction() {
        for (OtpChannel channel : OtpChannel.values()) {
            OtpSender delegate = fake.sender(channel);
            OtpSender checked = new OtpSender() {
                public OtpChannel channel() { return delegate.channel(); }
                public String provider() { return delegate.provider(); }
                public Result send(PhoneNumber phone, String code, OtpAudience audience) {
                    assertThat(org.springframework.transaction.support.TransactionSynchronizationManager
                            .isActualTransactionActive()).as("provider must not hold a transaction").isFalse();
                    return delegate.send(phone, code, audience);
                }
            };
            org.mockito.Mockito.doReturn(checked).when(fake).sender(channel);
            otp.requestChallenge(OtpAudience.CLIENT, newPhone(), null, null, channel);
        }
    }

    Actor keys;
    Actor support;

    @BeforeEach
    void setUp() {
        keys = staff(Integrations.MANAGE_PERMISSION);
        support = staff(OtpDeliveries.VIEW_PERMISSION);
        fake.reset();
    }

    @AfterEach
    void cleanUp() {
        // Integration values are shared by every test class.
        set(Map.of(Integrations.OTP_CHANNEL, "", Integrations.OTP_FALLBACK, "", Integrations.OTP_TURBOSMS_TOKEN, "",
                Integrations.OTP_TURBOSMS_SENDER, "", Integrations.OTP_ASTERISK_ARI_URL, "",
                Integrations.OTP_ASTERISK_ARI_USER, "", Integrations.OTP_ASTERISK_ARI_PASSWORD, "",
                Integrations.OTP_ASTERISK_ENDPOINT, ""));
        fake.reset();
    }

    // ------------------------------------------------------------ fixtures

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, password_hash, created_at,
                                                updated_at)
                        values (:id, :login, 'Telephony', 'ADMIN', :permissions, 'ACTIVE', :hash, now(), now())""")
                .param("id", id).param("login", "otp-" + id).param("permissions", permissions)
                .param("hash", new BCryptPasswordEncoder(4).encode(PASSWORD)).update();
        return new Actor(SubjectType.STAFF, id);
    }

    /** Empty strings clear a value. */
    private void set(Map<String, String> values) {
        List<Integrations.Change> changes = values.entrySet().stream()
                .map(e -> new Integrations.Change(e.getKey(), e.getValue().isEmpty() ? null : e.getValue())).toList();
        integrations.change(keys, UUID.randomUUID(), PASSWORD, changes, "OTP delivery test");
    }

    private static String newPhone() {
        return "+38063" + String.format("%07d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000_000));
    }

    private List<OtpDeliveries.Attempt> attempts(String phone) {
        return deliveries.forPhone(support, phone, 100);
    }

    /** Records every request and answers with {@code answer}. */
    static final class Recording implements HttpTransport {
        record Request(String method, String url, Map<String, String> headers, String body) {
        }

        final List<Request> requests = new ArrayList<>();
        Function<Request, Response> answer;

        Recording(Function<Request, Response> answer) {
            this.answer = answer;
        }

        @Override
        public Response send(String method, String url, Map<String, String> headers, String body) {
            Request request = new Request(method, url, headers, body);
            requests.add(request);
            return answer.apply(request);
        }
    }

    private TelephonyProperties live() {
        return new TelephonyProperties("LIVE", "https://turbosms.test", Duration.ofSeconds(25), false,
                Duration.ofHours(4), false, false, Duration.ofHours(1), 268_435_456L, "PJSIP/{extension}", "blizz-outgoing",
                java.util.List.of("blizz-outgoing", "from-internal"));
    }

    // ------------------------------------------------------------ the channel order

    @Test
    void smsFirstThenACallWhenTheSmsFailsAndEveryAttemptIsRecordedWithoutTheCode() {
        String phone = newPhone();
        fake.next(OtpSender.State.FAILED);
        UUID challenge = otp.requestChallenge(OtpAudience.CLIENT, phone, null, null).challengeId();

        List<OtpDeliveries.Attempt> attempts = attempts(phone);
        assertThat(attempts).extracting(OtpDeliveries.Attempt::channel, OtpDeliveries.Attempt::state)
                .containsExactlyInAnyOrder(org.assertj.core.groups.Tuple.tuple("SMS", "FAILED"),
                        org.assertj.core.groups.Tuple.tuple("VOICE", "SENT"));
        assertThat(attempts).extracting(OtpDeliveries.Attempt::challengeId).containsOnly(challenge);
        String code = fake.last(phone).orElseThrow().code();
        assertThat(fake.last(phone).orElseThrow().channel()).isEqualTo(OtpChannel.VOICE);
        assertThat(jdbc.sql("""
                        select count(*) from otp_delivery
                        where coalesce(error, '') || coalesce(provider_ref, '') like :code""")
                .param("code", "%" + code + "%").query(Long.class).single()).as("never the code").isZero();
    }

    @Test
    void callMeInsteadAndTheAdminPanelDecideTheOrder() {
        assertThat(delivery.order(null)).containsExactly(OtpChannel.SMS, OtpChannel.VOICE);
        assertThat(delivery.order(OtpChannel.VOICE)).containsExactly(OtpChannel.VOICE, OtpChannel.SMS);

        set(Map.of(Integrations.OTP_CHANNEL, "voice", Integrations.OTP_FALLBACK, "NONE"));
        assertThat(delivery.order(null)).containsExactly(OtpChannel.VOICE);
        assertThat(delivery.order(OtpChannel.SMS)).containsExactly(OtpChannel.SMS, OtpChannel.VOICE);

        // "Call me instead" from the sign-in screen: the first attempt is a call.
        set(Map.of(Integrations.OTP_CHANNEL, "SMS", Integrations.OTP_FALLBACK, "VOICE"));
        String phone = newPhone();
        otp.requestChallenge(OtpAudience.DRIVER, phone, null, null, OtpChannel.VOICE);
        assertThat(attempts(phone)).singleElement().satisfies(a -> {
            assertThat(a.channel()).isEqualTo("VOICE");
            assertThat(a.audience()).isEqualTo("DRIVER");
        });

        // Without a fallback a failed channel is the end.
        set(Map.of(Integrations.OTP_FALLBACK, "NONE"));
        String lonely = newPhone();
        fake.next(OtpSender.State.UNKNOWN);
        otp.requestChallenge(OtpAudience.CLIENT, lonely, null, null);
        assertThat(attempts(lonely)).extracting(OtpDeliveries.Attempt::state).containsExactly("UNKNOWN");
        assertThat(fake.last(lonely)).isEmpty();

        assertThatThrownBy(() -> set(Map.of(Integrations.OTP_CHANNEL, "PIGEON")))
                .isInstanceOf(DomainException.class);
    }

    @Test
    void theResendDelayAndLimitsHoldForEveryChannel() {
        String phone = newPhone();
        otp.requestChallenge(OtpAudience.CLIENT, phone, null, null);
        assertThatThrownBy(() -> otp.requestChallenge(OtpAudience.CLIENT, phone, null, null, OtpChannel.VOICE))
                .as("asking for a call right after an SMS waits like any resend")
                .isInstanceOf(taxi.blizz.platform.RateLimitedException.class);
    }

    @Test
    void onlySupportSeesTheDeliveries() {
        assertThatThrownBy(() -> deliveries.forPhone(staff("orders.view"), newPhone(), 10))
                .isInstanceOfSatisfying(DomainException.class,
                        e -> assertThat(e.code()).isEqualTo(ErrorCode.ACCESS_DENIED));
    }

    // ------------------------------------------------------------ TurboSMS

    @Test
    @SuppressWarnings("unchecked")
    void turboSmsSendsTheNumberWithoutPlusAndReadsTheMessageId() {
        Recording http = new Recording(r -> new HttpTransport.Response(200, """
                {"response_code":0,"response_status":"OK","response_result":[{"phone":"380631234567",
                 "response_code":0,"message_id":"f83f8868-5e46-c6cf-e4fb-615e5a293754","response_status":"OK"}]}"""));
        TurboSmsSender sms = new TurboSmsSender(integrations, settings, live(), http, json);
        PhoneNumber phone = new PhoneNumber("+380631234567");

        assertThat(sms.send(phone, "123456", OtpAudience.CLIENT).state()).as("not configured")
                .isEqualTo(OtpSender.State.FAILED);
        assertThat(http.requests).isEmpty();

        set(Map.of(Integrations.OTP_TURBOSMS_TOKEN, "turbo-token-test", Integrations.OTP_TURBOSMS_SENDER, "Blizz"));
        OtpSender.Result sent = sms.send(phone, "123456", OtpAudience.CLIENT);
        assertThat(sent.state()).isEqualTo(OtpSender.State.SENT);
        assertThat(sent.providerRef()).isEqualTo("f83f8868-5e46-c6cf-e4fb-615e5a293754");
        Recording.Request request = http.requests.getFirst();
        assertThat(request.method()).isEqualTo("POST");
        assertThat(request.url()).isEqualTo("https://turbosms.test/message/send.json");
        assertThat(request.headers()).containsEntry("Authorization", "Bearer turbo-token-test");
        Map<String, Object> body = json.readValue(request.body(), Map.class);
        assertThat(body.get("recipients")).isEqualTo(List.of("380631234567"));
        assertThat((Map<String, Object>) body.get("sms")).containsEntry("sender", "Blizz")
                .hasEntrySatisfying("text", text -> assertThat((String) text).startsWith("Код 123456. "));
        assertThat(sms.text("123456", new PhoneNumber("+48512345678"))).as("a Polish number")
                .startsWith("Kod 123456. ");

        http.answer = r -> new HttpTransport.Response(200, """
                {"response_code":0,"response_status":"OK","response_result":[{"phone":"380631234567",
                 "response_code":406,"message_id":null,"response_status":"NOT_ALLOWED_RECIPIENT_COUNTRY"}]}""");
        assertThat(sms.send(phone, "123456", OtpAudience.CLIENT)).satisfies(r -> {
            assertThat(r.state()).isEqualTo(OtpSender.State.FAILED);
            assertThat(r.error()).contains("NOT_ALLOWED_RECIPIENT_COUNTRY");
        });
        http.answer = r -> new HttpTransport.Response(401, "");
        assertThat(sms.send(phone, "123456", OtpAudience.CLIENT).state()).isEqualTo(OtpSender.State.FAILED);
        http.answer = r -> {
            throw new UncheckedIOException(new IOException("timed out"));
        };
        assertThat(sms.send(phone, "123456", OtpAudience.CLIENT).state()).as("may still arrive: no retry here")
                .isEqualTo(OtpSender.State.UNKNOWN);
        assertThat(http.requests).hasSize(4);
    }

    // ------------------------------------------------------------ Asterisk

    @Test
    @SuppressWarnings("unchecked")
    void asteriskOriginatesACallThatSpeaksTheCode() {
        Recording http = new Recording(r -> new HttpTransport.Response(200, "{\"id\":\"1730000000.42\"}"));
        AsteriskVoiceSender voice = new AsteriskVoiceSender(integrations, live(), http, json);
        PhoneNumber phone = new PhoneNumber("+380631234567");
        assertThat(voice.send(phone, "654321", OtpAudience.DRIVER).state()).as("not configured")
                .isEqualTo(OtpSender.State.FAILED);

        set(Map.of(Integrations.OTP_ASTERISK_ARI_URL, "http://127.0.0.1:8088/", Integrations.OTP_ASTERISK_ARI_USER,
                "blizz", Integrations.OTP_ASTERISK_ARI_PASSWORD, "ari-secret", Integrations.OTP_ASTERISK_ENDPOINT,
                "PJSIP/{phone}@trunk"));
        OtpSender.Result sent = voice.send(phone, "654321", OtpAudience.DRIVER);
        assertThat(sent.state()).isEqualTo(OtpSender.State.SENT);
        assertThat(sent.providerRef()).isEqualTo("1730000000.42");
        Recording.Request request = http.requests.getFirst();
        String url = URLDecoder.decode(request.url(), StandardCharsets.UTF_8);
        assertThat(url).startsWith("http://127.0.0.1:8088/ari/channels?")
                .contains("endpoint=PJSIP/380631234567@trunk", "context=" + AsteriskVoiceSender.CONTEXT,
                        "extension=s", "priority=1", "timeout=25")
                .as("the code only in the channel variable, not in the address").doesNotContain("654321");
        assertThat(request.headers()).containsEntry("Authorization",
                "Basic " + Base64.getEncoder().encodeToString("blizz:ari-secret".getBytes(StandardCharsets.UTF_8)));
        assertThat((Map<String, Object>) json.readValue(request.body(), Map.class).get("variables"))
                .containsEntry("OTP_CODE", "654321");

        http.answer = r -> new HttpTransport.Response(400, "{\"message\":\"Allocation failed\"}");
        assertThat(voice.send(phone, "654321", OtpAudience.DRIVER).state()).isEqualTo(OtpSender.State.FAILED);
        assertThatThrownBy(() -> set(Map.of(Integrations.OTP_ASTERISK_ENDPOINT, "PJSIP/trunk")))
                .as("the number has to go somewhere").isInstanceOf(DomainException.class);
    }

    @Test
    void theConnectionCheckAsksBothProvidersAndSendsNothing() {
        set(Map.of(Integrations.OTP_TURBOSMS_TOKEN, "turbo-token-test", Integrations.OTP_ASTERISK_ARI_URL,
                "http://127.0.0.1:8088", Integrations.OTP_ASTERISK_ARI_USER, "blizz",
                Integrations.OTP_ASTERISK_ARI_PASSWORD, "ari-secret"));
        Recording http = new Recording(r -> r.url().contains("balance")
                ? new HttpTransport.Response(200, "{\"response_code\":0,\"response_result\":{\"balance\":12.5}}")
                : new HttpTransport.Response(200, "{\"system\":{\"version\":\"22\"}}"));
        Integrations.Check check = new OtpIntegrationCheck(integrations, live(), http, json).check();
        assertThat(check.ok()).isTrue();
        assertThat(check.message()).contains("TurboSMS", "Asterisk").doesNotContain("turbo-token-test", "ari-secret");
        assertThat(http.requests).extracting(Recording.Request::url)
                .containsExactly("https://turbosms.test/user/balance.json", "http://127.0.0.1:8088/ari/asterisk/info");

        http.answer = r -> new HttpTransport.Response(200, "{\"response_code\":103,\"response_status\":\"BAD_TOKEN\"}");
        assertThat(new OtpIntegrationCheck(integrations, live(), http, json).check().ok()).isFalse();
    }
}
