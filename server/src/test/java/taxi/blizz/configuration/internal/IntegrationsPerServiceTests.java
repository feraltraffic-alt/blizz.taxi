package taxi.blizz.configuration.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

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
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.configuration.Integrations.Change;
import taxi.blizz.identity.Services;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/**
 * ADR 0016, issue #215: each taxi service enters its own keys. Another service neither sees nor changes them, its
 * apps get their own map keys, and each service sets its own telephone exchange (owner decision 02.11.2026).
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class IntegrationsPerServiceTests {

    static final String PASSWORD = "Integrations-Service-2026";

    @Autowired Integrations integrations;
    @Autowired JdbcClient jdbc;
    @Autowired JsonMapper json;
    @Autowired WebApplicationContext context;

    private UUID service(String prefix) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, :code, now(), now())""")
                .param("id", id).param("code", prefix + "-" + id.toString().substring(0, 8)).update();
        return id;
    }

    private Actor keeper(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, password_hash,
                                                service_id, created_at, updated_at)
                        values (:id, :login, 'Keys', 'ADMIN', :permissions, true, 'ACTIVE', :hash, :service, now(),
                                now())""")
                .param("id", id).param("login", "keys-svc-" + id)
                .param("permissions", new String[] {Integrations.MANAGE_PERMISSION})
                .param("hash", new BCryptPasswordEncoder(4).encode(PASSWORD)).param("service", service).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static String value(List<Integrations.FieldState> fields, String name) {
        return fields.stream().filter(f -> f.name().equals(name)).findFirst().orElseThrow().value();
    }

    @Test
    @SuppressWarnings("unchecked")
    void eachServiceKeepsItsOwnKeysAndItsAppsGetThem() throws Exception {
        UUID b = service("keys-b");
        Actor keeperB = keeper(b);
        Actor keeperA = keeper(service("keys-a"));
        integrations.change(keeperB, UUID.randomUUID(), PASSWORD, List.of(
                new Change(Integrations.MAPS_PROVIDER, "MAPTILER"),
                new Change(Integrations.MAPS_ANDROID_KEY, "android-key-of-b")), "B's own maps");

        assertThat(integrations.value(b, Integrations.MAPS_ANDROID_KEY)).contains("android-key-of-b");
        assertThat(integrations.value(Services.DEFAULT_ID, Integrations.MAPS_ANDROID_KEY))
                .as("not the first service's").isNotEqualTo(java.util.Optional.of("android-key-of-b"));
        assertThat(value(integrations.list(keeperB), Integrations.MAPS_ANDROID_KEY)).isEqualTo("android-key-of-b");
        assertThat(value(integrations.list(keeperA), Integrations.MAPS_ANDROID_KEY)).as("not in A's panel")
                .isNull();

        String code = jdbc.sql("select code from service where id = :id").param("id", b).query(String.class)
                .single();
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        Map<String, Object> boot = json.readValue(mvc.perform(get("/api/config/v1/bootstrap").param("service", code))
                .andReturn().getResponse().getContentAsString(), Map.class);
        assertThat((Map<String, Object>) boot.get("maps")).as("B's app gets B's map key")
                .containsEntry("android_key", "android-key-of-b").containsEntry("provider", "MAPTILER");
    }

    /** T1 of #275: each service's super admin sets its own exchange; the other service's stays as it was. */
    @Test
    void eachServiceSetsItsOwnTelephoneExchange() {
        UUID b = service("keys-pbx");
        Actor keeperB = keeper(b);
        java.util.Optional<String> firstBefore = integrations.value(Services.DEFAULT_ID,
                Integrations.OTP_ASTERISK_ARI_USER);
        // The address is checked like any other (no private or unknown host); the user shows the field is B's now.
        integrations.change(keeperB, UUID.randomUUID(), PASSWORD, List.of(
                new Change(Integrations.OTP_ASTERISK_ARI_USER, "ari-b")), "B's own exchange");
        assertThat(integrations.value(b, Integrations.OTP_ASTERISK_ARI_USER)).contains("ari-b");
        assertThat(integrations.value(Services.DEFAULT_ID, Integrations.OTP_ASTERISK_ARI_USER))
                .as("the first service's exchange as it was").isEqualTo(firstBefore);
        assertThat(value(integrations.list(keeperB), Integrations.OTP_ASTERISK_ARI_USER)).isEqualTo("ari-b");
    }
}
