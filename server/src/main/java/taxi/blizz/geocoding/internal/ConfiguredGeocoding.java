package taxi.blizz.geocoding.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import taxi.blizz.configuration.IntegrationCheck;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.geo.AddressBook;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.geocoding.Geocoding;
import tools.jackson.databind.json.JsonMapper;

/**
 * The provider chosen in the admin panel (Integrations, group geocoding), rebuilt when the panel changes; the
 * environment's choice otherwise. Own addresses come first; a provider's result with the same label as an own one is
 * dropped. A failing provider, a missing key or a spent budget leave the own addresses only — the address field never
 * fails because of the provider.
 */
@Service
@EnableConfigurationProperties(GeocodingProperties.class)
class ConfiguredGeocoding implements Geocoding, IntegrationCheck {

    private static final Logger log = LoggerFactory.getLogger(ConfiguredGeocoding.class);
    private static final double OWN_REVERSE_RADIUS_METRES = 100;

    private final Integrations integrations;
    private final GeocodingProperties environment;
    private final AddressBook addresses;
    private final JsonMapper json;
    private final Clock clock;
    private final GeocoderProvider.Transport transport;
    private final Map<UUID, Deque<Instant>> calls = new ConcurrentHashMap<>();

    private record Built(long revision, String provider, Optional<GeocoderProvider> adapter) {
    }

    private volatile Built built;

    @org.springframework.beans.factory.annotation.Autowired
    ConfiguredGeocoding(Integrations integrations, GeocodingProperties environment, AddressBook addresses,
                        JsonMapper json, Clock clock, taxi.blizz.platform.ProviderBreakers breakers) {
        this(integrations, environment, addresses, json, clock, new HttpTransport(environment.timeout(), breakers));
    }

    ConfiguredGeocoding(Integrations integrations, GeocodingProperties environment, AddressBook addresses,
                        JsonMapper json, Clock clock, GeocoderProvider.Transport transport) {
        this.integrations = integrations;
        this.environment = environment;
        this.addresses = addresses;
        this.json = json;
        this.clock = clock;
        this.transport = transport;
    }

    @Override
    public String provider() {
        return current().provider();
    }

    @Override
    public List<Place> search(UUID requesterId, UUID cityId, String query, String language, GeoPoint near,
                              int limit) {
        int max = Math.max(1, Math.min(limit, 20));
        String text = query == null ? "" : query.strip();
        List<Place> places = new ArrayList<>(addresses.search(cityId, text, language, near, max).stream()
                .map(ConfiguredGeocoding::own).toList());
        Built b = current();
        if (places.size() >= max || text.length() < 3 || b.adapter().isEmpty() || !spend(requesterId)) {
            return places;
        }
        Set<String> seen = new HashSet<>();
        places.forEach(p -> seen.add(key(p.label())));
        try {
            for (Place p : b.adapter().get().search(text, language, near, max)) {
                if (places.size() >= max) {
                    break;
                }
                if (seen.add(key(p.label()))) {
                    places.add(p);
                }
            }
        } catch (RuntimeException e) {
            log.warn("Address search by {} failed, own addresses only: {}", b.provider(), e.getMessage());
        }
        return places;
    }

    @Override
    public Optional<Place> reverse(UUID requesterId, UUID cityId, GeoPoint point, String language) {
        Optional<Place> own = addresses.nearest(cityId, point, OWN_REVERSE_RADIUS_METRES).map(ConfiguredGeocoding::own);
        if (own.isPresent()) {
            return own;
        }
        Built b = current();
        if (b.adapter().isEmpty() || !spend(requesterId)) {
            return Optional.empty();
        }
        try {
            return b.adapter().get().reverse(point, language);
        } catch (RuntimeException e) {
            log.warn("Reverse geocoding by {} failed: {}", b.provider(), e.getMessage());
            return Optional.empty();
        }
    }

    // ---------------------------------------------------------------- "check the connection"

    @Override
    public String group() {
        return Integrations.GEOCODING;
    }

    @Override
    public Integrations.Check check() {
        Built b = current();
        if (b.adapter().isEmpty()) {
            return new Integrations.Check(group(), !"GOOGLE".equals(b.provider()) && !"VISICOM".equals(b.provider()),
                    "BUILT_IN".equals(b.provider()) ? "Only the service's own addresses are searched"
                            : b.provider() + " has no key: only the service's own addresses are searched");
        }
        try {
            int found = b.adapter().get().search("Kyiv", "en", new GeoPoint(50.4501, 30.5234), 1).size();
            return new Integrations.Check(group(), true, b.provider() + " answered (" + found + " result)");
        } catch (RuntimeException e) {
            return new Integrations.Check(group(), false, e.getMessage());
        }
    }

    // ---------------------------------------------------------------- helpers

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
                built = build(revision);
            }
            return built;
        }
    }

    private Built build(long revision) {
        String provider = setting(Integrations.GEOCODING_PROVIDER).orElse(environment.provider())
                .toUpperCase(Locale.ROOT);
        Optional<GeocoderProvider> adapter = switch (provider) {
            case "GOOGLE" -> setting(Integrations.GEOCODING_GOOGLE_KEY).or(() -> nonBlank(environment.googleApiKey()))
                    .map(key -> new GoogleGeocoder(transport, json, key));
            case "VISICOM" -> setting(Integrations.GEOCODING_VISICOM_KEY)
                    .or(() -> nonBlank(environment.visicomApiKey()))
                    .map(key -> new VisicomGeocoder(transport, json, key));
            case "FAKE" -> Optional.of(new FakeGeocoder());
            default -> Optional.empty();
        };
        return new Built(revision, provider, adapter);
    }

    private Optional<String> setting(String name) {
        try {
            return integrations.value(name).filter(v -> !v.isBlank());
        } catch (RuntimeException e) {
            return Optional.empty(); // e.g. no master key: the environment's value
        }
    }

    /** One provider call of the requester within the per-minute budget of this instance. */
    private boolean spend(UUID requesterId) {
        if (requesterId == null) {
            return true;
        }
        Instant now = clock.instant();
        Deque<Instant> recent = calls.computeIfAbsent(requesterId, id -> new ArrayDeque<>());
        synchronized (recent) {
            while (!recent.isEmpty() && recent.peekFirst().isBefore(now.minus(Duration.ofMinutes(1)))) {
                recent.pollFirst();
            }
            if (recent.size() >= environment.callsPerMinute()) {
                return false;
            }
            recent.addLast(now);
            return true;
        }
    }

    private static Optional<String> nonBlank(String value) {
        return value == null || value.isBlank() ? Optional.empty() : Optional.of(value);
    }

    private static String key(String label) {
        return label == null ? "" : label.strip().toLowerCase(Locale.ROOT);
    }

    private static Place own(AddressBook.Address address) {
        AddressBook.Data d = address.data();
        String house = d.houseRaw() == null ? "" : d.houseRaw();
        if (d.building() != null && !d.building().isBlank()) {
            house = house.isBlank() ? d.building() : house + " корпус " + d.building();
        }
        return new Place("OWN", address.id(), d.label(), d.street() == null ? "" : d.street(), house, d.pickup(),
                d.instructions());
    }
}
