-- The rider's or operator's note for the driver and where exactly to come (REQ-DRV-07, issue #143).
alter table ride_order
    add column comment  text check (char_length(comment) <= 500),
    add column entrance text check (char_length(entrance) <= 100);

-- The manual offer has its own permission, orders.offer (REQ-OPS-04, issue #143). Whoever may take a driver off an
-- order today gets it too, so no dispatcher loses the action at the deploy (answer of the lead on the plan).
-- Emergency grants are not changed: they cannot be edited and end within hours.
update staff_user
set permissions = array_append(permissions, 'orders.offer'), updated_at = now()
where 'orders.reassign' = any(permissions) and not ('orders.offer' = any(permissions));
