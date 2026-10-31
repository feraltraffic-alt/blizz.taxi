package taxi.blizz.driver.internal;

import java.time.OffsetDateTime;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DriverPersonalData;

/** The driver's profile for the copy of their data (issue #144, REQ-PRV-07). */
@Component
class DriverProfilePersonalData implements DriverPersonalData {

    private final JdbcClient jdbc;

    DriverProfilePersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Profile(String phone, String name, String language, String accountState, String reviewStatus,
                   boolean hasPaymentTerminal, OffsetDateTime createdAt) {
    }

    @Override
    public String section() {
        return "profile";
    }

    @Override
    public Object of(Subject subject) {
        return jdbc.sql("""
                        select phone_normalized, name, language, account_state, review_status, has_payment_terminal,
                               created_at
                        from driver where id = :id""")
                .param("id", subject.driverId())
                .query((rs, i) -> new Profile(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getBoolean(6), rs.getObject(7, OffsetDateTime.class)))
                .single();
    }
}
