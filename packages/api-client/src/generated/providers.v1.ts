export interface paths {
    "/payments/v1/callbacks/{merchant_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Provider notification (serviceUrl)
         * @description Stored once per fingerprint before it is applied; a result already reached is never rolled back. A trusted notification is answered with the provider's acknowledgement (WayForPay — orderReference, status "accept", time, signature) so the provider stops repeating it.
         */
        post: operations["receivePaymentNotification"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/payments/v1/fake/pay": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * FAKE provider top-up payment form
         * @description Available only when blizz.payments.fake-merchants-allowed is true; otherwise 404. Checks the merchant signature before delivering a signed fake notification. fake_decline simulates refusal. fake_lost_notification takes payment without notifying the server. returnUrl, when supplied, redirects the web view after processing.
         */
        post: operations["fakeProviderPay"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/payments/v1/fake/verify": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * FAKE provider card binding form
         * @description Available only when blizz.payments.fake-merchants-allowed is true; otherwise 404. Checks the merchant signature before delivering a signed fake notification. fake_decline simulates refusal. Approved bindings receive a fake recurring token. returnUrl, when supplied, redirects the web view after processing.
         */
        post: operations["fakeProviderVerify"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/payments/v1/return": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Page the rider's web view lands on when the provider is done
         * @description The app closes the web view when it reaches this address and reads the binding or the payment.
         */
        get: operations["paymentReturnPage"];
        put?: never;
        /**
         * Provider form return to the rider web view
         * @description Like GET, serves a completion page; no payment is trusted from this return request.
         */
        post: operations["paymentReturnPagePost"];
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
    receivePaymentNotification: {
        parameters: {
            query?: never;
            header?: never;
            path: {
                merchant_id: string;
            };
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
            /** @description Accepted. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        [key: string]: unknown;
                    };
                };
            };
            /** @description Not trusted (signature, merchant or account does not match); nothing changed. */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    fakeProviderPay: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/x-www-form-urlencoded": {
                    amount?: string;
                    currency?: string;
                    fake_decline?: string;
                    fake_lost_notification?: string;
                    merchantAccount?: string;
                    merchantDomainName?: string;
                    merchantSignature?: string;
                    orderDate?: string;
                    orderReference?: string;
                    "productCount[]"?: string;
                    "productName[]"?: string;
                    "productPrice[]"?: string;
                    returnUrl?: string;
                };
            };
        };
        responses: {
            /** @description Processed without a return URL. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Processed; redirect to returnUrl. */
            303: {
                headers: {
                    /** @description The supplied return URL. */
                    Location?: string;
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Signature mismatch. */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Unknown FAKE merchant, or FAKE pages disabled. */
            404: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    fakeProviderVerify: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/x-www-form-urlencoded": {
                    amount?: string;
                    currency?: string;
                    fake_decline?: string;
                    merchantAccount?: string;
                    merchantDomainName?: string;
                    merchantSignature?: string;
                    orderReference?: string;
                    returnUrl?: string;
                };
            };
        };
        responses: {
            /** @description Processed without a return URL. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Processed; redirect to returnUrl. */
            303: {
                headers: {
                    /** @description The supplied return URL. */
                    Location?: string;
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Signature mismatch. */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Unknown FAKE merchant, or FAKE pages disabled. */
            404: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    paymentReturnPage: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description A short page. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "text/html": string;
                };
            };
            /** @description Only GET and POST are served. */
            405: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    paymentReturnPagePost: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description A short completion page. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "text/html": string;
                };
            };
        };
    };
}
