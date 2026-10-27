package taxi.blizz.identity.internal;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** BCrypt hashes and the password rule for staff; plain passwords never leave this class or reach logs. */
@Component
class StaffPasswords {

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    private final String dummyHash = encoder.encode("not-a-real-password-for-timing");
    private final StaffProperties properties;

    StaffPasswords(StaffProperties properties) {
        this.properties = properties;
    }

    String hash(String login, String password) {
        check(login, password);
        return encoder.encode(password);
    }

    boolean matches(String password, String hash) {
        if (password == null || hash == null) {
            encoder.matches("x", dummyHash);
            return false;
        }
        return encoder.matches(password, hash);
    }

    /** Spends the same time as a real check, so an unknown login cannot be told from a wrong password. */
    void burn(String password) {
        encoder.matches(password == null ? "x" : password, dummyHash);
    }

    void check(String login, String password) {
        if (password == null || password.length() < properties.minPasswordLength() || password.length() > 128) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    "The password needs " + properties.minPasswordLength() + " to 128 characters");
        }
        if (login != null && password.equalsIgnoreCase(login)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The password must differ from the login");
        }
        if (password.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The password cannot be blank");
        }
    }
}
