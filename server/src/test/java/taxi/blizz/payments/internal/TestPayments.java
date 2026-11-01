package taxi.blizz.payments.internal;

import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.platform.internal.OutboxRelay;

/**
 * Test fixture for tests outside this package (issue #140): the fake bank's script and requests, and a worker run
 * with every unknown result due at once, as {@code CardHoldTests} does inside the package.
 */
public final class TestPayments {

    private final FakeProvider.Gateway gateway;
    private final PaymentWorker worker;
    private final OutboxRelay relay;
    private final JdbcClient jdbc;

    public TestPayments(ApplicationContext context) {
        this.gateway = context.getBean(FakeProvider.Gateway.class);
        this.worker = context.getBean(PaymentWorker.class);
        this.relay = context.getBean(OutboxRelay.class);
        this.jdbc = context.getBean(JdbcClient.class);
    }

    public void resetGateway() {
        gateway.reset();
    }

    /** The fake bank's next answers: a status, TIMEOUT or LOST_ANSWER. */
    public void next(String... answers) {
        gateway.next(answers);
    }

    public List<Map<String, Object>> requests() {
        return gateway.requests();
    }

    /** Runs the worker until nothing is due, unknown results and lapsed leases due at once, then the outbox. */
    public void settle() {
        for (int i = 0; i < 5; i++) {
            jdbc.sql("update payment_operation set next_check_at = now() - interval '1 second' "
                    + "where state in ('PENDING', 'UNKNOWN')").update();
            jdbc.sql("update payment_operation set lease_until = now() - interval '1 second' where state = 'SENDING'")
                    .update();
            worker.runOnce();
            while (relay.runOnce() > 0) {
                // drain
            }
        }
    }
}
