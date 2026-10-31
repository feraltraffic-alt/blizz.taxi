-- A final fare's correction (issue #142, REQ-ADM-03, REQ-PRC-10): a new version linked to the one it corrects, with
-- the reason and the staff member; version 1 is the trip's own and has none of them. Rows stay immutable.
alter table final_fare add column corrects_id uuid references final_fare (id);
alter table final_fare add column reason text check (reason is null or length(trim(reason)) between 1 and 500);
alter table final_fare add column created_by uuid;
alter table final_fare add constraint final_fare_correction_check
    check ((version = 1) = (corrects_id is null) and (corrects_id is null) = (created_by is null)
           and (corrects_id is null) = (reason is null));

-- The journal of one order, whatever the kind of posting (open debt and refund obligation of a correction).
create index journal_transaction_basis_id_idx on journal_transaction (basis_id);
