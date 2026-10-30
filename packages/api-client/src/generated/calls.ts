export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        AnswerCall: {
            command_id: components["schemas"]["Uuid"];
        };
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
        /** @description The card-pop, pushed on /ws/v1/operator to the operators of the called number's city as the call rings: `{"type": "CallRinging", "payload": CallRinging}`. Only what the operator needs to start: the caller's number and, when it belongs to a rider, the rider's id, name and open orders — nothing else. */
        CallRinging: {
            call_id: components["schemas"]["Uuid"];
            caller_phone: string | null;
            city_id: components["schemas"]["Uuid"] | null;
            client_id: components["schemas"]["Uuid"] | null;
            client_name: string | null;
            open_order_ids: components["schemas"]["Uuid"][];
        };
        /**
         * @description DIALING — an outgoing call the server is asking Asterisk for; RINGING — the call came in (for an outgoing call: the operator's phone rings); ANSWERED — it was taken (outgoing: the other side picked up); ENDED — it ended after being taken; MISSED — it ended without being taken; FAILED — Asterisk could not be reached for an outgoing call.
         * @enum {string}
         */
        CallState: "DIALING" | "RINGING" | "ANSWERED" | "ENDED" | "MISSED" | "FAILED";
        /** @description Sets the city of a service number, or removes the number with city_id null. A command: expected_version is 0 for a new number; audited with the reason. */
        ChangeCallLine: {
            city_id: components["schemas"]["Uuid"] | null;
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            label?: string | null;
            reason: string;
        };
        ChangeMyCallStatus: {
            command_id: components["schemas"]["Uuid"];
            status: components["schemas"]["OperatorCallStatus"];
        };
        /** @description Sets a staff member's extension, or removes it with extension null. A command: expected_version is 0 when they have none; audited with the reason. An extension another staff member has → 409. */
        ChangeStaffExtension: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            extension: components["schemas"]["Extension"] | null;
            reason: string;
        };
        /** @example 101 */
        Extension: string;
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
        /**
         * @description Set by the operator. Only shown and used for the card-pop (it goes to the AVAILABLE operators of the city when there is one, else to all); calls are not routed by it. OFFLINE when never set.
         * @enum {string}
         */
        OperatorCallStatus: "AVAILABLE" | "BREAK" | "OFFLINE";
        /** @description Rings the operator's own phone (their extension) and then the other side. The number is never part of the request or the response. A repeat of the command returns the first call and does not ring again. */
        PlaceCall: {
            command_id: components["schemas"]["Uuid"];
            to: components["schemas"]["CallParty"];
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
        /** Format: uuid */
        Uuid: string;
    };
    responses: never;
    parameters: never;
    requestBodies: never;
    headers: never;
    pathItems: never;
}
export type $defs = Record<string, never>;
export type operations = Record<string, never>;
