package taxi.blizz.platform.internal;

import java.util.List;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * Runs {@link ProductionSafety} before any bean is made, so a misconfigured production instance, or one started
 * without any profile, stops before it touches the database (Flyway) or a provider.
 */
class ProductionSafetyCheck implements BeanFactoryPostProcessor, EnvironmentAware {

    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        if (ProductionSafety.withoutProfile(environment)) {
            throw new IllegalStateException("No profile is active: start a real instance with "
                    + "SPRING_PROFILES_ACTIVE=prod, local development with dev (threat model O1)");
        }
        if (!ProductionSafety.production(environment)) {
            return;
        }
        List<String> problems = ProductionSafety.problems(environment);
        if (!problems.isEmpty()) {
            throw new IllegalStateException("This instance is not fit for production (REQ-ENG-13):\n  - "
                    + String.join("\n  - ", problems));
        }
    }
}
