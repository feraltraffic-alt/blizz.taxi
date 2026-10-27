-- Ratings after a fulfilled trip (REQ-RID-08). History is append-only: an edit supersedes the
-- previous row instead of overwriting its score/comment.
create table rating (
    id             uuid primary key,
    order_id       uuid        not null references ride_order (id),
    author_type    text        not null check (author_type in ('RIDER', 'DRIVER')),
    author_id      uuid        not null,
    target_type    text        not null check (target_type in ('RIDER', 'DRIVER')),
    target_id      uuid        not null,
    score          smallint    not null check (score between 1 and 5),
    comment        text        check (comment is null or char_length(comment) <= 500),
    created_at     timestamptz not null,
    superseded_at  timestamptz,
    check (author_type <> target_type)
);

create unique index rating_active_author_order_uq
    on rating (order_id, author_type, author_id)
    where superseded_at is null;

create index rating_active_target_idx
    on rating (target_type, target_id)
    where superseded_at is null;

create index rating_order_idx on rating (order_id, created_at);
