-- Drivers chosen by pickup time (owner decision 05.11.2026, ADR 0020).

-- The pickup time an offer was made with, and where it came from: the service's router or the straight line.
alter table offer add column pickup_eta_seconds int check (pickup_eta_seconds >= 0);
alter table offer add column pickup_eta_source text check (pickup_eta_source in ('ROUTER', 'STRAIGHT_LINE'));
alter table offer add constraint offer_pickup_eta_check check ((pickup_eta_seconds is null) = (pickup_eta_source is null));

-- The promised pickup: the acceptance plus the router's pickup time of the accepted offer (ADR 0019 lateness).
alter table assignment add column promised_pickup_at timestamptz;
