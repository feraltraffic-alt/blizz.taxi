package taxi.blizz.operations.internal;

import java.util.UUID;
import org.springframework.stereotype.Service;
import taxi.blizz.driver.DriverAccounts;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.driver.DriverProfile;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.DriverBlocks;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

/** Blocking a driver account and stopping the driver's new work in one transaction (issue #141). */
@Service
class JdbcDriverBlocks implements DriverBlocks {

    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final DriverAccounts accounts;
    private final DriverAdmission admission;

    JdbcDriverBlocks(IdempotentCommands commands, StaffAccess staff, DriverAccounts accounts,
                     DriverAdmission admission) {
        this.commands = commands;
        this.staff = staff;
        this.accounts = accounts;
        this.admission = admission;
    }

    record Change(UUID driverId, long expectedVersion, String reason) {
    }

    @Override
    public DriverProfile block(Actor staffMember, UUID commandId, UUID driverId, long expectedVersion,
                               String reason) {
        staff.require(staffMember, DriverAdmission.REVIEW_PERMISSION);
        requireReason(reason);
        return commands.execute(new CommandKey(staffMember, "driver.block", commandId),
                new Change(driverId, expectedVersion, reason), DriverProfile.class, () -> {
                    accounts.block(staffMember, driverId, expectedVersion, reason);
                    return admission.profile(driverId);
                });
    }

    @Override
    public DriverProfile unblock(Actor staffMember, UUID commandId, UUID driverId, long expectedVersion,
                                 String reason) {
        staff.require(staffMember, DriverAdmission.REVIEW_PERMISSION);
        requireReason(reason);
        return commands.execute(new CommandKey(staffMember, "driver.unblock", commandId),
                new Change(driverId, expectedVersion, reason), DriverProfile.class, () -> {
                    accounts.unblock(staffMember, driverId, expectedVersion, reason);
                    return admission.profile(driverId);
                });
    }

    private static void requireReason(String reason) {
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
    }
}
