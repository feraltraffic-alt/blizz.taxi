-- A wholly bonus-paid card order still retains its chosen card for tips (ADR 0012 p. 4).
-- Its zero card obligation is already PAID; there is no AUTH operation and no hold at the provider.
alter table payment_intent drop constraint payment_intent_hold_minor_check;
alter table payment_intent add constraint payment_intent_hold_minor_check
    check (hold_minor > 0 or (hold_minor = 0 and state = 'PAID'));

-- Nullable for older orders whose original bonus-paid choice was not retained.
alter table ride_order add column selected_payment_method text
    check (selected_payment_method in ('CASH', 'CARD', 'TERMINAL', 'SERVICE'));
