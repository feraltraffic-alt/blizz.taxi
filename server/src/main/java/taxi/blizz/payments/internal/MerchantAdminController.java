package taxi.blizz.payments.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.identity.AccessClaims;

/** Payment merchants in the admin panel (admin.v1.yaml, REQ-ADM-10). */
@RestController
class MerchantAdminController {

    private final MerchantAdmin admin;

    MerchantAdminController(MerchantAdmin admin) {
        this.admin = admin;
    }

    record MerchantList(List<MerchantAdmin.MerchantView> merchants) {
    }

    record Create(@NotNull UUID commandId, @NotBlank String password, @NotBlank String provider,
                  @NotBlank String account, @NotBlank String domain, @NotBlank String currency,
                  @NotBlank String secret, List<UUID> cityIds, @NotBlank String reason) {

        @Override
        public String toString() {
            return "Create[" + provider + ", " + account + "]";
        }
    }

    record Change(@NotNull UUID commandId, @NotBlank String password, String domain, String secret,
                  List<UUID> cityIds, @NotBlank String reason) {

        @Override
        public String toString() {
            return "Change[" + commandId + "]";
        }
    }

    @GetMapping("/api/admin/v1/payment-merchants")
    MerchantList list(AccessClaims claims) {
        return new MerchantList(admin.list(claims.actor()));
    }

    @PostMapping("/api/admin/v1/payment-merchants")
    @ResponseStatus(HttpStatus.CREATED)
    MerchantAdmin.MerchantView create(AccessClaims claims, @Valid @RequestBody Create body) {
        return admin.create(claims.actor(), body.commandId(), body.password(), new MerchantAdmin.NewMerchant(
                body.provider(), body.account(), body.domain(), body.currency(), body.secret(), body.cityIds()),
                body.reason());
    }

    @PostMapping("/api/admin/v1/payment-merchants/{merchantId}/change")
    MerchantAdmin.MerchantView change(AccessClaims claims, @PathVariable UUID merchantId,
                                      @Valid @RequestBody Change body) {
        return admin.change(claims.actor(), body.commandId(), body.password(), merchantId,
                new MerchantAdmin.MerchantChange(body.domain(), body.secret(), body.cityIds()), body.reason());
    }

    @PostMapping("/api/admin/v1/payment-merchants/{merchantId}/check")
    Integrations.Check check(AccessClaims claims, @PathVariable UUID merchantId) {
        return admin.check(claims.actor(), merchantId);
    }
}
