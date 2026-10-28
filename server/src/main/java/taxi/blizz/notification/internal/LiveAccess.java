package taxi.blizz.notification.internal;

import org.springframework.stereotype.Component;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.telephony.Calls;

/**
 * Who may hold a live connection beyond a valid session: operators only while they take calls in some city. Checked
 * at the handshake and again by {@link LiveSessions#recheck}, so a right taken away ends the connection within
 * seconds, not when the token expires (REQ-NTF-05).
 */
@Component
class LiveAccess {

    private final StaffAccess staff;

    LiveAccess(StaffAccess staff) {
        this.staff = staff;
    }

    boolean allowed(AccessClaims claims) {
        if (claims.audience() != ApiAudience.OPERATOR) {
            return true;
        }
        StaffAccess.Scope scope = staff.scope(claims.actor(), Calls.ANSWER_PERMISSION);
        return scope.allCities() || !scope.cityIds().isEmpty();
    }
}
