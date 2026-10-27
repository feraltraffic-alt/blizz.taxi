package taxi.blizz.configuration.internal;

import org.springframework.boot.context.properties.ConfigurationProperties;

/** @param masterKey 32 bytes in Base64; from the environment only, never in the database or the repository */
@ConfigurationProperties("blizz.secrets")
record SecretsProperties(String masterKey) {

    @Override
    public String toString() {
        return "SecretsProperties[masterKey=" + (masterKey == null || masterKey.isBlank() ? "none" : "set") + "]";
    }
}
