package taxi.blizz.identity.internal;

import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import taxi.blizz.identity.SessionService;

@Configuration(proxyBeanMethods = false)
class AuthWebConfiguration implements WebMvcConfigurer {

    private final SessionService sessions;

    AuthWebConfiguration(SessionService sessions) {
        this.sessions = sessions;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new BearerAuthenticationInterceptor(sessions)).addPathPatterns("/api/**");
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new AccessClaimsArgumentResolver());
    }
}
