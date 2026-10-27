-- In-city and out-of-city rates and zone surcharges per tariff (owner decision 27.10.2026).
-- Existing tariffs get the same rates outside the city and no zone surcharges, so their prices do not change.
alter table tariff_version disable trigger tariff_version_immutable;

alter table tariff_version add column pickup_outside_minor bigint check (pickup_outside_minor >= 0);
alter table tariff_version add column per_km_outside_minor numeric
    check (per_km_outside_minor >= 0 and per_km_outside_minor < 'Infinity'::numeric);
-- [{zone_id, mode FIXED|COEFFICIENT, amount_minor, coefficient, on_pickup, on_dropoff}]
alter table tariff_version add column zone_surcharges jsonb not null default '[]'
    check (jsonb_typeof(zone_surcharges) = 'array');
update tariff_version set pickup_outside_minor = pickup_minor, per_km_outside_minor = per_km_minor;
alter table tariff_version alter column pickup_outside_minor set not null;
alter table tariff_version alter column per_km_outside_minor set not null;
alter table tariff_version alter column zone_surcharges drop default;

alter table tariff_version enable trigger tariff_version_immutable;
