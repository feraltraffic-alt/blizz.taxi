export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        /** @description Minor units of the city's currency; only movements of the city's orders. */
        MoneyFigures: {
            /** Format: int64 */
            bonuses_granted_minor: number;
            /**
             * Format: int64
             * @description Cash and the drivers' own terminals.
             */
            collected_by_drivers_minor: number;
            /** Format: int64 */
            commission_minor: number;
            /** Format: int64 */
            discounts_minor: number;
            /** Format: int64 */
            driver_share_minor: number;
            /** Format: int64 */
            fares_minor: number;
            /** Format: int64 */
            paid_by_card_minor: number;
            /** Format: int64 */
            paid_with_bonuses_minor: number;
            /**
             * Format: int64
             * @description How the riders' debt for these orders changed; positive — it grew.
             */
            rider_debt_change_minor: number;
            /**
             * Format: int64
             * @description Follow-up rides the service paid itself.
             */
            service_rides_minor: number;
            /** Format: int64 */
            tips_minor: number;
            trips: number;
        };
        MoneyReport: {
            city_id: components["schemas"]["Uuid"];
            currency: string;
            days: {
                /** Format: date */
                date: string;
                figures: components["schemas"]["MoneyFigures"];
            }[];
            /** Format: date */
            from: string;
            /** @description When the figures were read (REQ-ADM-06). */
            generated_at: components["schemas"]["Timestamp"];
            timezone: string;
            /** Format: date */
            to: string;
            total: components["schemas"]["MoneyFigures"];
        };
        OrderCounts: {
            /** @description APP, PHONE, WEB → count. */
            by_channel: {
                [key: string]: number;
            };
            /** @description CASH, CARD, TERMINAL, SERVICE → count. */
            by_payment: {
                [key: string]: number;
            };
            cancelled: number;
            /** @description RIDER, DRIVER, STAFF → count. */
            cancelled_by: {
                [key: string]: number;
            };
            created: number;
            fulfilled: number;
            /** @description Not finished yet. */
            open: number;
            unfulfilled: number;
        };
        OrderReport: {
            /** @description Most frequent first. */
            cancellation_reasons: {
                cancelled_by: string;
                code: string;
                count: number;
            }[];
            city_id: components["schemas"]["Uuid"];
            /** @description Days with orders, oldest first, by the day an order was created. */
            days: {
                counts: components["schemas"]["OrderCounts"];
                /** Format: date */
                date: string;
            }[];
            /** Format: date */
            from: string;
            /** @description When the figures were read (REQ-ADM-06). */
            generated_at: components["schemas"]["Timestamp"];
            timezone: string;
            /** Format: date */
            to: string;
            total: components["schemas"]["OrderCounts"];
        };
        /** @description PENDING → RUNNING → READY (the file can be downloaded until expires_at) or FAILED (error); READY → EXPIRED, the file is dropped. */
        ReportExport: {
            city_id: components["schemas"]["Uuid"];
            created_at: components["schemas"]["Timestamp"];
            error?: string | null;
            expires_at?: components["schemas"]["Timestamp"] | null;
            file_name?: string | null;
            /** Format: date */
            from: string;
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            kind: "ORDERS" | "FINANCE";
            ready_at?: components["schemas"]["Timestamp"] | null;
            /** @description Rows of data in the file, the total row included, the header not. */
            rows?: number | null;
            /** @enum {string} */
            state: "PENDING" | "RUNNING" | "READY" | "FAILED" | "EXPIRED";
            /** Format: date */
            to: string;
        };
        ReportExportList: {
            exports: components["schemas"]["ReportExport"][];
        };
        RequestReportExport: {
            city_id: components["schemas"]["Uuid"];
            command_id: components["schemas"]["Uuid"];
            /** Format: date */
            from: string;
            /**
             * @description ORDERS — the report of orders; FINANCE — the report of money.
             * @enum {string}
             */
            kind: "ORDERS" | "FINANCE";
            /**
             * Format: date
             * @description Included; at most 92 days after from.
             */
            to: string;
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
