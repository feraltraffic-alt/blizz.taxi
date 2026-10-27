package taxi.blizz.identity.internal;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import org.springframework.stereotype.Component;

/**
 * Who was anonymized, kept outside the database (REQ-PRV-05): one file per subject, written once and never changed;
 * no personal data in it, only the kind of subject, its id and when. A database restored from a backup is compared
 * with it by {@link ErasureReplay}.
 */
@Component
class ErasureJournal {

    private final Path dir;

    ErasureJournal(PrivacyProperties properties) {
        this.dir = properties.erasureJournalDir();
    }

    /** Idempotent; the file appears whole (written aside, then moved in). */
    void record(String subjectType, UUID subjectId, String at) {
        try {
            Files.createDirectories(dir);
            Path target = dir.resolve(subjectType + "-" + subjectId);
            if (Files.exists(target)) {
                return;
            }
            Path temp = Files.createTempFile(dir, "erasure-", ".tmp");
            Files.writeString(temp, "{\"subject_type\":\"" + subjectType + "\",\"subject_id\":\"" + subjectId
                    + "\",\"anonymized_at\":\"" + at + "\"}\n", StandardCharsets.UTF_8);
            Files.move(temp, target, StandardCopyOption.ATOMIC_MOVE);
        } catch (IOException e) {
            throw new UncheckedIOException("The erasure journal could not be written", e);
        }
    }

    /** The ids of the subjects of a kind the journal lists. */
    List<UUID> subjects(String subjectType) {
        if (!Files.isDirectory(dir)) {
            return List.of();
        }
        String prefix = subjectType + "-";
        List<UUID> ids = new ArrayList<>();
        try (Stream<Path> files = Files.list(dir)) {
            files.map(p -> p.getFileName().toString()).filter(n -> n.startsWith(prefix)).forEach(n -> {
                try {
                    ids.add(UUID.fromString(n.substring(prefix.length())));
                } catch (IllegalArgumentException ignored) {
                    // not one of ours
                }
            });
        } catch (IOException e) {
            throw new UncheckedIOException("The erasure journal could not be read", e);
        }
        return ids;
    }
}
