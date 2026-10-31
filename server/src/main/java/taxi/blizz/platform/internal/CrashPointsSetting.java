package taxi.blizz.platform.internal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.CrashPoints;

/** Arms {@link CrashPoints} from {@code blizz.faults.crash-at} (fault tests only; refused in production). */
@Component
class CrashPointsSetting {

    CrashPointsSetting(@Value("${blizz.faults.crash-at:}") String crashAt) {
        CrashPoints.arm(crashAt);
    }
}
