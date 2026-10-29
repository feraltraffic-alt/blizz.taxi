package taxi.blizz.pricing.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Clock;
import java.time.ZoneOffset;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.pricing.FinalFares;
import taxi.blizz.pricing.QuoteService.Quote;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcFinalFares implements FinalFares {

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;

    JdbcFinalFares(JdbcClient jdbc, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public FinalFare finalizeFare(Facts facts) {
        if (facts == null || facts.orderId() == null || facts.quoteId() == null || facts.waitedSeconds() < 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Order, quote and non-negative waiting required");
        }
        Optional<FinalFare> existing = stored(facts.orderId());
        if (existing.isPresent()) {
            return existing.get();
        }
        Quote quote = jdbc.sql("select snapshot::text from quote where id = :id and consumed_at is not null")
                .param("id", facts.quoteId())
                .query((rs, i) -> json.readValue(rs.getString(1), Quote.class))
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "The order has no consumed quote"));
        WaitingCharge.Result waiting = WaitingCharge.of(quote.terms(), facts.waitedSeconds());
        long amount = Math.addExact(quote.amountMinor(), waiting.amountMinor());
        BigDecimal rate = quote.terms().commissionRate();
        long commission = BigDecimal.valueOf(amount).multiply(rate).setScale(0, RoundingMode.HALF_UP).longValueExact();
        Breakdown breakdown = new Breakdown(quote.amountMinor(), facts.waitedSeconds(), waiting.freeSeconds(),
                waiting.chargedSeconds(), waiting.amountMinor());
        String policy = WaitingCharge.configured(quote.terms()) ? POLICY_AGREED_PLUS_WAITING : POLICY_AGREED_PRICE;
        FinalFare fare = new FinalFare(UUID.randomUUID(), facts.orderId(), 1, quote.id(), policy, amount,
                quote.currency(), rate, commission, amount - commission, breakdown);
        jdbc.sql("""
                        insert into final_fare (id, order_id, version, quote_id, policy, amount_minor, currency,
                                                commission_rate, commission_minor, driver_share_minor, breakdown,
                                                created_at)
                        values (:id, :order, :version, :quote, :policy, :amount, :currency, :rate, :commission,
                                :share, cast(:breakdown as jsonb), :now)""")
                .param("id", fare.id())
                .param("order", fare.orderId())
                .param("version", fare.version())
                .param("quote", fare.quoteId())
                .param("policy", fare.policy())
                .param("amount", fare.amountMinor())
                .param("currency", fare.currency())
                .param("rate", fare.commissionRate())
                .param("commission", fare.commissionMinor())
                .param("share", fare.driverShareMinor())
                .param("breakdown", json.writeValueAsString(breakdown))
                .param("now", clock.instant().atOffset(ZoneOffset.UTC))
                .update();
        return fare;
    }

    @Override
    public Optional<FinalFare> ofOrder(UUID orderId) {
        return stored(orderId);
    }

    private Optional<FinalFare> stored(UUID orderId) {
        return jdbc.sql("""
                        select id, order_id, version, quote_id, policy, amount_minor, currency, commission_rate,
                               commission_minor, driver_share_minor, breakdown::text
                        from final_fare where order_id = :order and version = 1""")
                .param("order", orderId)
                .query((rs, i) -> new FinalFare(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getInt(3), rs.getObject(4, UUID.class), rs.getString(5), rs.getLong(6), rs.getString(7),
                        rs.getBigDecimal(8), rs.getLong(9), rs.getLong(10),
                        json.readValue(rs.getString(11), Breakdown.class)))
                .optional();
    }
}
