package taxi.blizz.pricing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.TariffService.SurchargeMode;
import taxi.blizz.pricing.TariffService.Terms;
import taxi.blizz.pricing.TariffService.ZoneSurcharge;

/** In-city / out-of-city rates and zone surcharges end to end (owner decision 27.10.2026). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ZonePricingTests {

    // Service area -150..-149 lon, 40..41 lat; city limits: the western half; airport: a square in the east.
    static final GeoPoint CITY_A = new GeoPoint(40.5, -149.9);
    static final GeoPoint CITY_B = new GeoPoint(40.55, -149.8);
    static final GeoPoint AIRPORT_POINT = new GeoPoint(40.5, -149.15);
    static final GeoPoint SUBURB = new GeoPoint(40.6, -149.3);

    @Autowired
    TariffService tariffs;
    @Autowired
    QuoteService quotes;
    @Autowired
    JdbcClient jdbc;

    UUID cityId;
    UUID airport;
    UUID limits;
    Actor manager;
    final Actor payer = new Actor(SubjectType.CLIENT, UUID.randomUUID());

    private UUID zone(UUID city, String type, String area) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into zone (id, city_id, type, polygon, priority, state, created_at, updated_at)
                        values (:id, :city, :type, ST_GeomFromEWKT(:area), 1, 'PUBLISHED', now(), now())""")
                .param("id", id).param("city", city).param("type", type).param("area", area).update();
        return id;
    }

    @BeforeEach
    void setUp() {
        cityId = UUID.randomUUID();
        jdbc.sql("""
                        insert into city (id, code, name, currency, timezone, polygon, priority, state, created_at, updated_at)
                        values (:id, :code, 'Zones', 'UAH', 'UTC',
                                ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((-150 40,-149 40,-149 41,-150 41,-150 40)))'),
                                7790, 'PUBLISHED', now(), now())""")
                .param("id", cityId).param("code", "zone-pricing-" + cityId).update();
        // Only one published city may cover the area: archive the ones of earlier test methods.
        jdbc.sql("update city set state = 'ARCHIVED' where code like 'zone-pricing-%' and id <> :id")
                .param("id", cityId).update();
        limits = zone(cityId, "CITY_LIMITS", "SRID=4326;MULTIPOLYGON(((-150 40,-149.5 40,-149.5 41,-150 41,-150 40)))");
        airport = zone(cityId, "AIRPORT", "SRID=4326;MULTIPOLYGON(((-149.2 40.45,-149.1 40.45,-149.1 40.55,-149.2 40.55,-149.2 40.45)))");
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                        values (:id, :login, 'Pricing', 'ADMIN', '{pricing.manage}', true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "zone-" + id).update();
        manager = new Actor(SubjectType.STAFF, id);
    }

    private UUID tariff(List<ZoneSurcharge> surcharges) {
        UUID classId = tariffs.createVehicleClass(new TariffService.VehicleClassDraft(UUID.randomUUID(), manager, 0,
                cityId, "STANDARD", "Standard", "test")).id();
        Terms terms = new Terms(2000, new BigDecimal("1000"), new BigDecimal("100"), 5000, 3, new BigDecimal("100"),
                0, new BigDecimal("0.15"), 60, TariffService.WaitingRounding.UP, 3000, new BigDecimal("1500"), surcharges);
        TariffService.Revision draft = tariffs.createDraft(new TariffService.Draft(UUID.randomUUID(), manager, 0, cityId,
                classId, "UAH", Instant.now().minusSeconds(60), null, terms, "test"));
        tariffs.publish(new TariffService.Change(UUID.randomUUID(), manager, draft.id(), draft.version(), "go"));
        return classId;
    }

    private QuoteService.Quote quote(UUID classId, GeoPoint from, GeoPoint to) {
        return quotes.create(UUID.randomUUID(), new QuoteService.Request(cityId, classId, from, to, payer));
    }

    @Test
    void inTheCityOutsideItAndToTheAirport() {
        UUID classId = tariff(List.of(new ZoneSurcharge(airport, SurchargeMode.FIXED, 5000, null, true, true)));

        QuoteService.Quote city = quote(classId, CITY_A, CITY_B);
        assertThat(city.breakdown().pickupOutside()).isFalse();
        assertThat(city.breakdown().distanceOutside().numerator()).isEqualByComparingTo("0");
        assertThat(city.breakdown().zoneFees()).isEmpty();

        QuoteService.Quote toSuburb = quote(classId, CITY_A, SUBURB);
        assertThat(toSuburb.breakdown().distanceOutside().numerator()).isPositive();
        assertThat(toSuburb.breakdown().distance().numerator()).isPositive();

        QuoteService.Quote fromSuburb = quote(classId, SUBURB, CITY_A);
        assertThat(fromSuburb.breakdown().pickupOutside()).isTrue();
        assertThat(fromSuburb.breakdown().pickupMinor()).isEqualTo(3000);

        QuoteService.Quote toAirport = quote(classId, CITY_A, AIRPORT_POINT);
        assertThat(toAirport.breakdown().zoneFees()).singleElement()
                .satisfies(f -> assertThat(f.zoneId()).isEqualTo(airport));
        assertThat(toAirport.breakdown().approvedFeesMinor()).isEqualTo(5000);
    }

    @Test
    void aSurchargeMustNameAZoneOfTheSameCityAndSaneValues() {
        UUID classId = tariffs.createVehicleClass(new TariffService.VehicleClassDraft(UUID.randomUUID(), manager, 0,
                cityId, "COMFORT", "Comfort", "test")).id();
        UUID otherCity = UUID.randomUUID();
        jdbc.sql("""
                        insert into city (id, code, name, currency, timezone, polygon, priority, state, created_at, updated_at)
                        values (:id, :code, 'Other', 'UAH', 'UTC',
                                ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((-140 40,-139 40,-139 41,-140 41,-140 40)))'),
                                0, 'DRAFT', now(), now())""")
                .param("id", otherCity).param("code", "zone-other-" + otherCity).update();
        UUID foreign = zone(otherCity, "AIRPORT", "SRID=4326;MULTIPOLYGON(((-140 40,-139.9 40,-139.9 40.1,-140 40.1,-140 40)))");
        for (ZoneSurcharge bad : List.of(
                new ZoneSurcharge(foreign, SurchargeMode.FIXED, 100, null, true, true),
                new ZoneSurcharge(limits, SurchargeMode.FIXED, 100, null, true, true),
                new ZoneSurcharge(airport, SurchargeMode.COEFFICIENT, 0, new BigDecimal("0.5"), true, true),
                new ZoneSurcharge(airport, SurchargeMode.FIXED, 0, null, true, true),
                new ZoneSurcharge(airport, SurchargeMode.FIXED, 100, null, false, false))) {
            Terms terms = new Terms(2000, BigDecimal.ONE, BigDecimal.ONE, 0, 3, BigDecimal.ONE, 0, BigDecimal.ZERO, 60,
                    TariffService.WaitingRounding.UP, 2000, BigDecimal.ONE, List.of(bad));
            assertThatThrownBy(() -> tariffs.createDraft(new TariffService.Draft(UUID.randomUUID(), manager, 0, cityId,
                    classId, "UAH", Instant.now(), null, terms, "x")))
                    .isInstanceOf(DomainException.class)
                    .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        }
    }
}
