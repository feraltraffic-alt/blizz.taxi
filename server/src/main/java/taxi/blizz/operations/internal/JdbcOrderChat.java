package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.OrderChat;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcOrderChat implements OrderChat {

    private static final String SELECT = """
            select id, order_id, sequence, sender_role, body, sent_at from order_message
            """;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final OrderCore core;
    private final Outbox outbox;
    private final AuditLog audit;
    private final StaffAccess staff;

    JdbcOrderChat(JdbcClient jdbc, IdempotentCommands commands, OrderCore core, Outbox outbox, AuditLog audit,
                  StaffAccess staff) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.core = core;
        this.outbox = outbox;
        this.audit = audit;
        this.staff = staff;
    }

    record PostRequest(UUID orderId, String body) {
    }

    /**
     * The rider and the driver of the order's last assignment. {@code driverLeft}: that assignment ended
     * because the driver withdrew or staff took him off — he is no longer the order's driver.
     */
    private record Party(UUID payerClientId, UUID assignmentId, UUID driverId, boolean driverLeft,
                         OffsetDateTime assignmentClosedAt) {
    }

    /**
     * After the assignment ends (trip done or cancelled) both sides may still write this long, e.g. about a forgotten
     * item; then the chat is read-only and contact goes through support (owner decision 29.10.2026, REQ-SEC-04).
     */
    static final java.time.Duration WRITE_AFTER_END = java.time.Duration.ofHours(24);

    @Override
    public Message post(Actor sender, UUID commandId, UUID orderId, String body) {
        String text = body == null ? "" : body.strip();
        if (text.isEmpty() || text.length() > 1000) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A message has 1 to 1000 characters");
        }
        if (sender.type() != SubjectType.CLIENT && sender.type() != SubjectType.DRIVER) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only the rider and the driver write in the chat");
        }
        return commands.execute(new CommandKey(sender, "order.message", commandId), new PostRequest(orderId, text),
                Message.class, () -> {
                    core.lockOrder(orderId);
                    Party party = party(orderId);
                    String role = role(sender, party);
                    // Open once a driver is assigned (owner decision 27.10.2026); readable in the order history for
                    // good, writable until WRITE_AFTER_END after the assignment ended (owner decision 29.10.2026).
                    if (party.assignmentId() == null) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "No driver has been assigned to this order");
                    }
                    if (party.assignmentClosedAt() != null
                            && party.assignmentClosedAt().plus(WRITE_AFTER_END).isBefore(core.now())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "The chat of this order is closed; contact support");
                    }
                    long sequence = jdbc.sql("select coalesce(max(sequence), 0) + 1 from order_message where order_id = :id")
                            .param("id", orderId).query(Long.class).single();
                    UUID id = UUID.randomUUID();
                    OffsetDateTime now = core.now();
                    jdbc.sql("""
                                    insert into order_message (id, order_id, sequence, assignment_id, sender_role,
                                                               sender_id, body, sent_at)
                                    values (:id, :order, :sequence, :assignment, :role, :sender, :body, :now)""")
                            .param("id", id).param("order", orderId).param("sequence", sequence)
                            .param("assignment", party.assignmentId()).param("role", role)
                            .param("sender", sender.id()).param("body", text).param("now", now)
                            .update();
                    // The body stays out of the event: it goes only to the addressed party through the API (REQ-NTF-04).
                    UUID recipient = "RIDER".equals(role) ? party.driverId() : party.payerClientId();
                    Map<String, Object> event = new java.util.LinkedHashMap<>();
                    event.put("order_id", orderId.toString());
                    event.put("message_id", id.toString());
                    event.put("sequence", sequence);
                    event.put("sender_role", role);
                    event.put("recipient_role", "RIDER".equals(role) ? "DRIVER" : "RIDER");
                    event.put("recipient_id", recipient == null ? null : recipient.toString());
                    outbox.publish(new OutboxEvent("OrderMessagePosted", 1, "OrderChat", orderId, sequence, event));
                    return new Message(id, orderId, sequence, role, text, now);
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<Message> messages(Actor reader, UUID orderId, long afterSequence, int limit) {
        int size = Math.max(1, Math.min(limit, 100));
        if (reader.type() == SubjectType.CLIENT) {
            Party party = party(orderId);
            if (!reader.id().equals(party.payerClientId())) {
                throw new DomainException(ErrorCode.NOT_FOUND, "Order not found");
            }
            return jdbc.sql(SELECT + " where order_id = :order and sequence > :after order by sequence limit :limit")
                    .param("order", orderId).param("after", afterSequence).param("limit", size)
                    .query((rs, i) -> map(rs)).list();
        }
        if (reader.type() == SubjectType.DRIVER) {
            // Only the assignments of this driver on the order; never another driver's conversation.
            return jdbc.sql(SELECT + """
                             where order_id = :order and sequence > :after
                               and assignment_id in (select id from assignment where order_id = :order
                                                     and driver_id = :driver)
                             order by sequence limit :limit""")
                    .param("order", orderId).param("after", afterSequence).param("driver", reader.id())
                    .param("limit", size)
                    .query((rs, i) -> map(rs)).list();
        }
        throw new DomainException(ErrorCode.ACCESS_DENIED, "Staff read the chat through the order details");
    }

    @Override
    @Transactional
    public List<Message> conversation(Actor actor, UUID orderId, String reason) {
        UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                .query(UUID.class).optional().orElse(null);
        staff.require(actor, VIEW_PERMISSION, cityId);
        if (cityId == null) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Order not found");
        }
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required to read a conversation");
        }
        List<Message> all = jdbc.sql(SELECT + " where order_id = :order order by sequence")
                .param("order", orderId).query((rs, i) -> map(rs)).list();
        audit.record(new AuditEntry(actor, "order.chat.read", "ride_order", orderId.toString(), reason, null,
                Map.of("messages", all.size())));
        return all;
    }

    @Override
    @Transactional(readOnly = true)
    public UUID orderOfTrip(Actor driver, UUID tripId) {
        return jdbc.sql("""
                        select t.order_id from trip t join assignment a on a.id = t.assignment_id
                        where t.id = :trip and a.driver_id = :driver""")
                .param("trip", tripId).param("driver", driver.id())
                .query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Trip not found"));
    }

    private Party party(UUID orderId) {
        return jdbc.sql("""
                        select o.payer_client_id, a.id, a.driver_id,
                               coalesce(a.state = 'REVOKED' or a.close_reason like 'DRIVER_WITHDREW%', false),
                               a.closed_at
                        from ride_order o
                        left join lateral (select id, driver_id, state, close_reason, closed_at from assignment
                                           where order_id = o.id order by created_at desc limit 1) a on true
                        where o.id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new Party(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, UUID.class), rs.getBoolean(4), rs.getObject(5, OffsetDateTime.class)))
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
    }

    private static String role(Actor sender, Party party) {
        if (sender.type() == SubjectType.CLIENT && sender.id().equals(party.payerClientId())) {
            return "RIDER";
        }
        if (sender.type() == SubjectType.DRIVER && sender.id().equals(party.driverId()) && !party.driverLeft()) {
            return "DRIVER";
        }
        throw new DomainException(ErrorCode.NOT_FOUND, "Order not found");
    }

    private static Message map(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Message(rs.getObject("id", UUID.class), rs.getObject("order_id", UUID.class),
                rs.getLong("sequence"), rs.getString("sender_role"), rs.getString("body"),
                rs.getObject("sent_at", OffsetDateTime.class));
    }
}
