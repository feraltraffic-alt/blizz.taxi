-- Staff correct the fault of a cancelled order (ADR 0019 point 4): taking the operator's fault off gives the
-- penalty back as an entry of its own.
alter table operator_bonus_entry drop constraint operator_bonus_entry_kind_check;
alter table operator_bonus_entry add constraint operator_bonus_entry_kind_check
    check (kind in ('FULFILLED', 'OPERATOR_FAULT_CANCELLATION', 'OPERATOR_FAULT_REVERSED'));
