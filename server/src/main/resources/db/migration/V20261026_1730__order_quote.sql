-- The quote an order consumed (REQ-PRC-06): one quote, one order. No foreign key: the quote belongs
-- to pricing and is checked and consumed in the same transaction that inserts the order.
alter table ride_order add column quote_id uuid;
create unique index ride_order_quote_uq on ride_order(quote_id) where quote_id is not null;
