package taxi.blizz.identity;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Result of a code request. Identical whether or not an account exists for the phone, so it
 * reveals nothing about registered users (REQ-AUTH-03). {@code channel} is the one channel the code is sent by.
 */
public record ChallengeIssued(UUID challengeId, OffsetDateTime expiresAt, OffsetDateTime resendAvailableAt,
                              OtpChannel channel) {
}
