export interface paths {
    "/sandbox/v1/calls/events": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Inject an ARI event into the fake Asterisk
         * @description Handled like a real Asterisk event. Sandbox profile only.
         */
        post: operations["sandboxInjectCallEvent"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/sandbox/v1/calls/originated": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Fake outgoing call requests, oldest first
         * @description Sandbox profile only. Fake outgoing call requests, oldest first.
         */
        get: operations["sandboxObserveCallsOriginated"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/sandbox/v1/otp": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Last fake sign-in code
         * @description Sandbox profile only. Last fake sign-in code.
         */
        get: operations["sandboxObserveOtp"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/sandbox/v1/pushes": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Fake pushes for currently active devices, at most 100
         * @description Sandbox profile only. Returns no pushes for devices signed out since delivery; tokens are reduced to a suffix.
         */
        get: operations["sandboxObservePushes"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/sandbox/v1/sms": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Fake text messages, oldest first
         * @description Sandbox profile only. Fake text messages, oldest first.
         */
        get: operations["sandboxObserveSms"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
}
export type webhooks = Record<string, never>;
export interface components {
    schemas: never;
    responses: never;
    parameters: never;
    requestBodies: never;
    headers: never;
    pathItems: never;
}
export type $defs = Record<string, never>;
export interface operations {
    sandboxInjectCallEvent: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    [key: string]: unknown;
                };
            };
        };
        responses: {
            /** @description Event accepted by the fake provider. */
            202: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description This instance uses a real Asterisk and ignored the event. */
            404: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    sandboxObserveCallsOriginated: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Fake provider observations. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        /** Format: date-time */
                        at: string;
                        channel_id: string;
                        context: string;
                        dial: string;
                        endpoint: string;
                    }[];
                };
            };
            /** @description Invalid request parameters. */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    sandboxObserveOtp: {
        parameters: {
            query: {
                phone: string;
            };
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Fake provider observations. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        audience: string;
                        /** @enum {string} */
                        channel: "SMS" | "VOICE";
                        code: string;
                        phone: string;
                        /** Format: date-time */
                        sent_at: string;
                    };
                };
            };
            /** @description Invalid request parameters. */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description No code has been sent to this phone. */
            404: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    sandboxObservePushes: {
        parameters: {
            query: {
                after?: string;
                phone: string;
            };
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Fake provider observations. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        /** Format: date-time */
                        at: string;
                        body: string;
                        data: {
                            [key: string]: string;
                        };
                        title: string;
                        token_suffix: string;
                    }[];
                };
            };
            /** @description Invalid request parameters. */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    sandboxObserveSms: {
        parameters: {
            query: {
                phone: string;
            };
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Fake provider observations. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        phone: string;
                        /** Format: date-time */
                        sent_at: string;
                        text: string;
                    }[];
                };
            };
            /** @description Invalid request parameters. */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
}
