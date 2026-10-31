package taxi.blizz.operations.internal;

import java.util.UUID;
import org.springframework.stereotype.Service;
import taxi.blizz.operations.FareCorrections;
import taxi.blizz.platform.Actor;

@Service
class JdbcFareCorrections implements FareCorrections {

    @Override
    public View fare(Actor staff, UUID orderId) {
        throw new UnsupportedOperationException("issue #142");
    }

    @Override
    public View correct(Actor staff, UUID commandId, UUID orderId, int expectedVersion, long amountMinor,
                        String reason, String password) {
        throw new UnsupportedOperationException("issue #142");
    }
}
