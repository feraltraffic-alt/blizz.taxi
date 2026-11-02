export type paths = Record<string, never>;
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        AcceptLegalText: {
            command_id: components["schemas"]["Uuid"];
            /** @description The language the text was shown in; one the version has. */
            language: components["schemas"]["LegalLanguage"];
            version_id: components["schemas"]["Uuid"];
        };
        CreateLegalDraft: {
            acceptance_required: boolean;
            audience: components["schemas"]["LegalAudience"];
            command_id: components["schemas"]["Uuid"];
            effective_from: components["schemas"]["Timestamp"];
            kind: components["schemas"]["LegalKind"];
            texts: components["schemas"]["LegalTexts"];
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
        /** @description Language → text, at least one, each 1 to 200 000 characters. */
        LegalTexts: {
            [key: string]: string;
        };
        PublishLegalDraft: {
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
        UpdateLegalDraft: {
            acceptance_required: boolean;
            command_id: components["schemas"]["Uuid"];
            effective_from: components["schemas"]["Timestamp"];
            /** Format: int64 */
            expected_version: number;
            texts: components["schemas"]["LegalTexts"];
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
