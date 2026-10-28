-- Merchant key rotation (REQ-SEC-09): after a new key is entered, the provider's notifications signed with the
-- previous one are still accepted until this moment; the previous key itself is kept encrypted in Integrations.
alter table payment_merchant add column previous_secret_until timestamptz;
