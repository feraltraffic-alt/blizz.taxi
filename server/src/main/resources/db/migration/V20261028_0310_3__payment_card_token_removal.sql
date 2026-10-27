-- An anonymized rider's saved cards lose their provider tokens (issue #56, REQ-PRV-04): the card rows stay as
-- REMOVED for the payment history (holds and bindings refer to them), the token is cleared.
alter table payment_card alter column token drop not null;
alter table payment_card add constraint payment_card_active_has_token check (state <> 'ACTIVE' or token is not null);
