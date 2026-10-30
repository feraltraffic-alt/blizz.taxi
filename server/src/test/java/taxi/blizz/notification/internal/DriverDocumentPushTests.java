package taxi.blizz.notification.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.platform.SubjectType;

/** {@code DriverDocumentExpiring} → a push to the driver in their language (issue #51, REQ-NTF-07). */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
class DriverDocumentPushTests {

    @Autowired
    JdbcClient jdbc;
    @Autowired
    SessionService auth;
    @Autowired
    PushDevices devices;
    @Autowired
    PushWorker worker;
    @Autowired
    FakePushProvider push;
    @Autowired
    DriverDocumentFeed feed;

    private Actor driver(String language) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, language, created_at,
                                            updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', :language, now(), now())""")
                .param("id", id).param("language", language)
                .param("phone", taxi.blizz.TestPhones.unique("+38095", 7))
                .update();
        return new Actor(SubjectType.DRIVER, id);
    }

    private String register(Actor driver) {
        IssuedSession session = auth.open(new VerifiedSubject(driver, "ACTIVE", false), "document-push-test");
        String token = "fcm-" + UUID.randomUUID();
        devices.register(driver, session.sessionId(), UUID.randomUUID(),
                new PushDevices.Registration("ANDROID", token, null));
        return token;
    }

    private OutboxMessage expiring(Actor driver, UUID eventId, UUID document, String type, LocalDate validTo,
                                   int daysLeft) {
        String payload = """
                {"driver_id":"%s","document_id":"%s","document_type":"%s","valid_to":"%s","days_left":%d}"""
                .formatted(driver.id(), document, type, validTo, daysLeft);
        return new OutboxMessage(eventId, "DriverDocumentExpiring", 1, "Driver", driver.id(), 1, payload, null,
                OffsetDateTime.now(), 0);
    }

    private List<FakePushProvider.Sent> sentTo(String token) {
        return push.sent().stream().filter(s -> s.token().equals(token)).toList();
    }

    private void sendPushes() {
        while (worker.runOnce() > 0) {
            // drain
        }
    }

    @Test
    void theDriverHearsWhichDocumentEndsAndWhenInTheirLanguage() {
        assertThat(feed.supports("DriverDocumentExpiring")).isTrue();
        assertThat(feed.supports("OfferMade")).isFalse();

        Actor driver = driver("pl");
        String token = register(driver);
        UUID document = UUID.randomUUID();
        OutboxMessage event = expiring(driver, UUID.randomUUID(), document, "DRIVER_LICENSE",
                LocalDate.of(2031, 6, 17), 7);
        feed.handle(event);
        feed.handle(event); // delivered again: nothing new
        sendPushes();

        assertThat(sentTo(token)).singleElement().satisfies(sent -> {
            assertThat(sent.title()).isEqualTo("Dokument wkrótce wygaśnie");
            assertThat(sent.body()).isEqualTo("Prawo jazdy: ważność do 17.06.2031. Prześlij nowy w aplikacji");
            assertThat(sent.data()).containsEntry("type", "driver.document-expiring")
                    .containsEntry("document_id", document.toString())
                    .containsEntry("document_type", "DRIVER_LICENSE").containsEntry("valid_to", "2031-06-17");
            assertThat(sent.ttl()).as("a day at most").isPositive()
                    .isLessThanOrEqualTo(DriverDocumentFeed.DEADLINE);
        });

        // The second threshold is a new event, so a second push.
        feed.handle(expiring(driver, UUID.randomUUID(), document, "DRIVER_LICENSE", LocalDate.of(2031, 6, 17), 1));
        sendPushes();
        assertThat(sentTo(token)).hasSize(2);
    }

    @Test
    void eachLanguageNamesTheDocumentType() {
        PushTemplates.Text uk = PushTemplates.text("driver.document-expiring", "uk", "uk").orElseThrow();
        assertThat(PushTemplates.document(uk, "uk", "INSURANCE", LocalDate.of(2031, 6, 17)).body())
                .isEqualTo("Страховка діє до 17.06.2031. Завантажте новий у застосунку");
        PushTemplates.Text ru = PushTemplates.text("driver.document-expiring", "ru", "uk").orElseThrow();
        assertThat(PushTemplates.document(ru, "ru", "TAXI_PERMIT", LocalDate.of(2031, 6, 17)).body())
                .isEqualTo("Разрешение на такси действует до 17.06.2031. Загрузите новый в приложении");
        PushTemplates.Text en = PushTemplates.text("driver.document-expiring", "en", "uk").orElseThrow();
        assertThat(PushTemplates.document(en, "en", "VEHICLE_REGISTRATION", LocalDate.of(2031, 6, 17)).body())
                .isEqualTo("Vehicle registration is valid until 2031-06-17. Upload a new one in the app");
        for (String type : List.of("DRIVER_LICENSE", "IDENTITY", "TAXI_PERMIT", "VEHICLE_REGISTRATION", "INSURANCE",
                "OTHER", "SOMETHING_NEW")) {
            for (String language : List.of("ru", "uk", "pl", "en")) {
                PushTemplates.Text text = PushTemplates.document(
                        PushTemplates.text("driver.document-expiring", language, "en").orElseThrow(), language, type,
                        LocalDate.of(2031, 6, 17));
                assertThat(text.title() + text.body()).as(type + " in " + language).doesNotContain("{", "}");
            }
        }
    }
}
