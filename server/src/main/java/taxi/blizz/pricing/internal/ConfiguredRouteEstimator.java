package taxi.blizz.pricing.internal;

import java.util.Optional;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import taxi.blizz.configuration.IntegrationCheck;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.OutboundAddresses;
import taxi.blizz.pricing.RouteEstimator;
import tools.jackson.databind.json.JsonMapper;

/**
 * The route estimate with the settings in force: GraphHopper when it is on in the admin panel (or, without a value
 * there, in the environment), the straight line otherwise. Rebuilt when the settings change, without a restart.
 *
 * <p>An address typed in the admin panel is checked again before every request (REQ-SEC-05, audit 29.10.2026): the
 * host's DNS answer may turn private after the settings were saved. A refused address prices by the straight line.
 * The JVM keeps a DNS answer for a while, so the check and the connection right after it see the same one.
 */
class ConfiguredRouteEstimator implements RouteEstimator, IntegrationCheck {

    private final Integrations integrations;
    private final GraphHopperProperties environment;
    private final RouteEstimator straightLine;
    private final JsonMapper json;
    private final taxi.blizz.platform.ProviderBreakers breakers;
    private final OutboundAddresses addresses;

    private static final Logger log = LoggerFactory.getLogger(ConfiguredRouteEstimator.class);
    private static final Set<String> SCHEMES = Set.of("http", "https");

    /** {@code fromPanel}: the address was typed in the admin panel, not set by the deployment. */
    private record Built(long revision, GraphHopperProperties properties, boolean fromPanel,
                         GraphHopperRouteEstimator graphHopper) {
    }

    private volatile Built built;

    ConfiguredRouteEstimator(Integrations integrations, GraphHopperProperties environment,
                             RouteEstimator straightLine, JsonMapper json,
                             taxi.blizz.platform.ProviderBreakers breakers, OutboundAddresses addresses) {
        this.breakers = breakers;
        this.addresses = addresses;
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
                boolean fromPanel = setting(Integrations.GRAPHHOPPER_BASE_URL).isPresent();
                built = new Built(revision, p, fromPanel,
                        new GraphHopperRouteEstimator(p, straightLine, json, breakers));
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
        return b.properties().enabled() && addressStillAllowed(b) ? b.graphHopper().estimate(pickup, dropOff)
                : straightLine.estimate(pickup, dropOff);
    }

    private boolean addressStillAllowed(Built b) {
        if (!b.fromPanel()) {
            return true;
        }
        try {
            addresses.check(b.properties().baseUrl(), SCHEMES);
            return true;
        } catch (DomainException e) {
            log.warn("The routing address is not used: {}", e.getMessage());
            return false;
        }
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
