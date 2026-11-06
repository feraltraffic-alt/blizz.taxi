package taxi.blizz.refunds.internal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/** Runs {@link RefundTimer}; switched off with {@code blizz.refunds.timer-enabled=false} (the tests). */
@Configuration(proxyBeanMethods = false)
@EnableScheduling
@ConditionalOnProperty(prefix = "blizz.refunds", name = "timer-enabled", havingValue = "true", matchIfMissing = true)
class RefundTimerScheduler {

    private final RefundTimer timer;

    RefundTimerScheduler(RefundTimer timer) {
        this.timer = timer;
    }

    @Scheduled(fixedDelayString = "${blizz.refunds.timer-delay:PT5M}")
    void tick() {
        timer.runOnce();
    }
}
