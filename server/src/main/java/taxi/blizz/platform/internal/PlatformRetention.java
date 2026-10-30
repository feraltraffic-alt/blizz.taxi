package taxi.blizz.platform.internal;

import java.time.OffsetDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.RetentionWork;

@Configuration(proxyBeanMethods=false)
class PlatformRetention {
    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    PlatformRetention(JdbcClient jdbc,PlatformTransactionManager transactions) {
        this.jdbc=jdbc;tx=new TransactionTemplate(transactions);tx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }
    @Bean RetentionWork deliveredEventRetention(){return batch("delivered_events","outbox","event_id","state='DONE' and ");}
    @Bean RetentionWork consumerReceiptRetention(){return batch("consumer_receipts","consumer_inbox","consumer_id,event_id","");}
    @Bean RetentionWork commandReceiptRetention(){return batch("command_receipts","command_receipt","scope,command_id","completed_at is not null and ");}
    private RetentionWork batch(String kind,String table,String keys,String predicate) {
        return new RetentionWork() {
            public String kind(){return kind;}
            public String selectionSql(int limit){return "select "+keys+" from "+table+" where "+predicate+"completed_at<:cutoff order by completed_at,"+keys+" limit "+RetentionWork.limit(limit)+" for update skip locked";}
            public Result run(OffsetDateTime cutoff,OffsetDateTime now,int limit) {
                int deleted=tx.execute(status->jdbc.sql("delete from "+table+" where ("+keys+") in ("+selectionSql(limit)+")")
                    .param("cutoff",cutoff).update());
                return new Result(deleted,0);
            }
        };
    }
}
