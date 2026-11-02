package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Ratings;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcRatings implements Ratings {

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final ServiceSettings settings;
    private final StaffAccess staff;
    private final Outbox outbox;
    private final Clock clock;

    JdbcRatings(JdbcClient jdbc, IdempotentCommands commands, ServiceSettings settings, StaffAccess staff,
                Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.settings = settings;
        this.staff = staff;
        this.outbox = outbox;
        this.clock = clock;
    }

    record SubmitRequest(UUID orderId, String authorType, UUID authorId, int score, String comment) {
    }

    record Context(UUID payerId, UUID driverId, UUID cityId, OffsetDateTime completedAt) {
    }

    record RatingSubmitted(UUID orderId, String authorType, String targetType, UUID targetId, int score) {
    }

    @Override
    public Rating submit(Actor actor, UUID commandId, UUID orderId, int score, String comment) {
        String authorType = participantType(actor);
        String cleanComment = cleanComment(comment);
        if (score < 1 || score > 5) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "score must be between 1 and 5");
        }
        SubmitRequest request = new SubmitRequest(orderId, authorType, actor.id(), score, cleanComment);
        return commands.execute(new CommandKey(actor, "rating.submit", commandId), request, Rating.class,
                () -> submitInsideCommand(actor, orderId, authorType, score, cleanComment));
    }

    private Rating submitInsideCommand(Actor actor, UUID orderId, String authorType, int score, String comment) {
        Context context = context(orderId, true);
        Target target = target(actor, context);
        OffsetDateTime now = now();
        int editWindowHours = settings.ofCity(context.cityId()).settings().ratings().editWindowHours();
        if (now.isAfter(context.completedAt().plusHours(editWindowHours))) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The rating edit window has closed");
        }

        jdbc.sql("""
                        update rating set superseded_at = :now
                        where order_id = :orderId and author_type = :authorType and author_id = :authorId
                          and superseded_at is null
                        """)
                .param("now", now).param("orderId", orderId).param("authorType", authorType)
                .param("authorId", actor.id()).update();

        UUID ratingId = UUID.randomUUID();
        jdbc.sql("""
                        insert into rating (id, order_id, author_type, author_id, target_type, target_id,
                                            score, comment, created_at)
                        values (:id, :orderId, :authorType, :authorId, :targetType, :targetId,
                                :score, :comment, :createdAt)
                        """)
                .param("id", ratingId).param("orderId", orderId).param("authorType", authorType)
                .param("authorId", actor.id()).param("targetType", target.type()).param("targetId", target.id())
                .param("score", score).param("comment", comment).param("createdAt", now).update();

        outbox.publish(new OutboxEvent("RatingSubmitted", 1, "Rating", ratingId, 1,
                new RatingSubmitted(orderId, authorType, target.type(), target.id(), score)));
        return new Rating(orderId, score, now);
    }

    @Override
    @Transactional(readOnly = true)
    public Rating mine(Actor actor, UUID orderId) {
        String authorType = participantType(actor);
        Context context = context(orderId, false);
        target(actor, context); // membership check; strangers get the same 404 as unknown orders
        return jdbc.sql("""
                        select score, created_at from rating
                        where order_id = :orderId and author_type = :authorType and author_id = :authorId
                          and superseded_at is null
                        """)
                .param("orderId", orderId).param("authorType", authorType).param("authorId", actor.id())
                .query((rs, i) -> new Rating(orderId, rs.getInt("score"),
                        rs.getObject("created_at", OffsetDateTime.class)))
                .optional().orElseThrow(JdbcRatings::notFound);
    }

    @Override
    @Transactional(readOnly = true)
    public DriverSummary driverSummary(Actor actor) {
        if (actor.type() != SubjectType.DRIVER) {
            throw notFound();
        }
        return jdbc.sql("""
                        select coalesce(sum(score), 0) as score_sum, count(*) as count
                        from rating
                        where target_type = 'DRIVER' and target_id = :driverId and superseded_at is null
                        """)
                .param("driverId", actor.id())
                .query((rs, i) -> {
                    long sum = rs.getLong("score_sum");
                    long count = rs.getLong("count");
                    // Integer hundredths, rounded half up; no floating point anywhere in the figure.
                    long average = count == 0 ? 0 : (sum * 100 + count / 2) / count;
                    return new DriverSummary(sum, count, average);
                }).single();
    }

    @Override
    @Transactional(readOnly = true)
    public List<StaffRating> forStaff(Actor actor, UUID orderId) {
        UUID cityId = jdbc.sql("select city_id from ride_order where id = :id")
                .param("id", orderId).query(UUID.class).optional().orElseThrow(JdbcRatings::notFound);
        staff.require(actor, Orders.VIEW_PERMISSION, cityId);
        return jdbc.sql("""
                        select author_type, author_id, target_type, target_id, score, comment, created_at
                        from rating where order_id = :orderId and superseded_at is null
                        order by created_at, author_type
                        """)
                .param("orderId", orderId)
                .query((rs, i) -> new StaffRating(orderId, rs.getString("author_type"),
                        rs.getObject("author_id", UUID.class), rs.getString("target_type"),
                        rs.getObject("target_id", UUID.class), rs.getInt("score"), rs.getString("comment"),
                        rs.getObject("created_at", OffsetDateTime.class)))
                .list();
    }

    private Context context(UUID orderId, boolean lock) {
        String suffix = lock ? " for update of o" : "";
        return jdbc.sql("""
                        select o.payer_client_id, a.driver_id, o.city_id, t.completed_at
                        from ride_order o
                        join trip t on t.order_id = o.id and t.phase = 'COMPLETED'
                        join assignment a on a.id = t.assignment_id
                        where o.id = :orderId and o.status = 'FULFILLED' and o.payer_client_id is not null
                        """ + suffix)
                .param("orderId", orderId)
                .query((rs, i) -> new Context(rs.getObject("payer_client_id", UUID.class),
                        rs.getObject("driver_id", UUID.class), rs.getObject("city_id", UUID.class),
                        rs.getObject("completed_at", OffsetDateTime.class)))
                .optional().orElseThrow(JdbcRatings::notFound);
    }

    private record Target(String type, UUID id) {
    }

    private static Target target(Actor actor, Context context) {
        if (actor.type() == SubjectType.CLIENT && actor.id().equals(context.payerId())) {
            return new Target("DRIVER", context.driverId());
        }
        if (actor.type() == SubjectType.DRIVER && actor.id().equals(context.driverId())) {
            return new Target("RIDER", context.payerId());
        }
        throw notFound();
    }

    private static String participantType(Actor actor) {
        return switch (actor.type()) {
            case CLIENT -> "RIDER";
            case DRIVER -> "DRIVER";
            default -> throw notFound();
        };
    }

    private static String cleanComment(String comment) {
        if (comment == null || comment.isBlank()) {
            return null;
        }
        String clean = comment.strip();
        if (clean.length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "comment must have at most 500 characters");
        }
        return clean;
    }

    private OffsetDateTime now() {
        return clock.instant().atOffset(ZoneOffset.UTC);
    }

    private static DomainException notFound() {
        return new DomainException(ErrorCode.NOT_FOUND, "Order not found");
    }
}
