package taxi.blizz.files;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * A clamd for tests (issue #105): speaks the {@code zINSTREAM} command over TCP like ClamAV's daemon, finds the EICAR
 * test string anywhere in the stream, and can be stopped, restarted on the same port, or made to misbehave. The
 * real {@code clamav/clamav} image is ~300 MB and downloads its signatures at start; this keeps CI fast while the
 * server's real client code (socket, chunks, answer parsing) runs.
 */
public final class FakeClamd {

    /** The EICAR antivirus test string, built at run time so no source file contains it whole. */
    public static final String EICAR = "X5O!P%@AP[4\\PZX54(P^)7CC)7}$" + "EICAR-STANDARD-ANTIVIRUS-TEST-FILE!$H+H*";

    public enum Mode {
        /** {@code stream: OK} or {@code stream: Eicar-Test-Signature FOUND}. */
        NORMAL,
        /** An answer that is neither OK nor FOUND. */
        ERROR,
        /** Closes the connection after reading the command, without an answer. */
        DROP
    }

    private final int port;
    private volatile ServerSocket server;
    private volatile Mode mode = Mode.NORMAL;
    private final AtomicInteger scans = new AtomicInteger();

    private FakeClamd(int port) {
        this.port = port;
    }

    /** Starts on a free port. */
    public static FakeClamd start() throws IOException {
        int free;
        try (ServerSocket probe = new ServerSocket(0)) {
            free = probe.getLocalPort();
        }
        FakeClamd clamd = new FakeClamd(free);
        clamd.restart();
        return clamd;
    }

    public String address() {
        return "127.0.0.1:" + port;
    }

    public void mode(Mode value) {
        mode = value;
    }

    /** Streams answered so far (OK, FOUND or ERROR). */
    public int scans() {
        return scans.get();
    }

    public synchronized void stop() throws IOException {
        if (server != null) {
            server.close();
            server = null;
        }
    }

    public synchronized void restart() throws IOException {
        stop();
        ServerSocket socket = new ServerSocket();
        socket.setReuseAddress(true);
        socket.bind(new InetSocketAddress("127.0.0.1", port));
        server = socket;
        Thread accept = new Thread(() -> serve(socket), "fake-clamd");
        accept.setDaemon(true);
        accept.start();
    }

    private void serve(ServerSocket socket) {
        while (!socket.isClosed()) {
            try (Socket client = socket.accept()) {
                answer(client);
            } catch (IOException closed) {
                // stopped, or the client went away
            }
        }
    }

    private void answer(Socket client) throws IOException {
        DataInputStream in = new DataInputStream(client.getInputStream());
        OutputStream out = client.getOutputStream();
        String command = readCommand(in);
        if (!"zINSTREAM".equals(command)) {
            out.write(("UNKNOWN COMMAND\0").getBytes(StandardCharsets.US_ASCII));
            return;
        }
        if (mode == Mode.DROP) {
            return;
        }
        ByteArrayOutputStream body = new ByteArrayOutputStream();
        while (true) {
            int length = in.readInt();
            if (length == 0) {
                break;
            }
            body.write(in.readNBytes(length));
        }
        scans.incrementAndGet();
        String reply;
        if (mode == Mode.ERROR) {
            reply = "stream: Can't allocate memory ERROR";
        } else if (body.toString(StandardCharsets.ISO_8859_1).contains(EICAR)) {
            reply = "stream: Eicar-Test-Signature FOUND";
        } else {
            reply = "stream: OK";
        }
        out.write((reply + "\0").getBytes(StandardCharsets.US_ASCII));
        out.flush();
    }

    private static String readCommand(InputStream in) throws IOException {
        StringBuilder command = new StringBuilder();
        int b;
        while ((b = in.read()) > 0) {
            command.append((char) b);
        }
        return command.toString();
    }
}
