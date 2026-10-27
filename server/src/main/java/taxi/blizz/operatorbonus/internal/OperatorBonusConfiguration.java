package taxi.blizz.operatorbonus.internal;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/** The reset worker runs on a timer. */
@Configuration(proxyBeanMethods = false)
@EnableScheduling
class OperatorBonusConfiguration {
}
