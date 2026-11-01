package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import taxi.blizz.payments.internal.PaymentProvider.Outcome;

/** WayForPay protocol details; expected signatures were computed independently (Python hmac/md5). */
class WayForPayProviderTests {

    static final Merchant MERCHANT = new Merchant(UUID.randomUUID(), "WAYFORPAY", "test_merch_n1", "www.market.ua",
            "flk3409refn54t54t*FNJRET", "UAH");
    static final Clock CLOCK = Clock.fixed(Instant.ofEpochSecond(1415379863), ZoneOffset.UTC);

    @Test
    void signaturesFollowTheDocumentedFieldOrder() {
        assertThat(WayForPayProvider.sign(MERCHANT, "test_merch_n1", "www.market.ua", "DH1415379863", "1415379863",
                "1547.36", "UAH", "Samsung Galaxy S", "1", "1547.36")).isEqualTo("5c26c07ea6fb1e98baa1b00fce686a2e");
        assertThat(WayForPayProvider.sign(MERCHANT, "test_merch_n1", "DH1415379863", "1547.36", "UAH"))
                .isEqualTo("b4e1ffdbffe7f5469670992a92305575");
        WayForPayProvider provider = new WayForPayProvider((url, body) -> Map.of(), CLOCK, 3600);
        assertThat(provider.acknowledge(MERCHANT, "DH1415379863")).containsEntry("status", "accept")
                .containsEntry("time", 1415379863L).containsEntry("signature", "cbee4cd5be2199b47d640864b4ffbeb6");
    }

    @Test
    void aHoldIsAnAuthChargeOnTheSavedCard() {
        List<Map<String, Object>> sent = new java.util.ArrayList<>();
        WayForPayProvider provider = new WayForPayProvider((url, body) -> {
            sent.add(body);
            return signedAnswer("DH1415379863", "1547.36", "WaitingAuthComplete", "1100");
        }, CLOCK, 3600);
        PaymentProvider.Result result = provider.authorize(MERCHANT, "DH1415379863", "rec-token-1", 154736,
                new PaymentProvider.Customer("+380501234567", null, null, null, null), "Samsung Galaxy S", 3600,
                "https://blizz.test/payments/v1/callbacks/m");
        assertThat(result.outcome()).isEqualTo(Outcome.SUCCEEDED);
        Map<String, Object> body = sent.getFirst();
        assertThat(body).containsEntry("transactionType", "CHARGE").containsEntry("merchantTransactionType", "AUTH")
                .containsEntry("recToken", "rec-token-1").containsEntry("amount", "1547.36")
                .containsEntry("holdTimeout", 3600L).containsEntry("clientPhone", "380501234567")
                .containsEntry("merchantSignature", "5c26c07ea6fb1e98baa1b00fce686a2e");
    }

    @Test
    void noAnswerOrAForgedAnswerIsUnknownNeverDeclined() {
        WayForPayProvider silent = new WayForPayProvider((url, body) -> {
            throw new java.net.SocketTimeoutException("read timed out");
        }, CLOCK, 3600);
        assertThat(silent.settle(MERCHANT, "DH1", 100).outcome()).isEqualTo(Outcome.UNKNOWN);

        WayForPayProvider forged = new WayForPayProvider((url, body) -> {
            Map<String, Object> answer = signedAnswer("DH1", "1.00", "Approved", "1100");
            answer.put("merchantSignature", "0".repeat(32));
            return answer;
        }, CLOCK, 3600);
        assertThat(forged.settle(MERCHANT, "DH1", 100).outcome()).isEqualTo(Outcome.UNKNOWN);

        WayForPayProvider declining = new WayForPayProvider((url, body) -> signedAnswer("DH1", "1.00", "Declined",
                "1105"), CLOCK, 3600);
        assertThat(declining.charge(MERCHANT, "DH1", "t", 100, new PaymentProvider.Customer(null, null, null, null,
                null), "Fare", null).outcome()).isEqualTo(Outcome.DECLINED);
    }

    @Test
    void notificationsAreTrustedOnlyWithTheRightSignatureAndAccount() {
        WayForPayProvider provider = new WayForPayProvider((url, body) -> Map.of(), CLOCK, 3600);
        Map<String, Object> body = signedAnswer("card-1", "0", "Approved", "1100");
        body.put("recToken", "rec-1");
        body.put("cardType", "Visa");
        PaymentProvider.Notification n = provider.readNotification(MERCHANT, body).orElseThrow();
        assertThat(n.outcome()).isEqualTo(Outcome.SUCCEEDED);
        assertThat(n.token()).isEqualTo("rec-1");
        assertThat(n.maskedPan()).isEqualTo("41****1111");

        Map<String, Object> tampered = new LinkedHashMap<>(body);
        tampered.put("transactionStatus", "Declined");
        assertThat(provider.readNotification(MERCHANT, tampered)).isEmpty();
        Map<String, Object> foreign = new LinkedHashMap<>(body);
        foreign.put("merchantAccount", "another_merchant");
        assertThat(provider.readNotification(MERCHANT, foreign)).isEmpty();
        // Amounts arrive as JSON numbers; 1547.36 and 0 must sign as written.
        Map<String, Object> numeric = signedAnswer("DH2", "1547.36", "Approved", "1100");
        numeric.put("amount", new BigDecimal("1547.36"));
        assertThat(provider.readNotification(MERCHANT, numeric)).map(PaymentProvider.Notification::amountMinor)
                .contains(154736L);
    }

