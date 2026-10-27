package taxi.blizz.payments.internal;

import java.util.Map;

/** The provider adapters by name ({@code payment_merchant.provider}). */
record Providers(Map<String, PaymentProvider> byName) {

    PaymentProvider of(Merchant merchant) {
        PaymentProvider provider = byName.get(merchant.provider());
        if (provider == null) {
            throw new IllegalStateException("No adapter for provider " + merchant.provider());
        }
        return provider;
    }
}
