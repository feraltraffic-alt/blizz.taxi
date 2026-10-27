package taxi.blizz.operations;

import java.util.Objects;

/** Caller contact attached only to a phone order (REQ-OPS-02). */
public record CallerContact(String name, String phone) {
    public CallerContact {
        Objects.requireNonNull(phone, "phone");
        phone = phone.strip();
        name = name == null || name.isBlank() ? null : name.strip();
    }
}
