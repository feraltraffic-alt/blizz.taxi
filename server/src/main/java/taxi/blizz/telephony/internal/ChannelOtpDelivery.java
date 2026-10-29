package taxi.blizz.telephony.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;
import taxi.blizz.identity.OtpDelivery;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.platform.CommittedMetrics;

/**
 * Sends a one-time code (ADR 0012 Q-18) by exactly the channel the OTP service chose, once: one request never costs an
 * SMS and a call (issue #101). The admin panel sets the channel (otp.channel, SMS by default) and the fallback a
 * resend goes by after it did not get through (otp.fallback, VOICE by default); the service reads them here, with the
 * record of failed attempts. Every attempt is recorded for support, never the code. Runs after the challenge is
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
    private final TransactionTemplate tx;

    ChannelOtpDelivery(List<OtpSender> live, FakeOtpSender fake, TelephonyProperties properties,
                       Integrations integrations, JdbcClient jdbc, Clock clock, CommittedMetrics metrics, TransactionTemplate tx) {
        this.tx = tx;
        this.metrics = metrics;
        this.live = live;
        this.fake = fake;
        this.properties = properties;
        this.integrations = integrations;
        this.jdbc = jdbc;
        this.clock = clock;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void send(PhoneNumber phone, String code, OtpAudience audience) {
        send(null, phone, code, audience, null);
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void send(UUID challengeId, PhoneNumber phone, String code, OtpAudience audience, OtpChannel channel) {
        OtpSender sender = sender(channel != null ? channel : primaryChannel());
        OtpSender.Result result;
        try {
            result = sender.send(phone, code, audience);
        } catch (RuntimeException e) {
            result = OtpSender.Result.unknown(e.getClass().getSimpleName());
        }
        record(challengeId, phone, audience, sender, result);
        if (result.state() != OtpSender.State.SENT) {
            log.warn("The code for {} (challenge {}) did not go out by {}", phone.masked(), challengeId,
                    sender.channel());
        }
    }

    @Override
    public OtpChannel primaryChannel() {
        return setting(Integrations.OTP_CHANNEL).map(OtpChannel::valueOf).orElse(OtpChannel.SMS);
    }

    @Override
    public Optional<OtpChannel> fallbackChannel() {
        String fallback = setting(Integrations.OTP_FALLBACK).orElse("VOICE");
        return "NONE".equals(fallback) ? Optional.empty() : Optional.of(OtpChannel.valueOf(fallback));
    }

    @Override
    public boolean failedSince(PhoneNumber phone, OtpChannel channel, OffsetDateTime since) {
        return jdbc.sql("""
                        select exists (select 1 from otp_delivery
                                       where phone = :phone and attempted_at > :since and channel = :channel
                                         and state <> 'SENT')""")
                .param("phone", phone.e164()).param("since", since).param("channel", channel.name())
                .query(Boolean.class).single();
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
            tx.executeWithoutResult(status -> {
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
                if (sender.channel() == OtpChannel.SMS) {
                    metrics.counter("blizz.sms.sent", "purpose", "OTP", "state", result.state().name());
                }
            });
        } catch (RuntimeException e) {
            // The record is for support; the code must still go out by the next channel if this one failed.
            log.error("Could not record the delivery attempt for {}", phone.masked(), e);
        }
    }
}
