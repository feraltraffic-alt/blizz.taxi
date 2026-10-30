package taxi.blizz.platform;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

/**
 * A position in a list (REQ-API-09): the sort keys of the last row the client saw, so the next page starts right after
 * it even when many rows share a {@code created_at}. Opaque to clients; it names its list, so a cursor of one list is
 * refused by another. It is not secret: it holds only what the client has already read, and moving it can only move
 * the client inside the same filtered list.
 *
 * <p>Times are kept to the microsecond, the precision of PostgreSQL, so a row compares equal to its own cursor.
 */
public final class PageCursor {

    public static final int DEFAULT_LIMIT = 50;
    public static final int MAX_LIMIT = 100;
    /** What a store reads at most: one row past the largest page, to know whether more exist. */
    public static final int MAX_FETCH = MAX_LIMIT + 1;

    private static final String VERSION = "1";
    private static final Base64.Encoder ENCODER = Base64.getUrlEncoder().withoutPadding();
    private static final Base64.Decoder DECODER = Base64.getUrlDecoder();

    private final String list;
    private final List<String> keys;

    private PageCursor(String list, List<String> keys) {
        this.list = list;
        this.keys = List.copyOf(keys);
    }

    /** Keys in the list's sort order: times, ids or numbers. */
    public static PageCursor of(String list, Object... keys) {
        List<String> values = new ArrayList<>(keys.length);
        for (Object key : keys) {
            values.add(switch (key) {
                case OffsetDateTime time -> Long.toString(ChronoUnit.MICROS.between(Instant.EPOCH, time.toInstant()));
                case Instant time -> Long.toString(ChronoUnit.MICROS.between(Instant.EPOCH, time));
                case UUID id -> id.toString();
                case Number number -> Long.toString(number.longValue());
                default -> throw new IllegalArgumentException("Unsupported cursor key: " + key.getClass());
            });
        }
        return new PageCursor(list, values);
    }

    /**
     * The deprecated {@code before} timestamp of the older lists, as a cursor: every row created strictly before it.
     * The nil UUID is the smallest, so a row at exactly {@code before} is not repeated.
     */
    public static PageCursor before(String list, OffsetDateTime before) {
        return before == null ? null : of(list, before, new UUID(0, 0));
    }

    /** {@code cursor} wins over the deprecated {@code before}; both absent is the first page. */
    public static PageCursor read(String list, String cursor, OffsetDateTime before) {
        return cursor != null ? decode(list, cursor) : before(list, before);
    }

    public static PageCursor decode(String list, String text) {
        if (text == null) {
            return null;
        }
        try {
            String decoded = new String(DECODER.decode(text), StandardCharsets.UTF_8);
            String[] parts = decoded.split("\\|", -1);
            if (parts.length < 3 || !VERSION.equals(parts[0]) || !list.equals(parts[1])) {
                throw invalid();
            }
            return new PageCursor(list, List.of(parts).subList(2, parts.length));
        } catch (IllegalArgumentException e) {
            throw invalid();
        }
    }

    public String encode() {
        return ENCODER.encodeToString((VERSION + "|" + list + "|" + String.join("|", keys))
                .getBytes(StandardCharsets.UTF_8));
    }

    /** The requested page size: 50 when not given, 1 to 100 otherwise. */
    public static int limit(Integer requested) {
        if (requested == null) {
            return DEFAULT_LIMIT;
        }
        if (requested < 1 || requested > MAX_LIMIT) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "limit must be between 1 and " + MAX_LIMIT);
        }
        return requested;
    }

    public OffsetDateTime time(int index) {
        try {
            return OffsetDateTime.ofInstant(Instant.EPOCH.plus(Long.parseLong(key(index)), ChronoUnit.MICROS),
                    ZoneOffset.UTC);
        } catch (RuntimeException e) {
            throw invalid();
        }
    }

    public UUID id(int index) {
        try {
            return UUID.fromString(key(index));
        } catch (IllegalArgumentException e) {
            throw invalid();
        }
    }

    public long number(int index) {
        try {
            return Long.parseLong(key(index));
        } catch (NumberFormatException e) {
            throw invalid();
        }
    }

    private String key(int index) {
        if (index >= keys.size()) {
            throw invalid();
        }
        return keys.get(index);
    }

    private static DomainException invalid() {
        return new DomainException(ErrorCode.VALIDATION_FAILED, "Invalid cursor");
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof PageCursor that && list.equals(that.list) && keys.equals(that.keys);
    }

    @Override
    public int hashCode() {
        return list.hashCode() * 31 + keys.hashCode();
    }

    @Override
    public String toString() {
        return "PageCursor[" + list + " " + keys + "]";
    }
}
