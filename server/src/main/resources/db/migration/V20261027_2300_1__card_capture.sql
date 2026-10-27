-- Card payments, part C (ADR 0008): what the trip finally costs. The hold is taken up to this amount; the rest is
-- charged to the saved card; what could not be charged stays the rider's debt (REQ-PAY-05, REQ-PAY-18).
alter table payment_intent add column capture_minor bigint check (capture_minor >= 0);
