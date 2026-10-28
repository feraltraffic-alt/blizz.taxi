package taxi.blizz.telephony;

import java.util.Set;
import java.util.UUID;

/** The operators' own status for incoming calls (issue #67): AVAILABLE, BREAK or OFFLINE (no status set). */
public interface Operators {

    /** Those of {@code staffIds} who are AVAILABLE now. */
    Set<UUID> available(Set<UUID> staffIds);
}
