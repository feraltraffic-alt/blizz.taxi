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
        /** @description The taxi service's own retention in whole days for each kind of its rows (ADR 0016, */
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
            /** @description Rows of no service, kept a fixed number of days whatever is set (owner answer 02.11.2026). */
            fixed_days: {
                /** @constant */
                command_receipts: 30;
                /** @constant */
                consumer_receipts: 30;
                /** @constant */
                delivered_events: 30;
            };
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
