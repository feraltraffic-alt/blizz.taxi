package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;

/**
 * ADR 0016, issue #215: the {@code service_id} columns keep a default of the first service, so the many test fixtures
 * of the time before services still insert. Server code never leans on it: every insert into a table with a service
 * names the service, or a row of another service would silently land in the first one.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ServiceColumnGuardTests {

    /** An insert and its column list, across lines of a text block. */
    static final Pattern INSERT = Pattern.compile("insert\\s+into\\s+(\\w+)\\s*(\\(([^)]*)\\))?",
            Pattern.CASE_INSENSITIVE);

    @Autowired JdbcClient jdbc;

    @Test
    void everyServerInsertIntoATableWithAServiceNamesIt() throws IOException {
        Set<String> tables = new TreeSet<>(jdbc.sql("""
                        select table_name from information_schema.columns
                        where table_schema = current_schema() and column_name = 'service_id'
                          and table_name <> 'service'""")
                .query(String.class).list());
        assertThat(tables).as("the tables with a service, read from the database")
                .contains("client", "driver", "staff_user", "city", "payment_merchant");
        List<String> offenders = new ArrayList<>();
        int checked = 0;
        try (Stream<Path> files = Files.walk(Path.of("src", "main", "java"))) {
            for (Path file : files.filter(f -> f.toString().endsWith(".java")).toList()) {
                Matcher m = INSERT.matcher(Files.readString(file));
                while (m.find()) {
                    String table = m.group(1).toLowerCase(java.util.Locale.ROOT);
                    if (!tables.contains(table)) {
                        continue;
                    }
                    checked++;
                    if (m.group(3) == null || !m.group(3).matches("(?s).*\\bservice_id\\b.*")) {
                        offenders.add(file.getFileName() + ": insert into " + table);
                    }
                }
            }
        }
        assertThat(checked).as("the scan found the inserts it checks").isGreaterThan(10);
        assertThat(offenders).as("inserts that leave the service to the first service's default").isEmpty();
    }
}
