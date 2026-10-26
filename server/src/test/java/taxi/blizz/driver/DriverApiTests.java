package taxi.blizz.driver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.time.LocalDate;
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

/** driver.v1.yaml admission operations over HTTP; the driver id comes only from the token. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverApiTests {

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
    }

    private IssuedSession session(SubjectType type) {
        UUID id = UUID.randomUUID();
        String table = type == SubjectType.DRIVER ? "driver" : "client";
        jdbc.sql("insert into " + table + " (id, phone_normalized, account_state, created_at, updated_at) "
                        + "values (:id, :phone, 'ACTIVE', now(), now())")
                .param("id", id)
                .param("phone", "+38063" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        return sessions.open(new VerifiedSubject(new Actor(type, id), "ACTIVE", false), "test");
    }

    private MvcResult call(String method, String path, IssuedSession session, Object body) throws Exception {
        var request = (method.equals("GET") ? get(path) : post(path))
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + session.accessToken());
        if (body != null) {
            request = request.contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body));
        }
        return mvc.perform(request).andReturn();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    @Test
    void driverCompletesAdmissionDataAndSubmits() throws Exception {
        IssuedSession driver = session(SubjectType.DRIVER);

        MvcResult vehicle = call("POST", "/api/driver/v1/vehicles", driver, Map.of("command_id", UUID.randomUUID(),
                "registration_number", "AA4821KT", "make", "Skoda", "model", "Octavia", "color", "white",
                "production_year", 2021));
        assertThat(vehicle.getResponse().getStatus()).isEqualTo(201);
        Object vehicleId = body(vehicle).get("id");

        String validTo = LocalDate.now().plusYears(1).toString();
        for (Map<String, Object> document : List.<Map<String, Object>>of(
                Map.of("type", "DRIVER_LICENSE", "valid_to", validTo),
                Map.of("type", "VEHICLE_REGISTRATION", "vehicle_id", vehicleId),
                Map.of("type", "INSURANCE", "vehicle_id", vehicleId, "valid_to", validTo))) {
            Map<String, Object> request = new java.util.HashMap<>(document);
            request.put("command_id", UUID.randomUUID());
            assertThat(call("POST", "/api/driver/v1/documents", driver, request).getResponse().getStatus())
                    .isEqualTo(201);
        }

        Map<String, Object> profile = body(call("GET", "/api/driver/v1/profile", driver, null));
        assertThat(profile.get("review_status")).isEqualTo("NOT_SUBMITTED");
        assertThat((List<?>) profile.get("documents")).hasSize(3);

        MvcResult submitted = call("POST", "/api/driver/v1/verification/submit", driver,
                Map.of("command_id", UUID.randomUUID(), "expected_version", profile.get("version")));
        assertThat(submitted.getResponse().getStatus()).isEqualTo(200);
        assertThat(body(submitted).get("review_status")).isEqualTo("IN_REVIEW");
    }

    @Test
    void incompleteSubmissionIsAValidationProblem() throws Exception {
        IssuedSession driver = session(SubjectType.DRIVER);

        MvcResult result = call("POST", "/api/driver/v1/verification/submit", driver,
                Map.of("command_id", UUID.randomUUID(), "expected_version", 0));

        assertThat(result.getResponse().getStatus()).isEqualTo(400);
        assertThat(body(result)).containsEntry("code", "VALIDATION_FAILED");
    }

    @Test
    void riderTokenCannotUseTheDriverApi() throws Exception {
        IssuedSession rider = session(SubjectType.CLIENT);

        assertThat(call("GET", "/api/driver/v1/profile", rider, null).getResponse().getStatus()).isEqualTo(401);
    }
}
