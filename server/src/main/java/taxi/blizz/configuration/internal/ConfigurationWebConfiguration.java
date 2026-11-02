package taxi.blizz.configuration.internal;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import taxi.blizz.configuration.ServiceSettings;

@Configuration(proxyBeanMethods = false)
class ConfigurationWebConfiguration implements WebMvcConfigurer {

    private final ServiceSettings settings;

    ConfigurationWebConfiguration(ServiceSettings settings) {
        this.settings = settings;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // After the bearer check, so the policy is the one of the caller's taxi service (ADR 0016).
        registry.addInterceptor(new AppVersionInterceptor(settings)).addPathPatterns("/api/**").order(100);
    }
}
