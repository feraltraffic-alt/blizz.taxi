package taxi.blizz.identity.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.identity.ClientDeletions;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcClientDeletions implements ClientDeletions {

    private final JdbcClient jdbc;
    private final SessionService sessions;
    private final Outbox outbox;
    private final Clock clock;

    JdbcClientDeletions(JdbcClient jdbc, SessionService sessions, Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.sessions = sessions;
        this.outbox = outbox;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pending> pending(OffsetDateTime after, int limit) {
        var query = jdbc.sql("""
                        select id, deletion_previous_state, deletion_requested_at from client
                        where account_state = 'DELETION_PENDING'"""
                        + (after == null ? "" : " and deletion_requested_at > :after")
                        + " order by deletion_requested_at, id limit :limit")
                .param("limit", Math.max(1, Math.min(limit, 100)));
        if (after != null) {
            query = query.param("after", after);
        }
        return query.query((rs, i) -> new Pending(rs.getObject(1, UUID.class), rs.getString(2),
                        rs.getObject(3, OffsetDateTime.class)))
                .list();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pending> pending(UUID clientId) {
        return jdbc.sql("""
                        select id, deletion_previous_state, deletion_requested_at from client
                        where id = :id and account_state = 'DELETION_PENDING'""")
                .param("id", clientId)
                .query((rs, i) -> new Pending(rs.getObject(1, UUID.class), rs.getString(2),
                        rs.getObject(3, OffsetDateTime.class)))
                .optional();
    }

    @Override
    @Transactional
    public void anonymize(UUID clientId) {
        lockPending(clientId);
        long version = jdbc.sql("""
                        update client set account_state = 'ANONYMIZED', phone_normalized = null,
                                          phone_verified_at = null, name = null, language = null,
                                          deletion_previous_state = null, updated_at = :now, version = version + 1
                        where id = :id returning version""")
                .param("now", now()).param("id", clientId).query(Long.class).single();
        sessions.revokeAll(new Actor(SubjectType.CLIENT, clientId), "ACCOUNT_ANONYMIZED");
        outbox.publish(new OutboxEvent("ClientAnonymized", 1, "Client", clientId, version,
                Map.of("client_id", clientId.toString())));
    }

    @Override
    @Transactional
    public void restore(UUID clientId) {
        lockPending(clientId);
        jdbc.sql("""
                        update client set account_state = deletion_previous_state, deletion_previous_state = null,
                                          deletion_requested_at = null, updated_at = :now, version = version + 1
                        where id = :id""")
                .param("now", now()).param("id", clientId).update();
    }

    private void lockPending(UUID clientId) {
        String state = jdbc.sql("select account_state from client where id = :id for update")
                .param("id", clientId).query(String.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Client not found"));
        if (!"DELETION_PENDING".equals(state)) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The client has no pending deletion request");
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
