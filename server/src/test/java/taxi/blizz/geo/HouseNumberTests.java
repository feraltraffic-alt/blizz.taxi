package taxi.blizz.geo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

class HouseNumberTests {
    @ParameterizedTest
    @CsvSource({
            "2А, 2-А", "2А, 2а", "2А, 2A", "2А, 2 a", "2А, ２Ａ", "2А, 2–А",
            "2В, 2B", "2С, 2C", "2Е, 2E", "2Н, 2H", "2К, 2K", "2М, 2M",
            "2О, 2O", "2Р, 2P", "2Т, 2T", "2Х, 2X", "2У, 2Y",
            "2 к1, 2 корпус 1", "2 к1, 2 k1", "2А к1, 2-A корпус 1"
    })
    void equivalentFormsHaveTheSameStructuredIdentity(String first, String second) {
        assertThat(HouseNumber.parse(first, null)).isEqualTo(HouseNumber.parse(second, null));
    }

    @Test
    void distinctNumbersSuffixesBuildingsAndFractionsNeverCollapse() {
        HouseNumber two = HouseNumber.parse("2", null);
        assertThat(two.number()).isEqualTo("2");
        assertThat(two.suffix()).isEmpty();
        assertThat(two.building()).isEmpty();
        assertThat(two).isNotEqualTo(HouseNumber.parse("26", null));
        assertThat(two).isNotEqualTo(HouseNumber.parse("2А", null));
        assertThat(two).isNotEqualTo(HouseNumber.parse("2 к1", null));
        assertThat(two).isNotEqualTo(HouseNumber.parse("02", null));
        assertThat(HouseNumber.parse("2/1", null)).isNotEqualTo(HouseNumber.parse("2", "1"));
        assertThat(HouseNumber.parse("2", "1")).isNotEqualTo(HouseNumber.parse("2", "10"));
    }

    @Test
    void separateBuildingAndInlineBuildingAgreeButConflictingValuesAreRejected() {
        assertThat(HouseNumber.parse("2 к1", null)).isEqualTo(HouseNumber.parse("2", "корпус 1"));
        assertThat(HouseNumber.parse("2 к1", "к1")).isEqualTo(HouseNumber.parse("2", "1"));
        assertThatThrownBy(() -> HouseNumber.parse("2 к1", "2")).isInstanceOf(DomainException.class)
                .extracting(error -> ((DomainException) error).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        assertThatThrownBy(() -> HouseNumber.parse("2-", null)).isInstanceOf(DomainException.class);
        assertThatThrownBy(() -> HouseNumber.parse("26?", null)).isInstanceOf(DomainException.class);
    }

    @Test
    void missingHouseIsAllowedForNamedPlacesButCannotHaveAnUnboundBuilding() {
        assertThat(HouseNumber.parse(null, null).key()).isEmpty();
        assertThatThrownBy(() -> HouseNumber.parse(null, "1")).isInstanceOf(DomainException.class);
    }
}
