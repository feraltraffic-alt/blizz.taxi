package taxi.blizz.finance;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The driver's earnings screen (REQ-DRV-12): separate figures per day of the city's calendar, from the journal
 * (DRIVER_PAYABLE and the fares of the driver's trips). Days are cut at local midnight of the city's time zone,
 * daylight saving included (T-40). "Available for payout" is not here until payouts are decided (Q-11).
 */
public interface DriverEarnings {

    /**
     * One day or the total, minor units of the city's currency. {@code fareMinor}: what the trips cost;
     * {@code commissionMinor}: the service's part; {@code driverShareMinor}: the driver's part; {@code cashMinor}:
     * what the driver took in cash or at the own terminal; {@code cashlessMinor}: what the riders paid through the
     * service (card, bonuses, the service's discount); {@code adjustmentsMinor}: anything else on the balance.
     * {@code netMinor}: how the balance changed — positive, the service owes the driver more.
     */
    /**
     * {@code heldMinor}: the driver's share of cash trips the driver reported not paid, held while support checks
     * (SUSPENSE); not on the balance until a decision credits it (audit 29.10.2026: such a trip was missing).
     */
    record Figures(int trips, long fareMinor, long commissionMinor, long driverShareMinor, long heldMinor,
                   long cashMinor,
                   long cashlessMinor, long tipsMinor, long bonusesMinor, long topUpsMinor, long transfersInMinor,
                   long transfersOutMinor, long adjustmentsMinor, long netMinor) {
    }

    record Day(LocalDate date, Figures figures) {
    }

    /** {@code balanceMinor}: the balance now, whatever the period; negative — the driver owes the service. */
    record Earnings(UUID driverId, UUID cityId, String currency, String timezone, LocalDate from, LocalDate to,
                    List<Day> days, Figures total, long balanceMinor) {
    }

    /** The driver's own; at most 92 days, {@code to} included. */
    Earnings mine(Actor driver, UUID cityId, LocalDate from, LocalDate to);

    /** For staff with {@link DriverBalances#MANAGE_PERMISSION}. */
    Earnings of(Actor staff, UUID driverId, UUID cityId, LocalDate from, LocalDate to);
}
