package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.identity.ClientAccounts;
import taxi.blizz.identity.ClientLookup;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/**
 * ADR 0016, issue #214 (step 1c): one phone in two taxi services is two people, and staff reach only their own
 * service — a super admin and "all cities" included.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ServiceIsolationTests {

    @Autowired JdbcClient jdbc;
    @Autowired AccountDirectory accounts;
    @Autowired ClientLookup lookup;
    @Autowired StaffAccess staff;
    @Autowired ClientAccounts clients;
    @Autowired taxi.blizz.identity.StaffDirectory directory;
    @Autowired taxi.blizz.identity.EmergencyAccess emergency;

    private UUID service(String prefix) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, :code, now(), now())""")
                .param("id", id).param("code", prefix + "-" + id.toString().substring(0, 8)).update();
        return id;
    }

    private UUID person(String table, UUID service, String phone) {
        UUID id = UUID.randomUUID();
        jdbc.sql("insert into " + table + " (id, phone_normalized, account_state, service_id, created_at, updated_at)"
                        + " values (:id, :phone, 'ACTIVE', :service, now(), now())")
                .param("id", id).param("phone", phone).param("service", service).update();
        return id;
    }

    private UUID city(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into city (id, code, name, currency, timezone, polygon, priority, state, service_id,
                                          created_at, updated_at)
                        values (:id, :code, :code, 'UAH', 'UTC',
                                ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((162 70,163 70,163 71,162 71,162 70)))'),
                                1, 'DRAFT', :service, now(), now())""")
                .param("id", id).param("code", "svc-iso-" + id.toString().substring(0, 8)).param("service", service)
                .update();
        return id;
    }

    private Actor staff(UUID service, String role, boolean allCities, UUID... cities) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                service_id, created_at, updated_at)
                        values (:id, :login, 'Iso', :role, :permissions, :all, :cities, 'ACTIVE', :service, now(),
                                now())""")
                .param("id", id).param("login", "svc-iso-" + id).param("role", role)
                .param("permissions", new String[] {"orders.view", "driver.review", "clients.manage"})
                .param("all", allCities).param("cities", cities).param("service", service).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void denied(Runnable call) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.ACCESS_DENIED);
    }

    @Test
    void aPhoneIsFoundOnlyInItsOwnService() {
        UUID a = service("iso-a");
        UUID b = service("iso-b");
        String phone = TestPhones.unique("+48", 9);
        UUID riderA = person("client", a, phone);
        UUID riderB = person("client", b, phone);
        UUID driverB = person("driver", b, phone);
        PhoneNumber number = new PhoneNumber(phone);
        assertThat(accounts.clientByPhone(a, number)).hasValue(riderA);
        assertThat(accounts.clientByPhone(b, number)).hasValue(riderB);
        assertThat(accounts.driverByPhone(a, number)).as("no driver with it in A").isEmpty();
        assertThat(accounts.driverByPhone(b, number)).hasValue(driverB);

        Actor operatorA = staff(a, "OPERATOR", true);
        assertThat(accounts.clientByPhone(operatorA, number)).hasValue(riderA);
        assertThat(lookup.byPhone(operatorA, phone).client().id()).isEqualTo(riderA);
        UUID c = service("iso-c");
        assertThat(lookup.byPhone(staff(c, "OPERATOR", true), phone).client()).as("not in C").isNull();
    }

    @Test
    void staffOfEveryCityAndASuperAdminReachOnlyTheirOwnService() {
        UUID a = service("iso-a");
        UUID b = service("iso-b");
        UUID cityA = city(a);
        UUID cityB = city(b);
        for (Actor member : new Actor[] {staff(a, "ADMIN", true), staff(a, "SUPER_ADMIN", true)}) {
            staff.require(member, "orders.view", cityA);
            denied(() -> staff.require(member, "orders.view", cityB));
            denied(() -> staff.require(member, "orders.view", cityA, cityB));
            UUID driverB = person("driver", b, TestPhones.unique("+48", 9));
            denied(() -> staff.requireForDriver(member, "driver.review", driverB));
            Actor staffB = staff(b, "OPERATOR", false, cityB);
            denied(() -> staff.requireOverStaff(member, "driver.review", staffB.id()));
        }
        // "All cities" lists every city of the member's service and none of another: lists filtered by it stay inside.
        for (Actor member : new Actor[] {staff(a, "ADMIN", true), staff(a, "SUPER_ADMIN", true)}) {
            StaffAccess.Scope scope = staff.scope(member, "orders.view");
            assertThat(scope.cityIds()).contains(cityA).doesNotContain(cityB);
            assertThat(scope.covers(cityA)).isTrue();
            assertThat(scope.covers(cityB)).isFalse();
        }
        assertThat(staff.scope(staff(a, "ADMIN", false, cityA, cityB), "orders.view").cityIds())
                .as("a city of B in A's scope is dropped").containsExactly(cityA);
        // A city-scoped member of A cannot name B's city either, even if it slipped into the scope.
        denied(() -> staff.require(staff(a, "ADMIN", false, cityA, cityB), "orders.view", cityB));
    }

    @Test
    void ridersOfAnotherServiceAreNeitherFoundNorReached() {
        UUID a = service("iso-a");
        UUID b = service("iso-b");
        String phone = TestPhones.unique("+48", 9);
        UUID riderA = person("client", a, phone);
        UUID riderB = person("client", b, phone);
        for (Actor member : new Actor[] {staff(a, "ADMIN", true), staff(a, "SUPER_ADMIN", true)}) {
            staff.requireForClient(member, "clients.manage", riderA);
            denied(() -> staff.requireForClient(member, "clients.manage", riderB));
            assertThat(clients.search(member, phone.substring(phone.length() - 9), 50))
                    .extracting(ClientAccounts.Client::id).contains(riderA).doesNotContain(riderB);
        }
    }

    @Test
    void aSuperAdminManagesTheStaffOfTheirOwnServiceOnly() {
        UUID a = service("iso-a");
        UUID b = service("iso-b");
        Actor bossA = staff(a, "SUPER_ADMIN", true);
        Actor bossB = staff(b, "SUPER_ADMIN", true);
        Actor operatorB = staff(b, "OPERATOR", false, city(b));
        assertThat(directory.list(bossA)).extracting(taxi.blizz.identity.StaffDirectory.StaffMember::id)
                .contains(bossA.id()).doesNotContain(bossB.id(), operatorB.id());
        assertThatThrownBy(() -> directory.get(bossA, operatorB.id())).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.NOT_FOUND);
        long version = directory.get(bossB, operatorB.id()).version();
        assertThatThrownBy(() -> directory.suspend(bossA, UUID.randomUUID(), operatorB.id(), version, "Not mine"))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.NOT_FOUND);
        assertThat(directory.get(bossB, operatorB.id()).state()).isEqualTo("ACTIVE");
        // Each service keeps its own last super admin: B's is the only one there, whatever A has.
        assertThatThrownBy(() -> directory.suspend(bossB, UUID.randomUUID(), bossB.id(),
                directory.get(bossB, bossB.id()).version(), "Leaving")).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.STATE_CONFLICT);
        assertThat(emergency.list(bossA, false)).extracting(taxi.blizz.identity.EmergencyAccess.Grant::staffId)
                .doesNotContain(operatorB.id(), bossB.id());
    }
}
