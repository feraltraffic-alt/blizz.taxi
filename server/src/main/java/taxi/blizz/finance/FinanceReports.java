package taxi.blizz.finance;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The owner's report of the money of a city's orders per day of the city's calendar (T-40), from the journal. Only
 * movements of the city's orders: top-ups, transfers between drivers and forfeited bonuses belong to the whole
 * service, not to a city. Needs {@code reports.view} for the city. Minor units of the city's currency.
 */
public interface FinanceReports {

    /**
     * {@code faresMinor}: what the trips cost; {@code serviceRidesMinor}: follow-up rides the service paid itself;
     * {@code discountsMinor} and {@code bonusesGrantedMinor}: the service's expense on promotions;
     * {@code paidByCardMinor}, {@code paidWithBonusesMinor}, {@code collectedByDriversMinor} (cash, own terminals):
     * how the riders paid;
     * {@code riderDebtChangeMinor}: how the riders' debt for these orders changed (positive — it grew).
     */
    record Figures(int trips, long faresMinor, long serviceRidesMinor, long commissionMinor, long driverShareMinor,
                   long discountsMinor, long bonusesGrantedMinor, long paidByCardMinor, long paidWithBonusesMinor,
                   long collectedByDriversMinor, long tipsMinor, long riderDebtChangeMinor) {
    }

    record Day(LocalDate date, Figures figures) {
    }

    record Report(UUID cityId, String currency, String timezone, LocalDate from, LocalDate to, List<Day> days,
                  Figures total) {
    }

    /** At most 92 days, {@code to} included. */
    Report money(Actor staff, UUID cityId, LocalDate from, LocalDate to);
}
