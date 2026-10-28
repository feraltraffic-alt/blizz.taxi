package taxi.blizz.platform;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.pricing.QuoteService;

/** Budgets per account for quotes, orders, offers and uploads (REQ-SEC-03). */
@SpringBootTest(properties = {
        "blizz.rate-limits.buckets.quote.max=2", "blizz.rate-limits.buckets.quote.window=PT1H",
        "blizz.rate-limits.buckets.file-upload.max=1", "blizz.rate-limits.buckets.file-upload.window=PT1H"})
@Import(TestcontainersConfiguration.class)
class RateLimitTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 33.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 33.55);

    @Autowired RateLimits limits;
    @Autowired QuoteService quotes;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired JdbcClient jdbc;

    @Test
    void aRiderGetsTheBudgetAndThenWaitsOtherRidersAndStaffDoNot() {
        TestRides rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        UUID city = rides.city("test-rate-limits", "UAH", 33);
        TestQuotes test = new TestQuotes(jdbc, quotes);
        Actor rider = rides.client();
        test.quote(rider, city, "STANDARD", PICKUP, DROPOFF);
        test.quote(rider, city, "STANDARD", PICKUP, DROPOFF);
        assertThatThrownBy(() -> test.quote(rider, city, "STANDARD", PICKUP, DROPOFF))
                .isInstanceOfSatisfying(RateLimitedException.class, e -> {
                    assertThat(e.code()).isEqualTo(ErrorCode.RATE_LIMITED);
                    assertThat(e.retryAfter()).isPositive();
                });
        assertThat(test.quote(rides.client(), city, "STANDARD", PICKUP, DROPOFF).id()).as("another rider").isNotNull();

        Actor driver = new Actor(SubjectType.DRIVER, UUID.randomUUID());
        limits.acquire(RateLimits.FILE_UPLOAD, driver);
        assertThatThrownBy(() -> limits.acquire(RateLimits.FILE_UPLOAD, driver))
                .isInstanceOf(RateLimitedException.class);
        Actor operator = new Actor(SubjectType.STAFF, UUID.randomUUID());
        for (int i = 0; i < 5; i++) {
            limits.acquire(RateLimits.FILE_UPLOAD, operator); // staff are not limited here
        }
        assertThat(jdbc.sql("select count(*) from rate_limit_hit where subject_id = :id").param("id", operator.id())
                .query(Long.class).single()).isZero();
    }
}
