package taxi.blizz.payments.internal;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import taxi.blizz.payments.PaymentReconciliations.Item;
import taxi.blizz.payments.PaymentReconciliations.Kind;
import taxi.blizz.payments.PaymentReconciliations.Run;
import taxi.blizz.payments.internal.PaymentProvider.ProviderTransaction;
import taxi.blizz.payments.internal.ReconciliationLocals.Local;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** Daily immutable observations, not another payment worker. No transaction surrounds the provider reads. */
@Component
class CardReconciliation {
    private static final Logger log=LoggerFactory.getLogger(CardReconciliation.class);
    private static final Set<String> SAFE_FAILURES=Set.of("RECONCILIATION_PROVIDER_UNAVAILABLE",
            "RECONCILIATION_INVALID_RESPONSE","RECONCILIATION_AMBIGUOUS_LOCAL_REFERENCE",
            "RECONCILIATION_CONFLICTING_BANK_EVIDENCE","RECONCILIATION_UNSUPPORTED_PARTIAL_REFUND",
            "RECONCILIATION_TOO_MANY_WINDOWS","RECONCILIATION_UNOWNED_PENDING_TRANSACTION","RECONCILIATION_LEASE_LOST",
            "RECONCILIATION_MERCHANT_UNAVAILABLE",
            "RECONCILIATION_LOCAL_CHANGED");
    private final Merchants merchants;
    private final Providers providers;
    private final ReconciliationStore store;
    private final ReconciliationLocals locals;
    private final ReconciliationMetrics metrics;
    private final Clock clock;
    private final int maximumWindows;

    CardReconciliation(Merchants merchants,Providers providers,ReconciliationStore store,ReconciliationLocals locals,
                       ReconciliationMetrics metrics,Clock clock,
                       @Value("${blizz.payments.reconciliation.maximum-supplementary-windows:31}") int maximumWindows) {
        this.merchants=merchants;this.providers=providers;this.store=store;this.locals=locals;this.metrics=metrics;
        this.clock=clock;this.maximumWindows=Math.max(0,Math.min(31,maximumWindows));
    }

