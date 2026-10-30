package taxi.blizz.operatorbonus.internal;

import java.time.Clock;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityCatalog;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.OrderChannel;
import taxi.blizz.operations.Orders;
import taxi.blizz.operatorbonus.OperatorBonuses;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.platform.PageCursor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcOperatorBonuses implements OperatorBonuses, OutboxHandler {

    private static final Logger log = LoggerFactory.getLogger(JdbcOperatorBonuses.class);
    private static final String DEFAULT_RULE = "default";
    private static final int MAX_POINTS = 100_000;

    private final JdbcClient jdbc;
    private final Orders orders;
    private final CancelReasons cancelReasons;
    private final CityCatalog cities;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final JsonMapper json;
    private final Clock clock;

    JdbcOperatorBonuses(JdbcClient jdbc, Orders orders, CancelReasons cancelReasons, CityCatalog cities,
                        StaffAccess staff, IdempotentCommands commands, AuditLog audit, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.orders = orders;
        this.cancelReasons = cancelReasons;
        this.cities = cities;
        this.staff = staff;
        this.commands = commands;
        this.audit = audit;
        this.json = json;
        this.clock = clock;
    }

    @Override
    public String consumerId() {
        return "operator-bonuses";
    }

    @Override
    public boolean supports(String eventType) {
        return "TripCompleted".equals(eventType) || "OrderCancelled".equals(eventType);
    }

    @Override
    @Transactional
    public void handle(OutboxMessage event) {
        Map<String, Object> body = json.readValue(event.payload(), new TypeReference<Map<String, Object>>() {});
        Object rawOrderId = body.get("order_id");
        if (rawOrderId == null) {
            return;
        }
        UUID orderId = UUID.fromString(rawOrderId.toString());
        if ("TripCompleted".equals(event.type())) {
            apply(orderId, "FULFILLED", null, event.occurredAt());
        } else if ("OrderCancelled".equals(event.type())) {
            Object cancelledBy = body.get("cancelled_by");
            if (cancelledBy == null || !"STAFF".equals(cancelledBy.toString())) {
                return;
            }
            Object reason = body.get("reason_code");
            apply(orderId, "OPERATOR_FAULT_CANCELLATION", reason == null ? null : reason.toString(), event.occurredAt());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public SettingsVersion currentSettings(Actor actor) {
        staff.require(actor, MANAGE_PERMISSION);
        return currentSettingsInternal();
    }

    record ChangeRequest(long expectedVersion, Settings settings, String reason) {
    }

    @Override
    public SettingsVersion changeSettings(Actor actor, UUID commandId, long expectedVersion, Settings settings,
                                          String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        Settings clean = validate(settings);
        String why = required(reason);
        ChangeRequest request = new ChangeRequest(expectedVersion, clean, why);
        return commands.execute(new CommandKey(actor, "operator_bonus.settings.change", commandId), request,
                SettingsVersion.class, () -> changeInside(actor, expectedVersion, clean, why));
    }

    @Transactional
    SettingsVersion changeInside(Actor actor, long expectedVersion, Settings settings, String reason) {
        jdbc.sql("select pg_advisory_xact_lock(hashtext('operator-bonus-settings'))").query().singleRow();
        SettingsVersion current = jdbc.sql("select version, m, g, count_cancellations, reset_day, time_rules::text, "
                        + "effective_at, changed_by, reason from operator_bonus_settings order by version desc limit 1 for update")
                .query((rs, i) -> mapSettings(rs)).single();
        if (current.version() != expectedVersion) {
            throw ConflictException.version(current.version(), "Operator bonus settings changed");
        }
        long version = current.version() + 1;
        OffsetDateTime now = now();
        try {
            jdbc.sql("""
                            insert into operator_bonus_settings
                                (version, m, g, count_cancellations, reset_day, time_rules, effective_at, changed_by, reason)
                            values (:version, :m, :g, :count, :reset, cast(:rules as jsonb), :at, :by, :reason)
                            """)
                    .param("version", version).param("m", settings.m()).param("g", settings.g())
                    .param("count", settings.countCancellations()).param("reset", settings.resetDay())
                    .param("rules", json.writeValueAsString(settings.timeRules())).param("at", now)
                    .param("by", actor.id()).param("reason", reason).update();
        } catch (org.springframework.dao.DataIntegrityViolationException e) {
            // Version `version` was written by someone else at the same moment.
            throw ConflictException.version(version, "Operator bonus settings changed");
        }
        audit.record(new AuditEntry(actor, "operator_bonus.settings.change", "operator_bonus_settings",
                Long.toString(version), reason, current.settings(), settings));
        return readSettings(version);
    }

    @Override
    @Transactional(readOnly = true)
    public Account mine(Actor actor, int entryLimit) {
        if (actor == null || actor.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Staff account required");
        }
        return account(actor.id(), bounded(entryLimit));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Account> accounts(Actor actor) {
        staff.require(actor, MANAGE_PERMISSION);
        return jdbc.sql("select staff_id from operator_bonus_account order by staff_id")
                .query(UUID.class).list().stream().map(id -> account(id, 10)).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Entry> history(Actor actor, UUID staffId, int limit) {
        staff.require(actor, MANAGE_PERMISSION);
        return entries(staffId, bounded(limit));
    }

    @Override
    @Transactional(readOnly = true)
    public List<ClosedPeriod> periods(Actor actor, PageCursor after, int limit) {
        staff.require(actor, MANAGE_PERMISSION);
        return jdbc.sql("""
                        select staff_id, period_key, period_started_at, period_ended_at, points,
                               fulfilled_count, cancelled_count, closed_at
                        from operator_bonus_period
                        where cast(:afterKey as date) is null
                           or (period_key < :afterKey and cast(:afterStaff as uuid) is not null)
                        order by period_key desc, staff_id desc limit :limit
                        """)
                .param("afterKey", after == null ? null : after.date(0))
                .param("afterStaff", after == null ? null : after.id(1))
                .param("limit", Math.max(1, Math.min(limit, PageCursor.MAX_FETCH)))
                .query((rs, i) -> new ClosedPeriod(rs.getObject("staff_id", UUID.class),
                        rs.getObject("period_key", LocalDate.class), rs.getObject("period_started_at", OffsetDateTime.class),
                        rs.getObject("period_ended_at", OffsetDateTime.class), rs.getInt("points"),
                        rs.getInt("fulfilled_count"), rs.getInt("cancelled_count"),
                        rs.getObject("closed_at", OffsetDateTime.class))).list();
    }

    @Override
    @Transactional
    public void resetDueAccounts() {
        Settings settings = currentSettingsInternal().settings();
        OffsetDateTime now = now();
        List<AccountRow> rows = jdbc.sql("""
                        select staff_id, balance, fulfilled_count, cancelled_count, period_started_at, timezone
                        from operator_bonus_account for update
                        """)
                .query((rs, i) -> new AccountRow(rs.getObject("staff_id", UUID.class), rs.getInt("balance"),
                        rs.getInt("fulfilled_count"), rs.getInt("cancelled_count"),
                        rs.getObject("period_started_at", OffsetDateTime.class), rs.getString("timezone"))).list();
        for (AccountRow row : rows) {
            ZoneId zone = ZoneId.of(row.timezone());
            LocalDate today = now.atZoneSameInstant(zone).toLocalDate();
            LocalDate due = resetDate(today, settings.resetDay());
            LocalDate started = row.periodStartedAt().atZoneSameInstant(zone).toLocalDate();
            if (!started.isBefore(due)) {
                continue;
            }
            int inserted = jdbc.sql("""
                            insert into operator_bonus_period
                                (id, staff_id, period_key, period_started_at, period_ended_at, points,
                                 fulfilled_count, cancelled_count, closed_at)
                            values (:id, :staff, :key, :started, :ended, :points, :fulfilled, :cancelled, :closed)
                            on conflict (staff_id, period_key) do nothing
                            """)
                    .param("id", UUID.randomUUID()).param("staff", row.staffId()).param("key", due)
                    .param("started", row.periodStartedAt()).param("ended", now).param("points", row.balance())
                    .param("fulfilled", row.fulfilledCount()).param("cancelled", row.cancelledCount())
                    .param("closed", now).update();
            if (inserted == 1) {
                jdbc.sql("""
                                update operator_bonus_account set balance = 0, fulfilled_count = 0,
                                    cancelled_count = 0, period_started_at = :now, updated_at = :now
                                where staff_id = :staff
                                """).param("now", now).param("staff", row.staffId()).update();
            }
        }
    }

    private void apply(UUID orderId, String kind, String reasonCode, OffsetDateTime occurredAt) {
        Optional<Orders.Origin> maybeOrigin = orders.origin(orderId);
        if (maybeOrigin.isEmpty()) {
            return;
        }
        Orders.Origin origin = maybeOrigin.get();
        if (origin.channel() != OrderChannel.PHONE || origin.createdByType() != SubjectType.STAFF
                || origin.createdById() == null) {
            return;
        }
        SettingsVersion version = settingsAt(origin.createdAt());
        if ("OPERATOR_FAULT_CANCELLATION".equals(kind)) {
            boolean operatorFault = cancelReasons.find(CancelReasons.Audience.STAFF, reasonCode)
                    .map(CancelReasons.Reason::operatorFault).orElse(false);
            if (!operatorFault || !version.settings().countCancellations()) {
                return;
            }
        }
        String timezone = cities.timezone(origin.cityId()).orElse(null);
        if (timezone == null) {
            log.warn("Skipping operator bonus for order {}: city {} not found", orderId, origin.cityId());
            return;
        }
        RuleValue selected = selectRule(version.settings(), origin.createdAt(), timezone, kind);
        LocalDate periodKey = periodFor(origin.createdById(), occurredAt);
        int inserted = jdbc.sql("""
                        insert into operator_bonus_entry
                            (id, staff_id, order_id, kind, rule_key, settings_version, points, occurred_at, created_at, period_key)
                        values (:id, :staff, :order, :kind, :rule, :version, :points, :occurred, :created, :period)
                        on conflict (order_id, kind) do nothing
                        """)
                .param("id", UUID.randomUUID()).param("staff", origin.createdById()).param("order", orderId)
                .param("kind", kind).param("rule", selected.key()).param("version", version.version())
                .param("points", selected.points()).param("occurred", occurredAt).param("created", now())
                .param("period", periodKey).update();
        if (inserted == 0) {
            return;
        }
        int fulfilled = "FULFILLED".equals(kind) ? 1 : 0;
        int cancelled = "OPERATOR_FAULT_CANCELLATION".equals(kind) ? 1 : 0;
        if (periodKey != null) {
            jdbc.sql("""
                            update operator_bonus_period set points = points + :points,
                                fulfilled_count = fulfilled_count + :fulfilled,
                                cancelled_count = cancelled_count + :cancelled
                            where staff_id = :staff and period_key = :period
                            """)
                    .param("points", selected.points()).param("fulfilled", fulfilled)
                    .param("cancelled", cancelled).param("staff", origin.createdById())
                    .param("period", periodKey).update();
        } else {
            jdbc.sql("""
                            insert into operator_bonus_account
                                (staff_id, balance, fulfilled_count, cancelled_count, period_started_at, timezone, updated_at)
                            values (:staff, :points, :fulfilled, :cancelled, :started, :timezone, :now)
                            on conflict (staff_id) do update set
                                balance = operator_bonus_account.balance + excluded.balance,
                                fulfilled_count = operator_bonus_account.fulfilled_count + excluded.fulfilled_count,
                                cancelled_count = operator_bonus_account.cancelled_count + excluded.cancelled_count,
                                timezone = excluded.timezone,
                                updated_at = excluded.updated_at
                            """)
                    .param("staff", origin.createdById()).param("points", selected.points())
                    .param("fulfilled", fulfilled).param("cancelled", cancelled).param("started", occurredAt)
                    .param("timezone", timezone).param("now", now()).update();
        }
    }

    /** Closed period that owns this occurred_at, or null if it belongs to the open period.
     *  Locks the account row so a concurrent reset cannot close the period between this
     *  decision and the subsequent write. */
    private LocalDate periodFor(UUID staffId, OffsetDateTime occurredAt) {
        Optional<OffsetDateTime> started = jdbc.sql("""
                        select period_started_at from operator_bonus_account where staff_id = :staff for update
                        """)
                .param("staff", staffId).query(OffsetDateTime.class).optional();
        if (started.isEmpty() || !occurredAt.isBefore(started.get())) {
            return null;
        }
        return jdbc.sql("""
                        select period_key from operator_bonus_period
                        where staff_id = :staff and period_started_at <= :at and period_ended_at > :at
                        order by period_key desc limit 1
                        """)
                .param("staff", staffId).param("at", occurredAt)
                .query(LocalDate.class).optional().orElse(null);
    }

    private RuleValue selectRule(Settings settings, OffsetDateTime createdAt, String timezone, String kind) {
        ZonedDateTime local = createdAt.atZoneSameInstant(ZoneId.of(timezone));
        int day = local.getDayOfWeek().getValue();
        int hour = local.getHour();
        for (TimeRule rule : settings.timeRules()) {
            if (rule.daysOfWeek().contains(day) && hour >= rule.startHour() && hour < rule.endHour()) {
                return new RuleValue(rule.key(), "FULFILLED".equals(kind) ? rule.m() : -rule.g());
            }
        }
        return new RuleValue(DEFAULT_RULE, "FULFILLED".equals(kind) ? settings.m() : -settings.g());
    }

    private SettingsVersion settingsAt(OffsetDateTime createdAt) {
        return jdbc.sql("""
                        select version, m, g, count_cancellations, reset_day, time_rules::text,
                               effective_at, changed_by, reason
                        from operator_bonus_settings where effective_at <= :at order by version desc limit 1
                        """).param("at", createdAt).query((rs, i) -> mapSettings(rs)).single();
    }

    private SettingsVersion currentSettingsInternal() {
        return jdbc.sql("""
                        select version, m, g, count_cancellations, reset_day, time_rules::text,
                               effective_at, changed_by, reason
                        from operator_bonus_settings order by version desc limit 1
                        """).query((rs, i) -> mapSettings(rs)).single();
    }

    private SettingsVersion readSettings(long version) {
        return jdbc.sql("""
                        select version, m, g, count_cancellations, reset_day, time_rules::text,
                               effective_at, changed_by, reason
                        from operator_bonus_settings where version = :version
                        """).param("version", version).query((rs, i) -> mapSettings(rs)).single();
    }

    private SettingsVersion mapSettings(java.sql.ResultSet rs) throws java.sql.SQLException {
        List<TimeRule> rules = json.readValue(rs.getString("time_rules"), new TypeReference<List<TimeRule>>() {});
        return new SettingsVersion(rs.getLong("version"), new Settings(rs.getInt("m"), rs.getInt("g"),
                rs.getBoolean("count_cancellations"), rs.getInt("reset_day"), rules),
                rs.getObject("effective_at", OffsetDateTime.class), rs.getObject("changed_by", UUID.class),
                rs.getString("reason"));
    }

    private Account account(UUID staffId, int limit) {
        Optional<AccountRow> row = jdbc.sql("""
                        select staff_id, balance, fulfilled_count, cancelled_count, period_started_at, timezone
                        from operator_bonus_account where staff_id = :staff
                        """).param("staff", staffId)
                .query((rs, i) -> new AccountRow(rs.getObject("staff_id", UUID.class), rs.getInt("balance"),
                        rs.getInt("fulfilled_count"), rs.getInt("cancelled_count"),
                        rs.getObject("period_started_at", OffsetDateTime.class), rs.getString("timezone"))).optional();
        if (row.isEmpty()) {
            return new Account(staffId, 0, 0, 0, now(), List.of());
        }
        AccountRow a = row.get();
        return new Account(a.staffId(), a.balance(), a.fulfilledCount(), a.cancelledCount(), a.periodStartedAt(),
                entries(staffId, limit));
    }

    private List<Entry> entries(UUID staffId, int limit) {
        return jdbc.sql("""
                        select order_id, kind, rule_key, settings_version, points, occurred_at
                        from operator_bonus_entry where staff_id = :staff
                        order by occurred_at desc, id desc limit :limit
                        """).param("staff", staffId).param("limit", limit)
                .query((rs, i) -> new Entry(rs.getObject("order_id", UUID.class), rs.getString("kind"),
                        rs.getString("rule_key"), rs.getLong("settings_version"), rs.getInt("points"),
                        rs.getObject("occurred_at", OffsetDateTime.class))).list();
    }

    private Settings validate(Settings settings) {
        if (settings == null) {
            throw invalid("Operator bonus settings are required");
        }
        if (settings.m() < 0 || settings.m() > MAX_POINTS || settings.g() < 0 || settings.g() > MAX_POINTS) {
            throw invalid("m and g must be between 0 and " + MAX_POINTS);
        }
        if (settings.resetDay() < 1 || settings.resetDay() > 28) {
            throw invalid("reset_day must be between 1 and 28");
        }
        java.util.HashSet<String> keys = new java.util.HashSet<>();
        java.util.ArrayList<TimeRule> rules = new java.util.ArrayList<>();
        for (TimeRule rule : settings.timeRules()) {
            if (rule == null || rule.key() == null || rule.key().isBlank() || !keys.add(rule.key().strip())) {
                throw invalid("Every time rule needs a unique key");
            }
            if (rule.daysOfWeek().isEmpty() || rule.daysOfWeek().stream().anyMatch(d -> d < 1 || d > 7)) {
                throw invalid("Rule days_of_week use ISO values 1..7");
            }
            if (rule.startHour() < 0 || rule.startHour() > 23 || rule.endHour() < 1 || rule.endHour() > 24
                    || rule.startHour() >= rule.endHour()) {
                throw invalid("Rule hours must satisfy 0 <= start_hour < end_hour <= 24");
            }
            if (rule.m() < 0 || rule.m() > MAX_POINTS || rule.g() < 0 || rule.g() > MAX_POINTS) {
                throw invalid("Rule m and g must be between 0 and " + MAX_POINTS);
            }
            rules.add(new TimeRule(rule.key().strip(), rule.daysOfWeek(), rule.startHour(), rule.endHour(),
                    rule.m(), rule.g()));
        }
        return new Settings(settings.m(), settings.g(), settings.countCancellations(), settings.resetDay(), rules);
    }

    private static LocalDate resetDate(LocalDate today, int resetDay) {
        LocalDate thisMonth = today.withDayOfMonth(resetDay);
        return today.isBefore(thisMonth) ? thisMonth.minusMonths(1) : thisMonth;
    }

    private static int bounded(int limit) {
        return Math.max(1, Math.min(limit <= 0 ? 20 : limit, 100));
    }

    private static String required(String value) {
        if (value == null || value.isBlank()) {
            throw invalid("A reason for the settings change is required");
        }
        return value.strip();
    }

    private OffsetDateTime now() {
        return clock.instant().atOffset(ZoneOffset.UTC);
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }

    private record RuleValue(String key, int points) {}
    private record AccountRow(UUID staffId, int balance, int fulfilledCount, int cancelledCount,
                              OffsetDateTime periodStartedAt, String timezone) {}
}
