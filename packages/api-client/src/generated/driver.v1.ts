export interface paths {
    "/api/driver/v1/assignments/current": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The authoritative current assignment
         * @description 204 when there is none.
         */
        get: operations["getCurrentAssignment"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/balance": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Settlement balance with the service
         * @description Per currency, from the journal (REQ-LED-01). Positive — the service owes the driver; negative — the
         *     driver owes the service, e.g. the commission of cash trips (REQ-PAY-16). This is the settlement
         *     balance only; "available for payout" is a separate figure that arrives with payouts (REQ-LED-06).
         */
        get: operations["getDriverBalance"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/balance/card-top-ups": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Top up the balance by card
         * @description Opens the provider's payment page of the city's merchant (404 when the city takes no cards). The app POSTs `fields` to `url` in a web view; the account is credited when the provider confirms the payment.
         */
        post: operations["startDriverCardTopUp"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/balance/card-top-ups/{top_up_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Result of a card top-up */
        get: operations["getDriverCardTopUp"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/balance/history": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** My balance and its movements */
        get: operations["getDriverBalanceHistory"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/broadcast-orders": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Orders in the ALL tab
         * @description Only for an eligible driver, filtered by city, class and distance; no passenger contact (REQ-DRV-08). At most
         *     `blizz.rate-limits.buckets.broadcast-list` reads per driver (120 per minute; 429) (issue #102).
         */
        get: operations["listBroadcastOrders"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/cancel-reasons": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Reasons a driver can give when cancelling
         * @description The drivers' list from the admin panel; driver_outcome tells the app whether the order will go back to the search or be cancelled.
         */
        get: operations["listDriverCancelReasons"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/documents": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Add a document
         * @description A new document never overwrites an older one; the latest of each type becomes current
         *     (REQ-DRV-02). VEHICLE_REGISTRATION and INSURANCE need vehicle_id, other types must not have it.
         *     file_id is a file of this driver that passed the checks (state SAFE), uploaded through
         *     /documents/upload-sessions and /uploads/{file_id}.
         */
        post: operations["addDocument"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/documents/upload-sessions": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Open an upload session for one document file
         * @description Declares the type and size of one file. The session is short-lived and single-use
         *     (REQ-SEC-06). Accepted types: image/jpeg, image/png, application/pdf; at most 10 MB by default.
         */
        post: operations["openDocumentUpload"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/earnings": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * My earnings per day
         * @description Separate figures per local day of the city (REQ-DRV-12).
         */
        get: operations["getDriverEarnings"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/files/{file_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Download an own file
         * @description Only the owner, only SAFE files; anyone else gets 404 (REQ-SEC-07).
         */
        get: operations["downloadFile"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/legal": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Legal texts in force and what I still have to accept
         * @description The versions in force for drivers. One with acceptance_required and not accepted blocks going online (403 ACCEPTANCE_REQUIRED). The text itself — GET /api/config/v1/legal/{audience}/{kind}.
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
    "/api/driver/v1/legal/acceptances": {
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
    "/api/driver/v1/location-batches": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Store buffered GPS track points
         * @description Stores points from the device session in the access token. Points may arrive out of order or
         *     after newer heartbeats; this endpoint only appends to the location track and never updates the
         *     current position in the work session (REQ-GEO-02, REQ-GEO-05, T-14).
         */
        post: operations["storeDriverLocationBatch"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/me": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Who the access token belongs to */
        get: operations["getDriverMe"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/me/phone-change": {
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
        post: operations["changeDriverPhone"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/me/phone-change/current-code": {
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
        post: operations["requestDriverCurrentPhoneCode"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/me/phone-change/new-code": {
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
        post: operations["requestDriverNewPhoneCode"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/me/rating": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * My average rider score
         * @description Aggregate only; comments and author identities are never exposed.
         */
        get: operations["getDriverRatingSummary"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/offers": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Open personal offers
         * @description At most one in M1; expires_at is the server deadline (REQ-DRV-07).
         */
        get: operations["listOffers"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/offers/{offer_id}/accept": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Accept an offer
         * @description Before the server deadline only; a late or revoked offer gets OFFER_EXPIRED / OFFER_REVOKED. A repeated command returns the original assignment (T-10). Only from the device that holds the open shift (409 STATE_CONFLICT from another signed-in device, issue
         */
        post: operations["acceptOffer"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/offers/{offer_id}/reject": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Decline an offer
         * @description The search continues with the next driver.
         */
        post: operations["rejectOffer"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/orders/{order_id}/claim": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Take an order from the ALL tab
         * @description Exactly one of many simultaneous claims wins; the others get ORDER_ALREADY_ASSIGNED (T-05). Only from the
         *     device that holds the open shift (409 STATE_CONFLICT from another signed-in device: take the shift over
         *     first), only within the ALL tab's radius from the driver's current position (422 PICKUP_TOO_FAR), and at most
         *     `blizz.rate-limits.buckets.broadcast-claim` claims per driver (30 per 10 minutes; 429) (issue #102).
         */
        post: operations["claimOrder"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/orders/{order_id}/rating": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * My rating after a fulfilled trip
         * @description The comment is staff-only and is never returned to the driver. Non-participants and non-fulfilled orders look like 404.
         */
        get: operations["getDriverOrderRating"];
        put?: never;
        /**
         * Rate the rider after a fulfilled trip
         * @description Score 1–5; the comment is staff-only. The configured edit window applies.
         */
        post: operations["rateRider"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/preorders": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Pre-orders the driver can reserve
         * @description Only when the service releases pre-orders by reservation (settings, ADR 0006); otherwise an empty list. Pre-orders of the driver's city and vehicle class that nobody holds and the driver has not held before. Needs an open work session; being busy with another ride is fine.
         */
        get: operations["listPreorders"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/preorders/{order_id}/reserve": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Reserve a pre-order
         * @description One driver per pre-order (taken → ORDER_ALREADY_ASSIGNED); at most 3 open reservations per driver; not again an order the driver held before. In BROADCAST_BEFORE mode → 409.
         */
        post: operations["reservePreorder"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/preorders/reservations": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** The driver's open reservations */
        get: operations["listPreorderReservations"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/preorders/reservations/{reservation_id}/confirm": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * On my way
         * @description Between confirm_from and confirm_until; earlier or later → 409. The driver must be free, online and eligible. The order becomes ASSIGNED to the driver (source RESERVATION) and the trip starts in TO_PICKUP. Not confirmed by confirm_until, the reservation expires and the order goes to the search.
         */
        post: operations["confirmPreorderReservation"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/preorders/reservations/{reservation_id}/drop": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Give the pre-order back
         * @description Until drop_until (driver_cancel_until_minutes_before the pickup); later → 409, only a dispatcher can take the driver off. reason_code is from the drivers' list of cancellation reasons. The pre-order stays SCHEDULED.
         */
        post: operations["dropPreorderReservation"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/profile": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Own admission profile
         * @description Profile, vehicles and the current document of each type with its review decision.
         */
        get: operations["getDriverProfile"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        /**
         * Change own name or language
         * @description Only the listed fields can be changed; admission status changes only through commands (REQ-API-03).
         */
        patch: operations["updateDriverProfile"];
        trace?: never;
    };
    "/api/driver/v1/promotions": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Promotions for me and how far I am
         * @description Active promotions with the current period, orders done and whether the reward was paid (ADR 0010).
         */
        get: operations["getDriverPromotionProgress"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/push-devices": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** The phones that receive pushes */
        get: operations["listDriverPushDevices"];
        put?: never;
        /**
         * Register the app's push token
         * @description Tied to the session of the access token: after a logout or a revoked session nothing more is sent to the phone (REQ-AUTH-07). A push is never a confirmation by itself — the app reads the order over REST (REQ-NTF-01). The push data carries `type` (the template), `event_type`, `event_id`, `order_id` and `order_version`; nothing personal.
         */
        post: operations["registerDriverPushDevice"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/push-devices/{device_id}/remove": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Stop pushes to a phone */
        post: operations["removeDriverPushDevice"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/safety-contacts": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Support and emergency contacts for the safety button
         * @description For the city of the driver's open work session; without one → 409 STATE_CONFLICT. A city without configured contacts gets 112 and no support phone. Labels in the driver's language. Nothing is sent to emergency services automatically (REQ-RID-09).
         */
        get: operations["getDriverSafetyContacts"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/support/cases": {
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
        get: operations["listDriverSupportCases"];
        put?: never;
        /**
         * Open a support case
         * @description About one of my orders or in general; the first message is PUBLIC.
         */
        post: operations["openDriverSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/support/cases/{case_id}": {
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
        get: operations["getDriverSupportCase"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/support/cases/{case_id}/attachments/{file_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Download a PUBLIC attachment of my support case */
        get: operations["downloadDriverSupportAttachment"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/support/cases/{case_id}/messages": {
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
        post: operations["replyDriverSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/support/uploads": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Open an upload session for one support attachment */
        post: operations["openDriverSupportAttachmentUpload"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/transfer-rules": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Limits of transfers between drivers */
        get: operations["getDriverTransferRules"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/transfers": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Send part of my balance to another driver
         * @description The other driver is found by phone. Within the rules of the currency (GET /api/driver/v1/transfer-rules): transfers off → 409; above one transfer's or the day's limit → 400; the balance would fall below the minimum → 422 WALLET_INSUFFICIENT; no active driver with the phone → 404 (ADR 0010). The day is local to the current or last work-session city; no work-session city → 409 STATE_CONFLICT.
         */
        post: operations["transferToDriver"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/trips": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Own completed and aborted trips
         * @description Completed and aborted trips of the signed-in driver, newest first. Use created_at of the last item as before.
         */
        get: operations["listDriverTripHistory"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/trips/{trip_id}/arrive": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * I have arrived
         * @description TO_PICKUP → WAITING. The last server-side position must be fresh, accurate to 100 m and within 150 m of the pickup; otherwise PICKUP_TOO_FAR, or LOCATION_NOT_FRESH for a stale or inaccurate position — repeat with exception_reason to confirm, the trip is then flagged for review (REQ-ASG-06).
         */
        post: operations["arriveAtPickup"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/trips/{trip_id}/call": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Phone target for the active rider or phone caller
         * @description Available only to the driver of the COMMITTED assignment while the order is ASSIGNED or IN_SERVICE.
         *     DIRECT returns the rider account phone or the caller phone stored on a staff PHONE order.
         *     VIA_SERVICE_NUMBERS returns only the configured service phone. A released or revoked assignment is hidden
         *     as 404; outside the active call window → 409 STATE_CONFLICT.
         */
        get: operations["getDriverTripCallTarget"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/trips/{trip_id}/cancel": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Cancel with a reason from the drivers' list
         * @description Only before the start (TO_PICKUP or WAITING); after the start → 409. reason_code is a code from GET /api/driver/v1/cancel-reasons; an unknown or inactive code → 400. The reason decides the outcome (owner decision 27.10.2026): RETURN_TO_SEARCH — the driver is free at once, is not offered this order again and the order goes back to the search with the remaining search time (REQ-ASG-04, REQ-CAN-05); CANCEL_ORDER — the order is cancelled with cancellation.by = DRIVER; NO_SHOW — the rules of /no-show apply.
         */
        post: operations["cancelTrip"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/trips/{trip_id}/complete": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Complete the trip
         * @description IN_PROGRESS → COMPLETED; the driver is free at once. reported_at is the device time; a large difference from server time is flagged. For CASH and TERMINAL (a card at the driver's own terminal), cash_received is required — the driver's statement that the money came, not proof (REQ-PAY-15).
         */
        post: operations["completeTrip"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/trips/{trip_id}/messages": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Chat messages of the order
         * @description Oldest first, after the given sequence. The driver reads only the messages of his own assignment.
         */
        get: operations["listDriverMessages"];
        put?: never;
        /**
         * Write to the rider
         * @description Open once a driver is assigned and for 24 hours after the trip or the cancellation, so the rider can
         *     write from the order details; later it is read-only and contact goes through support (owner decision
         *     29.10.2026) → 409 STATE_CONFLICT; with no driver ever assigned → 409 STATE_CONFLICT. A driver
         *     who withdrew or was taken off the order cannot write → 404.
         *     1 to 1000 characters. A repeat of the same command_id returns the same message. The conversation is
         *     kept for the order details in the admin panel.
         */
        post: operations["postDriverMessage"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/trips/{trip_id}/no-show": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * The passenger did not come out
         * @description Only in WAITING and not earlier than the minimum waiting time after the server-side arrival (REQ-CAN-06, T-20); earlier → 409. The order is cancelled by the driver (cancellation.by = DRIVER) with reason NO_SHOW and the driver is free. No fee until the cancellation policy is decided (Q-07).
         */
        post: operations["reportNoShow"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/trips/{trip_id}/start": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Start the trip
         * @description WAITING → IN_PROGRESS. Starting without a confirmed arrival needs exception_reason and is flagged for review (REQ-ASG-05).
         */
        post: operations["startTrip"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/trips/current": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The current trip
         * @description Restores the trip after an app restart; 204 when there is none.
         */
        get: operations["getCurrentTrip"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/uploads/{file_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        /**
         * Upload the file bytes
         * @description The raw body with the declared Content-Type. The server checks the real type by content,
         *     the size, removes photo metadata and scans the file. The result is SAFE or REJECTED with a
         *     reason; a rejected file is deleted and needs a new session. QUARANTINE when the antivirus could not
         *     answer: the file is kept and scanned again until it is SAFE or REJECTED (issue #105), and cannot be
         *     attached meanwhile. A 409 on attaching it means it is still in quarantine or was rejected by that later
         *     scan; when it is still refused after a day, upload the document again.
         */
        put: operations["uploadFile"];
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/vehicles": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Add a vehicle for review */
        post: operations["addVehicle"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/verification/submit": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Submit for review
         * @description NOT_SUBMITTED, CHANGES_REQUIRED or EXPIRED → IN_REVIEW. Needs a vehicle and every required,
         *     non-rejected, currently valid document; otherwise VALIDATION_FAILED lists what is missing.
         */
        post: operations["submitForVerification"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/work-sessions": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Go online
         * @description Requires an active account, admission, an approved own vehicle and a fresh location inside a
         *     published city (REQ-DRV-04). The device of the access token becomes the controlling device;
         *     another device gets STATE_CONFLICT and must use handover (REQ-DRV-03).
         */
        post: operations["openWorkSession"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/work-sessions/{id}/close": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Go offline
         * @description FREE → CLOSED; on a trip → CLOSING, closed when the trip ends (REQ-DRV-13).
         */
        post: operations["closeWorkSession"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/work-sessions/{id}/handover": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Take control from another device
         * @description Moves control of the open session to the device of this token; the session and any trip continue (T-16).
         */
        post: operations["handoverWorkSession"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/work-sessions/{id}/heartbeat": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Keep the connection and send the current location
         * @description Safe to repeat. A point whose sequence is not newer than the stored one does not move the
         *     current position (REQ-GEO-02). Without a location the connection is restored but location
         *     freshness is not (REQ-DS-04). Batched track upload comes with the location module.
         */
        post: operations["workSessionHeartbeat"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/work-sessions/{id}/pause": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Stop receiving orders
         * @description FREE → NOT_ACCEPTING; on a trip → PAUSE_AFTER_CURRENT (REQ-DRV-13).
         */
        post: operations["pauseWorkSession"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/work-sessions/{id}/resume": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Receive orders again
         * @description Re-checks admission and vehicle; DRIVER_NOT_ELIGIBLE otherwise.
         */
        post: operations["resumeWorkSession"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/driver/v1/work-sessions/current": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Current state on every axis
         * @description Session, intent, connection, location freshness, occupancy, account and admission, with eligibility reasons (section 12.1).
         */
        get: operations["getDriverAvailability"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/ws/v1/driver": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Live channel (WebSocket)
         * @description Upgrade to a WebSocket with the driver access token — the `Authorization: Bearer` header, or `access_token` in the query where headers cannot be set. The server pushes a message for every change of an order the driver (also an order offered to him) takes part in (section 20, REQ-NTF-04): `{"event_id", "type", "schema_version", "aggregate_type": "Order", "aggregate_id", "aggregate_version", "occurred_at", "correlation_id", "payload": {}}`. It carries no personal data: on a message the app reads the order over REST; duplicates and older versions are dropped, a gap in versions means read the snapshot (REQ-NTF-01). The first message is `{"type": "Connected"}`; the client may send `ping` (answer `{"type": "Pong"}`). Closed with code 4403 within seconds when the session is revoked or a right it needs is taken away (sign in again), and 4401 when the access token expires — reconnect with a fresh one. Commands stay REST (REQ-NTF-06).
         */
        get: operations["openDriverLiveChannel"];
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
        Assignment: {
            driver_id: components["schemas"]["Uuid"];
            id: components["schemas"]["Uuid"];
            order_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            source: "OFFER" | "BROADCAST" | "RESERVATION";
            /** @enum {string} */
            state: "RESERVED" | "COMMITTED" | "RELEASED" | "REVOKED" | "COMPLETED";
            /** Format: uuid */
            trip_id?: string | null;
            /** @enum {string|null} */
            trip_phase?: "TO_PICKUP" | "WAITING" | "IN_PROGRESS" | "COMPLETED" | "ABORTED" | null;
            vehicle_id: components["schemas"]["Uuid"];
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
        BroadcastOrder: {
            currency?: string | null;
            distance_m: number;
            dropoff_label: string;
            order_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            payment_method: "CASH" | "CARD" | "SERVICE" | "TERMINAL";
            pickup: components["schemas"]["GeoPoint"];
            pickup_label: string;
            /** Format: int64 */
            price_minor?: number | null;
            vehicle_class: string;
        };
        CallTarget: {
            /** @enum {string} */
            mode: "DIRECT" | "VIA_SERVICE_NUMBERS";
            phone: string;
        };
        CancelTripCommand: {
            command_id: components["schemas"]["Uuid"];
            /**
             * Format: int64
             * @description Trip version from the last snapshot.
             */
            expected_version: number;
            /** @description A code from the drivers' list of cancellation reasons. */
            reason_code: string;
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
        Command: {
            command_id: components["schemas"]["Uuid"];
        };
        CompleteCommand: {
            /** @description CASH — the cash was received; TERMINAL — the card payment at the driver's terminal went through. */
            cash_received?: boolean;
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reported_at: components["schemas"]["Timestamp"];
        };
        Created: {
            id: components["schemas"]["Uuid"];
        };
        Document: {
            /** @enum {string} */
            decision: "PENDING" | "ACCEPTED" | "REJECTED";
            decision_reason?: string | null;
            /** Format: uuid */
            file_id?: string | null;
            id: components["schemas"]["Uuid"];
            number?: string | null;
            type: components["schemas"]["DocumentType"];
            /** Format: date */
            valid_from?: string | null;
            /** Format: date */
            valid_to?: string | null;
            /** Format: uuid */
            vehicle_id?: string | null;
        };
        DocumentInput: {
            command_id: components["schemas"]["Uuid"];
            file_id: components["schemas"]["Uuid"];
            number?: string;
            type: components["schemas"]["DocumentType"];
            /** Format: date */
            valid_from?: string;
            /** Format: date */
            valid_to?: string;
            vehicle_id?: components["schemas"]["Uuid"];
        };
        /** @enum {string} */
        DocumentType: "DRIVER_LICENSE" | "IDENTITY" | "TAXI_PERMIT" | "VEHICLE_REGISTRATION" | "INSURANCE" | "OTHER";
        DriverAvailability: {
            /**
             * @description Only in the heartbeat answer (issue #102): false when the location sent was not taken as the dispatch
             *     position because it implies a movement faster than 250 km/h from the driver's last accepted position
             *     (geolocation is then STALE until a plausible fix arrives) or its time is ahead of the server's; true
             *     otherwise, also without a location or for an older sequence, which is ignored as before. Keep sending.
             */
            accepted?: boolean;
            account_state: string;
            /** Format: uuid */
            city_id?: string | null;
            /** @enum {string} */
            connection: "CONNECTED" | "STALE" | "DISCONNECTED";
            driver_id: components["schemas"]["Uuid"];
            /** @description May receive a new order right now. */
            eligible: boolean;
            /** @enum {string} */
            geolocation: "FRESH" | "STALE" | "UNAVAILABLE";
            /**
             * @description Why no new order is offered, e.g. ACCOUNT_BLOCKED, ADMISSION_EXPIRED, LOCATION_STALE, OCCUPANCY_ON_TRIP,
             *     DEBT_LIMIT (the debt to the service is above the admin's limit, REQ-PAY-16).
             */
            ineligible_reasons: string[];
            /** @enum {string|null} */
            intent?: "ACCEPTING" | "PAUSE_AFTER_CURRENT" | "NOT_ACCEPTING" | null;
            /** Format: date-time */
            last_heartbeat_at?: string | null;
            /** Format: date-time */
            last_location_at?: string | null;
            /** @enum {string} */
            occupancy: "FREE" | "OFFERED" | "RESERVED" | "TO_PICKUP" | "WAITING" | "ON_TRIP";
            review_status: components["schemas"]["ReviewStatus"];
            /** Format: uuid */
            session_id?: string | null;
            /** @enum {string} */
            session_state: "OPEN" | "CLOSING" | "CLOSED";
            /** Format: int64 */
            session_version: number;
            /** Format: uuid */
            vehicle_id?: string | null;
        };
        DriverBalance: {
            balances: {
                /**
                 * Format: int64
                 * @description Positive — owed to the driver; negative — owed by the driver.
                 */
                balance_minor: number;
                /** @description The debt is above the limit; no new orders until it is paid in (REQ-PAY-16). */
                blocked: boolean;
                currency: string;
                /**
                 * Format: int64
                 * @description The admin's debt limit for the currency; null when there is none.
                 */
                debt_limit_minor: number | null;
            }[];
        };
        /**
         * @description What a driver's reason does: RETURN_TO_SEARCH gives the order back to the search, CANCEL_ORDER cancels it by the driver. Only drivers' reasons have it.
         * @enum {string|null}
         */
        DriverOutcome: "RETURN_TO_SEARCH" | "CANCEL_ORDER" | null;
        DriverProfile: {
            /** @description Current document of each type. */
            documents: components["schemas"]["Document"][];
            /** @description The driver takes cards at an own terminal (as a sole trader). Phone orders paid at a terminal are offered to such drivers; the money stays with the driver like cash, the commission comes from the balance. */
            has_payment_terminal: boolean;
            id: components["schemas"]["Uuid"];
            language?: string | null;
            name?: string | null;
            review_status: components["schemas"]["ReviewStatus"];
            vehicles: components["schemas"]["Vehicle"][];
            /**
             * Format: int64
             * @description Pass as expected_version to commands.
             */
            version: number;
        };
        DriverPromotionProgress: {
            currency: string;
            name: string;
            /** Format: int64 */
            orders_done: number;
            orders_required: number;
            /** Format: date-time */
            period_end: string;
            /** Format: date-time */
            period_start: string;
            promotion_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            repeat: "ONCE" | "EVERY_PERIOD";
            /** Format: int64 */
            reward_minor: number;
            /** @description Already paid in this period (or, for ONCE, ever). */
            rewarded: boolean;
        };
        DriverStatement: {
            balances: {
                /** Format: int64 */
                balance_minor: number;
                currency: string;
            }[];
            driver_id: components["schemas"]["Uuid"];
            /** @description Newest first. */
            entries: {
                /**
                 * Format: int64
                 * @description Positive — in, negative — out.
                 */
                amount_minor: number;
                /** Format: date-time */
                at: string;
                /** @description The other driver of a transfer. */
                counterpart_id?: components["schemas"]["Uuid"] | null;
                currency: string;
                id: components["schemas"]["Uuid"];
                /** @description TRIP_FARE, CASH_COLLECTED, TERMINAL_COLLECTED, DEPOSIT, BONUS, CARD_TOP_UP, TRANSFER_IN, TRANSFER_OUT, PROMOTION, TIP, … (new kinds may appear). */
                kind: string;
                order_id?: components["schemas"]["Uuid"] | null;
                reason: string;
            }[];
        };
        DropReservationCommand: {
            command_id: components["schemas"]["Uuid"];
            reason_code: string;
        };
        Earnings: {
            /**
             * Format: int64
             * @description The balance now, whatever the period; negative — the driver owes the service.
             */
            balance_minor: number;
            city_id: components["schemas"]["Uuid"];
            currency: string;
            /** @description Only days with movements, oldest first. */
            days: {
                /** Format: date */
                date: string;
                figures: components["schemas"]["EarningsFigures"];
            }[];
            driver_id: components["schemas"]["Uuid"];
            /** Format: date */
            from: string;
            timezone: string;
            /** Format: date */
            to: string;
            total: components["schemas"]["EarningsFigures"];
        };
        /** @description Minor units of the city's currency. */
        EarningsFigures: {
            /**
             * Format: int64
             * @description Anything else on the balance.
             */
            adjustments_minor: number;
            /**
             * Format: int64
             * @description Promotions and bonuses of the service.
             */
            bonuses_minor: number;
            /**
             * Format: int64
             * @description Taken by the driver in cash or at the own terminal.
             */
            cash_minor: number;
            /**
             * Format: int64
             * @description Paid by the riders through the service (card, bonuses, the service's discount).
             */
            cashless_minor: number;
            /**
             * Format: int64
             * @description The service's part of the fares.
             */
            commission_minor: number;
            /**
             * Format: int64
             * @description The driver's part of the fares, credited to the balance.
             */
            driver_share_minor: number;
            /**
             * Format: int64
             * @description What the trips cost.
             */
            fare_minor: number;
            /**
             * Format: int64
             * @description The driver's part of cash trips the driver reported not paid, held while support checks the case; it reaches the balance (adjustments) only when support decides so.
             */
            held_minor: number;
            /**
             * Format: int64
             * @description How the balance changed; positive — the service owes the driver more.
             */
            net_minor: number;
            /** Format: int64 */
            tips_minor: number;
            /**
             * Format: int64
             * @description Money the driver paid in (card, terminal, at the office).
             */
            top_ups_minor: number;
            /** Format: int64 */
            transfers_in_minor: number;
            /** Format: int64 */
            transfers_out_minor: number;
            trips: number;
        };
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
        Heartbeat: {
            location?: components["schemas"]["Location"];
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
        Location: {
            accuracy_m?: number;
            lat: number;
            lon: number;
            /** @description Device time; not used to order points. */
            recorded_at: components["schemas"]["Timestamp"];
            /**
             * Format: int64
             * @description Grows with every point of this app session.
             */
            sequence: number;
        };
        LocationBatch: {
            command_id: components["schemas"]["Uuid"];
            points: components["schemas"]["LocationBatchPoint"][];
        };
        LocationBatchPoint: {
            accuracy_m: number;
            heading_deg?: number;
            lat: number;
            lon: number;
            recorded_at: components["schemas"]["Timestamp"];
            /** Format: int64 */
            sequence: number;
            speed_mps?: number;
        };
        LocationBatchResult: {
            accepted: number;
            duplicates: number;
            flagged: number;
        };
        Me: {
            account_state: string;
            session_id: components["schemas"]["Uuid"];
            subject_id: components["schemas"]["Uuid"];
            /** @constant */
            subject_type: "DRIVER";
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
        Offer: {
            currency?: string | null;
            distance_m?: number | null;
            dropoff_label: string;
            expires_at: components["schemas"]["Timestamp"];
            id: components["schemas"]["Uuid"];
            order_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            payment_method: "CASH" | "CARD" | "SERVICE" | "TERMINAL";
            pickup: components["schemas"]["GeoPoint"];
            pickup_label: string;
            /** Format: int64 */
            price_minor?: number | null;
            vehicle_class: string;
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
        OpenUploadRequest: {
            command_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            content_type: "image/jpeg" | "image/png" | "application/pdf";
            /** Format: int64 */
            size_bytes: number;
        };
        OpenWorkSession: {
            command_id: components["schemas"]["Uuid"];
            location: components["schemas"]["Location"];
            vehicle_id: components["schemas"]["Uuid"];
        };
        PhaseCommand: {
            command_id: components["schemas"]["Uuid"];
            /** @description Confirms an arrival or start that failed the normal checks; flags the trip for review. */
            exception_reason?: string;
            /**
             * Format: int64
             * @description Trip version from the last snapshot.
             */
            expected_version: number;
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
        PostChatMessage: {
            body: string;
            command_id: components["schemas"]["Uuid"];
        };
        Preorder: {
            currency: string | null;
            dropoff_label: string;
            order_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            payment_method: "CASH" | "CARD" | "SERVICE" | "TERMINAL";
            pickup: components["schemas"]["GeoPoint"];
            pickup_at: components["schemas"]["Timestamp"];
            pickup_label: string;
            /** Format: int64 */
            price_minor: number | null;
            /** Format: int64 */
            short_number: number;
            vehicle_class: string;
        };
        PreorderList: {
            preorders: components["schemas"]["Preorder"][];
        };
        PreorderReservation: {
            /** @description "On my way" is accepted from here… */
            confirm_from: components["schemas"]["Timestamp"];
            /** @description …until here; after that the reservation expires. */
            confirm_until: components["schemas"]["Timestamp"];
            /** @description The driver may give the order back himself until here. */
            drop_until: components["schemas"]["Timestamp"];
            id: components["schemas"]["Uuid"];
            order: components["schemas"]["Preorder"];
            reserved_at: components["schemas"]["Timestamp"];
            /** @enum {string} */
            state: "RESERVED" | "CONFIRMED" | "DROPPED" | "REMOVED" | "EXPIRED" | "CANCELLED";
        };
        PreorderReservationList: {
            reservations: components["schemas"]["PreorderReservation"][];
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
        ProfileUpdate: {
            command_id: components["schemas"]["Uuid"];
            language?: string;
            name?: string;
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
        /** @enum {string} */
        ReviewStatus: "NOT_SUBMITTED" | "IN_REVIEW" | "CHANGES_REQUIRED" | "APPROVED" | "REJECTED" | "SUSPENDED" | "EXPIRED";
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
        "schemas-UploadSession": {
            expires_at: components["schemas"]["Timestamp"];
            file_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            max_bytes: number;
            upload_path: string;
        };
        SessionCommand: {
            command_id: components["schemas"]["Uuid"];
            /**
             * Format: int64
             * @description session_version from the last snapshot.
             */
            expected_version: number;
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
        SubmitRequest: {
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
        Transfer: {
            /** Format: int64 */
            amount_minor: number;
            /** Format: date-time */
            at: string;
            comment?: string | null;
            currency: string;
            from_driver_id: components["schemas"]["Uuid"];
            id: components["schemas"]["Uuid"];
            to_driver_id: components["schemas"]["Uuid"];
        };
        TransferRule: {
            currency: string;
            enabled: boolean;
            /**
             * Format: int64
             * @description Sum of one driver's transfers in a day (UTC).
             */
            max_per_day_minor: number;
            /** Format: int64 */
            max_per_transfer_minor: number;
            /**
             * Format: int64
             * @description The sender's balance must stay at least this after the transfer.
             */
            min_balance_after_minor: number;
            /** Format: int64 */
            version: number;
        };
        TransferRuleList: {
            rules: components["schemas"]["TransferRule"][];
        };
        Trip: {
            /** Format: date-time */
            arrived_at?: string | null;
            assignment_id: components["schemas"]["Uuid"];
            /** Format: date-time */
            completed_at?: string | null;
            currency?: string | null;
            /**
             * Format: int64
             * @description The rider's promotions' discount (ADR 0009), paid by the service; not collected from the rider.
             */
            discount_minor?: number;
            dropoff: components["schemas"]["GeoPoint"];
            dropoff_label: string;
            id: components["schemas"]["Uuid"];
            needs_review: boolean;
            order_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            payment_method: "CASH" | "CARD" | "SERVICE" | "TERMINAL";
            /** @enum {string} */
            phase: "TO_PICKUP" | "WAITING" | "IN_PROGRESS" | "COMPLETED" | "ABORTED";
            pickup: components["schemas"]["GeoPoint"];
            pickup_label: string;
            /** Format: int64 */
            price_minor?: number | null;
            /** @description Whom to pick up when it is not the payer: the person a rider ordered for, or the caller of a phone order (ADR 0012, REQ-OPS-02). Only on the trip, i.e. after assignment (REQ-DRV-08), and only until it ends; the phone only when calls are DIRECT, otherwise call through the order's call endpoint. */
            recipient?: {
                name: string | null;
                phone: string | null;
            } | null;
            /** Format: date-time */
            started_at?: string | null;
            /** Format: int64 */
            version: number;
            /**
             * Format: int64
             * @description Paid by the rider's bonuses (ADR 0009); collect the fare minus this and discount_minor.
             */
            wallet_minor?: number;
        };
        TripHistoryItem: {
            created_at: components["schemas"]["Timestamp"];
            currency: string | null;
            dropoff_label: string;
            /** Format: int64 */
            final_price_minor: number | null;
            id: components["schemas"]["Uuid"];
            order_id: components["schemas"]["Uuid"];
            /**
             * Format: int64
             * @description For support conversations; not a secret (REQ-DATA-03).
             */
            order_short_number: number;
            /** @enum {string} */
            payment_method: "CASH" | "CARD" | "SERVICE" | "TERMINAL";
            /** @enum {string} */
            phase: "COMPLETED" | "ABORTED";
            pickup_label: string;
        };
        UploadSession: {
            expires_at: components["schemas"]["Timestamp"];
            file_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            max_bytes: number;
            /** @description Relative path for the PUT with the file bytes. */
            upload_path: string;
        };
        /** Format: uuid */
        Uuid: string;
        Vehicle: {
            class_approvals: string[];
            color: string;
            id: components["schemas"]["Uuid"];
            make: string;
            model: string;
            production_year: number;
            registration_number: string;
            /** @enum {string} */
            state: "DRAFT" | "IN_REVIEW" | "APPROVED" | "SUSPENDED" | "EXPIRED";
        };
        VehicleInput: {
            color: string;
            command_id: components["schemas"]["Uuid"];
            make: string;
            model: string;
            production_year: number;
            registration_number: string;
        };
        VersionCommand: {
            command_id: components["schemas"]["Uuid"];
            /**
             * Format: int64
             * @description Trip version from the last snapshot.
             */
            expected_version: number;
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
        WorkSessionId: components["schemas"]["Uuid"];
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
    getCurrentAssignment: {
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
                    "application/json": components["schemas"]["Assignment"];
                };
            };
            /** @description No current assignment. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    getDriverBalance: {
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
                    "application/json": components["schemas"]["DriverBalance"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    startDriverCardTopUp: {
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
    getDriverCardTopUp: {
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
    getDriverBalanceHistory: {
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
                    "application/json": components["schemas"]["DriverStatement"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    listBroadcastOrders: {
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
                    "application/json": components["schemas"]["BroadcastOrder"][];
                };
            };
            401: components["responses"]["Unauthorized"];
            429: components["responses"]["TooManyRequests"];
        };
    };
    listDriverCancelReasons: {
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
    addDocument: {
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
                "application/json": components["schemas"]["DocumentInput"];
            };
        };
        responses: {
            /** @description Document added, pending review. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Created"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    openDocumentUpload: {
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
                "application/json": components["schemas"]["OpenUploadRequest"];
            };
        };
        responses: {
            /** @description Upload the bytes to upload_path before expires_at. */
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
    getDriverEarnings: {
        parameters: {
            query: {
                /** @description The city whose calendar and currency the figures use. */
                city_id: components["schemas"]["Uuid"];
                from: string;
                /** @description Included; at most 92 days after from. */
                to: string;
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
                    "application/json": components["schemas"]["Earnings"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    downloadFile: {
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
        requestBody?: never;
        responses: {
            /** @description The file, as an attachment, not cached. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/pdf": string;
                    "image/jpeg": string;
                    "image/png": string;
                };
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
    storeDriverLocationBatch: {
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
                "application/json": components["schemas"]["LocationBatch"];
            };
        };
        responses: {
            /** @description Batch outcome. Repeating command_id returns the same counts. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["LocationBatchResult"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            /** @description Per-driver location batch rate limit exceeded. */
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
    getDriverMe: {
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
    changeDriverPhone: {
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
    requestDriverCurrentPhoneCode: {
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
    requestDriverNewPhoneCode: {
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
    getDriverRatingSummary: {
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
            /** @description Integer aggregate and average in hundredths. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        /** Format: int64 */
                        average_hundredths: number;
                        /** Format: int64 */
                        count: number;
                        /** Format: int64 */
                        score_sum: number;
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    listOffers: {
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
                    "application/json": components["schemas"]["Offer"][];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    acceptOffer: {
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
            path: {
                offer_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["Command"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Assignment"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            /** @description App build is below the minimum for its platform (REQ-API-10). */
            426: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/problem+json": components["schemas"]["Problem"];
                };
            };
            429: components["responses"]["TooManyRequests"];
        };
    };
    rejectOffer: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                offer_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["Command"];
            };
        };
        responses: {
            /** @description Declined. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
        };
    };
    claimOrder: {
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
                "application/json": components["schemas"]["Command"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Assignment"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
            429: components["responses"]["TooManyRequests"];
        };
    };
    getDriverOrderRating: {
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
    rateRider: {
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
    listPreorders: {
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
            /** @description Nearest pickup first, at most 50. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PreorderList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            409: components["responses"]["Conflict"];
        };
    };
    reservePreorder: {
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
                "application/json": components["schemas"]["Command"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PreorderReservation"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    listPreorderReservations: {
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
            /** @description Nearest pickup first. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PreorderReservationList"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    confirmPreorderReservation: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                reservation_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["Command"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Assignment"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    dropPreorderReservation: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                reservation_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["DropReservationCommand"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PreorderReservation"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getDriverProfile: {
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
            /** @description Current profile. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverProfile"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    updateDriverProfile: {
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
                "application/json": components["schemas"]["ProfileUpdate"];
            };
        };
        responses: {
            /** @description Updated profile. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverProfile"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            409: components["responses"]["Conflict"];
        };
    };
    getDriverPromotionProgress: {
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
                        promotions: components["schemas"]["DriverPromotionProgress"][];
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    listDriverPushDevices: {
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
    registerDriverPushDevice: {
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
    removeDriverPushDevice: {
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
    getDriverSafetyContacts: {
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
                    "application/json": components["schemas"]["SafetyContacts"];
                };
            };
            401: components["responses"]["Unauthorized"];
            409: components["responses"]["Conflict"];
        };
    };
    listDriverSupportCases: {
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
    openDriverSupportCase: {
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
    getDriverSupportCase: {
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
    downloadDriverSupportAttachment: {
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
    replyDriverSupportCase: {
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
    openDriverSupportAttachmentUpload: {
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
                    "application/json": components["schemas"]["schemas-UploadSession"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
        };
    };
    getDriverTransferRules: {
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
            /** @description Per currency; no rule — transfers are off. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["TransferRuleList"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    transferToDriver: {
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
                "application/json": {
                    /** Format: int64 */
                    amount_minor: number;
                    command_id: components["schemas"]["Uuid"];
                    comment?: string | null;
                    currency: string;
                    to_phone: string;
                };
            };
        };
        responses: {
            /** @description Sent. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Transfer"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    listDriverTripHistory: {
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
            /** @description Trip history. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["TripHistoryItem"][];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    arriveAtPickup: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                trip_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["PhaseCommand"];
            };
        };
        responses: {
            /** @description Trip after the command. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Trip"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    getDriverTripCallTarget: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                trip_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Number the driver app should dial. */
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
    cancelTrip: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                trip_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["CancelTripCommand"];
            };
        };
        responses: {
            /** @description Trip after the command (phase ABORTED). */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Trip"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    completeTrip: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                trip_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["CompleteCommand"];
            };
        };
        responses: {
            /** @description Trip after the command. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Trip"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    listDriverMessages: {
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
                trip_id: components["schemas"]["Uuid"];
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
    postDriverMessage: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                trip_id: components["schemas"]["Uuid"];
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
    reportNoShow: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                trip_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["VersionCommand"];
            };
        };
        responses: {
            /** @description Trip after the command (phase ABORTED). */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Trip"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    startTrip: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                trip_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["PhaseCommand"];
            };
        };
        responses: {
            /** @description Trip after the command. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Trip"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    getCurrentTrip: {
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
            /** @description Current trip. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Trip"];
                };
            };
            /** @description No current trip. */
            204: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    uploadFile: {
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
            /** @description Outcome of the checks. */
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
    addVehicle: {
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
                "application/json": components["schemas"]["VehicleInput"];
            };
        };
        responses: {
            /** @description Vehicle added as DRAFT. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Created"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            409: components["responses"]["Conflict"];
        };
    };
    submitForVerification: {
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
                "application/json": components["schemas"]["SubmitRequest"];
            };
        };
        responses: {
            /** @description Submitted. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverProfile"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            409: components["responses"]["Conflict"];
        };
    };
    openWorkSession: {
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
                "application/json": components["schemas"]["OpenWorkSession"];
            };
        };
        responses: {
            /** @description Online. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverAvailability"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
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
    closeWorkSession: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                id: components["parameters"]["WorkSessionId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["SessionCommand"];
            };
        };
        responses: {
            /** @description State after the command. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverAvailability"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    handoverWorkSession: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                id: components["parameters"]["WorkSessionId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["SessionCommand"];
            };
        };
        responses: {
            /** @description State after the command. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverAvailability"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    workSessionHeartbeat: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                id: components["parameters"]["WorkSessionId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["Heartbeat"];
            };
        };
        responses: {
            /** @description State after the heartbeat, with `accepted`. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverAvailability"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    pauseWorkSession: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                id: components["parameters"]["WorkSessionId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["SessionCommand"];
            };
        };
        responses: {
            /** @description State after the command. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverAvailability"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    resumeWorkSession: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                id: components["parameters"]["WorkSessionId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["SessionCommand"];
            };
        };
        responses: {
            /** @description State after the command. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverAvailability"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getDriverAvailability: {
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
            /** @description Snapshot; the app shows it after restart instead of local state. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverAvailability"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    openDriverLiveChannel: {
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
