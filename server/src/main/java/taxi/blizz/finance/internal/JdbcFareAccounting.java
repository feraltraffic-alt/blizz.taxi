package taxi.blizz.finance.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.finance.DriverBalances;
import taxi.blizz.finance.FareAccounting;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.OutboxBacklog;
import tools.jackson.databind.json.JsonMapper;

/**
 * See {@link FareAccounting}. Pending trips are the TripCompleted events {@link TripFarePosting} has not handled,
 * waiting for a retry or FAILED, that carry a fare to post; normally none, so they are read whole and filtered here.
 */
@Service
class JdbcFareAccounting implements FareAccounting {

    /** More than this many waiting events and the oldest are what is seen; the alert has fired long before. */
    static final int READ_AT_MOST = 10_000;

    private final JdbcClient jdbc;
    private final OutboxBacklog backlog;
    private final StaffAccess staff;
    private final JsonMapper json;
    private final Clock clock;

    JdbcFareAccounting(JdbcClient jdbc, OutboxBacklog backlog, StaffAccess staff, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.backlog = backlog;
        this.staff = staff;
        this.json = json;
        this.clock = clock;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Completed(UUID orderId, UUID driverId, UUID cityId, UUID finalFareId, Long amountMinor, String currency) {
    }

    private record Owed(Completed trip, Instant completedAt) {
    }

    @Override
    @Transactional(readOnly = true)
    public Set<UUID> posted(Collection<UUID> orderIds) {
        if (orderIds.isEmpty()) {
            return Set.of();
        }
        return new HashSet<>(jdbc.sql("""
                        select distinct basis_id from journal_transaction
                        where basis_type = 'TRIP_FARE' and basis_id in (:ids)""")
                .param("ids", orderIds).query(UUID.class).list());
    }

    @Override
    @Transactional(readOnly = true)
    public PendingList pending(Actor actor, UUID cityId) {
        staff.require(actor, DriverBalances.MANAGE_PERMISSION, cityId);
        Instant now = clock.instant();
        List<Owed> owed = owed().stream()
                .filter(o -> cityId.equals(o.trip().cityId()))
                .filter(o -> o.completedAt().isAfter(now.minus(LIST_WINDOW)))
                .toList();
        List<PendingTrip> trips = owed.stream().limit(MAX_LISTED)
                .map(o -> new PendingTrip(o.trip().orderId(), o.trip().driverId(),
                        o.completedAt().atOffset(ZoneOffset.UTC),
                        Math.max(0, Duration.between(o.completedAt(), now).toSeconds()), o.trip().amountMinor(),
                        o.trip().currency()))
                .toList();
        return new PendingList(cityId, trips, owed.size() > MAX_LISTED);
    }

    @Override
    @Transactional(readOnly = true)
    public Pending ofDriver(UUID driverId, UUID cityId) {
        List<Owed> mine = owed().stream()
                .filter(o -> driverId.equals(o.trip().driverId()) && cityId.equals(o.trip().cityId()))
                .toList();
        return new Pending(mine.size(), mine.stream().mapToLong(o -> o.trip().amountMinor()).sum());
    }

    /** The oldest trip waiting longer than {@link PendingPostingGauges#GRACE}, in seconds; 0 when none. */
    long oldestWaitingSeconds() {
        Instant now = clock.instant();
        return owed().stream().map(Owed::completedAt)
                .filter(at -> at.isBefore(now.minus(PendingPostingGauges.GRACE)))
                .findFirst().map(at -> Duration.between(at, now).toSeconds()).orElse(0L);
    }

    /** Waiting TripCompleted events with a fare to post, the oldest first (as TripFarePosting skips the rest). */
    private List<Owed> owed() {
        return backlog.waiting("TripCompleted", TripFarePosting.CONSUMER, READ_AT_MOST).stream()
                .map(w -> new Owed(json.readValue(w.payload(), Completed.class), w.occurredAt()))
                .filter(o -> o.trip().finalFareId() != null && o.trip().amountMinor() != null
                        && o.trip().amountMinor() > 0)
                .toList();
    }
}
