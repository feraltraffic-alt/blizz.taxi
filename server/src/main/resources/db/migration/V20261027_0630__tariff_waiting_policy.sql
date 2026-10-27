-- Paid waiting is configured per tariff by the admin (Q-07): counting step and rounding of started steps.
-- Existing rows get "every started minute"; new drafts must state both explicitly.
alter table tariff_version add column waiting_step_seconds int not null default 60
    check (waiting_step_seconds between 1 and 3600);
alter table tariff_version add column waiting_rounding text not null default 'UP'
    check (waiting_rounding in ('UP', 'DOWN', 'HALF_UP'));
alter table tariff_version alter column waiting_step_seconds drop default;
alter table tariff_version alter column waiting_rounding drop default;
