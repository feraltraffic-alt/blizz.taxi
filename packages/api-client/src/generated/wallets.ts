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
        StaffTopUp: {
            /** Format: int64 */
            amount_minor: number;
            command_id: components["schemas"]["Uuid"];
            /** @description A currency of one of the service's cities. */
            currency: string;
            reason: string;
        };
        StartCardTopUp: {
            /**
             * Format: int64
             * @description Within the service's limits (by default 100 … 1 000 000 minor units).
             */
            amount_minor: number;
            /** @description The city whose merchant takes the money; the currency is that merchant's. */
            city_id: components["schemas"]["Uuid"];
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
        Wallet: {
            balances: components["schemas"]["WalletBalance"][];
            client_id: components["schemas"]["Uuid"];
            /** @description Newest first. */
            entries: components["schemas"]["WalletEntry"][];
        };
        WalletBalance: {
            /**
             * Format: int64
             * @description What may be used in a new order now.
             */
            available_minor: number;
            /** Format: int64 */
            balance_minor: number;
            currency: string;
            /**
             * Format: int64
             * @description Set aside for orders not finished yet.
             */
            reserved_minor: number;
        };
        WalletEntry: {
            /**
             * Format: int64
             * @description Positive — in, negative — out.
             */
            amount_minor: number;
            /** Format: date-time */
            at: string;
            currency: string;
            id: components["schemas"]["Uuid"];
            /** @description STAFF_TOP_UP, CARD_TOP_UP, PROMOTION, TRIP_PAYMENT, TIP, … (new kinds may appear). */
            kind: string;
            order_id?: components["schemas"]["Uuid"] | null;
            reason: string;
            /** @description Who topped up, for a top-up by staff. */
            staff_id?: components["schemas"]["Uuid"] | null;
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
