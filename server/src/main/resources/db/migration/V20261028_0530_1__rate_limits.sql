-- Budgets per rider or driver for quotes, orders, accepting offers and uploads (REQ-SEC-03, issue #72). Owned by
-- platform. Only the hits inside the window are kept; older ones are removed when the subject acts again.
create table rate_limit_hit (
    bucket     text        not null check (bucket in ('quote', 'order', 'offer-accept', 'file-upload')),
    subject_id uuid        not null,
    at         timestamptz not null
);
create index rate_limit_hit_idx on rate_limit_hit (bucket, subject_id, at);
