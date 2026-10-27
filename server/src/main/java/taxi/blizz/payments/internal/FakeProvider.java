package taxi.blizz.payments.internal;

import java.time.Clock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * A stand-in provider for tests and the sandbox (merchants with provider FAKE). It speaks the WayForPay protocol
 * with a simulated gateway behind it, so signatures and status handling are exercised for real; nothing leaves the
 * server. Tests can queue the next answers (e.g. a decline or a timeout).
 */
class FakeProvider extends WayForPayProvider {

    /** Answers the gateway gives next, in order; empty means "approve". */
    static final class Gateway implements Transport {

        private final Function<String, String> secretOfAccount;
        private final Deque<String> script = new ArrayDeque<>();
        private final Map<String, String> statusOf = new ConcurrentHashMap<>();
        private final List<Map<String, Object>> requests = new ArrayList<>();

        Gateway(Function<String, String> secretOfAccount) {
            this.secretOfAccount = secretOfAccount;
        }

        /**
         * Queue answers for the next calls: a status ("Declined", "Approved", ...), "TIMEOUT" (the request never
         * arrives) or "LOST_ANSWER" (the bank does it but the answer is lost).
         */
        synchronized void next(String... answers) {
            script.addAll(List.of(answers));
        }

        synchronized List<Map<String, Object>> requests() {
            return List.copyOf(requests);
        }

        synchronized void reset() {
            script.clear();
            requests.clear();
        }

        @Override
        public synchronized Map<String, Object> post(String url, Map<String, Object> body) throws Exception {
            requests.add(Map.copyOf(body));
            String type = (String) body.get("transactionType");
            String reference = (String) body.get("orderReference");
            String scripted = script.poll();
            if ("TIMEOUT".equals(scripted)) {
                // The request never reached the bank.
                throw new java.net.SocketTimeoutException("fake gateway timeout");
            }
            boolean answerLost = "LOST_ANSWER".equals(scripted);
            if (answerLost) {
                scripted = null; // the bank does it, but the answer never comes back
            }
            String status = scripted != null ? scripted : switch (type) {
                case "CHARGE" -> "AUTH".equals(body.get("merchantTransactionType")) ? "WaitingAuthComplete" : "Approved";
                case "SETTLE" -> "Approved";
                case "REFUND" -> "WaitingAuthComplete".equals(statusOf.get(reference)) ? "Voided" : "Refunded";
                case "CHECK_STATUS" -> statusOf.getOrDefault(reference, "Declined");
                default -> "Declined";
            };
            if (!"CHECK_STATUS".equals(type)) {
                statusOf.put(reference, status);
            }
            if (answerLost) {
                throw new java.net.SocketTimeoutException("fake gateway: answer lost");
            }
            String account = (String) body.get("merchantAccount");
            Merchant merchant = new Merchant(null, "FAKE", account, "", secretOfAccount.apply(account), "");
            String reasonCode = status.equalsIgnoreCase("Declined") ? "1105" : "1100";
            Map<String, Object> answer = new LinkedHashMap<>();
            answer.put("merchantAccount", account);
            answer.put("orderReference", reference);
            answer.put("transactionStatus", status);
            answer.put("reasonCode", reasonCode);
            answer.put("reason", status.equalsIgnoreCase("Declined") ? "Insufficient funds" : "Ok");
            if ("REFUND".equals(type)) {
                answer.put("merchantSignature", sign(merchant, account, reference, status, reasonCode));
            } else {
                Object amount = body.getOrDefault("amount", "0");
                String currency = (String) body.getOrDefault("currency", "UAH");
                answer.put("amount", amount);
                answer.put("currency", currency);
                answer.put("authCode", "FAKE01");
                answer.put("cardPan", "41****1111");
                answer.put("merchantSignature", sign(merchant, account, reference, String.valueOf(amount), currency,
                        "FAKE01", "41****1111", status, reasonCode));
            }
            return answer;
        }
    }

    private final Gateway gateway;
    private final String verifyUrl;

    FakeProvider(Gateway gateway, Clock clock, String publicBaseUrl) {
        super(gateway, clock, 172800);
        this.gateway = gateway;
        this.verifyUrl = publicBaseUrl + "/payments/v1/fake/verify";
    }

    @Override
    public String name() {
        return "FAKE";
    }

    @Override
    String verifyUrl() {
        return verifyUrl;
    }

    Gateway gateway() {
        return gateway;
    }
}
