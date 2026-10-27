package taxi.blizz.configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings.Brand;
import taxi.blizz.configuration.ServiceSettings.CallMode;
import taxi.blizz.configuration.ServiceSettings.Calls;
import taxi.blizz.configuration.ServiceSettings.Languages;
import taxi.blizz.configuration.ServiceSettings.Settings;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/** Brand, languages and call mode (REQ-TEN-06/07, owner decision 26.10.2026 on calls). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ServiceSettingsTests {

    @Autowired
    ServiceSettings settings;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    WebApplicationContext context;
    @Autowired
    JsonMapper json;

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Settings', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "settings-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static Settings brand(String primary, String onPrimary, CallMode mode, String servicePhone,
                                  String defaultLanguage, List<String> languages) {
        return new Settings(new Brand("Blizz Kyiv", primary, onPrimary, "#ffc300", "https://cdn.example.invalid/logo.png",
                "+380 44 123 45 67", "Support@Example.invalid", "blizz_support", "https://example.invalid/privacy",
                "https://example.invalid/terms"), new Languages(defaultLanguage, languages), new Calls(mode, servicePhone));
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void anAdminChangesTheBrandAndTheAppsSeeItWithoutSigningIn() throws Exception {
        Actor admin = staff(ServiceSettings.MANAGE_PERMISSION);
        long before = settings.current().version();
        ServiceSettings.Version saved = settings.change(admin, UUID.randomUUID(), before,
                brand("#1a1a1a", "#ffffff", CallMode.VIA_SERVICE_NUMBERS, "+380 44 000 00 01", "uk",
                        List.of("uk", "en", "pl")), "Launch in Kyiv");

        assertThat(saved.version()).isEqualTo(before + 1);
        Brand b = saved.settings().brand();
        assertThat(b.primaryColor()).isEqualTo("#1A1A1A");
        assertThat(b.supportPhone()).isEqualTo("+380441234567");
        assertThat(b.supportEmail()).isEqualTo("support@example.invalid");
        assertThat(b.supportTelegram()).isEqualTo("@blizz_support");
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'settings.change' and resource_id = :v")
                .param("v", Long.toString(saved.version())).query(Long.class).single()).isEqualTo(1);

        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        MvcResult result = mvc.perform(get("/api/config/v1/bootstrap")).andReturn();
        assertThat(result.getResponse().getStatus()).isEqualTo(200);
        @SuppressWarnings("unchecked")
        Map<String, Object> body = json.readValue(result.getResponse().getContentAsString(), Map.class);
        assertThat(((Number) body.get("settings_version")).longValue()).isEqualTo(saved.version());
        assertThat(body.get("brand")).asString().contains("Blizz Kyiv");
        assertThat(body.get("calls")).asString().contains("VIA_SERVICE_NUMBERS").contains("+380440000001");
        assertThat(body).containsKey("cities");
        assertThat(result.getResponse().getHeader("Cache-Control")).contains("max-age=60");

        ServiceSettings.Version direct = settings.change(admin, UUID.randomUUID(), saved.version(),
                brand("#1a1a1a", "#ffffff", CallMode.DIRECT, "+380 44 000 00 01", "uk", List.of("uk")), "Direct calls");
        MvcResult again = mvc.perform(get("/api/config/v1/bootstrap")).andReturn();
        assertThat(again.getResponse().getContentAsString()).as("no service phone shown in DIRECT mode")
                .doesNotContain("+380440000001");
        assertThat(settings.history(admin, 10)).extracting(ServiceSettings.Version::version)
                .startsWith(direct.version(), saved.version());
    }

    @Test
    void badSettingsStaleVersionsAndMissingRightsAreRefused() {
        Actor admin = staff(ServiceSettings.MANAGE_PERMISSION);
        long version = settings.current().version();
        assertCode(() -> settings.change(admin, UUID.randomUUID(), version,
                brand("#777777", "#888888", CallMode.DIRECT, null, "uk", List.of("uk")), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> settings.change(admin, UUID.randomUUID(), version,
                brand("#000000", "#ffffff", CallMode.VIA_SERVICE_NUMBERS, null, "uk", List.of("uk")), "x"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> settings.change(admin, UUID.randomUUID(), version,
                brand("#000000", "#ffffff", CallMode.DIRECT, null, "pl", List.of("uk")), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> settings.change(admin, UUID.randomUUID(), version,
                brand("#000000", "#ffffff", CallMode.DIRECT, null, "de", List.of("de")), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> settings.change(admin, UUID.randomUUID(), version + 7,
                brand("#000000", "#ffffff", CallMode.DIRECT, null, "uk", List.of("uk")), "x"), ErrorCode.VERSION_CONFLICT);
        assertCode(() -> settings.change(staff("orders.view"), UUID.randomUUID(), version,
                brand("#000000", "#ffffff", CallMode.DIRECT, null, "uk", List.of("uk")), "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> settings.history(staff(), 5), ErrorCode.ACCESS_DENIED);
        assertThatThrownBy(() -> jdbc.sql("delete from service_settings").update())
                .rootCause().hasMessageContaining("append-only");
    }
}
