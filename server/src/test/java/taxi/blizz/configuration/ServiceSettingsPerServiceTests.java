package taxi.blizz.configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;
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
import taxi.blizz.configuration.ServiceSettings.Settings;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/**
 * ADR 0016, issue #215: every taxi service has its own settings — brand, languages, rules and limits, each with its own
 * history; a change in one never touches another, and the apps get their own service's.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ServiceSettingsPerServiceTests {

    @Autowired ServiceSettings settings;
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

    private Actor admin(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, service_id,
                                                created_at, updated_at)
                        values (:id, :login, 'Settings', 'ADMIN', '{settings.manage}', true, 'ACTIVE', :service,
                                now(), now())""")
                .param("id", id).param("login", "settings-" + id).param("service", service).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private ServiceSettings.Version rename(Actor admin, String name) {
        ServiceSettings.Version now = settings.of(admin);
        Settings s = now.settings();
        ServiceSettings.Brand b = s.brand();
        return settings.change(admin, UUID.randomUUID(), now.version(), new Settings(new ServiceSettings.Brand(name,
                b.primaryColor(), b.onPrimaryColor(), b.accentColor(), b.logoUrl(), b.supportPhone(),
                b.supportEmail(), b.supportTelegram(), b.privacyPolicyUrl(), b.termsUrl()), s.languages(),
                s.calls(), s.preorders(), s.ratings(), s.tips(), s.orders(), s.cashNotReceived(), s.appVersions(),
                s.staffTopUps(), s.riderDebts()), "Own brand");
    }

    @Test
    void aChangeInOneServiceTouchesNoOtherAndEachKeepsItsOwnVersions() {
        UUID a = service("settings-a");
        UUID b = service("settings-b");
        ServiceSettings.Version firstOfB = rename(admin(b), "Taxi B");
        assertThat(firstOfB.version()).as("B's own first version").isEqualTo(1);
        assertThat(settings.current(b).settings().brand().serviceName()).isEqualTo("Taxi B");
        assertThat(settings.current(a).version()).as("A untouched: still the defaults").isZero();
        assertThat(settings.current(a).settings().brand().serviceName()).isNotEqualTo("Taxi B");
        assertThat(rename(admin(a), "Taxi A").version()).as("A's own first version").isEqualTo(1);
        assertThat(settings.current(b).settings().brand().serviceName()).isEqualTo("Taxi B");
    }

    @Test
    @SuppressWarnings("unchecked")
    void theBootstrapShowsTheBrandOfTheAppsService() throws Exception {
        UUID b = service("settings-boot");
        rename(admin(b), "Taxi Boot");
        String code = jdbc.sql("select code from service where id = :id").param("id", b).query(String.class).single();
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        Map<String, Object> boot = json.readValue(mvc.perform(get("/api/config/v1/bootstrap").param("service", code))
                .andReturn().getResponse().getContentAsString(), Map.class);
        assertThat((Map<String, Object>) boot.get("brand")).containsEntry("service_name", "Taxi Boot");
    }

    private static final java.util.regex.Pattern FIRST_SERVICE =
            java.util.regex.Pattern.compile("\\bsettings\\.current\\(\\)\\.settings\\(\\)");

    /** Server code names the service whose settings it reads: no call of the first service's shortcut. */
    @Test
    void noServerCodeReadsSettingsWithoutItsService() throws IOException {
        List<String> offenders = new ArrayList<>();
        try (Stream<Path> files = Files.walk(Path.of("src", "main", "java"))) {
            for (Path file : files.filter(f -> f.toString().endsWith(".java")).toList()) {
                String text = Files.readString(file);
                if (text.contains("ServiceSettings") && FIRST_SERVICE.matcher(text).find()) {
                    offenders.add(file.toString());
                }
            }
        }
        assertThat(offenders).as("settings.current() reads the first service's settings").isEmpty();
    }
}
