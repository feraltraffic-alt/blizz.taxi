package taxi.blizz.driver.internal;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DriverPersonalData;

/**
 * The driver's documents for the copy of their data (issue #144): type, number, validity and decision. Never the
 * scanned files, nor the reviewer or the reviewer's reason.
 */
@Component
class DriverDocumentsPersonalData implements DriverPersonalData {

    private final JdbcClient jdbc;

    DriverDocumentsPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Document(String type, UUID vehicleId, String number, LocalDate validFrom, LocalDate validTo,
                    String decision, OffsetDateTime decidedAt, OffsetDateTime createdAt) {
    }

    @Override
    public String section() {
        return "documents";
    }

    @Override
    public Object of(Subject subject) {
        return jdbc.sql("""
                        select type, vehicle_id, number, valid_from, valid_to, decision, decided_at, created_at
                        from driver_document where driver_id = :id order by created_at, id""")
                .param("id", subject.driverId())
                .query((rs, i) -> new Document(rs.getString(1), rs.getObject(2, UUID.class), rs.getString(3),
                        rs.getObject(4, LocalDate.class), rs.getObject(5, LocalDate.class), rs.getString(6),
                        rs.getObject(7, OffsetDateTime.class), rs.getObject(8, OffsetDateTime.class)))
                .list();
    }
}
