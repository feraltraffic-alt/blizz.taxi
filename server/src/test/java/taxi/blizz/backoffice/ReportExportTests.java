package taxi.blizz.backoffice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** Report exports (REQ-ADM-07): a background job, the rights checked again at the download, a limited time. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ReportExportTests {

    private static final LocalDate DAY = LocalDate.of(2026, 10, 20);

    @Autowired ReportExports exports;
    @Autowired JdbcClient jdbc;

    @Test
    void theOneWhoAskedDownloadsTheBuiltFileWhileTheRightLasts() {
        UUID city = city("test-report-exports", 50);
        order(city, "2026-10-20T10:00:00Z");
        Actor owner = staff(new String[]{StaffPermissions.REPORTS_VIEW}, city);
        UUID command = UUID.randomUUID();
        ReportExports.Export asked = exports.request(owner, command, ReportExports.Kind.ORDERS, city, DAY, DAY);
        assertThat(asked.state()).isIn("PENDING", "RUNNING", "READY");
        assertThat(exports.request(owner, command, ReportExports.Kind.ORDERS, city, DAY, DAY).id())
                .as("a repeat").isEqualTo(asked.id());

        exports.buildPending(50);
        ReportExports.Export ready = exports.get(owner, asked.id());
        assertThat(ready.state()).isEqualTo("READY");
        assertThat(ready.rows()).isEqualTo(2);
        assertThat(ready.expiresAt()).isAfter(ready.readyAt());
        assertThat(exports.mine(owner, 10)).extracting(ReportExports.Export::id).containsExactly(asked.id());

        ReportExports.File file = exports.download(owner, asked.id());
        String csv = new String(file.content(), StandardCharsets.UTF_8);
        assertThat(file.name()).isEqualTo("orders_2026-10-20_2026-10-20.csv");
        assertThat(csv).startsWith("﻿date,created,fulfilled,");
        assertThat(csv).contains("\r\n2026-10-20,1,1,0,").contains("\r\ntotal,1,1,0,");

        Actor colleague = staff(new String[]{StaffPermissions.REPORTS_VIEW}, city);
        assertCode(() -> exports.get(colleague, asked.id()), ErrorCode.NOT_FOUND);
        assertCode(() -> exports.download(colleague, asked.id()), ErrorCode.NOT_FOUND);

        jdbc.sql("update staff_user set permissions = '{}' where id = :id").param("id", owner.id()).update();
        assertCode(() -> exports.download(owner, asked.id()), ErrorCode.ACCESS_DENIED);
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where resource_id = :id
                          and action in ('report.export.request', 'report.export.download')""")
                .param("id", asked.id().toString()).query(Long.class).single()).isEqualTo(2);
    }

    @Test
    void aFileIsDroppedWhenItsTimeIsOver() {
        UUID city = city("test-report-exports", 50);
        Actor owner = staff(new String[]{StaffPermissions.REPORTS_VIEW}, city);
        UUID id = exports.request(owner, UUID.randomUUID(), ReportExports.Kind.FINANCE, city, DAY, DAY).id();
        exports.buildPending(50);
        assertThat(exports.get(owner, id).state()).isEqualTo("READY");
        assertThat(new String(exports.download(owner, id).content(), StandardCharsets.UTF_8))
                .contains("\r\ntotal,PLN,0,0.00,");

        jdbc.sql("update report_export set expires_at = now() - interval '1 second' where id = :id")
                .param("id", id).update();
        assertCode(() -> exports.download(owner, id), ErrorCode.STATE_CONFLICT);
        assertThat(exports.expire()).isGreaterThanOrEqualTo(1);
        assertThat(exports.get(owner, id).state()).isEqualTo("EXPIRED");
        assertThat(jdbc.sql("select content is null from report_export where id = :id").param("id", id)
                .query(Boolean.class).single()).isTrue();
    }

    @Test
    void aRightTakenAwayBeforeTheBuildFailsTheExport() {
        UUID city = city("test-report-exports", 50);
        Actor owner = staff(new String[]{StaffPermissions.REPORTS_VIEW}, city);
        UUID other = UUID.randomUUID();
        assertCode(() -> exports.request(owner, UUID.randomUUID(), ReportExports.Kind.ORDERS, other, DAY, DAY),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> exports.request(owner, UUID.randomUUID(), ReportExports.Kind.ORDERS, city, DAY,
                DAY.plusDays(92)), ErrorCode.VALIDATION_FAILED);

        UUID id = exports.request(owner, UUID.randomUUID(), ReportExports.Kind.ORDERS, city, DAY, DAY).id();
        jdbc.sql("update staff_user set permissions = '{}' where id = :id").param("id", owner.id()).update();
        exports.buildPending(50);
        jdbc.sql("update staff_user set permissions = :p where id = :id")
                .param("p", new String[]{StaffPermissions.REPORTS_VIEW}).param("id", owner.id()).update();
        ReportExports.Export failed = exports.get(owner, id);
        assertThat(failed.state()).isEqualTo("FAILED");
        assertThat(failed.error()).isNotBlank();
    }

    // ---------------------------------------------------------------- fixtures

    private UUID city(String code, int lon) {
        return jdbc.sql("select id from city where code = :code").param("code", code).query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, :code, :code, 'PLN', 'Europe/Warsaw', ST_GeomFromEWKT(:area),
                                            7653 + :lon, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("code", code).param("lon", lon)
                            .param("area", "SRID=4326;MULTIPOLYGON(((%1$d -40,%2$d -40,%2$d -39,%1$d -39,%1$d -40)))"
                                    .formatted(lon, lon + 1))
                            .update();
                    return id;
                });
    }

    private void order(UUID city, String createdAt) {
        jdbc.sql("""
                        insert into ride_order (id, channel, created_by_type, created_by_id, city_id, vehicle_class,
                            pickup, pickup_label, dropoff, dropoff_label, payment_method, status, created_at,
                            updated_at, version)
                        values (:id, 'APP', 'STAFF', :creator, :city, 'STANDARD',
                            ST_SetSRID(ST_MakePoint(50.5, -39.5), 4326), 'A',
                            ST_SetSRID(ST_MakePoint(50.6, -39.6), 4326), 'B', 'CASH', 'FULFILLED',
                            cast(:created as timestamptz), cast(:created as timestamptz), 1)""")
                .param("id", UUID.randomUUID()).param("creator", UUID.randomUUID()).param("city", city)
                .param("created", createdAt).update();
    }

    private Actor staff(String[] permissions, UUID city) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Exports', 'ADMIN', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "exports-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
