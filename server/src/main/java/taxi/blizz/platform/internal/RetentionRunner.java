package taxi.blizz.platform.internal;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.RetentionPolicy;
import taxi.blizz.platform.RetentionWork;

/** Stateless coordination: every invocation reads current policy and leaves transaction ownership to the module. */
@Component
class RetentionRunner implements taxi.blizz.platform.RetentionRuns {
    private static final Logger log=LoggerFactory.getLogger(RetentionRunner.class);
    private final RetentionPolicy policy;
    private final List<RetentionWork> work;
    private final MeterRegistry metrics;
    private final Clock clock;
    RetentionRunner(RetentionPolicy policy,List<RetentionWork> work,MeterRegistry metrics,Clock clock) {
        this.policy=policy;this.work=List.copyOf(work);this.metrics=metrics;this.clock=clock;
        for(String kind:RetentionPolicy.KINDS)if(work.stream().noneMatch(w->w.kind().equals(kind)))
            throw new IllegalStateException("Missing retention work: "+kind);
        for(RetentionWork item:work)if(!RetentionPolicy.KINDS.contains(item.kind()))
            throw new IllegalStateException("Unknown retention work: "+item.kind());
    }
    @Override public Map<String,RetentionWork.Result> runOnce() {
        Map<String,RetentionWork.Result> result=new LinkedHashMap<>();
        OffsetDateTime now=OffsetDateTime.ofInstant(clock.instant(),ZoneOffset.UTC);
        for(String kind:RetentionPolicy.KINDS)result.put(kind,runKindAt(kind,now));
        return result;
    }
    RetentionWork.Result runKind(String kind) {
        return runKindAt(kind,OffsetDateTime.ofInstant(clock.instant(),ZoneOffset.UTC));
    }
    RetentionWork.Result runKindAt(String kind,OffsetDateTime now) {
        if(!RetentionPolicy.KINDS.contains(kind))throw new IllegalArgumentException("Unknown retention kind");
        RetentionWork.Result total=new RetentionWork.Result(0,0);
        Integer days;
        try {
            days=policy.days().get(kind);
            if(days==null||days<0)throw new IllegalStateException("Invalid retention policy: "+kind);
        } catch(RuntimeException ex) {
            log.warn("Retention policy read failed for {} ({})",kind,ex.getClass().getSimpleName());
            count("blizz.retention.failures",kind,1);
            return new RetentionWork.Result(0,1,0);
        }
        List<RetentionWork> own=work.stream().filter(item->item.kind().equals(kind)).toList();
        if(days!=0)for(int i=0;i<own.size();i++) {
            int remaining=1000-total.examined();if(remaining<=0)break;
            // Share the budget so failed source copies cannot starve unlinked recording files.
            int budget=Math.max(1,remaining/(own.size()-i));
            try {total=total.plus(own.get(i).run(cutoff(now,days),now,budget));}
            catch(RuntimeException ex) {
                // An unexpected failure may follow committed items: reserve its entire allocation.
                total=total.plus(new RetentionWork.Result(0,1,budget));
                log.warn("Retention batch failed for {} ({})",kind,ex.getClass().getSimpleName());
            }
        }
        count("blizz.retention.deleted",kind,total.deleted());count("blizz.retention.failures",kind,total.failures());
        return total;
    }
    private static OffsetDateTime cutoff(OffsetDateTime now,int days) {
        OffsetDateTime value=now.minusDays(days);
        // PostgreSQL encodes this JDBC sentinel as -infinity, for policies longer than its finite date range.
        return value.getYear() < -4712 ? OffsetDateTime.MIN : value;
    }
    private void count(String name,String kind,int amount) {
        try {metrics.counter(name,"kind",kind).increment(amount);}
        catch(RuntimeException ex){log.warn("Could not record retention metric for {} ({})",kind,ex.getClass().getSimpleName());}
    }
}
