package taxi.blizz.configuration.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Pattern;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.SafetyContacts;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcSafetyContacts implements SafetyContacts {

    private static final Pattern EMERGENCY = Pattern.compile("^[0-9]{2,6}$");
    private static final int LABEL_MAX = 80;
    private static final int REASON_MAX = 500;
    private static final TypeReference<List<Extra>> EXTRAS = new TypeReference<>() {
    };

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final ServiceSettings settings;
    private final JsonMapper json;
    private final Clock clock;

    JdbcSafetyContacts(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                       ServiceSettings settings, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.settings = settings;
        this.json = json;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public View forCity(UUID cityId, String language) {
        if (cityId == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The city is required");
        }
        Version current = read(cityId, false);
        String fallback = settings.current().settings().languages().defaultLanguage();
        List<ExtraView> extra = current.extra().stream()
                .map(e -> new ExtraView(label(e.label(), language, fallback), e.phone())).toList();
        return new View(cityId, current.emergencyNumber(), current.supportPhone(), extra, NO_AUTO_DISPATCH);
    }

    @Override
    @Transactional(readOnly = true)
    public Version current(Actor actor, UUID cityId) {
        if (cityId == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The city is required");
        }
        staff.require(actor, MANAGE_PERMISSION, cityId);
        return read(cityId, false);
    }

    record ChangeRequest(UUID cityId, long expectedVersion, Contacts contacts, String reason) {
    }

    @Override
    public Version change(Actor actor, UUID commandId, UUID cityId, long expectedVersion, Contacts contacts,
                          String reason) {
        if (cityId == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The city is required");
        }
        staff.require(actor, MANAGE_PERMISSION, cityId);
        Contacts clean = validate(contacts);
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > REASON_MAX) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of at most 500 characters is required");
        }
        return commands.execute(new CommandKey(actor, "safety_contacts.change", commandId),
                new ChangeRequest(cityId, expectedVersion, clean, why), Version.class, () -> {
                    Version before = read(cityId, true);
                    if (before.version() != expectedVersion) {
                        throw new DomainException(ErrorCode.VERSION_CONFLICT, "The contacts changed: expected version "
                                + expectedVersion + ", current " + before.version());
                    }
                    OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
                    String extra = json.writeValueAsString(clean.extra());
                    if (before.version() == 0) {
                        try {
                            jdbc.sql("""
                                            insert into safety_contacts (city_id, emergency_number, support_phone,
                                                                         extra, version, changed_by, reason, changed_at)
                                            values (:city, :emergency, :support, cast(:extra as jsonb), 1, :by,
                                                    :reason, :now)""")
                                    .param("city", cityId).param("emergency", clean.emergencyNumber())
                                    .param("support", clean.supportPhone()).param("extra", extra)
                                    .param("by", actor.id()).param("reason", why).param("now", now).update();
                        } catch (DuplicateKeyException e) {
                            // Someone else configured the city at the same moment.
                            throw new DomainException(ErrorCode.VERSION_CONFLICT,
                                    "The contacts changed: expected version 0");
                        }
                    } else {
                        jdbc.sql("""
                                        update safety_contacts set emergency_number = :emergency,
                                               support_phone = :support, extra = cast(:extra as jsonb),
                                               version = version + 1, changed_by = :by, reason = :reason,
                                               changed_at = :now
                                        where city_id = :city""")
                                .param("city", cityId).param("emergency", clean.emergencyNumber())
                                .param("support", clean.supportPhone()).param("extra", extra)
                                .param("by", actor.id()).param("reason", why).param("now", now).update();
                    }
                    Version after = read(cityId, false);
                    audit.record(new AuditEntry(actor, "safety_contacts.change", "safety_contacts", cityId.toString(),
                            why, before, after));
                    return after;
                });
    }

    // ---------------------------------------------------------------- helpers

    /** The row of the city, or version 0 with the default; {@code lock} takes the row for the change. */
    private Version read(UUID cityId, boolean lock) {
        Optional<Version> row = jdbc.sql("""
                        select emergency_number, support_phone, extra::text as extra, version, changed_by, reason,
                               changed_at
                        from safety_contacts where city_id = :city""" + (lock ? " for update" : ""))
                .param("city", cityId)
                .query((rs, i) -> new Version(cityId, rs.getLong("version"), rs.getString("emergency_number"),
                        rs.getString("support_phone"), json.readValue(rs.getString("extra"), EXTRAS),
                        rs.getObject("changed_by", UUID.class), rs.getString("reason"),
                        rs.getObject("changed_at", OffsetDateTime.class)))
                .optional();
        return row.orElseGet(() -> new Version(cityId, 0, DEFAULT_EMERGENCY_NUMBER, null, List.of(), null, null,
                null));
    }

    private Contacts validate(Contacts contacts) {
        if (contacts == null) {
            throw invalid("The contacts are required");
        }
        String emergency = contacts.emergencyNumber() == null ? "" : contacts.emergencyNumber().strip();
        if (!EMERGENCY.matcher(emergency).matches()) {
            throw invalid("The emergency number has 2 to 6 digits, e.g. 112");
        }
        String support = contacts.supportPhone() == null || contacts.supportPhone().isBlank() ? null
                : PhoneNumber.parse(contacts.supportPhone()).e164();
        if (contacts.extra().size() > MAX_EXTRA) {
            throw invalid("At most " + MAX_EXTRA + " extra contacts");
        }
        String defaultLanguage = settings.current().settings().languages().defaultLanguage();
        List<Extra> extra = new ArrayList<>();
        for (Extra e : contacts.extra()) {
            if (e == null || e.phone() == null || e.phone().isBlank()) {
                throw invalid("Every extra contact has a phone");
            }
            Map<String, String> labels = new LinkedHashMap<>();
            for (Map.Entry<String, String> entry : e.label().entrySet()) {
                String language = entry.getKey() == null ? "" : entry.getKey().strip().toLowerCase(Locale.ROOT);
                if (!ServiceSettings.SUPPORTED_LANGUAGES.contains(language)) {
                    throw invalid("Unsupported language: " + entry.getKey());
                }
                String text = entry.getValue() == null ? "" : entry.getValue().strip();
                if (text.isEmpty()) {
                    continue;
                }
                if (text.length() > LABEL_MAX) {
                    throw invalid("A label has at most " + LABEL_MAX + " characters");
                }
                labels.put(language, text);
            }
            if (!labels.containsKey(defaultLanguage)) {
                throw invalid("Every extra contact needs a label in the default language (" + defaultLanguage + ")");
            }
            extra.add(new Extra(labels, PhoneNumber.parse(e.phone()).e164()));
        }
        return new Contacts(emergency, support, extra);
    }

    /** The label in the language asked for, else the service's default, else any one it has. */
    private static String label(Map<String, String> labels, String language, String fallback) {
        if (language != null && labels.containsKey(language)) {
            return labels.get(language);
        }
        if (labels.containsKey(fallback)) {
            return labels.get(fallback);
        }
        return labels.values().stream().findFirst().orElse("");
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }
}
