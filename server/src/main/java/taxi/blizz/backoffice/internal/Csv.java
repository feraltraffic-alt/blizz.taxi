package taxi.blizz.backoffice.internal;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Currency;
import java.util.List;

/**
 * A CSV file for a spreadsheet: UTF-8 with a byte order mark, comma-separated, CRLF lines. A text cell that a
 * spreadsheet would take for a formula (it starts with {@code = + - @}, a tab or a carriage return) is prefixed with
 * an apostrophe, so opening the file never runs anything (REQ-ADM-07). Numbers are written as numbers.
 */
final class Csv {

    private final StringBuilder out = new StringBuilder("﻿");
    private int rows;

    /** Cells: {@link String} as text, {@link Number} as a number, {@code null} as empty. */
    Csv row(List<?> cells) {
        for (int i = 0; i < cells.size(); i++) {
            if (i > 0) {
                out.append(',');
            }
            Object cell = cells.get(i);
            if (cell instanceof Number number) {
                out.append(number instanceof BigDecimal decimal ? decimal.toPlainString() : number.toString());
            } else if (cell != null) {
                out.append(text(cell.toString()));
            }
        }
        out.append("\r\n");
        rows++;
        return this;
    }

    int rows() {
        return rows;
    }

    byte[] bytes() {
        return out.toString().getBytes(StandardCharsets.UTF_8);
    }

    /** Minor units as a decimal of the currency's major unit, without floating point. */
    static BigDecimal major(long minor, String currency) {
        return BigDecimal.valueOf(minor).movePointLeft(Currency.getInstance(currency).getDefaultFractionDigits());
    }

    static String text(String value) {
        String safe = value;
        if (!safe.isEmpty() && "=+-@\t\r".indexOf(safe.charAt(0)) >= 0) {
            safe = "'" + safe;
        }
        if (safe.indexOf(',') >= 0 || safe.indexOf('"') >= 0 || safe.indexOf('\n') >= 0
                || safe.indexOf('\r') >= 0) {
            safe = '"' + safe.replace("\"", "\"\"") + '"';
        }
        return safe;
    }
}
