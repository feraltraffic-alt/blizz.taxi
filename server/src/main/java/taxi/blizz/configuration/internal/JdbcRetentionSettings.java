package taxi.blizz.configuration.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.RetentionSettings;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.*;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcRetentionSettings implements RetentionSettings {
    static final Map<String,Integer> DEFAULTS=Map.of("sessions",30,"sign_in_codes",90,"code_deliveries",90,
        "delivered_events",30,"consumer_receipts",30,"command_receipts",30,"upload_sessions",7,"quarantined_files",30,"call_recordings",0);
    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final JsonMapper json;
    private final Clock clock;
    JdbcRetentionSettings(JdbcClient jdbc,StaffAccess staff,IdempotentCommands commands,AuditLog audit,JsonMapper json,Clock clock) {
        this.jdbc=jdbc;this.staff=staff;this.commands=commands;this.audit=audit;this.json=json;this.clock=clock;
    }
    @Override @Transactional(readOnly=true)
    public Version current() {
        return jdbc.sql("select version,days::text,changed_by,reason,changed_at from retention_settings order by version desc limit 1")
            .query((rs,i)->new Version(rs.getLong(1),readDays(rs.getString(2)),rs.getObject(3,UUID.class),rs.getString(4),rs.getObject(5,OffsetDateTime.class)))
            .optional().orElse(new Version(0,DEFAULTS,null,null,null));
    }
    @SuppressWarnings("unchecked") private Map<String,Integer> readDays(String value){return json.readValue(value,Map.class);}
    @Override public Map<String,Integer> days(){return current().days();}
    record Change(long expectedVersion,Map<String,Integer> days,String reason){}
    @Override public Version change(Actor actor,UUID commandId,long expectedVersion,Map<String,Integer> days,String reason) {
        require(staff,actor);
        if(days==null||!days.keySet().equals(DEFAULTS.keySet())||days.values().stream().anyMatch(n->n==null||n<0)
                ||reason==null||reason.isBlank()||expectedVersion<0)throw new DomainException(ErrorCode.VALIDATION_FAILED,"Invalid retention settings");
        Map<String,Integer> clean=java.util.Collections.unmodifiableMap(new java.util.TreeMap<>(days));
        return commands.execute(new CommandKey(actor,"retention.change",commandId),new Change(expectedVersion,clean,reason),Version.class,()->{
            jdbc.sql("select pg_advisory_xact_lock(hashtext('retention-settings'))").query().singleRow();
            Version before=current();if(before.version()!=expectedVersion)throw new DomainException(ErrorCode.VERSION_CONFLICT,"Retention settings changed");
            Version after=new Version(before.version()+1,clean,actor.id(),reason,OffsetDateTime.ofInstant(clock.instant(),ZoneOffset.UTC));
            jdbc.sql("insert into retention_settings(version,days,changed_by,reason,changed_at) values(:v,cast(:days as jsonb),:by,:reason,:at)")
                .param("v",after.version()).param("days",json.writeValueAsString(clean)).param("by",actor.id()).param("reason",reason).param("at",after.changedAt()).update();
            audit.record(new AuditEntry(actor,"retention.change","retention_settings",Long.toString(after.version()),reason,before.days(),clean));
            return after;
        });
    }
    static void require(StaffAccess staff,Actor actor) {
        staff.require(actor,MANAGE_PERMISSION);
        if(!staff.scope(actor,MANAGE_PERMISSION).allCities())throw new DomainException(ErrorCode.ACCESS_DENIED,"Retention settings require all-city scope");
    }
}
