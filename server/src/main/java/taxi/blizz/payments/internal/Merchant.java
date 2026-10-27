package taxi.blizz.payments.internal;

import java.util.UUID;

/** A merchant account at a provider; {@code secret} from the admin panel (stored encrypted) or the environment. */
record Merchant(UUID id, String provider, String account, String domain, String secret, String currency) {

    @Override
    public String toString() {
        return "Merchant[" + id + ", " + provider + ", " + account + "]";
    }
}
