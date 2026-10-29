package taxi.blizz.platform;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import taxi.blizz.TestcontainersConfiguration;

/**
 * Audit 29.10.2026: scheduled workers do not share one thread, so a slow one (a recording download, a provider
 * outage) cannot hold back dispatch and the outbox relay.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class WorkerThreadsTests {

    @Autowired
    ThreadPoolTaskScheduler scheduler;

    @Test
    void scheduledWorkersHaveAPoolOfTheirOwn() {
        assertThat(scheduler.getPoolSize()).isGreaterThanOrEqualTo(10);
        assertThat(scheduler.getThreadNamePrefix()).isEqualTo("blizz-worker-");
    }
}
