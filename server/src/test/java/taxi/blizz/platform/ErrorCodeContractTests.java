package taxi.blizz.platform;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.Yaml;

/** The server's error codes and the published contract never drift apart (REQ-API-01). */
class ErrorCodeContractTests {

    private static final Path CONTRACT = Path.of("..", "packages", "contracts", "openapi", "common.yaml");

    @Test
    @SuppressWarnings("unchecked")
    void errorCodesMatchTheContract() throws IOException {
        Map<String, Object> document;
        try (Reader reader = Files.newBufferedReader(CONTRACT)) {
            document = new Yaml().load(reader);
        }
        Map<String, Object> components = (Map<String, Object>) document.get("components");
        Map<String, Object> schemas = (Map<String, Object>) components.get("schemas");
        List<String> contractCodes = (List<String>) ((Map<String, Object>) schemas.get("ErrorCode")).get("enum");

        List<String> serverCodes = Arrays.stream(ErrorCode.values()).map(Enum::name).toList();

        assertThat(serverCodes).containsExactlyElementsOf(contractCodes);
    }
}
