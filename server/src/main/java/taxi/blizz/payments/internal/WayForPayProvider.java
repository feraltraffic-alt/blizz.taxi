package taxi.blizz.payments.internal;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import java.util.HexFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WayForPay (wiki.wayforpay.com; ADR 0008). Signatures are HMAC_MD5 with the merchant's secret over the documented
 * fields joined by ";". Amounts go as decimals with two places. Holds are CHARGE with
 * {@code merchantTransactionType=AUTH} on a saved card's {@code recToken}, taken with SETTLE, released or returned
 * with REFUND; CHECK_STATUS settles an unknown result. A network failure is UNKNOWN, never DECLINED (REQ-PAY-10).
 */
class WayForPayProvider implements PaymentProvider {

    static final String API = "https://api.wayforpay.com/api";
    static final String VERIFY = "https://secure.wayforpay.com/verify";
    static final String PAY = "https://secure.wayforpay.com/pay";

    private static final Logger log = LoggerFactory.getLogger(WayForPayProvider.class);

    /** Sends one JSON request; throws on a network failure or timeout. */
    interface Transport {
        Map<String, Object> post(String url, Map<String, Object> body) throws Exception;
    }

    private final Transport transport;
    private final Clock clock;
    private final long holdTimeoutSeconds;

    WayForPayProvider(Transport transport, Clock clock, long holdTimeoutSeconds) {
        this.transport = transport;
        this.clock = clock;
        this.holdTimeoutSeconds = holdTimeoutSeconds;
    }

    @Override
    public String name() {
        return "WAYFORPAY";
    }

    // ---------------------------------------------------------------- card verify (adding a card)

    /** Where the rider's web view posts the card form. */
    String verifyUrl() {
        return VERIFY;
    }

    @Override
    public Form cardVerifyForm(Merchant merchant, String reference, String returnUrl, String serviceUrl,
                               String clientPhone) {
        Map<String, String> fields = new LinkedHashMap<>();
        fields.put("merchantAccount", merchant.account());
        fields.put("merchantAuthType", "SimpleSignature");
        fields.put("merchantDomainName", merchant.domain());
        fields.put("orderReference", reference);
        fields.put("amount", "0");
        fields.put("currency", merchant.currency());
        fields.put("merchantSignature", sign(merchant, merchant.account(), merchant.domain(), reference, "0",
                merchant.currency()));
        fields.put("apiVersion", "1");
        fields.put("paymentSystem", "lookupCard");
        fields.put("returnUrl", returnUrl);
        fields.put("serviceUrl", serviceUrl);
        if (clientPhone != null) {
            fields.put("clientPhone", clientPhone.replace("+", ""));
        }
        return new Form(verifyUrl(), fields);
    }

    // ---------------------------------------------------------------- purchase (a top-up on the payment page)

    /** Where the payer's web view posts the payment form. */
    String payUrl() {
        return PAY;
    }

    @Override
    public Form purchaseForm(Merchant merchant, String reference, long amountMinor, String description,
                             String returnUrl, String serviceUrl, String clientPhone, String language,
                             long lifetimeSeconds) {
        String amount = amount(amountMinor);
        String orderDate = Long.toString(clock.instant().getEpochSecond());
        Map<String, String> fields = new LinkedHashMap<>();
        fields.put("merchantAccount", merchant.account());
        fields.put("merchantAuthType", "SimpleSignature");
        fields.put("merchantDomainName", merchant.domain());
        fields.put("orderReference", reference);
        fields.put("orderDate", orderDate);
        fields.put("amount", amount);
        fields.put("currency", merchant.currency());
        fields.put("orderTimeout", Long.toString(Math.max(60, lifetimeSeconds)));
        fields.put("orderLifetime", Long.toString(Math.max(60, lifetimeSeconds)));
        fields.put("productName[]", description);
        fields.put("productPrice[]", amount);
        fields.put("productCount[]", "1");
        fields.put("merchantSignature", sign(merchant, merchant.account(), merchant.domain(), reference, orderDate,
                amount, merchant.currency(), description, "1", amount));
        fields.put("returnUrl", returnUrl);
        fields.put("serviceUrl", serviceUrl);
        if (language != null) {
            // The page speaks UA, RU, EN, PL among others.
            fields.put("language", language.toUpperCase(Locale.ROOT).replace("UK", "UA"));
        }
        if (clientPhone != null) {
            fields.put("clientPhone", clientPhone.replace("+", ""));
        }
        return new Form(payUrl(), fields);
    }

    // ---------------------------------------------------------------- API operations

