-- Support-message attachments are owned by backoffice; file_object remains owned by files.
alter table file_object drop constraint file_object_purpose_check;
alter table file_object add constraint file_object_purpose_check
    check (purpose in ('DRIVER_DOCUMENT', 'SUPPORT_ATTACHMENT'));

create table support_message_attachment (
    message_id   uuid        not null references support_message(id),
    file_id      uuid        not null unique,
    content_type text        not null check (content_type in ('image/jpeg', 'image/png', 'image/webp', 'application/pdf')),
    size_bytes   bigint      not null check (size_bytes between 1 and 10485760),
    name         text        check (name is null or length(name) <= 255),
    created_at   timestamptz not null,
    primary key (message_id, file_id)
);
create index support_message_attachment_message_idx on support_message_attachment (message_id);

create trigger support_message_attachment_append_only before update or delete on support_message_attachment
    for each row execute function support_message_is_append_only();