    Run run(UUID merchantId,LocalDate day,boolean allowPartial) {
        if (TransactionSynchronizationManager.isActualTransactionActive()) {
            throw new IllegalStateException("Reconciliation cannot join a business transaction");
        }
        OffsetDateTime observed=OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        OffsetDateTime end=day.plusDays(1).atStartOfDay().atOffset(ZoneOffset.UTC).plusHours(2);
        if (day.isAfter(observed.toLocalDate()) || (!allowPartial && observed.isBefore(end))) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,"The UTC day and its overlap are not finished");
        }
        var attempt=store.begin(merchantId,day,observed.isBefore(end));
        if (!attempt.acquired()) return attempt.run();
        try {
            Merchant merchant=merchants.byId(merchantId)
                    .orElseThrow(()->new IllegalStateException("RECONCILIATION_MERCHANT_UNAVAILABLE"));
            PaymentProvider provider=providers.of(merchant);
            OffsetDateTime until=observed.isBefore(end)?observed:end;
            Set<String> cohort=locals.candidates(merchantId,attempt.run().periodFrom(),until);
            Map<String,Local> beforeBank=locals.load(merchantId,cohort);
            Map<String,ProviderTransaction> bank=new LinkedHashMap<>();
            for (ProviderTransaction row:provider.transactions(merchant,attempt.run().periodFrom().toInstant(),until.toInstant())) {
                merge(bank,row);
            }
            store.renew(attempt);
            Set<String> references=new LinkedHashSet<>(cohort);
            references.addAll(bank.keySet());
            Map<String,Local> local=locals.load(merchantId,references);
            Map<LocalDate,Set<String>> missingDays=new java.util.TreeMap<>();
            // Absent and older than the lookback (approved decision B): an item for a person, not a failed day.
            Set<String> tooOld=new LinkedHashSet<>();
            for (String reference:cohort) {
                Local known=local.get(reference);
                if (known!=null && (known.succeeded() || known.uncertain()) && !bank.containsKey(reference)) {
                    if (known.createdAt().isBefore(observed.minusDays(30).toInstant())) {
                        tooOld.add(reference);
                        continue;
                    }
                    LocalDate creationDay=known.createdAt().atOffset(ZoneOffset.UTC).toLocalDate();
                    if (!creationDay.equals(day)) missingDays.computeIfAbsent(creationDay,ignored->new LinkedHashSet<>()).add(reference);
                }
            }
            if (missingDays.size()>maximumWindows) throw new IllegalStateException("RECONCILIATION_TOO_MANY_WINDOWS");
            for (var window:missingDays.entrySet()) {
                Instant from=window.getKey().atStartOfDay().toInstant(ZoneOffset.UTC).minusSeconds(7200);
                Instant to=from.plusSeconds(100800);
                if (from.isBefore(observed.minusDays(30).toInstant())) from=observed.minusDays(30).toInstant();
                if (to.isAfter(observed.toInstant())) to=observed.toInstant();
                for (ProviderTransaction row:provider.transactions(merchant,from,to)) {
                    // These are compatibility lookups, not permission to import every historical bank row.
                    if (window.getValue().contains(row.reference())) merge(bank,row);
                }
                store.renew(attempt);
            }
            // A worker may have completed a callback while we fetched. Read the selected chains again, never apply.
            local=locals.load(merchantId,references);
            for (String reference:cohort) {
                if (!java.util.Objects.equals(beforeBank.get(reference),local.get(reference))) {
                    // A capture/void may finish while the bank snapshot is in flight; compare a stable retry.
                    throw new IllegalStateException("RECONCILIATION_LOCAL_CHANGED");
                }
            }
            List<Item> items=new ArrayList<>();
            for (String reference:references) {
                Local known=local.get(reference);
                ProviderTransaction row=bank.get(reference);
                if (row==null && tooOld.contains(reference)) {
                    items.add(item(attempt.run(),reference,Kind.NOT_CHECKED,known,null));
                } else if (known==null) {
                    if (row==null) throw new IllegalStateException("RECONCILIATION_AMBIGUOUS_LOCAL_REFERENCE");
                    String state=bankState(row.status());
                    if ("PENDING".equals(state)) throw new IllegalStateException("RECONCILIATION_UNOWNED_PENDING_TRANSACTION");
                    if (!"DECLINED".equals(state)) items.add(item(attempt.run(),reference,Kind.MISSING_LOCALLY,null,row));
                } else if (row==null) {
                    if (known.succeeded()) items.add(item(attempt.run(),reference,Kind.MISSING_AT_PROVIDER,known,null));
                } else {
                    compare(attempt.run(),reference,known,row,items);
                }
            }
            return store.complete(attempt,local.size(),List.copyOf(bank.values()),items,observed);
        } catch (RuntimeException failure) {
            String code=failure.getMessage()!=null && SAFE_FAILURES.contains(failure.getMessage())?failure.getMessage():"RECONCILIATION_FAILED";
            // No provider exception/cause/raw body is logged or persisted.
            log.warn("Card reconciliation failed: {}",code);
            Run failed=store.fail(attempt,code);
            metrics.failure();
            return failed;
        }
    }

    private static void compare(Run run,String reference,Local local,ProviderTransaction bank,List<Item> items) {
        String state=stateFor(local,bank);
        boolean finalUnknown=local.uncertain() && finalFor(local.pendingType(),bank.status());
        long expected=finalUnknown?local.pendingAmount():local.amountMinor();
        if (expected!=bank.amountMinor()) items.add(item(run,reference,Kind.AMOUNT,local,bank));
        if (!local.currency().equals(bank.currency())) items.add(item(run,reference,Kind.CURRENCY,local,bank));
        if (finalUnknown) items.add(item(run,reference,Kind.UNKNOWN_STILL,local,bank));
        else if (!"PENDING".equals(local.effectiveState()) && !local.effectiveState().equals(state)) {
            items.add(item(run,reference,Kind.STATE,local,bank));
        }
    }
    private static String bankState(String status) {
        return switch(status.toLowerCase(Locale.ROOT)) {
            case "approved"->"CAPTURED";
            case "waitingauthcomplete"->"HELD";
            case "refunded","voided"->"RELEASED";
            case "declined","expired"->"DECLINED";
            case "inprocessing","pending","created","refundinprocessing"->"PENDING";
            default->throw new IllegalStateException("RECONCILIATION_INVALID_RESPONSE");
        };
    }
    private static String stateFor(Local local,ProviderTransaction bank) {
        // The worker treats an expired AUTH as successfully released for its REFUND/void command.
        if (local!=null && "REFUND".equals(local.type()) && "expired".equalsIgnoreCase(bank.status())) return "RELEASED";
        return bankState(bank.status());
    }
    private static boolean finalFor(String type,String status) {
        String state=bankState(status);
        if ("REFUND".equals(type)) return "RELEASED".equals(state) || "expired".equalsIgnoreCase(status);
        if ("AUTH".equals(type)) return !"PENDING".equals(state);
        return Set.of("CAPTURED","RELEASED","DECLINED").contains(state);
    }
    private static void merge(Map<String,ProviderTransaction> rows,ProviderTransaction row) {
        ProviderTransaction old=rows.putIfAbsent(row.reference(),row);
        if (old!=null && !old.equals(row)) throw new IllegalStateException("RECONCILIATION_CONFLICTING_BANK_EVIDENCE");
    }
    private static Item item(Run run,String reference,Kind kind,Local local,ProviderTransaction bank) {
        return new Item(UUID.randomUUID(),run.id(),kind,ReconciliationStore.fingerprint(run.merchantId(),reference),
                ReconciliationStore.display(reference),
                local==null?null:local.operationId(),local==null?null:local.recordId(),local==null?null:local.type(),
                local==null?null:local.state(),local==null?null:(local.uncertain() && bank!=null && finalFor(local.pendingType(),bank.status())
                        ?local.pendingAmount():local.amountMinor()),local==null?null:local.currency(),
                bank==null?null:bank.type(),bank==null?null:stateFor(local,bank),bank==null?null:bank.status(),
                bank==null?null:bank.amountMinor(),bank==null?null:bank.currency(),bank==null?null:bank.feeMinor(),
                bank==null?null:ReconciliationStore.utc(bank.processedAt()==null?bank.createdAt():bank.processedAt()),
                "OPEN",null,null,null,null,0);
    }
}
