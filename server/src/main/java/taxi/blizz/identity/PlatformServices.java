package taxi.blizz.identity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The taxi services of this server, managed by the platform owner (ADR 0016, issue #214): created with their first
 * super admin, suspended and resumed. The owner sees no service's riders, drivers, orders or money.
 */
public interface PlatformServices {

    record TaxiService(UUID id, String code, String name, String state, long version, OffsetDateTime createdAt) {
    }

    /** The first super admin of a new service; they change the initial password at the first sign-in. */
    record FirstSuperAdmin(String login, String initialPassword, String firstName, String lastName) {
    }

    List<TaxiService> list(Actor owner);

    /** {@code password}: the owner's own, as for every grant of rights (REQ-ADM-10). */
    TaxiService create(Actor owner, UUID commandId, String code, String name, FirstSuperAdmin superAdmin,
                       String reason, String password);

    /** SUSPENDED ends every session of the service at once; ACTIVE lets it sign in again. */
    TaxiService changeState(Actor owner, UUID commandId, UUID serviceId, long expectedVersion, String state,
                            String reason);
}
