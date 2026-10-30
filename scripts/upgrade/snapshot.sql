-- What an upgrade must keep (AC-20), as of :'cutoff' (taken before the upgrade): finished trips and orders, every
-- account's totals in the journal, clients and drivers. Only what nothing changes any more, so the background jobs of
-- the new version cannot change the answer. One line per fact, sorted, so two snapshots compare with diff.
-- psql -v cutoff='2026-10-30T12:00:00Z' -f snapshot.sql
select 'trips ' || phase || ' ' || count(*) from trip
where phase in ('COMPLETED', 'ABORTED') and created_at < :'cutoff' group by phase
union all
select 'orders ' || status || ' ' || count(*) || ' final price ' || coalesce(sum(final_price_minor), 0) from ride_order
where status in ('FULFILLED', 'CANCELLED', 'UNFULFILLED') and created_at < :'cutoff' group by status
union all
select 'journal ' || l.account || ' ' || t.currency || ' debit ' || sum(l.debit_minor) || ' credit ' || sum(l.credit_minor)
from journal_line l join journal_transaction t on t.id = l.transaction_id
where t.occurred_at < :'cutoff' group by l.account, t.currency
union all
select 'journal transactions ' || count(*) from journal_transaction where occurred_at < :'cutoff'
union all
select 'clients ' || count(*) from client where created_at < :'cutoff'
union all
select 'drivers ' || review_status || ' ' || count(*) from driver where created_at < :'cutoff' group by review_status
order by 1;
