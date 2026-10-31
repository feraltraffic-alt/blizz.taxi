package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * What a rider's deletion does to orders (issue #144, REQ-PRV-04, REQ-PRV-06). The facts stay — status, price, fare,
 * times, the driver — and what points at the person goes: the labels become "—", the note and the entrance
 * "[deleted]", the points are rounded to two decimals (about 1 km: the city and zone statistics and the fare survive,
 * the address does not), the contact is deleted, and what the rider wrote in the chat and in the rating becomes
 * "[deleted]". What the driver wrote stays: it is the driver's.
 *
 * <p>An order with an open chargeback keeps all of it under a {@code privacy_hold} until the chargeback is decided
 * ({@link PrivacyHoldSweep}). Every step is idempotent.
 */
@Component
class OrderErasure {

    static final String DELETED = "[deleted]";
    static final String NO_LABEL = "—";

    private final JdbcClient jdbc;
    private final Clock clock;

    OrderErasure(JdbcClient jdbc, Clock clock) {
        this.jdbc = jdbc;
        this.clock = clock;
    }

    /** The rider's own orders: anonymized, in the caller's transaction. */
    @Transactional(propagation = Propagation.MANDATORY)
    void anonymize(Collection<UUID> orderIds, UUID clientId) {
        if (orderIds.isEmpty()) {
            return;
        }
        List<UUID> ids = List.copyOf(orderIds);
        jdbc.sql("""
                        update ride_order
                        set pickup_label = :label, dropoff_label = :label,
                            comment = case when comment is null then null else :deleted end,
                            entrance = case when entrance is null then null else :deleted end,
                            pickup = ST_SetSRID(ST_MakePoint(round(ST_X(pickup)::numeric, 2),
                                                             round(ST_Y(pickup)::numeric, 2)), ST_SRID(pickup)),
                            dropoff = ST_SetSRID(ST_MakePoint(round(ST_X(dropoff)::numeric, 2),
                                                              round(ST_Y(dropoff)::numeric, 2)), ST_SRID(dropoff)),
                            updated_at = :now, version = version + 1
                        where id in (:ids)
                          and (pickup_label <> :label or dropoff_label <> :label
                               or coalesce(comment, :deleted) <> :deleted or coalesce(entrance, :deleted) <> :deleted
                               or ST_X(pickup) <> round(ST_X(pickup)::numeric, 2)
                               or ST_Y(pickup) <> round(ST_Y(pickup)::numeric, 2)
                               or ST_X(dropoff) <> round(ST_X(dropoff)::numeric, 2)
                               or ST_Y(dropoff) <> round(ST_Y(dropoff)::numeric, 2))""")
                .param("label", NO_LABEL).param("deleted", DELETED).param("now", now()).param("ids", ids).update();
        jdbc.sql("""
                        update trip
                        set interrupted_at_point = ST_SetSRID(ST_MakePoint(
                                round(ST_X(interrupted_at_point)::numeric, 2),
                                round(ST_Y(interrupted_at_point)::numeric, 2)), ST_SRID(interrupted_at_point))
                        where order_id in (:ids) and interrupted_at_point is not null""")
                .param("ids", ids).update();
        jdbc.sql("delete from order_contact where order_id in (:ids)").param("ids", ids).update();
        jdbc.sql("""
                        update order_message set body = :deleted
                        where order_id in (:ids) and sender_role = 'RIDER' and body <> :deleted""")
                .param("deleted", DELETED).param("ids", ids).update();
        jdbc.sql("""
                        update rating set comment = :deleted
                        where order_id in (:ids) and author_type = 'RIDER' and author_id = :client
                          and comment is not null and comment <> :deleted""")
                .param("deleted", DELETED).param("ids", ids).param("client", clientId).update();
    }

    /** Someone else's orders that name the deleted rider as the contact: the contact is deleted. */
    @Transactional(propagation = Propagation.MANDATORY)
    void removeContacts(Collection<UUID> orderIds) {
        if (!orderIds.isEmpty()) {
            jdbc.sql("delete from order_contact where order_id in (:ids)").param("ids", List.copyOf(orderIds))
                    .update();
        }
    }

    /** Records why the deleted rider's data on the order stays; a repeat records nothing more. */
    @Transactional(propagation = Propagation.MANDATORY)
    void hold(UUID clientId, String objectType, UUID orderId) {
        jdbc.sql("""
                        insert into privacy_hold (id, subject_type, subject_id, object_type, object_id, basis,
                                                  created_at)
                        values (:id, 'CLIENT', :client, :type, :order, 'CHARGEBACK', :now)
                        on conflict (subject_id, object_type, object_id, basis) where released_at is null do nothing""")
                .param("id", UUID.randomUUID()).param("client", clientId).param("type", objectType)
                .param("order", orderId).param("now", now()).update();
    }

    OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
