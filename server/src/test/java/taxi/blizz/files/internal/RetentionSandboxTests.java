package taxi.blizz.files.internal;

import static org.assertj.core.api.Assertions.assertThat;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

@SpringBootTest
@ActiveProfiles("sandbox")
@Import(RetentionSandboxTests.Database.class)
class RetentionSandboxTests {
    @org.springframework.boot.test.context.TestConfiguration(proxyBeanMethods=false)
    static class Database {
        @org.springframework.context.annotation.Bean
        @org.springframework.boot.testcontainers.service.connection.ServiceConnection
        org.testcontainers.postgresql.PostgreSQLContainer retentionSandboxPostgres() {
            return new org.testcontainers.postgresql.PostgreSQLContainer(
                org.testcontainers.utility.DockerImageName.parse("postgis/postgis:18-3.6").asCompatibleSubstituteFor("postgres"));
        }
    }
    @Autowired JdbcClient jdbc;
    @Autowired SessionService sessions;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;
    MockMvc mvc;
    @BeforeEach void setup() {
        var filters=new ArrayList<Filter>(context.getBeansOfType(Filter.class).values());AnnotationAwareOrderComparator.sort(filters);
        mvc=MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }
    String staff(boolean permission,boolean all) {
        UUID id=UUID.randomUUID();
        jdbc.sql("""
            insert into staff_user(id,login,name,role,permissions,all_cities,state,created_at,updated_at)
            values(:id,:login,'Retention sandbox','ADMIN',:permissions,:all,'ACTIVE',now(),now())
            """).param("id",id).param("login","retention-sandbox-"+id)
            .param("permissions",permission?new String[]{"retention.manage"}:new String[0]).param("all",all).update();
        return sessions.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF,id),"ACTIVE",false),ApiAudience.ADMIN,null).accessToken();
    }
    MvcResult call(String method,String path,String token) throws Exception {
        var request=MockMvcRequestBuilders.request(org.springframework.http.HttpMethod.valueOf(method),path);
        if(token!=null)request.header("Authorization","Bearer "+token);
        return mvc.perform(request).andReturn();
    }
    @Test void eachSandboxEntryPointChecksBearerPermissionAndGlobalScopeBeforeTouchingFixtures() throws Exception {
        String noPermission=staff(false,true),cityOnly=staff(true,false),admin=staff(true,true);
        String path="/sandbox/v1/retention/fixtures/"+UUID.randomUUID();
        for(String[] route:new String[][]{{"POST",path},{"GET",path},{"DELETE",path},{"POST","/sandbox/v1/retention/run"}}) {
            assertThat(call(route[0],route[1],null).getResponse().getStatus()).isEqualTo(401);
            assertThat(call(route[0],route[1],"invalid").getResponse().getStatus()).isEqualTo(401);
            assertThat(call(route[0],route[1],noPermission).getResponse().getStatus()).isEqualTo(403);
            assertThat(call(route[0],route[1],cityOnly).getResponse().getStatus()).isEqualTo(403);
        }
        assertThat(call("POST",path,admin).getResponse().getStatus()).isEqualTo(200);
        var before=json.readTree(call("GET",path,admin).getResponse().getContentAsString());
        assertThat(before.path("old_done").asLong()).isEqualTo(1);assertThat(before.path("recent_done").asLong()).isEqualTo(1);assertThat(before.path("failed").asLong()).isEqualTo(1);
        assertThat(call("POST","/sandbox/v1/retention/run",admin).getResponse().getStatus()).isEqualTo(200);
        var after=json.readTree(call("GET",path,admin).getResponse().getContentAsString());
        assertThat(after.path("old_done").asLong()).isZero();assertThat(after.path("recent_done").asLong()).isEqualTo(1);assertThat(after.path("failed").asLong()).isEqualTo(1);
        assertThat(call("DELETE",path,admin).getResponse().getStatus()).isEqualTo(204);
        var removed=json.readTree(call("GET",path,admin).getResponse().getContentAsString());
        assertThat(removed.path("recent_done").asLong()).isZero();assertThat(removed.path("failed").asLong()).isZero();
    }
}
