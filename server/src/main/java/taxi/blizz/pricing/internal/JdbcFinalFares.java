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
import taxi.blizz.platform.ConflictException;
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

    /** The one rule of the split; {@link #finalizeFare} and {@link #split} both use it. */
    static long commission(long amountMinor, BigDecimal rate) {
        return BigDecimal.valueOf(amountMinor).multiply(rate).setScale(0, RoundingMode.HALF_UP).longValueExact();
    }

    @Override
    @Transactional(readOnly = true)
    public Split split(UUID quoteId, long amountMinor) {
        BigDecimal rate = jdbc.sql("select snapshot::text from quote where id = :id")
                .param("id", quoteId)
                .query((rs, i) -> json.readValue(rs.getString(1), Quote.class).terms().commissionRate())
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Quote not found"));
        long commission = commission(amountMinor, rate);
        return new Split(commission, amountMinor - commission);
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
        long commission = commission(amount, rate);
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
        return stored(orderId, true);
    }

    private Optional<FinalFare> stored(UUID orderId) {
        return stored(orderId, false);
    }

    /** Version 1, the trip's own; or with {@code latest} the current one after corrections (issue #142). */
    private Optional<FinalFare> stored(UUID orderId, boolean latest) {
        return jdbc.sql("""
                        select id, order_id, version, quote_id, policy, amount_minor, currency, commission_rate,
                               commission_minor, driver_share_minor, breakdown::text
                        from final_fare where order_id = :order"""
                        + (latest ? " order by version desc limit 1" : " and version = 1"))
                .param("order", orderId)
                .query((rs, i) -> new FinalFare(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getInt(3), rs.getObject(4, UUID.class), rs.getString(5), rs.getLong(6), rs.getString(7),
                        rs.getBigDecimal(8), rs.getLong(9), rs.getLong(10),
                        json.readValue(rs.getString(11), Breakdown.class)))
                .optional();
    }

    private static final String VERSION_COLUMNS = """
            select id, version, amount_minor, commission_minor, driver_share_minor, created_at, corrects_id, reason,
                   created_by
            from final_fare""";

    private static Version version(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Version(rs.getObject(1, UUID.class), rs.getInt(2), rs.getLong(3), rs.getLong(4), rs.getLong(5),
                rs.getObject(6, java.time.OffsetDateTime.class), rs.getObject(7, UUID.class), rs.getString(8),
                rs.getObject(9, UUID.class));
    }

    @Override
    @Transactional(readOnly = true)
    public java.util.List<Version> versions(UUID orderId) {
        return jdbc.sql(VERSION_COLUMNS + " where order_id = :order order by version")
                .param("order", orderId).query((rs, i) -> version(rs)).list();
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Version correct(UUID orderId, int expectedVersion, long amountMinor, String reason, UUID authorId) {
        record Latest(UUID id, int version, UUID quoteId, String policy, long amountMinor, String currency,
                      BigDecimal rate, String breakdown) {
        }
        // The latest version, locked: a second correction of the same version waits here and then sees the new one.
        Latest latest = jdbc.sql("""
                        select id, version, quote_id, policy, amount_minor, currency, commission_rate, breakdown::text
                        from final_fare where order_id = :order order by version desc limit 1 for update""")
                .param("order", orderId)
                .query((rs, i) -> new Latest(rs.getObject(1, UUID.class), rs.getInt(2), rs.getObject(3, UUID.class),
                        rs.getString(4), rs.getLong(5), rs.getString(6), rs.getBigDecimal(7), rs.getString(8)))
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "The order has no final fare"));
        if (latest.version() != expectedVersion) {
            throw ConflictException.version(latest.version(), "The final fare is at version " + latest.version());
        }
        if (latest.amountMinor() == amountMinor) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The final fare already is " + amountMinor);
        }
        long commission = commission(amountMinor, latest.rate());
        UUID id = UUID.randomUUID();
        try {
            jdbc.sql("""
                            insert into final_fare (id, order_id, version, quote_id, policy, amount_minor, currency,
                                                    commission_rate, commission_minor, driver_share_minor, breakdown,
                                                    created_at, corrects_id, reason, created_by)
                            values (:id, :order, :version, :quote, :policy, :amount, :currency, :rate, :commission,
                                    :share, cast(:breakdown as jsonb), :now, :corrects, :reason, :author)""")
                    .param("id", id).param("order", orderId).param("version", latest.version() + 1)
                    .param("quote", latest.quoteId()).param("policy", latest.policy()).param("amount", amountMinor)
                    .param("currency", latest.currency()).param("rate", latest.rate()).param("commission", commission)
                    .param("share", amountMinor - commission).param("breakdown", latest.breakdown())
                    .param("now", clock.instant().atOffset(ZoneOffset.UTC)).param("corrects", latest.id())
                    .param("reason", reason).param("author", authorId).update();
        } catch (org.springframework.dao.DuplicateKeyException race) {
            // Only without the lock above: another correction took this version first.
            throw ConflictException.version(latest.version() + 1, "The final fare was corrected meanwhile");
        }
        return jdbc.sql(VERSION_COLUMNS + " where id = :id").param("id", id).query((rs, i) -> version(rs)).single();
    }
}
