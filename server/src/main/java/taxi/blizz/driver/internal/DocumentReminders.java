package taxi.blizz.driver.internal;

import java.time.Clock;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;

/**
 * Tells drivers in time that an accepted document is about to end (issue #51, REQ-DRV-05), before
 * {@link JdbcDriverAdmission#expireDocuments} takes them off the line the day after it ends.
 *
 * <p>Only the document in force counts: the latest accepted one per driver, vehicle and type, as in the expiry run;
 * an older document replaced by a newer accepted one is never announced. Each document is announced once per
 * threshold — 7 days ahead, then 1 day ahead. A day the run missed is caught up: a document 2…7 days from its end
 * gets the first reminder if it has not had one, a document 0…1 days from its end the second. The reminder row and
 * the event are written in one transaction, and the row's primary key makes a repeated run or a second instance
 * publish nothing new.
 */
@Component
class DocumentReminders {

    static final int FIRST = 7;
    static final int LAST = 1;

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final Outbox outbox;
    private final Clock clock;

    DocumentReminders(JdbcClient jdbc, TransactionTemplate tx, Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.outbox = outbox;
        this.clock = clock;
    }

    record Due(UUID documentId, UUID driverId, String type, LocalDate validTo, int daysLeft) {

        int threshold() {
            return daysLeft <= LAST ? LAST : FIRST;
        }
    }

    /** Publishes the reminders due on {@code today} (date in the market's time zone); returns how many. */
    int run(LocalDate today) {
        int published = 0;
        for (Due due : due(today)) {
            Boolean done = tx.execute(status -> announce(due));
            if (Boolean.TRUE.equals(done)) {
                published++;
            }
        }
        return published;
    }

    List<Due> due(LocalDate today) {
        return jdbc.sql("""
                        with current as (
                            select distinct on (driver_id, coalesce(vehicle_id, '00000000-0000-0000-0000-000000000000'::uuid), type)
                                   id, driver_id, type, valid_to
                            from driver_document
                            where decision = 'ACCEPTED'
                            order by driver_id, coalesce(vehicle_id, '00000000-0000-0000-0000-000000000000'::uuid), type, created_at desc)
                        select c.id, c.driver_id, c.type, c.valid_to, c.valid_to - cast(:today as date) as days_left
                        from current c
                        where c.valid_to between cast(:today as date) and cast(:today as date) + :first
                          and not exists (
                              select 1 from driver_document_reminder r
                              where r.document_id = c.id
                                and r.days_left = case when c.valid_to - cast(:today as date) <= :last
                                                       then :last else :first end)
                        order by c.valid_to, c.id""")
                .param("today", today).param("first", FIRST).param("last", LAST)
                .query((rs, i) -> new Due(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class), rs.getString(3),
                        rs.getObject(4, LocalDate.class), rs.getInt(5)))
                .list();
    }

    private boolean announce(Due due) {
        int inserted = jdbc.sql("""
                        insert into driver_document_reminder (document_id, days_left, created_at)
                        values (:document, :threshold, :now)
                        on conflict do nothing""")
                .param("document", due.documentId()).param("threshold", due.threshold())
                .param("now", OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC)).update();
        if (inserted == 0) {
            return false; // another run got here first
        }
        // The reminder changes nothing about the driver: the event carries the driver's current version.
        long version = jdbc.sql("select version from driver where id = :id").param("id", due.driverId())
                .query(Long.class).single();
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("driver_id", due.driverId().toString());
        payload.put("document_id", due.documentId().toString());
        payload.put("document_type", due.type());
        payload.put("valid_to", due.validTo().toString());
        payload.put("days_left", due.daysLeft());
        outbox.publish(new OutboxEvent("DriverDocumentExpiring", 1, "Driver", due.driverId(), version, payload));
        return true;
    }
}
