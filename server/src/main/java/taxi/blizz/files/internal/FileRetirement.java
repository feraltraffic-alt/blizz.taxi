package taxi.blizz.files.internal;

import java.io.IOException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.RetentionWork;

/** Claims fence attachment/upload, including after a crash; bytes are removed with no open DB transaction. */
@Component
class FileRetirement {
    private static final Logger log=LoggerFactory.getLogger(FileRetirement.class);
    private static final String AVAILABLE="(retention_claim is null or retention_until<=:now)";
    private final JdbcClient jdbc;
    private final FileStorage storage;
    private final TransactionTemplate tx;
    private final Clock clock;
    FileRetirement(JdbcClient jdbc,FileStorage storage,PlatformTransactionManager transactions,Clock clock) {
        this.jdbc=jdbc;this.storage=storage;this.clock=clock;
        tx=new TransactionTemplate(transactions);tx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }
    static String eligibility(String kind) {
        return switch(kind) {
            case "upload_sessions" -> "attached_at is null and purpose<>'CALL_RECORDING' and state in ('AWAITING_UPLOAD','SAFE','REJECTED') and coalesce(uploaded_at,scanned_at,upload_expires_at)<:cutoff";
            case "quarantined_files" -> "attached_at is null and purpose<>'CALL_RECORDING' and state='QUARANTINE' and coalesce(quarantine_at,uploaded_at,created_at)<:cutoff";
            case "call_recordings" -> "attached_at is null and purpose='CALL_RECORDING' and coalesce(uploaded_at,scanned_at,created_at)<:cutoff";
            default -> throw new IllegalArgumentException("Unknown file retention kind");
        };
    }
    static String age(String kind) {
        return switch(kind) {
            case "upload_sessions" -> "coalesce(uploaded_at,scanned_at,upload_expires_at)";
            case "quarantined_files" -> "coalesce(quarantine_at,uploaded_at,created_at)";
            case "call_recordings" -> "coalesce(uploaded_at,scanned_at,created_at)";
            default -> throw new IllegalArgumentException("Unknown file retention kind");
        };
    }
    String selection(String kind,int limit) {
        return "select id from file_object where "+eligibility(kind)+" and "+AVAILABLE+" order by "+age(kind)+",id limit "+RetentionWork.limit(limit);
    }
    private record Claimed(UUID id,String key,UUID claim){}
    private record Attempt(boolean gone,int deleted,int failures){}
    RetentionWork.Result run(String kind,OffsetDateTime cutoff,OffsetDateTime now,int limit) {
        RetentionWork.Result total=new RetentionWork.Result(0,0,0);
        for(UUID id:jdbc.sql(selection(kind,limit)).params(Map.of("cutoff",cutoff,"now",now)).query(UUID.class).list()) {
            Attempt attempt=retire(id,eligibility(kind),Map.of("cutoff",cutoff,"now",now),now);
            total=total.plus(new RetentionWork.Result(attempt.deleted(),attempt.failures(),1));
        }
        return total;
    }
    boolean recording(UUID id) {
        OffsetDateTime now=OffsetDateTime.ofInstant(clock.instant(),ZoneOffset.UTC);
        return retire(id,"purpose='CALL_RECORDING'",Map.of("now",now),now).gone();
    }
    private Attempt retire(UUID id,String eligibility,Map<String,Object> params,OffsetDateTime now) {
        Claimed claimed=tx.execute(status->{
            var row=jdbc.sql("select id,storage_key from file_object where id=:id and "+eligibility+" and "+AVAILABLE+" for update skip locked")
                .params(params).param("id",id).query((rs,i)->new Claimed(rs.getObject(1,UUID.class),rs.getString(2),UUID.randomUUID())).optional();
            if(row.isEmpty())return null;
            Claimed item=row.get();
            jdbc.sql("update file_object set retention_claim=:claim,retention_until=:until where id=:id")
                .param("claim",item.claim()).param("until",now.plusMinutes(10)).param("id",id).update();
            return item;
        });
        if(claimed==null) {
            boolean exists=jdbc.sql("select exists(select 1 from file_object where id=:id)").param("id",id).query(Boolean.class).single();
            return new Attempt(!exists,0,0);
        }
        try {
            if(claimed.key()!=null)storage.delete(claimed.key());
            int deleted=tx.execute(status->jdbc.sql("delete from file_object where id=:id and retention_claim=:claim")
                .param("id",id).param("claim",claimed.claim()).update());
            return new Attempt(deleted==1,deleted,0);
        } catch(IOException|RuntimeException ex) {
            // Never clear the fence: an uncertain storage result must not make the file attachable again.
            try {tx.executeWithoutResult(status->jdbc.sql("update file_object set retention_until=:now where id=:id and retention_claim=:claim")
                .param("now",now).param("id",id).param("claim",claimed.claim()).update());}
            catch(RuntimeException retry){log.warn("File retention retry marker failed ({})",retry.getClass().getSimpleName());}
            log.warn("File retention failed for {} ({})",id,ex.getClass().getSimpleName());
            return new Attempt(false,0,1);
        }
    }
}
