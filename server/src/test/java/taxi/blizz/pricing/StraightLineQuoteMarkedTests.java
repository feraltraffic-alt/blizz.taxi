package taxi.blizz.pricing;

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
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** Without a router (the tests have none) a quote says it is a straight-line estimate (REQ-GEO-08). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class StraightLineQuoteMarkedTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 34.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 34.55);

    @Autowired QuoteService quotes;
    @Autowired JdbcClient jdbc;

    @Test
    void theQuoteSaysItIsAnEstimate() {
        TestRides rides = new TestRides(jdbc, null, null, null, null, null, quotes);
        UUID city = rides.city("test-straight-line", "UAH", 34);
        QuoteService.Quote quote = new TestQuotes(jdbc, quotes).quote(rides.client(), city, "STANDARD", PICKUP, DROPOFF);
        assertThat(quote.route().source()).isEqualTo(RouteEstimator.Source.STRAIGHT_LINE);
    }
}
