package taxi.blizz.backoffice.internal;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import taxi.blizz.backoffice.DriverDeletionReview;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;

@Service
class JdbcDriverDeletionReview implements DriverDeletionReview {

    @Override
    public List<Request> pending(Actor staff, PageCursor after, int limit) {
        return List.of();
    }

    @Override
    public Decision complete(Actor staff, UUID commandId, UUID driverId, String reason) {
        throw new UnsupportedOperationException("issue #144");
    }

    @Override
    public Decision reject(Actor staff, UUID commandId, UUID driverId, String reason) {
        throw new UnsupportedOperationException("issue #144");
    }
}
