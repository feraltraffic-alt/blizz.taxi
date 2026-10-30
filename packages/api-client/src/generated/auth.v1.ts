export interface paths {
    "/auth/v1/logout": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * End the session
         * @description Revokes the session of the given refresh token. Always succeeds, also for unknown tokens.
         */
        post: operations["logout"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/auth/v1/otp/challenges": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Request a one-time code
         * @description Sends a code by SMS or by a call, never both for one request. Only numbers of the served countries (Poland and Ukraine by default) get a code; any other is 422 PHONE_COUNTRY_NOT_SERVED. Limited by the resend delay, the per-number budget (riders and drivers together), the per-address-and-number, per-address, per-device and global budgets, and a per-number budget of calls (issue #101).
         */
        post: operations["requestOtpChallenge"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/auth/v1/otp/verify": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Verify the code and open a session
         * @description A wrong code still uses one of the challenge's attempts. Wrong, expired, used and exhausted
         *     codes all return OTP_INVALID. A first sign-in creates the account.
         */
        post: operations["verifyOtp"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/auth/v1/staff/sign-in": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Staff sign in with login and password
         * @description Into the admin panel (audience ADMIN) or the operator workstation (OPERATOR), owner decision 27.10.2026.
         *     A wrong login and a wrong password both give 401 UNAUTHENTICATED. After too many wrong passwords in a
         *     row the account is locked for a while: 429 with Retry-After. So is a network address after 30 wrong sign-ins within the lockout, whatever the logins (threat model A3). A suspended account gets 403. When
         *     password_change_required is true the token only allows changing the password (/me/password).
         */
        post: operations["staffSignIn"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/auth/v1/token/refresh": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Rotate the refresh token */
        post: operations["refreshSession"];
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
        /**
         * @description CLIENT for the rider app, DRIVER for the driver app.
         * @enum {string}
         */
        OtpAudience: "CLIENT" | "DRIVER";
        OtpChallenge: {
            challenge_id: components["schemas"]["Uuid"];
            /**
             * @description The channel the code is sent by (issue
             * @enum {string}
             */
            channel?: "SMS" | "VOICE";
            expires_at: components["schemas"]["Timestamp"];
            resend_available_at: components["schemas"]["Timestamp"];
        };
        OtpChallengeRequest: {
            audience: components["schemas"]["OtpAudience"];
            /**
             * @description "Call me instead" (ADR 0012 Q-18): VOICE asks for a call that speaks the code, SMS for a text. Omitted — the channel set in the admin panel, or its fallback when the last code to this number did not get through. A call is made only on a resend (an earlier code for this number within the hour) and only while the number's hourly budget of calls lasts (429 after it); a first request for VOICE gets the configured channel. One request is sent by one channel only; the response's channel tells which. Same resend delay and limits either way.
             * @enum {string|null}
             */
            channel?: "SMS" | "VOICE" | null;
            /** @description Stable installation id of the app; used for limits and the session record. */
            device_ref?: string;
            /**
             * @description International format; normalized to E.164 by the server.
             * @example +380671234567
             */
            phone: string;
        };
        OtpVerifyRequest: {
            challenge_id: components["schemas"]["Uuid"];
            code: string;
            device_ref?: string;
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
        RefreshRequest: {
            refresh_token: string;
        };
        Session: {
            access_expires_at: components["schemas"]["Timestamp"];
            /** @description Bearer token for the audience API. */
            access_token: string;
            /** @description True on the first sign-in, when the account was just created. */
            account_created?: boolean;
            /**
             * @description API audience the access token is valid for (/api/{audience}/v1).
             * @enum {string}
             */
            audience: "rider" | "driver" | "admin" | "operator";
            /** @description Staff only — the initial or temporary password must be changed before anything else. */
            password_change_required?: boolean;
            refresh_expires_at: components["schemas"]["Timestamp"];
            /** @description Single-use; replaced on every refresh. */
            refresh_token: string;
            session_id: components["schemas"]["Uuid"];
            subject: components["schemas"]["Subject"];
        };
        StaffSignInRequest: {
            /** @enum {string} */
            audience: "ADMIN" | "OPERATOR";
            device_ref?: string;
            login: string;
            /** Format: password */
            password: string;
        };
        Subject: {
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            type: "CLIENT" | "DRIVER" | "STAFF";
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
        /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
        CorrelationId: components["schemas"]["Uuid"];
    };
    requestBodies: never;
    headers: {
        /** @description Seconds to wait before retrying. */
        RetryAfter: number;
    };
    pathItems: never;
}
export type $defs = Record<string, never>;
export interface operations {
    logout: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["RefreshRequest"];
            };
        };
        responses: {
            /** @description Session ended. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            400: components["responses"]["BadRequest"];
        };
    };
    requestOtpChallenge: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["OtpChallengeRequest"];
            };
        };
        responses: {
            /** @description Code requested. The body is identical for known and unknown phones. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OtpChallenge"];
                };
            };
            400: components["responses"]["BadRequest"];
            422: components["responses"]["UnprocessableEntity"];
            429: components["responses"]["TooManyRequests"];
            503: components["responses"]["ServiceUnavailable"];
        };
    };
    verifyOtp: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["OtpVerifyRequest"];
            };
        };
        responses: {
            /** @description Session opened. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Session"];
                };
            };
            400: components["responses"]["BadRequest"];
            403: components["responses"]["Forbidden"];
            422: components["responses"]["UnprocessableEntity"];
            429: components["responses"]["TooManyRequests"];
        };
    };
    staffSignIn: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["StaffSignInRequest"];
            };
        };
        responses: {
            /** @description Session opened. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Session"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            429: components["responses"]["TooManyRequests"];
        };
    };
    refreshSession: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["RefreshRequest"];
            };
        };
        responses: {
            /** @description New token pair for the same session. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Session"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            429: components["responses"]["TooManyRequests"];
        };
    };
}
