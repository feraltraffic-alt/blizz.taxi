export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        /** @description Result of an asynchronous command. 202 means the work is queued, not that it happened (REQ-API-11). */
        AcceptedOperation: {
            operation_id: components["schemas"]["Uuid"];
            /** Format: uri-reference */
            status_url: string;
        };
        /**
         * @description Base of every state-changing command (REQ-API-03, REQ-API-04).
         *     `command_id` is the idempotency key: a repeat with the same body returns the original outcome;
         *     a repeat with a different body fails with IDEMPOTENCY_CONFLICT. Clients never generate a new
         *     `command_id` to retry automatically (REQ-API-08).
         */
        Command: {
            command_id: components["schemas"]["Uuid"];
            /**
             * Format: int64
             * @description Version of the aggregate the client acted on; required for commands on an existing object.
             */
            expected_version?: number;
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
        /** @description WGS84 coordinates (REQ-GEO-01). */
        GeoPoint: {
            lat: number;
            lon: number;
        };
        /** @description Amount in the currency's minor units; precision comes from the currency reference, not a fixed two decimals (REQ-DATA-01, REQ-PRC-02). */
        Money: {
            /**
             * Format: int64
             * @example 11000
             */
            amount_minor: number;
            /** @example UAH */
            currency: string;
        };
        /** @description Cursor pagination with a stable created_at + id order (REQ-API-09). */
        PageInfo: {
            has_more: boolean;
            next_cursor?: string | null;
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
        /**
         * Format: date-time
         * @description Moment in UTC, RFC 3339.
         * @example 2026-10-26T12:00:00Z
         */
        Timestamp: string;
        /** Format: uuid */
        Uuid: string;
    };
    responses: {
        /** @description Command queued; poll status_url for the outcome. */
        Accepted: {
            headers: {
                [name: string]: unknown;
            };
            content: {
                "application/json": components["schemas"]["AcceptedOperation"];
            };
        };
        /** @description Malformed request or failed validation. */
        BadRequest: {
            headers: {
                [name: string]: unknown;
            };
            content: {
                "application/problem+json": components["schemas"]["Problem"];
            };
        };
        /** @description State, version, idempotency or domain conflict; fetch a snapshot instead of retrying blindly. */
        Conflict: {
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
        /** @description Object not found or not visible to the caller. */
        NotFound: {
            headers: {
                [name: string]: unknown;
            };
            content: {
                "application/problem+json": components["schemas"]["Problem"];
            };
        };
        /** @description A required provider or dependency is unavailable; safe retry guidance is in the body. */
        ServiceUnavailable: {
            headers: {
                "Retry-After": components["headers"]["RetryAfter"];
                [name: string]: unknown;
            };
            content: {
                "application/problem+json": components["schemas"]["Problem"];
            };
        };
        /** @description Rate limit exceeded. */
        TooManyRequests: {
            headers: {
                "Retry-After": components["headers"]["RetryAfter"];
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
        /** @description Business rule rejected the request (e.g. OUTSIDE_SERVICE_AREA, PAYMENT_DECLINED). */
        UnprocessableEntity: {
            headers: {
                [name: string]: unknown;
            };
            content: {
                "application/problem+json": components["schemas"]["Problem"];
            };
        };
    };
    parameters: {
        /**
         * @description App platform (REQ-API-10). Optional until staff turn on require_version_header.
         *     Web, admin and operator requests are never checked.
         */
        AppPlatform: "RIDER_ANDROID" | "RIDER_IOS" | "DRIVER_ANDROID" | "DRIVER_IOS";
        /** @description Semantic version MAJOR.MINOR.PATCH of the app build (REQ-API-10). */
        AppVersion: string;
        /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
        CorrelationId: components["schemas"]["Uuid"];
        Cursor: string;
        Limit: number;
    };
    requestBodies: never;
    headers: {
        /** @description Correlation id of the request. */
        CorrelationId: components["schemas"]["Uuid"];
        /** @description Seconds to wait before retrying. */
        RetryAfter: number;
    };
    pathItems: never;
}
export type $defs = Record<string, never>;
export type operations = Record<string, never>;
