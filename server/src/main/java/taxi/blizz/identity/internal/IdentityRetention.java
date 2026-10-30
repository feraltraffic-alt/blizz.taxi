package taxi.blizz.identity.internal;

import java.time.OffsetDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.RetentionWork;

/** Identity writes only its own expired tokens and challenges. Each invocation commits one bounded batch. */
@Configuration(proxyBeanMethods=false)
class IdentityRetention {
    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    IdentityRetention(JdbcClient jdbc,PlatformTransactionManager transactions) {
        this.jdbc=jdbc;tx=new TransactionTemplate(transactions);tx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }
    @Bean RetentionWork sessionRetention(){return batch("sessions","refresh_token","token_hash","inactive_at");}
    @Bean RetentionWork signInCodeRetention(){return batch("sign_in_codes","otp_challenge","id","created_at");}
    private RetentionWork batch(String kind,String table,String key,String age) {
        return new RetentionWork() {
            public String kind(){return kind;}
            public String selectionSql(int limit){return "select "+key+" from "+table+" where "+age+"<:cutoff order by "+age+","+key+" limit "+RetentionWork.limit(limit)+" for update skip locked";}
            public Result run(OffsetDateTime cutoff,OffsetDateTime now,int limit) {
                int deleted=tx.execute(status->jdbc.sql("delete from "+table+" where "+key+" in ("+selectionSql(limit)+")")
                    .param("cutoff",cutoff).update());
                return new Result(deleted,0);
            }
        };
    }
}
