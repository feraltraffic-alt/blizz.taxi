package taxi.blizz.pricing.internal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import tools.jackson.databind.json.JsonMapper;

/** GraphHopper replaces the straight-line estimate when {@code blizz.routing.graphhopper.enabled=true}. */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(GraphHopperProperties.class)
class RoutingConfiguration {

    @Bean
    @Primary
    @ConditionalOnProperty(prefix = "blizz.routing.graphhopper", name = "enabled", havingValue = "true")
    GraphHopperRouteEstimator graphHopperRouteEstimator(GraphHopperProperties properties,
                                                        StraightLineRouteEstimator straightLine, JsonMapper json) {
        return new GraphHopperRouteEstimator(properties, straightLine, json);
    }
}
