package taxi.blizz.payments.internal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

/** Reads payments-owned accounting facts only; never card/customer fields and never applies a bank answer. */
@Component
class ReconciliationLocals {
    private static final int BATCH=256;
    private static final String CANDIDATES_SQL="""
            with changed as materialized (
                select intent_id,target from payment_operation where created_at>=:from and created_at<:until
                union select intent_id,target from payment_operation where updated_at>=:from and updated_at<:until
            ) select distinct c.target from changed c join payment_intent i on i.id=c.intent_id where i.merchant_id=:merchant
            """;
    private static final String OPERATIONS_SQL="""
            select o.id,o.type,o.reference,o.target,o.state,o.amount_minor,i.currency,o.created_at,o.updated_at
            from payment_operation o join payment_intent i on i.id=o.intent_id
            where o.target=any(cast(:references as text[])) and i.merchant_id=:merchant
            order by o.created_at,o.id
            """;
    record Local(UUID operationId,UUID recordId,String reference,String type,String state,String effectiveState,
                 long amountMinor,String currency,Instant createdAt,String pendingType,Long pendingAmount) {
        boolean uncertain() { return pendingType!=null; }
        boolean succeeded() { return Set.of("HELD","CAPTURED","RELEASED").contains(effectiveState); }
    }
    private record Operation(UUID id,String type,String reference,String target,String state,long amount,
                             String currency,Instant createdAt,Instant updatedAt) { }
    private final JdbcClient jdbc;
    ReconciliationLocals(JdbcClient jdbc) { this.jdbc=jdbc; }

    Set<String> candidates(UUID merchant,OffsetDateTime from,OffsetDateTime until) {
        Set<String> references=new java.util.LinkedHashSet<>(jdbc.sql(CANDIDATES_SQL).param("merchant",merchant)
                .param("from",from).param("until",until).query(String.class).list());
        for (String table:List.of("card_top_up","card_binding")) {
            references.addAll(jdbc.sql("select reference from "+table+" where merchant_id=:merchant and "
                    +"((created_at>=:from and created_at<:until) or (completed_at>=:from and completed_at<:until))")
                    .param("merchant",merchant).param("from",from).param("until",until).query(String.class).list());
        }
        return references;
    }

    Map<String,Local> load(UUID merchant,Collection<String> references) {
        List<String> sorted=references.stream().sorted().toList();
        Map<String,Local> result=new LinkedHashMap<>();
        for (int start=0;start<sorted.size();start+=BATCH) {
            String[] batch=sorted.subList(start,Math.min(sorted.size(),start+BATCH)).toArray(String[]::new);
            Map<String,List<Operation>> chains=new LinkedHashMap<>();
            for (Operation op:jdbc.sql(OPERATIONS_SQL).param("merchant",merchant).param("references",batch)
                    .query(ReconciliationLocals::operation).list()) {
                chains.computeIfAbsent(op.target(),ignored->new ArrayList<>()).add(op);
            }
            chains.forEach((reference,chain)->put(result,reference,normalize(reference,chain)));
            for (String table:List.of("card_top_up","card_binding")) {
                boolean binding="card_binding".equals(table);
                String amount=binding?"0::bigint": "amount_minor";
                String currency=binding?"(select currency from payment_merchant where id=:merchant)":"currency";
                String sql="select id,reference,state,"+amount+" as amount_minor,"+currency+" as currency,created_at "
                        +"from "+table+" where merchant_id=:merchant and reference=any(cast(:references as text[]))";
                for (Local local:jdbc.sql(sql).param("merchant",merchant).param("references",batch).query((rs,n)->{
                    String state=rs.getString("state");
                    String normalized=switch(state) {
                        case "COMPLETED"->"SUCCEEDED";
                        case "PENDING"->"PENDING";
                        case "FAILED","EXPIRED"->"DECLINED";
                        default->throw invalid();
                    };
                    String type=binding?"VERIFY":"TOP_UP";
                    long value=rs.getLong("amount_minor");
                    return new Local(null,rs.getObject("id",UUID.class),rs.getString("reference"),type,normalized,
                            "SUCCEEDED".equals(normalized)?"CAPTURED":normalized,value,rs.getString("currency"),
                            rs.getObject("created_at",OffsetDateTime.class).toInstant(),
                            "PENDING".equals(normalized)?type:null,"PENDING".equals(normalized)?value:null);
                }).list()) put(result,local.reference(),local);
            }
        }
        return result;
    }

    private static Local normalize(String reference,List<Operation> chain) {
        List<Operation> roots=chain.stream().filter(o->Set.of("AUTH","CHARGE","TIP").contains(o.type())).toList();
        if (roots.size()!=1 || !roots.getFirst().reference().equals(reference)) throw invalid();
        Operation root=roots.getFirst();
        List<Operation> captures=chain.stream().filter(o->"SETTLE".equals(o.type())&&"SUCCEEDED".equals(o.state())).toList();
        List<Operation> refunds=chain.stream().filter(o->"REFUND".equals(o.type())&&"SUCCEEDED".equals(o.state())).toList();
        if ((!captures.isEmpty() || !refunds.isEmpty()) && !"SUCCEEDED".equals(root.state())) throw invalid();
        if (!captures.isEmpty() && !"AUTH".equals(root.type())) throw invalid();
        long amount=root.amount();
        String effective=switch(root.state()) {
            case "SUCCEEDED"->"AUTH".equals(root.type())?"HELD":"CAPTURED";
            case "DECLINED"->"DECLINED";
            case "CANCELLED","CREATED"->"UNSENT";
            case "SENDING","PENDING","UNKNOWN"->"PENDING";
            default->throw invalid();
        };
        Operation selected=root;
        if (!captures.isEmpty()) {
            amount=captures.stream().mapToLong(Operation::amount).reduce(0,Math::addExact);
            effective="CAPTURED";
            selected=captures.getLast();
        }
        if (!refunds.isEmpty()) {
            long refunded=refunds.stream().mapToLong(Operation::amount).reduce(0,Math::addExact);
            if (refunded!=amount) throw new IllegalStateException("RECONCILIATION_UNSUPPORTED_PARTIAL_REFUND");
            effective="RELEASED";
            selected=refunds.getLast();
        }
        Operation pending=chain.stream().filter(o->Set.of("SENDING","PENDING","UNKNOWN").contains(o.state()))
                .max(Comparator.comparing(Operation::updatedAt).thenComparing(Operation::id)).orElse(null);
        if (pending!=null) selected=pending;
        return new Local(selected.id(),selected.id(),reference,selected.type(),selected.state(),effective,amount,
                root.currency(),root.createdAt(),pending==null?null:pending.type(),pending==null?null:pending.amount());
    }
    private static void put(Map<String,Local> result,String reference,Local local) {
        if (result.putIfAbsent(reference,local)!=null) throw invalid();
    }
    private static IllegalStateException invalid() { return new IllegalStateException("RECONCILIATION_AMBIGUOUS_LOCAL_REFERENCE"); }
    private static Operation operation(ResultSet rs,int row) throws SQLException {
        return new Operation(rs.getObject("id",UUID.class),rs.getString("type"),rs.getString("reference"),
                rs.getString("target"),rs.getString("state"),rs.getLong("amount_minor"),rs.getString("currency"),
                rs.getObject("created_at",OffsetDateTime.class).toInstant(),rs.getObject("updated_at",OffsetDateTime.class).toInstant());
    }
}
