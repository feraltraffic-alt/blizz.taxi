package taxi.blizz.operatorbonus.internal;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import taxi.blizz.operatorbonus.OperatorBonuses;

/** Periodically closes overdue operator bonus periods; the close itself is idempotent per staff/period. */
@Component
class OperatorBonusResetWorker {

    private final OperatorBonuses bonuses;

    OperatorBonusResetWorker(OperatorBonuses bonuses) {
        this.bonuses = bonuses;
    }

    @Scheduled(fixedDelayString = "${blizz.operator-bonus.reset-check-ms:3600000}")
    void reset() {
        bonuses.resetDueAccounts();
    }
}
