package taxi.blizz.pricing.internal;

import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.GeoZones;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.pricing.RouteEstimator;
import taxi.blizz.pricing.TariffService;
import taxi.blizz.pricing.TariffService.Terms;
import taxi.blizz.pricing.TariffService.WaitingRounding;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcQuoteService implements QuoteService {
    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final JsonMapper json;
    private final Clock clock;
    private final ObjectProvider<RouteEstimator> estimators;
    private final GeoZones zones;
    private final ServiceSettings settings;

    JdbcQuoteService(JdbcClient jdbc, IdempotentCommands commands, JsonMapper json,
                     Clock clock, ObjectProvider<RouteEstimator> estimators, GeoZones zones, ServiceSettings settings) {
        this.zones = zones;
        this.settings = settings;
        this.jdbc = jdbc;
        this.commands = commands;
        this.json = json;
        this.clock = clock;
        this.estimators = estimators;
    }

    @Override
    @Transactional(propagation = Propagation.NEVER)
    public Quote create(UUID commandId, Request request) {
        payer(request.payer());
        if (commandId == null || request.cityId() == null || request.classId() == null
                || request.pickup() == null || request.dropOff() == null) {
            throw error(ErrorCode.VALIDATION_FAILED, "Incomplete quote request");
        }
        RouteEstimator estimator = estimators.getIfAvailable();
        if (estimator == null) {
            throw error(ErrorCode.PROVIDER_UNAVAILABLE, "Route estimator is not configured");
        }
        RouteEstimator.Estimate route = estimator.estimate(request.pickup(), request.dropOff());
        // Where the trip is, for in-city / out-of-city rates and zone surcharges (owner decision 27.10.2026).
        GeoZones.Split split = zones.splitByCityLimits(request.cityId(), request.pickup(), request.dropOff());
        FareCalculator.Facts facts = new FareCalculator.Facts(
                !zones.insideCityLimits(request.cityId(), request.pickup()), split.insideMetres(), split.outsideMetres(),
                Set.copyOf(zones.zonesAt(request.cityId(), request.pickup())),
                Set.copyOf(zones.zonesAt(request.cityId(), request.dropOff())), preorder(request));
        return commands.execute(new CommandKey(request.payer(), "quote.create", commandId), request, Quote.class, () -> {
            Instant now = clock.instant().truncatedTo(ChronoUnit.MICROS);
            record Tariff(UUID id, String currency, Terms terms) {
            }
            Tariff tariff = jdbc.sql("""
                    select t.*, t.zone_surcharges::text as zone_surcharges, t.preorder_surcharge::text as preorder_surcharge from tariff_version t join city on city.id = t.city_id
                    join vehicle_class vc on vc.id = t.class_id and vc.city_id = t.city_id
                    where t.city_id = :city and t.class_id = :class and t.state = 'PUBLISHED'
                    and city.state = 'PUBLISHED' and vc.active and t.currency = city.currency
                    and t.effective_from <= :now and (t.effective_to is null or t.effective_to > :now)
                    """).param("city", request.cityId()).param("class", request.classId()).param("now", at(now))
                    .query((rs, n) -> new Tariff(rs.getObject("id", UUID.class), rs.getString("currency"),
                            new Terms(rs.getLong("pickup_minor"), rs.getBigDecimal("per_km_minor"),
                                    rs.getBigDecimal("per_minute_minor"), rs.getLong("minimum_minor"),
                                    rs.getInt("free_waiting_minutes"), rs.getBigDecimal("waiting_per_minute_minor"),
                                    rs.getLong("cancellation_fee_minor"), rs.getBigDecimal("commission_rate"),
                                    rs.getInt("waiting_step_seconds"),
                                    WaitingRounding.valueOf(rs.getString("waiting_rounding")),
                                    rs.getLong("pickup_outside_minor"), rs.getBigDecimal("per_km_outside_minor"),
                                    List.of(json.readValue(rs.getString("zone_surcharges"),
                                            TariffService.ZoneSurcharge[].class)),
                                    rs.getString("preorder_surcharge") == null ? null
                                            : json.readValue(rs.getString("preorder_surcharge"),
                                                    TariffService.PreorderSurcharge.class))))
                    .optional().orElseThrow(() -> error(ErrorCode.NOT_FOUND, "No effective published tariff"));
            FareCalculator.Result fare = FareCalculator.calculate(tariff.terms(), route, facts);
            Quote quote = new Quote(UUID.randomUUID(), request, tariff.id(), 1, tariff.terms(), route,
                    fare.breakdown(), fare.amountMinor(), tariff.currency(), now, now.plusSeconds(300),
                    request.fingerprint());
            jdbc.sql("""
                    insert into quote(id, city_id, class_id, owner_type, owner_id, tariff_version_id,
                        pricing_policy_version, amount_minor, currency, fingerprint, snapshot, created_at, expires_at)
                    values (:id, :city, :class, :type, :owner, :tariff, :policy, :amount, :currency,
                        :fingerprint, cast(:snapshot as jsonb), :now, :expires)
                    """).param("id", quote.id()).param("city", request.cityId()).param("class", request.classId())
                    .param("type", request.payer().type().name()).param("owner", request.payer().id())
                    .param("tariff", tariff.id()).param("policy", quote.pricingPolicyVersion())
                    .param("amount", quote.amountMinor()).param("currency", quote.currency())
                    .param("fingerprint", quote.fingerprint()).param("snapshot", json.writeValueAsString(quote))
                    .param("now", at(now)).param("expires", at(quote.expiresAt())).update();
            return quote;
        });
    }

    @Override
    @Transactional
    public Quote consume(UUID quoteId, Actor payer, String fingerprint) {
        payer(payer);
        record Stored(Quote quote, Instant expiresAt, boolean consumed) {
        }
        Stored stored = jdbc.sql("select snapshot::text, expires_at, consumed_at from quote where id = :id for update")
                .param("id", quoteId).query((rs, n) -> new Stored(json.readValue(rs.getString(1), Quote.class),
                        rs.getObject(2, OffsetDateTime.class).toInstant(), rs.getObject(3) != null)).optional()
                .orElseThrow(() -> error(ErrorCode.QUOTE_MISMATCH, "Quote does not match request"));
        Quote quote = stored.quote();
        if (!quote.request().payer().equals(payer) || !quote.fingerprint().equals(fingerprint)) {
            throw error(ErrorCode.QUOTE_MISMATCH, "Quote does not match request");
        }
        Instant now = clock.instant();
        if (stored.consumed() || !now.isBefore(stored.expiresAt())) {
            throw error(ErrorCode.QUOTE_EXPIRED, "Quote is expired or already consumed");
        }
        jdbc.sql("update quote set consumed_at = :now where id = :id")
                .param("id", quoteId).param("now", at(now)).update();
        return quote;
    }

    /**
     * A pickup time at least the threshold ahead makes a pre-order (ADR 0006); in the past or beyond the horizon
     * is refused. A time nearer than the threshold is an ordinary order.
     */
    private boolean preorder(Request request) {
        if (request.pickupAt() == null) {
            return false;
        }
        ServiceSettings.Preorders rules = settings.current().settings().preorders();
        Instant now = clock.instant();
        if (request.pickupAt().isBefore(now)) {
            throw error(ErrorCode.VALIDATION_FAILED, "The pickup time is in the past");
        }
        if (request.pickupAt().isAfter(now.plus(java.time.Duration.ofDays(rules.maxDaysAhead())))) {
            throw error(ErrorCode.VALIDATION_FAILED, "Orders can be placed at most " + rules.maxDaysAhead() + " days ahead");
        }
        return !request.pickupAt().isBefore(now.plus(java.time.Duration.ofMinutes(rules.thresholdMinutes())));
    }

    private static void payer(Actor payer) {
        if (payer == null || payer.type() == SubjectType.SYSTEM) {
            throw error(ErrorCode.QUOTE_MISMATCH, "Quote requires a payer subject");
        }
    }

    private static OffsetDateTime at(Instant instant) {
        return instant.atOffset(ZoneOffset.UTC);
    }

    private static DomainException error(ErrorCode code, String message) {
        return new DomainException(code, message);
    }
}
