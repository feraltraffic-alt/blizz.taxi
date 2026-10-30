export interface paths {
    "/sandbox/v1/retention/fixtures/{fixture}": {
        parameters: {
            query?: never;
            header?: never;
            path: {
                fixture: string;
            };
            cookie?: never;
        };
        /**
         * Count surviving synthetic retention events
         * @description Only the requested fixture group is counted; an absent group has zero counts.
         */
        get: operations["sandboxReadRetentionFixtures"];
        put?: never;
        /**
         * Create synthetic old DONE, recent DONE and old FAILED events
         * @description Restricted to the supplied fixture UUID and RetentionSandboxFixture event type. Restore through DELETE in an EXIT trap. Never creates business events or payments.
         */
        post: operations["sandboxCreateRetentionFixtures"];
        /**
         * Remove only synthetic rows of this fixture group
         * @description Test cleanup can also remove its deliberately FAILED fixture; production retention never deletes FAILED events.
         */
        delete: operations["sandboxRemoveRetentionFixtures"];
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/sandbox/v1/retention/run": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Run one bounded cleanup invocation per kind
         * @description Reads the real current policy. A zero setting does nothing. Removes at most 1,000 cleanup items per kind; files and linked metadata count as one recording item. Failures remain retryable and appear in the result.
         */
        post: operations["sandboxRunRetention"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
}
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        BatchResult: {
            deleted: number;
            examined: number;
            failures: number;
        };
        /**
         * @description Domain error codes (section 22.4). VALIDATION_FAILED, UNAUTHENTICATED, OTP_INVALID, PICKUP_TOO_FAR and
         *     INTERNAL_ERROR are additions to the list in 22.4.
         *     ACTIVE_ORDER_LIMIT (409): the payer already has active_orders_per_payer orders not in a final state, pre-orders
         *     included (ADR 0012); it replaces ORDER_ALREADY_ACTIVE, which is no longer returned.
         *     ACCOUNT_NOT_ACTIVE (403): a new order for a rider whose account is not ACTIVE (e.g. a deletion request is
         *     pending), from the app or by an operator; a caller without an account is not affected.
         *     PICKUP_TOO_FAR (422): arrival reported far from the pickup (can be confirmed with a reason, REQ-ASG-06), or a
         *     claim of an order in the ALL tab whose pickup is outside the tab's radius from the driver (issue #102).
         *     PHONE_COUNTRY_NOT_SERVED (422): a one-time code was asked for a number outside the countries the service
         *     sends codes to (Poland and Ukraine by default); nothing is sent and no challenge is stored.
         *     CHARGEBACK_NOT_ALLOWED (422): a chargeback larger than what is left of the order's card payment (its
         *     captures, charges and tips, less earlier chargebacks not won back), or on an order not paid by card.
         *     TOP_UP_DAILY_LIMIT (422): a staff top-up of a driver balance or a rider wallet would take the staff member
         *     over the service's staff_top_ups limit for the currency in the last 24 hours; nothing is credited.
         *     ACCEPTANCE_REQUIRED (403): a rider's new order or a driver going online while a legal text in force that must
         *     be accepted is not (REQ-PRV-08); GET /api/{rider|driver}/v1/legal tells which.
         *     PAYMENT_PENDING and PAYMENT_UNKNOWN appear in a Problem only as 409, when an action conflicts with a
         *     payment still in progress. A command whose own payment is pending answers 202 with AcceptedOperation,
         *     never with a Problem (docs/decisions/0003).
         * @enum {string}
         */
        ErrorCode: "VALIDATION_FAILED" | "QUOTE_EXPIRED" | "QUOTE_MISMATCH" | "ORDER_ALREADY_ACTIVE" | "ACTIVE_ORDER_LIMIT" | "OFFER_EXPIRED" | "OFFER_REVOKED" | "ORDER_ALREADY_ASSIGNED" | "DRIVER_BUSY" | "DRIVER_NOT_ELIGIBLE" | "STATE_CONFLICT" | "VERSION_CONFLICT" | "IDEMPOTENCY_CONFLICT" | "PAYMENT_PENDING" | "PAYMENT_UNKNOWN" | "PAYMENT_DECLINED" | "WALLET_INSUFFICIENT" | "OUTSIDE_SERVICE_AREA" | "CITY_PAUSED" | "CITY_CLOSED" | "PAYMENT_METHOD_NOT_OFFERED" | "LOCATION_NOT_FRESH" | "PICKUP_TOO_FAR" | "PHONE_COUNTRY_NOT_SERVED" | "CHARGEBACK_NOT_ALLOWED" | "TOP_UP_DAILY_LIMIT" | "RATE_LIMITED" | "UNAUTHENTICATED" | "ACCESS_DENIED" | "ACCOUNT_NOT_ACTIVE" | "ACCEPTANCE_REQUIRED" | "NOT_FOUND" | "PROVIDER_UNAVAILABLE" | "OTP_INVALID" | "UPGRADE_REQUIRED" | "INTERNAL_ERROR";
        FieldError: {
            code: string;
            /** @description JSON pointer or dotted path of the offending field. */
            field: string;
            message?: string;
        };
        FixtureCounts: {
            /** Format: int64 */
            failed: number;
            /** Format: int64 */
            old_done: number;
            /** Format: int64 */
            recent_done: number;
        };
        /** @description RFC 9457 Problem Details with platform extensions (REQ-API-07, REQ-API-08). Never reveals whether someone else's object exists. */
        Problem: {
            code: components["schemas"]["ErrorCode"];
            correlation_id: components["schemas"]["Uuid"];
            /**
             * Format: int64
             * @description Present on VERSION_CONFLICT / STATE_CONFLICT so the client can fetch a fresh snapshot.
             */
            current_version?: number;
            detail?: string;
            field_errors?: components["schemas"]["FieldError"][];
            /** Format: uri-reference */
            instance?: string;
            /** @description On UPGRADE_REQUIRED (426), the lowest build allowed (REQ-API-10). */
            minimum_version?: string;
            retry_after_seconds?: number;
            retryable?: boolean;
            status: number;
            title: string;
            /** Format: uri-reference */
            type: string;
        };
        /** Format: uuid */
        Uuid: string;
    };
    responses: {
        /** @description Malformed request or failed validation. */
        BadRequest: {
            headers: {
                [name: string]: unknown;
            };
            content: {
                "application/problem+json": components["schemas"]["Problem"];
            };
        };
        /** @description Access denied. 404 may be returned instead to avoid revealing the object (REQ-API-07). */
        Forbidden: {
            headers: {
                [name: string]: unknown;
            };
            content: {
                "application/problem+json": components["schemas"]["Problem"];
            };
        };
        /** @description Missing, expired or revoked session. */
        Unauthorized: {
            headers: {
                [name: string]: unknown;
            };
            content: {
                "application/problem+json": components["schemas"]["Problem"];
            };
        };
    };
    parameters: never;
    requestBodies: never;
    headers: never;
    pathItems: never;
}
export type $defs = Record<string, never>;
export interface operations {
    sandboxReadRetentionFixtures: {
        parameters: {
            query?: never;
            header?: never;
            path: {
                fixture: string;
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Current counts. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["FixtureCounts"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    sandboxCreateRetentionFixtures: {
        parameters: {
            query?: never;
            header?: never;
            path: {
                fixture: string;
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Fixture counts after insertion. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["FixtureCounts"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    sandboxRemoveRetentionFixtures: {
        parameters: {
            query?: never;
            header?: never;
            path: {
                fixture: string;
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Fixture removed, including an already absent group. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    sandboxRunRetention: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Result for every kind, including zero-count runs and explicit failures. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        call_recordings: components["schemas"]["BatchResult"];
                        code_deliveries: components["schemas"]["BatchResult"];
                        command_receipts: components["schemas"]["BatchResult"];
                        consumer_receipts: components["schemas"]["BatchResult"];
                        delivered_events: components["schemas"]["BatchResult"];
                        quarantined_files: components["schemas"]["BatchResult"];
                        sessions: components["schemas"]["BatchResult"];
                        sign_in_codes: components["schemas"]["BatchResult"];
                        upload_sessions: components["schemas"]["BatchResult"];
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
}
