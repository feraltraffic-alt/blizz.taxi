package taxi.blizz.platform;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import taxi.blizz.TestcontainersConfiguration;

/** REQ-API-04 – REQ-API-06, T-10: a repeated command returns the original outcome. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class IdempotentCommandsTests {

    record CreateOrder(String from, String to, long priceMinor) {
    }

    record Created(UUID orderId) {
    }

    @Autowired
    IdempotentCommands commands;

    private static CommandKey newKey() {
        return new CommandKey(new Actor(SubjectType.CLIENT, UUID.randomUUID()), "order.create", UUID.randomUUID());
    }

    @Test
    void repeatWithSameBodyReturnsOriginalOutcomeWithoutExecutingAgain() {
        CommandKey key = newKey();
        CreateOrder request = new CreateOrder("A", "B", 18000);
        AtomicInteger executions = new AtomicInteger();

        Created first = commands.execute(key, request, Created.class,
                () -> {
                    executions.incrementAndGet();
                    return new Created(UUID.randomUUID());
                });
        Created repeat = commands.execute(key, request, Created.class,
                () -> {
                    executions.incrementAndGet();
                    return new Created(UUID.randomUUID());
                });

        assertThat(repeat).isEqualTo(first);
        assertThat(executions).hasValue(1);
    }

    @Test
    void sameKeyWithDifferentBodyIsRejected() {
        CommandKey key = newKey();
        commands.execute(key, new CreateOrder("A", "B", 18000), Created.class, () -> new Created(UUID.randomUUID()));

        assertThatThrownBy(() -> commands.execute(key, new CreateOrder("A", "C", 18000), Created.class,
                () -> new Created(UUID.randomUUID())))
                .isInstanceOf(IdempotencyConflictException.class)
                .extracting(e -> ((DomainException) e).code())
                .isEqualTo(ErrorCode.IDEMPOTENCY_CONFLICT);
    }

    @Test
    void sameCommandIdOfAnotherActorIsIndependent() {
        UUID commandId = UUID.randomUUID();
        CommandKey alice = new CommandKey(new Actor(SubjectType.CLIENT, UUID.randomUUID()), "order.create", commandId);
        CommandKey bob = new CommandKey(new Actor(SubjectType.CLIENT, UUID.randomUUID()), "order.create", commandId);

        Created a = commands.execute(alice, new CreateOrder("A", "B", 1), Created.class, () -> new Created(UUID.randomUUID()));
        Created b = commands.execute(bob, new CreateOrder("X", "Y", 2), Created.class, () -> new Created(UUID.randomUUID()));

        assertThat(a).isNotEqualTo(b);
    }

    @Test
    void failedExecutionLeavesNoReceiptSoTheCommandCanBeRetried() {
        CommandKey key = newKey();
        CreateOrder request = new CreateOrder("A", "B", 18000);

        assertThatThrownBy(() -> commands.execute(key, request, Created.class, () -> {
            throw new IllegalStateException("provider down");
        })).isInstanceOf(IllegalStateException.class);

        Created retried = commands.execute(key, request, Created.class, () -> new Created(UUID.randomUUID()));
        assertThat(retried).isNotNull();
    }

    @Test
    void concurrentDuplicatesExecuteOnce() throws Exception {
        CommandKey key = newKey();
        CreateOrder request = new CreateOrder("A", "B", 18000);
        AtomicInteger executions = new AtomicInteger();
        int threads = 8;
        CountDownLatch start = new CountDownLatch(1);
        ExecutorService pool = Executors.newFixedThreadPool(threads);
        try {
            List<Future<Created>> results = new ArrayList<>();
            for (int i = 0; i < threads; i++) {
                Callable<Created> call = () -> {
                    start.await();
                    return commands.execute(key, request, Created.class, () -> {
                        executions.incrementAndGet();
                        sleep(100);
                        return new Created(UUID.randomUUID());
                    });
                };
                results.add(pool.submit(call));
            }
            start.countDown();

            Created expected = results.getFirst().get();
            for (Future<Created> result : results) {
                assertThat(result.get()).isEqualTo(expected);
            }
            assertThat(executions).hasValue(1);
        } finally {
            pool.shutdownNow();
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
