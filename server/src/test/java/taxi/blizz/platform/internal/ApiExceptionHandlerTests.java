package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import com.jayway.jsonpath.JsonPath;
import jakarta.servlet.Filter;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.io.Reader;
import java.time.Duration;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.yaml.snakeyaml.Yaml;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.CorrelationId;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.RateLimitedException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotencyConflictException;

/** Real MVC dispatch + application filters; all responses checked against common.yaml. */
@SpringBootTest
@Import({TestcontainersConfiguration.class, ApiExceptionHandlerTests.Endpoints.class})
class ApiExceptionHandlerTests {

    @Autowired WebApplicationContext context;
    MockMvc mvc;
    Map<String, Object> schemas;

    @BeforeEach
    @SuppressWarnings("unchecked")
    void setUp() throws Exception {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        try (Reader reader = Files.newBufferedReader(Path.of("..", "packages", "contracts", "openapi", "common.yaml"))) {
            Map<String, Object> document = new Yaml().load(reader);
            schemas = (Map<String, Object>) ((Map<String, Object>) document.get("components")).get("schemas");
        }
    }

    @ParameterizedTest
    @EnumSource(value = ErrorCode.class, names = {"PAYMENT_PENDING", "PAYMENT_UNKNOWN"},
            mode = EnumSource.Mode.EXCLUDE)
    void domainCodesKeepTheirContractStatus(ErrorCode code) throws Exception {
        check(mvc.perform(get("/__errors/domain").param("code", code.name())).andReturn(),
                code.httpStatus(), code);
    }

    @Test
    void idempotencyConflictUsesTheSameHandler() throws Exception {
        check(mvc.perform(get("/__errors/idempotency")).andReturn(), 409, ErrorCode.IDEMPOTENCY_CONFLICT);
    }

    @Test
    void rateLimitIncludesKnownRetryGuidance() throws Exception {
        MvcResult result = mvc.perform(get("/__errors/rate-limit")).andReturn();
        Map<String, Object> body = check(result, 429, ErrorCode.RATE_LIMITED);
        assertThat(body).containsEntry("retryable", true).containsEntry("retry_after_seconds", 2);
        assertThat(result.getResponse().getHeader(HttpHeaders.RETRY_AFTER)).isEqualTo("2");
    }

    @Test
    void invalidBodyHasFieldErrorsWithoutRejectedValues() throws Exception {
        Map<String, Object> body = check(mvc.perform(post("/__errors/body")
                .contentType(MediaType.APPLICATION_JSON).content("{\"name\":\"\",\"age\":-1}")).andReturn(),
                400, ErrorCode.VALIDATION_FAILED);
        assertThat(body.get("field_errors").toString()).contains("name", "NotBlank", "age", "Min");
    }

    @Test
    void invalidParameterHasFieldErrors() throws Exception {
        Map<String, Object> body = check(mvc.perform(get("/__errors/parameter").param("count", "0")).andReturn(),
                400, ErrorCode.VALIDATION_FAILED);
        assertThat(body.get("field_errors").toString()).contains("count", "Min");
    }

    @Test
    void constraintViolationsHaveFieldErrors() throws Exception {
        Map<String, Object> body = check(mvc.perform(get("/__errors/constraint")).andReturn(),
                400, ErrorCode.VALIDATION_FAILED);
        assertThat(body.get("field_errors").toString()).contains("name", "NotBlank");
    }

    @Test
    void malformedAndMissingBodiesAreValidationErrors() throws Exception {
        for (String json : List.of("{", "")) {
            check(mvc.perform(post("/__errors/body").contentType(MediaType.APPLICATION_JSON).content(json)).andReturn(),
                    400, ErrorCode.VALIDATION_FAILED);
        }
    }

