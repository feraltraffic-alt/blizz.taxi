package taxi.blizz.platform.internal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="blizz.retention.enabled",havingValue="true",matchIfMissing=true)
class TechnicalRetentionSchedule {
    private final RetentionRunner runner;
    TechnicalRetentionSchedule(RetentionRunner runner){this.runner=runner;}
    @Scheduled(fixedDelayString="${blizz.retention.interval:PT1M}")
    void sessions(){runner.runKind("sessions");}
    @Scheduled(fixedDelayString="${blizz.retention.interval:PT1M}")
    void signInCodes(){runner.runKind("sign_in_codes");}
    @Scheduled(fixedDelayString="${blizz.retention.interval:PT1M}")
    void codeDeliveries(){runner.runKind("code_deliveries");}
    @Scheduled(fixedDelayString="${blizz.retention.interval:PT1M}")
    void deliveredEvents(){runner.runKind("delivered_events");}
    @Scheduled(fixedDelayString="${blizz.retention.interval:PT1M}")
    void consumerReceipts(){runner.runKind("consumer_receipts");}
    @Scheduled(fixedDelayString="${blizz.retention.interval:PT1M}")
    void commandReceipts(){runner.runKind("command_receipts");}
    @Scheduled(fixedDelayString="${blizz.retention.interval:PT1M}")
    void uploads(){runner.runKind("upload_sessions");}
    @Scheduled(fixedDelayString="${blizz.retention.interval:PT1M}")
    void quarantine(){runner.runKind("quarantined_files");}
    @Scheduled(fixedDelayString="${blizz.retention.interval:PT1M}")
    void recordings(){runner.runKind("call_recordings");}
}
