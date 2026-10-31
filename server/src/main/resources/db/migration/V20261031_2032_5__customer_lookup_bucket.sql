-- Issue #176, part A: the operator's customer lookup has its own rate-limit bucket, counted per staff member.
alter table rate_limit_hit drop constraint rate_limit_hit_bucket_check;
alter table rate_limit_hit add constraint rate_limit_hit_bucket_check
    check (bucket in ('quote', 'order', 'offer-accept', 'file-upload', 'broadcast-claim', 'broadcast-list',
                      'customer-lookup'));
