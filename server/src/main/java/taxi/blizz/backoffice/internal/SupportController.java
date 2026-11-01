package taxi.blizz.backoffice.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.backoffice.SupportCases;
import taxi.blizz.backoffice.SupportCases.Case;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.Page;
import taxi.blizz.platform.PageCursor;

/** Support cases — rider, driver, admin and operator APIs. */
@RestController
class SupportController {

    private final SupportCases cases;
    private final SupportAttachments attachments;

    SupportController(SupportCases cases, SupportAttachments attachments) {
        this.cases = cases;
        this.attachments = attachments;
    }

    record OpenCase(@NotNull UUID commandId, @NotNull SupportCases.Category category, UUID orderId,
                    @NotBlank String subject, @NotBlank String message, List<UUID> attachmentIds) {
    }

    record Reply(@NotNull UUID commandId, @NotBlank String message, List<UUID> attachmentIds) {
    }

    /** A page of cases (REQ-API-09); {@code page} is new and optional for older clients. */
    record Cases(List<Case> cases, Page.Info page) {

        static Cases of(Page<Case> page) {
            return new Cases(page.items(), page.page());
        }
    }

    record Assign(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, UUID assigneeId, String reason) {
    }

    record Prioritize(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                      @NotNull SupportCases.Priority priority, String reason) {
    }

    /** {@code waitForRequester} is optional in the contract: left out, the case does not wait (issue #201). */
    record Comment(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                   @NotNull SupportCases.Visibility visibility, @NotBlank String body, Boolean waitForRequester,
                   List<UUID> attachmentIds) {
    }

    record Decision(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String text) {
    }

    // ---------------------------------------------------------------- rider and driver

    @PostMapping({"/api/rider/v1/support/cases", "/api/driver/v1/support/cases"})
    @ResponseStatus(HttpStatus.CREATED)
    SupportAttachments.Case open(AccessClaims claims, @Valid @RequestBody OpenCase body) {
        return attachments.open(claims.actor(), body.commandId(), body.category(), body.orderId(), body.subject(),
                body.message(), body.attachmentIds());
    }

    @GetMapping({"/api/rider/v1/support/cases", "/api/driver/v1/support/cases"})
    Cases mine(AccessClaims claims, @RequestParam(required = false) String cursor,
               @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime before,
               @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        PageCursor after = PageCursor.read(SupportCases.MY_CASES, cursor, before);
        return Cases.of(Page.of(cases.mine(claims.actor(), after, size + 1), size, SupportCases::minePosition));
    }

    @GetMapping({"/api/rider/v1/support/cases/{caseId}", "/api/driver/v1/support/cases/{caseId}"})
    SupportAttachments.Case mineOne(AccessClaims claims, @PathVariable UUID caseId) {
        return attachments.view(cases.mineOne(claims.actor(), caseId));
    }

    @PostMapping({"/api/rider/v1/support/cases/{caseId}/messages", "/api/driver/v1/support/cases/{caseId}/messages"})
    SupportAttachments.Case reply(AccessClaims claims, @PathVariable UUID caseId, @Valid @RequestBody Reply body) {
        return attachments.reply(claims.actor(), body.commandId(), caseId, body.message(), body.attachmentIds());
    }

    // ---------------------------------------------------------------- staff

    @GetMapping({"/api/admin/v1/support/cases", "/api/operator/v1/support/cases"})
    Cases queue(AccessClaims claims, @RequestParam(name = "city_id", required = false) UUID cityId,
                @RequestParam(required = false) SupportCases.State state,
                @RequestParam(required = false) SupportCases.Priority priority,
                @RequestParam(required = false) SupportCases.Category category,
                @RequestParam(name = "assigned_staff_id", required = false) UUID assignee,
                @RequestParam(defaultValue = "false") boolean unassigned,
                @RequestParam(defaultValue = "false") boolean overdue,
                @RequestParam(required = false) String cursor,
                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime before,
                @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        PageCursor after = queuePosition(cursor, before, overdue);
        return Cases.of(Page.of(cases.queue(claims.actor(), new SupportCases.QueueFilter(cityId, state, priority,
                category, assignee, unassigned, after, size + 1, overdue)), size, c -> SupportCases.position(c,
                overdue)));
    }

    /**
     * The queue is sorted by priority first, so a time alone cannot say where a page ends: the first version's
     * {@code before} skipped and repeated cases across priorities. It is refused; no client used it.
     */
    private static PageCursor queuePosition(String cursor, OffsetDateTime before, boolean overdue) {
        if (before != null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The case queue pages by cursor, not by before");
        }
        return PageCursor.decode(overdue ? SupportCases.OVERDUE_CASES : SupportCases.CASE_QUEUE, cursor);
    }

    @GetMapping({"/api/admin/v1/support/cases/{caseId}", "/api/operator/v1/support/cases/{caseId}"})
    SupportAttachments.Case get(AccessClaims claims, @PathVariable UUID caseId) {
        return attachments.view(cases.get(claims.actor(), caseId));
    }

    @PostMapping({"/api/admin/v1/support/cases/{caseId}/assign", "/api/operator/v1/support/cases/{caseId}/assign"})
    SupportAttachments.Case assign(AccessClaims claims, @PathVariable UUID caseId, @Valid @RequestBody Assign body) {
        return attachments.view(cases.assign(claims.actor(), body.commandId(), caseId, body.expectedVersion(),
                body.assigneeId(), body.reason()));
    }

    @PostMapping({"/api/admin/v1/support/cases/{caseId}/priority", "/api/operator/v1/support/cases/{caseId}/priority"})
    SupportAttachments.Case prioritize(AccessClaims claims, @PathVariable UUID caseId,
                                       @Valid @RequestBody Prioritize body) {
        return attachments.view(cases.prioritize(claims.actor(), body.commandId(), caseId, body.expectedVersion(),
                body.priority(), body.reason()));
    }

    @PostMapping({"/api/admin/v1/support/cases/{caseId}/comments", "/api/operator/v1/support/cases/{caseId}/comments"})
    SupportAttachments.Case comment(AccessClaims claims, @PathVariable UUID caseId,
                                    @Valid @RequestBody Comment body) {
        return attachments.comment(claims.actor(), body.commandId(), caseId, body.expectedVersion(), body.visibility(),
                body.body(), Boolean.TRUE.equals(body.waitForRequester()), body.attachmentIds());
    }

    @PostMapping({"/api/admin/v1/support/cases/{caseId}/resolve", "/api/operator/v1/support/cases/{caseId}/resolve"})
    SupportAttachments.Case resolve(AccessClaims claims, @PathVariable UUID caseId, @Valid @RequestBody Decision body) {
        return attachments.view(cases.resolve(claims.actor(), body.commandId(), caseId, body.expectedVersion(),
                body.text()));
    }

    @PostMapping({"/api/admin/v1/support/cases/{caseId}/reopen", "/api/operator/v1/support/cases/{caseId}/reopen"})
    SupportAttachments.Case reopen(AccessClaims claims, @PathVariable UUID caseId, @Valid @RequestBody Decision body) {
        return attachments.view(cases.reopen(claims.actor(), body.commandId(), caseId, body.expectedVersion(),
                body.text()));
    }

    @PostMapping({"/api/admin/v1/support/cases/{caseId}/close", "/api/operator/v1/support/cases/{caseId}/close"})
    SupportAttachments.Case close(AccessClaims claims, @PathVariable UUID caseId, @Valid @RequestBody Decision body) {
        return attachments.view(cases.close(claims.actor(), body.commandId(), caseId, body.expectedVersion(),
                body.text()));
    }
}
