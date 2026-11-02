export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        /** @description Replaces the city's contacts. A command: a repeat with the same command_id returns the first result, the same command_id with another body is a 409, and a stale expected_version is a 409. */
        ChangeSafetyContacts: {
            command_id: components["schemas"]["Uuid"];
            emergency_number: components["schemas"]["EmergencyNumber"];
            /** Format: int64 */
            expected_version: number;
            extra?: components["schemas"]["ExtraContact"][];
            /** @description Why the contacts are changed; goes to the audit log. */
            reason: string;
            support_phone?: components["schemas"]["Phone"] | null;
        };
        /**
         * @description The local emergency number, digits only (2–6), e.g. 112.
         * @example 112
         */
        EmergencyNumber: string;
        ExtraContact: {
            label: components["schemas"]["ExtraLabels"];
            phone: components["schemas"]["Phone"];
        };
        /**
         * @description The contact's name by language (uk, pl, ru, en), at most 80 characters each; the service's default language is required.
         * @example {
         *       "uk": "Поліція",
         *       "pl": "Policja",
         *       "ru": "Полиция",
         *       "en": "Police"
         *     }
         */
        ExtraLabels: {
            [key: string]: string;
        };
        /**
         * @description A phone number in E.164.
         * @example +380441234567
         */
        Phone: string;
        /** @description What the safety button shows for a city, labels in the caller's language (else the service's default). Never a 404: a city nobody configured gets emergency_number 112 and no support phone. disclaimer_code is always NO_AUTO_DISPATCH — the app shows its fixed text that the service does not call emergency services by itself. */
        SafetyContacts: {
            city_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            disclaimer_code: "NO_AUTO_DISPATCH";
            emergency_number: components["schemas"]["EmergencyNumber"];
            extra: {
                label: string;
                phone: components["schemas"]["Phone"];
            }[];
            support_phone: components["schemas"]["Phone"] | null;
        };
        /** @description The contacts of a city in force for the admin panel; version 0 with the default (112, nothing else) until the first change. */
        SafetyContactsVersion: {
            /** Format: date-time */
            changed_at: string | null;
            changed_by: components["schemas"]["Uuid"] | null;
            city_id: components["schemas"]["Uuid"];
            emergency_number: components["schemas"]["EmergencyNumber"];
            extra: components["schemas"]["ExtraContact"][];
            reason: string | null;
            support_phone: components["schemas"]["Phone"] | null;
            /** Format: int64 */
            version: number;
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
