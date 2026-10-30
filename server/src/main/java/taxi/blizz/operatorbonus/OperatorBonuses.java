package taxi.blizz.operatorbonus;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;

/** Bonus points for staff who create phone orders (ADR 0011). */
public interface OperatorBonuses {

    String MANAGE_PERMISSION = "operator-bonuses.manage";

    record TimeRule(String key, Set<Integer> daysOfWeek, int startHour, int endHour, int m, int g) {
        public TimeRule {
            // Sorted, so the hashed settings request serializes the same on every instance (audit 29.10.2026).
            daysOfWeek = daysOfWeek == null ? Set.of()
                    : java.util.Collections.unmodifiableSortedSet(new java.util.TreeSet<>(daysOfWeek));
        }
    }

    record Settings(int m, int g, boolean countCancellations, int resetDay, List<TimeRule> timeRules) {
        public Settings {
            timeRules = timeRules == null ? List.of() : List.copyOf(timeRules);
        }
    }

    record SettingsVersion(long version, Settings settings, OffsetDateTime effectiveAt, UUID changedBy, String reason) {
    }

    record Entry(UUID orderId, String kind, String ruleKey, long settingsVersion, int points,
                 OffsetDateTime occurredAt) {
    }

    record Account(UUID staffId, int balance, int fulfilledCount, int cancelledCount,
                   OffsetDateTime periodStartedAt, List<Entry> lastEntries) {
    }

    record ClosedPeriod(UUID staffId, java.time.LocalDate periodKey, OffsetDateTime periodStartedAt,
                        OffsetDateTime periodEndedAt, int points, int fulfilledCount, int cancelledCount,
                        OffsetDateTime closedAt) {
    }

    SettingsVersion currentSettings(Actor staff);

    SettingsVersion changeSettings(Actor staff, UUID commandId, long expectedVersion, Settings settings, String reason);

    Account mine(Actor staff, int entryLimit);

    List<Account> accounts(Actor staff);

    List<Entry> history(Actor staff, UUID staffId, int limit);

    /** Closed periods, newest first (period, then staff id), after {@code after} (REQ-API-09). */
    List<ClosedPeriod> periods(Actor staff, PageCursor after, int limit);

    default List<ClosedPeriod> periods(Actor staff, int limit) {
        return periods(staff, null, limit);
    }

    String PERIODS = "bonus-periods";

    static PageCursor position(ClosedPeriod period) {
        return PageCursor.of(PERIODS, period.periodKey(), period.staffId());
    }

    /** Invoked by the reset worker; idempotent for every account/period. */
    void resetDueAccounts();
}
