package taxi.blizz.finance.internal;

import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.finance.FareAccounting;
import taxi.blizz.identity.AccessClaims;

/** Completed trips whose fare is not in the journal yet (REQ-LED-05, issue #140) — admin.v1.yaml. */
@RestController
class PendingPostingController {

    private final FareAccounting accounting;

    PendingPostingController(FareAccounting accounting) {
        this.accounting = accounting;
    }

    @GetMapping("/api/admin/v1/finance/pending-postings")
    FareAccounting.PendingList pending(AccessClaims claims, @RequestParam("city_id") UUID cityId) {
        return accounting.pending(claims.actor(), cityId);
    }
}
