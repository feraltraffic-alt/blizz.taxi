-- The quote an order consumed (REQ-PRC-06): one quote, one order.
alter table ride_order add column quote_id uuid references quote(id);
create unique index ride_order_quote_uq on ride_order(quote_id) where quote_id is not null;
