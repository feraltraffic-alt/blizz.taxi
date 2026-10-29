package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import tools.jackson.databind.json.JsonMapper;

@SpringBootTest
@ActiveProfiles("sandbox")
@Import(CardReconciliationTests.Database.class)
class SandboxReconciliationTests {
    private static final UUID MERCHANT=UUID.fromString("5a000000-0000-4000-8000-000000000602");
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired SessionService sessions;
    @Autowired JsonMapper json;
    @Autowired OutboxRelay relay;
    MockMvc mvc;
    String admin;
    @BeforeEach void setup() {
        var filters=new ArrayList<Filter>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc=MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        admin=staff(true);
    }
    @Test void sandboxRouteChecksItsOwnAdminBearerAndPermission() throws Exception {
        String body=json.writeValueAsString(Map.of("merchant_id",MERCHANT,"day",LocalDate.now(ZoneOffset.UTC)));
        assertThat(mvc.perform(post("/sandbox/v1/payment-reconciliations/run").contentType(MediaType.APPLICATION_JSON)
                .content(body)).andReturn().getResponse().getStatus()).isEqualTo(401);
        assertThat(mvc.perform(post("/sandbox/v1/payment-reconciliations/run").header("Authorization","Bearer invalid")
                .contentType(MediaType.APPLICATION_JSON).content(body)).andReturn().getResponse().getStatus()).isEqualTo(401);
        assertThat(mvc.perform(post("/sandbox/v1/payment-reconciliations/run").header("Authorization","Bearer "+staff(false))
                .contentType(MediaType.APPLICATION_JSON).content(body)).andReturn().getResponse().getStatus()).isEqualTo(403);
        String clean=mvc.perform(post("/sandbox/v1/payment-reconciliations/run").header("Authorization","Bearer "+admin)
                .contentType(MediaType.APPLICATION_JSON).content(body)).andReturn().getResponse().getContentAsString();
        assertThat(json.readTree(clean).get("state").asString()).isEqualTo("CLEAN");
    }
    @Test void injectedBankEvidenceHasOneHighPaymentCaseAndCanBeRestored() throws Exception {
        // Use a different day/merchant cohort from the authentication test's immutable preview.
        UUID merchant=UUID.fromString("5a000000-0000-4000-8000-000000000601");
        UUID fixture=UUID.randomUUID();
        String path="/sandbox/v1/payment-reconciliations/merchants/"+merchant+"/transactions/"+fixture;
        try {
            String injection="{\"amount_minor\":100,\"currency\":\"UAH\"}";
            assertThat(mvc.perform(post(path).header("Authorization","Bearer "+staff(false)).contentType(MediaType.APPLICATION_JSON)
                    .content(injection)).andReturn().getResponse().getStatus()).isEqualTo(403);
            assertThat(mvc.perform(post(path).header("Authorization","Bearer "+admin).contentType(MediaType.APPLICATION_JSON)
                    .content(injection)).andReturn().getResponse().getStatus()).isEqualTo(204);
            assertThat(mvc.perform(post(path).header("Authorization","Bearer "+admin).contentType(MediaType.APPLICATION_JSON)
                    .content(injection)).andReturn().getResponse().getStatus()).isEqualTo(204);
            String body=json.writeValueAsString(Map.of("merchant_id",merchant,"day",LocalDate.now(ZoneOffset.UTC)));
            String result=mvc.perform(post("/sandbox/v1/payment-reconciliations/run").header("Authorization","Bearer "+admin)
                    .contentType(MediaType.APPLICATION_JSON).content(body)).andReturn().getResponse().getContentAsString();
            var run=json.readTree(result);
            assertThat(run.get("state").asString()).isEqualTo("OPEN");
            assertThat(run.get("item_count").asInt()).isEqualTo(1);
            UUID id=UUID.fromString(run.get("id").asString());
            while(relay.runOnce()>0) { /* actual case */ }
            assertThat(jdbc.sql("select category,priority from support_case where source_key=:key")
                    .param("key","reconciliation:"+id).query().singleRow()).containsEntry("category","PAYMENT")
                    .containsEntry("priority","HIGH");
            assertThat(jdbc.sql("select count(*) from payment_operation").query(Long.class).single()).isZero();
        } finally {
            assertThat(mvc.perform(delete(path).header("Authorization","Bearer "+admin)).andReturn().getResponse().getStatus())
                    .isEqualTo(204);
        }
    }
    private String staff(boolean permitted) {
        UUID id=UUID.randomUUID();
        jdbc.sql("""
                insert into staff_user(id,login,name,role,permissions,all_cities,state,created_at,updated_at)
                values (:id,:login,'Sandbox reconciliation','ADMIN',:permissions,true,'ACTIVE',now(),now())
                """).param("id",id).param("login","sandbox-reconciliation-"+id)
                .param("permissions",permitted?new String[]{"payments.retry"}:new String[0]).update();
        return sessions.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF,id),"ACTIVE",false),ApiAudience.ADMIN,null)
                .accessToken();
    }
}
