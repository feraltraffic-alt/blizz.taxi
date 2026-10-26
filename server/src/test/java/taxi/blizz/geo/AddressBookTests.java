package taxi.blizz.geo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.AddressBook.AddAlias;
import taxi.blizz.geo.AddressBook.Address;
import taxi.blizz.geo.AddressBook.Alias;
import taxi.blizz.geo.AddressBook.Change;
import taxi.blizz.geo.AddressBook.Create;
import taxi.blizz.geo.AddressBook.Data;
import taxi.blizz.geo.AddressBook.Kind;
import taxi.blizz.geo.AddressBook.ProviderRef;
import taxi.blizz.geo.AddressBook.Update;
import taxi.blizz.geo.AddressBook.Visibility;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** REQ-GEO-10/12/13/14/15/16, REQ-DATA-09, AC-13, T-33/34: own synthetic data only. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class AddressBookTests {
    private static final GeoPoint POINT = new GeoPoint(50.001, 30.001);
    @Autowired AddressBook addresses;
    @Autowired JdbcClient jdbc;
    @Autowired TransactionTemplate tx;
    Actor manager;
    UUID city;
    List<UUID> cities = new ArrayList<>();

    @BeforeEach
    void setUp() {
        manager = staff("ACTIVE", AddressBook.MANAGE_PERMISSION);
        city = city();
    }

    @AfterEach
    void cleanUp() {
        for (UUID id : cities) {
            for (String table : List.of("address_history", "address_alias")) {
                jdbc.sql("delete from " + table + " where address_id in (select id from address where city_id = :city)")
                        .param("city", id).update();
            }
            jdbc.sql("delete from address_override where own_address_id in (select id from address where city_id = :city)")
                    .param("city", id).update();
            jdbc.sql("delete from address where city_id = :city").param("city", id).update();
            jdbc.sql("delete from city where id = :city").param("city", id).update();
        }
    }

    @Test
    void numericBaseIsExactAndExactHouseRanksAboveSuffixPrefixes() {
        Address two = create(data("2", POINT));
        Address twentySix = create(data("26", POINT));
        Address letter = create(data("2А", POINT));
        create(data("2АБ", POINT));
        List<Address> found = search("Хрещатик 2");
        assertThat(found.getFirst().id()).isEqualTo(two.id());
        assertThat(found).extracting(Address::id).contains(letter.id()).doesNotContain(twentySix.id());
        for (String variant : List.of("2А", "2-А", "2а", "2-A")) {
            assertThat(search("Хрещатик " + variant).getFirst().id()).isEqualTo(letter.id());
        }
        assertThat(search("Хрещатк 2")).extracting(Address::id).doesNotContain(twentySix.id()).contains(two.id());
        assertThat(search("Хрещатик 2-")).extracting(Address::id).doesNotContain(twentySix.id()).contains(two.id());
    }

    @Test
    void buildingAndFractionNumbersAreNotConfused() {
        Address one = create(data("2 к1", POINT));
        Address ten = create(data("2 корпус 10", POINT));
        Address fraction = create(data("2/26", POINT));
        assertThat(search("Хрещатик 2 корпус 1")).extracting(Address::id).containsExactly(one.id());
        assertThat(search("Хрещатик 2 к1")).extracting(Address::id).doesNotContain(ten.id());
        assertThat(search("Хрещатик 2/26")).extracting(Address::id).containsExactly(fraction.id());
        assertThat(search("Хрещатик 2")).extracting(Address::id).doesNotContain(fraction.id());
    }

    @Test
    void multilingualAliasesFindOneAddressInAnyInterfaceLanguage() {
        Address address = create(data("2", POINT));
        Address withAlias = addresses.addAlias(new AddAlias(UUID.randomUUID(), manager, address.id(), address.version(),
                new Alias("Khreschatyk Street 2", "en"), "Synthetic English alias"));
        assertThat(addresses.search(city, "Khreschatyk 2", "de", null, 20))
                .extracting(Address::id).containsExactly(address.id());
        assertThat(withAlias.aliases()).containsExactly(new Alias("Khreschatyk Street 2", "en"));
        reject(() -> addresses.addAlias(new AddAlias(UUID.randomUUID(), manager, withAlias.id(), withAlias.version(),
                new Alias("KHRESCHATYK STREET 2", "en"), "Duplicate alias")), ErrorCode.STATE_CONFLICT);
        assertThat(history(address.id())).hasSize(2);
    }

    @Test
    void hiddenAddressesDisappearFromSearchReverseLookupAndFreshSelectionThenReturn() {
        Address first = create(data("2", POINT));
        Address alias = addresses.addAlias(new AddAlias(UUID.randomUUID(), manager, first.id(), first.version(),
                new Alias("Synthetic Place", "en"), "Alias"));
        Address hidden = addresses.hide(change(alias));
        assertThat(search("Хрещатик 2")).isEmpty();
        assertThat(addresses.search(city, "Synthetic", "en", null, 20)).isEmpty();
        assertThat(addresses.nearest(city, POINT, 100)).isEmpty();
        assertThat(addresses.find(first.id())).isEmpty();
        Address restored = addresses.restore(change(hidden));
        assertThat(restored.visibility()).isEqualTo(Visibility.ACTIVE);
        assertThat(search("Хрещатик 2")).extracting(Address::id).containsExactly(first.id());
        assertThat(addresses.find(first.id())).isPresent();
        assertThat(addresses.nearest(city, POINT, 100)).map(Address::id).contains(first.id());
    }

    @Test
    void entrancesTenMetresApartRemainSeparateAndNearBreaksTies() {
        GeoPoint secondPoint = new GeoPoint(POINT.lat(), POINT.lon() + 0.00014);
        Data basic = data("2", POINT);
        Address first = create(new Data(city, Kind.ENTRANCE, "Synthetic entrance", "uk", basic.street(),
                "2", null, POINT, "Entrance west", null));
        Address second = create(new Data(city, Kind.ENTRANCE, "Synthetic entrance", "uk", basic.street(),
                "2", null, secondPoint, "Entrance east", null));
        assertThat(first.id()).isNotEqualTo(second.id());
        assertThat(search("Хрещатик 2")).extracting(Address::id).containsExactlyInAnyOrder(first.id(), second.id());
        assertThat(addresses.search(city, "Хрещатик 2", "uk", secondPoint, 20).getFirst().id()).isEqualTo(second.id());
        assertThat(addresses.nearest(city, secondPoint, 20)).map(Address::id).contains(second.id());
        addresses.hide(change(second));
        assertThat(addresses.nearest(city, secondPoint, 20)).map(Address::id).contains(first.id());
        assertThat(addresses.nearest(city, new GeoPoint(51, 31), 10)).isEmpty();
        assertThat(addresses.nearest(UUID.randomUUID(), POINT, 100)).isEmpty();
    }

    @Test
    void textOnlyAndNumberedPlaceNamesAreSearchableWithoutPostalHouseFields() {
        create(new Data(city, Kind.PLACE, "Synthetic Museum", "en", null, null, null, POINT, "Main door", null));
        Address two = create(new Data(city, Kind.PLACE, "Terminal2", "en", null, null, null, POINT, null, null));
        Address twentySix = create(new Data(city, Kind.PLACE, "Terminal26", "en", null, null, null, POINT, null, null));
        assertThat(addresses.search(city, "Museum", "uk", null, 20)).hasSize(1);
        assertThat(addresses.search(city, "Terminal 2", "uk", null, 20))
                .extracting(Address::id).contains(two.id()).doesNotContain(twentySix.id());
    }

    @Test
    void streetsContainingNumbersCanStillBeSearched() {
        Data street = new Data(city, Kind.HOUSE, "Synthetic house", "uk", "8 Березня", "2",
                null, POINT, null, null);
        Address address = create(street);
        assertThat(search("8 Березня")).extracting(Address::id).containsExactly(address.id());
        assertThat(search("8 Березня 2")).extracting(Address::id).containsExactly(address.id());
    }

    @Test
    void minimumQueryAndServerResultLimitAreEnforcedAndCitiesStayIsolated() {
        for (int number = 1; number <= 25; number++) {
            create(new Data(city, Kind.HOUSE, "Synthetic Street " + number, "en", "Synthetic Street",
                    Integer.toString(number), null, POINT, null, null));
        }
        assertThat(addresses.search(city, "Synthetic", "en", null, 100)).hasSize(20);
        assertThat(addresses.search(city, "Synthetic", "en", null, 3)).hasSize(3);
        assertThat(addresses.search(city(), "Synthetic", "en", null, 20)).isEmpty();
        for (String query : List.of("", " 2 ", "Хр")) {
            reject(() -> addresses.search(city, query, "uk", null, 20), ErrorCode.VALIDATION_FAILED);
        }
        reject(() -> addresses.search(city, "Synthetic", "en", null, 0), ErrorCode.VALIDATION_FAILED);
        reject(() -> addresses.nearest(city, POINT, -1), ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void changesHaveVersionedBeforeAfterHistoryActorReasonAndAudit() {
        Address first = create(data("2", POINT));
        Address updated = addresses.update(update(first, renamed(first.data(), "Synthetic correction")));
        Address hidden = addresses.hide(change(updated));
        Address restored = addresses.restore(change(hidden));
        assertThat(restored.version()).isEqualTo(3);
        assertThat(history(first.id())).containsExactly("address.create", "address.update", "address.hide", "address.restore");
        assertThat(jdbc.sql("select before->'data'->>'label' from address_history where address_id = :id and address_version = 1")
                .param("id", first.id()).query(String.class).single()).isEqualTo(first.data().label());
        assertThat(jdbc.sql("select after->'data'->>'label' from address_history where address_id = :id and address_version = 1")
                .param("id", first.id()).query(String.class).single()).isEqualTo("Synthetic correction");
        assertThat(jdbc.sql("select actor_id from address_history where address_id = :id").param("id", first.id())
                .query(UUID.class).list()).containsOnly(manager.id());
        assertThat(jdbc.sql("select reason from address_history where address_id = :id").param("id", first.id())
                .query(String.class).list()).allSatisfy(reason -> assertThat(reason).isNotBlank());
        assertThat(jdbc.sql("select count(*) from audit_log where resource_type = 'address' and resource_id = :id")
                .param("id", first.id().toString()).query(Long.class).single()).isEqualTo(4);
        reject(() -> addresses.update(update(first, first.data())), ErrorCode.VERSION_CONFLICT);
    }

    @Test
    void concurrentEditsLetOnlyOneVersionWin() throws Exception {
        Address first = create(data("2", POINT));
        assertThat(race(List.of(
                () -> addresses.update(update(first, renamed(first.data(), "Edit A"))),
                () -> addresses.update(update(first, renamed(first.data(), "Edit B")))), ErrorCode.VERSION_CONFLICT))
                .containsExactlyInAnyOrder(true, false);
        assertThat(addresses.find(first.id()).orElseThrow().version()).isEqualTo(1);
        assertThat(history(first.id())).containsExactly("address.create", "address.update");
    }

    @Test
    void ownOverrideLinkSurvivesEditsHidingAndRestorationWithoutProviderContent() {
        Data basic = data("2", POINT);
        ProviderRef ref = new ProviderRef("TEST_PROVIDER", "synthetic-object-1");
        Address first = create(withRef(basic, ref));
        Address updated = addresses.update(update(first, renamed(first.data(), "Own corrected label")));
        Address hidden = addresses.hide(change(updated));
        addresses.restore(change(hidden));
        Address result = addresses.find(first.id()).orElseThrow();
        assertThat(result.source()).isEqualTo("OWN");
        assertThat(result.data().override()).isEqualTo(ref);
        assertThat(jdbc.sql("select own_address_id from address_override where provider = :provider and object_id = :object")
                .param("provider", ref.provider()).param("object", ref.objectId()).query(UUID.class).single())
                .isEqualTo(first.id());
        reject(() -> create(withRef(basic, ref)), ErrorCode.STATE_CONFLICT);
        assertThat(jdbc.sql("select count(*) from address where city_id = :city").param("city", city)
                .query(Long.class).single()).isEqualTo(1);
    }

    @Test
    void concurrentOverrideLinkSwapsFailWithoutDeadlockOrPartialChanges() throws Exception {
        Address a = create(withRef(data("2", POINT), new ProviderRef("TEST", "a")));
        Address b = create(withRef(data("26", POINT), new ProviderRef("TEST", "b")));
        assertThat(race(List.of(
                () -> addresses.update(update(a, withRef(a.data(), b.data().override()))),
                () -> addresses.update(update(b, withRef(b.data(), a.data().override())))), ErrorCode.STATE_CONFLICT))
                .containsExactly(false, false);
        assertThat(addresses.find(a.id()).orElseThrow()).isEqualTo(a);
        assertThat(addresses.find(b.id()).orElseThrow()).isEqualTo(b);
        assertThat(history(a.id())).hasSize(1);
        assertThat(history(b.id())).hasSize(1);
    }

    @Test
    void replayDoesNotDuplicateHistoryAndAnOuterRollbackRestoresEverything() {
        Create command = new Create(UUID.randomUUID(), manager, 0, data("2", POINT), "Synthetic create");
        Address first = addresses.create(command);
        assertThat(addresses.create(command)).isEqualTo(first);
        Update update = update(first, renamed(first.data(), "Rolled back"));
        assertThatThrownBy(() -> tx.executeWithoutResult(status -> {
            addresses.update(update);
            throw new IllegalStateException("Synthetic rollback");
        })).isInstanceOf(IllegalStateException.class);
        assertThat(addresses.find(first.id())).contains(first);
        assertThat(history(first.id())).containsExactly("address.create");
        assertThat(addresses.update(update).version()).isEqualTo(1);
        assertThat(history(first.id())).hasSize(2);
    }

    enum Operation {
        CREATE, UPDATE, ALIAS, HIDE, RESTORE
    }

    @ParameterizedTest
    @EnumSource(Operation.class)
    void allCommandsRequireCurrentActiveStaffPermissionEvenOnReplay(Operation operation) {
        Address target = create(data("2", POINT));
        if (operation == Operation.RESTORE) {
            target = addresses.hide(change(target));
        }
        Address address = target;
        for (Actor denied : List.of(staff("ACTIVE"), staff("SUSPENDED", AddressBook.MANAGE_PERMISSION),
                new Actor(SubjectType.STAFF, UUID.randomUUID()), new Actor(SubjectType.CLIENT, UUID.randomUUID()))) {
            UUID commandId = UUID.randomUUID();
            reject(() -> execute(operation, denied, commandId, address), ErrorCode.ACCESS_DENIED);
            assertThat(jdbc.sql("select count(*) from command_receipt where command_id = :id")
                    .param("id", commandId).query(Long.class).single()).isZero();
        }
        UUID commandId = UUID.randomUUID();
        Address first = execute(operation, manager, commandId, address);
        assertThat(execute(operation, manager, commandId, address)).isEqualTo(first);
        jdbc.sql("update staff_user set permissions = '{}' where id = :id").param("id", manager.id()).update();
        reject(() -> execute(operation, manager, commandId, address), ErrorCode.ACCESS_DENIED);
        jdbc.sql("update staff_user set state = 'SUSPENDED', permissions = :permissions where id = :id")
                .param("permissions", new String[]{AddressBook.MANAGE_PERMISSION}).param("id", manager.id()).update();
        reject(() -> execute(operation, manager, commandId, address), ErrorCode.ACCESS_DENIED);
    }

    @Test
    void blankReasonsAndConflictingBuildingInputsNeverWriteChanges() {
        reject(() -> addresses.create(new Create(UUID.randomUUID(), manager, 0, data("2", POINT), " ")),
                ErrorCode.VALIDATION_FAILED);
        Data basic = data("2 к1", POINT);
        reject(() -> create(new Data(city, basic.kind(), basic.label(), "uk", basic.street(), basic.houseRaw(),
                "2", POINT, null, null)), ErrorCode.VALIDATION_FAILED);
        assertThat(jdbc.sql("select count(*) from address where city_id = :city").param("city", city)
                .query(Long.class).single()).isZero();
    }

    @Test
    void textHouseAndGeographyIndexesExist() {
        assertThat(jdbc.sql("""
                select indexname from pg_indexes where indexname in
                    ('address_text_trgm', 'address_alias_text_trgm', 'address_house_idx',
                     'address_pickup_gist', 'address_pickup_metres_gist')
                """).query(String.class).list()).hasSize(5);
    }

    private Address execute(Operation operation, Actor actor, UUID commandId, Address target) {
        return switch (operation) {
            case CREATE -> addresses.create(new Create(commandId, actor, 0, data("3", POINT), "Permission test"));
            case UPDATE -> addresses.update(new Update(commandId, actor, target.id(), target.version(),
                    renamed(target.data(), "Changed"), "Permission test"));
            case ALIAS -> addresses.addAlias(new AddAlias(commandId, actor, target.id(), target.version(),
                    new Alias("Synthetic alias", "en"), "Permission test"));
            case HIDE -> addresses.hide(new Change(commandId, actor, target.id(), target.version(), "Permission test"));
            case RESTORE -> addresses.restore(new Change(commandId, actor, target.id(), target.version(), "Permission test"));
        };
    }

    private List<Boolean> race(List<Callable<?>> actions, ErrorCode errorCode) throws Exception {
        CountDownLatch ready = new CountDownLatch(actions.size());
        CountDownLatch start = new CountDownLatch(1);
        try (var pool = Executors.newFixedThreadPool(actions.size())) {
            var results = actions.stream().map(action -> pool.submit(() -> {
                ready.countDown();
                if (!start.await(10, TimeUnit.SECONDS)) {
                    throw new AssertionError("Start timeout");
                }
                try {
                    action.call();
                    return true;
                } catch (DomainException conflict) {
                    assertThat(conflict.code()).isEqualTo(errorCode);
                    return false;
                }
            })).toList();
            assertThat(ready.await(10, TimeUnit.SECONDS)).isTrue();
            start.countDown();
            List<Boolean> outcomes = new ArrayList<>();
            for (var result : results) {
                outcomes.add(result.get(20, TimeUnit.SECONDS));
            }
            return outcomes;
        } finally {
            start.countDown();
        }
    }

    private Address create(Data data) {
        return addresses.create(new Create(UUID.randomUUID(), manager, 0, data, "Synthetic own address"));
    }

    private Data data(String house, GeoPoint point) {
        return new Data(city, Kind.HOUSE, "Хрещатик " + house, "uk", "Хрещатик", house, null,
                point, "Synthetic instructions", null);
    }

    private Data renamed(Data d, String label) {
        return new Data(d.cityId(), d.kind(), label, d.language(), d.street(), d.houseRaw(), d.building(),
                d.pickup(), d.instructions(), d.override());
    }

    private Data withRef(Data d, ProviderRef ref) {
        return new Data(d.cityId(), d.kind(), d.label(), d.language(), d.street(), d.houseRaw(), d.building(),
                d.pickup(), d.instructions(), ref);
    }

    private Update update(Address address, Data data) {
        return new Update(UUID.randomUUID(), manager, address.id(), address.version(), data, "Synthetic update");
    }

    private Change change(Address address) {
        return new Change(UUID.randomUUID(), manager, address.id(), address.version(), "Synthetic visibility change");
    }

    private List<Address> search(String query) {
        return addresses.search(city, query, "uk", null, 20);
    }

    private List<String> history(UUID id) {
        return jdbc.sql("select action from address_history where address_id = :id order by address_version")
                .param("id", id).query(String.class).list();
    }

    private Actor staff(String state, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                insert into staff_user(id, login, name, role, permissions, state, created_at, updated_at)
                values (:id, :login, 'Address manager', 'ADMIN', :permissions, :state, now(), now())
                """).param("id", id).param("login", "address-" + id)
                .param("permissions", permissions).param("state", state).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private UUID city() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                insert into city(id, code, name, currency, timezone, polygon, priority, state, created_at, updated_at)
                values (:id, :code, 'Synthetic address city', 'UAH', 'UTC',
                    ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((30 50,31 50,31 51,30 51,30 50)))'),
                    0, 'DRAFT', now(), now())
                """).param("id", id).param("code", "address-" + id).update();
        cities.add(id);
        return id;
    }

    private void reject(Runnable action, ErrorCode code) {
        assertThatThrownBy(action::run).isInstanceOf(DomainException.class)
                .extracting(error -> ((DomainException) error).code()).isEqualTo(code);
    }
}
