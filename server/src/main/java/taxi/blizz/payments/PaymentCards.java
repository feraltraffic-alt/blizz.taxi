package taxi.blizz.payments;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * A rider's saved cards (ADR 0008). A card is added on the provider's page with 3-D Secure; the platform keeps only
 * the provider's token and the masked number (REQ-PAY-08). A card belongs to the merchant of the city it was added
 * in and is not moved to another merchant.
 */
public interface PaymentCards {

    record Card(UUID id, UUID merchantId, String maskedPan, String cardType, OffsetDateTime createdAt) {
    }

    /**
     * What the app opens to add a card: a form to POST from a web view to {@code url}. When the provider is done it
     * sends the web view to {@code returnUrl}; the app then reads the binding.
     */
    record Binding(UUID id, String state, String url, Map<String, String> fields, String returnUrl,
                   OffsetDateTime expiresAt, Card card, String failureReason) {
    }

    /** Starts adding a card with the merchant of the city; NOT_FOUND when the city takes no cards. */
    Binding startBinding(Actor rider, UUID commandId, UUID cityId);

    Binding binding(Actor rider, UUID bindingId);

    List<Card> cards(Actor rider);

    void remove(Actor rider, UUID commandId, UUID cardId);

    /** The rider's active card for the merchant of the city, newest first; for paying an order. */
    Optional<Card> cardFor(UUID clientId, UUID cityId);
}
