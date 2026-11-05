package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.ServiceSettings;

/**
 * Who is at fault for a cancellation (owner decision 05.11.2026, ADR 0019), from the reason and the moment. A reason
 * with the client's fault is free while no driver is on the order and within the free window after the acceptance;
 * a reason marked "the driver's fault if late" puts it on the driver when the driver is later than promised by more
 * than the setting, or, with no promise, not there within the other setting after the acceptance. Reads only.
 */
@Component
class CancellationFaults {

    /** The order's statuses with a driver on it. */
    private static final Set<String> WITH_DRIVER = Set.of("ASSIGNED", "IN_SERVICE");

    private final JdbcClient jdbc;
    private final ServiceSettings settings;

    CancellationFaults(JdbcClient jdbc, ServiceSettings settings) {
        this.jdbc = jdbc;
        this.settings = settings;
    }

    /**
     * {@code fault}: CLIENT_FREE, CLIENT, DRIVER, OPERATOR or NONE. {@code late}: the driver's fault came from
     * lateness, on the assignment {@code assignmentId} of {@code driverId}.
     */
    record Verdict(String fault, boolean late, UUID assignmentId, UUID driverId) {
        static Verdict of(String fault) {
            return new Verdict(fault, false, null, null);
        }
    }

    private record Facts(UUID assignmentId, UUID driverId, OffsetDateTime acceptedAt, OffsetDateTime promisedAt,
                         OffsetDateTime arrivedAt) {
    }

    /**
     * The fault of cancelling {@code order} (as locked, before the cancellation changed it) for {@code reason} at
     * {@code now}. Call before or after the assignment is ended in the same transaction: the last one is read.
     */
    Verdict of(OrderCore.LockedOrder order, CancelReasons.Reason reason, OffsetDateTime now) {
        CancelReasons.Fault fault = reason.fault() != null ? reason.fault()
                : CancelReasons.Fault.startingFor(reason.audience(), reason.operatorFault());
        if (fault == null) {
            return Verdict.of("NONE");
        }
        if (fault != CancelReasons.Fault.CLIENT) {
            return Verdict.of(fault.name());
        }
        if (!WITH_DRIVER.contains(order.status())) {
            return Verdict.of("CLIENT_FREE");
        }
        Facts facts = jdbc.sql("""
                        select a.id, a.driver_id, a.created_at, a.promised_pickup_at, t.arrived_at
                        from assignment a left join trip t on t.assignment_id = a.id
                        where a.order_id = :id order by a.created_at desc limit 1""")
                .param("id", order.id())
                .query((rs, i) -> new Facts(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, OffsetDateTime.class), rs.getObject(4, OffsetDateTime.class),
                        rs.getObject(5, OffsetDateTime.class)))
                .optional().orElse(null);
        if (facts == null) {
            return Verdict.of("CLIENT_FREE");
        }
        ServiceSettings.CancellationFault rules = settings.ofCity(order.cityId()).settings().cancellationFault();
        if (reason.lateDriverFault()) {
            OffsetDateTime deadline = facts.promisedAt() != null
                    ? facts.promisedAt().plusMinutes(rules.driverLateMinutes())
                    : facts.acceptedAt().plusMinutes(rules.driverLateWithoutPromiseMinutes());
            OffsetDateTime reached = facts.arrivedAt() != null ? facts.arrivedAt() : now;
            if (reached.isAfter(deadline)) {
                return new Verdict("DRIVER", true, facts.assignmentId(), facts.driverId());
            }
        }
        return now.isAfter(facts.acceptedAt().plusMinutes(rules.clientFreeMinutes())) ? Verdict.of("CLIENT")
                : Verdict.of("CLIENT_FREE");
    }
}
