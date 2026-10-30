export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        Place: {
            /** @description Only for OWN. */
            address_id?: components["schemas"]["Uuid"] | null;
            house: string;
            /** @description Pickup instructions of an own address. */
            instructions?: string | null;
            label: string;
            point: {
                lat: number;
                lon: number;
            };
            /** @description HISTORY (the rider's past orders), OWN (the service's address book), GOOGLE, VISICOM; FAKE in the sandbox. */
            source: string;
            /** @description Empty when the source does not split the address. */
            street: string;
        };
        PlaceList: {
            places: components["schemas"]["Place"][];
            /** @description The provider in force (BUILT_IN, GOOGLE, VISICOM; FAKE in the sandbox) — for its attribution. */
            provider: string;
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
