package taxi.blizz.payments.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import java.util.List;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * Sandbox only (issue #140): what the fake bank answers next for one rider's saved cards, e.g. LOST_ANSWER for a hold
 * the bank takes but never confirms. Keyed by the card, so no other scenario or background check takes the answer.
 */
@RestController
@Profile("sandbox")
class SandboxBankController {

    private static final java.util.Set<String> ANSWERS = java.util.Set.of("Approved", "Declined", "TIMEOUT",
            "LOST_ANSWER");

    private final FakeProvider.Gateway gateway;
    private final JdbcClient jdbc;
    private final taxi.blizz.identity.ClientLookup clients;

    SandboxBankController(FakeProvider.Gateway gateway, JdbcClient jdbc, taxi.blizz.identity.ClientLookup clients) {
        this.gateway = gateway;
        this.jdbc = jdbc;
        this.clients = clients;
    }

    record NextAnswers(@NotBlank @Pattern(regexp = "\\+[1-9][0-9]{7,14}") String phone,
                       @NotEmpty List<@NotBlank String> answers) {
    }

    @PostMapping("/sandbox/v1/bank/next-answers")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void next(@Valid @RequestBody NextAnswers body) {
        if (!ANSWERS.containsAll(body.answers())) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Answers are one of " + ANSWERS);
        }
        tokensOf(body.phone()).forEach(token -> gateway.nextForToken(token, body.answers().toArray(String[]::new)));
    }

    /** Drops the answers still queued for the rider's cards: their payments are answered normally again. */
    @org.springframework.web.bind.annotation.DeleteMapping("/sandbox/v1/bank/next-answers")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void clear(@org.springframework.web.bind.annotation.RequestParam String phone) {
        tokensOf(phone).forEach(gateway::clearForToken);
    }

    private List<String> tokensOf(String phone) {
        // The rider through identity's own lookup: payments does not read the client table (module boundary).
        taxi.blizz.identity.ClientLookup.Client client = clients.byPhone(phone).client();
        if (client == null) {
            throw new DomainException(ErrorCode.NOT_FOUND, "No rider with this phone");
        }
        List<String> tokens = jdbc.sql("""
                        select token from payment_card
                        where client_id = :client and state = 'ACTIVE' and token is not null""")
                .param("client", client.id()).query(String.class).list();
        if (tokens.isEmpty()) {
            throw new DomainException(ErrorCode.NOT_FOUND, "No saved card for this phone");
        }
        return tokens;
    }
}
