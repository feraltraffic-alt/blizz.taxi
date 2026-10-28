package taxi.blizz.telephony.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;
import taxi.blizz.identity.OtpDelivery;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.platform.CommittedMetrics;

/**
 * Sends a one-time code (ADR 0012 Q-18): first by the channel the person asked for ("call me instead"), else by the
 * one set in the admin panel (otp.channel, SMS by default), then by the fallback (otp.fallback, VOICE by default)
 * until one provider takes it. Every attempt is recorded for support, never the code. Runs after the challenge is
 * committed, so a failure here never undoes it; the person can ask for a new code after the resend delay.
 */
@Component
class ChannelOtpDelivery implements OtpDelivery {

    private static final Logger log = LoggerFactory.getLogger(ChannelOtpDelivery.class);

    private final List<OtpSender> live;
    private final FakeOtpSender fake;
    private final TelephonyProperties properties;
    private final Integrations integrations;
    private final JdbcClient jdbc;
    private final Clock clock;
    private final CommittedMetrics metrics;

    ChannelOtpDelivery(List<OtpSender> live, FakeOtpSender fake, TelephonyProperties properties,
                       Integrations integrations, JdbcClient jdbc, Clock clock, CommittedMetrics metrics) {
        this.metrics = metrics;
        this.live = live;
        this.fake = fake;
        this.properties = properties;
        this.integrations = integrations;
        this.jdbc = jdbc;
        this.clock = clock;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void send(PhoneNumber phone, String code, OtpAudience audience) {
        send(null, phone, code, audience, null);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void send(UUID challengeId, PhoneNumber phone, String code, OtpAudience audience, OtpChannel preferred) {
        for (OtpChannel channel : order(preferred)) {
            OtpSender sender = sender(channel);
            OtpSender.Result result;
            try {
                result = sender.send(phone, code, audience);
            } catch (RuntimeException e) {
                result = OtpSender.Result.unknown(e.getClass().getSimpleName());
            }
            record(challengeId, phone, audience, sender, result);
            if (channel == OtpChannel.SMS) {
                metrics.counter("blizz.sms.sent", "purpose", "OTP", "state", result.state().name());
            }
            if (result.state() == OtpSender.State.SENT) {
                return;
            }
        }
        log.warn("No channel delivered the code for {} (challenge {})", phone.masked(), challengeId);
    }

    /** The channels to try, in order, each once. */
    List<OtpChannel> order(OtpChannel preferred) {
        Set<OtpChannel> order = new LinkedHashSet<>();
        if (preferred != null) {
            order.add(preferred);
        }
        order.add(setting(Integrations.OTP_CHANNEL).map(OtpChannel::valueOf).orElse(OtpChannel.SMS));
        String fallback = setting(Integrations.OTP_FALLBACK).orElse("VOICE");
        if (!"NONE".equals(fallback)) {
            order.add(OtpChannel.valueOf(fallback));
        }
        return List.copyOf(order);
    }

    private java.util.Optional<String> setting(String name) {
        return integrations.value(name).map(v -> v.strip().toUpperCase(Locale.ROOT)).filter(v -> !v.isEmpty());
    }

    private OtpSender sender(OtpChannel channel) {
        if (properties.fake()) {
            return fake.sender(channel);
        }
        return live.stream().filter(s -> s.channel() == channel).findFirst()
                .orElseThrow(() -> new IllegalStateException("No sender for " + channel));
    }

    private void record(UUID challengeId, PhoneNumber phone, OtpAudience audience, OtpSender sender,
                        OtpSender.Result result) {
        try {
            jdbc.sql("""
                            insert into otp_delivery (id, challenge_id, phone, audience, channel, provider, state,
                                                      provider_ref, error, attempted_at)
                            values (:id, :challenge, :phone, :audience, :channel, :provider, :state, :ref, :error,
                                    :now)""")
                    .param("id", UUID.randomUUID()).param("challenge", challengeId).param("phone", phone.e164())
                    .param("audience", audience.name()).param("channel", sender.channel().name())
                    .param("provider", sender.provider()).param("state", result.state().name())
                    .param("ref", result.providerRef()).param("error", result.error())
                    .param("now", OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC)).update();
        } catch (RuntimeException e) {
            // The record is for support; the code must still go out by the next channel if this one failed.
            log.error("Could not record the delivery attempt for {}", phone.masked(), e);
        }
    }
}
