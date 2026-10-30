package taxi.blizz.platform;

import java.util.List;
import java.util.function.Function;

/**
 * One page of a list (REQ-API-09). A list asks its store for {@code limit + 1} rows: the extra row only says that
 * more exist and is not returned.
 */
public record Page<T>(List<T> items, Info page) {

    /** {@code nextCursor} is null exactly when {@code hasMore} is false. */
    public record Info(String nextCursor, boolean hasMore) {
    }

    public <R> Page<R> map(Function<T, R> mapper) {
        return new Page<>(items.stream().map(mapper).toList(), page);
    }

    public static <T> Page<T> of(List<T> rows, int limit, Function<T, PageCursor> position) {
        if (rows.size() <= limit) {
            return new Page<>(List.copyOf(rows), new Info(null, false));
        }
        List<T> items = List.copyOf(rows.subList(0, limit));
        return new Page<>(items, new Info(position.apply(items.getLast()).encode(), true));
    }
}