    @Test
    void amountsAndStatuses() {
        assertThat(WayForPayProvider.amount(154736, "UAH")).isEqualTo("1547.36");
        assertThat(WayForPayProvider.amount(5, "UAH")).isEqualTo("0.05");
        assertThat(WayForPayProvider.minor("1547.36", "UAH")).isEqualTo(154736);
        assertThat(WayForPayProvider.minor("0", "UAH")).isZero();
        assertThat(WayForPayProvider.outcome("Voided", WayForPayProvider.Kind.REFUND)).isEqualTo(Outcome.SUCCEEDED);
        assertThat(WayForPayProvider.outcome("InProcessing", WayForPayProvider.Kind.AUTH)).isEqualTo(Outcome.PENDING);
        assertThat(WayForPayProvider.outcome("Something new", WayForPayProvider.Kind.SALE)).isEqualTo(Outcome.UNKNOWN);
    }

    /**
     * E3 of #140 (REQ-DATA-01): amounts go out and come back in the currency's own fraction digits, not always two.
     * A yen merchant sends 100 for 100 minor units; a fixed two digits would ask the bank for 1.00 yen.
     */
    @Test
    void amountsUseTheCurrencysFractionDigits() {
        assertThat(WayForPayProvider.amount(100, "JPY")).isEqualTo("100");
        assertThat(WayForPayProvider.minor("100", "JPY")).isEqualTo(100);
        assertThat(WayForPayProvider.amount(1234, "KWD")).isEqualTo("1.234");
        assertThat(WayForPayProvider.minor("1.234", "KWD")).isEqualTo(1234);
        assertThat(WayForPayProvider.amount(12345, "PLN")).isEqualTo("123.45");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> WayForPayProvider.minor("1.5", "JPY"))
                .as("half a yen is not an amount").isInstanceOf(ArithmeticException.class);

        Merchant yen = new Merchant(UUID.randomUUID(), "WAYFORPAY", "test_merch_jpy", "www.market.ua",
                "flk3409refn54t54t*FNJRET", "JPY");
        List<Map<String, Object>> sent = new java.util.ArrayList<>();
        WayForPayProvider provider = new WayForPayProvider((url, body) -> {
            sent.add(body);
            return Map.of();
        }, CLOCK, 3600);
        provider.authorize(yen, "JPY-1", "rec-token-1", 100,
                new PaymentProvider.Customer("+380501234567", null, null, null, null), "Ride", 3600, null);
        provider.charge(yen, "JPY-2", "rec-token-1", 2500,
                new PaymentProvider.Customer("+380501234567", null, null, null, null), "Ride", null);
        provider.settle(yen, "JPY-1", 100);
        provider.refund(yen, "JPY-1", 100, "Released");
        assertThat(sent).extracting(body -> body.get("amount")).containsExactly("100", "2500", "100", "100");

        Map<String, Object> notification = new LinkedHashMap<>();
        notification.put("merchantAccount", yen.account());
        notification.put("orderReference", "JPY-1");
        notification.put("amount", "100");
        notification.put("currency", "JPY");
        notification.put("authCode", "541963");
        notification.put("cardPan", "41****1111");
        notification.put("transactionStatus", "Approved");
        notification.put("reasonCode", "1100");
        notification.put("merchantSignature", WayForPayProvider.sign(yen, yen.account(), "JPY-1", "100", "JPY",
                "541963", "41****1111", "Approved", "1100"));
        assertThat(provider.readNotification(yen, notification)).map(PaymentProvider.Notification::amountMinor)
                .contains(100L);
    }

    private static Map<String, Object> signedAnswer(String reference, String amount, String status, String reasonCode) {
        Map<String, Object> answer = new LinkedHashMap<>();
        answer.put("merchantAccount", MERCHANT.account());
        answer.put("orderReference", reference);
        answer.put("amount", amount);
        answer.put("currency", "UAH");
        answer.put("authCode", "541963");
        answer.put("cardPan", "41****1111");
        answer.put("transactionStatus", status);
        answer.put("reasonCode", reasonCode);
        answer.put("merchantSignature", WayForPayProvider.sign(MERCHANT, MERCHANT.account(), reference, amount, "UAH",
                "541963", "41****1111", status, reasonCode));
        return answer;
    }
}
