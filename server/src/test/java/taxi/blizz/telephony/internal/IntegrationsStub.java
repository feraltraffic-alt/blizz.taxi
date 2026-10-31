package taxi.blizz.telephony.internal;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.platform.Actor;

/** Integrations with fixed values, for a provider that must not touch the shared ones; nothing else works. */
class IntegrationsStub implements Integrations {

    private final Map<String, String> values;

    IntegrationsStub(Map<String, String> values) {
        this.values = Map.copyOf(values);
    }

    @Override
    public Optional<String> value(String name) {
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
    public Optional<String> secretHint(String name) {
        return Optional.empty();
    }
}
