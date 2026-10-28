package taxi.blizz.platform.internal;

import java.util.List;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * Runs {@link ProductionSafety} before any bean is made, so a misconfigured production instance stops before it
 * touches the database (Flyway) or a provider.
 */
class ProductionSafetyCheck implements BeanFactoryPostProcessor, EnvironmentAware {

    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
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
