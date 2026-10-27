package taxi.blizz.pricing.internal;

import java.util.Optional;
import taxi.blizz.configuration.IntegrationCheck;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.pricing.RouteEstimator;
import tools.jackson.databind.json.JsonMapper;

/**
 * The route estimate with the settings in force: GraphHopper when it is on in the admin panel (or, without a value
 * there, in the environment), the straight line otherwise. Rebuilt when the settings change, without a restart.
 */
class ConfiguredRouteEstimator implements RouteEstimator, IntegrationCheck {

    private final Integrations integrations;
    private final GraphHopperProperties environment;
    private final RouteEstimator straightLine;
    private final JsonMapper json;

    private record Built(long revision, GraphHopperProperties properties, GraphHopperRouteEstimator graphHopper) {
    }

    private volatile Built built;

    ConfiguredRouteEstimator(Integrations integrations, GraphHopperProperties environment,
                             RouteEstimator straightLine, JsonMapper json) {
        this.integrations = integrations;
        this.environment = environment;
        this.straightLine = straightLine;
        this.json = json;
    }

    private Built current() {
        long revision;
        try {
            revision = integrations.revision();
        } catch (RuntimeException e) {
            revision = -1;
        }
        Built b = built;
        if (b != null && b.revision() == revision) {
            return b;
        }
        synchronized (this) {
            if (built == null || built.revision() != revision) {
                GraphHopperProperties p = properties();
                built = new Built(revision, p, new GraphHopperRouteEstimator(p, straightLine, json));
            }
            return built;
        }
    }

    GraphHopperProperties properties() {
        boolean enabled = setting(Integrations.GRAPHHOPPER_ENABLED).map(Boolean::parseBoolean)
                .orElse(environment.enabled());
        return new GraphHopperProperties(enabled,
                setting(Integrations.GRAPHHOPPER_BASE_URL).orElse(environment.baseUrl()),
                setting(Integrations.GRAPHHOPPER_API_KEY).orElse(environment.apiKey()),
                setting(Integrations.GRAPHHOPPER_PROFILE).orElse(environment.profile()),
                environment.timeout());
    }

    private Optional<String> setting(String name) {
        try {
            return integrations.value(name).filter(v -> !v.isBlank());
        } catch (RuntimeException e) {
            return Optional.empty(); // e.g. no master key: the environment's value
        }
    }

    @Override
    public Estimate estimate(GeoPoint pickup, GeoPoint dropOff) {
        Built b = current();
        return b.properties().enabled() ? b.graphHopper().estimate(pickup, dropOff)
                : straightLine.estimate(pickup, dropOff);
    }

    @Override
    public String group() {
        return Integrations.ROUTING;
    }

    @Override
    public Integrations.Check check() {
        Built b = current();
        Integrations.Check check = b.graphHopper().check();
        return b.properties().enabled() ? check : new Integrations.Check(check.group(), check.ok(),
                check.message() + " (switched off: prices use the straight line)");
    }
}
