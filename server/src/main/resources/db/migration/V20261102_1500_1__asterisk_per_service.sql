-- Each taxi service's own Asterisk (ADR 0016, owner decision 02.11.2026, issue #275).
-- A call line and a call belong to the service whose exchange carries them; what exists is the first service's,
-- or the service of the line's city. The default stays for old writers; the server names the service on every insert
-- (ServiceColumnGuardTests).
alter table call_line add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
update call_line l set service_id = c.service_id from city c where c.id = l.city_id;
create index call_line_service_idx on call_line (service_id);

alter table call add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
update call k set service_id = c.service_id from city c where c.id = k.city_id;

-- Two exchanges number their channels independently: a channel id is unique within its service only.
alter table call drop constraint call_channel_id_key;
alter table call add constraint call_service_channel_key unique (service_id, channel_id);

-- An operator's extension is a number on their service's exchange: "101" may be in use in two services.
alter table staff_extension add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
update staff_extension e set service_id = s.service_id from staff_user s where s.id = e.staff_id;
alter table staff_extension drop constraint staff_extension_extension_key;
alter table staff_extension add constraint staff_extension_service_extension_key unique (service_id, extension);
