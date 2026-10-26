-- Per-IP and per-device limits for code requests (REQ-AUTH-04, REQ-SEC-03).
alter table otp_challenge add column client_ip text;
create index otp_challenge_ip_idx on otp_challenge (client_ip, created_at) where client_ip is not null;
create index otp_challenge_device_idx on otp_challenge (device_ref, created_at) where device_ref is not null;
