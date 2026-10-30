-- Q-19: policy versions are never part of technical-data cleanup.
create table retention_settings (
    version bigint primary key check(version>0),
    days jsonb not null check(jsonb_typeof(days)='object'),
    changed_by uuid not null,
    reason text not null check(length(trim(reason))>0),
    changed_at timestamptz not null
);

-- Identity owns both tables: materialize the first expiry/revocation instant for indexed token cleanup.
alter table refresh_token add column inactive_at timestamptz;
update refresh_token t set inactive_at=least(t.expires_at,s.revoked_at)
    from device_session s where s.id=t.session_id;
alter table refresh_token alter column inactive_at set not null;
create function refresh_token_inactive_time() returns trigger language plpgsql as $$
declare revoked timestamptz;
begin
    -- Serialize a token insert with session revocation, including inserts from another transaction.
    select revoked_at into revoked from device_session where id=new.session_id for share;
    new.inactive_at=least(new.expires_at,revoked);
    return new;
end $$;
create trigger refresh_token_inactive_time before insert or update of expires_at,session_id on refresh_token
    for each row execute function refresh_token_inactive_time();
create function session_revoked_tokens() returns trigger language plpgsql as $$
begin
    update refresh_token set inactive_at=least(expires_at,new.revoked_at)
        where session_id=new.id and inactive_at is distinct from least(expires_at,new.revoked_at);
    return new;
end $$;
create trigger session_revoked_tokens after update of revoked_at on device_session
    for each row when(old.revoked_at is distinct from new.revoked_at) execute function session_revoked_tokens();
create index refresh_token_retention_idx on refresh_token(inactive_at,token_hash);
create index otp_challenge_retention_idx on otp_challenge(created_at,id);
create index otp_delivery_retention_idx on otp_delivery(attempted_at,id);
create index outbox_retention_idx on outbox(completed_at,event_id) where state='DONE';
create index consumer_inbox_retention_idx on consumer_inbox(completed_at,consumer_id,event_id);
create index command_receipt_retention_idx on command_receipt(completed_at,scope,command_id) where completed_at is not null;

-- Files own this marker and all runtime cleanup reads. Migration-only references are authorized in ADR 0004.
alter table file_object add column attached_at timestamptz;
alter table file_object add column quarantine_at timestamptz;
alter table file_object add column retention_claim uuid;
alter table file_object add column retention_until timestamptz;
update file_object set quarantine_at=coalesce(uploaded_at,created_at) where state='QUARANTINE';
-- BEGIN HISTORICAL ATTACHMENT BACKFILL (negative-control test removes only this block).
update file_object f set attached_at=coalesce(f.uploaded_at,f.created_at)
from (
    select file_id from driver_document where file_id is not null
    union select file_id from support_message_attachment
    union select file_id from call_recording where file_id is not null
) refs where refs.file_id=f.id;
-- END HISTORICAL ATTACHMENT BACKFILL
create index file_upload_retention_idx on file_object(coalesce(uploaded_at,scanned_at,upload_expires_at),id)
    where attached_at is null and purpose<>'CALL_RECORDING' and state in ('AWAITING_UPLOAD','SAFE','REJECTED');
create index file_quarantine_retention_idx on file_object(coalesce(quarantine_at,uploaded_at,created_at),id)
    where attached_at is null and purpose<>'CALL_RECORDING' and state='QUARANTINE';
create index file_recording_retention_idx on file_object(coalesce(uploaded_at,scanned_at,created_at),id)
    where attached_at is null and purpose='CALL_RECORDING';

-- A fetching worker and a deleting worker never work on the same recording simultaneously.
alter table call_recording add column fetching_until timestamptz;
alter table call_recording add column retention_claim uuid;
alter table call_recording add column retention_until timestamptz;
create index call_recording_retention_idx on call_recording(created_at,call_id);
