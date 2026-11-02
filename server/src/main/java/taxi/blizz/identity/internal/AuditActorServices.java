package taxi.blizz.identity.internal;

import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.audit.ActorServices;
import taxi.blizz.identity.Services;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/** The audit module's port to a person's taxi service (ADR 0016). */
@Component
class AuditActorServices implements ActorServices {

    private final Services services;

    AuditActorServices(Services services) {
        this.services = services;
    }

    @Override
    public Optional<UUID> serviceOf(Actor actor) {
        if (actor == null || actor.type() == SubjectType.SYSTEM || actor.id() == null) {
            return Optional.empty();
        }
        return services.of(actor);
    }
}
