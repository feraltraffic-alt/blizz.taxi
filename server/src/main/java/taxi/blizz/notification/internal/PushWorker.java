package taxi.blizz.notification.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.identity.SessionService;
import tools.jackson.databind.json.JsonMapper;

/**
 * Sends the due notifications (REQ-NTF-02/03). Several instances share the work: each takes a batch with a lease
 * (SKIP LOCKED), and a batch abandoned by a crashed instance is taken again when its lease runs out — so a push may
 * rarely come twice, never be lost. A failure is retried with a growing pause until the deadline; after the deadline
 * the notification expires unsent. Devices of closed sessions and dead tokens are dropped on the way.
 */
@Component
class PushWorker {

    private static final Logger log = LoggerFactory.getLogger(PushWorker.class);

    static final int BATCH = 50;
    static final int MAX_ATTEMPTS = 6;
    static final Duration LEASE = Duration.ofSeconds(30);
    /** Longer than sending to all of a recipient's devices takes (5 s connect + 10 s answer each). */
    static final Duration ITEM_LEASE = Duration.ofMinutes(5);

    /**
     * Renews the claim of one notification just before it is sent, if it is still this claim's (its attempt count is
     * the claim's token). A batch is sent one by one and a provider may take its whole timeout, so the batch's short
     * lease could lapse and a second instance send it again (audit 29.10.2026).
     */
    static boolean takeOver(JdbcClient jdbc, UUID id, int attempts, Clock clock, Duration lease) {
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(java.time.ZoneOffset.UTC);
        return jdbc.sql("""
                        update notification set lease_until = :lease
                        where id = :id and state = 'SENDING' and attempts = :attempts""")
                .param("lease", now.plus(lease)).param("id", id).param("attempts", attempts)
                .update() == 1;
    }

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final PushDevices devices;
    private final PushProvider provider;
    private final SessionService sessions;
    private final JsonMapper json;
    private final Clock clock;

    PushWorker(JdbcClient jdbc, TransactionTemplate tx, PushDevices devices, PushProvider provider,
               SessionService sessions, JsonMapper json, Clock clock, taxi.blizz.operations.Orders orders) {
        this.orders = orders;
        this.jdbc = jdbc;
        this.tx = tx;
        this.devices = devices;
        this.provider = provider;
        this.sessions = sessions;
        this.json = json;
        this.clock = clock;
    }

    private final taxi.blizz.operations.Orders orders;

    record Claimed(UUID id, String recipientType, UUID recipientId, String title, String body, String data,
                   OffsetDateTime deadline, int attempts) {
    }

    /** Sends what is due; returns how many notifications were taken. */
    int runOnce() {
        List<Claimed> claimed = claim();
        for (Claimed notification : claimed) {
            try {
                if (!takeOver(jdbc, notification.id(), notification.attempts(), clock, ITEM_LEASE)) {
                    continue; // its claim lapsed while earlier ones were sent, and another instance took it
                }
                deliver(notification);
            } catch (RuntimeException e) {
                // Stays SENDING; taken again after the lease.
                log.error("Notification {} failed locally", notification.id(), e);
            }
        }
        return claimed.size();
    }

    private List<Claimed> claim() {
        OffsetDateTime now = now();
        List<Claimed> claimed = tx.execute(status -> jdbc.sql("""
                        with due as (
                            select id from notification
                            where channel = 'PUSH'
                              and ((state = 'PENDING' and next_attempt_at <= :now)
                                   or (state = 'SENDING' and lease_until < :now))
                            order by next_attempt_at limit :limit
                            for update skip locked)
                        update notification n
                        set state = 'SENDING', lease_until = :lease, attempts = n.attempts + 1
                        from due where n.id = due.id
                        returning n.id, n.recipient_type, n.recipient_id, n.title, n.body, n.data::text, n.deadline,
                                  n.attempts""")
                .param("now", now).param("lease", now.plus(LEASE)).param("limit", BATCH)
                .query((rs, i) -> new Claimed(rs.getObject(1, UUID.class), rs.getString(2),
                        rs.getObject(3, UUID.class), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getObject(7, OffsetDateTime.class), rs.getInt(8)))
                .list());
        return claimed == null ? List.of() : claimed;
    }

    private void deliver(Claimed n) {
        OffsetDateTime now = now();
        if (!n.deadline().isAfter(now)) {
            finish(n.id(), "EXPIRED", "The deadline passed before it was sent", null);
            return;
        }
        @SuppressWarnings("unchecked")
        Map<String, String> data = json.readValue(n.data(), Map.class);
        if (!stillCurrent(orders, data)) {
            finish(n.id(), "SUPERSEDED", "No longer current: the offer closed or the assignment was replaced", null);
            return;
        }
        Duration ttl = Duration.between(now, n.deadline());
        int sent = 0;
        int retry = 0;
        String lastError = null;
        for (PushDevices.Target device : devices.targets(n.recipientType(), n.recipientId())) {
            if (!sessions.isOpen(device.sessionId())) {
                devices.revoke(device.id()); // logged out or revoked: the phone is not theirs any more
                continue;
            }
            PushProvider.Result result = provider.send(device.token(), device.platform(), n.title(), n.body(), data,
                    ttl);
            switch (result.outcome()) {
                case SENT -> sent++;
                case INVALID_TOKEN -> devices.revoke(device.id());
                case RETRY -> {
                    retry++;
                    lastError = result.error();
                }
            }
        }
        if (sent > 0) {
            finish(n.id(), "SENT", lastError, now);
        } else if (retry == 0) {
            finish(n.id(), "NO_DEVICE", null, null);
        } else if (n.attempts() >= MAX_ATTEMPTS) {
            finish(n.id(), "FAILED", lastError, null);
        } else {
            OffsetDateTime next = now.plus(backoff(n.attempts()));
            if (!next.isBefore(n.deadline())) {
                finish(n.id(), "EXPIRED", lastError, null);
            } else {
                jdbc.sql("""
                                update notification set state = 'PENDING', next_attempt_at = :next, lease_until = null,
                                                        last_error = :error
                                where id = :id and state = 'SENDING'""")
                        .param("next", next).param("error", lastError).param("id", n.id()).update();
            }
        }
    }

    /** 2, 4, 8 … seconds, at most a minute. */
    static Duration backoff(int attempts) {
        return Duration.ofSeconds(Math.min(60, 1L << Math.min(attempts, 6)));
    }

    /**
     * The offer or assignment a notification announces is still current (REQ-NTF-03, AC-19, issue #143): a push or
     * SMS about a closed offer or a replaced driver is never sent. A notification without a subject is always current.
     */
    static boolean stillCurrent(taxi.blizz.operations.Orders orders, Map<String, String> data) {
        String offer = data.get("offer_id");
        if (offer != null && !offer.isBlank() && !orders.offerOpen(UUID.fromString(offer))) {
            return false;
        }
        String assignment = data.get("assignment_id");
        return assignment == null || assignment.isBlank() || orders.assignmentCurrent(UUID.fromString(assignment));
    }

    private void finish(UUID id, String state, String error, OffsetDateTime sentAt) {
        jdbc.sql("""
                        update notification set state = :state, last_error = :error, sent_at = :sentAt,
                                                lease_until = null
                        where id = :id and state = 'SENDING'""")
                .param("state", state).param("error", error).param("sentAt", sentAt).param("id", id).update();
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
