package taxi.blizz.backoffice.internal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.backoffice.SupportCases;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcSupportCases implements SupportCases {

    private static final String SELECT = """
            select id, number, city_id, category, order_id, requester_type, requester_id, subject, priority, state,
                   assigned_staff_id, resolution, version, created_at, updated_at
            from support_case
            """;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final Orders orders;
    private final AuditLog audit;
    private final Outbox outbox;
    private final Clock clock;

    JdbcSupportCases(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, Orders orders, AuditLog audit,
                     Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.orders = orders;
        this.audit = audit;
        this.outbox = outbox;
        this.clock = clock;
    }

    // ---------------------------------------------------------------- riders and drivers

    record OpenRequest(Category category, UUID orderId, String subject, String message) {
    }

    @Override
    public Case open(Actor requester, UUID commandId, Category category, UUID orderId, String subject, String message) {
        requireRequester(requester);
        if (category == null || category == Category.TRIP_REVIEW) {
            throw invalid("Choose a category");
        }
        String title = text(subject, 200, "A subject of 1 to 200 characters");
        String body = text(message, 4000, "A message of 1 to 4000 characters");
        UUID cityId = orderId == null ? null : ownOrder(requester, orderId).cityId();
        return commands.execute(new CommandKey(requester, "support.open", commandId),
                new OpenRequest(category, orderId, title, body), Case.class, () -> {
                    Priority priority = category == Category.SAFETY ? Priority.URGENT : Priority.NORMAL;
                    UUID id = insertCase(cityId, category, orderId, requester.type().name(), requester.id(), title,
                            priority, null);
                    addMessage(id, requester.type().name(), requester.id(), Visibility.PUBLIC, body);
                    publish(id);
                    return publicView(read(id));
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<Case> mine(Actor requester, OffsetDateTime before, int limit) {
        requireRequester(requester);
        return jdbc.sql(SELECT + """
                        where requester_type = :type and requester_id = :id
                          and (cast(:before as timestamptz) is null or created_at < :before)
                        order by created_at desc, id desc limit :limit""")
                .param("type", requester.type().name()).param("id", requester.id()).param("before", before)
                .param("limit", Math.max(1, Math.min(limit, 50)))
                .query((rs, i) -> map(rs, List.of())).list();
    }

    @Override
    @Transactional(readOnly = true)
    public Case mineOne(Actor requester, UUID caseId) {
        requireRequester(requester);
        return publicView(ownCase(requester, caseId));
    }

    record ReplyRequest(UUID caseId, String message) {
    }

    @Override
    public Case reply(Actor requester, UUID commandId, UUID caseId, String message) {
        requireRequester(requester);
        String body = text(message, 4000, "A message of 1 to 4000 characters");
        return commands.execute(new CommandKey(requester, "support.reply", commandId), new ReplyRequest(caseId, body),
                Case.class, () -> {
                    Case c = lock(caseId);
                    if (!requester.type().name().equals(c.requesterType()) || !requester.id().equals(c.requesterId())) {
                        throw new DomainException(ErrorCode.NOT_FOUND, "Case not found");
                    }
                    if (c.state() == State.CLOSED) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The case is closed; open a new one");
                    }
                    addMessage(caseId, requester.type().name(), requester.id(), Visibility.PUBLIC, body);
                    if (c.state() == State.WAITING_REQUESTER || c.state() == State.RESOLVED) {
                        update(caseId, c.assignedStaffId() == null ? State.OPEN : State.IN_PROGRESS,
                                c.assignedStaffId(), c.priority(), c.state() == State.RESOLVED ? null : c.resolution());
                    } else {
                        touch(caseId);
                    }
                    publish(caseId);
                    return publicView(read(caseId));
                });
    }

    // ---------------------------------------------------------------- staff

    @Override
    @Transactional(readOnly = true)
    public List<Case> queue(Actor actor, QueueFilter f) {
        requireCity(actor, f.cityId());
        return jdbc.sql(SELECT + """
                        where city_id is not distinct from :city
                          and (cast(:state as text) is null or state = :state)
                          and (cast(:priority as text) is null or priority = :priority)
                          and (cast(:category as text) is null or category = :category)
                          and (cast(:assignee as uuid) is null or assigned_staff_id = :assignee)
                          and (not :unassigned or assigned_staff_id is null)
                          and (cast(:before as timestamptz) is null or created_at < :before)
                        order by case priority when 'URGENT' then 0 when 'HIGH' then 1 when 'NORMAL' then 2 else 3 end,
                                 created_at desc, id desc
                        limit :limit""")
                .param("city", f.cityId()).param("state", f.state() == null ? null : f.state().name())
                .param("priority", f.priority() == null ? null : f.priority().name())
                .param("category", f.category() == null ? null : f.category().name())
                .param("assignee", f.assignedStaffId()).param("unassigned", f.unassignedOnly())
                .param("before", f.before()).param("limit", Math.max(1, Math.min(f.limit(), 100)))
                .query((rs, i) -> map(rs, List.of())).list();
    }

    @Override
    @Transactional(readOnly = true)
    public Case get(Actor actor, UUID caseId) {
        Case c = read(caseId);
        requireCity(actor, c.cityId());
        return c;
    }

    record AssignRequest(UUID caseId, long expectedVersion, UUID assigneeId, String reason) {
    }

    @Override
    public Case assign(Actor actor, UUID commandId, UUID caseId, long expectedVersion, UUID assigneeId, String reason) {
        Case current = authorize(actor, caseId);
        if (assigneeId != null) {
            try {
                requireCity(new Actor(SubjectType.STAFF, assigneeId), current.cityId());
            } catch (DomainException noRight) {
                throw invalid("The assignee cannot work on this case");
            }
        }
        return commands.execute(new CommandKey(actor, "support.assign", commandId),
                new AssignRequest(caseId, expectedVersion, assigneeId, reason), Case.class, () -> {
                    Case c = lockVersion(caseId, expectedVersion);
                    requireNotClosed(c);
                    State state = assigneeId == null
                            ? (c.state() == State.IN_PROGRESS ? State.OPEN : c.state())
                            : (c.state() == State.OPEN ? State.IN_PROGRESS : c.state());
                    update(caseId, state, assigneeId, c.priority(), c.resolution());
                    audit(actor, "support.assign", c, reason);
                    return read(caseId);
                });
    }

    record PriorityRequest(UUID caseId, long expectedVersion, Priority priority, String reason) {
    }

    @Override
    public Case prioritize(Actor actor, UUID commandId, UUID caseId, long expectedVersion, Priority priority,
                           String reason) {
        authorize(actor, caseId);
        if (priority == null) {
            throw invalid("A priority is required");
        }
        return commands.execute(new CommandKey(actor, "support.prioritize", commandId),
                new PriorityRequest(caseId, expectedVersion, priority, reason), Case.class, () -> {
                    Case c = lockVersion(caseId, expectedVersion);
                    requireNotClosed(c);
                    update(caseId, c.state(), c.assignedStaffId(), priority, c.resolution());
                    audit(actor, "support.prioritize", c, reason);
                    return read(caseId);
                });
    }

    record CommentRequest(UUID caseId, long expectedVersion, Visibility visibility, String body, boolean waitForRequester) {
    }

    @Override
    public Case comment(Actor actor, UUID commandId, UUID caseId, long expectedVersion, Visibility visibility,
                        String body, boolean waitForRequester) {
        authorize(actor, caseId);
        String text = text(body, 4000, "A message of 1 to 4000 characters");
        if (visibility == null || (waitForRequester && visibility != Visibility.PUBLIC)) {
            throw invalid("Waiting for the requester needs a PUBLIC message");
        }
        return commands.execute(new CommandKey(actor, "support.comment", commandId),
                new CommentRequest(caseId, expectedVersion, visibility, text, waitForRequester), Case.class, () -> {
                    Case c = lockVersion(caseId, expectedVersion);
                    requireNotClosed(c);
                    if (waitForRequester && "SYSTEM".equals(c.requesterType())) {
                        throw invalid("A case from the system has no requester to wait for");
                    }
                    addMessage(caseId, "STAFF", actor.id(), visibility, text);
                    update(caseId, waitForRequester ? State.WAITING_REQUESTER : c.state(), c.assignedStaffId(),
                            c.priority(), c.resolution());
                    if (visibility == Visibility.PUBLIC) {
                        publish(caseId);
                    }
                    return read(caseId);
                });
    }

    record ResolveRequest(UUID caseId, long expectedVersion, String resolution) {
    }

    @Override
    public Case resolve(Actor actor, UUID commandId, UUID caseId, long expectedVersion, String resolution) {
        authorize(actor, caseId);
        String text = text(resolution, 2000, "A resolution of 1 to 2000 characters");
        return commands.execute(new CommandKey(actor, "support.resolve", commandId),
                new ResolveRequest(caseId, expectedVersion, text), Case.class, () -> {
                    Case c = lockVersion(caseId, expectedVersion);
                    if (c.state() == State.RESOLVED || c.state() == State.CLOSED) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Already resolved");
                    }
                    update(caseId, State.RESOLVED, c.assignedStaffId(), c.priority(), text);
                    audit(actor, "support.resolve", c, text);
                    publish(caseId);
                    return read(caseId);
                });
    }

    @Override
    public Case reopen(Actor actor, UUID commandId, UUID caseId, long expectedVersion, String reason) {
        authorize(actor, caseId);
        String why = text(reason, 2000, "A reason is required");
        return commands.execute(new CommandKey(actor, "support.reopen", commandId),
                new ResolveRequest(caseId, expectedVersion, why), Case.class, () -> {
                    Case c = lockVersion(caseId, expectedVersion);
                    if (c.state() != State.RESOLVED) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Only a resolved case can be reopened");
                    }
                    update(caseId, c.assignedStaffId() == null ? State.OPEN : State.IN_PROGRESS, c.assignedStaffId(),
                            c.priority(), null);
                    audit(actor, "support.reopen", c, why);
                    return read(caseId);
                });
    }

    @Override
    public Case close(Actor actor, UUID commandId, UUID caseId, long expectedVersion, String reason) {
        authorize(actor, caseId);
        String why = text(reason, 2000, "A reason is required");
        return commands.execute(new CommandKey(actor, "support.close", commandId),
                new ResolveRequest(caseId, expectedVersion, why), Case.class, () -> {
                    Case c = lockVersion(caseId, expectedVersion);
                    requireNotClosed(c);
                    update(caseId, State.CLOSED, c.assignedStaffId(), c.priority(),
                            c.resolution() == null ? why : c.resolution());
                    audit(actor, "support.close", c, why);
                    publish(caseId);
                    return read(caseId);
                });
    }

    // ---------------------------------------------------------------- system (problem queues)

    /** Creates a case from a system event once per {@code sourceKey}; returns false when it already exists. */
    @Transactional(propagation = Propagation.MANDATORY)
    boolean openFromSystem(String sourceKey, UUID cityId, Category category, UUID orderId, String subject,
                           Priority priority, String internalNote) {
        try {
            UUID id = insertCase(cityId, category, orderId, "SYSTEM", null, subject, priority, sourceKey);
            addMessage(id, "SYSTEM", null, Visibility.INTERNAL, internalNote);
            return true;
        } catch (DuplicateKeyException already) {
            return false;
        }
    }

    /** REQ-USR-18: the open cases of a suspended member go back to the queue, comments kept. */
    @Transactional(propagation = Propagation.MANDATORY)
    int returnToQueue(UUID staffId, String note) {
        List<UUID> ids = jdbc.sql("""
                        select id from support_case
                        where assigned_staff_id = :staff and state not in ('RESOLVED', 'CLOSED')
                        order by id for update""")
                .param("staff", staffId).query(UUID.class).list();
        for (UUID id : ids) {
            Case c = read(id);
            update(id, c.state() == State.IN_PROGRESS ? State.OPEN : c.state(), null, c.priority(), c.resolution());
            addMessage(id, "SYSTEM", null, Visibility.INTERNAL, note);
        }
        return ids.size();
    }

    // ---------------------------------------------------------------- helpers

    private UUID insertCase(UUID cityId, Category category, UUID orderId, String requesterType, UUID requesterId,
                            String subject, Priority priority, String sourceKey) {
        UUID id = UUID.randomUUID();
        OffsetDateTime now = now();
        jdbc.sql("""
                        insert into support_case (id, city_id, category, order_id, requester_type, requester_id, subject,
                                                  priority, state, source_key, created_at, updated_at)
                        values (:id, :city, :category, :order, :type, :requester, :subject, :priority, 'OPEN',
                                :source, :now, :now)""")
                .param("id", id).param("city", cityId).param("category", category.name()).param("order", orderId)
                .param("type", requesterType).param("requester", requesterId).param("subject", subject)
                .param("priority", priority.name()).param("source", sourceKey).param("now", now).update();
        return id;
    }

    private void addMessage(UUID caseId, String authorType, UUID authorId, Visibility visibility, String body) {
        long sequence = jdbc.sql("select coalesce(max(sequence), 0) + 1 from support_message where case_id = :id")
                .param("id", caseId).query(Long.class).single();
        jdbc.sql("""
                        insert into support_message (id, case_id, sequence, author_type, author_id, visibility, body,
                                                     created_at)
                        values (:id, :case, :sequence, :type, :author, :visibility, :body, :now)""")
                .param("id", UUID.randomUUID()).param("case", caseId).param("sequence", sequence)
                .param("type", authorType).param("author", authorId).param("visibility", visibility.name())
                .param("body", body).param("now", now()).update();
    }

    private void update(UUID caseId, State state, UUID assignee, Priority priority, String resolution) {
        jdbc.sql("""
                        update support_case set state = :state, assigned_staff_id = :assignee, priority = :priority,
                                                resolution = :resolution, version = version + 1, updated_at = :now
                        where id = :id""")
                .param("state", state.name()).param("assignee", assignee).param("priority", priority.name())
                .param("resolution", resolution).param("now", now()).param("id", caseId).update();
    }

    private void touch(UUID caseId) {
        jdbc.sql("update support_case set version = version + 1, updated_at = :now where id = :id")
                .param("now", now()).param("id", caseId).update();
    }

    /** Lets the requester's apps refresh; no message text in the event. */
    private void publish(UUID caseId) {
        Case c = read(caseId);
        if ("SYSTEM".equals(c.requesterType())) {
            return;
        }
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("case_id", caseId.toString());
        payload.put("number", c.number());
        payload.put("state", c.state().name());
        payload.put("requester_type", c.requesterType());
        payload.put("requester_id", c.requesterId().toString());
        outbox.publish(new OutboxEvent("SupportCaseUpdated", 1, "SupportCase", caseId, c.version(), payload));
    }

    private void audit(Actor actor, String action, Case before, String reason) {
        audit.record(new AuditEntry(actor, action, "support_case", before.id().toString(), reason,
                Map.of("state", before.state().name(), "priority", before.priority().name(),
                        "assigned", String.valueOf(before.assignedStaffId())), null));
    }

    private Case authorize(Actor actor, UUID caseId) {
        Case c = jdbc.sql(SELECT + " where id = :id").param("id", caseId).query((rs, i) -> map(rs, List.of()))
                .optional().orElse(null);
        if (c == null) {
            staff.require(actor, MANAGE_PERMISSION);
            throw new DomainException(ErrorCode.NOT_FOUND, "Case not found");
        }
        requireCity(actor, c.cityId());
        return c;
    }

    /**
     * A case of a city needs support access there; a case without a city (no order behind it) is open only to staff
     * with all cities, since it may belong to any of them (issue #86).
     */
    private void requireCity(Actor actor, UUID cityId) {
        staff.require(actor, MANAGE_PERMISSION, cityId);
        if (cityId == null && !staff.scope(actor, MANAGE_PERMISSION).allCities()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Cases without a city are for staff with all cities");
        }
    }

    private Case lock(UUID caseId) {
        return jdbc.sql(SELECT + " where id = :id for update").param("id", caseId)
                .query((rs, i) -> map(rs, List.of())).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Case not found"));
    }

    private Case lockVersion(UUID caseId, long expectedVersion) {
        Case c = lock(caseId);
        if (c.version() != expectedVersion) {
            throw new DomainException(ErrorCode.VERSION_CONFLICT, "The case changed");
        }
        return c;
    }

    private static void requireNotClosed(Case c) {
        if (c.state() == State.CLOSED) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The case is closed");
        }
    }

    private Case read(UUID caseId) {
        List<Message> messages = jdbc.sql("""
                        select id, sequence, author_type, author_id, visibility, body, created_at
                        from support_message where case_id = :id order by sequence""")
                .param("id", caseId)
                .query((rs, i) -> new Message(rs.getObject(1, UUID.class), rs.getLong(2), rs.getString(3),
                        rs.getObject(4, UUID.class), Visibility.valueOf(rs.getString(5)), rs.getString(6),
                        rs.getObject(7, OffsetDateTime.class)))
                .list();
        return jdbc.sql(SELECT + " where id = :id").param("id", caseId).query((rs, i) -> map(rs, messages))
                .optional().orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Case not found"));
    }

    private Case ownCase(Actor requester, UUID caseId) {
        Case c = read(caseId);
        if (!requester.type().name().equals(c.requesterType()) || !requester.id().equals(c.requesterId())) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Case not found");
        }
        return c;
    }

    /** Only PUBLIC messages, and staff ids hidden, for the rider or driver. */
    private static Case publicView(Case c) {
        List<Message> visible = c.messages().stream().filter(m -> m.visibility() == Visibility.PUBLIC)
                .map(m -> "STAFF".equals(m.authorType())
                        ? new Message(m.id(), m.sequence(), m.authorType(), null, m.visibility(), m.body(), m.createdAt())
                        : m)
                .toList();
        return new Case(c.id(), c.number(), c.cityId(), c.category(), c.orderId(), c.requesterType(), c.requesterId(),
                c.subject(), c.priority(), c.state(), null, c.resolution(), c.version(), c.createdAt(), c.updatedAt(),
                visible);
    }

    private OrderView ownOrder(Actor requester, UUID orderId) {
        OrderView order;
        try {
            order = orders.get(orderId);
        } catch (DomainException missing) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Order not found");
        }
        boolean mine = requester.type() == SubjectType.CLIENT
                ? requester.id().equals(order.payerClientId())
                : order.assignment() != null && requester.id().equals(order.assignment().driverId());
        if (!mine) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Order not found");
        }
        return order;
    }

    private static void requireRequester(Actor actor) {
        if (actor == null || (actor.type() != SubjectType.CLIENT && actor.type() != SubjectType.DRIVER)) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Riders and drivers open cases here");
        }
    }

    private static Case map(ResultSet rs, List<Message> messages) throws SQLException {
        return new Case(rs.getObject("id", UUID.class), rs.getLong("number"), rs.getObject("city_id", UUID.class),
                Category.valueOf(rs.getString("category")), rs.getObject("order_id", UUID.class),
                rs.getString("requester_type"), rs.getObject("requester_id", UUID.class), rs.getString("subject"),
                Priority.valueOf(rs.getString("priority")), State.valueOf(rs.getString("state")),
                rs.getObject("assigned_staff_id", UUID.class), rs.getString("resolution"), rs.getLong("version"),
                rs.getObject("created_at", OffsetDateTime.class), rs.getObject("updated_at", OffsetDateTime.class),
                messages);
    }

    private static String text(String value, int max, String message) {
        String v = value == null ? "" : value.strip();
        if (v.isEmpty() || v.length() > max) {
            throw invalid(message);
        }
        return v;
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }

    private OffsetDateTime now() {
        return clock.instant().atOffset(ZoneOffset.UTC);
    }
}
