-- Phone change by the rider or driver (REQ-AUTH-08): a code to the current phone (PHONE_CHANGE) and one to the new
-- phone (NEW_PHONE). A NEW_PHONE code is bound to the account that asked for it.
alter table otp_challenge drop constraint otp_challenge_purpose_check;
alter table otp_challenge add constraint otp_challenge_purpose_check
    check (purpose in ('SIGN_IN', 'ACCOUNT_DELETION', 'DATA_EXPORT', 'PHONE_CHANGE', 'NEW_PHONE'));
alter table otp_challenge add column subject_id uuid;
alter table otp_challenge add constraint otp_challenge_new_phone_subject_check
    check (purpose <> 'NEW_PHONE' or subject_id is not null);
