package taxi.blizz.telephony.internal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;
import taxi.blizz.telephony.FakeCallEvents;

/**
 * Hands an ARI event to the call log, and gives every call a two-second recording (a tone), only on an instance with
 * the FAKE provider.
 */
@Component
class FakeCallSource implements FakeCallEvents, RecordingSource {

    private final AriCallEvents events;
    private final TelephonyProperties properties;
    private final Set<String> withoutRecording = ConcurrentHashMap.newKeySet();

    FakeCallSource(AriCallEvents events, TelephonyProperties properties) {
        this.events = events;
        this.properties = properties;
    }

    @Override
    public boolean push(String ariEvent) {
        if (!properties.fake()) {
            return false;
        }
        events.handle(ariEvent);
        return true;
    }

    @Override
    public void withoutRecording(String channelId) {
        withoutRecording.add(channelId);
    }

    @Override
    public Optional<Path> fetch(String channelId) throws IOException {
        if (withoutRecording.contains(channelId)) {
            return Optional.empty();
        }
        Path file = Files.createTempFile("fake-call-recording-", ".wav");
        Files.write(file, WavFiles.tone(2));
        return Optional.of(file);
    }

    @Override
    public void discard(String channelId) {
        withoutRecording.remove(channelId);
    }
}
