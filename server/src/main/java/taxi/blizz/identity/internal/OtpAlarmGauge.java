package taxi.blizz.identity.internal;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.stereotype.Component;

/**
 * The hourly number of codes above which the SMS-pumping alert fires (blizz.otp.hourly-alarm, issue #101 P5), so the
 * alert rule reads the instance's setting instead of a copy of it.
 */
@Component
class OtpAlarmGauge implements MeterBinder {

    private final OtpProperties properties;

    OtpAlarmGauge(OtpProperties properties) {
        this.properties = properties;
    }

    @Override
    public void bindTo(MeterRegistry registry) {
        Gauge.builder("blizz.otp.hourly.alarm", properties, OtpProperties::hourlyAlarm)
                .description("Codes sent in an hour above which the SMS-pumping alert fires")
                .register(registry);
    }
}
