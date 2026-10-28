package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/** What never reaches a log line (REQ-SEC-08). */
class LogRedactionTests {

    @Test
    void phonesKeepOnlyTheCountryAndTheLastTwoDigits() {
        assertThat(LogRedaction.redact("SMS to +380671234567 failed")).isEqualTo("SMS to +380*****67 failed");
        assertThat(LogRedaction.redact("caller 380671234567, called 48221234567"))
                .isEqualTo("caller 380*****67, called 482*****67");
        assertThat(LogRedaction.redact("tel=00380671234567")).isEqualTo("tel=00380*****67");
    }

    @Test
    void tokensAndCodesAreTakenOut() {
        assertThat(LogRedaction.redact("Authorization: Bearer abc.DEF-123_xyz~456"))
                .isEqualTo("Authorization: Bearer [redacted]");
        assertThat(LogRedaction.redact("token eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0In0.c2lnbmF0dXJl here"))
                .isEqualTo("token [redacted-jwt] here");
        assertThat(LogRedaction.redact("{\"refresh_token\":\"r3fr3sh-t0k3n-value\"}"))
                .isEqualTo("{\"refresh_token\":\"[redacted]\"}");
        assertThat(LogRedaction.redact("otp=123456 sent")).isEqualTo("otp=**** sent");
        assertThat(LogRedaction.redact("Kod: 4821")).isEqualTo("Kod: ****");
    }

    @Test
    void preciseCoordinatesAreRoundedAndOrdinaryValuesStay() {
        assertThat(LogRedaction.redact("at 50.4501234,30.5234567")).isEqualTo("at 50.45,30.52");
        assertThat(LogRedaction.redact("lat=-33.8688197 lon=151.2092955")).isEqualTo("lat=-33.86 lon=151.20");
        String ordinary = "order 7f1c2a3e-0000-4000-8000-000000000001 took 1234 ms, 15000 minor, version 3, 0.5";
        assertThat(LogRedaction.redact(ordinary)).isEqualTo(ordinary);
        assertThat(LogRedaction.redact(null)).isNull();
    }
}
