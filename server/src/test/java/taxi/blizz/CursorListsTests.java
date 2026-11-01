package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.backoffice.ClientDeletionReview;
import taxi.blizz.backoffice.ReportExports;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.operatorbonus.OperatorBonuses;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;
import taxi.blizz.platform.SubjectType;

/**
 * REQ-API-09 for the lists that had only a limit or an {@code after} time: rows sharing a sort time are each read once
 * across pages of two. Lists read oldest first get their rows in the far past, lists read newest first in the far
 * future, so this test's rows come first whatever other tests left in the same table.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CursorListsTests {

    static final OffsetDateTime PAST = OffsetDateTime.parse("2001-02-03T04:05:06.123456Z");
    static final OffsetDateTime FUTURE = OffsetDateTime.parse("2099-02-03T04:05:06.123456Z");

    @Autowired
    DriverAdmission admission;
    @Autowired
    ClientDeletionReview deletions;
    @Autowired
    ReportExports exports;
    @Autowired
    OperatorBonuses bonuses;
    @Autowired
    RiderWallets wallets;
    @Autowired
    JdbcClient jdbc;

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Lists', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "lists-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    /** Pages of two through {@code read}; returns the ids seen, in order, until {@code made} are all seen. */
    private static <T> List<UUID> pages(BiFunction<PageCursor, Integer, List<T>> read, Function<T, UUID> id,
                                        Function<T, PageCursor> position, List<UUID> made) {
        List<UUID> seen = new ArrayList<>();
        PageCursor after = null;
        for (int page = 0; page < 10 && !seen.containsAll(made); page++) {
            List<T> rows = read.apply(after, 3);
            List<T> items = rows.subList(0, Math.min(2, rows.size()));
            items.forEach(row -> seen.add(id.apply(row)));
            if (rows.size() <= 2) {
                break;
            }
            after = position.apply(items.getLast());
        }
        return seen;
    }

    @Test
    void theDriverReviewQueueReadsDriversOfTheSameMomentOnce() {
        List<UUID> made = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            UUID id = UUID.randomUUID();
            jdbc.sql("""
                            insert into driver (id, phone_normalized, account_state, review_status, created_at,
                                                updated_at)
                            values (:id, :phone, 'ACTIVE', 'IN_REVIEW', :at, now())""")
                    .param("id", id).param("phone", "+38093" + String.format("%07d", Math.floorMod(id.hashCode(),
                            10_000_000))).param("at", PAST).update();
            made.add(id);
        }
        Actor reviewer = staff(DriverAdmission.REVIEW_PERMISSION);
        List<UUID> seen = pages((after, limit) -> admission.reviewQueue(reviewer, null, after, limit),
                DriverAdmission.ReviewItem::driverId, DriverAdmission::position, made);
        assertThat(seen).doesNotHaveDuplicates().startsWith(sorted(made).toArray(UUID[]::new));
        // Out of the queue again: other tests read its oldest page.
        jdbc.sql("delete from driver where id in (:ids)").param("ids", made).update();
    }

    @Test
    void pendingDeletionsOfTheSameMomentAreReadOnce() {
        List<UUID> made = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            UUID id = UUID.randomUUID();
            jdbc.sql("""
                            insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at,
                                                deletion_previous_state, deletion_requested_at)
                            values (:id, :phone, 'DELETION_PENDING', true, now(), now(), 'ACTIVE', :at)""")
                    .param("id", id).param("phone", "+48" + String.format("%09d", Math.floorMod(id.hashCode(),
                            1_000_000_000))).param("at", PAST).update();
            made.add(id);
        }
        Actor clerk = staff(ClientDeletionReview.DELETE_PERMISSION);
        List<UUID> seen = pages((after, limit) -> deletions.pending(clerk, after, limit),
                ClientDeletionReview.Request::clientId, ClientDeletionReview::position, made);
        assertThat(seen).doesNotHaveDuplicates().startsWith(sorted(made).toArray(UUID[]::new));
        jdbc.sql("delete from client where id in (:ids)").param("ids", made).update();
    }

    @Test
    void ownExportsOfTheSameMomentAreReadOnceNewestFirst() {
        Actor clerk = staff();
        List<UUID> made = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            UUID id = UUID.randomUUID();
            jdbc.sql("""
                            insert into report_export (id, kind, city_id, date_from, date_to, timezone, from_utc,
                                                       to_utc, requested_by, state, created_at)
                            values (:id, 'ORDERS', :city, date '2026-10-01', date '2026-10-02', 'UTC',
                                    timestamptz '2026-10-01 00:00Z', timestamptz '2026-10-03 00:00Z', :by, 'PENDING',
                                    :at)""")
                    .param("id", id).param("city", UUID.randomUUID()).param("by", clerk.id()).param("at", FUTURE)
                    .update();
            made.add(id);
        }
        List<UUID> seen = pages((after, limit) -> exports.mine(clerk, after, limit), ReportExports.Export::id,
                ReportExports::position, made);
        assertThat(seen).hasSize(3).doesNotHaveDuplicates().containsExactlyElementsOf(sorted(made).reversed());
        jdbc.sql("delete from report_export where id in (:ids)").param("ids", made).update();
    }

    @Test
    void closedBonusPeriodsOfTheSameDayAreReadOnce() {
        LocalDate day = LocalDate.of(2099, 12, 31);
        List<UUID> staffIds = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            UUID staffId = UUID.randomUUID();
            jdbc.sql("""
                            insert into operator_bonus_period (id, staff_id, period_key, period_started_at,
                                                               period_ended_at, points, fulfilled_count,
                                                               cancelled_count, closed_at)
                            values (:id, :staff, :day, :at, :at, 1, 1, 0, :at)""")
                    .param("id", UUID.randomUUID()).param("staff", staffId).param("day", day).param("at", FUTURE)
                    .update();
            staffIds.add(staffId);
        }
        Actor manager = staff(OperatorBonuses.MANAGE_PERMISSION);
        List<UUID> seen = pages((after, limit) -> bonuses.periods(manager, after, limit),
                OperatorBonuses.ClosedPeriod::staffId, OperatorBonuses::position, staffIds);
        assertThat(seen).hasSize(3).doesNotHaveDuplicates().containsExactlyElementsOf(sorted(staffIds).reversed());
        jdbc.sql("delete from operator_bonus_period where period_key = :day").param("day", day).update();
    }

    @Test
    void walletMovementsAreReadPageByPageNewestFirst() {
        UUID client = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", client).param("phone", "+48" + String.format("%09d", Math.floorMod(client.hashCode(),
                        1_000_000_000))).update();
        Actor clerk = staff(RiderWallets.MANAGE_PERMISSION);
        for (int i = 1; i <= 3; i++) {
            wallets.topUp(clerk, UUID.randomUUID(), client, "UAH", 100L * i, "Paging " + i);
        }
        List<UUID> made = wallets.of(clerk, client, 10).entries().stream().map(RiderWallets.Entry::id).toList();
        assertThat(made).hasSize(3);
        List<UUID> seen = pages((after, limit) -> wallets.of(clerk, client, after, limit).entries(),
                RiderWallets.Entry::id, RiderWallets::position, made);
        assertThat(seen).containsExactlyElementsOf(made);
    }

    /** PostgreSQL orders uuids by their bytes: the order of their hex text. */
    private static List<UUID> sorted(List<UUID> ids) {
        return ids.stream().sorted((a, b) -> a.toString().compareTo(b.toString())).toList();
    }
}
