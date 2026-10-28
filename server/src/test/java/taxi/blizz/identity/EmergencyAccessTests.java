package taxi.blizz.identity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Duration;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** Emergency access: time-limited, with a reason, audited, never self-given (REQ-SEC-10). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class EmergencyAccessTests {

    @Autowired EmergencyAccess emergency;
    @Autowired StaffAccess access;
    @Autowired JdbcClient jdbc;

    @Test
    void aGrantCountsWhileItLastsInItsCitiesOnlyAndEndsWhenRevoked() {
        Actor boss = staff("SUPER_ADMIN");
        Actor clerk = staff("ADMIN");
        UUID city = UUID.randomUUID();
        UUID other = UUID.randomUUID();
        assertCode(() -> access.require(clerk, StaffPermissions.REPORTS_VIEW, city), ErrorCode.ACCESS_DENIED);

        UUID command = UUID.randomUUID();
        EmergencyAccess.Grant grant = emergency.grant(boss, command, clerk.id(), Set.of(StaffPermissions.REPORTS_VIEW),
                false, Set.of(city), Duration.ofMinutes(60), "Night incident: owner unreachable");
        assertThat(grant.active()).isTrue();
        assertThat(grant.expiresAt()).isEqualTo(grant.grantedAt().plusMinutes(60));
        assertThat(emergency.grant(boss, command, clerk.id(), Set.of(StaffPermissions.REPORTS_VIEW), false,
                Set.of(city), Duration.ofMinutes(60), "Night incident: owner unreachable").id())
                .as("a repeat").isEqualTo(grant.id());

        access.require(clerk, StaffPermissions.REPORTS_VIEW, city);
        assertCode(() -> access.require(clerk, StaffPermissions.REPORTS_VIEW, other), ErrorCode.ACCESS_DENIED);
        assertCode(() -> access.require(clerk, StaffPermissions.AUDIT_VIEW), ErrorCode.ACCESS_DENIED);
        assertThat(access.scope(clerk, StaffPermissions.REPORTS_VIEW).cityIds()).containsExactly(city);
        assertThat(access.holders(StaffPermissions.REPORTS_VIEW, city)).contains(clerk.id());
        assertThat(emergency.mine(clerk)).extracting(EmergencyAccess.Grant::id).containsExactly(grant.id());

        jdbc.sql("""
                        insert into staff_activity (id, occurred_at, kind, staff_id, audience, method, path, status)
                        values (:id1, now(), 'REQUEST', :staff, 'admin', 'GET', '/api/admin/v1/reports/orders', 200),
                               (:id2, now() - interval '1 day', 'REQUEST', :staff, 'admin', 'GET', '/before', 200)""")
                .param("id1", UUID.randomUUID()).param("id2", UUID.randomUUID()).param("staff", clerk.id()).update();
        assertThat(emergency.activity(boss, grant.id())).extracting(EmergencyAccess.Activity::path)
                .containsExactly("/api/admin/v1/reports/orders");

        EmergencyAccess.Grant revoked = emergency.revoke(boss, UUID.randomUUID(), grant.id(), "Incident closed");
        assertThat(revoked.active()).isFalse();
        assertCode(() -> access.require(clerk, StaffPermissions.REPORTS_VIEW, city), ErrorCode.ACCESS_DENIED);
        assertCode(() -> emergency.revoke(boss, UUID.randomUUID(), grant.id(), "Again"), ErrorCode.STATE_CONFLICT);
        assertThatThrownBy(() -> jdbc.sql("update staff_emergency_grant set permissions = '{audit.view}' where id = :id")
                .param("id", grant.id()).update()).isInstanceOf(DataAccessException.class);
        assertThatThrownBy(() -> jdbc.sql("delete from staff_emergency_grant where id = :id")
                .param("id", grant.id()).update()).isInstanceOf(DataAccessException.class);
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where resource_id = :id
                          and action in ('staff.emergency_grant', 'staff.emergency_revoke')""")
                .param("id", clerk.id().toString()).query(Long.class).single()).isEqualTo(2);
    }

    @Test
    void onlyASuperAdminForSomebodyElseFromTheCatalogForAtMostEightHoursWithAReason() {
        Actor boss = staff("SUPER_ADMIN");
        Actor admin = staff("ADMIN");
        Actor clerk = staff("ADMIN");
        Set<String> reports = Set.of(StaffPermissions.REPORTS_VIEW);
        String why = "Night incident: owner unreachable";
        assertCode(() -> emergency.grant(admin, UUID.randomUUID(), clerk.id(), reports, true, null,
                Duration.ofHours(1), why), ErrorCode.ACCESS_DENIED);
        assertCode(() -> emergency.grant(boss, UUID.randomUUID(), boss.id(), reports, true, null,
                Duration.ofHours(1), why), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> emergency.grant(boss, UUID.randomUUID(), clerk.id(), reports, true, null,
                Duration.ofHours(9), why), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> emergency.grant(boss, UUID.randomUUID(), clerk.id(), Set.of("db.root"), true, null,
                Duration.ofHours(1), why), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> emergency.grant(boss, UUID.randomUUID(), clerk.id(), reports, true, null,
                Duration.ofHours(1), "because"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> emergency.grant(boss, UUID.randomUUID(), clerk.id(), reports, false, Set.of(),
                Duration.ofHours(1), why), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> emergency.list(admin, true), ErrorCode.ACCESS_DENIED);

        // A grant whose time is over counts for nothing.
        UUID old = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_emergency_grant (id, staff_id, permissions, all_cities, reason, granted_by,
                                                           granted_at, expires_at)
                        values (:id, :staff, '{reports.view}', true, 'Last week''s incident', :boss,
                                now() - interval '2 hours', now() - interval '1 hour')""")
                .param("id", old).param("staff", clerk.id()).param("boss", boss.id()).update();
        assertCode(() -> access.require(clerk, StaffPermissions.REPORTS_VIEW), ErrorCode.ACCESS_DENIED);
        assertThat(emergency.mine(clerk)).isEmpty();
        assertThat(emergency.list(boss, false)).filteredOn(g -> g.id().equals(old)).singleElement()
                .satisfies(g -> assertThat(g.active()).isFalse());
    }

    private Actor staff(String role) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Emergency', :role, '{}', 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "emergency-" + id).param("role", role).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
