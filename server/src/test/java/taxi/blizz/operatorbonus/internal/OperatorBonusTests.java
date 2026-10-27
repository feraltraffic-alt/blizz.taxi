package taxi.blizz.operatorbonus.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.operatorbonus.OperatorBonuses;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.platform.SubjectType;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OperatorBonusTests {

    private static final String AREA = "SRID=4326;MULTIPOLYGON(((-140 10,-139 10,-139 11,-140 11,-140 10)))";

    @Autowired JdbcOperatorBonuses bonuses;
    @Autowired JdbcClient jdbc;

    private UUID city;
    private Actor operator;

    @BeforeEach
    void resetData() {
        jdbc.sql("delete from operator_bonus_period").update();
        jdbc.sql("delete from operator_bonus_entry").update();
        jdbc.sql("delete from operator_bonus_account").update();
        jdbc.sql("delete from operator_bonus_settings where version > 0").update();
        jdbc.sql("""
                update operator_bonus_settings set m = 1, g = 10, count_cancellations = true,
                    reset_day = 1, time_rules = '[]'::jsonb where version = 0
                """).update();
        city = UUID.randomUUID();
        jdbc.sql("""
                insert into city (id, code, name, currency, timezone, polygon, priority, state, created_at, updated_at)
                values (:id, :code, 'Operator bonus test', 'UAH', 'UTC', ST_GeomFromEWKT(:area),
                        1, 'PUBLISHED', now(), now())
                """).param("id", city).param("code", "bonus-" + city.toString().substring(0, 8))
                .param("area", AREA).update();
        operator = new Actor(SubjectType.STAFF, UUID.randomUUID());
    }

    @Test
    void sevenFulfilledAndOperatorFaultCancellationProduceMinusThreeAndRedeliveryIsIgnored() {
        OffsetDateTime created = OffsetDateTime.parse("2026-10-26T10:00:00Z");
        for (int i = 0; i < 7; i++) {
            UUID order = phoneOrder(operator.id(), created.plusMinutes(i));
            OutboxMessage event = event("TripCompleted", order, null);
            bonuses.handle(event);
            bonuses.handle(event);
        }
        UUID cancelled = phoneOrder(operator.id(), created.plusHours(1));
        OutboxMessage cancellation = event("OrderCancelled", cancelled, "OPERATOR_ERROR");
        bonuses.handle(cancellation);
        bonuses.handle(cancellation);

        OperatorBonuses.Account account = bonuses.mine(operator, 20);
        assertThat(account.balance()).isEqualTo(-3);
        assertThat(account.fulfilledCount()).isEqualTo(7);
        assertThat(account.cancelledCount()).isEqualTo(1);
        assertThat(account.lastEntries()).hasSize(8);

        jdbc.sql("update operator_bonus_settings set count_cancellations = false where version = 0").update();
        Actor other = new Actor(SubjectType.STAFF, UUID.randomUUID());
        for (int i = 0; i < 7; i++) {
            UUID order = phoneOrder(other.id(), created.plusDays(1).plusMinutes(i));
            bonuses.handle(event("TripCompleted", order, null));
        }
        UUID ignoredCancellation = phoneOrder(other.id(), created.plusDays(1).plusHours(1));
        bonuses.handle(event("OrderCancelled", ignoredCancellation, "OPERATOR_ERROR"));
        assertThat(bonuses.mine(other, 20).balance()).isEqualTo(7);
    }

    @Test
    void firstMatchingTimeRuleUsesOrderCreationTimeAndOtherCancellationsDoNothing() {
        jdbc.sql("""
                update operator_bonus_settings set m = 1, g = 10,
                    time_rules = '[{"key":"weekday-8","daysOfWeek":[1,2,3,4,5],"startHour":8,"endHour":9,"m":5,"g":1}]'::jsonb
                where version = 0
                """).update();
        OffsetDateTime mondayInside = OffsetDateTime.of(2026, 10, 26, 8, 30, 0, 0, ZoneOffset.UTC);
        OffsetDateTime mondayOutside = mondayInside.plusHours(1);

        UUID first = phoneOrder(operator.id(), mondayInside);
        UUID second = phoneOrder(operator.id(), mondayOutside);
        bonuses.handle(event("TripCompleted", first, null));
        bonuses.handle(event("TripCompleted", second, null));
        assertThat(bonuses.mine(operator, 10).balance()).isEqualTo(6);
        assertThat(jdbc.sql("select rule_key from operator_bonus_entry where order_id = :id")
                .param("id", first).query(String.class).single()).isEqualTo("weekday-8");
        assertThat(jdbc.sql("select rule_key from operator_bonus_entry where order_id = :id")
                .param("id", second).query(String.class).single()).isEqualTo("default");

        UUID ordinaryCancel = phoneOrder(operator.id(), mondayInside.plusDays(1));
        bonuses.handle(event("OrderCancelled", ordinaryCancel, "PASSENGER_ASKED"));
        UUID appOrder = order(operator.id(), mondayInside.plusDays(1), "APP");
        bonuses.handle(event("TripCompleted", appOrder, null));
        assertThat(bonuses.mine(operator, 10).balance()).isEqualTo(6);
    }

    @Test
    void resetIsIdempotentAndStartsEmptyPeriod() {
        OffsetDateTime created = OffsetDateTime.now(ZoneOffset.UTC).minusDays(40);
        UUID order = phoneOrder(operator.id(), created);
        bonuses.handle(event("TripCompleted", order, null));
        assertThat(bonuses.mine(operator, 10).balance()).isEqualTo(1);

        bonuses.resetDueAccounts();
        bonuses.resetDueAccounts();

        assertThat(bonuses.mine(operator, 10).balance()).isZero();
        assertThat(jdbc.sql("select count(*) from operator_bonus_period where staff_id = :staff")
                .param("staff", operator.id()).query(Long.class).single()).isEqualTo(1);
    }

    @Test
    void managementApisRejectNonStaff() {
        Actor rider = new Actor(SubjectType.CLIENT, UUID.randomUUID());
        assertThatThrownBy(() -> bonuses.currentSettings(rider))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.ACCESS_DENIED);
    }

    private UUID phoneOrder(UUID staffId, OffsetDateTime createdAt) {
        return order(staffId, createdAt, "PHONE");
    }

    private UUID order(UUID creatorId, OffsetDateTime createdAt, String channel) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                insert into ride_order (id, channel, created_by_type, created_by_id, city_id, vehicle_class,
                    pickup, pickup_label, dropoff, dropoff_label, payment_method, status, created_at, updated_at, version)
                values (:id, :channel, 'STAFF', :creator, :city, 'STANDARD',
                    ST_SetSRID(ST_MakePoint(-139.8, 10.2), 4326), 'A',
                    ST_SetSRID(ST_MakePoint(-139.7, 10.3), 4326), 'B', 'CASH', 'FULFILLED', :created, :created, 1)
                """).param("id", id).param("channel", channel).param("creator", creatorId)
                .param("city", city).param("created", createdAt).update();
        return id;
    }

    private OutboxMessage event(String type, UUID orderId, String reasonCode) {
        String payload = reasonCode == null
                ? "{\"order_id\":\"" + orderId + "\"}"
                : "{\"order_id\":\"" + orderId + "\",\"reason_code\":\"" + reasonCode + "\"}";
        return new OutboxMessage(UUID.randomUUID(), type, 1, "Order", orderId, 1, payload,
                UUID.randomUUID(), OffsetDateTime.now(ZoneOffset.UTC), 0);
    }
}
