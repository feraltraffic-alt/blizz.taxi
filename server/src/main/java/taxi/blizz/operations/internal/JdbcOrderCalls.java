package taxi.blizz.operations.internal;

import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.operations.OrderCalls;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcOrderCalls implements OrderCalls {

    private final JdbcClient jdbc;
    private final ServiceSettings settings;
    private final AccountDirectory accounts;

    JdbcOrderCalls(JdbcClient jdbc, ServiceSettings settings, AccountDirectory accounts) {
        this.jdbc = jdbc;
        this.settings = settings;
        this.accounts = accounts;
    }

    private record RiderFacts(String status, UUID driverId) {
    }

    private record DriverFacts(UUID orderId, String orderStatus, String assignmentState, UUID payerClientId) {
    }

    @Override
    @Transactional(readOnly = true)
    public CallTarget forRider(Actor rider, UUID orderId) {
        if (rider.type() != SubjectType.CLIENT) {
            throw notFound();
        }
        String status = jdbc.sql("select status from ride_order where id = :id and payer_client_id = :payer")
                .param("id", orderId).param("payer", rider.id()).query(String.class).optional()
                .orElseThrow(JdbcOrderCalls::notFound);
        if (!activeOrder(status)) {
            throw conflict();
        }
        UUID driverId = jdbc.sql("""
                        select driver_id from assignment
                        where order_id = :order and state = 'COMMITTED'
                        order by created_at desc limit 1""")
                .param("order", orderId).query(UUID.class).optional().orElseThrow(JdbcOrderCalls::conflict);
        return target(new Actor(SubjectType.DRIVER, driverId), null);
    }

    @Override
    @Transactional(readOnly = true)
    public CallTarget forDriver(Actor driver, UUID tripId) {
        if (driver.type() != SubjectType.DRIVER) {
            throw notFound();
        }
        DriverFacts facts = jdbc.sql("""
                        select t.order_id, o.status, a.state, o.payer_client_id
                        from trip t
                        join assignment a on a.id = t.assignment_id
                        join ride_order o on o.id = t.order_id
                        where t.id = :trip and a.driver_id = :driver""")
                .param("trip", tripId).param("driver", driver.id())
                .query((rs, i) -> new DriverFacts(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3),
                        rs.getObject(4, UUID.class)))
                .optional().orElseThrow(JdbcOrderCalls::notFound);
        if ("RELEASED".equals(facts.assignmentState()) || "REVOKED".equals(facts.assignmentState())) {
            throw notFound();
        }
        if (!"COMMITTED".equals(facts.assignmentState()) || !activeOrder(facts.orderStatus())) {
            throw conflict();
        }
        String caller = jdbc.sql("select phone from order_contact where order_id = :order")
                .param("order", facts.orderId()).query(String.class).optional().orElse(null);
        Actor payer = facts.payerClientId() == null ? null : new Actor(SubjectType.CLIENT, facts.payerClientId());
        return target(payer, caller);
    }

    private CallTarget target(Actor directSubject, String directPhone) {
        ServiceSettings.Calls calls = settings.current().settings().calls();
        if (calls.mode() == ServiceSettings.CallMode.VIA_SERVICE_NUMBERS) {
            return new CallTarget(Mode.VIA_SERVICE_NUMBERS, calls.servicePhone());
        }
        String phone = directPhone;
        if (phone == null && directSubject != null) {
            phone = accounts.phone(directSubject).orElse(null);
        }
        if (phone == null) {
            throw conflict();
        }
        return new CallTarget(Mode.DIRECT, phone);
    }

    private static boolean activeOrder(String status) {
        return "ASSIGNED".equals(status) || "IN_SERVICE".equals(status);
    }

    private static DomainException notFound() {
        return new DomainException(ErrorCode.NOT_FOUND, "Order call is not available");
    }

    private static DomainException conflict() {
        return new DomainException(ErrorCode.STATE_CONFLICT, "Order call is not available in this state");
    }
}
