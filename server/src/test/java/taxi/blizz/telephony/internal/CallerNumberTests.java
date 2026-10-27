package taxi.blizz.telephony.internal;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/** How the numbers Asterisk reports become E.164, and when they cannot. */
class CallerNumberTests {

    @Test
    void fullNumbersArePlacedNationalOnesAreNotGuessed() {
        assertThat(JdbcCalls.e164("+380 67 123 45 67")).contains("+380671234567");
        assertThat(JdbcCalls.e164("00380671234567")).contains("+380671234567");
        assertThat(JdbcCalls.e164("380671234567")).contains("+380671234567");
        assertThat(JdbcCalls.e164("48512345678")).contains("+48512345678");
        assertThat(JdbcCalls.e164("512345678")).as("Polish national, not Peru").isEmpty();
        assertThat(JdbcCalls.e164("0671234567")).as("Ukrainian local").isEmpty();
        assertThat(JdbcCalls.e164("101")).as("an operator's extension").isEmpty();
        assertThat(JdbcCalls.e164("anonymous")).isEmpty();
    }
}
