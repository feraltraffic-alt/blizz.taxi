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
    /** The hosted API: where a service that set no address of its own would route, once it turns routing on. */
    private static final String HOSTED = "https://graphhopper.com/api/1";

    /** {@code fromPanel}: the address was typed in the admin panel, not set by the deployment. */
    private record Built(long revision, GraphHopperProperties properties, boolean fromPanel,
                         GraphHopperRouteEstimator graphHopper) {
    }

    /** By service: each service routes with its own settings (ADR 0016). */
    private final java.util.concurrent.ConcurrentHashMap<java.util.UUID, Built> built =
            new java.util.concurrent.ConcurrentHashMap<>();

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

    private Built current(java.util.UUID service) {
        long revision;
        try {
            revision = integrations.revision();
        } catch (RuntimeException e) {
            revision = -1;
        }
        Built b = built.get(service);
        if (b != null && b.revision() == revision) {
            return b;
        }
        long seen = revision;
        return built.compute(service, (key, old) -> {
            if (old != null && old.revision() == seen) {
                return old;
            }
            GraphHopperProperties p = properties(key);
            boolean fromPanel = setting(key, Integrations.GRAPHHOPPER_BASE_URL).isPresent();
            return new Built(seen, p, fromPanel, new GraphHopperRouteEstimator(p, straightLine, json, breakers));
        });
    }

    /** The service's own values; the environment's stand in for the first service only (ADR 0016). */
    GraphHopperProperties properties(java.util.UUID service) {
        boolean env = Integrations.environmentServes(service);
        boolean enabled = setting(service, Integrations.GRAPHHOPPER_ENABLED).map(Boolean::parseBoolean)
                .orElse(env && environment.enabled());
        return new GraphHopperProperties(enabled,
                setting(service, Integrations.GRAPHHOPPER_BASE_URL).orElse(env ? environment.baseUrl() : HOSTED),
                setting(service, Integrations.GRAPHHOPPER_API_KEY).orElse(env ? environment.apiKey() : null),
                setting(service, Integrations.GRAPHHOPPER_PROFILE).orElse(environment.profile()),
                environment.timeout());
    }

    private Optional<String> setting(java.util.UUID service, String name) {
        try {
            return integrations.value(service, name).filter(v -> !v.isBlank());
        } catch (RuntimeException e) {
            return Optional.empty(); // e.g. no master key: the environment's value
        }
    }

    /** No service named: the straight line, never one service's router or key. */
    @Override
    public Estimate estimate(GeoPoint pickup, GeoPoint dropOff) {
        return straightLine.estimate(pickup, dropOff);
    }

    @Override
    public Estimate estimate(java.util.UUID serviceId, GeoPoint pickup, GeoPoint dropOff) {
        if (serviceId == null) {
            return straightLine.estimate(pickup, dropOff);
        }
        Built b = current(serviceId);
        return b.properties().enabled() && addressStillAllowed(b) ? b.graphHopper().estimate(pickup, dropOff)
                : straightLine.estimate(pickup, dropOff);
    }

    @Override
    public Optional<Estimate> road(java.util.UUID serviceId, GeoPoint from, GeoPoint to) {
        if (serviceId == null) {
            return Optional.empty();
        }
        Built b = current(serviceId);
        return b.properties().enabled() && addressStillAllowed(b) ? b.graphHopper().road(from, to) : Optional.empty();
    }

    @Override
    public Estimate straightLine(long straightMetres) {
        return straightLine.straightLine(straightMetres);
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
    public Integrations.Check check(java.util.UUID serviceId) {
        Built b = current(serviceId);
        Integrations.Check check = b.graphHopper().check();
        return b.properties().enabled() ? check : new Integrations.Check(check.group(), check.ok(),
                check.message() + " (switched off: prices use the straight line)");
    }
}
