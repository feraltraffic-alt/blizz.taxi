export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        PushDevice: {
            /** Format: date-time */
            created_at: string;
            id: components["schemas"]["Uuid"];
            locale?: string | null;
            /** @enum {string} */
            platform: "ANDROID" | "IOS" | "WEB";
            /** @enum {string} */
            state: "ACTIVE" | "REVOKED";
        };
        PushDeviceCommand: {
            command_id: components["schemas"]["Uuid"];
        };
        PushDeviceList: {
            devices: components["schemas"]["PushDevice"][];
        };
        PushDeviceRegistration: {
            command_id: components["schemas"]["Uuid"];
            /** @description The phone's locale, e.g. uk-UA. The text of pushes follows the language of the profile. */
            locale?: string | null;
            /**
             * @description Case does not matter.
             * @enum {string}
             */
            platform: "ANDROID" | "IOS" | "WEB" | "android" | "ios" | "web";
            /** @description The Firebase Cloud Messaging registration token of the app. Registered again whenever it changes and after every sign-in; the same token for another person moves to them. A person keeps at most 5 active devices: registering a sixth revokes the one unused the longest. */
            token: string;
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
