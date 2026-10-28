package taxi.blizz.platform.internal;

import java.time.Clock;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(OutboxProperties.class)
class PlatformConfiguration {

    /** Server time in UTC; tests may replace it. Deadlines never use the device clock. */
    /** Static: a bean factory post-processor runs before every other bean (REQ-ENG-13). */
    @Bean
    static ProductionSafetyCheck productionSafetyCheck() {
        return new ProductionSafetyCheck();
    }

    @Bean
    @ConditionalOnMissingBean
    Clock clock() {
        return Clock.systemUTC();
    }
}
