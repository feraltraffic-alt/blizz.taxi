package taxi.blizz.identity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import taxi.blizz.platform.DomainException;

class PhoneNumberTests {

    @ParameterizedTest
    @CsvSource({
            "'+380 67 123 45 67', +380671234567",
            "'+48 (512) 345-678', +48512345678",
            "'00380671234567', +380671234567",
            "' +380671234567 ', +380671234567"
    })
    void normalizesToE164(String raw, String expected) {
        assertThat(PhoneNumber.parse(raw).e164()).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0671234567", "+0671234567", "+38067", "+3806712345678901", "+38067abc4567", ""})
    void rejectsNonInternationalOrMalformed(String raw) {
        assertThatThrownBy(() -> PhoneNumber.parse(raw)).isInstanceOf(DomainException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"+380671234567"})
    void maskedFormHidesTheNumber(String raw) {
        PhoneNumber phone = PhoneNumber.parse(raw);

        assertThat(phone.masked()).isEqualTo("+380*****67");
        assertThat(phone.toString()).doesNotContain("1234");
    }
}
