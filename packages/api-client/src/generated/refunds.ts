export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        CreateRefund: {
            /** Format: int64 */
            amount_minor: number;
            command_id: components["schemas"]["Uuid"];
            comment?: string;
            /**
             * @description CARD or BONUSES; the part paid with bonuses goes back as bonuses either way (A5).
             * @enum {string}
             */
            destination: "CARD" | "BONUSES";
            /**
             * @description Omitted, the reason's (or the cancelled order's); another one, or the reason OTHER, needs a comment.
             * @enum {string}
             */
            fault?: "CLIENT_FREE" | "CLIENT" | "DRIVER" | "OPERATOR" | "NONE";
            /** @description A code of the REFUND reasons (GET /api/admin/v1/refund-reasons). */
            reason_code: string;
            /**
             * @description Required for bonuses instead of money (A5).
             * @default false
             */
            rider_agreed: boolean;
        };
        OrderRefunds: {
            refundable: components["schemas"]["Refundable"];
            refunds: components["schemas"]["Refund"][];
        };
        Refund: {
            /** Format: int64 */
            amount_minor: number;
            /**
             * Format: int64
             * @description Goes to the rider's bonus account.
             */
            bonus_minor: number;
            /**
             * Format: int64
             * @description Goes back to the card; card_minor + bonus_minor = amount_minor.
             */
            card_minor: number;
            city_id: components["schemas"]["Uuid"];
            client_id: components["schemas"]["Uuid"];
            comment: string | null;
            currency: string;
            /** Format: date-time */
            decided_at: string | null;
            decided_by: components["schemas"]["Uuid"] | null;
            decision_reason: string | null;
            driver_id: components["schemas"]["Uuid"] | null;
            /** Format: date-time */
            ended_at: string | null;
            /**
             * @description Who bears the refund (A6, ADR 0019).
             * @enum {string}
             */
            fault: "CLIENT_FREE" | "CLIENT" | "DRIVER" | "OPERATOR" | "NONE";
            id: components["schemas"]["Uuid"];
            order_id: components["schemas"]["Uuid"];
            /**
             * Format: int64
             * @description The part of the refund that was paid with bonuses (A5), always back as bonuses.
             */
            paid_bonus_minor: number;
            reason_code: string;
            reason_labels: {
                [key: string]: string;
            };
            /** Format: date-time */
            requested_at: string;
            requested_by: components["schemas"]["Uuid"];
            /** @description The staff member marked that the rider agreed to bonuses instead of money (A5). */
            rider_agreed: boolean;
            /**
             * @description REQUESTED waits for a confirmer; APPROVED waits for the execution; PROCESSING, SUCCEEDED, FAILED, UNKNOWN as the money moves; REJECTED by a confirmer; NOT_REVIEWED closed without a decision (A3).
             * @enum {string}
             */
            state: "REQUESTED" | "APPROVED" | "PROCESSING" | "SUCCEEDED" | "FAILED" | "UNKNOWN" | "REJECTED" | "NOT_REVIEWED";
            /** Format: int64 */
            version: number;
        };
        /** @description What the order allows now, for the staff member asking. */
        Refundable: {
            /**
             * Format: int64
             * @description Paid with bonuses.
             */
            bonus_minor: number;
            currency: string | null;
            /**
             * @description For a cancelled order, the order's fault (ADR 0019); null — the reason's.
             * @enum {string|null}
             */
            default_fault: "CLIENT_FREE" | "CLIENT" | "DRIVER" | "OPERATOR" | "NONE" | null;
            /** Format: int64 */
            left_minor: number;
            /** Format: int64 */
            minimum_minor: number;
            /**
             * Format: int64
             * @description Paid with money — what the card paid, or the cash the driver received.
             */
            money_minor: number;
            order_id: components["schemas"]["Uuid"];
            /**
             * Format: int64
             * @description Taken by refunds requested, approved, in progress or done.
             */
            refunded_minor: number;
            rider_refunds: number;
            /** @description The rider already had refunds_rider_warning_count refunds in the window (A2); a warning only. */
            rider_warning: boolean;
            /** @description Money may go back to the card (false for a cash trip, A7). */
            to_card: boolean;
            /**
             * Format: date-time
             * @description The last moment this staff member may refund the order (A8); null without an end time.
             */
            until: string | null;
        };
        RefundDecision: {
            command_id: components["schemas"]["Uuid"];
            /** Format: int64 */
            expected_version: number;
            /** @description Required to reject. */
            reason?: string;
        };
        RefundLimit: {
            currency: string;
            /** Format: int64 */
            daily_minor: number;
            /** Format: int64 */
            per_refund_minor: number;
            staff_id: components["schemas"]["Uuid"];
            /**
             * Format: int64
             * @description Taken by this staff member's refunds in the last 24 hours (rolling).
             */
            used_minor: number;
            /** Format: int64 */
            version: number;
        };
        RefundLimitList: {
            limits: components["schemas"]["RefundLimit"][];
        };
        RefundList: {
            refunds: components["schemas"]["Refund"][];
        };
        RefundReasonList: {
            reasons: {
                code: string;
                /** @enum {string|null} */
                fault: "CLIENT" | "DRIVER" | "OPERATOR" | "NONE" | null;
                labels: {
                    [key: string]: string;
                };
            }[];
        };
        RequestedRefund: {
            refund: components["schemas"]["Refund"];
            rider_refunds: number;
            rider_warning: boolean;
        };
        SetRefundLimit: {
            command_id: components["schemas"]["Uuid"];
            currency: string;
            /**
             * Format: int64
             * @description Not less than per_refund_minor.
             */
            daily_minor: number;
            /**
             * Format: int64
             * @description 0 for a currency without a limit yet.
             */
            expected_version: number;
            /** Format: int64 */
            per_refund_minor: number;
            reason: string;
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
