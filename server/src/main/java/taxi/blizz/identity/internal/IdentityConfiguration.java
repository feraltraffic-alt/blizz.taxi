package taxi.blizz.identity.internal;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties({OtpProperties.class, AuthProperties.class})
class IdentityConfiguration {
}
