package taxi.blizz.operations.internal;

import java.time.Duration;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Dispatch parameters (REQ-DSP-03, section 30) — starting values to be calibrated in the pilot.
 *
 * @param personalOfferTtl     lifetime of a personal offer (server deadline)
 * @param personalPhaseMax     how long personal offers are tried before the order goes to "ALL"
 * @param totalDeadline        total search time before the order becomes UNFULFILLED
 * @param radiiMeters          candidate search radii, tried in order
 * @param candidateLimit       candidates considered per radius
 * @param broadcastRadiusMeters distance within which a driver sees "ALL" orders
 * @param workerEnabled        process deadlines in this process
 * @param pollInterval         deadline worker delay
 * @param batchSize            attempts processed per poll
 * @param lease                how long a worker owns a claimed attempt
 * @param arrivalRadiusMeters  arrival must be reported within this distance of the pickup (REQ-ASG-06)
 * @param arrivalAccuracyMeters a position less accurate than this is not trusted for an arrival: the driver confirms
 *                             with a reason, as for a far-away arrival (REQ-ASG-06, REQ-GEO-04)
 * @param reportedTimeTolerance completion time from the device further than this from server time is flagged
 * @param noShowMinimumWait    a no-show can be reported only after waiting this long (REQ-CAN-06; value per Q-07)
 * @param journalRetention     how long the rounds of the dispatch journal are kept (REQ-DSP-12, issue #71)
 * @param journalCandidates    drivers recorded per round, nearest first
 */
@ConfigurationProperties("blizz.dispatch")
public record DispatchProperties(
        @DefaultValue("PT15S") Duration personalOfferTtl,
        @DefaultValue("PT60S") Duration personalPhaseMax,
        @DefaultValue("PT180S") Duration totalDeadline,
        @DefaultValue({"2000", "5000"}) List<Integer> radiiMeters,
        @DefaultValue("20") int candidateLimit,
        @DefaultValue("5000") int broadcastRadiusMeters,
        @DefaultValue("true") boolean workerEnabled,
        @DefaultValue("PT1S") Duration pollInterval,
        @DefaultValue("50") int batchSize,
        @DefaultValue("PT30S") Duration lease,
        @DefaultValue("150") int arrivalRadiusMeters,
        @DefaultValue("100") int arrivalAccuracyMeters,
        @DefaultValue("PT5M") Duration reportedTimeTolerance,
        @DefaultValue("PT5M") Duration noShowMinimumWait,
        @DefaultValue("P90D") Duration journalRetention,
        @DefaultValue("50") int journalCandidates) {
}
