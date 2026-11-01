package taxi.blizz.identity;

import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The taxi services of this server (ADR 0016, issue #214). Riders, drivers, staff and cities belong to one; an app
 * names its service at sign-in, and every token carries it.
 */
public interface Services {

    /** The first service, which holds everything that existed before services (migration V20261101_2200_1). */
    UUID DEFAULT_ID = UUID.fromString("5e000000-0000-4000-8000-000000000001");

    /** The service of this code when it exists and is ACTIVE; empty otherwise. */
    Optional<UUID> active(String code);

    /** The service a rider, driver or staff member belongs to; empty for an unknown subject. */
    Optional<UUID> of(Actor subject);
}
