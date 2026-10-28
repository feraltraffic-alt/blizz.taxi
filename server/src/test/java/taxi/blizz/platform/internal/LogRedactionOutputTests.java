package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.context.annotation.Import;
import taxi.blizz.TestcontainersConfiguration;

/** The real log setup (logback-spring.xml) redacts messages and stack traces (REQ-SEC-08). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
@ExtendWith(OutputCaptureExtension.class)
class LogRedactionOutputTests {

    private static final Logger log = LoggerFactory.getLogger(LogRedactionOutputTests.class);

    @Test
    void aCarelessLogLineLeaksNothing(CapturedOutput output) {
        log.warn("Careless: rider +380671234567 with Bearer abcdefgh12345678 at 50.4501234,30.5234567");
        log.error("Failed", new IllegalStateException("No answer from +48512345678"));
        assertThat(output.getAll())
                .contains("Careless: rider +380*****67 with Bearer [redacted] at 50.45,30.52")
                .contains("No answer from +485*****78")
                .doesNotContain("+380671234567").doesNotContain("abcdefgh12345678").doesNotContain("+48512345678");
    }
}
