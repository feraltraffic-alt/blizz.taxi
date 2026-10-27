package taxi.blizz.identity;

/**
 * What a one-time code is for. A code of one purpose never serves another: a sign-in code cannot confirm an account
 * deletion, and a confirmation code cannot sign anybody in (issue #56).
 */
public enum OtpPurpose {
    /** Sign in (or sign up) by phone: {@link OtpService#verify}. */
    SIGN_IN,
    /** The signed-in rider confirms the request to delete the account: {@link OtpService#confirm}. */
    ACCOUNT_DELETION
}
