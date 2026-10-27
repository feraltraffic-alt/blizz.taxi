package taxi.blizz.identity.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ClientAccounts;

/** Riders in the admin panel: search, block, unblock (admin.v1.yaml). The rider's card is in backoffice. */
@RestController
class ClientAccountsController {

    private final ClientAccounts clients;

    ClientAccountsController(ClientAccounts clients) {
        this.clients = clients;
    }

    record ClientList(List<ClientAccounts.Client> clients) {
    }

    record Block(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String reason,
                 OffsetDateTime until) {
    }

    record Unblock(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String reason) {
    }

    @GetMapping("/api/admin/v1/clients")
    ClientList search(AccessClaims claims, @RequestParam String query,
                      @RequestParam(defaultValue = "20") int limit) {
        return new ClientList(clients.search(claims.actor(), query, limit));
    }

    @PostMapping("/api/admin/v1/clients/{clientId}/block")
    ClientAccounts.Client block(AccessClaims claims, @PathVariable UUID clientId, @Valid @RequestBody Block body) {
        return clients.block(claims.actor(), body.commandId(), clientId, body.expectedVersion(), body.reason(),
                body.until());
    }

    @PostMapping("/api/admin/v1/clients/{clientId}/unblock")
    ClientAccounts.Client unblock(AccessClaims claims, @PathVariable UUID clientId,
                                  @Valid @RequestBody Unblock body) {
        return clients.unblock(claims.actor(), body.commandId(), clientId, body.expectedVersion(), body.reason());
    }
}
