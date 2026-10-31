package taxi.blizz.operations.internal;

import java.util.UUID;
import org.springframework.stereotype.Service;
import taxi.blizz.operations.DestinationChanges;
import taxi.blizz.platform.Actor;

/** See {@link DestinationChanges}. */
@Service
class JdbcDestinationChanges implements DestinationChanges {

    @Override
    public Changed change(Actor staff, UUID commandId, UUID orderId, long expectedVersion, Change change) {
        throw new UnsupportedOperationException("issue #142, part C2");
    }
}
