package taxi.blizz.telephony.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Map;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.files.FileService;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.CallerContact;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderChannel;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.telephony.Calls;
import taxi.blizz.telephony.FakeCallEvents;

/**
 * Call recordings (issue #60, ADR 0012 Q-18 p. 5) on the fake source: a taken call is recorded, the recording is kept
 * encrypted in the files module, linked to the call and through it to the order, listened to only with calls.listen
 * for the call's city, every listening audited; a missed call has none, and Asterisk without a file ends as NONE.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
class CallRecordingTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 66.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 66.55);

    @Value("${local.server.port}")
    int port;
    @Value("${blizz.files.local-dir}")
    Path filesDir;
    @Autowired
    FakeCallEvents asterisk;
    @Autowired
    Calls calls;
    @Autowired
    JdbcCalls log;
    @Autowired
    CallRecordings recordings;
    @Autowired
    FileService files;
    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    SessionService auth;
    @Autowired
    QuoteService quotes;
    @Autowired
    JdbcClient jdbc;

    final HttpClient http = HttpClient.newHttpClient();
    UUID cityId;
    String line;

    @BeforeEach
    void setUp() {
        cityId = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes).city("test-recordings", "UAH", 66);
        line = newPhone("+38044");
        jdbc.sql("insert into call_line (number, city_id, version, updated_at) values (:n, :c, 1, now())")
                .param("n", line).param("c", cityId).update();
    }

    // ------------------------------------------------------------ fixtures

    private static String newPhone(String prefix) {
        return taxi.blizz.TestPhones.unique(prefix, 7);
    }

    private Actor staff(UUID city, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Operator', 'OPERATOR', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "recordings-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static String channel() {
        return "1730053000." + Math.floorMod(UUID.randomUUID().hashCode(), 1_000_000);
    }

    private void created(String channel, String caller) {
        asterisk.push("""
                {"type":"ChannelCreated","timestamp":"2026-10-27T18:00:00.000+0000",
                 "channel":{"id":"%s","state":"Ring","linkedid":"%s",
                 "caller":{"name":"","number":"%s"},"dialplan":{"context":"from-trunk","exten":"%s"}}}"""
                .formatted(channel, channel, caller.replace("+", ""), line.replace("+", "")));
    }

    private void up(String channel) {
        asterisk.push("{\"type\":\"ChannelStateChange\",\"channel\":{\"id\":\"%s\",\"state\":\"Up\"}}"
                .formatted(channel));
    }

    private void destroyed(String channel) {
        asterisk.push("{\"type\":\"ChannelDestroyed\",\"cause\":16,\"channel\":{\"id\":\"%s\",\"state\":\"Up\"}}"
                .formatted(channel));
    }

    private Calls.Call call(String channel) {
        UUID id = jdbc.sql("select id from call where channel_id = :c").param("c", channel).query(UUID.class)
                .single();
        return calls.find(id).orElseThrow();
    }

    private HttpResponse<byte[]> listen(Actor who, UUID callId) throws Exception {
        String token = auth.openStaff(new VerifiedSubject(who, "ACTIVE", false), ApiAudience.OPERATOR, "rec-test")
                .accessToken();
        return http.send(HttpRequest.newBuilder(
                                URI.create("http://localhost:" + port + "/api/operator/v1/calls/" + callId + "/recording"))
                        .header("Authorization", "Bearer " + token)
                        .header("Range", "bytes=0-") // what an audio player sends
                        .GET().build(),
                HttpResponse.BodyHandlers.ofByteArray());
    }

    private long listenings(UUID callId) {
        return jdbc.sql("""
                        select count(*) from audit_log
                        where action = 'call_recording.listen' and resource_type = 'call' and resource_id = :id""")
                .param("id", callId.toString()).query(Long.class).single();
    }

    private void fetchUntilSettled() {
        while (recordings.fetchDue() > 0) {
            // other tests' calls may be due as well
        }
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    // ------------------------------------------------------------ recorded, encrypted, listened to

    @Test
    void aTakenCallIsRecordedEncryptedAndListenedToOnlyWithTheRightAndAudited() throws Exception {
        Actor operator = staff(cityId, Calls.ANSWER_PERMISSION, Orders.CREATE_PERMISSION, Orders.CANCEL_PERMISSION);
        Actor supervisor = staff(cityId, Calls.LISTEN_PERMISSION);
        Actor elsewhere = staff(UUID.randomUUID(), Calls.LISTEN_PERMISSION);
        String channel = channel();
        String caller = newPhone("+38067");
        created(channel, caller);
        UUID callId = call(channel).id();
        calls.answer(operator, UUID.randomUUID(), callId);
        up(channel);
        assertThat(call(channel).recording()).as("not over yet").isNull();
        UUID quote = new TestQuotes(jdbc, quotes).quote(operator, cityId, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.createDuringCall(operator, UUID.randomUUID(), new CreateOrder(null, "STANDARD",
                PICKUP, "Home", DROPOFF, "Work", PaymentMethod.CASH, quote, OrderChannel.PHONE, null,
                new CallerContact("Caller", caller)), callId, false);
        destroyed(channel);
        assertThat(call(channel).recording().state()).isEqualTo(Calls.RecordingState.PENDING);
        destroyed(channel); // a repeat
        assertThat(jdbc.sql("select count(*) from call_recording where call_id = :c").param("c", callId)
                .query(Long.class).single()).isEqualTo(1);

        fetchUntilSettled();
        Calls.Recording recording = call(channel).recording();
        assertThat(recording.state()).isEqualTo(Calls.RecordingState.STORED);
        assertThat(recording.durationSeconds()).isEqualTo(2);
        assertThat(recording.storedAt()).isNotNull();

        // Kept in the files module, by the server itself, encrypted at rest.
        Map<String, Object> file = jdbc.sql("""
                        select f.id, f.owner_type, f.owner_id, f.purpose, f.state, f.encryption, f.storage_key,
                               f.size_bytes
                        from call_recording r join file_object f on f.id = r.file_id where r.call_id = :c""")
                .param("c", callId).query().singleRow();
        assertThat(file).containsEntry("owner_type", "SYSTEM").containsEntry("purpose", "CALL_RECORDING")
                .containsEntry("state", "SAFE").containsEntry("encryption", "AES256GCM-STREAM-1");
        assertThat(file.get("owner_id")).isNull();
        byte[] atRest = Files.readAllBytes(filesDir.resolve((String) file.get("storage_key")));
        String raw = new String(atRest, StandardCharsets.ISO_8859_1);
        assertThat(raw).as("no WAV header on disk").doesNotContain("RIFF").doesNotContain("WAVE");
        assertThat(atRest.length).isGreaterThan(((Number) file.get("size_bytes")).intValue());
        UUID fileId = (UUID) file.get("id");
        assertCode(() -> files.open(supervisor, fileId), ErrorCode.NOT_FOUND);

        // Listening: the right for the call's city, the whole file, never cached, every time in the audit.
        HttpResponse<byte[]> heard = listen(supervisor, callId);
        assertThat(heard.statusCode()).isEqualTo(200);
        assertThat(heard.headers().firstValue("Content-Type")).hasValue("audio/wav");
        assertThat(heard.headers().firstValue("Cache-Control").orElse("")).contains("no-store");
        assertThat(heard.headers().firstValue("Accept-Ranges")).hasValue("none");
        assertThat(heard.body()).isEqualTo(WavFiles.tone(2));
        assertThat(listenings(callId)).isEqualTo(1);
        assertThat(listen(supervisor, callId).statusCode()).isEqualTo(200);
        assertThat(listenings(callId)).isEqualTo(2);
        String details = jdbc.sql("""
                        select after::text from audit_log
                        where action = 'call_recording.listen' and resource_id = :id and actor_id = :who limit 1""")
                .param("id", callId.toString()).param("who", supervisor.id()).query(String.class).single();
        assertThat(details).contains(fileId.toString()).contains(order.id().toString());

        assertThat(listen(operator, callId).statusCode()).as("taking calls is not listening").isEqualTo(403);
        assertThat(listen(elsewhere, callId).statusCode()).as("another city").isEqualTo(403);
        assertThat(listen(supervisor, UUID.randomUUID()).statusCode()).isEqualTo(404);
        assertThat(listenings(callId)).as("refusals are not listenings").isEqualTo(2);

        // Found through the order; listeners see the log of their cities too.
        assertThat(calls.recent(supervisor, null, order.id(), 10)).extracting(Calls.Call::id).containsExactly(callId);
        assertThat(calls.recent(elsewhere, null, order.id(), 10)).as("another city").isEmpty();

        orders.cancel(operator, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "NO_CARS");
        assertThat(call(channel).recording().state()).as("the order's end does not touch the recording")
                .isEqualTo(Calls.RecordingState.STORED);
    }

    // ------------------------------------------------------------ no recording

    @Test
    void aMissedCallHasNoRecordingAndAsteriskWithoutAFileEndsAsNone() throws Exception {
        String missed = channel();
        created(missed, newPhone("+38067"));
        destroyed(missed);
        assertThat(call(missed).recording()).isNull();

        String silent = channel();
        asterisk.withoutRecording(silent);
        created(silent, newPhone("+38067"));
        up(silent);
        destroyed(silent);
        UUID callId = call(silent).id();
        fetchUntilSettled();
        Map<String, Object> pending = jdbc.sql("""
                        select state, attempts, next_attempt_at > now() + interval '20 seconds' as later
                        from call_recording where call_id = :c""")
                .param("c", callId).query().singleRow();
        assertThat(pending).containsEntry("state", "PENDING").containsEntry("attempts", 1)
                .as("tried again later").containsEntry("later", true);

        // Still no file an hour later: there is none.
        jdbc.sql("""
                        update call_recording set created_at = now() - interval '2 hours', next_attempt_at = now()
                        where call_id = :c""").param("c", callId).update();
        fetchUntilSettled();
        assertThat(call(silent).recording().state()).isEqualTo(Calls.RecordingState.NONE);
        Actor supervisor = staff(cityId, Calls.LISTEN_PERMISSION);
        assertThat(listen(supervisor, callId).statusCode()).isEqualTo(404);
        assertThat(listenings(callId)).isZero();
    }

    @Test
    void aTakenCallWhoseEndWasNeverReportedIsRecordedToo() {
        String lost = channel();
        created(lost, newPhone("+38067"));
        up(lost);
        jdbc.sql("update call set started_at = now() - interval '5 hours' where channel_id = :c").param("c", lost)
                .update();
        log.closeStale(Duration.ofHours(4));
        assertThat(call(lost).state()).isEqualTo(Calls.State.ENDED);
        assertThat(call(lost).recording().state()).isEqualTo(Calls.RecordingState.PENDING);
        fetchUntilSettled();
        assertThat(call(lost).recording().state()).isEqualTo(Calls.RecordingState.STORED);
    }

    @Test
    void retriesWaitLongerEachTimeUpToHalfAnHour() {
        assertThat(CallRecordings.pause(1)).isEqualTo(Duration.ofSeconds(30));
        assertThat(CallRecordings.pause(2)).isEqualTo(Duration.ofMinutes(1));
        assertThat(CallRecordings.pause(5)).isEqualTo(Duration.ofMinutes(8));
        assertThat(CallRecordings.pause(7)).isEqualTo(Duration.ofMinutes(30));
        assertThat(CallRecordings.pause(1000)).isEqualTo(Duration.ofMinutes(30));
    }
}
