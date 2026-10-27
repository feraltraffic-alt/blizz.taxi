package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.OrderChannel;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/** Adds the cross-module origin read without exposing the ride_order table outside operations (ADR 0004). */
@Service
@Primary
class OriginAwareOrders implements Orders {

    private final JdbcOrders delegate;
    private final JdbcClient jdbc;

    OriginAwareOrders(JdbcOrders delegate, JdbcClient jdbc) {
        this.delegate = delegate;
        this.jdbc = jdbc;
    }

    @Override public OrderView create(Actor actor, UUID commandId, CreateOrder order) { return delegate.create(actor, commandId, order); }
    @Override public OrderView cancel(Actor actor, UUID commandId, UUID orderId, long expectedVersion, String reasonCode) { return delegate.cancel(actor, commandId, orderId, expectedVersion, reasonCode); }
    @Override public OrderView revokeAssignment(Actor staff, UUID commandId, UUID orderId, long expectedVersion, String reason) { return delegate.revokeAssignment(staff, commandId, orderId, expectedVersion, reason); }
    @Override public OrderView get(UUID orderId) { return delegate.get(orderId); }
    @Override public List<OrderView> inCity(Actor staff, UUID cityId, boolean activeOnly, OffsetDateTime before, int limit) { return delegate.inCity(staff, cityId, activeOnly, before, limit); }
    @Override public List<HistoryItem> history(Actor payer, OffsetDateTime before, int limit) { return delegate.history(payer, before, limit); }
    @Override public List<TimelineEntry> timeline(Actor staff, UUID orderId) { return delegate.timeline(staff, orderId); }
    @Override public Interrupted interrupt(Actor staff, UUID commandId, UUID orderId, long expectedVersion, Interruption interruption) { return delegate.interrupt(staff, commandId, orderId, expectedVersion, interruption); }
    @Override public Optional<Participants> participants(UUID orderId) { return delegate.participants(orderId); }
    @Override public Optional<OrderView> active(UUID payerClientId) { return delegate.active(payerClientId); }

    @Override
    @Transactional(readOnly = true)
    public Optional<Origin> origin(UUID orderId) {
        return jdbc.sql("""
                        select id, channel, created_by_type, created_by_id, city_id, created_at
                        from ride_order where id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new Origin(rs.getObject("id", UUID.class),
                        OrderChannel.valueOf(rs.getString("channel")),
                        SubjectType.valueOf(rs.getString("created_by_type")),
                        rs.getObject("created_by_id", UUID.class), rs.getObject("city_id", UUID.class),
                        rs.getObject("created_at", OffsetDateTime.class)))
                .optional();
    }
}
