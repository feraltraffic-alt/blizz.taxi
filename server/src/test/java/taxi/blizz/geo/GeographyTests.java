package taxi.blizz.geo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoConfiguration.Change;
import taxi.blizz.geo.GeoConfiguration.CityDraft;
import taxi.blizz.geo.GeoConfiguration.Revision;
import taxi.blizz.geo.GeoConfiguration.ZoneDraft;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** REQ-TEN-03/04/06, REQ-GEO-01/18, REQ-DATA-09, AC-02 (polygons), T-35. Synthetic geometry only. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class GeographyTests {
    private static final Actor STAFF = new Actor(SubjectType.STAFF, UUID.randomUUID());
    private static final String BOX = "SRID=4326;MULTIPOLYGON(((30 50,31 50,31 51,30 51,30 50)))";
    private static final String INVALID = "SRID=4326;MULTIPOLYGON(((30 50,31 51,30 51,31 50,30 50)))";
    private static final GeoPoint KYIV_POINT = new GeoPoint(50.45, 30.52);
    @Autowired GeoConfiguration geo;
    @Autowired CityResolver resolver;
    @Autowired JdbcClient jdbc;

    @BeforeEach
    void clearGeography() {
        jdbc.sql("delete from zone").update();
        jdbc.sql("delete from city").update();
    }

    @Test
    void resolvesInsideAndBoundaryInLatitudeLongitudeOrderButNotOutsideOrDraft() {
        Revision draft = draft(BOX, 0);
        assertThat(resolver.resolve(KYIV_POINT)).isEmpty();
        Revision published = geo.publishCity(change(draft));
        City city = resolver.resolve(KYIV_POINT).orElseThrow();
        assertThat(city.id()).isEqualTo(published.id());
        assertThat(city.version()).isEqualTo(1);
        assertThat(city.currency()).isEqualTo("UAH");
        assertThat(city.timezone()).isEqualTo("Europe/Kyiv");
        assertThat(resolver.resolve(new GeoPoint(50, 30.52))).hasValue(city);
        assertThat(resolver.resolve(new GeoPoint(50, 30))).hasValue(city);
        assertThat(resolver.resolve(new GeoPoint(49, 30))).isEmpty();
        assertThat(resolver.resolve(new GeoPoint(30.52, 50.45))).isEmpty();
    }

    @Test
    void highestPriorityWinsAndArchivingFallsBackToTheLowerPriority() {
        Revision low = geo.publishCity(change(draft(BOX, -2)));
        Revision high = geo.publishCity(change(draft(BOX, 7)));
        assertThat(resolver.resolve(KYIV_POINT).orElseThrow().id()).isEqualTo(high.id());
        geo.archiveCity(change(high));
        assertThat(resolver.resolve(KYIV_POINT).orElseThrow().id()).isEqualTo(low.id());
        geo.archiveCity(change(low));
        assertThat(resolver.resolve(KYIV_POINT)).isEmpty();
    }

    @Test
    void rejectsEqualPriorityOverlapAndSharedBordersButAllowsDisjointCities() {
        geo.publishCity(change(draft(BOX, 4)));
        reject(() -> geo.publishCity(change(draft(BOX, 4))), ErrorCode.STATE_CONFLICT);
        String adjacent = "SRID=4326;MULTIPOLYGON(((31 50,32 50,32 51,31 51,31 50)))";
        reject(() -> geo.publishCity(change(draft(adjacent, 4))), ErrorCode.STATE_CONFLICT);
        String separate = "SRID=4326;MULTIPOLYGON(((32 50,33 50,33 51,32 51,32 50)))";
        assertThat(geo.publishCity(change(draft(separate, 4))).state()).isEqualTo("PUBLISHED");
    }

    @Test
    void rejectsInvalidAndEmptyPolygonsAtPublicationWithoutChangingTheDraft() {
        for (String polygon : List.of(INVALID, "SRID=4326;MULTIPOLYGON EMPTY")) {
            Revision draft = draft(polygon, 0);
            Change command = change(draft);
            reject(() -> geo.publishCity(command), ErrorCode.VALIDATION_FAILED);
            assertThat(jdbc.sql("select state from city where id = :id").param("id", draft.id())
                    .query(String.class).single()).isEqualTo("DRAFT");
            assertThat(audits(draft, "city.publish")).isZero();
            assertThat(jdbc.sql("select count(*) from command_receipt where command_id = :id")
                    .param("id", command.commandId()).query(Long.class).single()).isZero();
        }
    }

    @Test
    void refusesWrongSridGeometryTypeMalformedGeometryAndBadMetadata() {
        for (String polygon : List.of(BOX.replace("4326", "3857"), "SRID=4326;POINT(30 50)", "not geometry")) {
            reject(() -> draft(polygon, 0), ErrorCode.VALIDATION_FAILED);
        }
        reject(() -> geo.createCityDraft(new CityDraft(UUID.randomUUID(), STAFF, 0, "bad", "Synthetic",
                "NOT", "Europe/Kyiv", BOX, 0, "test")), ErrorCode.VALIDATION_FAILED);
        reject(() -> geo.createCityDraft(new CityDraft(UUID.randomUUID(), STAFF, 0, "bad", "Synthetic",
                "UAH", "+02:00", BOX, 0, "test")), ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void holesAreExcludedButTheirBoundaryIsCovered() {
        String hole = "SRID=4326;MULTIPOLYGON(((30 50,31 50,31 51,30 51,30 50),"
                + "(30.4 50.4,30.4 50.6,30.6 50.6,30.6 50.4,30.4 50.4)))";
        geo.publishCity(change(draft(hole, 0)));
        assertThat(resolver.resolve(new GeoPoint(50.5, 30.5))).isEmpty();
        assertThat(resolver.resolve(new GeoPoint(50.4, 30.5))).isPresent();
    }

    @Test
    void publishReplaysTheOriginalOutcomeEvenAfterArchiveAndAuditsEachTransitionOnce() {
        Revision draft = draft(BOX, 0);
        Change publish = change(draft);
        Revision first = geo.publishCity(publish);
        geo.archiveCity(change(first));
        assertThat(geo.publishCity(publish)).isEqualTo(first);
        assertThat(audits(draft, "city.createDraft")).isEqualTo(1);
        assertThat(audits(draft, "city.publish")).isEqualTo(1);
        assertThat(audits(draft, "city.archive")).isEqualTo(1);
        assertThat(jdbc.sql("select actor_type from audit_log where resource_id = :id and action = 'city.publish'")
                .param("id", draft.id().toString()).query(String.class).single()).isEqualTo("STAFF");
        assertThat(jdbc.sql("select actor_id from audit_log where resource_id = :id and action = 'city.archive'")
                .param("id", draft.id().toString()).query(UUID.class).single()).isEqualTo(STAFF.id());
        assertThat(jdbc.sql("select before->>'state' from audit_log where resource_id = :id and action = 'city.publish'")
                .param("id", draft.id().toString()).query(String.class).single()).isEqualTo("DRAFT");
        reject(() -> geo.publishCity(new Change(publish.commandId(), STAFF, draft.id(), 1, publish.reason())),
                ErrorCode.IDEMPOTENCY_CONFLICT);
    }

    @Test
    void staleVersionsAndForbiddenTransitionsAreRejected() {
        Revision draft = draft(BOX, 0);
        Revision published = geo.publishCity(change(draft));
        reject(() -> geo.archiveCity(change(draft)), ErrorCode.VERSION_CONFLICT);
        reject(() -> geo.publishCity(change(published)), ErrorCode.STATE_CONFLICT);
        Revision archived = geo.archiveCity(change(published));
        reject(() -> geo.publishCity(change(archived)), ErrorCode.STATE_CONFLICT);
        reject(() -> geo.archiveCity(new Change(UUID.randomUUID(), STAFF, UUID.randomUUID(), 0, "test")),
                ErrorCode.NOT_FOUND);
    }

    @Test
    void onlyOneConcurrentEqualPriorityPublisherCommits() throws Exception {
        Revision a = draft(BOX, 3);
        Revision b = draft(BOX, 3);
        CountDownLatch ready = new CountDownLatch(2);
        CountDownLatch start = new CountDownLatch(1);
        try (var pool = Executors.newFixedThreadPool(2)) {
            var outcomes = List.of(a, b).stream().map(draft -> pool.submit(() -> {
                ready.countDown();
                if (!start.await(10, TimeUnit.SECONDS)) throw new AssertionError("Start timeout");
                try { geo.publishCity(change(draft)); return true; }
                catch (DomainException conflict) {
                    assertThat(conflict.code()).isEqualTo(ErrorCode.STATE_CONFLICT);
                    return false;
                }
            })).toList();
            assertThat(ready.await(10, TimeUnit.SECONDS)).isTrue();
            start.countDown();
            assertThat(List.of(outcomes.get(0).get(20, TimeUnit.SECONDS), outcomes.get(1).get(20, TimeUnit.SECONDS)))
                    .containsExactlyInAnyOrder(true, false);
        } finally {
            start.countDown();
        }
        assertThat(jdbc.sql("select count(*) from city where state = 'PUBLISHED'").query(Long.class).single()).isEqualTo(1);
    }

    @Test
    void zonesHaveTheSameValidationVersioningReplayAndAudit() {
        Revision parent = draft(BOX, 0);
        ZoneDraft command = new ZoneDraft(UUID.randomUUID(), STAFF, 0, parent.id(), "TEST_ZONE", BOX, 1, "test");
        Revision zone = geo.createZoneDraft(command);
        assertThat(geo.createZoneDraft(command)).isEqualTo(zone);
        Change publish = change(zone);
        Revision published = geo.publishZone(publish);
        assertThat(geo.publishZone(publish)).isEqualTo(published);
        reject(() -> geo.archiveZone(change(zone)), ErrorCode.VERSION_CONFLICT);
        geo.archiveZone(change(published));
        assertThat(audits(zone, "zone.publish")).isEqualTo(1);
        assertThat(audits(zone, "zone.archive")).isEqualTo(1);
        for (String polygon : List.of(INVALID, "SRID=4326;MULTIPOLYGON EMPTY")) {
            Revision invalid = geo.createZoneDraft(new ZoneDraft(UUID.randomUUID(), STAFF, 0, parent.id(),
                    "TEST_ZONE", polygon, 1, "test"));
            reject(() -> geo.publishZone(change(invalid)), ErrorCode.VALIDATION_FAILED);
        }
        reject(() -> geo.createZoneDraft(new ZoneDraft(UUID.randomUUID(), STAFF, 0, UUID.randomUUID(),
                "TEST_ZONE", BOX, 1, "test")), ErrorCode.NOT_FOUND);
        reject(() -> geo.createZoneDraft(new ZoneDraft(UUID.randomUUID(), STAFF, 0, parent.id(),
                "TEST_ZONE", BOX.replace("4326", "3857"), 1, "test")), ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void nonStaffActorsCannotChangeConfigurationAndDraftCreationIsIdempotent() {
        CityDraft command = cityDraft(BOX, 0);
        assertThat(geo.createCityDraft(command)).isEqualTo(geo.createCityDraft(command));
        reject(() -> geo.createCityDraft(new CityDraft(UUID.randomUUID(), new Actor(SubjectType.CLIENT, UUID.randomUUID()),
                0, "code", "Synthetic", "UAH", "Europe/Kyiv", BOX, 0, "test")), ErrorCode.ACCESS_DENIED);
        reject(() -> geo.createCityDraft(new CityDraft(UUID.randomUUID(), STAFF, 9,
                "code", "Synthetic", "UAH", "Europe/Kyiv", BOX, 0, "test")), ErrorCode.VERSION_CONFLICT);
    }

    @Test
    void geoPointRejectsNonFiniteAndOutOfRangeCoordinates() {
        for (double[] pair : List.of(new double[]{91, 30}, new double[]{-91, 30}, new double[]{50, 181},
                new double[]{50, -181}, new double[]{Double.NaN, 30}, new double[]{50, Double.POSITIVE_INFINITY})) {
            reject(() -> new GeoPoint(pair[0], pair[1]), ErrorCode.VALIDATION_FAILED);
        }
        assertThat(new GeoPoint(-90, 180)).isNotNull();
    }

    @Test
    void bothPolygonIndexesAreGist() {
        assertThat(jdbc.sql("select indexdef from pg_indexes where indexname in ('city_polygon_gist', 'zone_polygon_gist')")
                .query(String.class).list()).hasSize(2).allSatisfy(index -> assertThat(index).contains("USING gist (polygon)"));
    }

    private Revision draft(String polygon, int priority) { return geo.createCityDraft(cityDraft(polygon, priority)); }
    private CityDraft cityDraft(String polygon, int priority) {
        return new CityDraft(UUID.randomUUID(), STAFF, 0, "test-" + UUID.randomUUID(), "Synthetic",
                "UAH", "Europe/Kyiv", polygon, priority, "Synthetic test configuration");
    }
    private Change change(Revision revision) {
        return new Change(UUID.randomUUID(), STAFF, revision.id(), revision.version(), "Synthetic transition");
    }
    private long audits(Revision revision, String action) {
        return jdbc.sql("select count(*) from audit_log where resource_id = :id and action = :action")
                .param("id", revision.id().toString()).param("action", action).query(Long.class).single();
    }
    private void reject(Runnable action, ErrorCode code) {
        assertThatThrownBy(action::run).isInstanceOf(DomainException.class)
                .extracting(error -> ((DomainException) error).code()).isEqualTo(code);
    }
}
