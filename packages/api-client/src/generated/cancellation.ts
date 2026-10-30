export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        /** @description Who cancelled the order and why, with the labels as they were at that moment. Null unless a person cancelled the order (a search that found nobody ends as UNFULFILLED instead). */
        Cancellation: {
            /** @enum {string} */
            by: "RIDER" | "STAFF" | "DRIVER";
            reason_code: string;
            reason_labels: components["schemas"]["Labels"];
        } | null;
        Catalog: {
            reasons: components["schemas"]["Reason"][];
        };
        CreateReason: {
            active: boolean;
            /** @enum {string} */
            audience: "RIDER" | "DRIVER" | "STAFF";
            code: string;
            command_id: components["schemas"]["Uuid"];
            driver_outcome?: components["schemas"]["DriverOutcome"];
            labels: components["schemas"]["Labels"];
            /** @default false */
            operator_fault: boolean;
            /** @description Why the list is changed; goes to the audit log. */
            reason: string;
            sort_order: number;
        };
        DispatchAttempt: {
            /** Format: date-time */
            assigned_at: string | null;
            attempt_id: components["schemas"]["Uuid"];
            /**
             * Format: date-time
             * @description When the order went to every nearby driver after the personal phase.
             */
            broadcast_at: string | null;
            /** Format: date-time */
            ended_at: string | null;
            /** Format: date-time */
            first_offer_at: string | null;
            generation: number;
            offers: components["schemas"]["DispatchOffer"][];
            /**
             * @description SEARCHING — still going; ASSIGNED — a driver took it; EXHAUSTED — the search time ran out; STOPPED — ended otherwise (cancelled, interrupted).
             * @enum {string}
             */
            outcome: "SEARCHING" | "ASSIGNED" | "EXHAUSTED" | "STOPPED";
            rounds: components["schemas"]["DispatchRound"][];
            /** Format: date-time */
            started_at: string;
        };
        DispatchCandidate: {
            /** @description From the driver's last position to the pickup, in metres; null without a position. */
            distance_m: number | null;
            driver_id: components["schemas"]["Uuid"];
            /**
             * @description OFFERED — got the offer; ELIGIBLE — would have qualified but someone nearer got it; EXCLUDED.
             * @enum {string}
             */
            outcome: "OFFERED" | "ELIGIBLE" | "EXCLUDED";
            /** @description Why an EXCLUDED driver was left out (the first check that failed); null otherwise. */
            reason: components["schemas"]["ExclusionReason"] | null;
        };
        DispatchJournal: {
            /** @description The order's search attempts, the first first (a new one after a driver was released). */
            attempts: components["schemas"]["DispatchAttempt"][];
        };
        DispatchOffer: {
            /** Format: date-time */
            closed_at: string | null;
            distance_m: number | null;
            driver_id: components["schemas"]["Uuid"];
            offer_id: components["schemas"]["Uuid"];
            /** Format: date-time */
            offered_at: string;
            /**
             * @description OPEN — still waiting for the driver.
             * @enum {string}
             */
            result: "OPEN" | "ACCEPTED" | "DECLINED" | "EXPIRED" | "REVOKED";
        };
        /** @description One choice of the next driver for a personal offer: the nearest drivers with an open shift in the order's city (at most 50), and for each the outcome. A round where nobody was OFFERED ends the personal phase. */
        DispatchRound: {
            /** Format: date-time */
            at: string;
            candidates: components["schemas"]["DispatchCandidate"][];
            /** @enum {string} */
            phase: "PERSONAL" | "BROADCAST";
            /** @description The largest search radius of the round; farther drivers are TOO_FAR. */
            radius_m: number;
        };
        /**
         * @description What a driver's reason does: RETURN_TO_SEARCH gives the order back to the search, CANCEL_ORDER cancels it by the driver. Only drivers' reasons have it.
         * @enum {string|null}
         */
        DriverOutcome: "RETURN_TO_SEARCH" | "CANCEL_ORDER" | null;
        /**
         * @description STALE_LOCATION — no recent heartbeat or position; PAUSED — the shift does not take orders now; NOT_ADMITTED — the account, admission or vehicle is not approved; CLASS — the vehicle has not the order's class; PAYMENT — no payment terminal for an order paid at one; BUSY — offered another order or on a trip; RESTRICTED — an active restriction (debt); ALREADY_OFFERED — had this order offered already; PREVIOUS_DRIVER — was released from this order (or its related one); TOO_FAR — beyond the search radius.
         * @enum {string}
         */
        ExclusionReason: "STALE_LOCATION" | "PAUSED" | "NOT_ADMITTED" | "CLASS" | "PAYMENT" | "BUSY" | "RESTRICTED" | "ALREADY_OFFERED" | "PREVIOUS_DRIVER" | "TOO_FAR";
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
        Reason: {
            /** @description Inactive reasons are hidden from the apps; reasons are never deleted. */
            active: boolean;
            /** @enum {string} */
            audience: "RIDER" | "DRIVER" | "STAFF";
            /** @description Never changes; to rename, change the labels. */
            code: string;
            driver_outcome: components["schemas"]["DriverOutcome"];
            id: components["schemas"]["Uuid"];
            labels: components["schemas"]["Labels"];
            /** @description STAFF-only flag; cancelling for such a reason may charge the order creator's bonus account. */
            operator_fault?: boolean;
            sort_order: number;
            /** Format: int64 */
            version: number;
        };
        ReasonItem: {
            code: string;
            driver_outcome: components["schemas"]["DriverOutcome"];
            labels: components["schemas"]["Labels"];
        };
        /** @description The active reasons of one side, in display order. */
        ReasonList: {
            reasons: components["schemas"]["ReasonItem"][];
        };
        Timeline: {
            /** @description Why a driver did or did not get the order (REQ-DSP-12): the search attempts, offers and the candidates of every round with the reasons they were left out. Only in the operator API (orders.view). */
            dispatch?: components["schemas"]["DispatchJournal"];
            events: components["schemas"]["TimelineEntry"][];
        };
        /** @description One change of the order. A cancellation (type OrderCancelled or PassengerNoShow) has cancelled_by, reason_code and reason_labels in details, so the panel can show "Operator Anna cancelled the order: passenger asked". A driver giving the order back (AssignmentWithdrawn) has reason_code and reason_labels when given through a reason from the list. */
        TimelineEntry: {
            actor: {
                id: components["schemas"]["Uuid"] | null;
                /** @description Staff member's first and last name or driver's name; null for others. */
                name: string | null;
                /**
                 * @description The staff member's current role.
                 * @enum {string|null}
                 */
                role: "SUPER_ADMIN" | "ADMIN" | "OPERATOR" | null;
                /** @enum {string} */
                type: "STAFF" | "CLIENT" | "DRIVER" | "PARTNER" | "SYSTEM";
            };
            /** @description The request or job that made the change (REQ-OBS-01/04) — search it in GET /api/admin/v1/logs/correlation/{correlation_id}; null for events older than the column. */
            correlation_id: components["schemas"]["Uuid"] | null;
            details: {
                [key: string]: unknown;
            };
            occurred_at: components["schemas"]["Timestamp"];
            reason: string | null;
            /** Format: int64 */
            sequence: number;
            /**
             * @example OrderCreated
             * @example OrderCancelled
             * @example AssignmentWithdrawn
             * @example PassengerNoShow
             * @example TripCompleted
             */
            type: string;
        };
        /**
         * Format: date-time
         * @description Moment in UTC, RFC 3339.
         * @example 2026-10-26T12:00:00Z
         */
        Timestamp: string;
        UpdateReason: {
            active: boolean;
            command_id: components["schemas"]["Uuid"];
            driver_outcome?: components["schemas"]["DriverOutcome"];
            /** Format: int64 */
            expected_version: number;
            labels: components["schemas"]["Labels"];
            operator_fault?: boolean;
            reason: string;
            sort_order: number;
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
