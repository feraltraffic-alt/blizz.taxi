export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        Assign: {
            /**
             * Format: uuid
             * @description A staff member with support.manage for the case's city; null puts the case back into the queue.
             */
            assignee_id?: string | null;
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason?: string | null;
        };
        Attachment: {
            /** @enum {string} */
            content_type: "image/jpeg" | "image/png" | "image/webp" | "application/pdf";
            file_id: components["schemas"]["Uuid"];
            name?: string | null;
            /** Format: int64 */
            size_bytes: number;
        };
        AttachmentIds: components["schemas"]["Uuid"][];
        Case: {
            /**
             * Format: uuid
             * @description Null in the rider and driver APIs.
             */
            assigned_staff_id?: string | null;
            category: components["schemas"]["Category"];
            /** Format: uuid */
            city_id?: string | null;
            created_at: components["schemas"]["Timestamp"];
            id: components["schemas"]["Uuid"];
            /** @description Empty in lists; filled when one case is read. */
            messages: components["schemas"]["Message"][];
            /**
             * Format: int64
             * @description For conversations with support.
             */
            number: number;
            /** Format: uuid */
            order_id?: string | null;
            priority: components["schemas"]["Priority"];
            /** Format: uuid */
            requester_id?: string | null;
            /** @enum {string} */
            requester_type: "CLIENT" | "DRIVER" | "STAFF" | "SYSTEM";
            resolution?: string | null;
            /** @description When the first answer is due, from the priority (URGENT 5 min, HIGH 15 min, NORMAL 4 h, LOW 24 h after the case was opened; REQ-OPS-06). */
            respond_by: components["schemas"]["Timestamp"];
            state: components["schemas"]["State"];
            subject: string;
            updated_at: components["schemas"]["Timestamp"];
            /** Format: int64 */
            version: number;
        };
        CaseList: {
            cases: components["schemas"]["Case"][];
        };
        /**
         * @description TRIP_REVIEW, NO_DRIVER, LOST_CONNECTION and PAYMENT_UNKNOWN are opened by the system only (REQ-OPS-06).
         * @enum {string}
         */
        Category: "LOST_ITEM" | "PAYMENT" | "CASH_DISPUTE" | "DRIVER_BEHAVIOUR" | "RIDER_BEHAVIOUR" | "SAFETY" | "TRIP_REVIEW" | "APP_PROBLEM" | "OTHER" | "NO_DRIVER" | "LOST_CONNECTION" | "PAYMENT_UNKNOWN";
        Comment: {
            attachment_ids?: components["schemas"]["AttachmentIds"];
            body: string;
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            /** @enum {string} */
            visibility: "PUBLIC" | "INTERNAL";
            /** @description With a PUBLIC message — the case waits for the requester's answer. */
            wait_for_requester?: boolean;
        };
        Decision: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            /** @description The resolution, or the reason to reopen / close. */
            text: string;
        };
        Message: {
            attachments: components["schemas"]["Attachment"][];
            /**
             * Format: uuid
             * @description Hidden (null) for staff authors in the rider and driver APIs.
             */
            author_id?: string | null;
            /** @enum {string} */
            author_type: "CLIENT" | "DRIVER" | "STAFF" | "SYSTEM";
            body: string;
            created_at: components["schemas"]["Timestamp"];
            id: components["schemas"]["Uuid"];
            /** Format: int64 */
            sequence: number;
            /**
             * @description INTERNAL comments are never shown to the requester (REQ-ADM-09).
             * @enum {string}
             */
            visibility: "PUBLIC" | "INTERNAL";
        };
        OpenAttachmentUpload: {
            command_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            content_type: "image/jpeg" | "image/png" | "image/webp" | "application/pdf";
            /** Format: int64 */
            size_bytes: number;
        };
        OpenCase: {
            attachment_ids?: components["schemas"]["AttachmentIds"];
            /** @description Any category except the system-only ones (TRIP_REVIEW, NO_DRIVER, LOST_CONNECTION, PAYMENT_UNKNOWN). SAFETY cases start URGENT. */
            category: components["schemas"]["Category"];
            command_id: components["schemas"]["Uuid"];
            message: string;
            /**
             * Format: uuid
             * @description One of the requester's own orders (rider) or trips (driver).
             */
            order_id?: string | null;
            subject: string;
        };
        Prioritize: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            priority: components["schemas"]["Priority"];
            reason?: string | null;
        };
        /** @enum {string} */
        Priority: "LOW" | "NORMAL" | "HIGH" | "URGENT";
        Reply: {
            attachment_ids?: components["schemas"]["AttachmentIds"];
            command_id: components["schemas"]["Uuid"];
            message: string;
        };
        /** @enum {string} */
        State: "OPEN" | "IN_PROGRESS" | "WAITING_REQUESTER" | "RESOLVED" | "CLOSED";
        StoredFile: {
            content_type?: string | null;
            file_id: components["schemas"]["Uuid"];
            reject_reason?: string | null;
            /** Format: int64 */
            size_bytes: number;
            /**
             * @description QUARANTINE while the antivirus has not given its verdict yet (issue
             * @enum {string}
             */
            state: "SAFE" | "QUARANTINE" | "REJECTED";
        };
        /**
         * Format: date-time
         * @description Moment in UTC, RFC 3339.
         * @example 2026-10-26T12:00:00Z
         */
        Timestamp: string;
        UploadSession: {
            expires_at: components["schemas"]["Timestamp"];
            file_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            max_bytes: number;
            upload_path: string;
        };
        /** Format: uuid */
        Uuid: string;
    };
    responses: never;
    parameters: never;
    requestBodies: never;
    headers: never;
    pathItems: never;
}
export type $defs = Record<string, never>;
export type operations = Record<string, never>;
