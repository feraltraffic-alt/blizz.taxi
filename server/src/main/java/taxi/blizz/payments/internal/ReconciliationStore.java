package taxi.blizz.payments.internal;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HexFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.payments.PaymentReconciliations;
import taxi.blizz.payments.PaymentReconciliations.Item;
import taxi.blizz.payments.PaymentReconciliations.Run;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;

/** Short payments-owned transactions; no provider/network code is reachable from this component. */
@Component
class ReconciliationStore {
    record Attempt(Run run, UUID token) { boolean acquired() { return token!=null; } }
    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final JdbcPaymentReconciliations views;
    private final Outbox outbox;
    private final Clock clock;

    ReconciliationStore(JdbcClient jdbc, TransactionTemplate transactions, JdbcPaymentReconciliations views,
                        Outbox outbox, Clock clock) {
        this.jdbc=jdbc; this.views=views; this.outbox=outbox; this.clock=clock;
        this.tx=new TransactionTemplate(transactions.getTransactionManager());
        this.tx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }

    Attempt begin(UUID merchant, LocalDate day, boolean partial) {
        OffsetDateTime start=day.atStartOfDay().atOffset(ZoneOffset.UTC).minusHours(2);
        OffsetDateTime end=start.plusDays(1).plusHours(4);
        return tx.execute(status->{
            OffsetDateTime now=now();
            UUID id=UUID.randomUUID();
            UUID token=UUID.randomUUID();
            jdbc.sql("""
                    insert into payment_reconciliation(id,merchant_id,day,period_from,period_to,partial,state,
                        attempts,lease_token,lease_until,created_at,updated_at)
                    values (:id,:merchant,:day,:start,:end,:partial,'RUNNING',1,:token,:lease,:now,:now)
                    on conflict (merchant_id,day,partial) do nothing
                    """).param("id",id).param("merchant",merchant).param("day",day).param("start",start)
                    .param("end",end).param("partial",partial).param("token",token).param("lease",now.plusMinutes(10))
                    .param("now",now).update();
            var row=jdbc.sql("""
                    select id,lease_token,lease_until from payment_reconciliation
                    where merchant_id=:merchant and day=:day and partial=:partial for update
                    """).param("merchant",merchant).param("day",day).param("partial",partial).query().singleRow();
            id=(UUID)row.get("id");
            Run run=views.run(id);
            if (token.equals(row.get("lease_token"))) return new Attempt(run,token);
            boolean retry="FAILED".equals(run.state()) || ("RUNNING".equals(run.state())
                    && jdbc.sql("select lease_until<=:now from payment_reconciliation where id=:id")
                        .param("now",now).param("id",id).query(Boolean.class).single());
            if (!retry) return new Attempt(run,null);
            jdbc.sql("""
                    update payment_reconciliation set state='RUNNING',attempts=attempts+1,lease_token=:token,
                        lease_until=:lease,updated_at=:now,finished_at=null,failure_code=null,version=version+1 where id=:id
                    """).param("token",token).param("lease",now.plusMinutes(10)).param("now",now).param("id",id).update();
            return new Attempt(views.run(id),token);
        });
    }

    Run fail(Attempt attempt,String safeCode) {
        return tx.execute(status->{
            jdbc.sql("""
                    update payment_reconciliation set state='FAILED',failure_code=:code,finished_at=:now,
                        updated_at=:now,lease_token=null,lease_until=null,version=version+1
                    where id=:id and lease_token=:token and state='RUNNING'
                    """).param("code",safeCode).param("now",now()).param("id",attempt.run().id())
                    .param("token",attempt.token()).update();
            return views.run(attempt.run().id());
        });
    }

