export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        ChangeRetention: {
            /** Format: uuid */
            command_id: string;
            days: components["schemas"]["RetentionDays"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        /** @description Separate retention in whole days for each kind. 0 always means keep forever. A change applies to the next cleanup run; already deleted data cannot be restored. Cleanup never deletes the audit log, journal, orders, payments or FAILED outbox events. */
        RetentionDays: {
            /**
             * @description Recording files and metadata, including refused recordings still on Asterisk. Defaults to keeping forever. 0 means keep forever.
             * @default 0
             */
            call_recordings: number;
            /**
             * @description Code delivery attempts, measured from the attempt time. 0 means keep forever.
             * @default 90
             */
            code_deliveries: number;
            /**
             * @description Completed command receipts, measured from completion. After expiry a command id is no longer remembered. 0 means keep forever.
             * @default 30
             */
            command_receipts: number;
            /**
             * @description Completed consumer inbox receipts, measured from completion. Receipts for events still PENDING or FAILED are preserved so replay skips completed consumers. 0 means keep forever.
             * @default 30
             */
            consumer_receipts: number;
            /**
             * @description Only DONE outbox events, measured from completion. FAILED and PENDING events are preserved. 0 means keep forever.
             * @default 30
             */
            delivered_events: number;
            /**
             * @description Files stuck in quarantine; call recordings use their separate setting. 0 means keep forever.
             * @default 30
             */
            quarantined_files: number;
            /**
             * @description Refresh tokens after expiry or session revocation; active tokens are preserved. 0 means keep forever.
             * @default 30
             */
            sessions: number;
            /**
             * @description One-time sign-in challenges, measured from creation. 0 means keep forever.
             * @default 90
             */
            sign_in_codes: number;
            /**
             * @description Expired uploads never completed, or uploaded files never attached. Documents, support attachments and call recordings are preserved. 0 means keep forever.
             * @default 7
             */
            upload_sessions: number;
        };
        RetentionVersion: {
            /** Format: date-time */
            changed_at: string | null;
            /** Format: uuid */
            changed_by: string | null;
            days: components["schemas"]["RetentionDays"];
            reason: string | null;
            /** Format: int64 */
            version: number;
        };
    };
    responses: never;
    parameters: never;
    requestBodies: never;
    headers: never;
    pathItems: never;
}
export type $defs = Record<string, never>;
export type operations = Record<string, never>;
