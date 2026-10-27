package taxi.blizz.location;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/** T-14 acceptance tests on the real PostgreSQL/PostGIS schema. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverLocationApiTests {

    @Autowired WebApplicationContext context;
    @Autowired SessionService sessions;
    @Autowired TrackService tracks;
    @Autowired JdbcClient jdbc;
    @Autowired JsonMapper json;

    MockMvc mvc;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        jdbc.sql("delete from location_batch_request").update();
        jdbc.sql("delete from track_point").update();
    }

    @Test
    void outOfOrderPointsAreReadByRecordedTimeAndDuplicateSequenceIsCounted() throws Exception {
        DriverToken driver = driver();
        OffsetDateTime base = OffsetDateTime.now(ZoneOffset.UTC).minusMinutes(2);
        UUID command = UUID.randomUUID();
        MvcResult stored = send(driver.session(), command, List.of(
                point(2, 50.2, 30.2, 5, base.plusSeconds(20)),
                point(1, 50.0, 30.0, 5, base),
                point(3, 50.1, 30.1, 5, base.plusSeconds(10))));
        assertThat(stored.getResponse().getStatus()).isEqualTo(200);
        assertThat(body(stored)).containsEntry("accepted", 3).containsEntry("duplicates", 0);

        assertThat(tracks.points(driver.id(), base.minusSeconds(1), base.plusMinutes(1)))
                .extracting(TrackService.TrackPoint::sequence)
                .containsExactly(1L, 3L, 2L);

        MvcResult duplicate = send(driver.session(), UUID.randomUUID(),
                List.of(point(2, 0, 0, 4, base.plusSeconds(30))));
        assertThat(body(duplicate)).containsEntry("accepted", 0).containsEntry("duplicates", 1);
    }

    @Test
    void futurePoorAccuracyAndImpossibleJumpAreStoredWithFlags() throws Exception {
        DriverToken driver = driver();
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        MvcResult result = send(driver.session(), UUID.randomUUID(), List.of(
                point(10, 50.0, 30.0, 5, now.minusSeconds(10)),
                point(11, 51.0, 30.0, 5, now.minusSeconds(9)),
                point(12, 51.0, 30.0, 100, now.minusSeconds(8)),
                point(13, 51.0, 30.0, 5, now.plusMinutes(1))));
        assertThat(result.getResponse().getStatus()).isEqualTo(200);

        Map<Long, java.util.Set<TrackService.Flag>> flags = new LinkedHashMap<>();
        for (TrackService.TrackPoint point : tracks.points(driver.id(), now.minusMinutes(1), now.plusMinutes(2))) {
            flags.put(point.sequence(), point.flags());
        }
        assertThat(flags.get(10L)).isEmpty();
        assertThat(flags.get(11L)).contains(TrackService.Flag.JUMP);
        assertThat(flags.get(12L)).contains(TrackService.Flag.POOR_ACCURACY);
        assertThat(flags.get(13L)).contains(TrackService.Flag.FUTURE);
        assertThat(jdbc.sql("select count(*) from track_point where cardinality(flags) > 0")
                .query(Integer.class).single()).isGreaterThanOrEqualTo(3);
    }

    @Test
    void batchLimitAndBackpressureAreEnforced() throws Exception {
        DriverToken driver = driver();
        OffsetDateTime at = OffsetDateTime.now(ZoneOffset.UTC).minusMinutes(1);
        List<Map<String, Object>> tooMany = new ArrayList<>();
        for (int i = 0; i < 101; i++) tooMany.add(point(i, 50, 30, 5, at.plusSeconds(i)));
        assertThat(send(driver.session(), UUID.randomUUID(), tooMany).getResponse().getStatus()).isEqualTo(400);

        for (int i = 0; i < 30; i++) {
            MvcResult ok = send(driver.session(), UUID.randomUUID(),
                    List.of(point(1000 + i, 50, 30, 5, at.plusSeconds(i))));
            assertThat(ok.getResponse().getStatus()).isEqualTo(200);
        }
        MvcResult limited = send(driver.session(), UUID.randomUUID(),
                List.of(point(2000, 50, 30, 5, at)));
        assertThat(limited.getResponse().getStatus()).isEqualTo(429);
        assertThat(limited.getResponse().getHeader(HttpHeaders.RETRY_AFTER)).isNotBlank();
        assertThat(body(limited)).containsEntry("code", "RATE_LIMITED");
    }

    @Test
    void repeatedCommandReturnsSameCountsAndNeverMovesWorkSessionLocation() throws Exception {
        DriverToken driver = driver();
        WorkSessionFixture work = workSession(driver);
        OffsetDateTime at = OffsetDateTime.now(ZoneOffset.UTC).minusMinutes(5);
        UUID command = UUID.randomUUID();
        List<Map<String, Object>> points = List.of(point(1, 49.0, 29.0, 6, at));

        MvcResult first = send(driver.session(), command, points);
        MvcResult repeat = send(driver.session(), command, points);
        assertThat(first.getResponse().getStatus()).isEqualTo(200);
        assertThat(body(repeat)).isEqualTo(body(first));
        assertThat(jdbc.sql("select count(*) from track_point where driver_id = :driver")
                .param("driver", driver.id()).query(Integer.class).single()).isEqualTo(1);

        Map<String, Object> after = jdbc.sql("""
                select ST_X(last_location) as lon, ST_Y(last_location) as lat, last_location_sequence as sequence
                from work_session where id = :id
                """).param("id", work.id()).query().singleRow();
        assertThat(((Number) after.get("lon")).doubleValue()).isEqualTo(30.5);
        assertThat(((Number) after.get("lat")).doubleValue()).isEqualTo(50.5);
        assertThat(((Number) after.get("sequence")).longValue()).isEqualTo(999L);
    }

    private MvcResult send(IssuedSession session, UUID command, List<Map<String, Object>> points) throws Exception {
        return mvc.perform(post("/api/driver/v1/location-batches")
                        .header(HttpHeaders.AUTHORIZATION, "Bearer " + session.accessToken())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json.writeValueAsString(Map.of("command_id", command, "points", points))))
                .andReturn();
    }

    private Map<String, Object> point(long sequence, double lat, double lon, double accuracy, OffsetDateTime at) {
        Map<String, Object> point = new LinkedHashMap<>();
        point.put("sequence", sequence);
        point.put("lat", lat);
        point.put("lon", lon);
        point.put("accuracy_m", accuracy);
        point.put("recorded_at", at);
        return point;
    }

    private DriverToken driver() {
        UUID id = UUID.randomUUID();
        jdbc.sql("insert into driver(id, phone_normalized, account_state, created_at, updated_at) values (:id,:phone,'ACTIVE',now(),now())")
                .param("id", id)
                .param("phone", "+38067" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        IssuedSession session = sessions.open(new VerifiedSubject(new Actor(SubjectType.DRIVER, id), "ACTIVE", false),
                "driver-track-test");
        return new DriverToken(id, session);
    }

    private WorkSessionFixture workSession(DriverToken driver) {
        UUID city = UUID.randomUUID();
        UUID vehicle = UUID.randomUUID();
        UUID work = UUID.randomUUID();
        String code = "track-" + city.toString().substring(0, 8);
        jdbc.sql("""
                insert into city(id,code,name,currency,timezone,polygon,priority,state,created_at,updated_at)
                values (:id,:code,'Track test','UAH','Europe/Kyiv',
                        ST_Multi(ST_GeomFromText('POLYGON((30 50,31 50,31 51,30 51,30 50))',4326)),0,'PUBLISHED',now(),now())
                """).param("id", city).param("code", code).update();
        jdbc.sql("""
                insert into vehicle(id,driver_id,registration_number,make,model,color,production_year,state,created_at,updated_at)
                values (:id,:driver,:reg,'Test','Car','Black',2025,'APPROVED',now(),now())
                """).param("id", vehicle).param("driver", driver.id()).param("reg", "T" + code.substring(6)).update();
        jdbc.sql("""
                insert into work_session(id,driver_id,vehicle_id,city_id,device_session_id,state,intent,opened_at,
                                         last_heartbeat_at,last_location,last_location_at,last_location_accuracy,
                                         last_location_sequence)
                values (:id,:driver,:vehicle,:city,:device,'OPEN','ACCEPTING',now(),now(),
                        ST_SetSRID(ST_MakePoint(30.5,50.5),4326),now(),3,999)
                """).param("id", work).param("driver", driver.id()).param("vehicle", vehicle)
                .param("city", city).param("device", driver.session().sessionId()).update();
        return new WorkSessionFixture(work);
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    private record DriverToken(UUID id, IssuedSession session) {
    }

    private record WorkSessionFixture(UUID id) {
    }
}
