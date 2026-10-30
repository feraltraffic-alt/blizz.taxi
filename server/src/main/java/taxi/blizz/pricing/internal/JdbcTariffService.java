package taxi.blizz.pricing.internal;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Currency;
import java.util.UUID;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.geo.GeoZones;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.pricing.TariffService;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcTariffService implements TariffService {
    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final Clock clock;
    private final GeoZones zones;
    private final JsonMapper json;

    JdbcTariffService(JdbcClient jdbc, IdempotentCommands commands, AuditLog audit, Clock clock, StaffAccess staff,
                      GeoZones zones, JsonMapper json) {
        this.zones = zones;
        this.json = json;
        this.staff = staff;
        this.jdbc = jdbc;
        this.commands = commands;
        this.audit = audit;
        this.clock = clock;
    }

    @Override
    public Revision createVehicleClass(VehicleClassDraft c) {
        return commands.execute(key(c.actor(), "vehicleClass.create", c.commandId(), c.cityId()), c, Revision.class, () -> {
            initial(c.expectedVersion());
            text(c.code());
            text(c.name());
            if (c.cityId() == null || !jdbc.sql("select exists(select 1 from city where id = :id)")
                    .param("id", c.cityId()).query(Boolean.class).single()) {
                throw error(ErrorCode.NOT_FOUND, "City not found");
            }
            UUID id = UUID.randomUUID();
            try {
                jdbc.sql("""
                        insert into vehicle_class(id, city_id, code, name, created_at, updated_at)
                        values (:id, :city, :code, :name, :now, :now)
                        """).param("id", id).param("city", c.cityId()).param("code", c.code()).param("name", c.name())
                        .param("now", now()).update();
            } catch (DuplicateKeyException duplicate) {
                throw error(ErrorCode.STATE_CONFLICT, "Vehicle class code already exists in this city");
            }
            Revision result = new Revision(id, "ACTIVE", 0);
            audit.record(new AuditEntry(c.actor(), "vehicleClass.create", "vehicle_class", id.toString(),
                    c.reason(), null, c));
            return result;
        });
    }

    @Override
    public Revision createDraft(Draft c) {
        return commands.execute(key(c.actor(), "tariff.createDraft", c.commandId(), c.cityId()), c, Revision.class, () -> {
            initial(c.expectedVersion());
            validate(c);
            validateZones(c);
            validatePreorder(c);
            String currency = lockClass(c.classId(), c.cityId());
            if (!currency.equals(c.currency())) {
                throw error(ErrorCode.VALIDATION_FAILED, "Tariff currency must match its city");
            }
            UUID id = UUID.randomUUID();
            Terms t = c.terms();
            jdbc.sql("""
                    insert into tariff_version(id, city_id, class_id, currency, effective_from, effective_to,
                        state, pickup_minor, per_km_minor, per_minute_minor, minimum_minor, free_waiting_minutes,
                        waiting_per_minute_minor, cancellation_fee_minor, commission_rate, waiting_step_seconds,
                        waiting_rounding, pickup_outside_minor, per_km_outside_minor, zone_surcharges,
                        preorder_surcharge, created_at, updated_at)
                    values (:id, :city, :class, :currency, :from, :to, 'DRAFT', :pickup, :km, :minute, :minimum,
                        :free, :waiting, :cancellation, :commission, :step, :rounding, :pickupOutside, :kmOutside,
                        cast(:zones as jsonb), cast(:preorder as jsonb), :now, :now)
                    """).param("id", id).param("city", c.cityId()).param("class", c.classId())
                    .param("currency", c.currency()).param("from", at(c.effectiveFrom()))
                    .param("to", at(c.effectiveTo())).param("pickup", t.pickupMinor()).param("km", t.perKmMinor())
                    .param("minute", t.perMinuteMinor()).param("minimum", t.minimumMinor())
                    .param("free", t.freeWaitingMinutes()).param("waiting", t.waitingPerMinuteMinor())
                    .param("cancellation", t.cancellationFeeMinor()).param("commission", t.commissionRate())
                    .param("step", t.waitingStepSeconds()).param("rounding", t.waitingRounding().name())
                    .param("pickupOutside", t.pickupOutsideMinor()).param("kmOutside", t.perKmOutsideMinor())
                    .param("zones", json.writeValueAsString(t.zoneSurcharges()))
                    .param("preorder", t.preorderSurcharge() == null ? null : json.writeValueAsString(t.preorderSurcharge()))
                    .param("now", now()).update();
            audit.record(new AuditEntry(c.actor(), "tariff.createDraft", "tariff_version", id.toString(),
                    c.reason(), null, c));
            return new Revision(id, "DRAFT", 0);
        });
    }

    @Override
    public Revision publish(Change c) {
        return transition(c, true);
    }

    @Override
    public Revision archive(Change c) {
        return transition(c, false);
    }

    private Revision transition(Change c, boolean publish) {
        String action = publish ? "tariff.publish" : "tariff.archive";
        return commands.execute(key(c.actor(), action, c.commandId(), tariffCity(c.id())), c, Revision.class, () -> {
            record ClassRef(UUID id, UUID cityId) {
            }
            ClassRef ref = jdbc.sql("select class_id, city_id from tariff_version where id = :id")
                    .param("id", c.id()).query((rs, n) -> new ClassRef(rs.getObject(1, UUID.class),
                            rs.getObject(2, UUID.class))).optional()
                    .orElseThrow(() -> error(ErrorCode.NOT_FOUND, "Tariff not found"));
            // Fixed order: vehicle_class before tariff, on both publication and archival paths.
            lockClass(ref.id(), ref.cityId());
            Revision before = jdbc.sql("select id, state, version from tariff_version where id = :id for update")
                    .param("id", c.id()).query((rs, n) -> new Revision(rs.getObject(1, UUID.class),
                            rs.getString(2), rs.getLong(3))).single();
            if (before.version() != c.expectedVersion()) {
                throw ConflictException.version(before.version(), "Stale tariff version");
            }
            if (!(publish ? "DRAFT" : "PUBLISHED").equals(before.state())) {
                throw error(ErrorCode.STATE_CONFLICT, "Tariff cannot make this transition");
            }
            if (publish && jdbc.sql("""
                    select exists(select 1 from tariff_version candidate join tariff_version other
                    on other.id <> candidate.id and other.city_id = candidate.city_id
                    and other.class_id = candidate.class_id and other.state = 'PUBLISHED'
                    and tstzrange(other.effective_from, other.effective_to, '[)')
                        && tstzrange(candidate.effective_from, candidate.effective_to, '[)')
                    where candidate.id = :id)
                    """).param("id", c.id()).query(Boolean.class).single()) {
                throw error(ErrorCode.STATE_CONFLICT, "Published tariff ranges overlap");
            }
            Revision after = new Revision(before.id(), publish ? "PUBLISHED" : "ARCHIVED", before.version() + 1);
            jdbc.sql("update tariff_version set state = :state, version = :version, updated_at = :now where id = :id")
                    .param("id", c.id()).param("state", after.state()).param("version", after.version())
                    .param("now", now()).update();
            audit.record(new AuditEntry(c.actor(), action, "tariff_version", c.id().toString(),
                    c.reason(), before, after));
            return after;
        });
    }

    private UUID tariffCity(UUID tariffId) {
        return tariffId == null ? null : jdbc.sql("select city_id from tariff_version where id = :id")
                .param("id", tariffId).query(UUID.class).optional().orElse(null);
    }

    private String lockClass(UUID classId, UUID cityId) {
        return jdbc.sql("""
                select city.currency from vehicle_class join city on city.id = vehicle_class.city_id
                where vehicle_class.id = :id and vehicle_class.city_id = :city and vehicle_class.active
                for update of vehicle_class
                """).param("id", classId).param("city", cityId).query(String.class).optional()
                .orElseThrow(() -> error(ErrorCode.NOT_FOUND, "Active vehicle class not found in city"));
    }

    /** pricing.manage for the city the class or tariff belongs to, before idempotency. */
    private CommandKey key(Actor actor, String action, UUID commandId, UUID cityId) {
        staff.require(actor, MANAGE_PERMISSION, cityId);
        if (commandId == null) {
            throw error(ErrorCode.VALIDATION_FAILED, "command_id required");
        }
        return new CommandKey(actor, action, commandId);
    }

    /** Zone surcharges name published-or-draft zones of the tariff's city, never the city limits themselves. */
    private static void validatePreorder(Draft c) {
        TariffService.PreorderSurcharge p = c.terms().preorderSurcharge();
        if (p == null) {
            return;
        }
        boolean ok = p.mode() == TariffService.SurchargeMode.FIXED ? p.amountMinor() > 0
                : p.mode() == TariffService.SurchargeMode.COEFFICIENT && p.coefficient() != null
                        && p.coefficient().compareTo(BigDecimal.ONE) >= 0 && p.coefficient().compareTo(BigDecimal.TEN) <= 0;
        if (!ok) {
            throw error(ErrorCode.VALIDATION_FAILED, "A pre-order surcharge is a positive amount or a coefficient 1..10");
        }
    }

    private void validateZones(Draft c) {
        java.util.Set<UUID> seen = new java.util.HashSet<>();
        for (TariffService.ZoneSurcharge z : c.terms().zoneSurcharges()) {
            if (z == null || z.zoneId() == null || z.mode() == null || !seen.add(z.zoneId())
                    || (!z.onPickup() && !z.onDropoff())) {
                throw error(ErrorCode.VALIDATION_FAILED, "Each zone surcharge names one zone once and when it applies");
            }
            if (z.mode() == TariffService.SurchargeMode.FIXED && z.amountMinor() <= 0) {
                throw error(ErrorCode.VALIDATION_FAILED, "A fixed zone surcharge is a positive amount");
            }
            if (z.mode() == TariffService.SurchargeMode.COEFFICIENT && (z.coefficient() == null
                    || z.coefficient().compareTo(BigDecimal.ONE) < 0 || z.coefficient().compareTo(BigDecimal.TEN) > 0)) {
                throw error(ErrorCode.VALIDATION_FAILED, "A zone coefficient is from 1 to 10");
            }
            GeoZones.ZoneRef zone = zones.zone(z.zoneId())
                    .orElseThrow(() -> error(ErrorCode.VALIDATION_FAILED, "Unknown zone " + z.zoneId()));
            if (!zone.cityId().equals(c.cityId()) || GeoZones.CITY_LIMITS.equals(zone.type())
                    || "ARCHIVED".equals(zone.state())) {
                throw error(ErrorCode.VALIDATION_FAILED, "Zone " + z.zoneId() + " cannot carry a surcharge here");
            }
        }
    }

    private static void validate(Draft c) {
        Terms t = c.terms();
        if (c.cityId() == null || c.classId() == null || c.effectiveFrom() == null
                || (c.effectiveTo() != null && !c.effectiveTo().isAfter(c.effectiveFrom()))
                || t == null || t.pickupMinor() < 0 || t.minimumMinor() < 0 || t.freeWaitingMinutes() < 0
                || t.cancellationFeeMinor() < 0 || negative(t.perKmMinor()) || negative(t.perMinuteMinor())
                || negative(t.waitingPerMinuteMinor()) || negative(t.commissionRate())
                || t.commissionRate().compareTo(BigDecimal.ONE) > 0
                || t.waitingStepSeconds() < 1 || t.waitingStepSeconds() > 3600 || t.waitingRounding() == null
                || t.pickupOutsideMinor() < 0 || negative(t.perKmOutsideMinor())) {
            throw error(ErrorCode.VALIDATION_FAILED, "Invalid tariff terms or effective range");
        }
        try {
            Currency.getInstance(c.currency());
        } catch (IllegalArgumentException | NullPointerException invalid) {
            throw error(ErrorCode.VALIDATION_FAILED, "Invalid ISO currency");
        }
    }

    private static boolean negative(BigDecimal value) {
        return value == null || value.signum() < 0;
    }

    private static void initial(long version) {
        if (version != 0) {
            throw error(ErrorCode.VERSION_CONFLICT, "New objects require expected_version 0");
        }
    }

    private static void text(String text) {
        if (text == null || text.isBlank()) {
            throw error(ErrorCode.VALIDATION_FAILED, "Required field is blank");
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    private static OffsetDateTime at(Instant instant) {
        return instant == null ? null : instant.atOffset(ZoneOffset.UTC);
    }

    private static DomainException error(ErrorCode code, String message) {
        return new DomainException(code, message);
    }
}
