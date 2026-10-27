package taxi.blizz.payments.internal;

import java.util.UUID;

/** A merchant account at a provider; {@code secret} comes from the environment, never from the database. */
record Merchant(UUID id, String provider, String account, String domain, String secret, String currency) {

    @Override
    public String toString() {
        return "Merchant[" + id + ", " + provider + ", " + account + "]";
    }
}
