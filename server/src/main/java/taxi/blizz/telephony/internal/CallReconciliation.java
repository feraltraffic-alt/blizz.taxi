package taxi.blizz.telephony.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * After the ARI events stream (re)connects (issue #67): the calls that ended while the server was not listening are
 * closed against Asterisk's list of channels, so the 4-hour sweep is only a last resort. The snapshot time is taken
 * before the list is asked for, and the stream is already open then: a call that starts meanwhile is either in the
 * list or reported by its events. Calls that started and ended entirely while the stream was down are not logged.
 */
@Component
class CallReconciliation {

    private static final Logger log = LoggerFactory.getLogger(CallReconciliation.class);

    private final JdbcCalls calls;
    private final AriChannels asterisk;
    private final Clock clock;

    CallReconciliation(JdbcCalls calls, AriChannels asterisk, Clock clock) {
        this.calls = calls;
        this.asterisk = asterisk;
        this.clock = clock;
    }

    /** Never throws: a failed check leaves the calls to the sweep. */
    void afterConnect() {
        OffsetDateTime snapshotAt = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        try {
            Set<String> alive = asterisk.channels();
            calls.reconcile(alive, snapshotAt);
        } catch (Exception e) {
            log.warn("The calls could not be checked against Asterisk's channels ({}); the sweep closes them later",
                    e.getClass().getSimpleName());
        }
    }
}
