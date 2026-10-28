-- Late operator-bonus events are attributed to the closed period they belong to (issue #91, point 4).
alter table operator_bonus_entry add column period_key date;
create index operator_bonus_entry_period_idx on operator_bonus_entry(staff_id, period_key);
