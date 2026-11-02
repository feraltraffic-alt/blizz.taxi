-- Retention per taxi service, part 2 (ADR 0016, #276): a code delivery and a file belong to a service, whose term
-- applies to them. What exists gets the service of its challenge, owner or call; anything else the first service's.
-- No index of its own: cleanup walks the existing age indexes and filters by service (few services, and the measured
-- plans of AuditHotPathVolumeTests and RetentionVolumeTests stay as they are).
alter table otp_delivery add column service_id uuid not null
    default '5e000000-0000-4000-8000-000000000001' references service (id);
update otp_delivery d set service_id = c.service_id from otp_challenge c where c.id = d.challenge_id;

alter table file_object add column service_id uuid not null
    default '5e000000-0000-4000-8000-000000000001' references service (id);
update file_object f set service_id = s.service_id from staff_user s
where f.owner_type = 'STAFF' and s.id = f.owner_id;
update file_object f set service_id = c.service_id from client c
where f.owner_type = 'CLIENT' and c.id = f.owner_id;
update file_object f set service_id = d.service_id from driver d
where f.owner_type = 'DRIVER' and d.id = f.owner_id;
update file_object f set service_id = k.service_id from call_recording r join call k on k.id = r.call_id
where f.owner_type = 'SYSTEM' and r.file_id = f.id;
