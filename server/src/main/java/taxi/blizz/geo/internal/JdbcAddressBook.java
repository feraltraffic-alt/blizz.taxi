package taxi.blizz.geo.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.geo.AddressBook;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.geo.HouseNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.DuplicateException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcAddressBook implements AddressBook {
    /** Reverse lookup is for "where am I", not for scanning a city. */
    static final int MAX_NEAREST_RADIUS_METRES = 500;
    private static final String READ = """
            select a.*, ST_Y(a.pickup_point) lat, ST_X(a.pickup_point) lon, o.provider, o.object_id,
                coalesce((select jsonb_agg(jsonb_build_object('label', label, 'language', language)
                    order by language, normalized) from address_alias where address_id = a.id), '[]')::text aliases
            from address a left join address_override o on o.own_address_id = a.id
            """;
    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final JsonMapper json;
    private final Clock clock;

    JdbcAddressBook(JdbcClient jdbc, IdempotentCommands commands, AuditLog audit, JsonMapper json, Clock clock, StaffAccess staff) {
        this.staff = staff;
        this.jdbc = jdbc;
        this.commands = commands;
        this.audit = audit;
        this.json = json;
        this.clock = clock;
    }

    @Override
    public Address create(Create c) {
        return commands.execute(key(c.actor(), "address.create", c.commandId(), cityOf(c.data())), c, Address.class, () -> {
            reason(c.reason());
            if (c.expectedVersion() != 0) {
                throw error(ErrorCode.VERSION_CONFLICT, "New addresses require expected_version 0");
            }
            validate(c.data());
            lockOverrides();
            UUID id = UUID.randomUUID();
            Data d = c.data();
            HouseNumber house = HouseNumber.parse(d.houseRaw(), d.building());
            UUID near = requireNotDuplicate(null, d, house, c.distinct());
            dataParams(jdbc.sql("""
                    insert into address(id, city_id, type, label, language, street, street_normalized, house_raw,
                        house_number, house_suffix, building_raw, building_normalized, house_normalized,
                        pickup_point, instructions, search_text, created_at, updated_at)
                    values (:id, :city, :type, :label, :language, :street, :streetNormalized, :houseRaw,
                        :number, :suffix, :buildingRaw, :building, :house,
                        ST_SetSRID(ST_MakePoint(:lon, :lat), 4326), :instructions, :text, :now, :now)
                    """), id, d, house).update();
            override(id, d.override());
            Address after = get(id, false).orElseThrow();
            changed(c.actor(), "address.create", c.reason(), null, after);
            distinct(c.actor(), c.reason(), after, near);
            return after;
        });
    }

    @Override
    public Address update(Update c) {
        return commands.execute(key(c.actor(), "address.update", c.commandId(), currentCity(c.id()), cityOf(c.data())), c, Address.class, () -> {
            reason(c.reason());
            lockOverrides();
            Address before = locked(c.id(), c.expectedVersion());
            validate(c.data());
            Data d = c.data();
            UUID near = requireNotDuplicate(c.id(), d, HouseNumber.parse(d.houseRaw(), d.building()), c.distinct());
            dataParams(jdbc.sql("""
                    update address set city_id = :city, type = :type, label = :label, language = :language,
                        street = :street, street_normalized = :streetNormalized, house_raw = :houseRaw,
                        house_number = :number, house_suffix = :suffix, building_raw = :buildingRaw,
                        building_normalized = :building, house_normalized = :house,
                        pickup_point = ST_SetSRID(ST_MakePoint(:lon, :lat), 4326),
                        instructions = :instructions, search_text = :text, version = version + 1, updated_at = :now
                    where id = :id
                    """), c.id(), d, HouseNumber.parse(d.houseRaw(), d.building())).update();
            override(c.id(), d.override());
            Address after = get(c.id(), false).orElseThrow();
            changed(c.actor(), "address.update", c.reason(), before, after);
            distinct(c.actor(), c.reason(), after, near);
            return after;
        });
    }

    @Override
    public Address addAlias(AddAlias c) {
        return commands.execute(key(c.actor(), "address.addAlias", c.commandId(), currentCity(c.id())), c, Address.class, () -> {
            reason(c.reason());
            Address before = locked(c.id(), c.expectedVersion());
            if (c.alias() == null) {
                throw error(ErrorCode.VALIDATION_FAILED, "Alias required");
            }
            text(c.alias().label());
            String language = language(c.alias().language());
            try {
                jdbc.sql("""
                        insert into address_alias(id, address_id, label, language, normalized, search_text, created_at)
                        values (:id, :address, :label, :language, :normalized, :text, :now)
                        """).param("id", UUID.randomUUID()).param("address", c.id()).param("label", c.alias().label())
                        .param("language", language).param("normalized", AddressText.normalize(c.alias().label()))
                        .param("text", AddressText.document(c.alias().label())).param("now", now()).update();
            } catch (DuplicateKeyException duplicate) {
                throw error(ErrorCode.STATE_CONFLICT, "Alias already exists in this language");
            }
            jdbc.sql("update address set version = version + 1, updated_at = :now where id = :id")
                    .param("id", c.id()).param("now", now()).update();
            Address after = get(c.id(), false).orElseThrow();
            changed(c.actor(), "address.addAlias", c.reason(), before, after);
            return after;
        });
    }

    @Override
    public Address hide(Change c) {
        return visibility(c, Visibility.HIDDEN);
    }

    @Override
    public Address restore(Change c) {
        return visibility(c, Visibility.ACTIVE);
    }

    private Address visibility(Change c, Visibility target) {
        String action = target == Visibility.HIDDEN ? "address.hide" : "address.restore";
        return commands.execute(key(c.actor(), action, c.commandId(), currentCity(c.id())), c, Address.class, () -> {
            reason(c.reason());
            boolean restore = target == Visibility.ACTIVE;
            if (restore) {
                // The same order as create and update: the override lock, then the address.
                lockOverrides();
            }
            Address before = locked(c.id(), c.expectedVersion());
            if (before.visibility() == target) {
                throw error(ErrorCode.STATE_CONFLICT, "Address already has this visibility");
            }
            // Back in search only if it duplicates nothing active now (REQ-GEO-14, review of #174).
            UUID near = restore ? requireNotDuplicate(c.id(), before.data(), before.house(), c.distinct()) : null;
            jdbc.sql("update address set visibility = :visibility, version = version + 1, updated_at = :now where id = :id")
                    .param("visibility", target.name()).param("id", c.id()).param("now", now()).update();
            Address after = get(c.id(), false).orElseThrow();
            changed(c.actor(), action, c.reason(), before, after);
            distinct(c.actor(), c.reason(), after, near);
            return after;
        });
    }

    @Override
    public List<Address> listForStaff(Actor actor, UUID cityId, String text, boolean includeHidden, int limit) {
        staff.require(actor, MANAGE_PERMISSION, cityId);
        String fragment = text == null ? "" : AddressText.normalize(text);
        return read(jdbc.sql(READ + """
                where a.city_id = :city and (:hidden or a.visibility = 'ACTIVE')
                  and (:text = '' or a.search_text like :contains
                       or exists(select 1 from address_alias x where x.address_id = a.id and x.search_text like :contains))
                order by a.updated_at desc, a.id limit :limit
                """).param("city", cityId).param("hidden", includeHidden).param("text", fragment)
                .param("contains", "%" + fragment.replace(" ", "%") + "%")
                .param("limit", Math.max(1, Math.min(limit, 200)))).list();
    }

    @Override
    public Address getForStaff(Actor actor, UUID id) {
        UUID city = currentCity(id);
        if (city == null) {
            staff.require(actor, MANAGE_PERMISSION);
            throw error(ErrorCode.NOT_FOUND, "Address not found");
        }
        staff.require(actor, MANAGE_PERMISSION, city);
        return get(id, false).orElseThrow(() -> error(ErrorCode.NOT_FOUND, "Address not found"));
    }

    @Override
    public Optional<Address> find(UUID id) {
        return read(jdbc.sql(READ + " where a.id = :id and a.visibility = 'ACTIVE'").param("id", id)).optional();
    }

    @Override
    public List<Address> search(UUID cityId, String query, String language, GeoPoint near, int limit) {
        if (cityId == null || limit < 1) {
            throw error(ErrorCode.VALIDATION_FAILED, "City and positive result limit required");
        }
        AddressText.Query q = AddressText.query(query);
        HouseNumber h = q.house();
        return read(jdbc.sql(READ + """
                where a.city_id = :city and a.visibility = 'ACTIVE'
                and (:text = '' or a.search_text like :contains or a.search_text % :text
                    or exists(select 1 from address_alias x where x.address_id = a.id
                        and (x.search_text like :contains or x.search_text % :text)))
                and (:number = '' or a.street_normalized = :fullQuery
                    or (a.house_number = :number and a.house_suffix like :suffixPrefix
                        and (:building = '' or a.building_normalized = :building))
                    or (a.house_number = '' and :building = '' and
                        ((' ' || a.search_text || ' ') like :wholeHouse
                        or exists(select 1 from address_alias x where x.address_id = a.id
                            and (' ' || x.search_text || ' ') like :wholeHouse))))
                and not exists(select 1 from unnest(cast(:numbers as text[])) token
                    where not ((' ' || a.search_text || ' ') like ('% ' || token || ' %')
                        or exists(select 1 from address_alias x where x.address_id = a.id
                            and (' ' || x.search_text || ' ') like ('% ' || token || ' %'))))
                order by case when :number <> '' and a.house_number = :number and a.house_suffix = :suffix
                    and a.building_normalized = :building then 0 else 1 end,
                    case when a.street_normalized = :text or a.search_text like :prefix
                        or exists(select 1 from address_alias x where x.address_id = a.id
                            and x.normalized = :fullQuery) then 0 else 1 end,
                    case when a.language = :language or exists(select 1 from address_alias x
                        where x.address_id = a.id and x.language = :language) then 0 else 1 end,
                    case when :near then ST_Distance(a.pickup_point::geography,
                        ST_SetSRID(ST_MakePoint(:lon, :lat), 4326)::geography) else 0 end,
                    a.id limit :limit
                """).param("city", cityId).param("text", q.text()).param("fullQuery", q.fullText())
                .param("contains", "%" + q.text().replace(" ", "%") + "%").param("prefix", q.text() + "%")
                .param("number", h.number()).param("suffix", h.suffix()).param("suffixPrefix", h.suffix() + "%")
                .param("building", h.building()).param("wholeHouse", "% " + AddressText.normalize(h.number() + h.suffix()) + " %")
                .param("numbers", q.numbers()).param("language", language == null ? "" : language.toLowerCase(java.util.Locale.ROOT))
                .param("near", near != null).param("lon", near == null ? 0 : near.lon())
                .param("lat", near == null ? 0 : near.lat()).param("limit", Math.min(limit, 20))).list();
    }

    @Override
    public Optional<Address> nearest(UUID cityId, GeoPoint point, double radiusMetres) {
        if (cityId == null || point == null || !Double.isFinite(radiusMetres) || radiusMetres < 0
                || radiusMetres > MAX_NEAREST_RADIUS_METRES) {
            throw error(ErrorCode.VALIDATION_FAILED,
                    "City, point and a radius from 0 to " + MAX_NEAREST_RADIUS_METRES + " m required");
        }
        return read(jdbc.sql(READ + """
                where a.city_id = :city and a.visibility = 'ACTIVE'
                and ST_DWithin(a.pickup_point::geography,
                    ST_SetSRID(ST_MakePoint(:lon, :lat), 4326)::geography, :radius)
                order by ST_Distance(a.pickup_point::geography,
                    ST_SetSRID(ST_MakePoint(:lon, :lat), 4326)::geography), a.id limit 1
                """).param("city", cityId).param("lon", point.lon()).param("lat", point.lat())
                .param("radius", radiusMetres)).optional();
    }

    private Optional<Address> get(UUID id, boolean lock) {
        return read(jdbc.sql(READ + " where a.id = :id" + (lock ? " for update of a" : "")).param("id", id)).optional();
    }

    private Address locked(UUID id, long expectedVersion) {
        Address before = get(id, true).orElseThrow(() -> error(ErrorCode.NOT_FOUND, "Address not found"));
        if (before.version() != expectedVersion) {
            throw ConflictException.version(before.version(), "Stale address version");
        }
        return before;
    }

    private JdbcClient.MappedQuerySpec<Address> read(JdbcClient.StatementSpec sql) {
        return sql.query((rs, n) -> {
            ProviderRef override = rs.getString("provider") == null ? null
                    : new ProviderRef(rs.getString("provider"), rs.getString("object_id"));
            Data data = new Data(rs.getObject("city_id", UUID.class), Kind.valueOf(rs.getString("type")),
                    rs.getString("label"), rs.getString("language"), rs.getString("street"), rs.getString("house_raw"),
                    rs.getString("building_raw"), new GeoPoint(rs.getDouble("lat"), rs.getDouble("lon")),
                    rs.getString("instructions"), override);
            return new Address(rs.getObject("id", UUID.class), data, new HouseNumber(rs.getString("house_number"),
                    rs.getString("house_suffix"), rs.getString("building_normalized")), rs.getString("source"),
                    Visibility.valueOf(rs.getString("visibility")), rs.getLong("version"),
                    Arrays.asList(json.readValue(rs.getString("aliases"), Alias[].class)));
        });
    }

    private JdbcClient.StatementSpec dataParams(JdbcClient.StatementSpec sql, UUID id, Data d, HouseNumber h) {
        return sql.param("id", id).param("city", d.cityId()).param("type", d.kind().name())
                .param("label", d.label()).param("language", language(d.language())).param("street", d.street())
                .param("streetNormalized", AddressText.normalize(d.street())).param("houseRaw", d.houseRaw())
                .param("number", h.number()).param("suffix", h.suffix()).param("buildingRaw", d.building())
                .param("building", h.building()).param("house", h.key()).param("lon", d.pickup().lon())
                .param("lat", d.pickup().lat()).param("instructions", d.instructions())
                .param("text", AddressText.document(d.label() + " " + (d.street() == null ? "" : d.street()) + " " + h.key()))
                .param("now", now());
    }

    private void validate(Data d) {
        if (d == null || d.cityId() == null || d.kind() == null || d.pickup() == null) {
            throw error(ErrorCode.VALIDATION_FAILED, "City, address type and pickup point required");
        }
        text(d.label());
        language(d.language());
        HouseNumber.parse(d.houseRaw(), d.building());
        if (!jdbc.sql("select exists(select 1 from city where id = :id)")
                .param("id", d.cityId()).query(Boolean.class).single()) {
            throw error(ErrorCode.NOT_FOUND, "City not found");
        }
        if (d.override() != null) {
            text(d.override().provider());
            text(d.override().objectId());
        }
    }

    /**
     * REQ-GEO-14, under the override lock so two writers cannot both miss each other: the provider reference linked
     * to another address is always a duplicate; an active HOUSE of the same city with the same normalized street,
     * number, suffix and building within {@link #DUPLICATE_METRES} is one unless {@code distinct}. Entrances and places
     * are pickup points the house alone does not identify. Returns the near house that {@code distinct} let through.
     */
    private UUID requireNotDuplicate(UUID self, Data d, HouseNumber house, boolean distinct) {
        if (d.override() != null) {
            Optional<UUID> linked = jdbc.sql("""
                            select own_address_id from address_override
                            where provider = :provider and object_id = :object
                              and (cast(:self as uuid) is null or own_address_id <> :self)""")
                    .param("provider", d.override().provider()).param("object", d.override().objectId())
                    .param("self", self).query(UUID.class).optional();
            if (linked.isPresent()) {
                throw new DuplicateException(linked.get(), "The provider reference is linked to another address");
            }
        }
        if (d.kind() != Kind.HOUSE || house.number().isEmpty()) {
            return null;
        }
        Optional<UUID> near = jdbc.sql("""
                        select id from address
                        where city_id = :city and type = 'HOUSE' and visibility = 'ACTIVE'
                          and (cast(:self as uuid) is null or id <> :self)
                          and street_normalized = :street and house_number = :number and house_suffix = :suffix
                          and building_normalized = :building
                          and ST_DWithin(pickup_point::geography,
                                         ST_SetSRID(ST_MakePoint(:lon, :lat), 4326)::geography, :metres)
                        order by ST_Distance(pickup_point::geography,
                                             ST_SetSRID(ST_MakePoint(:lon, :lat), 4326)::geography), id
                        limit 1""")
                .param("city", d.cityId()).param("self", self).param("street", AddressText.normalize(d.street()))
                .param("number", house.number()).param("suffix", house.suffix()).param("building", house.building())
                .param("lon", d.pickup().lon()).param("lat", d.pickup().lat()).param("metres", DUPLICATE_METRES)
                .query(UUID.class).optional();
        if (near.isPresent() && !distinct) {
            throw new DuplicateException(near.get(), "The same house has an address within " + (int) DUPLICATE_METRES
                    + " m; save it as distinct with a reason if it is another pickup point");
        }
        return near.orElse(null);
    }

    /** A near house saved anyway: the audit says which one and why. */
    private void distinct(Actor actor, String reason, Address after, UUID near) {
        if (near != null) {
            audit.record(new AuditEntry(actor, "address.distinct", "address", after.id().toString(), reason, null,
                    java.util.Map.of("duplicate_of", near.toString(), "reason", reason)));
        }
    }

    private void lockOverrides() {
        // Fixed order for mapping changes: override registry, then address, then its child rows.
        // Serialize the rare configuration writes to avoid unique-key deadlocks during link swaps.
        jdbc.sql("select pg_advisory_xact_lock(1717856372)").query((rs, n) -> 0).single();
    }

    private void override(UUID addressId, ProviderRef ref) {
        jdbc.sql("delete from address_override where own_address_id = :id").param("id", addressId).update();
        if (ref != null) {
            try {
                jdbc.sql("insert into address_override(provider, object_id, own_address_id) values (:provider, :object, :id)")
                        .param("provider", ref.provider()).param("object", ref.objectId()).param("id", addressId).update();
            } catch (DuplicateKeyException duplicate) {
                throw error(ErrorCode.STATE_CONFLICT, "Provider reference already has an own-address override");
            }
        }
    }

    private void changed(Actor actor, String action, String reason, Address before, Address after) {
        jdbc.sql("""
                insert into address_history(id, address_id, address_version, action, actor_type, actor_id,
                    reason, before, after, occurred_at)
                values (:id, :address, :version, :action, 'STAFF', :actor, :reason,
                    cast(:before as jsonb), cast(:after as jsonb), :now)
                """).param("id", UUID.randomUUID()).param("address", after.id()).param("version", after.version())
                .param("action", action).param("actor", actor.id()).param("reason", reason)
                .param("before", before == null ? null : json.writeValueAsString(before))
                .param("after", json.writeValueAsString(after)).param("now", now()).update();
        audit.record(new AuditEntry(actor, action, "address", after.id().toString(), reason, before, after));
    }

    /**
     * Permission and city scope before idempotency (AGENTS.md): an address belongs to its city, and an
     * update that moves it needs both the current and the new city.
     */
    private CommandKey key(Actor actor, String action, UUID commandId, UUID... cityIds) {
        staff.require(actor, MANAGE_PERMISSION, cityIds);
        if (commandId == null) {
            throw error(ErrorCode.VALIDATION_FAILED, "command_id required");
        }
        return new CommandKey(actor, action, commandId);
    }

    private static UUID cityOf(Data data) {
        return data == null ? null : data.cityId();
    }

    private UUID currentCity(UUID addressId) {
        return addressId == null ? null : jdbc.sql("select city_id from address where id = :id")
                .param("id", addressId).query(UUID.class).optional().orElse(null);
    }

    private static String language(String value) {
        text(value);
        if (!value.matches("[A-Za-z]{2,8}(?:-[A-Za-z0-9]{1,8})*")) {
            throw error(ErrorCode.VALIDATION_FAILED, "Invalid language tag");
        }
        return value.toLowerCase(java.util.Locale.ROOT);
    }

    private static void reason(String value) {
        text(value);
    }

    private static void text(String value) {
        if (value == null || value.isBlank()) {
            throw error(ErrorCode.VALIDATION_FAILED, "Required field is blank");
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    private static DomainException error(ErrorCode code, String message) {
        return new DomainException(code, message);
    }
}
