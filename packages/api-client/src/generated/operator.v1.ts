export interface paths {
    "/api/operator/v1/calls": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Recent incoming calls of my cities
         * @description The call log, newest first, at most 100, for the cities where I have calls.answer or calls.listen (a number without a city line only for staff with all cities). With order_id — the calls during which that order was made. Calls are logged only while the service's Asterisk is reachable; phone orders work without it (REQ-OPS-07, T-36).
         */
        get: operations["listCalls"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/calls/{call_id}/answer": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * I took this call
         * @description Records who took the call (Asterisk knows the phone, not the staff member). A repeat returns the first result; a call another operator already took → 409 STATE_CONFLICT; an ended or missed call → 409.
         */
        post: operations["answerCall"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/calls/{call_id}/recording": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Listen to the call's recording
         * @description The whole recording as audio/wav, for staff with calls.listen in the call's city; every request is audited (call_recording.listen) — there is no public or signed link and no Range support, so one request is one listening. Sent with Cache-Control no-store. 404 while the recording is not STORED.
         */
        get: operations["listenToCallRecording"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/cancel-reasons": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Reasons staff can give when cancelling
         * @description The staff list from the admin panel. Requires orders.cancel.
         */
        get: operations["listOperatorCancelReasons"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/drivers/live": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The cars on the line in a city
         * @description Every driver with an open or closing work session in the city, with the car, the status and the last known position, for the call centre's map (REQ-OPS-01). Needs orders.view for the city. Poll it; no phone numbers.
         */
        get: operations["getLiveDrivers"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/me": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The signed-in staff member
         * @description Same shape as in the admin API.
         */
        get: operations["getOperatorMe"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/me/bonus": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The signed-in staff member's bonus points in the current period
         * @description Points for phone orders this staff member created (ADR 0011). Any staff member.
         */
        get: operations["getMyOperatorBonus"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/me/call-status": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** My status for incoming calls and my extension */
        get: operations["getMyCallStatus"];
        put?: never;
        /**
         * Set my status — available, on a break, offline
         * @description Needs calls.answer. The card-pop goes to the AVAILABLE operators of the city when there is one, else to all; calls are not routed by it. A repeat of the command returns the first result.
         */
        post: operations["changeMyCallStatus"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/me/emergency-grants": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * My emergency access
         * @description The extra permissions a super admin gave me for a limited time, and until when (REQ-SEC-10).
         */
        get: operations["getMyEmergencyGrants"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/me/password": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Change the own password
         * @description Required after the first sign-in and after a reset.
         */
        post: operations["changeOperatorPassword"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/operators": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The operators of a city and their status (supervisor)
         * @description Staff with calls.answer in the city. Needs calls.supervise for the city.
         */
        get: operations["listCallOperators"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Orders of one city
         * @description Newest first. The operator needs orders.view for the requested city.
         */
        get: operations["listOperatorOrders"];
        put?: never;
        /**
         * Create a phone order from a quote
         * @description The order is created as channel PHONE by the signed-in employee. The quote must belong to that
         *     operator and match the class and points. Paid in CASH or by a card at the driver's own TERMINAL (owner
         *     decision 27.10.2026; a payment link comes later). A TERMINAL order is offered only to drivers with a terminal;
         *     with terminal_fallback_to_cash, drivers without one may take it from the broadcast phase and it becomes a
         *     CASH order on assignment (event PaymentMethodChanged). The caller is
         *     contact data for this order only and is not linked to or turned into a client account (REQ-OPS-02,
         *     REQ-OPS-03, REQ-PRC-06). The city's pause, working hours and payment methods apply as for the apps:
         *     422 CITY_PAUSED, CITY_CLOSED or PAYMENT_METHOD_NOT_OFFERED (REQ-TEN-03/06). When the caller's phone belongs to a rider account that is BLOCKED or has a
         *     pending deletion request, the order is refused with 403 ACCOUNT_NOT_ACTIVE, so the operator can tell the
         *     caller why; a caller without an account is not affected. The caller's phone counts toward the order limit
         *     (active_orders_per_payer, ADR 0012): together with that rider's app orders when the phone has an account,
         *     by the number alone otherwise → 409 ACTIVE_ORDER_LIMIT.
         */
        post: operations["createOperatorOrder"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders/{order_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** One order with its caller contact */
        get: operations["getOperatorOrder"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders/{order_id}/calls": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Call the order's rider, driver or caller from my phone (click-to-call)
         * @description Asterisk rings my own phone (my extension) and then the other side; the number never reaches the panel, the response or the log (REQ-PRV-03). Needs orders.view for the order's city and an extension (409 without one, or when the order has no such side, e.g. no driver yet). The call is logged as OUTBOUND, linked to the order and recorded like incoming ones. A repeat of the command returns the first call and never rings twice. 503 PROVIDER_UNAVAILABLE: Asterisk could not be reached or refused — the call is FAILED, place a new one (new command_id); or its answer was lost — repeat the same command, it does not ring a second time.
         */
        post: operations["placeOrderCall"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders/{order_id}/cancel": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Cancel an order before the trip starts */
        post: operations["cancelOperatorOrder"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders/{order_id}/events": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Order history — who did what and why
         * @description Every change of the order, oldest first, with the actor's name and role and the reason, for lines like "Operator Anna cancelled the order: passenger asked". Requires orders.view for the order city.
         */
        get: operations["getOperatorOrderEvents"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders/{order_id}/interrupt": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Interrupt a trip in progress
         * @description Only IN_SERVICE (before the start cancel or take the driver off → 409). Requires orders.interrupt for the order city (T-22, REQ-OPS-05). The order is cancelled by staff with a reason from the staff list; the trip is ABORTED where the car stopped, the part driven is free and the driver is released. With follow_up a new order linked by related_order_id takes the rider from follow_up_pickup (default: the driver's last position) to the original destination; the rider pays nothing (payment_method SERVICE) and the service pays its driver by the tariff. The interrupted driver is not offered it. Audited.
         */
        post: operations["interruptTrip"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders/{order_id}/messages": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Read the order conversation for support
         * @description This access is audited and requires orders.view for the order city.
         */
        get: operations["getOperatorOrderConversation"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders/{order_id}/ratings": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Active ratings for an order, including staff-only comments
         * @description Requires orders.view for the order city.
         */
        get: operations["getOperatorOrderRatings"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders/{order_id}/remove-reservation": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Take the driver off a reserved pre-order
         * @description At any time before the driver confirms; the pre-order stays SCHEDULED and other drivers can reserve it, or it goes to the search at its release time. Requires orders.reassign for the order city. Audited.
         */
        post: operations["removePreorderReservation"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders/{order_id}/revoke-assignment": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Take the driver off an order and search again
         * @description Requires orders.reassign for the order city; reason is mandatory (REQ-OPS-05).
         */
        post: operations["revokeOperatorOrderAssignment"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/orders/{order_id}/switch-to-cash": {
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
         * @description REQ-PAY-20 (owner decision 28.10.2026): a card order not yet finished (AWAITING_PAYMENT with the hold in place, SCHEDULED, READY, SEARCHING, ASSIGNED, IN_SERVICE) becomes a cash order. The card hold is released at once and the card is never charged for it. A hold whose result is not known yet → 409 PAYMENT_UNKNOWN (try again); not a card order, or nothing left to pay by card → 409 STATE_CONFLICT. Needs orders.create in the order's city; the operator acts at the rider's request and gives a reason.
         */
        post: operations["operatorSwitchOrderToCash"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/places": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Address search
         * @description For a phone order; needs orders.create for the city. With caller_phone the caller's order history comes first.
         */
        get: operations["searchOperatorPlaces"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/places/reverse": {
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
        get: operations["reverseOperatorPlace"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/quotes": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Price a phone order
         * @description The pickup determines the service city. The operator needs orders.create for that city. The quote
         *     belongs to the signed-in operator, expires after the normal quote lifetime and can be consumed once
         *     by the matching phone order (REQ-OPS-03, REQ-PRC-06).
         */
        post: operations["createOperatorQuote"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/support/cases": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Support queue
         * @description Urgent first, then newest. Needs support.manage for the city. Problem queues (CASH_DISPUTE, TRIP_REVIEW) come from events.
         */
        get: operations["listOperatorSupportQueue"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/support/cases/{case_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** A case with INTERNAL comments */
        get: operations["getOperatorSupportCase"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/support/cases/{case_id}/assign": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Assign or return to the queue
         * @description OPEN → IN_PROGRESS on assignment.
         */
        post: operations["assignOperatorSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/support/cases/{case_id}/attachments/{file_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Download a support attachment
         * @description Requires support.manage for the case city. Every download is audited.
         */
        get: operations["downloadOperatorSupportAttachment"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/support/cases/{case_id}/close": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Close
         * @description A reason is required; it becomes the resolution when there is none.
         */
        post: operations["closeOperatorSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/support/cases/{case_id}/comments": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Write to the requester or an internal comment
         * @description INTERNAL comments are never shown to the requester.
         */
        post: operations["commentOperatorSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/support/cases/{case_id}/priority": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Change the priority */
        post: operations["priorityOperatorSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/support/cases/{case_id}/reopen": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Reopen a resolved case */
        post: operations["reopenOperatorSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/support/cases/{case_id}/resolve": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Resolve with a resolution */
        post: operations["resolveOperatorSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/support/uploads": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Open a support attachment upload
         * @description Requires support.manage.
         */
        post: operations["openOperatorSupportAttachmentUpload"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/operator/v1/uploads/{file_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        /**
         * Upload support attachment bytes
         * @description Requires support.manage.
         */
        put: operations["uploadOperatorSupportAttachment"];
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/ws/v1/operator": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Live channel of the operator workstation (WebSocket)
         * @description Upgrade to a WebSocket with an operator access token — the `Authorization: Bearer` header, or `access_token` in the query where a browser cannot set headers. The server pushes `{"type": "CallRinging", "call_id", …, "payload": CallRinging}` (calls.yaml) to the staff with calls.answer for the called number's city as a call rings (card-pop, REQ-OPS-01/08). The first message is `{"type": "Connected"}`; the client may send `ping` (answer `{"type": "Pong"}`). Closed with code 4403 within seconds when the session is revoked or a right it needs is taken away (sign in again), and 4401 when the access token expires — reconnect with a fresh one. The call log is GET /api/operator/v1/calls; commands stay REST.
         */
        get: operations["openOperatorLiveChannel"];
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
        AnswerCall: {
            command_id: components["schemas"]["Uuid"];
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
        Assign: {
            /**
             * Format: uuid
             * @description A staff member with support.manage for the case's city; null puts the case back into the queue.
             */
            assignee_id?: string | null;
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason?: string | null;
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
        Call: {
            /** Format: date-time */
            answered_at: string | null;
            /** @description Who took an incoming call — from the operator's phone (their extension) or "I took this call", whichever came first; for an outgoing call, who placed it. */
            answered_by: components["schemas"]["Uuid"] | null;
            /** @description The service number that was called; null for an outgoing call. */
            called_number: string | null;
            /** @description The caller's number in E.164; null when the network gave none or it could not be read, and always null for an outgoing call (REQ-PRV-03). */
            caller_phone: string | null;
            /** @description The city of the called number (call lines); null for a number without a line. */
            city_id: components["schemas"]["Uuid"] | null;
            direction: components["schemas"]["CallDirection"];
            /** Format: date-time */
            ended_at: string | null;
            id: components["schemas"]["Uuid"];
            /** @description Orders made during the call, the first first; for an outgoing call, the order it was placed from. Ending the call does not cancel them. */
            order_ids: components["schemas"]["Uuid"][];
            /** @description Whom an outgoing call was to (its number is never shown); null for an incoming call. */
            party: components["schemas"]["CallParty"] | null;
            /** @description The recording of a call that was taken; null for a call that is not over or was missed. */
            recording: components["schemas"]["CallRecording"] | null;
            /** Format: date-time */
            started_at: string;
            state: components["schemas"]["CallState"];
        };
        /**
         * @description INBOUND — to a service number; OUTBOUND — placed from an order in the panel (click-to-call).
         * @enum {string}
         */
        CallDirection: "INBOUND" | "OUTBOUND";
        Caller: {
            name?: string;
            /** @description Caller phone in E.164 form. */
            phone: string;
        };
        CallList: {
            calls: components["schemas"]["Call"][];
        };
        /** @description An operator of the city (calls.answer) as a supervisor sees them. */
        CallOperator: {
            /** Format: date-time */
            changed_at: string | null;
            extension: string | null;
            name: string | null;
            staff_id: components["schemas"]["Uuid"];
            status: components["schemas"]["OperatorCallStatus"];
        };
        CallOperatorList: {
            operators: components["schemas"]["CallOperator"][];
        };
        /**
         * @description The other side of an outgoing call: RIDER — the order's rider (account phone); DRIVER — its assigned driver; CALLER — the person who phoned the order in (its caller contact).
         * @enum {string}
         */
        CallParty: "RIDER" | "DRIVER" | "CALLER";
        /** @description A call's recording (ADR 0012 Q-18 p. 5). It has no public link: GET /api/operator/v1/calls/{call_id}/recording with calls.listen, and every listening is audited. Not deleted automatically until Q-19 sets a retention. */
        CallRecording: {
            /** @description Length of the stored recording; null unless STORED. */
            duration_seconds: number | null;
            state: components["schemas"]["CallRecordingState"];
            /** Format: date-time */
            stored_at: string | null;
        };
        /**
         * @description PENDING — the call is over and the server is fetching its recording from Asterisk; STORED — it is kept encrypted and can be listened to (calls.listen); NONE — Asterisk had no recording of this call.
         * @enum {string}
         */
        CallRecordingState: "PENDING" | "STORED" | "NONE";
        /**
         * @description DIALING — an outgoing call the server is asking Asterisk for; RINGING — the call came in (for an outgoing call: the operator's phone rings); ANSWERED — it was taken (outgoing: the other side picked up); ENDED — it ended after being taken; MISSED — it ended without being taken; FAILED — Asterisk could not be reached for an outgoing call.
         * @enum {string}
         */
        CallState: "DIALING" | "RINGING" | "ANSWERED" | "ENDED" | "MISSED" | "FAILED";
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
            /** @description A code from GET /api/operator/v1/cancel-reasons; the order shows cancellation.by = STAFF. */
            reason_code: string;
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
        ChangeMyCallStatus: {
            command_id: components["schemas"]["Uuid"];
            status: components["schemas"]["OperatorCallStatus"];
        };
        ChangePassword: {
            /** Format: password */
            current_password: string;
            /**
             * Format: password
             * @description 12 to 128 characters by default, not equal to the login.
             */
            new_password: string;
        };
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
        Comment: {
            attachment_ids?: components["schemas"]["AttachmentIds"];
            body: string;
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            /** @enum {string} */
            visibility: "PUBLIC" | "INTERNAL";
            /** @description With a PUBLIC message — the case waits for the requester's answer. */
            wait_for_requester?: boolean;
        };
        /** @description At least one of phone, e-mail, Telegram. */
        Contacts: {
            /** Format: email */
            email?: string | null;
            /** @description E.164 after normalization. */
            phone?: string | null;
            /** @description Telegram username, stored with a leading @. */
            telegram?: string | null;
        };
        CreatePhoneOrder: {
            /** @description The incoming call this order is made during (GET /api/operator/v1/calls): the order is linked to it, and ending the call does not cancel the order (REQ-OPS-10). A call already linked to another order → 409 STATE_CONFLICT unless link_again is true; the first link stays. */
            call_id?: components["schemas"]["Uuid"] | null;
            /** @description Optional telephony/call reference stored as the order source_ref; no telephony integration is implied. */
            call_ref?: string;
            caller: components["schemas"]["Caller"];
            command_id: components["schemas"]["Uuid"];
            dropoff: components["schemas"]["GeoPoint"];
            dropoff_label?: string;
            /** @description Link a call that already has an order to this one too (e.g. the caller orders a second car). */
            link_again?: boolean | null;
            /** @enum {string} */
            payment_method: "CASH" | "TERMINAL";
            pickup: components["schemas"]["GeoPoint"];
            /** @description The quote's pickup time; must be the same as in CreateQuote, otherwise QUOTE_MISMATCH. */
            pickup_at?: components["schemas"]["Timestamp"];
            pickup_label?: string;
            quote_id: components["schemas"]["Uuid"];
            /** @description Only with TERMINAL — the caller agreed to pay cash if no car with a terminal takes the order. */
            terminal_fallback_to_cash?: boolean | null;
            vehicle_class: string;
        };
        CreateQuote: {
            command_id: components["schemas"]["Uuid"];
            dropoff: components["schemas"]["GeoPoint"];
            pickup: components["schemas"]["GeoPoint"];
            /** @description Pickup time for an order for later. At least threshold_minutes ahead (config bootstrap) it is a pre-order that waits as SCHEDULED (ADR 0006); nearer, it is an ordinary order searched for at once. At most max_days_ahead days ahead; in the past → 400. */
            pickup_at?: components["schemas"]["Timestamp"];
            vehicle_class: string;
        };
        Decision: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            /** @description The resolution, or the reason to reopen / close. */
            text: string;
        };
        DispatchAttempt: {
            /** Format: date-time */
            assigned_at: string | null;
            attempt_id: components["schemas"]["Uuid"];
            /**
             * Format: date-time
             * @description When the order went to every nearby driver after the personal phase.
             */
            broadcast_at: string | null;
            /** Format: date-time */
            ended_at: string | null;
            /** Format: date-time */
            first_offer_at: string | null;
            generation: number;
            offers: components["schemas"]["DispatchOffer"][];
            /**
             * @description SEARCHING — still going; ASSIGNED — a driver took it; EXHAUSTED — the search time ran out; STOPPED — ended otherwise (cancelled, interrupted).
             * @enum {string}
             */
            outcome: "SEARCHING" | "ASSIGNED" | "EXHAUSTED" | "STOPPED";
            rounds: components["schemas"]["DispatchRound"][];
            /** Format: date-time */
            started_at: string;
        };
        DispatchCandidate: {
            /** @description From the driver's last position to the pickup, in metres; null without a position. */
            distance_m: number | null;
            driver_id: components["schemas"]["Uuid"];
            /**
             * @description OFFERED — got the offer; ELIGIBLE — would have qualified but someone nearer got it; EXCLUDED.
             * @enum {string}
             */
            outcome: "OFFERED" | "ELIGIBLE" | "EXCLUDED";
            /** @description Why an EXCLUDED driver was left out (the first check that failed); null otherwise. */
            reason: components["schemas"]["ExclusionReason"] | null;
        };
        DispatchJournal: {
            /** @description The order's search attempts, the first first (a new one after a driver was released). */
            attempts: components["schemas"]["DispatchAttempt"][];
        };
        DispatchOffer: {
            /** Format: date-time */
            closed_at: string | null;
            distance_m: number | null;
            driver_id: components["schemas"]["Uuid"];
            offer_id: components["schemas"]["Uuid"];
            /** Format: date-time */
            offered_at: string;
            /**
             * @description OPEN — still waiting for the driver.
             * @enum {string}
             */
            result: "OPEN" | "ACCEPTED" | "DECLINED" | "EXPIRED" | "REVOKED";
        };
        /** @description One choice of the next driver for a personal offer: the nearest drivers with an open shift in the order's city (at most 50), and for each the outcome. A round where nobody was OFFERED ends the personal phase. */
        DispatchRound: {
            /** Format: date-time */
            at: string;
            candidates: components["schemas"]["DispatchCandidate"][];
            /** @enum {string} */
            phase: "PERSONAL" | "BROADCAST";
            /** @description The largest search radius of the round; farther drivers are TOO_FAR. */
            radius_m: number;
        };
        /**
         * @description What a driver's reason does: RETURN_TO_SEARCH gives the order back to the search, CANCEL_ORDER cancels it by the driver. Only drivers' reasons have it.
         * @enum {string|null}
         */
        DriverOutcome: "RETURN_TO_SEARCH" | "CANCEL_ORDER" | null;
        EmergencyGrant: {
            /** @description Not revoked and not expired when read. */
            active: boolean;
            all_cities: boolean;
            city_ids: components["schemas"]["Uuid"][];
            expires_at: components["schemas"]["Timestamp"];
            granted_at: components["schemas"]["Timestamp"];
            granted_by: components["schemas"]["Uuid"];
            id: components["schemas"]["Uuid"];
            permissions: string[];
            reason: string;
            revoke_reason: string | null;
            /** Format: date-time */
            revoked_at: string | null;
            revoked_by: components["schemas"]["Uuid"] | null;
            staff_id: components["schemas"]["Uuid"];
        };
        EmergencyGrantList: {
            grants: components["schemas"]["EmergencyGrant"][];
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
        /**
         * @description STALE_LOCATION — no recent heartbeat or position; PAUSED — the shift does not take orders now; NOT_ADMITTED — the account, admission or vehicle is not approved; CLASS — the vehicle has not the order's class; PAYMENT — no payment terminal for an order paid at one; BUSY — offered another order or on a trip; RESTRICTED — an active restriction (debt); ALREADY_OFFERED — had this order offered already; PREVIOUS_DRIVER — was released from this order (or its related one); TOO_FAR — beyond the search radius.
         * @enum {string}
         */
        ExclusionReason: "STALE_LOCATION" | "PAUSED" | "NOT_ADMITTED" | "CLASS" | "PAYMENT" | "BUSY" | "RESTRICTED" | "ALREADY_OFFERED" | "PREVIOUS_DRIVER" | "TOO_FAR";
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
        InterruptedOrder: {
            follow_up: components["schemas"]["OperatorOrder"] | null;
            order: components["schemas"]["OperatorOrder"];
        };
        InterruptOrder: {
            command_id: components["schemas"]["Uuid"];
            comment?: string;
            /** Format: int64 */
            expected_version: number;
            follow_up: boolean;
            follow_up_pickup?: components["schemas"]["GeoPoint"];
            follow_up_pickup_label?: string;
            /** @description From GET /api/operator/v1/cancel-reasons, e.g. VEHICLE_BREAKDOWN, ACCIDENT. */
            reason_code: string;
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
        Me: {
            effective_permissions: string[];
            member: components["schemas"]["StaffMember"];
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
        MyCallStatus: {
            /**
             * Format: date-time
             * @description Null when never set.
             */
            changed_at: string | null;
            /** @description My internal number, set by the admin; null without one (no click-to-call then). */
            extension: string | null;
            status: components["schemas"]["OperatorCallStatus"];
        };
        OpenAttachmentUpload: {
            command_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            content_type: "image/jpeg" | "image/png" | "image/webp" | "application/pdf";
            /** Format: int64 */
            size_bytes: number;
        };
        OperatorBonusAccount: {
            balance: number;
            cancelled_count: number;
            fulfilled_count: number;
            last_entries: components["schemas"]["OperatorBonusEntry"][];
            /** Format: date-time */
            period_started_at: string;
            staff_id: components["schemas"]["Uuid"];
        };
        OperatorBonusEntry: {
            /** @enum {string} */
            kind: "FULFILLED" | "OPERATOR_FAULT_CANCELLATION";
            /** Format: date-time */
            occurred_at: string;
            order_id: components["schemas"]["Uuid"];
            points: number;
            /** @description The key of the matching time rule, or "default". */
            rule_key: string;
            /** Format: int64 */
            settings_version: number;
        };
        /**
         * @description Set by the operator. Only shown and used for the card-pop (it goes to the AVAILABLE operators of the city when there is one, else to all); calls are not routed by it. OFFLINE when never set.
         * @enum {string}
         */
        OperatorCallStatus: "AVAILABLE" | "BREAK" | "OFFLINE";
        OperatorOrder: components["schemas"]["Order"] & {
            caller?: components["schemas"]["Caller"] | null;
            /** @description The driver holding a SCHEDULED pre-order (ADR 0006); null otherwise. */
            reservation?: components["schemas"]["ReservationHolder"] | null;
        };
        OperatorSwitchToCash: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            /** @description That the rider asked, and how; audited. */
            reason: string;
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
        /** @description Rings the operator's own phone (their extension) and then the other side. The number is never part of the request or the response. A repeat of the command returns the first call and does not ring again. */
        PlaceCall: {
            command_id: components["schemas"]["Uuid"];
            to: components["schemas"]["CallParty"];
        };
        PlaceList: {
            places: components["schemas"]["Place"][];
            /** @description The provider in force (BUILT_IN, GOOGLE, VISICOM; FAKE in the sandbox) — for its attribution. */
            provider: string;
        };
        Prioritize: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            priority: components["schemas"]["Priority"];
            reason?: string | null;
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
        Profile: {
            /** @description Every city, including ones added later; always true for a super admin. */
            all_cities?: boolean;
            /** @description The cities the member works in when all_cities is false. */
            city_ids?: components["schemas"]["Uuid"][];
            contacts: components["schemas"]["Contacts"];
            first_name: string;
            last_name: string;
            /** @description Ticked function codes from listPermissions; ignored (empty) for a super admin. */
            permissions?: string[];
            role: components["schemas"]["Role"];
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
        RemoveReservation: {
            command_id: components["schemas"]["Uuid"];
            reason: string;
        };
        ReservationHolder: {
            driver_id: components["schemas"]["Uuid"];
            driver_name: string | null;
            reservation_id: components["schemas"]["Uuid"];
            reserved_at: components["schemas"]["Timestamp"];
        };
        RevokeAssignment: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        /** @enum {string} */
        Role: "SUPER_ADMIN" | "ADMIN" | "OPERATOR";
        StaffMember: {
            id: components["schemas"]["Uuid"];
            login: string;
            password_change_required: boolean;
            profile: components["schemas"]["Profile"];
            /** @enum {string} */
            state: "INVITED" | "ACTIVE" | "SUSPENDED" | "DISABLED";
            /** Format: int64 */
            version: number;
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
        Timeline: {
            /** @description Why a driver did or did not get the order (REQ-DSP-12): the search attempts, offers and the candidates of every round with the reasons they were left out. Only in the operator API (orders.view). */
            dispatch?: components["schemas"]["DispatchJournal"];
            events: components["schemas"]["TimelineEntry"][];
        };
        /** @description One change of the order. A cancellation (type OrderCancelled or PassengerNoShow) has cancelled_by, reason_code and reason_labels in details, so the panel can show "Operator Anna cancelled the order: passenger asked". A driver giving the order back (AssignmentWithdrawn) has reason_code and reason_labels when given through a reason from the list. */
        TimelineEntry: {
            actor: {
                id: components["schemas"]["Uuid"] | null;
                /** @description Staff member's first and last name or driver's name; null for others. */
                name: string | null;
                /**
                 * @description The staff member's current role.
                 * @enum {string|null}
                 */
                role: "SUPER_ADMIN" | "ADMIN" | "OPERATOR" | null;
                /** @enum {string} */
                type: "STAFF" | "CLIENT" | "DRIVER" | "PARTNER" | "SYSTEM";
            };
            /** @description The request or job that made the change (REQ-OBS-01/04) — search it in GET /api/admin/v1/logs/correlation/{correlation_id}; null for events older than the column. */
            correlation_id: components["schemas"]["Uuid"] | null;
            details: {
                [key: string]: unknown;
            };
            occurred_at: components["schemas"]["Timestamp"];
            reason: string | null;
            /** Format: int64 */
            sequence: number;
            /**
             * @example OrderCreated
             * @example OrderCancelled
             * @example AssignmentWithdrawn
             * @example PassengerNoShow
             * @example TripCompleted
             */
            type: string;
        };
        /**
         * Format: date-time
         * @description Moment in UTC, RFC 3339.
         * @example 2026-10-26T12:00:00Z
         */
        Timestamp: string;
        UploadSession: {
            expires_at: components["schemas"]["Timestamp"];
            file_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            max_bytes: number;
            upload_path: string;
        };
        /** Format: uuid */
        Uuid: string;
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
        OrderId: components["schemas"]["Uuid"];
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
    listCalls: {
        parameters: {
            query?: {
                limit?: number;
                order_id?: components["schemas"]["Uuid"];
                state?: components["schemas"]["CallState"];
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
                    "application/json": components["schemas"]["CallList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    answerCall: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                call_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["AnswerCall"];
            };
        };
        responses: {
            /** @description Taken. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Call"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listenToCallRecording: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                call_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description The recording. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "audio/wav": string;
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    listOperatorCancelReasons: {
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
            403: components["responses"]["Forbidden"];
        };
    };
    getLiveDrivers: {
        parameters: {
            query: {
                /** @description The part of the map in view, min_lat,min_lon,max_lat,max_lon. */
                box?: number[];
                city_id: components["schemas"]["Uuid"];
                /** @description Only drivers with a fresh position. */
                fresh?: boolean;
                /** @description Any of these (repeat the parameter). */
                status?: ("FREE" | "ON_ORDER" | "PAUSED" | "CLOSING" | "NO_SIGNAL")[];
                vehicle_class?: string;
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
            /** @description By name. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        at: components["schemas"]["Timestamp"];
                        city_id: components["schemas"]["Uuid"];
                        drivers: {
                            car?: null | {
                                classes: string[];
                                color: string;
                                make: string;
                                model: string;
                                registration_number: string;
                            };
                            /** @enum {string} */
                            connection: "CONNECTED" | "STALE" | "DISCONNECTED";
                            driver_id: components["schemas"]["Uuid"];
                            /** @enum {string} */
                            geolocation: "FRESH" | "STALE" | "UNAVAILABLE";
                            has_payment_terminal: boolean;
                            last_location_at?: components["schemas"]["Timestamp"] | null;
                            location?: null | {
                                lat: number;
                                lon: number;
                            };
                            name?: string | null;
                            occupancy: string;
                            /** @description The order the driver is on. */
                            order_id?: components["schemas"]["Uuid"] | null;
                            /**
                             * @description FREE — may get an order now; ON_ORDER; PAUSED — not accepting; CLOSING — finishing the last order; NO_SIGNAL — connection or position lost.
                             * @enum {string}
                             */
                            status: "FREE" | "ON_ORDER" | "PAUSED" | "CLOSING" | "NO_SIGNAL";
                        }[];
                    };
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    getOperatorMe: {
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
                    "application/json": components["schemas"]["Me"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    getMyOperatorBonus: {
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
                    "application/json": components["schemas"]["OperatorBonusAccount"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    getMyCallStatus: {
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
                    "application/json": components["schemas"]["MyCallStatus"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    changeMyCallStatus: {
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
                "application/json": components["schemas"]["ChangeMyCallStatus"];
            };
        };
        responses: {
            /** @description My status now. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["MyCallStatus"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    getMyEmergencyGrants: {
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
                    "application/json": components["schemas"]["EmergencyGrantList"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    changeOperatorPassword: {
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
                "application/json": components["schemas"]["ChangePassword"];
            };
        };
        responses: {
            /** @description Done. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    listCallOperators: {
        parameters: {
            query: {
                city_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["CallOperatorList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    listOperatorOrders: {
        parameters: {
            query: {
                /** @description Exclusive created_at cursor; returns older orders. */
                before?: string;
                city_id: components["schemas"]["Uuid"];
                limit?: number;
                status?: "active" | "all";
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
            /** @description Orders of the requested city, newest first. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OperatorOrder"][];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    createOperatorOrder: {
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
                "application/json": components["schemas"]["CreatePhoneOrder"];
            };
        };
        responses: {
            /** @description The order, already searching for a driver. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OperatorOrder"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    getOperatorOrder: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["parameters"]["OrderId"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description The order and caller contact when it is a phone order. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OperatorOrder"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    placeOrderCall: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["parameters"]["OrderId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["PlaceCall"];
            };
        };
        responses: {
            /** @description Ringing my phone. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Call"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            503: components["responses"]["ServiceUnavailable"];
        };
    };
    cancelOperatorOrder: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["parameters"]["OrderId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["CancelOrder"];
            };
        };
        responses: {
            /** @description Cancelled order. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OperatorOrder"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getOperatorOrderEvents: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["parameters"]["OrderId"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description The history. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Timeline"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    interruptTrip: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["parameters"]["OrderId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["InterruptOrder"];
            };
        };
        responses: {
            /** @description The interrupted order and the follow-up, if any. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["InterruptedOrder"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getOperatorOrderConversation: {
        parameters: {
            query: {
                /** @description Why the operator opened the conversation; written to audit. */
                reason: string;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["parameters"]["OrderId"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Complete conversation, oldest first. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["ChatMessages"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    getOperatorOrderRatings: {
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
            /** @description Up to the rider and driver active ratings. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        ratings: {
                            /** Format: uuid */
                            author_id: string;
                            /** @enum {string} */
                            author_type: "RIDER" | "DRIVER";
                            comment?: string | null;
                            /** Format: date-time */
                            created_at: string;
                            /** Format: uuid */
                            order_id: string;
                            score: number;
                            /** Format: uuid */
                            target_id: string;
                            /** @enum {string} */
                            target_type: "RIDER" | "DRIVER";
                        }[];
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    removePreorderReservation: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["parameters"]["OrderId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["RemoveReservation"];
            };
        };
        responses: {
            /** @description The order. */
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    revokeOperatorOrderAssignment: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                order_id: components["parameters"]["OrderId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["RevokeAssignment"];
            };
        };
        responses: {
            /** @description Order after the assignment was revoked. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OperatorOrder"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    operatorSwitchOrderToCash: {
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
                "application/json": components["schemas"]["OperatorSwitchToCash"];
            };
        };
        responses: {
            /** @description The order, now CASH with payment_state CASH_EXPECTED. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OperatorOrder"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    searchOperatorPlaces: {
        parameters: {
            query: {
                /** @description Adds the order history of the caller's rider account, when there is one. */
                caller_phone?: string;
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
            403: components["responses"]["Forbidden"];
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
    reverseOperatorPlace: {
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
            403: components["responses"]["Forbidden"];
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
    createOperatorQuote: {
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
            503: components["responses"]["ServiceUnavailable"];
        };
    };
    listOperatorSupportQueue: {
        parameters: {
            query?: {
                assigned_staff_id?: components["schemas"]["Uuid"];
                before?: components["schemas"]["Timestamp"];
                category?: components["schemas"]["Category"];
                /** @description The queue of one city; without it, the cases without a city. */
                city_id?: components["schemas"]["Uuid"];
                limit?: number;
                priority?: components["schemas"]["Priority"];
                state?: components["schemas"]["State"];
                unassigned?: boolean;
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
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    getOperatorSupportCase: {
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    assignOperatorSupportCase: {
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
                "application/json": components["schemas"]["Assign"];
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
    downloadOperatorSupportAttachment: {
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    closeOperatorSupportCase: {
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
                "application/json": components["schemas"]["Decision"];
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
    commentOperatorSupportCase: {
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
                "application/json": components["schemas"]["Comment"];
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
    priorityOperatorSupportCase: {
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
                "application/json": components["schemas"]["Prioritize"];
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
    reopenOperatorSupportCase: {
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
                "application/json": components["schemas"]["Decision"];
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
    resolveOperatorSupportCase: {
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
                "application/json": components["schemas"]["Decision"];
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
    openOperatorSupportAttachmentUpload: {
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
            403: components["responses"]["Forbidden"];
        };
    };
    uploadOperatorSupportAttachment: {
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    openOperatorLiveChannel: {
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
