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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
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
        permittedStaff(STAFF.id(), "ACTIVE", GeoConfiguration.MANAGE_PERMISSION);
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


    enum Command {
        CREATE_CITY, PUBLISH_CITY, ARCHIVE_CITY, CREATE_ZONE, PUBLISH_ZONE, ARCHIVE_ZONE
    }

    @ParameterizedTest
    @EnumSource(Command.class)
    void eachCommandRequiresAnActivePermittedStaffMember(Command command) {
        Revision city = draft(BOX, 0);
        Revision zone = geo.createZoneDraft(new ZoneDraft(UUID.randomUUID(), STAFF, 0,
                city.id(), "TEST_ZONE", BOX, 1, "test"));
        Actor withoutPermission = permittedStaff(UUID.randomUUID(), "ACTIVE");
        Actor suspended = permittedStaff(UUID.randomUUID(), "SUSPENDED", GeoConfiguration.MANAGE_PERMISSION);
        Actor unknownStaff = new Actor(SubjectType.STAFF, UUID.randomUUID());
        Actor client = new Actor(SubjectType.CLIENT, UUID.randomUUID());
        long auditCount = jdbc.sql("select count(*) from audit_log").query(Long.class).single();

        for (Actor denied : List.of(withoutPermission, suspended, unknownStaff, client, Actor.system())) {
            UUID commandId = UUID.randomUUID();
            reject(() -> execute(command, denied, commandId, city, zone), ErrorCode.ACCESS_DENIED);
            assertThat(jdbc.sql("select count(*) from command_receipt where command_id = :id")
                    .param("id", commandId).query(Long.class).single()).isZero();
        }

        assertThat(jdbc.sql("select count(*) from audit_log").query(Long.class).single()).isEqualTo(auditCount);
        assertThat(execute(command, STAFF, UUID.randomUUID(), city, zone)).isNotNull();
    }

    @ParameterizedTest
    @EnumSource(Command.class)
    void cachedCommandResultsStillRequireCurrentPermissionAndActiveState(Command command) {
        Revision city = draft(BOX, 0);
        Revision zone = geo.createZoneDraft(new ZoneDraft(UUID.randomUUID(), STAFF, 0,
                city.id(), "TEST_ZONE", BOX, 1, "test"));
        UUID commandId = UUID.randomUUID();
        Revision first = execute(command, STAFF, commandId, city, zone);

        permittedStaff(STAFF.id(), "ACTIVE");
        reject(() -> execute(command, STAFF, commandId, city, zone), ErrorCode.ACCESS_DENIED);
        permittedStaff(STAFF.id(), "SUSPENDED", GeoConfiguration.MANAGE_PERMISSION);
        reject(() -> execute(command, STAFF, commandId, city, zone), ErrorCode.ACCESS_DENIED);
        permittedStaff(STAFF.id(), "ACTIVE", GeoConfiguration.MANAGE_PERMISSION);
        assertThat(execute(command, STAFF, commandId, city, zone)).isEqualTo(first);
    }

    @Test
    void cityArchiveRequiresPublishedZonesToBeArchivedFirst() {
        Revision city = geo.publishCity(change(draft(BOX, 0)));
        Revision zone = geo.createZoneDraft(new ZoneDraft(UUID.randomUUID(), STAFF, 0,
                city.id(), "TEST_ZONE", BOX, 1, "test"));
        Revision publishedZone = geo.publishZone(change(zone));
        Change archive = change(city);

        reject(() -> geo.archiveCity(archive), ErrorCode.STATE_CONFLICT);
        assertThat(resolver.resolve(KYIV_POINT)).isPresent();
        assertThat(audits(city, "city.archive")).isZero();
        assertThat(jdbc.sql("select version from city where id = :id")
                .param("id", city.id()).query(Long.class).single()).isEqualTo(city.version());
        assertThat(jdbc.sql("select count(*) from command_receipt where command_id = :id")
                .param("id", archive.commandId()).query(Long.class).single()).isZero();

        geo.archiveZone(change(publishedZone));
        assertThat(geo.archiveCity(archive).state()).isEqualTo("ARCHIVED");
        assertThat(audits(city, "city.archive")).isEqualTo(1);
        assertThat(resolver.resolve(KYIV_POINT)).isEmpty();
    }

    @Test
    void zoneCannotBePublishedAfterItsCityIsArchived() {
        Revision city = draft(BOX, 0);
        Revision zone = geo.createZoneDraft(new ZoneDraft(UUID.randomUUID(), STAFF, 0,
                city.id(), "TEST_ZONE", BOX, 1, "test"));
        geo.archiveCity(change(city));

        reject(() -> geo.publishZone(change(zone)), ErrorCode.STATE_CONFLICT);
        assertThat(audits(zone, "zone.publish")).isZero();
    }

    @Test
    void concurrentCityArchiveAndZonePublicationCannotBothCommit() throws Exception {
        Revision city = geo.publishCity(change(draft(BOX, 0)));
        Revision zone = geo.createZoneDraft(new ZoneDraft(UUID.randomUUID(), STAFF, 0,
                city.id(), "TEST_ZONE", BOX, 1, "test"));
        CountDownLatch ready = new CountDownLatch(2);
        CountDownLatch start = new CountDownLatch(1);
        List<Runnable> actions = List.of(() -> geo.archiveCity(change(city)), () -> geo.publishZone(change(zone)));
        try (var pool = Executors.newFixedThreadPool(2)) {
            var outcomes = actions.stream().map(action -> pool.submit(() -> {
                ready.countDown();
                if (!start.await(10, TimeUnit.SECONDS)) {
                    throw new AssertionError("Start timeout");
                }
                try {
                    action.run();
                    return true;
                } catch (DomainException conflict) {
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
        assertThat(jdbc.sql("""
                select count(*) from zone join city on city.id = zone.city_id
                where city.state = 'ARCHIVED' and zone.state = 'PUBLISHED'
                """).query(Long.class).single()).isZero();
    }

    private Revision execute(Command command, Actor actor, UUID commandId, Revision city, Revision zone) {
        Change cityChange = new Change(commandId, actor, city.id(), city.version(), "Permission test");
        Change zoneChange = new Change(commandId, actor, zone.id(), zone.version(), "Permission test");
        return switch (command) {
            case CREATE_CITY -> geo.createCityDraft(new CityDraft(commandId, actor, 0,
                    "permission-" + commandId, "Synthetic", "UAH", "Europe/Kyiv", BOX, 0, "Permission test"));
            case PUBLISH_CITY -> geo.publishCity(cityChange);
            case ARCHIVE_CITY -> geo.archiveCity(cityChange);
            case CREATE_ZONE -> geo.createZoneDraft(new ZoneDraft(commandId, actor, 0,
                    city.id(), "TEST_ZONE", BOX, 0, "Permission test"));
            case PUBLISH_ZONE -> geo.publishZone(zoneChange);
            case ARCHIVE_ZONE -> geo.archiveZone(zoneChange);
        };
    }

    private Actor permittedStaff(UUID id, String state, String... permissions) {
        jdbc.sql("""
                insert into staff_user(id, login, name, role, permissions, state, created_at, updated_at)
                values (:id, :login, 'Geography manager', 'ADMIN', :permissions, :state, now(), now())
                on conflict (id) do update set permissions = excluded.permissions, state = excluded.state
                """).param("id", id).param("login", "geo-staff-" + id)
                .param("permissions", permissions).param("state", state).update();
        return new Actor(SubjectType.STAFF, id);
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
