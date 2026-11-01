package taxi.blizz.finance.internal;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.stereotype.Service;
import taxi.blizz.finance.FareAccounting;
import taxi.blizz.platform.Actor;

/** See {@link FareAccounting}. */
@Service
class JdbcFareAccounting implements FareAccounting {

    @Override
    public Set<UUID> posted(Collection<UUID> orderIds) {
        return Set.of();
    }

    @Override
    public PendingList pending(Actor staff, UUID cityId) {
        return new PendingList(cityId, List.of(), false);
    }

    @Override
    public Pending ofDriver(UUID driverId, UUID cityId) {
        return new Pending(0, 0);
    }

    /** The oldest trip waiting longer than {@link PendingPostingGauges#GRACE}, in seconds; 0 when none. */
    long oldestWaitingSeconds() {
        return 0;
    }
}
