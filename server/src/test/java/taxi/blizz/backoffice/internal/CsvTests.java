package taxi.blizz.backoffice.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

/** A CSV never runs a formula when opened (REQ-ADM-07) and keeps money exact. */
class CsvTests {

    @Test
    void textThatLooksLikeAFormulaIsDefused() {
        assertThat(Csv.text("=HYPERLINK(\"x\")")).isEqualTo("\"'=HYPERLINK(\"\"x\"\")\"");
        assertThat(Csv.text("+48 123")).isEqualTo("'+48 123");
        assertThat(Csv.text("-1")).isEqualTo("'-1");
        assertThat(Csv.text("@cmd")).isEqualTo("'@cmd");
        assertThat(Csv.text("\tx")).isEqualTo("'\tx");
        assertThat(Csv.text("a,b")).isEqualTo("\"a,b\"");
        assertThat(Csv.text("Kraków")).isEqualTo("Kraków");
    }

    @Test
    void numbersStayNumbersAndMoneyIsExact() {
        assertThat(Csv.major(-1_005, "UAH").toPlainString()).isEqualTo("-10.05");
        assertThat(Csv.major(0, "PLN").toPlainString()).isEqualTo("0.00");
        Csv csv = new Csv().row(Arrays.asList("total", -3, Csv.major(12_345, "PLN"), null));
        assertThat(new String(csv.bytes(), StandardCharsets.UTF_8)).isEqualTo("﻿total,-3,123.45,\r\n");
    }
}
