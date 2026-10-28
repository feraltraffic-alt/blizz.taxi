package taxi.blizz.platform;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.platform.InvariantChecks.Check;
import taxi.blizz.platform.InvariantChecks.ObjectType;

/** Platform-owned receipts: the marker and outbox event commit together, once per check/object across instances. */
@Component
public class InvariantReports {
    private final JdbcClient jdbc;
    private final Outbox outbox;
    private final Clock clock;

    InvariantReports(JdbcClient jdbc, Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.outbox = outbox;
        this.clock = clock;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public boolean reportOnce(Check check, ObjectType type, UUID id, String detail) {
        Objects.requireNonNull(id);
        if (detail == null || !detail.matches("[A-Z][A-Z0-9_ ;=.-]{0,199}")) {
            throw new IllegalArgumentException("Invariant detail must be a fixed diagnostic code");
        }
        int inserted = jdbc.sql("""
                insert into invariant_report(check_id,object_type,object_id,reported_at)
                values(:check,:type,:id,:now) on conflict(check_id,object_id) do nothing
                """).param("check", check.name()).param("type", type.wireName()).param("id", id)
                .param("now", OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC)).update();
        if (inserted == 0) return false;
        outbox.publish(new OutboxEvent("InvariantViolated", 1, type.wireName(), id, 0, Map.of(
                "check", check.name(), "object_type", type.wireName(), "object_id", id.toString(), "detail", detail)));
        return true;
    }
}
