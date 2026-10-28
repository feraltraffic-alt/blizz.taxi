package taxi.blizz.configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Legal texts with versions and recorded acceptance (REQ-PRV-08, issue #69). The database is shared with the other
 * test classes, so every test ends with a version in force that need not be accepted: nobody else is blocked.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class LegalDocumentsTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 40.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 40.55);

    @Autowired LegalDocuments legal;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;
    Actor lawyer;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-legal", "PLN", 40);
        lawyer = staff(LegalDocuments.MANAGE_PERMISSION);
    }

    @AfterEach
    void nobodyElseIsBlocked() {
        publish(LegalDocuments.Audience.RIDER, LegalDocuments.Kind.TERMS, false);
        publish(LegalDocuments.Audience.DRIVER, LegalDocuments.Kind.DRIVER_AGREEMENT, false);
    }

    @Test
    void aPublishedVersionNeverChangesAndIsShownInTheLanguageAsked() {
        LegalDocuments.Version draft = legal.createDraft(lawyer, UUID.randomUUID(), LegalDocuments.Audience.RIDER,
                LegalDocuments.Kind.PRIVACY_NOTICE, new LegalDocuments.Draft(Map.of("uk", "Повідомлення"), false,
                        OffsetDateTime.now(ZoneOffset.UTC)));
        assertThat(draft.state()).isEqualTo("DRAFT");
        LegalDocuments.Version edited = legal.updateDraft(lawyer, UUID.randomUUID(), draft.id(), draft.version(),
                new LegalDocuments.Draft(Map.of("uk", "Повідомлення", "pl", "Informacja"), false,
                        OffsetDateTime.now(ZoneOffset.UTC).minusDays(1)));
        assertCode(() -> legal.updateDraft(lawyer, UUID.randomUUID(), draft.id(), draft.version(),
                new LegalDocuments.Draft(Map.of("uk", "x"), false, OffsetDateTime.now())), ErrorCode.VERSION_CONFLICT);
        LegalDocuments.Version published = legal.publish(lawyer, UUID.randomUUID(), draft.id(), edited.version());
        assertThat(published.state()).isEqualTo("PUBLISHED");
        assertThat(published.effectiveFrom()).as("never in the past").isAfter(OffsetDateTime.now().minusMinutes(1));

        assertCode(() -> legal.updateDraft(lawyer, UUID.randomUUID(), draft.id(), published.version(),
                new LegalDocuments.Draft(Map.of("uk", "Інше"), false, OffsetDateTime.now())), ErrorCode.STATE_CONFLICT);
        assertThatThrownBy(() -> jdbc.sql("update legal_document_version set texts = '{\"uk\":\"Інше\"}' where id = :id")
                .param("id", draft.id()).update()).isInstanceOf(DataAccessException.class);
        assertThatThrownBy(() -> jdbc.sql("delete from legal_document_version where id = :id")
                .param("id", draft.id()).update()).isInstanceOf(DataAccessException.class);

        LegalDocuments.Text pl = legal.text(LegalDocuments.Audience.RIDER, LegalDocuments.Kind.PRIVACY_NOTICE, "pl")
                .orElseThrow();
        assertThat(pl.versionId()).isEqualTo(draft.id());
        assertThat(pl.text()).isEqualTo("Informacja");
        assertThat(legal.text(LegalDocuments.Audience.RIDER, LegalDocuments.Kind.PRIVACY_NOTICE, "de").orElseThrow()
                .language()).as("the first of uk, pl, ru, en it has").isEqualTo("uk");

        assertCode(() -> legal.createDraft(staff(), UUID.randomUUID(), LegalDocuments.Audience.RIDER,
                LegalDocuments.Kind.TERMS, new LegalDocuments.Draft(Map.of("uk", "x"), true, OffsetDateTime.now())),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> legal.createDraft(lawyer, UUID.randomUUID(), LegalDocuments.Audience.RIDER,
                LegalDocuments.Kind.TERMS, new LegalDocuments.Draft(Map.of("de", "x"), true, OffsetDateTime.now())),
                ErrorCode.VALIDATION_FAILED);
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where resource_id = :id
                          and action in ('legal_document.create', 'legal_document.update', 'legal_document.publish')""")
                .param("id", draft.id().toString()).query(Long.class).single()).isEqualTo(3);
    }

    @Test
    void aRiderOrdersOnlyAfterAcceptingTheTermsInForceAndATripGoesOn() {
        Actor rider = rides.client();
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        LegalDocuments.Version first = publish(LegalDocuments.Audience.RIDER, LegalDocuments.Kind.TERMS, true);

        assertCode(() -> rides.order(rider, city, PICKUP, DROPOFF), ErrorCode.ACCEPTANCE_REQUIRED);
        assertThat(rides.complete(ride, true)).as("a trip in progress is not stopped").isNotNull();
        assertThat(legal.inForce(rider)).filteredOn(v -> v.kind() == LegalDocuments.Kind.TERMS).singleElement()
                .satisfies(v -> {
                    assertThat(v.versionId()).isEqualTo(first.id());
                    assertThat(v.accepted()).isFalse();
                });

        assertCode(() -> legal.accept(rider, UUID.randomUUID(), first.id(), "de", null), ErrorCode.VALIDATION_FAILED);
        UUID command = UUID.randomUUID();
        LegalDocuments.Acceptance accepted = legal.accept(rider, command, first.id(), "pl", null);
        assertThat(legal.accept(rider, command, first.id(), "pl", null)).as("a repeat").isEqualTo(accepted);
        assertThat(legal.accept(rider, UUID.randomUUID(), first.id(), "uk", null).language())
                .as("accepted once; the first acceptance stays").isEqualTo("pl");
        rides.driverNear(PICKUP);
        assertThat(rides.order(rider, city, PICKUP, DROPOFF).id()).isNotNull();

        LegalDocuments.Version second = publish(LegalDocuments.Audience.RIDER, LegalDocuments.Kind.TERMS, true);
        Actor late = rides.client();
        assertCode(() -> legal.accept(late, UUID.randomUUID(), first.id(), "pl", null), ErrorCode.STATE_CONFLICT);
        legal.accept(late, UUID.randomUUID(), second.id(), "uk", null);
        assertThat(legal.acceptances(rider)).extracting(LegalDocuments.Acceptance::versionId)
                .containsExactly(first.id());
        assertThatThrownBy(() -> jdbc.sql("delete from legal_acceptance where subject_id = :id")
                .param("id", rider.id()).update()).isInstanceOf(DataAccessException.class);
        assertCode(() -> legal.accept(new Actor(SubjectType.DRIVER, UUID.randomUUID()), UUID.randomUUID(),
                second.id(), "uk", null), ErrorCode.NOT_FOUND);
    }

    @Test
    void aDriverGoesOnlineOnlyAfterAcceptingTheAgreement() {
        LegalDocuments.Version agreement = publish(LegalDocuments.Audience.DRIVER,
                LegalDocuments.Kind.DRIVER_AGREEMENT, true);
        assertCode(() -> rides.driverNear(PICKUP), ErrorCode.ACCEPTANCE_REQUIRED);
        Actor rider = rides.client();
        assertThat(legal.inForce(rider)).as("riders do not see drivers' texts")
                .noneMatch(v -> v.versionId().equals(agreement.id()));
    }

    // ---------------------------------------------------------------- fixtures

    private LegalDocuments.Version publish(LegalDocuments.Audience audience, LegalDocuments.Kind kind,
                                           boolean required) {
        LegalDocuments.Version draft = legal.createDraft(lawyer, UUID.randomUUID(), audience, kind,
                new LegalDocuments.Draft(Map.of("uk", "Умови", "pl", "Warunki"), required,
                        OffsetDateTime.now(ZoneOffset.UTC)));
        return legal.publish(lawyer, UUID.randomUUID(), draft.id(), draft.version());
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Legal', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "legal-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
