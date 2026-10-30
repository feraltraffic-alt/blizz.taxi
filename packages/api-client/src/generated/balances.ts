export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        DriverStatement: {
            balances: {
                /** Format: int64 */
                balance_minor: number;
                currency: string;
            }[];
            driver_id: components["schemas"]["Uuid"];
            /** @description Newest first. */
            entries: {
                /**
                 * Format: int64
                 * @description Positive — in, negative — out.
                 */
                amount_minor: number;
                /** Format: date-time */
                at: string;
                /** @description The other driver of a transfer. */
                counterpart_id?: components["schemas"]["Uuid"] | null;
                currency: string;
                id: components["schemas"]["Uuid"];
                /** @description TRIP_FARE, CASH_COLLECTED, TERMINAL_COLLECTED, DEPOSIT, BONUS, CARD_TOP_UP, TRANSFER_IN, TRANSFER_OUT, PROMOTION, TIP, … (new kinds may appear). */
                kind: string;
                order_id?: components["schemas"]["Uuid"] | null;
                reason: string;
            }[];
        };
        Transfer: {
            /** Format: int64 */
            amount_minor: number;
            /** Format: date-time */
            at: string;
            comment?: string | null;
            currency: string;
            from_driver_id: components["schemas"]["Uuid"];
            id: components["schemas"]["Uuid"];
            to_driver_id: components["schemas"]["Uuid"];
        };
        TransferRule: {
            currency: string;
            enabled: boolean;
            /**
             * Format: int64
             * @description Sum of one driver's transfers in a day (UTC).
             */
            max_per_day_minor: number;
            /** Format: int64 */
            max_per_transfer_minor: number;
            /**
             * Format: int64
             * @description The sender's balance must stay at least this after the transfer.
             */
            min_balance_after_minor: number;
            /** Format: int64 */
            version: number;
        };
        TransferRuleList: {
            rules: components["schemas"]["TransferRule"][];
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
