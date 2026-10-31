package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The operator's targeted lookup of one rider by their exact phone (registry 22.2 "GET /customers/lookup", issue
 * #176): an audited search, never an export of the base.
 */
public interface CustomerLookup {

    String PERMISSION = Orders.CREATE_PERMISSION;
    int ORDERS = 10;

    record Order(UUID id, long shortNumber, String status, UUID cityId, String pickupLabel, String dropoffLabel,
                 OffsetDateTime createdAt) {
    }

    record Customer(UUID clientId, String name, String accountState, List<Order> orders) {
    }

    /**
     * Staff with {@link #PERMISSION} in some city; within their budget ({@code customer-lookup}). NOT_FOUND when
     * nobody active has the number; VALIDATION_FAILED for anything but a full E.164 number. Only orders in the staff
     * member's cities are listed, newest first, at most {@link #ORDERS}. Audited as {@code customer.lookup}, found or
     * not, with the phone only as a keyed hash.
     */
    Customer lookup(Actor staff, String phone);
}
