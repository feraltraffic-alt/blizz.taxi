export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        AccountDeletionStatus: {
            /**
             * @description DELETION_PENDING after a request; after a cancellation the state the account had before.
             * @enum {string}
             */
            account_state: "DELETION_PENDING" | "ACTIVE" | "BLOCKED";
            client_id: components["schemas"]["Uuid"];
            /** Format: date-time */
            requested_at: string | null;
        };
        Amount: {
            /** Format: int64 */
            amount_minor: number;
            currency: string;
        };
        /** @description A copy of the rider's personal data (REQ-PRV-07). PENDING → RUNNING → READY (downloadable until expires_at) or FAILED; READY → EXPIRED, the file is dropped. */
        DataExport: {
            created_at: components["schemas"]["Timestamp"];
            /** Format: date-time */
            expires_at: string | null;
            id: components["schemas"]["Uuid"];
            /** Format: date-time */
            ready_at: string | null;
            /** Format: int64 */
            size_bytes: number | null;
            /** @enum {string} */
            state: "PENDING" | "RUNNING" | "READY" | "FAILED" | "EXPIRED";
        };
        /** @description A code of purpose DATA_EXPORT was sent to the rider's current phone. */
        DataExportCodeChallenge: {
            challenge_id: components["schemas"]["Uuid"];
            expires_at: components["schemas"]["Timestamp"];
            resend_available_at: components["schemas"]["Timestamp"];
        };
        /** @description The rider confirms the request with the code of the challenge. A sign-in or deletion code is refused (OTP_INVALID); a wrong code counts as an attempt. */
        DataExportCommand: {
            challenge_id: components["schemas"]["Uuid"];
            command_id: components["schemas"]["Uuid"];
            otp_code: string;
        };
        DataExportList: {
            /** @description Newest first, at most 20. */
            exports: components["schemas"]["DataExport"][];
        };
        /** @description What stops staff from completing the request. blocked is true while there is an active order, an unpaid debt or an open support case of the rider. bonuses_to_burn never blocks: the rider's bonuses burn on completion (owner decision 27.10.2026). */
        DeletionBlockers: {
            active_order_id: components["schemas"]["Uuid"] | null;
            blocked: boolean;
            bonuses_to_burn: components["schemas"]["Amount"][];
            /** @description Unpaid debt per currency (RIDER_RECEIVABLE). */
            debt: components["schemas"]["Amount"][];
            open_support_cases: number;
        };
        DeletionCancelCommand: {
            command_id: components["schemas"]["Uuid"];
        };
        /** @description A code of purpose ACCOUNT_DELETION was sent to the rider's current phone. */
        DeletionCodeChallenge: {
            challenge_id: components["schemas"]["Uuid"];
            expires_at: components["schemas"]["Timestamp"];
            resend_available_at: components["schemas"]["Timestamp"];
        };
        DeletionDecision: {
            /**
             * @description ANONYMIZED after completion; after a rejection the state the account had before the request.
             * @enum {string}
             */
            account_state: "ANONYMIZED" | "ACTIVE" | "BLOCKED";
            client_id: components["schemas"]["Uuid"];
        };
        DeletionDecisionCommand: {
            command_id: components["schemas"]["Uuid"];
            /** @description Why; goes to the audit log. */
            reason: string;
        };
        DeletionRequest: {
            blockers: components["schemas"]["DeletionBlockers"];
            client_id: components["schemas"]["Uuid"];
            /**
             * @description The state the account returns to if the request is cancelled or rejected.
             * @enum {string}
             */
            previous_state: "ACTIVE" | "BLOCKED";
            /** Format: date-time */
            requested_at: string;
        };
        /** @description The rider confirms the request with the code of the challenge. A sign-in code is refused (OTP_INVALID); a wrong code counts as an attempt. */
        DeletionRequestCommand: {
            challenge_id: components["schemas"]["Uuid"];
            command_id: components["schemas"]["Uuid"];
            otp_code: string;
        };
        DeletionRequestList: {
            requests: components["schemas"]["DeletionRequest"][];
        };
        /**
         * Format: date-time
         * @description Moment in UTC, RFC 3339.
         * @example 2026-10-26T12:00:00Z
         */
        Timestamp: string;
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
