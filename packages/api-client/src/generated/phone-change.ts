export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        NewPhone: {
            /** @description International format, "+" or "00" first. */
            phone: string;
        };
        /** @description A code was sent (to the current phone, or to the new one). Says nothing about who has the number. */
        PhoneChangeCode: {
            challenge_id: components["schemas"]["Uuid"];
            expires_at: components["schemas"]["Timestamp"];
            resend_available_at: components["schemas"]["Timestamp"];
        };
        /** @description Both codes: of purpose PHONE_CHANGE from the current phone and NEW_PHONE from the new one. A code of another purpose or account is refused (OTP_INVALID); a wrong code counts as an attempt. */
        PhoneChangeCommand: {
            command_id: components["schemas"]["Uuid"];
            current_challenge_id: components["schemas"]["Uuid"];
            current_code: string;
            new_challenge_id: components["schemas"]["Uuid"];
            new_code: string;
        };
        PhoneChanged: {
            phone: string;
            subject_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            version: number;
        };
        /** @description The code sent by the support code request to the new phone, which the person reads to support (owner decision 28.10.2026). The new phone is the one the code went to. */
        SupportPhoneChange: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            new_challenge_id: components["schemas"]["Uuid"];
            new_code: string;
            /** @description How the person was identified, e.g. the documents checked. */
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
