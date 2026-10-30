package taxi.blizz;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Phone numbers for test rows that never repeat within a run. A number from a hash of a random id repeats often
 * enough to fail a run now and then: a few thousand drivers in ten million numbers collide with a chance of several
 * per cent (the birthday problem), and the phone columns are unique.
 */
public final class TestPhones {

    /** Starts at a random place, so two runs on one database (a local rerun) rarely meet either. */
    private static final AtomicLong NEXT = new AtomicLong(ThreadLocalRandom.current().nextLong(1_000_000_000L));

    private TestPhones() {
    }

    /** {@code prefix} followed by {@code digits} digits, different from every other number this run made. */
    public static String unique(String prefix, int digits) {
        long modulus = (long) Math.pow(10, digits);
        while (true) {
            long next = Math.floorMod(NEXT.getAndIncrement(), modulus);
            // A number ending in 0000 is one the fake SMS sender fails on purpose (FakeOtpSender): never handed out.
            if (next % 10_000 != 0) {
                return prefix + String.format("%0" + digits + "d", next);
            }
        }
    }
}
