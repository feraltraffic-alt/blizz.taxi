export interface paths {
    "/api/admin/v1/addresses": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Add an own address
         * @description House number parsed structurally (2 ≠ 26); entrances are separate records.
         */
        post: operations["createOwnAddress"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/addresses/{address_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** One own address, hidden included */
        get: operations["getOwnAddress"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/addresses/{address_id}/aliases": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Add an alias
         * @description An alias in another language finds the same address.
         */
        post: operations["addOwnAddressAlias"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/addresses/{address_id}/hide": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Hide an address
         * @description Hidden addresses are not offered to riders.
         */
        post: operations["hideOwnAddress"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/addresses/{address_id}/restore": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Restore a hidden address
         * @description Back in search.
         */
        post: operations["restoreOwnAddress"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/addresses/{address_id}/update": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Change an own address
         * @description Versioned; history and audit.
         */
        post: operations["updateOwnAddress"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/call-lines": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The service numbers of the call centre and their cities
         * @description An incoming call to a number goes to the operators of its city (card-pop). Needs settings.manage.
         */
        get: operations["listCallLines"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/call-lines/{number}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Set or remove the city of a service number
         * @description number in E.164 (URL-encode the +). city_id null removes the number. Needs settings.manage for the new city and for the old one; audited.
         */
        post: operations["changeCallLine"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/cash-disputes": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Cash disputes not decided yet
         * @description Trips the driver reported as not paid in cash or at the terminal (owner decision 28.10.2026), the soonest deadline first. Needs finance.manage.
         */
        get: operations["listOpenCashDisputes"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/cities": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Cities
         * @description All states; the boundary as GeoJSON. Needs geo.manage.
         */
        get: operations["listCities"];
        put?: never;
        /**
         * Create a city draft
         * @description Boundary as a GeoJSON Polygon or MultiPolygon (WGS84). Publish it to put it in service.
         */
        post: operations["createCity"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/cities/{city_id}/addresses": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Own addresses of a city
         * @description Text fragment match; hidden ones when include_hidden. Needs geo.manage for the city.
         */
        get: operations["listOwnAddresses"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/cities/{city_id}/archive": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Archive a city
         * @description Versioned; reason required.
         */
        post: operations["archiveCity"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/cities/{city_id}/operations": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Working hours, payment methods and the pause of a city
         * @description REQ-TEN-03/06. Defaults until the first change: open around the clock, every payment method, not paused (version 0). Needs geo.manage for the city.
         */
        get: operations["getCityOperations"];
        put?: never;
        /**
         * Change the working hours and payment methods of a city
         * @description Outside the working hours an order for now is refused (CITY_CLOSED); an order for later is accepted when its pickup time is inside them. A payment method not offered is refused (PAYMENT_METHOD_NOT_OFFERED). Orders already accepted are not touched. Versioned, audited, reason required.
         */
        post: operations["changeCityOperations"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/cities/{city_id}/operations/pause": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Pause new orders in a city
         * @description New orders from the apps and by phone are refused with CITY_PAUSED until the pause is lifted. Trips under way and orders for later already accepted go on as usual (REQ-TEN-06). Versioned, audited, reason required.
         */
        post: operations["pauseCityOrders"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/cities/{city_id}/operations/resume": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Lift the pause of new orders in a city */
        post: operations["resumeCityOrders"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/cities/{city_id}/publish": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Publish a city
         * @description Versioned; reason required.
         */
        post: operations["publishCity"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/cities/{city_id}/zones": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Zones of a city */
        get: operations["listZones"];
        put?: never;
        /**
         * Create a zone draft
         * @description Boundary as GeoJSON; type e.g. AIRPORT, STATION.
         */
        post: operations["createZone"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/client-deletions": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Riders' pending deletion requests with what blocks them
         * @description Oldest first; at most 100 per page. Needs clients.delete.
         */
        get: operations["listClientDeletions"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/client-deletions/{client_id}/complete": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Complete a rider's deletion request
         * @description Anonymizes the client: phone, name and language are cleared, every session ends, the bonuses burn, the saved cards, push devices and the address-search log are removed; orders, the journal, ratings and the audit log stay (REQ-PRV-04, AC-24). The phone becomes free: signing in with it creates a new client. 409 while a blocker exists or without a pending request. Needs clients.delete; audited.
         */
        post: operations["completeClientDeletion"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/client-deletions/{client_id}/reject": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Reject a rider's deletion request
         * @description The account returns to the state it had before the request. Needs clients.delete; audited.
         */
        post: operations["rejectClientDeletion"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/clients": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Find riders
         * @description By at least 4 digits of the phone or 2 letters of the name, newest first; anonymized riders never appear. Requires clients.manage.
         */
        get: operations["searchClients"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/clients/{client_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The rider's card
         * @description The account, orders in progress and the latest, bonuses, debt and support cases. Requires clients.manage.
         */
        get: operations["getClientCard"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/clients/{client_id}/block": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Block a rider
         * @description ACTIVE → BLOCKED with a reason and an optional end; the rider's sessions end at once and no new one opens, a trip in progress goes on with the call centre. Audited.
         */
        post: operations["blockClient"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/clients/{client_id}/data-exports": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * A rider's copies of their data
         * @description Whether and when the rider asked for a copy of their personal data and its state (REQ-PRV-07); the content is never shown to staff. Requires clients.manage.
         */
        get: operations["listClientDataExports"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/clients/{client_id}/phone": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Set the client's phone when the old one is lost
         * @description REQ-AUTH-08, support's process: after identifying the person, staff with clients.manage set the new phone with a reason (how the person was identified) and the code the person received on the new phone (owner decision 28.10.2026). Every session of the account ends. Another account's phone → 409 STATE_CONFLICT; a wrong code → OTP_INVALID. Audited with masked numbers.
         */
        post: operations["changeClientPhoneBySupport"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/clients/{client_id}/phone/new-code": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Send a code to the new phone, for a change by support
         * @description REQ-AUTH-08, support's process, step one: after identifying the person, staff with clients.manage send a code to the new phone; the person reads it to them. Audited with the masked number. Another account's phone is found out only at the change. The same phone as now → 409.
         */
        post: operations["sendClientNewPhoneCodeBySupport"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/clients/{client_id}/unblock": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Unblock a rider
         * @description BLOCKED → ACTIVE; a debt or a dispute stays. Audited.
         */
        post: operations["unblockClient"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/driver-promotions": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Promotions for drivers
         * @description Needs promotions.manage. Active ones unless include_archived.
         */
        get: operations["listDriverPromotions"];
        put?: never;
        /**
         * Create a promotion for drivers
         * @description Audited with the reason (ADR 0010).
         */
        post: operations["createDriverPromotion"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/driver-promotions/{promotion_id}/archive": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Stop a promotion for drivers */
        post: operations["archiveDriverPromotion"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/driver-promotions/{promotion_id}/change": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Change a promotion for drivers */
        post: operations["changeDriverPromotion"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/driver-risk-flags": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Risk flags of drivers to review
         * @description Newest first, at most 100, in the cities where I have drivers.risk; filter by city, state and driver. A flag blocks nothing by itself.
         */
        get: operations["listDriverRiskFlags"];
        put?: never;
        /**
         * Raise a risk flag by hand
         * @description Needs drivers.risk for the city; audited. A repeat of the command returns the first flag.
         */
        post: operations["raiseDriverRiskFlag"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/driver-risk-flags/{flag_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * One risk flag
         * @description Needs drivers.risk for the flag's city.
         */
        get: operations["getDriverRiskFlag"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/driver-risk-flags/{flag_id}/confirm": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Confirm a risk flag — the suspicion holds
         * @description OPEN → CONFIRMED with a reason; audited. Changes nothing for the driver: suspend them separately, naming the flag. Not OPEN → 409.
         */
        post: operations["confirmDriverRiskFlag"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/driver-risk-flags/{flag_id}/dismiss": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Dismiss a risk flag — no case
         * @description OPEN → DISMISSED with a reason; audited. Not OPEN → 409.
         */
        post: operations["dismissDriverRiskFlag"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Review queue
         * @description Drivers in a review status (default IN_REVIEW — the queue), oldest first. Needs driver.review.
         */
        get: operations["listDriversForReview"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** A driver with documents, vehicles and the history of decisions */
        get: operations["getDriverReviewCase"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}/balance": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * A driver's balance and its movements
         * @description Needs finance.manage.
         */
        get: operations["getDriverBalanceForStaff"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}/balance/top-ups": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Top up a driver's balance
         * @description DEPOSIT — money the driver paid in (cash at the office, a transfer; reference optional); BONUS — a gift of the service (its expense). Needs finance.manage; the reason is required and audited (ADR 0010). 422 TOP_UP_DAILY_LIMIT when it would take the staff member over the settings' staff_top_ups limit for the currency.
         */
        post: operations["topUpDriverBalance"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}/decision": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Approve, request changes or reject
         * @description IN_REVIEW only, reason required. On APPROVE the given vehicle classes are granted; otherwise rejected_documents tell the driver what to replace.
         */
        post: operations["decideDriverReview"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}/documents/{document_id}/file": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The scan of a driver's document
         * @description Private, not cached; every opening is audited (REQ-SEC-07). Needs driver.review. Always an attachment with `X-Content-Type-Options: nosniff`, so a PDF is never rendered inline in the admin's browser (issue #105).
         */
        get: operations["getDriverDocumentFile"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}/earnings": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * A driver's earnings per day
         * @description Requires finance.manage.
         */
        get: operations["getDriverEarningsForStaff"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}/payment-terminal": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Mark whether the driver has an own card terminal
         * @description Needs driver.review; the reason is required and the change is audited. Phone orders paid at a terminal are offered to drivers marked here (owner decision 27.10.2026).
         */
        post: operations["setDriverPaymentTerminal"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}/phone": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Set the driver's phone when the old one is lost
         * @description REQ-AUTH-08, support's process: after identifying the person, staff with driver.review set the new phone with a reason (how the person was identified) and the code the person received on the new phone (owner decision 28.10.2026). Every session of the account ends. Another account's phone → 409 STATE_CONFLICT; a wrong code → OTP_INVALID. Audited with masked numbers.
         */
        post: operations["changeDriverPhoneBySupport"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}/phone/new-code": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Send a code to the new phone, for a change by support
         * @description REQ-AUTH-08, support's process, step one: after identifying the person, staff with driver.review send a code to the new phone; the person reads it to them. Audited with the masked number. Another account's phone is found out only at the change. The same phone as now → 409.
         */
        post: operations["sendDriverNewPhoneCodeBySupport"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}/reinstate": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Reinstate a suspended driver
         * @description SUSPENDED → APPROVED, reason required.
         */
        post: operations["reinstateDriver"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/drivers/{driver_id}/suspend": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Suspend an approved driver
         * @description No new orders; a trip in progress is not interrupted (REQ-DS-01). Reason required. risk_flag_id names the risk flag that caused it (it must be this driver's; 422 otherwise) and is kept with the change and in the audit.
         */
        post: operations["suspendDriver"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/emergency-grants": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Emergency access given
         * @description Super admins only; active first, the latest 100.
         */
        get: operations["listEmergencyGrants"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/emergency-grants/{grant_id}/activity": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * What was done with emergency access
         * @description Super admins only. The staff member's requests while the grant lasted, from the staff activity log.
         */
        get: operations["getEmergencyGrantActivity"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/emergency-grants/{grant_id}/revoke": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * End emergency access early
         * @description Super admins only. An ended grant → 409. Audited.
         */
        post: operations["revokeEmergencyAccess"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/feature-flags": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Feature flags of the service
         * @description Server-side switches (REQ-ENG-14), declared in the server with an owner and a review date. A flag is read
         *     only where a process starts; switching it off never stops what has begun. Needs flags.manage.
         */
        get: operations["listFeatureFlags"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/feature-flags/{key}/change": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Switch a feature flag on or off
         * @description Audited, with a reason. Needs flags.manage.
         */
        post: operations["changeFeatureFlag"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/integrations": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Keys and settings of integrations
         * @description Secrets are never returned, only whether they are set and their last characters. Needs integrations.manage.
         */
        get: operations["listIntegrations"];
        put?: never;
        /**
         * Set, replace or remove keys and settings
         * @description All changes or none, after the password is asked again (REQ-ADM-10); a wrong password counts like a failed sign-in and answers 403. The audit keeps who, when, why and the last characters of a key, never the key. The servers use the new values within seconds, without a restart. 409 when the server has no master key for secrets.
         */
        post: operations["changeIntegrations"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/integrations/{group}/check": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Check the connection
         * @description push — signs in to Firebase without sending anything; routing — asks GraphHopper's /info. The answer never contains a key.
         */
        post: operations["checkIntegration"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/legal-documents": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Versions of the legal texts
         * @description Newest first per document; filter by audience and kind. Requires legal.manage.
         */
        get: operations["listLegalDocumentVersions"];
        put?: never;
        /**
         * A new version of a legal text, as a draft
         * @description The next number of the document. Requires legal.manage. Audited (languages and lengths, not the text).
         */
        post: operations["createLegalDraft"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/legal-documents/{version_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Change a draft
         * @description Only a DRAFT (a published version → 409 STATE_CONFLICT). Requires legal.manage. Audited.
         */
        post: operations["updateLegalDraft"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/legal-documents/{version_id}/publish": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Publish a draft
         * @description DRAFT → PUBLISHED; from then on it never changes. An effective moment in the past becomes the moment of publication. Once in force and with acceptance_required, riders cannot order and drivers cannot go online until they accept it. Requires legal.manage. Audited.
         */
        post: operations["publishLegalDraft"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/logs/activity": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * What staff did, by role
         * @description Every request of every staff member to the admin and operator APIs (reads too) and every sign-in attempt,
         *     newest first, with the role at that moment (owner decision 27.10.2026). Bodies are never stored — the
         *     path template and its ids say what was touched. Needs audit.view.
         */
        get: operations["listStaffActivity"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/logs/changes": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * What staff changed, by role
         * @description The audit log of staff changes (orders, drivers, cities, addresses, tariffs, finance, staff, chat reads)
         *     with before/after, reason and the role at that moment, newest first. Needs audit.view.
         */
        get: operations["listStaffChanges"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/logs/correlation/{correlation_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * What one request or job touched
         * @description Everything recorded under a correlation id (REQ-OBS-01/04) — order events, payment intents and operations, audit records, staff requests — as types and ids only, never their contents; open each in its own screen. At most 200, oldest first. Needs audit.view.
         */
        get: operations["findByCorrelationId"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/me": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The signed-in staff member
         * @description effective_permissions is what the UI may show: every function for a super admin, the ticked ones otherwise.
         */
        get: operations["getAdminMe"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/me/emergency-grants": {
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
    "/api/admin/v1/me/password": {
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
         * @description Required after the first sign-in and after a reset. 401 when the current password is wrong.
         */
        post: operations["changeAdminPassword"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/operator-bonuses": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Bonus accounts of every staff member who earned points
         * @description Requires operator-bonuses.manage.
         */
        get: operations["listOperatorBonusAccounts"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/operator-bonuses/{staff_id}/history": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Bonus entries of one staff member, newest first
         * @description Requires operator-bonuses.manage.
         */
        get: operations["listOperatorBonusEntries"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/operator-bonuses/periods": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Closed periods, newest first
         * @description Totals of every account at each reset. Requires operator-bonuses.manage.
         */
        get: operations["listOperatorBonusPeriods"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/orders/{order_id}/cash-dispute": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The cash dispute of an order
         * @description Needs finance.manage. 404 when the driver did not report the fare as unpaid.
         */
        get: operations["getCashDispute"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/orders/{order_id}/cash-dispute/decide": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Decide a cash dispute, once
         * @description RIDER_PAID: the rider had paid the driver; the rider's debt goes, the held part is released, the driver holds the cash and gets a CASH_DISPUTE risk flag. PAY_DRIVER: the rider did not pay; the service releases the held part to the driver, the rider's debt stays. KEEP_HELD: the rider did not pay; the held part stays until the rider pays. Nothing moves without this decision; past decide_by the dispute becomes an urgent task. Audited; needs finance.manage.
         */
        post: operations["decideCashDispute"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/orders/{order_id}/chargebacks": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The chargebacks of an order
         * @description Oldest first. Needs payments.retry for the order's city.
         */
        get: operations["listChargebacks"];
        put?: never;
        /**
         * Record a chargeback of the order's card payment by hand
         * @description REQ-PAY-23, issue #103. The payment provider handles chargebacks through its risk managers and tells no API, so finance records what the bank took. In the journal the money leaves PROVIDER_CLEARING and the rider owes it again (RIDER_RECEIVABLE); a PAYMENT case, HIGH, is opened to send the order's evidence. At most what is left of the order's card payment (captures, charges and tips, less earlier chargebacks not won back), and only on an order paid by card: otherwise 422 CHARGEBACK_NOT_ALLOWED. Needs payments.retry for the order's city; idempotent by command_id; audited.
         */
        post: operations["recordChargeback"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/orders/{order_id}/chargebacks/{chargeback_id}/resolve": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Record the outcome of a chargeback
         * @description Once. WON, the money came back: the exact reverse of the recording is posted. LOST: nothing is posted, the rider's debt stays and the driver's share is not touched. A resolved chargeback → 409 STATE_CONFLICT, a stale version → 409 VERSION_CONFLICT. Needs payments.retry for the order's city; idempotent; audited.
         */
        post: operations["resolveChargeback"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/orders/{order_id}/evidence": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The evidence of an order for a chargeback
         * @description REQ-PAY-23, issue #103. What the payment provider's risk managers ask for, in one document: the order with its times, fare and breakdown; the driver and vehicle; a summary of the ride's GPS track (not its points); the rider's registration date and trips of the last 12 months (counts and totals only); the card operations; the order's chat and its support cases with what was said to and by the requester (no internal notes). No phone numbers and no card data: in text people typed, every run of nine or more digits is replaced by "[number hidden]". Needs payments.retry for the order's city and a reason; every export is audited (order.evidence.view).
         */
        get: operations["getOrderEvidence"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/orders/{order_id}/payment-operations": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The card operations of an order
         * @description Holds, captures, charges, refunds and tips, oldest first, with each one's state and the provider's status; a retry shows which operation it repeats and who asked. Needs payments.retry. An order without a card payment → 404.
         */
        get: operations["listPaymentOperations"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/orders/{order_id}/ratings": {
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
        get: operations["getAdminOrderRatings"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/otp-deliveries": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * How sign-in codes reached a phone
         * @description Every attempt to deliver a one-time code to the phone, newest first: when, the channel (SMS or VOICE), the provider, the outcome and the provider's error or message id — never the code. For support, when a rider or a driver says the code does not come (ADR 0012 Q-18). Needs support.manage.
         */
        get: operations["listOtpDeliveries"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/payment-merchants": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Payment merchants */
        get: operations["listPaymentMerchants"];
        put?: never;
        /**
         * Add a merchant account
         * @description The password is asked again; the key is stored encrypted and never shown (REQ-ADM-10).
         */
        post: operations["createPaymentMerchant"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/payment-merchants/{merchant_id}/change": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Change the domain, the key or the cities of a merchant */
        post: operations["changePaymentMerchant"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/payment-merchants/{merchant_id}/check": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Check the merchant's account and key
         * @description Asks the provider about an order that does not exist; nothing is charged. The provider's answer is shown, never the key.
         */
        post: operations["checkPaymentMerchant"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/payment-operations/{operation_id}/retry": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Retry a declined charge by hand
         * @description REQ-PAY-14. Only a CHARGE the provider declined for sure, not retried yet, while no other operation of the payment is under way; anything else → 409 STATE_CONFLICT, a result not known yet → 409 PAYMENT_UNKNOWN (the system keeps asking the provider; never charge twice). A new charge of the same amount to the same saved card; it keeps the operation it repeats and who asked. When it succeeds, the rider's debt for the fare is paid (event CardDebtPaid). Needs payments.retry; reason required; audited.
         */
        post: operations["retryPaymentOperation"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/payment-reconciliations": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Daily card reconciliation runs
         * @description REQ-LED-07. Needs payments.retry and every city of the merchant; unmapped merchants require all-city scope. Failed attempts are visible as FAILED, never as clean zero differences. Completed daily snapshots are immutable.
         */
        get: operations["listPaymentReconciliations"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/payment-reconciliations/{run_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * A reconciliation run and its differences
         * @description Needs payments.retry and all merchant cities. Provider fields are a safe projection; raw customer data and arbitrary provider references are never returned. Fees are evidence, not compared or booked.
         */
        get: operations["getPaymentReconciliation"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/payment-reconciliations/items/{item_id}/resolve": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Record the staff decision on a difference
         * @description Needs payments.retry and all merchant cities, checked again before command replay. Audited and idempotent. Records a decision only; it never applies a provider result or changes money. A later conflicting resolution is 409.
         */
        post: operations["resolvePaymentReconciliationItem"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/permissions": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Functions that can be ticked
         * @description The checkbox list for admins and operators.
         */
        get: operations["listPermissions"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/promotions": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Promotions for riders
         * @description Needs promotions.manage. Active ones unless include_archived.
         */
        get: operations["listPromotions"];
        put?: never;
        /**
         * Create a promotion
         * @description Audited with the reason. Applies to quotes made from now on.
         */
        post: operations["createPromotion"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/promotions/{promotion_id}/archive": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Stop a promotion */
        post: operations["archivePromotion"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/promotions/{promotion_id}/change": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Change a promotion
         * @description Quotes made before keep what they got.
         */
        post: operations["changePromotion"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/reports/exports": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * My report exports
         * @description The staff member's own exports, newest first.
         */
        get: operations["listReportExports"];
        put?: never;
        /**
         * Export a report to CSV
         * @description A background job builds the file (REQ-ADM-07); poll the export until READY. Requires reports.view for the city, checked again when building and when downloading. Audited.
         */
        post: operations["requestReportExport"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/reports/exports/{export_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * A report export
         * @description Only the staff member who asked for it.
         */
        get: operations["getReportExport"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/reports/exports/{export_id}/file": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Download the CSV
         * @description UTF-8 with a byte order mark, comma-separated; text that a spreadsheet would take for a formula is prefixed with an apostrophe; money in major units of the city's currency. Only the staff member who asked, with reports.view for the city at the moment of the download, while the export is READY and not expired (409 otherwise). Audited.
         */
        get: operations["downloadReportExport"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/reports/finance": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Money of a city's orders per day
         * @description Fares, commission, the drivers' share, discounts and bonuses, how riders paid, tips, riders' debt. Requires reports.view for the city.
         */
        get: operations["getMoneyReport"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/reports/orders": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Orders of a city per day
         * @description Created, fulfilled, cancelled, unfulfilled, by channel and payment, cancellation reasons. Requires reports.view for the city.
         */
        get: operations["getOrderReport"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/retention": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Technical data retention by kind
         * @description Requires retention.manage with all-city scope. Version 0 contains the defaults; each setting is a number of days and 0 keeps that kind forever.
         */
        get: operations["getRetention"];
        /**
         * Change technical data retention
         * @description Requires retention.manage with all-city scope. A named, idempotent command; expected_version prevents lost updates. Every version, author and reason is retained and audited. 0 keeps forever. Changes apply on the next cleanup run; deleted data cannot be restored.
         */
        put: operations["changeRetention"];
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/rider-wallets": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Find a rider by phone
         * @description Needs wallets.manage. Returns the client id to open the account with.
         */
        get: operations["findRiderWallet"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/rider-wallets/{client_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** A rider's bonus account */
        get: operations["getRiderWalletForStaff"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/rider-wallets/{client_id}/top-ups": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Top up a rider's bonus account
         * @description Needs wallets.manage; the reason is required, shown to the rider in the history and audited. A goodwill top-up is the service's expense (journal PROMO_EXPENSE → RIDER_WALLET). 422 TOP_UP_DAILY_LIMIT when it would take the staff member over the settings' staff_top_ups limit for the currency.
         */
        post: operations["topUpRiderWallet"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/settings": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Service settings in force
         * @description Version 0 with the defaults until the first change. Needs settings.manage.
         */
        get: operations["getServiceSettings"];
        put?: never;
        /**
         * Change the brand, languages or the call mode
         * @description A new version with author and reason (REQ-TEN-06). Colours are checked for contrast (4.5:1). Calls
         *     VIA_SERVICE_NUMBERS need the service phone; note that DIRECT leaves the other party's number in the
         *     phone's call log (REQ-SEC-04), which the admin panel shows when switching.
         */
        post: operations["changeServiceSettings"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/settings/cancel-reasons": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Cancellation reasons of riders, drivers and staff
         * @description Every reason including inactive ones. Requires settings.manage.
         */
        get: operations["listCancelReasons"];
        put?: never;
        /**
         * Add a reason to one side's list
         * @description A label in the service's default language is required. A driver's reason needs driver_outcome, others must not have it. The code is unique within the side and never changes. Audited.
         */
        post: operations["createCancelReason"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/settings/cancel-reasons/{reason_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Change labels, outcome, order or activity of a reason
         * @description The side and the code stay. Deactivate instead of deleting. Audited.
         */
        post: operations["updateCancelReason"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/settings/driver-transfers": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Limits of transfers between drivers */
        get: operations["listDriverTransferRules"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/settings/driver-transfers/{currency}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Set the limits of transfers in a currency
         * @description expected_version 0 for a currency without a rule yet. Needs finance.manage; audited.
         */
        post: operations["setDriverTransferRule"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/settings/history": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** Earlier versions of the settings */
        get: operations["listServiceSettingsHistory"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/settings/operator-bonuses": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Current operator bonus rules
         * @description Requires operator-bonuses.manage.
         */
        get: operations["getOperatorBonusSettings"];
        put?: never;
        /**
         * Replace the operator bonus rules
         * @description Creates a new version; entries already earned keep the version they were counted with. Requires operator-bonuses.manage. Audited.
         */
        post: operations["changeOperatorBonusSettings"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/settings/safety-contacts/{city_id}": {
        parameters: {
            query?: never;
            header?: never;
            path: {
                city_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        /**
         * Support and emergency contacts of a city
         * @description Version 0 with 112 and nothing else until the first change. Needs settings.manage for the city.
         */
        get: operations["getSafetyContacts"];
        put?: never;
        /**
         * Replace the contacts of a city
         * @description A new version with author and reason; audited. Needs settings.manage for the city. emergency_number is 2–6 digits; phones are E.164; at most 5 extra contacts, each labelled at least in the service's default language.
         */
        post: operations["changeSafetyContacts"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/staff": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * All staff
         * @description Super admin only.
         */
        get: operations["listStaff"];
        put?: never;
        /**
         * Add a staff member
         * @description Super admin only. First and last name, at least one contact (phone, e-mail, Telegram), login, initial
         *     password (must be changed at the first sign-in), role, ticked functions and cities. A taken login → 409.
         */
        post: operations["createStaff"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/staff-extensions": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * The staff's internal numbers on the service's Asterisk
         * @description Asterisk's answers on an extension name who took a call; click-to-call rings it. Needs settings.manage.
         */
        get: operations["listStaffExtensions"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/staff-extensions/{staff_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Set or remove a staff member's extension
         * @description extension null removes it. One extension — one staff member (another's → 409 STATE_CONFLICT). Needs settings.manage; audited.
         */
        post: operations["changeStaffExtension"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/staff/{staff_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * One staff member
         * @description A super admin reads anyone; others only themselves.
         */
        get: operations["getStaff"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/staff/{staff_id}/emergency-grants": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Give emergency access
         * @description Super admins only. Extra permissions from the catalog for 5 minutes to 8 hours, with a reason; never to oneself. Counted by every permission check while it lasts; ends by itself or by revoking. Audited.
         */
        post: operations["grantEmergencyAccess"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/staff/{staff_id}/reset-password": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Set a temporary password
         * @description Unlocks the account and signs it out everywhere; the member must change the password at the next sign-in.
         */
        post: operations["resetStaffPassword"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/staff/{staff_id}/restore": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Restore a suspended member
         * @description Super admin only.
         */
        post: operations["restoreStaff"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/staff/{staff_id}/suspend": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Suspend
         * @description Signs the member out everywhere. The last active super admin cannot be suspended.
         */
        post: operations["suspendStaff"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/staff/{staff_id}/update": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Change names, contacts, role, functions or cities
         * @description Super admin only. The last active super admin cannot lose the role.
         */
        post: operations["updateStaff"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/support/cases": {
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
        get: operations["listAdminSupportQueue"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/support/cases/{case_id}": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** A case with INTERNAL comments */
        get: operations["getAdminSupportCase"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/support/cases/{case_id}/assign": {
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
        post: operations["assignAdminSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/support/cases/{case_id}/attachments/{file_id}": {
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
        get: operations["downloadAdminSupportAttachment"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/support/cases/{case_id}/close": {
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
        post: operations["closeAdminSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/support/cases/{case_id}/comments": {
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
        post: operations["commentAdminSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/support/cases/{case_id}/priority": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Change the priority */
        post: operations["priorityAdminSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/support/cases/{case_id}/reopen": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Reopen a resolved case */
        post: operations["reopenAdminSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/support/cases/{case_id}/resolve": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** Resolve with a resolution */
        post: operations["resolveAdminSupportCase"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/support/uploads": {
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
        post: operations["openAdminSupportAttachmentUpload"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/uploads/{file_id}": {
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
        put: operations["uploadAdminSupportAttachment"];
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/zones/{zone_id}/archive": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Archive a zone
         * @description Versioned; reason required.
         */
        post: operations["archiveZone"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/api/admin/v1/zones/{zone_id}/publish": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /**
         * Publish a zone
         * @description Versioned; reason required.
         */
        post: operations["publishZone"];
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
        Accounts: {
            accounts: components["schemas"]["OperatorBonusAccount"][];
        };
        ActivityEntry: {
            /** @enum {string} */
            audience: "admin" | "operator";
            client_ip?: string | null;
            /** Format: uuid */
            correlation_id?: string | null;
            duration_ms?: number | null;
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            kind: "REQUEST" | "SIGN_IN";
            method?: string | null;
            occurred_at: components["schemas"]["Timestamp"];
            /** @description OK / HTTP_4xx for requests; SUCCESS, BAD_CREDENTIALS, LOCKED, NOT_ACTIVE for sign-ins. */
            outcome?: string | null;
            /** @description Path template, e.g. /api/admin/v1/staff/{staff_id}/suspend. */
            path?: string | null;
            /** @description Values of the path template, e.g. staff_id. */
            resource_ids?: {
                [key: string]: string;
            };
            /** @enum {string|null} */
            role?: "SUPER_ADMIN" | "ADMIN" | "OPERATOR" | null;
            /**
             * Format: uuid
             * @description Null for a request without a valid staff token or a sign-in with an unknown login.
             */
            staff_id?: string | null;
            staff_login?: string | null;
            status?: number | null;
        };
        ActivityPage: {
            entries: components["schemas"]["ActivityEntry"][];
        };
        AddAlias: {
            alias: {
                label: string;
                language: string;
            };
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        AddressData: {
            building?: string | null;
            city_id: components["schemas"]["Uuid"];
            /** @example 2А */
            house_raw?: string | null;
            instructions?: string | null;
            /** @enum {string} */
            kind: "HOUSE" | "PLACE" | "ENTRANCE";
            label: string;
            /** @example uk */
            language: string;
            /** @description Opaque link to a provider object this own address replaces (Q-08); no provider content. */
            override?: {
                object_id?: string;
                provider?: string;
            } | null;
            pickup: components["schemas"]["GeoPoint"];
            street?: string | null;
        };
        AddressList: {
            addresses: components["schemas"]["OwnAddress"][];
        };
        Amount: {
            /** Format: int64 */
            amount_minor: number;
            currency: string;
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
        BlockClient: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
            /** @description In the future; omitted — until staff unblock. */
            until?: components["schemas"]["Timestamp"] | null;
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
        /** @description A service number the call centre answers, and its city. */
        CallLine: {
            city_id: components["schemas"]["Uuid"];
            label: string | null;
            number: string;
            /** Format: int64 */
            version: number;
        };
        CallLineList: {
            lines: components["schemas"]["CallLine"][];
        };
        /** @description Who cancelled the order and why, with the labels as they were at that moment. Null unless a person cancelled the order (a search that found nobody ends as UNFULFILLED instead). */
        Cancellation: {
            /** @enum {string} */
            by: "RIDER" | "STAFF" | "DRIVER";
            reason_code: string;
            reason_labels: components["schemas"]["Labels"];
        } | null;
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
        CashDispute: {
            currency: string;
            /** @description 14 days after the trip. */
            decide_by: components["schemas"]["Timestamp"];
            /** Format: date-time */
            decided_at: string | null;
            /** Format: uuid */
            decided_by: string | null;
            /** @enum {string|null} */
            decision: "RIDER_PAID" | "PAY_DRIVER" | "KEEP_HELD" | null;
            driver_id: components["schemas"]["Uuid"];
            /**
             * Format: int64
             * @description The part of the driver's share held by the cash_not_received setting.
             */
            held_minor: number;
            opened_at: components["schemas"]["Timestamp"];
            order_id: components["schemas"]["Uuid"];
            /** Format: uuid */
            payer_client_id: string | null;
            reason: string | null;
            /**
             * Format: int64
             * @description What the driver reported as not paid.
             */
            rider_debt_minor: number;
            /** Format: int64 */
            version: number;
        };
        CashDisputeList: {
            disputes: components["schemas"]["CashDispute"][];
        };
        Catalog: {
            reasons: components["schemas"]["Reason"][];
        };
        /**
         * @description TRIP_REVIEW, NO_DRIVER, LOST_CONNECTION and PAYMENT_UNKNOWN are opened by the system only (REQ-OPS-06).
         * @enum {string}
         */
        Category: "LOST_ITEM" | "PAYMENT" | "CASH_DISPUTE" | "DRIVER_BEHAVIOUR" | "RIDER_BEHAVIOUR" | "SAFETY" | "TRIP_REVIEW" | "APP_PROBLEM" | "OTHER" | "NO_DRIVER" | "LOST_CONNECTION" | "PAYMENT_UNKNOWN";
        Change: {
            action: string;
            /** Format: uuid */
            actor_id?: string | null;
            /** @enum {string|null} */
            actor_role?: "SUPER_ADMIN" | "ADMIN" | "OPERATOR" | null;
            actor_type: string;
            /** @description JSON snapshot after the change, as text. */
            after?: string | null;
            /** @description JSON snapshot before the change, as text. */
            before?: string | null;
            /** Format: uuid */
            correlation_id: string;
            id: components["schemas"]["Uuid"];
            occurred_at: components["schemas"]["Timestamp"];
            reason?: string | null;
            resource_id?: string | null;
            resource_type: string;
        };
        /** @description Sets the city of a service number, or removes the number with city_id null. A command: expected_version is 0 for a new number; audited with the reason. */
        ChangeCallLine: {
            city_id: components["schemas"]["Uuid"] | null;
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            label?: string | null;
            reason: string;
        };
        ChangeCityOperations: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            payment_methods: components["schemas"]["CityPaymentMethod"][];
            reason: string;
            /** @description Empty — open around the clock. At most 14 intervals. */
            working_hours: components["schemas"]["WorkingHours"][];
        };
        ChangeFeatureFlag: {
            command_id: components["schemas"]["Uuid"];
            enabled: boolean;
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        ChangeIntegrations: {
            changes: {
                name: string;
                /** @description Null or blank removes the panel's value (the environment's applies again). */
                value?: string | null;
            }[];
            command_id: components["schemas"]["Uuid"];
            /** @description The staff member's own password, asked again for every change of keys. */
            password: string;
            reason: string;
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
        ChangePaymentMerchant: {
            /** @description The full list of cities; null keeps them. */
            city_ids?: components["schemas"]["Uuid"][] | null;
            command_id: components["schemas"]["Uuid"];
            domain?: string | null;
            password: string;
            reason: string;
            /** @description A new key; null keeps the current one. */
            secret?: string | null;
        };
        ChangeRetention: {
            /** Format: uuid */
            command_id: string;
            days: components["schemas"]["RetentionDays"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        /** @description Replaces the city's contacts. A command: a repeat with the same command_id returns the first result, the same command_id with another body is a 409, and a stale expected_version is a 409. */
        ChangeSafetyContacts: {
            command_id: components["schemas"]["Uuid"];
            emergency_number: components["schemas"]["EmergencyNumber"];
            /** Format: int64 */
            expected_version: number;
            extra?: components["schemas"]["ExtraContact"][];
            /** @description Why the contacts are changed; goes to the audit log. */
            reason: string;
            support_phone?: components["schemas"]["Phone"] | null;
        };
        ChangeSettings: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
            settings: components["schemas"]["Settings"];
        };
        ChangesPage: {
            changes: components["schemas"]["Change"][];
        };
        ChangeStaff: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        /** @description Sets a staff member's extension, or removes it with extension null. A command: expected_version is 0 when they have none; audited with the reason. An extension another staff member has → 409. */
        ChangeStaffExtension: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            extension: components["schemas"]["Extension"] | null;
            reason: string;
        };
        Chargeback: {
            amount_minor: number;
            bank_reason: string;
            created_at: components["schemas"]["Timestamp"];
            currency: string;
            id: components["schemas"]["Uuid"];
            order_id: components["schemas"]["Uuid"];
            /** Format: date */
            received_on: string;
            resolution_reason: string | null;
            resolved_at: components["schemas"]["Timestamp"] | null;
            /** @enum {string} */
            state: "OPEN" | "WON" | "LOST";
            version: number;
        };
        ChargebackRecordRequest: {
            amount_minor: number;
            /** @description The bank's reason as written in its notice. */
            bank_reason: string;
            command_id: components["schemas"]["Uuid"];
            currency: string;
            /**
             * Format: date
             * @description When the bank's notice came; not in the future.
             */
            received_on: string;
        };
        ChargebackResolveRequest: {
            command_id: components["schemas"]["Uuid"];
            expected_version: number;
            /** @enum {string} */
            outcome: "WON" | "LOST";
            reason: string;
        };
        City: {
            code: string;
            currency: string;
            id: components["schemas"]["Uuid"];
            name: string;
            polygon: components["schemas"]["GeoJsonPolygon"];
            priority: number;
            /** @enum {string} */
            state: "DRAFT" | "PUBLISHED" | "ARCHIVED";
            /** @example Europe/Warsaw */
            timezone: string;
            /** Format: int64 */
            version: number;
        };
        CityList: {
            cities: components["schemas"]["City"][];
        };
        CityOperations: {
            city_id: components["schemas"]["Uuid"];
            orders_paused: boolean;
            pause_reason: string | null;
            /** Format: date-time */
            paused_at: string | null;
            payment_methods: components["schemas"]["CityPaymentMethod"][];
            /** Format: int64 */
            version: number;
            /** @description Empty — open around the clock. */
            working_hours: components["schemas"]["WorkingHours"][];
        };
        /** @enum {string} */
        CityPaymentMethod: "CASH" | "CARD" | "TERMINAL";
        Client: {
            /** @enum {string} */
            account_state: "UNVERIFIED" | "ACTIVE" | "BLOCKED" | "DELETION_PENDING";
            /** @description Set while blocked, and kept under a pending deletion request. */
            block?: null | {
                at: components["schemas"]["Timestamp"];
                by?: components["schemas"]["Uuid"] | null;
                reason: string;
                /** @description Null — until staff unblock. */
                until?: components["schemas"]["Timestamp"] | null;
            };
            created_at: components["schemas"]["Timestamp"];
            deletion_requested_at?: components["schemas"]["Timestamp"] | null;
            has_app: boolean;
            id: components["schemas"]["Uuid"];
            language?: string | null;
            name?: string | null;
            phone: string;
            /** Format: int64 */
            version: number;
        };
        ClientCard: {
            bonuses: {
                /** Format: int64 */
                available_minor: number;
                /** Format: int64 */
                balance_minor: number;
                currency: string;
            }[];
            /** @description The rider's own support cases, newest first. */
            cases: {
                category: string;
                created_at: components["schemas"]["Timestamp"];
                id: components["schemas"]["Uuid"];
                /** Format: int64 */
                number: number;
                order_id?: components["schemas"]["Uuid"] | null;
                state: string;
                subject: string;
            }[];
            client: components["schemas"]["Client"];
            current_orders: components["schemas"]["Order"][];
            /** @description What the rider owes the service (REQ-PAY-18), per currency. */
            debt: {
                /** Format: int64 */
                amount_minor: number;
                currency: string;
            }[];
            /** @description The latest 20, newest first. */
            latest_orders: components["schemas"]["OrderHistoryItem"][];
        };
        ClientList: {
            clients: components["schemas"]["Client"][];
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
        CorrelationTrail: {
            found: {
                /** Format: date-time */
                at: string;
                /** @description The row's id (for an order event, "{order_id}:{sequence}"). */
                id: string;
                /** @description The order it belongs to, when there is one. */
                order_id: components["schemas"]["Uuid"] | null;
                /** @enum {string} */
                type: "ORDER_EVENT" | "PAYMENT_INTENT" | "PAYMENT_OPERATION" | "AUDIT" | "STAFF_ACTIVITY";
            }[];
        };
        CreateAddress: {
            command_id: components["schemas"]["Uuid"];
            data: components["schemas"]["AddressData"];
            reason: string;
        };
        CreateCity: {
            code: string;
            command_id: components["schemas"]["Uuid"];
            currency: string;
            name: string;
            polygon: components["schemas"]["GeoJsonPolygon"];
            /** @description Higher wins where cities overlap. */
            priority: number;
            reason: string;
            timezone: string;
        };
        CreateLegalDraft: {
            acceptance_required: boolean;
            audience: components["schemas"]["LegalAudience"];
            command_id: components["schemas"]["Uuid"];
            effective_from: components["schemas"]["Timestamp"];
            kind: components["schemas"]["LegalKind"];
            texts: components["schemas"]["LegalTexts"];
        };
        CreatePaymentMerchant: {
            account: string;
            /** @description A city already served by another merchant moves to this one. */
            city_ids?: components["schemas"]["Uuid"][];
            command_id: components["schemas"]["Uuid"];
            currency: string;
            domain: string;
            password: string;
            /**
             * @description WAYFORPAY; FAKE only on development and sandbox servers.
             * @enum {string}
             */
            provider: "WAYFORPAY" | "FAKE";
            reason: string;
            secret: string;
        };
        CreateReason: {
            active: boolean;
            /** @enum {string} */
            audience: "RIDER" | "DRIVER" | "STAFF";
            code: string;
            command_id: components["schemas"]["Uuid"];
            driver_outcome?: components["schemas"]["DriverOutcome"];
            labels: components["schemas"]["Labels"];
            /** @default false */
            operator_fault: boolean;
            /** @description Why the list is changed; goes to the audit log. */
            reason: string;
            sort_order: number;
        };
        CreateStaff: {
            command_id: components["schemas"]["Uuid"];
            /** Format: password */
            initial_password: string;
            /** @description 3 to 64 letters, digits, dots, dashes or underscores; case-insensitive. */
            login: string;
            profile: components["schemas"]["Profile"];
            reason: string;
        };
        CreateZone: {
            command_id: components["schemas"]["Uuid"];
            polygon: components["schemas"]["GeoJsonPolygon"];
            priority: number;
            reason: string;
            type: string;
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
        DataExportList: {
            /** @description Newest first, at most 20. */
            exports: components["schemas"]["DataExport"][];
        };
        DecideCashDispute: {
            command_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            decision: "RIDER_PAID" | "PAY_DRIVER" | "KEEP_HELD";
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        Decision: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            /** @description The resolution, or the reason to reopen / close. */
            text: string;
        };
        /** @description What stops staff from completing the request. blocked is true while there is an active order, an unpaid debt or an open support case of the rider. bonuses_to_burn never blocks: the rider's bonuses burn on completion (owner decision 27.10.2026). */
        DeletionBlockers: {
            active_order_id: components["schemas"]["Uuid"] | null;
            blocked: boolean;
            bonuses_to_burn: components["schemas"]["Amount"][];
            /** @description Unpaid debt per currency (RIDER_RECEIVABLE). */
            debt: components["schemas"]["Amount"][];
            open_support_cases: number;
        };
        DeletionDecision: {
            /**
             * @description ANONYMIZED after completion; after a rejection the state the account had before the request.
             * @enum {string}
             */
            account_state: "ANONYMIZED" | "ACTIVE" | "BLOCKED";
            client_id: components["schemas"]["Uuid"];
        };
        DeletionDecisionCommand: {
            command_id: components["schemas"]["Uuid"];
            /** @description Why; goes to the audit log. */
            reason: string;
        };
        DeletionRequest: {
            blockers: components["schemas"]["DeletionBlockers"];
            client_id: components["schemas"]["Uuid"];
            /**
             * @description The state the account returns to if the request is cancelled or rejected.
             * @enum {string}
             */
            previous_state: "ACTIVE" | "BLOCKED";
            /** Format: date-time */
            requested_at: string;
        };
        DeletionRequestList: {
            requests: components["schemas"]["DeletionRequest"][];
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
        /** @enum {string} */
        DocumentType: "DRIVER_LICENSE" | "IDENTITY" | "TAXI_PERMIT" | "VEHICLE_REGISTRATION" | "INSURANCE" | "OTHER";
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
        DriverPromotion: {
            /** Format: date-time */
            created_at: string;
            created_by: components["schemas"]["Uuid"];
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            state: "ACTIVE" | "ARCHIVED";
            terms: components["schemas"]["DriverPromotionDraft"];
            /** Format: date-time */
            updated_at: string;
            /** Format: int64 */
            version: number;
        };
        /** @description Complete orders_required orders within period_days days (periods run from starts_at) — optionally only on days_of_week, between time_from and time_to (city time, when the driver took the order) and with payment_method — and get reward_minor on the balance; once, or in every period (ADR 0010). */
        DriverPromotionDraft: {
            city_id?: components["schemas"]["Uuid"] | null;
            currency: string;
            days_of_week?: ("MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY" | "SUNDAY")[] | null;
            /** Format: date-time */
            ends_at?: string | null;
            name: string;
            orders_required: number;
            /** @enum {string|null} */
            payment_method?: "CASH" | "CARD" | "TERMINAL" | null;
            period_days: number;
            /** @enum {string} */
            repeat: "ONCE" | "EVERY_PERIOD";
            /** Format: int64 */
            reward_minor: number;
            /** Format: date-time */
            starts_at: string;
            /** @example 08:00 */
            time_from?: string | null;
            /** @example 09:00 */
            time_to?: string | null;
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
        EmergencyActivity: {
            /** @description The staff member's requests during the grant, oldest first, at most 1000. */
            activity: {
                at: components["schemas"]["Timestamp"];
                method: string | null;
                outcome: string | null;
                path: string | null;
                status: number | null;
            }[];
        };
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
         * @description The local emergency number, digits only (2–6), e.g. 112.
         * @example 112
         */
        EmergencyNumber: string;
        Entries: {
            entries: components["schemas"]["OperatorBonusEntry"][];
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
        EvidenceCardOperation: {
            amount_minor: number;
            created_at: components["schemas"]["Timestamp"];
            currency: string;
            provider_status: string | null;
            state: string;
            type: string;
        };
        EvidenceChatMessage: {
            body: string;
            sender_role: string;
            sent_at: components["schemas"]["Timestamp"];
        };
        EvidenceDriver: {
            id: components["schemas"]["Uuid"];
            name: string | null;
            vehicle: {
                color: string | null;
                make: string;
                model: string;
                registration_number: string;
            } | null;
        };
        EvidenceFare: {
            agreed_minor: number;
            amount_minor: number;
            charged_waiting_seconds: number;
            currency: string;
            free_waiting_seconds: number;
            policy: string;
            waiting_minor: number;
            waiting_seconds: number;
        };
        EvidenceOrder: {
            arrived_at: components["schemas"]["Timestamp"] | null;
            assigned_at: components["schemas"]["Timestamp"] | null;
            completed_at: components["schemas"]["Timestamp"] | null;
            created_at: components["schemas"]["Timestamp"];
            currency: string;
            discount_minor: number;
            dropoff_label: string | null;
            /** @description The final fare and its breakdown; null before the trip is completed. */
            fare: components["schemas"]["EvidenceFare"] | null;
            final_price_minor: number | null;
            id: components["schemas"]["Uuid"];
            payment_method: string | null;
            payment_state: string | null;
            pickup_label: string | null;
            quoted_price_minor: number | null;
            short_number: number;
            started_at: components["schemas"]["Timestamp"] | null;
            status: string;
            /** @description Paid from the rider's bonus account. */
            wallet_minor: number;
        };
        EvidenceRider: {
            id: components["schemas"]["Uuid"];
            registered_at: components["schemas"]["Timestamp"] | null;
            /** @description Fulfilled orders the rider paid for in the last 12 months, per currency. */
            trips_last_year: {
                currency: string;
                total_minor: number;
                trips: number;
            }[];
        };
        EvidenceSupportCase: {
            category: string;
            created_at: components["schemas"]["Timestamp"];
            /** @description What was said to and by the requester; internal notes are left out. */
            messages: {
                author_type: string;
                body: string;
                created_at: components["schemas"]["Timestamp"];
            }[];
            number: number;
            resolution: string | null;
            state: string;
            subject: string;
        };
        /** @description The ride's GPS track from its start to its completion, summarized. length_meters is the line through the points not flagged as a jump or from the future. */
        EvidenceTrack: {
            duration_seconds: number;
            first_point_at: components["schemas"]["Timestamp"] | null;
            flagged_points: number;
            last_point_at: components["schemas"]["Timestamp"] | null;
            length_meters: number;
            points: number;
        };
        /** @example 101 */
        Extension: string;
        ExtraContact: {
            label: components["schemas"]["ExtraLabels"];
            phone: components["schemas"]["Phone"];
        };
        /**
         * @description The contact's name by language (uk, pl, ru, en), at most 80 characters each; the service's default language is required.
         * @example {
         *       "uk": "Поліція",
         *       "pl": "Policja",
         *       "ru": "Полиция",
         *       "en": "Police"
         *     }
         */
        ExtraLabels: {
            [key: string]: string;
        };
        FeatureFlag: {
            /** Format: date-time */
            changed_at: string | null;
            /** Format: uuid */
            changed_by: string | null;
            default_enabled: boolean;
            description: string;
            enabled: boolean;
            /** @example card-payments */
            key: string;
            /** @description The server module that answers for the flag. */
            owner: string;
            reason: string | null;
            /**
             * Format: date
             * @description By this date the flag is removed or its date moved with a reason.
             */
            review_by: string;
            /**
             * Format: int64
             * @description 0 until the first switch.
             */
            version: number;
        };
        FeatureFlagList: {
            flags: components["schemas"]["FeatureFlag"][];
        };
        FieldError: {
            code: string;
            /** @description JSON pointer or dotted path of the offending field. */
            field: string;
            message?: string;
        };
        GeoChange: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        /** @description GeoJSON Polygon or MultiPolygon, WGS84 (longitude, latitude). */
        GeoJsonPolygon: {
            coordinates: unknown[];
            /** @enum {string} */
            type: "Polygon" | "MultiPolygon";
        };
        /** @description WGS84 coordinates (REQ-GEO-01). */
        GeoPoint: {
            lat: number;
            lon: number;
        };
        GeoRevision: {
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            state: "DRAFT" | "PUBLISHED" | "ARCHIVED";
            /** Format: int64 */
            version: number;
        };
        GrantEmergencyAccess: {
            all_cities: boolean;
            /** @description Required unless all_cities. */
            city_ids?: components["schemas"]["Uuid"][];
            command_id: components["schemas"]["Uuid"];
            minutes: number;
            /** @description From the permission catalog. */
            permissions: string[];
            reason: string;
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
        IntegrationCheck: {
            group: string;
            /** @description What was checked; never a key. */
            message: string;
            ok: boolean;
        };
        IntegrationField: {
            /** Format: date-time */
            changed_at?: string | null;
            changed_by?: components["schemas"]["Uuid"] | null;
            description: string;
            /** @description The value goes to the apps in the public start-up data (config.v1 bootstrap). */
            for_apps: boolean;
            /** @enum {string} */
            group: "push" | "routing" | "maps" | "geocoding" | "otp";
            /** @description The last characters of a SECRET, e.g. "…a1b2". */
            hint?: string | null;
            /** @enum {string} */
            kind: "TEXT" | "SECRET" | "FLAG";
            label: string;
            /** @example push.fcm.credentials */
            name: string;
            set: boolean;
            /** @description Always null for a SECRET. */
            value?: string | null;
        };
        IntegrationFieldList: {
            fields: components["schemas"]["IntegrationField"][];
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
        Languages: {
            /** @enum {string} */
            default_language: "uk" | "pl" | "ru" | "en";
            enabled: ("uk" | "pl" | "ru" | "en")[];
        };
        /** @enum {string} */
        LegalAudience: "RIDER" | "DRIVER";
        LegalDocumentVersion: {
            /** @description While a version in force that must be accepted is not, riders cannot order and drivers cannot go online (403 ACCEPTANCE_REQUIRED). */
            acceptance_required: boolean;
            audience: components["schemas"]["LegalAudience"];
            /** @description Publishing moves a moment in the past to the moment of publication. */
            effective_from: components["schemas"]["Timestamp"];
            id: components["schemas"]["Uuid"];
            kind: components["schemas"]["LegalKind"];
            /** @description 1, 2, 3… per audience and kind. */
            number: number;
            /** Format: date-time */
            published_at: string | null;
            /**
             * @description DRAFT — staff may still change it; PUBLISHED — never changes.
             * @enum {string}
             */
            state: "DRAFT" | "PUBLISHED";
            texts: components["schemas"]["LegalTexts"];
            /**
             * Format: int64
             * @description Optimistic lock of the draft.
             */
            version: number;
        };
        LegalDocumentVersionList: {
            versions: components["schemas"]["LegalDocumentVersion"][];
        };
        /**
         * @description DRIVER_AGREEMENT is for drivers only.
         * @enum {string}
         */
        LegalKind: "TERMS" | "PRIVACY_NOTICE" | "DRIVER_AGREEMENT";
        /** @enum {string} */
        LegalLanguage: "uk" | "pl" | "ru" | "en";
        /** @description Language → text, at least one, each 1 to 200 000 characters. */
        LegalTexts: {
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
        /** @description Minor units of the city's currency; only movements of the city's orders. */
        MoneyFigures: {
            /** Format: int64 */
            bonuses_granted_minor: number;
            /**
             * Format: int64
             * @description Cash and the drivers' own terminals.
             */
            collected_by_drivers_minor: number;
            /** Format: int64 */
            commission_minor: number;
            /** Format: int64 */
            discounts_minor: number;
            /** Format: int64 */
            driver_share_minor: number;
            /** Format: int64 */
            fares_minor: number;
            /** Format: int64 */
            paid_by_card_minor: number;
            /** Format: int64 */
            paid_with_bonuses_minor: number;
            /**
             * Format: int64
             * @description How the riders' debt for these orders changed; positive — it grew.
             */
            rider_debt_change_minor: number;
            /**
             * Format: int64
             * @description Follow-up rides the service paid itself.
             */
            service_rides_minor: number;
            /** Format: int64 */
            tips_minor: number;
            trips: number;
        };
        MoneyReport: {
            city_id: components["schemas"]["Uuid"];
            currency: string;
            days: {
                /** Format: date */
                date: string;
                figures: components["schemas"]["MoneyFigures"];
            }[];
            /** Format: date */
            from: string;
            /** @description When the figures were read (REQ-ADM-06). */
            generated_at: components["schemas"]["Timestamp"];
            timezone: string;
            /** Format: date */
            to: string;
            total: components["schemas"]["MoneyFigures"];
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
        OperatorBonusPeriod: {
            cancelled_count: number;
            /** Format: date-time */
            closed_at: string;
            fulfilled_count: number;
            /** Format: date-time */
            period_ended_at: string;
            /**
             * Format: date
             * @description The reset day that closed the period.
             */
            period_key: string;
            /** Format: date-time */
            period_started_at: string;
            points: number;
            staff_id: components["schemas"]["Uuid"];
        };
        OperatorBonusSettings: {
            count_cancellations: boolean;
            g: number;
            m: number;
            reset_day: number;
            /** @description The first rule that matches wins; otherwise m and g. */
            time_rules: components["schemas"]["OperatorBonusTimeRule"][];
        };
        OperatorBonusSettingsVersion: {
            changed_by?: components["schemas"]["Uuid"] | null;
            /** Format: date-time */
            effective_at: string;
            reason: string;
            settings: components["schemas"]["OperatorBonusSettings"];
            /** Format: int64 */
            version: number;
        };
        OperatorBonusTimeRule: {
            /** @description ISO days, 1 = Monday … 7 = Sunday. */
            days_of_week: number[];
            /** @description Exclusive; city time of the order's creation. */
            end_hour: number;
            g: number;
            key: string;
            m: number;
            start_hour: number;
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
        OrderCounts: {
            /** @description APP, PHONE, WEB → count. */
            by_channel: {
                [key: string]: number;
            };
            /** @description CASH, CARD, TERMINAL, SERVICE → count. */
            by_payment: {
                [key: string]: number;
            };
            cancelled: number;
            /** @description RIDER, DRIVER, STAFF → count. */
            cancelled_by: {
                [key: string]: number;
            };
            created: number;
            fulfilled: number;
            /** @description Not finished yet. */
            open: number;
            unfulfilled: number;
        };
        /** @description The evidence of one order for a chargeback (REQ-PAY-23). Carries no phone number and no card data. */
        OrderEvidence: {
            card_operations: components["schemas"]["EvidenceCardOperation"][];
            chat: components["schemas"]["EvidenceChatMessage"][];
            /** @description The driver of the order's last assignment; null when it never had one. */
            driver: components["schemas"]["EvidenceDriver"] | null;
            generated_at: components["schemas"]["Timestamp"];
            order: components["schemas"]["EvidenceOrder"];
            /** @description The payer; null for an order without one. */
            rider: components["schemas"]["EvidenceRider"] | null;
            support_cases: components["schemas"]["EvidenceSupportCase"][];
            track: components["schemas"]["EvidenceTrack"];
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
        OrderReport: {
            /** @description Most frequent first. */
            cancellation_reasons: {
                cancelled_by: string;
                code: string;
                count: number;
            }[];
            city_id: components["schemas"]["Uuid"];
            /** @description Days with orders, oldest first, by the day an order was created. */
            days: {
                counts: components["schemas"]["OrderCounts"];
                /** Format: date */
                date: string;
            }[];
            /** Format: date */
            from: string;
            /** @description When the figures were read (REQ-ADM-06). */
            generated_at: components["schemas"]["Timestamp"];
            timezone: string;
            /** Format: date */
            to: string;
            total: components["schemas"]["OrderCounts"];
        };
        OtpDelivery: {
            /** Format: date-time */
            attempted_at: string;
            /** @enum {string} */
            audience: "CLIENT" | "DRIVER";
            challenge_id: components["schemas"]["Uuid"] | null;
            /** @enum {string} */
            channel: "SMS" | "VOICE";
            error: string | null;
            id: components["schemas"]["Uuid"];
            phone: string;
            /** @enum {string} */
            provider: "TURBOSMS" | "ASTERISK" | "FAKE";
            /** @description The provider's message or call id, when it gave one. */
            provider_ref: string | null;
            /**
             * @description SENT — the provider took it; FAILED — it refused or is not configured (the next channel was tried); UNKNOWN — no answer (it may still arrive; the next channel was tried).
             * @enum {string}
             */
            state: "SENT" | "FAILED" | "UNKNOWN";
        };
        OwnAddress: {
            aliases: {
                label?: string;
                language?: string;
            }[];
            data: components["schemas"]["AddressData"];
            /** @description Parsed house number, suffix and building. */
            house?: Record<string, never>;
            id: components["schemas"]["Uuid"];
            source: string;
            /** Format: int64 */
            version: number;
            /** @enum {string} */
            visibility: "ACTIVE" | "HIDDEN";
        };
        PaymentMerchant: {
            account: string;
            city_ids: components["schemas"]["Uuid"][];
            /** Format: date-time */
            created_at: string;
            currency: string;
            domain: string;
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            provider: "WAYFORPAY" | "FAKE";
            secret_hint?: string | null;
            /**
             * @description NONE — the merchant cannot be used until a key is entered.
             * @enum {string}
             */
            secret_source: "PANEL" | "ENVIRONMENT" | "NONE";
        };
        PaymentMerchantList: {
            merchants: components["schemas"]["PaymentMerchant"][];
        };
        PaymentOperation: {
            /** Format: int64 */
            amount_minor: number;
            /** Format: date-time */
            created_at: string;
            currency: string;
            id: components["schemas"]["Uuid"];
            /** @description The staff member who asked for the retry. */
            initiated_by: components["schemas"]["Uuid"] | null;
            order_id: components["schemas"]["Uuid"];
            provider_status: string | null;
            /** @description The provider's reason of a decline. */
            reason: string | null;
            /** @description The operation this one repeats (a manual retry). */
            retry_of: components["schemas"]["Uuid"] | null;
            /** @enum {string} */
            state: "CREATED" | "SENDING" | "PENDING" | "UNKNOWN" | "SUCCEEDED" | "DECLINED" | "CANCELLED";
            /** @enum {string} */
            type: "AUTH" | "SETTLE" | "CHARGE" | "REFUND" | "TIP";
        };
        PaymentReconciliationItem: {
            /** @enum {string|null} */
            decision?: "EXPLAINED" | "CORRECTED_BY_HAND" | "ESCALATED" | null;
            /** @description Provider evidence only, not compared or booked until accounting policy is decided. */
            fee_minor?: number | null;
            /** Format: uuid */
            id: string;
            /** @enum {string} */
            kind: "MISSING_LOCALLY" | "MISSING_AT_PROVIDER" | "AMOUNT" | "CURRENCY" | "STATE" | "UNKNOWN_STILL" | "NOT_CHECKED";
            /** @description Effective local amount used for this bank-reference comparison; for UNKNOWN_STILL, the unresolved command's requested amount. */
            local_amount_minor?: number | null;
            local_currency?: string | null;
            /** Format: uuid */
            local_operation_id?: string | null;
            /**
             * Format: uuid
             * @description Payments-owned source id; an operation, top-up or verification according to local_type.
             */
            local_record_id?: string | null;
            local_state?: string | null;
            local_type?: string | null;
            provider_amount_minor?: number | null;
            /** Format: date-time */
            provider_at?: string | null;
            provider_currency?: string | null;
            provider_state?: string | null;
            provider_status?: string | null;
            provider_type?: string | null;
            reason?: string | null;
            /** @description The provider reference for looking the transaction up in the provider's cabinet, at most 80 characters, with every run of five or more digits or asterisks replaced by #####. Our own references (operation type and id) stay readable. */
            reference_display?: string | null;
            /** @description Merchant-scoped safe identity of the provider reference; arbitrary external reference strings may contain personal data and are not persisted. */
            reference_fingerprint: string;
            /** Format: date-time */
            resolved_at?: string | null;
            /** Format: uuid */
            resolved_by?: string | null;
            /** Format: uuid */
            run_id: string;
            /** @enum {string} */
            state: "OPEN" | "RESOLVED";
            version: number;
        };
        PaymentReconciliationRun: {
            attempts?: number;
            /** Format: date-time */
            created_at: string;
            /** Format: date */
            day: string;
            /** @description Fixed diagnostic code, never a raw provider error or response. */
            failure_code?: string | null;
            /** Format: date-time */
            finished_at?: string | null;
            /** Format: uuid */
            id: string;
            item_count?: number | null;
            local_count?: number | null;
            /** Format: uuid */
            merchant_id: string;
            /** Format: date-time */
            observed_until?: string | null;
            open_count?: number | null;
            /** @description Only a sandbox preview may observe an incomplete day; production runs wait until the end overlap has elapsed. */
            partial: boolean;
            /** Format: date-time */
            period_from: string;
            /** Format: date-time */
            period_to: string;
            provider_count?: number | null;
            /** @enum {string} */
            state: "RUNNING" | "CLEAN" | "OPEN" | "RESOLVED" | "FAILED";
            /** Format: date-time */
            updated_at: string;
            version: number;
        };
        Periods: {
            periods: components["schemas"]["OperatorBonusPeriod"][];
        };
        Permission: {
            /** @example orders.create */
            code: string;
            description: string;
            group: string;
        };
        PermissionCatalog: {
            permissions: components["schemas"]["Permission"][];
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
        PhoneChanged: {
            phone: string;
            subject_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            version: number;
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
        Promotion: components["schemas"]["PromotionDraft"] & {
            /** Format: date-time */
            created_at: string;
            created_by: components["schemas"]["Uuid"];
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            state: "ACTIVE" | "ARCHIVED";
            /** Format: date-time */
            updated_at: string;
            /** Format: int64 */
            version: number;
        };
        /** @description Null means "any". Days and hours in the city's time zone at the pickup time. */
        PromotionConditions: {
            city_id?: components["schemas"]["Uuid"] | null;
            days_of_week?: ("MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY" | "SUNDAY")[] | null;
            dropoff_zone_id?: components["schemas"]["Uuid"] | null;
            /** Format: date-time */
            ends_at?: string | null;
            /** @description The rider's N-th, 2N-th … completed trip (2…1000); null — every trip. One order of the rider gets each N-th trip; a quote counted on it no longer creates an order once another order has it (QUOTE_EXPIRED, get a new price), and a cancelled order gives it back. */
            every_nth_trip?: number | null;
            /** @description A zone of city_id (city required). */
            pickup_zone_id?: components["schemas"]["Uuid"] | null;
            /** Format: date-time */
            starts_at?: string | null;
            /**
             * @description HH:mm, inclusive; with time_to. A window past midnight (22:00–06:00) wraps.
             * @example 08:00
             */
            time_from?: string | null;
            /** @description HH:mm, exclusive. */
            time_to?: string | null;
            vehicle_class?: string | null;
        };
        PromotionDraft: {
            conditions: components["schemas"]["PromotionConditions"];
            /** @description Required for FIXED; ignored for PERCENT. */
            currency?: string | null;
            /** @enum {string} */
            kind: "DISCOUNT" | "BONUS";
            /** @description Shown to the rider in the quote and in the account history. */
            name: string;
            /**
             * Format: int64
             * @description PERCENT — basis points (1000 = 10 %, at most 10000); FIXED — minor units of currency.
             */
            value: number;
            /** @enum {string} */
            value_type: "PERCENT" | "FIXED";
        };
        PublishLegalDraft: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
        };
        RaiseRiskFlag: {
            city_id: components["schemas"]["Uuid"];
            command_id: components["schemas"]["Uuid"];
            driver_id: components["schemas"]["Uuid"];
            reason: string;
        };
        Reason: {
            /** @description Inactive reasons are hidden from the apps; reasons are never deleted. */
            active: boolean;
            /** @enum {string} */
            audience: "RIDER" | "DRIVER" | "STAFF";
            /** @description Never changes; to rename, change the labels. */
            code: string;
            driver_outcome: components["schemas"]["DriverOutcome"];
            id: components["schemas"]["Uuid"];
            labels: components["schemas"]["Labels"];
            /** @description STAFF-only flag; cancelling for such a reason may charge the order creator's bonus account. */
            operator_fault?: boolean;
            sort_order: number;
            /** Format: int64 */
            version: number;
        };
        /** @description PENDING → RUNNING → READY (the file can be downloaded until expires_at) or FAILED (error); READY → EXPIRED, the file is dropped. */
        ReportExport: {
            city_id: components["schemas"]["Uuid"];
            created_at: components["schemas"]["Timestamp"];
            error?: string | null;
            expires_at?: components["schemas"]["Timestamp"] | null;
            file_name?: string | null;
            /** Format: date */
            from: string;
            id: components["schemas"]["Uuid"];
            /** @enum {string} */
            kind: "ORDERS" | "FINANCE";
            ready_at?: components["schemas"]["Timestamp"] | null;
            /** @description Rows of data in the file, the total row included, the header not. */
            rows?: number | null;
            /** @enum {string} */
            state: "PENDING" | "RUNNING" | "READY" | "FAILED" | "EXPIRED";
            /** Format: date */
            to: string;
        };
        ReportExportList: {
            exports: components["schemas"]["ReportExport"][];
        };
        RequestReportExport: {
            city_id: components["schemas"]["Uuid"];
            command_id: components["schemas"]["Uuid"];
            /** Format: date */
            from: string;
            /**
             * @description ORDERS — the report of orders; FINANCE — the report of money.
             * @enum {string}
             */
            kind: "ORDERS" | "FINANCE";
            /**
             * Format: date
             * @description Included; at most 92 days after from.
             */
            to: string;
        };
        ResetPassword: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
            /** Format: password */
            temporary_password: string;
        };
        /** @description Separate retention in whole days for each kind. 0 always means keep forever. A change applies to the next cleanup run; already deleted data cannot be restored. Cleanup never deletes the audit log, journal, orders, payments or FAILED outbox events. */
        RetentionDays: {
            /**
             * @description Recording files and metadata, including refused recordings still on Asterisk. Defaults to keeping forever. 0 means keep forever.
             * @default 0
             */
            call_recordings: number;
            /**
             * @description Code delivery attempts, measured from the attempt time. 0 means keep forever.
             * @default 90
             */
            code_deliveries: number;
            /**
             * @description Completed command receipts, measured from completion. After expiry a command id is no longer remembered. 0 means keep forever.
             * @default 30
             */
            command_receipts: number;
            /**
             * @description Completed consumer inbox receipts, measured from completion. Receipts for events still PENDING or FAILED are preserved so replay skips completed consumers. 0 means keep forever.
             * @default 30
             */
            consumer_receipts: number;
            /**
             * @description Only DONE outbox events, measured from completion. FAILED and PENDING events are preserved. 0 means keep forever.
             * @default 30
             */
            delivered_events: number;
            /**
             * @description Files stuck in quarantine; call recordings use their separate setting. 0 means keep forever.
             * @default 30
             */
            quarantined_files: number;
            /**
             * @description Refresh tokens after expiry or session revocation; active tokens are preserved. 0 means keep forever.
             * @default 30
             */
            sessions: number;
            /**
             * @description One-time sign-in challenges, measured from creation. 0 means keep forever.
             * @default 90
             */
            sign_in_codes: number;
            /**
             * @description Expired uploads never completed, or uploaded files never attached. Documents, support attachments and call recordings are preserved. 0 means keep forever.
             * @default 7
             */
            upload_sessions: number;
        };
        RetentionVersion: {
            /** Format: date-time */
            changed_at: string | null;
            /** Format: uuid */
            changed_by: string | null;
            days: components["schemas"]["RetentionDays"];
            reason: string | null;
            /** Format: int64 */
            version: number;
        };
        ReviewCase: {
            /** @description The driver's current documents whose file has the same content as a document of another driver (issue #105). A warning for the reviewer; it blocks nothing. */
            duplicates?: {
                document_id: components["schemas"]["Uuid"];
                other_document_id: components["schemas"]["Uuid"];
                other_driver_id: components["schemas"]["Uuid"];
            }[];
            history: components["schemas"]["ReviewEvent"][];
            phone?: string | null;
            profile: components["schemas"]["DriverProfile"];
        };
        ReviewChange: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        ReviewDecisionCommand: {
            command_id: components["schemas"]["Uuid"];
            /** @enum {string} */
            decision: "APPROVE" | "REQUEST_CHANGES" | "REJECT";
            /** Format: int64 */
            expected_version: number;
            reason: string;
            rejected_documents?: components["schemas"]["Uuid"][];
            /** @description Classes granted to the submitted vehicles on APPROVE, e.g. STANDARD. */
            vehicle_classes?: string[];
        };
        ReviewEvent: {
            /** Format: uuid */
            actor_id?: string | null;
            actor_type: string;
            at: components["schemas"]["Timestamp"];
            from: string;
            reason: string;
            to: string;
        };
        ReviewItem: {
            driver_id: components["schemas"]["Uuid"];
            name?: string | null;
            phone?: string | null;
            since: components["schemas"]["Timestamp"];
            status: string;
            /** Format: int64 */
            version: number;
        };
        ReviewQueue: {
            drivers: components["schemas"]["ReviewItem"][];
        };
        /** @description OPEN → CONFIRMED or DISMISSED, once; the reason is required and audited. */
        ReviewRiskFlag: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        /** @enum {string} */
        ReviewStatus: "NOT_SUBMITTED" | "IN_REVIEW" | "CHANGES_REQUIRED" | "APPROVED" | "REJECTED" | "SUSPENDED" | "EXPIRED";
        RevokeEmergencyAccess: {
            command_id: components["schemas"]["Uuid"];
            reason: string;
        };
        RiskFlag: {
            /** @description Null only for DUPLICATE_DOCUMENT (a driver applicant belongs to no city). */
            city_id: components["schemas"]["Uuid"] | null;
            driver_id: components["schemas"]["Uuid"];
            /** @description For IMPOSSIBLE_MOVEMENT: work_session_id, track_point_id, distance_m, seconds, speed_kph, recorded_at. For DUPLICATE_DOCUMENT: document_id, other_driver_id, other_document_id. Never coordinates. */
            evidence: {
                [key: string]: unknown;
            };
            id: components["schemas"]["Uuid"];
            kind: components["schemas"]["RiskFlagKind"];
            /** Format: date-time */
            raised_at: string;
            /** @description The staff member who raised a MANUAL flag; null for an automatic one. */
            raised_by: components["schemas"]["Uuid"] | null;
            /** @description Why a MANUAL flag was raised; null for an automatic one. */
            reason: string | null;
            review_reason: string | null;
            /** Format: date-time */
            reviewed_at: string | null;
            reviewed_by: components["schemas"]["Uuid"] | null;
            state: components["schemas"]["RiskFlagState"];
            /** Format: int64 */
            version: number;
        };
        /**
         * @description IMPOSSIBLE_MOVEMENT — two consecutive positions of a shift imply a speed above the limit (250 km/h by default) over more than the minimum distance; at most one per shift and hour. MANUAL — raised by staff. DUPLICATE_DOCUMENT — the driver added a document whose file has the same content as another driver's (issue #105); at most one per pair of drivers; of no city, so only staff with all cities see it.
         * @enum {string}
         */
        RiskFlagKind: "IMPOSSIBLE_MOVEMENT" | "MANUAL" | "CASH_DISPUTE" | "DUPLICATE_DOCUMENT";
        RiskFlagList: {
            flags: components["schemas"]["RiskFlag"][];
        };
        /** @enum {string} */
        RiskFlagState: "OPEN" | "CONFIRMED" | "DISMISSED";
        /** @enum {string} */
        Role: "SUPER_ADMIN" | "ADMIN" | "OPERATOR";
        /** @description The contacts of a city in force for the admin panel; version 0 with the default (112, nothing else) until the first change. */
        SafetyContactsVersion: {
            /** Format: date-time */
            changed_at: string | null;
            changed_by: components["schemas"]["Uuid"] | null;
            city_id: components["schemas"]["Uuid"];
            emergency_number: components["schemas"]["EmergencyNumber"];
            extra: components["schemas"]["ExtraContact"][];
            reason: string | null;
            support_phone: components["schemas"]["Phone"] | null;
            /** Format: int64 */
            version: number;
        };
        "schemas-ChangeSettings": components["schemas"]["Command"] & {
            reason: string;
            settings: components["schemas"]["OperatorBonusSettings"];
        };
        Settings: {
            /** @description Per-platform version policy (REQ-API-10). Omitted when saving: no policy (every build allowed, "0.0.0"). */
            app_versions?: {
                driver_android?: components["schemas"]["PlatformVersions"] | null;
                driver_ios?: components["schemas"]["PlatformVersions"] | null;
                /**
                 * @description When true, the four checked actions refuse a request with no version header.
                 * @default false
                 */
                require_version_header: boolean;
                rider_android?: components["schemas"]["PlatformVersions"] | null;
                rider_ios?: components["schemas"]["PlatformVersions"] | null;
            } | null;
            brand: components["schemas"]["Brand"];
            calls: {
                /** @enum {string} */
                mode: "DIRECT" | "VIA_SERVICE_NUMBERS";
                service_phone?: string | null;
            };
            /** @description When the driver reports that cash (or the driver's own terminal) was not paid (owner decision 28.10.2026). The rider owes the whole fare either way. Omitted — the driver is credited the whole share. */
            cash_not_received?: {
                /**
                 * @description Whether the driver's balance gets anything for such a trip.
                 * @default true
                 */
                credit_driver: boolean;
                /**
                 * @description The part of the driver's share credited when credit_driver is true; the rest is held in suspense until support settles the dispute. Ignored (0) when credit_driver is false.
                 * @default 100
                 */
                driver_share_percent: number;
            };
            languages: components["schemas"]["Languages"];
            orders?: {
                /**
                 * @description How many orders not in a final state (pre-orders included) one paying rider may have at once (active_orders_per_payer, ADR 0012 Q-03); one more is refused with 409 ACTIVE_ORDER_LIMIT.
                 * @default 3
                 */
                active_per_payer: number;
            };
            /** @description Omitted — the defaults (60 min threshold, 7 days, BROADCAST_BEFORE 30 min). */
            preorders?: components["schemas"]["Preorders"];
            ratings?: {
                /**
                 * @description Hours after trip completion during which a rating may be submitted or replaced.
                 * @default 24
                 */
                edit_window_hours: number;
            };
            /** @description Limit on what one staff member may top up in 24 hours (threat model C3, owner decision 30.10.2026): driver balance top-ups (DEPOSIT and BONUS) and rider wallet top-ups together, per currency, counted over the last 24 hours (a rolling window, not a calendar day). One more top-up over it is refused with 422 TOP_UP_DAILY_LIMIT and nothing is credited. A currency not listed has no daily limit; omitted when saving: no daily limit. The limit of one top-up (100 000.00) stays. */
            staff_top_ups?: {
                /**
                 * @description Currency code to the most one staff member may top up in 24 hours, in minor units.
                 * @example {
                 *       "UAH": 30000000,
                 *       "PLN": 3000000
                 *     }
                 */
                daily_max_per_staff_minor?: {
                    [key: string]: number;
                };
            } | null;
            tips?: {
                /**
                 * @description Hours after trip completion during which the rider may leave a tip (ADR 0012).
                 * @default 24
                 */
                window_hours: number;
            };
        };
        SettingsHistory: {
            versions: components["schemas"]["SettingsVersion"][];
        };
        SettingsVersion: {
            /** Format: date-time */
            changed_at?: string | null;
            /** Format: uuid */
            changed_by?: string | null;
            reason?: string | null;
            settings: components["schemas"]["Settings"];
            /** Format: int64 */
            version: number;
        };
        /** @description A staff member's internal number on the service's Asterisk; one extension — one staff member. Asterisk's answers on it name who took a call; click-to-call rings it. */
        StaffExtension: {
            extension: components["schemas"]["Extension"];
            staff_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            version: number;
        };
        StaffExtensionList: {
            extensions: components["schemas"]["StaffExtension"][];
        };
        StaffList: {
            staff: components["schemas"]["StaffMember"][];
        };
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
        StaffTopUp: {
            /** Format: int64 */
            amount_minor: number;
            command_id: components["schemas"]["Uuid"];
            /** @description A currency of one of the service's cities. */
            currency: string;
            reason: string;
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
        /** @description The code sent by the support code request to the new phone, which the person reads to support (owner decision 28.10.2026). The new phone is the one the code went to. */
        SupportPhoneChange: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            new_challenge_id: components["schemas"]["Uuid"];
            new_code: string;
            /** @description How the person was identified, e.g. the documents checked. */
            reason: string;
        };
        SuspendDriver: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
            /** @description The driver's risk flag that caused the suspension (issue */
            risk_flag_id?: components["schemas"]["Uuid"] | null;
        };
        /**
         * Format: date-time
         * @description Moment in UTC, RFC 3339.
         * @example 2026-10-26T12:00:00Z
         */
        Timestamp: string;
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
        UnblockClient: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        UpdateAddress: {
            command_id: components["schemas"]["Uuid"];
            data: components["schemas"]["AddressData"];
            /** Format: int64 */
            expected_version: number;
            reason: string;
        };
        UpdateLegalDraft: {
            acceptance_required: boolean;
            command_id: components["schemas"]["Uuid"];
            effective_from: components["schemas"]["Timestamp"];
            /** Format: int64 */
            expected_version: number;
            texts: components["schemas"]["LegalTexts"];
        };
        UpdateReason: {
            active: boolean;
            command_id: components["schemas"]["Uuid"];
            driver_outcome?: components["schemas"]["DriverOutcome"];
            /** Format: int64 */
            expected_version: number;
            labels: components["schemas"]["Labels"];
            operator_fault?: boolean;
            reason: string;
            sort_order: number;
        };
        UpdateStaff: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            profile: components["schemas"]["Profile"];
            reason: string;
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
        /** @description One interval of work in the city's time zone, starting on each of the given ISO days (1 = Monday). An interval whose `to` is not after `from` runs past midnight into the next day ("22:00"–"06:00"); `from` equal to `to` is 24 hours from `from`. */
        WorkingHours: {
            days_of_week: number[];
            from: string;
            to: string;
        };
        Zone: {
            city_id: components["schemas"]["Uuid"];
            id: components["schemas"]["Uuid"];
            polygon: components["schemas"]["GeoJsonPolygon"];
            priority: number;
            /** @enum {string} */
            state: "DRAFT" | "PUBLISHED" | "ARCHIVED";
            type: string;
            /** Format: int64 */
            version: number;
        };
        ZoneList: {
            zones: components["schemas"]["Zone"][];
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
        /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
        CorrelationId: components["schemas"]["Uuid"];
        RiskFlagId: components["schemas"]["Uuid"];
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
    createOwnAddress: {
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
                "application/json": components["schemas"]["CreateAddress"];
            };
        };
        responses: {
            /** @description OK */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OwnAddress"];
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
    getOwnAddress: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                address_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["OwnAddress"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    addOwnAddressAlias: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                address_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["AddAlias"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OwnAddress"];
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
    hideOwnAddress: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                address_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["GeoChange"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OwnAddress"];
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
    restoreOwnAddress: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                address_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["GeoChange"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OwnAddress"];
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
    updateOwnAddress: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                address_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["UpdateAddress"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OwnAddress"];
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
    listCallLines: {
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
                    "application/json": components["schemas"]["CallLineList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    changeCallLine: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                number: string;
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ChangeCallLine"];
            };
        };
        responses: {
            /** @description The line as it is now; for a removal the last version with city_id of the removed line. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CallLine"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    listOpenCashDisputes: {
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
                    "application/json": components["schemas"]["CashDisputeList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    listCities: {
        parameters: {
            query?: {
                state?: "DRAFT" | "PUBLISHED" | "ARCHIVED";
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
                    "application/json": components["schemas"]["CityList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    createCity: {
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
                "application/json": components["schemas"]["CreateCity"];
            };
        };
        responses: {
            /** @description OK */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GeoRevision"];
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
    listOwnAddresses: {
        parameters: {
            query?: {
                include_hidden?: boolean;
                limit?: number;
                text?: string;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["AddressList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    archiveCity: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["GeoChange"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GeoRevision"];
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
    getCityOperations: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["CityOperations"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    changeCityOperations: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ChangeCityOperations"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CityOperations"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    pauseCityOrders: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["GeoChange"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CityOperations"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    resumeCityOrders: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["GeoChange"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CityOperations"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    publishCity: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["GeoChange"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GeoRevision"];
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
    listZones: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["ZoneList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    createZone: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["CreateZone"];
            };
        };
        responses: {
            /** @description OK */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GeoRevision"];
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
    listClientDeletions: {
        parameters: {
            query?: {
                /** @description Only requests made after this moment (the last requested_at of the previous page). */
                after?: string;
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
                    "application/json": components["schemas"]["DeletionRequestList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    completeClientDeletion: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                client_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["DeletionDecisionCommand"];
            };
        };
        responses: {
            /** @description Completed. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DeletionDecision"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    rejectClientDeletion: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                client_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["DeletionDecisionCommand"];
            };
        };
        responses: {
            /** @description Rejected. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DeletionDecision"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    searchClients: {
        parameters: {
            query: {
                limit?: number;
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
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["ClientList"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    getClientCard: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                client_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["ClientCard"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    blockClient: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                client_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["BlockClient"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Client"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listClientDataExports: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                client_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["DataExportList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    changeClientPhoneBySupport: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                client_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["SupportPhoneChange"];
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
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    sendClientNewPhoneCodeBySupport: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                client_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["NewPhone"];
            };
        };
        responses: {
            /** @description Sent. */
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
            429: components["responses"]["TooManyRequests"];
        };
    };
    unblockClient: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                client_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["UnblockClient"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Client"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listDriverPromotions: {
        parameters: {
            query?: {
                include_archived?: boolean;
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
            /** @description Oldest first. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        promotions: components["schemas"]["DriverPromotion"][];
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    createDriverPromotion: {
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
                    command_id: components["schemas"]["Uuid"];
                    promotion: components["schemas"]["DriverPromotionDraft"];
                    reason: string;
                };
            };
        };
        responses: {
            /** @description The promotion. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverPromotion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    archiveDriverPromotion: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                promotion_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    command_id: components["schemas"]["Uuid"];
                    /** Format: int64 */
                    expected_version: number;
                    reason: string;
                };
            };
        };
        responses: {
            /** @description The promotion. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverPromotion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    changeDriverPromotion: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                promotion_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    command_id: components["schemas"]["Uuid"];
                    /** Format: int64 */
                    expected_version: number;
                    promotion: components["schemas"]["DriverPromotionDraft"];
                    reason: string;
                };
            };
        };
        responses: {
            /** @description The promotion. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverPromotion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    listDriverRiskFlags: {
        parameters: {
            query?: {
                /** @description Only flags raised before this time (the next page). */
                before?: components["schemas"]["Timestamp"];
                city_id?: components["schemas"]["Uuid"];
                driver_id?: components["schemas"]["Uuid"];
                limit?: number;
                state?: components["schemas"]["RiskFlagState"];
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
                    "application/json": components["schemas"]["RiskFlagList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    raiseDriverRiskFlag: {
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
                "application/json": components["schemas"]["RaiseRiskFlag"];
            };
        };
        responses: {
            /** @description The new flag (OPEN). */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["RiskFlag"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    getDriverRiskFlag: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                flag_id: components["parameters"]["RiskFlagId"];
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
                    "application/json": components["schemas"]["RiskFlag"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    confirmDriverRiskFlag: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                flag_id: components["parameters"]["RiskFlagId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ReviewRiskFlag"];
            };
        };
        responses: {
            /** @description The flag now. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["RiskFlag"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    dismissDriverRiskFlag: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                flag_id: components["parameters"]["RiskFlagId"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ReviewRiskFlag"];
            };
        };
        responses: {
            /** @description The flag now. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["RiskFlag"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listDriversForReview: {
        parameters: {
            query?: {
                /** @description Next page — since of the last driver of the previous page. */
                after?: components["schemas"]["Timestamp"];
                limit?: number;
                status?: "NOT_SUBMITTED" | "IN_REVIEW" | "CHANGES_REQUIRED" | "APPROVED" | "REJECTED" | "SUSPENDED" | "EXPIRED";
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
                    "application/json": components["schemas"]["ReviewQueue"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    getDriverReviewCase: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                driver_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["ReviewCase"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    getDriverBalanceForStaff: {
        parameters: {
            query?: {
                limit?: number;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                driver_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["DriverStatement"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    topUpDriverBalance: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                driver_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    /** Format: int64 */
                    amount_minor: number;
                    command_id: components["schemas"]["Uuid"];
                    currency: string;
                    /** @enum {string} */
                    kind: "DEPOSIT" | "BONUS";
                    reason: string;
                    reference?: string | null;
                };
            };
        };
        responses: {
            /** @description The balance after the top-up. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["DriverStatement"];
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
    decideDriverReview: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                driver_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ReviewDecisionCommand"];
            };
        };
        responses: {
            /** @description The driver after the decision. */
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    getDriverDocumentFile: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                document_id: components["schemas"]["Uuid"];
                driver_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description The file. */
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    getDriverEarningsForStaff: {
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
            path: {
                driver_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["Earnings"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    setDriverPaymentTerminal: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                driver_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    command_id: components["schemas"]["Uuid"];
                    /** Format: int64 */
                    expected_version: number;
                    has_terminal: boolean;
                    reason: string;
                };
            };
        };
        responses: {
            /** @description The driver after the change. */
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    changeDriverPhoneBySupport: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                driver_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["SupportPhoneChange"];
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
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    sendDriverNewPhoneCodeBySupport: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                driver_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["NewPhone"];
            };
        };
        responses: {
            /** @description Sent. */
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
            429: components["responses"]["TooManyRequests"];
        };
    };
    reinstateDriver: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                driver_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ReviewChange"];
            };
        };
        responses: {
            /** @description The driver after the decision. */
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    suspendDriver: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                driver_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["SuspendDriver"];
            };
        };
        responses: {
            /** @description The driver after the decision. */
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
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    listEmergencyGrants: {
        parameters: {
            query?: {
                active?: boolean;
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
                    "application/json": components["schemas"]["EmergencyGrantList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    getEmergencyGrantActivity: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                grant_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["EmergencyActivity"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    revokeEmergencyAccess: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                grant_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["RevokeEmergencyAccess"];
            };
        };
        responses: {
            /** @description Revoked. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["EmergencyGrant"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listFeatureFlags: {
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
            /** @description Every flag, in the server's order. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["FeatureFlagList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    changeFeatureFlag: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                key: string;
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ChangeFeatureFlag"];
            };
        };
        responses: {
            /** @description The flag as it is now. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["FeatureFlag"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listIntegrations: {
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
                    "application/json": components["schemas"]["IntegrationFieldList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    changeIntegrations: {
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
                "application/json": components["schemas"]["ChangeIntegrations"];
            };
        };
        responses: {
            /** @description All fields after the change. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["IntegrationFieldList"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    checkIntegration: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                group: "push" | "routing" | "otp";
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description The result, also when the check failed. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["IntegrationCheck"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    listLegalDocumentVersions: {
        parameters: {
            query?: {
                audience?: components["schemas"]["LegalAudience"];
                kind?: components["schemas"]["LegalKind"];
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
                    "application/json": components["schemas"]["LegalDocumentVersionList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    createLegalDraft: {
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
                "application/json": components["schemas"]["CreateLegalDraft"];
            };
        };
        responses: {
            /** @description Created. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["LegalDocumentVersion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    updateLegalDraft: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                version_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["UpdateLegalDraft"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["LegalDocumentVersion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    publishLegalDraft: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                version_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["PublishLegalDraft"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["LegalDocumentVersion"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listStaffActivity: {
        parameters: {
            query?: {
                /** @description Next page — occurred_at of the last entry of the previous page. */
                before?: components["schemas"]["Timestamp"];
                from?: components["schemas"]["Timestamp"];
                kind?: "REQUEST" | "SIGN_IN";
                limit?: number;
                /** @description Staff role at the moment of the action. */
                role?: components["schemas"]["Role"];
                staff_id?: components["schemas"]["Uuid"];
                to?: components["schemas"]["Timestamp"];
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
                    "application/json": components["schemas"]["ActivityPage"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    listStaffChanges: {
        parameters: {
            query?: {
                action?: string;
                /** @description Next page — occurred_at of the last entry of the previous page. */
                before?: components["schemas"]["Timestamp"];
                from?: components["schemas"]["Timestamp"];
                limit?: number;
                resource_id?: string;
                resource_type?: string;
                /** @description Staff role at the moment of the action. */
                role?: components["schemas"]["Role"];
                staff_id?: components["schemas"]["Uuid"];
                to?: components["schemas"]["Timestamp"];
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
                    "application/json": components["schemas"]["ChangesPage"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    findByCorrelationId: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                correlation_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["CorrelationTrail"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    getAdminMe: {
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
    changeAdminPassword: {
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
    listOperatorBonusAccounts: {
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
                    "application/json": components["schemas"]["Accounts"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    listOperatorBonusEntries: {
        parameters: {
            query?: {
                limit?: number;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                staff_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["Entries"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    listOperatorBonusPeriods: {
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
                    "application/json": components["schemas"]["Periods"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    getCashDispute: {
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
                    "application/json": components["schemas"]["CashDispute"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    decideCashDispute: {
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
                "application/json": components["schemas"]["DecideCashDispute"];
            };
        };
        responses: {
            /** @description Decided. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["CashDispute"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listChargebacks: {
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
                    "application/json": {
                        chargebacks: components["schemas"]["Chargeback"][];
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    recordChargeback: {
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
                "application/json": components["schemas"]["ChargebackRecordRequest"];
            };
        };
        responses: {
            /** @description Recorded. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Chargeback"];
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
    resolveChargeback: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                chargeback_id: components["schemas"]["Uuid"];
                order_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ChargebackResolveRequest"];
            };
        };
        responses: {
            /** @description Resolved. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Chargeback"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getOrderEvidence: {
        parameters: {
            query: {
                /** @description Why the evidence is exported, e.g. the bank's request; kept in the audit log. */
                reason: string;
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
                    "application/json": components["schemas"]["OrderEvidence"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    listPaymentOperations: {
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
                    "application/json": {
                        operations: components["schemas"]["PaymentOperation"][];
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    getAdminOrderRatings: {
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
    listOtpDeliveries: {
        parameters: {
            query: {
                limit?: number;
                phone: string;
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
                    "application/json": {
                        deliveries: components["schemas"]["OtpDelivery"][];
                    };
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    listPaymentMerchants: {
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
                    "application/json": components["schemas"]["PaymentMerchantList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    createPaymentMerchant: {
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
                "application/json": components["schemas"]["CreatePaymentMerchant"];
            };
        };
        responses: {
            /** @description Added. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PaymentMerchant"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    changePaymentMerchant: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                merchant_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ChangePaymentMerchant"];
            };
        };
        responses: {
            /** @description Changed. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PaymentMerchant"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    checkPaymentMerchant: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                merchant_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description The result, also when the check failed. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["IntegrationCheck"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    retryPaymentOperation: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                operation_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    command_id: components["schemas"]["Uuid"];
                    reason: string;
                };
            };
        };
        responses: {
            /** @description The new charge, sent shortly by the payment worker. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PaymentOperation"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listPaymentReconciliations: {
        parameters: {
            query?: {
                cursor?: string;
                limit?: number;
                merchant_id?: string;
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
            /** @description Newest first, limited to merchants the staff member may access. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        next_cursor?: string | null;
                        runs: components["schemas"]["PaymentReconciliationRun"][];
                    };
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    getPaymentReconciliation: {
        parameters: {
            query?: {
                after?: string;
                limit?: number;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                run_id: string;
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Items ordered by id, with a continuation id when another page exists. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        items: components["schemas"]["PaymentReconciliationItem"][];
                        /** Format: uuid */
                        next?: string | null;
                        run: components["schemas"]["PaymentReconciliationRun"];
                    };
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    resolvePaymentReconciliationItem: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                item_id: string;
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    command_id: components["schemas"]["Uuid"];
                    /** @enum {string} */
                    decision: "EXPLAINED" | "CORRECTED_BY_HAND" | "ESCALATED";
                    expected_version: number;
                    reason: string;
                };
            };
        };
        responses: {
            /** @description The immutable resolution, including on a same-command replay. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["PaymentReconciliationItem"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listPermissions: {
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
                    "application/json": components["schemas"]["PermissionCatalog"];
                };
            };
            401: components["responses"]["Unauthorized"];
        };
    };
    listPromotions: {
        parameters: {
            query?: {
                include_archived?: boolean;
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
            /** @description Oldest first. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        promotions: components["schemas"]["Promotion"][];
                    };
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    createPromotion: {
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
                    command_id: components["schemas"]["Uuid"];
                    promotion: components["schemas"]["PromotionDraft"];
                    reason: string;
                };
            };
        };
        responses: {
            /** @description Created. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Promotion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    archivePromotion: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                promotion_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    command_id: components["schemas"]["Uuid"];
                    /** Format: int64 */
                    expected_version: number;
                    reason: string;
                };
            };
        };
        responses: {
            /** @description Archived. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Promotion"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    changePromotion: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                promotion_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    command_id: components["schemas"]["Uuid"];
                    /** Format: int64 */
                    expected_version: number;
                    promotion: components["schemas"]["PromotionDraft"];
                    reason: string;
                };
            };
        };
        responses: {
            /** @description Changed. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Promotion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listReportExports: {
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
                    "application/json": components["schemas"]["ReportExportList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    requestReportExport: {
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
                "application/json": components["schemas"]["RequestReportExport"];
            };
        };
        responses: {
            /** @description Queued */
            202: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["ReportExport"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    getReportExport: {
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
                    "application/json": components["schemas"]["ReportExport"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    downloadReportExport: {
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
            /** @description The file */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "text/csv": string;
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getMoneyReport: {
        parameters: {
            query: {
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
                    "application/json": components["schemas"]["MoneyReport"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    getOrderReport: {
        parameters: {
            query: {
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
                    "application/json": components["schemas"]["OrderReport"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    getRetention: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Current retention policy. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["RetentionVersion"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    changeRetention: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ChangeRetention"];
            };
        };
        responses: {
            /** @description New retention version, or the stored outcome of the same command. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["RetentionVersion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    findRiderWallet: {
        parameters: {
            query: {
                phone: string;
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
            /** @description Found. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        client_id: components["schemas"]["Uuid"];
                    };
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    getRiderWalletForStaff: {
        parameters: {
            query?: {
                limit?: number;
            };
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                client_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["Wallet"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    topUpRiderWallet: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                client_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["StaffTopUp"];
            };
        };
        responses: {
            /** @description The account after the top-up. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Wallet"];
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
    getServiceSettings: {
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
                    "application/json": components["schemas"]["SettingsVersion"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    changeServiceSettings: {
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
                "application/json": components["schemas"]["ChangeSettings"];
            };
        };
        responses: {
            /** @description The new version. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["SettingsVersion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    listCancelReasons: {
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
            /** @description By side, then display order. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Catalog"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    createCancelReason: {
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
                "application/json": components["schemas"]["CreateReason"];
            };
        };
        responses: {
            /** @description Created. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Reason"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    updateCancelReason: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                reason_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["UpdateReason"];
            };
        };
        responses: {
            /** @description Changed. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["Reason"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    listDriverTransferRules: {
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
                    "application/json": components["schemas"]["TransferRuleList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    setDriverTransferRule: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                currency: string;
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    command_id: components["schemas"]["Uuid"];
                    enabled: boolean;
                    /** Format: int64 */
                    expected_version: number;
                    /** Format: int64 */
                    max_per_day_minor: number;
                    /** Format: int64 */
                    max_per_transfer_minor: number;
                    /** Format: int64 */
                    min_balance_after_minor: number;
                    reason: string;
                };
            };
        };
        responses: {
            /** @description The rule in force. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["TransferRule"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    listServiceSettingsHistory: {
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
            /** @description Newest first. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["SettingsHistory"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    getOperatorBonusSettings: {
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
                    "application/json": components["schemas"]["OperatorBonusSettingsVersion"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    changeOperatorBonusSettings: {
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
                "application/json": components["schemas"]["schemas-ChangeSettings"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["OperatorBonusSettingsVersion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    getSafetyContacts: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["SafetyContactsVersion"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    changeSafetyContacts: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                city_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ChangeSafetyContacts"];
            };
        };
        responses: {
            /** @description The new version. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["SafetyContactsVersion"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
        };
    };
    listStaff: {
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
                    "application/json": components["schemas"]["StaffList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    createStaff: {
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
                "application/json": components["schemas"]["CreateStaff"];
            };
        };
        responses: {
            /** @description OK */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["StaffMember"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            409: components["responses"]["Conflict"];
            422: components["responses"]["UnprocessableEntity"];
        };
    };
    listStaffExtensions: {
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
                    "application/json": components["schemas"]["StaffExtensionList"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
        };
    };
    changeStaffExtension: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                staff_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ChangeStaffExtension"];
            };
        };
        responses: {
            /** @description The extension as it is now; for a removal the last version with the removed extension. */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["StaffExtension"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    getStaff: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                staff_id: components["schemas"]["Uuid"];
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
                    "application/json": components["schemas"]["StaffMember"];
                };
            };
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
        };
    };
    grantEmergencyAccess: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                staff_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["GrantEmergencyAccess"];
            };
        };
        responses: {
            /** @description Granted. */
            201: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["EmergencyGrant"];
                };
            };
            400: components["responses"]["BadRequest"];
            401: components["responses"]["Unauthorized"];
            403: components["responses"]["Forbidden"];
            404: components["responses"]["NotFound"];
            409: components["responses"]["Conflict"];
        };
    };
    resetStaffPassword: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                staff_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ResetPassword"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["StaffMember"];
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
    restoreStaff: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                staff_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ChangeStaff"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["StaffMember"];
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
    suspendStaff: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                staff_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["ChangeStaff"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["StaffMember"];
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
    updateStaff: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                staff_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["UpdateStaff"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["StaffMember"];
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
    listAdminSupportQueue: {
        parameters: {
            query?: {
                assigned_staff_id?: components["schemas"]["Uuid"];
                before?: components["schemas"]["Timestamp"];
                category?: components["schemas"]["Category"];
                /** @description The queue of one city; without it, the cases without a city. */
                city_id?: components["schemas"]["Uuid"];
                limit?: number;
                /** @description Only open cases whose respond_by has passed, the most overdue first (REQ-OPS-06). */
                overdue?: boolean;
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
    getAdminSupportCase: {
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
    assignAdminSupportCase: {
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
    downloadAdminSupportAttachment: {
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
    closeAdminSupportCase: {
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
    commentAdminSupportCase: {
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
    priorityAdminSupportCase: {
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
    reopenAdminSupportCase: {
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
    resolveAdminSupportCase: {
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
    openAdminSupportAttachmentUpload: {
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
    uploadAdminSupportAttachment: {
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
    archiveZone: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                zone_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["GeoChange"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GeoRevision"];
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
    publishZone: {
        parameters: {
            query?: never;
            header?: {
                /** @description Propagated end to end through HTTP, events, workers and provider calls (REQ-OBS-01). Generated by the server if absent. */
                "X-Correlation-Id"?: components["parameters"]["CorrelationId"];
            };
            path: {
                zone_id: components["schemas"]["Uuid"];
            };
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": components["schemas"]["GeoChange"];
            };
        };
        responses: {
            /** @description OK */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GeoRevision"];
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
}
