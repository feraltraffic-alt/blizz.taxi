package taxi.blizz.identity.internal;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/** The limited session of a blocked driver lets the driver ask for a copy of their data (issue #144). */
class DriverLimitedSessionTests {

    @Test
    void aCopyOfTheDataMayBeAskedForAndNothingNearIt() {
        assertThat(DriverLimitedSession.allows("POST", "/api/driver/v1/me/data-exports/challenge")).isTrue();
        assertThat(DriverLimitedSession.allows("POST", "/api/driver/v1/me/data-exports")).isTrue();
        assertThat(DriverLimitedSession.allows("GET", "/api/driver/v1/me/data-exports/x/file")).isTrue();
        assertThat(DriverLimitedSession.allows("POST", "/api/driver/v1/me/data-exports/x")).isFalse();
        assertThat(DriverLimitedSession.allows("POST", "/api/driver/v1/me/phone-change")).isFalse();
        assertThat(DriverLimitedSession.allows("PATCH", "/api/driver/v1/profile")).isFalse();
    }
}
