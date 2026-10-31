package taxi.blizz.driver.internal;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;
import taxi.blizz.driver.DriverDeletions;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.ErasedSubjects;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;

@Service
class JdbcDriverDeletions implements DriverDeletions, ErasedSubjects {

    @Override
    public ChallengeIssued requestCode(Actor driver, String deviceRef, String clientIp) {
        throw new UnsupportedOperationException("issue #144");
    }

    @Override
    public Status request(Actor driver, UUID currentSessionId, UUID commandId, UUID challengeId, String otpCode) {
        throw new UnsupportedOperationException("issue #144");
    }

    @Override
    public Status cancel(Actor driver, UUID commandId) {
        throw new UnsupportedOperationException("issue #144");
    }

    @Override
    public List<Pending> pending(PageCursor after, int limit) {
        return List.of();
    }

    @Override
    public Optional<Pending> pending(UUID driverId) {
        return Optional.empty();
    }

    @Override
    public void anonymize(UUID driverId) {
        throw new UnsupportedOperationException("issue #144");
    }

    @Override
    public void restore(UUID driverId) {
        throw new UnsupportedOperationException("issue #144");
    }

    @Override
    public String subjectType() {
        return "DRIVER";
    }

    @Override
    public String anonymizedEvent() {
        return "DriverAnonymized";
    }

    @Override
    public String idField() {
        return "driver_id";
    }

    @Override
    public boolean reapply(UUID subjectId) {
        return false;
    }
}
