package taxi.blizz.notification.internal;

import java.time.Clock;
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
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.telephony.TextMessages;

/**
 * Sends the due SMS to phone orders' callers (REQ-NTF-02/03/08), with the same lease and retry rules as pushes. The
 * number is looked up when sending, never kept with the notification. No answer from the provider counts as sent:
 * trying again could text the caller twice. When an SMS fails for good or its deadline passes, the event
 * {@code CallerNotNotified} goes out once, and the dispatchers get a task (REQ-NTF-08); a failed SMS never undoes the
 * assignment.
 */
@Component
class SmsWorker {

    private static final Logger log = LoggerFactory.getLogger(SmsWorker.class);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final TextMessages texts;
    private final Orders orders;
    private final Outbox outbox;
    private final Clock clock;

    SmsWorker(JdbcClient jdbc, TransactionTemplate tx, TextMessages texts, Orders orders, Outbox outbox,
              Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.texts = texts;
        this.orders = orders;
        this.outbox = outbox;
        this.clock = clock;
    }

    record Claimed(UUID id, UUID orderId, String template, String body, OffsetDateTime deadline, int attempts) {
    }

    /** Sends what is due; returns how many SMS were taken. */
    int runOnce() {
        List<Claimed> claimed = claim();
        for (Claimed sms : claimed) {
            try {
                deliver(sms);
            } catch (RuntimeException e) {
                log.error("SMS notification {} failed locally", sms.id(), e); // taken again after the lease
            }
        }
        return claimed.size();
    }

    private List<Claimed> claim() {
        OffsetDateTime now = now();
        List<Claimed> claimed = tx.execute(status -> jdbc.sql("""
                        with due as (
                            select id from notification
                            where channel = 'SMS'
                              and ((state = 'PENDING' and next_attempt_at <= :now)
                                   or (state = 'SENDING' and lease_until < :now))
                            order by next_attempt_at limit :limit
                            for update skip locked)
                        update notification n
                        set state = 'SENDING', lease_until = :lease, attempts = n.attempts + 1
                        from due where n.id = due.id
                        returning n.id, n.recipient_id, n.template, n.body, n.deadline, n.attempts""")
                .param("now", now).param("lease", now.plus(PushWorker.LEASE)).param("limit", PushWorker.BATCH)
                .query((rs, i) -> new Claimed(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getString(3), rs.getString(4), rs.getObject(5, OffsetDateTime.class), rs.getInt(6)))
                .list());
        return claimed == null ? List.of() : claimed;
    }

    private void deliver(Claimed sms) {
        OffsetDateTime now = now();
        if (!sms.deadline().isAfter(now)) {
            giveUp(sms, "EXPIRED", "The deadline passed before it was sent");
            return;
        }
        String phone = orders.callerNotice(sms.orderId()).map(Orders.CallerNotice::contactPhone).orElse(null);
        if (phone == null) {
            giveUp(sms, "FAILED", "The order has no caller's number");
            return;
        }
        TextMessages.Result result = texts.send(new PhoneNumber(phone), sms.body());
        switch (result.state()) {
            case SENT -> finish(sms.id(), "SENT", null, now);
            case UNKNOWN -> finish(sms.id(), "SENT", "No answer from the provider: " + result.error(), now);
            case FAILED -> {
                OffsetDateTime next = now.plus(PushWorker.backoff(sms.attempts()));
                if (sms.attempts() >= PushWorker.MAX_ATTEMPTS || !next.isBefore(sms.deadline())) {
                    giveUp(sms, "FAILED", result.error());
                } else {
                    jdbc.sql("""
                                    update notification set state = 'PENDING', next_attempt_at = :next,
                                                            lease_until = null, last_error = :error
                                    where id = :id and state = 'SENDING'""")
                            .param("next", next).param("error", result.error()).param("id", sms.id()).update();
                }
            }
        }
    }

    /** Ends the SMS unsent and, once, tells the dispatchers (REQ-NTF-08). */
    private void giveUp(Claimed sms, String state, String error) {
        tx.executeWithoutResult(status -> {
            if (finish(sms.id(), state, error, null) == 1) {
                outbox.publish(new OutboxEvent("CallerNotNotified", 1, "Order", sms.orderId(), 0,
                        Map.of("order_id", sms.orderId().toString(), "notification_id", sms.id().toString(),
                                "template", sms.template(), "outcome", state)));
            }
        });
    }

    private int finish(UUID id, String state, String error, OffsetDateTime sentAt) {
        return jdbc.sql("""
                        update notification set state = :state, last_error = :error, sent_at = :sentAt,
                                                lease_until = null
                        where id = :id and state = 'SENDING'""")
                .param("state", state).param("error", error).param("sentAt", sentAt).param("id", id).update();
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
