-- REQ-PAY-18 (issue #140): a card top-up can repay the rider's debt on one order instead of crediting the bonus
-- account. The order is the obligation; at most one open payment page per obligation is enforced under the order's
-- lock by the code (the page's own expiry decides "open", which an index cannot).
alter table card_top_up add column obligation_order_id uuid;

create index card_top_up_obligation_idx on card_top_up (obligation_order_id, created_at desc)
    where obligation_order_id is not null;
