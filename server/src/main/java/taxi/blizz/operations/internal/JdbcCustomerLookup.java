package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.ClientLookup;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.CustomerLookup;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.RateLimits;

/**
 * See {@link CustomerLookup}. The order: permission, budget, the phone's shape, then the lookup and its audit; the
 * audit is written in a transaction of its own, so a miss (404) leaves its trace too.
 */
@Service
class JdbcCustomerLookup implements CustomerLookup {

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final RateLimits rateLimits;
    private final ClientLookup clients;
    private final AuditLog audit;
    private final TransactionTemplate separate;

    JdbcCustomerLookup(JdbcClient jdbc, StaffAccess staff, RateLimits rateLimits, ClientLookup clients,
                       AuditLog audit, PlatformTransactionManager transactions) {
        this.jdbc = jdbc;
        this.staff = staff;
        this.rateLimits = rateLimits;
        this.clients = clients;
        this.audit = audit;
        this.separate = new TransactionTemplate(transactions);
        this.separate.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }

    @Override
    public Customer lookup(Actor actor, String phone) {
        StaffAccess.Scope scope = staff.scope(actor, PERMISSION);
        if (!scope.allCities() && scope.cityIds().isEmpty()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Looking up a rider needs " + PERMISSION);
        }
        rateLimits.acquire(RateLimits.CUSTOMER_LOOKUP, actor);
        ClientLookup.Lookup found = clients.byPhone(actor, phone);
        // The phone only as its keyed digest; the outcome and, on a hit, whom it found.
        Map<String, Object> trace = new LinkedHashMap<>();
        trace.put("phone_digest", found.phoneDigest());
        trace.put("outcome", found.client() == null ? "NOT_FOUND" : "FOUND");
        if (found.client() != null) {
            trace.put("client_id", found.client().id().toString());
        }
        separate.executeWithoutResult(status -> audit.record(new AuditEntry(actor, "customer.lookup", "client",
                found.client() == null ? null : found.client().id().toString(), "Operator lookup by phone", null,
                trace)));
        if (found.client() == null) {
            throw new DomainException(ErrorCode.NOT_FOUND, "No rider has this phone");
        }
        UUID[] cities = scope.cityIds().toArray(UUID[]::new);
        List<Order> recent = jdbc.sql("""
                        select id, short_number, status, city_id, pickup_label, dropoff_label, created_at
                        from ride_order
                        where payer_client_id = :client and city_id = any(:cities)
                        order by created_at desc, id desc
                        limit :limit""")
                .param("client", found.client().id()).param("cities", cities)
                .param("limit", ORDERS)
                .query((rs, i) -> new Order(rs.getObject(1, UUID.class), rs.getLong(2), rs.getString(3),
                        rs.getObject(4, UUID.class), rs.getString(5), rs.getString(6),
                        rs.getObject(7, OffsetDateTime.class)))
                .list();
        return new Customer(found.client().id(), found.client().name(), found.client().accountState(), recent);
    }
}
