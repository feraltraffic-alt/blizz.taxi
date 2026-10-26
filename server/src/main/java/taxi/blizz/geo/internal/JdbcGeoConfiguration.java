package taxi.blizz.geo.internal;

import java.sql.SQLException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZoneId;
import java.util.Currency;
import java.util.UUID;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.geo.GeoConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcGeoConfiguration implements GeoConfiguration {
    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final Clock clock;

    JdbcGeoConfiguration(JdbcClient jdbc, IdempotentCommands commands, AuditLog audit, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.audit = audit;
        this.clock = clock;
    }

    @Override
    public Revision createCityDraft(CityDraft c) {
        return commands.execute(key(c.actor(), "city.createDraft", c.commandId()), c, Revision.class, () -> {
            initialVersion(c.expectedVersion());
            text(c.code()); text(c.name());
            try {
                if (c.currency() == null || !c.currency().matches("[A-Z]{3}")) throw new IllegalArgumentException();
                Currency.getInstance(c.currency());
                if (!ZoneId.getAvailableZoneIds().contains(c.timezone())) throw new IllegalArgumentException();
            } catch (IllegalArgumentException | NullPointerException invalid) {
                throw error(ErrorCode.VALIDATION_FAILED, "Invalid currency or IANA timezone");
            }
            polygon(c.polygonEwkt());
            UUID id = UUID.randomUUID();
            try {
                jdbc.sql("""
                        insert into city(id, code, name, currency, timezone, polygon, priority, state, version,
                                         created_at, updated_at)
                        values (:id, :code, :name, :currency, :timezone, ST_GeomFromEWKT(:polygon), :priority,
                                'DRAFT', 0, :now, :now)
                        """).param("id", id).param("code", c.code()).param("name", c.name())
                        .param("currency", c.currency()).param("timezone", c.timezone())
                        .param("polygon", c.polygonEwkt()).param("priority", c.priority()).param("now", now()).update();
            } catch (DuplicateKeyException duplicate) {
                throw error(ErrorCode.STATE_CONFLICT, "City code already exists");
            }
            audit.record(new AuditEntry(c.actor(), "city.createDraft", "city", id.toString(), c.reason(), null, c));
            return new Revision(id, "DRAFT", 0);
        });
    }

    @Override
    public Revision createZoneDraft(ZoneDraft c) {
        return commands.execute(key(c.actor(), "zone.createDraft", c.commandId()), c, Revision.class, () -> {
            initialVersion(c.expectedVersion());
            text(c.type());
            if (c.cityId() == null || !jdbc.sql("select exists(select 1 from city where id = :id)")
                    .param("id", c.cityId()).query(Boolean.class).single()) {
                throw error(ErrorCode.NOT_FOUND, "City not found");
            }
            polygon(c.polygonEwkt());
            UUID id = UUID.randomUUID();
            jdbc.sql("""
                    insert into zone(id, city_id, type, polygon, priority, state, version, created_at, updated_at)
                    values (:id, :city, :type, ST_GeomFromEWKT(:polygon), :priority, 'DRAFT', 0, :now, :now)
                    """).param("id", id).param("city", c.cityId()).param("type", c.type())
                    .param("polygon", c.polygonEwkt()).param("priority", c.priority()).param("now", now()).update();
            audit.record(new AuditEntry(c.actor(), "zone.createDraft", "zone", id.toString(), c.reason(), null, c));
            return new Revision(id, "DRAFT", 0);
        });
    }

    @Override public Revision publishCity(Change c) { return transition(c, true, true); }
    @Override public Revision archiveCity(Change c) { return transition(c, true, false); }
    @Override public Revision publishZone(Change c) { return transition(c, false, true); }
    @Override public Revision archiveZone(Change c) { return transition(c, false, false); }

    private Revision transition(Change c, boolean city, boolean publish) {
        // Table and operation come only from the named methods above, never from caller-supplied SQL.
        String table = city ? "city" : "zone";
        String operation = table + (publish ? ".publish" : ".archive");
        return commands.execute(key(c.actor(), operation, c.commandId()), c, Revision.class, () -> {
            if (city && publish) {
                // One transaction-scoped publication mutex prevents equal-priority write skew.
                // Take it before reading polygons, so concurrent publishers see the committed predecessor.
                jdbc.sql("select pg_advisory_xact_lock(1717856371)").query((rs, n) -> 0).single();
            }
            Revision before = jdbc.sql("select id, state, version from " + table + " where id = :id for update")
                    .param("id", c.id()).query((rs, n) -> new Revision(rs.getObject("id", UUID.class),
                            rs.getString("state"), rs.getLong("version"))).optional()
                    .orElseThrow(() -> error(ErrorCode.NOT_FOUND, "Geography not found"));
            if (before.version() != c.expectedVersion()) throw error(ErrorCode.VERSION_CONFLICT, "Stale geography version");
            if ("ARCHIVED".equals(before.state()) || (publish && !"DRAFT".equals(before.state()))) {
                throw error(ErrorCode.STATE_CONFLICT, "Geography cannot make this transition");
            }
            if (publish) {
                boolean valid = jdbc.sql("select ST_IsValid(polygon) and not ST_IsEmpty(polygon)"
                        + " and ST_SRID(polygon) = 4326 from " + table + " where id = :id")
                        .param("id", c.id()).query(Boolean.class).single();
                if (!valid) throw error(ErrorCode.VALIDATION_FAILED, "Cannot publish an invalid or empty polygon");
                if (city && jdbc.sql("""
                        select exists(select 1 from city candidate join city other on other.id <> candidate.id
                        and other.state = 'PUBLISHED' and other.priority = candidate.priority
                        and ST_Intersects(other.polygon, candidate.polygon) where candidate.id = :id)
                        """).param("id", c.id()).query(Boolean.class).single()) {
                    // Intersects includes shared edges/vertices: ST_Covers would otherwise have a tie there.
                    throw error(ErrorCode.STATE_CONFLICT, "Published cities intersect with equal priority");
                }
            }
            Revision after = new Revision(before.id(), publish ? "PUBLISHED" : "ARCHIVED", before.version() + 1);
            jdbc.sql("update " + table + " set state = :state, version = :version, updated_at = :now where id = :id")
                    .param("state", after.state()).param("version", after.version()).param("now", now())
                    .param("id", c.id()).update();
            audit.record(new AuditEntry(c.actor(), operation, table, c.id().toString(), c.reason(), before, after));
            return after;
        });
    }

    private CommandKey key(Actor actor, String operation, UUID commandId) {
        if (actor == null || actor.type() != SubjectType.STAFF) throw error(ErrorCode.ACCESS_DENIED, "Staff actor required");
        if (commandId == null) throw error(ErrorCode.VALIDATION_FAILED, "command_id required");
        return new CommandKey(actor, operation, commandId);
    }

    private void polygon(String ewkt) {
        text(ewkt);
        try {
            boolean validType = jdbc.sql("""
                    select ST_SRID(p) = 4326 and GeometryType(p) = 'MULTIPOLYGON'
                    from (select ST_GeomFromEWKT(:polygon) p) geometry
                    """).param("polygon", ewkt).query(Boolean.class).single();
            if (!validType) throw error(ErrorCode.VALIDATION_FAILED, "Expected an SRID 4326 MultiPolygon");
        } catch (DataAccessException invalid) {
            // PostGIS parser errors are XX000/22023. Do not disguise connection or other database failures.
            if (invalid.getMostSpecificCause() instanceof SQLException sql
                    && ("XX000".equals(sql.getSQLState()) || "22023".equals(sql.getSQLState()))) {
                throw error(ErrorCode.VALIDATION_FAILED, "Malformed polygon");
            }
            throw invalid;
        }
    }

    private static void initialVersion(long version) {
        if (version != 0) throw error(ErrorCode.VERSION_CONFLICT, "New drafts require expected_version 0");
    }
    private static void text(String value) {
        if (value == null || value.isBlank()) throw error(ErrorCode.VALIDATION_FAILED, "Required field is blank");
    }
    private OffsetDateTime now() { return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC); }
    private static DomainException error(ErrorCode code, String message) { return new DomainException(code, message); }
}
