package taxi.blizz.operations.internal;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.identity.ClientErasing;
import taxi.blizz.payments.Chargebacks;

/**
 * A deleted rider named by phone as the contact of someone else's order (issue #144): the contact is deleted, the
 * order stays the payer's. On an order with an open chargeback the contact is held until it is decided.
 */
@Component
class ErasedOrderContacts implements ClientErasing {

    private final JdbcClient jdbc;
    private final OrderErasure erasure;
    private final Chargebacks chargebacks;

    ErasedOrderContacts(JdbcClient jdbc, OrderErasure erasure, Chargebacks chargebacks) {
        this.jdbc = jdbc;
        this.erasure = erasure;
        this.chargebacks = chargebacks;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void erasing(UUID clientId, String phone) {
        List<UUID> orders = jdbc.sql("select order_id from order_contact where phone = :phone")
                .param("phone", phone).query(UUID.class).list();
        Set<UUID> disputed = chargebacks.disputed(orders);
        disputed.forEach(order -> erasure.hold(clientId, "ORDER_CONTACT", order));
        erasure.removeContacts(orders.stream().filter(order -> !disputed.contains(order)).toList());
    }
}
