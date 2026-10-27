package taxi.blizz.telephony.internal;

import java.util.Map;

/** The HTTP calls to the providers; replaced in tests. An IO failure or timeout is an {@link java.io.UncheckedIOException}. */
interface HttpTransport {

    record Response(int status, String body) {
    }

    Response send(String method, String url, Map<String, String> headers, String body);
}
