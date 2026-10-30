package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;
import org.springframework.jdbc.core.simple.JdbcClient;
import tools.jackson.databind.json.JsonMapper;

/**
 * Event payloads as they are in the outbox, checked against the event schemas of {@code packages/contracts/events}
 * (#112): the schema is chosen by aggregate and type, so a type published by two aggregates needs one schema per
 * aggregate ({@code x-aggregate}). Checks the names of the fields (required, no others when the schema allows none)
 * and their JSON types; the full validation of the examples runs in {@code scripts/contracts-lint.sh}.
 */
public final class EventContracts {

    private static final Path EVENTS = Path.of("..", "packages", "contracts", "events");
    private static final JsonMapper JSON = JsonMapper.builder().build();

    private EventContracts() {
    }

    record Schema(Path file, List<String> types, String aggregate, Map<String, Object> body) {
    }

    @SuppressWarnings("unchecked")
    private static List<Schema> schemas() {
        try (Stream<Path> files = Files.list(EVENTS)) {
            List<Schema> schemas = new ArrayList<>();
            for (Path file : files.filter(f -> f.toString().endsWith(".schema.json")
                    && !f.getFileName().toString().equals("envelope.schema.json")).sorted().toList()) {
                Map<String, Object> body = JSON.readValue(Files.readString(file), Map.class);
                String title = String.valueOf(body.get("title")).replaceAll(" v\\d+( payload)?$", "");
                schemas.add(new Schema(file, List.of(title.split("\\s*/\\s*")), (String) body.get("x-aggregate"),
                        body));
            }
            return schemas;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /** The one schema of the type published by the aggregate. */
    static Schema schemaOf(String aggregateType, String type) {
        List<Schema> ofType = schemas().stream().filter(s -> s.types().contains(type)).toList();
        assertThat(ofType).as("a schema of %s", type).isNotEmpty();
        if (ofType.size() > 1) {
            assertThat(ofType).as("%s has schemas of several aggregates: each names its x-aggregate", type)
                    .allSatisfy(s -> assertThat(s.aggregate()).isNotBlank());
        }
        List<Schema> matching = ofType.stream()
                .filter(s -> s.aggregate() == null || s.aggregate().equals(aggregateType)).toList();
        assertThat(matching).as("one schema of %s published by %s", type, aggregateType).hasSize(1);
        return matching.getFirst();
    }

    /** Every outbox event of the types about the order (its own and those of other aggregates) matches its schema. */
    @SuppressWarnings("unchecked")
    public static void assertOrderEventsConform(JdbcClient jdbc, UUID orderId, String... types) {
        List<Map<String, Object>> rows = jdbc.sql("""
                        select event_type, aggregate_type, payload::text as payload from outbox
                        where (aggregate_id = :order or payload ->> 'order_id' = :orderText)
                          and event_type in (:types)
                        order by occurred_at, event_id""")
                .param("order", orderId).param("orderText", orderId.toString()).param("types", List.of(types))
                .query().listOfRows();
        assertThat(rows).as("events %s of order %s", List.of(types), orderId).isNotEmpty();
        for (Map<String, Object> row : rows) {
            String type = (String) row.get("event_type");
            String aggregate = (String) row.get("aggregate_type");
            Map<String, Object> payload = JSON.readValue((String) row.get("payload"), Map.class);
            assertConforms(schemaOf(aggregate, type), aggregate + " " + type, payload);
        }
    }

    @SuppressWarnings("unchecked")
    private static void assertConforms(Schema schema, String what, Map<String, Object> payload) {
        Map<String, Object> properties = (Map<String, Object>) schema.body().getOrDefault("properties", Map.of());
        List<String> required = (List<String>) schema.body().getOrDefault("required", List.of());
        assertThat(payload).as("%s against %s: required fields", what, schema.file().getFileName())
                .containsKeys(required.toArray(String[]::new));
        if (Boolean.FALSE.equals(schema.body().get("additionalProperties"))) {
            assertThat(properties).as("%s against %s: no other fields", what, schema.file().getFileName())
                    .containsKeys(payload.keySet().toArray(String[]::new));
        }
        payload.forEach((name, value) -> {
            Object type = properties.get(name) instanceof Map<?, ?> p ? p.get("type") : null;
            if (type == null || value == null) {
                return;
            }
            boolean matches = switch (String.valueOf(type)) {
                case "string" -> value instanceof String;
                case "integer" -> value instanceof Integer || value instanceof Long;
                case "boolean" -> value instanceof Boolean;
                case "object" -> value instanceof Map;
                case "array" -> value instanceof List;
                default -> true;
            };
            assertThat(matches).as("%s against %s: %s is a %s", what, schema.file().getFileName(), name, type)
                    .isTrue();
        });
    }
}
