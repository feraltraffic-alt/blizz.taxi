package taxi.blizz.backoffice.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.backoffice.SupportCases;
import taxi.blizz.files.FileContent;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.files.StoredFile;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

@Service
class SupportAttachments {

    record Attachment(UUID fileId, String contentType, long sizeBytes, String name) {
    }

    record Message(UUID id, long sequence, String authorType, UUID authorId, SupportCases.Visibility visibility,
                   String body, OffsetDateTime createdAt, List<Attachment> attachments) {
    }

    record Case(UUID id, long number, UUID cityId, SupportCases.Category category, UUID orderId, String requesterType,
                UUID requesterId, String subject, SupportCases.Priority priority, SupportCases.State state,
                UUID assignedStaffId, String resolution, long version, OffsetDateTime createdAt,
                OffsetDateTime updatedAt, OffsetDateTime respondBy, List<Message> messages) {
    }

    private final JdbcClient jdbc;
    private final SupportCases cases;
    private final FileService files;
    private final AuditLog audit;
    private final IdempotentCommands commands;
    private final Clock clock;

    SupportAttachments(JdbcClient jdbc, SupportCases cases, FileService files, AuditLog audit,
                       IdempotentCommands commands, Clock clock) {
        this.jdbc = jdbc;
        this.cases = cases;
        this.files = files;
        this.audit = audit;
        this.commands = commands;
        this.clock = clock;
    }

    /**
     * The attachments are part of the command: a repeat with other files is a conflict, not a way to add files to an
     * old message. The support command inside keeps its own receipt for the text.
     */
    record AttachedCommand(String operation, UUID caseId, List<UUID> attachmentIds) {
    }

    private Case once(Actor actor, String operation, UUID commandId, UUID caseId, List<UUID> attachmentIds,
                      java.util.function.Supplier<SupportCases.Case> command) {
        List<UUID> ids = attachmentIds == null ? List.of() : attachmentIds;
        return commands.execute(new CommandKey(actor, "support.attachments." + operation, commandId),
                new AttachedCommand(operation, caseId, ids), Case.class, () -> {
                    List<StoredFile> attachments = validate(actor, ids);
                    SupportCases.Case result = command.get();
                    attach(actor, lastMessage(result), attachments);
                    return view(result);
                });
    }

    @Transactional
    Case open(Actor requester, UUID commandId, SupportCases.Category category, UUID orderId, String subject,
              String message, List<UUID> attachmentIds) {
        return once(requester, "open", commandId, null, attachmentIds,
                () -> cases.open(requester, commandId, category, orderId, subject, message));
    }

    @Transactional
    Case reply(Actor requester, UUID commandId, UUID caseId, String message, List<UUID> attachmentIds) {
        return once(requester, "reply", commandId, caseId, attachmentIds,
                () -> cases.reply(requester, commandId, caseId, message));
    }

    @Transactional
    Case comment(Actor staff, UUID commandId, UUID caseId, long expectedVersion, SupportCases.Visibility visibility,
                 String body, boolean waitForRequester, List<UUID> attachmentIds) {
        // Access first: a repeat must not hand the stored case to someone who has lost it (AGENTS.md; audit
        // 29.10.2026). get checks support.manage for the case's city.
        cases.get(staff, caseId);
        return once(staff, "comment", commandId, caseId, attachmentIds,
                () -> cases.comment(staff, commandId, caseId, expectedVersion, visibility, body, waitForRequester));
    }

    @Transactional(readOnly = true)
    Case view(SupportCases.Case source) {
        List<Message> messages = source.messages().stream().map(this::message).toList();
        return new Case(source.id(), source.number(), source.cityId(), source.category(), source.orderId(),
                source.requesterType(), source.requesterId(), source.subject(), source.priority(), source.state(),
                source.assignedStaffId(), source.resolution(), source.version(), source.createdAt(), source.updatedAt(),
                source.respondBy(), messages);
    }

