export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        /** @description A top-up on the provider's payment page (ADR 0009, ADR 0010). The app POSTs `fields` to `url` in a web view; when it reaches `return_url` the app reads the top-up until it is no longer PENDING. Money the provider took is credited even when it reports late: a FAILED or EXPIRED top-up can still become COMPLETED. */
        CardTopUp: {
            /** Format: int64 */
            amount_minor: number;
            completed_at?: components["schemas"]["Timestamp"] | null;
            created_at: components["schemas"]["Timestamp"];
            currency: string;
            /** @description The payment page stops taking the payment. */
            expires_at: components["schemas"]["Timestamp"];
            failure_reason?: string | null;
            /** @description Form fields to POST as application/x-www-form-urlencoded; only in the answer to the start. */
            fields?: {
                [key: string]: string;
            } | null;
            id: components["schemas"]["Uuid"];
            masked_pan?: string | null;
            return_url?: string | null;
            /** @enum {string} */
            state: "PENDING" | "COMPLETED" | "FAILED" | "EXPIRED";
            /** @description Where the web view POSTs the form; only in the answer to the start. */
            url?: string | null;
        };
        /** @description What the rider still owes on one order after its payment ended (REQ-PAY-18): a card payment that took less than the fare, or a final-fare correction that raised it. Read from the journal (RIDER_RECEIVABLE of the rider with the order as the basis): owed is what was charged to the rider there, paid what came in against it, and remainder the difference. An order whose payment is still in progress is not an obligation yet. Whether an open obligation blocks new orders is the owner's question Q-10; it does not now. */
        Obligation: {
            currency: string;
            order_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            owed_minor: number;
            /** Format: int64 */
            paid_minor: number;
            /** Format: int64 */
            remainder_minor: number;
            /** @description The card repayments of this obligation, newest first. */
            repayments: components["schemas"]["CardTopUp"][];
        };
        ObligationList: {
            /** @description The rider's obligations with something still owed, newest order first. */
            items: components["schemas"]["Obligation"][];
        };
        StartRepayment: {
            /**
             * Format: int64
             * @description Part of the remainder; the whole remainder when left out. Within the card limits of the service and at most the remainder.
             */
            amount_minor?: number;
            command_id: components["schemas"]["Uuid"];
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
