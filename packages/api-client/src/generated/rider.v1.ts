export interface paths {
    "/api/rider/v1/addresses": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Search the service's own addresses near a point
         * @description Resolves the service city from lat/lon, searches visible service-owned addresses only and uses
         *     the point to break ranking ties by distance (REQ-GEO-13, REQ-GEO-15, REQ-GEO-16). Provider
         *     geocoding is intentionally not part of this endpoint (Q-08).
         */
        get: operations["searchRiderAddresses"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/addresses/nearest": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Closest visible service-owned address within 100 metres */
        get: operations["getNearestRiderAddress"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/cancel-reasons": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Reasons a rider can give when cancelling
         * @description The rider's list from the admin panel; the app shows the label in the user's language and sends the code.
         */
        get: operations["listRiderCancelReasons"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/card-bindings": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Start adding a card
         * @description For the merchant of the city (404 when the city takes no cards). The app POSTs `fields` to `url` in a web view (the provider's page with 3-D Secure); when the web view reaches `return_url` the app reads the binding.
         */
        post: operations["startCardBinding"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/card-bindings/{binding_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Result of adding a card */
        get: operations["getCardBinding"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/cards": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The rider's saved cards
         * @description Only the masked number and type; the provider's token never leaves the server (REQ-PAY-08, ADR 0008).
         */
        get: operations["listCards"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/cards/{card_id}/remove": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Remove a saved card */
        post: operations["removeCard"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/legal": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Legal texts in force and what I still have to accept
         * @description The versions in force for riders. One with acceptance_required and not accepted blocks new orders (403 ACCEPTANCE_REQUIRED); a trip in progress goes on. The text itself — GET /api/config/v1/legal/{audience}/{kind}.
         */
        get: operations["getLegalInForce"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/legal/acceptances": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Accept a legal text
         * @description A command: records that the person accepted the version in force, shown in the language given, from this session. Accepted once: a repeat, also with another language, returns the first acceptance. A version that is no longer in force → 409 STATE_CONFLICT. Kept as a legal fact, also after the account is deleted.
         */
        post: operations["acceptLegalText"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Who the access token belongs to */
        get: operations["getRiderMe"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me/data-exports": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** My copies of my data */
        get: operations["listDataExports"];
        put?: never;
        /**
         * Ask for a copy of my data
         * @description Step two, a command: with the code of step one the server starts building one JSON file with the rider's data in every part of the service — profile and sessions, orders with routes and prices, ratings, tips, chat messages sent, money movements, cards and card payments, promotion bonuses, push devices, support cases, calls and codes sent. Other people's data (the driver, the person an order was for) and staff are left out. At most one a day (409 STATE_CONFLICT); an account that is not ACTIVE or DELETION_PENDING → 403 ACCOUNT_NOT_ACTIVE; wrong code → 422 OTP_INVALID. Audited.
         */
        post: operations["requestDataExport"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me/data-exports/{export_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** A copy of my data */
        get: operations["getDataExport"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me/data-exports/{export_id}/file": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Download the copy of my data
         * @description The JSON file, as an attachment, Cache-Control no-store; only while READY and not expired (7 days), otherwise 409 STATE_CONFLICT. Audited.
         */
        get: operations["downloadDataExport"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me/data-exports/challenge": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Send a code to confirm a copy of my data
         * @description Step one of getting a copy of the personal data (REQ-PRV-07): a code of purpose DATA_EXPORT goes to the rider's current phone, with the same resend delay and budgets as sign-in.
         */
        post: operations["requestDataExportCode"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me/deletion-request": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Ask to delete the account
         * @description Step two, a command: with the code of step one, ACTIVE or BLOCKED → DELETION_PENDING. Every other session of the rider ends; this one stays, so the app can show the request and offer to cancel it. While the request is pending the rider can sign in but not order (403 ACCOUNT_NOT_ACTIVE). Staff complete it by hand: the profile is anonymized, the bonuses burn; orders, payments and the journal stay. Wrong or used code → 422 OTP_INVALID; from another state → 409 STATE_CONFLICT.
         */
        post: operations["requestAccountDeletion"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me/deletion-request/cancel": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Withdraw the deletion request
         * @description A command: DELETION_PENDING → the state the account had before, as long as staff have not completed the request; otherwise 409 STATE_CONFLICT.
         */
        post: operations["cancelAccountDeletion"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me/deletion-request/challenge": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Send a code to confirm the account deletion
         * @description Step one of deleting the account (REQ-RID-10): a code of purpose ACCOUNT_DELETION goes to the rider's current phone, with the same resend delay and budgets as sign-in. A sign-in code does not confirm a deletion.
         */
        post: operations["requestAccountDeletionCode"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me/phone-change": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Step three — change the phone with both codes
         * @description A command. The phone becomes the new one and every other session of the account ends; this one stays. A wrong code → 422 OTP_INVALID. The new phone being the current one or another account's → 409 STATE_CONFLICT (accounts are never merged). An account that is not ACTIVE → 403 ACCOUNT_NOT_ACTIVE. Audited with masked numbers.
         */
        post: operations["changeRiderPhone"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me/phone-change/current-code": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Step one of a phone change — a code to the current phone
         * @description REQ-AUTH-08. A code of purpose PHONE_CHANGE to the account's current phone, with the same resend delay and budgets as sign-in. Together with the code to the new phone it protects the account from a stolen session or a stolen SIM alone.
         */
        post: operations["requestRiderCurrentPhoneCode"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/me/phone-change/new-code": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Step two of a phone change — a code to the new phone
         * @description A code of purpose NEW_PHONE to the new phone, bound to this account. The answer is the same whoever has the number; the account's own current phone → 409 STATE_CONFLICT.
         */
        post: operations["requestRiderNewPhoneCode"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/orders": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Own order history
         * @description Own orders as payer, newest first. Use created_at of the last item as the next before cursor.
         */
        get: operations["listRiderOrderHistory"];
        put?: never;
        /**
         * Order from a quote
         * @description Consumes the quote atomically with the order (REQ-PRC-06): it must belong to this rider and match
         *     the class and both points, otherwise 409 QUOTE_MISMATCH; used or expired → 409 QUOTE_EXPIRED, and the same
         *     when the quote has an "every N-th trip" promotion another open order of mine already took (get a new price). The
         *     price is the quote's, never the client's. A repeat of the same command returns the same order. Card
         *     payment is not available yet (S-09). At most active_orders_per_payer orders not in a final state, pre-orders
         *     included, together with phone orders from my phone (ADR 0012) → 409 ACTIVE_ORDER_LIMIT. A rider whose
         *     account is not ACTIVE (e.g. a deletion request is pending) → 403 ACCOUNT_NOT_ACTIVE.
         *     The pickup city refuses new orders while paused (422 CITY_PAUSED), an order for now outside its working hours or
         *     one for later whose pickup time is outside them (422 CITY_CLOSED), and a payment method it does not offer
         *     (422 PAYMENT_METHOD_NOT_OFFERED); see the cities in the bootstrap (REQ-TEN-03/06).
         */
        post: operations["createOrder"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/orders/{order_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** One own order */
        get: operations["getOrder"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/orders/{order_id}/call": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Phone target for the active assigned driver
         * @description Available only to the order's payer while the assignment is COMMITTED and the order is ASSIGNED or
         *     IN_SERVICE. DIRECT returns the assigned driver's phone; VIA_SERVICE_NUMBERS returns only the configured
         *     service phone. Other orders are hidden as 404; outside the active call window → 409 STATE_CONFLICT.
         */
        get: operations["getRiderOrderCallTarget"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/orders/{order_id}/cancel": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Cancel before the trip starts
         * @description reason_code is a code from GET /api/rider/v1/cancel-reasons; an unknown or inactive code → 400. The order shows cancellation.by = RIDER. No fee while the cancellation policy is not set (Q-07). A stale expected_version gets VERSION_CONFLICT.
         */
        post: operations["cancelOrder"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/orders/{order_id}/messages": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Chat messages of the order
         * @description Oldest first, after the given sequence. The rider reads the whole order.
         */
        get: operations["listRiderMessages"];
        put?: never;
        /**
         * Write to the driver
         * @description Open once a driver is assigned and for 24 hours after the trip or the cancellation, so the rider can
         *     write from the order details; later it is read-only and contact goes through support (owner decision
         *     29.10.2026) → 409 STATE_CONFLICT; with no driver ever assigned → 409 STATE_CONFLICT. A driver
         *     who withdrew or was taken off the order cannot write → 404.
         *     1 to 1000 characters. A repeat of the same command_id returns the same message. The conversation is
         *     kept for the order details in the admin panel.
         */
        post: operations["postRiderMessage"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/orders/{order_id}/rating": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * My rating after a fulfilled trip
         * @description The comment is staff-only and is never returned to the rider. Non-participants and non-fulfilled orders look like 404.
         */
        get: operations["getRiderOrderRating"];
        put?: never;
        /**
         * Rate the driver after a fulfilled trip
         * @description Score 1–5. A blank comment is stored as absent. The rating may be replaced during the configured edit window; later → 409.
         */
        post: operations["rateDriver"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/orders/{order_id}/switch-to-cash": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Pay in cash instead of by card
         * @description REQ-PAY-20 (owner decision 28.10.2026): a card order not yet finished (AWAITING_PAYMENT with the hold in place, SCHEDULED, READY, SEARCHING, ASSIGNED, IN_SERVICE) becomes a cash order. The card hold is released at once and the card is never charged for it. A hold whose result is not known yet → 409 PAYMENT_UNKNOWN (try again); not a card order, or nothing left to pay by card → 409 STATE_CONFLICT. The rider's own choice.
         */
        post: operations["switchOrderToCash"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/orders/{order_id}/tip": {
        parameters: {
            query?: never;
            header?: never;
            path: {
                order_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        /**
         * The tip screen of a fulfilled trip
         * @description Presets, the bounds of an own amount, how the tip would be paid, until when; the tip already left.
         */
        get: operations["getTipOptions"];
        put?: never;
        /**
         * Leave a tip for the driver
         * @description Once per order (a declined card tip may be left again), within the window after the trip. By card the answer is PENDING until the bank answers — read the tip screen again. Without enough bonuses the order's own method is used.
         */
        post: operations["leaveTip"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/orders/active": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The most recent active order
         * @description After an app restart the rider sees the same order; 204 when there is none. A rider may now hold several orders (ADR 0012): this one is the most recently created order for now (an order for later only when there is none, and pre-orders still SCHEDULED are not included). Kept for existing clients; the whole list is GET /api/rider/v1/orders/current.
         */
        get: operations["getActiveOrder"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/orders/current": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Every order not yet finished
         * @description All my orders not in a final state, pre-orders included, newest first (ADR 0012 Q-03: up to active_orders_per_payer at once).
         */
        get: operations["listCurrentOrders"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/places": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Address search
         * @description The rider's past order places, the service's own addresses, the chosen provider's results; nothing is stored.
         */
        get: operations["searchRiderPlaces"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/places/reverse": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The address at a point on the map
         * @description An own address within 100 m, else the provider's nearest; 204 when there is none.
         */
        get: operations["reverseRiderPlace"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/push-devices": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** The phones that receive pushes */
        get: operations["listRiderPushDevices"];
        put?: never;
        /**
         * Register the app's push token
         * @description Tied to the session of the access token: after a logout or a revoked session nothing more is sent to the phone (REQ-AUTH-07). A push is never a confirmation by itself — the app reads the order over REST (REQ-NTF-01). The push data carries `type` (the template), `event_type`, `event_id`, `order_id` and `order_version`; nothing personal.
         */
        post: operations["registerRiderPushDevice"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/push-devices/{device_id}/remove": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Stop pushes to a phone */
        post: operations["removeRiderPushDevice"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/quotes": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Price for a class and two points
         * @description The server computes the price from the tariff in force (REQ-PRC-05); the quote belongs to the
         *     rider, lives 5 minutes and serves one order (REQ-PRC-06). Pickup outside every city → 422
         *     OUTSIDE_SERVICE_AREA; no tariff in force → 404.
         */
        post: operations["createQuote"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/safety-contacts": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Support and emergency contacts for the safety button
         * @description For city_id, or without it for the city of the rider's active order; neither → 400. A city without configured contacts gets 112 and no support phone. Labels in the rider's language. Nothing is sent to emergency services automatically (REQ-RID-09).
         */
        get: operations["getRiderSafetyContacts"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/support/cases": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * My support cases
         * @description Newest first.
         */
        get: operations["listRiderSupportCases"];
        put?: never;
        /**
         * Open a support case
         * @description About one of my orders or in general; the first message is PUBLIC.
         */
        post: operations["openRiderSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/support/cases/{case_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * One of my cases
         * @description PUBLIC messages only.
         */
        get: operations["getRiderSupportCase"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/support/cases/{case_id}/attachments/{file_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Download a PUBLIC attachment of my support case */
        get: operations["downloadRiderSupportAttachment"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/support/cases/{case_id}/messages": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Answer support
         * @description A case waiting for me goes back to work; a resolved one is reopened; a closed one → 409.
         */
        post: operations["replyRiderSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/support/uploads": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Open an upload session for one support attachment */
        post: operations["openRiderSupportAttachmentUpload"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/uploads/{file_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        /** Upload support attachment bytes */
        put: operations["uploadRiderSupportAttachment"];
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/vehicle-classes": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Classes that can be ordered at a point
         * @description The city comes from the point; only active classes with a tariff in force now.
         */
        get: operations["listVehicleClasses"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/wallet": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * My bonus account
         * @description Balances per currency and the latest movements with who and why (ADR 0009).
         */
        get: operations["getRiderWallet"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/wallet/card-top-ups": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Top up the bonus account by card
         * @description Opens the provider's payment page of the city's merchant (404 when the city takes no cards). The app POSTs `fields` to `url` in a web view; the account is credited when the provider confirms the payment.
         */
        post: operations["startRiderCardTopUp"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/rider/v1/wallet/card-top-ups/{top_up_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Result of a card top-up */
        get: operations["getRiderCardTopUp"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/ws/v1/rider": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Live channel (WebSocket)
         * @description Upgrade to a WebSocket with the rider access token — the `Authorization: Bearer` header, or `access_token` in the query where headers cannot be set. The server pushes a message for every change of an order the rider takes part in (section 20, REQ-NTF-04): `{"event_id", "type", "schema_version", "aggregate_type": "Order", "aggregate_id", "aggregate_version", "occurred_at", "correlation_id", "payload": {}}`. It carries no personal data: on a message the app reads the order over REST; duplicates and older versions are dropped, a gap in versions means read the snapshot (REQ-NTF-01). The first message is `{"type": "Connected"}`; the client may send `ping` (answer `{"type": "Pong"}`). Closed with code 4403 within seconds when the session is revoked or a right it needs is taken away (sign in again), and 4401 when the access token expires — reconnect with a fresh one. Commands stay REST (REQ-NTF-06).
         */
        get: operations["openRiderLiveChannel"];
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
        AcceptLegalText: {
            command_id: components["schemas"]["Uuid"];
            /** @description The language the text was shown in; one the version has. */
            language: components["schemas"]["LegalLanguage"];
            version_id: components["schemas"]["Uuid"];
        };
        AccountDeletionStatus: {
            /**
             * @description DELETION_PENDING after a request; after a cancellation the state the account had before.
             * @enum {string}
             */
            account_state: "DELETION_PENDING" | "ACTIVE" | "BLOCKED";
            client_id: components["schemas"]["Uuid"];
            /** Format: date-time */
            requested_at: string | null;
        };
        AppliedPromotion: {
            /**
             * Format: int64
             * @description What a DISCOUNT takes off the price; 0 for a BONUS (credited after the trip).
             */
            discount_minor: number;
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            kind: "DISCOUNT" | "BONUS";
            name: string;
            /** Format: int64 */
            value: number;
            /** @enum {string} */
            value_type: "PERCENT" | "FIXED";
        };
        Assignment: {
            driver_id?: components["schemas"]["Uuid"];
            id?: components["schemas"]["Uuid"];
            order_id?: components["schemas"]["Uuid"];
            /** @enum {string} */
            source?: "OFFER" | "BROADCAST" | "RESERVATION";
            /** @enum {string} */
            state?: "RESERVED" | "COMMITTED" | "RELEASED" | "REVOKED" | "COMPLETED";
            /** Format: uuid */
            trip_id?: string | null;
            /** @enum {string|null} */
            trip_phase?: "TO_PICKUP" | "WAITING" | "IN_PROGRESS" | "COMPLETED" | "ABORTED" | null;
            vehicle_id?: components["schemas"]["Uuid"];
        };
        Attachment: {
            /** @enum {string} */
            content_type: "image/jpeg" | "image/png" | "image/webp" | "application/pdf";
            file_id: components["schemas"]["Uuid"];
            name?: string | null;
            /** Format: int64 */
            size_bytes: number;
        };
        AttachmentIds: components["schemas"]["Uuid"][];
        CallTarget: {
            /** @enum {string} */
            mode: "DIRECT" | "VIA_SERVICE_NUMBERS";
            phone: string;
        };
        /** @description Who cancelled the order and why, with the labels as they were at that moment. Null unless a person cancelled the order (a search that found nobody ends as UNFULFILLED instead). */
        Cancellation: {
            /** @enum {string} */
            by: "RIDER" | "STAFF" | "DRIVER";
            reason_code: string;
            reason_labels: components["schemas"]["Labels"];
        } | null;
        CancelOrder: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            /** @description A code from the rider's list of cancellation reasons. */
            reason_code: string;
        };
        Card: {
            card_type: string | null;
            created_at: components["schemas"]["Timestamp"];
            id: components["schemas"]["Uuid"];
            /** @example 41****1111 */
            masked_pan: string;
            merchant_id: components["schemas"]["Uuid"];
        };
        CardBinding: {
            card?: components["schemas"]["Card"] | null;
            expires_at: components["schemas"]["Timestamp"];
            failure_reason?: string | null;
            /** @description Form fields to POST as application/x-www-form-urlencoded. */
            fields?: {
                [key: string]: string;
            } | null;
            id: components["schemas"]["Uuid"];
            return_url?: string | null;
            /** @enum {string} */
            state: "PENDING" | "COMPLETED" | "FAILED" | "EXPIRED";
            /** @description Where the web view POSTs the form; only in the answer to the start. */
            url?: string | null;
        };
        CardCommand: {
            command_id: components["schemas"]["Uuid"];
        };
        CardList: {
            cards: components["schemas"]["Card"][];
        };
        /** @description A top-up on the provider's payment page (ADR 0009, ADR 0010). The app POSTs `fields` to `url` in a web view; when it reaches `return_url` the app reads the top-up until it is no longer PENDING. Money the provider took is credited even when it reports late: a FAILED or EXPIRED top-up can still become COMPLETED. */
        CardTopUp: {
            /** Format: int64 */
            amount_minor: number;
            completed_at?: components["schemas"]["Timestamp"] | null;
            created_at: components["schemas"]["Timestamp"];
            currency: string;
            /** @description The payment page stops taking the payment. */
            expires_at: components["schemas"]["Timestamp"];
            failure_reason?: string | null;
            /** @description Form fields to POST as application/x-www-form-urlencoded; only in the answer to the start. */
            fields?: {
                [key: string]: string;
            } | null;
            id: components["schemas"]["Uuid"];
            masked_pan?: string | null;
            return_url?: string | null;
            /** @enum {string} */
            state: "PENDING" | "COMPLETED" | "FAILED" | "EXPIRED";
            /** @description Where the web view POSTs the form; only in the answer to the start. */
            url?: string | null;
        };
        Case: {
            /**
             * Format: uuid
             * @description Null in the rider and driver APIs.
             */
            assigned_staff_id?: string | null;
            category: components["schemas"]["Category"];
            /** Format: uuid */
            city_id?: string | null;
            created_at: components["schemas"]["Timestamp"];
            id: components["schemas"]["Uuid"];
            /** @description Empty in lists; filled when one case is read. */
            messages: components["schemas"]["Message"][];
            /**
             * Format: int64
             * @description For conversations with support.
             */
            number: number;
            /** Format: uuid */
            order_id?: string | null;
            priority: components["schemas"]["Priority"];
            /** Format: uuid */
            requester_id?: string | null;
            /** @enum {string} */
            requester_type: "CLIENT" | "DRIVER" | "STAFF" | "SYSTEM";
            resolution?: string | null;
            /** @description When the first answer is due, from the priority (URGENT 5 min, HIGH 15 min, NORMAL 4 h, LOW 24 h after the case was opened; REQ-OPS-06). */
            respond_by: components["schemas"]["Timestamp"];
            state: components["schemas"]["State"];
            subject: string;
            updated_at: components["schemas"]["Timestamp"];
            /** Format: int64 */
            version: number;
        };
        CaseList: {
            cases: components["schemas"]["Case"][];
        };
        /**
         * @description TRIP_REVIEW, NO_DRIVER, LOST_CONNECTION and PAYMENT_UNKNOWN are opened by the system only (REQ-OPS-06).
         * @enum {string}
         */
        Category: "LOST_ITEM" | "PAYMENT" | "CASH_DISPUTE" | "DRIVER_BEHAVIOUR" | "RIDER_BEHAVIOUR" | "SAFETY" | "TRIP_REVIEW" | "APP_PROBLEM" | "OTHER" | "NO_DRIVER" | "LOST_CONNECTION" | "PAYMENT_UNKNOWN";
        ChatMessage: {
            body: string;
            id: components["schemas"]["Uuid"];
            order_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            sender_role: "RIDER" | "DRIVER";
            sent_at: components["schemas"]["Timestamp"];
            /** Format: int64 */
            sequence: number;
        };
        ChatMessages: {
            messages: components["schemas"]["ChatMessage"][];
        };
        CreateOrder: {
            /**
             * @description APP (default) or WEB; where the rider ordered from.
             * @enum {string}
             */
            channel?: "APP" | "WEB";
            command_id: components["schemas"]["Uuid"];
            dropoff: components["schemas"]["GeoPoint"];
            dropoff_label?: string;
            /**
             * @description CARD — the rider's saved card for the city (GET /api/rider/v1/cards; no card → 400). The order is created AWAITING_PAYMENT; the agreed price is held on the card and only then the search starts (or a pre-order waits SCHEDULED). A declined hold ends the order UNFULFILLED with status_reason PAYMENT_DECLINED.
             * @enum {string}
             */
            payment_method: "CASH" | "CARD";
            pickup: components["schemas"]["GeoPoint"];
            /** @description The quote's pickup time; must be the same as in CreateQuote, otherwise QUOTE_MISMATCH. */
            pickup_at?: components["schemas"]["Timestamp"];
            pickup_label?: string;
            quote_id: components["schemas"]["Uuid"];
            /** @description The person the taxi is for, when it is not me (ADR 0012 Q-03, REQ-OPS-02). The driver sees the name and calls this phone once the order is assigned, never before; I stay the payer. */
            recipient?: {
                name?: string | null;
                /** @description International format (E.164); separators are ignored. */
                phone: string;
            } | null;
            vehicle_class: string;
            /**
             * Format: int64
             * @description Bonuses of my account to pay part of the price (ADR 0009); at most the price is used, the rest is paid in CASH or by CARD. More than available → 422 WALLET_INSUFFICIENT ("not enough on the balance, choose another way to pay"). A CARD order the bonuses pay in full becomes CASH for anything the trip adds.
             */
            wallet_minor?: number | null;
        };
        CreateQuote: {
            command_id: components["schemas"]["Uuid"];
            dropoff: components["schemas"]["GeoPoint"];
            pickup: components["schemas"]["GeoPoint"];
            /** @description Pickup time for an order for later. At least threshold_minutes ahead (config bootstrap) it is a pre-order that waits as SCHEDULED (ADR 0006); nearer, it is an ordinary order searched for at once. At most max_days_ahead days ahead; in the past → 400. */
            pickup_at?: components["schemas"]["Timestamp"];
            /** @description Class code from listVehicleClasses. */
            vehicle_class: string;
        };
        /** @description A copy of the rider's personal data (REQ-PRV-07). PENDING → RUNNING → READY (downloadable until expires_at) or FAILED; READY → EXPIRED, the file is dropped. */
        DataExport: {
            created_at: components["schemas"]["Timestamp"];
            /** Format: date-time */
            expires_at: string | null;
            id: components["schemas"]["Uuid"];
            /** Format: date-time */
            ready_at: string | null;
            /** Format: int64 */
            size_bytes: number | null;
            /** @enum {string} */
            state: "PENDING" | "RUNNING" | "READY" | "FAILED" | "EXPIRED";
        };
        /** @description A code of purpose DATA_EXPORT was sent to the rider's current phone. */
        DataExportCodeChallenge: {
            challenge_id: components["schemas"]["Uuid"];
            expires_at: components["schemas"]["Timestamp"];
            resend_available_at: components["schemas"]["Timestamp"];
        };
        /** @description The rider confirms the request with the code of the challenge. A sign-in or deletion code is refused (OTP_INVALID); a wrong code counts as an attempt. */
        DataExportCommand: {
            challenge_id: components["schemas"]["Uuid"];
            command_id: components["schemas"]["Uuid"];
            otp_code: string;
        };
        DataExportList: {
            /** @description Newest first, at most 20. */
            exports: components["schemas"]["DataExport"][];
        };
        DeletionCancelCommand: {
            command_id: components["schemas"]["Uuid"];
        };
        /** @description A code of purpose ACCOUNT_DELETION was sent to the rider's current phone. */
        DeletionCodeChallenge: {
            challenge_id: components["schemas"]["Uuid"];
            expires_at: components["schemas"]["Timestamp"];
            resend_available_at: components["schemas"]["Timestamp"];
        };
        /** @description The rider confirms the request with the code of the challenge. A sign-in code is refused (OTP_INVALID); a wrong code counts as an attempt. */
        DeletionRequestCommand: {
            challenge_id: components["schemas"]["Uuid"];
            command_id: components["schemas"]["Uuid"];
            otp_code: string;
        };
        /**
         * @description What a driver's reason does: RETURN_TO_SEARCH gives the order back to the search, CANCEL_ORDER cancels it by the driver. Only drivers' reasons have it.
         * @enum {string|null}
         */
        DriverOutcome: "RETURN_TO_SEARCH" | "CANCEL_ORDER" | null;
        /**
         * @description The local emergency number, digits only (2–6), e.g. 112.
         * @example 112
         */
        EmergencyNumber: string;
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
        HistoryDriver: {
            name: string | null;
            vehicle: components["schemas"]["HistoryVehicle"];
        };
        HistoryVehicle: {
            color: string;
            make: string;
            model: string;
            registration_number: string;
        };
        /**
         * @description The reason's text by language (uk, pl, ru, en); the service's default language is always present.
         * @example {
         *       "ru": "Пассажир попросил",
         *       "uk": "Пасажир попросив",
         *       "en": "Passenger asked"
         *     }
         */
        Labels: {
            [key: string]: string;
        };
        LeaveTip: {
            /**
             * Format: int64
             * @description A preset's amount or an own one from min_minor to max_minor.
             */
            amount_minor: number;
            command_id: components["schemas"]["Uuid"];
        };
        LegalAcceptance: {
            accepted_at: components["schemas"]["Timestamp"];
            kind: components["schemas"]["LegalKind"];
            language: components["schemas"]["LegalLanguage"];
            number: number;
            version_id: components["schemas"]["Uuid"];
        };
        /** @enum {string} */
        LegalAudience: "RIDER" | "DRIVER";
        LegalInForce: {
            acceptance_required: boolean;
            /** @description Whether this person accepted this very version. */
            accepted: boolean;
            audience: components["schemas"]["LegalAudience"];
            effective_from: components["schemas"]["Timestamp"];
            kind: components["schemas"]["LegalKind"];
            languages: components["schemas"]["LegalLanguage"][];
            number: number;
            version_id: components["schemas"]["Uuid"];
        };
        LegalInForceList: {
            documents: components["schemas"]["LegalInForce"][];
        };
        /**
         * @description DRIVER_AGREEMENT is for drivers only.
         * @enum {string}
         */
        LegalKind: "TERMS" | "PRIVACY_NOTICE" | "DRIVER_AGREEMENT";
        /** @enum {string} */
        LegalLanguage: "uk" | "pl" | "ru" | "en";
        Me: {
            account_state: string;
            session_id: components["schemas"]["Uuid"];
            subject_id: components["schemas"]["Uuid"];
            /** @constant */
            subject_type: "CLIENT";
        };
        Message: {
            attachments: components["schemas"]["Attachment"][];
            /**
             * Format: uuid
             * @description Hidden (null) for staff authors in the rider and driver APIs.
             */
            author_id?: string | null;
            /** @enum {string} */
            author_type: "CLIENT" | "DRIVER" | "STAFF" | "SYSTEM";
            body: string;
            created_at: components["schemas"]["Timestamp"];
            id: components["schemas"]["Uuid"];
            /** Format: int64 */
            sequence: number;
            /**
             * @description INTERNAL comments are never shown to the requester (REQ-ADM-09).
             * @enum {string}
             */
            visibility: "PUBLIC" | "INTERNAL";
        };
        NewPhone: {
            /** @description International format, "+" or "00" first. */
            phone: string;
        };
        OpenAttachmentUpload: {
            command_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            content_type: "image/jpeg" | "image/png" | "image/webp" | "application/pdf";
            /** Format: int64 */
            size_bytes: number;
        };
        OpenCase: {
            attachment_ids?: components["schemas"]["AttachmentIds"];
            /** @description Any category except the system-only ones (TRIP_REVIEW, NO_DRIVER, LOST_CONNECTION, PAYMENT_UNKNOWN). SAFETY cases start URGENT. */
            category: components["schemas"]["Category"];
            command_id: components["schemas"]["Uuid"];
            message: string;
            /**
             * Format: uuid
             * @description One of the requester's own orders (rider) or trips (driver).
             */
            order_id?: string | null;
            subject: string;
        };
        Order: {
            assignment?: components["schemas"]["Assignment"] | null;
            cancellation?: components["schemas"]["Cancellation"];
            /**
             * @description Where the order came from.
             * @enum {string}
             */
            channel: "APP" | "WEB" | "PHONE" | "PARTNER";
            city_id: components["schemas"]["Uuid"];
            created_at?: components["schemas"]["Timestamp"];
            currency?: string | null;
            /**
             * Format: int64
             * @description Taken off the price by the rider's promotions (ADR 0009); the service pays it.
             */
            discount_minor?: number;
            dropoff: components["schemas"]["GeoPoint"];
            dropoff_label?: string;
            /**
             * Format: int64
             * @description Final fare, set when the trip is completed (REQ-PRC-10).
             */
            final_price_minor?: number | null;
            id: components["schemas"]["Uuid"];
            /** @description The client who pays for this order (the signed-in rider, or the account created for a phone order). Null while the phone order has no account yet. */
            payer_client_id?: components["schemas"]["Uuid"] | null;
            /**
             * @description TERMINAL — a card at the driver's own terminal, only in phone orders.
             * @enum {string}
             */
            payment_method: "CASH" | "CARD" | "SERVICE" | "TERMINAL";
            /**
             * @description Cash — what the driver reported. Card (ADR 0008) — AUTH_PENDING while the hold is asked for (the order is AWAITING_PAYMENT and no search runs), AUTHORIZED once it is held, PAYMENT_DECLINED when the bank refused. Terminal — what the driver reported, like cash.
             * @enum {string|null}
             */
            payment_state?: "CASH_EXPECTED" | "CASH_REPORTED" | "CASH_NOT_RECEIVED" | "AUTH_PENDING" | "AUTHORIZED" | "PAYMENT_DECLINED" | "HOLD_RELEASED" | "CAPTURE_PENDING" | "PAID" | "PARTIALLY_PAID" | "TERMINAL_EXPECTED" | "TERMINAL_REPORTED" | "TERMINAL_NOT_RECEIVED" | null;
            pickup: components["schemas"]["GeoPoint"];
            /** @description Requested pickup time of an order for later; null for an order for now. */
            pickup_at?: components["schemas"]["Timestamp"] | null;
            /** @description While the driver is on the way to the pickup (trip TO_PICKUP): a forecast, never a promise (REQ-RID-04), from the driver's last position on the server. Null in every other state and when no position is known — never a made-up value. Shown in the rider's order reads (GET /orders/{id}, /current, /active); command answers leave it null. */
            pickup_eta?: null | {
                /** Format: int64 */
                distance_metres: number;
                /**
                 * Format: date-time
                 * @description When the driver was at that position; the ETA counts from then.
                 */
                location_at: string;
                /**
                 * Format: int64
                 * @description Driving time from that position to the pickup.
                 */
                seconds: number;
                /**
                 * @description ROUTER — on the roads; STRAIGHT_LINE — from the straight line, when no router answered.
                 * @enum {string}
                 */
                source: "ROUTER" | "STRAIGHT_LINE";
                /** @description The position is older than the freshness limit; show the forecast as uncertain. */
                stale: boolean;
            };
            pickup_label?: string;
            /** @description A pre-order (ADR 0006): SCHEDULED until it is released into the search before pickup_at. It does not count as the rider's active order, so the rider can order a ride now as well. */
            preorder?: boolean;
            /**
             * Format: int64
             * @description Agreed price from the quote.
             */
            price_minor?: number | null;
            /** @description On a follow-up: the interrupted order it continues (T-22). Its payment_method is SERVICE — the rider pays nothing for it. */
            related_order_id?: components["schemas"]["Uuid"] | null;
            /** @enum {string|null} */
            search_phase?: "PERSONAL" | "BROADCAST" | "STOPPED" | "EXHAUSTED" | null;
            /**
             * Format: int64
             * @description For support conversations; not a secret (REQ-DATA-03).
             */
            short_number: number;
            /** @enum {string} */
            status: "SCHEDULED" | "AWAITING_PAYMENT" | "READY" | "SEARCHING" | "ASSIGNED" | "IN_SERVICE" | "FULFILLED" | "CANCELLED" | "UNFULFILLED";
            status_reason?: string | null;
            vehicle_class: string;
            /** Format: int64 */
            version: number;
            /**
             * Format: int64
             * @description Bonuses paying part of the price (ADR 0009); after the trip at most the final fare is taken.
             */
            wallet_minor?: number;
        };
        OrderHistoryItem: {
            cancellation: components["schemas"]["Cancellation"];
            /** @description True for the last assigned driver only while that assignment was not released or revoked. */
            chat_available: boolean;
            created_at: components["schemas"]["Timestamp"];
            currency: string | null;
            driver: components["schemas"]["HistoryDriver"] | null;
            dropoff_label: string;
            /** Format: int64 */
            final_price_minor: number | null;
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            payment_method: "CASH" | "CARD" | "SERVICE" | "TERMINAL";
            pickup_at: components["schemas"]["Timestamp"] | null;
            pickup_label: string;
            /** Format: int64 */
            price_minor: number | null;
            /**
             * Format: int64
             * @description For support conversations; not a secret (REQ-DATA-03).
             */
            short_number: number;
            /** @enum {string} */
            status: "SCHEDULED" | "AWAITING_PAYMENT" | "READY" | "SEARCHING" | "ASSIGNED" | "IN_SERVICE" | "FULFILLED" | "CANCELLED" | "UNFULFILLED";
            vehicle_class: string;
        };
        /**
         * @description A phone number in E.164.
         * @example +380441234567
         */
        Phone: string;
        /** @description A code was sent (to the current phone, or to the new one). Says nothing about who has the number. */
        PhoneChangeCode: {
            challenge_id: components["schemas"]["Uuid"];
            expires_at: components["schemas"]["Timestamp"];
            resend_available_at: components["schemas"]["Timestamp"];
        };
        /** @description Both codes: of purpose PHONE_CHANGE from the current phone and NEW_PHONE from the new one. A code of another purpose or account is refused (OTP_INVALID); a wrong code counts as an attempt. */
        PhoneChangeCommand: {
            command_id: components["schemas"]["Uuid"];
            current_challenge_id: components["schemas"]["Uuid"];
            current_code: string;
            new_challenge_id: components["schemas"]["Uuid"];
            new_code: string;
        };
        PhoneChanged: {
            phone: string;
            subject_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            version: number;
        };
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
        PostChatMessage: {
            body: string;
            command_id: components["schemas"]["Uuid"];
        };
        /** @enum {string} */
        Priority: "LOW" | "NORMAL" | "HIGH" | "URGENT";
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
        Quote: {
            /** Format: int64 */
            amount_minor: number;
            city_id: components["schemas"]["Uuid"];
            currency: string;
            /**
             * Format: int64
             * @description What the rider's promotions take off amount_minor (ADR 0009); the service pays it.
             */
            discount_minor: number;
            /**
             * Format: int64
             * @description Estimated route length.
             */
            distance_m: number;
            /**
             * Format: int64
             * @description Estimated travel time.
             */
            duration_s: number;
            expires_at: components["schemas"]["Timestamp"];
            id: components["schemas"]["Uuid"];
            pickup_at: components["schemas"]["Timestamp"] | null;
            /** @description True when the order will be a pre-order; the price includes the pre-order surcharge. */
            preorder: boolean;
            /** @description Promotions that applied; a BONUS is credited to the account after the trip. */
            promotions: components["schemas"]["AppliedPromotion"][];
            /**
             * @description ROUTER — the distance and time of a route on the roads; STRAIGHT_LINE — an estimate from the straight line, because no router is configured or it did not answer (REQ-GEO-08). The apps say so next to the price. A server may refuse straight-line prices instead (503 PROVIDER_UNAVAILABLE).
             * @enum {string}
             */
            route_source: "ROUTER" | "STRAIGHT_LINE";
            /**
             * Format: int64
             * @description What the rider pays (before bonuses of the account) — amount_minor minus discount_minor.
             */
            to_pay_minor: number;
            vehicle_class: string;
            waiting: components["schemas"]["WaitingTerms"];
        };
        ReasonItem: {
            code: string;
            driver_outcome: components["schemas"]["DriverOutcome"];
            labels: components["schemas"]["Labels"];
        };
        /** @description The active reasons of one side, in display order. */
        ReasonList: {
            reasons: components["schemas"]["ReasonItem"][];
        };
        Reply: {
            attachment_ids?: components["schemas"]["AttachmentIds"];
            command_id: components["schemas"]["Uuid"];
            message: string;
        };
        RiderAddress: {
            /** @description Display form of the house number, including suffix/building when present. */
            house: string;
            id: components["schemas"]["Uuid"];
            instructions?: string | null;
            /** @enum {string} */
            kind: "HOUSE" | "PLACE" | "ENTRANCE";
            label: string;
            pickup: components["schemas"]["GeoPoint"];
            street: string;
        };
        /** @description What the safety button shows for a city, labels in the caller's language (else the service's default). Never a 404: a city nobody configured gets emergency_number 112 and no support phone. disclaimer_code is always NO_AUTO_DISPATCH — the app shows its fixed text that the service does not call emergency services by itself. */
        SafetyContacts: {
            city_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            disclaimer_code: "NO_AUTO_DISPATCH";
            emergency_number: components["schemas"]["EmergencyNumber"];
            extra: {
                label: string;
                phone: components["schemas"]["Phone"];
            }[];
            support_phone: components["schemas"]["Phone"] | null;
        };
        StartCardBinding: {
            city_id: components["schemas"]["Uuid"];
            command_id: components["schemas"]["Uuid"];
        };
        StartCardTopUp: {
            /**
             * Format: int64
             * @description Within the service's limits (by default 100 … 1 000 000 minor units).
             */
            amount_minor: number;
            /** @description The city whose merchant takes the money; the currency is that merchant's. */
            city_id: components["schemas"]["Uuid"];
            command_id: components["schemas"]["Uuid"];
        };
        /** @enum {string} */
        State: "OPEN" | "IN_PROGRESS" | "WAITING_REQUESTER" | "RESOLVED" | "CLOSED";
        StoredFile: {
            content_type?: string | null;
            file_id: components["schemas"]["Uuid"];
            reject_reason?: string | null;
            /** Format: int64 */
            size_bytes: number;
            /**
             * @description QUARANTINE while the antivirus has not given its verdict yet (issue
             * @enum {string}
             */
            state: "SAFE" | "QUARANTINE" | "REJECTED";
        };
        SwitchToCash: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
        };
        /**
         * Format: date-time
         * @description Moment in UTC, RFC 3339.
         * @example 2026-10-26T12:00:00Z
         */
        Timestamp: string;
        Tip: {
            /** Format: int64 */
            amount_minor: number;
            created_at: components["schemas"]["Timestamp"];
            currency: string;
            failure_reason?: string | null;
            id: components["schemas"]["Uuid"];
            method: components["schemas"]["TipMethod"];
            order_id: components["schemas"]["Uuid"];
            /**
             * @description PENDING — the card charge is on its way; PAID; FAILED — the card declined, another tip may be left; RECORDED — cash or terminal.
             * @enum {string}
             */
            state: "PENDING" | "PAID" | "FAILED" | "RECORDED";
        };
        /**
         * @description CARD — a separate charge of the order's card; WALLET — from the bonus account (an order paid wholly with bonuses, when it has enough); CASH and TERMINAL — handed to the driver, only recorded.
         * @enum {string}
         */
        TipMethod: "CARD" | "WALLET" | "CASH" | "TERMINAL";
        TipOptions: {
            available_until: components["schemas"]["Timestamp"];
            currency: string;
            /** Format: int64 */
            max_minor: number;
            /** @description How a tip would be paid; null when the order is SERVICE and cannot be tipped. */
            method: components["schemas"]["TipMethod"] | null;
            /** Format: int64 */
            min_minor: number;
            /** @description A tip can be left now. */
            open: boolean;
            order_id: components["schemas"]["Uuid"];
            presets: {
                /**
                 * Format: int64
                 * @description The percent of the cost, rounded up to a whole unit.
                 */
                amount_minor: number;
                /** @enum {integer} */
                percent: 10 | 15 | 20 | 25;
            }[];
            /** @description The tip already left, if any. */
            tip?: components["schemas"]["Tip"] | null;
            /**
             * Format: int64
             * @description The final fare less the service's discount.
             */
            trip_cost_minor: number;
        };
        UploadSession: {
            expires_at: components["schemas"]["Timestamp"];
            file_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            max_bytes: number;
            upload_path: string;
        };
        /** Format: uuid */
        Uuid: string;
        VehicleClassOption: {
            /** @example STANDARD */
            code: string;
            name: string;
        };
        /**
         * @description Paid waiting at the pickup, set per tariff by the admin (REQ-PRC-09, Q-07). After free_minutes from
         *     the driver's confirmed arrival, waiting is counted in steps of step_seconds (1 = per second,
         *     60 = per minute); the number of steps is rounded — UP every started step, DOWN only full steps,
         *     HALF_UP the nearer one; each charged minute costs per_minute_minor. The charge is added to the final
         *     fare (final_price_minor).
         */
        WaitingTerms: {
            free_minutes: number;
            /** @description Minor units per minute; may be fractional. */
            per_minute_minor: number;
            /** @enum {string} */
            rounding: "UP" | "DOWN" | "HALF_UP";
            step_seconds: number;
        };
        Wallet: {
            balances: components["schemas"]["WalletBalance"][];
            client_id: components["schemas"]["Uuid"];
            /** @description Newest first. */
            entries: components["schemas"]["WalletEntry"][];
        };
        WalletBalance: {
            /**
             * Format: int64
             * @description What may be used in a new order now.
             */
            available_minor: number;
            /** Format: int64 */
            balance_minor: number;
            currency: string;
            /**
             * Format: int64
             * @description Set aside for orders not finished yet.
             */
            reserved_minor: number;
        };
        WalletEntry: {
            /**
             * Format: int64
             * @description Positive — in, negative — out.
             */
            amount_minor: number;
            /** Format: date-time */
            at: string;
            currency: string;
            id: components["schemas"]["Uuid"];
            /** @description STAFF_TOP_UP, CARD_TOP_UP, PROMOTION, TRIP_PAYMENT, TIP, … (new kinds may appear). */
            kind: string;
            order_id?: components["schemas"]["Uuid"] | null;
            reason: string;
            /** @description Who topped up, for a top-up by staff. */
            staff_id?: components["schemas"]["Uuid"] | null;
        };
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
    searchRiderAddresses: {
        parameters: {
            query: {
                language?: string;
                lat: number;
                limit?: number;
                lon: number;
                query: string;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Visible service-owned addresses matching the query. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["RiderAddress"][];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            422: components["responses"]["UnprocessableEntity"];
            /** @description Per-rider address search rate limit exceeded. */
            429: {
                headers: {
                    "Retry-After": components["headers"]["RetryAfter"];
                    [name: string]: unknown;
                };
                content: {
                    "application/problem+json": components["schemas"]["Problem"];
                };
            };
        };
    };
    getNearestRiderAddress: {
        parameters: {
            query: {
                lat: number;
                lon: number;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Closest visible address. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["RiderAddress"];
                };
            };
            /** @description No visible address within 100 metres. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    listRiderCancelReasons: {
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
            /** @description Active reasons in display order. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["ReasonList"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    startCardBinding: {
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
                "application/json": components["schemas"]["StartCardBinding"];
            };
        };
        responses: {
            /** @description Started. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CardBinding"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    getCardBinding: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                binding_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description PENDING until the provider reports; then COMPLETED with the card, FAILED or EXPIRED. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CardBinding"];
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    listCards: {
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
            /** @description Newest first. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CardList"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    removeCard: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                card_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["CardCommand"];
            };
        };
        responses: {
            /** @description Removed. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    getLegalInForce: {
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
                    "application/json": components["schemas"]["LegalInForceList"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    acceptLegalText: {
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
                "application/json": components["schemas"]["AcceptLegalText"];
            };
        };
        responses: {
            /** @description Accepted. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["LegalAcceptance"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getRiderMe: {
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
            /** @description Current subject and session. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Me"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    listDataExports: {
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
                    "application/json": components["schemas"]["DataExportList"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    requestDataExport: {
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
                "application/json": components["schemas"]["DataExportCommand"];
            };
        };
        responses: {
            /** @description Queued; poll the export until READY. */
            202: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DataExport"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    getDataExport: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                export_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["DataExport"];
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    downloadDataExport: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                export_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description The file. `sections` holds one key per part of the service. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        client_id: components["schemas"]["Uuid"];
                        /** @constant */
                        format: 1;
                        generated_at: components["schemas"]["Timestamp"];
                        sections: {
                            [key: string]: unknown;
                        };
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    requestDataExportCode: {
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
            /** @description Code sent. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DataExportCodeChallenge"];
                };
            };
            401: components["responses"]["Unauthorized"];
            429: components["responses"]["TooManyRequests"];
        };
    };
    requestAccountDeletion: {
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
                "application/json": components["schemas"]["DeletionRequestCommand"];
            };
        };
        responses: {
            /** @description Requested. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["AccountDeletionStatus"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    cancelAccountDeletion: {
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
                "application/json": components["schemas"]["DeletionCancelCommand"];
            };
        };
        responses: {
            /** @description Withdrawn. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["AccountDeletionStatus"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            409: components["responses"]["Conflict"];
        };
    };
    requestAccountDeletionCode: {
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
            /** @description Code sent. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DeletionCodeChallenge"];
                };
            };
            401: components["responses"]["Unauthorized"];
            429: components["responses"]["TooManyRequests"];
        };
    };
    changeRiderPhone: {
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
                "application/json": components["schemas"]["PhoneChangeCommand"];
            };
        };
        responses: {
            /** @description Changed. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PhoneChanged"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    requestRiderCurrentPhoneCode: {
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
            /** @description Code sent. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PhoneChangeCode"];
                };
            };
            401: components["responses"]["Unauthorized"];
            429: components["responses"]["TooManyRequests"];
        };
    };
    requestRiderNewPhoneCode: {
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
                "application/json": components["schemas"]["NewPhone"];
            };
        };
        responses: {
            /** @description Code sent. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PhoneChangeCode"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
            429: components["responses"]["TooManyRequests"];
        };
    };
    listRiderOrderHistory: {
        parameters: {
            query?: {
                before?: components["schemas"]["Timestamp"];
                limit?: number;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Order history. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OrderHistoryItem"][];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    createOrder: {
        parameters: {
            query?: never;
            header?: {
                /**
                 * @description App platform (REQ-API-10). Optional until staff turn on require_version_header.
                 *     Web, admin and operator requests are never checked.
                 */
                "X-App-Platform"?: components["parameters"]["AppPlatform"];
                /** @description Semantic version MAJOR.MINOR.PATCH of the app build (REQ-API-10). */
                "X-App-Version"?: components["parameters"]["AppVersion"];
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["CreateOrder"];
            };
        };
        responses: {
            /** @description The order, already searching for a driver. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Order"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
            /** @description App build is below the minimum for its platform (REQ-API-10). */
            426: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/problem+json": components["schemas"]["Problem"];
                };
            };
        };
    };
    getOrder: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["Order"];
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    getRiderOrderCallTarget: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Number the rider app should dial. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CallTarget"];
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    cancelOrder: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["CancelOrder"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Order"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listRiderMessages: {
        parameters: {
            query?: {
                after?: number;
                limit?: number;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["ChatMessages"];
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    postRiderMessage: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["PostChatMessage"];
            };
        };
        responses: {
            /** @description The stored message. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["ChatMessage"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getRiderOrderRating: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Active rating. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        /** Format: date-time */
                        created_at: string;
                        /** Format: uuid */
                        order_id: string;
                        score: number;
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    rateDriver: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    command_id: components["schemas"]["Uuid"];
                    comment?: string | null;
                    score: number;
                };
            };
        };
        responses: {
            /** @description Active rating; comment stays staff-only. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        /** Format: date-time */
                        created_at: string;
                        /** Format: uuid */
                        order_id: string;
                        score: number;
                    };
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    switchOrderToCash: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["SwitchToCash"];
            };
        };
        responses: {
            /** @description The order, now CASH with payment_state CASH_EXPECTED. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Order"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getTipOptions: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["TipOptions"];
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    leaveTip: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["LeaveTip"];
            };
        };
        responses: {
            /** @description Left. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Tip"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getActiveOrder: {
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
                    "application/json": components["schemas"]["Order"];
                };
            };
            /** @description No active order. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    listCurrentOrders: {
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
                    "application/json": {
                        orders: components["schemas"]["Order"][];
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    searchRiderPlaces: {
        parameters: {
            query: {
                language?: string;
                lat: number;
                limit?: number;
                lon: number;
                /** @description Blank — the latest places of the order history only. */
                query?: string;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description History first, then own addresses, then the provider's results; at most limit. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PlaceList"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            /** @description OUTSIDE_SERVICE_AREA — the point is in no city of the service. */
            422: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/problem+json": components["schemas"]["Problem"];
                };
            };
        };
    };
    reverseRiderPlace: {
        parameters: {
            query: {
                language?: string;
                lat: number;
                lon: number;
            };
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
                    "application/json": components["schemas"]["Place"];
                };
            };
            /** @description No address there. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            401: components["responses"]["Unauthorized"];
            /** @description OUTSIDE_SERVICE_AREA — the point is in no city of the service. */
            422: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/problem+json": components["schemas"]["Problem"];
                };
            };
        };
    };
    listRiderPushDevices: {
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
            /** @description Active devices, oldest first. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PushDeviceList"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    registerRiderPushDevice: {
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
                "application/json": components["schemas"]["PushDeviceRegistration"];
            };
        };
        responses: {
            /** @description Registered (or refreshed, for the same token). */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PushDevice"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
        };
    };
    removeRiderPushDevice: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                device_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["PushDeviceCommand"];
            };
        };
        responses: {
            /** @description Removed. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    createQuote: {
        parameters: {
            query?: never;
            header?: {
                /**
                 * @description App platform (REQ-API-10). Optional until staff turn on require_version_header.
                 *     Web, admin and operator requests are never checked.
                 */
                "X-App-Platform"?: components["parameters"]["AppPlatform"];
                /** @description Semantic version MAJOR.MINOR.PATCH of the app build (REQ-API-10). */
                "X-App-Version"?: components["parameters"]["AppVersion"];
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["CreateQuote"];
            };
        };
        responses: {
            /** @description The quote. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Quote"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
            /** @description App build is below the minimum for its platform (REQ-API-10). */
            426: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/problem+json": components["schemas"]["Problem"];
                };
            };
            503: components["responses"]["ServiceUnavailable"];
        };
    };
    getRiderSafetyContacts: {
        parameters: {
            query?: {
                city_id?: components["schemas"]["Uuid"];
            };
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
                    "application/json": components["schemas"]["SafetyContacts"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
        };
    };
    listRiderSupportCases: {
        parameters: {
            query?: {
                before?: components["schemas"]["Timestamp"];
                limit?: number;
            };
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
                    "application/json": components["schemas"]["CaseList"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    openRiderSupportCase: {
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
                "application/json": components["schemas"]["OpenCase"];
            };
        };
        responses: {
            /** @description OK */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Case"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    getRiderSupportCase: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                case_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["Case"];
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    downloadRiderSupportAttachment: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                case_id: components["schemas"]["Uuid"];
                file_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Attachment bytes. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/pdf": string;
                    "image/jpeg": string;
                    "image/png": string;
                    "image/webp": string;
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    replyRiderSupportCase: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                case_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["Reply"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Case"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    openRiderSupportAttachmentUpload: {
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
                "application/json": components["schemas"]["OpenAttachmentUpload"];
            };
        };
        responses: {
            /** @description Upload session. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["UploadSession"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
        };
    };
    uploadRiderSupportAttachment: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                file_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/pdf": string;
                "image/jpeg": string;
                "image/png": string;
                "image/webp": string;
            };
        };
        responses: {
            /** @description Stored file. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["StoredFile"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listVehicleClasses: {
        parameters: {
            query: {
                lat: number;
                lon: number;
            };
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
                    "application/json": components["schemas"]["VehicleClassOption"][];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    getRiderWallet: {
        parameters: {
            query?: {
                limit?: number;
            };
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
                    "application/json": components["schemas"]["Wallet"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    startRiderCardTopUp: {
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
                "application/json": components["schemas"]["StartCardTopUp"];
            };
        };
        responses: {
            /** @description Started. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CardTopUp"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getRiderCardTopUp: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                top_up_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description PENDING until the provider reports; then COMPLETED, FAILED or EXPIRED. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CardTopUp"];
                };
            };
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    openRiderLiveChannel: {
        parameters: {
            query?: {
                access_token?: string;
            };
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Switching to WebSocket. */
            101: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            401: components["responses"]["Unauthorized"];
        };
    };
}
