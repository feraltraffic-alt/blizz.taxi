-- The city of a card payment, so staff access to its operations is checked against the order's city (audit
-- 29.10.2026; threat model I1). The intent is made for a city's merchant, which payments already knows.
alter table payment_intent add column city_id uuid;

-- One-off backfill of the intents made before: the order's city, read once here (ADR 0004 is about the code).
update payment_intent i set city_id = o.city_id from ride_order o where o.id = i.order_id and i.city_id is null;
