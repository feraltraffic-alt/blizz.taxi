package taxi.blizz.platform;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestRides;
import taxi.blizz.TestRides.Ride;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * The lead's own probe of PR #104 (CLAUDE.md: re-check the evidence): violations planted differently from the
 * contributor's fixtures, on the shared test database, must each give exactly one case; an old one outside the
 * journal window must give none.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class LeadInvariantProbeTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -54.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -54.45);

    @Autowired
    ApplicationContext context;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    TransactionTemplate tx;
    @Autowired
    OutboxRelay relay;
    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    SessionService auth;
    @Autowired
    QuoteService quotes;

    TestRides rides;
    UUID cityId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-lead-probe", "UAH", -55);
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", cityId).update();
    }

    private void scan(String module) {
        ((InvariantChecks) context.getBean(module + "Invariants")).runChecks();
        while (relay.runOnce() > 0) {
            // deliver
        }
    }

    private long cases(String check, UUID id) {
        return jdbc.sql("select count(*) from support_case where source_key = :key")
                .param("key", "invariant:" + check + ":" + id).query(Long.class).single();
    }

    /** A ride under way whose assignment was released by hand: the order (I3) and the driver (I2) disagree. */
    @Test
    void aRideWhoseAssignmentVanishedIsReportedForTheOrderAndTheDriver() {
        Ride ride = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID order = ride.order().id();
        UUID driver = ride.driver().actor().id();
        jdbc.sql("""
                        update assignment set state = 'RELEASED', created_at = now() - interval '10 minutes',
                                              closed_at = now() - interval '10 minutes'
                        where order_id = :o""").param("o", order).update();
        jdbc.sql("update ride_order set updated_at = now() - interval '10 minutes' where id = :o").param("o", order)
                .update();
        jdbc.sql("update driver_capacity set updated_at = now() - interval '10 minutes' where driver_id = :d")
                .param("d", driver).update();

        scan("operations");
        scan("operations");

        assertThat(cases("I3", order)).isEqualTo(1);
        assertThat(cases("I2", driver)).isEqualTo(1);
    }

    /** I1 looks back 48 hours: a fresh unbalanced posting is found, one from three days ago is not. */
    @Test
    void theJournalWindowFindsTheFreshUnbalancedPostingAndNotTheOldOne() {
        UUID fresh = unbalancedFarePosting("10 minutes");
        UUID old = unbalancedFarePosting("3 days");

        scan("finance");

        assertThat(cases("I1", fresh)).isEqualTo(1);
        assertThat(cases("I1", old)).as("outside the 48-hour window").isZero();
    }

    private UUID unbalancedFarePosting(String age) {
        Ride ride = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.complete(ride, true);
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", cityId).update();
        while (relay.runOnce() > 0) {
            // post the fare
        }
        UUID posting = jdbc.sql("""
                        select id from journal_transaction where basis_id = :o and basis_type = 'TRIP_FARE'""")
                .param("o", ride.order().id()).query(UUID.class).single();
        tx.executeWithoutResult(s -> {
            jdbc.sql("alter table journal_transaction disable trigger journal_transaction_append_only").update();
            jdbc.sql("alter table journal_line disable trigger journal_line_append_only").update();
            jdbc.sql("update journal_line set debit_minor = debit_minor + 1 where transaction_id = :t and debit_minor > 0")
                    .param("t", posting).update();
            jdbc.sql("update journal_transaction set occurred_at = now() - cast(:age as interval) where id = :t")
                    .param("age", age).param("t", posting).update();
            jdbc.sql("alter table journal_line enable trigger journal_line_append_only").update();
            jdbc.sql("alter table journal_transaction enable trigger journal_transaction_append_only").update();
        });
        return posting;
    }
}
