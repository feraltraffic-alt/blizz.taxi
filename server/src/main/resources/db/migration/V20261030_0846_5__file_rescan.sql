-- Files kept in quarantine while the antivirus could not answer, scanned again with back-off (issue #105, D1).
alter table file_object add column scan_attempts int not null default 0;
alter table file_object add column next_scan_at timestamptz;
-- Bounded read of the rescan job: only quarantined files that wait for another attempt.
create index file_object_rescan_idx on file_object (next_scan_at, id) where state = 'QUARANTINE';
