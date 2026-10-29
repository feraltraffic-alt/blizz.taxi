package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverBalanceApiTests {
    @Autowired JdbcClient jdbc;
    @Autowired SessionService sessions;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;
    @Autowired DriverBalances balances;

    @Test
    void staffTopUpIsIdempotentAndRevokedPermissionCannotReadOrReplayIt() throws Exception {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        UUID staff = UUID.randomUUID(), driver = UUID.randomUUID();
        jdbc.sql("""
                insert into staff_user(id,login,name,role,permissions,all_cities,state,created_at,updated_at)
                values (:id,:login,'Finance HTTP','ADMIN',:permissions,true,'ACTIVE',now(),now())""")
                .param("id", staff).param("login", "finance-http-" + staff)
                .param("permissions", new String[]{DriverBalances.MANAGE_PERMISSION}).update();
        jdbc.sql("""
                insert into driver(id,phone_normalized,account_state,review_status,created_at,updated_at)
                values (:id,:phone,'ACTIVE','APPROVED',now(),now())""")
                .param("id", driver).param("phone", "+38099" + String.format("%07d",
                        Math.floorMod(driver.hashCode(), 10_000_000))).update();
        // A dedicated published city makes the currency valid without another test's seed data.
        jdbc.sql("""
                insert into city(id,code,name,currency,timezone,polygon,priority,state,created_at,updated_at)
                values (:id,:code,'Balance HTTP','UAH','UTC',
                    ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((-178 80,-177 80,-177 81,-178 81,-178 80)))'),
                    0,'PUBLISHED',now(),now())""")
                .param("id", UUID.randomUUID()).param("code", "balance-http-" + staff).update();
        Actor actor = new Actor(SubjectType.STAFF, staff);
        String token = sessions.openStaff(new VerifiedSubject(actor, "ACTIVE", false), ApiAudience.ADMIN, null)
                .accessToken();
        UUID command = UUID.randomUUID();
        String body = json.writeValueAsString(Map.of("command_id", command, "currency", "UAH", "amount_minor", 1234,
                "kind", "DEPOSIT", "reference", "fictional receipt", "reason", "HTTP audit"));
        for (int i = 0; i < 2; i++) {
            MvcResult result = mvc.perform(post("/api/admin/v1/drivers/" + driver + "/balance/top-ups")
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + token).contentType(MediaType.APPLICATION_JSON)
                    .content(body)).andReturn();
            assertThat(result.getResponse().getStatus()).as(result.getResponse().getContentAsString()).isEqualTo(201);
        }
        assertThat(balances.of(actor, driver, 50).balances()).singleElement()
                .satisfies(b -> assertThat(b.balanceMinor()).isEqualTo(1234));
        assertThat(balances.of(actor, driver, 50).entries()).singleElement();
        MvcResult statement = mvc.perform(get("/api/admin/v1/drivers/" + driver + "/balance")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
        assertThat(statement.getResponse().getStatus()).isEqualTo(200);
        assertThat(json.readTree(statement.getResponse().getContentAsString()).get("driver_id").asText())
                .isEqualTo(driver.toString());
        assertThat(mvc.perform(post("/api/admin/v1/drivers/" + driver + "/balance/top-ups")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token).contentType(MediaType.APPLICATION_JSON)
                .content(body.replace("1234", "1235"))).andReturn().getResponse().getStatus()).isEqualTo(409);

        jdbc.sql("update staff_user set permissions = '{}' where id = :id").param("id", staff).update();
        assertThat(mvc.perform(get("/api/admin/v1/drivers/" + driver + "/balance")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn().getResponse().getStatus())
                .isEqualTo(403);
        assertThat(mvc.perform(post("/api/admin/v1/drivers/" + driver + "/balance/top-ups")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token).contentType(MediaType.APPLICATION_JSON)
                .content(body)).andReturn().getResponse().getStatus()).isEqualTo(403);
    }
}
