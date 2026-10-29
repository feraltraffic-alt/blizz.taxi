-- "Every N-th trip" (audit 29.10.2026, #112): a quote names the cycle it counts on (the rider's N-th trip is cycle 1,
-- the 2N-th cycle 2, …), and the order that takes the quote claims that cycle. One order per promotion, rider and
-- cycle: a rider one trip short cannot open several orders and get the promotion on each.
alter table promotion_quote add column nth_cycle int check (nth_cycle > 0);

-- Released (deleted) when the order ends without a trip; kept when the trip is completed.
create table promotion_nth_claim (
    promotion_id uuid        not null references rider_promotion (id),
    client_id    uuid        not null,
    cycle        int         not null check (cycle > 0),
    order_id     uuid        not null,
    quote_id     uuid        not null,
    claimed_at   timestamptz not null,
    primary key (promotion_id, client_id, cycle)
);
create index promotion_nth_claim_order_idx on promotion_nth_claim (order_id);
