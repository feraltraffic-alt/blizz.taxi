package taxi.blizz.operations;

import java.util.UUID;

/** The authoritative assignment of an order (REQ-ASG-*). */
public record AssignmentView(UUID id, UUID orderId, UUID driverId, UUID vehicleId, String source, String state,
                             UUID tripId, String tripPhase) {
}
