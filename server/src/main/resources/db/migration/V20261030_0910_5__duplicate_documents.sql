-- The same document photo at two drivers (issue #105, threat model D2).

-- files: the lookup of SAFE files with the same content, bounded by the index.
create index file_object_same_content_idx on file_object (purpose, sha256) where state = 'SAFE';

-- driver: from those file ids back to the documents of other drivers.
create index driver_document_file_idx on driver_document (file_id);

-- operations: a DUPLICATE_DOCUMENT flag belongs to no city (an applicant has none); every other kind keeps its city.
alter table driver_risk_flag drop constraint driver_risk_flag_kind_check;
alter table driver_risk_flag add constraint driver_risk_flag_kind_check
    check (kind in ('IMPOSSIBLE_MOVEMENT', 'MANUAL', 'CASH_DISPUTE', 'DUPLICATE_DOCUMENT'));
alter table driver_risk_flag alter column city_id drop not null;
alter table driver_risk_flag add constraint driver_risk_flag_city_check
    check (city_id is not null or kind = 'DUPLICATE_DOCUMENT');

-- files: the quarantine gauge reads only the files waiting for their checks.
create index file_object_quarantine_idx on file_object (created_at) where state = 'QUARANTINE';
