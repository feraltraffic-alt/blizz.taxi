-- Idempotency of commands (REQ-API-04, REQ-API-05). Receipts live as long as the objects they
-- created, so there is deliberately no TTL.
create table command_receipt (
    scope        text        not null,
    command_id   uuid        not null,
    request_hash bytea       not null,
    outcome      jsonb,
    created_at   timestamptz not null,
    completed_at timestamptz,
    primary key (scope, command_id)
);
