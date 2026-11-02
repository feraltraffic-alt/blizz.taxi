package taxi.blizz.telephony.internal;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.platform.Actor;

/**
 * Integrations with fixed values, for a provider that must not touch the shared ones: the same values for every
 * service, or each service's own ({@link #perService}, changeable while a test runs).
 */
class IntegrationsStub implements Integrations {

    private final Map<String, String> values;
    private final Map<UUID, Map<String, String>> services;

    IntegrationsStub(Map<String, String> values) {
        this.values = Map.copyOf(values);
        this.services = null;
    }

    private IntegrationsStub(Map<UUID, Map<String, String>> services, boolean perService) {
        this.values = Map.of();
        this.services = new java.util.concurrent.ConcurrentHashMap<>(services);
    }

    /** Each service's values; {@link #set} changes them while a test runs. */
    static IntegrationsStub perService(Map<UUID, Map<String, String>> services) {
        return new IntegrationsStub(services, true);
    }

    void set(UUID serviceId, Map<String, String> values) {
        services.put(serviceId, Map.copyOf(values));
    }

    @Override
    public Optional<String> value(UUID serviceId, String name) {
        if (services != null) {
            return Optional.ofNullable(services.getOrDefault(serviceId, Map.of()).get(name));
        }
        return Optional.ofNullable(values.get(name));
    }

    @Override
    public List<FieldState> list(Actor staff) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FieldState> change(Actor staff, UUID commandId, String password, List<Change> changes, String reason) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Health health(Actor staff) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Check check(Actor staff, String group) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long revision() {
        return 0;
    }

    @Override
    public void putSecret(Actor staff, String name, String value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<String> secretHint(UUID serviceId, String name) {
        return Optional.empty();
    }
}