    Run complete(Attempt attempt,int localCount,List<PaymentProvider.ProviderTransaction> entries,List<Item> items,
                 OffsetDateTime observedUntil) {
        return tx.execute(status->{
            UUID id=attempt.run().id();
            UUID token=jdbc.sql("select lease_token from payment_reconciliation where id=:id for update")
                    .param("id",id).query(UUID.class).optional().orElse(null);
            if (!attempt.token().equals(token)) return views.run(id); // A retry took over an expired lease.
            for (PaymentProvider.ProviderTransaction entry:entries) {
                jdbc.sql("""
                        insert into payment_reconciliation_entry(run_id,reference_fingerprint,provider_type,
                            provider_status,amount_minor,currency,fee_minor,created_at,processed_at)
                        values (:run,:fingerprint,:type,:status,:amount,:currency,:fee,:created,:processed)
                        """).param("run",id).param("fingerprint",fingerprint(attempt.run().merchantId(),entry.reference()))
                        .param("type",entry.type()).param("status",entry.status()).param("amount",entry.amountMinor())
                        .param("currency",entry.currency()).param("fee",entry.feeMinor()).param("created",utc(entry.createdAt()))
                        .param("processed",utc(entry.processedAt())).update();
            }
            for (Item item:items) {
                jdbc.sql("""
                        insert into payment_reconciliation_item(id,run_id,kind,reference_fingerprint,local_operation_id,local_record_id,
                            local_type,local_state,local_amount_minor,local_currency,provider_type,provider_state,
                            provider_status,provider_amount_minor,provider_currency,fee_minor,provider_at)
                        values (:id,:run,:kind,:fingerprint,:operation,:record,:localType,:localState,:localAmount,:localCurrency,
                            :providerType,:providerState,:providerStatus,:providerAmount,:providerCurrency,:fee,:at)
                        on conflict (run_id,reference_fingerprint,kind) do nothing
                        """).param("id",item.id()).param("run",id).param("kind",item.kind().name())
                        .param("fingerprint",item.referenceFingerprint()).param("operation",item.localOperationId()).param("record",item.localRecordId())
                        .param("localType",item.localType()).param("localState",item.localState())
                        .param("localAmount",item.localAmountMinor()).param("localCurrency",item.localCurrency())
                        .param("providerType",item.providerType()).param("providerState",item.providerState())
                        .param("providerStatus",item.providerStatus()).param("providerAmount",item.providerAmountMinor())
                        .param("providerCurrency",item.providerCurrency()).param("fee",item.feeMinor()).param("at",item.providerAt()).update();
            }
            int count=jdbc.sql("select count(*) from payment_reconciliation_item where run_id=:id")
                    .param("id",id).query(Integer.class).single();
            jdbc.sql("""
                    update payment_reconciliation set state=:state,local_count=:locals,provider_count=:providers,
                        item_count=:count,open_count=:count,observed_until=:observed,finished_at=:now,updated_at=:now,
                        lease_token=null,lease_until=null,version=version+1 where id=:id
                    """).param("state",count==0?"CLEAN":"OPEN").param("locals",localCount).param("providers",entries.size())
                    .param("count",count).param("observed",observedUntil).param("now",now()).param("id",id).update();
            if (count>0) {
                Map<String,Object> payload=new LinkedHashMap<>();
                payload.put("run_id",id); payload.put("merchant_id",attempt.run().merchantId());
                payload.put("open_item_count",count);
                payload.put("kinds",items.stream().map(item->item.kind().name()).distinct().sorted().toList());
                List<UUID> cities=jdbc.sql("select city_id from payment_merchant_city where merchant_id=:merchant")
                        .param("merchant",attempt.run().merchantId()).query(UUID.class).list();
                if (cities.size()==1) payload.put("city_id",cities.getFirst());
                outbox.publish(new OutboxEvent(PaymentReconciliations.DIFFERENCES_FOUND,1,"PaymentReconciliation",id,1,payload));
            }
            return views.run(id);
        });
    }

    static String fingerprint(UUID merchant,String reference) {
        try {
            return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256")
                    .digest((merchant+"\\0"+reference).getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException impossible) { throw new IllegalStateException("SHA-256 unavailable"); }
    }
    private OffsetDateTime now() { return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC); }
    static OffsetDateTime utc(java.time.Instant instant) { return instant==null?null:instant.atOffset(ZoneOffset.UTC); }
}