    @Test
    void missingAndUnconvertibleParametersAreValidationErrors() throws Exception {
        check(mvc.perform(get("/__errors/parameter")).andReturn(), 400, ErrorCode.VALIDATION_FAILED);
        check(mvc.perform(get("/__errors/parameter").param("count", "not-a-number")).andReturn(),
                400, ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void unknownPathsAndNoHandlerUseNotFound() throws Exception {
        check(mvc.perform(get("/__missing/path")).andReturn(), 404, ErrorCode.NOT_FOUND);
        check(mvc.perform(get("/__errors/no-handler")).andReturn(), 404, ErrorCode.NOT_FOUND);
    }

    @Test
    void wrongMethodPreservesTheAllowHeader() throws Exception {
        MvcResult result = mvc.perform(get("/__errors/body")).andReturn();
        check(result, 405, ErrorCode.VALIDATION_FAILED);
        assertThat(result.getResponse().getHeader(HttpHeaders.ALLOW)).contains("POST");
    }

    @Test
    void unsupportedMediaTypeIsAlsoAProblem() throws Exception {
        check(mvc.perform(post("/__errors/body").contentType(MediaType.TEXT_PLAIN).content("text")).andReturn(),
                415, ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void internalErrorsHideDetailsAndLogTheCorrelationId() throws Exception {
        String id = UUID.randomUUID().toString();
        Logger logger = (Logger) LoggerFactory.getLogger(ApiExceptionHandler.class);
        ListAppender<ILoggingEvent> appender = new ListAppender<>();
        appender.start();
        logger.addAppender(appender);
        try {
            MvcResult result = mvc.perform(get("/__errors/internal").header(CorrelationId.HEADER, id)).andReturn();
            check(result, 500, ErrorCode.INTERNAL_ERROR);
            assertThat(result.getResponse().getHeader(CorrelationId.HEADER)).isEqualTo(id);
            assertThat(result.getResponse().getContentAsString())
                    .doesNotContain("SELECT", "password", "secret", "IllegalStateException", "stack", "exception");
            assertThat(appender.list).anySatisfy(event -> {
                assertThat(event.getFormattedMessage()).contains(id);
                assertThat(event.getThrowableProxy().getMessage()).contains("SELECT");
            });
        } finally {
            logger.detachAppender(appender);
            appender.stop();
        }
    }

    @Test
    void invalidClientCorrelationIdIsReplacedAndDoesNotLeakToTheNextRequest() throws Exception {
        MvcResult first = mvc.perform(get("/__missing/path").header(CorrelationId.HEADER, "untrusted")).andReturn();
        check(first, 404, ErrorCode.NOT_FOUND);
        MvcResult second = mvc.perform(get("/__missing/path")).andReturn();
        check(second, 404, ErrorCode.NOT_FOUND);
        assertThat(first.getResponse().getHeader(CorrelationId.HEADER))
                .isNotEqualTo(second.getResponse().getHeader(CorrelationId.HEADER));
        assertThat(CorrelationId.current()).isEmpty();
    }

    private Map<String, Object> check(MvcResult result, int status, ErrorCode code) throws Exception {
        assertThat(result.getResponse().getStatus()).isEqualTo(status);
        assertThat(result.getResponse().getContentType()).startsWith(MediaType.APPLICATION_PROBLEM_JSON_VALUE);
        Map<String, Object> body = JsonPath.parse(result.getResponse().getContentAsString()).read("$");
        validate(body, schema("Problem"));
        assertThat(body).containsEntry("status", status).containsEntry("code", code.name())
                .containsEntry("type", "https://errors.blizz.taxi/" + code.name().toLowerCase(java.util.Locale.ROOT).replace('_', '-'))
                .containsEntry("correlation_id", result.getResponse().getHeader(CorrelationId.HEADER));
        if (!"/__errors/rate-limit".equals(result.getRequest().getRequestURI())) {
            assertThat(body).doesNotContainKeys("retryable", "retry_after_seconds");
        }
        return body;
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> schema(String name) {
        return (Map<String, Object>) schemas.get(name);
    }

    /** Validate the actual loaded schema, including nested field_errors and local references. */
    @SuppressWarnings("unchecked")
    private void validate(Object value, Map<String, Object> rule) {
        if (rule.containsKey("$ref")) {
            validate(value, schema(rule.get("$ref").toString().replace("#/components/schemas/", "")));
            return;
        }
        switch (rule.get("type").toString()) {
            case "object" -> {
                assertThat(value).isInstanceOf(Map.class);
                Map<String, Object> object = (Map<String, Object>) value;
                Map<String, Map<String, Object>> properties = (Map<String, Map<String, Object>>) rule.get("properties");
                assertThat(object.keySet()).containsAll((List<String>) rule.getOrDefault("required", List.of()));
                // Issue #1 additionally forbids extensions outside the published Problem properties.
                assertThat(properties.keySet()).containsAll(object.keySet());
                object.forEach((key, entry) -> validate(entry, properties.get(key)));
            }
            case "array" -> {
                assertThat(value).isInstanceOf(List.class);
                ((List<?>) value).forEach(entry -> validate(entry, (Map<String, Object>) rule.get("items")));
            }
            case "string" -> {
                assertThat(value).isInstanceOf(String.class);
                if (rule.containsKey("enum")) assertThat(((List<?>) rule.get("enum")).contains(value)).isTrue();
                if ("uuid".equals(rule.get("format"))) UUID.fromString(value.toString());
                if ("uri-reference".equals(rule.get("format"))) URI.create(value.toString());
            }
            case "integer" -> {
                assertThat(value).isInstanceOfAny(Integer.class, Long.class);
                double number = ((Number) value).doubleValue();
                if (rule.containsKey("minimum")) assertThat(number).isGreaterThanOrEqualTo(((Number) rule.get("minimum")).doubleValue());
                if (rule.containsKey("maximum")) assertThat(number).isLessThanOrEqualTo(((Number) rule.get("maximum")).doubleValue());
            }
            case "boolean" -> assertThat(value).isInstanceOf(Boolean.class);
            default -> throw new AssertionError("Unvalidated schema type: " + rule);
        }
    }

    record Input(@NotBlank String name, @Min(0) int age) {}

    @RestController
    static class Endpoints {
        private final Validator validator;
        Endpoints(Validator validator) { this.validator = validator; }

        @GetMapping("/__errors/domain")
        void domain(@RequestParam ErrorCode code) { throw new DomainException(code, "secret provider details"); }

        @GetMapping("/__errors/idempotency")
        void idempotency() { throw new IdempotencyConflictException(new CommandKey(
                new Actor(SubjectType.CLIENT, UUID.randomUUID()), "test.command", UUID.randomUUID())); }

        @GetMapping("/__errors/rate-limit")
        void rateLimit() { throw new RateLimitedException("private budget", Duration.ofMillis(1500)); }

        @PostMapping("/__errors/body")
        void body(@RequestBody @Valid Input input) {}

        @GetMapping("/__errors/parameter")
        void parameter(@RequestParam @Min(1) int count) {}

        @GetMapping("/__errors/constraint")
        void constraint() { throw new ConstraintViolationException(validator.validate(new Input("", 1))); }

        @GetMapping("/__errors/no-handler")
        void noHandler() throws NoHandlerFoundException {
            throw new NoHandlerFoundException("GET", "/absent", new HttpHeaders());
        }

        @GetMapping("/__errors/internal")
        void internal() { throw new IllegalStateException("SELECT password FROM accounts; secret"); }
    }
}
