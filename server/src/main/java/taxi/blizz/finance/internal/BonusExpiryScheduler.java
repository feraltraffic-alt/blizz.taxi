package taxi.blizz.finance.internal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/** Runs {@link BonusExpiry}; switched off with {@code blizz.wallet.bonus-expiry-enabled=false} (the tests). */
@Configuration(proxyBeanMethods = false)
@EnableScheduling
@ConditionalOnProperty(prefix = "blizz.wallet", name = "bonus-expiry-enabled", havingValue = "true",
        matchIfMissing = true)
class BonusExpiryScheduler {

    private final BonusExpiry expiry;

    BonusExpiryScheduler(BonusExpiry expiry) {
        this.expiry = expiry;
    }

    @Scheduled(fixedDelayString = "${blizz.wallet.bonus-expiry-delay:PT15M}")
    void tick() {
        expiry.runOnce();
    }
}
