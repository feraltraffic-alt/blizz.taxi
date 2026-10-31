package taxi.blizz.operations.internal;

import java.util.UUID;
import org.springframework.stereotype.Service;
import taxi.blizz.operations.TripCorrections;
import taxi.blizz.platform.Actor;

@Service
class JdbcTripCorrections implements TripCorrections {

    @Override
    public Facts facts(Actor staff, UUID orderId) {
        throw new UnsupportedOperationException("issue #142");
    }

    @Override
    public Facts correct(Actor staff, UUID commandId, UUID orderId, long expectedVersion, Change change,
                         String reason) {
        throw new UnsupportedOperationException("issue #142");
    }

    @Override
    public Facts review(Actor staff, UUID commandId, UUID orderId, String reason) {
        throw new UnsupportedOperationException("issue #142");
    }
}
