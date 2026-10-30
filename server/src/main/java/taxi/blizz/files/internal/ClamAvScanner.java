package taxi.blizz.files.internal;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Optional;

/**
 * ClamAV's daemon over TCP (issue #105): {@code zINSTREAM}, the file in length-prefixed chunks, a zero-length chunk,
 * then one answer: {@code stream: OK}, {@code stream: <signature> FOUND}, or anything else, which is not a verdict.
 * The address is installation configuration ({@code blizz.files.clamav.address}, {@code host:port}), not something
 * staff can edit.
 */
final class ClamAvScanner implements ContentScanner {

    private static final int CHUNK = 64 * 1024;
    private static final int MAX_ANSWER = 1024;

    private final String host;
    private final int port;
    private final Duration connectTimeout;
    private final Duration readTimeout;

    ClamAvScanner(String address, Duration connectTimeout, Duration readTimeout) {
        int colon = address.lastIndexOf(':');
        if (colon <= 0 || colon == address.length() - 1) {
            throw new IllegalArgumentException("blizz.files.clamav.address must be host:port");
        }
        this.host = address.substring(0, colon).strip();
        this.port = Integer.parseInt(address.substring(colon + 1).strip());
        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
    }

    @Override
    public String engine() {
        return "clamav";
    }

    @Override
    public Optional<String> scan(Path file) throws Unavailable {
        String answer;
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), (int) connectTimeout.toMillis());
            socket.setSoTimeout((int) readTimeout.toMillis());
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream(), CHUNK + 4));
            out.write("zINSTREAM\0".getBytes(StandardCharsets.US_ASCII));
            try (InputStream in = Files.newInputStream(file)) {
                byte[] buffer = new byte[CHUNK];
                int n;
                while ((n = in.read(buffer)) > 0) {
                    out.writeInt(n);
                    out.write(buffer, 0, n);
                }
            }
            out.writeInt(0);
            out.flush();
            answer = readAnswer(socket.getInputStream());
        } catch (IOException e) {
            throw new Unavailable("clamd at " + host + ":" + port + " did not answer: " + e.getClass().getSimpleName(),
                    e);
        }
        if (answer.endsWith(" OK")) {
            return Optional.empty();
        }
        if (answer.endsWith(" FOUND")) {
            String found = answer.substring(0, answer.length() - " FOUND".length());
            return Optional.of(found.substring(found.indexOf(':') + 1).strip());
        }
        throw new Unavailable("clamd answered neither OK nor FOUND: " + (answer.isEmpty() ? "nothing" : answer));
    }

    /** Up to the terminating NUL; whatever came when the connection closed early. */
    private static String readAnswer(InputStream in) throws IOException {
        ByteArrayOutputStream answer = new ByteArrayOutputStream();
        int b;
        while ((b = in.read()) > 0 && answer.size() < MAX_ANSWER) {
            answer.write(b);
        }
        return answer.toString(StandardCharsets.US_ASCII).strip();
    }
}
