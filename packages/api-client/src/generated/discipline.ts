export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        Acceptance: {
            accepted7d: number;
            enabled: boolean;
            min_offers: number;
            /** @description Personal offers of the last 7 days that count (answered or missed, pickup not too far). */
            offers7d: number;
            pause_percent: number;
            /** @description accepted7d of offers7d in per cent, rounded down; null while offers7d is under min_offers. */
            percent7d: number | null;
            warn_percent: number;
        };
        CancellationRow: {
            /** Format: date-time */
            accepted_at: string;
            /** Format: date-time */
            cancelled_at: string;
            city_id: components["schemas"]["Uuid"];
            counted: boolean;
            /**
             * @description GRACE — within the grace window; REASON — a reason that does not count; OFF — switched off.
             * @enum {string|null}
             */
            not_counted_why: "GRACE" | "REASON" | "OFF" | null;
            order_id: components["schemas"]["Uuid"];
            reason_code: string;
        };
        Cancellations: {
            /** @description Orders the driver accepted in the last 30 days. */
            accepted30d: number;
            /** @description Counted cancellations in the last 30 days. */
            cancelled30d: number;
            enabled: boolean;
            /** @description Counted cancellations after accepting in the last 24 hours (rolling). */
            last24h: number;
            pause_after: number;
            /** @description cancelled30d of accepted30d in per cent, rounded down; null with nothing accepted. */
            rate30d_percent: number | null;
            /** @description The counted cancellation that pauses new orders is this many from now; 0 — at or over it. */
            until_pause: number;
            warn_after: number;
        };
        Discipline: {
            acceptance: components["schemas"]["Acceptance"];
            cancellations: components["schemas"]["Cancellations"];
            pause: components["schemas"]["PauseNow"];
        };
        DriverCard: {
            acceptance: components["schemas"]["Acceptance"];
            cancellations: components["schemas"]["Cancellations"];
            driver_id: components["schemas"]["Uuid"];
            pause: components["schemas"]["PauseNow"];
            /** @description Cancellations after accepting of the last 30 days in the caller's cities, newest first, at most 200. */
            recent: components["schemas"]["CancellationRow"][];
        };
        /** @description A pause of new offers and claims in force; null when none. */
        PauseNow: {
            /** Format: date-time */
            ends_at: string;
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            kind: "CANCELLATIONS" | "ACCEPTANCE";
            level: number;
        } | null;
        RateReport: {
            city_id: components["schemas"]["Uuid"];
            days: number;
            drivers: {
                accepted: number;
                cancelled: number;
                driver_id: components["schemas"]["Uuid"];
                rate_percent: number;
            }[];
            /** Format: date-time */
            generated_at: string;
            /** @description Only drivers with at least this many accepted orders in the city (rate_flag_min_accepted). */
            min_accepted: number;
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
