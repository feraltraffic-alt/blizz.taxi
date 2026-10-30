-- NEGATIVE CONTROL, never merged (issue #146): an upgrade that changes a settled fact. The Upgrade workflow must fail.
update ride_order set final_price_minor = final_price_minor + 1
where id = (select id from ride_order where status = 'FULFILLED' order by created_at limit 1);
