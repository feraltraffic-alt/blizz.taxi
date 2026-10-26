package taxi.blizz.platform;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.function.Supplier;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tools.jackson.databind.json.JsonMapper;

/**
 * Executes a command at most once per {@link CommandKey} (REQ-API-04 – REQ-API-06).
 *
 * <p>The receipt row is inserted before the action runs and in the same transaction, so a
 * concurrent duplicate waits on the primary key and then reads the committed outcome instead of
 * executing again. If the action fails, the transaction rolls back together with the receipt and
 * the command can be retried. Receipts have no TTL: they live as long as the objects they created
 * (REQ-API-05).
 */
@Component
public class IdempotentCommands {

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;

    IdempotentCommands(JdbcClient jdbc, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    /**
     * @param request the normalized request body; equal bodies must serialize identically (use records)
     * @return the outcome of the first successful execution for this key
     * @throws IdempotencyConflictException if the key was used with a different request
     */
    @Transactional
    public <R> R execute(CommandKey key, Object request, Class<R> resultType, Supplier<R> action) {
        byte[] requestHash = sha256(json.writeValueAsString(request));
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);

        int inserted = jdbc.sql("""
                        insert into command_receipt (scope, command_id, request_hash, created_at)
                        values (:scope, :commandId, :hash, :now)
                        on conflict do nothing
                        """)
                .param("scope", key.scope())
                .param("commandId", key.commandId())
                .param("hash", requestHash)
                .param("now", now)
                .update();

        if (inserted == 0) {
            Receipt receipt = jdbc.sql("""
                            select request_hash, outcome::text as outcome
                            from command_receipt
                            where scope = :scope and command_id = :commandId
                            """)
                    .param("scope", key.scope())
                    .param("commandId", key.commandId())
                    .query((rs, i) -> new Receipt(rs.getBytes("request_hash"), rs.getString("outcome")))
                    .single();
            if (!MessageDigest.isEqual(receipt.requestHash(), requestHash)) {
                throw new IdempotencyConflictException(key);
            }
            return receipt.outcome() == null ? null : json.readValue(receipt.outcome(), resultType);
        }

        R result = action.get();
        jdbc.sql("""
                        update command_receipt
                        set outcome = cast(:outcome as jsonb), completed_at = :now
                        where scope = :scope and command_id = :commandId
                        """)
                .param("outcome", json.writeValueAsString(result))
                .param("now", now)
                .param("scope", key.scope())
                .param("commandId", key.commandId())
                .update();
        return result;
    }

    private static byte[] sha256(String value) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(value.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 is not available", e);
        }
    }

    private record Receipt(byte[] requestHash, String outcome) {
    }
}
