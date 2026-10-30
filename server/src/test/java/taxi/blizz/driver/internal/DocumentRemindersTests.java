package taxi.blizz.driver.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.internal.OutboxRelay;

/**
 * Reminders that an accepted document is about to end (issue #51). "Today" is a fixed date far from the real one,
 * passed to the run as the scheduler would.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DocumentRemindersTests {

    static final LocalDate TODAY = LocalDate.of(2031, 6, 10);

    @Autowired
    DocumentReminders reminders;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    OutboxRelay relay;

    private UUID driver() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, language, created_at,
                                            updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', 'uk', now(), now())""")
                .param("id", id)
                .param("phone", taxi.blizz.TestPhones.unique("+38096", 7))
                .update();
        return id;
    }

    private UUID document(UUID driver, String type, String decision, LocalDate validTo, OffsetDateTime createdAt) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver_document (id, driver_id, type, number, valid_from, valid_to, decision,
                                                     created_at)
                        values (:id, :driver, :type, 'N-1', :from, :to, :decision, :created)""")
                .param("id", id).param("driver", driver).param("type", type)
                .param("from", validTo.minusYears(1)).param("to", validTo).param("decision", decision)
                .param("created", createdAt).update();
        return id;
    }

    private UUID accepted(UUID driver, String type, LocalDate validTo) {
        return document(driver, type, "ACCEPTED", validTo, OffsetDateTime.now().minusDays(30));
    }

    /** The events published for the document: days_left of each, oldest first. */
    private List<Integer> events(UUID document) {
        return jdbc.sql("""
                        select (payload ->> 'days_left')::int from outbox
                        where event_type = 'DriverDocumentExpiring' and payload ->> 'document_id' = :document
                        order by occurred_at""")
                .param("document", document.toString()).query(Integer.class).list();
    }

    @Test
    void sevenDaysAheadThenOneDayAheadOnceEach() {
        UUID driver = driver();
        UUID licence = accepted(driver, "DRIVER_LICENSE", TODAY.plusDays(7));
        UUID farAway = accepted(driver, "TAXI_PERMIT", TODAY.plusDays(30));

        reminders.run(TODAY);
        assertThat(events(licence)).containsExactly(7);
        reminders.run(TODAY); // the same day again
        reminders.run(TODAY.plusDays(1)); // six days left: the first reminder was given
        reminders.run(TODAY.plusDays(5));
        assertThat(events(licence)).containsExactly(7);

        reminders.run(TODAY.plusDays(6));
        assertThat(events(licence)).containsExactly(7, 1);
        reminders.run(TODAY.plusDays(6));
        reminders.run(TODAY.plusDays(7)); // the last valid day
        reminders.run(TODAY.plusDays(8)); // ended: the expiry run takes over
        assertThat(events(licence)).containsExactly(7, 1);
        assertThat(events(farAway)).isEmpty();

        Map<String, Object> event = jdbc.sql("""
                        select aggregate_type, aggregate_id, payload ->> 'driver_id' as driver_id,
                               payload ->> 'document_type' as document_type, payload ->> 'valid_to' as valid_to
                        from outbox where event_type = 'DriverDocumentExpiring' and payload ->> 'document_id' = :d
                        order by occurred_at limit 1""")
                .param("d", licence.toString()).query().singleRow();
        assertThat(event).containsEntry("aggregate_type", "Driver").containsEntry("aggregate_id", driver)
                .containsEntry("driver_id", driver.toString()).containsEntry("document_type", "DRIVER_LICENSE")
                .containsEntry("valid_to", TODAY.plusDays(7).toString());
    }

    @Test
    void onlyTheDocumentInForceCounts() {
        UUID driver = driver();
        UUID replaced = document(driver, "DRIVER_LICENSE", "ACCEPTED", TODAY.plusDays(7),
                OffsetDateTime.now().minusDays(30));
        document(driver, "DRIVER_LICENSE", "ACCEPTED", TODAY.plusYears(5), OffsetDateTime.now().minusDays(1));
        reminders.run(TODAY);
        reminders.run(TODAY.plusDays(6));
        assertThat(events(replaced)).as("replaced by a newer accepted one").isEmpty();

        // A newer document still waiting for review does not replace the one in force: it can still end.
        UUID inForce = document(driver, "TAXI_PERMIT", "ACCEPTED", TODAY.plusDays(7),
                OffsetDateTime.now().minusDays(30));
        document(driver, "TAXI_PERMIT", "PENDING", TODAY.plusYears(5), OffsetDateTime.now().minusDays(1));
        reminders.run(TODAY);
        assertThat(events(inForce)).containsExactly(7);
    }

    @Test
    void aMissedDayIsCaughtUp() {
        UUID driver = driver();
        UUID fourDays = accepted(driver, "DRIVER_LICENSE", TODAY.plusDays(4));
        UUID endsToday = accepted(driver, "TAXI_PERMIT", TODAY);
        reminders.run(TODAY);
        assertThat(events(fourDays)).as("the first reminder, late").containsExactly(4);
        assertThat(events(endsToday)).as("only the last one").containsExactly(0);
        reminders.run(TODAY.plusDays(1));
        assertThat(events(fourDays)).containsExactly(4);
        reminders.run(TODAY.plusDays(3));
        assertThat(events(fourDays)).containsExactly(4, 1);
    }

    @Test
    void twoInstancesAtOnceAnnounceOnce() throws Exception {
        UUID driver = driver();
        UUID licence = accepted(driver, "DRIVER_LICENSE", TODAY.plusDays(7));
        CountDownLatch start = new CountDownLatch(1);
        Callable<Integer> run = () -> {
            start.await();
            return reminders.run(TODAY);
        };
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            Future<Integer> first = pool.submit(run);
            Future<Integer> second = pool.submit(run);
            start.countDown();
            first.get();
            second.get();
        } finally {
            pool.shutdown();
        }
        assertThat(events(licence)).containsExactly(7);
        assertThat(jdbc.sql("select count(*) from driver_document_reminder where document_id = :d")
                .param("d", licence).query(Integer.class).single()).isEqualTo(1);
    }

    @Test
    void theEventBecomesAPushNotificationForTheDriver() {
        UUID driver = driver();
        UUID insurance = accepted(driver, "INSURANCE", TODAY.plusDays(7));
        reminders.run(TODAY);
        while (relay.runOnce() > 0) {
            // deliver
        }
        Map<String, Object> notification = jdbc.sql("""
                        select recipient_type, template, locale, title, body, data ->> 'document_id' as document_id
                        from notification where recipient_id = :driver""")
                .param("driver", driver).query().singleRow();
        assertThat(notification).containsEntry("recipient_type", "DRIVER")
                .containsEntry("template", "driver.document-expiring").containsEntry("locale", "uk")
                .containsEntry("title", "Документ скоро закінчується")
                .containsEntry("body", "Страховка діє до 17.06.2031. Завантажте новий у застосунку")
                .containsEntry("document_id", insurance.toString());
    }
}
