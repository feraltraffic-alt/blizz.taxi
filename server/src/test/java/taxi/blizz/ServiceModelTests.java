package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.simple.JdbcClient;

/**
 * ADR 0016, issue #214 part 1: riders, drivers and cities belong to a service. The same phone in two services is two
 * accounts; within one service it stays one. City codes repeat across services, not within one.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ServiceModelTests {

    static final UUID DEFAULT = UUID.fromString("5e000000-0000-4000-8000-000000000001");

    @Autowired JdbcClient jdbc;

    private UUID service(String code) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, :code, now(), now())""")
                .param("id", id).param("code", code + "-" + id.toString().substring(0, 8)).update();
        return id;
    }

    private void person(String table, UUID service, String phone) {
        jdbc.sql("insert into " + table + " (id, phone_normalized, account_state, service_id, created_at, updated_at)"
                        + " values (:id, :phone, 'ACTIVE', :service, now(), now())")
                .param("id", UUID.randomUUID()).param("phone", phone).param("service", service).update();
    }

    @Test
    void existingDataIsInTheDefaultService() {
        assertThat(jdbc.sql("select code from service where id = :id").param("id", DEFAULT).query(String.class)
                .single()).isEqualTo("default");
        assertThat(jdbc.sql("select count(*) from city where service_id is null").query(Long.class).single()).isZero();
    }

    @Test
    void theSamePhoneIsTwoRidersAndTwoDriversInTwoServicesAndOneWithinOne() {
        UUID other = service("other");
        for (String table : new String[] {"client", "driver"}) {
            String phone = TestPhones.unique("+48", 9);
            person(table, DEFAULT, phone);
            person(table, other, phone);
            assertThat(jdbc.sql("select count(*) from " + table + " where phone_normalized = :p").param("p", phone)
                    .query(Long.class).single()).as(table + ": one per service").isEqualTo(2);
            assertThatThrownBy(() -> person(table, other, phone)).as(table + ": twice in one service")
                    .isInstanceOf(DataIntegrityViolationException.class);
        }
    }

    @Test
    void aCityCodeRepeatsAcrossServicesNotWithinOne() {
        UUID other = service("other");
        String code = "svc-city-" + UUID.randomUUID().toString().substring(0, 8);
        String insert = """
                insert into city (id, code, name, currency, timezone, polygon, priority, state, service_id,
                                  created_at, updated_at)
                values (:id, :code, :code, 'UAH', 'UTC',
                        ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((150 70,151 70,151 71,150 71,150 70)))'), 1, 'DRAFT',
                        :service, now(), now())""";
        jdbc.sql(insert).param("id", UUID.randomUUID()).param("code", code).param("service", DEFAULT).update();
        jdbc.sql(insert).param("id", UUID.randomUUID()).param("code", code).param("service", other).update();
        assertThatThrownBy(() -> jdbc.sql(insert).param("id", UUID.randomUUID()).param("code", code)
                .param("service", other).update()).isInstanceOf(DataIntegrityViolationException.class);
    }
}
