package taxi.blizz.platform;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Named places where the fault tests stop the process as {@code kill -9} would (REQ-QA-01, issue #146): the JVM halts
 * at once, without shutdown hooks, open transactions roll back and leases stay taken. Set by
 * {@code blizz.faults.crash-at} = {@code <point>} or {@code <point>:<detail>}; a production instance refuses to
 * start with it. Everywhere else, and when it is not set, {@link #reach} does nothing.
 */
public final class CrashPoints {

    private static volatile String armed;
    private static final AtomicBoolean fired = new AtomicBoolean();

    private CrashPoints() {
    }

    /** Called once at start from the configuration; {@code null} or blank disarms. */
    public static void arm(String point) {
        armed = point == null || point.isBlank() ? null : point.strip();
        fired.set(false);
    }

    /** Halts the process the first time {@code point} (with this {@code detail}, when the setting names one) is reached. */
    public static void reach(String point, String detail) {
        String target = armed;
        if (target == null) {
            return;
        }
        boolean matches = target.equals(point) || target.equals(point + ":" + detail);
        if (matches && fired.compareAndSet(false, true)) {
            System.err.println("Crash point " + target + " reached: halting as kill -9 would");
            System.err.flush();
            Runtime.getRuntime().halt(137);
        }
    }
}
