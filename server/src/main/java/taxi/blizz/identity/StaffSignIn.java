package taxi.blizz.identity;

import taxi.blizz.platform.Actor;

/**
 * Sign in of staff by login and password into the admin panel or the operator workstation. Wrong login
 * and wrong password look the same; after too many failures the account is locked for a while. Until the
 * initial or temporary password is changed, the token works only for changing it.
 */
public interface StaffSignIn {

    record Result(IssuedSession session, boolean passwordChangeRequired) {
    }

    /**
     * {@code audience} is {@link ApiAudience#ADMIN} or {@link ApiAudience#OPERATOR}. Every attempt goes to the
     * staff activity log with {@code clientIp}.
     */
    Result signIn(String login, String password, ApiAudience audience, String deviceRef, String clientIp);

    void changePassword(Actor staff, String currentPassword, String newPassword);
}
