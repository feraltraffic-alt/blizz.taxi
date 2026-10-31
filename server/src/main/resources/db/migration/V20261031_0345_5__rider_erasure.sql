-- The rider's deletion reaches every copy (issue #144, REQ-PRV-04, REQ-PRV-06).

-- What a deletion left in place because a legal basis needs it (operations). Today only an open chargeback holds the
-- order it disputes: its labels, points, contact and chat stay until the chargeback is decided, then the sweep
-- finishes the anonymization and releases the hold.
create table privacy_hold (
    id          uuid primary key,
    subject_type text not null check (subject_type in ('CLIENT')),
    subject_id  uuid not null,
    object_type text not null check (object_type in ('ORDER', 'ORDER_CONTACT')),
    object_id   uuid not null,
    basis       text not null check (basis in ('CHARGEBACK')),
    created_at  timestamptz not null,
    released_at timestamptz
);
create unique index privacy_hold_open_key on privacy_hold (subject_id, object_type, object_id, basis)
    where released_at is null;
create index privacy_hold_open_idx on privacy_hold (created_at, id) where released_at is null;

-- A file whose owner asked for it to go (files): deleted from storage, then its row, by the erasure sweep.
alter table file_object add column erase_requested_at timestamptz;
create index file_object_erase_idx on file_object (erase_requested_at, id) where erase_requested_at is not null;

-- A recording of a deleted rider's call (telephony): discarded on Asterisk and deleted whatever the retention term.
alter table call_recording add column erase_requested_at timestamptz;
create index call_recording_erase_idx on call_recording (erase_requested_at, call_id)
    where erase_requested_at is not null;

-- What a deletion looks up by the rider (bounded queries): calls from the phone, sessions, quotes and notifications
-- of the rider, and the receipts of the rider's commands by their scope prefix ('CLIENT:<id>:').
create index call_caller_phone_idx on call (caller_phone) where caller_phone is not null;
create index quote_owner_idx on quote (owner_type, owner_id);
create index device_session_subject_idx on device_session (subject_type, subject_id);
create index notification_recipient_idx on notification (recipient_type, recipient_id);
create index command_receipt_scope_pattern_idx on command_receipt (scope text_pattern_ops);

-- Chat and support messages stay append-only, with one exception: a deletion replaces the text with '[deleted]'
-- (an attachment loses its name) and changes nothing else. Rows are never deleted.
create or replace function order_message_is_append_only() returns trigger language plpgsql as $$
begin
    if tg_op = 'UPDATE' and new.body = '[deleted]' and to_jsonb(new) - 'body' = to_jsonb(old) - 'body' then
        return new;
    end if;
    raise exception 'Chat messages are append-only' using errcode = '23514';
end $$;

create or replace function support_message_is_append_only() returns trigger language plpgsql as $$
begin
    if tg_op = 'UPDATE' and new.body = '[deleted]' and to_jsonb(new) - 'body' = to_jsonb(old) - 'body' then
        return new;
    end if;
    raise exception 'Support messages are append-only' using errcode = '23514';
end $$;

create function support_attachment_is_append_only() returns trigger language plpgsql as $$
begin
    if tg_op = 'UPDATE' and new.name is null and to_jsonb(new) - 'name' = to_jsonb(old) - 'name' then
        return new;
    end if;
    raise exception 'Support messages are append-only' using errcode = '23514';
end $$;
drop trigger support_message_attachment_append_only on support_message_attachment;
create trigger support_message_attachment_append_only before update or delete on support_message_attachment
    for each row execute function support_attachment_is_append_only();
