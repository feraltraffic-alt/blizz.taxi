package taxi.blizz.operations;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The owner's report of orders per city and day of the city's calendar (local midnight, daylight saving included —
 * T-40), by the day an order was created. Needs {@code reports.view} for the city.
 */
public interface OrderReports {

    /**
     * {@code open}: not finished yet; {@code byChannel} (APP, PHONE, WEB) and {@code byPayment} (CASH, CARD,
     * TERMINAL, SERVICE) count all orders of the day; {@code cancelledBy} — RIDER, DRIVER, STAFF.
     */
    record Counts(int created, int fulfilled, int cancelled, int unfulfilled, int open, Map<String, Integer> byChannel,
                  Map<String, Integer> byPayment, Map<String, Integer> cancelledBy) {
    }

    record Day(LocalDate date, Counts counts) {
    }

    /** A cancellation reason and how often it was given in the period, most frequent first. */
    record Reason(String cancelledBy, String code, int count) {
    }

    record Report(UUID cityId, String timezone, LocalDate from, LocalDate to, List<Day> days, Counts total,
                  List<Reason> cancellationReasons) {
    }

    /** At most 92 days, {@code to} included. */
    Report orders(Actor staff, UUID cityId, LocalDate from, LocalDate to);
}
