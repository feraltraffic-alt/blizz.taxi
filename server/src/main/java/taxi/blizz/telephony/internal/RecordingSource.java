package taxi.blizz.telephony.internal;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

/** Where the recordings of finished calls come from: Asterisk's stored recordings (ARI), or the fake source. */
interface RecordingSource {

    /**
     * The recording of the call whose first channel is {@code channelId}, as a temporary WAV file the caller deletes;
     * empty when the source has none (yet). An unreachable source throws.
     */
    Optional<Path> fetch(String channelId) throws IOException;

    /** Removes the source's copy once ours is stored. */
    void discard(String channelId) throws IOException;
}
