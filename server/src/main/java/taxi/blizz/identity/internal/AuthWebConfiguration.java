package taxi.blizz.identity.internal;

import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.configuration.internal.AppVersionInterceptor;
import taxi.blizz.identity.SessionService;

@Configuration(proxyBeanMethods = false)
class AuthWebConfiguration implements WebMvcConfigurer {

    private final SessionService sessions;
    private final StaffActivityLog activity;
    private final ServiceSettings settings;

    AuthWebConfiguration(SessionService sessions, StaffActivityLog activity, ServiceSettings settings) {
        this.sessions = sessions;
        this.activity = activity;
        this.settings = settings;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // First, so that requests refused by the bearer check are logged too.
        registry.addInterceptor(new StaffActivityInterceptor(activity))
                .addPathPatterns("/api/admin/**", "/api/operator/**");
        // /api/config/v1 is public start-up data of the apps (brand, languages, cities): no token.
        registry.addInterceptor(new BearerAuthenticationInterceptor(sessions)).addPathPatterns("/api/**")
                .excludePathPatterns("/api/config/**");
        registry.addInterceptor(new AppVersionInterceptor(settings)).addPathPatterns("/api/**");
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new AccessClaimsArgumentResolver());
    }
}
