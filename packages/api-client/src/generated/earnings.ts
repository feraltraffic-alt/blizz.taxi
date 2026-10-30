export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        Earnings: {
            /**
             * Format: int64
             * @description The balance now, whatever the period; negative — the driver owes the service.
             */
            balance_minor: number;
            city_id: components["schemas"]["Uuid"];
            currency: string;
            /** @description Only days with movements, oldest first. */
            days: {
                /** Format: date */
                date: string;
                figures: components["schemas"]["EarningsFigures"];
            }[];
            driver_id: components["schemas"]["Uuid"];
            /** Format: date */
            from: string;
            timezone: string;
            /** Format: date */
            to: string;
            total: components["schemas"]["EarningsFigures"];
        };
        /** @description Minor units of the city's currency. */
        EarningsFigures: {
            /**
             * Format: int64
             * @description Anything else on the balance.
             */
            adjustments_minor: number;
            /**
             * Format: int64
             * @description Promotions and bonuses of the service.
             */
            bonuses_minor: number;
            /**
             * Format: int64
             * @description Taken by the driver in cash or at the own terminal.
             */
            cash_minor: number;
            /**
             * Format: int64
             * @description Paid by the riders through the service (card, bonuses, the service's discount).
             */
            cashless_minor: number;
            /**
             * Format: int64
             * @description The service's part of the fares.
             */
            commission_minor: number;
            /**
             * Format: int64
             * @description The driver's part of the fares, credited to the balance.
             */
            driver_share_minor: number;
            /**
             * Format: int64
             * @description What the trips cost.
             */
            fare_minor: number;
            /**
             * Format: int64
             * @description The driver's part of cash trips the driver reported not paid, held while support checks the case; it reaches the balance (adjustments) only when support decides so.
             */
            held_minor: number;
            /**
             * Format: int64
             * @description How the balance changed; positive — the service owes the driver more.
             */
            net_minor: number;
            /** Format: int64 */
            tips_minor: number;
            /**
             * Format: int64
             * @description Money the driver paid in (card, terminal, at the office).
             */
            top_ups_minor: number;
            /** Format: int64 */
            transfers_in_minor: number;
            /** Format: int64 */
            transfers_out_minor: number;
            trips: number;
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
