export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        RaiseRiskFlag: {
            city_id: components["schemas"]["Uuid"];
            command_id: components["schemas"]["Uuid"];
            driver_id: components["schemas"]["Uuid"];
            reason: string;
        };
        /** @description OPEN → CONFIRMED or DISMISSED, once; the reason is required and audited. */
        ReviewRiskFlag: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        RiskFlag: {
            /** @description Null only for DUPLICATE_DOCUMENT (a driver applicant belongs to no city). */
            city_id: components["schemas"]["Uuid"] | null;
            driver_id: components["schemas"]["Uuid"];
            /** @description For IMPOSSIBLE_MOVEMENT: work_session_id, track_point_id, distance_m, seconds, speed_kph, recorded_at. For DUPLICATE_DOCUMENT: document_id, other_driver_id, other_document_id. Never coordinates. */
            evidence: {
                [key: string]: unknown;
            };
            id: components["schemas"]["Uuid"];
            kind: components["schemas"]["RiskFlagKind"];
            /** Format: date-time */
            raised_at: string;
            /** @description The staff member who raised a MANUAL flag; null for an automatic one. */
            raised_by: components["schemas"]["Uuid"] | null;
            /** @description Why a MANUAL flag was raised; null for an automatic one. */
            reason: string | null;
            review_reason: string | null;
            /** Format: date-time */
            reviewed_at: string | null;
            reviewed_by: components["schemas"]["Uuid"] | null;
            state: components["schemas"]["RiskFlagState"];
            /** Format: int64 */
            version: number;
        };
        /**
         * @description IMPOSSIBLE_MOVEMENT — two consecutive positions of a shift imply a speed above the limit (250 km/h by default) over more than the minimum distance; at most one per shift and hour. MANUAL — raised by staff. DUPLICATE_DOCUMENT — the driver added a document whose file has the same content as another driver's (issue #105); at most one per pair of drivers; of no city, so only staff with all cities see it.
         * @enum {string}
         */
        RiskFlagKind: "IMPOSSIBLE_MOVEMENT" | "MANUAL" | "CASH_DISPUTE" | "DUPLICATE_DOCUMENT";
        RiskFlagList: {
            flags: components["schemas"]["RiskFlag"][];
        };
        /** @enum {string} */
        RiskFlagState: "OPEN" | "CONFIRMED" | "DISMISSED";
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
