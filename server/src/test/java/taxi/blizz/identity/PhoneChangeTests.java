package taxi.blizz.identity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** REQ-AUTH-08: a phone change with codes to both phones, or by support when the old phone is lost. */
@SpringBootTest
@Import({TestcontainersConfiguration.class, PhoneChangeTests.Capture.class})
class PhoneChangeTests {

    @Autowired
    PhoneChanges phones;
    @Autowired
    OtpService otp;
    @Autowired
    SessionService sessions;
    @Autowired
    PhoneChangeDelivery delivery;
    @Autowired
    JdbcClient jdbc;

    private static String freshPhone(String prefix) {
        return taxi.blizz.TestPhones.unique(prefix, 7);
    }

    private String codeTo(String phone) {
        return delivery.sent.stream().filter(s -> s.phone().e164().equals(phone)).reduce((a, b) -> b).orElseThrow()
                .code();
    }

    private record Person(Actor actor, String phone, IssuedSession here, IssuedSession elsewhere) {
    }

    /** An account made directly, so the first code to its phone is the one under test (resend delay). */
    private Person signedIn(OtpAudience audience, String phone) {
        UUID id = UUID.randomUUID();
        String table = audience == OtpAudience.CLIENT ? "client" : "driver";
        jdbc.sql("insert into " + table + """
                         (id, phone_normalized, phone_verified_at, account_state, created_at, updated_at)
                        values (:id, :phone, now(), 'ACTIVE', now(), now())""")
                .param("id", id).param("phone", phone).update();
        VerifiedSubject subject = new VerifiedSubject(new Actor(audience.subjectType(), id), "ACTIVE", false);
        return new Person(subject.actor(), phone, sessions.open(subject, "phone-a"), sessions.open(subject, "phone-b"));
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                        values (:id, :login, 'Support', 'OPERATOR', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "phone-support-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String phoneOf(Actor subject) {
        return jdbc.sql("select phone_normalized from " + (subject.type() == SubjectType.CLIENT ? "client" : "driver")
                        + " where id = :id").param("id", subject.id()).query(String.class).single();
    }

    private long versionOf(Actor subject) {
        return jdbc.sql("select version from " + (subject.type() == SubjectType.CLIENT ? "client" : "driver")
                        + " where id = :id").param("id", subject.id()).query(Long.class).single();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private PhoneChanges.Changed change(Person p, String newPhone) {
        UUID current = phones.codeToCurrent(p.actor(), null, null).challengeId();
        UUID fresh = phones.codeToNew(p.actor(), newPhone, null, null).challengeId();
        return phones.change(p.actor(), UUID.randomUUID(), p.here().sessionId(), current, codeTo(p.phone()), fresh,
                codeTo(newPhone));
    }

    @Test
    void aRiderMovesToANewPhoneWithBothCodesAndTheOtherSessionsEnd() {
        Person rider = signedIn(OtpAudience.CLIENT, freshPhone("+38067"));
        String newPhone = freshPhone("+38063");

        PhoneChanges.Changed changed = change(rider, newPhone);

        assertThat(changed.phone()).isEqualTo(newPhone);
        assertThat(phoneOf(rider.actor())).isEqualTo(newPhone);
        assertThat(sessions.isOpen(rider.here().sessionId())).as("the session that changed it stays").isTrue();
        assertThat(sessions.isOpen(rider.elsewhere().sessionId())).as("every other session ends").isFalse();
        assertThat(jdbc.sql("select id from client where phone_normalized = :phone").param("phone", newPhone)
                .query(UUID.class).single()).as("the new phone signs in to the same account").isEqualTo(rider.actor().id());
        String audit = jdbc.sql("select before::text || after::text from audit_log where action = 'phone.change' "
                + "and resource_id = :id").param("id", rider.actor().id().toString()).query(String.class).single();
        assertThat(audit).doesNotContain(newPhone).doesNotContain(rider.phone());
    }

    @Test
    void oneCodeIsNotEnough() {
        Person rider = signedIn(OtpAudience.CLIENT, freshPhone("+38067"));
        String newPhone = freshPhone("+38063");
        UUID current = phones.codeToCurrent(rider.actor(), null, null).challengeId();
        UUID fresh = phones.codeToNew(rider.actor(), newPhone, null, null).challengeId();
        String rightNew = codeTo(newPhone);
        String wrongNew = rightNew.equals("000000") ? "111111" : "000000";

        // A stolen session: the attacker has the new phone, not the current one.
        assertCode(() -> phones.change(rider.actor(), UUID.randomUUID(), rider.here().sessionId(), current, wrongNew,
                fresh, rightNew), ErrorCode.OTP_INVALID);
        // A sign-in code to the current phone does not confirm a phone change.
        UUID signIn = otp.requestChallenge(OtpAudience.CLIENT, freshPhone("+38050"), null, null).challengeId();
        assertCode(() -> phones.change(rider.actor(), UUID.randomUUID(), rider.here().sessionId(), signIn, "123456",
                fresh, rightNew), ErrorCode.OTP_INVALID);
        assertThat(phoneOf(rider.actor())).isEqualTo(rider.phone());
    }

    @Test
    void aNewPhoneCodeServesOnlyTheAccountThatAskedForIt() {
        Person rider = signedIn(OtpAudience.CLIENT, freshPhone("+38067"));
        Person other = signedIn(OtpAudience.CLIENT, freshPhone("+38068"));
        String newPhone = freshPhone("+38063");
        UUID fresh = phones.codeToNew(rider.actor(), newPhone, null, null).challengeId();
        UUID otherCurrent = phones.codeToCurrent(other.actor(), null, null).challengeId();

        assertCode(() -> phones.change(other.actor(), UUID.randomUUID(), other.here().sessionId(), otherCurrent,
                codeTo(other.phone()), fresh, codeTo(newPhone)), ErrorCode.OTP_INVALID);
        assertThat(phoneOf(other.actor())).isEqualTo(other.phone());
    }

    @Test
    void accountsAreNeverMerged() {
        Person rider = signedIn(OtpAudience.CLIENT, freshPhone("+38067"));
        Person taken = signedIn(OtpAudience.CLIENT, freshPhone("+38068"));

        assertCode(() -> change(rider, taken.phone()), ErrorCode.STATE_CONFLICT);
        assertThat(phoneOf(rider.actor())).isEqualTo(rider.phone());
        Person same = signedIn(OtpAudience.CLIENT, freshPhone("+38066"));
        assertCode(() -> phones.codeToNew(same.actor(), same.phone(), null, null), ErrorCode.STATE_CONFLICT);
        // A driver may share a phone with a rider: the kinds of account are separate (V5).
        Person driver = signedIn(OtpAudience.DRIVER, freshPhone("+38095"));
        assertThat(change(driver, taken.phone()).phone()).isEqualTo(taken.phone());
    }

    @Test
    void aRepeatOfTheCommandReturnsTheSameChange() {
        Person driver = signedIn(OtpAudience.DRIVER, freshPhone("+38095"));
        String newPhone = freshPhone("+38096");
        UUID current = phones.codeToCurrent(driver.actor(), null, null).challengeId();
        UUID fresh = phones.codeToNew(driver.actor(), newPhone, null, null).challengeId();
        UUID command = UUID.randomUUID();
        String currentCode = codeTo(driver.phone());
        String newCode = codeTo(newPhone);

        PhoneChanges.Changed first = phones.change(driver.actor(), command, driver.here().sessionId(), current,
                currentCode, fresh, newCode);
        PhoneChanges.Changed repeat = phones.change(driver.actor(), command, driver.here().sessionId(), current,
                currentCode, fresh, newCode);
        assertThat(repeat).isEqualTo(first);
        assertThat(versionOf(driver.actor())).isEqualTo(first.version());
    }

    /** Owner decision 28.10.2026: support changes a phone only with a code the person got on the new phone. */
    @Test
    void supportSetsThePhoneWhenTheOldOneIsLostWithACodeToTheNewPhone() {
        Person rider = signedIn(OtpAudience.CLIENT, freshPhone("+38067"));
        String newPhone = freshPhone("+38063");
        Actor support = staff(ClientAccounts.MANAGE_PERMISSION);
        Actor driverSupport = staff(PhoneChanges.DRIVER_PHONE_PERMISSION);
        long version = versionOf(rider.actor());

        assertCode(() -> phones.codeToNewBySupport(driverSupport, rider.actor(), newPhone, null),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> phones.codeToNewBySupport(support, rider.actor(), rider.phone(), null),
                ErrorCode.STATE_CONFLICT);
        UUID challenge = phones.codeToNewBySupport(support, rider.actor(), newPhone, null).challengeId();
        String code = codeTo(newPhone);
        String wrong = String.format("%06d", (Integer.parseInt(code) + 1) % 1_000_000);

        assertCode(() -> phones.changeBySupport(driverSupport, UUID.randomUUID(), rider.actor(), version, challenge,
                code, "Passport checked"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> phones.changeBySupport(support, UUID.randomUUID(), rider.actor(), version, challenge, code,
                " "), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> phones.changeBySupport(support, UUID.randomUUID(), rider.actor(), version, null, code,
                "Passport checked"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> phones.changeBySupport(support, UUID.randomUUID(), rider.actor(), version, challenge, wrong,
                "Passport checked"), ErrorCode.OTP_INVALID);
        assertThat(phoneOf(rider.actor())).as("a wrong code changes nothing").isEqualTo(rider.phone());

        // A code another account asked for does not move this one.
        Person other = signedIn(OtpAudience.CLIENT, freshPhone("+38068"));
        String otherNew = freshPhone("+38063");
        UUID otherChallenge = phones.codeToNewBySupport(support, other.actor(), otherNew, null).challengeId();
        String otherCode = codeTo(otherNew);
        assertCode(() -> phones.changeBySupport(support, UUID.randomUUID(), rider.actor(), version, otherChallenge,
                otherCode, "Passport checked"), ErrorCode.OTP_INVALID);

        assertCode(() -> phones.changeBySupport(support, UUID.randomUUID(), rider.actor(), version + 1, challenge,
                code, "Passport checked"), ErrorCode.VERSION_CONFLICT);
        PhoneChanges.Changed changed = phones.changeBySupport(support, UUID.randomUUID(), rider.actor(), version,
                challenge, code, "Passport checked at the office");

        assertThat(changed.phone()).isEqualTo(newPhone);
        assertThat(sessions.isOpen(rider.here().sessionId())).isFalse();
        assertThat(sessions.isOpen(rider.elsewhere().sessionId())).isFalse();
        assertThat(jdbc.sql("""
                        select reason from audit_log where action = 'phone.change_by_support' and resource_id = :id""")
                .param("id", rider.actor().id().toString()).query(String.class).single())
                .isEqualTo("Passport checked at the office");
    }

    @Test
    void theDriverPhoneRightIsTheDriverReviewRight() {
        assertThat(PhoneChanges.DRIVER_PHONE_PERMISSION).isEqualTo(DriverAdmission.REVIEW_PERMISSION);
    }

    record Sent(PhoneNumber phone, String code) {
    }

    static class PhoneChangeDelivery implements OtpDelivery {
        final List<Sent> sent = new CopyOnWriteArrayList<>();

        @Override
        public void send(PhoneNumber phone, String code, OtpAudience audience) {
            sent.add(new Sent(phone, code));
        }
    }

    @TestConfiguration(proxyBeanMethods = false)
    static class Capture {
        @Bean
        @Primary
        PhoneChangeDelivery phoneChangeCapturingDelivery() {
            return new PhoneChangeDelivery();
        }
    }
}
