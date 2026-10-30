export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        AppliedPromotion: {
            /**
             * Format: int64
             * @description What a DISCOUNT takes off the price; 0 for a BONUS (credited after the trip).
             */
            discount_minor: number;
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            kind: "DISCOUNT" | "BONUS";
            name: string;
            /** Format: int64 */
            value: number;
            /** @enum {string} */
            value_type: "PERCENT" | "FIXED";
        };
        DriverPromotion: {
            /** Format: date-time */
            created_at: string;
            created_by: components["schemas"]["Uuid"];
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            state: "ACTIVE" | "ARCHIVED";
            terms: components["schemas"]["DriverPromotionDraft"];
            /** Format: date-time */
            updated_at: string;
            /** Format: int64 */
            version: number;
        };
        /** @description Complete orders_required orders within period_days days (periods run from starts_at) — optionally only on days_of_week, between time_from and time_to (city time, when the driver took the order) and with payment_method — and get reward_minor on the balance; once, or in every period (ADR 0010). */
        DriverPromotionDraft: {
            city_id?: components["schemas"]["Uuid"] | null;
            currency: string;
            days_of_week?: ("MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY" | "SUNDAY")[] | null;
            /** Format: date-time */
            ends_at?: string | null;
            name: string;
            orders_required: number;
            /** @enum {string|null} */
            payment_method?: "CASH" | "CARD" | "TERMINAL" | null;
            period_days: number;
            /** @enum {string} */
            repeat: "ONCE" | "EVERY_PERIOD";
            /** Format: int64 */
            reward_minor: number;
            /** Format: date-time */
            starts_at: string;
            /** @example 08:00 */
            time_from?: string | null;
            /** @example 09:00 */
            time_to?: string | null;
        };
        DriverPromotionProgress: {
            currency: string;
            name: string;
            /** Format: int64 */
            orders_done: number;
            orders_required: number;
            /** Format: date-time */
            period_end: string;
            /** Format: date-time */
            period_start: string;
            promotion_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            repeat: "ONCE" | "EVERY_PERIOD";
            /** Format: int64 */
            reward_minor: number;
            /** @description Already paid in this period (or, for ONCE, ever). */
            rewarded: boolean;
        };
        Promotion: components["schemas"]["PromotionDraft"] & {
            /** Format: date-time */
            created_at: string;
            created_by: components["schemas"]["Uuid"];
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            state: "ACTIVE" | "ARCHIVED";
            /** Format: date-time */
            updated_at: string;
            /** Format: int64 */
            version: number;
        };
        /** @description Null means "any". Days and hours in the city's time zone at the pickup time. */
        PromotionConditions: {
            city_id?: components["schemas"]["Uuid"] | null;
            days_of_week?: ("MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY" | "SUNDAY")[] | null;
            dropoff_zone_id?: components["schemas"]["Uuid"] | null;
            /** Format: date-time */
            ends_at?: string | null;
            /** @description The rider's N-th, 2N-th … completed trip (2…1000); null — every trip. One order of the rider gets each N-th trip; a quote counted on it no longer creates an order once another order has it (QUOTE_EXPIRED, get a new price), and a cancelled order gives it back. */
            every_nth_trip?: number | null;
            /** @description A zone of city_id (city required). */
            pickup_zone_id?: components["schemas"]["Uuid"] | null;
            /** Format: date-time */
            starts_at?: string | null;
            /**
             * @description HH:mm, inclusive; with time_to. A window past midnight (22:00–06:00) wraps.
             * @example 08:00
             */
            time_from?: string | null;
            /** @description HH:mm, exclusive. */
            time_to?: string | null;
            vehicle_class?: string | null;
        };
        PromotionDraft: {
            conditions: components["schemas"]["PromotionConditions"];
            /** @description Required for FIXED; ignored for PERCENT. */
            currency?: string | null;
            /** @enum {string} */
            kind: "DISCOUNT" | "BONUS";
            /** @description Shown to the rider in the quote and in the account history. */
            name: string;
            /**
             * Format: int64
             * @description PERCENT — basis points (1000 = 10 %, at most 10000); FIXED — minor units of currency.
             */
            value: number;
            /** @enum {string} */
            value_type: "PERCENT" | "FIXED";
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
