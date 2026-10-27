package taxi.blizz.geo.internal;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(AddressSearchProperties.class)
class GeoWebConfiguration {
}
