package taxi.blizz.operations.internal;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.DispatchJournal;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Page;
import taxi.blizz.platform.PageCursor;

/** Orders after the fact in the admin panel — admin.v1.yaml (REQ-ADM-01, issue #142). */
@RestController
class AdminOrderController {

    private final Orders orders;
    private final DispatchJournal journal;

    AdminOrderController(Orders orders, DispatchJournal journal) {
        this.orders = orders;
        this.journal = journal;
    }

    record OrderList(List<Orders.Found> orders, Page.Info page) {
    }

    record Timeline(List<Orders.TimelineEntry> events, DispatchJournal.Journal dispatch) {
    }

    @GetMapping("/api/admin/v1/orders")
    OrderList search(AccessClaims claims, @RequestParam(name = "city_id", required = false) UUID cityId,
                     @RequestParam(required = false) Set<String> status,
                     @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                     OffsetDateTime from,
                     @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                     OffsetDateTime to,
                     @RequestParam(name = "rider_phone", required = false) String riderPhone,
                     @RequestParam(name = "driver_phone", required = false) String driverPhone,
                     @RequestParam(name = "short_number", required = false) Long shortNumber,
                     @RequestParam(required = false) String cursor,
                     @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        PageCursor after = cursor == null ? null : PageCursor.decode(Orders.ADMIN_ORDERS, cursor);
        Page<Orders.Found> page = Page.of(orders.search(claims.actor(), new Orders.Search(cityId, status, from, to,
                riderPhone, driverPhone, shortNumber), after, size + 1), size, Orders::position);
        return new OrderList(page.items(), page.page());
    }

    @GetMapping("/api/admin/v1/orders/overview")
    Orders.Overview overview(AccessClaims claims, @RequestParam(name = "city_id") UUID cityId,
                             @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return orders.overview(claims.actor(), cityId, date);
    }

    @GetMapping("/api/admin/v1/orders/{orderId}/timeline")
    Timeline timeline(AccessClaims claims, @PathVariable UUID orderId) {
        return new Timeline(orders.timeline(claims.actor(), orderId), journal.of(claims.actor(), orderId));
    }
}
