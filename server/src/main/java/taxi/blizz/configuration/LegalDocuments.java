package taxi.blizz.configuration;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The service's legal texts with their versions, and who accepted which (REQ-PRV-08, issue #69). A document is an
 * audience (RIDER, DRIVER) and a kind; a version holds its texts by language (uk, pl, ru, en), the moment it takes
 * effect and whether it must be accepted. A published version never changes — a correction is a new version. The
 * version in force is the published one with the latest effective moment that has come. While a version in force that
 * must be accepted is not accepted, a rider cannot order and a driver cannot go online ({@code ACCEPTANCE_REQUIRED});
 * a trip in progress goes on. Acceptances are kept as legal facts, also after the account is deleted.
 */
public interface LegalDocuments {

    String MANAGE_PERMISSION = "legal.manage";
    List<String> LANGUAGES = List.of("uk", "pl", "ru", "en");

    enum Audience { RIDER, DRIVER }

    enum Kind { TERMS, PRIVACY_NOTICE, DRIVER_AGREEMENT }

    /** {@code state}: DRAFT (staff may still change it) or PUBLISHED. {@code texts}: language → text. */
    record Version(UUID id, Audience audience, Kind kind, int number, String state, Map<String, String> texts,
                   boolean acceptanceRequired, OffsetDateTime effectiveFrom, OffsetDateTime publishedAt,
                   long version) {
    }

    /** What staff write in a draft. */
    record Draft(Map<String, String> texts, boolean acceptanceRequired, OffsetDateTime effectiveFrom) {
        public Draft {
            texts = texts == null ? Map.of() : java.util.Collections.unmodifiableMap(new java.util.TreeMap<>(texts));
        }
    }

    /** A version in force for a person, with whether this person still has to accept it. */
    record InForce(UUID versionId, Audience audience, Kind kind, int number, boolean acceptanceRequired,
                   boolean accepted, OffsetDateTime effectiveFrom, List<String> languages) {
    }

    /** One text to show: the language asked for, or the first of {@link #LANGUAGES} the version has. */
    record Text(UUID versionId, Audience audience, Kind kind, int number, String language, String text,
                OffsetDateTime effectiveFrom) {
    }

    record Acceptance(UUID versionId, Kind kind, int number, String language, OffsetDateTime acceptedAt) {
    }

    // ---------------------------------------------------------------- staff, MANAGE_PERMISSION

    Version createDraft(Actor staff, UUID commandId, Audience audience, Kind kind, Draft draft);

    Version updateDraft(Actor staff, UUID commandId, UUID versionId, long expectedVersion, Draft draft);

    Version publish(Actor staff, UUID commandId, UUID versionId, long expectedVersion);

    List<Version> versions(Actor staff, Audience audience, Kind kind);

    // ---------------------------------------------------------------- the apps

    /** For showing before sign-in; empty when no version is in force. */
    Optional<Text> text(Audience audience, Kind kind, String language);

    /** The versions in force for a signed-in rider or driver. */
    List<InForce> inForce(Actor person);

    /** Records that the person accepted the version, shown in {@code language}; a repeat changes nothing. */
    Acceptance accept(Actor person, UUID commandId, UUID versionId, String language, UUID deviceSessionId);

    /** Refuses with {@code ACCEPTANCE_REQUIRED} while a version in force that must be accepted is not. */
    void requireAccepted(Actor person);

    /** Everything the person accepted, oldest first (the copy of their data, #68). */
    List<Acceptance> acceptances(Actor person);
}
