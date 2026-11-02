package taxi.blizz.identity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CorrelationId;
import taxi.blizz.platform.SubjectType;

/**
 * ADR 0016, issue #218: the change log, the staff activity log and the correlation trail show the reader's own taxi
 * service only. A super admin of another service with audit.view sees none of this service's changes.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class LogsPerServiceTests {

    @Autowired JdbcClient jdbc;
    @Autowired AuditLog audit;
    @Autowired SessionService sessions;
    @Autowired WebApplicationContext context;

    private Actor superAdmin(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, service_id,
                                                created_at, updated_at)
                        values (:id, :login, 'Logs', 'SUPER_ADMIN', '{}', true, 'ACTIVE', :service, now(), now())""")
                .param("id", id).param("login", "logs-" + id).param("service", service).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String body(MockMvc mvc, String path, Actor reader) throws Exception {
        String token = sessions.openStaff(new VerifiedSubject(reader, "ACTIVE", false), ApiAudience.ADMIN, "logs")
                .accessToken();
        var result = mvc.perform(get(path).header("Authorization", "Bearer " + token)).andReturn().getResponse();
        assertThat(result.getStatus()).as(path).isEqualTo(200);
        return result.getContentAsString();
    }

    @Test
    void eachServiceReadsOnlyItsOwnChangesAndTrails() throws Exception {
        UUID other = UUID.randomUUID();
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, 'Other taxi', now(), now())""")
                .param("id", other).param("code", "logs-" + other.toString().substring(0, 8)).update();
        Actor ofFirst = superAdmin(Services.DEFAULT_ID);
        Actor ofOther = superAdmin(other);
        UUID correlation = UUID.randomUUID();
        String marker = "logs-per-service-" + UUID.randomUUID();
        try (var scope = CorrelationId.open(correlation)) {
            audit.record(new AuditEntry(ofFirst, "test.change", "test_resource", marker,
                    "A change of the first service", null, null));
        }

        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        String changes = "/api/admin/v1/logs/changes?resource_id=" + marker;
        String trail = "/api/admin/v1/logs/correlation/" + correlation;
        assertThat(body(mvc, changes, ofFirst)).as("the first service sees its change").contains(marker);
        assertThat(body(mvc, trail, ofFirst)).as("and its trail").contains("AUDIT");
        assertThat(body(mvc, changes, ofOther)).as("another service sees none of it").doesNotContain(marker);
        assertThat(body(mvc, trail, ofOther)).as("nor its trail").doesNotContain("AUDIT");
        assertThat(body(mvc, "/api/admin/v1/logs/activity?staff_id=" + ofFirst.id(), ofOther))
                .as("nor the first service's staff activity").doesNotContain(ofFirst.id().toString());
    }
}
