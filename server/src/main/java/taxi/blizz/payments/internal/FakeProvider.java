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
        private final Clock clock;
        private final Map<String, Map<String, Map<String, Object>>> statement = new ConcurrentHashMap<>();
        private final Map<String, Map<String, Map<String, Object>>> injected = new ConcurrentHashMap<>();
        private final Map<String, Map<String, Object>> statementOverrides = new ConcurrentHashMap<>();
        private final Deque<String> script = new ArrayDeque<>();
        private final Map<String, String> statusOf = new ConcurrentHashMap<>();
        private final List<Map<String, Object>> requests = new ArrayList<>();

        /**
         * The fault tests' bank (issue #146): with {@code journal}, every request and every status the bank keeps is
         * appended to that file and read back at start, so the bank remembers across a crash of this process, as a
         * real one would. Null keeps it in memory only.
         */
        private final java.nio.file.Path journal;
        private boolean replaying;

        Gateway(Function<String, String> secretOfAccount, Clock clock) {
            this(secretOfAccount, clock, null);
        }

        Gateway(Function<String, String> secretOfAccount, Clock clock, java.nio.file.Path journal) {
            this.secretOfAccount = secretOfAccount;
            this.clock = clock;
            this.journal = journal;
            if (journal != null && java.nio.file.Files.exists(journal)) {
                replay();
            }
        }

        @SuppressWarnings("unchecked")
        private synchronized void replay() {
            replaying = true;
            try {
                for (String line : java.nio.file.Files.readAllLines(journal)) {
                    if (line.isBlank()) {
                        continue;
                    }
                    Map<String, Object> entry = PaymentsConfiguration.PROVIDER_JSON.readValue(line, Map.class);
                    switch ((String) entry.get("kind")) {
                        case "record" -> record((String) entry.get("account"), (String) entry.get("reference"),
                                (String) entry.get("status"), (String) entry.get("amount"),
                                (String) entry.get("currency"));
                        case "status" -> record((String) entry.get("reference"), (String) entry.get("status"));
                        default -> { } // a request: counted by the fault tests, nothing to restore
                    }
                }
            } catch (java.io.IOException e) {
                throw new java.io.UncheckedIOException(e);
            } finally {
                replaying = false;
            }
        }

        private void journal(Map<String, Object> entry) {
            if (journal == null || replaying) {
                return;
            }
            try {
                java.nio.file.Files.writeString(journal,
                        PaymentsConfiguration.PROVIDER_JSON.writeValueAsString(entry) + "\n",
                        java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
            } catch (java.io.IOException e) {
                throw new java.io.UncheckedIOException(e);
            }
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

        /** What the bank now knows about {@code reference}, e.g. a payment made on the FAKE payment page. */
        synchronized void record(String reference, String status) {
            journal(Map.of("kind", "status", "reference", reference, "status", status));
            statusOf.replaceAll((key,old)->key.endsWith("\0"+reference)?status:old);
            for (Map<String,Map<String,Object>> entries:statement.values()) {
                Map<String,Object> old=entries.get(reference);
                if (old!=null) {
                    Map<String,Object> changed=new LinkedHashMap<>(old);
                    changed.put("transactionStatus",status);
                    changed.put("processingDate",clock.instant().getEpochSecond());
                    entries.put(reference,Map.copyOf(changed));
                }
            }
        }

        /** Independently supplied bank evidence; tests/sandbox can deliberately contradict application SQL. */
        synchronized void reconciliationList(String account, Map<String, Object> response) {
            if (response == null) statementOverrides.remove(account);
            else statementOverrides.put(account, Map.copyOf(response));
        }

        synchronized void record(String account, String reference, String status, String amount, String currency) {
            journal(Map.of("kind", "record", "account", account, "reference", reference, "status", status,
                    "amount", amount, "currency", currency));
            statusOf.put(account+"\0"+reference,status);
            Map<String,Map<String,Object>> entries=statement.computeIfAbsent(account, ignored->new LinkedHashMap<>());
            Map<String,Object> old=entries.get(reference);
            long now=clock.instant().getEpochSecond();
            Map<String,Object> row=new LinkedHashMap<>();
            row.put("orderReference",reference);
            row.put("transactionType","PURCHASE");
            row.put("transactionStatus",status);
            row.put("amount",amount);
            row.put("currency",currency);
            row.put("createdDate",old==null?now:old.get("createdDate"));
            row.put("processingDate",now);
            entries.put(reference,Map.copyOf(row));
        }

        synchronized void injectReconciliationTransaction(String account,java.util.UUID fixture,long amount,String currency) {
            String reference="sandbox-reconciliation-"+fixture;
            Map<String,Map<String,Object>> entries=injected.computeIfAbsent(account,ignored->new LinkedHashMap<>());
            Map<String,Object> old=entries.get(reference);
            if (old!=null) {
                if (!WayForPayProvider.amount(amount, currency).equals(old.get("amount"))
                        || !currency.equals(old.get("currency"))) {
                    throw new IllegalArgumentException("Fixture already has different accounting fields");
                }
                return;
            }
            long now=clock.instant().getEpochSecond();
            entries.put(reference,Map.of("orderReference",reference,"transactionType","PURCHASE",
                    "transactionStatus","Approved","amount",WayForPayProvider.amount(amount, currency),"currency",currency,
                    "createdDate",now,"processingDate",now));
        }

        synchronized void removeReconciliationTransaction(String account,java.util.UUID fixture) {
            Map<String,Map<String,Object>> entries=injected.get(account);
            if (entries!=null) entries.remove("sandbox-reconciliation-"+fixture);
        }

        private Map<String,Object> transactions(Map<String,Object> request) {
            String account=(String)request.get("merchantAccount");
            Map<String,Object> override=statementOverrides.get(account);
            if (override!=null) return override;
            long from=((Number)request.get("dateBegin")).longValue();
            long to=((Number)request.get("dateEnd")).longValue();
            // Deliberately model creation-date selection: later SETTLE/REFUND still use the original anchor.
            List<Map<String,Object>> rows=java.util.stream.Stream.concat(
                    statement.getOrDefault(account,Map.of()).values().stream(),
                    injected.getOrDefault(account,Map.of()).values().stream())
                    .filter(row->((Number)row.get("createdDate")).longValue()>=from
                            && ((Number)row.get("createdDate")).longValue()<=to).toList();
            return Map.of("reasonCode",1100,"transactionList",rows);
        }

        synchronized void reset() {
            script.clear();
            requests.clear();
        }

        @Override
        public synchronized Map<String, Object> post(String url, Map<String, Object> body) throws Exception {
            requests.add(Map.copyOf(body));
            Map<String, Object> request = new LinkedHashMap<>();
            request.put("kind", "request");
            request.put("type", String.valueOf(body.get("transactionType")));
            request.put("merchant_type", String.valueOf(body.get("merchantTransactionType")));
            request.put("reference", String.valueOf(body.get("orderReference")));
            request.put("amount", String.valueOf(body.get("amount")));
            journal(request);
            String account = (String) body.get("merchantAccount");
            String type = (String) body.get("transactionType");
            String reference = (String) body.get("orderReference");
            String scripted = script.poll();
            if ("TIMEOUT".equals(scripted)) {
                // The request never reached the bank.
                throw new java.net.SocketTimeoutException("fake gateway timeout");
            }
            if (scripted != null && scripted.startsWith("REASON:")) {
                // An error before any transaction is described: a reason code and no status, as the real gateway.
                return Map.of("merchantAccount", account, "reasonCode", scripted.substring(7), "reason", "Fake error");
            }
            if ("TRANSACTION_LIST".equals(type)) {
                if ("LOST_ANSWER".equals(scripted)) throw new java.net.SocketTimeoutException("fake gateway timeout");
                return transactions(body);
            }
            boolean answerLost = "LOST_ANSWER".equals(scripted);
            if (answerLost) {
                scripted = null; // the bank does it, but the answer never comes back
            }
            String status = scripted != null ? scripted : switch (type) {
                case "CHARGE" -> "AUTH".equals(body.get("merchantTransactionType")) ? "WaitingAuthComplete" : "Approved";
                case "SETTLE" -> "Approved";
                case "REFUND" -> "WaitingAuthComplete".equals(statusOf.get(account+"\0"+reference)) ? "Voided" : "Refunded";
                case "CHECK_STATUS" -> statusOf.get(account+"\0"+reference);
                default -> "Declined";
            };
            if (status == null) {
                // As the real gateway: a reference it never saw is "Order Not Found", without a status.
                return Map.of("merchantAccount", account, "orderReference", reference, "reasonCode",
                        PaymentProvider.ORDER_NOT_FOUND, "reason", "Order Not Found");
            }
            if (("SETTLE".equals(type) || "REFUND".equals(type)) && "Declined".equalsIgnoreCase(status)) {
                statusOf.put(account+"\0"+reference,status); // A declined follow-up does not undo the bank's earlier hold/charge.
            } else if (!"CHECK_STATUS".equals(type)) {
                record((String)body.get("merchantAccount"),reference,status,
                        String.valueOf(body.getOrDefault("amount","0")),(String)body.getOrDefault("currency","UAH"));
            }
            if (answerLost) {
                throw new java.net.SocketTimeoutException("fake gateway: answer lost");
            }
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
    private final String payUrl;

    FakeProvider(Gateway gateway, Clock clock, String publicBaseUrl) {
        super(gateway, clock, 172800);
        this.gateway = gateway;
        this.verifyUrl = publicBaseUrl + "/payments/v1/fake/verify";
        this.payUrl = publicBaseUrl + "/payments/v1/fake/pay";
    }

    @Override
    public String name() {
        return "FAKE";
    }

    @Override
    String verifyUrl() {
        return verifyUrl;
    }

    @Override
    String payUrl() {
        return payUrl;
    }

    Gateway gateway() {
        return gateway;
    }
}
