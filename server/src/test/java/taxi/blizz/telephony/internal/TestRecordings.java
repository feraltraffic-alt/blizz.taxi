package taxi.blizz.telephony.internal;

/** A real WAV body for tests outside this package that need a stored call recording. */
public final class TestRecordings {

    private TestRecordings() {
    }

    public static byte[] tone(int seconds) {
        return WavFiles.tone(seconds);
    }
}
