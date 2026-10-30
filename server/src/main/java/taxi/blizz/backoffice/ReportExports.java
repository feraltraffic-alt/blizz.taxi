package taxi.blizz.backoffice;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;

/**
 * Report exports to CSV (REQ-ADM-07): the owner's reports of orders or money of a city, built by a background job.
 * Only the staff member who asked sees and downloads the export; {@code reports.view} for the city is checked when
 * asking, when building and again when downloading. A ready file is kept for a limited time, then dropped. Text
 * cells are protected from formulas when the CSV is opened in a spreadsheet. Requests and downloads are audited.
 */
public interface ReportExports {

    enum Kind { ORDERS, FINANCE }

    /**
     * {@code state}: PENDING → RUNNING → READY (the file can be downloaded until {@code expiresAt}) or FAILED
     * ({@code error}); READY → EXPIRED.
     */
    record Export(UUID id, Kind kind, UUID cityId, LocalDate from, LocalDate to, String state, String fileName,
                  Integer rows, String error, OffsetDateTime createdAt, OffsetDateTime readyAt,
                  OffsetDateTime expiresAt) {
    }

    record File(String name, byte[] content) {
    }

    /** At most 92 days, {@code to} included, as the reports themselves. */
    Export request(Actor staff, UUID commandId, Kind kind, UUID cityId, LocalDate from, LocalDate to);

    /** The staff member's own exports, newest first (created_at, then id), after {@code after} (REQ-API-09). */
    List<Export> mine(Actor staff, PageCursor after, int limit);

    default List<Export> mine(Actor staff, int limit) {
        return mine(staff, null, limit);
    }

    String MINE = "report-exports";

    static PageCursor position(Export export) {
        return PageCursor.of(MINE, export.createdAt(), export.id());
    }

    Export get(Actor staff, UUID exportId);

    File download(Actor staff, UUID exportId);

    /** Builds up to {@code max} waiting exports; returns how many were taken. */
    int buildPending(int max);

    /** Drops the files whose time is over; returns how many. */
    int expire();
}
