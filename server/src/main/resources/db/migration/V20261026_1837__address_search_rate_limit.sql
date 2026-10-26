-- Per-rider address-search requests owned by geo (REQ-SEC-03).
-- No foreign key to identity.client: module ownership keeps this table self-contained.
create table address_search_request (
    rider_id uuid not null,
    requested_at timestamptz not null
);

create index address_search_request_rider_time_idx
    on address_search_request (rider_id, requested_at);
