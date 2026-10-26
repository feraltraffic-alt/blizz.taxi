package taxi.blizz.platform;

import java.util.Objects;
import java.util.UUID;

/**
 * Who performs an action: subject type plus id (REQ-USR-07). The same UUID in different
 * tables is never the same subject, so the type is always carried with the id.
 */
public record Actor(SubjectType type, UUID id) {

    private static final Actor SYSTEM = new Actor(SubjectType.SYSTEM, null);

    public Actor {
        Objects.requireNonNull(type, "type");
        if (type != SubjectType.SYSTEM) {
            Objects.requireNonNull(id, "id");
        }
    }

    public static Actor system() {
        return SYSTEM;
    }
}