    @Transactional(readOnly = true)
    FileContent openForRequester(Actor requester, UUID caseId, UUID fileId) {
        SupportCases.Case supportCase = cases.mineOne(requester, caseId);
        requireVisibleAttachment(supportCase, fileId);
        return files.openAttached(fileId, FilePurpose.SUPPORT_ATTACHMENT);
    }

    @Transactional
    FileContent openForStaff(Actor staff, UUID caseId, UUID fileId) {
        SupportCases.Case supportCase = cases.get(staff, caseId);
        requireVisibleAttachment(supportCase, fileId);
        audit.record(new AuditEntry(staff, "support.attachment.read", "support_case", caseId.toString(), null,
                null, java.util.Map.of("file_id", fileId)));
        return files.openAttached(fileId, FilePurpose.SUPPORT_ATTACHMENT);
    }

    private List<StoredFile> validate(Actor owner, List<UUID> attachmentIds) {
        List<UUID> ids = attachmentIds == null ? List.of() : List.copyOf(attachmentIds);
        if (ids.size() > 5) {
            throw invalid("At most 5 attachments are allowed");
        }
        Set<UUID> unique = new HashSet<>(ids);
        if (unique.size() != ids.size() || unique.contains(null)) {
            throw invalid("Attachment ids must be unique");
        }
        List<StoredFile> result = new ArrayList<>(ids.size());
        for (UUID id : ids) {
            try {
                result.add(files.requireAttachable(owner, id, FilePurpose.SUPPORT_ATTACHMENT));
            } catch (DomainException e) {
                throw invalid("Attachment is not available for this message");
            }
        }
        return List.copyOf(result);
    }

    private void attach(Actor owner, SupportCases.Message message, List<StoredFile> attachments) {
        if (attachments.isEmpty()) {
            return;
        }
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(java.time.ZoneOffset.UTC);
        // Two commands may list the same files in opposite orders; acquire their marker locks consistently.
        attachments.stream().sorted(java.util.Comparator.comparing(StoredFile::fileId))
                .forEach(file -> files.markAttached(owner, file.fileId(), FilePurpose.SUPPORT_ATTACHMENT));
        for (StoredFile file : attachments) {
            UUID existing = jdbc.sql("select message_id from support_message_attachment where file_id = :file")
                    .param("file", file.fileId()).query(UUID.class).optional().orElse(null);
            if (existing != null) {
                if (!existing.equals(message.id())) {
                    throw invalid("An attachment can be used only once");
                }
                continue;
            }
            jdbc.sql("""
                            insert into support_message_attachment
                                (message_id, file_id, content_type, size_bytes, name, created_at)
                            values (:message, :file, :type, :size, null, :now)""")
                    .param("message", message.id()).param("file", file.fileId()).param("type", file.contentType())
                    .param("size", file.sizeBytes()).param("now", now).update();
        }
    }

    private SupportCases.Message lastMessage(SupportCases.Case result) {
        if (result.messages().isEmpty()) {
            throw new IllegalStateException("Support command returned no message");
        }
        return result.messages().getLast();
    }

    private Message message(SupportCases.Message source) {
        List<Attachment> attachments = jdbc.sql("""
                        select file_id, content_type, size_bytes, name
                        from support_message_attachment where message_id = :message order by created_at, file_id""")
                .param("message", source.id())
                .query((rs, i) -> new Attachment(rs.getObject(1, UUID.class), rs.getString(2), rs.getLong(3),
                        rs.getString(4))).list();
        return new Message(source.id(), source.sequence(), source.authorType(), source.authorId(), source.visibility(),
                source.body(), source.createdAt(), attachments);
    }

    private void requireVisibleAttachment(SupportCases.Case supportCase, UUID fileId) {
        boolean visible = supportCase.messages().stream().map(SupportCases.Message::id).anyMatch(messageId ->
                jdbc.sql("select exists(select 1 from support_message_attachment where message_id = :message and file_id = :file)")
                        .param("message", messageId).param("file", fileId).query(Boolean.class).single());
        if (!visible) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Attachment not found");
        }
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }
}
