package taxi.blizz.telephony.internal;

import java.time.OffsetDateTime;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.RetentionWork;

@Component
class CodeDeliveryRetention implements RetentionWork {
    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    CodeDeliveryRetention(JdbcClient jdbc,PlatformTransactionManager transactions) {
        this.jdbc=jdbc;tx=new TransactionTemplate(transactions);tx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }
    public String kind(){return "code_deliveries";}
    public String selectionSql(int limit){return "select id from otp_delivery where attempted_at<:cutoff order by attempted_at,id limit "+RetentionWork.limit(limit)+" for update skip locked";}
    public Result run(OffsetDateTime cutoff,OffsetDateTime now,int limit) {
        int deleted=tx.execute(status->jdbc.sql("delete from otp_delivery where id in ("+selectionSql(limit)+")").param("cutoff",cutoff).update());
        return new Result(deleted,0);
    }
}
