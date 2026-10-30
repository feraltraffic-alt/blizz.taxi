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
        DROP,
        /** Accepts and then neither reads nor answers: the client's write blocks once the socket buffers are full. */
        HANG,
        /** Starts the answer ({@code stream: O}) and closes the connection without the rest. */
        CUT,
        /** clamd's own answer to a stream over its {@code StreamMaxLength}. */
        SIZE_LIMIT
    }

    private final int port;
    private volatile ServerSocket server;
    private volatile Mode mode = Mode.NORMAL;
    private final AtomicInteger scans = new AtomicInteger();
    private final AtomicInteger lastChunks = new AtomicInteger();

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

    /** How many non-empty chunks the last answered stream came in. */
    public int lastChunks() {
        return lastChunks.get();
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
        long until = System.currentTimeMillis() + 5_000;
        while (true) {
            try {
                socket.bind(new InetSocketAddress("127.0.0.1", port));
                break;
            } catch (java.net.BindException busy) {
                // the old listening socket is still being released
                if (System.currentTimeMillis() > until) {
                    socket.close();
                    throw busy;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw busy;
                }
            }
        }
        server = socket;
        Thread accept = new Thread(() -> serve(socket), "fake-clamd");
        accept.setDaemon(true);
        accept.start();
    }

    private void serve(ServerSocket socket) {
        while (!socket.isClosed()) {
            try {
                Socket client = socket.accept();
                Thread connection = new Thread(() -> {
                    try (client) {
                        answer(client);
                    } catch (IOException gone) {
                        // the client went away
                    }
                }, "fake-clamd-connection");
                connection.setDaemon(true);
                connection.start();
            } catch (IOException closed) {
                // stopped
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
        if (mode == Mode.HANG) {
            try {
                Thread.sleep(30_000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return;
        }
        ByteArrayOutputStream body = new ByteArrayOutputStream();
        int chunks = 0;
        while (true) {
            int length = in.readInt();
            if (length == 0) {
                break;
            }
            body.write(in.readNBytes(length));
            chunks++;
        }
        lastChunks.set(chunks);
        scans.incrementAndGet();
        if (mode == Mode.CUT) {
            out.write("stream: O".getBytes(StandardCharsets.US_ASCII));
            out.flush();
            return;
        }
        String reply;
        if (mode == Mode.SIZE_LIMIT) {
            reply = "INSTREAM size limit exceeded. ERROR";
        } else if (mode == Mode.ERROR) {
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

    /** A JPEG whose image data carries {@code payload}: it passes the type and structure checks. */
    public static byte[] jpegCarrying(String payload) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.writeBytes(new byte[] {(byte) 0xFF, (byte) 0xD8});
        segment(out, 0xE0, "JFIF\0\1\1\0\0\1\0\1\0\0");
        segment(out, 0xDB, "quantization-table-bytes");
        segment(out, 0xDA, "\0\1\2\3\4\5");
        out.writeBytes(payload.getBytes(StandardCharsets.ISO_8859_1));
        out.writeBytes(new byte[] {0x11, 0x22, (byte) 0xFF, (byte) 0xD9});
        return out.toByteArray();
    }

    private static void segment(ByteArrayOutputStream out, int marker, String payload) {
        byte[] data = payload.getBytes(StandardCharsets.ISO_8859_1);
        int length = data.length + 2;
        out.writeBytes(new byte[] {(byte) 0xFF, (byte) marker, (byte) (length >> 8), (byte) length});
        out.writeBytes(data);
    }
}
