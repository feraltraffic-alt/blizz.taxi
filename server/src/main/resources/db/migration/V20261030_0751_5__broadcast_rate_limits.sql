-- Budgets for the ALL tab (issue #102, threat model B1): claims and polling, per driver.
alter table rate_limit_hit drop constraint rate_limit_hit_bucket_check;
alter table rate_limit_hit add constraint rate_limit_hit_bucket_check
    check (bucket in ('quote', 'order', 'offer-accept', 'file-upload', 'broadcast-claim', 'broadcast-list'));
