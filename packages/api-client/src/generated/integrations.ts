export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        ChangeIntegrations: {
            changes: {
                name: string;
                /** @description Null or blank removes the panel's value (the environment's applies again). */
                value?: string | null;
            }[];
            command_id: components["schemas"]["Uuid"];
            /** @description The staff member's own password, asked again for every change of keys. */
            password: string;
            reason: string;
        };
        ChangePaymentMerchant: {
            /** @description The full list of cities; null keeps them. */
            city_ids?: components["schemas"]["Uuid"][] | null;
            command_id: components["schemas"]["Uuid"];
            domain?: string | null;
            password: string;
            reason: string;
            /** @description A new key; null keeps the current one. */
            secret?: string | null;
        };
        CreatePaymentMerchant: {
            account: string;
            /** @description A city already served by another merchant moves to this one. */
            city_ids?: components["schemas"]["Uuid"][];
            command_id: components["schemas"]["Uuid"];
            currency: string;
            domain: string;
            password: string;
            /**
             * @description WAYFORPAY; FAKE only on development and sandbox servers.
             * @enum {string}
             */
            provider: "WAYFORPAY" | "FAKE";
            reason: string;
            secret: string;
        };
        IntegrationCheck: {
            group: string;
            /** @description What was checked; never a key. */
            message: string;
            ok: boolean;
        };
        IntegrationField: {
            /** Format: date-time */
            changed_at?: string | null;
            changed_by?: components["schemas"]["Uuid"] | null;
            description: string;
            /** @description The value goes to the apps in the public start-up data (config.v1 bootstrap). */
            for_apps: boolean;
            /** @enum {string} */
            group: "push" | "routing" | "maps" | "geocoding" | "otp";
            /** @description The last characters of a SECRET, e.g. "…a1b2". */
            hint?: string | null;
            /** @enum {string} */
            kind: "TEXT" | "SECRET" | "FLAG";
            label: string;
            /** @example push.fcm.credentials */
            name: string;
            set: boolean;
            /** @description Always null for a SECRET. */
            value?: string | null;
        };
        IntegrationFieldList: {
            fields: components["schemas"]["IntegrationField"][];
        };
        PaymentMerchant: {
            account: string;
            city_ids: components["schemas"]["Uuid"][];
            /** Format: date-time */
            created_at: string;
            currency: string;
            domain: string;
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            provider: "WAYFORPAY" | "FAKE";
            secret_hint?: string | null;
            /**
             * @description NONE — the merchant cannot be used until a key is entered.
             * @enum {string}
             */
            secret_source: "PANEL" | "ENVIRONMENT" | "NONE";
        };
        PaymentMerchantList: {
            merchants: components["schemas"]["PaymentMerchant"][];
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
