package taxi.blizz.telephony;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * How one-time codes reached a phone (ADR 0012 Q-18, issue #59): every attempt by SMS (TurboSMS) or by a call
 * (Asterisk), its outcome and the provider's answer — never the code. For support, with
 * {@link #VIEW_PERMISSION}.
 */
public interface OtpDeliveries {

    /**
     * The support permission ({@code backoffice.SupportCases.MANAGE_PERMISSION}); written out, because operations links
     * phone orders to calls here and backoffice depends on operations.
     */
    String VIEW_PERMISSION = "support.manage";

    /**
     * @param state SENT — the provider took it; FAILED — it refused or is not configured; UNKNOWN — no answer
     */
    record Attempt(UUID id, UUID challengeId, String phone, String audience, String channel, String provider,
                   String state, String providerRef, String error, OffsetDateTime attemptedAt) {
    }

    /** The attempts for the phone, newest first; at most 100. */
    List<Attempt> forPhone(Actor staff, String phone, int limit);
}
