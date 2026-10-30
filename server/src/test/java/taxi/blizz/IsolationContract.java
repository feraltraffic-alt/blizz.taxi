package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.yaml.snakeyaml.Yaml;

/** The sweep's inventory and request shape come from the contracts, including external schema references. */
final class IsolationContract {
    private static final Path ROOT = Path.of("..", "packages", "contracts", "openapi");
    private static final Map<Path, Map<String, Object>> DOCUMENTS = new LinkedHashMap<>();

    record Operation(String contract, String method, String path, Map<String, Object> definition) {
        @Override
        public String toString() {
            return method.toUpperCase() + " " + path;
        }

        Set<Integer> denials() {
            var responses = map(definition.get("responses"));
            var result = new java.util.LinkedHashSet<Integer>();
            for (int status : List.of(403, 404)) {
                if (responses.containsKey(String.valueOf(status))) {
                    result.add(status);
                }
            }
            return result;
        }

        boolean binary() {
            return content().containsKey("image/png");
        }

        private Map<String, Object> content() {
            if (!definition.containsKey("requestBody")) {
                return Map.of();
            }
            Node request = resolve(map(definition.get("requestBody")), ROOT.resolve(contract));
            return map(request.value().get("content"));
        }

        Map<String, Object> body(Map<String, Object> fixture) {
            Map<String, Object> content = content();
            if (content.isEmpty() || binary()) {
                return Map.of();
            }
            assertThat(content).as(this + " supported request media (no silent fallback)")
                    .containsKey("application/json");
            Node request = resolve(map(definition.get("requestBody")), ROOT.resolve(contract));
            Node schema = resolve(map(map(content.get("application/json")).get("schema")), request.source());
            Map<String, Object> properties = map(schema.value().get("properties"));
            Map<String, Object> result = new LinkedHashMap<>();
            var required = (List<?>) schema.value().getOrDefault("required", List.of());
            for (Object name : required) {
                String key = name.toString();
                assertThat(properties).as(this + " required property " + key).containsKey(key);
                Object value = fixture.get(key);
                if (value == null) {
                    value = switch (key) {
                        case "command_id" -> UUID.randomUUID();
                        case "body", "message" -> "Isolation probe";
                        case "score" -> 5;
                        case "amount_minor" -> 100L;
                        case "reported_at" -> OffsetDateTime.now().toString();
                        default -> throw new AssertionError(this + ": no fixture for required field " + key);
                    };
                }
                result.put(key, value);
            }
            // Optional data is admitted only when the operation actually declares it.
            fixture.forEach((key, value) -> {
                if (properties.containsKey(key)) {
                    result.put(key, value);
                }
            });
            assertThat(result.keySet()).as(this + " body properties")
                    .containsAll(required.stream().map(Object::toString).toList());
            return result;
        }
    }

    static List<Operation> operations(String contract) {
        List<Operation> result = new ArrayList<>();
        map(document(ROOT.resolve(contract)).get("paths")).forEach((path, item) -> {
            if (!path.contains("{")) {
                return;
            }
            map(item).forEach((method, definition) -> {
                if (List.of("parameters", "summary", "description", "servers").contains(method)) {
                    return;
                }
                assertThat(List.of("get", "post", "put", "delete")).as(path + " supported HTTP method")
                        .contains(method);
                result.add(new Operation(contract, method, path, map(definition)));
            });
        });
        return result;
    }

    static Operation operation(String contract, String method, String path) {
        return new Operation(contract, method, path,
                map(map(map(document(ROOT.resolve(contract)).get("paths")).get(path)).get(method)));
    }

    private record Node(Map<String, Object> value, Path source) {
    }

    private static Node resolve(Map<String, Object> value, Path source) {
        Set<String> seen = new java.util.HashSet<>();
        while (value.containsKey("$ref")) {
            String ref = value.get("$ref").toString();
            assertThat(seen.add(source + "#" + ref)).as("cyclic contract reference " + ref).isTrue();
            String[] parts = ref.split("#", 2);
            source = parts[0].isEmpty() ? source : source.getParent().resolve(parts[0]).normalize();
            assertThat(source.normalize().startsWith(ROOT)).as("local contract reference " + ref).isTrue();
            Object target = document(source);
            for (String part : parts[1].substring(1).split("/")) {
                target = map(target).get(part.replace("~1", "/").replace("~0", "~"));
            }
            value = map(target);
        }
        return new Node(value, source);
    }

    private static Map<String, Object> document(Path path) {
        return DOCUMENTS.computeIfAbsent(path.normalize(), key -> {
            try (var reader = Files.newBufferedReader(key)) {
                return map(new Yaml().load(reader));
            } catch (java.io.IOException ex) {
                throw new AssertionError("Cannot read contract " + key, ex);
            }
        });
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Object> map(Object value) {
        if (!(value instanceof Map<?, ?>)) {
            throw new AssertionError("Expected a contract object, got " + value);
        }
        return (Map<String, Object>) value;
    }
}
