package taxi.blizz.geo.internal;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import taxi.blizz.geo.HouseNumber;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

final class AddressText {
    private static final Pattern HOUSE_WORD = Pattern.compile("[0-9]+[\\p{L}]+");
    private static final Pattern DIGITS = Pattern.compile("[0-9]+");
    private static final Pattern HOUSE_START = Pattern.compile("(?<![\\p{L}0-9])[0-9]");

    private AddressText() {
    }

    static String normalize(String raw) {
        String text = raw == null ? "" : Normalizer.normalize(raw, Normalizer.Form.NFKC).toLowerCase(Locale.ROOT);
        text = text.replaceAll("([0-9])\\s*[-‐‑‒–—−]\\s*(?=\\p{L})", "$1");
        Matcher matcher = HOUSE_WORD.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(result, HouseNumber.fold(matcher.group()));
        }
        matcher.appendTail(result);
        return result.toString().replaceAll("[^\\p{L}\\p{N}]+", " ").strip().replaceAll("\\s+", " ");
    }

    /** Numeric tokens remain whole words, also in names such as Terminal2. */
    static String document(String raw) {
        String normalized = normalize(raw);
        List<String> numbers = new ArrayList<>();
        DIGITS.matcher(normalized).results().forEach(match -> numbers.add(match.group()));
        HOUSE_WORD.matcher(normalized).results().forEach(match -> numbers.add(match.group()));
        return normalized + (numbers.isEmpty() ? "" : " " + String.join(" ", numbers));
    }

    record Query(String text, String fullText, HouseNumber house, String[] numbers) {
    }

    static Query query(String raw) {
        String input = raw == null ? "" : Normalizer.normalize(raw, Normalizer.Form.NFKC).strip();
        if (input.codePointCount(0, input.length()) < 3 || input.length() > 256 || normalize(input).isEmpty()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Address query requires 3 to 256 characters");
        }
        Matcher starts = HOUSE_START.matcher(input);
        while (starts.find()) {
            String tail = input.substring(starts.start()).strip().replaceAll("[-‐‑‒–—−]$", "");
            String prefix = input.substring(0, starts.start()).strip();
            // A bare multiword street such as '8 Березня' is not a house suffix.
            if (prefix.isEmpty() && tail.matches(".*\\s+.*") && !tail.matches("(?iu).*\\s+(?:к|корп|корпус|k).*")) {
                continue;
            }
            try {
                HouseNumber house = HouseNumber.parse(tail, null);
                if (!house.number().isEmpty() && (house.suffix().length() <= 2 || !prefix.isEmpty())) {
                    return new Query(normalize(prefix), normalize(input), house, new String[0]);
                }
            } catch (DomainException invalidHouse) {
                // Try the next numeric token, e.g. the house after '8 Березня'.
            }
        }
        String normalized = normalize(input);
        String[] numbers = DIGITS.matcher(normalized).results().map(match -> match.group()).toArray(String[]::new);
        return new Query(normalized, normalized, new HouseNumber("", "", ""), numbers);
    }
}
