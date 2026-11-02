export interface paths {
    "/sandbox/v1/bank/next-answers": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * The fake bank's next answers for one rider's saved cards
         * @description Sandbox profile only (issue #140). The answers go to the next requests that use a saved card of the rider with this phone, before the shared script, so no other scenario takes them. LOST_ANSWER means the bank does it but its answer never comes; TIMEOUT means the request never arrives.
         */
        post: operations["sandboxQueueBankAnswers"];
        /** Drop the answers still queued for one rider's saved cards */
        delete: operations["sandboxClearBankAnswers"];
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
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
         * @description Handled like a real Asterisk event of the service's own exchange (ADR 0016, #275): the first service's, or the one named by `service`. Sandbox profile only.
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
    "/sandbox/v1/notifications": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The notifications of an order, oldest first
         * @description Sandbox profile only. Every push and SMS row created for the order and what became of it: SENT, EXPIRED, FAILED, or SUPERSEDED — no longer current when its turn came (the offer closed, the assignment replaced; REQ-NTF-03, AC-19, issue #143) and never sent.
         */
        get: operations["sandboxObserveNotifications"];
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
    sandboxQueueBankAnswers: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    answers: ("Approved" | "Declined" | "TIMEOUT" | "LOST_ANSWER")[];
                    phone: string;
                };
            };
        };
        responses: {
            /** @description Queued. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Invalid request. */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description No rider or no saved card for this phone. */
            404: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    sandboxClearBankAnswers: {
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
            /** @description Cleared; the cards' payments are answered normally again. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description No rider or no saved card for this phone. */
            404: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    sandboxInjectCallEvent: {
        parameters: {
            query?: {
                /** @description The code of an ACTIVE service; an unknown one → 404. */
                service?: string;
            };
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
            /** @description This instance uses a real Asterisk and ignored the event, or no such service. */
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
    sandboxObserveNotifications: {
        parameters: {
            query: {
                order_id: string;
            };
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description The notification rows. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        channel: string;
                        /** Format: date-time */
                        created_at: string;
                        data: {
                            [key: string]: string;
                        };
                        /** Format: uuid */
                        recipient_id: string;
                        recipient_type: string;
                        state: string;
                        template: string;
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
