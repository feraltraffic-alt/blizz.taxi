package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

/** Official TRANSACTION_LIST wire shape, independently of our operation-table representation. */
class ReconciliationProviderTests {
    private static final Instant FROM = Instant.parse("2026-10-27T00:00:00Z");
    private static final Instant TO = Instant.parse("2026-10-28T00:00:00Z");
    private static final Merchant MERCHANT = new Merchant(UUID.randomUUID(), "WAYFORPAY", "reconciliation-test",
            "example.test", "unit-secret", "UAH");

    @Test
    void signsTheDocumentedWindowAndProjectsOnlyAccountingFields() {
        WayForPayProvider provider = provider((url, body) -> {
            assertThat(url).isEqualTo("https://api.wayforpay.com/api");
            assertThat(body).containsExactlyInAnyOrderEntriesOf(Map.of(
                    "transactionType", "TRANSACTION_LIST", "merchantAccount", "reconciliation-test",
                    "apiVersion", 1, "dateBegin", 1793059200L, "dateEnd", 1793145600L,
                    "merchantSignature", "ed5c5fca6c13fa1aa1a1ff73d61701b8"));
            return Map.of("reasonCode", 1100, "transactionList", List.of(row()));
        });
        List<?> rows = transactions(provider);
        assertThat(rows).hasSize(1);
        Object transaction = rows.getFirst();
        assertThat(field(transaction, "reference")).isEqualTo("known-anchor");
        assertThat(field(transaction, "type")).isEqualTo("PURCHASE");
        assertThat(field(transaction, "status")).isEqualTo("Approved");
        assertThat(field(transaction, "amountMinor")).isEqualTo(10001L);
        assertThat(field(transaction, "currency")).isEqualTo("UAH");
        assertThat(field(transaction, "feeMinor")).isEqualTo(150L);
        assertThat(field(transaction, "createdAt")).isEqualTo(FROM.plusSeconds(60));
        assertThat(field(transaction, "processedAt")).isEqualTo(FROM.plusSeconds(120));
        assertThat(transaction.toString()).doesNotContain("fixture-customer", "fixture-token", "411111");
        assertThat(java.util.Arrays.stream(transaction.getClass().getRecordComponents()).map(c -> c.getName()))
                .doesNotContain("email", "phone", "cardPan", "raw", "recToken");
    }

    @Test
    void absentFeeIsUnknownRatherThanInventedZeroAndEmptyStatementIsValid() {
        Map<String, Object> row = row();
        row.remove("fee");
        List<?> rows = transactions(provider((url, body) -> Map.of("reasonCode", "1100",
                "transactionList", List.of(row))));
        assertThat(field(rows.getFirst(), "feeMinor")).isNull();
        assertThat(transactions(provider((url, body) -> Map.of("reasonCode", 1100,
                "transactionList", List.of())))).isEmpty();
    }

    @Test
    void invalidStatementNeverMasqueradesAsACleanEmptyDay() {
        for (Map<String, Object> response : List.of(Map.<String, Object>of("reasonCode", 1113,
                "transactionList", List.of()), Map.<String, Object>of("reasonCode", 1100),
                Map.<String, Object>of("transactionList", List.of()),
                Map.<String, Object>of("reasonCode", 1100, "transactionList", "not-an-array"))) {
            assertThatThrownBy(() -> transactions(provider((url, body) -> response)))
                    .isInstanceOf(IllegalStateException.class).hasMessage("RECONCILIATION_INVALID_RESPONSE");
        }
    }

    @Test
    void malformedMoneyCurrencyTimeAndUnknownStatusFailTheWholeStatement() {
        for (Map.Entry<String, Object> invalid : Map.<String, Object>of(
                "amount", "100.001", "currency", "not-a-currency", "createdDate", "invalid",
                "processingDate", -1, "transactionStatus", "FutureUndocumentedStatus",
                "orderReference", "", "fee", "1.001").entrySet()) {
            Map<String, Object> row = row();
            row.put(invalid.getKey(), invalid.getValue());
            assertThatThrownBy(() -> transactions(provider((url, body) -> Map.of("reasonCode", 1100,
                    "transactionList", List.of(row)))))
                    .isInstanceOf(IllegalStateException.class).hasMessage("RECONCILIATION_INVALID_RESPONSE");
        }
    }

    @Test
    void networkErrorsCarryOnlyASafeCodeWithoutProviderPayloadOrCause() {
        WayForPayProvider provider = provider((url, body) -> {
            throw new java.net.SocketTimeoutException("fixture-customer fixture-token 411111");
        });
        assertThatThrownBy(() -> transactions(provider)).isInstanceOf(IllegalStateException.class)
                .hasMessage("RECONCILIATION_PROVIDER_UNAVAILABLE").hasNoCause();
    }

    private static Map<String, Object> row() {
        Map<String, Object> row = new LinkedHashMap<>();
        row.put("orderReference", "known-anchor");
        row.put("transactionType", "PURCHASE");
        row.put("transactionStatus", "Approved");
        row.put("amount", new BigDecimal("100.01"));
        row.put("currency", "UAH");
        row.put("fee", "1.50");
        row.put("createdDate", 1793059260L);
        row.put("processingDate", "1793059320");
        row.put("email", "fixture-customer");
        row.put("recToken", "fixture-token");
        row.put("cardPan", "411111******1111");
        return row;
    }

    private static WayForPayProvider provider(WayForPayProvider.Transport transport) {
        return new WayForPayProvider(transport, Clock.fixed(TO, ZoneOffset.UTC), 3600);
    }

    // Reflection keeps the tests-only commit compilable before the new provider API exists.
    private static List<?> transactions(PaymentProvider provider) {
        return ReflectionTestUtils.invokeMethod(provider, "transactions", MERCHANT, FROM, TO);
    }

    private static Object field(Object row, String name) {
        return ReflectionTestUtils.invokeMethod(row, name);
    }
}
