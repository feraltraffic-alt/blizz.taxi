alter table file_object add column retention_attempts integer not null default 0;
alter table call_recording add column retention_attempts integer not null default 0;
