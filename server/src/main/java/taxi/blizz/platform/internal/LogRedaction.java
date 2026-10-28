package taxi.blizz.platform.internal;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * What never reaches a log line (REQ-SEC-08), whatever the code that logs it: phone numbers (the country code and
 * the last two digits stay), bearer and JSON web tokens, one-time codes, and coordinates beyond two decimals (about a
 * kilometre). Applied by the log layout to every message and stack trace ({@code logback-spring.xml}), so a careless
 * {@code log.info} cannot leak them. Card data never reaches the server (the provider's page takes it).
 */
public final class LogRedaction {

    private record Rule(Pattern pattern, java.util.function.Function<Matcher, String> replacement) {
    }

    private static final List<Rule> RULES = List.of(
            // Tokens first: they may contain digits that look like anything.
            new Rule(Pattern.compile("(?i)\\b(bearer\\s+)[A-Za-z0-9._~+/=-]{8,}"), m -> m.group(1) + "[redacted]"),
            new Rule(Pattern.compile("\\beyJ[A-Za-z0-9_-]{5,}\\.[A-Za-z0-9_-]{5,}\\.[A-Za-z0-9_-]*"),
                    m -> "[redacted-jwt]"),
            new Rule(Pattern.compile("(?i)\\b((?:access|refresh)_?token\"?\\s*[=:]\\s*\"?)[A-Za-z0-9._~+/=-]{8,}"),
                    m -> m.group(1) + "[redacted]"),
            // One-time codes in "code=1234", "otp: 123456", "code 1234".
            new Rule(Pattern.compile("(?i)\\b((?:otp|code|kod|код)\"?\\s*[=:]?\\s*\"?)(\\d{4,8})\\b"),
                    m -> m.group(1) + "****"),
            // Phones: E.164, 00…, and bare full Ukrainian or Polish numbers.
            new Rule(Pattern.compile("(?<![\\w+])(\\+|00)([1-9]\\d{7,14})\\b"),
                    m -> mask(m.group(1) + m.group(2))),
            new Rule(Pattern.compile("(?<![\\w.+-])(380\\d{9}|48\\d{9})(?![\\w.])"), m -> mask(m.group(1))),
            // Precise coordinates: two decimals are kept.
            new Rule(Pattern.compile("(?<![\\w.])(-?\\d{1,3}\\.\\d{2})\\d{3,}"), m -> m.group(1)));

    private LogRedaction() {
    }

    public static String redact(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        String out = text;
        for (Rule rule : RULES) {
            Matcher m = rule.pattern().matcher(out);
            StringBuilder sb = null;
            while (m.find()) {
                if (sb == null) {
                    sb = new StringBuilder(out.length());
                }
                m.appendReplacement(sb, Matcher.quoteReplacement(rule.replacement().apply(m)));
            }
            if (sb != null) {
                m.appendTail(sb);
                out = sb.toString();
            }
        }
        return out;
    }

    private static String mask(String phone) {
        int keep = phone.startsWith("+") ? 4 : phone.startsWith("00") ? 5 : 3;
        return phone.substring(0, Math.min(keep, phone.length())) + "*****"
                + phone.substring(Math.max(phone.length() - 2, keep));
    }

    /** {@code %msg}, {@code %m}, {@code %message}: the message, redacted. */
    public static final class RedactedMessage extends ch.qos.logback.classic.pattern.MessageConverter {
        @Override
        public String convert(ch.qos.logback.classic.spi.ILoggingEvent event) {
            return redact(super.convert(event));
        }
    }

    /** {@code %redactedEx}: the stack trace with its messages redacted. */
    public static final class RedactedThrowable extends ch.qos.logback.classic.pattern.ExtendedThrowableProxyConverter {
        @Override
        protected String throwableProxyToString(ch.qos.logback.classic.spi.IThrowableProxy proxy) {
            return redact(super.throwableProxyToString(proxy));
        }
    }
}
