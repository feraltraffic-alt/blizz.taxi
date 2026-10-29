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
                Map.<String, Object>of("reasonCode", 1100, "transactionList", "not-an-array"),
                Map.<String, Object>of("reasonCode", 1100, "merchantAccount", "wrong-merchant", "transactionList", List.of()))) {
            assertThatThrownBy(() -> transactions(provider((url, body) -> response)))
                    .isInstanceOf(IllegalStateException.class).hasMessage("RECONCILIATION_INVALID_RESPONSE");
        }
    }

    @Test
    void malformedMoneyCurrencyTimeAndUnknownStatusFailTheWholeStatement() {
        for (Map.Entry<String, Object> invalid : Map.<String, Object>of(
                "amount", "100.001", "currency", "not-a-currency",
                "processingDate", -1, "transactionStatus", "FutureUndocumentedStatus",
                "orderReference", "", "fee", "1.001", "transactionType", "Undocumented", "createdDate", 1793059260000L).entrySet()) {
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

    @Test
    void fakeStatementIsIndependentPerMerchantAndUsesTheOriginalSharedAnchor() {
        Clock clock=Clock.fixed(FROM.plusSeconds(3600),ZoneOffset.UTC);
        FakeProvider.Gateway gateway=new FakeProvider.Gateway(account->"unit-secret",clock);
        FakeProvider bank=new FakeProvider(gateway,clock,"http://example.test");
        Merchant other=new Merchant(UUID.randomUUID(),"FAKE","other-account","example.test","unit-secret","PLN");
        var customer=new PaymentProvider.Customer(null,null,null,null,null);
        bank.authorize(MERCHANT,"same-anchor","fixture-token",12000,customer,"Fare",3600,null);
        bank.charge(other,"same-anchor","fixture-token",700,customer,"Fare",null);
        assertThat(bank.refund(MERCHANT,"same-anchor",12000,"Void").providerStatus()).isEqualTo("Voided");
        var ours=bank.transactions(MERCHANT,FROM,TO);
        assertThat(ours).hasSize(1);
        assertThat(ours.getFirst().reference()).isEqualTo("same-anchor");
        assertThat(ours.getFirst().status()).isEqualTo("Voided");
        assertThat(bank.transactions(other,FROM,TO).getFirst().status()).isEqualTo("Approved");
        assertThat(bank.transactions(other,FROM,TO).getFirst().amountMinor()).isEqualTo(700);
        assertThat(bank.transactions(other,FROM,TO).getFirst().currency()).isEqualTo("PLN");
    }

    @Test
    void failedFollowupDoesNotEraseTheBanksEarlierHoldAndOverridesAreIndependent() {
        Clock clock=Clock.fixed(FROM.plusSeconds(3600),ZoneOffset.UTC);
        FakeProvider.Gateway gateway=new FakeProvider.Gateway(account->"unit-secret",clock);
        FakeProvider bank=new FakeProvider(gateway,clock,"http://example.test");
        bank.authorize(MERCHANT,"hold","fixture-token",12000,
                new PaymentProvider.Customer(null,null,null,null,null),"Fare",3600,null);
        gateway.next("Declined");
        bank.settle(MERCHANT,"hold",10000);
        assertThat(bank.transactions(MERCHANT,FROM,TO).getFirst().status()).isEqualTo("WaitingAuthComplete");
        assertThat(bank.transactions(MERCHANT,FROM,TO).getFirst().amountMinor()).isEqualTo(12000);
        gateway.reconciliationList(MERCHANT.account(),Map.of("reasonCode",1100,"transactionList",List.of(row())));
        assertThat(bank.transactions(MERCHANT,FROM,TO).getFirst().reference()).isEqualTo("known-anchor");
        gateway.reconciliationList(MERCHANT.account(),null);
        assertThat(bank.transactions(MERCHANT,FROM,TO).getFirst().reference()).isEqualTo("hold");
    }

    @Test
    void bankOnlySandboxInjectionIsRepeatableAndRestorable() {
        Clock clock=Clock.fixed(FROM.plusSeconds(3600),ZoneOffset.UTC);
        FakeProvider.Gateway gateway=new FakeProvider.Gateway(account->"unit-secret",clock);
        FakeProvider bank=new FakeProvider(gateway,clock,"http://example.test");
        UUID fixture=UUID.randomUUID();
        gateway.injectReconciliationTransaction(MERCHANT.account(),fixture,1,"UAH");
        gateway.injectReconciliationTransaction(MERCHANT.account(),fixture,1,"UAH");
        assertThat(bank.transactions(MERCHANT,FROM,TO)).hasSize(1);
        assertThatThrownBy(()->gateway.injectReconciliationTransaction(MERCHANT.account(),fixture,2,"UAH"))
                .isInstanceOf(IllegalArgumentException.class);
        gateway.removeReconciliationTransaction(MERCHANT.account(),fixture);
        gateway.removeReconciliationTransaction(MERCHANT.account(),fixture);
        assertThat(bank.transactions(MERCHANT,FROM,TO)).isEmpty();
    }

    @Test
    void amountsAreReadInTheMinorUnitsOfTheirOwnCurrency() {
        Clock clock=Clock.fixed(FROM.plusSeconds(3600),ZoneOffset.UTC);
        FakeProvider.Gateway gateway=new FakeProvider.Gateway(account->"unit-secret",clock);
        FakeProvider bank=new FakeProvider(gateway,clock,"http://example.test");
        Map<String,Object> yen=row();
        yen.put("currency","JPY");yen.put("amount","1500");yen.put("fee","15");
        gateway.reconciliationList(MERCHANT.account(),Map.of("reasonCode",1100,"transactionList",List.of(yen)));
        assertThat(bank.transactions(MERCHANT,FROM,TO).getFirst().amountMinor()).as("no decimals in yen").isEqualTo(1500);
        assertThat(bank.transactions(MERCHANT,FROM,TO).getFirst().feeMinor()).isEqualTo(15);
        yen.put("amount","1500.5");
        gateway.reconciliationList(MERCHANT.account(),Map.of("reasonCode",1100,"transactionList",List.of(yen)));
        assertThatThrownBy(()->bank.transactions(MERCHANT,FROM,TO)).hasMessage("RECONCILIATION_INVALID_RESPONSE");
        Map<String,Object> unknown=row();
        unknown.put("currency","XXX");
        gateway.reconciliationList(MERCHANT.account(),Map.of("reasonCode",1100,"transactionList",List.of(unknown)));
        assertThatThrownBy(()->bank.transactions(MERCHANT,FROM,TO)).hasMessage("RECONCILIATION_INVALID_RESPONSE");
    }

    private static Map<String, Object> row() {
        Map<String, Object> row = new LinkedHashMap<>();
        row.put("orderReference", "known-anchor");
        row.put("transactionType", "Purchase");
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
