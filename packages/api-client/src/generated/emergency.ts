export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        EmergencyActivity: {
            /** @description The staff member's requests during the grant, oldest first, at most 1000. */
            activity: {
                at: components["schemas"]["Timestamp"];
                method: string | null;
                outcome: string | null;
                path: string | null;
                status: number | null;
            }[];
        };
        EmergencyGrant: {
            /** @description Not revoked and not expired when read. */
            active: boolean;
            all_cities: boolean;
            city_ids: components["schemas"]["Uuid"][];
            expires_at: components["schemas"]["Timestamp"];
            granted_at: components["schemas"]["Timestamp"];
            granted_by: components["schemas"]["Uuid"];
            id: components["schemas"]["Uuid"];
            permissions: string[];
            reason: string;
            revoke_reason: string | null;
            /** Format: date-time */
            revoked_at: string | null;
            revoked_by: components["schemas"]["Uuid"] | null;
            staff_id: components["schemas"]["Uuid"];
        };
        EmergencyGrantList: {
            grants: components["schemas"]["EmergencyGrant"][];
        };
        GrantEmergencyAccess: {
            all_cities: boolean;
            /** @description Required unless all_cities. */
            city_ids?: components["schemas"]["Uuid"][];
            command_id: components["schemas"]["Uuid"];
            minutes: number;
            /** @description From the permission catalog. */
            permissions: string[];
            reason: string;
        };
        RevokeEmergencyAccess: {
            command_id: components["schemas"]["Uuid"];
            reason: string;
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
