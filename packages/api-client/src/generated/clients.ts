export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        Assignment: {
            driver_id?: components["schemas"]["Uuid"];
            id?: components["schemas"]["Uuid"];
            order_id?: components["schemas"]["Uuid"];
            /** @enum {string} */
            source?: "OFFER" | "BROADCAST" | "RESERVATION";
            /** @enum {string} */
            state?: "RESERVED" | "COMMITTED" | "RELEASED" | "REVOKED" | "COMPLETED";
            /** Format: uuid */
            trip_id?: string | null;
            /** @enum {string|null} */
            trip_phase?: "TO_PICKUP" | "WAITING" | "IN_PROGRESS" | "COMPLETED" | "ABORTED" | null;
            vehicle_id?: components["schemas"]["Uuid"];
        };
        BlockClient: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
            /** @description In the future; omitted — until staff unblock. */
            until?: components["schemas"]["Timestamp"] | null;
        };
        /** @description Who cancelled the order and why, with the labels as they were at that moment. Null unless a person cancelled the order (a search that found nobody ends as UNFULFILLED instead). */
        Cancellation: {
            /** @enum {string} */
            by: "RIDER" | "STAFF" | "DRIVER";
            reason_code: string;
            reason_labels: components["schemas"]["Labels"];
        } | null;
        Client: {
            /** @enum {string} */
            account_state: "UNVERIFIED" | "ACTIVE" | "BLOCKED" | "DELETION_PENDING";
            /** @description Set while blocked, and kept under a pending deletion request. */
            block?: null | {
                at: components["schemas"]["Timestamp"];
                by?: components["schemas"]["Uuid"] | null;
                reason: string;
                /** @description Null — until staff unblock. */
                until?: components["schemas"]["Timestamp"] | null;
            };
            created_at: components["schemas"]["Timestamp"];
            deletion_requested_at?: components["schemas"]["Timestamp"] | null;
            has_app: boolean;
            id: components["schemas"]["Uuid"];
            language?: string | null;
            name?: string | null;
            phone: string;
            /** Format: int64 */
            version: number;
        };
        ClientCard: {
            bonuses: {
                /** Format: int64 */
                available_minor: number;
                /** Format: int64 */
                balance_minor: number;
                currency: string;
            }[];
            /** @description The rider's own support cases, newest first. */
            cases: {
                category: string;
                created_at: components["schemas"]["Timestamp"];
                id: components["schemas"]["Uuid"];
                /** Format: int64 */
                number: number;
                order_id?: components["schemas"]["Uuid"] | null;
                state: string;
                subject: string;
            }[];
            client: components["schemas"]["Client"];
            current_orders: components["schemas"]["Order"][];
            /** @description What the rider owes the service (REQ-PAY-18), per currency. */
            debt: {
                /** Format: int64 */
                amount_minor: number;
                currency: string;
            }[];
            /** @description The latest 20, newest first. */
            latest_orders: components["schemas"]["OrderHistoryItem"][];
        };
        ClientList: {
            clients: components["schemas"]["Client"][];
        };
        /** @description WGS84 coordinates (REQ-GEO-01). */
        GeoPoint: {
            lat: number;
            lon: number;
        };
        HistoryDriver: {
            name: string | null;
            vehicle: components["schemas"]["HistoryVehicle"];
        };
        HistoryVehicle: {
            color: string;
            make: string;
            model: string;
            registration_number: string;
        };
        /**
         * @description The reason's text by language (uk, pl, ru, en); the service's default language is always present.
         * @example {
         *       "ru": "Пассажир попросил",
         *       "uk": "Пасажир попросив",
         *       "en": "Passenger asked"
         *     }
         */
        Labels: {
            [key: string]: string;
        };
        Order: {
            assignment?: components["schemas"]["Assignment"] | null;
            cancellation?: components["schemas"]["Cancellation"];
            /**
             * @description Where the order came from.
             * @enum {string}
             */
            channel: "APP" | "WEB" | "PHONE" | "PARTNER";
            city_id: components["schemas"]["Uuid"];
            created_at?: components["schemas"]["Timestamp"];
            currency?: string | null;
            /**
             * Format: int64
             * @description Taken off the price by the rider's promotions (ADR 0009); the service pays it.
             */
            discount_minor?: number;
            dropoff: components["schemas"]["GeoPoint"];
            dropoff_label?: string;
            /**
             * Format: int64
             * @description Final fare, set when the trip is completed (REQ-PRC-10).
             */
            final_price_minor?: number | null;
            id: components["schemas"]["Uuid"];
            /** @description The client who pays for this order (the signed-in rider, or the account created for a phone order). Null while the phone order has no account yet. */
            payer_client_id?: components["schemas"]["Uuid"] | null;
            /**
             * @description TERMINAL — a card at the driver's own terminal, only in phone orders.
             * @enum {string}
             */
            payment_method: "CASH" | "CARD" | "SERVICE" | "TERMINAL";
            /**
             * @description Cash — what the driver reported. Card (ADR 0008) — AUTH_PENDING while the hold is asked for (the order is AWAITING_PAYMENT and no search runs), AUTHORIZED once it is held, PAYMENT_DECLINED when the bank refused. Terminal — what the driver reported, like cash.
             * @enum {string|null}
             */
            payment_state?: "CASH_EXPECTED" | "CASH_REPORTED" | "CASH_NOT_RECEIVED" | "AUTH_PENDING" | "AUTHORIZED" | "PAYMENT_DECLINED" | "HOLD_RELEASED" | "CAPTURE_PENDING" | "PAID" | "PARTIALLY_PAID" | "TERMINAL_EXPECTED" | "TERMINAL_REPORTED" | "TERMINAL_NOT_RECEIVED" | null;
            pickup: components["schemas"]["GeoPoint"];
            /** @description Requested pickup time of an order for later; null for an order for now. */
            pickup_at?: components["schemas"]["Timestamp"] | null;
            /** @description While the driver is on the way to the pickup (trip TO_PICKUP): a forecast, never a promise (REQ-RID-04), from the driver's last position on the server. Null in every other state and when no position is known — never a made-up value. Shown in the rider's order reads (GET /orders/{id}, /current, /active); command answers leave it null. */
            pickup_eta?: null | {
                /** Format: int64 */
                distance_metres: number;
                /**
                 * Format: date-time
                 * @description When the driver was at that position; the ETA counts from then.
                 */
                location_at: string;
                /**
                 * Format: int64
                 * @description Driving time from that position to the pickup.
                 */
                seconds: number;
                /**
                 * @description ROUTER — on the roads; STRAIGHT_LINE — from the straight line, when no router answered.
                 * @enum {string}
                 */
                source: "ROUTER" | "STRAIGHT_LINE";
                /** @description The position is older than the freshness limit; show the forecast as uncertain. */
                stale: boolean;
            };
            pickup_label?: string;
            /** @description A pre-order (ADR 0006): SCHEDULED until it is released into the search before pickup_at. It does not count as the rider's active order, so the rider can order a ride now as well. */
            preorder?: boolean;
            /**
             * Format: int64
             * @description Agreed price from the quote.
             */
            price_minor?: number | null;
            /** @description On a follow-up: the interrupted order it continues (T-22). Its payment_method is SERVICE — the rider pays nothing for it. */
            related_order_id?: components["schemas"]["Uuid"] | null;
            /** @enum {string|null} */
            search_phase?: "PERSONAL" | "BROADCAST" | "STOPPED" | "EXHAUSTED" | null;
            /**
             * Format: int64
             * @description For support conversations; not a secret (REQ-DATA-03).
             */
            short_number: number;
            /** @enum {string} */
            status: "SCHEDULED" | "AWAITING_PAYMENT" | "READY" | "SEARCHING" | "ASSIGNED" | "IN_SERVICE" | "FULFILLED" | "CANCELLED" | "UNFULFILLED";
            status_reason?: string | null;
            vehicle_class: string;
            /** Format: int64 */
            version: number;
            /**
             * Format: int64
             * @description Bonuses paying part of the price (ADR 0009); after the trip at most the final fare is taken.
             */
            wallet_minor?: number;
        };
        OrderHistoryItem: {
            cancellation: components["schemas"]["Cancellation"];
            /** @description True for the last assigned driver only while that assignment was not released or revoked. */
            chat_available: boolean;
            created_at: components["schemas"]["Timestamp"];
            currency: string | null;
            driver: components["schemas"]["HistoryDriver"] | null;
            dropoff_label: string;
            /** Format: int64 */
            final_price_minor: number | null;
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            payment_method: "CASH" | "CARD" | "SERVICE" | "TERMINAL";
            pickup_at: components["schemas"]["Timestamp"] | null;
            pickup_label: string;
            /** Format: int64 */
            price_minor: number | null;
            /**
             * Format: int64
             * @description For support conversations; not a secret (REQ-DATA-03).
             */
            short_number: number;
            /** @enum {string} */
            status: "SCHEDULED" | "AWAITING_PAYMENT" | "READY" | "SEARCHING" | "ASSIGNED" | "IN_SERVICE" | "FULFILLED" | "CANCELLED" | "UNFULFILLED";
            vehicle_class: string;
        };
        /**
         * Format: date-time
         * @description Moment in UTC, RFC 3339.
         * @example 2026-10-26T12:00:00Z
         */
        Timestamp: string;
        UnblockClient: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
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
