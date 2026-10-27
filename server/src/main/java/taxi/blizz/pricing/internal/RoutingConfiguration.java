package taxi.blizz.pricing.internal;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import taxi.blizz.configuration.Integrations;
import tools.jackson.databind.json.JsonMapper;

/** GraphHopper or the straight line, as set in the admin panel (Integrations) or the environment. */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(GraphHopperProperties.class)
class RoutingConfiguration {

    @Bean
    @Primary
    ConfiguredRouteEstimator configuredRouteEstimator(Integrations integrations, GraphHopperProperties environment,
                                                      StraightLineRouteEstimator straightLine, JsonMapper json) {
        return new ConfiguredRouteEstimator(integrations, environment, straightLine, json);
    }
}
