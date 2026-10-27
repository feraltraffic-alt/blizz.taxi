-- Surcharge for pre-orders per tariff (ADR 0006): {mode FIXED|COEFFICIENT, amount_minor, coefficient}; null = none.
alter table tariff_version add column preorder_surcharge jsonb
    check (preorder_surcharge is null or jsonb_typeof(preorder_surcharge) = 'object');
