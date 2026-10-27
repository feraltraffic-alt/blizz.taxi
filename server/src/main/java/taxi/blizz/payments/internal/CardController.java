package taxi.blizz.payments.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.payments.PaymentCards;

/** The rider's saved cards (rider.v1.yaml, ADR 0008). */
@RestController
@RequestMapping("/api/rider/v1")
class CardController {

    private final PaymentCards cards;

    CardController(PaymentCards cards) {
        this.cards = cards;
    }

    record StartBinding(@NotNull UUID commandId, @NotNull UUID cityId) {
    }

    record Command(@NotNull UUID commandId) {
    }

    record CardList(List<PaymentCards.Card> cards) {
    }

    @GetMapping("/cards")
    CardList list(AccessClaims claims) {
        return new CardList(cards.cards(claims.actor()));
    }

    @PostMapping("/card-bindings")
    @ResponseStatus(HttpStatus.CREATED)
    PaymentCards.Binding start(AccessClaims claims, @Valid @RequestBody StartBinding body) {
        return cards.startBinding(claims.actor(), body.commandId(), body.cityId());
    }

    @GetMapping("/card-bindings/{bindingId}")
    PaymentCards.Binding binding(AccessClaims claims, @PathVariable UUID bindingId) {
        return cards.binding(claims.actor(), bindingId);
    }

    @PostMapping("/cards/{cardId}/remove")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void remove(AccessClaims claims, @PathVariable UUID cardId, @Valid @RequestBody Command body) {
        cards.remove(claims.actor(), body.commandId(), cardId);
    }
}
