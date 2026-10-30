export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        Accounts: {
            accounts: components["schemas"]["OperatorBonusAccount"][];
        };
        ChangeSettings: components["schemas"]["Command"] & {
            reason: string;
            settings: components["schemas"]["OperatorBonusSettings"];
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
        Entries: {
            entries: components["schemas"]["OperatorBonusEntry"][];
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
        Periods: {
            periods: components["schemas"]["OperatorBonusPeriod"][];
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
