package taxi.blizz.payments.internal;

import java.time.Duration;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * @param publicBaseUrl      the address providers and the rider's web view reach this instance at (callbacks,
 *                           return page)
 * @param secrets            merchant secrets by {@code payment_merchant.secret_ref}; from the environment only
 * @param bindingTtl         how long a started "add a card" stays open
 * @param holdTimeoutSeconds how long the provider keeps a hold (WayForPay: up to 20 days)
 * @param timeout            how long to wait for the provider before the result counts as UNKNOWN
 * @param fakeMerchantsAllowed whether the admin panel may add FAKE merchants (they confirm any payment): only in
 *                           development, tests and the sandbox
 * @param topUpMinMinor      the smallest card top-up of a rider's account or a driver's balance, minor units
 * @param topUpMaxMinor      the largest card top-up, minor units
 * @param previousKeyWindow  after a merchant key change, how long notifications signed with the old key are still
 *                           accepted (REQ-SEC-09)
 * @param unknownReportAfter an operation whose result is still unknown after this is reported, once, to the problem
 *                           queue (REQ-OPS-06); it keeps being asked about all the same
 */
@ConfigurationProperties("blizz.payments")
record PaymentsProperties(
        @DefaultValue("http://localhost:8080") String publicBaseUrl,
        Map<String, String> secrets,
        @DefaultValue("PT30M") Duration bindingTtl,
        @DefaultValue("172800") long holdTimeoutSeconds,
        @DefaultValue("PT20S") Duration timeout,
        @DefaultValue("false") boolean fakeMerchantsAllowed,
        @DefaultValue("100") long topUpMinMinor,
        @DefaultValue("1000000") long topUpMaxMinor,
        @DefaultValue("P3D") Duration previousKeyWindow,
        @DefaultValue("PT15M") Duration unknownReportAfter) {

    PaymentsProperties {
        secrets = secrets == null ? Map.of() : Map.copyOf(secrets);
        publicBaseUrl = publicBaseUrl.endsWith("/") ? publicBaseUrl.substring(0, publicBaseUrl.length() - 1)
                : publicBaseUrl;
    }

    @Override
    public String toString() {
        return "PaymentsProperties[publicBaseUrl=" + publicBaseUrl + ", secrets=" + secrets.keySet() + "]";
    }
}
