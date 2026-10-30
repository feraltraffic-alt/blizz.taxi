export interface paths {
    "/api/config/v1/bootstrap": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Brand, languages, call mode and cities
         * @description Cacheable for a minute. settings_version grows with every change in the admin panel.
         */
        get: operations["getBootstrap"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/config/v1/legal/{audience}/{kind}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * A legal text in force
         * @description For showing before sign-in: the version in force of a document, in the language asked for or the first of uk, pl, ru, en it has. 404 when no version is in force.
         */
        get: operations["getLegalText"];
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
    schemas: {
        Bootstrap: {
            /** @description Per-platform version policy (REQ-API-10): below minimum_version the app must update, below latest_version it may. "0.0.0" means no policy. */
            app_versions?: {
                driver_android?: components["schemas"]["PlatformVersions"] | null;
                driver_ios?: components["schemas"]["PlatformVersions"] | null;
                require_version_header?: boolean;
                rider_android?: components["schemas"]["PlatformVersions"] | null;
                rider_ios?: components["schemas"]["PlatformVersions"] | null;
            } | null;
            brand: components["schemas"]["Brand"];
            calls: {
                /**
                 * @description DIRECT — the app dials the other party; VIA_SERVICE_NUMBERS — through service_phone.
                 * @enum {string}
                 */
                mode: "DIRECT" | "VIA_SERVICE_NUMBERS";
                service_phone?: string | null;
            };
            cities: {
                code: string;
                currency: string;
                id: components["schemas"]["Uuid"];
                name: string;
                /** @description New orders are refused with CITY_PAUSED for now (REQ-TEN-06). */
                orders_paused: boolean;
                /** @description The methods an order in this city may use. */
                payment_methods: components["schemas"]["CityPaymentMethod"][];
                timezone: string;
                /** @description In the city's time zone; empty — around the clock. An order for now outside them is refused (CITY_CLOSED); one for later only needs its pickup time inside them (REQ-TEN-03). */
                working_hours: components["schemas"]["WorkingHours"][];
            }[];
            languages: components["schemas"]["Languages"];
            /** @description The map of the apps, as set in the admin panel (Integrations). The keys are restricted to the apps' package names, bundle ids and domains at the provider, so they are not secrets. Null until set. */
            maps: {
                android_key: string | null;
                ios_key: string | null;
                /** @enum {string|null} */
                provider: "GOOGLE" | "MAPBOX" | "MAPTILER" | null;
                web_key: string | null;
            };
            /** @description What the rider app needs to offer "order for later". */
            preorders: {
                max_days_ahead: number;
                threshold_minutes: number;
            };
            /** Format: int64 */
            settings_version: number;
        };
        /** @description Shown by the apps; never changes business rules (REQ-TEN-07). */
        Brand: {
            accent_color?: string | null;
            /** Format: uri */
            logo_url?: string | null;
            /** @description Text on the primary colour; contrast with it at least 4.5:1. */
            on_primary_color: string;
            primary_color: string;
            /** Format: uri */
            privacy_policy_url?: string | null;
            service_name: string;
            /** Format: email */
            support_email?: string | null;
            support_phone?: string | null;
            support_telegram?: string | null;
            /** Format: uri */
            terms_url?: string | null;
        };
        /** @enum {string} */
        CityPaymentMethod: "CASH" | "CARD" | "TERMINAL";
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
        Languages: {
            /** @enum {string} */
            default_language: "uk" | "pl" | "ru" | "en";
            enabled: ("uk" | "pl" | "ru" | "en")[];
        };
        /** @enum {string} */
        LegalAudience: "RIDER" | "DRIVER";
        /**
         * @description DRIVER_AGREEMENT is for drivers only.
         * @enum {string}
         */
        LegalKind: "TERMS" | "PRIVACY_NOTICE" | "DRIVER_AGREEMENT";
        /** @enum {string} */
        LegalLanguage: "uk" | "pl" | "ru" | "en";
        /** @description One text to show, in the language asked for or the first of uk, pl, ru, en the version has. */
        LegalText: {
            audience: components["schemas"]["LegalAudience"];
            effective_from: components["schemas"]["Timestamp"];
            kind: components["schemas"]["LegalKind"];
            language: components["schemas"]["LegalLanguage"];
            number: number;
            text: string;
            version_id: components["schemas"]["Uuid"];
        };
        PlatformVersions: {
            /** @description Current recommended build. The app may show "update available". */
            latest_version: string;
            /** @description Lowest build still allowed. Below this the four checked actions return 426. */
            minimum_version: string;
        };
        /**
         * @description Pre-orders (ADR 0006). A pickup time at least threshold_minutes ahead makes a pre-order; at most
         *     max_days_ahead days ahead. BROADCAST_BEFORE — the search starts release_minutes_before the pickup.
         *     RESERVATION — drivers see it at once and reserve it; the driver confirms "On my way" from
         *     confirm_minutes_before the pickup, within confirm_window_minutes, or loses it; he may drop it himself
         *     until driver_cancel_until_minutes_before the pickup, later only a dispatcher can.
         */
        Preorders: {
            confirm_minutes_before: number;
            confirm_window_minutes: number;
            /** @enum {string} */
            dispatch: "RESERVATION" | "BROADCAST_BEFORE";
            driver_cancel_until_minutes_before: number;
            /** @description Two weeks at most (owner decision 28.10.2026). */
            max_days_ahead: number;
            release_minutes_before: number;
            threshold_minutes: number;
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
        /** @description One interval of work in the city's time zone, starting on each of the given ISO days (1 = Monday). An interval whose `to` is not after `from` runs past midnight into the next day ("22:00"–"06:00"); `from` equal to `to` is 24 hours from `from`. */
        WorkingHours: {
            days_of_week: number[];
            from: string;
            to: string;
        };
    };
    responses: {
        /** @description Object not found or not visible to the caller. */
        NotFound: {
            headers: {
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
    getBootstrap: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Bootstrap"];
                };
            };
            429: components["responses"]["TooManyRequests"];
        };
    };
    getLegalText: {
        parameters: {
            query?: {
                language?: string;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                audience: "rider" | "driver";
                kind: "terms" | "privacy_notice" | "driver_agreement";
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["LegalText"];
                };
            };
            404: components["responses"]["NotFound"];
            429: components["responses"]["TooManyRequests"];
        };
    };
}
