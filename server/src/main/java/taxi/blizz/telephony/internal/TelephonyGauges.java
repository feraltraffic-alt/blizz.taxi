package taxi.blizz.telephony.internal;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DatabaseGauges;

/** Sign-in codes that did not go out (REQ-OBS-02, runbook docs/runbooks/sms.md): a failing provider locks people out. */
@Component
class TelephonyGauges extends DatabaseGauges {

    TelephonyGauges(JdbcClient jdbc) {
        gauge("blizz.otp.sent.last_15m", "Sign-in codes sent in the last 15 minutes",
                () -> jdbc.sql("""
                                select count(*) from otp_delivery
                                where attempted_at > now() - interval '15 minutes'""").query(Long.class).single());
        gauge("blizz.otp.failed.last_15m", "Sign-in codes that failed or are unknown in the last 15 minutes",
                () -> jdbc.sql("""
                                select count(*) from otp_delivery
                                where state <> 'SENT' and attempted_at > now() - interval '15 minutes'""")
                        .query(Long.class).single());
    }
}
