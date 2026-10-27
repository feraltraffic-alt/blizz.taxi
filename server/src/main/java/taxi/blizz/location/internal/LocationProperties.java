package taxi.blizz.location.internal;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("blizz.location")
record LocationProperties(
        @DefaultValue("PT30S") Duration futureTolerance,
        @DefaultValue("50") double poorAccuracyMeters,
        @DefaultValue("250") double jumpKph,
        @DefaultValue("30") int maxBatches,
        @DefaultValue("PT1M") Duration batchWindow) {

    LocationProperties {
        if (futureTolerance.isNegative()) throw new IllegalArgumentException("future-tolerance must not be negative");
        if (!(poorAccuracyMeters > 0)) throw new IllegalArgumentException("poor-accuracy-meters must be positive");
        if (!(jumpKph > 0)) throw new IllegalArgumentException("jump-kph must be positive");
        if (maxBatches < 1) throw new IllegalArgumentException("max-batches must be positive");
        if (batchWindow.isZero() || batchWindow.isNegative()) throw new IllegalArgumentException("batch-window must be positive");
    }
}
