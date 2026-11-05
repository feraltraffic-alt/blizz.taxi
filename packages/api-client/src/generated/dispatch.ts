export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
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
            /** @description The pickup time the round computed for the driver (ADR 0020); null when it computed none (not among the nearest candidates routed, or left out before). */
            pickup_seconds?: number | null;
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
            /** @description The pickup time the offer was made with (ADR 0020): from the driver's position to the pickup, by the service's router or, without it, the straight-line estimate; null for offers made before. */
            pickup_eta_seconds?: number | null;
            /** @enum {string|null} */
            pickup_eta_source?: "ROUTER" | "STRAIGHT_LINE" | null;
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
         * @description STALE_LOCATION — no recent heartbeat or position; INACCURATE_LOCATION — the last position reported an accuracy worse than blizz.presence.eligibility-accuracy-meters (REQ-GEO-04, issue #141); CITY_NOT_ADMITTED — the driver is not admitted in the order's city (issue #141); OUTSIDE_CITY — further outside the city's polygon than its return zone (REQ-DS-07); PAUSED — the shift does not take orders now; NOT_ADMITTED — the account, admission or vehicle is not approved; CLASS — the vehicle has not the order's class; PAYMENT — no payment terminal for an order paid at one; BUSY — offered another order or on a trip; RESTRICTED — an active restriction (debt) or a pause for cancellations (ADR 0018); ALREADY_OFFERED — had this order offered already; PREVIOUS_DRIVER — was released from this order (or its related one); TOO_FAR — beyond the search radius; PICKUP_TOO_LONG — the pickup time is above the service's maximum pickup time (ADR 0020).
         * @enum {string}
         */
        ExclusionReason: "STALE_LOCATION" | "INACCURATE_LOCATION" | "CITY_NOT_ADMITTED" | "OUTSIDE_CITY" | "PAUSED" | "NOT_ADMITTED" | "CLASS" | "PAYMENT" | "BUSY" | "RESTRICTED" | "ALREADY_OFFERED" | "PREVIOUS_DRIVER" | "TOO_FAR" | "PICKUP_TOO_LONG";
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
