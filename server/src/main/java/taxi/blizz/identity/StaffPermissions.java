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

    public static final List<Permission> CATALOG = List.of(
            new Permission("orders.create", "Orders", "Create orders (phone orders)"),
            new Permission("orders.cancel", "Orders", "Cancel orders"),
            new Permission("orders.reassign", "Orders", "Take a driver off an order"),
            new Permission("orders.view", "Orders", "Order details and the rider–driver chat"),
            new Permission("driver.review", "Drivers", "Review drivers, vehicles and documents"),
            new Permission("geo.manage", "Geography", "Cities, zones and addresses"),
            new Permission("pricing.manage", "Pricing", "Vehicle classes and tariffs"),
            new Permission("finance.manage", "Finance", "Driver debt limits and payments"),
            new Permission("settings.manage", "Settings", "Service settings: brand, languages, how calls work"),
            new Permission(StaffPermissions.AUDIT_VIEW, "Logs", "Logs of staff actions and changes, by role"));

    public static final Set<String> CODES = CATALOG.stream().map(Permission::code).collect(Collectors.toUnmodifiableSet());

    private StaffPermissions() {
    }
}
