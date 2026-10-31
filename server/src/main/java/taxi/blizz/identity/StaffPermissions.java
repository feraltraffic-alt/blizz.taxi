package taxi.blizz.identity;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The functions of the admin panel and the operator workstation a super admin can tick for an admin or an
 * operator (owner decision 27.10.2026). The role itself grants nothing; a super admin has everything. The
 * codes are the {@code *_PERMISSION} constants of the modules; {@code StaffPermissionCatalogTests} keeps
 * the two in step.
 */
public final class StaffPermissions {

    /** One checkbox; {@code group} lets the UI group them, {@code description} is the English label. */
    public record Permission(String code, String group, String description) {
    }

    /** Reading the staff logs; checked in identity itself. */
    public static final String AUDIT_VIEW = "audit.view";

    /** The owner's reports of orders and money per city and day; checked by operations and finance. */
    public static final String REPORTS_VIEW = "reports.view";

    /** Support cases and problem queues (backoffice), and how sign-in codes went out (telephony). */
    public static final String SUPPORT_MANAGE = "support.manage";

    public static final List<Permission> CATALOG = List.of(
            new Permission("orders.create", "Orders", "Create orders (phone orders)"),
            new Permission("orders.cancel", "Orders", "Cancel orders"),
            new Permission("orders.reassign", "Orders", "Take a driver off an order"),
            new Permission("orders.offer", "Orders", "Offer an order to a chosen driver (audited)"),
            new Permission("orders.interrupt", "Orders", "Interrupt a trip in progress and send a follow-up"),
            new Permission("orders.view", "Orders", "Order details and the rider–driver chat"),
            new Permission("calls.answer", "Calls", "Incoming calls: see them as they ring and take them"),
            new Permission("calls.listen", "Calls", "Listen to call recordings (every listening is audited)"),
            new Permission("calls.supervise", "Calls", "See the operators of a city and their status"),
            new Permission("driver.review", "Drivers", "Review drivers, vehicles and documents"),
            new Permission("drivers.risk", "Drivers", "Review drivers' risk flags and raise them by hand"),
            new Permission("drivers.delete", "Drivers", "Drivers' deletion requests: check, complete or reject"),
            new Permission("geo.manage", "Geography", "Cities, zones and addresses"),
            new Permission("pricing.manage", "Pricing", "Vehicle classes and tariffs"),
            new Permission("fares.correct", "Finance", "Correct a fulfilled order's final fare (the password is asked again)"),
            new Permission("finance.manage", "Finance", "Driver debt limits and payments"),
            new Permission("wallets.manage", "Finance", "Riders' bonus accounts: view and top up"),
            new Permission("payments.retry", "Finance",
                    "Card operations of an order; retry a declined charge by hand (audited)"),
            new Permission("promotions.manage", "Finance", "Promotions for riders: discounts and bonuses"),
            new Permission(StaffPermissions.SUPPORT_MANAGE, "Support", "Support cases and problem queues"),
            new Permission("clients.manage", "Support", "Riders: find, see the card, block and unblock"),
            new Permission("clients.delete", "Clients", "Riders' deletion requests: check, complete or reject"),
            new Permission("operator-bonuses.manage", "Operators", "Operator bonus settings, balances and history"),
            new Permission("retention.manage", "Settings", "Technical data retention periods and cleanup"),
            new Permission("settings.manage", "Settings", "Service settings: brand, languages, how calls work"),
            new Permission("flags.manage", "Settings",
                    "Feature flags: switch a function of the whole service on or off (audited)"),
            new Permission("integrations.manage", "Settings",
                    "Keys of integrations: Firebase, GraphHopper, maps, payment merchants"),
            new Permission(StaffPermissions.AUDIT_VIEW, "Logs", "Logs of staff actions and changes, by role"),
            new Permission(StaffPermissions.REPORTS_VIEW, "Reports", "Reports of orders and money per city and day"),
            new Permission("legal.manage", "Settings", "Legal texts for riders and drivers: versions and publication"));

    public static final Set<String> CODES = CATALOG.stream().map(Permission::code).collect(Collectors.toUnmodifiableSet());

    private StaffPermissions() {
    }
}
