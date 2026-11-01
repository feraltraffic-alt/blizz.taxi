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

    /** {@code fromUtc}/{@code toUtc}: the local day's midnights in UTC; 23 or 25 hours on a DST change. */
    record Day(LocalDate date, java.time.OffsetDateTime fromUtc, java.time.OffsetDateTime toUtc, Counts counts) {
    }

    /** A cancellation reason and how often it was given in the period, most frequent first. */
    record Reason(String cancelledBy, String code, int count) {
    }

    /**
     * {@code generatedAt}: when the figures were read (REQ-ADM-06); {@code fromUtc}/{@code toUtc}: the period in UTC,
     * the end excluded (REQ-LED-09).
     */
    record Report(UUID cityId, String timezone, LocalDate from, LocalDate to, java.time.OffsetDateTime fromUtc,
                  java.time.OffsetDateTime toUtc, List<Day> days, Counts total,
                  List<Reason> cancellationReasons, java.time.OffsetDateTime generatedAt) {
    }

    /** At most 92 days, {@code to} included. */
    Report orders(Actor staff, UUID cityId, LocalDate from, LocalDate to);
}
