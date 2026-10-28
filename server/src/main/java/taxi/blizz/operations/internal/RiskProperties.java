package taxi.blizz.operations.internal;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Automatic risk flags (REQ-DS-08, issue #71).
 *
 * @param impossibleSpeedKph two consecutive positions implying a speed above this are an impossible movement; the
 *                           location module reports jumps above its own {@code blizz.location.jump-kph} only, so a
 *                           lower value here has no effect
 * @param minDistanceMeters  …over more than this distance (a short GPS glitch is not a case)
 */
@ConfigurationProperties("blizz.risk")
record RiskProperties(
        @DefaultValue("250") double impossibleSpeedKph,
        @DefaultValue("1000") int minDistanceMeters) {
}
