package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.time.OffsetDateTime;
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

/** driver.v1.yaml work-session operations over HTTP; the controlling device is the token's session. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class WorkSessionApiTests {

    @Autowired
    WebApplicationContext context;
    @Autowired
    SessionService sessions;
    @Autowired
    JsonMapper json;
    @Autowired
    JdbcClient jdbc;

    MockMvc mvc;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        if (jdbc.sql("select count(*) from city where code = 'test-work-sessions'").query(Integer.class).single() == 0) {
            jdbc.sql("""
                            insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                              created_at, updated_at)
                            values (:id, 'test-work-sessions', 'Test', 'UAH', 'Europe/Kyiv',
                                    ST_GeomFromEWKT(:area), 7777, 'PUBLISHED', now(), now())""")
                    .param("id", UUID.randomUUID()).param("area", WorkSessionTests.AREA).update();
        }
    }

    private MvcResult post(String path, IssuedSession session, Object body) throws Exception {
        return mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post(path)
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + session.accessToken())
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body))).andReturn();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    @Test
    void driverGoesOnlineFromOnePhoneAndTheSecondPhoneMustTakeOver() throws Exception {
        UUID driverId = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", driverId)
                .param("phone", "+38068" + String.format("%07d", Math.floorMod(driverId.hashCode(), 10_000_000)))
                .update();
        taxi.blizz.TestAdmission.inEveryCity(jdbc, driverId);
        UUID vehicleId = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, 'AA0002AA', 'Kia', 'Ceed', 'grey', 2020, 'APPROVED', '{STANDARD}',
                                now(), now())""")
                .param("id", vehicleId).param("driver", driverId).update();
        VerifiedSubject subject = new VerifiedSubject(new Actor(SubjectType.DRIVER, driverId), "ACTIVE", false);
        IssuedSession phone = sessions.open(subject, "phone");
        IssuedSession tablet = sessions.open(subject, "tablet");
        Map<String, Object> location = Map.of("lat", WorkSessionTests.INSIDE.lat(), "lon", WorkSessionTests.INSIDE.lon(),
                "accuracy_m", 5, "recorded_at", OffsetDateTime.now().toString(), "sequence", 1);

        MvcResult opened = post("/api/driver/v1/work-sessions", phone,
                Map.of("command_id", UUID.randomUUID(), "vehicle_id", vehicleId, "location", location));
        assertThat(opened.getResponse().getStatus()).isEqualTo(201);
        Map<String, Object> state = body(opened);
        assertThat(state).containsEntry("session_state", "OPEN").containsEntry("eligible", true);

        MvcResult second = post("/api/driver/v1/work-sessions", tablet,
                Map.of("command_id", UUID.randomUUID(), "vehicle_id", vehicleId, "location", location));
        assertThat(second.getResponse().getStatus()).isEqualTo(409);

        MvcResult handover = post("/api/driver/v1/work-sessions/" + state.get("session_id") + "/handover", tablet,
                Map.of("command_id", UUID.randomUUID(), "expected_version", state.get("session_version")));
        assertThat(handover.getResponse().getStatus()).isEqualTo(200);

        MvcResult current = mvc.perform(get("/api/driver/v1/work-sessions/current")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + tablet.accessToken())).andReturn();
        assertThat(body(current)).containsEntry("session_id", state.get("session_id"));

        MvcResult unknown = post("/api/driver/v1/work-sessions/" + UUID.randomUUID() + "/pause", tablet,
                Map.of("command_id", UUID.randomUUID(), "expected_version", 1));
        assertThat(unknown.getResponse().getStatus()).isEqualTo(404);
    }
}
