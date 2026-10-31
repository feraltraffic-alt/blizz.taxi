-- L1 load test (issue #146 part 3): drivers and riders of the sandbox's Kyiv, each with an open device session, so
-- the load does not go through OTP (its global budget is 2000 codes an hour). Run with psql -v drivers=N -v riders=M.
-- Ids are derived from the number, so a second run finds the same rows; positions are forgotten so the speed check
-- does not compare with an earlier run.
\set kyiv '\'5a000000-0000-4000-8000-000000000001\''

insert into driver (id, phone_normalized, name, language, account_state, review_status, created_at, updated_at)
select md5('load-driver-' || n)::uuid, '+38050' || lpad((1000000 + n)::text, 7, '0'), 'Load driver ' || n, 'uk',
       'ACTIVE', 'APPROVED', now(), now()
from generate_series(1, :drivers) n
on conflict (id) do nothing;

insert into driver_admission_city (driver_id, city_id, granted_by, granted_at)
select md5('load-driver-' || n)::uuid, :kyiv, null, now() from generate_series(1, :drivers) n
on conflict do nothing;

insert into vehicle (id, driver_id, registration_number, make, model, color, production_year, state, class_approvals,
                     created_at, updated_at)
select md5('load-vehicle-' || n)::uuid, md5('load-driver-' || n)::uuid, 'LD' || lpad(n::text, 5, '0'), 'Skoda',
       'Octavia', 'white', 2021, 'APPROVED', '{STANDARD,COMFORT}', now(), now()
from generate_series(1, :drivers) n
on conflict (id) do nothing;

insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
select md5('load-rider-' || n)::uuid, '+38063' || lpad((1000000 + n)::text, 7, '0'), 'ACTIVE', true, now(), now()
from generate_series(1, :riders) n
on conflict (id) do nothing;

insert into device_session (id, subject_type, subject_id, audience, device_ref, created_at, last_refreshed_at,
                            expires_at)
select md5('load-session-driver-' || n)::uuid, 'DRIVER', md5('load-driver-' || n)::uuid, 'driver', 'load-' || n,
       now(), now(), now() + interval '1 day'
from generate_series(1, :drivers) n
union all
select md5('load-session-rider-' || n)::uuid, 'CLIENT', md5('load-rider-' || n)::uuid, 'rider', 'load-' || n,
       now(), now(), now() + interval '1 day'
from generate_series(1, :riders) n
on conflict (id) do update set expires_at = excluded.expires_at, revoked_at = null;

delete from driver_last_position where driver_id in (select md5('load-driver-' || n)::uuid
                                                     from generate_series(1, :drivers) n);
