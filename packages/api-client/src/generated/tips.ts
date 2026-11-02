export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        LeaveTip: {
            /**
             * Format: int64
             * @description A preset's amount or an own one from min_minor to max_minor.
             */
            amount_minor: number;
            command_id: components["schemas"]["Uuid"];
        };
        /**
         * Format: date-time
         * @description Moment in UTC, RFC 3339.
         * @example 2026-10-26T12:00:00Z
         */
        Timestamp: string;
        Tip: {
            /** Format: int64 */
            amount_minor: number;
            created_at: components["schemas"]["Timestamp"];
            currency: string;
            failure_reason?: string | null;
            id: components["schemas"]["Uuid"];
            method: components["schemas"]["TipMethod"];
            order_id: components["schemas"]["Uuid"];
            /**
             * @description PENDING — the card charge is on its way; PAID; FAILED — the card declined, another tip may be left; RECORDED — cash or terminal.
             * @enum {string}
             */
            state: "PENDING" | "PAID" | "FAILED" | "RECORDED";
        };
        /**
         * @description CARD — a separate charge of the order's card; WALLET — from the bonus account (an order paid wholly with bonuses, when it has enough); CASH and TERMINAL — handed to the driver, only recorded.
         * @enum {string}
         */
        TipMethod: "CARD" | "WALLET" | "CASH" | "TERMINAL";
        TipOptions: {
            available_until: components["schemas"]["Timestamp"];
            currency: string;
            /** Format: int64 */
            max_minor: number;
            /** @description How a tip would be paid; null when the order is SERVICE and cannot be tipped. */
            method: components["schemas"]["TipMethod"] | null;
            /** Format: int64 */
            min_minor: number;
            /** @description A tip can be left now. */
            open: boolean;
            order_id: components["schemas"]["Uuid"];
            presets: {
                /**
                 * Format: int64
                 * @description The percent of the cost, rounded up to a whole unit.
                 */
                amount_minor: number;
                /** @enum {integer} */
                percent: 10 | 15 | 20 | 25;
            }[];
            /** @description The tip already left, if any. */
            tip?: components["schemas"]["Tip"] | null;
            /**
             * Format: int64
             * @description The final fare less the service's discount.
             */
            trip_cost_minor: number;
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
