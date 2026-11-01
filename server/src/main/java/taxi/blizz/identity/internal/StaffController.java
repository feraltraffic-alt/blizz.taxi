package taxi.blizz.identity.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffDirectory;
import taxi.blizz.identity.StaffDirectory.Profile;
import taxi.blizz.identity.StaffDirectory.StaffMember;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.identity.StaffSignIn;

/** Staff self-service and the super admin's staff management — admin.v1.yaml, operator.v1.yaml. */
@RestController
class StaffController {

    private final StaffDirectory directory;
    private final StaffSignIn signIn;

    StaffController(StaffDirectory directory, StaffSignIn signIn) {
        this.directory = directory;
        this.signIn = signIn;
    }

    /** The member and what the UI may show: every function for a super admin, the ticked ones otherwise. */
    record Me(StaffMember member, List<String> effectivePermissions) {
    }

    record ChangePassword(@NotBlank @Size(max = 128) String currentPassword,
                          @NotBlank @Size(max = 128) String newPassword) {
    }

    record CreateStaff(@NotNull UUID commandId, @NotBlank String login, @NotBlank String initialPassword,
                       @NotNull Profile profile, @NotBlank String reason, String password) {
    }

    record UpdateStaff(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotNull Profile profile,
                       @NotBlank String reason, String password) {
    }

    record ChangeStaff(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String reason) {
    }

    record ResetPassword(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                         @NotBlank String temporaryPassword, @NotBlank String reason, String password) {
    }

    record StaffList(List<StaffMember> staff) {
    }

    record Catalog(List<StaffPermissions.Permission> permissions) {
    }

    @GetMapping({"/api/admin/v1/me", "/api/operator/v1/me"})
    Me me(AccessClaims claims) {
        StaffMember member = directory.get(claims.actor(), claims.actor().id());
        List<String> effective = member.passwordChangeRequired() || !"ACTIVE".equals(member.state()) ? List.of()
                : member.profile().role() == StaffDirectory.Role.SUPER_ADMIN
                ? StaffPermissions.CATALOG.stream().map(StaffPermissions.Permission::code).toList()
                : member.profile().permissions();
        return new Me(member, effective);
    }

    @PostMapping({"/api/admin/v1/me/password", "/api/operator/v1/me/password"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void changePassword(AccessClaims claims, @Valid @RequestBody ChangePassword body) {
        signIn.changePassword(claims.actor(), claims.sessionId(), body.currentPassword(), body.newPassword());
    }

    @GetMapping("/api/admin/v1/permissions")
    Catalog permissions(AccessClaims claims) {
        return new Catalog(StaffPermissions.CATALOG);
    }

    @GetMapping("/api/admin/v1/staff")
    StaffList list(AccessClaims claims) {
        return new StaffList(directory.list(claims.actor()));
    }

    @PostMapping("/api/admin/v1/staff")
    @ResponseStatus(HttpStatus.CREATED)
    StaffMember create(AccessClaims claims, @Valid @RequestBody CreateStaff body) {
        return directory.create(claims.actor(), body.commandId(), body.login(), body.initialPassword(), body.profile(),
                body.reason(), body.password());
    }

    @GetMapping("/api/admin/v1/staff/{staffId}")
    StaffMember get(AccessClaims claims, @PathVariable UUID staffId) {
        return directory.get(claims.actor(), staffId);
    }

    @PostMapping("/api/admin/v1/staff/{staffId}/update")
    StaffMember update(AccessClaims claims, @PathVariable UUID staffId, @Valid @RequestBody UpdateStaff body) {
        return directory.update(claims.actor(), body.commandId(), staffId, body.expectedVersion(), body.profile(),
                body.reason(), body.password());
    }

    @PostMapping("/api/admin/v1/staff/{staffId}/suspend")
    StaffMember suspend(AccessClaims claims, @PathVariable UUID staffId, @Valid @RequestBody ChangeStaff body) {
        return directory.suspend(claims.actor(), body.commandId(), staffId, body.expectedVersion(), body.reason());
    }

    @PostMapping("/api/admin/v1/staff/{staffId}/restore")
    StaffMember restore(AccessClaims claims, @PathVariable UUID staffId, @Valid @RequestBody ChangeStaff body) {
        return directory.restore(claims.actor(), body.commandId(), staffId, body.expectedVersion(), body.reason());
    }

    @PostMapping("/api/admin/v1/staff/{staffId}/reset-password")
    StaffMember resetPassword(AccessClaims claims, @PathVariable UUID staffId, @Valid @RequestBody ResetPassword body) {
        return directory.resetPassword(claims.actor(), body.commandId(), staffId, body.expectedVersion(),
                body.temporaryPassword(), body.reason(), body.password());
    }
}
