package taxi.blizz.geo;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** Structured postal identity. Numeric parts never use prefix or fuzzy comparison. */
public record HouseNumber(String number, String suffix, String building) {
    private static final Pattern BASE = Pattern.compile("^([0-9]+(?:/[0-9]+)?)(?:\\s*-?\\s*([\\p{L}]+))?$");
    private static final Pattern CORPUS = Pattern.compile(
            "^(.*?)(?:\\s+(?:корпус|корп\\.?|к\\.?|k\\.?)\\s*|(?<=[0-9])[кk](?=[0-9]))([\\p{L}0-9/-]+)$");
    private static final Pattern BUILDING_PREFIX = Pattern.compile("^(?:корпус|корп\\.?|к\\.?|k\\.?)\\s*(?=[0-9])");

    public static HouseNumber parse(String raw, String separateBuilding) {
        String value = clean(raw);
        String building = building(separateBuilding);
        if (value.isEmpty()) {
            if (!building.isEmpty()) {
                throw invalid();
            }
            return new HouseNumber("", "", "");
        }
        Matcher corpus = CORPUS.matcher(value);
        if (corpus.matches()) {
            String inline = building(corpus.group(2));
            if (!building.isEmpty() && !building.equals(inline)) {
                throw invalid();
            }
            building = inline;
            value = corpus.group(1).strip();
        }
        Matcher base = BASE.matcher(value);
        if (!base.matches()) {
            throw invalid();
        }
        return new HouseNumber(base.group(1), fold(base.group(2) == null ? "" : base.group(2)), building);
    }

    public String key() {
        return number + suffix + (building.isEmpty() ? "" : " корпус " + building);
    }

    /** Fold only genuine Latin/Cyrillic look-alikes, never all Latin letters phonetically. */
    public static String fold(String value) {
        String latin = "abcehkmoptxyij";
        String cyrillic = "авсенкмортхуіј";
        StringBuilder result = new StringBuilder();
        for (char letter : clean(value).toCharArray()) {
            int index = latin.indexOf(letter);
            result.append(index < 0 ? letter : cyrillic.charAt(index));
        }
        return result.toString();
    }

    private static String building(String raw) {
        String value = BUILDING_PREFIX.matcher(clean(raw)).replaceFirst("");
        value = value.replaceAll("\\s*-\\s*(?=\\p{L})", "");
        if (!value.isEmpty() && !value.matches("[\\p{L}0-9]+(?:[/-][\\p{L}0-9]+)*")) {
            throw invalid();
        }
        return fold(value);
    }

    private static String clean(String value) {
        return value == null ? "" : Normalizer.normalize(value, Normalizer.Form.NFKC)
                .toLowerCase(Locale.ROOT).replaceAll("[‐‑‒–—−]", "-")
                .replaceAll("[\\p{Z}\\s]+", " ").strip();
    }

    private static DomainException invalid() {
        return new DomainException(ErrorCode.VALIDATION_FAILED, "Invalid or conflicting house/building number");
    }
}
