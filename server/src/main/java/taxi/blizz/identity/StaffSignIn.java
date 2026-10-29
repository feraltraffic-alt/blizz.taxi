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

    /**
     * The staff member's own new password. Every other session of the account ends (threat model A5): whoever knew
     * the old password is signed out; {@code keepSessionId}, the session making the change, stays.
     */
    void changePassword(Actor staff, java.util.UUID keepSessionId, String currentPassword, String newPassword);

    /**
     * Asks for the password again before a sensitive change, e.g. keys of integrations (REQ-ADM-10). A wrong password
     * counts like a failed sign-in and fails with {@code ACCESS_DENIED}. Call it outside a transaction.
     */
    void confirmPassword(Actor staff, String password);
}
