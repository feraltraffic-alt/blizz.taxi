package taxi.blizz.configuration.internal;

import java.net.URI;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Pattern;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.IntegrationCheck;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.identity.StaffSignIn;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import tools.jackson.databind.json.JsonMapper;

@Service
@EnableConfigurationProperties(SecretsProperties.class)
class JdbcIntegrations implements Integrations {

    /** Other instances see a change after at most this long. */
    static final Duration REFRESH = Duration.ofSeconds(5);
    static final int MAX_VALUE_LENGTH = 16_384;
    private static final Pattern NAME = Pattern.compile("^[a-z0-9][a-z0-9.-]{1,99}$");

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final StaffSignIn signIn;
    private final AuditLog audit;
    private final ObjectProvider<IntegrationCheck> checks;
    private final JsonMapper json;
    private final Clock clock;
    private final SecretCipher cipher;

    private record Row(String plain, byte[] secret, String hint, UUID changedBy, OffsetDateTime changedAt) {
    }

    private record Snapshot(long revision, Map<String, Row> rows, Instant loadedAt) {
    }

    private volatile Snapshot snapshot;

    JdbcIntegrations(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, StaffSignIn signIn,
                     AuditLog audit, ObjectProvider<IntegrationCheck> checks, JsonMapper json, Clock clock,
                     SecretsProperties properties) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.signIn = signIn;
        this.audit = audit;
        this.checks = checks;
        this.json = json;
        this.clock = clock;
        this.cipher = SecretCipher.of(properties.masterKey());
    }

    // ---- reading -----------------------------------------------------------------------------------------------

    private Snapshot snapshot() {
        Snapshot current = snapshot;
        if (current == null || current.loadedAt().plus(REFRESH).isBefore(clock.instant())) {
            current = load();
            snapshot = current;
        }
        return current;
    }

    private Snapshot load() {
        Map<String, Row> rows = new HashMap<>();
        long[] revision = {0};
        jdbc.sql("select name, plain_value, secret_value, hint, changed_by, changed_at, seq from integration_value")
                .query(rs -> {
                    rows.put(rs.getString(1), new Row(rs.getString(2), rs.getBytes(3), rs.getString(4),
                            rs.getObject(5, UUID.class), rs.getObject(6, OffsetDateTime.class)));
                    revision[0] = Math.max(revision[0], rs.getLong(7));
                });
        return new Snapshot(revision[0], Map.copyOf(rows), clock.instant());
    }

    @Override
    public Optional<String> value(String name) {
        Row row = snapshot().rows().get(name);
        if (row == null) {
            return Optional.empty();
        }
        if (row.plain() != null) {
            return Optional.of(row.plain());
        }
        if (row.secret() == null) {
            return Optional.empty();
        }
        if (cipher == null) {
            throw new IllegalStateException("A secret is stored for " + name + " but SECRETS_MASTER_KEY is not set");
        }
        return Optional.of(cipher.decrypt(name, row.secret()));
    }

    @Override
    public long revision() {
        return snapshot().revision();
    }

    @Override
    public Optional<String> secretHint(String name) {
        return Optional.ofNullable(snapshot().rows().get(name)).filter(r -> r.secret() != null).map(Row::hint);
    }

    @Override
    public List<FieldState> list(Actor actor) {
        staff.require(actor, MANAGE_PERMISSION);
        snapshot = load();
        return states(snapshot);
    }

    private List<FieldState> states(Snapshot snap) {
        List<FieldState> states = new ArrayList<>();
        for (Field field : FIELDS) {
            Row row = snap.rows().get(field.name());
            boolean set = row != null && (row.plain() != null || row.secret() != null);
            states.add(new FieldState(field.name(), field.group(), field.kind(), field.label(), field.description(),
                    field.forApps(), set, field.kind() == Kind.SECRET || row == null ? null : row.plain(),
                    set && field.kind() == Kind.SECRET ? row.hint() : null,
                    row == null ? null : row.changedBy(), row == null ? null : row.changedAt()));
        }
        return states;
    }

    // ---- changing ----------------------------------------------------------------------------------------------

    /** What the idempotency receipt keeps: names and fingerprints, never a secret in the clear. */
    record Request(List<String> names, String fingerprint, String reason) {
    }

    record Changed(List<FieldState> fields) {
    }

    @Override
    public List<FieldState> change(Actor actor, UUID commandId, String password, List<Change> changes,
                                   String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        if (changes == null || changes.isEmpty()) {
            throw invalid("Nothing to change");
        }
        if (reason == null || reason.isBlank()) {
            throw invalid("A reason is required");
        }
        Map<String, String> normalized = new LinkedHashMap<>();
        for (Change change : changes) {
            Field field = FIELDS.stream().filter(f -> f.name().equals(change.name())).findFirst()
                    .orElseThrow(() -> invalid("Unknown setting " + change.name()));
            if (normalized.containsKey(field.name())) {
                throw invalid(field.name() + " is given twice");
            }
            normalized.put(field.name(), validate(field, change.value()));
        }
        signIn.confirmPassword(actor, password);
        Request request = new Request(List.copyOf(normalized.keySet()), fingerprint(normalized), reason.strip());
        Changed changed = commands.execute(new CommandKey(actor, "integrations.change", commandId), request,
                Changed.class, () -> {
                    Map<String, Object> before = new LinkedHashMap<>();
                    Map<String, Object> after = new LinkedHashMap<>();
                    Map<String, Row> old = load().rows();
                    for (Map.Entry<String, String> e : normalized.entrySet()) {
                        Field field = FIELDS.stream().filter(f -> f.name().equals(e.getKey())).findFirst()
                                .orElseThrow();
                        before.put(e.getKey(), describe(field.kind(), old.get(e.getKey())));
                        store(actor, e.getKey(), field.kind() == Kind.SECRET, e.getValue());
                    }
                    Snapshot fresh = load();
                    for (String name : normalized.keySet()) {
                        Field field = FIELDS.stream().filter(f -> f.name().equals(name)).findFirst().orElseThrow();
                        after.put(name, describe(field.kind(), fresh.rows().get(name)));
                    }
                    audit.record(new AuditEntry(actor, "integrations.change", "integration_value",
                            String.join(",", normalized.keySet()), reason.strip(), before, after));
                    snapshot = fresh;
                    return new Changed(states(fresh));
                });
        snapshot = load();
        return changed.fields();
    }

    @Override
    public void putSecret(Actor actor, String name, String value) {
        if (name == null || !NAME.matcher(name).matches()) {
            throw invalid("Bad secret name");
        }
        if (value == null || value.isBlank() || value.length() > MAX_VALUE_LENGTH) {
            throw invalid("The secret is required (at most " + MAX_VALUE_LENGTH + " characters)");
        }
        Row old = load().rows().get(name);
        store(actor, name, true, value.strip());
        audit.record(new AuditEntry(actor, "integrations.putSecret", "integration_value", name, null,
                describe(Kind.SECRET, old), describe(Kind.SECRET, load().rows().get(name))));
        snapshot = null;
    }

    private void store(Actor actor, String name, boolean secret, String value) {
        byte[] sealed = null;
        String plain = null;
        String hint = null;
        if (value != null) {
            if (secret) {
                if (cipher == null) {
                    throw new DomainException(ErrorCode.STATE_CONFLICT,
                            "Secrets cannot be stored: the server has no SECRETS_MASTER_KEY");
                }
                sealed = cipher.encrypt(name, value);
                hint = hint(value);
            } else {
                plain = value;
            }
        }
        jdbc.sql("""
                        insert into integration_value (name, plain_value, secret_value, key_version, hint, seq,
                                                       changed_by, changed_at)
                        values (:name, :plain, :secret, :keyVersion, :hint, nextval('integration_value_seq'), :by, :now)
                        on conflict (name) do update set plain_value = excluded.plain_value,
                            secret_value = excluded.secret_value, key_version = excluded.key_version,
                            hint = excluded.hint, seq = excluded.seq, changed_by = excluded.changed_by,
                            changed_at = excluded.changed_at""")
                .param("name", name).param("plain", plain).param("secret", sealed)
                .param("keyVersion", sealed == null ? null : SecretCipher.KEY_VERSION).param("hint", hint)
                .param("by", actor.id()).param("now", now()).update();
    }

    /** For the audit: whether set and, for a secret, only its last characters. */
    private static Map<String, Object> describe(Kind kind, Row row) {
        Map<String, Object> d = new LinkedHashMap<>();
        boolean set = row != null && (row.plain() != null || row.secret() != null);
        d.put("set", set);
        if (set) {
            d.put(kind == Kind.SECRET ? "hint" : "value", kind == Kind.SECRET ? row.hint() : row.plain());
        }
        return d;
    }

    /** The last four characters other than whitespace and JSON punctuation; nothing for a short value. */
    static String hint(String value) {
        String visible = value.replaceAll("[\\s\"{}\\[\\],:]", "");
        return visible.length() < 12 ? "…" : "…" + visible.substring(visible.length() - 4);
    }

    private String validate(Field field, String raw) {
        if (raw == null || raw.isBlank()) {
            return null; // removal
        }
        String value = raw.strip();
        if (value.length() > MAX_VALUE_LENGTH) {
            throw invalid(field.name() + " is too long");
        }
        switch (field.name()) {
            case GRAPHHOPPER_ENABLED -> {
                value = value.toLowerCase(Locale.ROOT);
                if (!value.equals("true") && !value.equals("false")) {
                    throw invalid(field.name() + " must be true or false");
                }
            }
            case GRAPHHOPPER_BASE_URL -> {
                try {
                    URI uri = URI.create(value);
                    if (!("https".equals(uri.getScheme()) || "http".equals(uri.getScheme())) || uri.getHost() == null) {
                        throw invalid(field.name() + " must be an http(s) address");
                    }
                } catch (IllegalArgumentException e) {
                    throw invalid(field.name() + " must be an http(s) address");
                }
            }
            case MAPS_PROVIDER -> {
                value = value.toUpperCase(Locale.ROOT);
                if (!MAP_PROVIDERS.contains(value)) {
                    throw invalid(field.name() + " must be one of " + MAP_PROVIDERS);
                }
            }
            case GEOCODING_PROVIDER -> {
                value = value.toUpperCase(Locale.ROOT);
                if (!GEOCODING_PROVIDERS.contains(value)) {
                    throw invalid(field.name() + " must be one of " + GEOCODING_PROVIDERS);
                }
            }
            case OTP_CHANNEL -> {
                value = value.toUpperCase(Locale.ROOT);
                if (!OTP_CHANNELS.contains(value)) {
                    throw invalid(field.name() + " must be one of " + OTP_CHANNELS);
                }
            }
            case OTP_FALLBACK -> {
                value = value.toUpperCase(Locale.ROOT);
                if (!OTP_FALLBACKS.contains(value)) {
                    throw invalid(field.name() + " must be one of " + OTP_FALLBACKS);
                }
            }
            case OTP_TURBOSMS_SENDER -> {
                if (value.length() > 25) {
                    throw invalid(field.name() + " has at most 25 characters");
                }
            }
            case OTP_ASTERISK_ARI_URL -> {
                try {
                    URI uri = URI.create(value);
                    if (!("https".equals(uri.getScheme()) || "http".equals(uri.getScheme())) || uri.getHost() == null) {
                        throw invalid(field.name() + " must be an http(s) address");
                    }
                } catch (IllegalArgumentException e) {
                    throw invalid(field.name() + " must be an http(s) address");
                }
            }
            case OTP_ASTERISK_ENDPOINT -> {
                if (!value.contains("{phone}")) {
                    throw invalid(field.name() + " must contain {phone} where the number goes");
                }
            }
            case FCM_CREDENTIALS -> {
                Map<?, ?> account;
                try {
                    account = json.readValue(value, Map.class);
                } catch (RuntimeException e) {
                    throw invalid("The service account key must be the JSON file from Firebase");
                }
                if (!(account.get("client_email") instanceof String) || !(account.get("private_key") instanceof String
                        pk) || !pk.contains("PRIVATE KEY")) {
                    throw invalid("The JSON has no client_email or private_key: is it a service account key?");
                }
            }
            case FCM_PROJECT_ID, GRAPHHOPPER_PROFILE -> {
                if (!value.matches("^[A-Za-z0-9_.-]{1,100}$")) {
                    throw invalid(field.name() + " may contain letters, digits, _ . and - only");
                }
            }
            default -> {
                if (value.chars().anyMatch(Character::isISOControl)) {
                    throw invalid(field.name() + " must be one line");
                }
            }
        }
        return value;
    }

    private static String fingerprint(Map<String, String> values) {
        try {
            java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
            values.forEach((k, v) -> digest.update((k + "=" + (v == null ? "" : v) + "\n")
                    .getBytes(java.nio.charset.StandardCharsets.UTF_8)));
            return java.util.HexFormat.of().formatHex(digest.digest());
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    // ---- checking ----------------------------------------------------------------------------------------------

    @Override
    public Check check(Actor actor, String group) {
        staff.require(actor, MANAGE_PERMISSION);
        snapshot = load();
        IntegrationCheck check = checks.orderedStream().filter(c -> c.group().equals(group)).findFirst()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Nothing to check for " + group));
        try {
            return check.check();
        } catch (RuntimeException e) {
            return new Check(group, false, "Failed: " + e.getClass().getSimpleName());
        }
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
