package taxi.blizz.geo.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import taxi.blizz.geo.HouseNumber;
import taxi.blizz.platform.DomainException;

class AddressTextTests {
    @Test
    void houseIsSeparatedFromStreetWithoutLosingSuffixOrBuilding() {
        var query = AddressText.query("ХРЕЩАТИК 2-A корпус 1");
        assertThat(query.text()).isEqualTo("хрещатик");
        assertThat(query.house()).isEqualTo(HouseNumber.parse("2а", "1"));
        assertThat(AddressText.query("Хрещатик 2-").house().number()).isEqualTo("2");
        assertThat(AddressText.query("Хрещатик 2/26").house().number()).isEqualTo("2/26");
    }

    @Test
    void streetNamesWithNumbersAndUnstructuredPlaceNamesKeepNumericBoundaries() {
        assertThat(AddressText.query("8 Березня").house().number()).isEmpty();
        var query = AddressText.query("8 Березня 2");
        assertThat(query.text()).isEqualTo("8 березня");
        assertThat(query.house().number()).isEqualTo("2");
        assertThat(AddressText.document("Terminal26")).contains("26").doesNotContain(" 2 ");
        assertThat(AddressText.document("Terminal2-A")).contains("2а");
    }

    @Test
    void shortBlankAndPunctuationOnlyQueriesAreRejected() {
        for (String query : new String[]{"", " 2 ", "Хр", "!!!"}) {
            assertThatThrownBy(() -> AddressText.query(query)).isInstanceOf(DomainException.class);
        }
    }
}