    @Override
    public Result authorize(Merchant merchant, String reference, String token, long amountMinor, Customer customer,
                            String description, long holdSeconds, String serviceUrl) {
        return chargeRequest(merchant, reference, token, amountMinor, customer, description, "AUTH",
                Math.max(60, Math.min(holdSeconds, 1_728_000)), serviceUrl);
    }

    @Override
    public Result charge(Merchant merchant, String reference, String token, long amountMinor, Customer customer,
                         String description, String serviceUrl) {
        return chargeRequest(merchant, reference, token, amountMinor, customer, description, "SALE", 0, serviceUrl);
    }

    private Result chargeRequest(Merchant merchant, String reference, String token, long amountMinor,
                                 Customer customer, String description, String type, long holdSeconds,
                                 String serviceUrl) {
        String amount = amount(amountMinor);
        String orderDate = Long.toString(clock.instant().getEpochSecond());
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("transactionType", "CHARGE");
        body.put("merchantAccount", merchant.account());
        body.put("merchantAuthType", "SimpleSignature");
        body.put("merchantDomainName", merchant.domain());
        body.put("merchantTransactionType", type);
        body.put("merchantTransactionSecureType", "AUTO");
        body.put("apiVersion", 1);
        body.put("orderReference", reference);
        body.put("orderDate", orderDate);
        body.put("amount", amount);
        body.put("currency", merchant.currency());
        if ("AUTH".equals(type)) {
            body.put("holdTimeout", holdSeconds > 0 ? holdSeconds : holdTimeoutSeconds);
        }
        if (serviceUrl != null) {
            body.put("serviceUrl", serviceUrl);
        }
        body.put("recToken", token);
        body.put("productName", List.of(description));
        body.put("productPrice", List.of(amount));
        body.put("productCount", List.of(1));
        body.put("clientFirstName", or(customer.firstName(), "Rider"));
        body.put("clientLastName", or(customer.lastName(), "Rider"));
        body.put("clientEmail", or(customer.email(), "rider@" + merchant.domain()));
        body.put("clientPhone", or(customer.phone(), "").replace("+", ""));
        body.put("clientCountry", "UKR");
        body.put("clientIpAddress", or(customer.ipAddress(), "127.0.0.1"));
        body.put("merchantSignature", sign(merchant, merchant.account(), merchant.domain(), reference, orderDate,
                amount, merchant.currency(), description, "1", amount));
        return call(merchant, body, "AUTH".equals(type) ? Kind.AUTH : Kind.SALE);
    }

    @Override
    public Result settle(Merchant merchant, String reference, long amountMinor) {
        String amount = amount(amountMinor);
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("transactionType", "SETTLE");
        body.put("merchantAccount", merchant.account());
        body.put("orderReference", reference);
        body.put("amount", amount);
        body.put("currency", merchant.currency());
        body.put("apiVersion", 1);
        body.put("merchantSignature", sign(merchant, merchant.account(), reference, amount, merchant.currency()));
        return call(merchant, body, Kind.SALE);
    }

    @Override
    public Result refund(Merchant merchant, String reference, long amountMinor, String comment) {
        String amount = amount(amountMinor);
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("transactionType", "REFUND");
        body.put("merchantAccount", merchant.account());
        body.put("orderReference", reference);
        body.put("amount", amount);
        body.put("currency", merchant.currency());
        body.put("comment", or(comment, "Refund"));
        body.put("apiVersion", 1);
        body.put("merchantSignature", sign(merchant, merchant.account(), reference, amount, merchant.currency()));
        return call(merchant, body, Kind.REFUND);
    }

