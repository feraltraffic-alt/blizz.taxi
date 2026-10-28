-- Call centre telephony, part 2 (issue #67, REQ-OPS-08): outgoing calls from an order, the staff's extensions and the
-- operators' status. Owned by telephony; staff ids belong to identity, order ids to operations: no foreign keys
-- (ADR 0004).

-- Outgoing calls (click-to-call): DIALING while the server asks Asterisk, FAILED when Asterisk could not be reached.
-- No number is stored for them (REQ-PRV-03): the party says whom, the order says whose.
alter table call drop constraint call_state_check;
alter table call add constraint call_state_check
    check (state in ('DIALING', 'RINGING', 'ANSWERED', 'ENDED', 'MISSED', 'FAILED'));
alter table call drop constraint call_ended_reason_check;
alter table call add constraint call_ended_reason_check
    check (ended_reason is null or ended_reason in ('HANGUP', 'LOST', 'FAILED'));
alter table call alter column called_number drop not null;
alter table call add column direction text not null default 'INBOUND' check (direction in ('INBOUND', 'OUTBOUND'));
alter table call add column party text check (party in ('RIDER', 'DRIVER', 'CALLER'));
alter table call add column order_id uuid;
alter table call add constraint call_outbound_check check (
    (direction = 'OUTBOUND') = (party is not null and order_id is not null)
    and (direction = 'INBOUND' or (caller_phone is null and caller_raw is null and called_number is null)));
alter table call add constraint call_inbound_number_check check (direction = 'OUTBOUND' or called_number is not null);
create index call_order_id_idx on call (order_id) where order_id is not null;
drop index call_open_idx;
create index call_open_idx on call (started_at) where state in ('DIALING', 'RINGING', 'ANSWERED');

-- A staff member's internal number on the service's Asterisk; one extension — one staff member.
create table staff_extension (
    staff_id   uuid primary key,
    extension  text        not null unique check (extension ~ '^[0-9]{2,6}$'),
    version    bigint      not null default 1,
    updated_at timestamptz not null
);

-- The operator's own status for incoming calls; OFFLINE when there is no row.
create table operator_status (
    staff_id   uuid primary key,
    status     text        not null check (status in ('AVAILABLE', 'BREAK', 'OFFLINE')),
    changed_at timestamptz not null,
    version    bigint      not null default 1
);