    @Override
    public Result checkStatus(Merchant merchant, String reference) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("transactionType", "CHECK_STATUS");
        body.put("merchantAccount", merchant.account());
        body.put("orderReference", reference);
        body.put("apiVersion", 1);
        body.put("merchantSignature", sign(merchant, merchant.account(), reference));
        return call(merchant, body, Kind.STATUS);
    }

    /** Official TRANSACTION_LIST: https://wiki.wayforpay.com/en/view/1736786 (Unix seconds, UTC). */
    @Override
    public List<ProviderTransaction> transactions(Merchant merchant, java.time.Instant from, java.time.Instant to) {
        if (from == null || to == null || !from.isBefore(to)) {
            throw new IllegalArgumentException("Invalid reconciliation window");
        }
        long begin = from.getEpochSecond();
        long end = to.getEpochSecond();
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("transactionType", "TRANSACTION_LIST");
        body.put("merchantAccount", merchant.account());
        body.put("apiVersion", 1);
        body.put("dateBegin", begin);
        body.put("dateEnd", end);
        body.put("merchantSignature", sign(merchant, merchant.account(), Long.toString(begin), Long.toString(end)));
        Map<String, Object> response;
        try {
            response = transport.post(API, body);
        } catch (Exception ignored) {
            // Provider exceptions may embed the request, secret or customer fields. Do not log/chain them.
            throw new IllegalStateException("RECONCILIATION_PROVIDER_UNAVAILABLE");
        }
        try {
            if (response == null || (response.containsKey("merchantAccount")
                    && !merchant.account().equals(text(response.get("merchantAccount"))))
                    || !"1100".equals(text(response.get("reasonCode")))
                    || !(response.get("transactionList") instanceof List<?> rows)) {
                throw new IllegalArgumentException();
            }
            List<ProviderTransaction> result = new java.util.ArrayList<>();
            for (Object value : rows) {
                if (!(value instanceof Map<?, ?> row)) {
                    throw new IllegalArgumentException();
                }
                String reference = statementText(row.get("orderReference"));
                String type = statementText(row.get("transactionType")).toUpperCase(Locale.ROOT);
                String status = statementText(row.get("transactionStatus"));
                String currency = statementText(row.get("currency"));
                if (reference.length() > 1000 || !java.util.Set.of("PURCHASE", "CHARGE", "SETTLE", "REFUND", "VERIFY")
                        .contains(type) || !currency.matches("[A-Z]{3}")
                        || !java.util.Set.of("approved", "waitingauthcomplete", "refunded", "voided", "declined",
                            "expired", "inprocessing", "pending", "created", "refundinprocessing")
                        .contains(status.toLowerCase(Locale.ROOT))) {
                    throw new IllegalArgumentException();
                }
                // In the currency's own minor units: two decimals are not true of every currency.
                int digits = java.util.Currency.getInstance(currency).getDefaultFractionDigits();
                if (digits < 0) {
                    throw new IllegalArgumentException();
                }
                long amount = new BigDecimal(statementText(row.get("amount"))).movePointRight(digits).longValueExact();
                if (amount < 0) {
                    throw new IllegalArgumentException();
                }
                Long fee = row.get("fee") == null ? null
                        : new BigDecimal(statementText(row.get("fee"))).movePointRight(digits).longValueExact();
                result.add(new ProviderTransaction(reference, type, status, amount, currency, fee,
                        statementTime(row.get("createdDate"), false), statementTime(row.get("processingDate"), true)));
            }
            return List.copyOf(result);
        } catch (RuntimeException ignored) {
            throw new IllegalStateException("RECONCILIATION_INVALID_RESPONSE");
        }
    }

    private static String statementText(Object value) {
        String result = text(value);
        if (result == null || result.isBlank()) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    private static java.time.Instant statementTime(Object value, boolean optional) {
        if (value == null && optional) {
            return null;
        }
        long seconds = new BigDecimal(statementText(value)).longValueExact();
        if (seconds == 0 && optional) {
            return null;
        }
        if (seconds <= 0 || seconds > 253402300799L) { // Unix seconds, not milliseconds; PG/JSON year <= 9999.
            throw new IllegalArgumentException();
        }
        return java.time.Instant.ofEpochSecond(seconds);
    }

    enum Kind {
        AUTH, SALE, REFUND, STATUS
    }

    private Result call(Merchant merchant, Map<String, Object> body, Kind kind) {
        Map<String, Object> response;
        try {
            response = transport.post(API, body);
        } catch (Exception e) {
            log.warn("WayForPay {} for {} did not answer: {}", body.get("transactionType"), body.get("orderReference"),
                    e.toString());
            return Result.unknown("No answer from the provider");
        }
        String status = text(response.get("transactionStatus"));
        String reasonCode = text(response.get("reasonCode"));
        String reason = text(response.get("reason"));
        if (status == null) {
            // An error before a transaction exists, e.g. a bad signature: the operation did not happen.
            return new Result(reasonCode == null ? Outcome.UNKNOWN : Outcome.DECLINED, null, reasonCode, reason);
        }
        if (!responseSignatureValid(merchant, response, kind)) {
            log.warn("WayForPay answer for {} has a wrong signature", body.get("orderReference"));
            return Result.unknown("The provider's answer is not signed correctly");
        }
        return new Result(outcome(status, kind), status, reasonCode, reason);
    }

    /** Statuses from the WayForPay response codes page; anything unexpected is UNKNOWN and gets reconciled. */
    static Outcome outcome(String status, Kind kind) {
        String s = status.toLowerCase(Locale.ROOT);
        return switch (s) {
            case "approved" -> Outcome.SUCCEEDED;
            case "waitingauthcomplete" -> kind == Kind.AUTH || kind == Kind.STATUS ? Outcome.SUCCEEDED : Outcome.PENDING;
            case "refunded", "voided" -> kind == Kind.REFUND || kind == Kind.STATUS ? Outcome.SUCCEEDED : Outcome.UNKNOWN;
            case "declined", "expired" -> Outcome.DECLINED;
            case "inprocessing", "pending", "created", "refundinprocessing" -> Outcome.PENDING;
            default -> Outcome.UNKNOWN;
        };
    }

    private boolean responseSignatureValid(Merchant merchant, Map<String, Object> response, Kind kind) {
        String given = text(response.get("merchantSignature"));
        if (given == null) {
            return kind == Kind.REFUND; // the refund answer may come without one
        }
        String expected = kind == Kind.REFUND
                ? sign(merchant, text(response.get("merchantAccount")), text(response.get("orderReference")),
                        text(response.get("transactionStatus")), text(response.get("reasonCode")))
                : sign(merchant, text(response.get("merchantAccount")), text(response.get("orderReference")),
                        text(response.get("amount")), text(response.get("currency")), text(response.get("authCode")),
                        text(response.get("cardPan")), text(response.get("transactionStatus")),
                        text(response.get("reasonCode")));
        return MessageDigest.isEqual(expected.getBytes(StandardCharsets.US_ASCII),
                given.toLowerCase(Locale.ROOT).getBytes(StandardCharsets.US_ASCII));
    }

    // ---------------------------------------------------------------- notifications (serviceUrl)

    @Override
    public Optional<Notification> readNotification(Merchant merchant, Map<String, Object> body) {
        String account = text(body.get("merchantAccount"));
        String reference = text(body.get("orderReference"));
        String given = text(body.get("merchantSignature"));
        if (!merchant.account().equals(account) || reference == null || given == null) {
            return Optional.empty();
        }
        String expected = sign(merchant, account, reference, text(body.get("amount")), text(body.get("currency")),
                text(body.get("authCode")), text(body.get("cardPan")), text(body.get("transactionStatus")),
                text(body.get("reasonCode")));
        if (!MessageDigest.isEqual(expected.getBytes(StandardCharsets.US_ASCII),
                given.toLowerCase(Locale.ROOT).getBytes(StandardCharsets.US_ASCII))) {
            return Optional.empty();
        }
        String status = text(body.get("transactionStatus"));
        return Optional.of(new Notification(reference, status, status == null ? Outcome.UNKNOWN
                : outcome(status, Kind.STATUS), minor(text(body.get("amount"))), text(body.get("currency")),
                text(body.get("recToken")), text(body.get("cardPan")), text(body.get("cardType")),
                text(body.get("reasonCode")), text(body.get("reason"))));
    }

    @Override
    public Map<String, Object> acknowledge(Merchant merchant, String reference) {
        long time = clock.instant().getEpochSecond();
        Map<String, Object> answer = new LinkedHashMap<>();
        answer.put("orderReference", reference);
        answer.put("status", "accept");
        answer.put("time", time);
        answer.put("signature", sign(merchant, reference, "accept", Long.toString(time)));
        return answer;
    }

    // ---------------------------------------------------------------- helpers

    /** HMAC_MD5 of the values joined by ";" (an absent value is an empty string), lower-case hex. */
    static String sign(Merchant merchant, String... values) {
        String data = String.join(";", java.util.Arrays.stream(values).map(v -> v == null ? "" : v).toList());
        try {
            Mac mac = Mac.getInstance("HmacMD5");
            mac.init(new SecretKeySpec(merchant.secret().getBytes(StandardCharsets.UTF_8), "HmacMD5"));
            return HexFormat.of().formatHex(mac.doFinal(data.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException("HmacMD5 unavailable", e);
        }
    }

    /** 12345 → "123.45"; the provider takes decimals in the main unit. */
    static String amount(long minor) {
        return BigDecimal.valueOf(minor, 2).toPlainString();
    }

    static long minor(String amount) {
        return amount == null ? 0 : new BigDecimal(amount).movePointRight(2).longValueExact();
    }

    private static String text(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof BigDecimal d) {
            return d.stripTrailingZeros().scale() <= 0 ? d.toBigInteger().toString() : d.toPlainString();
        }
        String s = value.toString();
        return s.isEmpty() ? null : s;
    }

    private static String or(String value, String fallback) {
        return value == null || value.isBlank() ? fallback : value;
    }
}
